package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsSimulatedReturnSliderViewState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jx\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderViewState;", "", "disabled", "", "dragState", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "startQuotePillState", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;", "endQuotePillState", "ticks", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTick;", "tooltip", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;", "snappedPointerPosition", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "<init>", "(ZLcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;Ljava/lang/Double;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;)V", "getDisabled", "()Z", "getDragState", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "getLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "getStartQuotePillState", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;", "getEndQuotePillState", "getTicks", "()Lkotlinx/collections/immutable/ImmutableList;", "getTooltip", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;", "getSnappedPointerPosition", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderTooltip;Ljava/lang/Double;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderViewState;", "equals", "other", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnSliderViewState {
    public static final int $stable = 8;
    private final boolean disabled;
    private final OptionsSimulatedReturnSliderViewState2 dragState;
    private final SliderQuotePillState endQuotePillState;
    private final OptionsSimulatedReturnSliderLaunchMode launchMode;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final Double snappedPointerPosition;
    private final SliderQuotePillState startQuotePillState;
    private final ImmutableList<OptionsSimulatedReturnSliderViewState5> ticks;
    private final SliderTooltip tooltip;

    public static /* synthetic */ OptionsSimulatedReturnSliderViewState copy$default(OptionsSimulatedReturnSliderViewState optionsSimulatedReturnSliderViewState, boolean z, OptionsSimulatedReturnSliderViewState2 optionsSimulatedReturnSliderViewState2, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, SliderQuotePillState sliderQuotePillState, SliderQuotePillState sliderQuotePillState2, ImmutableList immutableList, SliderTooltip sliderTooltip, Double d, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionsSimulatedReturnSliderViewState.disabled;
        }
        if ((i & 2) != 0) {
            optionsSimulatedReturnSliderViewState2 = optionsSimulatedReturnSliderViewState.dragState;
        }
        if ((i & 4) != 0) {
            optionsSimulatedReturnSliderLaunchMode = optionsSimulatedReturnSliderViewState.launchMode;
        }
        if ((i & 8) != 0) {
            sliderQuotePillState = optionsSimulatedReturnSliderViewState.startQuotePillState;
        }
        if ((i & 16) != 0) {
            sliderQuotePillState2 = optionsSimulatedReturnSliderViewState.endQuotePillState;
        }
        if ((i & 32) != 0) {
            immutableList = optionsSimulatedReturnSliderViewState.ticks;
        }
        if ((i & 64) != 0) {
            sliderTooltip = optionsSimulatedReturnSliderViewState.tooltip;
        }
        if ((i & 128) != 0) {
            d = optionsSimulatedReturnSliderViewState.snappedPointerPosition;
        }
        if ((i & 256) != 0) {
            optionsSimulatedReturnLoggingState = optionsSimulatedReturnSliderViewState.loggingState;
        }
        Double d2 = d;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState2 = optionsSimulatedReturnLoggingState;
        ImmutableList immutableList2 = immutableList;
        SliderTooltip sliderTooltip2 = sliderTooltip;
        SliderQuotePillState sliderQuotePillState3 = sliderQuotePillState2;
        OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode2 = optionsSimulatedReturnSliderLaunchMode;
        return optionsSimulatedReturnSliderViewState.copy(z, optionsSimulatedReturnSliderViewState2, optionsSimulatedReturnSliderLaunchMode2, sliderQuotePillState, sliderQuotePillState3, immutableList2, sliderTooltip2, d2, optionsSimulatedReturnLoggingState2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionsSimulatedReturnSliderViewState2 getDragState() {
        return this.dragState;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionsSimulatedReturnSliderLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component4, reason: from getter */
    public final SliderQuotePillState getStartQuotePillState() {
        return this.startQuotePillState;
    }

    /* renamed from: component5, reason: from getter */
    public final SliderQuotePillState getEndQuotePillState() {
        return this.endQuotePillState;
    }

    public final ImmutableList<OptionsSimulatedReturnSliderViewState5> component6() {
        return this.ticks;
    }

    /* renamed from: component7, reason: from getter */
    public final SliderTooltip getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component8, reason: from getter */
    public final Double getSnappedPointerPosition() {
        return this.snappedPointerPosition;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final OptionsSimulatedReturnSliderViewState copy(boolean disabled, OptionsSimulatedReturnSliderViewState2 dragState, OptionsSimulatedReturnSliderLaunchMode launchMode, SliderQuotePillState startQuotePillState, SliderQuotePillState endQuotePillState, ImmutableList<? extends OptionsSimulatedReturnSliderViewState5> ticks, SliderTooltip tooltip, Double snappedPointerPosition, OptionsSimulatedReturnLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        Intrinsics.checkNotNullParameter(ticks, "ticks");
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        return new OptionsSimulatedReturnSliderViewState(disabled, dragState, launchMode, startQuotePillState, endQuotePillState, ticks, tooltip, snappedPointerPosition, loggingState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnSliderViewState)) {
            return false;
        }
        OptionsSimulatedReturnSliderViewState optionsSimulatedReturnSliderViewState = (OptionsSimulatedReturnSliderViewState) other;
        return this.disabled == optionsSimulatedReturnSliderViewState.disabled && this.dragState == optionsSimulatedReturnSliderViewState.dragState && Intrinsics.areEqual(this.launchMode, optionsSimulatedReturnSliderViewState.launchMode) && Intrinsics.areEqual(this.startQuotePillState, optionsSimulatedReturnSliderViewState.startQuotePillState) && Intrinsics.areEqual(this.endQuotePillState, optionsSimulatedReturnSliderViewState.endQuotePillState) && Intrinsics.areEqual(this.ticks, optionsSimulatedReturnSliderViewState.ticks) && Intrinsics.areEqual(this.tooltip, optionsSimulatedReturnSliderViewState.tooltip) && Intrinsics.areEqual((Object) this.snappedPointerPosition, (Object) optionsSimulatedReturnSliderViewState.snappedPointerPosition) && Intrinsics.areEqual(this.loggingState, optionsSimulatedReturnSliderViewState.loggingState);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.disabled) * 31) + this.dragState.hashCode()) * 31;
        OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode = this.launchMode;
        int iHashCode2 = (iHashCode + (optionsSimulatedReturnSliderLaunchMode == null ? 0 : optionsSimulatedReturnSliderLaunchMode.hashCode())) * 31;
        SliderQuotePillState sliderQuotePillState = this.startQuotePillState;
        int iHashCode3 = (iHashCode2 + (sliderQuotePillState == null ? 0 : sliderQuotePillState.hashCode())) * 31;
        SliderQuotePillState sliderQuotePillState2 = this.endQuotePillState;
        int iHashCode4 = (((((iHashCode3 + (sliderQuotePillState2 == null ? 0 : sliderQuotePillState2.hashCode())) * 31) + this.ticks.hashCode()) * 31) + this.tooltip.hashCode()) * 31;
        Double d = this.snappedPointerPosition;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
        return iHashCode5 + (optionsSimulatedReturnLoggingState != null ? optionsSimulatedReturnLoggingState.hashCode() : 0);
    }

    public String toString() {
        return "OptionsSimulatedReturnSliderViewState(disabled=" + this.disabled + ", dragState=" + this.dragState + ", launchMode=" + this.launchMode + ", startQuotePillState=" + this.startQuotePillState + ", endQuotePillState=" + this.endQuotePillState + ", ticks=" + this.ticks + ", tooltip=" + this.tooltip + ", snappedPointerPosition=" + this.snappedPointerPosition + ", loggingState=" + this.loggingState + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsSimulatedReturnSliderViewState(boolean z, OptionsSimulatedReturnSliderViewState2 dragState, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, SliderQuotePillState sliderQuotePillState, SliderQuotePillState sliderQuotePillState2, ImmutableList<? extends OptionsSimulatedReturnSliderViewState5> ticks, SliderTooltip tooltip, Double d, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        Intrinsics.checkNotNullParameter(ticks, "ticks");
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        this.disabled = z;
        this.dragState = dragState;
        this.launchMode = optionsSimulatedReturnSliderLaunchMode;
        this.startQuotePillState = sliderQuotePillState;
        this.endQuotePillState = sliderQuotePillState2;
        this.ticks = ticks;
        this.tooltip = tooltip;
        this.snappedPointerPosition = d;
        this.loggingState = optionsSimulatedReturnLoggingState;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final OptionsSimulatedReturnSliderViewState2 getDragState() {
        return this.dragState;
    }

    public final OptionsSimulatedReturnSliderLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final SliderQuotePillState getStartQuotePillState() {
        return this.startQuotePillState;
    }

    public final SliderQuotePillState getEndQuotePillState() {
        return this.endQuotePillState;
    }

    public final ImmutableList<OptionsSimulatedReturnSliderViewState5> getTicks() {
        return this.ticks;
    }

    public final SliderTooltip getTooltip() {
        return this.tooltip;
    }

    public final Double getSnappedPointerPosition() {
        return this.snappedPointerPosition;
    }

    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }
}
