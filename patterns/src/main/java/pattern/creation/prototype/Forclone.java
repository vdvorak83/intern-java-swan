package pattern.creation.prototype;

 class Forclone implements Prototype {
    private String name;

    public Forclone(String name)
    {
        this.name = name;
    }

     public void setName(String name) {
        this.name = name;
     }

    public String getName()
    {
        return name;
    }

    public Prototype clone()
    {
        return new Forclone(name);
    }

}
