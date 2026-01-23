package com.robinhood.android.beneficiaries.p067ui;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAccountViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowEmailViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustDateViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustNameViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustTaxIdentifierViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: BeneficiaryParentViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState;", "", "TrustFlow", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryFlowViewState, reason: use source file name */
/* loaded from: classes7.dex */
public interface BeneficiaryParentViewState3 {

    /* compiled from: BeneficiaryParentViewState.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0086\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b@\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010%R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010'¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "nameViewModel", "", "userNameInput", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "dateViewModel", "j$/time/LocalDate", "userDateInput", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "taxIdentifierViewModel", "userTaxIdentifierInput", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "emailViewModel", "userEmailInput", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "accountViewModel", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowAdditionalAccountsViewState;", "additionalAccountsViewState", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;Lj$/time/LocalDate;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowAdditionalAccountsViewState;)V", "component1", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "component2", "()Ljava/lang/String;", "component3", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "component4", "()Lj$/time/LocalDate;", "component5", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "component6", "component7", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "component8", "component9", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "component10", "()Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowAdditionalAccountsViewState;", "copy", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;Lj$/time/LocalDate;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowAdditionalAccountsViewState;)Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustNameViewModel;", "getNameViewModel", "Ljava/lang/String;", "getUserNameInput", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustDateViewModel;", "getDateViewModel", "Lj$/time/LocalDate;", "getUserDateInput", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowTrustTaxIdentifierViewModel;", "getTaxIdentifierViewModel", "getUserTaxIdentifierInput", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "getEmailViewModel", "getUserEmailInput", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "getAccountViewModel", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowAdditionalAccountsViewState;", "getAdditionalAccountsViewState", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryFlowViewState$TrustFlow, reason: from toString */
    public static final /* data */ class TrustFlow implements BeneficiaryParentViewState3 {
        public static final int $stable = 8;
        private final BeneficiaryFlowAccountViewModel accountViewModel;
        private final BeneficiaryFlowAdditionalAccountsViewState additionalAccountsViewState;
        private final BeneficiaryFlowTrustDateViewModel dateViewModel;
        private final BeneficiaryFlowEmailViewModel emailViewModel;
        private final BeneficiaryFlowTrustNameViewModel nameViewModel;
        private final BeneficiaryFlowTrustTaxIdentifierViewModel taxIdentifierViewModel;
        private final LocalDate userDateInput;
        private final String userEmailInput;
        private final String userNameInput;
        private final String userTaxIdentifierInput;

        public TrustFlow() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public static /* synthetic */ TrustFlow copy$default(TrustFlow trustFlow, BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel, String str, BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel, LocalDate localDate, BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel, String str2, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, String str3, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, BeneficiaryFlowAdditionalAccountsViewState beneficiaryFlowAdditionalAccountsViewState, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowTrustNameViewModel = trustFlow.nameViewModel;
            }
            if ((i & 2) != 0) {
                str = trustFlow.userNameInput;
            }
            if ((i & 4) != 0) {
                beneficiaryFlowTrustDateViewModel = trustFlow.dateViewModel;
            }
            if ((i & 8) != 0) {
                localDate = trustFlow.userDateInput;
            }
            if ((i & 16) != 0) {
                beneficiaryFlowTrustTaxIdentifierViewModel = trustFlow.taxIdentifierViewModel;
            }
            if ((i & 32) != 0) {
                str2 = trustFlow.userTaxIdentifierInput;
            }
            if ((i & 64) != 0) {
                beneficiaryFlowEmailViewModel = trustFlow.emailViewModel;
            }
            if ((i & 128) != 0) {
                str3 = trustFlow.userEmailInput;
            }
            if ((i & 256) != 0) {
                beneficiaryFlowAccountViewModel = trustFlow.accountViewModel;
            }
            if ((i & 512) != 0) {
                beneficiaryFlowAdditionalAccountsViewState = trustFlow.additionalAccountsViewState;
            }
            BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel2 = beneficiaryFlowAccountViewModel;
            BeneficiaryFlowAdditionalAccountsViewState beneficiaryFlowAdditionalAccountsViewState2 = beneficiaryFlowAdditionalAccountsViewState;
            BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel2 = beneficiaryFlowEmailViewModel;
            String str4 = str3;
            BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel2 = beneficiaryFlowTrustTaxIdentifierViewModel;
            String str5 = str2;
            return trustFlow.copy(beneficiaryFlowTrustNameViewModel, str, beneficiaryFlowTrustDateViewModel, localDate, beneficiaryFlowTrustTaxIdentifierViewModel2, str5, beneficiaryFlowEmailViewModel2, str4, beneficiaryFlowAccountViewModel2, beneficiaryFlowAdditionalAccountsViewState2);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowTrustNameViewModel getNameViewModel() {
            return this.nameViewModel;
        }

        /* renamed from: component10, reason: from getter */
        public final BeneficiaryFlowAdditionalAccountsViewState getAdditionalAccountsViewState() {
            return this.additionalAccountsViewState;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserNameInput() {
            return this.userNameInput;
        }

        /* renamed from: component3, reason: from getter */
        public final BeneficiaryFlowTrustDateViewModel getDateViewModel() {
            return this.dateViewModel;
        }

        /* renamed from: component4, reason: from getter */
        public final LocalDate getUserDateInput() {
            return this.userDateInput;
        }

        /* renamed from: component5, reason: from getter */
        public final BeneficiaryFlowTrustTaxIdentifierViewModel getTaxIdentifierViewModel() {
            return this.taxIdentifierViewModel;
        }

        /* renamed from: component6, reason: from getter */
        public final String getUserTaxIdentifierInput() {
            return this.userTaxIdentifierInput;
        }

        /* renamed from: component7, reason: from getter */
        public final BeneficiaryFlowEmailViewModel getEmailViewModel() {
            return this.emailViewModel;
        }

        /* renamed from: component8, reason: from getter */
        public final String getUserEmailInput() {
            return this.userEmailInput;
        }

        /* renamed from: component9, reason: from getter */
        public final BeneficiaryFlowAccountViewModel getAccountViewModel() {
            return this.accountViewModel;
        }

        public final TrustFlow copy(BeneficiaryFlowTrustNameViewModel nameViewModel, String userNameInput, BeneficiaryFlowTrustDateViewModel dateViewModel, LocalDate userDateInput, BeneficiaryFlowTrustTaxIdentifierViewModel taxIdentifierViewModel, String userTaxIdentifierInput, BeneficiaryFlowEmailViewModel emailViewModel, String userEmailInput, BeneficiaryFlowAccountViewModel accountViewModel, BeneficiaryFlowAdditionalAccountsViewState additionalAccountsViewState) {
            Intrinsics.checkNotNullParameter(additionalAccountsViewState, "additionalAccountsViewState");
            return new TrustFlow(nameViewModel, userNameInput, dateViewModel, userDateInput, taxIdentifierViewModel, userTaxIdentifierInput, emailViewModel, userEmailInput, accountViewModel, additionalAccountsViewState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustFlow)) {
                return false;
            }
            TrustFlow trustFlow = (TrustFlow) other;
            return Intrinsics.areEqual(this.nameViewModel, trustFlow.nameViewModel) && Intrinsics.areEqual(this.userNameInput, trustFlow.userNameInput) && Intrinsics.areEqual(this.dateViewModel, trustFlow.dateViewModel) && Intrinsics.areEqual(this.userDateInput, trustFlow.userDateInput) && Intrinsics.areEqual(this.taxIdentifierViewModel, trustFlow.taxIdentifierViewModel) && Intrinsics.areEqual(this.userTaxIdentifierInput, trustFlow.userTaxIdentifierInput) && Intrinsics.areEqual(this.emailViewModel, trustFlow.emailViewModel) && Intrinsics.areEqual(this.userEmailInput, trustFlow.userEmailInput) && Intrinsics.areEqual(this.accountViewModel, trustFlow.accountViewModel) && Intrinsics.areEqual(this.additionalAccountsViewState, trustFlow.additionalAccountsViewState);
        }

        public int hashCode() {
            BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel = this.nameViewModel;
            int iHashCode = (beneficiaryFlowTrustNameViewModel == null ? 0 : beneficiaryFlowTrustNameViewModel.hashCode()) * 31;
            String str = this.userNameInput;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel = this.dateViewModel;
            int iHashCode3 = (iHashCode2 + (beneficiaryFlowTrustDateViewModel == null ? 0 : beneficiaryFlowTrustDateViewModel.hashCode())) * 31;
            LocalDate localDate = this.userDateInput;
            int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel = this.taxIdentifierViewModel;
            int iHashCode5 = (iHashCode4 + (beneficiaryFlowTrustTaxIdentifierViewModel == null ? 0 : beneficiaryFlowTrustTaxIdentifierViewModel.hashCode())) * 31;
            String str2 = this.userTaxIdentifierInput;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel = this.emailViewModel;
            int iHashCode7 = (iHashCode6 + (beneficiaryFlowEmailViewModel == null ? 0 : beneficiaryFlowEmailViewModel.hashCode())) * 31;
            String str3 = this.userEmailInput;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel = this.accountViewModel;
            return ((iHashCode8 + (beneficiaryFlowAccountViewModel != null ? beneficiaryFlowAccountViewModel.hashCode() : 0)) * 31) + this.additionalAccountsViewState.hashCode();
        }

        public String toString() {
            return "TrustFlow(nameViewModel=" + this.nameViewModel + ", userNameInput=" + this.userNameInput + ", dateViewModel=" + this.dateViewModel + ", userDateInput=" + this.userDateInput + ", taxIdentifierViewModel=" + this.taxIdentifierViewModel + ", userTaxIdentifierInput=" + this.userTaxIdentifierInput + ", emailViewModel=" + this.emailViewModel + ", userEmailInput=" + this.userEmailInput + ", accountViewModel=" + this.accountViewModel + ", additionalAccountsViewState=" + this.additionalAccountsViewState + ")";
        }

        public TrustFlow(BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel, String str, BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel, LocalDate localDate, BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel, String str2, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, String str3, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, BeneficiaryFlowAdditionalAccountsViewState additionalAccountsViewState) {
            Intrinsics.checkNotNullParameter(additionalAccountsViewState, "additionalAccountsViewState");
            this.nameViewModel = beneficiaryFlowTrustNameViewModel;
            this.userNameInput = str;
            this.dateViewModel = beneficiaryFlowTrustDateViewModel;
            this.userDateInput = localDate;
            this.taxIdentifierViewModel = beneficiaryFlowTrustTaxIdentifierViewModel;
            this.userTaxIdentifierInput = str2;
            this.emailViewModel = beneficiaryFlowEmailViewModel;
            this.userEmailInput = str3;
            this.accountViewModel = beneficiaryFlowAccountViewModel;
            this.additionalAccountsViewState = additionalAccountsViewState;
        }

        public final BeneficiaryFlowTrustNameViewModel getNameViewModel() {
            return this.nameViewModel;
        }

        public final String getUserNameInput() {
            return this.userNameInput;
        }

        public final BeneficiaryFlowTrustDateViewModel getDateViewModel() {
            return this.dateViewModel;
        }

        public final LocalDate getUserDateInput() {
            return this.userDateInput;
        }

        public final BeneficiaryFlowTrustTaxIdentifierViewModel getTaxIdentifierViewModel() {
            return this.taxIdentifierViewModel;
        }

        public final String getUserTaxIdentifierInput() {
            return this.userTaxIdentifierInput;
        }

        public final BeneficiaryFlowEmailViewModel getEmailViewModel() {
            return this.emailViewModel;
        }

        public final String getUserEmailInput() {
            return this.userEmailInput;
        }

        public final BeneficiaryFlowAccountViewModel getAccountViewModel() {
            return this.accountViewModel;
        }

        public /* synthetic */ TrustFlow(BeneficiaryFlowTrustNameViewModel beneficiaryFlowTrustNameViewModel, String str, BeneficiaryFlowTrustDateViewModel beneficiaryFlowTrustDateViewModel, LocalDate localDate, BeneficiaryFlowTrustTaxIdentifierViewModel beneficiaryFlowTrustTaxIdentifierViewModel, String str2, BeneficiaryFlowEmailViewModel beneficiaryFlowEmailViewModel, String str3, BeneficiaryFlowAccountViewModel beneficiaryFlowAccountViewModel, BeneficiaryFlowAdditionalAccountsViewState beneficiaryFlowAdditionalAccountsViewState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : beneficiaryFlowTrustNameViewModel, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : beneficiaryFlowTrustDateViewModel, (i & 8) != 0 ? null : localDate, (i & 16) != 0 ? null : beneficiaryFlowTrustTaxIdentifierViewModel, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : beneficiaryFlowEmailViewModel, (i & 128) != 0 ? null : str3, (i & 256) == 0 ? beneficiaryFlowAccountViewModel : null, (i & 512) != 0 ? new BeneficiaryFlowAdditionalAccountsViewState(null, null, null, 7, null) : beneficiaryFlowAdditionalAccountsViewState);
        }

        public final BeneficiaryFlowAdditionalAccountsViewState getAdditionalAccountsViewState() {
            return this.additionalAccountsViewState;
        }
    }
}
