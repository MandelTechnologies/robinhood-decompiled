package com.robinhood.android.trade.equity.account;

import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore2;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherRefreshEvent.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ap\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\n¨\u0006\u0010"}, m3636d2 = {"refreshAccountSwitcherExtension", "", "Lcom/robinhood/android/udf/BaseEventDuxo;", "accountSwitcherRefreshSubject", "Lio/reactivex/Observable;", "instrumentId", "Ljava/util/UUID;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "updateLoadingAccountSwitcher", "Lkotlin/Function1;", "", "updateAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "submitErrorEvent", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent;", "feature-trade-equity_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.account.AccountSwitcherRefreshEventKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AccountSwitcherRefreshEvent {
    public static final void refreshAccountSwitcherExtension(BaseDuxo3<?, ?, ?> baseDuxo3, Observable<Unit> accountSwitcherRefreshSubject, final UUID instrumentId, final InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, final Function1<? super Boolean, Unit> updateLoadingAccountSwitcher, final Function1<? super InstrumentAccountSwitcher, Unit> updateAccountSwitcher, final Function1<? super EquityOrderEvent, Unit> submitErrorEvent) {
        Intrinsics.checkNotNullParameter(baseDuxo3, "<this>");
        Intrinsics.checkNotNullParameter(accountSwitcherRefreshSubject, "accountSwitcherRefreshSubject");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(updateLoadingAccountSwitcher, "updateLoadingAccountSwitcher");
        Intrinsics.checkNotNullParameter(updateAccountSwitcher, "updateAccountSwitcher");
        Intrinsics.checkNotNullParameter(submitErrorEvent, "submitErrorEvent");
        Observable<R> observableSwitchMap = accountSwitcherRefreshSubject.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.account.AccountSwitcherRefreshEventKt.refreshAccountSwitcherExtension.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends InstrumentAccountSwitcherStore2> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InstrumentAccountSwitcherStore.forceFetchAccountSwitcher$default(instrumentAccountSwitcherStore, instrumentId, null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(baseDuxo3, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.account.AccountSwitcherRefreshEventKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSwitcherRefreshEvent.refreshAccountSwitcherExtension$lambda$0(submitErrorEvent, updateLoadingAccountSwitcher, updateAccountSwitcher, (InstrumentAccountSwitcherStore2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAccountSwitcherExtension$lambda$0(Function1 function1, Function1 function12, Function1 function13, InstrumentAccountSwitcherStore2 instrumentAccountSwitcherStore2) {
        if (instrumentAccountSwitcherStore2 instanceof InstrumentAccountSwitcherStore2.Failure) {
            function1.invoke(new EquityOrderEvent.AccountSwitcherRefreshedEvent(null, ((InstrumentAccountSwitcherStore2.Failure) instrumentAccountSwitcherStore2).getThrowable()));
            function12.invoke(Boolean.FALSE);
        } else if (Intrinsics.areEqual(instrumentAccountSwitcherStore2, InstrumentAccountSwitcherStore2.Loading.INSTANCE)) {
            function12.invoke(Boolean.TRUE);
        } else {
            if (!(instrumentAccountSwitcherStore2 instanceof InstrumentAccountSwitcherStore2.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            function12.invoke(Boolean.FALSE);
            function13.invoke(((InstrumentAccountSwitcherStore2.Success) instrumentAccountSwitcherStore2).getSwitcher());
        }
        return Unit.INSTANCE;
    }
}
