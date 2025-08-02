<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
		<#include "head.ftl">
		<title>${content.title} | ${content.description}</title>
	</head>
	<body class="post">
		<!--[if lt IE 7]>
            <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
        <![endif]-->
    	<div id="wrapper" class="clearfix">
    		<#include "header.ftl">
    		<div id="main" class="inner">
                <hgroup>
                    <h2 class="post-title fadeInUp animated">${content.title}</h2>
                    <p class="date"><span>${content.meetingdate?string.@jugmilanomeetingdate}</span></p>
                </hgroup>

                <div style="text-align:center"><h2>${content.description}</h2></div>
<br/>
L'incontro si terrà ${content.meetingdate?string.@jugmilanomeetingdate}
<#if content.location??>
 presso ${content.location}
</#if>
<#if content.map??>
<a target="_blank" href="${content.map}">(mappa)</a>
</#if>
<#if content.address??>
 in ${content.address}
</#if>
<#if content.thanks??>
 ${content.thanks}
</#if>
.
<br/>

<#if content.schedule??>
<div style="font-weight:bold">Programma</div>
<p>${content.schedule}</p>
</#if>

<!-- here was formspree -->

<p>
<div>Il talk sarà in ${content.language}.</div>
</p>

<p>
<div id="abstract">
<span style="font-weight:bold">Abstract dell'intervento: </span>
<br/>
${content.abstract!""}
</div>
</p>

<p>
<div id="bio">
A cura di <span style="font-weight:bold">${content.speaker!""}:</span>
<br/>
${content.bio!""}
</div>
</p>

<div style="display: none;">

<!-- email pro-forma -->
<div>
<pre>
[ANNOUNCE] ${content.title} - ${content.description}

Ciao a tutti,

Siamo lieti di annunciare che un nuovo incontro del JUG Milano si terrà in modalità ibrida, ${content.meetingdate?string.@jugmilanomeetingdate}.

${asPlainText(content.miscdetails)}

Questo il programma:
h 18:45 - JUG news e attività in corso
h 19:00 - "${content.description}", a cura di ${content.speaker!""}
h ~20:30 - Chiusura lavori, varie ed eventuali

Iscriviti al canale YouTube di JUG Milano https://www.youtube.com/@JUGMilano/streams e JUG Torino https://www.youtube.com/@JUGTorino/streams e clicca la campanella su YouTube: riceverai notifica direttamente da YouTube quando saremo live!

Potete trovare maggiori dettagli, direttamente sul nostro sito:
http://www.jugmilano.it/${content.uri}

Vi aspettiamo!
 - JUG Milano staff
<pre>
</div>
<hr />
<!-- social pro-forma -->
<div>
<pre>
🗓️ ${content.meetingdate?string.@jugmilanomeetingdate}
👉 "${content.description}" in presenza e YouTube live!
🙏 presenta ${content.speaker!""}

Hybrid mode:
🚨 per partecipare in presenza è richiesto questo form:
${asPlainText(content.miscdetails)}

⚠️
Dettagli: http://www.jugmilano.it/${content.uri}
<pre>
</div>

</div>

      </div> <!-- #wrapper -->
		<#include "footer.ftl">
		<#include "script.ftl">
 	</body>
 </html>
