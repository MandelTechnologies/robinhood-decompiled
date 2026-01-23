package com.truelayer.payments.p419ui.screens.result;

import com.robinhood.models.card.p311db.Card;
import com.truelayer.payments.core.domain.payments.MerchantConfig;
import com.truelayer.payments.core.domain.payments.Payment;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.p419ui.models.PaymentContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/result/ResultContext;", "", "id", "", "waitTimeMillis", "", "isReactNative", "", "integrationVersion", "paymentContext", "Lcom/truelayer/payments/ui/models/PaymentContext;", Card.Icon.PAYMENT, "Lcom/truelayer/payments/core/domain/payments/Payment;", "merchantConfig", "Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "paymentProvider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "(Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/truelayer/payments/ui/models/PaymentContext;Lcom/truelayer/payments/core/domain/payments/Payment;Lcom/truelayer/payments/core/domain/payments/MerchantConfig;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;)V", "getId", "()Ljava/lang/String;", "getIntegrationVersion", "()Z", "getMerchantConfig", "()Lcom/truelayer/payments/core/domain/payments/MerchantConfig;", "getPayment", "()Lcom/truelayer/payments/core/domain/payments/Payment;", "getPaymentContext", "()Lcom/truelayer/payments/ui/models/PaymentContext;", "getPaymentProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getWaitTimeMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ResultContext {
    public static final int $stable = 8;
    private final String id;
    private final String integrationVersion;
    private final boolean isReactNative;
    private final MerchantConfig merchantConfig;
    private final Payment payment;
    private final PaymentContext paymentContext;
    private final PaymentProvider paymentProvider;
    private final Long waitTimeMillis;

    public ResultContext(String id, Long l, boolean z, String str, PaymentContext paymentContext, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(paymentContext, "paymentContext");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(merchantConfig, "merchantConfig");
        this.id = id;
        this.waitTimeMillis = l;
        this.isReactNative = z;
        this.integrationVersion = str;
        this.paymentContext = paymentContext;
        this.payment = payment;
        this.merchantConfig = merchantConfig;
        this.paymentProvider = paymentProvider;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ ResultContext(String str, Long l, boolean z, String str2, PaymentContext paymentContext, Payment payment, MerchantConfig merchantConfig, PaymentProvider paymentProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 3000L : l, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, paymentContext, payment, merchantConfig, paymentProvider);
    }

    public final Long getWaitTimeMillis() {
        return this.waitTimeMillis;
    }

    /* renamed from: isReactNative, reason: from getter */
    public final boolean getIsReactNative() {
        return this.isReactNative;
    }

    public final String getIntegrationVersion() {
        return this.integrationVersion;
    }

    public final PaymentContext getPaymentContext() {
        return this.paymentContext;
    }

    public final Payment getPayment() {
        return this.payment;
    }

    public final MerchantConfig getMerchantConfig() {
        return this.merchantConfig;
    }

    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }
}
