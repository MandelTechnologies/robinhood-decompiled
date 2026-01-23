package com.stripe.android;

import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: FraudDetectionDataRepository.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/FraudDetectionDataRepository;", "", "", "refresh", "()V", "Lcom/stripe/android/networking/FraudDetectionData;", "getCached", "()Lcom/stripe/android/networking/FraudDetectionData;", "getLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface FraudDetectionDataRepository {
    FraudDetectionData getCached();

    Object getLatest(Continuation<? super FraudDetectionData> continuation);

    void refresh();
}
