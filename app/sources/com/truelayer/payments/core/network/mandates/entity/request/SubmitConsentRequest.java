package com.truelayer.payments.core.network.mandates.entity.request;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;

/* compiled from: SubmitConsentRequest.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/core/network/mandates/entity/request/SubmitConsentRequest;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class SubmitConsentRequest {
    public static final SubmitConsentRequest INSTANCE = new SubmitConsentRequest();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.mandates.entity.request.SubmitConsentRequest.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new ObjectSerializer("com.truelayer.payments.core.network.mandates.entity.request.SubmitConsentRequest", SubmitConsentRequest.INSTANCE, new Annotation[0]);
        }
    });

    private SubmitConsentRequest() {
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return $cachedSerializer$delegate.getValue();
    }

    public final KSerializer<SubmitConsentRequest> serializer() {
        return get$cachedSerializer();
    }
}
