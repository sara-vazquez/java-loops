package dev.sara;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class TablaTest {
    
    @Test 
    public void testTabla() {

        List<String> resultado = Tabla.generarTabla(3);

        assertThat(resultado, hasSize(10));
        assertThat(resultado.get(0), is("3 x 1 = 3"));
        assertThat(resultado.get(9), equalTo("3 x 10 = 30"));
    }


}
