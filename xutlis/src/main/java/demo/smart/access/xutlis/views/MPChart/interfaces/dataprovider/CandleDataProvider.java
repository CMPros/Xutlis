package demo.smart.access.xutlis.views.MPChart.interfaces.dataprovider;

import demo.smart.access.xutlis.views.MPChart.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
