package com.robinhood.android.crypto.p094ui.detail.analystratings;

import com.robinhood.shared.equities.instrumentdetail.p378ui.AnalystRatingsComposableState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAnalystRatingsDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/analystratings/CryptoAnalystRatingsViewState;", "", "closeButtonText", "Lcom/robinhood/utils/resource/StringResource;", "headerText", "isVisible", "", "state", "Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;)V", "getCloseButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "getHeaderText", "()Z", "getState", "()Lcom/robinhood/shared/equities/instrumentdetail/ui/AnalystRatingsComposableState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoAnalystRatingsViewState {
    public static final int $stable;
    private final StringResource closeButtonText;
    private final StringResource headerText;
    private final boolean isVisible;
    private final AnalystRatingsComposableState state;

    static {
        int i = AnalystRatingsComposableState.$stable;
        int i2 = StringResource.$stable;
        $stable = i | i2 | i2;
    }

    public static /* synthetic */ CryptoAnalystRatingsViewState copy$default(CryptoAnalystRatingsViewState cryptoAnalystRatingsViewState, StringResource stringResource, StringResource stringResource2, boolean z, AnalystRatingsComposableState analystRatingsComposableState, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoAnalystRatingsViewState.closeButtonText;
        }
        if ((i & 2) != 0) {
            stringResource2 = cryptoAnalystRatingsViewState.headerText;
        }
        if ((i & 4) != 0) {
            z = cryptoAnalystRatingsViewState.isVisible;
        }
        if ((i & 8) != 0) {
            analystRatingsComposableState = cryptoAnalystRatingsViewState.state;
        }
        return cryptoAnalystRatingsViewState.copy(stringResource, stringResource2, z, analystRatingsComposableState);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getCloseButtonText() {
        return this.closeButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final AnalystRatingsComposableState getState() {
        return this.state;
    }

    public final CryptoAnalystRatingsViewState copy(StringResource closeButtonText, StringResource headerText, boolean isVisible, AnalystRatingsComposableState state) {
        Intrinsics.checkNotNullParameter(closeButtonText, "closeButtonText");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(state, "state");
        return new CryptoAnalystRatingsViewState(closeButtonText, headerText, isVisible, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoAnalystRatingsViewState)) {
            return false;
        }
        CryptoAnalystRatingsViewState cryptoAnalystRatingsViewState = (CryptoAnalystRatingsViewState) other;
        return Intrinsics.areEqual(this.closeButtonText, cryptoAnalystRatingsViewState.closeButtonText) && Intrinsics.areEqual(this.headerText, cryptoAnalystRatingsViewState.headerText) && this.isVisible == cryptoAnalystRatingsViewState.isVisible && Intrinsics.areEqual(this.state, cryptoAnalystRatingsViewState.state);
    }

    public int hashCode() {
        return (((((this.closeButtonText.hashCode() * 31) + this.headerText.hashCode()) * 31) + Boolean.hashCode(this.isVisible)) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "CryptoAnalystRatingsViewState(closeButtonText=" + this.closeButtonText + ", headerText=" + this.headerText + ", isVisible=" + this.isVisible + ", state=" + this.state + ")";
    }

    public CryptoAnalystRatingsViewState(StringResource closeButtonText, StringResource headerText, boolean z, AnalystRatingsComposableState state) {
        Intrinsics.checkNotNullParameter(closeButtonText, "closeButtonText");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(state, "state");
        this.closeButtonText = closeButtonText;
        this.headerText = headerText;
        this.isVisible = z;
        this.state = state;
    }

    public final StringResource getCloseButtonText() {
        return this.closeButtonText;
    }

    public final StringResource getHeaderText() {
        return this.headerText;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final AnalystRatingsComposableState getState() {
        return this.state;
    }
}
