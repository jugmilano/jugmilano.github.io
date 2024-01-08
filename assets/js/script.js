$(document).ready(function() {

// Grid
/*
var gridWidth = $(document).width();
var gridHeight = $(document).height();
$('body').append('<div id="grid"></div>');

$('#grid').css({
  "width": gridWidth, 
  "height": gridHeight, 
  "background": 'url(/images/grid-24.png) repeat 0 0', 
  "position": "absolute", 
  "top": "0",
  "left": "0"
});
*/


// FitVids
$('#wrapper').fitVids();
$('.fluid-width-video-wrapper').css('margin-bottom', 30);

$(window).bind('orientationchange', function(e){
  if($('#contact').length != 0) {
    $('#contact input').fadeOut(10);
    $('#contact input').fadeIn(10);
  }
});

/* ================================= Smooth Scrolling from http://css-tricks.com/snippets/jquery/smooth-scrolling/#li-comment-94058 ================================= */

$('a[href*=#]').click(function() {
  if (location.pathname.replace(/^\//,/"\//) == this.pathname.replace(/^\//,/"\//) && location.hostname == this.hostname) {
    var $target = $(this.hash);
    $target = $target.length && $target || $('[name=' + this.hash.slice(1) +']');
    
    if ($target.length) {
      var targetOffset = $target.offset().top;
      $('html,body').animate({scrollTop: targetOffset}, {duration:700});
      return false;
    }
  }
});



/* ================================= BACK TO TOP ================================= */

// Set variables locally for increased performance
var scroll_timer;
var displayed = false;
var $message = $('.back-to-top');
var $window = $(window);
var top = $(document.body).children(0).position().top;

/* Hide back to top arrow on init */
$message.css('display' , 'none');

// Function that fades in or out the back to top button
var scrollFade = function() {
  window.clearTimeout(scroll_timer);
  scroll_timer = window.setTimeout(function () { // use a timer for performance
      if($window.scrollTop() <= top) // hide if at the top of the page
      {
          displayed = false;
          $message.fadeOut(100);
      }
      else if(displayed == false) // show if scrolling down
      {
          displayed = true;
          $message.stop(true, true).show().click(function () { $message.fadeOut(500); });
      }
  }, 50);

}

// Run function on load
scrollFade();

// Run function on scroll
$window.scroll(function () {
  scrollFade();
});

/* ================================= WORK PAGES ================================= */
$('.work .more').click(function(e){
  $(this).parents('.work-section').children('.inner-folio').stop().slideToggle();
  $(this).stop().toggleClass('down');
  e.preventDefault();
});


});
