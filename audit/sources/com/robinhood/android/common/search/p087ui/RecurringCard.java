package com.robinhood.android.common.search.p087ui;

import android.content.Context;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.p320db.Instrument;
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

/* compiled from: RecurringCard.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00020\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/RecurringCard;", "Lcom/robinhood/android/carousel/InstrumentCard;", "Ljava/util/UUID;", "context", "Landroid/content/Context;", "cardButtonGroupTitle", "", "cardButtonTitle", "callbacks", "Lcom/robinhood/android/common/search/ui/RecurringCard$Callbacks;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/common/search/ui/RecurringCard$Callbacks;)V", "(Landroid/content/Context;)V", "getCallbacks", "()Lcom/robinhood/android/common/search/ui/RecurringCard$Callbacks;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "setInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "instrumentIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "kotlin.jvm.PlatformType", "getButtonTitle", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "bindItem", "", "onClicked", "onAttachedToWindow", "Callbacks", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecurringCard extends Hammer_RecurringCard<UUID> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private final BehaviorRelay<UUID> instrumentIdRelay;
    public InstrumentStore instrumentStore;

    /* compiled from: RecurringCard.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/RecurringCard$Callbacks;", "", "onCardClicked", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Ljava/util/UUID;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCardClicked(UUID item);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringCard(Context context, String str, String str2, Callbacks callbacks) {
        super(context, str, str2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.callbacks = callbacks;
        BehaviorRelay<UUID> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.instrumentIdRelay = behaviorRelayCreate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecurringCard(Context context) {
        this(context, null, null, null);
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
        getInstrumentChangeTxt().setVisibilityText(null, false);
        this.instrumentIdRelay.accept(item);
    }

    @Override // com.robinhood.android.carousel.InstrumentCard
    public void onClicked(UUID item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onCardClicked(item);
        }
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<R> observableSwitchMap = this.instrumentIdRelay.switchMap(new Function() { // from class: com.robinhood.android.common.search.ui.RecurringCard.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UUID uuid) {
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                RecurringCard.this.getInstrumentStore().refresh(false, uuid);
                return RecurringCard.this.getInstrumentStore().getInstrument(uuid);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.search.ui.RecurringCard$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringCard.onAttachedToWindow$lambda$0(this.f$0, (Instrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(RecurringCard recurringCard, Instrument instrument) {
        recurringCard.getInstrumentNameTxt().setText(instrument.getDisplayName());
        recurringCard.getInstrumentSymbolTxt().setText(instrument.getDisplaySymbol());
        recurringCard.getInstrumentChangeTxt().setVisibilityText(null, false);
        return Unit.INSTANCE;
    }
}
