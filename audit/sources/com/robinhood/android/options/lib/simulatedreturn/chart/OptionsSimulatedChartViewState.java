package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.compose.runtime.Composer;
import com.robinhood.android.charts.model.ChartAnnotation;
import com.robinhood.android.charts.overlay.Overlays;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.android.options.lib.simulatedreturn.header.OptionsSimulatedChartHeaderState;
import java.util.List;
import kotlin.Metadata;

/* compiled from: OptionsSimulatedChartViewState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H'¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015H'¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0018H'¢\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0018H'¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedChartViewState;", "", "headerState", "Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "getHeaderState", "()Lcom/robinhood/android/options/lib/simulatedreturn/header/OptionsSimulatedChartHeaderState;", "estimatedContractPrice", "", "getEstimatedContractPrice", "()Ljava/lang/Double;", "errorState", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "getErrorState", "()Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "getDateLabel", "Lcom/robinhood/android/charts/overlay/ChartOverlay;", "chartWidth", "", "parentWidthAfterPadding", "(FFLandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/overlay/ChartOverlay;", "getAnnotations", "", "Lcom/robinhood/android/charts/model/ChartAnnotation;", "usePreTradeStyle", "", "(ZLandroidx/compose/runtime/Composer;I)Ljava/util/List;", "getOverlays", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "getXAxis", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;", "(ZLandroidx/compose/runtime/Composer;I)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartAxisModel;", "getYAxis", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public interface OptionsSimulatedChartViewState {
    List<ChartAnnotation> getAnnotations(boolean z, Composer composer, int i);

    Overlays getDateLabel(float f, float f2, Composer composer, int i);

    OptionsSimulatedReturnErrorState getErrorState();

    Double getEstimatedContractPrice();

    OptionsSimulatedChartHeaderState getHeaderState();

    List<Overlays> getOverlays(Composer composer, int i);

    OptionsSimulatedReturnChartAxisModel getXAxis(boolean z, Composer composer, int i);

    OptionsSimulatedReturnChartAxisModel getYAxis(boolean z, Composer composer, int i);
}
