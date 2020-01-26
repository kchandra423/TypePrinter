public class Types {
    EaseOfUse ez = new EaseOfUse();
    //gives information about a certain class
    public void normal(){
        String x=
                "Normal attacks are not very effective against rock and steel, \n"+
                        "Normal types have no effect on ghost\n"+
                        "Normal types are immune to ghost\n" +
                        "Normal types are weak to fighting\n";

        ez.print(x);
    }
    public void fire(){
        String x=
                "Fire attacks are super effective against grass, ice, bug and steel\n"+
                "Fire attacks are not very effective against fire, water, rock and dragon\n"+
                        "Fire types are resistant to fire, grass, ice, bug, steel, and fairy\n"+
                        "Fire types are weak to water, ground and rock\n";

        ez.print(x);
    }
    public void water(){
        String x=
                "Water attacks are super effective against fire, ground amd rock\n"+
                        "Water attacks are not very effective against grass, water, and dragon\n"+
                        "Water types are resistant to fire, water, ice, bug, and steel\n"+
                        "Water types are weak to electric and grass\n";

        ez.print(x);
    }
    public void electric(){
        String x=
                "Electric attacks are super effective against water and flying\n"+
                        "Electric attacks are not very effective against grass, electric, and dragon\n"+
                        "Electric attacks have no effect on ground\n"+
                        "Electric types are resistant to electric, flying, and steel\n"+
                        "Electric types are weak to ground\n";

        ez.print(x);
    }
    public void grass(){
        String x=
                "Grass attacks are super effective against water, ground, and rock\n"+
                        "Grass attacks are not very effective against fire, grass, poison, flying, bug, dragon, and steel\n"+
                        "Grass types are resistant to water, electric, grass, and ground\n"+
                        "Grass types are weak to fire, ice, bug, poison, flying, bug\n";

        ez.print(x);
    }
    public void ice(){
        String x=
                "Ice attacks are super effective against grass, ground, flying, and dragon\n"+
                        "Ice attacks are not very effective against fire, water, ice, steel\n"+
                        "Ice types are resistant to ice\n"+
                        "Ice types are weak to fire, fighting, rock, and steel\n";

        ez.print(x);
    }
    public void fighting(){
        String x=
                "Fighting attacks are super effective against normal, ice, rock, dark, and steel\n"+
                        "Fighting attacks are not very effective against poison, flying, psychic, bug, fairy\n"+
                        "Fighting attacks have no effect on ghost\n"+
                        "Fighting types are resistant to bug, rock, dark\n"+
                        "Fighting types are weak to flying, psychic, and fairy\n";

        ez.print(x);
    }
    public void poison(){
        String x=
                "Poison attacks are super effective against grass and fairy\n"+
                        "Poison attacks are not very effective against poison, ground, rock, ghost\n"+
                        "Poison attacks have no effect on steel\n"+
                        "Poison types are resistant to grass, fighting, poison, bug, fairy\n"+
                        "Poison types are weak to ground and psychic\n";

        ez.print(x);
    }
    public void ground(){
        String x=
                "Ground attacks are super effective against fire, electric, poison, rock, and steel\n"+
                        "Ground attacks are not very effective against grass and bug\n"+
                        "Ground attacks have no effect on flying\n"+
                        "Ground types are immune to electric\n"+
                        "Ground types are resistant to poison and rock\n"+
                        "Ground types are weak to water, grass, and ice\n";

        ez.print(x);
    }
    public void flying(){
        String x=
                "Flying attacks are super effective against grass, fighting, and bug\n"+
                        "Flying attacks are not very effective against electric, rock and steel\n"+

                        "Flying types are immune to ground\n"+
                        "Flying types are resistant to grass, fighting, and bug\n"+
                        "Flying types are weak to electric, ice, and rock\n";

        ez.print(x);
    }
    public void psychic(){
        String x=
                "Psychic attacks are super effective against fighting and poison\n"+
                        "Psychic attacks are not very effective against psychic and steel\n"+
                        "Psychic attacks have no effect on dark\n"+

                        "Psychic types are resistant to fighting and psychic\n"+
                        "Psychic types are weak to bug, ghost, and dark\n";

        ez.print(x);
    }
    public void bug(){
        String x=
                "Bug attacks are super effective against grass, psychic, and dark\n"+
                        "Bug attacks are not very effective against fire, fighting, poison, flying, ghost, steel, fairy\n"+

                        "Bug types are resistant to grass, fighting, and ground\n"+
                        "Bug types are weak to fire, flying, and rock\n";

        ez.print(x);
    }
    public void rock(){
        String x=
                "Rock attacks are super effective against fire, ice, flying, and bug\n"+
                        "Rock attacks are not very effective against fighting, ground, and steel\n"+

                        "Rock types are resistant to normal, fire, poison, and flying\n"+
                        "Rock types are weak to water, grass, fighting, ground, and steel\n";

        ez.print(x);
    }
    public void ghost(){
        String x=
                "Ghost attacks are super effective against psychic and ghost\n"+
                        "Ghost attacks are not very effective against dark\n"+
                        "Ghost attacks have no effect on normal\n"+
                        "Ghost types are immune to normal and fighting\n"+
                        "Ghost types are resistant to poison and bug\n"+
                        "Ghost types are weak to ghost and dark\n";

        ez.print(x);
    }
    public void dragon(){
        String x=
                "Dragon attacks are super effective against dragon\n"+
                        "Dragon attacks are not very effective against steel\n"+
                        "Dragon attacks have no effect on fairy\n"+

                        "Dragon types are resistant to fire, water, electric, and grass\n"+
                        "Dragon types are weak to ice, dragon, and fairy\n";

        ez.print(x);
    }
    public void dark(){
        String x=
                "Dark attacks are super effective against psychic and ghost\n"+
                        "Dark attacks are not very effective against fighting, dark, and fairy\n"+

                        "Dark types are immune to psychic\n"+
                        "Dark types are resistant to ghost and dark\n"+
                        "Dark types are weak to fighting, bug, and fairy\n";

        ez.print(x);
    }
    public void steel(){
        String x=
                "Steel attacks are super effective against ice, rock, and fairy\n"+
                        "Steel attacks are not very effective against fire, water, electric, and steel\n"+

                        "Steel types are immune to poison\n"+
                        "Steel types are resistant to normal, grass, ice, flying, psychic, bug, rock, dragon, steel, and fairy\n"+
                        "Steel types are weak to fire, fighting, and ground\n";

        ez.print(x);
    }
    public void fairy(){
        String x=
                "Fairy attacks are super effective against fighting, dark, and dragon\n"+
                        "Fairy attacks are not very effective against fire, poison, and steel\n"+

                        "Fairy types are immune to dragon\n"+
                        "Fairy types are resistant to fighting, bug, and dark\n"+
                        "Fairy types are weak to poison and steel\n";

        ez.print(x);
    }
}
