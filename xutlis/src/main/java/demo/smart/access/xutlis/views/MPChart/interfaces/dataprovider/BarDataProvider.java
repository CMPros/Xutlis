package demo.smart.access.xutlis.views.MPChart.interfaces.dataprovider;

import com.zx.zxutils.views.MPChart.data.BarData;

public interface BarDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BarData getBarData();
    boolean isDrawBarShadowEnabled();
    boolean isDrawValueAboveBarEnabled();
    boolean isHighlightFullBarEnabled();
}
