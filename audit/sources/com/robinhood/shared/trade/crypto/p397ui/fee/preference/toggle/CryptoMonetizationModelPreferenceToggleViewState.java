package com.robinhood.shared.trade.crypto.p397ui.fee.preference.toggle;

import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;

/* compiled from: CryptoMonetizationModelPreferenceToggleViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/preference/toggle/CryptoMonetizationModelPreferenceToggleViewState;", "", "isToggleChecked", "", "isToggleLoading", "<init>", "(ZZ)V", "()Z", "volumeTierPrimaryText", "Lcom/robinhood/utils/resource/StringResource;", "getVolumeTierPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "volumeTierSecondaryText", "getVolumeTierSecondaryText", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoMonetizationModelPreferenceToggleViewState {
    public static final int $stable = 0;
    private final boolean isToggleChecked;
    private final boolean isToggleLoading;

    public static /* synthetic */ CryptoMonetizationModelPreferenceToggleViewState copy$default(CryptoMonetizationModelPreferenceToggleViewState cryptoMonetizationModelPreferenceToggleViewState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoMonetizationModelPreferenceToggleViewState.isToggleChecked;
        }
        if ((i & 2) != 0) {
            z2 = cryptoMonetizationModelPreferenceToggleViewState.isToggleLoading;
        }
        return cryptoMonetizationModelPreferenceToggleViewState.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsToggleChecked() {
        return this.isToggleChecked;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsToggleLoading() {
        return this.isToggleLoading;
    }

    public final CryptoMonetizationModelPreferenceToggleViewState copy(boolean isToggleChecked, boolean isToggleLoading) {
        return new CryptoMonetizationModelPreferenceToggleViewState(isToggleChecked, isToggleLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoMonetizationModelPreferenceToggleViewState)) {
            return false;
        }
        CryptoMonetizationModelPreferenceToggleViewState cryptoMonetizationModelPreferenceToggleViewState = (CryptoMonetizationModelPreferenceToggleViewState) other;
        return this.isToggleChecked == cryptoMonetizationModelPreferenceToggleViewState.isToggleChecked && this.isToggleLoading == cryptoMonetizationModelPreferenceToggleViewState.isToggleLoading;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isToggleChecked) * 31) + Boolean.hashCode(this.isToggleLoading);
    }

    public String toString() {
        return "CryptoMonetizationModelPreferenceToggleViewState(isToggleChecked=" + this.isToggleChecked + ", isToggleLoading=" + this.isToggleLoading + ")";
    }

    public CryptoMonetizationModelPreferenceToggleViewState(boolean z, boolean z2) {
        this.isToggleChecked = z;
        this.isToggleLoading = z2;
    }

    public final boolean isToggleChecked() {
        return this.isToggleChecked;
    }

    public final boolean isToggleLoading() {
        return this.isToggleLoading;
    }

    public final StringResource getVolumeTierPrimaryText() {
        if (this.isToggleChecked) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_monetization_model_preference_toggle_title_on, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C40095R.string.crypto_monetization_model_preference_toggle_title_off, new Object[0]);
    }

    public final StringResource getVolumeTierSecondaryText() {
        if (this.isToggleChecked) {
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_monetization_model_preference_toggle_text_on, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C40095R.string.crypto_monetization_model_preference_toggle_text_off, new Object[0]);
    }
}
