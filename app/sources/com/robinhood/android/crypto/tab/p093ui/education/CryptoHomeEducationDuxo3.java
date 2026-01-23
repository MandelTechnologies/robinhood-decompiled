package com.robinhood.android.crypto.tab.p093ui.education;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeEducationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDataState;", "Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.education.CryptoHomeEducationStateProvider, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeEducationDuxo3 implements StateProvider<CryptoHomeEducationDataState, CryptoHomeEducationViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoHomeEducationViewState reduce(CryptoHomeEducationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new CryptoHomeEducationViewState(extensions2.toImmutableList(dataState.getEducationLessonPreviews$feature_crypto_tab_externalDebug()), dataState.isContentVisible());
    }
}
