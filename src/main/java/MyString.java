public class MyString {

    //metoda1 - returneaza numarul de caractere dintr-un String dat
    public int returnNumberOfCharacters(String cuvant){
        return cuvant.length();
    }

    //primeste 3 Stringuri pe care le concateneaza si returneaza rezultatul dat
    public String returnConcatenatedStrings(String a, String b, String c){
        return a+b+c;
    }

    //primeste un String si returneaza true daca incepe cu vocala
    public boolean firstLetterIsVowel(String cuvant){
        String cuvantCuLitereMici = cuvant.toLowerCase();
        if ((cuvantCuLitereMici.charAt(0)=='a')||
                (cuvantCuLitereMici.charAt(0)=='e')||
                (cuvantCuLitereMici.charAt(0)=='i')||
                (cuvantCuLitereMici.charAt(0)=='o')||
                (cuvantCuLitereMici.charAt(0)=='u')) {
            return true;}
            else return false;
    }


}
