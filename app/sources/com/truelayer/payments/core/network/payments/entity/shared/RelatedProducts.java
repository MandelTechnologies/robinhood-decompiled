package com.truelayer.payments.core.network.payments.entity.shared;

import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: RelatedProducts.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001e\u001f B%\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÁ\u0001¢\u0006\u0002\b\u001dR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "", "seen1", "", "signupPlus", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts$SignupPlus;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts$SignupPlus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts$SignupPlus;)V", "getSignupPlus$annotations", "()V", "getSignupPlus", "()Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts$SignupPlus;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$payments_core_release", "$serializer", "Companion", "SignupPlus", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class RelatedProducts {
    private final SignupPlus signupPlus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ObjectSerializer("com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts.SignupPlus", SignupPlus.INSTANCE, new Annotation[0])};

    /* JADX WARN: Multi-variable type inference failed */
    public RelatedProducts() {
        this((SignupPlus) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ RelatedProducts copy$default(RelatedProducts relatedProducts, SignupPlus signupPlus, int i, Object obj) {
        if ((i & 1) != 0) {
            signupPlus = relatedProducts.signupPlus;
        }
        return relatedProducts.copy(signupPlus);
    }

    @SerialName("signup_plus")
    public static /* synthetic */ void getSignupPlus$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final SignupPlus getSignupPlus() {
        return this.signupPlus;
    }

    public final RelatedProducts copy(SignupPlus signupPlus) {
        return new RelatedProducts(signupPlus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RelatedProducts) && Intrinsics.areEqual(this.signupPlus, ((RelatedProducts) other).signupPlus);
    }

    public int hashCode() {
        SignupPlus signupPlus = this.signupPlus;
        if (signupPlus == null) {
            return 0;
        }
        return signupPlus.hashCode();
    }

    public String toString() {
        return "RelatedProducts(signupPlus=" + this.signupPlus + ")";
    }

    /* compiled from: RelatedProducts.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RelatedProducts> serializer() {
            return RelatedProducts2.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ RelatedProducts(int i, @SerialName("signup_plus") SignupPlus signupPlus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.signupPlus = null;
        } else {
            this.signupPlus = signupPlus;
        }
    }

    public RelatedProducts(SignupPlus signupPlus) {
        this.signupPlus = signupPlus;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$payments_core_release(RelatedProducts self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.signupPlus == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, kSerializerArr[0], self.signupPlus);
    }

    public /* synthetic */ RelatedProducts(SignupPlus signupPlus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : signupPlus);
    }

    public final SignupPlus getSignupPlus() {
        return this.signupPlus;
    }

    /* compiled from: RelatedProducts.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/RelatedProducts$SignupPlus;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @Serializable
    public static final class SignupPlus {
        public static final SignupPlus INSTANCE = new SignupPlus();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts.SignupPlus.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return new ObjectSerializer("com.truelayer.payments.core.network.payments.entity.shared.RelatedProducts.SignupPlus", SignupPlus.INSTANCE, new Annotation[0]);
            }
        });

        private SignupPlus() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SignupPlus> serializer() {
            return get$cachedSerializer();
        }
    }
}
