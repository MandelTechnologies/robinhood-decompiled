package com.truelayer.payments.core.network.payments.entity.shared;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.Serializable;

/* compiled from: PaymentMethod.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "", "beneficiary", "Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "getBeneficiary", "()Lcom/truelayer/payments/core/network/payments/entity/shared/Beneficiary;", "providerSelection", "Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "getProviderSelection", "()Lcom/truelayer/payments/core/network/payments/entity/shared/ProviderSelection;", "paymentReference", "", "Companion", "Lcom/truelayer/payments/core/network/payments/entity/shared/BankTransfer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/Mandate;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes6.dex */
public interface PaymentMethod {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Beneficiary getBeneficiary();

    ProviderSelection getProviderSelection();

    String paymentReference();

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/truelayer/payments/core/network/payments/entity/shared/PaymentMethod;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<PaymentMethod> serializer() {
            return new SealedSerializer("com.truelayer.payments.core.network.payments.entity.shared.PaymentMethod", Reflection.getOrCreateKotlinClass(PaymentMethod.class), new KClass[]{Reflection.getOrCreateKotlinClass(BankTransfer.class), Reflection.getOrCreateKotlinClass(Mandate.class)}, new KSerializer[]{PaymentMethod3.INSTANCE, PaymentMethod5.INSTANCE}, new Annotation[0]);
        }
    }
}
