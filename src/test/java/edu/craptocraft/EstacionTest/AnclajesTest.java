package edu.craptocraft.EstacionTest;

import edu.craptocraft.estacion.Anclaje;
import edu.craptocraft.estacion.Anclajes;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnclajesTest {
    public static Anclajes anclajes;
    @BeforeClass
    public static void inicializarAnclajes(){
        anclajes = new Anclajes(9);
    }
    @Test
    public void ConstructorAnclajesTest() {
        Assert.assertEquals(9, anclajes.numAnclajes());

    }
    @Test
    public void crearAnclajesTest(){
        Anclaje anclaje = new Anclaje();
        for (int i = 0; i<anclajes.numAnclajes(); i++) {
            Assert.assertEquals(anclajes.getAnclaje(i).getClass(), anclaje.getClass());
        }
    }
}
