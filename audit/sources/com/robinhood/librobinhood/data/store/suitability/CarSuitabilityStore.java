package com.robinhood.librobinhood.data.store.suitability;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.CarRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CarSuitabilityStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/suitability/CarSuitabilityStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "", "accountNumber", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "carSuitabilityType", "Lkotlinx/coroutines/flow/Flow;", "", "streamCarRequired", "(Ljava/lang/String;Lcom/robinhood/shared/i18n/car/CarSuitabilityType;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lj$/time/Clock;", "lib-store-suitability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CarSuitabilityStore extends Store {
    private final AccountProvider accountProvider;
    private final Clock clock;
    private final InstrumentStore instrumentStore;
    private final RegionGateProvider regionGateProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarSuitabilityStore(AccountProvider accountProvider, InstrumentStore instrumentStore, RegionGateProvider regionGateProvider, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.regionGateProvider = regionGateProvider;
        this.clock = clock;
    }

    public final Flow<Boolean> streamCarRequired(final String accountNumber, CarSuitabilityType carSuitabilityType) {
        final Observable observableJust;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(carSuitabilityType, "carSuitabilityType");
        if (carSuitabilityType instanceof CarSuitabilityType.Equity) {
            CarSuitabilityType.Equity equity = (CarSuitabilityType.Equity) carSuitabilityType;
            if (equity.getInstrumentIds().isEmpty() || !equity.isBuy()) {
                observableJust = Observable.just(Boolean.FALSE);
            } else {
                observableJust = this.instrumentStore.getInstruments(equity.getInstrumentIds()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.suitability.CarSuitabilityStore$streamCarRequired$instrumentHasCarRequiredObservable$1
                    @Override // io.reactivex.functions.Function
                    public final Boolean apply(List<Instrument> instruments) {
                        Intrinsics.checkNotNullParameter(instruments, "instruments");
                        List<Instrument> list = instruments;
                        boolean z = false;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((Instrument) it.next()).getCarRequired()) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                });
            }
        } else if (Intrinsics.areEqual(carSuitabilityType, CarSuitabilityType.Option.INSTANCE)) {
            observableJust = Observable.just(Boolean.TRUE);
        } else {
            if (!Intrinsics.areEqual(carSuitabilityType, CarSuitabilityType.Unsupported.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            observableJust = Observable.just(Boolean.FALSE);
        }
        Observable observableOnErrorReturn = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, CarRegionGate.INSTANCE, false, 2, null).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.suitability.CarSuitabilityStore.streamCarRequired.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Boolean> apply(Boolean inCarRegion) {
                Intrinsics.checkNotNullParameter(inCarRegion, "inCarRegion");
                if (inCarRegion.booleanValue()) {
                    Observables observables = Observables.INSTANCE;
                    Observable<Account> observableStreamAccount = CarSuitabilityStore.this.accountProvider.streamAccount(accountNumber);
                    Observable<Boolean> observable = observableJust;
                    Intrinsics.checkNotNull(observable);
                    final CarSuitabilityStore carSuitabilityStore = CarSuitabilityStore.this;
                    Observable observableCombineLatest = Observable.combineLatest(observableStreamAccount, observable, new BiFunction<T1, T2, R>() { // from class: com.robinhood.librobinhood.data.store.suitability.CarSuitabilityStore$streamCarRequired$1$apply$$inlined$combineLatest$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.functions.BiFunction
                        public final R apply(T1 t1, T2 t2) {
                            Intrinsics.checkParameterIsNotNull(t1, "t1");
                            Intrinsics.checkParameterIsNotNull(t2, "t2");
                            Boolean bool = (Boolean) t2;
                            Instant carValidUntil = ((Account) t1).getCarValidUntil();
                            return (R) Boolean.valueOf((carValidUntil == null || carValidUntil.compareTo(Instant.now(carSuitabilityStore.clock)) < 0) && bool.booleanValue());
                        }
                    });
                    Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
                    return observableCombineLatest;
                }
                Observable observableJust2 = Observable.just(Boolean.FALSE);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.suitability.CarSuitabilityStore.streamCarRequired.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableOnErrorReturn), Integer.MAX_VALUE, null, 2, null);
    }
}
