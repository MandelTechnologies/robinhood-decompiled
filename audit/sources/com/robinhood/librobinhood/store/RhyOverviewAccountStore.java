package com.robinhood.librobinhood.store;

import com.robinhood.librobinhood.data.RhyOverviewAccountType;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewAccountStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ$\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00110\u00100\u000fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00110\u000fJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;", "Lcom/robinhood/store/Store;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/store/StoreBundle;)V", "refresh", "", "force", "", "streamRhyAndMinervaAccounts", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "streamIsActiveRhyAccount", "streamMinervaBrokerageAccount", "streamSpendingAccountType", "Lcom/robinhood/librobinhood/data/RhyOverviewAccountType;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyOverviewAccountStore extends Store {
    private final MinervaAccountStore minervaAccountStore;
    private final RhyAccountStore rhyAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyOverviewAccountStore(RhyAccountStore rhyAccountStore, MinervaAccountStore minervaAccountStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rhyAccountStore = rhyAccountStore;
        this.minervaAccountStore = minervaAccountStore;
    }

    public static /* synthetic */ void refresh$default(RhyOverviewAccountStore rhyOverviewAccountStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        rhyOverviewAccountStore.refresh(z);
    }

    public final void refresh(boolean force) {
        this.rhyAccountStore.refresh(force);
        this.minervaAccountStore.refresh(force);
    }

    public final Observable<Tuples2<Optional<RhyAccount>, Optional<MinervaAccount>>> streamRhyAndMinervaAccounts() {
        Observable observableSwitchMap = this.rhyAccountStore.streamSpendingAccount().switchMap(new Function() { // from class: com.robinhood.librobinhood.store.RhyOverviewAccountStore.streamRhyAndMinervaAccounts.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Optional<RhyAccount>, Optional<MinervaAccount>>> apply(Optional<RhyAccount> spendingAccountOptional) {
                Observable<Optional<MinervaAccount>> observableStreamRhyMinervaAccountOptional;
                Intrinsics.checkNotNullParameter(spendingAccountOptional, "spendingAccountOptional");
                RhyAccount orNull = spendingAccountOptional.getOrNull();
                Observables observables = Observables.INSTANCE;
                Observable observableJust = Observable.just(spendingAccountOptional);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                if (orNull == null) {
                    observableStreamRhyMinervaAccountOptional = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNull(observableStreamRhyMinervaAccountOptional);
                } else {
                    observableStreamRhyMinervaAccountOptional = RhyOverviewAccountStore.this.minervaAccountStore.streamRhyMinervaAccountOptional(orNull.getId());
                }
                return observables.zip(observableJust, observableStreamRhyMinervaAccountOptional);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<Boolean> streamIsActiveRhyAccount() {
        Observable map = streamRhyAndMinervaAccounts().map(new Function() { // from class: com.robinhood.librobinhood.store.RhyOverviewAccountStore.streamIsActiveRhyAccount.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Tuples2<? extends Optional<RhyAccount>, ? extends Optional<MinervaAccount>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MinervaAccount orNull = it.getSecond().getOrNull();
                boolean z = false;
                if (orNull != null && orNull.isActive()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<Optional<MinervaAccount>> streamMinervaBrokerageAccount() {
        return this.minervaAccountStore.streamAccountOptional(ApiMinervaAccount.Type.BROKERAGE);
    }

    public final Observable<RhyOverviewAccountType> streamSpendingAccountType() {
        Observable<RhyOverviewAccountType> map = Observables.INSTANCE.zip(streamRhyAndMinervaAccounts(), streamMinervaBrokerageAccount()).map(new Function() { // from class: com.robinhood.librobinhood.store.RhyOverviewAccountStore.streamSpendingAccountType.1
            @Override // io.reactivex.functions.Function
            public final RhyOverviewAccountType apply(Tuples2<? extends Tuples2<? extends Optional<RhyAccount>, ? extends Optional<MinervaAccount>>, ? extends Optional<MinervaAccount>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Tuples2<? extends Optional<RhyAccount>, ? extends Optional<MinervaAccount>> tuples2Component1 = tuples2.component1();
                Optional<MinervaAccount> optionalComponent2 = tuples2.component2();
                RhyAccount orNull = tuples2Component1.getFirst().getOrNull();
                MinervaAccount orNull2 = tuples2Component1.getSecond().getOrNull();
                MinervaAccount orNull3 = optionalComponent2.getOrNull();
                if (orNull2 != null && orNull != null) {
                    return RhyOverviewAccountType.RHY;
                }
                if (orNull2 == null && orNull != null) {
                    return RhyOverviewAccountType.RHY_NO_DEBIT_CARD;
                }
                if (orNull3 != null && orNull2 == null && orNull == null) {
                    return RhyOverviewAccountType.CASH_MANAGEMENT;
                }
                return RhyOverviewAccountType.NONE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
