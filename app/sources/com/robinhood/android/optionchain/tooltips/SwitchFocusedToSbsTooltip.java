package com.robinhood.android.optionchain.tooltips;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainViewSwitchTooltip.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionchain/tooltips/SwitchFocusedToSbsTooltip;", "", "nibHorizontalBias", "", "textRes", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(FLcom/robinhood/utils/resource/StringResource;)V", "getNibHorizontalBias", "()F", "getTextRes", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SwitchFocusedToSbsTooltip {
    public static final int $stable = StringResource.$stable;
    private final float nibHorizontalBias;
    private final StringResource textRes;

    public static /* synthetic */ SwitchFocusedToSbsTooltip copy$default(SwitchFocusedToSbsTooltip switchFocusedToSbsTooltip, float f, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            f = switchFocusedToSbsTooltip.nibHorizontalBias;
        }
        if ((i & 2) != 0) {
            stringResource = switchFocusedToSbsTooltip.textRes;
        }
        return switchFocusedToSbsTooltip.copy(f, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final float getNibHorizontalBias() {
        return this.nibHorizontalBias;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getTextRes() {
        return this.textRes;
    }

    public final SwitchFocusedToSbsTooltip copy(float nibHorizontalBias, StringResource textRes) {
        Intrinsics.checkNotNullParameter(textRes, "textRes");
        return new SwitchFocusedToSbsTooltip(nibHorizontalBias, textRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchFocusedToSbsTooltip)) {
            return false;
        }
        SwitchFocusedToSbsTooltip switchFocusedToSbsTooltip = (SwitchFocusedToSbsTooltip) other;
        return Float.compare(this.nibHorizontalBias, switchFocusedToSbsTooltip.nibHorizontalBias) == 0 && Intrinsics.areEqual(this.textRes, switchFocusedToSbsTooltip.textRes);
    }

    public int hashCode() {
        return (Float.hashCode(this.nibHorizontalBias) * 31) + this.textRes.hashCode();
    }

    public String toString() {
        return "SwitchFocusedToSbsTooltip(nibHorizontalBias=" + this.nibHorizontalBias + ", textRes=" + this.textRes + ")";
    }

    public SwitchFocusedToSbsTooltip(float f, StringResource textRes) {
        Intrinsics.checkNotNullParameter(textRes, "textRes");
        this.nibHorizontalBias = f;
        this.textRes = textRes;
    }

    public final float getNibHorizontalBias() {
        return this.nibHorizontalBias;
    }

    public final StringResource getTextRes() {
        return this.textRes;
    }
}
