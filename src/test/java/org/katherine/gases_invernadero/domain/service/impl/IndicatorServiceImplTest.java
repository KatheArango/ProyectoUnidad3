package org.katherine.gases_invernadero.domain.service.impl;

import org.junit.jupiter.api.Test;
import org.katherine.gases_invernadero.domain.service.IndicatorService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IndicatorServiceImplTest {
private IndicatorService indicatorService= new IndicatorServiceImpl();
    @Test
    void el_calculo_de_indicadores_funciona_correctamente()
    {
        List<String>indicadorList = indicatorService.calcular();
assertNotNull(indicadorList);
    }
}