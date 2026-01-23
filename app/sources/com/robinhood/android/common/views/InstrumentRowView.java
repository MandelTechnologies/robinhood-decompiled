package com.robinhood.android.common.views;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.data.prefs.ShowExtendedHoursChartPref;
import com.robinhood.android.common.instrumentrow.C11218R;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.views.BaseInstrumentRowView;
import com.robinhood.android.common.views.InstrumentRowView;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.Grouping;
import com.robinhood.android.graph.spark.SessionScalingHelper;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.portfolio.pnl.HaltTimeKtx;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore;
import com.robinhood.android.redesigninvesting.badges.p230ui.InvestingBadgeComposable;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.variant.FullExtendedHoursVariant;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteHistoricalStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartBoundsStore;
import com.robinhood.models.api.ApiQuoteHistorical;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Instrument4;
import com.robinhood.models.p320db.IpoAccessStatus;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartBounds;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function8;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Minutes;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: InstrumentRowView.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0094\u00012\u00020\u0001:\n\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010}\u001a\u00020hH\u0014J\u000e\u0010~\u001a\u00020h2\u0006\u0010=\u001a\u00020>J\u0006\u0010\u007f\u001a\u00020hJ \u0010\u0080\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0082\u00010E0\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020AH\u0002J \u0010\u0084\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010E0\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020AH\u0002J\t\u0010\u0086\u0001\u001a\u00020hH\u0002J\u001e\u0010\u0087\u0001\u001a\u00020h2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0082\u00012\u0007\u0010\u0089\u0001\u001a\u00020OH\u0002J\u0015\u0010\u008a\u0001\u001a\u00020h2\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001H\u0002J\r\u0010\u008d\u0001\u001a\u00020K*\u00020>H\u0002J\r\u0010\u008e\u0001\u001a\u00020K*\u00020>H\u0002J\r\u0010\u008f\u0001\u001a\u00020K*\u00020>H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020>X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010?\u001a\u0010\u0012\f\u0012\n B*\u0004\u0018\u00010A0A0@X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010C\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020F B*\n\u0012\u0004\u0012\u00020F\u0018\u00010E0E0DX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010G\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001b\u0010R\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bT\u0010UR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\bY\u0010UR\u001b\u0010[\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010W\u001a\u0004\b\\\u0010UR\u001d\u0010^\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010W\u001a\u0004\b_\u0010UR\u001d\u0010a\u001a\u0004\u0018\u00010b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010W\u001a\u0004\bc\u0010dR4\u0010i\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010g2\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010g@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR(\u0010n\u001a\u0004\u0018\u00010F2\b\u0010f\u001a\u0004\u0018\u00010F8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010Q\"\u0004\bu\u0010vR\u001a\u0010w\u001a\u00020OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010Q\"\u0004\by\u0010vR\u000e\u0010z\u001a\u00020OX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010{\u001a\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010p¨\u0006\u0095\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView;", "Lcom/robinhood/android/common/views/BaseInstrumentRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "setInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "getQuoteStore", "()Lcom/robinhood/librobinhood/data/store/QuoteStore;", "setQuoteStore", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "getUnrealizedProfitAndLossStore", "()Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "setUnrealizedProfitAndLossStore", "(Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;)V", "quoteHistoricalStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "getQuoteHistoricalStore", "()Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "setQuoteHistoricalStore", "(Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;)V", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "getMarketHoursStore", "()Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "setMarketHoursStore", "(Lcom/robinhood/android/markethours/data/store/MarketHoursStore;)V", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "setMarketHoursManager", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "getExperimentsProvider", "()Lcom/robinhood/experiments/ExperimentsProvider;", "setExperimentsProvider", "(Lcom/robinhood/experiments/ExperimentsProvider;)V", "instrumentChartBoundsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore;", "getInstrumentChartBoundsStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore;", "setInstrumentChartBoundsStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartBoundsStore;)V", "isShowingExtendedHoursPref", "Lcom/robinhood/prefs/BooleanPreference;", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowingExtendedHoursPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/views/InstrumentRowView$Data;", "instrumentIdSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "viewModeRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/util/SecurityViewMode;", "instrumentId", "getInstrumentId", "()Ljava/util/UUID;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "hasPositionIncludingPending", "", "getHasPositionIncludingPending", "()Z", "pendingBuySellDrawable", "Landroid/graphics/drawable/Drawable;", "getPendingBuySellDrawable", "()Landroid/graphics/drawable/Drawable;", "pendingBuySellDrawable$delegate", "Lkotlin/Lazy;", "pendingBuyDrawable", "getPendingBuyDrawable", "pendingBuyDrawable$delegate", "pendingSellDrawable", "getPendingSellDrawable", "pendingSellDrawable$delegate", "checkmarkDrawable", "getCheckmarkDrawable", "checkmarkDrawable$delegate", "drawableTintColor", "", "getDrawableTintColor", "()Ljava/lang/Integer;", "drawableTintColor$delegate", "value", "Lkotlin/Function0;", "", "onQuoteClick", "getOnQuoteClick", "()Lkotlin/jvm/functions/Function0;", "setOnQuoteClick", "(Lkotlin/jvm/functions/Function0;)V", "customViewMode", "getCustomViewMode", "()Lcom/robinhood/android/common/util/SecurityViewMode;", "setCustomViewMode", "(Lcom/robinhood/android/common/util/SecurityViewMode;)V", "pollHistorical", "getPollHistorical", "setPollHistorical", "(Z)V", "showMinichartOnly", "getShowMinichartOnly", "setShowMinichartOnly", "showOptionsContractQuantity", "viewMode", "getViewMode", "onAttachedToWindow", "bind", "clearGraphView", "getQuoteObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;", "id", "getIpoQuoteObservable", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode$PreIpo;", "refreshInstrumentPosition", "refreshQuote", "quoteMode", "animate", "refreshGraphData", "graphData", "Lcom/robinhood/android/graph/spark/GraphData;", "getShareText", "getOptionsContractQuantityText", "getShareAndContractsText", "Data", "QuoteMode", "QuoteStyle", "QuoteRefreshData", "Companion", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InstrumentRowView extends Hammer_InstrumentRowView {

    /* renamed from: checkmarkDrawable$delegate, reason: from kotlin metadata */
    private final Lazy checkmarkDrawable;
    private Data data;

    /* renamed from: drawableTintColor$delegate, reason: from kotlin metadata */
    private final Lazy drawableTintColor;
    public ExperimentsProvider experimentsProvider;
    public InstrumentChartBoundsStore instrumentChartBoundsStore;
    private final BehaviorSubject<UUID> instrumentIdSubject;
    public InstrumentStore instrumentStore;

    @ShowExtendedHoursChartPref
    public BooleanPreference isShowingExtendedHoursPref;
    public TraderMarketHoursManager marketHoursManager;
    public MarketHoursStore marketHoursStore;
    private Function0<Unit> onQuoteClick;

    /* renamed from: pendingBuyDrawable$delegate, reason: from kotlin metadata */
    private final Lazy pendingBuyDrawable;

    /* renamed from: pendingBuySellDrawable$delegate, reason: from kotlin metadata */
    private final Lazy pendingBuySellDrawable;

    /* renamed from: pendingSellDrawable$delegate, reason: from kotlin metadata */
    private final Lazy pendingSellDrawable;
    private boolean pollHistorical;
    public QuoteHistoricalStore quoteHistoricalStore;
    public QuoteStore quoteStore;
    private boolean showMinichartOnly;
    private final boolean showOptionsContractQuantity;
    public UnrealizedProfitAndLossStore unrealizedProfitAndLossStore;
    private final BehaviorRelay<Optional<SecurityViewMode>> viewModeRelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentRowView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorSubject<UUID> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.instrumentIdSubject = behaviorSubjectCreate;
        BehaviorRelay<Optional<SecurityViewMode>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.viewModeRelay = behaviorRelayCreateDefault;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.pendingBuySellDrawable = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentRowView.pendingBuySellDrawable_delegate$lambda$0(this.f$0);
            }
        });
        this.pendingBuyDrawable = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentRowView.pendingBuyDrawable_delegate$lambda$1(this.f$0);
            }
        });
        this.pendingSellDrawable = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentRowView.pendingSellDrawable_delegate$lambda$2(this.f$0);
            }
        });
        this.checkmarkDrawable = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentRowView.checkmarkDrawable_delegate$lambda$3(context);
            }
        });
        this.drawableTintColor = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentRowView.drawableTintColor_delegate$lambda$5(context, this);
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11218R.styleable.InstrumentRowView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.showOptionsContractQuantity = typedArrayObtainStyledAttributes.getBoolean(C11218R.styleable.InstrumentRowView_showOptionsContractQuantity, false);
        typedArrayObtainStyledAttributes.recycle();
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

    public final UnrealizedProfitAndLossStore getUnrealizedProfitAndLossStore() {
        UnrealizedProfitAndLossStore unrealizedProfitAndLossStore = this.unrealizedProfitAndLossStore;
        if (unrealizedProfitAndLossStore != null) {
            return unrealizedProfitAndLossStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unrealizedProfitAndLossStore");
        return null;
    }

    public final void setUnrealizedProfitAndLossStore(UnrealizedProfitAndLossStore unrealizedProfitAndLossStore) {
        Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "<set-?>");
        this.unrealizedProfitAndLossStore = unrealizedProfitAndLossStore;
    }

    public final QuoteHistoricalStore getQuoteHistoricalStore() {
        QuoteHistoricalStore quoteHistoricalStore = this.quoteHistoricalStore;
        if (quoteHistoricalStore != null) {
            return quoteHistoricalStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quoteHistoricalStore");
        return null;
    }

    public final void setQuoteHistoricalStore(QuoteHistoricalStore quoteHistoricalStore) {
        Intrinsics.checkNotNullParameter(quoteHistoricalStore, "<set-?>");
        this.quoteHistoricalStore = quoteHistoricalStore;
    }

    public final MarketHoursStore getMarketHoursStore() {
        MarketHoursStore marketHoursStore = this.marketHoursStore;
        if (marketHoursStore != null) {
            return marketHoursStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursStore");
        return null;
    }

    public final void setMarketHoursStore(MarketHoursStore marketHoursStore) {
        Intrinsics.checkNotNullParameter(marketHoursStore, "<set-?>");
        this.marketHoursStore = marketHoursStore;
    }

    public final TraderMarketHoursManager getMarketHoursManager() {
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager;
        if (traderMarketHoursManager != null) {
            return traderMarketHoursManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursManager");
        return null;
    }

    public final void setMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "<set-?>");
        this.marketHoursManager = traderMarketHoursManager;
    }

    public final ExperimentsProvider getExperimentsProvider() {
        ExperimentsProvider experimentsProvider = this.experimentsProvider;
        if (experimentsProvider != null) {
            return experimentsProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsProvider");
        return null;
    }

    public final void setExperimentsProvider(ExperimentsProvider experimentsProvider) {
        Intrinsics.checkNotNullParameter(experimentsProvider, "<set-?>");
        this.experimentsProvider = experimentsProvider;
    }

    public final InstrumentChartBoundsStore getInstrumentChartBoundsStore() {
        InstrumentChartBoundsStore instrumentChartBoundsStore = this.instrumentChartBoundsStore;
        if (instrumentChartBoundsStore != null) {
            return instrumentChartBoundsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentChartBoundsStore");
        return null;
    }

    public final void setInstrumentChartBoundsStore(InstrumentChartBoundsStore instrumentChartBoundsStore) {
        Intrinsics.checkNotNullParameter(instrumentChartBoundsStore, "<set-?>");
        this.instrumentChartBoundsStore = instrumentChartBoundsStore;
    }

    public final BooleanPreference isShowingExtendedHoursPref() {
        BooleanPreference booleanPreference = this.isShowingExtendedHoursPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("isShowingExtendedHoursPref");
        return null;
    }

    public final void setShowingExtendedHoursPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.isShowingExtendedHoursPref = booleanPreference;
    }

    public final UUID getInstrumentId() {
        Data data = this.data;
        if (data == null) {
            Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
            data = null;
        }
        return data.getInstrumentId();
    }

    public final String getAccountNumber() {
        Data data = this.data;
        if (data == null) {
            Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
            data = null;
        }
        Position position = data.getPosition();
        if (position != null) {
            return position.getAccountNumber();
        }
        return null;
    }

    public final boolean getHasPositionIncludingPending() {
        Data data = this.data;
        if (data == null) {
            Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
            data = null;
        }
        return Position5.getHasPositionIncludingPending(data.getPosition());
    }

    private final Drawable getPendingBuySellDrawable() {
        return (Drawable) this.pendingBuySellDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable pendingBuySellDrawable_delegate$lambda$0(InstrumentRowView instrumentRowView) {
        return ViewsKt.getDrawable(instrumentRowView, C11218R.drawable.svg_ic_watchlist_pending_buy_sell);
    }

    private final Drawable getPendingBuyDrawable() {
        return (Drawable) this.pendingBuyDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable pendingBuyDrawable_delegate$lambda$1(InstrumentRowView instrumentRowView) {
        return ViewsKt.getDrawable(instrumentRowView, C11218R.drawable.svg_ic_watchlist_pending_buy);
    }

    private final Drawable getPendingSellDrawable() {
        return (Drawable) this.pendingSellDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable pendingSellDrawable_delegate$lambda$2(InstrumentRowView instrumentRowView) {
        return ViewsKt.getDrawable(instrumentRowView, C11218R.drawable.svg_ic_watchlist_pending_sell);
    }

    private final Drawable getCheckmarkDrawable() {
        return (Drawable) this.checkmarkDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable checkmarkDrawable_delegate$lambda$3(Context context) {
        return Contexts7.getThemeDrawable(context, C20690R.attr.iconCheckmark12dp);
    }

    private final Integer getDrawableTintColor() {
        return (Integer) this.drawableTintColor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer drawableTintColor_delegate$lambda$5(Context context, InstrumentRowView instrumentRowView) {
        Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(context, R.attr.textColorSecondary);
        if (themeAttribute != null) {
            return Integer.valueOf(ViewsKt.getColor(instrumentRowView, themeAttribute.intValue()));
        }
        return null;
    }

    public final Function0<Unit> getOnQuoteClick() {
        return this.onQuoteClick;
    }

    public final void setOnQuoteClick(Function0<Unit> function0) {
        this.onQuoteClick = function0;
        setOnPriceClick(function0);
    }

    public final SecurityViewMode getCustomViewMode() {
        Optional<SecurityViewMode> value = this.viewModeRelay.getValue();
        if (value != null) {
            return value.getOrNull();
        }
        return null;
    }

    public final void setCustomViewMode(SecurityViewMode securityViewMode) {
        this.viewModeRelay.accept(Optional3.asOptional(securityViewMode));
    }

    public final boolean getPollHistorical() {
        return this.pollHistorical;
    }

    public final void setPollHistorical(boolean z) {
        this.pollHistorical = z;
    }

    public final boolean getShowMinichartOnly() {
        return this.showMinichartOnly;
    }

    public final void setShowMinichartOnly(boolean z) {
        this.showMinichartOnly = z;
    }

    private final SecurityViewMode getViewMode() {
        SecurityViewMode customViewMode = getCustomViewMode();
        if (customViewMode != null) {
            return customViewMode;
        }
        String str = getViewModePreference().get();
        Intrinsics.checkNotNull(str);
        return SecurityViewMode.valueOf(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ComposeView investingBadgeView;
        super.onAttachedToWindow();
        Observable observableRefCount = this.instrumentIdSubject.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView$onAttachedToWindow$quoteObs$1
            @Override // io.reactivex.functions.Function
            public final Observable<Optional<InstrumentRowView.QuoteMode>> apply(UUID p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return this.$tmp0.getQuoteObservable(p0);
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Optional.Companion companion = Optional.INSTANCE;
        Observable observableScan = observableRefCount.scan(Tuples4.m3642to(companion.m2972of(null), Boolean.FALSE), new BiFunction() { // from class: com.robinhood.android.common.views.InstrumentRowView$onAttachedToWindow$quoteAndAnimateObs$1
            @Override // io.reactivex.functions.BiFunction
            public final Tuples2<Optional<InstrumentRowView.QuoteMode>, Boolean> apply(Tuples2<? extends Optional<? extends InstrumentRowView.QuoteMode>, Boolean> tuples2, Optional<? extends InstrumentRowView.QuoteMode> newQuoteOptional) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Intrinsics.checkNotNullParameter(newQuoteOptional, "newQuoteOptional");
                InstrumentRowView.QuoteMode quoteModeComponent1 = tuples2.component1().component1();
                InstrumentRowView.QuoteMode quoteModeComponent12 = newQuoteOptional.component1();
                return Tuples4.m3642to(Optional3.asOptional(quoteModeComponent12), Boolean.valueOf((quoteModeComponent1 instanceof InstrumentRowView.QuoteMode.Public) && (quoteModeComponent12 instanceof InstrumentRowView.QuoteMode.Public)));
            }
        });
        final String accountNumber = getAccountNumber();
        if (accountNumber != null && (investingBadgeView = getInvestingBadgeView()) != null) {
            investingBadgeView.setContent(ComposableLambda3.composableLambdaInstance(1293056603, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.views.InstrumentRowView.onAttachedToWindow.1
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
                        ComposerKt.traceEventStart(1293056603, i, -1, "com.robinhood.android.common.views.InstrumentRowView.onAttachedToWindow.<anonymous> (InstrumentRowView.kt:183)");
                    }
                    final String str = accountNumber;
                    final InstrumentRowView instrumentRowView = this;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2059591149, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.views.InstrumentRowView.onAttachedToWindow.1.1
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
                                ComposerKt.traceEventStart(-2059591149, i2, -1, "com.robinhood.android.common.views.InstrumentRowView.onAttachedToWindow.<anonymous>.<anonymous> (InstrumentRowView.kt:184)");
                            }
                            InvestingBadgeComposable.InvestingBadgeComposable(str, InstrumentType.EQUITY, instrumentRowView.getInstrumentId(), null, composer2, 48, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableScan);
        Observable<Optional<SecurityViewMode>> observableDistinctUntilChanged = this.viewModeRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableCombineLatest = Observable.combineLatest(observableScan, observableDistinctUntilChanged, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.common.views.InstrumentRowView$onAttachedToWindow$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Tuples2 tuples2 = (Tuples2) t1;
                return (R) new InstrumentRowView.QuoteRefreshData((InstrumentRowView.QuoteMode) ((Optional) tuples2.getFirst()).getOrNull(), ((Boolean) tuples2.getSecond()).booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableCombineLatest), this, true).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentRowView.onAttachedToWindow$lambda$7(this.f$0, (InstrumentRowView.QuoteRefreshData) obj);
            }
        });
        Observable<R> observableSwitchMap = getInstrumentStore().getInstrument(getInstrumentId()).switchMap(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView.onAttachedToWindow.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends BaseInstrumentRowView.TickerStyle> apply(Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return InstrumentRowView6.streamInstrumentTradabilityForAccountNow(InstrumentRowView.this.getMarketHoursManager(), instrument).map(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView.onAttachedToWindow.4.1

                    /* compiled from: InstrumentRowView.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.common.views.InstrumentRowView$onAttachedToWindow$4$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[Tradability.values().length];
                            try {
                                iArr[Tradability.TRADABLE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[Tradability.POSITION_OPENING_ONLY.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[Tradability.POSITION_CLOSING_ONLY.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[Tradability.UNTRADABLE.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[Tradability.UNTRADABLE_REGSHO.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // io.reactivex.functions.Function
                    public final BaseInstrumentRowView.TickerStyle apply(Tradability tradability) {
                        Intrinsics.checkNotNullParameter(tradability, "tradability");
                        int i = WhenMappings.$EnumSwitchMapping$0[tradability.ordinal()];
                        if (i == 1 || i == 2 || i == 3) {
                            return BaseInstrumentRowView.TickerStyle.FILLED;
                        }
                        if (i == 4 || i == 5) {
                            return BaseInstrumentRowView.TickerStyle.OUTLINED;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableSwitchMap), this, true).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentRowView.onAttachedToWindow$lambda$8(this.f$0, (BaseInstrumentRowView.TickerStyle) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.instrumentIdSubject.switchMap(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView.onAttachedToWindow.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiQuoteHistorical> apply(UUID subjectId) {
                Intrinsics.checkNotNullParameter(subjectId, "subjectId");
                return InstrumentRowView.this.getQuoteHistoricalStore().poll(subjectId, GraphSelection.ALL_DAY);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ViewDisposerKt.bindTo(observableSwitchMap2, this, true).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentRowView.onAttachedToWindow$lambda$9((ApiQuoteHistorical) obj);
            }
        });
        ObservableSource observableSourceSwitchMap = this.instrumentIdSubject.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView$onAttachedToWindow$historicalObs$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiQuoteHistorical> apply(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.getQuoteHistoricalStore().getHistoricalQuotes(id, GraphSelection.ALL_DAY);
            }
        });
        Observable map = ExperimentsProvider.DefaultImpls.streamVariant$default(getExperimentsProvider(), Experiment.FULL_EXTENDED_HOURS.INSTANCE, FullExtendedHoursVariant.CONTROL, false, 4, null).map(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView$onAttachedToWindow$showFullExtendedHoursObs$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(FullExtendedHoursVariant it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isMember());
            }
        });
        if (getShowGraphView()) {
            Observable<Instrument> instrument = getInstrumentStore().getInstrument(getInstrumentId());
            Intrinsics.checkNotNull(observableSourceSwitchMap);
            Observable mostRecentPastOrCurrentMarketHours$default = MarketHoursStore.getMostRecentPastOrCurrentMarketHours$default(getMarketHoursStore(), false, 1, null);
            Observable<InstrumentChartBounds> observableAsObservable = getInstrumentChartBoundsStore().getQuery().asObservable(companion.m2972of(null));
            Intrinsics.checkNotNull(map);
            Observable observableCombineLatest2 = Observable.combineLatest(instrument, observableRefCount, observableSourceSwitchMap, mostRecentPastOrCurrentMarketHours$default, observableAsObservable, map, isShowingExtendedHoursPref().getChanges(), getMarketHoursManager().streamIsAdtHours(), new Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: com.robinhood.android.common.views.InstrumentRowView$onAttachedToWindow$$inlined$combineLatest$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function8
                public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                    Intrinsics.checkParameterIsNotNull(t1, "t1");
                    Intrinsics.checkParameterIsNotNull(t2, "t2");
                    Intrinsics.checkParameterIsNotNull(t3, "t3");
                    Intrinsics.checkParameterIsNotNull(t4, "t4");
                    Intrinsics.checkParameterIsNotNull(t5, "t5");
                    Intrinsics.checkParameterIsNotNull(t6, "t6");
                    Intrinsics.checkParameterIsNotNull(t7, "t7");
                    Intrinsics.checkParameterIsNotNull(t8, "t8");
                    boolean zBooleanValue = ((Boolean) t8).booleanValue();
                    return (R) new InstrumentRowView.Companion.GraphDataIntermediary((Instrument) t1, (Optional) t2, (UiQuoteHistorical) t3, (MarketHours) t4, (InstrumentChartBounds) t5, ((Boolean) t6).booleanValue(), ((Boolean) t7).booleanValue(), zBooleanValue);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest2, "Observable.combineLatest…3, t4, t5, t6, t7, t8) })");
            Observable map2 = observableCombineLatest2.observeOn(Schedulers.computation()).map(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView.onAttachedToWindow.9
                @Override // io.reactivex.functions.Function
                public final Optional<GraphData> apply(Companion.GraphDataIntermediary intermediary) {
                    Intrinsics.checkNotNullParameter(intermediary, "intermediary");
                    Companion companion2 = InstrumentRowView.INSTANCE;
                    return companion2.getGraphData$feature_lib_instrument_row_externalDebug(companion2.m1853xcdd776de(intermediary));
                }
            });
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(map2), this, true).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.views.InstrumentRowView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentRowView.onAttachedToWindow$lambda$10(this.f$0, (Optional) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$7(InstrumentRowView instrumentRowView, QuoteRefreshData quoteRefreshData) {
        Intrinsics.checkNotNullParameter(quoteRefreshData, "<destruct>");
        instrumentRowView.refreshQuote(quoteRefreshData.getQuoteMode(), quoteRefreshData.getAnimate());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$8(InstrumentRowView instrumentRowView, BaseInstrumentRowView.TickerStyle tickerStyle) {
        Intrinsics.checkNotNull(tickerStyle);
        instrumentRowView.setTickerStyle(tickerStyle, instrumentRowView.showMinichartOnly);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$9(ApiQuoteHistorical apiQuoteHistorical) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$10(InstrumentRowView instrumentRowView, Optional optional) {
        instrumentRowView.refreshGraphData((GraphData) optional.component1());
        return Unit.INSTANCE;
    }

    public final void bind(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.instrumentIdSubject.onNext(data.getInstrumentId());
        refreshInstrumentPosition();
    }

    public final void clearGraphView() {
        getGraphView().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Observable<Optional<QuoteMode>> getQuoteObservable(final UUID id) {
        boolean z;
        Data data = this.data;
        if (data == null) {
            Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
            data = null;
        }
        Position position = data.getPosition();
        if (position != null) {
            z = position.getInstrumentIsHalted() && HaltTimeKtx.haltTimeCheck();
        }
        Observable<Optional<QuoteMode>> observableSwitchMap = ObservablesKt.toOptionals(getUnrealizedProfitAndLossStore().legacyStreamQuoteObservable(id, z)).startWith((Observable) Optional2.INSTANCE).switchMap(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView.getQuoteObservable.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<QuoteMode>> apply(Optional<Quote> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Quote quoteComponent1 = optional.component1();
                if (quoteComponent1 == null) {
                    return InstrumentRowView.this.getIpoQuoteObservable(id);
                }
                Observable observableJust = Observable.just(Optional3.asOptional(new QuoteMode.Public(quoteComponent1)));
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Optional<QuoteMode.PreIpo>> getIpoQuoteObservable(final UUID id) {
        getInstrumentStore().refresh(false, id);
        Observable<Optional<QuoteMode.PreIpo>> observableSwitchMap = getInstrumentStore().getInstrument(id).map(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView.getIpoQuoteObservable.1
            @Override // io.reactivex.functions.Function
            public final Optional<IpoAccessStatus> apply(Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return Optional3.asOptional(instrument.getIpoAccessStatus());
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView.getIpoQuoteObservable.2

            /* compiled from: InstrumentRowView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.common.views.InstrumentRowView$getIpoQuoteObservable$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IpoAccessStatus.values().length];
                    try {
                        iArr[IpoAccessStatus.CANCELED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[IpoAccessStatus.DELAYED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[IpoAccessStatus.PUBLIC.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[IpoAccessStatus.UNKNOWN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[IpoAccessStatus.S1_FILED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[IpoAccessStatus.PRICE_FINALIZED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[IpoAccessStatus.PRICE_INITIALIZED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<QuoteMode.PreIpo>> apply(Optional<? extends IpoAccessStatus> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                IpoAccessStatus ipoAccessStatusComponent1 = optional.component1();
                switch (ipoAccessStatusComponent1 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[ipoAccessStatusComponent1.ordinal()]) {
                    case -1:
                    case 1:
                    case 2:
                    case 3:
                        return Observable.just(Optional2.INSTANCE);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        Observable<R> map = InstrumentRowView.this.getQuoteStore().getStreamIpoQuote().asObservable(id).map(new Function() { // from class: com.robinhood.android.common.views.InstrumentRowView.getIpoQuoteObservable.2.1
                            @Override // io.reactivex.functions.Function
                            public final QuoteMode.PreIpo apply(IpoQuote ipoQuote) {
                                Intrinsics.checkNotNullParameter(ipoQuote, "ipoQuote");
                                return new QuoteMode.PreIpo(ipoQuote);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return ObservablesKt.toOptionals(map).startWith((Observable) Optional2.INSTANCE);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    private final void refreshInstrumentPosition() {
        String displaySymbol;
        String displayName;
        Drawable pendingSellDrawable;
        Data data = this.data;
        Data data2 = null;
        if (data == null) {
            Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
            data = null;
        }
        boolean hasPosition = Position5.getHasPosition(data.getPosition());
        Data data3 = this.data;
        if (data3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
            data3 = null;
        }
        boolean hasPositionIncludingPending = Position5.getHasPositionIncludingPending(data3.getPosition());
        Data data4 = this.data;
        if (data4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
            data4 = null;
        }
        BigDecimal optionsContractQuantity = data4.getOptionsContractQuantity();
        RhTextView nameTxt = getNameTxt();
        if (getInvertNameAndSymbol()) {
            Data data5 = this.data;
            if (data5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                data5 = null;
            }
            displaySymbol = data5.getDisplayName();
        } else {
            Data data6 = this.data;
            if (data6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                data6 = null;
            }
            displaySymbol = data6.getDisplaySymbol();
        }
        nameTxt.setText(displaySymbol);
        getNameTxt().setStale(!hasPositionIncludingPending);
        TextViewsKt.clearDrawables(getDetailTxt());
        RhTextView detailTxt = getDetailTxt();
        if (!getShowPendingStatus() && (hasPosition || optionsContractQuantity != null)) {
            Data data7 = this.data;
            if (data7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                data7 = null;
            }
            displayName = getShareAndContractsText(data7);
        } else if (hasPositionIncludingPending) {
            Data data8 = this.data;
            if (data8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                data8 = null;
            }
            displayName = getShareText(data8);
        } else if (getInvertNameAndSymbol()) {
            Data data9 = this.data;
            if (data9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                data9 = null;
            }
            displayName = data9.getDisplaySymbol();
        } else {
            Data data10 = this.data;
            if (data10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                data10 = null;
            }
            displayName = data10.getDisplayName();
        }
        detailTxt.setText(displayName);
        if (getShowPendingStatus()) {
            Data data11 = this.data;
            if (data11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                data11 = null;
            }
            if (Position5.getHasPendingPosition(data11.getPosition())) {
                Data data12 = this.data;
                if (data12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                    data12 = null;
                }
                Position position = data12.getPosition();
                Intrinsics.checkNotNull(position);
                boolean zIsPositive = BigDecimals7.isPositive(position.getSharesPendingFromBuys());
                Data data13 = this.data;
                if (data13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                } else {
                    data2 = data13;
                }
                Position position2 = data2.getPosition();
                Intrinsics.checkNotNull(position2);
                boolean zIsPositive2 = BigDecimals7.isPositive(position2.getSharesHeldForSells());
                if (zIsPositive && zIsPositive2) {
                    pendingSellDrawable = getPendingBuySellDrawable();
                } else if (zIsPositive) {
                    pendingSellDrawable = getPendingBuyDrawable();
                } else {
                    pendingSellDrawable = getPendingSellDrawable();
                }
                Drawable drawable = pendingSellDrawable;
                Integer drawableTintColor = getDrawableTintColor();
                if (drawableTintColor != null) {
                    drawable.setTint(drawableTintColor.intValue());
                }
                TextViewsKt.setDrawables$default((TextView) getDetailTxt(), (Drawable) null, (Drawable) null, drawable, (Drawable) null, true, 11, (Object) null);
            }
        }
    }

    private final void refreshQuote(QuoteMode quoteMode, boolean animate) {
        QuoteStyle quoteStyle;
        ResourceReferences4 color_primary;
        DirectionOverlay directionOverlay;
        if (quoteMode != null) {
            String string2 = getContext().getString(C41827R.string.general_label_n_a);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (quoteMode instanceof QuoteMode.Public) {
                Quote quote = ((QuoteMode.Public) quoteMode).getQuote();
                if (quote.isUpForTheDay()) {
                    directionOverlay = DirectionOverlay.POSITIVE;
                } else {
                    directionOverlay = DirectionOverlay.NEGATIVE;
                }
                SecurityViewMode viewMode = getViewMode();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Data data = this.data;
                if (data == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(WebsocketGatewayConstants.DATA_KEY);
                    data = null;
                }
                SecurityViewMode.FormatInfo formatInfoForInstrument = viewMode.getFormatInfoForInstrument(resources, quote, data.getPosition(), string2);
                quoteStyle = new QuoteStyle(directionOverlay, formatInfoForInstrument.getFormattedDisplayAmount(), formatInfoForInstrument.getDirectionOverlay(), quote.isStaleForUi());
            } else {
                if (!(quoteMode instanceof QuoteMode.PreIpo)) {
                    throw new NoWhenBranchMatchedException();
                }
                IpoQuote ipoQuote = ((QuoteMode.PreIpo) quoteMode).getIpoQuote();
                SecurityViewMode viewMode2 = getViewMode();
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                SecurityViewMode.FormatInfo formatInfoForIpoInstrument = viewMode2.getFormatInfoForIpoInstrument(resources2, ipoQuote, string2);
                quoteStyle = new QuoteStyle(DirectionOverlay.POSITIVE, formatInfoForIpoInstrument.getFormattedDisplayAmount(), formatInfoForIpoInstrument.getDirectionOverlay(), false);
            }
            DirectionOverlay graphOverlay = quoteStyle.getGraphOverlay();
            String formattedAmount = quoteStyle.getFormattedAmount();
            ScarletOverlay priceOverlay = quoteStyle.getPriceOverlay();
            boolean isStale = quoteStyle.getIsStale();
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(getGraphView()), graphOverlay, null, 2, null);
            getGraphView().setStale(isStale);
            setPriceText(formattedAmount, animate);
            setPriceStale(isStale);
            putPriceOverlay(priceOverlay);
            if (quoteMode instanceof QuoteMode.PreIpo) {
                color_primary = ThemeAttributes.INSTANCE.getCOLOR_BLACK();
            } else if (isStale) {
                color_primary = ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3();
            } else {
                color_primary = ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
            }
            ScarletManager2.overrideAttribute(getFilledPriceTxt(), R.attr.backgroundTint, color_primary);
            ScarletManager2.overrideAttribute(getOutlinedPriceTxt(), R.attr.backgroundTint, color_primary);
            ScarletManager2.overrideAttribute(getOutlinedPriceTxt(), R.attr.textColor, color_primary);
            return;
        }
        setPriceText(null, animate);
    }

    private final void refreshGraphData(GraphData graphData) {
        if (graphData != null) {
            getGraphView().setData(graphData);
        } else {
            clearGraphView();
        }
    }

    private final String getShareText(Data data) {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(resources, C11048R.plurals.general_number_of_shares, Position5.getPositionDisplayQuantity(data.getPosition()), Formats.getLowPrecisionUnitFormat().format(Position5.getPositionDisplayQuantity(data.getPosition())));
    }

    private final String getOptionsContractQuantityText(Data data) {
        if (data.getOptionsContractQuantity() == null) {
            return "";
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return com.robinhood.android.common.util.extensions.Resources.getBigDecimalQuantityString(resources, C11048R.plurals.general_number_of_contracts, data.getOptionsContractQuantity(), Formats.getLowPrecisionUnitFormat().format(data.getOptionsContractQuantity()));
    }

    private final String getShareAndContractsText(Data data) {
        StringBuilder sb = new StringBuilder();
        if (getShowCheckMark()) {
            Integer drawableTintColor = getDrawableTintColor();
            if (drawableTintColor != null) {
                int iIntValue = drawableTintColor.intValue();
                Drawable checkmarkDrawable = getCheckmarkDrawable();
                if (checkmarkDrawable != null) {
                    checkmarkDrawable.setTint(iIntValue);
                }
            }
            TextViewsKt.setDrawables$default((TextView) getDetailTxt(), getCheckmarkDrawable(), (Drawable) null, (Drawable) null, (Drawable) null, true, 14, (Object) null);
        }
        if (Position5.getHasPosition(data.getPosition())) {
            sb.append(getShareText(data));
        }
        if (this.showOptionsContractQuantity && data.getOptionsContractQuantity() != null) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(getOptionsContractQuantityText(data));
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* compiled from: InstrumentRowView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$Data;", "", "instrumentId", "Ljava/util/UUID;", "displayName", "", "displaySymbol", "position", "Lcom/robinhood/models/db/Position;", "optionsContractQuantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/Position;Ljava/math/BigDecimal;)V", "getInstrumentId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getDisplaySymbol", "getPosition", "()Lcom/robinhood/models/db/Position;", "getOptionsContractQuantity", "()Ljava/math/BigDecimal;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Data {
        public static final int $stable = 8;
        private final String displayName;
        private final String displaySymbol;
        private final UUID instrumentId;
        private final BigDecimal optionsContractQuantity;
        private final Position position;

        public Data(UUID instrumentId, String displayName, String displaySymbol, Position position, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(displaySymbol, "displaySymbol");
            this.instrumentId = instrumentId;
            this.displayName = displayName;
            this.displaySymbol = displaySymbol;
            this.position = position;
            this.optionsContractQuantity = bigDecimal;
        }

        public /* synthetic */ Data(UUID uuid, String str, String str2, Position position, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, str2, position, (i & 16) != 0 ? null : bigDecimal);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getDisplaySymbol() {
            return this.displaySymbol;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final BigDecimal getOptionsContractQuantity() {
            return this.optionsContractQuantity;
        }
    }

    /* compiled from: InstrumentRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;", "", "<init>", "()V", "Public", "PreIpo", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode$PreIpo;", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode$Public;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class QuoteMode {
        public static final int $stable = 0;

        public /* synthetic */ QuoteMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private QuoteMode() {
        }

        /* compiled from: InstrumentRowView.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode$Public;", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;", "quote", "Lcom/robinhood/models/db/Quote;", "<init>", "(Lcom/robinhood/models/db/Quote;)V", "getQuote", "()Lcom/robinhood/models/db/Quote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Public extends QuoteMode {
            public static final int $stable = 8;
            private final Quote quote;

            public static /* synthetic */ Public copy$default(Public r0, Quote quote, int i, Object obj) {
                if ((i & 1) != 0) {
                    quote = r0.quote;
                }
                return r0.copy(quote);
            }

            /* renamed from: component1, reason: from getter */
            public final Quote getQuote() {
                return this.quote;
            }

            public final Public copy(Quote quote) {
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new Public(quote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Public) && Intrinsics.areEqual(this.quote, ((Public) other).quote);
            }

            public int hashCode() {
                return this.quote.hashCode();
            }

            public String toString() {
                return "Public(quote=" + this.quote + ")";
            }

            public final Quote getQuote() {
                return this.quote;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Public(Quote quote) {
                super(null);
                Intrinsics.checkNotNullParameter(quote, "quote");
                this.quote = quote;
            }
        }

        /* compiled from: InstrumentRowView.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode$PreIpo;", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;", "ipoQuote", "Lcom/robinhood/directipo/models/db/IpoQuote;", "<init>", "(Lcom/robinhood/directipo/models/db/IpoQuote;)V", "getIpoQuote", "()Lcom/robinhood/directipo/models/db/IpoQuote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PreIpo extends QuoteMode {
            public static final int $stable = 8;
            private final IpoQuote ipoQuote;

            public static /* synthetic */ PreIpo copy$default(PreIpo preIpo, IpoQuote ipoQuote, int i, Object obj) {
                if ((i & 1) != 0) {
                    ipoQuote = preIpo.ipoQuote;
                }
                return preIpo.copy(ipoQuote);
            }

            /* renamed from: component1, reason: from getter */
            public final IpoQuote getIpoQuote() {
                return this.ipoQuote;
            }

            public final PreIpo copy(IpoQuote ipoQuote) {
                Intrinsics.checkNotNullParameter(ipoQuote, "ipoQuote");
                return new PreIpo(ipoQuote);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PreIpo) && Intrinsics.areEqual(this.ipoQuote, ((PreIpo) other).ipoQuote);
            }

            public int hashCode() {
                return this.ipoQuote.hashCode();
            }

            public String toString() {
                return "PreIpo(ipoQuote=" + this.ipoQuote + ")";
            }

            public final IpoQuote getIpoQuote() {
                return this.ipoQuote;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PreIpo(IpoQuote ipoQuote) {
                super(null);
                Intrinsics.checkNotNullParameter(ipoQuote, "ipoQuote");
                this.ipoQuote = ipoQuote;
            }
        }
    }

    /* compiled from: InstrumentRowView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$QuoteStyle;", "", "graphOverlay", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "formattedAmount", "", "priceOverlay", "Lcom/robinhood/scarlet/ScarletOverlay;", "isStale", "", "<init>", "(Lcom/robinhood/android/designsystem/style/DirectionOverlay;Ljava/lang/String;Lcom/robinhood/scarlet/ScarletOverlay;Z)V", "getGraphOverlay", "()Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "getFormattedAmount", "()Ljava/lang/String;", "getPriceOverlay", "()Lcom/robinhood/scarlet/ScarletOverlay;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class QuoteStyle {
        private final String formattedAmount;
        private final DirectionOverlay graphOverlay;
        private final boolean isStale;
        private final ScarletOverlay priceOverlay;

        public static /* synthetic */ QuoteStyle copy$default(QuoteStyle quoteStyle, DirectionOverlay directionOverlay, String str, ScarletOverlay scarletOverlay, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                directionOverlay = quoteStyle.graphOverlay;
            }
            if ((i & 2) != 0) {
                str = quoteStyle.formattedAmount;
            }
            if ((i & 4) != 0) {
                scarletOverlay = quoteStyle.priceOverlay;
            }
            if ((i & 8) != 0) {
                z = quoteStyle.isStale;
            }
            return quoteStyle.copy(directionOverlay, str, scarletOverlay, z);
        }

        /* renamed from: component1, reason: from getter */
        public final DirectionOverlay getGraphOverlay() {
            return this.graphOverlay;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final ScarletOverlay getPriceOverlay() {
            return this.priceOverlay;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsStale() {
            return this.isStale;
        }

        public final QuoteStyle copy(DirectionOverlay graphOverlay, String formattedAmount, ScarletOverlay priceOverlay, boolean isStale) {
            Intrinsics.checkNotNullParameter(graphOverlay, "graphOverlay");
            Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
            Intrinsics.checkNotNullParameter(priceOverlay, "priceOverlay");
            return new QuoteStyle(graphOverlay, formattedAmount, priceOverlay, isStale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuoteStyle)) {
                return false;
            }
            QuoteStyle quoteStyle = (QuoteStyle) other;
            return this.graphOverlay == quoteStyle.graphOverlay && Intrinsics.areEqual(this.formattedAmount, quoteStyle.formattedAmount) && Intrinsics.areEqual(this.priceOverlay, quoteStyle.priceOverlay) && this.isStale == quoteStyle.isStale;
        }

        public int hashCode() {
            return (((((this.graphOverlay.hashCode() * 31) + this.formattedAmount.hashCode()) * 31) + this.priceOverlay.hashCode()) * 31) + Boolean.hashCode(this.isStale);
        }

        public String toString() {
            return "QuoteStyle(graphOverlay=" + this.graphOverlay + ", formattedAmount=" + this.formattedAmount + ", priceOverlay=" + this.priceOverlay + ", isStale=" + this.isStale + ")";
        }

        public QuoteStyle(DirectionOverlay graphOverlay, String formattedAmount, ScarletOverlay priceOverlay, boolean z) {
            Intrinsics.checkNotNullParameter(graphOverlay, "graphOverlay");
            Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
            Intrinsics.checkNotNullParameter(priceOverlay, "priceOverlay");
            this.graphOverlay = graphOverlay;
            this.formattedAmount = formattedAmount;
            this.priceOverlay = priceOverlay;
            this.isStale = z;
        }

        public final DirectionOverlay getGraphOverlay() {
            return this.graphOverlay;
        }

        public final String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final ScarletOverlay getPriceOverlay() {
            return this.priceOverlay;
        }

        public final boolean isStale() {
            return this.isStale;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InstrumentRowView.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$QuoteRefreshData;", "", "quoteMode", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;", "animate", "", "<init>", "(Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;Z)V", "getQuoteMode", "()Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;", "getAnimate", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class QuoteRefreshData {
        private final boolean animate;
        private final QuoteMode quoteMode;

        public static /* synthetic */ QuoteRefreshData copy$default(QuoteRefreshData quoteRefreshData, QuoteMode quoteMode, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                quoteMode = quoteRefreshData.quoteMode;
            }
            if ((i & 2) != 0) {
                z = quoteRefreshData.animate;
            }
            return quoteRefreshData.copy(quoteMode, z);
        }

        /* renamed from: component1, reason: from getter */
        public final QuoteMode getQuoteMode() {
            return this.quoteMode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAnimate() {
            return this.animate;
        }

        public final QuoteRefreshData copy(QuoteMode quoteMode, boolean animate) {
            return new QuoteRefreshData(quoteMode, animate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuoteRefreshData)) {
                return false;
            }
            QuoteRefreshData quoteRefreshData = (QuoteRefreshData) other;
            return Intrinsics.areEqual(this.quoteMode, quoteRefreshData.quoteMode) && this.animate == quoteRefreshData.animate;
        }

        public int hashCode() {
            QuoteMode quoteMode = this.quoteMode;
            return ((quoteMode == null ? 0 : quoteMode.hashCode()) * 31) + Boolean.hashCode(this.animate);
        }

        public String toString() {
            return "QuoteRefreshData(quoteMode=" + this.quoteMode + ", animate=" + this.animate + ")";
        }

        public QuoteRefreshData(QuoteMode quoteMode, boolean z) {
            this.quoteMode = quoteMode;
            this.animate = z;
        }

        public final QuoteMode getQuoteMode() {
            return this.quoteMode;
        }

        public final boolean getAnimate() {
            return this.animate;
        }
    }

    /* compiled from: InstrumentRowView.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0002\b\u000eJP\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002J\u0011\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/views/InstrumentRowView;", "<init>", "()V", "getGraphDataConfiguration", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/views/InstrumentRowView$Companion$GraphConfiguration;", "intermediary", "Lcom/robinhood/android/common/views/InstrumentRowView$Companion$GraphDataIntermediary;", "getGraphDataConfiguration$feature_lib_instrument_row_externalDebug", "getGraphData", "Lcom/robinhood/android/graph/spark/GraphData;", "configurationOptional", "getGraphData$feature_lib_instrument_row_externalDebug", "instrument", "Lcom/robinhood/models/db/Instrument;", "quoteMode", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;", "historical", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "chartBounds", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartBounds;", "showFullExtendedHours", "", "isShowingExtendedHoursPref", "isAdtHours", "inflate", "parent", "Landroid/view/ViewGroup;", "GraphDataIntermediary", "GraphConfiguration", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Inflater<InstrumentRowView> {
        private final /* synthetic */ Inflater<InstrumentRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public InstrumentRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (InstrumentRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11218R.layout.include_row_watchlist_equity);
        }

        /* compiled from: InstrumentRowView.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010!\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\"J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÀ\u0003¢\u0006\u0002\b$J\u000e\u0010%\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\fHÀ\u0003¢\u0006\u0002\b*J\u000e\u0010+\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b,J\u000e\u0010-\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b.J\u000e\u0010/\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b0Jd\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÀ\u0001¢\u0006\u0002\b2J\u0013\u00103\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001e¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$Companion$GraphDataIntermediary;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/common/views/InstrumentRowView$QuoteMode;", "historical", "Lcom/robinhood/models/ui/UiQuoteHistorical;", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "chartBounds", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartBounds;", "fullExtendedHoursMember", "", "isShowingExtendedHoursPref", "isAdtHours", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/utils/Optional;Lcom/robinhood/models/ui/UiQuoteHistorical;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartBounds;ZZZ)V", "getInstrument$feature_lib_instrument_row_externalDebug", "()Lcom/robinhood/models/db/Instrument;", "getQuote$feature_lib_instrument_row_externalDebug", "()Lcom/robinhood/utils/Optional;", "getHistorical$feature_lib_instrument_row_externalDebug", "()Lcom/robinhood/models/ui/UiQuoteHistorical;", "getMarketHours$feature_lib_instrument_row_externalDebug", "()Lcom/robinhood/models/db/MarketHours;", "getChartBounds$feature_lib_instrument_row_externalDebug", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartBounds;", "getFullExtendedHoursMember$feature_lib_instrument_row_externalDebug", "()Z", "isShowingExtendedHoursPref$feature_lib_instrument_row_externalDebug", "isAdtHours$feature_lib_instrument_row_externalDebug", "component1", "component1$feature_lib_instrument_row_externalDebug", "component2", "component2$feature_lib_instrument_row_externalDebug", "component3", "component3$feature_lib_instrument_row_externalDebug", "component4", "component4$feature_lib_instrument_row_externalDebug", "component5", "component5$feature_lib_instrument_row_externalDebug", "component6", "component6$feature_lib_instrument_row_externalDebug", "component7", "component7$feature_lib_instrument_row_externalDebug", "component8", "component8$feature_lib_instrument_row_externalDebug", "copy", "copy$feature_lib_instrument_row_externalDebug", "equals", "other", "hashCode", "", "toString", "", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GraphDataIntermediary {
            public static final int $stable = 8;
            private final InstrumentChartBounds chartBounds;
            private final boolean fullExtendedHoursMember;
            private final UiQuoteHistorical historical;
            private final Instrument instrument;
            private final boolean isAdtHours;
            private final boolean isShowingExtendedHoursPref;
            private final MarketHours marketHours;
            private final Optional<QuoteMode> quote;

            public static /* synthetic */ GraphDataIntermediary copy$feature_lib_instrument_row_externalDebug$default(GraphDataIntermediary graphDataIntermediary, Instrument instrument, Optional optional, UiQuoteHistorical uiQuoteHistorical, MarketHours marketHours, InstrumentChartBounds instrumentChartBounds, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    instrument = graphDataIntermediary.instrument;
                }
                if ((i & 2) != 0) {
                    optional = graphDataIntermediary.quote;
                }
                if ((i & 4) != 0) {
                    uiQuoteHistorical = graphDataIntermediary.historical;
                }
                if ((i & 8) != 0) {
                    marketHours = graphDataIntermediary.marketHours;
                }
                if ((i & 16) != 0) {
                    instrumentChartBounds = graphDataIntermediary.chartBounds;
                }
                if ((i & 32) != 0) {
                    z = graphDataIntermediary.fullExtendedHoursMember;
                }
                if ((i & 64) != 0) {
                    z2 = graphDataIntermediary.isShowingExtendedHoursPref;
                }
                if ((i & 128) != 0) {
                    z3 = graphDataIntermediary.isAdtHours;
                }
                boolean z4 = z2;
                boolean z5 = z3;
                InstrumentChartBounds instrumentChartBounds2 = instrumentChartBounds;
                boolean z6 = z;
                return graphDataIntermediary.copy$feature_lib_instrument_row_externalDebug(instrument, optional, uiQuoteHistorical, marketHours, instrumentChartBounds2, z6, z4, z5);
            }

            /* renamed from: component1$feature_lib_instrument_row_externalDebug, reason: from getter */
            public final Instrument getInstrument() {
                return this.instrument;
            }

            public final Optional<QuoteMode> component2$feature_lib_instrument_row_externalDebug() {
                return this.quote;
            }

            /* renamed from: component3$feature_lib_instrument_row_externalDebug, reason: from getter */
            public final UiQuoteHistorical getHistorical() {
                return this.historical;
            }

            /* renamed from: component4$feature_lib_instrument_row_externalDebug, reason: from getter */
            public final MarketHours getMarketHours() {
                return this.marketHours;
            }

            /* renamed from: component5$feature_lib_instrument_row_externalDebug, reason: from getter */
            public final InstrumentChartBounds getChartBounds() {
                return this.chartBounds;
            }

            /* renamed from: component6$feature_lib_instrument_row_externalDebug, reason: from getter */
            public final boolean getFullExtendedHoursMember() {
                return this.fullExtendedHoursMember;
            }

            /* renamed from: component7$feature_lib_instrument_row_externalDebug, reason: from getter */
            public final boolean getIsShowingExtendedHoursPref() {
                return this.isShowingExtendedHoursPref;
            }

            /* renamed from: component8$feature_lib_instrument_row_externalDebug, reason: from getter */
            public final boolean getIsAdtHours() {
                return this.isAdtHours;
            }

            public final GraphDataIntermediary copy$feature_lib_instrument_row_externalDebug(Instrument instrument, Optional<? extends QuoteMode> quote, UiQuoteHistorical historical, MarketHours marketHours, InstrumentChartBounds chartBounds, boolean fullExtendedHoursMember, boolean isShowingExtendedHoursPref, boolean isAdtHours) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(quote, "quote");
                Intrinsics.checkNotNullParameter(historical, "historical");
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
                return new GraphDataIntermediary(instrument, quote, historical, marketHours, chartBounds, fullExtendedHoursMember, isShowingExtendedHoursPref, isAdtHours);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GraphDataIntermediary)) {
                    return false;
                }
                GraphDataIntermediary graphDataIntermediary = (GraphDataIntermediary) other;
                return Intrinsics.areEqual(this.instrument, graphDataIntermediary.instrument) && Intrinsics.areEqual(this.quote, graphDataIntermediary.quote) && Intrinsics.areEqual(this.historical, graphDataIntermediary.historical) && Intrinsics.areEqual(this.marketHours, graphDataIntermediary.marketHours) && Intrinsics.areEqual(this.chartBounds, graphDataIntermediary.chartBounds) && this.fullExtendedHoursMember == graphDataIntermediary.fullExtendedHoursMember && this.isShowingExtendedHoursPref == graphDataIntermediary.isShowingExtendedHoursPref && this.isAdtHours == graphDataIntermediary.isAdtHours;
            }

            public int hashCode() {
                return (((((((((((((this.instrument.hashCode() * 31) + this.quote.hashCode()) * 31) + this.historical.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + this.chartBounds.hashCode()) * 31) + Boolean.hashCode(this.fullExtendedHoursMember)) * 31) + Boolean.hashCode(this.isShowingExtendedHoursPref)) * 31) + Boolean.hashCode(this.isAdtHours);
            }

            public String toString() {
                return "GraphDataIntermediary(instrument=" + this.instrument + ", quote=" + this.quote + ", historical=" + this.historical + ", marketHours=" + this.marketHours + ", chartBounds=" + this.chartBounds + ", fullExtendedHoursMember=" + this.fullExtendedHoursMember + ", isShowingExtendedHoursPref=" + this.isShowingExtendedHoursPref + ", isAdtHours=" + this.isAdtHours + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public GraphDataIntermediary(Instrument instrument, Optional<? extends QuoteMode> quote, UiQuoteHistorical historical, MarketHours marketHours, InstrumentChartBounds chartBounds, boolean z, boolean z2, boolean z3) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(quote, "quote");
                Intrinsics.checkNotNullParameter(historical, "historical");
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                Intrinsics.checkNotNullParameter(chartBounds, "chartBounds");
                this.instrument = instrument;
                this.quote = quote;
                this.historical = historical;
                this.marketHours = marketHours;
                this.chartBounds = chartBounds;
                this.fullExtendedHoursMember = z;
                this.isShowingExtendedHoursPref = z2;
                this.isAdtHours = z3;
            }

            public final Instrument getInstrument$feature_lib_instrument_row_externalDebug() {
                return this.instrument;
            }

            public final Optional<QuoteMode> getQuote$feature_lib_instrument_row_externalDebug() {
                return this.quote;
            }

            public final UiQuoteHistorical getHistorical$feature_lib_instrument_row_externalDebug() {
                return this.historical;
            }

            public final MarketHours getMarketHours$feature_lib_instrument_row_externalDebug() {
                return this.marketHours;
            }

            public final InstrumentChartBounds getChartBounds$feature_lib_instrument_row_externalDebug() {
                return this.chartBounds;
            }

            /* renamed from: getFullExtendedHoursMember$feature_lib_instrument_row_externalDebug */
            public final boolean m1854x63383127() {
                return this.fullExtendedHoursMember;
            }

            /* renamed from: isShowingExtendedHoursPref$feature_lib_instrument_row_externalDebug */
            public final boolean m1855xbcc26434() {
                return this.isShowingExtendedHoursPref;
            }

            public final boolean isAdtHours$feature_lib_instrument_row_externalDebug() {
                return this.isAdtHours;
            }
        }

        /* compiled from: InstrumentRowView.kt */
        @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b-\u0010)J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010)J\u0010\u0010/\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b/\u0010)J\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003¢\u0006\u0004\b0\u00101Jª\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u000f2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\b\u0010\u0010)R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\b\u0011\u0010)R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u0010,R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\b\u0014\u0010)R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bL\u0010)R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bM\u0010)R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\bO\u00101¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/common/views/InstrumentRowView$Companion$GraphConfiguration;", "", "Ljava/util/UUID;", "equityInstrumentId", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "", "Lcom/robinhood/models/ui/DataPoint$Asset;", "dataPoints", "Ljava/math/BigDecimal;", "prevClosePrice", "Lcom/robinhood/models/ui/GraphSelection;", "graphSelection", "Lcom/robinhood/models/ui/Historical$Interval;", "interval", "", "isStaleForUi", "isInstrumentAllDayTradable", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "coordinatesOverride", "isFullExtendedHoursMember", "hideExtendedHours", "showLivePulse", "Lkotlin/Pair;", "j$/time/Instant", "marketBoundaries", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/MarketHours;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/ui/Historical$Interval;ZZLcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;ZZZLkotlin/Pair;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/db/MarketHours;", "component3", "()Ljava/util/List;", "component4", "()Ljava/math/BigDecimal;", "component5", "()Lcom/robinhood/models/ui/GraphSelection;", "component6", "()Lcom/robinhood/models/ui/Historical$Interval;", "component7", "()Z", "component8", "component9", "()Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "component10", "component11", "component12", "component13", "()Lkotlin/Pair;", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/db/MarketHours;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/ui/Historical$Interval;ZZLcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;ZZZLkotlin/Pair;)Lcom/robinhood/android/common/views/InstrumentRowView$Companion$GraphConfiguration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getEquityInstrumentId", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "Ljava/util/List;", "getDataPoints", "Ljava/math/BigDecimal;", "getPrevClosePrice", "Lcom/robinhood/models/ui/GraphSelection;", "getGraphSelection", "Lcom/robinhood/models/ui/Historical$Interval;", "getInterval", "Z", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "getCoordinatesOverride", "getHideExtendedHours", "getShowLivePulse", "Lkotlin/Pair;", "getMarketBoundaries", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GraphConfiguration {
            public static final int $stable = 8;
            private final SessionScalingHelper.Coordinates coordinatesOverride;
            private final List<DataPoint.Asset> dataPoints;
            private final UUID equityInstrumentId;
            private final GraphSelection graphSelection;
            private final boolean hideExtendedHours;
            private final Historical.Interval interval;
            private final boolean isFullExtendedHoursMember;
            private final boolean isInstrumentAllDayTradable;
            private final boolean isStaleForUi;
            private final Tuples2<Instant, Instant> marketBoundaries;
            private final MarketHours marketHours;
            private final BigDecimal prevClosePrice;
            private final boolean showLivePulse;

            public static /* synthetic */ GraphConfiguration copy$default(GraphConfiguration graphConfiguration, UUID uuid, MarketHours marketHours, List list, BigDecimal bigDecimal, GraphSelection graphSelection, Historical.Interval interval, boolean z, boolean z2, SessionScalingHelper.Coordinates coordinates, boolean z3, boolean z4, boolean z5, Tuples2 tuples2, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = graphConfiguration.equityInstrumentId;
                }
                return graphConfiguration.copy(uuid, (i & 2) != 0 ? graphConfiguration.marketHours : marketHours, (i & 4) != 0 ? graphConfiguration.dataPoints : list, (i & 8) != 0 ? graphConfiguration.prevClosePrice : bigDecimal, (i & 16) != 0 ? graphConfiguration.graphSelection : graphSelection, (i & 32) != 0 ? graphConfiguration.interval : interval, (i & 64) != 0 ? graphConfiguration.isStaleForUi : z, (i & 128) != 0 ? graphConfiguration.isInstrumentAllDayTradable : z2, (i & 256) != 0 ? graphConfiguration.coordinatesOverride : coordinates, (i & 512) != 0 ? graphConfiguration.isFullExtendedHoursMember : z3, (i & 1024) != 0 ? graphConfiguration.hideExtendedHours : z4, (i & 2048) != 0 ? graphConfiguration.showLivePulse : z5, (i & 4096) != 0 ? graphConfiguration.marketBoundaries : tuples2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getEquityInstrumentId() {
                return this.equityInstrumentId;
            }

            /* renamed from: component10, reason: from getter */
            public final boolean getIsFullExtendedHoursMember() {
                return this.isFullExtendedHoursMember;
            }

            /* renamed from: component11, reason: from getter */
            public final boolean getHideExtendedHours() {
                return this.hideExtendedHours;
            }

            /* renamed from: component12, reason: from getter */
            public final boolean getShowLivePulse() {
                return this.showLivePulse;
            }

            public final Tuples2<Instant, Instant> component13() {
                return this.marketBoundaries;
            }

            /* renamed from: component2, reason: from getter */
            public final MarketHours getMarketHours() {
                return this.marketHours;
            }

            public final List<DataPoint.Asset> component3() {
                return this.dataPoints;
            }

            /* renamed from: component4, reason: from getter */
            public final BigDecimal getPrevClosePrice() {
                return this.prevClosePrice;
            }

            /* renamed from: component5, reason: from getter */
            public final GraphSelection getGraphSelection() {
                return this.graphSelection;
            }

            /* renamed from: component6, reason: from getter */
            public final Historical.Interval getInterval() {
                return this.interval;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsStaleForUi() {
                return this.isStaleForUi;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getIsInstrumentAllDayTradable() {
                return this.isInstrumentAllDayTradable;
            }

            /* renamed from: component9, reason: from getter */
            public final SessionScalingHelper.Coordinates getCoordinatesOverride() {
                return this.coordinatesOverride;
            }

            public final GraphConfiguration copy(UUID equityInstrumentId, MarketHours marketHours, List<? extends DataPoint.Asset> dataPoints, BigDecimal prevClosePrice, GraphSelection graphSelection, Historical.Interval interval, boolean isStaleForUi, boolean isInstrumentAllDayTradable, SessionScalingHelper.Coordinates coordinatesOverride, boolean isFullExtendedHoursMember, boolean hideExtendedHours, boolean showLivePulse, Tuples2<Instant, Instant> marketBoundaries) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
                Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
                Intrinsics.checkNotNullParameter(interval, "interval");
                Intrinsics.checkNotNullParameter(marketBoundaries, "marketBoundaries");
                return new GraphConfiguration(equityInstrumentId, marketHours, dataPoints, prevClosePrice, graphSelection, interval, isStaleForUi, isInstrumentAllDayTradable, coordinatesOverride, isFullExtendedHoursMember, hideExtendedHours, showLivePulse, marketBoundaries);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GraphConfiguration)) {
                    return false;
                }
                GraphConfiguration graphConfiguration = (GraphConfiguration) other;
                return Intrinsics.areEqual(this.equityInstrumentId, graphConfiguration.equityInstrumentId) && Intrinsics.areEqual(this.marketHours, graphConfiguration.marketHours) && Intrinsics.areEqual(this.dataPoints, graphConfiguration.dataPoints) && Intrinsics.areEqual(this.prevClosePrice, graphConfiguration.prevClosePrice) && this.graphSelection == graphConfiguration.graphSelection && this.interval == graphConfiguration.interval && this.isStaleForUi == graphConfiguration.isStaleForUi && this.isInstrumentAllDayTradable == graphConfiguration.isInstrumentAllDayTradable && Intrinsics.areEqual(this.coordinatesOverride, graphConfiguration.coordinatesOverride) && this.isFullExtendedHoursMember == graphConfiguration.isFullExtendedHoursMember && this.hideExtendedHours == graphConfiguration.hideExtendedHours && this.showLivePulse == graphConfiguration.showLivePulse && Intrinsics.areEqual(this.marketBoundaries, graphConfiguration.marketBoundaries);
            }

            public int hashCode() {
                UUID uuid = this.equityInstrumentId;
                int iHashCode = (((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.marketHours.hashCode()) * 31) + this.dataPoints.hashCode()) * 31;
                BigDecimal bigDecimal = this.prevClosePrice;
                int iHashCode2 = (((((((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.graphSelection.hashCode()) * 31) + this.interval.hashCode()) * 31) + Boolean.hashCode(this.isStaleForUi)) * 31) + Boolean.hashCode(this.isInstrumentAllDayTradable)) * 31;
                SessionScalingHelper.Coordinates coordinates = this.coordinatesOverride;
                return ((((((((iHashCode2 + (coordinates != null ? coordinates.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFullExtendedHoursMember)) * 31) + Boolean.hashCode(this.hideExtendedHours)) * 31) + Boolean.hashCode(this.showLivePulse)) * 31) + this.marketBoundaries.hashCode();
            }

            public String toString() {
                return "GraphConfiguration(equityInstrumentId=" + this.equityInstrumentId + ", marketHours=" + this.marketHours + ", dataPoints=" + this.dataPoints + ", prevClosePrice=" + this.prevClosePrice + ", graphSelection=" + this.graphSelection + ", interval=" + this.interval + ", isStaleForUi=" + this.isStaleForUi + ", isInstrumentAllDayTradable=" + this.isInstrumentAllDayTradable + ", coordinatesOverride=" + this.coordinatesOverride + ", isFullExtendedHoursMember=" + this.isFullExtendedHoursMember + ", hideExtendedHours=" + this.hideExtendedHours + ", showLivePulse=" + this.showLivePulse + ", marketBoundaries=" + this.marketBoundaries + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public GraphConfiguration(UUID uuid, MarketHours marketHours, List<? extends DataPoint.Asset> dataPoints, BigDecimal bigDecimal, GraphSelection graphSelection, Historical.Interval interval, boolean z, boolean z2, SessionScalingHelper.Coordinates coordinates, boolean z3, boolean z4, boolean z5, Tuples2<Instant, Instant> marketBoundaries) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
                Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
                Intrinsics.checkNotNullParameter(interval, "interval");
                Intrinsics.checkNotNullParameter(marketBoundaries, "marketBoundaries");
                this.equityInstrumentId = uuid;
                this.marketHours = marketHours;
                this.dataPoints = dataPoints;
                this.prevClosePrice = bigDecimal;
                this.graphSelection = graphSelection;
                this.interval = interval;
                this.isStaleForUi = z;
                this.isInstrumentAllDayTradable = z2;
                this.coordinatesOverride = coordinates;
                this.isFullExtendedHoursMember = z3;
                this.hideExtendedHours = z4;
                this.showLivePulse = z5;
                this.marketBoundaries = marketBoundaries;
            }

            public final UUID getEquityInstrumentId() {
                return this.equityInstrumentId;
            }

            public final MarketHours getMarketHours() {
                return this.marketHours;
            }

            public final List<DataPoint.Asset> getDataPoints() {
                return this.dataPoints;
            }

            public final BigDecimal getPrevClosePrice() {
                return this.prevClosePrice;
            }

            public final GraphSelection getGraphSelection() {
                return this.graphSelection;
            }

            public final Historical.Interval getInterval() {
                return this.interval;
            }

            public final boolean isStaleForUi() {
                return this.isStaleForUi;
            }

            public final boolean isInstrumentAllDayTradable() {
                return this.isInstrumentAllDayTradable;
            }

            public final SessionScalingHelper.Coordinates getCoordinatesOverride() {
                return this.coordinatesOverride;
            }

            public final boolean isFullExtendedHoursMember() {
                return this.isFullExtendedHoursMember;
            }

            public final boolean getHideExtendedHours() {
                return this.hideExtendedHours;
            }

            public final boolean getShowLivePulse() {
                return this.showLivePulse;
            }

            public final Tuples2<Instant, Instant> getMarketBoundaries() {
                return this.marketBoundaries;
            }
        }

        /* renamed from: getGraphDataConfiguration$feature_lib_instrument_row_externalDebug */
        public final Optional<GraphConfiguration> m1853xcdd776de(GraphDataIntermediary intermediary) {
            Intrinsics.checkNotNullParameter(intermediary, "intermediary");
            Instrument instrument = intermediary.getInstrument();
            Optional<QuoteMode> optionalComponent2$feature_lib_instrument_row_externalDebug = intermediary.component2$feature_lib_instrument_row_externalDebug();
            return getGraphDataConfiguration(instrument, optionalComponent2$feature_lib_instrument_row_externalDebug.getOrNull(), intermediary.getHistorical(), intermediary.getMarketHours(), intermediary.getChartBounds(), intermediary.getFullExtendedHoursMember(), intermediary.getIsShowingExtendedHoursPref(), intermediary.getIsAdtHours());
        }

        public final Optional<GraphData> getGraphData$feature_lib_instrument_row_externalDebug(Optional<GraphConfiguration> configurationOptional) {
            Intrinsics.checkNotNullParameter(configurationOptional, "configurationOptional");
            GraphConfiguration orNull = configurationOptional.getOrNull();
            if (orNull == null) {
                return Optional2.INSTANCE;
            }
            GraphData.Companion companion = GraphData.INSTANCE;
            UUID equityInstrumentId = orNull.getEquityInstrumentId();
            MarketHours marketHours = orNull.getMarketHours();
            List<DataPoint.Asset> dataPoints = orNull.getDataPoints();
            BigDecimal prevClosePrice = orNull.getPrevClosePrice();
            GraphSelection graphSelection = orNull.getGraphSelection();
            Historical.Interval interval = orNull.getInterval();
            boolean zIsStaleForUi = orNull.isStaleForUi();
            SessionScalingHelper.Coordinates coordinatesOverride = orNull.getCoordinatesOverride();
            boolean hideExtendedHours = orNull.getHideExtendedHours();
            return Optional3.asOptional(companion.forAssetDetailHistorical(equityInstrumentId, marketHours, dataPoints, prevClosePrice, graphSelection, interval, zIsStaleForUi, orNull.getMarketBoundaries(), (23296 & 256) != 0 ? false : false, (23296 & 512) != 0 ? null : null, (23296 & 1024) != 0 ? false : orNull.getShowLivePulse(), (23296 & 2048) != 0 ? null : null, (23296 & 4096) != 0 ? false : false, (23296 & 8192) != 0 ? null : coordinatesOverride, (23296 & 16384) != 0 ? false : false, (23296 & 32768) != 0 ? false : hideExtendedHours));
        }

        private final Optional<GraphConfiguration> getGraphDataConfiguration(Instrument instrument, QuoteMode quoteMode, UiQuoteHistorical historical, MarketHours marketHours, InstrumentChartBounds chartBounds, boolean showFullExtendedHours, boolean isShowingExtendedHoursPref, boolean isAdtHours) {
            Tuples2 tuples2M3642to;
            Function1<SessionScalingHelper.DataPointMetadata, Grouping> function1ByOvernight;
            boolean z = !isShowingExtendedHoursPref;
            boolean zIsAllDayTradable = Instrument4.isAllDayTradable(instrument);
            if (isShowingExtendedHoursPref) {
                tuples2M3642to = Tuples4.m3642to(chartBounds.getFirstTimestamp(), chartBounds.getLastTimestamp());
            } else {
                tuples2M3642to = Tuples4.m3642to(marketHours.getRegularOpensAt(), marketHours.getRegularClosesAt());
            }
            Instant instant = (Instant) tuples2M3642to.component1();
            Instant instant2 = (Instant) tuples2M3642to.component2();
            if (quoteMode instanceof QuoteMode.Public) {
                QuoteMode.Public r0 = (QuoteMode.Public) quoteMode;
                Money lastTradePrice = r0.getQuote().getLastTradePrice();
                Quote quote = r0.getQuote();
                Instant updatedAt = quote.getUpdatedAt();
                if (updatedAt == null) {
                    updatedAt = quote.getReceivedAt();
                }
                GraphSelection graphSelection = GraphSelection.ALL_DAY;
                List<DataPoint.Asset> dataPointsForDisplay = historical.getDataPointsForDisplay(lastTradePrice, updatedAt, graphSelection, instant, instant2);
                Instant extendedOpen = chartBounds.getExtendedOpen();
                if (!showFullExtendedHours && extendedOpen != null) {
                    Instant instantMinus = extendedOpen.minus((TemporalAmount) Minutes.m3992of(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE));
                    Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
                    function1ByOvernight = Grouping.INSTANCE.byOvernightAndFullExtended(!zIsAllDayTradable, instantMinus, extendedOpen);
                } else if (showFullExtendedHours) {
                    function1ByOvernight = Grouping.INSTANCE.getNone();
                } else {
                    function1ByOvernight = Grouping.INSTANCE.byOvernight(!zIsAllDayTradable);
                }
                SessionScalingHelper.Coordinates coordinatesScaleCoordinatesValues = SessionScalingHelper.INSTANCE.scaleCoordinatesValues(dataPointsForDisplay, new Function1() { // from class: com.robinhood.android.common.views.InstrumentRowView$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(InstrumentRowView.Companion.getGraphDataConfiguration$lambda$2((SessionScalingHelper.DataPointMetadata) obj));
                    }
                }, function1ByOvernight);
                UUID id = instrument.getId();
                Money previousClose = historical.getPreviousClose();
                return Optional3.asOptional(new GraphConfiguration(id, marketHours, dataPointsForDisplay, previousClose != null ? Money3.getBigDecimalCompat(previousClose) : null, graphSelection, historical.getInterval(), historical.getQuoteHistorical().isStaleForUi(), zIsAllDayTradable, coordinatesScaleCoordinatesValues, showFullExtendedHours, z, zIsAllDayTradable && isAdtHours, Tuples4.m3642to(instant, instant2)));
            }
            if (!(quoteMode instanceof QuoteMode.PreIpo) && quoteMode != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Optional2.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean getGraphDataConfiguration$lambda$2(SessionScalingHelper.DataPointMetadata scaleCoordinatesValues) {
            Intrinsics.checkNotNullParameter(scaleCoordinatesValues, "$this$scaleCoordinatesValues");
            return !BigDecimals7.isZero(scaleCoordinatesValues.getVolume());
        }
    }
}
