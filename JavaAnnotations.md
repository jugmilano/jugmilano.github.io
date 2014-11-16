Alcune considerazioni sulle annotazioni a seguito del Meeting di Ottobre 2004

Prima di tutto il link alla presentazione:
attach:Java5Annotations141004MI.zip

Giusto per completezza qui ci sono i sorgenti scritti durante la presentazione (ma sono esempi moolto semplici)
attach:sample.zip
Per compilare {{{compile *.java}}}, per eseguire Foo {{{run Foo}}}

Poi un po di riferimenti:
Pagina ufficiale della JSR 175: http://www.jcp.org/en/jsr/detail?id=175

Consiglio pero' di scaricare la 'Proposed final draft 2' che è un po' piu' compatta (una trentina di pagine). L'unica attenzione da porre è che ci sono un po' di imprecisioni alle pagine 9-10-11 sulle meta-annotation. 
C'e' scritto ad esempio: @Target(FIELD)
ma dovrebbe essere @Target(ElementType.FIELD)
Gli altri errori sono dello stesso tipo

C'e' poi un articolo su Onjava
http://www.onjava.com/pub/a/onjava/2004/04/21/declarative.html

Per gli amanti del gossip non manca un thread su TheServerSide
http://www.theserverside.com/news/thread.tss?thread_id=12742

e naturalmente i miei due post:
http://www.jroller.com/page/fdiotalevi/20040930
http://www.jroller.com/page/fdiotalevi/20041007


Per quanto riguarda le applicazioni

TestNG si trova a questo url: http://www.beust.com/testng/

L'autore è Cedric Beust (http://www.beust.com) che ha anche postato qualche opinione su JSR 175 mentre scriveva TestNG
http://www.beust.com/weblog/archives/000117.html
http://www.beust.com/weblog/archives/000038.html


EJB3 è in fase di discussione al JCP. Il link (JSR 220) è:
http://www.jcp.org/en/jsr/detail?id=220



----
'''DOMANDE&RISPOSTE'''

Riguardo alla domanda (di Giordano mi pare) su come sia definita l'annotation Target, anche con la J2SE5 è fornito un interessante file chiamato src.zip che risolve le nostre curiosità. Naturalmente la risposta era la più semplice:

[<html>]
<pre>
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
public @interface Target
{
	ElementType[] value();
}
</pre>
[</html>]
----
Come posso ottenere una lista di annotation relativa alla classe, ed estrarne una senza sapere a quale .class appartiene?

[<html>]
<pre>
public void extractAnnotation(Class cls)
{
  Annotation[] annotations = cls.getAnnotations();
}
</pre>
[</html>]

