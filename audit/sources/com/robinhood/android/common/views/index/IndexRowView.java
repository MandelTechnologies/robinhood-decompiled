package com.robinhood.android.common.views.index;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.instrumentrow.C11218R;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.views.BaseInstrumentRowView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.onedaycharts.OneDayMiniChart;
import com.robinhood.android.onedaycharts.OneDayMiniChartDetails;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndexRowView.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010$\u001a\u00020\u0010H\u0014J\u0010\u0010%\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010'J\u001e\u0010(\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR4\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/common/views/index/IndexRowView;", "Lcom/robinhood/android/common/views/BaseInstrumentRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/common/views/index/IndexRowViewDuxo;", "getDuxo", "()Lcom/robinhood/android/common/views/index/IndexRowViewDuxo;", "setDuxo", "(Lcom/robinhood/android/common/views/index/IndexRowViewDuxo;)V", "value", "Lkotlin/Function0;", "", "onQuoteClick", "getOnQuoteClick", "()Lkotlin/jvm/functions/Function0;", "setOnQuoteClick", "(Lkotlin/jvm/functions/Function0;)V", "indexId", "Ljava/util/UUID;", "getIndexId", "()Ljava/util/UUID;", "setIndexId", "(Ljava/util/UUID;)V", "<set-?>", "", "isDay", "()Z", "setDay", "(Z)V", "isDay$delegate", "Landroidx/compose/runtime/MutableState;", "onAttachedToWindow", "setViewMode", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "bind", "displayName", "", "symbol", "refreshUi", "state", "Lcom/robinhood/android/common/views/index/IndexRowViewState;", "Companion", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IndexRowView extends Hammer_IndexRowView {
    public IndexRowViewDuxo duxo;
    public UUID indexId;

    /* renamed from: isDay$delegate, reason: from kotlin metadata */
    private final SnapshotState isDay;
    private Function0<Unit> onQuoteClick;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        BaseInstrumentRowView.setTickerStyle$default(this, BaseInstrumentRowView.TickerStyle.FILLED, false, 2, null);
        this.isDay = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public final IndexRowViewDuxo getDuxo() {
        IndexRowViewDuxo indexRowViewDuxo = this.duxo;
        if (indexRowViewDuxo != null) {
            return indexRowViewDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(IndexRowViewDuxo indexRowViewDuxo) {
        Intrinsics.checkNotNullParameter(indexRowViewDuxo, "<set-?>");
        this.duxo = indexRowViewDuxo;
    }

    public final Function0<Unit> getOnQuoteClick() {
        return this.onQuoteClick;
    }

    public final void setOnQuoteClick(Function0<Unit> function0) {
        this.onQuoteClick = function0;
        setOnPriceClick(function0);
    }

    public final UUID getIndexId() {
        UUID uuid = this.indexId;
        if (uuid != null) {
            return uuid;
        }
        Intrinsics.throwUninitializedPropertyAccessException("indexId");
        return null;
    }

    public final void setIndexId(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.indexId = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDay() {
        return ((Boolean) this.isDay.getValue()).booleanValue();
    }

    private final void setDay(boolean z) {
        this.isDay.setValue(Boolean.valueOf(z));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewDisposerKt.bindTo$default(Contexts7.requireBaseActivityBaseContext(context).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowView.onAttachedToWindow$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
        ViewDisposerKt.bindTo$default(DayNightChanges.isDayChanges(ScarletManager2.getScarletManager(this)), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowView.onAttachedToWindow$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.index.IndexRowView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndexRowView.onAttachedToWindow$lambda$2(this.f$0, (IndexRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(IndexRowView indexRowView, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(indexRowView), overlay, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(IndexRowView indexRowView, DayNightOverlay isDay) {
        Intrinsics.checkNotNullParameter(isDay, "isDay");
        indexRowView.setDay(DayNightChanges.isDay(isDay));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(IndexRowView indexRowView, IndexRowViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        indexRowView.refreshUi(state);
        return Unit.INSTANCE;
    }

    public final void setViewMode(SecurityViewMode viewMode) {
        getDuxo().updateViewMode(viewMode);
    }

    public final void bind(final UUID indexId, String displayName, String symbol) {
        ComposeView composeView;
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if ((this.indexId == null || !Intrinsics.areEqual(getIndexId(), indexId)) && (composeView = getComposeView()) != null) {
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
            composeView.setContent(ComposableLambda3.composableLambdaInstance(47346691, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.views.index.IndexRowView$bind$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(47346691, i, -1, "com.robinhood.android.common.views.index.IndexRowView.bind.<anonymous>.<anonymous> (IndexRowView.kt:90)");
                    }
                    Boolean boolValueOf = Boolean.valueOf(this.this$0.isDay());
                    final UUID uuid = indexId;
                    BentoTheme2.BentoTheme(boolValueOf, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1590387019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.views.index.IndexRowView$bind$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1590387019, i2, -1, "com.robinhood.android.common.views.index.IndexRowView.bind.<anonymous>.<anonymous>.<anonymous> (IndexRowView.kt:91)");
                            }
                            OneDayMiniChartDetails oneDayMiniChartDetails = new OneDayMiniChartDetails(uuid, InstrumentType.INDEX);
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            String string2 = uuid.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            OneDayMiniChart.OneDayMiniChart(oneDayMiniChartDetails, modifierFillMaxSize$default, string2, null, false, composer2, OneDayMiniChartDetails.$stable | 48, 24);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        setIndexId(indexId);
        getDuxo().setData(indexId, displayName, symbol);
    }

    private final void refreshUi(IndexRowViewState state) {
        ThemedResourceReference<Integer> color_primary;
        getNameTxt().setText(state.getSymbol());
        getDetailTxt().setText(state.getDisplayName());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SecurityViewMode.FormatInfo priceInfo = state.getPriceInfo(context);
        if (priceInfo != null) {
            String formattedDisplayAmount = priceInfo.getFormattedDisplayAmount();
            ScarletOverlay directionOverlay = priceInfo.getDirectionOverlay();
            boolean zIsStale = state.isStale();
            setPriceText(formattedDisplayAmount, true);
            setPriceStale(state.isStale());
            putPriceOverlay(directionOverlay);
            if (zIsStale) {
                color_primary = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3();
            } else {
                color_primary = ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
            }
            ScarletManager2.overrideAttribute(getFilledPriceTxt(), R.attr.backgroundTint, color_primary);
        }
    }

    /* compiled from: IndexRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/views/index/IndexRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/index/IndexRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<IndexRowView> {
        private final /* synthetic */ Inflater<IndexRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IndexRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IndexRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11218R.layout.include_row_watchlist_index);
        }
    }
}
