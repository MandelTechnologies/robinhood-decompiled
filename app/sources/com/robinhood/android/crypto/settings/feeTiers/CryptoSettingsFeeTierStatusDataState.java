package com.robinhood.android.crypto.settings.feeTiers;

import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider2;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary;
import com.robinhood.shared.crypto.p375ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerText;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoSettingsFeeTierStatusDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusDataState;", "", "feeTierPreferences", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;", "<init>", "(Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;)V", "getFeeTierPreferences", "()Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;", "feeTierSummary", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "getFeeTierSummary", "()Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "expirationWarningBannerText", "Lcom/robinhood/utils/resource/StringResource;", "getExpirationWarningBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoSettingsFeeTierStatusDataState {
    public static final int $stable = 8;
    private final CryptoFeeTierPreferencesProvider2 feeTierPreferences;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoSettingsFeeTierStatusDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoSettingsFeeTierStatusDataState copy$default(CryptoSettingsFeeTierStatusDataState cryptoSettingsFeeTierStatusDataState, CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoFeeTierPreferencesProvider2 = cryptoSettingsFeeTierStatusDataState.feeTierPreferences;
        }
        return cryptoSettingsFeeTierStatusDataState.copy(cryptoFeeTierPreferencesProvider2);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoFeeTierPreferencesProvider2 getFeeTierPreferences() {
        return this.feeTierPreferences;
    }

    public final CryptoSettingsFeeTierStatusDataState copy(CryptoFeeTierPreferencesProvider2 feeTierPreferences) {
        return new CryptoSettingsFeeTierStatusDataState(feeTierPreferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoSettingsFeeTierStatusDataState) && Intrinsics.areEqual(this.feeTierPreferences, ((CryptoSettingsFeeTierStatusDataState) other).feeTierPreferences);
    }

    public int hashCode() {
        CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2 = this.feeTierPreferences;
        if (cryptoFeeTierPreferencesProvider2 == null) {
            return 0;
        }
        return cryptoFeeTierPreferencesProvider2.hashCode();
    }

    public String toString() {
        return "CryptoSettingsFeeTierStatusDataState(feeTierPreferences=" + this.feeTierPreferences + ")";
    }

    public CryptoSettingsFeeTierStatusDataState(CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2) {
        this.feeTierPreferences = cryptoFeeTierPreferencesProvider2;
    }

    public /* synthetic */ CryptoSettingsFeeTierStatusDataState(CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoFeeTierPreferencesProvider2);
    }

    public final CryptoFeeTierPreferencesProvider2 getFeeTierPreferences() {
        return this.feeTierPreferences;
    }

    public final CryptoFeeTierSummary getFeeTierSummary() {
        CryptoFeeTierSummary.Companion companion = CryptoFeeTierSummary.INSTANCE;
        CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2 = this.feeTierPreferences;
        Intrinsics.checkNotNull(cryptoFeeTierPreferencesProvider2, "null cannot be cast to non-null type com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferences.Enabled");
        return companion.from(((CryptoFeeTierPreferencesProvider2.Enabled) cryptoFeeTierPreferencesProvider2).getFeeTierInfo());
    }

    public final StringResource getExpirationWarningBannerText() {
        CryptoFeeTierInfo feeTierInfo;
        CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2 = this.feeTierPreferences;
        CryptoFeeTierPreferencesProvider2.Enabled enabled = cryptoFeeTierPreferencesProvider2 instanceof CryptoFeeTierPreferencesProvider2.Enabled ? (CryptoFeeTierPreferencesProvider2.Enabled) cryptoFeeTierPreferencesProvider2 : null;
        if (enabled == null || (feeTierInfo = enabled.getFeeTierInfo()) == null) {
            return null;
        }
        return CryptoFeeTierExpirationWarningBannerText.getFeeTierExpirationWarningBannerText(feeTierInfo);
    }
}
