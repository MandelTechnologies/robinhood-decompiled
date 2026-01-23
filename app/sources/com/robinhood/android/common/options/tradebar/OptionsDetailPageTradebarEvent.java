package com.robinhood.android.common.options.tradebar;

import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageTradebarEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarEvent;", "", "AccountSwitcherRefreshed", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarEvent$AccountSwitcherRefreshed;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface OptionsDetailPageTradebarEvent {

    /* compiled from: OptionsDetailPageTradebarEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarEvent$AccountSwitcherRefreshed;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarEvent;", "id", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "result", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "", "<init>", "(Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;Lcom/robinhood/utils/Either;)V", "getId", "()Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "getResult", "()Lcom/robinhood/utils/Either;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountSwitcherRefreshed implements OptionsDetailPageTradebarEvent {
        public static final int $stable = 8;
        private final OptionsAccountSwitcherId id;
        private final Either<AccountSwitcherData, Throwable> result;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AccountSwitcherRefreshed copy$default(AccountSwitcherRefreshed accountSwitcherRefreshed, OptionsAccountSwitcherId optionsAccountSwitcherId, Either either, int i, Object obj) {
            if ((i & 1) != 0) {
                optionsAccountSwitcherId = accountSwitcherRefreshed.id;
            }
            if ((i & 2) != 0) {
                either = accountSwitcherRefreshed.result;
            }
            return accountSwitcherRefreshed.copy(optionsAccountSwitcherId, either);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionsAccountSwitcherId getId() {
            return this.id;
        }

        public final Either<AccountSwitcherData, Throwable> component2() {
            return this.result;
        }

        public final AccountSwitcherRefreshed copy(OptionsAccountSwitcherId id, Either<AccountSwitcherData, ? extends Throwable> result) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(result, "result");
            return new AccountSwitcherRefreshed(id, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountSwitcherRefreshed)) {
                return false;
            }
            AccountSwitcherRefreshed accountSwitcherRefreshed = (AccountSwitcherRefreshed) other;
            return Intrinsics.areEqual(this.id, accountSwitcherRefreshed.id) && Intrinsics.areEqual(this.result, accountSwitcherRefreshed.result);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.result.hashCode();
        }

        public String toString() {
            return "AccountSwitcherRefreshed(id=" + this.id + ", result=" + this.result + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AccountSwitcherRefreshed(OptionsAccountSwitcherId id, Either<AccountSwitcherData, ? extends Throwable> result) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(result, "result");
            this.id = id;
            this.result = result;
        }

        public final OptionsAccountSwitcherId getId() {
            return this.id;
        }

        public final Either<AccountSwitcherData, Throwable> getResult() {
            return this.result;
        }
    }
}
