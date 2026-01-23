package com.robinhood.android.indexes.detail.components.tradebar;

import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageTradeBarStates.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarEvent;", "", "AccountSwitcherRefreshed", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarEvent$AccountSwitcherRefreshed;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarEvent, reason: use source file name */
/* loaded from: classes10.dex */
public interface IndexDetailPageTradeBarStates3 {

    /* compiled from: IndexDetailPageTradeBarStates.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarEvent$AccountSwitcherRefreshed;", "Lcom/robinhood/android/indexes/detail/components/tradebar/IndexDetailPageTradeBarEvent;", "result", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "", "<init>", "(Lcom/robinhood/utils/Either;)V", "getResult", "()Lcom/robinhood/utils/Either;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarEvent$AccountSwitcherRefreshed, reason: from toString */
    public static final /* data */ class AccountSwitcherRefreshed implements IndexDetailPageTradeBarStates3 {
        public static final int $stable = 8;
        private final Either<AccountSwitcherData, Throwable> result;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccountSwitcherRefreshed copy$default(AccountSwitcherRefreshed accountSwitcherRefreshed, Either either, int i, Object obj) {
            if ((i & 1) != 0) {
                either = accountSwitcherRefreshed.result;
            }
            return accountSwitcherRefreshed.copy(either);
        }

        public final Either<AccountSwitcherData, Throwable> component1() {
            return this.result;
        }

        public final AccountSwitcherRefreshed copy(Either<AccountSwitcherData, ? extends Throwable> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new AccountSwitcherRefreshed(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountSwitcherRefreshed) && Intrinsics.areEqual(this.result, ((AccountSwitcherRefreshed) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "AccountSwitcherRefreshed(result=" + this.result + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AccountSwitcherRefreshed(Either<AccountSwitcherData, ? extends Throwable> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final Either<AccountSwitcherData, Throwable> getResult() {
            return this.result;
        }
    }
}
