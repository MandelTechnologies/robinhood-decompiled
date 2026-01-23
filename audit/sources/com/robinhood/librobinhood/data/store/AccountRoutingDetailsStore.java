package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.RhyAccountRoutingDetails;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountRoutingDetailsStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "Lcom/robinhood/store/Store;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rhyAccountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountRoutingDetailsStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/store/StoreBundle;)V", "fetchSpendingOrCashManagementRoutingDetails", "Lio/reactivex/Single;", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "RoutingDetails", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AccountRoutingDetailsStore extends Store {
    private final MinervaAccountStore minervaAccountStore;
    private final RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore;
    private final RhyAccountStore rhyAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRoutingDetailsStore(RhyAccountStore rhyAccountStore, RhyAccountRoutingDetailsStore rhyAccountRoutingDetailsStore, MinervaAccountStore minervaAccountStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rhyAccountRoutingDetailsStore, "rhyAccountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rhyAccountStore = rhyAccountStore;
        this.rhyAccountRoutingDetailsStore = rhyAccountRoutingDetailsStore;
        this.minervaAccountStore = minervaAccountStore;
    }

    public final Single<RoutingDetails> fetchSpendingOrCashManagementRoutingDetails() {
        Single singleFlatMap = this.rhyAccountStore.forceFetchAccountIfNotCached().onErrorReturnItem(Optional2.INSTANCE).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore.fetchSpendingOrCashManagementRoutingDetails.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends RoutingDetails> apply(Optional<RhyAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                final RhyAccount rhyAccountComponent1 = optional.component1();
                if (rhyAccountComponent1 != null) {
                    Single<R> map = AccountRoutingDetailsStore.this.rhyAccountRoutingDetailsStore.forceFetchRhyAccountRoutingDetails(rhyAccountComponent1.getId()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore.fetchSpendingOrCashManagementRoutingDetails.1.1
                        @Override // io.reactivex.functions.Function
                        public final RoutingDetails.RhySpending apply(RhyAccountRoutingDetails details) {
                            Intrinsics.checkNotNullParameter(details, "details");
                            return new RoutingDetails.RhySpending(rhyAccountComponent1, details.getRoutingNumber(), details.getAccountNumber(), details.getBankName(), details.getFullBankName());
                        }
                    });
                    Intrinsics.checkNotNull(map);
                    return map;
                }
                Single<R> map2 = AccountRoutingDetailsStore.this.minervaAccountStore.getRoutingDetails().map(new Function() { // from class: com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore.fetchSpendingOrCashManagementRoutingDetails.1.2
                    @Override // io.reactivex.functions.Function
                    public final RoutingDetails.CashManagement apply(MinervaAccountStore.RoutingDetailsResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof MinervaAccountStore.RoutingDetailsResult.Success) {
                            RhyAccountRoutingDetails routingDetails = ((MinervaAccountStore.RoutingDetailsResult.Success) it).getRoutingDetails();
                            return new RoutingDetails.CashManagement(routingDetails.getRoutingNumber(), routingDetails.getAccountNumber(), routingDetails.getBankName(), routingDetails.getFullBankName());
                        }
                        if (!(it instanceof MinervaAccountStore.RoutingDetailsResult.NoAccountFound)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("No account found");
                    }
                });
                Intrinsics.checkNotNull(map2);
                return map2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: AccountRoutingDetailsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "", "routingNumber", "", "accountNumber", "bankName", "fullBankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRoutingNumber", "()Ljava/lang/String;", "getAccountNumber", "getBankName", "getFullBankName", "RhySpending", "CashManagement", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails$CashManagement;", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails$RhySpending;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class RoutingDetails {
        private final String accountNumber;
        private final String bankName;
        private final String fullBankName;
        private final String routingNumber;

        public /* synthetic */ RoutingDetails(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4);
        }

        private RoutingDetails(String str, String str2, String str3, String str4) {
            this.routingNumber = str;
            this.accountNumber = str2;
            this.bankName = str3;
            this.fullBankName = str4;
        }

        public final String getRoutingNumber() {
            return this.routingNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final String getFullBankName() {
            return this.fullBankName;
        }

        /* compiled from: AccountRoutingDetailsStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails$RhySpending;", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "rhyAccount", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "routingNumber", "", "accountNumber", "bankName", "fullBankName", "<init>", "(Lcom/robinhood/models/db/bonfire/RhyAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRhyAccount", "()Lcom/robinhood/models/db/bonfire/RhyAccount;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class RhySpending extends RoutingDetails {
            private final RhyAccount rhyAccount;

            public final RhyAccount getRhyAccount() {
                return this.rhyAccount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhySpending(RhyAccount rhyAccount, String routingNumber, String accountNumber, String bankName, String fullBankName) {
                super(routingNumber, accountNumber, bankName, fullBankName, null);
                Intrinsics.checkNotNullParameter(rhyAccount, "rhyAccount");
                Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(bankName, "bankName");
                Intrinsics.checkNotNullParameter(fullBankName, "fullBankName");
                this.rhyAccount = rhyAccount;
            }
        }

        /* compiled from: AccountRoutingDetailsStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails$CashManagement;", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "routingNumber", "", "accountNumber", "bankName", "fullBankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CashManagement extends RoutingDetails {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashManagement(String routingNumber, String accountNumber, String bankName, String fullBankName) {
                super(routingNumber, accountNumber, bankName, fullBankName, null);
                Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(bankName, "bankName");
                Intrinsics.checkNotNullParameter(fullBankName, "fullBankName");
            }
        }
    }
}
