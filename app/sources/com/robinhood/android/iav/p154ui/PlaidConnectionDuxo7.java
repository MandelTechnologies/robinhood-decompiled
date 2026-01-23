package com.robinhood.android.iav.p154ui;

import com.robinhood.models.api.IavAccount;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaidConnectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "", "NavigateToDebitCard", "NavigateToManualLinkingScreen", "CloseScreen", "LogAppear", "NavigateToQueuedDepositScreen", "NavigateToOnboardingGoldNativeFundingUpsell", "NavigateToCreateIavRelationship", "NavigateToNormalDepositScreen", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$CloseScreen;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$LogAppear;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToCreateIavRelationship;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToDebitCard;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToManualLinkingScreen;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToNormalDepositScreen;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToOnboardingGoldNativeFundingUpsell;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToQueuedDepositScreen;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents, reason: use source file name */
/* loaded from: classes10.dex */
public interface PlaidConnectionDuxo7 {

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToDebitCard;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "<init>", "()V", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents$NavigateToDebitCard */
    public static final class NavigateToDebitCard implements PlaidConnectionDuxo7 {
        public static final int $stable = 0;
        public static final NavigateToDebitCard INSTANCE = new NavigateToDebitCard();

        private NavigateToDebitCard() {
        }
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToManualLinkingScreen;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "<init>", "(Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;)V", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents$NavigateToManualLinkingScreen, reason: from toString */
    public static final /* data */ class NavigateToManualLinkingScreen implements PlaidConnectionDuxo7 {
        public static final int $stable = 8;
        private final PlaidIavMetadata plaidIavMetadata;

        public static /* synthetic */ NavigateToManualLinkingScreen copy$default(NavigateToManualLinkingScreen navigateToManualLinkingScreen, PlaidIavMetadata plaidIavMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                plaidIavMetadata = navigateToManualLinkingScreen.plaidIavMetadata;
            }
            return navigateToManualLinkingScreen.copy(plaidIavMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final PlaidIavMetadata getPlaidIavMetadata() {
            return this.plaidIavMetadata;
        }

        public final NavigateToManualLinkingScreen copy(PlaidIavMetadata plaidIavMetadata) {
            return new NavigateToManualLinkingScreen(plaidIavMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToManualLinkingScreen) && Intrinsics.areEqual(this.plaidIavMetadata, ((NavigateToManualLinkingScreen) other).plaidIavMetadata);
        }

        public int hashCode() {
            PlaidIavMetadata plaidIavMetadata = this.plaidIavMetadata;
            if (plaidIavMetadata == null) {
                return 0;
            }
            return plaidIavMetadata.hashCode();
        }

        public String toString() {
            return "NavigateToManualLinkingScreen(plaidIavMetadata=" + this.plaidIavMetadata + ")";
        }

        public NavigateToManualLinkingScreen(PlaidIavMetadata plaidIavMetadata) {
            this.plaidIavMetadata = plaidIavMetadata;
        }

        public final PlaidIavMetadata getPlaidIavMetadata() {
            return this.plaidIavMetadata;
        }
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$CloseScreen;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "<init>", "()V", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents$CloseScreen */
    public static final class CloseScreen implements PlaidConnectionDuxo7 {
        public static final int $stable = 0;
        public static final CloseScreen INSTANCE = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$LogAppear;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "<init>", "()V", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents$LogAppear */
    public static final class LogAppear implements PlaidConnectionDuxo7 {
        public static final int $stable = 0;
        public static final LogAppear INSTANCE = new LogAppear();

        private LogAppear() {
        }
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToQueuedDepositScreen;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "accessToken", "", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/IavAccount;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;)V", "getAccessToken", "()Ljava/lang/String;", "getIavAccount", "()Lcom/robinhood/models/api/IavAccount;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents$NavigateToQueuedDepositScreen, reason: from toString */
    public static final /* data */ class NavigateToQueuedDepositScreen implements PlaidConnectionDuxo7 {
        public static final int $stable = 8;
        private final String accessToken;
        private final IavAccount iavAccount;
        private final PlaidIavMetadata plaidIavMetadata;

        public static /* synthetic */ NavigateToQueuedDepositScreen copy$default(NavigateToQueuedDepositScreen navigateToQueuedDepositScreen, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToQueuedDepositScreen.accessToken;
            }
            if ((i & 2) != 0) {
                iavAccount = navigateToQueuedDepositScreen.iavAccount;
            }
            if ((i & 4) != 0) {
                plaidIavMetadata = navigateToQueuedDepositScreen.plaidIavMetadata;
            }
            return navigateToQueuedDepositScreen.copy(str, iavAccount, plaidIavMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: component2, reason: from getter */
        public final IavAccount getIavAccount() {
            return this.iavAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final PlaidIavMetadata getPlaidIavMetadata() {
            return this.plaidIavMetadata;
        }

        public final NavigateToQueuedDepositScreen copy(String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
            Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
            return new NavigateToQueuedDepositScreen(accessToken, iavAccount, plaidIavMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToQueuedDepositScreen)) {
                return false;
            }
            NavigateToQueuedDepositScreen navigateToQueuedDepositScreen = (NavigateToQueuedDepositScreen) other;
            return Intrinsics.areEqual(this.accessToken, navigateToQueuedDepositScreen.accessToken) && Intrinsics.areEqual(this.iavAccount, navigateToQueuedDepositScreen.iavAccount) && Intrinsics.areEqual(this.plaidIavMetadata, navigateToQueuedDepositScreen.plaidIavMetadata);
        }

        public int hashCode() {
            return (((this.accessToken.hashCode() * 31) + this.iavAccount.hashCode()) * 31) + this.plaidIavMetadata.hashCode();
        }

        public String toString() {
            return "NavigateToQueuedDepositScreen(accessToken=" + this.accessToken + ", iavAccount=" + this.iavAccount + ", plaidIavMetadata=" + this.plaidIavMetadata + ")";
        }

        public NavigateToQueuedDepositScreen(String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
            Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
            this.accessToken = accessToken;
            this.iavAccount = iavAccount;
            this.plaidIavMetadata = plaidIavMetadata;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final IavAccount getIavAccount() {
            return this.iavAccount;
        }

        public final PlaidIavMetadata getPlaidIavMetadata() {
            return this.plaidIavMetadata;
        }
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToOnboardingGoldNativeFundingUpsell;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "isGoldBackupBillingMember", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents$NavigateToOnboardingGoldNativeFundingUpsell, reason: from toString */
    public static final /* data */ class NavigateToOnboardingGoldNativeFundingUpsell implements PlaidConnectionDuxo7 {
        public static final int $stable = 0;
        private final boolean isGoldBackupBillingMember;

        public static /* synthetic */ NavigateToOnboardingGoldNativeFundingUpsell copy$default(NavigateToOnboardingGoldNativeFundingUpsell navigateToOnboardingGoldNativeFundingUpsell, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = navigateToOnboardingGoldNativeFundingUpsell.isGoldBackupBillingMember;
            }
            return navigateToOnboardingGoldNativeFundingUpsell.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsGoldBackupBillingMember() {
            return this.isGoldBackupBillingMember;
        }

        public final NavigateToOnboardingGoldNativeFundingUpsell copy(boolean isGoldBackupBillingMember) {
            return new NavigateToOnboardingGoldNativeFundingUpsell(isGoldBackupBillingMember);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToOnboardingGoldNativeFundingUpsell) && this.isGoldBackupBillingMember == ((NavigateToOnboardingGoldNativeFundingUpsell) other).isGoldBackupBillingMember;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isGoldBackupBillingMember);
        }

        public String toString() {
            return "NavigateToOnboardingGoldNativeFundingUpsell(isGoldBackupBillingMember=" + this.isGoldBackupBillingMember + ")";
        }

        public NavigateToOnboardingGoldNativeFundingUpsell(boolean z) {
            this.isGoldBackupBillingMember = z;
        }

        public final boolean isGoldBackupBillingMember() {
            return this.isGoldBackupBillingMember;
        }
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToCreateIavRelationship;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "isGoldBackupBillingMember", "", "accessToken", "", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/models/api/IavAccount;Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;)V", "()Z", "getAccessToken", "()Ljava/lang/String;", "getIavAccount", "()Lcom/robinhood/models/api/IavAccount;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents$NavigateToCreateIavRelationship, reason: from toString */
    public static final /* data */ class NavigateToCreateIavRelationship implements PlaidConnectionDuxo7 {
        public static final int $stable = 8;
        private final String accessToken;
        private final IavAccount iavAccount;
        private final boolean isGoldBackupBillingMember;
        private final PlaidIavMetadata plaidIavMetadata;

        public static /* synthetic */ NavigateToCreateIavRelationship copy$default(NavigateToCreateIavRelationship navigateToCreateIavRelationship, boolean z, String str, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                z = navigateToCreateIavRelationship.isGoldBackupBillingMember;
            }
            if ((i & 2) != 0) {
                str = navigateToCreateIavRelationship.accessToken;
            }
            if ((i & 4) != 0) {
                iavAccount = navigateToCreateIavRelationship.iavAccount;
            }
            if ((i & 8) != 0) {
                plaidIavMetadata = navigateToCreateIavRelationship.plaidIavMetadata;
            }
            return navigateToCreateIavRelationship.copy(z, str, iavAccount, plaidIavMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsGoldBackupBillingMember() {
            return this.isGoldBackupBillingMember;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: component3, reason: from getter */
        public final IavAccount getIavAccount() {
            return this.iavAccount;
        }

        /* renamed from: component4, reason: from getter */
        public final PlaidIavMetadata getPlaidIavMetadata() {
            return this.plaidIavMetadata;
        }

        public final NavigateToCreateIavRelationship copy(boolean isGoldBackupBillingMember, String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
            Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
            return new NavigateToCreateIavRelationship(isGoldBackupBillingMember, accessToken, iavAccount, plaidIavMetadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToCreateIavRelationship)) {
                return false;
            }
            NavigateToCreateIavRelationship navigateToCreateIavRelationship = (NavigateToCreateIavRelationship) other;
            return this.isGoldBackupBillingMember == navigateToCreateIavRelationship.isGoldBackupBillingMember && Intrinsics.areEqual(this.accessToken, navigateToCreateIavRelationship.accessToken) && Intrinsics.areEqual(this.iavAccount, navigateToCreateIavRelationship.iavAccount) && Intrinsics.areEqual(this.plaidIavMetadata, navigateToCreateIavRelationship.plaidIavMetadata);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isGoldBackupBillingMember) * 31) + this.accessToken.hashCode()) * 31) + this.iavAccount.hashCode()) * 31) + this.plaidIavMetadata.hashCode();
        }

        public String toString() {
            return "NavigateToCreateIavRelationship(isGoldBackupBillingMember=" + this.isGoldBackupBillingMember + ", accessToken=" + this.accessToken + ", iavAccount=" + this.iavAccount + ", plaidIavMetadata=" + this.plaidIavMetadata + ")";
        }

        public NavigateToCreateIavRelationship(boolean z, String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
            Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
            this.isGoldBackupBillingMember = z;
            this.accessToken = accessToken;
            this.iavAccount = iavAccount;
            this.plaidIavMetadata = plaidIavMetadata;
        }

        public final boolean isGoldBackupBillingMember() {
            return this.isGoldBackupBillingMember;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final IavAccount getIavAccount() {
            return this.iavAccount;
        }

        public final PlaidIavMetadata getPlaidIavMetadata() {
            return this.plaidIavMetadata;
        }
    }

    /* compiled from: PlaidConnectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents$NavigateToNormalDepositScreen;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "accessToken", "", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/IavAccount;)V", "getAccessToken", "()Ljava/lang/String;", "getIavAccount", "()Lcom/robinhood/models/api/IavAccount;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionDuxoEvents$NavigateToNormalDepositScreen, reason: from toString */
    public static final /* data */ class NavigateToNormalDepositScreen implements PlaidConnectionDuxo7 {
        public static final int $stable = 8;
        private final String accessToken;
        private final IavAccount iavAccount;

        public static /* synthetic */ NavigateToNormalDepositScreen copy$default(NavigateToNormalDepositScreen navigateToNormalDepositScreen, String str, IavAccount iavAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToNormalDepositScreen.accessToken;
            }
            if ((i & 2) != 0) {
                iavAccount = navigateToNormalDepositScreen.iavAccount;
            }
            return navigateToNormalDepositScreen.copy(str, iavAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: component2, reason: from getter */
        public final IavAccount getIavAccount() {
            return this.iavAccount;
        }

        public final NavigateToNormalDepositScreen copy(String accessToken, IavAccount iavAccount) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
            return new NavigateToNormalDepositScreen(accessToken, iavAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToNormalDepositScreen)) {
                return false;
            }
            NavigateToNormalDepositScreen navigateToNormalDepositScreen = (NavigateToNormalDepositScreen) other;
            return Intrinsics.areEqual(this.accessToken, navigateToNormalDepositScreen.accessToken) && Intrinsics.areEqual(this.iavAccount, navigateToNormalDepositScreen.iavAccount);
        }

        public int hashCode() {
            return (this.accessToken.hashCode() * 31) + this.iavAccount.hashCode();
        }

        public String toString() {
            return "NavigateToNormalDepositScreen(accessToken=" + this.accessToken + ", iavAccount=" + this.iavAccount + ")";
        }

        public NavigateToNormalDepositScreen(String accessToken, IavAccount iavAccount) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
            this.accessToken = accessToken;
            this.iavAccount = iavAccount;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final IavAccount getIavAccount() {
            return this.iavAccount;
        }
    }
}
