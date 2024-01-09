package it.jugmilano.website;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.sun.net.httpserver.SimpleFileServer;
import com.sun.net.httpserver.SimpleFileServer.OutputLevel;
import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.Request;

/**
 * like `npx serve target/website` and emulating GitHub for GET filename .extension (ref: https://rsp.github.io/gh-pages-no-extension/ ) 
 */
public class ServeRunner {
    private static final InetSocketAddress LOOPBACK_ADDR =new InetSocketAddress(InetAddress.getLoopbackAddress(), 8080);
    private static final Path WEBSITE = Path.of("target/website").toAbsolutePath();

    public static void main(String[] args) throws Exception {
        HttpHandler fileHandler = SimpleFileServer.createFileHandler(WEBSITE);
        Filter outputFilter = SimpleFileServer.createOutputFilter(System.out, OutputLevel.VERBOSE);
        Filter emulateGitHub = Filter.adaptRequest("Append .extension where necessary", r -> {
            Path p = Paths.get(WEBSITE.toString(), r.getRequestURI().toString());
            if (!p.toFile().exists()) {
                File[] fs = WEBSITE.toFile().listFiles(n -> n.getAbsolutePath().startsWith(p.toAbsolutePath().toString()));
                if (fs.length == 1) {
                    File f0 = fs[0];
                    try {
                        String actualExtension = f0.getAbsolutePath().replace(p.toAbsolutePath().toString(), "");
                        URI newURI = new URI(r.getRequestURI().toString() + actualExtension);
                        return new Request() {
                            @Override
                            public URI getRequestURI() {
                                return newURI;
                            }
                            @Override
                            public String getRequestMethod() {
                                return r.getRequestMethod();
                            }
                            @Override
                            public Headers getRequestHeaders() {
                                return r.getRequestHeaders();
                            }
                        };
                    } catch (Exception e) {
                        // do nothing, fall back.
                    }
                }
            }
            return r;
        });
        var server = HttpServer.create(LOOPBACK_ADDR, 10, "/", fileHandler, outputFilter, emulateGitHub);
        System.out.println("Starting server on "+LOOPBACK_ADDR.toString());
        System.out.println("Open http://"+LOOPBACK_ADDR.getHostString()+":"+LOOPBACK_ADDR.getPort());
        server.start();
    }
}
