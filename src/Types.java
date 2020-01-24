public class Types {
    EaseOfUse ez = new EaseOfUse();
    //gives information about a certain class
    public void normal(){
        String x=
                "Normal attacks are not very effective against rock and steel, and have no effect on ghost\n"+
                        "Normal types are immune to ghost\n" +
                        "Normal types are weak to fighting\n";

        ez.print(x);
    }
    public void fire(){
        String x=
                "Fire attacks are super effective again grass, ice, bug and steel\n"+
                "Fire attacks are not very effective against fire, water, rock and dragon\n"+
                        "Fire types are resistant to fire, grass, ice, bug, steel, and fairy\n"+
                        "Fire types are weak to water, ground and rock\n";

        ez.print(x);
    }
    public void water(){
        String x=
                "Water attacks are super effective again fire, ground amd rock\n"+
                        "Water attacks are not very effective against grass, water, and dragon\n"+
                        "Water types are resistant to fire, water, ice, bug, and steel\n"+
                        "Water types are weak to electric and grass\n";

        ez.print(x);
    }
    public void electric(){
        String x=
                "Electric attacks are super effective again water and flying\n"+
                        "Electric attacks are not very effective against grass, electric, and dragon\n"+
                        "Electric attacks have no effect on ground\n"+
                        "Electric types are resistant to electric, flying, and steel\n"+
                        "Electric types are weak to ground\n";

        ez.print(x);
    }
    public void grass(){
        String x=
                "Grass attacks are super effective again water, ground, and rock\n"+
                        "Grass attacks are not very effective against fire, grass, poison, flying, bug, dragon, and steel\n"+
                        "Grass types are resistant to water, electric, grass, and ground\n"+
                        "Grass types are weak to fire, ice, bug, poison, flying, bug\n";

        ez.print(x);
    }
    public void ice(){
        String x=
                "Ice attacks are super effective again grass, ground, flying, and dragon\n"+
                        "Ice attacks are not very effective against fire, water, ice, steel\n"+
                        "Ice types are resistant to ice\n"+
                        "Ice types are weak to fire, fighting, rock, and steel\n";

        ez.print(x);
    }
    public void fighting(){
        String x=
                "Fighting attacks are super effective again normal, ice, rock, dark, and steel\n"+
                        "Fighting attacks are not very effective against poison, flying, psychic, bug, fairy\n"+
                        "Fighting attacks have no effect on ghost\n"+
                        "Fighting types are resistant to bug, rock, dark\n"+
                        "Fighting types are weak to flying, psychic, and fairy\n";

        ez.print(x);
    }
    public void poison(){
        String x=
                "Poison attacks are super effective again grass and fairy\n"+
                        "Poison attacks are not very effective against poison, ground, rock, ghost\n"+
                        "Poison attacks have no effect on steel\n"+
                        "Poison types are resistant to grass, fighting, poison, bug, fairy\n"+
                        "Poison types are weak to ground and psychic\n";

        ez.print(x);
    }
    public void ground(){
        String x=
                "Ground attacks are super effective again fire, electric, poison, rock, and steel\n"+
                        "Ground attacks are not very effective against grass and bug\n"+
                        "Ground attacks have no effect on flying\n"+
                        "Ground types are immune to electric\n"+
                        "Ground types are resistant to poison and rock\n"+
                        "Ground types are weak to water, grass, and ice\n";

        ez.print(x);
    }
}
