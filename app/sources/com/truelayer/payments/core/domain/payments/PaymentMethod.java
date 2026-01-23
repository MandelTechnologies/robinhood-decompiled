package com.truelayer.payments.core.domain.payments;

import com.truelayer.payments.core.domain.payments.ProviderSelection;
import com.truelayer.payments.core.domain.payments.SchemeSelectionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethod.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\t\n\u000bJ\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "", "providerSelection", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "getProviderSelection", "()Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "copyWithSelectedProviderId", "providerId", "", "BankTransfer", "Mandate", "PaymentOfMandate", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod$BankTransfer;", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod$Mandate;", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod$PaymentOfMandate;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface PaymentMethod {
    PaymentMethod copyWithSelectedProviderId(String providerId);

    ProviderSelection getProviderSelection();

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentMethod$BankTransfer;", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "amountInMinor", "", "beneficiary", "Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "providerSelection", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "(JLcom/truelayer/payments/core/domain/payments/Beneficiary;Lcom/truelayer/payments/core/domain/payments/ProviderSelection;)V", "getAmountInMinor", "()J", "getBeneficiary", "()Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "getProviderSelection", "()Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "component1", "component2", "component3", "copy", "copyWithSelectedProviderId", "providerId", "", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class BankTransfer implements PaymentMethod {
        private final long amountInMinor;
        private final Beneficiary beneficiary;
        private final ProviderSelection providerSelection;

        public static /* synthetic */ BankTransfer copy$default(BankTransfer bankTransfer, long j, Beneficiary beneficiary, ProviderSelection providerSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bankTransfer.amountInMinor;
            }
            if ((i & 2) != 0) {
                beneficiary = bankTransfer.beneficiary;
            }
            if ((i & 4) != 0) {
                providerSelection = bankTransfer.providerSelection;
            }
            return bankTransfer.copy(j, beneficiary, providerSelection);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component2, reason: from getter */
        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        /* renamed from: component3, reason: from getter */
        public final ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        public final BankTransfer copy(long amountInMinor, Beneficiary beneficiary, ProviderSelection providerSelection) {
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            return new BankTransfer(amountInMinor, beneficiary, providerSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankTransfer)) {
                return false;
            }
            BankTransfer bankTransfer = (BankTransfer) other;
            return this.amountInMinor == bankTransfer.amountInMinor && Intrinsics.areEqual(this.beneficiary, bankTransfer.beneficiary) && Intrinsics.areEqual(this.providerSelection, bankTransfer.providerSelection);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.amountInMinor) * 31;
            Beneficiary beneficiary = this.beneficiary;
            return ((iHashCode + (beneficiary == null ? 0 : beneficiary.hashCode())) * 31) + this.providerSelection.hashCode();
        }

        public String toString() {
            return "BankTransfer(amountInMinor=" + this.amountInMinor + ", beneficiary=" + this.beneficiary + ", providerSelection=" + this.providerSelection + ")";
        }

        public BankTransfer(long j, Beneficiary beneficiary, ProviderSelection providerSelection) {
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            this.amountInMinor = j;
            this.beneficiary = beneficiary;
            this.providerSelection = providerSelection;
        }

        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        @Override // com.truelayer.payments.core.domain.payments.PaymentMethod
        public ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        @Override // com.truelayer.payments.core.domain.payments.PaymentMethod
        public PaymentMethod copyWithSelectedProviderId(String providerId) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            return copy$default(this, 0L, null, getProviderSelection().copyWithProviderId(providerId), 3, null);
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentMethod$PaymentOfMandate;", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "amountInMinor", "", "providerSelection", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "reference", "", "(JLcom/truelayer/payments/core/domain/payments/ProviderSelection;Ljava/lang/String;)V", "getAmountInMinor", "()J", "getProviderSelection", "()Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "getReference", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "copyWithSelectedProviderId", "providerId", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class PaymentOfMandate implements PaymentMethod {
        private final long amountInMinor;
        private final ProviderSelection providerSelection;
        private final String reference;

        public static /* synthetic */ PaymentOfMandate copy$default(PaymentOfMandate paymentOfMandate, long j, ProviderSelection providerSelection, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = paymentOfMandate.amountInMinor;
            }
            if ((i & 2) != 0) {
                providerSelection = paymentOfMandate.providerSelection;
            }
            if ((i & 4) != 0) {
                str = paymentOfMandate.reference;
            }
            return paymentOfMandate.copy(j, providerSelection, str);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        /* renamed from: component2, reason: from getter */
        public final ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        /* renamed from: component3, reason: from getter */
        public final String getReference() {
            return this.reference;
        }

        public final PaymentOfMandate copy(long amountInMinor, ProviderSelection providerSelection, String reference) {
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            return new PaymentOfMandate(amountInMinor, providerSelection, reference);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentOfMandate)) {
                return false;
            }
            PaymentOfMandate paymentOfMandate = (PaymentOfMandate) other;
            return this.amountInMinor == paymentOfMandate.amountInMinor && Intrinsics.areEqual(this.providerSelection, paymentOfMandate.providerSelection) && Intrinsics.areEqual(this.reference, paymentOfMandate.reference);
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.amountInMinor) * 31) + this.providerSelection.hashCode()) * 31;
            String str = this.reference;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentOfMandate(amountInMinor=" + this.amountInMinor + ", providerSelection=" + this.providerSelection + ", reference=" + this.reference + ")";
        }

        public PaymentOfMandate(long j, ProviderSelection providerSelection, String str) {
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            this.amountInMinor = j;
            this.providerSelection = providerSelection;
            this.reference = str;
        }

        public final long getAmountInMinor() {
            return this.amountInMinor;
        }

        public /* synthetic */ PaymentOfMandate(long j, ProviderSelection providerSelection, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? new ProviderSelection.UserSelected(null, SchemeSelectionType.InstantPreferred.INSTANCE) : providerSelection, (i & 4) != 0 ? null : str);
        }

        @Override // com.truelayer.payments.core.domain.payments.PaymentMethod
        public ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        public final String getReference() {
            return this.reference;
        }

        @Override // com.truelayer.payments.core.domain.payments.PaymentMethod
        public PaymentMethod copyWithSelectedProviderId(String providerId) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            return copy$default(this, 0L, getProviderSelection().copyWithProviderId(providerId), null, 5, null);
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/PaymentMethod$Mandate;", "Lcom/truelayer/payments/core/domain/payments/PaymentMethod;", "constraints", "Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "providerSelection", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "beneficiary", "Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "(Lcom/truelayer/payments/core/domain/payments/MandateConstraints;Lcom/truelayer/payments/core/domain/payments/ProviderSelection;Lcom/truelayer/payments/core/domain/payments/Beneficiary;)V", "getBeneficiary", "()Lcom/truelayer/payments/core/domain/payments/Beneficiary;", "getConstraints", "()Lcom/truelayer/payments/core/domain/payments/MandateConstraints;", "getProviderSelection", "()Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "component1", "component2", "component3", "copy", "copyWithSelectedProviderId", "providerId", "", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Mandate implements PaymentMethod {
        private final Beneficiary beneficiary;
        private final MandateConstraints constraints;
        private final ProviderSelection providerSelection;

        public static /* synthetic */ Mandate copy$default(Mandate mandate, MandateConstraints mandateConstraints, ProviderSelection providerSelection, Beneficiary beneficiary, int i, Object obj) {
            if ((i & 1) != 0) {
                mandateConstraints = mandate.constraints;
            }
            if ((i & 2) != 0) {
                providerSelection = mandate.providerSelection;
            }
            if ((i & 4) != 0) {
                beneficiary = mandate.beneficiary;
            }
            return mandate.copy(mandateConstraints, providerSelection, beneficiary);
        }

        /* renamed from: component1, reason: from getter */
        public final MandateConstraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: component2, reason: from getter */
        public final ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        /* renamed from: component3, reason: from getter */
        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        public final Mandate copy(MandateConstraints constraints, ProviderSelection providerSelection, Beneficiary beneficiary) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            return new Mandate(constraints, providerSelection, beneficiary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mandate)) {
                return false;
            }
            Mandate mandate = (Mandate) other;
            return Intrinsics.areEqual(this.constraints, mandate.constraints) && Intrinsics.areEqual(this.providerSelection, mandate.providerSelection) && Intrinsics.areEqual(this.beneficiary, mandate.beneficiary);
        }

        public int hashCode() {
            return (((this.constraints.hashCode() * 31) + this.providerSelection.hashCode()) * 31) + this.beneficiary.hashCode();
        }

        public String toString() {
            return "Mandate(constraints=" + this.constraints + ", providerSelection=" + this.providerSelection + ", beneficiary=" + this.beneficiary + ")";
        }

        public Mandate(MandateConstraints constraints, ProviderSelection providerSelection, Beneficiary beneficiary) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            Intrinsics.checkNotNullParameter(providerSelection, "providerSelection");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.constraints = constraints;
            this.providerSelection = providerSelection;
            this.beneficiary = beneficiary;
        }

        public final MandateConstraints getConstraints() {
            return this.constraints;
        }

        @Override // com.truelayer.payments.core.domain.payments.PaymentMethod
        public ProviderSelection getProviderSelection() {
            return this.providerSelection;
        }

        public final Beneficiary getBeneficiary() {
            return this.beneficiary;
        }

        @Override // com.truelayer.payments.core.domain.payments.PaymentMethod
        public PaymentMethod copyWithSelectedProviderId(String providerId) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            return copy$default(this, null, getProviderSelection().copyWithProviderId(providerId), null, 5, null);
        }
    }
}
