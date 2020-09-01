package demo.smart.access.xutlis.views.MPChart.interfaces.dataprovider;

import demo.smart.access.xutlis.views.MPChart.components.YAxis.AxisDependency;
import demo.smart.access.xutlis.views.MPChart.data.BarLineScatterCandleBubbleData;
import demo.smart.access.xutlis.views.MPChart.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
