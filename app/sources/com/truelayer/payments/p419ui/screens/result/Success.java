package com.truelayer.payments.p419ui.screens.result;

import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.payments.PaymentProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultScreen.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/result/Success;", "Lcom/truelayer/payments/ui/screens/result/ResultScreen;", "reference", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "amountInMinor", "", "clientName", "provider", "Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "type", "Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;JLjava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentProvider;Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;)V", "getAmountInMinor", "()J", "getClientName", "()Ljava/lang/String;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "getProvider", "()Lcom/truelayer/payments/core/domain/payments/PaymentProvider;", "getReference", "getType", "()Lcom/truelayer/payments/ui/screens/result/ResultPaymentType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Success implements ResultScreen {
    public static final int $stable = 8;
    private final long amountInMinor;
    private final String clientName;
    private final Currency currency;
    private final PaymentProvider provider;
    private final String reference;
    private final ResultScreen8 type;

    public static /* synthetic */ Success copy$default(Success success, String str, Currency currency, long j, String str2, PaymentProvider paymentProvider, ResultScreen8 resultScreen8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = success.reference;
        }
        if ((i & 2) != 0) {
            currency = success.currency;
        }
        if ((i & 4) != 0) {
            j = success.amountInMinor;
        }
        if ((i & 8) != 0) {
            str2 = success.clientName;
        }
        if ((i & 16) != 0) {
            paymentProvider = success.provider;
        }
        if ((i & 32) != 0) {
            resultScreen8 = success.type;
        }
        ResultScreen8 resultScreen82 = resultScreen8;
        String str3 = str2;
        long j2 = j;
        return success.copy(str, currency, j2, str3, paymentProvider, resultScreen82);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* renamed from: component2, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final long getAmountInMinor() {
        return this.amountInMinor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    /* renamed from: component5, reason: from getter */
    public final PaymentProvider getProvider() {
        return this.provider;
    }

    /* renamed from: component6, reason: from getter */
    public final ResultScreen8 getType() {
        return this.type;
    }

    public final Success copy(String reference, Currency currency, long amountInMinor, String clientName, PaymentProvider provider, ResultScreen8 type2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new Success(reference, currency, amountInMinor, clientName, provider, type2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Success)) {
            return false;
        }
        Success success = (Success) other;
        return Intrinsics.areEqual(this.reference, success.reference) && Intrinsics.areEqual(this.currency, success.currency) && this.amountInMinor == success.amountInMinor && Intrinsics.areEqual(this.clientName, success.clientName) && Intrinsics.areEqual(this.provider, success.provider) && this.type == success.type;
    }

    public int hashCode() {
        String str = this.reference;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.currency.hashCode()) * 31) + Long.hashCode(this.amountInMinor)) * 31) + this.clientName.hashCode()) * 31) + this.provider.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Success(reference=" + this.reference + ", currency=" + this.currency + ", amountInMinor=" + this.amountInMinor + ", clientName=" + this.clientName + ", provider=" + this.provider + ", type=" + this.type + ")";
    }

    public Success(String str, Currency currency, long j, String clientName, PaymentProvider provider, ResultScreen8 type2) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.reference = str;
        this.currency = currency;
        this.amountInMinor = j;
        this.clientName = clientName;
        this.provider = provider;
        this.type = type2;
    }

    public final String getReference() {
        return this.reference;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final long getAmountInMinor() {
        return this.amountInMinor;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final PaymentProvider getProvider() {
        return this.provider;
    }

    public final ResultScreen8 getType() {
        return this.type;
    }
}
