interface UserInfoRepo{
    String name; 
    int age;
    void SaveInfo(String name, int age){
        this.name 
    }
}

public class infoToTxt implements UserInfoRepo {
    public void SaveInfo(){}
}

public class infoToCsv implements UserInfoRepo{
    public void SaveInfo(){}
}