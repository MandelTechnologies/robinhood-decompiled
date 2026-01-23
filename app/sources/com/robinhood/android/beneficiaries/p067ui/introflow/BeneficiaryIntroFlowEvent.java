package com.robinhood.android.beneficiaries.p067ui.introflow;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryRoleViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryTypeViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryIntroFlowEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent;", "", "NavigateToInfoScreen", "NavigateToAgreementScreen", "NavigateToRoleScreen", "NavigateToTypeScreen", "CompleteIntroFlow", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$CompleteIntroFlow;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$NavigateToAgreementScreen;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$NavigateToInfoScreen;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$NavigateToRoleScreen;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$NavigateToTypeScreen;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface BeneficiaryIntroFlowEvent {

    /* compiled from: BeneficiaryIntroFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$NavigateToInfoScreen;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent;", "infoViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;)V", "getInfoViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToInfoScreen implements BeneficiaryIntroFlowEvent {
        public static final int $stable = 8;
        private final BeneficiaryInfoViewModel infoViewModel;

        public static /* synthetic */ NavigateToInfoScreen copy$default(NavigateToInfoScreen navigateToInfoScreen, BeneficiaryInfoViewModel beneficiaryInfoViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryInfoViewModel = navigateToInfoScreen.infoViewModel;
            }
            return navigateToInfoScreen.copy(beneficiaryInfoViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryInfoViewModel getInfoViewModel() {
            return this.infoViewModel;
        }

        public final NavigateToInfoScreen copy(BeneficiaryInfoViewModel infoViewModel) {
            Intrinsics.checkNotNullParameter(infoViewModel, "infoViewModel");
            return new NavigateToInfoScreen(infoViewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToInfoScreen) && Intrinsics.areEqual(this.infoViewModel, ((NavigateToInfoScreen) other).infoViewModel);
        }

        public int hashCode() {
            return this.infoViewModel.hashCode();
        }

        public String toString() {
            return "NavigateToInfoScreen(infoViewModel=" + this.infoViewModel + ")";
        }

        public NavigateToInfoScreen(BeneficiaryInfoViewModel infoViewModel) {
            Intrinsics.checkNotNullParameter(infoViewModel, "infoViewModel");
            this.infoViewModel = infoViewModel;
        }

        public final BeneficiaryInfoViewModel getInfoViewModel() {
            return this.infoViewModel;
        }
    }

    /* compiled from: BeneficiaryIntroFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$NavigateToAgreementScreen;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent;", "agreementViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;)V", "getAgreementViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToAgreementScreen implements BeneficiaryIntroFlowEvent {
        public static final int $stable = 8;
        private final BeneficiaryFlowAgreementViewModel agreementViewModel;

        public static /* synthetic */ NavigateToAgreementScreen copy$default(NavigateToAgreementScreen navigateToAgreementScreen, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowAgreementViewModel = navigateToAgreementScreen.agreementViewModel;
            }
            return navigateToAgreementScreen.copy(beneficiaryFlowAgreementViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
            return this.agreementViewModel;
        }

        public final NavigateToAgreementScreen copy(BeneficiaryFlowAgreementViewModel agreementViewModel) {
            Intrinsics.checkNotNullParameter(agreementViewModel, "agreementViewModel");
            return new NavigateToAgreementScreen(agreementViewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToAgreementScreen) && Intrinsics.areEqual(this.agreementViewModel, ((NavigateToAgreementScreen) other).agreementViewModel);
        }

        public int hashCode() {
            return this.agreementViewModel.hashCode();
        }

        public String toString() {
            return "NavigateToAgreementScreen(agreementViewModel=" + this.agreementViewModel + ")";
        }

        public NavigateToAgreementScreen(BeneficiaryFlowAgreementViewModel agreementViewModel) {
            Intrinsics.checkNotNullParameter(agreementViewModel, "agreementViewModel");
            this.agreementViewModel = agreementViewModel;
        }

        public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
            return this.agreementViewModel;
        }
    }

    /* compiled from: BeneficiaryIntroFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$NavigateToRoleScreen;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent;", "beneficiaryRoleViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;)V", "getBeneficiaryRoleViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToRoleScreen implements BeneficiaryIntroFlowEvent {
        public static final int $stable = 8;
        private final BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryRoleViewModel;

        public static /* synthetic */ NavigateToRoleScreen copy$default(NavigateToRoleScreen navigateToRoleScreen, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowBeneficiaryRoleViewModel = navigateToRoleScreen.beneficiaryRoleViewModel;
            }
            return navigateToRoleScreen.copy(beneficiaryFlowBeneficiaryRoleViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowBeneficiaryRoleViewModel getBeneficiaryRoleViewModel() {
            return this.beneficiaryRoleViewModel;
        }

        public final NavigateToRoleScreen copy(BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryRoleViewModel) {
            Intrinsics.checkNotNullParameter(beneficiaryRoleViewModel, "beneficiaryRoleViewModel");
            return new NavigateToRoleScreen(beneficiaryRoleViewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToRoleScreen) && Intrinsics.areEqual(this.beneficiaryRoleViewModel, ((NavigateToRoleScreen) other).beneficiaryRoleViewModel);
        }

        public int hashCode() {
            return this.beneficiaryRoleViewModel.hashCode();
        }

        public String toString() {
            return "NavigateToRoleScreen(beneficiaryRoleViewModel=" + this.beneficiaryRoleViewModel + ")";
        }

        public NavigateToRoleScreen(BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryRoleViewModel) {
            Intrinsics.checkNotNullParameter(beneficiaryRoleViewModel, "beneficiaryRoleViewModel");
            this.beneficiaryRoleViewModel = beneficiaryRoleViewModel;
        }

        public final BeneficiaryFlowBeneficiaryRoleViewModel getBeneficiaryRoleViewModel() {
            return this.beneficiaryRoleViewModel;
        }
    }

    /* compiled from: BeneficiaryIntroFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$NavigateToTypeScreen;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent;", "beneficiaryTypeViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;)V", "getBeneficiaryTypeViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToTypeScreen implements BeneficiaryIntroFlowEvent {
        public static final int $stable = 8;
        private final BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel;

        public static /* synthetic */ NavigateToTypeScreen copy$default(NavigateToTypeScreen navigateToTypeScreen, BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryFlowBeneficiaryTypeViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowBeneficiaryTypeViewModel = navigateToTypeScreen.beneficiaryTypeViewModel;
            }
            return navigateToTypeScreen.copy(beneficiaryFlowBeneficiaryTypeViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowBeneficiaryTypeViewModel getBeneficiaryTypeViewModel() {
            return this.beneficiaryTypeViewModel;
        }

        public final NavigateToTypeScreen copy(BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel) {
            Intrinsics.checkNotNullParameter(beneficiaryTypeViewModel, "beneficiaryTypeViewModel");
            return new NavigateToTypeScreen(beneficiaryTypeViewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToTypeScreen) && Intrinsics.areEqual(this.beneficiaryTypeViewModel, ((NavigateToTypeScreen) other).beneficiaryTypeViewModel);
        }

        public int hashCode() {
            return this.beneficiaryTypeViewModel.hashCode();
        }

        public String toString() {
            return "NavigateToTypeScreen(beneficiaryTypeViewModel=" + this.beneficiaryTypeViewModel + ")";
        }

        public NavigateToTypeScreen(BeneficiaryFlowBeneficiaryTypeViewModel beneficiaryTypeViewModel) {
            Intrinsics.checkNotNullParameter(beneficiaryTypeViewModel, "beneficiaryTypeViewModel");
            this.beneficiaryTypeViewModel = beneficiaryTypeViewModel;
        }

        public final BeneficiaryFlowBeneficiaryTypeViewModel getBeneficiaryTypeViewModel() {
            return this.beneficiaryTypeViewModel;
        }
    }

    /* compiled from: BeneficiaryIntroFlowEvent.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent$CompleteIntroFlow;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowEvent;", "beneficiaryType", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "signedAgreementTypes", "", "", "beneficiaryRole", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "agreementViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;Ljava/util/List;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;)V", "getBeneficiaryType", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "getSignedAgreementTypes", "()Ljava/util/List;", "getBeneficiaryRole", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "getAgreementViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CompleteIntroFlow implements BeneficiaryIntroFlowEvent {
        public static final int $stable = 8;
        private final BeneficiaryFlowAgreementViewModel agreementViewModel;
        private final BeneficiaryRole beneficiaryRole;
        private final BeneficiaryType beneficiaryType;
        private final List<String> signedAgreementTypes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CompleteIntroFlow copy$default(CompleteIntroFlow completeIntroFlow, BeneficiaryType beneficiaryType, List list, BeneficiaryRole beneficiaryRole, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryType = completeIntroFlow.beneficiaryType;
            }
            if ((i & 2) != 0) {
                list = completeIntroFlow.signedAgreementTypes;
            }
            if ((i & 4) != 0) {
                beneficiaryRole = completeIntroFlow.beneficiaryRole;
            }
            if ((i & 8) != 0) {
                beneficiaryFlowAgreementViewModel = completeIntroFlow.agreementViewModel;
            }
            return completeIntroFlow.copy(beneficiaryType, list, beneficiaryRole, beneficiaryFlowAgreementViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryType getBeneficiaryType() {
            return this.beneficiaryType;
        }

        public final List<String> component2() {
            return this.signedAgreementTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final BeneficiaryRole getBeneficiaryRole() {
            return this.beneficiaryRole;
        }

        /* renamed from: component4, reason: from getter */
        public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
            return this.agreementViewModel;
        }

        public final CompleteIntroFlow copy(BeneficiaryType beneficiaryType, List<String> signedAgreementTypes, BeneficiaryRole beneficiaryRole, BeneficiaryFlowAgreementViewModel agreementViewModel) {
            Intrinsics.checkNotNullParameter(beneficiaryType, "beneficiaryType");
            Intrinsics.checkNotNullParameter(signedAgreementTypes, "signedAgreementTypes");
            return new CompleteIntroFlow(beneficiaryType, signedAgreementTypes, beneficiaryRole, agreementViewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompleteIntroFlow)) {
                return false;
            }
            CompleteIntroFlow completeIntroFlow = (CompleteIntroFlow) other;
            return this.beneficiaryType == completeIntroFlow.beneficiaryType && Intrinsics.areEqual(this.signedAgreementTypes, completeIntroFlow.signedAgreementTypes) && this.beneficiaryRole == completeIntroFlow.beneficiaryRole && Intrinsics.areEqual(this.agreementViewModel, completeIntroFlow.agreementViewModel);
        }

        public int hashCode() {
            int iHashCode = ((this.beneficiaryType.hashCode() * 31) + this.signedAgreementTypes.hashCode()) * 31;
            BeneficiaryRole beneficiaryRole = this.beneficiaryRole;
            int iHashCode2 = (iHashCode + (beneficiaryRole == null ? 0 : beneficiaryRole.hashCode())) * 31;
            BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel = this.agreementViewModel;
            return iHashCode2 + (beneficiaryFlowAgreementViewModel != null ? beneficiaryFlowAgreementViewModel.hashCode() : 0);
        }

        public String toString() {
            return "CompleteIntroFlow(beneficiaryType=" + this.beneficiaryType + ", signedAgreementTypes=" + this.signedAgreementTypes + ", beneficiaryRole=" + this.beneficiaryRole + ", agreementViewModel=" + this.agreementViewModel + ")";
        }

        public CompleteIntroFlow(BeneficiaryType beneficiaryType, List<String> signedAgreementTypes, BeneficiaryRole beneficiaryRole, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel) {
            Intrinsics.checkNotNullParameter(beneficiaryType, "beneficiaryType");
            Intrinsics.checkNotNullParameter(signedAgreementTypes, "signedAgreementTypes");
            this.beneficiaryType = beneficiaryType;
            this.signedAgreementTypes = signedAgreementTypes;
            this.beneficiaryRole = beneficiaryRole;
            this.agreementViewModel = beneficiaryFlowAgreementViewModel;
        }

        public final BeneficiaryType getBeneficiaryType() {
            return this.beneficiaryType;
        }

        public final List<String> getSignedAgreementTypes() {
            return this.signedAgreementTypes;
        }

        public final BeneficiaryRole getBeneficiaryRole() {
            return this.beneficiaryRole;
        }

        public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
            return this.agreementViewModel;
        }
    }
}
