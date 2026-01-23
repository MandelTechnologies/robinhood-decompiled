package com.robinhood.android.dashboard.lib.appbar;

import com.robinhood.shared.settings.contracts.SettingsPage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationIcon.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon;", "", "CurrencySwitcher", "Settings", "Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon$CurrencySwitcher;", "Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon$Settings;", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface NavigationIcon {

    /* compiled from: NavigationIcon.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon$CurrencySwitcher;", "Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CurrencySwitcher implements NavigationIcon {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ CurrencySwitcher copy$default(CurrencySwitcher currencySwitcher, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = currencySwitcher.accountNumber;
            }
            return currencySwitcher.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final CurrencySwitcher copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new CurrencySwitcher(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CurrencySwitcher) && Intrinsics.areEqual(this.accountNumber, ((CurrencySwitcher) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "CurrencySwitcher(accountNumber=" + this.accountNumber + ")";
        }

        public CurrencySwitcher(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: NavigationIcon.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon$Settings;", "Lcom/robinhood/android/dashboard/lib/appbar/NavigationIcon;", "key", "Lcom/robinhood/shared/settings/contracts/SettingsPage;", "<init>", "(Lcom/robinhood/shared/settings/contracts/SettingsPage;)V", "getKey", "()Lcom/robinhood/shared/settings/contracts/SettingsPage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Settings implements NavigationIcon {
        public static final int $stable = 8;
        private final SettingsPage key;

        public static /* synthetic */ Settings copy$default(Settings settings, SettingsPage settingsPage, int i, Object obj) {
            if ((i & 1) != 0) {
                settingsPage = settings.key;
            }
            return settings.copy(settingsPage);
        }

        /* renamed from: component1, reason: from getter */
        public final SettingsPage getKey() {
            return this.key;
        }

        public final Settings copy(SettingsPage key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new Settings(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Settings) && Intrinsics.areEqual(this.key, ((Settings) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "Settings(key=" + this.key + ")";
        }

        public Settings(SettingsPage key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final SettingsPage getKey() {
            return this.key;
        }
    }
}
