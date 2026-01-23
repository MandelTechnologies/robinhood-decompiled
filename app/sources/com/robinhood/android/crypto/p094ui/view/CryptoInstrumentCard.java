package com.robinhood.android.crypto.p094ui.view;

import android.content.Context;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoInstrumentCard.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0002H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010'\u001a\u00020\u0002H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020)H\u0014R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00020\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/CryptoInstrumentCard;", "Lcom/robinhood/android/carousel/InstrumentCard;", "Ljava/util/UUID;", "context", "Landroid/content/Context;", "cardButtonGroupTitle", "", "cardButtonTitle", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/content/Context;)V", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "getCurrencyPairStore", "()Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "setCurrencyPairStore", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;)V", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "getCryptoQuoteStore", "()Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "setCryptoQuoteStore", "(Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;)V", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "getCryptoHistoricalStore", "()Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "setCryptoHistoricalStore", "(Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "instrumentIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "getButtonTitle", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "bindItem", "", "onClicked", "onAttachedToWindow", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoInstrumentCard extends Hammer_CryptoInstrumentCard<UUID> {
    public static final int $stable = 8;
    public CryptoHistoricalStore cryptoHistoricalStore;
    public CryptoQuoteStore cryptoQuoteStore;
    public CurrencyPairStore currencyPairStore;
    private final BehaviorRelay<UUID> instrumentIdRelay;
    public Navigator navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoInstrumentCard(Context context, String str, String str2) {
        super(context, str, str2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorRelay<UUID> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.instrumentIdRelay = behaviorRelayCreate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoInstrumentCard(Context context) {
        this(context, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final CurrencyPairStore getCurrencyPairStore() {
        CurrencyPairStore currencyPairStore = this.currencyPairStore;
        if (currencyPairStore != null) {
            return currencyPairStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currencyPairStore");
        return null;
    }

    public final void setCurrencyPairStore(CurrencyPairStore currencyPairStore) {
        Intrinsics.checkNotNullParameter(currencyPairStore, "<set-?>");
        this.currencyPairStore = currencyPairStore;
    }

    public final CryptoQuoteStore getCryptoQuoteStore() {
        CryptoQuoteStore cryptoQuoteStore = this.cryptoQuoteStore;
        if (cryptoQuoteStore != null) {
            return cryptoQuoteStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoQuoteStore");
        return null;
    }

    public final void setCryptoQuoteStore(CryptoQuoteStore cryptoQuoteStore) {
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "<set-?>");
        this.cryptoQuoteStore = cryptoQuoteStore;
    }

    public final CryptoHistoricalStore getCryptoHistoricalStore() {
        CryptoHistoricalStore cryptoHistoricalStore = this.cryptoHistoricalStore;
        if (cryptoHistoricalStore != null) {
            return cryptoHistoricalStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoHistoricalStore");
        return null;
    }

    public final void setCryptoHistoricalStore(CryptoHistoricalStore cryptoHistoricalStore) {
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "<set-?>");
        this.cryptoHistoricalStore = cryptoHistoricalStore;
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
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(item, null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<R> observableSwitchMap = this.instrumentIdRelay.switchMap(new Function() { // from class: com.robinhood.android.crypto.ui.view.CryptoInstrumentCard.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiCurrencyPair> apply(UUID uuid) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                CryptoInstrumentCard.this.getCurrencyPairStore().refresh(false, uuid);
                return CryptoInstrumentCard.this.getCurrencyPairStore().streamCurrencyPair(uuid);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.view.CryptoInstrumentCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoInstrumentCard.onAttachedToWindow$lambda$0(this.f$0, (UiCurrencyPair) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.instrumentIdRelay.switchMap(new Function() { // from class: com.robinhood.android.crypto.ui.view.CryptoInstrumentCard.onAttachedToWindow.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CryptoQuote> apply(UUID uuid) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                return CryptoInstrumentCard.this.getCryptoQuoteStore().getStreamCryptoQuote().asObservable(new CryptoQuoteStore.CryptoQuoteArgs(uuid, null, null, 6, null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap2), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.view.CryptoInstrumentCard$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoInstrumentCard.onAttachedToWindow$lambda$1(this.f$0, (CryptoQuote) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(CryptoInstrumentCard cryptoInstrumentCard, UiCurrencyPair uiCurrencyPair) {
        cryptoInstrumentCard.getInstrumentNameTxt().setText(uiCurrencyPair.getDisplayName());
        cryptoInstrumentCard.getInstrumentSymbolTxt().setText(uiCurrencyPair.getDisplaySymbol());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(CryptoInstrumentCard cryptoInstrumentCard, CryptoQuote cryptoQuote) {
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(cryptoInstrumentCard), DirectionOverlay.INSTANCE.fromSignOf(cryptoQuote.getPercentChange()), null, 2, null);
        cryptoInstrumentCard.getInstrumentChangeTxt().setText(Formats.getPercentDeltaFormat().format(cryptoQuote.getPercentChange()));
        cryptoInstrumentCard.getInstrumentChangeTxt().setStale(cryptoQuote.isStaleForUi());
        return Unit.INSTANCE;
    }
}
