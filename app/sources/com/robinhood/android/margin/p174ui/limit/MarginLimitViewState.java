package com.robinhood.android.margin.p174ui.limit;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitViewState;", "", "setMarginLimitButtonEnabled", "", "inputViewEnabled", "titleText", "", "descriptionText", "setMarginLimitButtonText", "removeLimitButtonVisible", "shouldRequestFocus", "availableMarginText", "Lcom/robinhood/utils/resource/StringResource;", "validation", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "marginLimitDisplayData", "Lcom/robinhood/android/margin/ui/limit/MarginLimitInputData;", "<init>", "(ZZIIIZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;Lcom/robinhood/android/margin/ui/limit/MarginLimitInputData;)V", "getSetMarginLimitButtonEnabled", "()Z", "getInputViewEnabled", "getTitleText", "()I", "getDescriptionText", "getSetMarginLimitButtonText", "getRemoveLimitButtonVisible", "getShouldRequestFocus", "getAvailableMarginText", "()Lcom/robinhood/utils/resource/StringResource;", "getValidation", "()Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "getMarginLimitDisplayData", "()Lcom/robinhood/android/margin/ui/limit/MarginLimitInputData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarginLimitViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource availableMarginText;
    private final int descriptionText;
    private final boolean inputViewEnabled;
    private final MarginLimitInputData marginLimitDisplayData;
    private final boolean removeLimitButtonVisible;
    private final boolean setMarginLimitButtonEnabled;
    private final int setMarginLimitButtonText;
    private final boolean shouldRequestFocus;
    private final int titleText;
    private final MarginLimitStateProvider3 validation;

    public static /* synthetic */ MarginLimitViewState copy$default(MarginLimitViewState marginLimitViewState, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, StringResource stringResource, MarginLimitStateProvider3 marginLimitStateProvider3, MarginLimitInputData marginLimitInputData, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = marginLimitViewState.setMarginLimitButtonEnabled;
        }
        if ((i4 & 2) != 0) {
            z2 = marginLimitViewState.inputViewEnabled;
        }
        if ((i4 & 4) != 0) {
            i = marginLimitViewState.titleText;
        }
        if ((i4 & 8) != 0) {
            i2 = marginLimitViewState.descriptionText;
        }
        if ((i4 & 16) != 0) {
            i3 = marginLimitViewState.setMarginLimitButtonText;
        }
        if ((i4 & 32) != 0) {
            z3 = marginLimitViewState.removeLimitButtonVisible;
        }
        if ((i4 & 64) != 0) {
            z4 = marginLimitViewState.shouldRequestFocus;
        }
        if ((i4 & 128) != 0) {
            stringResource = marginLimitViewState.availableMarginText;
        }
        if ((i4 & 256) != 0) {
            marginLimitStateProvider3 = marginLimitViewState.validation;
        }
        if ((i4 & 512) != 0) {
            marginLimitInputData = marginLimitViewState.marginLimitDisplayData;
        }
        MarginLimitStateProvider3 marginLimitStateProvider32 = marginLimitStateProvider3;
        MarginLimitInputData marginLimitInputData2 = marginLimitInputData;
        boolean z5 = z4;
        StringResource stringResource2 = stringResource;
        int i5 = i3;
        boolean z6 = z3;
        return marginLimitViewState.copy(z, z2, i, i2, i5, z6, z5, stringResource2, marginLimitStateProvider32, marginLimitInputData2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSetMarginLimitButtonEnabled() {
        return this.setMarginLimitButtonEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final MarginLimitInputData getMarginLimitDisplayData() {
        return this.marginLimitDisplayData;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInputViewEnabled() {
        return this.inputViewEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTitleText() {
        return this.titleText;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDescriptionText() {
        return this.descriptionText;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSetMarginLimitButtonText() {
        return this.setMarginLimitButtonText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getRemoveLimitButtonVisible() {
        return this.removeLimitButtonVisible;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldRequestFocus() {
        return this.shouldRequestFocus;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getAvailableMarginText() {
        return this.availableMarginText;
    }

    /* renamed from: component9, reason: from getter */
    public final MarginLimitStateProvider3 getValidation() {
        return this.validation;
    }

    public final MarginLimitViewState copy(boolean setMarginLimitButtonEnabled, boolean inputViewEnabled, int titleText, int descriptionText, int setMarginLimitButtonText, boolean removeLimitButtonVisible, boolean shouldRequestFocus, StringResource availableMarginText, MarginLimitStateProvider3 validation, MarginLimitInputData marginLimitDisplayData) {
        Intrinsics.checkNotNullParameter(marginLimitDisplayData, "marginLimitDisplayData");
        return new MarginLimitViewState(setMarginLimitButtonEnabled, inputViewEnabled, titleText, descriptionText, setMarginLimitButtonText, removeLimitButtonVisible, shouldRequestFocus, availableMarginText, validation, marginLimitDisplayData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginLimitViewState)) {
            return false;
        }
        MarginLimitViewState marginLimitViewState = (MarginLimitViewState) other;
        return this.setMarginLimitButtonEnabled == marginLimitViewState.setMarginLimitButtonEnabled && this.inputViewEnabled == marginLimitViewState.inputViewEnabled && this.titleText == marginLimitViewState.titleText && this.descriptionText == marginLimitViewState.descriptionText && this.setMarginLimitButtonText == marginLimitViewState.setMarginLimitButtonText && this.removeLimitButtonVisible == marginLimitViewState.removeLimitButtonVisible && this.shouldRequestFocus == marginLimitViewState.shouldRequestFocus && Intrinsics.areEqual(this.availableMarginText, marginLimitViewState.availableMarginText) && Intrinsics.areEqual(this.validation, marginLimitViewState.validation) && Intrinsics.areEqual(this.marginLimitDisplayData, marginLimitViewState.marginLimitDisplayData);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.setMarginLimitButtonEnabled) * 31) + Boolean.hashCode(this.inputViewEnabled)) * 31) + Integer.hashCode(this.titleText)) * 31) + Integer.hashCode(this.descriptionText)) * 31) + Integer.hashCode(this.setMarginLimitButtonText)) * 31) + Boolean.hashCode(this.removeLimitButtonVisible)) * 31) + Boolean.hashCode(this.shouldRequestFocus)) * 31;
        StringResource stringResource = this.availableMarginText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        MarginLimitStateProvider3 marginLimitStateProvider3 = this.validation;
        return ((iHashCode2 + (marginLimitStateProvider3 != null ? marginLimitStateProvider3.hashCode() : 0)) * 31) + this.marginLimitDisplayData.hashCode();
    }

    public String toString() {
        return "MarginLimitViewState(setMarginLimitButtonEnabled=" + this.setMarginLimitButtonEnabled + ", inputViewEnabled=" + this.inputViewEnabled + ", titleText=" + this.titleText + ", descriptionText=" + this.descriptionText + ", setMarginLimitButtonText=" + this.setMarginLimitButtonText + ", removeLimitButtonVisible=" + this.removeLimitButtonVisible + ", shouldRequestFocus=" + this.shouldRequestFocus + ", availableMarginText=" + this.availableMarginText + ", validation=" + this.validation + ", marginLimitDisplayData=" + this.marginLimitDisplayData + ")";
    }

    public MarginLimitViewState(boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, StringResource stringResource, MarginLimitStateProvider3 marginLimitStateProvider3, MarginLimitInputData marginLimitDisplayData) {
        Intrinsics.checkNotNullParameter(marginLimitDisplayData, "marginLimitDisplayData");
        this.setMarginLimitButtonEnabled = z;
        this.inputViewEnabled = z2;
        this.titleText = i;
        this.descriptionText = i2;
        this.setMarginLimitButtonText = i3;
        this.removeLimitButtonVisible = z3;
        this.shouldRequestFocus = z4;
        this.availableMarginText = stringResource;
        this.validation = marginLimitStateProvider3;
        this.marginLimitDisplayData = marginLimitDisplayData;
    }

    public final boolean getSetMarginLimitButtonEnabled() {
        return this.setMarginLimitButtonEnabled;
    }

    public final boolean getInputViewEnabled() {
        return this.inputViewEnabled;
    }

    public final int getTitleText() {
        return this.titleText;
    }

    public final int getDescriptionText() {
        return this.descriptionText;
    }

    public final int getSetMarginLimitButtonText() {
        return this.setMarginLimitButtonText;
    }

    public final boolean getRemoveLimitButtonVisible() {
        return this.removeLimitButtonVisible;
    }

    public final boolean getShouldRequestFocus() {
        return this.shouldRequestFocus;
    }

    public final StringResource getAvailableMarginText() {
        return this.availableMarginText;
    }

    public final MarginLimitStateProvider3 getValidation() {
        return this.validation;
    }

    public final MarginLimitInputData getMarginLimitDisplayData() {
        return this.marginLimitDisplayData;
    }
}
