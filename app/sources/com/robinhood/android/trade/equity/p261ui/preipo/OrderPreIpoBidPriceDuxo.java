package com.robinhood.android.trade.equity.p261ui.preipo;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.trade.equity.p261ui.preipo.OrderPreIpoBidPriceFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderPreIpoBidPriceDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "updatePrice", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/utils/Optional;", "Ljava/math/BigDecimal;", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderPreIpoBidPriceDuxo extends OldBaseDuxo<OrderPreIpoBidPriceViewState> implements HasSavedState {
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OrderPreIpoBidPriceDuxo(InstrumentStore instrumentStore, QuoteStore quoteStore, SavedStateHandle savedStateHandle) {
        super(new OrderPreIpoBidPriceViewState(((OrderPreIpoBidPriceFragment.Args) INSTANCE.getArgs(savedStateHandle)).getInstrumentId(), null, null, null, 14, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OrderPreIpoBidPriceViewState) it).getInstrumentId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OrderPreIpoBidPriceDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableRefCount = ObservablesKt.filterIsPresent(map).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OrderPreIpoBidPriceDuxo.this.instrumentStore.refresh(false, it);
                return OrderPreIpoBidPriceDuxo.this.instrumentStore.getInstrument(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPreIpoBidPriceDuxo.onResume$lambda$2(this.f$0, (Instrument) obj);
            }
        });
        Observable observableSwitchMap2 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends IpoQuote> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OrderPreIpoBidPriceDuxo.this.quoteStore.getStreamIpoQuote().asObservable(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPreIpoBidPriceDuxo.onResume$lambda$4(this.f$0, (IpoQuote) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(OrderPreIpoBidPriceDuxo orderPreIpoBidPriceDuxo, final Instrument instrument) {
        orderPreIpoBidPriceDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPreIpoBidPriceDuxo.onResume$lambda$2$lambda$1(instrument, (OrderPreIpoBidPriceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderPreIpoBidPriceViewState onResume$lambda$2$lambda$1(Instrument instrument, OrderPreIpoBidPriceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderPreIpoBidPriceViewState.copy$default(applyMutation, null, null, instrument, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(OrderPreIpoBidPriceDuxo orderPreIpoBidPriceDuxo, final IpoQuote ipoQuote) {
        orderPreIpoBidPriceDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPreIpoBidPriceDuxo.onResume$lambda$4$lambda$3(ipoQuote, (OrderPreIpoBidPriceViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderPreIpoBidPriceViewState onResume$lambda$4$lambda$3(IpoQuote ipoQuote, OrderPreIpoBidPriceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderPreIpoBidPriceViewState.copy$default(applyMutation, null, ipoQuote, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderPreIpoBidPriceViewState updatePrice$lambda$5(Optional optional, OrderPreIpoBidPriceViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderPreIpoBidPriceViewState.copy$default(applyMutation, null, null, null, (BigDecimal) optional.getOrNull(), 7, null);
    }

    public final void updatePrice(final Optional<? extends BigDecimal> price) {
        Intrinsics.checkNotNullParameter(price, "price");
        applyMutation(new Function1() { // from class: com.robinhood.android.trade.equity.ui.preipo.OrderPreIpoBidPriceDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPreIpoBidPriceDuxo.updatePrice$lambda$5(price, (OrderPreIpoBidPriceViewState) obj);
            }
        });
    }

    /* compiled from: OrderPreIpoBidPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceDuxo;", "Lcom/robinhood/android/trade/equity/ui/preipo/OrderPreIpoBidPriceFragment$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OrderPreIpoBidPriceDuxo, OrderPreIpoBidPriceFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderPreIpoBidPriceFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OrderPreIpoBidPriceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderPreIpoBidPriceFragment.Args getArgs(OrderPreIpoBidPriceDuxo orderPreIpoBidPriceDuxo) {
            return (OrderPreIpoBidPriceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, orderPreIpoBidPriceDuxo);
        }
    }
}
