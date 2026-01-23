package com.robinhood.android.margin.upgrade.rates;

import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginUpgradeRatesDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent;", "", "UpgradeSuccess", "UpgradeError", "GenericError", "Ineligible", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent$GenericError;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent$Ineligible;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent$UpgradeError;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent$UpgradeSuccess;", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesEvent, reason: use source file name */
/* loaded from: classes8.dex */
public interface MarginUpgradeRatesDuxo2 {

    /* compiled from: MarginUpgradeRatesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent$UpgradeSuccess;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent;", "newBuyingPower", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getNewBuyingPower", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesEvent$UpgradeSuccess, reason: from toString */
    public static final /* data */ class UpgradeSuccess implements MarginUpgradeRatesDuxo2 {
        public static final int $stable = 8;
        private final Money newBuyingPower;

        public static /* synthetic */ UpgradeSuccess copy$default(UpgradeSuccess upgradeSuccess, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                money = upgradeSuccess.newBuyingPower;
            }
            return upgradeSuccess.copy(money);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getNewBuyingPower() {
            return this.newBuyingPower;
        }

        public final UpgradeSuccess copy(Money newBuyingPower) {
            Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
            return new UpgradeSuccess(newBuyingPower);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpgradeSuccess) && Intrinsics.areEqual(this.newBuyingPower, ((UpgradeSuccess) other).newBuyingPower);
        }

        public int hashCode() {
            return this.newBuyingPower.hashCode();
        }

        public String toString() {
            return "UpgradeSuccess(newBuyingPower=" + this.newBuyingPower + ")";
        }

        public UpgradeSuccess(Money newBuyingPower) {
            Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
            this.newBuyingPower = newBuyingPower;
        }

        public final Money getNewBuyingPower() {
            return this.newBuyingPower;
        }
    }

    /* compiled from: MarginUpgradeRatesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent$UpgradeError;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent;", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "errorReason", "", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;Ljava/lang/String;)V", "getResult", "()Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "getErrorReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesEvent$UpgradeError, reason: from toString */
    public static final /* data */ class UpgradeError implements MarginUpgradeRatesDuxo2 {
        public static final int $stable = 0;
        private final String errorReason;
        private final ApiToggleMarginInvestingResponse2 result;

        public static /* synthetic */ UpgradeError copy$default(UpgradeError upgradeError, ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                apiToggleMarginInvestingResponse2 = upgradeError.result;
            }
            if ((i & 2) != 0) {
                str = upgradeError.errorReason;
            }
            return upgradeError.copy(apiToggleMarginInvestingResponse2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiToggleMarginInvestingResponse2 getResult() {
            return this.result;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorReason() {
            return this.errorReason;
        }

        public final UpgradeError copy(ApiToggleMarginInvestingResponse2 result, String errorReason) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            return new UpgradeError(result, errorReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpgradeError)) {
                return false;
            }
            UpgradeError upgradeError = (UpgradeError) other;
            return this.result == upgradeError.result && Intrinsics.areEqual(this.errorReason, upgradeError.errorReason);
        }

        public int hashCode() {
            return (this.result.hashCode() * 31) + this.errorReason.hashCode();
        }

        public String toString() {
            return "UpgradeError(result=" + this.result + ", errorReason=" + this.errorReason + ")";
        }

        public UpgradeError(ApiToggleMarginInvestingResponse2 result, String errorReason) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.result = result;
            this.errorReason = errorReason;
        }

        public final ApiToggleMarginInvestingResponse2 getResult() {
            return this.result;
        }

        public final String getErrorReason() {
            return this.errorReason;
        }
    }

    /* compiled from: MarginUpgradeRatesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent$GenericError;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesEvent$GenericError, reason: from toString */
    public static final /* data */ class GenericError implements MarginUpgradeRatesDuxo2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ GenericError copy$default(GenericError genericError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = genericError.throwable;
            }
            return genericError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final GenericError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new GenericError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GenericError) && Intrinsics.areEqual(this.throwable, ((GenericError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "GenericError(throwable=" + this.throwable + ")";
        }

        public GenericError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: MarginUpgradeRatesDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent$Ineligible;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent;", "reason", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;)V", "getReason", "()Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesEvent$Ineligible, reason: from toString */
    public static final /* data */ class Ineligible implements MarginUpgradeRatesDuxo2 {
        public static final int $stable = 8;
        private final ApiMarginEligibility.ApiMarginUpgradeBlocked reason;

        public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, ApiMarginEligibility.ApiMarginUpgradeBlocked apiMarginUpgradeBlocked, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMarginUpgradeBlocked = ineligible.reason;
            }
            return ineligible.copy(apiMarginUpgradeBlocked);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiMarginEligibility.ApiMarginUpgradeBlocked getReason() {
            return this.reason;
        }

        public final Ineligible copy(ApiMarginEligibility.ApiMarginUpgradeBlocked reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Ineligible(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ineligible) && Intrinsics.areEqual(this.reason, ((Ineligible) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Ineligible(reason=" + this.reason + ")";
        }

        public Ineligible(ApiMarginEligibility.ApiMarginUpgradeBlocked reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final ApiMarginEligibility.ApiMarginUpgradeBlocked getReason() {
            return this.reason;
        }
    }
}
