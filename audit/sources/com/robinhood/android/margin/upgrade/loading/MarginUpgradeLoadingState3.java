package com.robinhood.android.margin.upgrade.loading;

import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiMarginOnboardingSplash;
import com.robinhood.android.margin.upgrade.MarginUpgradeContext;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeLoadingState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "", "<init>", "()V", "Loading", "AlreadyEnabled", "UsFlow", "UkFlow", "MarginUpgradeBlocked", "WillBeRestricted", "Failure", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$AlreadyEnabled;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$Failure;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$Loading;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$MarginUpgradeBlocked;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$UkFlow;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$UsFlow;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$WillBeRestricted;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingViewState, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class MarginUpgradeLoadingState3 {
    public static final int $stable = 0;

    public /* synthetic */ MarginUpgradeLoadingState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MarginUpgradeLoadingState3() {
    }

    /* compiled from: MarginUpgradeLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$Loading;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingViewState$Loading */
    public static final /* data */ class Loading extends MarginUpgradeLoadingState3 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 669975900;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: MarginUpgradeLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$AlreadyEnabled;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingViewState$AlreadyEnabled */
    public static final /* data */ class AlreadyEnabled extends MarginUpgradeLoadingState3 {
        public static final int $stable = 0;
        public static final AlreadyEnabled INSTANCE = new AlreadyEnabled();

        public boolean equals(Object other) {
            return this == other || (other instanceof AlreadyEnabled);
        }

        public int hashCode() {
            return 331536297;
        }

        public String toString() {
            return "AlreadyEnabled";
        }

        private AlreadyEnabled() {
            super(null);
        }
    }

    /* compiled from: MarginUpgradeLoadingState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$UsFlow;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "context", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeContext;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/android/margin/upgrade/MarginUpgradeContext;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getContext", "()Lcom/robinhood/android/margin/upgrade/MarginUpgradeContext;", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingViewState$UsFlow, reason: from toString */
    public static final /* data */ class UsFlow extends MarginUpgradeLoadingState3 {
        public static final int $stable = 8;
        private final MarginUpgradeContext context;
        private final CountryCode.Supported locality;

        public static /* synthetic */ UsFlow copy$default(UsFlow usFlow, MarginUpgradeContext marginUpgradeContext, CountryCode.Supported supported, int i, Object obj) {
            if ((i & 1) != 0) {
                marginUpgradeContext = usFlow.context;
            }
            if ((i & 2) != 0) {
                supported = usFlow.locality;
            }
            return usFlow.copy(marginUpgradeContext, supported);
        }

        /* renamed from: component1, reason: from getter */
        public final MarginUpgradeContext getContext() {
            return this.context;
        }

        /* renamed from: component2, reason: from getter */
        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        public final UsFlow copy(MarginUpgradeContext context, CountryCode.Supported locality) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new UsFlow(context, locality);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UsFlow)) {
                return false;
            }
            UsFlow usFlow = (UsFlow) other;
            return Intrinsics.areEqual(this.context, usFlow.context) && Intrinsics.areEqual(this.locality, usFlow.locality);
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.locality.hashCode();
        }

        public String toString() {
            return "UsFlow(context=" + this.context + ", locality=" + this.locality + ")";
        }

        public final MarginUpgradeContext getContext() {
            return this.context;
        }

        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UsFlow(MarginUpgradeContext context, CountryCode.Supported locality) {
            super(null);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.context = context;
            this.locality = locality;
        }
    }

    /* compiled from: MarginUpgradeLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$UkFlow;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "splash", "Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "accountNumber", "", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;Ljava/lang/String;)V", "getSplash", "()Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingViewState$UkFlow, reason: from toString */
    public static final /* data */ class UkFlow extends MarginUpgradeLoadingState3 {
        public static final int $stable = 8;
        private final String accountNumber;
        private final ApiMarginOnboardingSplash splash;

        public static /* synthetic */ UkFlow copy$default(UkFlow ukFlow, ApiMarginOnboardingSplash apiMarginOnboardingSplash, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMarginOnboardingSplash = ukFlow.splash;
            }
            if ((i & 2) != 0) {
                str = ukFlow.accountNumber;
            }
            return ukFlow.copy(apiMarginOnboardingSplash, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMarginOnboardingSplash getSplash() {
            return this.splash;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UkFlow copy(ApiMarginOnboardingSplash splash, String accountNumber) {
            Intrinsics.checkNotNullParameter(splash, "splash");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new UkFlow(splash, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UkFlow)) {
                return false;
            }
            UkFlow ukFlow = (UkFlow) other;
            return Intrinsics.areEqual(this.splash, ukFlow.splash) && Intrinsics.areEqual(this.accountNumber, ukFlow.accountNumber);
        }

        public int hashCode() {
            return (this.splash.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "UkFlow(splash=" + this.splash + ", accountNumber=" + this.accountNumber + ")";
        }

        public final ApiMarginOnboardingSplash getSplash() {
            return this.splash;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UkFlow(ApiMarginOnboardingSplash splash, String accountNumber) {
            super(null);
            Intrinsics.checkNotNullParameter(splash, "splash");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.splash = splash;
            this.accountNumber = accountNumber;
        }
    }

    /* compiled from: MarginUpgradeLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$MarginUpgradeBlocked;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "reason", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;)V", "getReason", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingViewState$MarginUpgradeBlocked, reason: from toString */
    public static final /* data */ class MarginUpgradeBlocked extends MarginUpgradeLoadingState3 {
        public static final int $stable = 8;
        private final ApiMarginEligibility.ApiMarginUpgradeBlocked reason;

        public static /* synthetic */ MarginUpgradeBlocked copy$default(MarginUpgradeBlocked marginUpgradeBlocked, ApiMarginEligibility.ApiMarginUpgradeBlocked apiMarginUpgradeBlocked, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMarginUpgradeBlocked = marginUpgradeBlocked.reason;
            }
            return marginUpgradeBlocked.copy(apiMarginUpgradeBlocked);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMarginEligibility.ApiMarginUpgradeBlocked getReason() {
            return this.reason;
        }

        public final MarginUpgradeBlocked copy(ApiMarginEligibility.ApiMarginUpgradeBlocked reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new MarginUpgradeBlocked(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MarginUpgradeBlocked) && Intrinsics.areEqual(this.reason, ((MarginUpgradeBlocked) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "MarginUpgradeBlocked(reason=" + this.reason + ")";
        }

        public final ApiMarginEligibility.ApiMarginUpgradeBlocked getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MarginUpgradeBlocked(ApiMarginEligibility.ApiMarginUpgradeBlocked reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }
    }

    /* compiled from: MarginUpgradeLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$WillBeRestricted;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingViewState$WillBeRestricted */
    public static final /* data */ class WillBeRestricted extends MarginUpgradeLoadingState3 {
        public static final int $stable = 0;
        public static final WillBeRestricted INSTANCE = new WillBeRestricted();

        public boolean equals(Object other) {
            return this == other || (other instanceof WillBeRestricted);
        }

        public int hashCode() {
            return -987557424;
        }

        public String toString() {
            return "WillBeRestricted";
        }

        private WillBeRestricted() {
            super(null);
        }
    }

    /* compiled from: MarginUpgradeLoadingState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$Failure;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingViewState$Failure, reason: from toString */
    public static final /* data */ class Failure extends MarginUpgradeLoadingState3 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Failure(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
