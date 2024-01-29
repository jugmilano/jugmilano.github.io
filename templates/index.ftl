<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
		<#include "head.ftl">
		<title>${config.site_title}</title>
	</head>
	
	<body class="home">
		<!--[if lt IE 7]>
            <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
        <![endif]-->
    	<div id="wrapper" class="clearfix">
    		<#include "header.ftl">
<!-- index content -->


        <br/>
    		<section id="intro">
    			<div class="intro-container inner">
     				<section class="statement fadeInUp animated">
	     				<p><img src="images/logo/logo.png"/></p>
					</section>
  				 </div> <!-- .intro-container -->
    		</section> <!-- #intro -->
<p>&nbsp;</p>
    		<section id="about" class="inner clearfix">
    			<h2>Chi Siamo</h2>
     			<div class="bio clearfix">
     			    <!-- Se cambi questi paragrafi, aggiorna anche le FAQs -->
       				<p>Il JVM User Group <i>"JUG Milano"</i> è un gruppo di appassionati di programmazione che lavorano o gravitano attorno a Java, alla JVM, a tutti i linguaggi e le tecnologie del suo ecosistema. Ma non solo.</p>
				    <p>Il principale strumento di comunicazione del gruppo è la mailing list (ref. <a href="#contact">sezione contatti</a> per maggiori informazioni), sulla quale è possibile chiedere informazioni o suggerimenti sui linguaggi, sulla JVM o sulle tecnologie, postare link interessanti e - per chi vuole - proporsi come speaker per un incontro.</p>
				</div>
     		</section> <!-- #about -->

   			<section id="meetings" class="inner clearfix">
    			<h2>Meeting</h2>
     			<div class="bio clearfix">
				    <p>Il JUG Milano <b>organizza regolarmente degli incontri</b> dove viene presentato e dibatutto un tema a scelta di interesse per il gruppo.<p>
					<#assign next_events = published_content?filter(e -> e.type == "new_meeting" || e.type == "new_generic")?filter(e -> e.meetingdate?long+86400000 gt .now?long)?sort_by("meetingdate")?reverse />
					<#if next_events?size gt 0>
						<p>
						Prossimi eventi:
						<ul>
						<#list next_events as next_event>
							<li><b>${next_event.meetingdate?string.@jugmilanomeetingdate}: <a href="${next_event.uri}">${next_event.description}</a></b> (<a href="${next_event.uri}">link</a>)</li>
						</#list>
						</ul>
						</p>
					<#else>
						<!-- currently no scheduled meetings -->
					</#if>
				<p>&nbsp;</p>
				<p>È disponibile un archivio degli incontri precedenti e relativo materiale in <a href="meetings">questa pagina</a>.</p>
				</div>
     		</section> <!-- /meetings -->
<p>&nbsp;</p>
			<section id="support">
    			<div class="inner clearfix">
					<h2>Supporto</h2>
                    <br/>
                    <br/>
                    <div>
                        <a href="http://www.devoxx.co.uk/" target="_blank"><img style="margin-bottom: 10px;" src="images/devoxx.png" /></a>
                        <br/>
                        <a href="http://www.devoxx.co.uk/" target="_blank">Devoxx UK</a> offre un biglietto d'ingresso omaggio per la conferenza da estrarre a sorte agli iscritti del JUG.
                    </div>
                    <br/>
                    <br/>
                    <br/>
                    <div>
                        <a href="https://codemo.tech/partners" target="_blank"><img style="margin-bottom: 10px; max-width: 90vw;" src="images/codemotion_logo.png" /></a>
                        <br/>
                        <a href="https://codemo.tech/partners" target="_blank">Codemotion</a> è una community internazionale di developer che mette a disposizione risorse e contenuti per la crescita professionale attraverso la propria piattaforma, organizza eventi e aiuta le aziende a connettersi con i migliori talenti tech.<br />
						Ti segnaliamo anche <a href="https://www.codemotion.com/talent" target="_blank">Codemotion Talent</a>, piattaforma progettata per sviluppatori e talenti tech che desiderano trovare un nuovo lavoro e fare un passo avanti nella loro carriera.
                    </div>
                    <br/>
                    <br/>
                    <br/>
                    <div>
						<a href="https://www.jetbrains.com/" target="_blank"><img width="200" height="65" src="images/logo_jetbrains.png"/></a>
                        <br/>
						A ogni incontro del JUG, <a href="https://www.jetbrains.com/">JetBrains</a> gentilmente offre una licenza gratuita per IntelliJ IDEA (o un altro prodotto a scelta tra CLion, DataGrip, DataSpell, GoLand,
						IntelliJ IDEA Ultimate, PhpStorm, PyCharm,
						ReSharper, ReSharper C++, Rider, RubyMine,
						WebStorm, or dotUltimate) per una persona estratta a sorte fra i partecipanti.<br/>
						Ringraziamo JetBrains per questa opportunità messa a disposizione dei membri del JUG Milano.
					</div>
                    <br/>
                    <br/>
                    <br/>
					<div>
						<a href="http://www.manning.com" target="_blank"><img width="200" height="50" style="margin-bottom: 10px;" src="images/manning.png" /></a>
                        <br/>
						<a href="http://www.manning.com" target="_blank">Manning</a> offre agli iscritti al JUG un codice sconto del 36% per ogni acquisto sul suo sito. Inoltre, a ogni incontro del JUG, Manning offre un eBook del suo catalogo (legato al tema di cui tratta l'incontro) da estrarre a sorte fra i partecipanti; infine, in cambio di una recensione su amazon o sul proprio blog, offre gratuitamente i propri ebook.
					</div>
                </div>
 			</section> <!-- #support -->
<p>&nbsp;</p>
<p>&nbsp;</p>
         <section id="contact">
             <div class="inner clearfix">
             <!-- Se cambi questo paragrafo, aggiorna anche le FAQs -->
                 <h2>Contatti</h2>
                 <p>Il JUG Milano ha una mailing list su <a href="https://groups.google.com/forum/#!forum/jugmilano" target="_blank">Google Groups</a>. Per poter ricevere e pubblicare un messaggio, bisogna iscriversi al gruppo direttamente dalla pagina <a href="https://groups.google.com/forum/#!forum/jugmilano" target="_blank">Google Groups</a>, oppure inviando una mail vuota a <a href="mailto:jugmilano+subscribe@googlegroups.com">jugmilano+subscribe@googlegroups.com</a>.</p>
                 <p>Oltre alla mailing list, abbiamo profili social su GitHub, Twitter, LinkedIn, etc.: in fondo a ogni pagina potete trovare i riferimenti.</p>
                 <!-- Se cambi questo paragrafo, aggiorna anche le FAQs -->
                 <p>Se vuoi postare in lista un'offerta di lavoro, ti chiediamo di formularla in modo che rispetti le <a href="/faq#offerte-di-lavoro">nostre linee guida</a>.</p>
            </div>
        </section> <!-- #contact -->

		<section id="faq">
			<div class="inner clearfix">
				<h2>FAQ</h2>
				<p>Per qualsiasi altre informazione è possibile fare riferimento alle <a href="/faq">FAQ</a>, anche per <a href="/faq#contattare-i-coordinatori">contattare i coordinatori</a> del gruppo.</p>
			</div>
		</section>


<!-- /index content -->
 		</div> <!-- #wrapper -->
 		<#include "footer.ftl">
 		<#include "script.ftl">
 	</body>
 </html>
