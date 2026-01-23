package com.robinhood.shared.crypto.contracts.account;

import com.robinhood.android.crypto.p094ui.upgrade.CryptoUpgradeActivity;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeIntentKey.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/account/CryptoUpgradeIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", CryptoUpgradeActivity.EXTRA_FROM_DEEPLINK, "", "entryPointIdentifier", "", "<init>", "(ZLjava/lang/String;)V", "getFromDeeplink", "()Z", "getEntryPointIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoUpgradeIntentKey implements IntentKey {
    private final String entryPointIdentifier;
    private final boolean fromDeeplink;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoUpgradeIntentKey() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoUpgradeIntentKey copy$default(CryptoUpgradeIntentKey cryptoUpgradeIntentKey, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoUpgradeIntentKey.fromDeeplink;
        }
        if ((i & 2) != 0) {
            str = cryptoUpgradeIntentKey.entryPointIdentifier;
        }
        return cryptoUpgradeIntentKey.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFromDeeplink() {
        return this.fromDeeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public final CryptoUpgradeIntentKey copy(boolean fromDeeplink, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        return new CryptoUpgradeIntentKey(fromDeeplink, entryPointIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeIntentKey)) {
            return false;
        }
        CryptoUpgradeIntentKey cryptoUpgradeIntentKey = (CryptoUpgradeIntentKey) other;
        return this.fromDeeplink == cryptoUpgradeIntentKey.fromDeeplink && Intrinsics.areEqual(this.entryPointIdentifier, cryptoUpgradeIntentKey.entryPointIdentifier);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.fromDeeplink) * 31) + this.entryPointIdentifier.hashCode();
    }

    public String toString() {
        return "CryptoUpgradeIntentKey(fromDeeplink=" + this.fromDeeplink + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
    }

    public CryptoUpgradeIntentKey(boolean z, String entryPointIdentifier) {
        Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        this.fromDeeplink = z;
        this.entryPointIdentifier = entryPointIdentifier;
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public final boolean getFromDeeplink() {
        return this.fromDeeplink;
    }

    public /* synthetic */ CryptoUpgradeIntentKey(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public final String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }
}
