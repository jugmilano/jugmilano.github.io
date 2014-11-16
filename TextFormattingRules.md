!Enfasi:!
Due apostrofi singoli __''intorno al testo''__ per ''corsivo''
Tre apostrofi singoli __'''intorno al testo'''__ per '''grassetto'''
Cinque apostrofi singoli __'''''intorno al testo'''''__ per '''''grassetto corsivo''''', i.e. 3 + 2

!Elenchi:!
{3 spazi}* per elenchi puntati, {3 spazi}# per elenchi numerati, ad es.
Elenco Puntato
	*elemento uno
	*elemento due

I tre spazi verrano convertiti in caratteri tab quando viene registrata la pagina se è selezionata l'opzione spazi-in-tab.
Si possono creare sotto-elenchi usando multipli di tre spazi, i.e. 6 spazi per il livello due dell'elenco ecc.

Riferimenti: noti ance come WikiName''''''. JoinCapitalizedWords per riferirsi ad un argomento o creare un riferimento ad un nuovo argomento. Nota che l'espressione regolare per JoinCapitalizedWords è molto stringente, due maiuscole in fila rompono il riferimento.

C'è una sequenza di escape per permettere ad argomenti che non siano composti da parole unite che inizino con una maiuscola, la sequenza è apostrofo inverso-testo-apostrofo inverso, i.e. __`ACM`__. Questa è una caratteristica richiesta dagli utenti ed un estensione alle normail regole. È ideale quando desideri riferirti ad un acronimo.
Riferimenti Esterni:
	*Un riferimento ad un argomento al Wiki c2.com può essere creato nella forma __c2:NomeArgomento__
	*Un riferimento al Meatball Wiki può essere creato con __mb:NomeArgomento__ i.e. mb: StartingPoints
	*Un riferimento alla Microsoft Knowledge Base può essere creato con __mskb:QXXXXXX__ dove QXXXXXX è il numero dell'articolo
	*Un riferimento a WikiPedia può essere creato con __wp:NomeWiki__ in inglese e __wp-it:NomeWiki__ in italiano

URL: le immagini referenziate tramite URL saranno incluse nel documento, le altre URL appariranno come hyperlink, basta che usi la sintassi abituale, i.e. http://www.vqwiki.org/wiki/
La formattazione __fra doppio underscore__ viene ignorata, a meno che il doppio underscore sia preceduto da un backslash: \
Puoi usare tabelle mettendo quattro ''hash'', il carattere cancelletto, (__####__) su una riga da soli, poi una riga di tabella per riga con due hash (__##__) dopo ogni cella (inclusa l'ultima cella della riga. Termina la tabella con quattro hashes da soli.
Il testo pre-formattato può essere visualizzato iniziando con quattro ''at'', il carattere chiocciola, (__@@@@__) da soli. Lascia una riga vuota da sola per terminare il blocco, i.e.:
@@@@
  questo è del codice preformattato


Il codice incluso può essere prodotto circondando il testo fra parentesi graffe: __{{{codice}}}__ = {{{codice}}}

Per impostare una redirezione automatica da un argomento ad un altro, basta che tu metta redirect:AltroNomeArgomento come contenuto dell'argomento. Se desideri modificare o eliminare la redirezione successivamente, metti del testo nella forma edit:NomeArgomento in qualche altro argomento - questo collegamento ti porterà direttamente alla pagina di modifica per il dato argomento  in modo che la redirezione possa essere modificata o eliminata.
----
[<html>]
<table>
	<tr>
		<th colspan="2">Aiuto Quick Editing</th>
	</tr>
	<tr>
		<th valign="top">Enfasi Testo</th>
		<td>
			<table>
				<tr>
					<td>Per fare testo...<hr/></td>
					<td>Metti il testo fra...<hr/></td>
				</tr>
				<tr>
					<td style="font-style: italic;">Corsivo</td>
					<td>apostrofi doppi (non doppie virgolette)</td>
				</tr>
				<tr>
					<td> <hr></td>
					<td>Ad esempio:  ''Testo''<hr/></td>
				</tr>
				<tr>
					<td style="font-weight: bold;">Grassetto</td>
					<td>Apostrofi Tripli</td>
				</tr>
				<tr>
					<td> <hr></td>
					<td>Ad esempio:  '''Testo'''<hr/></td>
				</tr>
				<tr>
					<td style="font-style: italic; font-weight: bold;">Grassetto Corsivo</td>
					<td>Apostrofi tripli + doppi (5 apostrofi per parte)</td>
				</tr>
				<tr>
					<td> <hr></td>
					<td>Ad esempio:  '''''Testo'''''<hr/></td>
				</tr>

				<tr>
					<td style="font-family: courier,fixed-width">Codice</td>
					<td>Tre graffe per lato</td>
				</tr>
				<tr>
					<td> <hr></td>
					<td>Ad esempio:  {{{Testo}}}<hr/></td>
				</tr>
				<tr>
					<td style="text-decoration: underline;">Sottolineato</td>
					<td>Tre segni uguale</td>
				</tr>
				<tr>
					<td> <hr></td>
					<td>Ad esempio:  ===Testo===<hr/></td>
				</tr>
				<tr>
					<td>Centrato</td>
					<td>Due punti doppi</td>
				</tr>
				<tr>
					<td> </td>
					<td>Ad esempio:  ::Testo::</td>
				</tr>

			</table>
		</td>
	</tr>
	<tr>
		<th valign="top">Intestazioni</th>
		<td>
			<table>
				<tr>
					<td>Testo molto importante / Intestazione di livello 1</td>
					<td>  </td>
					<td>Inizia con tre punti esclamativi !!!; termina con !!! ed un'interruzione di riga</td>
				</tr>
				<tr>
					<td>Testo importante / Intestazione di livello 2</td>
					<td>  </td>
					<td>Inizia con due punti esclamativi !!; termina con !! ed un'interruzione di riga</td>
				</tr>
				<tr>
					<td>Testo in evidenza / Intestazione di livello 3</td>
					<td>  </td>
					<td>Inizia con un punto esclamativo !; termina con ! ed un'interruzione di riga</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<th valign="top">Elenchi</th>
		<td>
			<table>
				<tr>
					<td>Elenchi puntati</td>
					<td>  </td>
					<td>3 spazi seguiti da un *</td>
				</tr>
				<tr>
					<td>Elenchi numerati</td>
					<td>  </td>
					<td>3 spazi seguiti da un #</td>
				</tr>
				<tr>
					<td>Interruzione di riga</td>
					<td>  </td>
					<td>@@</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<th valign="top">Righe orizzontali</th>
		<td>
			<table>
				<tr>
					<td>Usa quattro trattini consecutivi, i.e. ----</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<th valign="top">Collegamenti o riferimenti</th>
		<td>
			<table>
				<tr>
					<td>Parola in camel-case</td>
					<td>  </td>
					<td>UnNuovoArgomento</td>
				</tr>
				<tr>
					<td>Parola racchiusa in due parentesi quadre</td>
					<td>  </td>
					<td>[[Argomento]]</td>
				</tr>
				<tr>
					<td>Parola racchiusa in apostrofi inversi</td>
					<td>  </td>
					<td>`Argomento`</td>
				</tr>
			</table>
		</td>
	</tr>
  <tr>
	 <th valign="top">Tabelle</th>
	 <td>
		<table>
		  <tr>
			 <td>Inizia una tabella con quattro cancelletti da soli</td>
		  </tr>
		  <tr>
			 <td>Termina ogni cella (inclusa l'ultima di ogni riga) con due cancelletti</d>
		  </tr>
		  <tr>
			 <td>Termina la tabella con quattro cancelletti da soli</d>
		  </tr>
		  <tr>
			 <td>####<br/>0,0##0,1##<br/>1,0##1,1##<br/>####
		  </tr>
		</table>
	 </td>
  </tr>
  <tr>
	 <th valign="top">Testo preformattato</th>
	 <td>
		<table>
		  <tr>
			 <td>Inizia una sezione di testo preformattato con quattro '@' da soli</td>
		  </tr>
		  <tr>
			 <td>Termina con una riga vuota</td>
		  </tr>
		  <tr>
			 <td>Del testo<br/>@@@@<br/>Testo preformattato<br/><br/>Torno a testo normale</td>
        </tr>
      </table>
    </td>
  </tr>
	<tr>
		<td colspan="2">
			<table width="100%">
				<tr>
					<th valign="top">Suggerimenti</th>
				</tr>
				<tr>
					<td>
						<ul>
							<li>Fai andare a capo il testo nella textarea di modifica.</li>
							<li>Usa il tasto ENTER per creare spazio bianco.</li>
							<li>Usa collegamenti o riferimenti interi nei commenti quando fai riferimenti ad altri argomenti.</li>
						</ul>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
[</html>]
