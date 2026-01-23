package com.robinhood.android.common.views;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.instrumentrow.C11218R;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.views.BaseInstrumentRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.options.optionsstring.common.UiOptionStrategyDisplays;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.coroutines.p287rx.RxFactory3;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.librobinhood.data.store.AggregateOptionStrategyQuoteStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.models.p320db.OptionTradingSession;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.store.lists.prefs.OptionsWatchlistViewModePref;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.LocalDate;

/* compiled from: OptionStrategyRowView.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 O2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002NOB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010H\u001a\u00020BH\u0014J\u0010\u0010I\u001a\u00020B2\u0006\u0010J\u001a\u00020\u0003H\u0016J\u0012\u0010K\u001a\u00020B2\b\u0010L\u001a\u0004\u0018\u00010MH\u0002R\u001e\u0010\u000b\u001a\u00020\f8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001e\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020.@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080706X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R4\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/common/views/OptionStrategyRowView;", "Lcom/robinhood/android/common/views/BaseInstrumentRowView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/common/views/OptionStrategyRowView$Data;", "Lcom/robinhood/coroutines/rx/RxFactoryHost;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "aggregateOptionStrategyQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "getAggregateOptionStrategyQuoteStore", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;", "setAggregateOptionStrategyQuoteStore", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionStrategyQuoteStore;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "getOptionMarketHoursStore", "()Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "setOptionMarketHoursStore", "(Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;)V", "optionsWatchlistViewModePref", "Lcom/robinhood/prefs/StringPreference;", "getOptionsWatchlistViewModePref", "()Lcom/robinhood/prefs/StringPreference;", "setOptionsWatchlistViewModePref", "(Lcom/robinhood/prefs/StringPreference;)V", "value", "", "strategyCode", "getStrategyCode", "()Ljava/lang/String;", "", "isExpired", "()Z", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "optionChain", "Lcom/robinhood/models/db/OptionChain;", "optionStrategyInfoRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "optionStrategyInfoObs", "Lio/reactivex/Observable;", "getOptionStrategyInfoObs", "()Lio/reactivex/Observable;", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "getViewMode", "()Lcom/robinhood/android/common/util/SecurityViewMode;", "Lkotlin/Function0;", "", "onQuoteClick", "getOnQuoteClick", "()Lkotlin/jvm/functions/Function0;", "setOnQuoteClick", "(Lkotlin/jvm/functions/Function0;)V", "onAttachedToWindow", "bind", "state", "refreshQuote", "quote", "Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "Data", "Companion", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionStrategyRowView extends Hammer_OptionStrategyRowView implements Bindable<Data>, RxFactory3 {
    public AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore;
    private CuratedListItem curatedListItem;
    public ExperimentsStore experimentsStore;
    private boolean isExpired;
    private Function0<Unit> onQuoteClick;
    private OptionChain optionChain;
    public OptionMarketHoursStore optionMarketHoursStore;
    private final BehaviorRelay<Optional<UiOptionStrategyInfo>> optionStrategyInfoRelay;

    @OptionsWatchlistViewModePref
    public StringPreference optionsWatchlistViewModePref;
    public RxFactory rxFactory;
    private String strategyCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.asObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.convertToObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxCompletable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxMaybe(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext coroutineContext, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxObservable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxSingle(this, coroutineContext, function2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorRelay<Optional<UiOptionStrategyInfo>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.optionStrategyInfoRelay = behaviorRelayCreateDefault;
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3
    public RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    public final AggregateOptionStrategyQuoteStore getAggregateOptionStrategyQuoteStore() {
        AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = this.aggregateOptionStrategyQuoteStore;
        if (aggregateOptionStrategyQuoteStore != null) {
            return aggregateOptionStrategyQuoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aggregateOptionStrategyQuoteStore");
        return null;
    }

    public final void setAggregateOptionStrategyQuoteStore(AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore) {
        Intrinsics.checkNotNullParameter(aggregateOptionStrategyQuoteStore, "<set-?>");
        this.aggregateOptionStrategyQuoteStore = aggregateOptionStrategyQuoteStore;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final OptionMarketHoursStore getOptionMarketHoursStore() {
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore;
        if (optionMarketHoursStore != null) {
            return optionMarketHoursStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionMarketHoursStore");
        return null;
    }

    public final void setOptionMarketHoursStore(OptionMarketHoursStore optionMarketHoursStore) {
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "<set-?>");
        this.optionMarketHoursStore = optionMarketHoursStore;
    }

    public final StringPreference getOptionsWatchlistViewModePref() {
        StringPreference stringPreference = this.optionsWatchlistViewModePref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionsWatchlistViewModePref");
        return null;
    }

    public final void setOptionsWatchlistViewModePref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.optionsWatchlistViewModePref = stringPreference;
    }

    public final String getStrategyCode() {
        String str = this.strategyCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("strategyCode");
        return null;
    }

    /* renamed from: isExpired, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    private final Observable<UiOptionStrategyInfo> getOptionStrategyInfoObs() {
        return ObservablesKt.filterIsPresent(this.optionStrategyInfoRelay);
    }

    private final SecurityViewMode getViewMode() {
        SecurityViewMode securityViewModeValueOf;
        String str = getOptionsWatchlistViewModePref().get();
        return (str == null || (securityViewModeValueOf = SecurityViewMode.valueOf(str)) == null) ? SecurityViewMode.LAST_PRICE : securityViewModeValueOf;
    }

    public final Function0<Unit> getOnQuoteClick() {
        return this.onQuoteClick;
    }

    public final void setOnQuoteClick(Function0<Unit> function0) {
        this.onQuoteClick = function0;
        setOnPriceClick(function0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable observableDistinctUntilChanged = getOptionStrategyInfoObs().map(new Function() { // from class: com.robinhood.android.common.views.OptionStrategyRowView$onAttachedToWindow$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((UiOptionStrategyInfo) it).getOptionStrategyInfo();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        final AggregateOptionStrategyQuoteStore aggregateOptionStrategyQuoteStore = getAggregateOptionStrategyQuoteStore();
        Observable observableSwitchMap = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.common.views.OptionStrategyRowView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final Observable<AggregateOptionStrategyQuote> apply(OptionStrategyInfo p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return aggregateOptionStrategyQuoteStore.streamAndPollQuoteObservable(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new C119023(this));
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getOptionStrategyInfoObs()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.OptionStrategyRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyRowView.onAttachedToWindow$lambda$2(this.f$0, (UiOptionStrategyInfo) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getOptionStrategyInfoObs().switchMap(new Function() { // from class: com.robinhood.android.common.views.OptionStrategyRowView.onAttachedToWindow.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionTradingSession> apply(UiOptionStrategyInfo strategyInfo) {
                Intrinsics.checkNotNullParameter(strategyInfo, "strategyInfo");
                OptionStrategyRowView optionStrategyRowView = OptionStrategyRowView.this;
                return optionStrategyRowView.asObservable(optionStrategyRowView.getOptionMarketHoursStore().currentOptionTradingSession(strategyInfo.getOptionChain(), strategyInfo.getUnderlyingType(), (LocalDate) strategyInfo.getExpirationDateRange().getStart()));
            }
        }).map(new Function() { // from class: com.robinhood.android.common.views.OptionStrategyRowView.onAttachedToWindow.6
            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionTradingSession currentOptionTradingSession) {
                Intrinsics.checkNotNullParameter(currentOptionTradingSession, "currentOptionTradingSession");
                return Boolean.valueOf(currentOptionTradingSession.isOpen());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.OptionStrategyRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyRowView.onAttachedToWindow$lambda$3(this.f$0, (Boolean) obj);
            }
        });
    }

    /* compiled from: OptionStrategyRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.views.OptionStrategyRowView$onAttachedToWindow$3 */
    /* synthetic */ class C119023 extends FunctionReferenceImpl implements Function1<AggregateOptionStrategyQuote, Unit> {
        C119023(Object obj) {
            super(1, obj, OptionStrategyRowView.class, "refreshQuote", "refreshQuote(Lcom/robinhood/models/db/AggregateOptionStrategyQuote;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AggregateOptionStrategyQuote aggregateOptionStrategyQuote) {
            invoke2(aggregateOptionStrategyQuote);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AggregateOptionStrategyQuote aggregateOptionStrategyQuote) {
            ((OptionStrategyRowView) this.receiver).refreshQuote(aggregateOptionStrategyQuote);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(OptionStrategyRowView optionStrategyRowView, UiOptionStrategyInfo optionStrategyInfo) {
        Intrinsics.checkNotNullParameter(optionStrategyInfo, "optionStrategyInfo");
        RhTextView detailTxt = optionStrategyRowView.getDetailTxt();
        Resources resources = optionStrategyRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        detailTxt.setText(UiOptionStrategyDisplays.getSubtitleString((UiOptionStrategyDisplay) optionStrategyInfo, resources, optionStrategyInfo.getOptionChain().getSettleOnOpen(), false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$3(OptionStrategyRowView optionStrategyRowView, Boolean bool) {
        BaseInstrumentRowView.TickerStyle tickerStyle;
        if (bool.booleanValue()) {
            tickerStyle = BaseInstrumentRowView.TickerStyle.FILLED;
        } else {
            tickerStyle = BaseInstrumentRowView.TickerStyle.OUTLINED;
        }
        BaseInstrumentRowView.setTickerStyle$default(optionStrategyRowView, tickerStyle, false, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(Data state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.strategyCode = state.getStrategyCode();
        this.isExpired = state.isExpired();
        this.curatedListItem = state.getCuratedListItem();
        this.optionChain = state.getOptionChain();
        RhTextView nameTxt = getNameTxt();
        nameTxt.setStale(state.getStrategyInfo() == null);
        CuratedListItem curatedListItem = this.curatedListItem;
        if (curatedListItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListItem");
            curatedListItem = null;
        }
        nameTxt.setText(curatedListItem.getDisplayName());
        this.optionStrategyInfoRelay.accept(Optional3.asOptional(state.getStrategyInfo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshQuote(AggregateOptionStrategyQuote quote) {
        ThemedResourceReference<Integer> color_foreground_3;
        CuratedListItem curatedListItem = null;
        if (quote != null) {
            SecurityViewMode viewMode = getViewMode();
            String string2 = getContext().getString(C41827R.string.general_label_n_a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            OptionChain optionChain = this.optionChain;
            CuratedListItem curatedListItem2 = this.curatedListItem;
            if (curatedListItem2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("curatedListItem");
                curatedListItem2 = null;
            }
            Money optionOpenPrice = curatedListItem2.getOptionOpenPrice();
            CuratedListItem curatedListItem3 = this.curatedListItem;
            if (curatedListItem3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("curatedListItem");
            } else {
                curatedListItem = curatedListItem3;
            }
            SecurityViewMode.FormatInfo formatInfoForOptionStrategy = viewMode.getFormatInfoForOptionStrategy(string2, quote, optionChain, optionOpenPrice, curatedListItem.getOptionOpenPriceDirection());
            String formattedDisplayAmount = formatInfoForOptionStrategy.getFormattedDisplayAmount();
            ScarletOverlay directionOverlay = formatInfoForOptionStrategy.getDirectionOverlay();
            boolean zIsStaleForUi = quote.isStaleForUi();
            getGraphView().setStale(zIsStaleForUi);
            setPriceText(formattedDisplayAmount, true);
            setPriceStale(zIsStaleForUi);
            putPriceOverlay(directionOverlay);
            if (zIsStaleForUi || this.isExpired) {
                color_foreground_3 = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3();
            } else {
                color_foreground_3 = ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
            }
            ScarletManager2.overrideAttribute(getFilledPriceTxt(), R.attr.backgroundTint, color_foreground_3);
            ScarletManager2.overrideAttribute(getOutlinedPriceTxt(), R.attr.backgroundTint, color_foreground_3);
            ScarletManager2.overrideAttribute(getOutlinedPriceTxt(), R.attr.textColor, color_foreground_3);
            return;
        }
        setPriceText(null, false);
    }

    /* compiled from: OptionStrategyRowView.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/views/OptionStrategyRowView$Data;", "", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "isExpired", "", "optionChain", "Lcom/robinhood/models/db/OptionChain;", "strategyCode", "", "strategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "<init>", "(Lcom/robinhood/models/db/CuratedListItem;ZLcom/robinhood/models/db/OptionChain;Ljava/lang/String;Lcom/robinhood/models/ui/UiOptionStrategyInfo;)V", "getCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "()Z", "getOptionChain", "()Lcom/robinhood/models/db/OptionChain;", "getStrategyCode", "()Ljava/lang/String;", "getStrategyInfo", "()Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Data {
        public static final int $stable = 8;
        private final CuratedListItem curatedListItem;
        private final boolean isExpired;
        private final OptionChain optionChain;
        private final String strategyCode;
        private final UiOptionStrategyInfo strategyInfo;

        public static /* synthetic */ Data copy$default(Data data, CuratedListItem curatedListItem, boolean z, OptionChain optionChain, String str, UiOptionStrategyInfo uiOptionStrategyInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedListItem = data.curatedListItem;
            }
            if ((i & 2) != 0) {
                z = data.isExpired;
            }
            if ((i & 4) != 0) {
                optionChain = data.optionChain;
            }
            if ((i & 8) != 0) {
                str = data.strategyCode;
            }
            if ((i & 16) != 0) {
                uiOptionStrategyInfo = data.strategyInfo;
            }
            UiOptionStrategyInfo uiOptionStrategyInfo2 = uiOptionStrategyInfo;
            OptionChain optionChain2 = optionChain;
            return data.copy(curatedListItem, z, optionChain2, str, uiOptionStrategyInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsExpired() {
            return this.isExpired;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionChain getOptionChain() {
            return this.optionChain;
        }

        /* renamed from: component4, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        /* renamed from: component5, reason: from getter */
        public final UiOptionStrategyInfo getStrategyInfo() {
            return this.strategyInfo;
        }

        public final Data copy(CuratedListItem curatedListItem, boolean isExpired, OptionChain optionChain, String strategyCode, UiOptionStrategyInfo strategyInfo) {
            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            return new Data(curatedListItem, isExpired, optionChain, strategyCode, strategyInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.curatedListItem, data.curatedListItem) && this.isExpired == data.isExpired && Intrinsics.areEqual(this.optionChain, data.optionChain) && Intrinsics.areEqual(this.strategyCode, data.strategyCode) && Intrinsics.areEqual(this.strategyInfo, data.strategyInfo);
        }

        public int hashCode() {
            int iHashCode = ((this.curatedListItem.hashCode() * 31) + Boolean.hashCode(this.isExpired)) * 31;
            OptionChain optionChain = this.optionChain;
            int iHashCode2 = (((iHashCode + (optionChain == null ? 0 : optionChain.hashCode())) * 31) + this.strategyCode.hashCode()) * 31;
            UiOptionStrategyInfo uiOptionStrategyInfo = this.strategyInfo;
            return iHashCode2 + (uiOptionStrategyInfo != null ? uiOptionStrategyInfo.hashCode() : 0);
        }

        public String toString() {
            return "Data(curatedListItem=" + this.curatedListItem + ", isExpired=" + this.isExpired + ", optionChain=" + this.optionChain + ", strategyCode=" + this.strategyCode + ", strategyInfo=" + this.strategyInfo + ")";
        }

        public Data(CuratedListItem curatedListItem, boolean z, OptionChain optionChain, String strategyCode, UiOptionStrategyInfo uiOptionStrategyInfo) {
            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            this.curatedListItem = curatedListItem;
            this.isExpired = z;
            this.optionChain = optionChain;
            this.strategyCode = strategyCode;
            this.strategyInfo = uiOptionStrategyInfo;
        }

        public /* synthetic */ Data(CuratedListItem curatedListItem, boolean z, OptionChain optionChain, String str, UiOptionStrategyInfo uiOptionStrategyInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(curatedListItem, (i & 2) != 0 ? false : z, optionChain, str, uiOptionStrategyInfo);
        }

        public final CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        public final boolean isExpired() {
            return this.isExpired;
        }

        public final OptionChain getOptionChain() {
            return this.optionChain;
        }

        public final String getStrategyCode() {
            return this.strategyCode;
        }

        public final UiOptionStrategyInfo getStrategyInfo() {
            return this.strategyInfo;
        }
    }

    /* compiled from: OptionStrategyRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/views/OptionStrategyRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/OptionStrategyRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionStrategyRowView> {
        private final /* synthetic */ Inflater<OptionStrategyRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionStrategyRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionStrategyRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11218R.layout.include_row_watchlist_option_strategy);
        }
    }
}
