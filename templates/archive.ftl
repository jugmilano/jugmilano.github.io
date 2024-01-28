<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
		<#include "head.ftl">
		<title>Meeting | ${config.site_title}</title>
	</head>
	
	<body class="blog-archive">
		<!--[if lt IE 7]>
            <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
        <![endif]-->
    	<div id="wrapper" class="clearfix">
    		<#include "header.ftl">

<!-- archive content -->

<div id="main" class="inner">
	<section class="clearfix">
		<h2 class="post-title">I prossimi incontri del JUG</h2>
		<p>
		<ul>
			<#assign next_events = published_content?filter(e -> e.type == "new_meeting" || e.type == "new_generic")?filter(e -> e.meetingdate?long+86400000 gt .now?long)?sort_by("meetingdate")?reverse />
			<#if next_events?size gt 0>
				<#list next_events as next_event>
					<li>
						<a href="${next_event.uri}">
							<h3><b>${next_event.meetingdate?string.@jugmilanomeetingdate}</b></h3>
						</a>
						<p><span style="font-size:22px; font-weight:bold"><a href="${next_event.uri}">${next_event.description}</a></span></p>
					</li>
				</#list>
			<#else>
				<br/><span style="font-size:22px">Stiamo organizzando il prossimo meeting.<br/>Iscriviti alla nostra <a href="/#contact">mailing list</a> per rimanere aggiornato!</span>
				<h3>&nbsp;</h3>
			</#if>
		</ul>
		</p>
		
		<p><br/>
		<h2 class="post-title">Gli scorsi incontri del JUG</h2>
		<ul>
			<!-- if done_events is valorized means some old events are not maintained in the correct layout -->
			<#assign done_events = published_content?filter(e -> e.type == "new_meeting" || e.type == "new_generic")?filter(e -> e.meetingdate?long+86400000 lt .now?long)?sort_by("meetingdate")?reverse />
			<#assign old_posts = published_content?filter(e -> e.type == "old_meeting" || e.type == "old_generic")?sort_by("meetingdate")?reverse />
			<#assign old_events = done_events + old_posts />
			<#list old_events as evt>
				<li>
					<a href="${evt.uri}">
						<h3><b>${evt.meetingdate?string.@jugmilanomeetingdate}</b></h3>
					</a>
					<p><span style="font-size:22px; font-weight:bold"><a href="${evt.uri}">${evt.description}</a></span></p>
				</li>
			</#list>
		</ul>
		</p>
	</section>
</div>

<!-- /archive content -->

 		</div> <!-- #wrapper -->
 		<#include "footer.ftl">
 		<#include "script.ftl">
 	</body>
 </html>
