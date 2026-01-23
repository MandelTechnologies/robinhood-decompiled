package com.robinhood.android.trade.equity.symbol;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.p320db.Instrument;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderWithSymbolDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/trade/equity/symbol/EquityOrderWithSymbolViewState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getInstrument", "", "symbol", "", "instrumentIdObs", "Lio/reactivex/Observable;", "Ljava/util/UUID;", "instrumentSymbol", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EquityOrderWithSymbolDuxo extends BaseDuxo4<EquityOrderWithSymbolViewState> {
    public static final int $stable = 8;
    private final InstrumentStore instrumentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderWithSymbolDuxo(InstrumentStore instrumentStore, DuxoBundle duxoBundle) {
        super(new EquityOrderWithSymbolViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.instrumentStore = instrumentStore;
    }

    public final void getInstrument(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Observable<UUID> observableTake = instrumentIdObs(symbol).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderWithSymbolDuxo.getInstrument$lambda$0(this.f$0, (UUID) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInstrument$lambda$0(EquityOrderWithSymbolDuxo equityOrderWithSymbolDuxo, UUID uuid) {
        equityOrderWithSymbolDuxo.applyMutation(new EquityOrderWithSymbolDuxo2(uuid, null));
        return Unit.INSTANCE;
    }

    private final Observable<UUID> instrumentIdObs(String instrumentSymbol) {
        InstrumentStore.refreshBySymbol$default(this.instrumentStore, false, instrumentSymbol, false, 4, null);
        Observable map = this.instrumentStore.getInstrumentBySymbol(instrumentSymbol).take(1L).map(new Function() { // from class: com.robinhood.android.trade.equity.symbol.EquityOrderWithSymbolDuxo.instrumentIdObs.1
            @Override // io.reactivex.functions.Function
            public final UUID apply(Instrument it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
