import java.util.Scanner;

public class ObjectFB {
    private String ID;
    private String UserName;
    private String FullName;
    private String Posted;

    public ObjectFB() {
        System.out.println("ObjectFB Processing...");
    }

    public static void main(String[] args) {
        int jumPost = 4;
        Scanner sc = new Scanner(System.in);
        ObjectFB user1 = new ObjectFB();
        user1.setID("010");
        user1.setUserName("280203");
        user1.setFullName("Laela Diyah Puspita");
        ArrayList<String> myPost = new ArrayList<>();
        for (int index = 0; index < jumPost; index++){
        myPost.add(sc.nextLine());
        }
        user1.setPosted(myPost);
        System.out.println("Total Posted : " + user1.ShowNumberOfPost());
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPosted() {
        return Posted;
    }

    public void setPosted(String posted) {
        Posted = posted;
    }
}
