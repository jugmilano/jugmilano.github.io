---
layout: archive
---
<div id="main" class="inner">
	<section class="clearfix">
		<h2 class="post-title">I prossimi incontri del JUG</h2>
		<p>
		<ul>
			{% capture found %}{{"false"}}{% endcapture %}
			{% for post in site.posts %}
			
				{% capture nowunix %}{{'now' | date: '%s'}}{% endcapture %}
				{% capture posttime %}{{post.date | date: '%s'}}{% endcapture %}
				{% if posttime >= nowunix %}
					{% capture found %}{{"true"}}{% endcapture %}
					<li>
						<span class="meta">{{ post.date | date_to_string }}</span>
						<a href="{{ post.url }}">
							<h3>{{ post.title }}</h3>
						</a>
						{% if post.description %}
							<p><span style="font-size:22px; font-weight:bold"><a href="{{ post.url }}">{{ post.description }}</a></span></p>
						{% endif %}
					</li>
				{% endif %}
			{% endfor %}
			{% if found == "false"%}
				<p><br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="font-size:22px; font-weight:bold">Stiamo organizzando il prossimo meeting..</span></p>
				<h3>&nbsp;</h3>
			{% endif %}
		</ul>
		</p>
		
		<p><br/>
		<h2 class="post-title">Gli scorsi incontri del JUG</h2>
		<ul>
			{% for post in site.posts %}
				{% capture nowunix %}{{'now' | date: '%s'}}{% endcapture %}
				{% capture posttime %}{{post.date | date: '%s'}}{% endcapture %}
				{% if posttime < nowunix %}
					<li>
						<span class="meta">{{ post.date | date_to_string }}</span>
						<a href="{{ post.url }}">
							<h3>{{ post.title }}</h3>
						</a>
						{% if post.description %}
							<p><span style="font-size:22px; font-weight:bold"><a href="{{ post.url }}">{{ post.description }}</a></span></p>
						{% endif %}
					</li>
				{% endif %}
			{% endfor %}
		</ul>
		</p>
	</section>
</div>
