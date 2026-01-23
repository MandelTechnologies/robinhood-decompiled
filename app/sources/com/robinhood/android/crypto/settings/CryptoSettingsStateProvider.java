package com.robinhood.android.crypto.settings;

import androidx.paging.PagedList;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoSettingsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/CryptoSettingsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDataState;", "Lcom/robinhood/android/crypto/settings/CryptoSettingsViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoSettingsStateProvider implements StateProvider<CryptoSettingsDataState, CryptoSettingsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoSettingsViewState reduce(CryptoSettingsDataState dataState) {
        List listTake;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems = dataState.getHistoryItems();
        return new CryptoSettingsViewState((historyItems == null || (listTake = CollectionsKt.take(historyItems, 5)) == null) ? null : extensions2.toImmutableList(listTake), dataState.isActivateTransferButtonVisible(), dataState.getReceivingCryptoTitle(), dataState.getReceivingCryptoRowStatus(), dataState.getSendingStatusTitle(), dataState.getSendingCryptoRowStatus(), StringsKt.nullIfEmpty(dataState.getSendingCryptoRowDescription()), dataState.isUserEligibleForHigherLimit(), dataState.isVolumeTiersDiscoveryExperimentEnabled(), dataState.getAllowlistToggleState());
    }
}
