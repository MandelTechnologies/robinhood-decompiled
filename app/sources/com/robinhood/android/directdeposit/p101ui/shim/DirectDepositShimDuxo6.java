package com.robinhood.android.directdeposit.p101ui.shim;

import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.AccountSpecificNonOriginatedTransferInfo;
import com.robinhood.android.transfers.contracts.DirectDepositBrokerageExperimentKey;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositShimDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState;", "", "<init>", "()V", "Loading", "Loaded", "DeactivatedAccount", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState$DeactivatedAccount;", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState$Loading;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimState, reason: use source file name */
/* loaded from: classes27.dex */
public abstract class DirectDepositShimDuxo6 {
    public static final int $stable = 0;

    public /* synthetic */ DirectDepositShimDuxo6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DirectDepositShimDuxo6() {
    }

    /* compiled from: DirectDepositShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState$Loading;", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimState$Loading */
    public static final /* data */ class Loading extends DirectDepositShimDuxo6 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1148707065;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: DirectDepositShimDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0016\u001a\u00020\u0003HÂ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÂ\u0003J\t\u0010 \u001a\u00020\u0003HÂ\u0003J}\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState;", "hasRhyAccount", "", "transferAccounts", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "hasRhsDirectDepositRelationship", "requireCashManagement", "fromRhyMigration", "fromManualSetupDeeplink", "fromDDOnboardingFlow", "showEarlyPayHook", "showConfirmationScreen", "fromDirectDepositToBrokerageDeepLink", "fromTransfersHub", "<init>", "(ZLjava/util/List;ZZZZZZZZZ)V", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends DirectDepositShimDuxo6 {
        public static final int $stable = 8;
        private final boolean fromDDOnboardingFlow;
        private final boolean fromDirectDepositToBrokerageDeepLink;
        private final boolean fromManualSetupDeeplink;
        private final boolean fromRhyMigration;
        private final boolean fromTransfersHub;
        private final boolean hasRhsDirectDepositRelationship;
        private final boolean hasRhyAccount;
        private final IntentKey intentKey;
        private final boolean requireCashManagement;
        private final boolean showConfirmationScreen;
        private final boolean showEarlyPayHook;
        private final List<TransferAccount> transferAccounts;

        /* renamed from: component1, reason: from getter */
        private final boolean getHasRhyAccount() {
            return this.hasRhyAccount;
        }

        /* renamed from: component10, reason: from getter */
        private final boolean getFromDirectDepositToBrokerageDeepLink() {
            return this.fromDirectDepositToBrokerageDeepLink;
        }

        /* renamed from: component11, reason: from getter */
        private final boolean getFromTransfersHub() {
            return this.fromTransfersHub;
        }

        private final List<TransferAccount> component2() {
            return this.transferAccounts;
        }

        /* renamed from: component3, reason: from getter */
        private final boolean getHasRhsDirectDepositRelationship() {
            return this.hasRhsDirectDepositRelationship;
        }

        /* renamed from: component4, reason: from getter */
        private final boolean getRequireCashManagement() {
            return this.requireCashManagement;
        }

        /* renamed from: component5, reason: from getter */
        private final boolean getFromRhyMigration() {
            return this.fromRhyMigration;
        }

        /* renamed from: component6, reason: from getter */
        private final boolean getFromManualSetupDeeplink() {
            return this.fromManualSetupDeeplink;
        }

        /* renamed from: component7, reason: from getter */
        private final boolean getFromDDOnboardingFlow() {
            return this.fromDDOnboardingFlow;
        }

        /* renamed from: component8, reason: from getter */
        private final boolean getShowEarlyPayHook() {
            return this.showEarlyPayHook;
        }

        /* renamed from: component9, reason: from getter */
        private final boolean getShowConfirmationScreen() {
            return this.showConfirmationScreen;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, List list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.hasRhyAccount;
            }
            if ((i & 2) != 0) {
                list = loaded.transferAccounts;
            }
            if ((i & 4) != 0) {
                z2 = loaded.hasRhsDirectDepositRelationship;
            }
            if ((i & 8) != 0) {
                z3 = loaded.requireCashManagement;
            }
            if ((i & 16) != 0) {
                z4 = loaded.fromRhyMigration;
            }
            if ((i & 32) != 0) {
                z5 = loaded.fromManualSetupDeeplink;
            }
            if ((i & 64) != 0) {
                z6 = loaded.fromDDOnboardingFlow;
            }
            if ((i & 128) != 0) {
                z7 = loaded.showEarlyPayHook;
            }
            if ((i & 256) != 0) {
                z8 = loaded.showConfirmationScreen;
            }
            if ((i & 512) != 0) {
                z9 = loaded.fromDirectDepositToBrokerageDeepLink;
            }
            if ((i & 1024) != 0) {
                z10 = loaded.fromTransfersHub;
            }
            boolean z11 = z9;
            boolean z12 = z10;
            boolean z13 = z7;
            boolean z14 = z8;
            boolean z15 = z5;
            boolean z16 = z6;
            boolean z17 = z4;
            boolean z18 = z2;
            return loaded.copy(z, list, z18, z3, z17, z15, z16, z13, z14, z11, z12);
        }

        public final Loaded copy(boolean hasRhyAccount, List<TransferAccount> transferAccounts, boolean hasRhsDirectDepositRelationship, boolean requireCashManagement, boolean fromRhyMigration, boolean fromManualSetupDeeplink, boolean fromDDOnboardingFlow, boolean showEarlyPayHook, boolean showConfirmationScreen, boolean fromDirectDepositToBrokerageDeepLink, boolean fromTransfersHub) {
            Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
            return new Loaded(hasRhyAccount, transferAccounts, hasRhsDirectDepositRelationship, requireCashManagement, fromRhyMigration, fromManualSetupDeeplink, fromDDOnboardingFlow, showEarlyPayHook, showConfirmationScreen, fromDirectDepositToBrokerageDeepLink, fromTransfersHub);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.hasRhyAccount == loaded.hasRhyAccount && Intrinsics.areEqual(this.transferAccounts, loaded.transferAccounts) && this.hasRhsDirectDepositRelationship == loaded.hasRhsDirectDepositRelationship && this.requireCashManagement == loaded.requireCashManagement && this.fromRhyMigration == loaded.fromRhyMigration && this.fromManualSetupDeeplink == loaded.fromManualSetupDeeplink && this.fromDDOnboardingFlow == loaded.fromDDOnboardingFlow && this.showEarlyPayHook == loaded.showEarlyPayHook && this.showConfirmationScreen == loaded.showConfirmationScreen && this.fromDirectDepositToBrokerageDeepLink == loaded.fromDirectDepositToBrokerageDeepLink && this.fromTransfersHub == loaded.fromTransfersHub;
        }

        public int hashCode() {
            return (((((((((((((((((((Boolean.hashCode(this.hasRhyAccount) * 31) + this.transferAccounts.hashCode()) * 31) + Boolean.hashCode(this.hasRhsDirectDepositRelationship)) * 31) + Boolean.hashCode(this.requireCashManagement)) * 31) + Boolean.hashCode(this.fromRhyMigration)) * 31) + Boolean.hashCode(this.fromManualSetupDeeplink)) * 31) + Boolean.hashCode(this.fromDDOnboardingFlow)) * 31) + Boolean.hashCode(this.showEarlyPayHook)) * 31) + Boolean.hashCode(this.showConfirmationScreen)) * 31) + Boolean.hashCode(this.fromDirectDepositToBrokerageDeepLink)) * 31) + Boolean.hashCode(this.fromTransfersHub);
        }

        public String toString() {
            return "Loaded(hasRhyAccount=" + this.hasRhyAccount + ", transferAccounts=" + this.transferAccounts + ", hasRhsDirectDepositRelationship=" + this.hasRhsDirectDepositRelationship + ", requireCashManagement=" + this.requireCashManagement + ", fromRhyMigration=" + this.fromRhyMigration + ", fromManualSetupDeeplink=" + this.fromManualSetupDeeplink + ", fromDDOnboardingFlow=" + this.fromDDOnboardingFlow + ", showEarlyPayHook=" + this.showEarlyPayHook + ", showConfirmationScreen=" + this.showConfirmationScreen + ", fromDirectDepositToBrokerageDeepLink=" + this.fromDirectDepositToBrokerageDeepLink + ", fromTransfersHub=" + this.fromTransfersHub + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(boolean z, List<TransferAccount> transferAccounts, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
            IntentKey showFragmentInStandaloneActivity;
            super(false ? 1 : 0);
            Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
            IntentKey directDepositBrokerageExperimentKey = null;
            this.hasRhyAccount = z;
            this.transferAccounts = transferAccounts;
            this.hasRhsDirectDepositRelationship = z2;
            this.requireCashManagement = z3;
            this.fromRhyMigration = z4;
            this.fromManualSetupDeeplink = z5;
            this.fromDDOnboardingFlow = z6;
            this.showEarlyPayHook = z7;
            this.showConfirmationScreen = z8;
            this.fromDirectDepositToBrokerageDeepLink = z9;
            this.fromTransfersHub = z10;
            boolean z11 = false;
            if (z10 || z9) {
                if (HasMultipleSelfDirectedIndividualAccounts.hasMultipleSelfDirectedIndividualAccounts(transferAccounts)) {
                    showFragmentInStandaloneActivity = new HostIntentKey.ShowFragmentInStandaloneActivity(new AccountSpecificNonOriginatedTransferInfo(NonOriginatedTransferTypeDto.f314DD), false, 2, null);
                    directDepositBrokerageExperimentKey = showFragmentInStandaloneActivity;
                } else {
                    directDepositBrokerageExperimentKey = new DirectDepositBrokerageExperimentKey();
                }
            } else if (!z4 || z2) {
                if (HasMultipleSelfDirectedIndividualAccounts.hasMultipleSelfDirectedIndividualAccounts(transferAccounts)) {
                    showFragmentInStandaloneActivity = new HostIntentKey.ShowFragmentInStandaloneActivity(new AccountSpecificNonOriginatedTransferInfo(NonOriginatedTransferTypeDto.f314DD), false, 2, null);
                    directDepositBrokerageExperimentKey = showFragmentInStandaloneActivity;
                } else {
                    if (!z6 && !z5) {
                        z11 = true;
                    }
                    directDepositBrokerageExperimentKey = new LegacyIntentKey.DirectDepositSetup(z11, z7, z4, z6, true);
                }
            }
            this.intentKey = directDepositBrokerageExperimentKey;
        }

        public final IntentKey getIntentKey() {
            return this.intentKey;
        }
    }

    /* compiled from: DirectDepositShimDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState$DeactivatedAccount;", "Lcom/robinhood/android/directdeposit/ui/shim/DirectDepositShimState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.shim.DirectDepositShimState$DeactivatedAccount */
    public static final /* data */ class DeactivatedAccount extends DirectDepositShimDuxo6 {
        public static final int $stable = 0;
        public static final DeactivatedAccount INSTANCE = new DeactivatedAccount();

        public boolean equals(Object other) {
            return this == other || (other instanceof DeactivatedAccount);
        }

        public int hashCode() {
            return 770342336;
        }

        public String toString() {
            return "DeactivatedAccount";
        }

        private DeactivatedAccount() {
            super(null);
        }
    }
}
