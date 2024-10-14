# FreelApp
Essential Work App for Freelance

Il progetto FreelAPP coinvolge alcuni ex studenti Boolean che si sono uniti con lo scopo di partecipare insieme allo sviluppo di una applicazione web per freelance.

FreelApp è un gestionale per freelance che ha lo scopo di aiutare i freelance a tenere traccia del proprio lavoro e di gestire tempistiche e guadagni attraverso un sistema integrato.

# Scopo del progetto

Sviluppare una piattaforma per freelance con le seguenti caratteristiche:

1.Aiutare a tenere traccia del lavoro orario attraverso un contatore
2.Tenere un database dei clienti e dei progetti a loro associati
3.Generare delle metriche e dei grafici di ausilio che tengano conto della performance, del guadagno, e del tempo impiegato per lavorare
4.Ottimizzare le entrate dei liberi professionisti ed aiutarli ad organizzare meglio il proprio lavoro.

# In breve:
L'utente deve poter:
- creare il proprio profilo e fare login
- inserire un database di clienti
- inserire un suo profilo fiscale
- impostare una tariffa oraria
- creare un progetto associato a ciascun cliente con data di creazione e data di fine
- inserire delle task per ogni progetto da poter conteggiare
- inserire delle task per ogni progetto già conteggiate
- avere delle statistiche sul guadagno in base alle ore lavorate (task concluse) in relazione alla tariffa oraria



#In dettaglio le singole entità e le loro funzionalità:

Il Progetto:
1.Nome provvisorio(o definitivo)
2.Cliente associato
3.data apertura
4. data chiusura.

Funzionalità previste del singolo progetto:
->Aggiunta.
->Modificare (progetto).
->visualizzare i Task.
->Modificare i dettagli del progetto data ecc.
->cancellazione.



la tua Anagrafica:
1.Nome 
2.cognome
3.eventuale p.iva
3.tua Ral
4. Aspettative che vuoi raggiungere
	5.tariffa oraria per raggiungere la tua RAl dei sogni
	6. tempo di lavoro.

Le funzionalità previste per la tua anagrafica:
Aggiunta dei dati, modifica e cancellazione delle informazioni
Modifica delle aspettative, crescita e modifica della Ral.
Cancellazione.



Anagrafica cliente:
1. Nome Azienda
2.P.iva
3. Contatti

Funzionalità previste per l'anagrafica cliente:
L'anagrafica verrà creata con la possibilità di inserire i dati anagrafici di ogni singolo cliente.
Potremo avere in memoria i dati del cliente, e ricercarli per p.iva in caso siano già presenti.
Modifica e cancellazione.



Il Contatore(per il calcolo della tariffa oraria):
1.Calcola le ore di lavoro svolto.
2.Calcola per le ore svolte e la tariffa oraria inseririta, il prezzo totale.



Task:
Ogni progetto conterrà al suo interno uno, nessuno o piu' task, che conterranno le informazioni relative ad ogni singolo lavoro da svolgere,
avranno al loro interno una data di inizio e prevista chiusura.per la gestione del tempo.

N.B Il Task sarà legato al progetto ogni progetto conterrà i suoi

Funzionalità previste dei Task:
->Crea Task con: data Creazione; corpo del task; 
-> Prevista chiusura;
->Modifica Task; 
->cancella Task; 
->Chiudi.

I task prevedereanno uno stato:
	1.Creato; 
	2.in lavorazione; 
	3.concluso;
	4. filtraggio I task potranno essere visti tutti nella sezione dei Task aperti(filtraggio)-Task chiusi-task cancellati -ecc.

	ogni singolo stato avrà info su:
		1.Data di creazione: 
		2.Tempo stimato da dedicare al progetto; 
		2.Data di chiusura.

Sarà possibile avere la possibilità di aggiungere un task già conteggiato al lavoro, senza bisogno di avviare il contatore.(anche in stato chiuso)