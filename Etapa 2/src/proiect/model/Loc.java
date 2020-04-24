package proiect.model;

public class Loc {
    private Integer loc;
    private Integer linii;
    private Integer coloane;
    private Integer[][] sala;

    public Loc(Integer loc, Integer linii, Integer coloane, Integer[][] sala)
    {
        this.loc = loc;
        this.linii = linii;
        this.coloane = coloane;
        this.sala = new Integer[linii][coloane];
        for(int i = 0; i < linii; i++)
            for(int j = 0; j < coloane; j++)
                this.sala[i][j] = 0;
    }

    public void setLoc(Integer linie, Integer coloana)
    {
        loc = linie * 10 + coloana;
    }

    public boolean loc_liber()
    {
        for(int i = 0; i < linii; i++)
            for(int j = 0; j < coloane; j++)
                if(sala[i][j] != 1)
                {
                    sala[i][j] = 1;
                    setLoc(i,j);
                }
        return false;
    }

    public Integer getLoc()
    {
        return loc;
    }
    
    public Integer nrLocuri()
    {
        return (linii * coloane);
    }
}
