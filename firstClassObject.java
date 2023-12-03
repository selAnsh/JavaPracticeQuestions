public class firstClassObject {

    
    //This function can be called in other class
    static void fnprint(String a){
        System.out.println(a);
    }
    //This function cannot be called in other class
    private static void privateFn(String a){
        System.out.println(a);
    }



    
}
