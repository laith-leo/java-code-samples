public static void horribleIteration(String [] words){
    int i = 0;
    try {
        while(true){
            System.out.println(words[i]);
            i++;
        }
    } catch (IndexOutOfBoundsException e){
        //iteration complete
    }
}

