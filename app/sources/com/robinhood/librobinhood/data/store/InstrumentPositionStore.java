package com.robinhood.librobinhood.data.store;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.dao.InstrumentPositionDao;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.InstrumentPosition;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentPositionStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentPositionDao;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/InstrumentPositionDao;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/PositionStore;)V", "getIndividualAccountHoldingInstrumentPositions", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/ui/InstrumentPosition;", "refreshIndividualAccountHoldingInstrumentPositions", "", "force", "", "getHoldingInstrumentPositionsForAccount", "accountNumber", "", "refreshHoldingInstrumentPositionsForAccount", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentPositionStore extends Store {
    private final AccountProvider accountProvider;
    private final InstrumentPositionDao dao;
    private final PositionStore positionStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentPositionStore(StoreBundle storeBundle, InstrumentPositionDao dao, AccountProvider accountProvider, PositionStore positionStore) {
        super(storeBundle, Position.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        this.dao = dao;
        this.accountProvider = accountProvider;
        this.positionStore = positionStore;
    }

    public final Observable<List<InstrumentPosition>> getIndividualAccountHoldingInstrumentPositions() {
        Observable observableFlatMapObservable = this.accountProvider.getIndividualAccountNumberMaybe().flatMapObservable(new Function() { // from class: com.robinhood.librobinhood.data.store.InstrumentPositionStore.getIndividualAccountHoldingInstrumentPositions.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<InstrumentPosition>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                InstrumentPositionStore instrumentPositionStore = InstrumentPositionStore.this;
                return instrumentPositionStore.asObservable(instrumentPositionStore.takeWhileLoggedIn(instrumentPositionStore.dao.getInstrumentPositions(accountNumber)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        return observableFlatMapObservable;
    }

    public final void refreshIndividualAccountHoldingInstrumentPositions(boolean force) {
        this.accountProvider.refresh(false);
        this.positionStore.refreshIndividualAccount(force);
    }

    public final Observable<List<InstrumentPosition>> getHoldingInstrumentPositionsForAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(takeWhileLoggedIn(this.dao.getInstrumentPositions(accountNumber)));
    }

    public final void refreshHoldingInstrumentPositionsForAccount(boolean force, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountProvider.refresh(false);
        this.positionStore.refreshAccount(accountNumber, force);
    }
}
