package dev.sara;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TablaTest {
    
    @Test 
    public void testTabla() {

        List<String> resultado = Tabla.generarTabla(3);

        assertThat(resultado, hasSize(10));
        assertThat(resultado.get(0), "3 x 1 = 3");
        assertThat(resultado.get(9), "3 x 10 = 30");
    }


}
