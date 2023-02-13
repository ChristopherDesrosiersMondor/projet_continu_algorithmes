package PatronsDeConception.UsineDeFabrication;

public class UsineForme extends UsineAbstraiteForme {
    @Override
    public Forme getForme(String shapeType)
    {
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("Cercle")){
            return new Cercle();

        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("Carré")){
            return new Carrer();
        }

        return null;
    }
}


