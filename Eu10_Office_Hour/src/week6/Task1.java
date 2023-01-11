package week6;

public class Task1 {
        public static void main(String[] args) {
            int input=3;
            for (int i = 0; i <= input; i++) {
                for (int j = 0; j <= input; j++) {
                    for (int k = 0; k <= input; k++) {
                        if(i+j+k==input)
                            System.out.println(""+i+j+k);
                    }

                }

            }

        }
    }

