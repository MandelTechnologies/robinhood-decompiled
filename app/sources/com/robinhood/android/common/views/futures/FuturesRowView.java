package com.robinhood.android.common.views.futures;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
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
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.common.instrumentrow.C11218R;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.views.BaseInstrumentRowView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.android.sdui.chartgroup.SduiChartMappersKt;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.models.serverdriven.experimental.api.ChartFill;
import com.robinhood.models.serverdriven.experimental.api.Line;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesRowView.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010,\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010.J\b\u0010/\u001a\u00020&H\u0014J2\u00100\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u001eJ\u0010\u00107\u001a\u00020&2\u0006\u00108\u001a\u000209H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R;\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R4\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/common/views/futures/FuturesRowView;", "Lcom/robinhood/android/common/views/BaseInstrumentRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/common/views/futures/FuturesRowViewDuxo;", "getDuxo", "()Lcom/robinhood/android/common/views/futures/FuturesRowViewDuxo;", "setDuxo", "(Lcom/robinhood/android/common/views/futures/FuturesRowViewDuxo;)V", "contractId", "Ljava/util/UUID;", "getContractId", "()Ljava/util/UUID;", "setContractId", "(Ljava/util/UUID;)V", "<set-?>", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "chart", "getChart", "()Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "setChart", "(Lcom/robinhood/models/serverdriven/experimental/api/Chart;)V", "chart$delegate", "Landroidx/compose/runtime/MutableState;", "", "isDay", "()Z", "setDay", "(Z)V", "isDay$delegate", "value", "Lkotlin/Function0;", "", "onQuoteClick", "getOnQuoteClick", "()Lkotlin/jvm/functions/Function0;", "setOnQuoteClick", "(Lkotlin/jvm/functions/Function0;)V", "setViewMode", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "onAttachedToWindow", "bind", "name", "", "symbol", "position", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "isRhList", "refreshUi", "state", "Lcom/robinhood/android/common/views/futures/FuturesRowViewState;", "Companion", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FuturesRowView extends Hammer_FuturesRowView {

    /* renamed from: chart$delegate, reason: from kotlin metadata */
    private final SnapshotState chart;
    public UUID contractId;
    public FuturesRowViewDuxo duxo;

    /* renamed from: isDay$delegate, reason: from kotlin metadata */
    private final SnapshotState isDay;
    private Function0<Unit> onQuoteClick;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chart = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.isDay = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        BaseInstrumentRowView.setTickerStyle$default(this, BaseInstrumentRowView.TickerStyle.FILLED, false, 2, null);
        getDuxo().setInvertNameAndSymbol(getInvertNameAndSymbol());
    }

    public final FuturesRowViewDuxo getDuxo() {
        FuturesRowViewDuxo futuresRowViewDuxo = this.duxo;
        if (futuresRowViewDuxo != null) {
            return futuresRowViewDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(FuturesRowViewDuxo futuresRowViewDuxo) {
        Intrinsics.checkNotNullParameter(futuresRowViewDuxo, "<set-?>");
        this.duxo = futuresRowViewDuxo;
    }

    public final UUID getContractId() {
        UUID uuid = this.contractId;
        if (uuid != null) {
            return uuid;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contractId");
        return null;
    }

    public final void setContractId(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.contractId = uuid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Chart<Parcelable> getChart() {
        return (Chart) this.chart.getValue();
    }

    private final void setChart(Chart<? extends Parcelable> chart) {
        this.chart.setValue(chart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDay() {
        return ((Boolean) this.isDay.getValue()).booleanValue();
    }

    private final void setDay(boolean z) {
        this.isDay.setValue(Boolean.valueOf(z));
    }

    public final Function0<Unit> getOnQuoteClick() {
        return this.onQuoteClick;
    }

    public final void setOnQuoteClick(Function0<Unit> function0) {
        this.onQuoteClick = function0;
        setOnPriceClick(function0);
    }

    public final void setViewMode(SecurityViewMode viewMode) {
        getDuxo().updateViewMode(viewMode);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(DayNightChanges.isDayChanges(ScarletManager2.getScarletManager(this)), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowView.onAttachedToWindow$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.futures.FuturesRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesRowView.onAttachedToWindow$lambda$1(this.f$0, (FuturesRowViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(FuturesRowView futuresRowView, DayNightOverlay isDay) {
        Intrinsics.checkNotNullParameter(isDay, "isDay");
        futuresRowView.setDay(DayNightChanges.isDay(isDay));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(FuturesRowView futuresRowView, FuturesRowViewState state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        futuresRowView.refreshUi(state);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void bind$default(FuturesRowView futuresRowView, UUID uuid, String str, String str2, UiFuturesPosition uiFuturesPosition, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            uiFuturesPosition = null;
        }
        futuresRowView.bind(uuid, str, str2, uiFuturesPosition, z);
    }

    public final void bind(UUID contractId, String name, String symbol, UiFuturesPosition position, boolean isRhList) {
        ComposeView composeView;
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if ((this.contractId == null || !Intrinsics.areEqual(getContractId(), contractId)) && (composeView = getComposeView()) != null) {
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
            composeView.setContent(ComposableLambda3.composableLambdaInstance(-1385034054, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.views.futures.FuturesRowView$bind$1$1
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
                        ComposerKt.traceEventStart(-1385034054, i, -1, "com.robinhood.android.common.views.futures.FuturesRowView.bind.<anonymous>.<anonymous> (FuturesRowView.kt:86)");
                    }
                    Boolean boolValueOf = Boolean.valueOf(this.this$0.isDay());
                    final FuturesRowView futuresRowView = this.this$0;
                    BentoTheme2.BentoTheme(boolValueOf, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1193532418, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.views.futures.FuturesRowView$bind$1$1.1
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
                                ComposerKt.traceEventStart(1193532418, i2, -1, "com.robinhood.android.common.views.futures.FuturesRowView.bind.<anonymous>.<anonymous>.<anonymous> (FuturesRowView.kt:87)");
                            }
                            Chart chart = futuresRowView.getChart();
                            if (chart != null) {
                                List<Line> lines = chart.getLines();
                                List<ChartFill> fills = chart.getFills();
                                List overlays = chart.getOverlays();
                                if (overlays == null) {
                                    overlays = CollectionsKt.emptyList();
                                }
                                SduiActionHandler.NotImplemented notImplemented = SduiActionHandler.NotImplemented.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                int i3 = (SduiActionHandler.NotImplemented.$stable << 12) | 1572870;
                                composer2.startReplaceGroup(977840936);
                                composer2.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer2.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Function1<Point, Unit>() { // from class: com.robinhood.android.common.views.futures.FuturesRowView$bind$1$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$1
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Point it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Point point) {
                                            invoke2(point);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Function1 function1 = (Function1) objRememberedValue;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function1<List<? extends com.robinhood.models.serverdriven.experimental.api.Point>, Unit>() { // from class: com.robinhood.android.common.views.futures.FuturesRowView$bind$1$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$2
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(List<com.robinhood.models.serverdriven.experimental.api.Point> it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends com.robinhood.models.serverdriven.experimental.api.Point> list) {
                                            invoke2((List<com.robinhood.models.serverdriven.experimental.api.Point>) list);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                Function1 function12 = (Function1) objRememberedValue2;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function0<Unit>() { // from class: com.robinhood.android.common.views.futures.FuturesRowView$bind$1$1$1$invoke$lambda$0$$inlined$SduiSegmentedLineChart$3
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceGroup();
                                int i4 = i3 >> 6;
                                SduiChartMappersKt.SduiSegmentedLineChart(modifierFillMaxSize$default, fills, lines, overlays, notImplemented, function1, function12, (Function0) objRememberedValue3, false, false, null, 0.0f, Parcelable.class, composer2, (65534 & i3) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128) | ((i3 << 9) & 1879048192), (i3 >> 15) & 14, 0);
                                composer2.endReplaceGroup();
                            }
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
        setContractId(contractId);
        getDuxo().setContractData(contractId, name, symbol, position, isRhList);
    }

    private final void refreshUi(FuturesRowViewState state) throws Resources.NotFoundException {
        CharSequence text;
        getNameTxt().setText(state.getNameText());
        RhTextView detailTxt = getDetailTxt();
        StringResource detailText = state.getDetailText();
        if (detailText != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = detailText.getText(resources);
        } else {
            text = null;
        }
        detailTxt.setText(text);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SecurityViewMode.FormatInfo priceInfo = state.getPriceInfo(context);
        if (priceInfo == null) {
            setPriceText(null, false);
            setPriceStale(false);
        } else {
            String formattedDisplayAmount = priceInfo.getFormattedDisplayAmount();
            ScarletOverlay directionOverlay = priceInfo.getDirectionOverlay();
            setPriceText(formattedDisplayAmount, true);
            setPriceStale(state.isStale());
            ScarletManager2.overrideAttribute(getFilledPriceTxt(), R.attr.backgroundTint, state.getPriceBackgroundTint());
            putPriceOverlay(directionOverlay);
        }
        setChart(state.getChart());
    }

    /* compiled from: FuturesRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/views/futures/FuturesRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/futures/FuturesRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<FuturesRowView> {
        private final /* synthetic */ Inflater<FuturesRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public FuturesRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (FuturesRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11218R.layout.include_row_watchlist_futures);
        }
    }
}
