package com.stripe.android.model;

import com.robinhood.referral.SingularAttributionManager;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.utils.MapUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateFinancialConnectionsSessionParams.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "", "", "", "toMap", "()Ljava/util/Map;", "InstantDebits", "USBankAccount", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface CreateFinancialConnectionsSessionParams {
    Map<String, Object> toMap();

    /* compiled from: CreateFinancialConnectionsSessionParams.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "", "clientSecret", "customerEmailAddress", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "toMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientSecret", "getCustomerEmailAddress", "getHostedSurface", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class InstantDebits implements CreateFinancialConnectionsSessionParams {
        private final String clientSecret;
        private final String customerEmailAddress;
        private final String hostedSurface;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstantDebits)) {
                return false;
            }
            InstantDebits instantDebits = (InstantDebits) other;
            return Intrinsics.areEqual(this.clientSecret, instantDebits.clientSecret) && Intrinsics.areEqual(this.customerEmailAddress, instantDebits.customerEmailAddress) && Intrinsics.areEqual(this.hostedSurface, instantDebits.hostedSurface);
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            String str = this.customerEmailAddress;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostedSurface;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(clientSecret=" + this.clientSecret + ", customerEmailAddress=" + this.customerEmailAddress + ", hostedSurface=" + this.hostedSurface + ")";
        }

        public InstantDebits(String clientSecret, String str, String str2) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.customerEmailAddress = str;
            this.hostedSurface = str2;
        }

        @Override // com.stripe.android.model.CreateFinancialConnectionsSessionParams
        public Map<String, Object> toMap() {
            return MapUtils.filterNotNullValues(MapsKt.mapOf(Tuples4.m3642to("client_secret", this.clientSecret), Tuples4.m3642to("hosted_surface", this.hostedSurface), Tuples4.m3642to(SingularAttributionManager.PRODUCT_PARAM_KEY, "instant_debits"), Tuples4.m3642to("attach_required", Boolean.TRUE), Tuples4.m3642to("payment_method_data", new PaymentMethodCreateParams(PaymentMethod.Type.Link, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaymentMethod.BillingDetails(null, this.customerEmailAddress, null, null, 13, null), null, null, null, null, 507902, null).toParamMap())));
        }
    }

    /* compiled from: CreateFinancialConnectionsSessionParams.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "", "clientSecret", "customerName", "customerEmailAddress", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "toMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientSecret", "getCustomerName", "getCustomerEmailAddress", "getHostedSurface", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class USBankAccount implements CreateFinancialConnectionsSessionParams {
        private final String clientSecret;
        private final String customerEmailAddress;
        private final String customerName;
        private final String hostedSurface;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return Intrinsics.areEqual(this.clientSecret, uSBankAccount.clientSecret) && Intrinsics.areEqual(this.customerName, uSBankAccount.customerName) && Intrinsics.areEqual(this.customerEmailAddress, uSBankAccount.customerEmailAddress) && Intrinsics.areEqual(this.hostedSurface, uSBankAccount.hostedSurface);
        }

        public int hashCode() {
            int iHashCode = ((this.clientSecret.hashCode() * 31) + this.customerName.hashCode()) * 31;
            String str = this.customerEmailAddress;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostedSurface;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(clientSecret=" + this.clientSecret + ", customerName=" + this.customerName + ", customerEmailAddress=" + this.customerEmailAddress + ", hostedSurface=" + this.hostedSurface + ")";
        }

        public USBankAccount(String clientSecret, String customerName, String str, String str2) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(customerName, "customerName");
            this.clientSecret = clientSecret;
            this.customerName = customerName;
            this.customerEmailAddress = str;
            this.hostedSurface = str2;
        }

        @Override // com.stripe.android.model.CreateFinancialConnectionsSessionParams
        public Map<String, Object> toMap() {
            return MapUtils.filterNotNullValues(MapsKt.mapOf(Tuples4.m3642to("client_secret", this.clientSecret), Tuples4.m3642to("hosted_surface", this.hostedSurface), Tuples4.m3642to("payment_method_data", PaymentMethodCreateParams.Companion.createUSBankAccount$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethod.BillingDetails(null, this.customerEmailAddress, this.customerName, null, 9, null), null, null, 6, null).toParamMap())));
        }
    }
}
