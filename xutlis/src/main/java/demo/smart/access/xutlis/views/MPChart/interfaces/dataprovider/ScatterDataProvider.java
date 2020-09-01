package demo.smart.access.xutlis.views.MPChart.interfaces.dataprovider;

import demo.smart.access.xutlis.views.MPChart.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
