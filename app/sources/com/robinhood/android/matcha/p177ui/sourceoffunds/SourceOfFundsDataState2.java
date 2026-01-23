package com.robinhood.android.matcha.p177ui.sourceoffunds;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SourceOfFundsDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/Row;", "", "Placeholder", "Account", "Banner", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row$Account;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row$Banner;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row$Placeholder;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.Row, reason: use source file name */
/* loaded from: classes8.dex */
public interface SourceOfFundsDataState2 {

    /* compiled from: SourceOfFundsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/Row$Placeholder;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.Row$Placeholder */
    public static final class Placeholder implements SourceOfFundsDataState2 {
        public static final int $stable = 0;
        public static final Placeholder INSTANCE = new Placeholder();

        private Placeholder() {
        }
    }

    /* compiled from: SourceOfFundsDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/Row$Account;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row;", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.Row$Account, reason: from toString */
    public static final /* data */ class Account implements SourceOfFundsDataState2 {
        public static final int $stable = 8;
        private final TransferAccount account;

        public static /* synthetic */ Account copy$default(Account account, TransferAccount transferAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                transferAccount = account.account;
            }
            return account.copy(transferAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final TransferAccount getAccount() {
            return this.account;
        }

        public final Account copy(TransferAccount account) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new Account(account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Account) && Intrinsics.areEqual(this.account, ((Account) other).account);
        }

        public int hashCode() {
            return this.account.hashCode();
        }

        public String toString() {
            return "Account(account=" + this.account + ")";
        }

        public Account(TransferAccount account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
        }

        public final TransferAccount getAccount() {
            return this.account;
        }
    }

    /* compiled from: SourceOfFundsDataState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/Row$Banner;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacInfoBanner;", "<init>", "(Lcom/robinhood/models/db/IacInfoBanner;)V", "getBanner", "()Lcom/robinhood/models/db/IacInfoBanner;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.Row$Banner, reason: from toString */
    public static final /* data */ class Banner implements SourceOfFundsDataState2 {
        public static final int $stable = 8;
        private final IacInfoBanner banner;

        public static /* synthetic */ Banner copy$default(Banner banner, IacInfoBanner iacInfoBanner, int i, Object obj) {
            if ((i & 1) != 0) {
                iacInfoBanner = banner.banner;
            }
            return banner.copy(iacInfoBanner);
        }

        /* renamed from: component1, reason: from getter */
        public final IacInfoBanner getBanner() {
            return this.banner;
        }

        public final Banner copy(IacInfoBanner banner) {
            Intrinsics.checkNotNullParameter(banner, "banner");
            return new Banner(banner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Banner) && Intrinsics.areEqual(this.banner, ((Banner) other).banner);
        }

        public int hashCode() {
            return this.banner.hashCode();
        }

        public String toString() {
            return "Banner(banner=" + this.banner + ")";
        }

        public Banner(IacInfoBanner banner) {
            Intrinsics.checkNotNullParameter(banner, "banner");
            this.banner = banner;
        }

        public final IacInfoBanner getBanner() {
            return this.banner;
        }
    }
}
