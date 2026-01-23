package com.robinhood.shared.crypto.p375ui.trade.view;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderAnimatedBentoNumpad.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "", "isVisible", "", "delimiterLocalized", "showDelimiter", "backspaceOverrideText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ZZZLcom/robinhood/utils/resource/StringResource;)V", "()Z", "getDelimiterLocalized", "getShowDelimiter", "getBackspaceOverrideText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderAnimatedBentoNumpadState {
    public static final int $stable = StringResource.$stable;
    private final StringResource backspaceOverrideText;
    private final boolean delimiterLocalized;
    private final boolean isVisible;
    private final boolean showDelimiter;

    public static /* synthetic */ CryptoOrderAnimatedBentoNumpadState copy$default(CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState, boolean z, boolean z2, boolean z3, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoOrderAnimatedBentoNumpadState.isVisible;
        }
        if ((i & 2) != 0) {
            z2 = cryptoOrderAnimatedBentoNumpadState.delimiterLocalized;
        }
        if ((i & 4) != 0) {
            z3 = cryptoOrderAnimatedBentoNumpadState.showDelimiter;
        }
        if ((i & 8) != 0) {
            stringResource = cryptoOrderAnimatedBentoNumpadState.backspaceOverrideText;
        }
        return cryptoOrderAnimatedBentoNumpadState.copy(z, z2, z3, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDelimiterLocalized() {
        return this.delimiterLocalized;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowDelimiter() {
        return this.showDelimiter;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getBackspaceOverrideText() {
        return this.backspaceOverrideText;
    }

    public final CryptoOrderAnimatedBentoNumpadState copy(boolean isVisible, boolean delimiterLocalized, boolean showDelimiter, StringResource backspaceOverrideText) {
        return new CryptoOrderAnimatedBentoNumpadState(isVisible, delimiterLocalized, showDelimiter, backspaceOverrideText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderAnimatedBentoNumpadState)) {
            return false;
        }
        CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState = (CryptoOrderAnimatedBentoNumpadState) other;
        return this.isVisible == cryptoOrderAnimatedBentoNumpadState.isVisible && this.delimiterLocalized == cryptoOrderAnimatedBentoNumpadState.delimiterLocalized && this.showDelimiter == cryptoOrderAnimatedBentoNumpadState.showDelimiter && Intrinsics.areEqual(this.backspaceOverrideText, cryptoOrderAnimatedBentoNumpadState.backspaceOverrideText);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isVisible) * 31) + Boolean.hashCode(this.delimiterLocalized)) * 31) + Boolean.hashCode(this.showDelimiter)) * 31;
        StringResource stringResource = this.backspaceOverrideText;
        return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
    }

    public String toString() {
        return "CryptoOrderAnimatedBentoNumpadState(isVisible=" + this.isVisible + ", delimiterLocalized=" + this.delimiterLocalized + ", showDelimiter=" + this.showDelimiter + ", backspaceOverrideText=" + this.backspaceOverrideText + ")";
    }

    public CryptoOrderAnimatedBentoNumpadState(boolean z, boolean z2, boolean z3, StringResource stringResource) {
        this.isVisible = z;
        this.delimiterLocalized = z2;
        this.showDelimiter = z3;
        this.backspaceOverrideText = stringResource;
    }

    public /* synthetic */ CryptoOrderAnimatedBentoNumpadState(boolean z, boolean z2, boolean z3, StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? null : stringResource);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final boolean getDelimiterLocalized() {
        return this.delimiterLocalized;
    }

    public final boolean getShowDelimiter() {
        return this.showDelimiter;
    }

    public final StringResource getBackspaceOverrideText() {
        return this.backspaceOverrideText;
    }
}
