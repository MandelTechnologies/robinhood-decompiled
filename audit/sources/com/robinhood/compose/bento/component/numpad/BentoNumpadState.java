package com.robinhood.compose.bento.component.numpad;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoNumpad.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadState;", "", "buttonText", "Lcom/robinhood/utils/resource/StringResource;", "isNumpadEnabled", "", "isButtonEnabled", "isButtonVisible", "isButtonLoading", "showDelimiter", "delimiterLocalized", "backspaceOverride", "Lcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;", "buttonPositionTop", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZZZZZZLcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;Z)V", "getButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getShowDelimiter", "getDelimiterLocalized", "getBackspaceOverride", "()Lcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;", "getButtonPositionTop", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoNumpadState {
    public static final int $stable = StringResource.$stable;
    private final CustomKeyConfig backspaceOverride;
    private final boolean buttonPositionTop;
    private final StringResource buttonText;
    private final boolean delimiterLocalized;
    private final boolean isButtonEnabled;
    private final boolean isButtonLoading;
    private final boolean isButtonVisible;
    private final boolean isNumpadEnabled;
    private final boolean showDelimiter;

    public static /* synthetic */ BentoNumpadState copy$default(BentoNumpadState bentoNumpadState, StringResource stringResource, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CustomKeyConfig customKeyConfig, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = bentoNumpadState.buttonText;
        }
        if ((i & 2) != 0) {
            z = bentoNumpadState.isNumpadEnabled;
        }
        if ((i & 4) != 0) {
            z2 = bentoNumpadState.isButtonEnabled;
        }
        if ((i & 8) != 0) {
            z3 = bentoNumpadState.isButtonVisible;
        }
        if ((i & 16) != 0) {
            z4 = bentoNumpadState.isButtonLoading;
        }
        if ((i & 32) != 0) {
            z5 = bentoNumpadState.showDelimiter;
        }
        if ((i & 64) != 0) {
            z6 = bentoNumpadState.delimiterLocalized;
        }
        if ((i & 128) != 0) {
            customKeyConfig = bentoNumpadState.backspaceOverride;
        }
        if ((i & 256) != 0) {
            z7 = bentoNumpadState.buttonPositionTop;
        }
        CustomKeyConfig customKeyConfig2 = customKeyConfig;
        boolean z8 = z7;
        boolean z9 = z5;
        boolean z10 = z6;
        boolean z11 = z4;
        boolean z12 = z2;
        return bentoNumpadState.copy(stringResource, z, z12, z3, z11, z9, z10, customKeyConfig2, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsNumpadEnabled() {
        return this.isNumpadEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsButtonEnabled() {
        return this.isButtonEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsButtonVisible() {
        return this.isButtonVisible;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsButtonLoading() {
        return this.isButtonLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowDelimiter() {
        return this.showDelimiter;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDelimiterLocalized() {
        return this.delimiterLocalized;
    }

    /* renamed from: component8, reason: from getter */
    public final CustomKeyConfig getBackspaceOverride() {
        return this.backspaceOverride;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getButtonPositionTop() {
        return this.buttonPositionTop;
    }

    public final BentoNumpadState copy(StringResource buttonText, boolean isNumpadEnabled, boolean isButtonEnabled, boolean isButtonVisible, boolean isButtonLoading, boolean showDelimiter, boolean delimiterLocalized, CustomKeyConfig backspaceOverride, boolean buttonPositionTop) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new BentoNumpadState(buttonText, isNumpadEnabled, isButtonEnabled, isButtonVisible, isButtonLoading, showDelimiter, delimiterLocalized, backspaceOverride, buttonPositionTop);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoNumpadState)) {
            return false;
        }
        BentoNumpadState bentoNumpadState = (BentoNumpadState) other;
        return Intrinsics.areEqual(this.buttonText, bentoNumpadState.buttonText) && this.isNumpadEnabled == bentoNumpadState.isNumpadEnabled && this.isButtonEnabled == bentoNumpadState.isButtonEnabled && this.isButtonVisible == bentoNumpadState.isButtonVisible && this.isButtonLoading == bentoNumpadState.isButtonLoading && this.showDelimiter == bentoNumpadState.showDelimiter && this.delimiterLocalized == bentoNumpadState.delimiterLocalized && Intrinsics.areEqual(this.backspaceOverride, bentoNumpadState.backspaceOverride) && this.buttonPositionTop == bentoNumpadState.buttonPositionTop;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.buttonText.hashCode() * 31) + Boolean.hashCode(this.isNumpadEnabled)) * 31) + Boolean.hashCode(this.isButtonEnabled)) * 31) + Boolean.hashCode(this.isButtonVisible)) * 31) + Boolean.hashCode(this.isButtonLoading)) * 31) + Boolean.hashCode(this.showDelimiter)) * 31) + Boolean.hashCode(this.delimiterLocalized)) * 31;
        CustomKeyConfig customKeyConfig = this.backspaceOverride;
        return ((iHashCode + (customKeyConfig == null ? 0 : customKeyConfig.hashCode())) * 31) + Boolean.hashCode(this.buttonPositionTop);
    }

    public String toString() {
        return "BentoNumpadState(buttonText=" + this.buttonText + ", isNumpadEnabled=" + this.isNumpadEnabled + ", isButtonEnabled=" + this.isButtonEnabled + ", isButtonVisible=" + this.isButtonVisible + ", isButtonLoading=" + this.isButtonLoading + ", showDelimiter=" + this.showDelimiter + ", delimiterLocalized=" + this.delimiterLocalized + ", backspaceOverride=" + this.backspaceOverride + ", buttonPositionTop=" + this.buttonPositionTop + ")";
    }

    public BentoNumpadState(StringResource buttonText, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CustomKeyConfig customKeyConfig, boolean z7) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.buttonText = buttonText;
        this.isNumpadEnabled = z;
        this.isButtonEnabled = z2;
        this.isButtonVisible = z3;
        this.isButtonLoading = z4;
        this.showDelimiter = z5;
        this.delimiterLocalized = z6;
        this.backspaceOverride = customKeyConfig;
        this.buttonPositionTop = z7;
    }

    public /* synthetic */ BentoNumpadState(StringResource stringResource, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CustomKeyConfig customKeyConfig, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? null : customKeyConfig, (i & 256) != 0 ? true : z7);
    }

    public final StringResource getButtonText() {
        return this.buttonText;
    }

    public final boolean isNumpadEnabled() {
        return this.isNumpadEnabled;
    }

    public final boolean isButtonEnabled() {
        return this.isButtonEnabled;
    }

    public final boolean isButtonVisible() {
        return this.isButtonVisible;
    }

    public final boolean isButtonLoading() {
        return this.isButtonLoading;
    }

    public final boolean getShowDelimiter() {
        return this.showDelimiter;
    }

    public final boolean getDelimiterLocalized() {
        return this.delimiterLocalized;
    }

    public final CustomKeyConfig getBackspaceOverride() {
        return this.backspaceOverride;
    }

    public final boolean getButtonPositionTop() {
        return this.buttonPositionTop;
    }
}
