package com.robinhood.librobinhood.data.store.rhy;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyAccountLoggingStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\u0010\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001aR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000b0\u000b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RhyAccountLoggingStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/store/StoreBundle;)V", "rhyAccountType", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "getRhyAccountType", "()Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "rhyAccountTypeObservable", "Lio/reactivex/Observable;", "getRhyAccountTypeObservable", "()Lio/reactivex/Observable;", "rhyAccountTypeRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "rhyContextAccountTypeEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "hasBrokerageAccountSingle", "Lio/reactivex/Single;", "", "hasRhyAccountSingle", "rhyContextAccountTypeSingle", "stream", "refresh", "force", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyAccountLoggingStore extends Store {
    private final Single<Boolean> hasBrokerageAccountSingle;
    private final Single<Boolean> hasRhyAccountSingle;
    private final BehaviorRelay<RHYContext.AccountType> rhyAccountTypeRelay;
    private final Endpoint<Unit, RHYContext.AccountType> rhyContextAccountTypeEndpoint;
    private final Single<RHYContext.AccountType> rhyContextAccountTypeSingle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyAccountLoggingStore(AccountProvider accountProvider, RhyAccountStore rhyAccountStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        BehaviorRelay<RHYContext.AccountType> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.rhyAccountTypeRelay = behaviorRelayCreate;
        this.rhyContextAccountTypeEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RhyAccountLoggingStore3(this, null), getLogoutKillswitch(), new RhyAccountLoggingStore4(behaviorRelayCreate), storeBundle.getClock(), null, 16, null);
        Single<Boolean> singleForceFetchHasBrokerageAccountIfNotCached = accountProvider.forceFetchHasBrokerageAccountIfNotCached();
        this.hasBrokerageAccountSingle = singleForceFetchHasBrokerageAccountIfNotCached;
        Single map = rhyAccountStore.forceFetchAccountIfNotCached().map(new Function() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore$hasRhyAccountSingle$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Optional<RhyAccount> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                return Boolean.valueOf(optional.component1() != null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.hasRhyAccountSingle = map;
        Single<RHYContext.AccountType> map2 = Singles.INSTANCE.zip(singleForceFetchHasBrokerageAccountIfNotCached, map).map(new Function() { // from class: com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore$rhyContextAccountTypeSingle$1
            @Override // io.reactivex.functions.Function
            public final RHYContext.AccountType apply(Tuples2<Boolean, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Boolean boolComponent1 = tuples2.component1();
                Boolean boolComponent2 = tuples2.component2();
                if (boolComponent1.booleanValue() && boolComponent2.booleanValue()) {
                    return RHYContext.AccountType.RHS_RHY;
                }
                if (boolComponent2.booleanValue()) {
                    return RHYContext.AccountType.RHY_ONLY;
                }
                if (boolComponent1.booleanValue()) {
                    return RHYContext.AccountType.RHS_ONLY;
                }
                return RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.rhyContextAccountTypeSingle = map2;
    }

    public final RHYContext.AccountType getRhyAccountType() {
        RHYContext.AccountType value = this.rhyAccountTypeRelay.getValue();
        return value == null ? RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED : value;
    }

    public final Observable<RHYContext.AccountType> getRhyAccountTypeObservable() {
        return this.rhyAccountTypeRelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object rhyContextAccountTypeEndpoint$accept(BehaviorRelay behaviorRelay, RHYContext.AccountType accountType, Continuation continuation) {
        behaviorRelay.accept(accountType);
        return Unit.INSTANCE;
    }

    public final Observable<RHYContext.AccountType> stream() {
        return asObservable(Endpoint.DefaultImpls.poll$default(this.rhyContextAccountTypeEndpoint, Unit.INSTANCE, null, null, 6, null));
    }

    public static /* synthetic */ void refresh$default(RhyAccountLoggingStore rhyAccountLoggingStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        rhyAccountLoggingStore.refresh(z);
    }

    public final void refresh(boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.rhyContextAccountTypeEndpoint, Unit.INSTANCE, force, null, 4, null);
    }
}
