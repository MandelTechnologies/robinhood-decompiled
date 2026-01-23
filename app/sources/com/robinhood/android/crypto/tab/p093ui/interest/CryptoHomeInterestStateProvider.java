package com.robinhood.android.crypto.tab.p093ui.interest;

import com.robinhood.android.crypto.tab.p093ui.interest.CryptoHomeInterestViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeInterestStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestDataState;", "Lcom/robinhood/android/crypto/tab/ui/interest/CryptoHomeInterestViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeInterestStateProvider implements StateProvider<CryptoHomeInterestDataState, CryptoHomeInterestViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoHomeInterestViewState reduce(CryptoHomeInterestDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isEnrolled()) {
            StringResource title = dataState.getTitle();
            Iterable dataRows = dataState.getDataRows();
            if (dataRows == null) {
                dataRows = CollectionsKt.emptyList();
            }
            return new CryptoHomeInterestViewState.Enrolled(title, extensions2.toPersistentList(dataRows), dataState.getApyBadge(), dataState.getCtaText(), dataState.getCtaDeeplink(), dataState.getProtectedAmountValue(), dataState.getSettingsDeeplink(), dataState.getFeeDisclaimer());
        }
        if (dataState.isPreEnrollment()) {
            return new CryptoHomeInterestViewState.PreEnrollment(dataState.getTitle(), dataState.getSubtitle(), dataState.getCtaText(), dataState.getCtaDeeplink(), dataState.getSettingsDeeplink(), dataState.getFeeDisclaimer());
        }
        return CryptoHomeInterestViewState.Loading.INSTANCE;
    }
}
