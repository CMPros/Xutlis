package demo.smart.access.xutlis.views.MPChart.interfaces.dataprovider;

import demo.smart.access.xutlis.views.MPChart.components.YAxis;
import demo.smart.access.xutlis.views.MPChart.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
