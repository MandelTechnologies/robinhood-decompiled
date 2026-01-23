package com.truelayer.payments.core.domain.payments;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.ProviderSelection;
import com.truelayer.payments.core.domain.payments.SchemeSelectionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Payment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 (2\u00020\u0001:\b%&'()*+,J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0005R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0001\u0007-./0\"12¨\u00063"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment;", "", "creditableAt", "", "getCreditableAt", "()Ljava/lang/String;", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "isProviderSelected", "", "()Z", "isSignupPlus", "isUserSelectedScheme", "paymentId", "getPaymentId", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "getPaymentMethod", "()Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "paymentReference", "getPaymentReference", "selectedProviderId", "getSelectedProviderId", "user", "Lcom/truelayer/payments/core/domain/payments/User;", "getUser", "()Lcom/truelayer/payments/core/domain/payments/User;", "copyWithAuthFlow", "authFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "copyWithPaymentMethod", "transitionToFailed", "Lcom/truelayer/payments/core/domain/payments/Payment$Failed;", "authorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse$AuthorizationFailed;", "AuthorizationRequired", "Authorized", "Authorizing", "Companion", "Executed", "Failed", "Revoked", "Settled", "Lcom/truelayer/payments/core/domain/payments/Payment$AuthorizationRequired;", "Lcom/truelayer/payments/core/domain/payments/Payment$Authorized;", "Lcom/truelayer/payments/core/domain/payments/Payment$Authorizing;", "Lcom/truelayer/payments/core/domain/payments/Payment$Executed;", "Lcom/truelayer/payments/core/domain/payments/Payment$Revoked;", "Lcom/truelayer/payments/core/domain/payments/Payment$Settled;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface Payment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Payment copyWithAuthFlow(AuthorizationFlow authFlow);

    Payment copyWithPaymentMethod(PaymentMethod paymentMethod);

    String getCreditableAt();

    Currency getCurrency();

    String getPaymentId();

    PaymentMethod getPaymentMethod();

    String getPaymentReference();

    String getSelectedProviderId();

    User getUser();

    boolean isProviderSelected();

    boolean isSignupPlus();

    boolean isUserSelectedScheme();

    Failed transitionToFailed(AuthorizationFlowResponse.AuthorizationFailed authorizationFlow);

    /* compiled from: Payment.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static boolean isProviderSelected(Payment payment) {
            if (payment.getPaymentMethod().getProviderSelection() instanceof ProviderSelection.PreSelected) {
                return true;
            }
            return (payment.getPaymentMethod().getProviderSelection() instanceof ProviderSelection.UserSelected) && payment.getPaymentMethod().getProviderSelection().getProviderId() != null;
        }

        public static String getSelectedProviderId(Payment payment) {
            return payment.getPaymentMethod().getProviderSelection().getProviderId();
        }

        public static boolean isUserSelectedScheme(Payment payment) {
            return payment.getPaymentMethod().getProviderSelection().getSchemeSelectionType() instanceof SchemeSelectionType.UserSelected;
        }

        public static Payment copyWithAuthFlow(Payment payment, AuthorizationFlow authFlow) {
            Intrinsics.checkNotNullParameter(authFlow, "authFlow");
            if (payment instanceof AuthorizationRequired) {
                return payment;
            }
            if (payment instanceof Authorizing) {
                return Authorizing.copy$default((Authorizing) payment, null, null, null, null, null, false, null, authFlow, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
            if (payment instanceof Authorized) {
                return Authorized.copy$default((Authorized) payment, null, null, null, null, null, false, null, authFlow, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
            if (payment instanceof Executed) {
                return Executed.copy$default((Executed) payment, null, null, null, null, null, false, null, authFlow, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
            if (payment instanceof Settled) {
                return Settled.copy$default((Settled) payment, null, null, null, null, null, false, null, authFlow, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
            if (payment instanceof Failed) {
                return Failed.copy$default((Failed) payment, null, null, null, null, null, null, false, null, authFlow, 255, null);
            }
            if (payment instanceof Revoked) {
                return payment;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static Failed transitionToFailed(Payment payment, AuthorizationFlowResponse.AuthorizationFailed authorizationFlow) {
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Failed(payment.getPaymentId(), payment.getCurrency(), payment.getPaymentMethod(), payment.getPaymentReference(), authorizationFlow.getFailureReason().intoPaymentFailureReason(), payment.getUser(), payment.isSignupPlus(), payment.getCreditableAt(), null);
        }
    }

    /* compiled from: Payment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment$AuthorizationRequired;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentId", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "paymentReference", "user", "Lcom/truelayer/payments/core/domain/payments/User;", "isSignupPlus", "", "creditableAt", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/payments/PaymentMethod;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/User;ZLjava/lang/String;)V", "getCreditableAt", "()Ljava/lang/String;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "()Z", "getPaymentId", "getPaymentMethod", "()Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "getPaymentReference", "getUser", "()Lcom/truelayer/payments/core/domain/payments/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "copyWithPaymentMethod", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AuthorizationRequired implements Payment {
        private final String creditableAt;
        private final Currency currency;
        private final boolean isSignupPlus;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final String paymentReference;
        private final User user;

        public static /* synthetic */ AuthorizationRequired copy$default(AuthorizationRequired authorizationRequired, String str, Currency currency, PaymentMethod paymentMethod, String str2, User user, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizationRequired.paymentId;
            }
            if ((i & 2) != 0) {
                currency = authorizationRequired.currency;
            }
            if ((i & 4) != 0) {
                paymentMethod = authorizationRequired.paymentMethod;
            }
            if ((i & 8) != 0) {
                str2 = authorizationRequired.paymentReference;
            }
            if ((i & 16) != 0) {
                user = authorizationRequired.user;
            }
            if ((i & 32) != 0) {
                z = authorizationRequired.isSignupPlus;
            }
            if ((i & 64) != 0) {
                str3 = authorizationRequired.creditableAt;
            }
            boolean z2 = z;
            String str4 = str3;
            User user2 = user;
            PaymentMethod paymentMethod2 = paymentMethod;
            return authorizationRequired.copy(str, currency, paymentMethod2, str2, user2, z2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component5, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSignupPlus() {
            return this.isSignupPlus;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        public final AuthorizationRequired copy(String paymentId, Currency currency, PaymentMethod paymentMethod, String paymentReference, User user, boolean isSignupPlus, String creditableAt) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new AuthorizationRequired(paymentId, currency, paymentMethod, paymentReference, user, isSignupPlus, creditableAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorizationRequired)) {
                return false;
            }
            AuthorizationRequired authorizationRequired = (AuthorizationRequired) other;
            return Intrinsics.areEqual(this.paymentId, authorizationRequired.paymentId) && Intrinsics.areEqual(this.currency, authorizationRequired.currency) && Intrinsics.areEqual(this.paymentMethod, authorizationRequired.paymentMethod) && Intrinsics.areEqual(this.paymentReference, authorizationRequired.paymentReference) && Intrinsics.areEqual(this.user, authorizationRequired.user) && this.isSignupPlus == authorizationRequired.isSignupPlus && Intrinsics.areEqual(this.creditableAt, authorizationRequired.creditableAt);
        }

        public int hashCode() {
            int iHashCode = ((((this.paymentId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus)) * 31;
            String str2 = this.creditableAt;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AuthorizationRequired(paymentId=" + this.paymentId + ", currency=" + this.currency + ", paymentMethod=" + this.paymentMethod + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", isSignupPlus=" + this.isSignupPlus + ", creditableAt=" + this.creditableAt + ")";
        }

        public AuthorizationRequired(String paymentId, Currency currency, PaymentMethod paymentMethod, String str, User user, boolean z, String str2) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentId = paymentId;
            this.currency = currency;
            this.paymentMethod = paymentMethod;
            this.paymentReference = str;
            this.user = user;
            this.isSignupPlus = z;
            this.creditableAt = str2;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithAuthFlow(AuthorizationFlow authorizationFlow) {
            return DefaultImpls.copyWithAuthFlow(this, authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getSelectedProviderId() {
            return DefaultImpls.getSelectedProviderId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isProviderSelected() {
            return DefaultImpls.isProviderSelected(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isUserSelectedScheme() {
            return DefaultImpls.isUserSelectedScheme(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Failed transitionToFailed(AuthorizationFlowResponse.AuthorizationFailed authorizationFailed) {
            return DefaultImpls.transitionToFailed(this, authorizationFailed);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Currency getCurrency() {
            return this.currency;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isSignupPlus() {
            return this.isSignupPlus;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getCreditableAt() {
            return this.creditableAt;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithPaymentMethod(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return copy$default(this, getPaymentId(), null, paymentMethod, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        }
    }

    /* compiled from: Payment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J_\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0010\u0010'\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment$Authorizing;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentId", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "paymentReference", "user", "Lcom/truelayer/payments/core/domain/payments/User;", "isSignupPlus", "", "creditableAt", "authorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/payments/PaymentMethod;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/User;ZLjava/lang/String;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;)V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "getCreditableAt", "()Ljava/lang/String;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "()Z", "getPaymentId", "getPaymentMethod", "()Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "getPaymentReference", "getUser", "()Lcom/truelayer/payments/core/domain/payments/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copyWithPaymentMethod", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Authorizing implements Payment {
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final Currency currency;
        private final boolean isSignupPlus;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final String paymentReference;
        private final User user;

        public static /* synthetic */ Authorizing copy$default(Authorizing authorizing, String str, Currency currency, PaymentMethod paymentMethod, String str2, User user, boolean z, String str3, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorizing.paymentId;
            }
            if ((i & 2) != 0) {
                currency = authorizing.currency;
            }
            if ((i & 4) != 0) {
                paymentMethod = authorizing.paymentMethod;
            }
            if ((i & 8) != 0) {
                str2 = authorizing.paymentReference;
            }
            if ((i & 16) != 0) {
                user = authorizing.user;
            }
            if ((i & 32) != 0) {
                z = authorizing.isSignupPlus;
            }
            if ((i & 64) != 0) {
                str3 = authorizing.creditableAt;
            }
            if ((i & 128) != 0) {
                authorizationFlow = authorizing.authorizationFlow;
            }
            String str4 = str3;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            User user2 = user;
            boolean z2 = z;
            return authorizing.copy(str, currency, paymentMethod, str2, user2, z2, str4, authorizationFlow2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component5, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSignupPlus() {
            return this.isSignupPlus;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* renamed from: component8, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Authorizing copy(String paymentId, Currency currency, PaymentMethod paymentMethod, String paymentReference, User user, boolean isSignupPlus, String creditableAt, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Authorizing(paymentId, currency, paymentMethod, paymentReference, user, isSignupPlus, creditableAt, authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authorizing)) {
                return false;
            }
            Authorizing authorizing = (Authorizing) other;
            return Intrinsics.areEqual(this.paymentId, authorizing.paymentId) && Intrinsics.areEqual(this.currency, authorizing.currency) && Intrinsics.areEqual(this.paymentMethod, authorizing.paymentMethod) && Intrinsics.areEqual(this.paymentReference, authorizing.paymentReference) && Intrinsics.areEqual(this.user, authorizing.user) && this.isSignupPlus == authorizing.isSignupPlus && Intrinsics.areEqual(this.creditableAt, authorizing.creditableAt) && Intrinsics.areEqual(this.authorizationFlow, authorizing.authorizationFlow);
        }

        public int hashCode() {
            int iHashCode = ((((this.paymentId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus)) * 31;
            String str2 = this.creditableAt;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.authorizationFlow.hashCode();
        }

        public String toString() {
            return "Authorizing(paymentId=" + this.paymentId + ", currency=" + this.currency + ", paymentMethod=" + this.paymentMethod + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", isSignupPlus=" + this.isSignupPlus + ", creditableAt=" + this.creditableAt + ", authorizationFlow=" + this.authorizationFlow + ")";
        }

        public Authorizing(String paymentId, Currency currency, PaymentMethod paymentMethod, String str, User user, boolean z, String str2, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            this.paymentId = paymentId;
            this.currency = currency;
            this.paymentMethod = paymentMethod;
            this.paymentReference = str;
            this.user = user;
            this.isSignupPlus = z;
            this.creditableAt = str2;
            this.authorizationFlow = authorizationFlow;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithAuthFlow(AuthorizationFlow authorizationFlow) {
            return DefaultImpls.copyWithAuthFlow(this, authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getSelectedProviderId() {
            return DefaultImpls.getSelectedProviderId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isProviderSelected() {
            return DefaultImpls.isProviderSelected(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isUserSelectedScheme() {
            return DefaultImpls.isUserSelectedScheme(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Failed transitionToFailed(AuthorizationFlowResponse.AuthorizationFailed authorizationFailed) {
            return DefaultImpls.transitionToFailed(this, authorizationFailed);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Currency getCurrency() {
            return this.currency;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isSignupPlus() {
            return this.isSignupPlus;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getCreditableAt() {
            return this.creditableAt;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithPaymentMethod(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return copy$default(this, getPaymentId(), null, paymentMethod, null, null, false, null, null, 250, null);
        }
    }

    /* compiled from: Payment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J_\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0010\u0010'\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment$Authorized;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentId", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "paymentReference", "user", "Lcom/truelayer/payments/core/domain/payments/User;", "isSignupPlus", "", "creditableAt", "authorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/payments/PaymentMethod;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/User;ZLjava/lang/String;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;)V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "getCreditableAt", "()Ljava/lang/String;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "()Z", "getPaymentId", "getPaymentMethod", "()Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "getPaymentReference", "getUser", "()Lcom/truelayer/payments/core/domain/payments/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copyWithPaymentMethod", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Authorized implements Payment {
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final Currency currency;
        private final boolean isSignupPlus;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final String paymentReference;
        private final User user;

        public static /* synthetic */ Authorized copy$default(Authorized authorized, String str, Currency currency, PaymentMethod paymentMethod, String str2, User user, boolean z, String str3, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authorized.paymentId;
            }
            if ((i & 2) != 0) {
                currency = authorized.currency;
            }
            if ((i & 4) != 0) {
                paymentMethod = authorized.paymentMethod;
            }
            if ((i & 8) != 0) {
                str2 = authorized.paymentReference;
            }
            if ((i & 16) != 0) {
                user = authorized.user;
            }
            if ((i & 32) != 0) {
                z = authorized.isSignupPlus;
            }
            if ((i & 64) != 0) {
                str3 = authorized.creditableAt;
            }
            if ((i & 128) != 0) {
                authorizationFlow = authorized.authorizationFlow;
            }
            String str4 = str3;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            User user2 = user;
            boolean z2 = z;
            return authorized.copy(str, currency, paymentMethod, str2, user2, z2, str4, authorizationFlow2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component5, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSignupPlus() {
            return this.isSignupPlus;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* renamed from: component8, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Authorized copy(String paymentId, Currency currency, PaymentMethod paymentMethod, String paymentReference, User user, boolean isSignupPlus, String creditableAt, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            return new Authorized(paymentId, currency, paymentMethod, paymentReference, user, isSignupPlus, creditableAt, authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authorized)) {
                return false;
            }
            Authorized authorized = (Authorized) other;
            return Intrinsics.areEqual(this.paymentId, authorized.paymentId) && Intrinsics.areEqual(this.currency, authorized.currency) && Intrinsics.areEqual(this.paymentMethod, authorized.paymentMethod) && Intrinsics.areEqual(this.paymentReference, authorized.paymentReference) && Intrinsics.areEqual(this.user, authorized.user) && this.isSignupPlus == authorized.isSignupPlus && Intrinsics.areEqual(this.creditableAt, authorized.creditableAt) && Intrinsics.areEqual(this.authorizationFlow, authorized.authorizationFlow);
        }

        public int hashCode() {
            int iHashCode = ((((this.paymentId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus)) * 31;
            String str2 = this.creditableAt;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.authorizationFlow.hashCode();
        }

        public String toString() {
            return "Authorized(paymentId=" + this.paymentId + ", currency=" + this.currency + ", paymentMethod=" + this.paymentMethod + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", isSignupPlus=" + this.isSignupPlus + ", creditableAt=" + this.creditableAt + ", authorizationFlow=" + this.authorizationFlow + ")";
        }

        public Authorized(String paymentId, Currency currency, PaymentMethod paymentMethod, String str, User user, boolean z, String str2, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(authorizationFlow, "authorizationFlow");
            this.paymentId = paymentId;
            this.currency = currency;
            this.paymentMethod = paymentMethod;
            this.paymentReference = str;
            this.user = user;
            this.isSignupPlus = z;
            this.creditableAt = str2;
            this.authorizationFlow = authorizationFlow;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithAuthFlow(AuthorizationFlow authorizationFlow) {
            return DefaultImpls.copyWithAuthFlow(this, authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getSelectedProviderId() {
            return DefaultImpls.getSelectedProviderId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isProviderSelected() {
            return DefaultImpls.isProviderSelected(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isUserSelectedScheme() {
            return DefaultImpls.isUserSelectedScheme(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Failed transitionToFailed(AuthorizationFlowResponse.AuthorizationFailed authorizationFailed) {
            return DefaultImpls.transitionToFailed(this, authorizationFailed);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Currency getCurrency() {
            return this.currency;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isSignupPlus() {
            return this.isSignupPlus;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getCreditableAt() {
            return this.creditableAt;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithPaymentMethod(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return copy$default(this, getPaymentId(), null, paymentMethod, null, null, false, null, null, 250, null);
        }
    }

    /* compiled from: Payment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0010\u0010'\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment$Executed;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentId", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "paymentReference", "user", "Lcom/truelayer/payments/core/domain/payments/User;", "isSignupPlus", "", "creditableAt", "authorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/payments/PaymentMethod;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/User;ZLjava/lang/String;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;)V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "getCreditableAt", "()Ljava/lang/String;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "()Z", "getPaymentId", "getPaymentMethod", "()Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "getPaymentReference", "getUser", "()Lcom/truelayer/payments/core/domain/payments/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copyWithPaymentMethod", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Executed implements Payment {
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final Currency currency;
        private final boolean isSignupPlus;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final String paymentReference;
        private final User user;

        public static /* synthetic */ Executed copy$default(Executed executed, String str, Currency currency, PaymentMethod paymentMethod, String str2, User user, boolean z, String str3, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = executed.paymentId;
            }
            if ((i & 2) != 0) {
                currency = executed.currency;
            }
            if ((i & 4) != 0) {
                paymentMethod = executed.paymentMethod;
            }
            if ((i & 8) != 0) {
                str2 = executed.paymentReference;
            }
            if ((i & 16) != 0) {
                user = executed.user;
            }
            if ((i & 32) != 0) {
                z = executed.isSignupPlus;
            }
            if ((i & 64) != 0) {
                str3 = executed.creditableAt;
            }
            if ((i & 128) != 0) {
                authorizationFlow = executed.authorizationFlow;
            }
            String str4 = str3;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            User user2 = user;
            boolean z2 = z;
            return executed.copy(str, currency, paymentMethod, str2, user2, z2, str4, authorizationFlow2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component5, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSignupPlus() {
            return this.isSignupPlus;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* renamed from: component8, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Executed copy(String paymentId, Currency currency, PaymentMethod paymentMethod, String paymentReference, User user, boolean isSignupPlus, String creditableAt, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Executed(paymentId, currency, paymentMethod, paymentReference, user, isSignupPlus, creditableAt, authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Executed)) {
                return false;
            }
            Executed executed = (Executed) other;
            return Intrinsics.areEqual(this.paymentId, executed.paymentId) && Intrinsics.areEqual(this.currency, executed.currency) && Intrinsics.areEqual(this.paymentMethod, executed.paymentMethod) && Intrinsics.areEqual(this.paymentReference, executed.paymentReference) && Intrinsics.areEqual(this.user, executed.user) && this.isSignupPlus == executed.isSignupPlus && Intrinsics.areEqual(this.creditableAt, executed.creditableAt) && Intrinsics.areEqual(this.authorizationFlow, executed.authorizationFlow);
        }

        public int hashCode() {
            int iHashCode = ((((this.paymentId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus)) * 31;
            String str2 = this.creditableAt;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AuthorizationFlow authorizationFlow = this.authorizationFlow;
            return iHashCode4 + (authorizationFlow != null ? authorizationFlow.hashCode() : 0);
        }

        public String toString() {
            return "Executed(paymentId=" + this.paymentId + ", currency=" + this.currency + ", paymentMethod=" + this.paymentMethod + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", isSignupPlus=" + this.isSignupPlus + ", creditableAt=" + this.creditableAt + ", authorizationFlow=" + this.authorizationFlow + ")";
        }

        public Executed(String paymentId, Currency currency, PaymentMethod paymentMethod, String str, User user, boolean z, String str2, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentId = paymentId;
            this.currency = currency;
            this.paymentMethod = paymentMethod;
            this.paymentReference = str;
            this.user = user;
            this.isSignupPlus = z;
            this.creditableAt = str2;
            this.authorizationFlow = authorizationFlow;
        }

        public /* synthetic */ Executed(String str, Currency currency, PaymentMethod paymentMethod, String str2, User user, boolean z, String str3, AuthorizationFlow authorizationFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, currency, paymentMethod, str2, user, z, str3, (i & 128) != 0 ? null : authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithAuthFlow(AuthorizationFlow authorizationFlow) {
            return DefaultImpls.copyWithAuthFlow(this, authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getSelectedProviderId() {
            return DefaultImpls.getSelectedProviderId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isProviderSelected() {
            return DefaultImpls.isProviderSelected(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isUserSelectedScheme() {
            return DefaultImpls.isUserSelectedScheme(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Failed transitionToFailed(AuthorizationFlowResponse.AuthorizationFailed authorizationFailed) {
            return DefaultImpls.transitionToFailed(this, authorizationFailed);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Currency getCurrency() {
            return this.currency;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isSignupPlus() {
            return this.isSignupPlus;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getCreditableAt() {
            return this.creditableAt;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithPaymentMethod(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return copy$default(this, getPaymentId(), null, paymentMethod, null, null, false, null, null, 250, null);
        }
    }

    /* compiled from: Payment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0010\u0010'\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment$Settled;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentId", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "paymentReference", "user", "Lcom/truelayer/payments/core/domain/payments/User;", "isSignupPlus", "", "creditableAt", "authorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/payments/PaymentMethod;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/User;ZLjava/lang/String;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;)V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "getCreditableAt", "()Ljava/lang/String;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "()Z", "getPaymentId", "getPaymentMethod", "()Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "getPaymentReference", "getUser", "()Lcom/truelayer/payments/core/domain/payments/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "copyWithPaymentMethod", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Settled implements Payment {
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final Currency currency;
        private final boolean isSignupPlus;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final String paymentReference;
        private final User user;

        public static /* synthetic */ Settled copy$default(Settled settled, String str, Currency currency, PaymentMethod paymentMethod, String str2, User user, boolean z, String str3, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = settled.paymentId;
            }
            if ((i & 2) != 0) {
                currency = settled.currency;
            }
            if ((i & 4) != 0) {
                paymentMethod = settled.paymentMethod;
            }
            if ((i & 8) != 0) {
                str2 = settled.paymentReference;
            }
            if ((i & 16) != 0) {
                user = settled.user;
            }
            if ((i & 32) != 0) {
                z = settled.isSignupPlus;
            }
            if ((i & 64) != 0) {
                str3 = settled.creditableAt;
            }
            if ((i & 128) != 0) {
                authorizationFlow = settled.authorizationFlow;
            }
            String str4 = str3;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            User user2 = user;
            boolean z2 = z;
            return settled.copy(str, currency, paymentMethod, str2, user2, z2, str4, authorizationFlow2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component5, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSignupPlus() {
            return this.isSignupPlus;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* renamed from: component8, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Settled copy(String paymentId, Currency currency, PaymentMethod paymentMethod, String paymentReference, User user, boolean isSignupPlus, String creditableAt, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Settled(paymentId, currency, paymentMethod, paymentReference, user, isSignupPlus, creditableAt, authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settled)) {
                return false;
            }
            Settled settled = (Settled) other;
            return Intrinsics.areEqual(this.paymentId, settled.paymentId) && Intrinsics.areEqual(this.currency, settled.currency) && Intrinsics.areEqual(this.paymentMethod, settled.paymentMethod) && Intrinsics.areEqual(this.paymentReference, settled.paymentReference) && Intrinsics.areEqual(this.user, settled.user) && this.isSignupPlus == settled.isSignupPlus && Intrinsics.areEqual(this.creditableAt, settled.creditableAt) && Intrinsics.areEqual(this.authorizationFlow, settled.authorizationFlow);
        }

        public int hashCode() {
            int iHashCode = ((((this.paymentId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus)) * 31;
            String str2 = this.creditableAt;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AuthorizationFlow authorizationFlow = this.authorizationFlow;
            return iHashCode4 + (authorizationFlow != null ? authorizationFlow.hashCode() : 0);
        }

        public String toString() {
            return "Settled(paymentId=" + this.paymentId + ", currency=" + this.currency + ", paymentMethod=" + this.paymentMethod + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", isSignupPlus=" + this.isSignupPlus + ", creditableAt=" + this.creditableAt + ", authorizationFlow=" + this.authorizationFlow + ")";
        }

        public Settled(String paymentId, Currency currency, PaymentMethod paymentMethod, String str, User user, boolean z, String str2, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentId = paymentId;
            this.currency = currency;
            this.paymentMethod = paymentMethod;
            this.paymentReference = str;
            this.user = user;
            this.isSignupPlus = z;
            this.creditableAt = str2;
            this.authorizationFlow = authorizationFlow;
        }

        public /* synthetic */ Settled(String str, Currency currency, PaymentMethod paymentMethod, String str2, User user, boolean z, String str3, AuthorizationFlow authorizationFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, currency, paymentMethod, str2, user, z, str3, (i & 128) != 0 ? null : authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithAuthFlow(AuthorizationFlow authorizationFlow) {
            return DefaultImpls.copyWithAuthFlow(this, authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getSelectedProviderId() {
            return DefaultImpls.getSelectedProviderId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isProviderSelected() {
            return DefaultImpls.isProviderSelected(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isUserSelectedScheme() {
            return DefaultImpls.isUserSelectedScheme(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Failed transitionToFailed(AuthorizationFlowResponse.AuthorizationFailed authorizationFailed) {
            return DefaultImpls.transitionToFailed(this, authorizationFailed);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Currency getCurrency() {
            return this.currency;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isSignupPlus() {
            return this.isSignupPlus;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getCreditableAt() {
            return this.creditableAt;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithPaymentMethod(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return copy$default(this, getPaymentId(), null, paymentMethod, null, null, false, null, null, 250, null);
        }
    }

    /* compiled from: Payment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jk\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0010\u0010,\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment$Failed;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentId", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "paymentReference", "failureReason", "Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "user", "Lcom/truelayer/payments/core/domain/payments/User;", "isSignupPlus", "", "creditableAt", "authorizationFlow", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/payments/PaymentMethod;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;Lcom/truelayer/payments/core/domain/payments/User;ZLjava/lang/String;Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;)V", "getAuthorizationFlow", "()Lcom/truelayer/payments/core/domain/payments/AuthorizationFlow;", "getCreditableAt", "()Ljava/lang/String;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "getFailureReason", "()Lcom/truelayer/payments/core/domain/payments/PaymentFailureReason;", "()Z", "getPaymentId", "getPaymentMethod", "()Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "getPaymentReference", "getUser", "()Lcom/truelayer/payments/core/domain/payments/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copyWithPaymentMethod", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Failed implements Payment {
        private final AuthorizationFlow authorizationFlow;
        private final String creditableAt;
        private final Currency currency;
        private final PaymentFailureReason failureReason;
        private final boolean isSignupPlus;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final String paymentReference;
        private final User user;

        public static /* synthetic */ Failed copy$default(Failed failed, String str, Currency currency, PaymentMethod paymentMethod, String str2, PaymentFailureReason paymentFailureReason, User user, boolean z, String str3, AuthorizationFlow authorizationFlow, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.paymentId;
            }
            if ((i & 2) != 0) {
                currency = failed.currency;
            }
            if ((i & 4) != 0) {
                paymentMethod = failed.paymentMethod;
            }
            if ((i & 8) != 0) {
                str2 = failed.paymentReference;
            }
            if ((i & 16) != 0) {
                paymentFailureReason = failed.failureReason;
            }
            if ((i & 32) != 0) {
                user = failed.user;
            }
            if ((i & 64) != 0) {
                z = failed.isSignupPlus;
            }
            if ((i & 128) != 0) {
                str3 = failed.creditableAt;
            }
            if ((i & 256) != 0) {
                authorizationFlow = failed.authorizationFlow;
            }
            String str4 = str3;
            AuthorizationFlow authorizationFlow2 = authorizationFlow;
            User user2 = user;
            boolean z2 = z;
            PaymentFailureReason paymentFailureReason2 = paymentFailureReason;
            PaymentMethod paymentMethod2 = paymentMethod;
            return failed.copy(str, currency, paymentMethod2, str2, paymentFailureReason2, user2, z2, str4, authorizationFlow2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component5, reason: from getter */
        public final PaymentFailureReason getFailureReason() {
            return this.failureReason;
        }

        /* renamed from: component6, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsSignupPlus() {
            return this.isSignupPlus;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        /* renamed from: component9, reason: from getter */
        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        public final Failed copy(String paymentId, Currency currency, PaymentMethod paymentMethod, String paymentReference, PaymentFailureReason failureReason, User user, boolean isSignupPlus, String creditableAt, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            return new Failed(paymentId, currency, paymentMethod, paymentReference, failureReason, user, isSignupPlus, creditableAt, authorizationFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return Intrinsics.areEqual(this.paymentId, failed.paymentId) && Intrinsics.areEqual(this.currency, failed.currency) && Intrinsics.areEqual(this.paymentMethod, failed.paymentMethod) && Intrinsics.areEqual(this.paymentReference, failed.paymentReference) && this.failureReason == failed.failureReason && Intrinsics.areEqual(this.user, failed.user) && this.isSignupPlus == failed.isSignupPlus && Intrinsics.areEqual(this.creditableAt, failed.creditableAt) && Intrinsics.areEqual(this.authorizationFlow, failed.authorizationFlow);
        }

        public int hashCode() {
            int iHashCode = ((((this.paymentId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.failureReason.hashCode()) * 31;
            User user = this.user;
            int iHashCode3 = (((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus)) * 31;
            String str2 = this.creditableAt;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AuthorizationFlow authorizationFlow = this.authorizationFlow;
            return iHashCode4 + (authorizationFlow != null ? authorizationFlow.hashCode() : 0);
        }

        public String toString() {
            return "Failed(paymentId=" + this.paymentId + ", currency=" + this.currency + ", paymentMethod=" + this.paymentMethod + ", paymentReference=" + this.paymentReference + ", failureReason=" + this.failureReason + ", user=" + this.user + ", isSignupPlus=" + this.isSignupPlus + ", creditableAt=" + this.creditableAt + ", authorizationFlow=" + this.authorizationFlow + ")";
        }

        public Failed(String paymentId, Currency currency, PaymentMethod paymentMethod, String str, PaymentFailureReason failureReason, User user, boolean z, String str2, AuthorizationFlow authorizationFlow) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(failureReason, "failureReason");
            this.paymentId = paymentId;
            this.currency = currency;
            this.paymentMethod = paymentMethod;
            this.paymentReference = str;
            this.failureReason = failureReason;
            this.user = user;
            this.isSignupPlus = z;
            this.creditableAt = str2;
            this.authorizationFlow = authorizationFlow;
        }

        public /* synthetic */ Failed(String str, Currency currency, PaymentMethod paymentMethod, String str2, PaymentFailureReason paymentFailureReason, User user, boolean z, String str3, AuthorizationFlow authorizationFlow, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, currency, paymentMethod, str2, paymentFailureReason, user, z, str3, (i & 256) != 0 ? null : authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithAuthFlow(AuthorizationFlow authorizationFlow) {
            return DefaultImpls.copyWithAuthFlow(this, authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getSelectedProviderId() {
            return DefaultImpls.getSelectedProviderId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isProviderSelected() {
            return DefaultImpls.isProviderSelected(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isUserSelectedScheme() {
            return DefaultImpls.isUserSelectedScheme(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Failed transitionToFailed(AuthorizationFlowResponse.AuthorizationFailed authorizationFailed) {
            return DefaultImpls.transitionToFailed(this, authorizationFailed);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Currency getCurrency() {
            return this.currency;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentReference() {
            return this.paymentReference;
        }

        public final PaymentFailureReason getFailureReason() {
            return this.failureReason;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isSignupPlus() {
            return this.isSignupPlus;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getCreditableAt() {
            return this.creditableAt;
        }

        public final AuthorizationFlow getAuthorizationFlow() {
            return this.authorizationFlow;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithPaymentMethod(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return copy$default(this, getPaymentId(), null, paymentMethod, null, null, null, false, null, null, 506, null);
        }
    }

    /* compiled from: Payment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment$Revoked;", "Lcom/truelayer/payments/core/domain/payments/Payment;", "paymentId", "", "currency", "Lcom/truelayer/payments/core/domain/common/Currency;", "paymentMethod", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "paymentReference", "user", "Lcom/truelayer/payments/core/domain/payments/User;", "isSignupPlus", "", "creditableAt", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/common/Currency;Lcom/truelayer/payments/core/domain/payments/PaymentMethod;Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/User;ZLjava/lang/String;)V", "getCreditableAt", "()Ljava/lang/String;", "getCurrency", "()Lcom/truelayer/payments/core/domain/common/Currency;", "()Z", "getPaymentId", "getPaymentMethod", "()Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "getPaymentReference", "getUser", "()Lcom/truelayer/payments/core/domain/payments/User;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "copyWithPaymentMethod", "equals", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Revoked implements Payment {
        private final String creditableAt;
        private final Currency currency;
        private final boolean isSignupPlus;
        private final String paymentId;
        private final PaymentMethod paymentMethod;
        private final String paymentReference;
        private final User user;

        public static /* synthetic */ Revoked copy$default(Revoked revoked, String str, Currency currency, PaymentMethod paymentMethod, String str2, User user, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = revoked.paymentId;
            }
            if ((i & 2) != 0) {
                currency = revoked.currency;
            }
            if ((i & 4) != 0) {
                paymentMethod = revoked.paymentMethod;
            }
            if ((i & 8) != 0) {
                str2 = revoked.paymentReference;
            }
            if ((i & 16) != 0) {
                user = revoked.user;
            }
            if ((i & 32) != 0) {
                z = revoked.isSignupPlus;
            }
            if ((i & 64) != 0) {
                str3 = revoked.creditableAt;
            }
            boolean z2 = z;
            String str4 = str3;
            User user2 = user;
            PaymentMethod paymentMethod2 = paymentMethod;
            return revoked.copy(str, currency, paymentMethod2, str2, user2, z2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentId() {
            return this.paymentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPaymentReference() {
            return this.paymentReference;
        }

        /* renamed from: component5, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSignupPlus() {
            return this.isSignupPlus;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCreditableAt() {
            return this.creditableAt;
        }

        public final Revoked copy(String paymentId, Currency currency, PaymentMethod paymentMethod, String paymentReference, User user, boolean isSignupPlus, String creditableAt) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return new Revoked(paymentId, currency, paymentMethod, paymentReference, user, isSignupPlus, creditableAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Revoked)) {
                return false;
            }
            Revoked revoked = (Revoked) other;
            return Intrinsics.areEqual(this.paymentId, revoked.paymentId) && Intrinsics.areEqual(this.currency, revoked.currency) && Intrinsics.areEqual(this.paymentMethod, revoked.paymentMethod) && Intrinsics.areEqual(this.paymentReference, revoked.paymentReference) && Intrinsics.areEqual(this.user, revoked.user) && this.isSignupPlus == revoked.isSignupPlus && Intrinsics.areEqual(this.creditableAt, revoked.creditableAt);
        }

        public int hashCode() {
            int iHashCode = ((((this.paymentId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.paymentMethod.hashCode()) * 31;
            String str = this.paymentReference;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            User user = this.user;
            int iHashCode3 = (((iHashCode2 + (user == null ? 0 : user.hashCode())) * 31) + Boolean.hashCode(this.isSignupPlus)) * 31;
            String str2 = this.creditableAt;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Revoked(paymentId=" + this.paymentId + ", currency=" + this.currency + ", paymentMethod=" + this.paymentMethod + ", paymentReference=" + this.paymentReference + ", user=" + this.user + ", isSignupPlus=" + this.isSignupPlus + ", creditableAt=" + this.creditableAt + ")";
        }

        public Revoked(String paymentId, Currency currency, PaymentMethod paymentMethod, String str, User user, boolean z, String str2) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.paymentId = paymentId;
            this.currency = currency;
            this.paymentMethod = paymentMethod;
            this.paymentReference = str;
            this.user = user;
            this.isSignupPlus = z;
            this.creditableAt = str2;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithAuthFlow(AuthorizationFlow authorizationFlow) {
            return DefaultImpls.copyWithAuthFlow(this, authorizationFlow);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getSelectedProviderId() {
            return DefaultImpls.getSelectedProviderId(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isProviderSelected() {
            return DefaultImpls.isProviderSelected(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isUserSelectedScheme() {
            return DefaultImpls.isUserSelectedScheme(this);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Failed transitionToFailed(AuthorizationFlowResponse.AuthorizationFailed authorizationFailed) {
            return DefaultImpls.transitionToFailed(this, authorizationFailed);
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentId() {
            return this.paymentId;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Currency getCurrency() {
            return this.currency;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getPaymentReference() {
            return this.paymentReference;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public User getUser() {
            return this.user;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public boolean isSignupPlus() {
            return this.isSignupPlus;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public String getCreditableAt() {
            return this.creditableAt;
        }

        @Override // com.truelayer.payments.core.domain.payments.Payment
        public Payment copyWithPaymentMethod(PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            return copy$default(this, getPaymentId(), null, paymentMethod, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        }
    }

    /* compiled from: Payment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/Payment$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
