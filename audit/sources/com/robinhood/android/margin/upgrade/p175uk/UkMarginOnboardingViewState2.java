package com.robinhood.android.margin.upgrade.p175uk;

import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.models.util.Money;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkMarginOnboardingViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "", "<init>", "()V", "Exit", "MarginUpgradeBlocked", "LaunchExperienceQuestionnaire", "LaunchKnowledgeQuestionnaire", "LaunchEligibilityChecks", "LaunchTieredRates", "LaunchSetMarginLimit", "LaunchConfirmationWithNewBuyingPower", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$Exit;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchConfirmationWithNewBuyingPower;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchEligibilityChecks;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchExperienceQuestionnaire;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchKnowledgeQuestionnaire;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchSetMarginLimit;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchTieredRates;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$MarginUpgradeBlocked;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class UkMarginOnboardingViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ UkMarginOnboardingViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UkMarginOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$Exit;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent$Exit */
    public static final /* data */ class Exit extends UkMarginOnboardingViewState2 {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        public boolean equals(Object other) {
            return this == other || (other instanceof Exit);
        }

        public int hashCode() {
            return 1605026891;
        }

        public String toString() {
            return "Exit";
        }

        private Exit() {
            super(null);
        }
    }

    private UkMarginOnboardingViewState2() {
    }

    /* compiled from: UkMarginOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$MarginUpgradeBlocked;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "marginUpgradeBlocked", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;)V", "getMarginUpgradeBlocked", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent$MarginUpgradeBlocked, reason: from toString */
    public static final /* data */ class MarginUpgradeBlocked extends UkMarginOnboardingViewState2 {
        public static final int $stable = 8;
        private final ApiMarginEligibility.ApiMarginUpgradeBlocked marginUpgradeBlocked;

        public static /* synthetic */ MarginUpgradeBlocked copy$default(MarginUpgradeBlocked marginUpgradeBlocked, ApiMarginEligibility.ApiMarginUpgradeBlocked apiMarginUpgradeBlocked, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMarginUpgradeBlocked = marginUpgradeBlocked.marginUpgradeBlocked;
            }
            return marginUpgradeBlocked.copy(apiMarginUpgradeBlocked);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMarginEligibility.ApiMarginUpgradeBlocked getMarginUpgradeBlocked() {
            return this.marginUpgradeBlocked;
        }

        public final MarginUpgradeBlocked copy(ApiMarginEligibility.ApiMarginUpgradeBlocked marginUpgradeBlocked) {
            Intrinsics.checkNotNullParameter(marginUpgradeBlocked, "marginUpgradeBlocked");
            return new MarginUpgradeBlocked(marginUpgradeBlocked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarginUpgradeBlocked) && Intrinsics.areEqual(this.marginUpgradeBlocked, ((MarginUpgradeBlocked) other).marginUpgradeBlocked);
        }

        public int hashCode() {
            return this.marginUpgradeBlocked.hashCode();
        }

        public String toString() {
            return "MarginUpgradeBlocked(marginUpgradeBlocked=" + this.marginUpgradeBlocked + ")";
        }

        public final ApiMarginEligibility.ApiMarginUpgradeBlocked getMarginUpgradeBlocked() {
            return this.marginUpgradeBlocked;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarginUpgradeBlocked(ApiMarginEligibility.ApiMarginUpgradeBlocked marginUpgradeBlocked) {
            super(null);
            Intrinsics.checkNotNullParameter(marginUpgradeBlocked, "marginUpgradeBlocked");
            this.marginUpgradeBlocked = marginUpgradeBlocked;
        }
    }

    /* compiled from: UkMarginOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchExperienceQuestionnaire;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent$LaunchExperienceQuestionnaire */
    public static final /* data */ class LaunchExperienceQuestionnaire extends UkMarginOnboardingViewState2 {
        public static final int $stable = 0;
        public static final LaunchExperienceQuestionnaire INSTANCE = new LaunchExperienceQuestionnaire();

        public boolean equals(Object other) {
            return this == other || (other instanceof LaunchExperienceQuestionnaire);
        }

        public int hashCode() {
            return -52024167;
        }

        public String toString() {
            return "LaunchExperienceQuestionnaire";
        }

        private LaunchExperienceQuestionnaire() {
            super(null);
        }
    }

    /* compiled from: UkMarginOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchKnowledgeQuestionnaire;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent$LaunchKnowledgeQuestionnaire */
    public static final /* data */ class LaunchKnowledgeQuestionnaire extends UkMarginOnboardingViewState2 {
        public static final int $stable = 0;
        public static final LaunchKnowledgeQuestionnaire INSTANCE = new LaunchKnowledgeQuestionnaire();

        public boolean equals(Object other) {
            return this == other || (other instanceof LaunchKnowledgeQuestionnaire);
        }

        public int hashCode() {
            return 748445061;
        }

        public String toString() {
            return "LaunchKnowledgeQuestionnaire";
        }

        private LaunchKnowledgeQuestionnaire() {
            super(null);
        }
    }

    /* compiled from: UkMarginOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchEligibilityChecks;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent$LaunchEligibilityChecks */
    public static final /* data */ class LaunchEligibilityChecks extends UkMarginOnboardingViewState2 {
        public static final int $stable = 0;
        public static final LaunchEligibilityChecks INSTANCE = new LaunchEligibilityChecks();

        public boolean equals(Object other) {
            return this == other || (other instanceof LaunchEligibilityChecks);
        }

        public int hashCode() {
            return -1010906472;
        }

        public String toString() {
            return "LaunchEligibilityChecks";
        }

        private LaunchEligibilityChecks() {
            super(null);
        }
    }

    /* compiled from: UkMarginOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchTieredRates;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "accountNumber", "", "marginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;Lcom/robinhood/android/account/strings/DisplayName;)V", "getAccountNumber", "()Ljava/lang/String;", "getMarginFlow", "()Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "getDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent$LaunchTieredRates, reason: from toString */
    public static final /* data */ class LaunchTieredRates extends UkMarginOnboardingViewState2 {
        public static final int $stable = DisplayName.$stable | MarginEligibilityChecklistViewState4.$stable;
        private final String accountNumber;
        private final DisplayName displayName;
        private final MarginEligibilityChecklistViewState4 marginFlow;

        public static /* synthetic */ LaunchTieredRates copy$default(LaunchTieredRates launchTieredRates, String str, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, DisplayName displayName, int i, Object obj) {
            if ((i & 1) != 0) {
                str = launchTieredRates.accountNumber;
            }
            if ((i & 2) != 0) {
                marginEligibilityChecklistViewState4 = launchTieredRates.marginFlow;
            }
            if ((i & 4) != 0) {
                displayName = launchTieredRates.displayName;
            }
            return launchTieredRates.copy(str, marginEligibilityChecklistViewState4, displayName);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final MarginEligibilityChecklistViewState4 getMarginFlow() {
            return this.marginFlow;
        }

        /* renamed from: component3, reason: from getter */
        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        public final LaunchTieredRates copy(String accountNumber, MarginEligibilityChecklistViewState4 marginFlow, DisplayName displayName) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            return new LaunchTieredRates(accountNumber, marginFlow, displayName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LaunchTieredRates)) {
                return false;
            }
            LaunchTieredRates launchTieredRates = (LaunchTieredRates) other;
            return Intrinsics.areEqual(this.accountNumber, launchTieredRates.accountNumber) && Intrinsics.areEqual(this.marginFlow, launchTieredRates.marginFlow) && Intrinsics.areEqual(this.displayName, launchTieredRates.displayName);
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.marginFlow.hashCode()) * 31) + this.displayName.hashCode();
        }

        public String toString() {
            return "LaunchTieredRates(accountNumber=" + this.accountNumber + ", marginFlow=" + this.marginFlow + ", displayName=" + this.displayName + ")";
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final MarginEligibilityChecklistViewState4 getMarginFlow() {
            return this.marginFlow;
        }

        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchTieredRates(String accountNumber, MarginEligibilityChecklistViewState4 marginFlow, DisplayName displayName) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.accountNumber = accountNumber;
            this.marginFlow = marginFlow;
            this.displayName = displayName;
        }
    }

    /* compiled from: UkMarginOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchSetMarginLimit;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;)V", "getInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent$LaunchSetMarginLimit, reason: from toString */
    public static final /* data */ class LaunchSetMarginLimit extends UkMarginOnboardingViewState2 {
        public static final int $stable = 8;
        private final ApiMarginInvestingInfo info;

        public static /* synthetic */ LaunchSetMarginLimit copy$default(LaunchSetMarginLimit launchSetMarginLimit, ApiMarginInvestingInfo apiMarginInvestingInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMarginInvestingInfo = launchSetMarginLimit.info;
            }
            return launchSetMarginLimit.copy(apiMarginInvestingInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMarginInvestingInfo getInfo() {
            return this.info;
        }

        public final LaunchSetMarginLimit copy(ApiMarginInvestingInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            return new LaunchSetMarginLimit(info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchSetMarginLimit) && Intrinsics.areEqual(this.info, ((LaunchSetMarginLimit) other).info);
        }

        public int hashCode() {
            return this.info.hashCode();
        }

        public String toString() {
            return "LaunchSetMarginLimit(info=" + this.info + ")";
        }

        public final ApiMarginInvestingInfo getInfo() {
            return this.info;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchSetMarginLimit(ApiMarginInvestingInfo info) {
            super(null);
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
        }
    }

    /* compiled from: UkMarginOnboardingViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent$LaunchConfirmationWithNewBuyingPower;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "newBuyingPower", "Lcom/robinhood/models/util/Money;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "marginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/account/strings/DisplayName;Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;)V", "getNewBuyingPower", "()Lcom/robinhood/models/util/Money;", "getDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "getMarginFlow", "()Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingEvent$LaunchConfirmationWithNewBuyingPower, reason: from toString */
    public static final /* data */ class LaunchConfirmationWithNewBuyingPower extends UkMarginOnboardingViewState2 {
        public static final int $stable = 8;
        private final DisplayName displayName;
        private final MarginEligibilityChecklistViewState4 marginFlow;
        private final Money newBuyingPower;

        public static /* synthetic */ LaunchConfirmationWithNewBuyingPower copy$default(LaunchConfirmationWithNewBuyingPower launchConfirmationWithNewBuyingPower, Money money, DisplayName displayName, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i, Object obj) {
            if ((i & 1) != 0) {
                money = launchConfirmationWithNewBuyingPower.newBuyingPower;
            }
            if ((i & 2) != 0) {
                displayName = launchConfirmationWithNewBuyingPower.displayName;
            }
            if ((i & 4) != 0) {
                marginEligibilityChecklistViewState4 = launchConfirmationWithNewBuyingPower.marginFlow;
            }
            return launchConfirmationWithNewBuyingPower.copy(money, displayName, marginEligibilityChecklistViewState4);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getNewBuyingPower() {
            return this.newBuyingPower;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component3, reason: from getter */
        public final MarginEligibilityChecklistViewState4 getMarginFlow() {
            return this.marginFlow;
        }

        public final LaunchConfirmationWithNewBuyingPower copy(Money newBuyingPower, DisplayName displayName, MarginEligibilityChecklistViewState4 marginFlow) {
            Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
            return new LaunchConfirmationWithNewBuyingPower(newBuyingPower, displayName, marginFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LaunchConfirmationWithNewBuyingPower)) {
                return false;
            }
            LaunchConfirmationWithNewBuyingPower launchConfirmationWithNewBuyingPower = (LaunchConfirmationWithNewBuyingPower) other;
            return Intrinsics.areEqual(this.newBuyingPower, launchConfirmationWithNewBuyingPower.newBuyingPower) && Intrinsics.areEqual(this.displayName, launchConfirmationWithNewBuyingPower.displayName) && Intrinsics.areEqual(this.marginFlow, launchConfirmationWithNewBuyingPower.marginFlow);
        }

        public int hashCode() {
            return (((this.newBuyingPower.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.marginFlow.hashCode();
        }

        public String toString() {
            return "LaunchConfirmationWithNewBuyingPower(newBuyingPower=" + this.newBuyingPower + ", displayName=" + this.displayName + ", marginFlow=" + this.marginFlow + ")";
        }

        public final Money getNewBuyingPower() {
            return this.newBuyingPower;
        }

        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        public final MarginEligibilityChecklistViewState4 getMarginFlow() {
            return this.marginFlow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchConfirmationWithNewBuyingPower(Money newBuyingPower, DisplayName displayName, MarginEligibilityChecklistViewState4 marginFlow) {
            super(null);
            Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
            this.newBuyingPower = newBuyingPower;
            this.displayName = displayName;
            this.marginFlow = marginFlow;
        }
    }
}
