import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();
        String[] splitUrl = url.split("\\?");
        String query = splitUrl[1];
        String[] querys = query.split("&");
        String password = "";
        for (int i = 0; i< querys.length; i++) {
            String[] splitQuery = querys[i].split("=");
            String key = splitQuery[0];
            String value = "not found";
            if (splitQuery.length > 1) {
                value = splitQuery[1];
                if (key.equals("pass")) {
                    password = value;
                }
            }
            System.out.println(key + " : " + value);

        }
        if (password != "") {
            System.out.println("password : " + password);
        }
    }
}