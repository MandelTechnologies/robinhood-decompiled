package com.robinhood.android.options.lib.simulatedreturn.slider;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnSliderViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/SliderQuotePillState;", "", "anchor", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;", "text", "", "visibility", "", "<init>", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;Ljava/lang/String;Z)V", "getAnchor", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;", "getText", "()Ljava/lang/String;", "getVisibility", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SliderQuotePillState {
    public static final int $stable = 0;
    private final OptionsSimulatedReturnSliderViewState3 anchor;
    private final String text;
    private final boolean visibility;

    public static /* synthetic */ SliderQuotePillState copy$default(SliderQuotePillState sliderQuotePillState, OptionsSimulatedReturnSliderViewState3 optionsSimulatedReturnSliderViewState3, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsSimulatedReturnSliderViewState3 = sliderQuotePillState.anchor;
        }
        if ((i & 2) != 0) {
            str = sliderQuotePillState.text;
        }
        if ((i & 4) != 0) {
            z = sliderQuotePillState.visibility;
        }
        return sliderQuotePillState.copy(optionsSimulatedReturnSliderViewState3, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsSimulatedReturnSliderViewState3 getAnchor() {
        return this.anchor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getVisibility() {
        return this.visibility;
    }

    public final SliderQuotePillState copy(OptionsSimulatedReturnSliderViewState3 anchor, String text, boolean visibility) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(text, "text");
        return new SliderQuotePillState(anchor, text, visibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderQuotePillState)) {
            return false;
        }
        SliderQuotePillState sliderQuotePillState = (SliderQuotePillState) other;
        return this.anchor == sliderQuotePillState.anchor && Intrinsics.areEqual(this.text, sliderQuotePillState.text) && this.visibility == sliderQuotePillState.visibility;
    }

    public int hashCode() {
        return (((this.anchor.hashCode() * 31) + this.text.hashCode()) * 31) + Boolean.hashCode(this.visibility);
    }

    public String toString() {
        return "SliderQuotePillState(anchor=" + this.anchor + ", text=" + this.text + ", visibility=" + this.visibility + ")";
    }

    public SliderQuotePillState(OptionsSimulatedReturnSliderViewState3 anchor, String text, boolean z) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(text, "text");
        this.anchor = anchor;
        this.text = text;
        this.visibility = z;
    }

    public final OptionsSimulatedReturnSliderViewState3 getAnchor() {
        return this.anchor;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getVisibility() {
        return this.visibility;
    }
}
