package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnSliderDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B+\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H&¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDuxo;", "DS", "", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderViewState;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderEvent;", "initialDataState", "stateProvider", "Lcom/robinhood/android/udf/StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljava/lang/Object;Lcom/robinhood/android/udf/StateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onSliderDragged", "", "draggedPercent", "", "dragState", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "onSliderQuotePillTapped", "anchor", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;", "onBottomSheetStateChanged", "isHiddenOrNull", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionsSimulatedReturnSliderDuxo<DS> extends BaseDuxo3<DS, OptionsSimulatedReturnSliderViewState, OptionsSimulatedReturnSliderEvent> {
    public static final int $stable = BaseDuxo3.$stable;

    public abstract void onBottomSheetStateChanged(boolean isHiddenOrNull);

    public abstract void onSliderDragged(float draggedPercent, OptionsSimulatedReturnSliderViewState2 dragState);

    public abstract void onSliderQuotePillTapped(OptionsSimulatedReturnSliderViewState3 anchor);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsSimulatedReturnSliderDuxo(DS initialDataState, StateProvider<? super DS, OptionsSimulatedReturnSliderViewState> stateProvider, DuxoBundle duxoBundle) {
        super(initialDataState, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(initialDataState, "initialDataState");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }
}
