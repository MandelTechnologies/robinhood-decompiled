package com.robinhood.android.account.modelsaccountswitcher;

import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcher.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;", "", "assetId", "", "location", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "title", "accounts", "", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccount;", "positiveButtonText", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAssetId", "()Ljava/lang/String;", "getLocation", "()Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "getTitle", "getAccounts", "()Ljava/util/List;", "getPositiveButtonText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountSwitcher {
    private final List<AccountSwitcherAccount> accounts;
    private final String assetId;
    private final AccountSwitcherLocation location;
    private final String positiveButtonText;
    private final String title;

    public static /* synthetic */ AccountSwitcher copy$default(AccountSwitcher accountSwitcher, String str, AccountSwitcherLocation accountSwitcherLocation, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountSwitcher.assetId;
        }
        if ((i & 2) != 0) {
            accountSwitcherLocation = accountSwitcher.location;
        }
        if ((i & 4) != 0) {
            str2 = accountSwitcher.title;
        }
        if ((i & 8) != 0) {
            list = accountSwitcher.accounts;
        }
        if ((i & 16) != 0) {
            str3 = accountSwitcher.positiveButtonText;
        }
        String str4 = str3;
        String str5 = str2;
        return accountSwitcher.copy(str, accountSwitcherLocation, str5, list, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSwitcherLocation getLocation() {
        return this.location;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<AccountSwitcherAccount> component4() {
        return this.accounts;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    public final AccountSwitcher copy(String assetId, AccountSwitcherLocation location, String title, List<AccountSwitcherAccount> accounts2, String positiveButtonText) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        return new AccountSwitcher(assetId, location, title, accounts2, positiveButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSwitcher)) {
            return false;
        }
        AccountSwitcher accountSwitcher = (AccountSwitcher) other;
        return Intrinsics.areEqual(this.assetId, accountSwitcher.assetId) && this.location == accountSwitcher.location && Intrinsics.areEqual(this.title, accountSwitcher.title) && Intrinsics.areEqual(this.accounts, accountSwitcher.accounts) && Intrinsics.areEqual(this.positiveButtonText, accountSwitcher.positiveButtonText);
    }

    public int hashCode() {
        return (((((((this.assetId.hashCode() * 31) + this.location.hashCode()) * 31) + this.title.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.positiveButtonText.hashCode();
    }

    public String toString() {
        return "AccountSwitcher(assetId=" + this.assetId + ", location=" + this.location + ", title=" + this.title + ", accounts=" + this.accounts + ", positiveButtonText=" + this.positiveButtonText + ")";
    }

    public AccountSwitcher(String assetId, AccountSwitcherLocation location, String title, List<AccountSwitcherAccount> accounts2, String positiveButtonText) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        this.assetId = assetId;
        this.location = location;
        this.title = title;
        this.accounts = accounts2;
        this.positiveButtonText = positiveButtonText;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final AccountSwitcherLocation getLocation() {
        return this.location;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<AccountSwitcherAccount> getAccounts() {
        return this.accounts;
    }

    public final String getPositiveButtonText() {
        return this.positiveButtonText;
    }
}
