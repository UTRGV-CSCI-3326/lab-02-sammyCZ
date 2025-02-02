public class MixMatch {
    public static void main(String[] args) {
        
        String name = "Sam";
        System.out.println(name + ": String is for a sequence of characters");
        
        char star = '*';
        System.out.println(star + ": Char is for a single character");
        
        short short_num = 3; 
        System.out.println(short_num + ": Short stores whole numbers from -32,768 to 32,767 (inclusive)");
        
        int int_num = 100000; 
        System.out.println(int_num + ": Int stores whole numbers from -2,147,483,647 to 2,147,483,647 (inclusive). It takes 32 bits");
        
        long long_num = 10000L;
        System.out.println(long_num + ": Long stores whole -2,147,483,648 to 2,147,483,647 (inclusive). It takes 64 bits");
        
        float float_num = 3.5f; 
        System.out.println(float_num + ": Float stores signed decimal numbers. It has single precision");
        
        double double_num = 99.9999;
        System.out.println(double_num + ": Double stores signed decimal numbers. It has double precision");
        
        boolean true_or_false = true; 
        System.out.println(true_or_false + ": Boolean stores true or false");

        // Outputting multiple variables with a single print method.
        System.out.println('\n' + name + star + " is " + int_num + " years old.");
    }
}