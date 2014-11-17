!!Lists!!
{3 spaces}* for bullet lists
{3 spaces}# for numbered lists, e.g.

'''Example'''

Bulleted
	*item one
	*item two

The three spaces will be converted into tab characters when the page is saved.
Sub-lists can be created by using multiple sets of three spaces, e.g. 6 spaces for level two of the list etc.

'''Example'''

Bulleted
	*Item one
	*Item two
		*Item two.one
	*Item three

!!Placing emphasis on text!!
You can color your text in the wiki quite easily with the syntax used below:

####
'''If you want this'''##'''Type this in your topic'''##
%red%red content%%##__%red%red content%%__##
%yellow%yellow content%%##__%yellow%yellow content%%__##
####

Just as __%#34bb73%more color%%__ becomes %#34bb73%more color%%.

!!Various!!
Formatting __between double underscores__ is ignored, unless the double underscore is preceded by a backslash: \

!Tables!
You can create tables by putting four hashes (#) on a line by themselves, then one table row of text per line with two hashes after each cell including the last cell in the row. End the table with four hashes by themselves. For example:
{{{__
####
This is row one, cell one##This is row one, cell two##
This is row two, cell one##This is row two, cell two##
####
__}}}

!Pre-formatted text!
Pre-formatted text can be displayed by placing four at signs (@) by themselves. Then place your pre-formatted text. Finally leave a blank line by itself to end the block. For example:
{{{__
@@@@
here is some preformatted code

__}}}

!!Inline code!!
Displaying inline code can be achieved by surrounding text in three braces ({) and (}). For example: __{{{code}}}__

!!Redirection!!
To set an automatic redirection from one topic to another, place "__redirect:<topicname>__" in your topic. For example:
{{{__ redirect:OtherTopicName __}}}

If you wish to change or remove the redirection later on, place "__edit:<topicname>__". For example:
{{{__ edit:TopicName __}}}

This will link directly to the edit page for the given topic so that you can alter or remove the redirection.
