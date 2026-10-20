 Djurhotellet - KattHotell

Inkapsling - MurenKlassen KattHotell har `private List<Katt> katter`. Den kan inte nås direkt från Main.Bevis: `hotell.katter.add(k1)` ger kompileringsfel "katter has private access". Man måste använda metoden `checkaIn()`.

DubbletspärrMetoden `finnsChip()` loopar igenom listan och kollar om chipnumret redan finns. Om ja, skriver `checkaIn()` en VARNING och returnerar false, annars läggs katten till.

Minneshash - Katt@hexkod`System.out.println(k)` anropar default toString() som skriver klassnamn@hashkod. Det är minnesadressen, inte kattens data.

Varför kan vi inte skriva `k.namn` i KattHotell? För att `namn` är private i Katt.java. Vi måste använda getters: `k.getNamn()`, `k.getRas()` - detta är inkapsling.

Tomt hotellMetoden `upprop()` kollar först `if (katter.isEmpty())` och skriver tydligt meddelande istället för att vara tyst.

Testat Etapp 2-5 - allt fungerar med 2 katter efter dubblettspärr.