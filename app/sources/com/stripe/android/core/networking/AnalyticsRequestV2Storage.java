package com.stripe.android.core.networking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AnalyticsRequestV2Storage.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;", "", "", "id", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "retrieve", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface AnalyticsRequestV2Storage {
    Object retrieve(String str, Continuation<? super AnalyticsRequestV2> continuation);
}
