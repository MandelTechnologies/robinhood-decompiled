package com.robinhood.android.equitytradeladder;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderScreenState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "", "Ftux", "NewNux", "ExistingNux", "NuxLoading", "Ladder", "SlideUp", "AutoSendUpsell", "BottomSheet", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$AutoSendUpsell;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$ExistingNux;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$Ftux;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$Ladder;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$NewNux;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$NuxLoading;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$SlideUp;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface LadderScreenState {

    /* compiled from: LadderScreenState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$Ftux;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ftux implements LadderScreenState {
        public static final int $stable = 0;
        public static final Ftux INSTANCE = new Ftux();

        public boolean equals(Object other) {
            return this == other || (other instanceof Ftux);
        }

        public int hashCode() {
            return -711305347;
        }

        public String toString() {
            return "Ftux";
        }

        private Ftux() {
        }
    }

    /* compiled from: LadderScreenState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$NewNux;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getDisclosure", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NewNux implements LadderScreenState {
        public static final int $stable = StringResource.$stable;
        private final StringResource disclosure;

        public static /* synthetic */ NewNux copy$default(NewNux newNux, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = newNux.disclosure;
            }
            return newNux.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getDisclosure() {
            return this.disclosure;
        }

        public final NewNux copy(StringResource disclosure) {
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            return new NewNux(disclosure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewNux) && Intrinsics.areEqual(this.disclosure, ((NewNux) other).disclosure);
        }

        public int hashCode() {
            return this.disclosure.hashCode();
        }

        public String toString() {
            return "NewNux(disclosure=" + this.disclosure + ")";
        }

        public NewNux(StringResource disclosure) {
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            this.disclosure = disclosure;
        }

        public final StringResource getDisclosure() {
            return this.disclosure;
        }
    }

    /* compiled from: LadderScreenState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$ExistingNux;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getDisclosure", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExistingNux implements LadderScreenState {
        public static final int $stable = StringResource.$stable;
        private final StringResource disclosure;

        public static /* synthetic */ ExistingNux copy$default(ExistingNux existingNux, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = existingNux.disclosure;
            }
            return existingNux.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getDisclosure() {
            return this.disclosure;
        }

        public final ExistingNux copy(StringResource disclosure) {
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            return new ExistingNux(disclosure);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExistingNux) && Intrinsics.areEqual(this.disclosure, ((ExistingNux) other).disclosure);
        }

        public int hashCode() {
            return this.disclosure.hashCode();
        }

        public String toString() {
            return "ExistingNux(disclosure=" + this.disclosure + ")";
        }

        public ExistingNux(StringResource disclosure) {
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            this.disclosure = disclosure;
        }

        public final StringResource getDisclosure() {
            return this.disclosure;
        }
    }

    /* compiled from: LadderScreenState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$NuxLoading;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NuxLoading implements LadderScreenState {
        public static final int $stable = 0;
        public static final NuxLoading INSTANCE = new NuxLoading();

        public boolean equals(Object other) {
            return this == other || (other instanceof NuxLoading);
        }

        public int hashCode() {
            return -432457993;
        }

        public String toString() {
            return "NuxLoading";
        }

        private NuxLoading() {
        }
    }

    /* compiled from: LadderScreenState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$Ladder;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ladder implements LadderScreenState {
        public static final int $stable = 0;
        public static final Ladder INSTANCE = new Ladder();

        public boolean equals(Object other) {
            return this == other || (other instanceof Ladder);
        }

        public int hashCode() {
            return -510932818;
        }

        public String toString() {
            return "Ladder";
        }

        private Ladder() {
        }
    }

    /* compiled from: LadderScreenState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$SlideUp;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "parentScreenState", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "IdentiAgreement", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$SlideUp$IdentiAgreement;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SlideUp extends LadderScreenState {
        LadderScreenState getParentScreenState();

        /* compiled from: LadderScreenState.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$SlideUp$IdentiAgreement;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$SlideUp;", "identiAgreementType", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "showConfirmationToast", "", "showUpsellOnDismiss", "parentScreenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "(Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;ZZLcom/robinhood/android/equitytradeladder/LadderScreenState;)V", "getIdentiAgreementType", "()Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "getShowConfirmationToast", "()Z", "getShowUpsellOnDismiss", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IdentiAgreement implements SlideUp {
            public static final int $stable = 8;
            private final IdentiAgreementType identiAgreementType;
            private final LadderScreenState parentScreenState;
            private final boolean showConfirmationToast;
            private final boolean showUpsellOnDismiss;

            public static /* synthetic */ IdentiAgreement copy$default(IdentiAgreement identiAgreement, IdentiAgreementType identiAgreementType, boolean z, boolean z2, LadderScreenState ladderScreenState, int i, Object obj) {
                if ((i & 1) != 0) {
                    identiAgreementType = identiAgreement.identiAgreementType;
                }
                if ((i & 2) != 0) {
                    z = identiAgreement.showConfirmationToast;
                }
                if ((i & 4) != 0) {
                    z2 = identiAgreement.showUpsellOnDismiss;
                }
                if ((i & 8) != 0) {
                    ladderScreenState = identiAgreement.parentScreenState;
                }
                return identiAgreement.copy(identiAgreementType, z, z2, ladderScreenState);
            }

            /* renamed from: component1, reason: from getter */
            public final IdentiAgreementType getIdentiAgreementType() {
                return this.identiAgreementType;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowConfirmationToast() {
                return this.showConfirmationToast;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowUpsellOnDismiss() {
                return this.showUpsellOnDismiss;
            }

            /* renamed from: component4, reason: from getter */
            public final LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }

            public final IdentiAgreement copy(IdentiAgreementType identiAgreementType, boolean showConfirmationToast, boolean showUpsellOnDismiss, LadderScreenState parentScreenState) {
                Intrinsics.checkNotNullParameter(identiAgreementType, "identiAgreementType");
                return new IdentiAgreement(identiAgreementType, showConfirmationToast, showUpsellOnDismiss, parentScreenState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IdentiAgreement)) {
                    return false;
                }
                IdentiAgreement identiAgreement = (IdentiAgreement) other;
                return Intrinsics.areEqual(this.identiAgreementType, identiAgreement.identiAgreementType) && this.showConfirmationToast == identiAgreement.showConfirmationToast && this.showUpsellOnDismiss == identiAgreement.showUpsellOnDismiss && Intrinsics.areEqual(this.parentScreenState, identiAgreement.parentScreenState);
            }

            public int hashCode() {
                int iHashCode = ((((this.identiAgreementType.hashCode() * 31) + Boolean.hashCode(this.showConfirmationToast)) * 31) + Boolean.hashCode(this.showUpsellOnDismiss)) * 31;
                LadderScreenState ladderScreenState = this.parentScreenState;
                return iHashCode + (ladderScreenState == null ? 0 : ladderScreenState.hashCode());
            }

            public String toString() {
                return "IdentiAgreement(identiAgreementType=" + this.identiAgreementType + ", showConfirmationToast=" + this.showConfirmationToast + ", showUpsellOnDismiss=" + this.showUpsellOnDismiss + ", parentScreenState=" + this.parentScreenState + ")";
            }

            public IdentiAgreement(IdentiAgreementType identiAgreementType, boolean z, boolean z2, LadderScreenState ladderScreenState) {
                Intrinsics.checkNotNullParameter(identiAgreementType, "identiAgreementType");
                this.identiAgreementType = identiAgreementType;
                this.showConfirmationToast = z;
                this.showUpsellOnDismiss = z2;
                this.parentScreenState = ladderScreenState;
            }

            public /* synthetic */ IdentiAgreement(IdentiAgreementType identiAgreementType, boolean z, boolean z2, LadderScreenState ladderScreenState, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? IdentiAgreementType.ClientDriven.EQUITIES_MOBILE_AUTO_SEND : identiAgreementType, z, z2, (i & 8) != 0 ? null : ladderScreenState);
            }

            public final IdentiAgreementType getIdentiAgreementType() {
                return this.identiAgreementType;
            }

            public final boolean getShowConfirmationToast() {
                return this.showConfirmationToast;
            }

            public final boolean getShowUpsellOnDismiss() {
                return this.showUpsellOnDismiss;
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.SlideUp
            public LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }
        }
    }

    /* compiled from: LadderScreenState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$AutoSendUpsell;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AutoSendUpsell implements LadderScreenState {
        public static final int $stable = 0;
        public static final AutoSendUpsell INSTANCE = new AutoSendUpsell();

        public boolean equals(Object other) {
            return this == other || (other instanceof AutoSendUpsell);
        }

        public int hashCode() {
            return 1642262960;
        }

        public String toString() {
            return "AutoSendUpsell";
        }

        private AutoSendUpsell() {
        }
    }

    /* compiled from: LadderScreenState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "parentScreenState", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "skipPartialState", "", "getSkipPartialState", "()Z", "QuantitySelector", "LadderSettings", "AutoSendRenew", "AutoSendIsOn", "NestedSettingsBottomSheet", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$AutoSendIsOn;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$AutoSendRenew;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$LadderSettings;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$QuantitySelector;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface BottomSheet extends LadderScreenState {
        LadderScreenState getParentScreenState();

        boolean getSkipPartialState();

        /* compiled from: LadderScreenState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$QuantitySelector;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;", "skipPartialState", "", "parentScreenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "(ZLcom/robinhood/android/equitytradeladder/LadderScreenState;)V", "getSkipPartialState", "()Z", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuantitySelector implements BottomSheet {
            public static final int $stable = 8;
            private final LadderScreenState parentScreenState;
            private final boolean skipPartialState;

            /* JADX WARN: Multi-variable type inference failed */
            public QuantitySelector() {
                this(false, null, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ QuantitySelector copy$default(QuantitySelector quantitySelector, boolean z, LadderScreenState ladderScreenState, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = quantitySelector.skipPartialState;
                }
                if ((i & 2) != 0) {
                    ladderScreenState = quantitySelector.parentScreenState;
                }
                return quantitySelector.copy(z, ladderScreenState);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSkipPartialState() {
                return this.skipPartialState;
            }

            /* renamed from: component2, reason: from getter */
            public final LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }

            public final QuantitySelector copy(boolean skipPartialState, LadderScreenState parentScreenState) {
                return new QuantitySelector(skipPartialState, parentScreenState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuantitySelector)) {
                    return false;
                }
                QuantitySelector quantitySelector = (QuantitySelector) other;
                return this.skipPartialState == quantitySelector.skipPartialState && Intrinsics.areEqual(this.parentScreenState, quantitySelector.parentScreenState);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.skipPartialState) * 31;
                LadderScreenState ladderScreenState = this.parentScreenState;
                return iHashCode + (ladderScreenState == null ? 0 : ladderScreenState.hashCode());
            }

            public String toString() {
                return "QuantitySelector(skipPartialState=" + this.skipPartialState + ", parentScreenState=" + this.parentScreenState + ")";
            }

            public QuantitySelector(boolean z, LadderScreenState ladderScreenState) {
                this.skipPartialState = z;
                this.parentScreenState = ladderScreenState;
            }

            public /* synthetic */ QuantitySelector(boolean z, LadderScreenState ladderScreenState, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : ladderScreenState);
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
            public boolean getSkipPartialState() {
                return this.skipPartialState;
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
            public LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }
        }

        /* compiled from: LadderScreenState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$LadderSettings;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;", "skipPartialState", "", "parentScreenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "(ZLcom/robinhood/android/equitytradeladder/LadderScreenState;)V", "getSkipPartialState", "()Z", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LadderSettings implements BottomSheet {
            public static final int $stable = 8;
            private final LadderScreenState parentScreenState;
            private final boolean skipPartialState;

            /* JADX WARN: Multi-variable type inference failed */
            public LadderSettings() {
                this(false, null, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ LadderSettings copy$default(LadderSettings ladderSettings, boolean z, LadderScreenState ladderScreenState, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = ladderSettings.skipPartialState;
                }
                if ((i & 2) != 0) {
                    ladderScreenState = ladderSettings.parentScreenState;
                }
                return ladderSettings.copy(z, ladderScreenState);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSkipPartialState() {
                return this.skipPartialState;
            }

            /* renamed from: component2, reason: from getter */
            public final LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }

            public final LadderSettings copy(boolean skipPartialState, LadderScreenState parentScreenState) {
                return new LadderSettings(skipPartialState, parentScreenState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LadderSettings)) {
                    return false;
                }
                LadderSettings ladderSettings = (LadderSettings) other;
                return this.skipPartialState == ladderSettings.skipPartialState && Intrinsics.areEqual(this.parentScreenState, ladderSettings.parentScreenState);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.skipPartialState) * 31;
                LadderScreenState ladderScreenState = this.parentScreenState;
                return iHashCode + (ladderScreenState == null ? 0 : ladderScreenState.hashCode());
            }

            public String toString() {
                return "LadderSettings(skipPartialState=" + this.skipPartialState + ", parentScreenState=" + this.parentScreenState + ")";
            }

            public LadderSettings(boolean z, LadderScreenState ladderScreenState) {
                this.skipPartialState = z;
                this.parentScreenState = ladderScreenState;
            }

            public /* synthetic */ LadderSettings(boolean z, LadderScreenState ladderScreenState, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : ladderScreenState);
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
            public boolean getSkipPartialState() {
                return this.skipPartialState;
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
            public LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }
        }

        /* compiled from: LadderScreenState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$AutoSendRenew;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;", "skipPartialState", "", "parentScreenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "(ZLcom/robinhood/android/equitytradeladder/LadderScreenState;)V", "getSkipPartialState", "()Z", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AutoSendRenew implements BottomSheet {
            public static final int $stable = 8;
            private final LadderScreenState parentScreenState;
            private final boolean skipPartialState;

            /* JADX WARN: Multi-variable type inference failed */
            public AutoSendRenew() {
                this(false, null, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AutoSendRenew copy$default(AutoSendRenew autoSendRenew, boolean z, LadderScreenState ladderScreenState, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = autoSendRenew.skipPartialState;
                }
                if ((i & 2) != 0) {
                    ladderScreenState = autoSendRenew.parentScreenState;
                }
                return autoSendRenew.copy(z, ladderScreenState);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSkipPartialState() {
                return this.skipPartialState;
            }

            /* renamed from: component2, reason: from getter */
            public final LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }

            public final AutoSendRenew copy(boolean skipPartialState, LadderScreenState parentScreenState) {
                return new AutoSendRenew(skipPartialState, parentScreenState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoSendRenew)) {
                    return false;
                }
                AutoSendRenew autoSendRenew = (AutoSendRenew) other;
                return this.skipPartialState == autoSendRenew.skipPartialState && Intrinsics.areEqual(this.parentScreenState, autoSendRenew.parentScreenState);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.skipPartialState) * 31;
                LadderScreenState ladderScreenState = this.parentScreenState;
                return iHashCode + (ladderScreenState == null ? 0 : ladderScreenState.hashCode());
            }

            public String toString() {
                return "AutoSendRenew(skipPartialState=" + this.skipPartialState + ", parentScreenState=" + this.parentScreenState + ")";
            }

            public AutoSendRenew(boolean z, LadderScreenState ladderScreenState) {
                this.skipPartialState = z;
                this.parentScreenState = ladderScreenState;
            }

            public /* synthetic */ AutoSendRenew(boolean z, LadderScreenState ladderScreenState, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : ladderScreenState);
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
            public boolean getSkipPartialState() {
                return this.skipPartialState;
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
            public LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }
        }

        /* compiled from: LadderScreenState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$AutoSendIsOn;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;", "skipPartialState", "", "parentScreenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "(ZLcom/robinhood/android/equitytradeladder/LadderScreenState;)V", "getSkipPartialState", "()Z", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AutoSendIsOn implements BottomSheet {
            public static final int $stable = 8;
            private final LadderScreenState parentScreenState;
            private final boolean skipPartialState;

            /* JADX WARN: Multi-variable type inference failed */
            public AutoSendIsOn() {
                this(false, null, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ AutoSendIsOn copy$default(AutoSendIsOn autoSendIsOn, boolean z, LadderScreenState ladderScreenState, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = autoSendIsOn.skipPartialState;
                }
                if ((i & 2) != 0) {
                    ladderScreenState = autoSendIsOn.parentScreenState;
                }
                return autoSendIsOn.copy(z, ladderScreenState);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSkipPartialState() {
                return this.skipPartialState;
            }

            /* renamed from: component2, reason: from getter */
            public final LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }

            public final AutoSendIsOn copy(boolean skipPartialState, LadderScreenState parentScreenState) {
                return new AutoSendIsOn(skipPartialState, parentScreenState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoSendIsOn)) {
                    return false;
                }
                AutoSendIsOn autoSendIsOn = (AutoSendIsOn) other;
                return this.skipPartialState == autoSendIsOn.skipPartialState && Intrinsics.areEqual(this.parentScreenState, autoSendIsOn.parentScreenState);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.skipPartialState) * 31;
                LadderScreenState ladderScreenState = this.parentScreenState;
                return iHashCode + (ladderScreenState == null ? 0 : ladderScreenState.hashCode());
            }

            public String toString() {
                return "AutoSendIsOn(skipPartialState=" + this.skipPartialState + ", parentScreenState=" + this.parentScreenState + ")";
            }

            public AutoSendIsOn(boolean z, LadderScreenState ladderScreenState) {
                this.skipPartialState = z;
                this.parentScreenState = ladderScreenState;
            }

            public /* synthetic */ AutoSendIsOn(boolean z, LadderScreenState ladderScreenState, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : ladderScreenState);
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
            public boolean getSkipPartialState() {
                return this.skipPartialState;
            }

            @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
            public LadderScreenState getParentScreenState() {
                return this.parentScreenState;
            }
        }

        /* compiled from: LadderScreenState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet;", "EquityTradingSession", "EquityTimeInForce", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet$EquityTimeInForce;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet$EquityTradingSession;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface NestedSettingsBottomSheet extends BottomSheet {

            /* compiled from: LadderScreenState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet$EquityTradingSession;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet;", "skipPartialState", "", "parentScreenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "(ZLcom/robinhood/android/equitytradeladder/LadderScreenState;)V", "getSkipPartialState", "()Z", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class EquityTradingSession implements NestedSettingsBottomSheet {
                public static final int $stable = 8;
                private final LadderScreenState parentScreenState;
                private final boolean skipPartialState;

                public static /* synthetic */ EquityTradingSession copy$default(EquityTradingSession equityTradingSession, boolean z, LadderScreenState ladderScreenState, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = equityTradingSession.skipPartialState;
                    }
                    if ((i & 2) != 0) {
                        ladderScreenState = equityTradingSession.parentScreenState;
                    }
                    return equityTradingSession.copy(z, ladderScreenState);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getSkipPartialState() {
                    return this.skipPartialState;
                }

                /* renamed from: component2, reason: from getter */
                public final LadderScreenState getParentScreenState() {
                    return this.parentScreenState;
                }

                public final EquityTradingSession copy(boolean skipPartialState, LadderScreenState parentScreenState) {
                    Intrinsics.checkNotNullParameter(parentScreenState, "parentScreenState");
                    return new EquityTradingSession(skipPartialState, parentScreenState);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof EquityTradingSession)) {
                        return false;
                    }
                    EquityTradingSession equityTradingSession = (EquityTradingSession) other;
                    return this.skipPartialState == equityTradingSession.skipPartialState && Intrinsics.areEqual(this.parentScreenState, equityTradingSession.parentScreenState);
                }

                public int hashCode() {
                    return (Boolean.hashCode(this.skipPartialState) * 31) + this.parentScreenState.hashCode();
                }

                public String toString() {
                    return "EquityTradingSession(skipPartialState=" + this.skipPartialState + ", parentScreenState=" + this.parentScreenState + ")";
                }

                public EquityTradingSession(boolean z, LadderScreenState parentScreenState) {
                    Intrinsics.checkNotNullParameter(parentScreenState, "parentScreenState");
                    this.skipPartialState = z;
                    this.parentScreenState = parentScreenState;
                }

                public /* synthetic */ EquityTradingSession(boolean z, LadderScreenState ladderScreenState, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? true : z, ladderScreenState);
                }

                @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
                public boolean getSkipPartialState() {
                    return this.skipPartialState;
                }

                @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
                public LadderScreenState getParentScreenState() {
                    return this.parentScreenState;
                }
            }

            /* compiled from: LadderScreenState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet$EquityTimeInForce;", "Lcom/robinhood/android/equitytradeladder/LadderScreenState$BottomSheet$NestedSettingsBottomSheet;", "skipPartialState", "", "parentScreenState", "Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "<init>", "(ZLcom/robinhood/android/equitytradeladder/LadderScreenState;)V", "getSkipPartialState", "()Z", "getParentScreenState", "()Lcom/robinhood/android/equitytradeladder/LadderScreenState;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class EquityTimeInForce implements NestedSettingsBottomSheet {
                public static final int $stable = 8;
                private final LadderScreenState parentScreenState;
                private final boolean skipPartialState;

                public static /* synthetic */ EquityTimeInForce copy$default(EquityTimeInForce equityTimeInForce, boolean z, LadderScreenState ladderScreenState, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = equityTimeInForce.skipPartialState;
                    }
                    if ((i & 2) != 0) {
                        ladderScreenState = equityTimeInForce.parentScreenState;
                    }
                    return equityTimeInForce.copy(z, ladderScreenState);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getSkipPartialState() {
                    return this.skipPartialState;
                }

                /* renamed from: component2, reason: from getter */
                public final LadderScreenState getParentScreenState() {
                    return this.parentScreenState;
                }

                public final EquityTimeInForce copy(boolean skipPartialState, LadderScreenState parentScreenState) {
                    Intrinsics.checkNotNullParameter(parentScreenState, "parentScreenState");
                    return new EquityTimeInForce(skipPartialState, parentScreenState);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof EquityTimeInForce)) {
                        return false;
                    }
                    EquityTimeInForce equityTimeInForce = (EquityTimeInForce) other;
                    return this.skipPartialState == equityTimeInForce.skipPartialState && Intrinsics.areEqual(this.parentScreenState, equityTimeInForce.parentScreenState);
                }

                public int hashCode() {
                    return (Boolean.hashCode(this.skipPartialState) * 31) + this.parentScreenState.hashCode();
                }

                public String toString() {
                    return "EquityTimeInForce(skipPartialState=" + this.skipPartialState + ", parentScreenState=" + this.parentScreenState + ")";
                }

                public EquityTimeInForce(boolean z, LadderScreenState parentScreenState) {
                    Intrinsics.checkNotNullParameter(parentScreenState, "parentScreenState");
                    this.skipPartialState = z;
                    this.parentScreenState = parentScreenState;
                }

                public /* synthetic */ EquityTimeInForce(boolean z, LadderScreenState ladderScreenState, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? true : z, ladderScreenState);
                }

                @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
                public boolean getSkipPartialState() {
                    return this.skipPartialState;
                }

                @Override // com.robinhood.android.equitytradeladder.LadderScreenState.BottomSheet
                public LadderScreenState getParentScreenState() {
                    return this.parentScreenState;
                }
            }
        }
    }
}
