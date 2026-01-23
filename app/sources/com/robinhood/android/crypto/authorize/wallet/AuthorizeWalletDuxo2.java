package com.robinhood.android.crypto.authorize.wallet;

import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthorizeWalletDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent;", "", "NavigateToGoldUpgrade", "Finish", "Error", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent$Error;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent$Finish;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent$NavigateToGoldUpgrade;", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface AuthorizeWalletDuxo2 {

    /* compiled from: AuthorizeWalletDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent$NavigateToGoldUpgrade;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent;", "goldUpgradeIntentKey", "Lcom/robinhood/android/gold/contracts/GoldUpgradeIntentKey;", "<init>", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeIntentKey;)V", "getGoldUpgradeIntentKey", "()Lcom/robinhood/android/gold/contracts/GoldUpgradeIntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletEvent$NavigateToGoldUpgrade, reason: from toString */
    public static final /* data */ class NavigateToGoldUpgrade implements AuthorizeWalletDuxo2 {
        public static final int $stable = 8;
        private final GoldUpgradeIntentKey goldUpgradeIntentKey;

        public static /* synthetic */ NavigateToGoldUpgrade copy$default(NavigateToGoldUpgrade navigateToGoldUpgrade, GoldUpgradeIntentKey goldUpgradeIntentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                goldUpgradeIntentKey = navigateToGoldUpgrade.goldUpgradeIntentKey;
            }
            return navigateToGoldUpgrade.copy(goldUpgradeIntentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final GoldUpgradeIntentKey getGoldUpgradeIntentKey() {
            return this.goldUpgradeIntentKey;
        }

        public final NavigateToGoldUpgrade copy(GoldUpgradeIntentKey goldUpgradeIntentKey) {
            Intrinsics.checkNotNullParameter(goldUpgradeIntentKey, "goldUpgradeIntentKey");
            return new NavigateToGoldUpgrade(goldUpgradeIntentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToGoldUpgrade) && Intrinsics.areEqual(this.goldUpgradeIntentKey, ((NavigateToGoldUpgrade) other).goldUpgradeIntentKey);
        }

        public int hashCode() {
            return this.goldUpgradeIntentKey.hashCode();
        }

        public String toString() {
            return "NavigateToGoldUpgrade(goldUpgradeIntentKey=" + this.goldUpgradeIntentKey + ")";
        }

        public NavigateToGoldUpgrade(GoldUpgradeIntentKey goldUpgradeIntentKey) {
            Intrinsics.checkNotNullParameter(goldUpgradeIntentKey, "goldUpgradeIntentKey");
            this.goldUpgradeIntentKey = goldUpgradeIntentKey;
        }

        public final GoldUpgradeIntentKey getGoldUpgradeIntentKey() {
            return this.goldUpgradeIntentKey;
        }
    }

    /* compiled from: AuthorizeWalletDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent$Finish;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletEvent$Finish */
    public static final /* data */ class Finish implements AuthorizeWalletDuxo2 {
        public static final int $stable = 0;
        public static final Finish INSTANCE = new Finish();

        public boolean equals(Object other) {
            return this == other || (other instanceof Finish);
        }

        public int hashCode() {
            return -499820622;
        }

        public String toString() {
            return "Finish";
        }

        private Finish() {
        }
    }

    /* compiled from: AuthorizeWalletDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent$Error;", "Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.authorize.wallet.AuthorizeWalletEvent$Error, reason: from toString */
    public static final /* data */ class Error implements AuthorizeWalletDuxo2 {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.error;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Error copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        public Error(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }
}
