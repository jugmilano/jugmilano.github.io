///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS info.picocli:picocli:4.6.3


import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * Utility to convert Jekyll entries to JBake entries (to be used once)
 */
@Command(name = "process_entries", mixinStandardHelpOptions = true, version = "process_entries 0.1",
        description = "process_entries made with jbang")
class process_entries implements Callable<Integer> {

    @Parameters(index = "0", description = "The directory of _posts", defaultValue = "./_posts")
    private File _postsDir;

    public static void main(String... args) {
        int exitCode = new CommandLine(new process_entries()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception { // your business logic goes here...
        File[] mdFiles = _postsDir.listFiles(n -> n.getName().endsWith(".md"));
        Set<String> layouts = new HashSet<>();
        for (File f : mdFiles) {
            processMdFile(f, layouts);
        }
        System.out.println(layouts);
        return 0;
    }

    private void processMdFile(File f, Set<String> layouts) {
        try {
            List<String> allLines = Files.readAllLines(f.toPath());
            int lastIndexOfdash = allLines.lastIndexOf("---");
            for (int i = lastIndexOfdash; i < allLines.size(); i++) {
                if (allLines.get(i).isBlank()) {
                    allLines.remove(i);
                }
            }
            if (!allLines.getLast().equals("---")) {
                throw new RuntimeException(f.toString());
            }
            String layout = allLines.stream().filter(s -> s.startsWith("layout:")).findFirst().orElseGet(()->"layout: ").replace("layout: ", "");
            allLines.removeIf("---"::equals);
            allLines.add(0, "type: "+layout);
            allLines.addLast("~~~~~~");
            Files.write(f.toPath(), allLines, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
