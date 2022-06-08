package Lab_Refactor;

public class Database {

    FoxConstructor[] foxesInMemory = {
            new FoxConstructor(1,true,true, "BLACK",0),
            new FoxConstructor(2,true,true, "BLACK",2),
            new FoxConstructor(3,true,true, "BLACK",3),
            new FoxConstructor(4,false,true, "GRAY",3)
    };

    public FoxConstructor[] getAllFoxes(){
        return foxesInMemory;
    }

    public FoxConstructor getFoxById(int id){
        return foxesInMemory[id - 1];
    }
}
