package com.robinhood.android.equitydetail.p123ui.carousel;

import android.content.Context;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesAndroid;
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

/* compiled from: EquityInstrumentCard.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fJ\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020%H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00020\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard;", "Lcom/robinhood/android/carousel/InstrumentCard;", "Ljava/util/UUID;", "context", "Landroid/content/Context;", "cardButtonGroupTitle", "", "cardButtonTitle", "callbacks", "Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard$Callbacks;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard$Callbacks;)V", "(Landroid/content/Context;)V", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "setInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "getQuoteStore", "()Lcom/robinhood/librobinhood/data/store/QuoteStore;", "setQuoteStore", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "instrumentIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "getButtonTitle", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "bindItem", "", "onClicked", "onAttachedToWindow", "Callbacks", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityInstrumentCard extends Hammer_EquityInstrumentCard<UUID> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private final BehaviorRelay<UUID> instrumentIdRelay;
    public InstrumentStore instrumentStore;
    public Navigator navigator;
    public QuoteStore quoteStore;

    /* compiled from: EquityInstrumentCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard$Callbacks;", "", "onEquityInstrumentClicked", "", "instrumentId", "Ljava/util/UUID;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEquityInstrumentClicked(UUID instrumentId);
    }

    public /* synthetic */ EquityInstrumentCard(Context context, String str, String str2, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, (i & 8) != 0 ? null : callbacks);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityInstrumentCard(Context context, String str, String str2, Callbacks callbacks) {
        super(context, str, str2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.callbacks = callbacks;
        BehaviorRelay<UUID> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.instrumentIdRelay = behaviorRelayCreate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquityInstrumentCard(Context context) {
        this(context, null, null, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final InstrumentStore getInstrumentStore() {
        InstrumentStore instrumentStore = this.instrumentStore;
        if (instrumentStore != null) {
            return instrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentStore");
        return null;
    }

    public final void setInstrumentStore(InstrumentStore instrumentStore) {
        Intrinsics.checkNotNullParameter(instrumentStore, "<set-?>");
        this.instrumentStore = instrumentStore;
    }

    public final QuoteStore getQuoteStore() {
        QuoteStore quoteStore = this.quoteStore;
        if (quoteStore != null) {
            return quoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quoteStore");
        return null;
    }

    public final void setQuoteStore(QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(quoteStore, "<set-?>");
        this.quoteStore = quoteStore;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.android.carousel.InstrumentCard
    public String getButtonTitle(UUID item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String string2 = item.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.carousel.InstrumentCard
    public void bindItem(UUID item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getInstrumentNameTxt().setText((CharSequence) null);
        getInstrumentSymbolTxt().setText((CharSequence) null);
        getInstrumentChangeTxt().setText(null, false);
        this.instrumentIdRelay.accept(item);
    }

    @Override // com.robinhood.android.carousel.InstrumentCard
    public void onClicked(UUID item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onEquityInstrumentClicked(item);
        }
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(item, null, null, InstrumentDetailSource.SIMILAR_INSTRUMENTS, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL, false, null, false, false, null, null, 4060, null);
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BehaviorRelay<UUID> behaviorRelay = this.instrumentIdRelay;
        final InstrumentStore instrumentStore = getInstrumentStore();
        Observable<R> observableSwitchMap = behaviorRelay.switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.carousel.EquityInstrumentCard.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final Observable<Instrument> apply(UUID p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return instrumentStore.getInstrument(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.carousel.EquityInstrumentCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityInstrumentCard.onAttachedToWindow$lambda$0(this.f$0, (Instrument) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.instrumentIdRelay.switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.carousel.EquityInstrumentCard.onAttachedToWindow.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Quote> apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EquityInstrumentCard.this.getQuoteStore().getStreamQuote().asObservable(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap2), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.carousel.EquityInstrumentCard$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityInstrumentCard.onAttachedToWindow$lambda$1(this.f$0, (Quote) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(EquityInstrumentCard equityInstrumentCard, Instrument instrument) {
        equityInstrumentCard.getInstrumentNameTxt().setText(instrument.getDisplayName());
        equityInstrumentCard.getInstrumentSymbolTxt().setText(instrument.getDisplaySymbol());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(EquityInstrumentCard equityInstrumentCard, Quote quote) {
        BigDecimal todaysPercentChange = quote.getTodaysPercentChange();
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(equityInstrumentCard), DirectionOverlay.INSTANCE.fromSignOf(todaysPercentChange), null, 2, null);
        equityInstrumentCard.getInstrumentChangeTxt().setText(Formats.getPercentDeltaFormat().format(todaysPercentChange));
        equityInstrumentCard.getInstrumentChangeTxt().setStale(quote.isStaleForUi());
        return Unit.INSTANCE;
    }
}
