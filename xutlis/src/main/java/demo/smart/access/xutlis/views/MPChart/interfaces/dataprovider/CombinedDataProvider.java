package demo.smart.access.xutlis.views.MPChart.interfaces.dataprovider;

import demo.smart.access.xutlis.views.MPChart.data.CombinedData;

/**
 * Created by philipp on 11/06/16.
 */
public interface CombinedDataProvider extends LineDataProvider, BarDataProvider, BubbleDataProvider, CandleDataProvider, ScatterDataProvider {

    CombinedData getCombinedData();
}
