package com.robinhood.android.crypto.settings.feeTiers;

import com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoSettingsFeeTierStatusDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusDataState;", "Lcom/robinhood/android/crypto/settings/feeTiers/CryptoSettingsFeeTierStatusViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.settings.feeTiers.CryptoSettingsFeeTierStatusStateProvider, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoSettingsFeeTierStatusDuxo2 implements StateProvider<CryptoSettingsFeeTierStatusDataState, CryptoSettingsFeeTierStatusViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoSettingsFeeTierStatusViewState reduce(CryptoSettingsFeeTierStatusDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CryptoFeeTierPreferencesProvider2 feeTierPreferences = dataState.getFeeTierPreferences();
        if (feeTierPreferences instanceof CryptoFeeTierPreferencesProvider2.Enabled) {
            return new CryptoSettingsFeeTierStatusViewState.Enabled(dataState.getFeeTierSummary(), dataState.getExpirationWarningBannerText());
        }
        if (feeTierPreferences instanceof CryptoFeeTierPreferencesProvider2.Disabled) {
            return CryptoSettingsFeeTierStatusViewState.Disabled.INSTANCE;
        }
        if (!Intrinsics.areEqual(feeTierPreferences, CryptoFeeTierPreferencesProvider2.Ineligible.INSTANCE) && feeTierPreferences != null) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoSettingsFeeTierStatusViewState.Hide.INSTANCE;
    }
}
