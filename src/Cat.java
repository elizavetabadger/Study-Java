public class Cat {

    private String name = "Кот без имени";
    private String color;

    void meow(){
        IO.println(name + ": Meow!~");
    }
    public void rename(String newName){
        if(newName.contains("1"))
            System.out.println("Нельзя так назвать котика... ");
        else
            name = newName;
    }
    public String getName(){
        return  name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(){
        // дефолтный конструктор
        color = "серый";
    }

    public Cat(String name){
        rename(name);
        color = "серый";
    }


}
