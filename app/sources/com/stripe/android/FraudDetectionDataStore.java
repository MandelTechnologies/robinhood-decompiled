package com.stripe.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: FraudDetectionDataStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/FraudDetectionDataStore;", "", "get", "Lcom/stripe/android/networking/FraudDetectionData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "", "fraudDetectionData", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface FraudDetectionDataStore {
    Object get(Continuation<? super FraudDetectionData> continuation);

    void save(FraudDetectionData fraudDetectionData);
}
