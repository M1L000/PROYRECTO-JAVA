import java.io.*;
import java.util.*;

class Becas{

    private boolean Aprobada_o_Rechazada;


    public void set_Aprobada_o_rechazada(boolean SiNo)
    {
        this.Aprobada_o_Rechazada = SiNo;
    }
    public boolean get_Aprobada_o_rechazada()
    {
        return Aprobada_o_Rechazada;
    }

    public void BECA_bicentenario(float rangoSE, int PtsPAES)
    {
        if(rangoSE >= 0.7 && PtsPAES >= 510) 
        {
            Aprobada_o_Rechazada = true;
        }
        else{
            Aprobada_o_Rechazada = false;
        }
    }




}
