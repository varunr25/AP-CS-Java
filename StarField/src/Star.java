/*  Star
    - A Star object represents a single Star in the sky.
    - A Star object knows it's intensity number, row, column, and constellation name.
    - We need to be able to ask the Star for either one of its values.
    - We need to be able to alter the intensity and the image of the Star.
*/
public class Star 
{
    private int intensity, R, C; 
    private String constellation, image;

    //  Creates the star. The string is ordered by INTENSITY, ROW, COLUMN.
    public Star(int intensity, int R, int C, String image, String constellation)
    {
        this.intensity = intensity;
        this.R = R;
        this.C = C;
        this.constellation = constellation;
        this.image = image;
    }

    // Returns the intensity.
    public int getIntensity() 
    {   return this.intensity;  }

    //  Sets the intensity value.
    public void setIntensity(int intensity)
    {   this.intensity =  intensity;    }

    // Returns the row.
    public int getRow() 
    {   return this.R;  }

    // Returns the column.
    public int getColumn() 
    {   return this.C;  }

    // Returns the constellation.
    public String getConstellation() 
    {   return this.constellation;  }

    // Returns the image.
    public String getImage() 
    {   return this.image;  }
}