package com.truelayer.payments.core.network.experience.entity.response;

import com.truelayer.payments.core.domain.experience.scheme.SchemeSelection;
import com.truelayer.payments.core.domain.utils.IntoDomain;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SchemeSelectionResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fHÇ\u0001\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionResponse;", "Lcom/truelayer/payments/core/domain/utils/IntoDomain;", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelection;", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lcom/truelayer/payments/core/network/experience/entity/response/SchemeAutoSubmit;", "Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionSelect;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public abstract class SchemeSelectionResponse implements IntoDomain<SchemeSelection> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.experience.entity.response.SchemeSelectionResponse.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("com.truelayer.payments.core.network.experience.entity.response.SchemeSelectionResponse", Reflection.getOrCreateKotlinClass(SchemeSelectionResponse.class), new KClass[]{Reflection.getOrCreateKotlinClass(SchemeAutoSubmit.class), Reflection.getOrCreateKotlinClass(SchemeSelectionSelect.class)}, new KSerializer[]{SchemeSelectionResponse5.INSTANCE, SchemeSelectionResponse7.INSTANCE}, new Annotation[0]);
        }
    });

    public /* synthetic */ SchemeSelectionResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(SchemeSelectionResponse self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: SchemeSelectionResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/experience/entity/response/SchemeSelectionResponse;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SchemeSelectionResponse.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SchemeSelectionResponse> serializer() {
            return get$cachedSerializer();
        }
    }

    private SchemeSelectionResponse() {
    }

    @Deprecated
    public /* synthetic */ SchemeSelectionResponse(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
