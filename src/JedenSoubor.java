public class JedenSoubor implements Comparable <JedenSoubor> {
    String jmeno;

    public JedenSoubor(String jmeno) {
        this.jmeno = jmeno;

    }
    @Override
    public String toString() {
        return jmeno;
    }

    @Override
    //tato metoda seradi polozky typu jedensoubor
    public int compareTo(JedenSoubor o) {
        //zjisti jetli ma vic nebo min nez 3 pismena v nazvu
        char mojeTretiPismeno;
        //pokud je < 3 dosadi za 3 pismeno mezeru
        if (jmeno.length() < 3) {
            mojeTretiPismeno = ' ';
        }
        //pokud  ma vic jak 3 pismena priradi sem 3 pismeno
        else {
            mojeTretiPismeno = jmeno.charAt(2);
        }
        //kdyz plati to prvni ( < 3)vrat privni kdyz ne vrat to co je za dvojteckou
        char jehoTretiPismeno = o.jmeno.length() < 3 ? ' ' : o.jmeno.charAt(2);

        //pokud se rovnaji 3 pismenka nic nemen
        if (mojeTretiPismeno == jehoTretiPismeno) {
            return 0;
        }
        //pokud je 3 pismenko vetsi nez to druhe vimeni je to
        // do spravneho poradi
        else if (mojeTretiPismeno > jehoTretiPismeno) {
            return 1;
        }
        //opak predesle podminky pak seradi do spravneho poradi
        else {
            return -1;
        }
    }
}
