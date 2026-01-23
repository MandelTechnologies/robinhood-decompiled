package com.robinhood.android.margin.p174ui.limit;

import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitActivityEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;", "", "Loading", "Loaded", "RedirectToOnboarding", "Error", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent$Error;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent$Loaded;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent$Loading;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent$RedirectToOnboarding;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MarginLimitActivityEvent {

    /* compiled from: MarginLimitActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent$Loading;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements MarginLimitActivityEvent {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -2033585427;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: MarginLimitActivityEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent$Loaded;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "marginInvestingInfo", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;)V", "getUserLocale", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getMarginInvestingInfo", "()Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements MarginLimitActivityEvent {
        public static final int $stable = 8;
        private final ApiMarginInvestingInfo marginInvestingInfo;
        private final CountryCode.Supported userLocale;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, CountryCode.Supported supported, ApiMarginInvestingInfo apiMarginInvestingInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                supported = loaded.userLocale;
            }
            if ((i & 2) != 0) {
                apiMarginInvestingInfo = loaded.marginInvestingInfo;
            }
            return loaded.copy(supported, apiMarginInvestingInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode.Supported getUserLocale() {
            return this.userLocale;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiMarginInvestingInfo getMarginInvestingInfo() {
            return this.marginInvestingInfo;
        }

        public final Loaded copy(CountryCode.Supported userLocale, ApiMarginInvestingInfo marginInvestingInfo) {
            Intrinsics.checkNotNullParameter(userLocale, "userLocale");
            Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
            return new Loaded(userLocale, marginInvestingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.userLocale, loaded.userLocale) && Intrinsics.areEqual(this.marginInvestingInfo, loaded.marginInvestingInfo);
        }

        public int hashCode() {
            return (this.userLocale.hashCode() * 31) + this.marginInvestingInfo.hashCode();
        }

        public String toString() {
            return "Loaded(userLocale=" + this.userLocale + ", marginInvestingInfo=" + this.marginInvestingInfo + ")";
        }

        public Loaded(CountryCode.Supported userLocale, ApiMarginInvestingInfo marginInvestingInfo) {
            Intrinsics.checkNotNullParameter(userLocale, "userLocale");
            Intrinsics.checkNotNullParameter(marginInvestingInfo, "marginInvestingInfo");
            this.userLocale = userLocale;
            this.marginInvestingInfo = marginInvestingInfo;
        }

        public final CountryCode.Supported getUserLocale() {
            return this.userLocale;
        }

        public final ApiMarginInvestingInfo getMarginInvestingInfo() {
            return this.marginInvestingInfo;
        }
    }

    /* compiled from: MarginLimitActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent$RedirectToOnboarding;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RedirectToOnboarding implements MarginLimitActivityEvent {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ RedirectToOnboarding copy$default(RedirectToOnboarding redirectToOnboarding, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = redirectToOnboarding.accountNumber;
            }
            return redirectToOnboarding.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final RedirectToOnboarding copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new RedirectToOnboarding(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RedirectToOnboarding) && Intrinsics.areEqual(this.accountNumber, ((RedirectToOnboarding) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "RedirectToOnboarding(accountNumber=" + this.accountNumber + ")";
        }

        public RedirectToOnboarding(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: MarginLimitActivityEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent$Error;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitActivityEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements MarginLimitActivityEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
