package com.robinhood.android.chart.blackwidowadvancedchart;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import black_widow.contracts.mobile_app_chart.proto.p024v1.AddIndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.AdvancedChartClosedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.AdvancedChartOpenedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ApplyIndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.DeleteIndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.HapticDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.HapticStyleDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.InitializeChartApp;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.MobileAppFeature;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderCancelledEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderEditedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToCancelEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToEditEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToSubmitEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderSubmittedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.RenameIndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSetting;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSettingsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorLegendCollapsed;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetInterval;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetTimeSpan;
import black_widow.contracts.mobile_app_chart.proto.p024v1.StartChartApp;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.UpdateAuthState;
import black_widow.contracts.mobile_app_chart.proto.p024v1.WebBlackWidowChartMessage;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState;
import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartEvent;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartDialog;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartSnackbar;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.HapticEvent;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.SetChartScreenState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.Chart;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartScreenState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.IndicatorSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SpanIntervalData;
import com.robinhood.android.chart.blackwidowadvancedchart.models.YAxisLongPress;
import com.robinhood.android.chart.blackwidowadvancedchart.models.YAxisSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.SpanSelector;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.shared.trading.tradecomponentscompose.C41061R;
import com.robinhood.utils.Optional;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.http.HttpStatusCode;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;
import okio.ByteString;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: BlackWidowAdvancedChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 i2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u0007:\u0002hiB9\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0002J\u000e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020'H\u0002J\u0010\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020'H\u0002J\u0012\u00101\u001a\u00020'2\b\u00102\u001a\u0004\u0018\u000103H\u0002J\u0010\u00104\u001a\u00020'2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020'2\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020>H\u0002J\u0012\u0010?\u001a\u00020'2\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J\u0016\u0010B\u001a\u00020'2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\"0DH\u0002J\u0016\u0010E\u001a\u00020'2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\"0DH\u0002J\u0018\u0010F\u001a\u00020'2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010DH\u0002J\u0016\u0010H\u001a\u00020'2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0DH\u0002J\u0018\u0010K\u001a\u00020'2\u0006\u0010L\u001a\u00020!2\u0006\u0010M\u001a\u00020NH\u0016J\u0018\u0010O\u001a\u00020'2\u0006\u0010P\u001a\u00020%2\u0006\u0010Q\u001a\u000206H\u0016J\u0012\u0010R\u001a\u00020'2\b\u0010P\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u00020'2\u0006\u0010W\u001a\u00020XH\u0016J\u0010\u0010Y\u001a\u00020'2\u0006\u0010Z\u001a\u00020[H\u0016J\u0018\u0010\\\u001a\u00020'2\u0006\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001eH\u0016J\b\u0010_\u001a\u00020'H\u0016J\b\u0010`\u001a\u00020'H\u0016J\b\u0010a\u001a\u00020'H\u0016J\u0010\u0010b\u001a\u00020'2\u0006\u0010c\u001a\u00020!H\u0016J\u0010\u0010d\u001a\u00020'2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010e\u001a\u00020'2\u0006\u0010@\u001a\u00020AH\u0016J\u0018\u0010f\u001a\u00020'2\u0006\u0010g\u001a\u00020!2\u0006\u0010@\u001a\u00020AH\u0016R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006j"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartViewState;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo$InitArgs;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "stateProvider", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "accountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "<init>", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "getBwWebViewManager", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "activeInstrumentFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "addedIndicatorsMap", "", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "screenStateQueue", "Lkotlin/collections/ArrayDeque;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartScreenState;", "onCreate", "", "streamChartData", "displayThrowableDialog", "throwable", "", "onYAxisLongPress", "setSpanIntervalData", "spanIntervalData", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;", "streamChartUrl", "setQuote", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "setScrubMode", "scrubbing", "", "setChartSettings", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "webViewState", "state", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "setAvailableIndicators", "availableIndicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "setActiveTemplate", "template", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "setCurrentIndicators", "addedIndicators", "", "setAddedIndicators", "setAvailableIndicatorsTemplates", "availableIndicatorsTemplates", "setAvailableColorPickerColors", "colors", "Lrh_server_driven_ui/v1/ThemedColorDto;", "updateIndicator", "indicatorId", "action", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorAction;", "setScreenState", "screenState", "advance", "advanceScreenState", "onSpanSelected", "timeSpan", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "onIntervalSelected", "interval", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "onSetChartSetting", "setting", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;", "onSearchItemSelected", "id", "instrumentType", "showAutoSendEnabledToast", "onToggleIndicatorsRow", "hideIndicatorsRow", "createTemplate", "templateName", "selectTemplate", "deleteTemplate", "renameTemplate", "name", "InitArgs", "Companion", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartDuxo extends BaseDuxo3<BlackWidowAdvancedChartDataState, BlackWidowAdvancedChartViewState, AdvanceChartEvent> implements HasArgs<InitArgs>, BlackWidowAdvanceChartCallbacks {
    private final AccountStore accountStore;
    private final InstrumentAccountSwitcherStore accountSwitcherStore;
    private final StateFlow2<Tuples2<UUID, BlackWidowAdvancedChartFragmentKey2>> activeInstrumentFlow;
    private final Map<String, IndicatorStateDto> addedIndicatorsMap;
    private final BwWebViewManager bwWebViewManager;
    private final SavedStateHandle savedStateHandle;
    private final ArrayDeque<ChartScreenState> screenStateQueue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BuildVariant.values().length];
            try {
                iArr[BuildVariant.EXTERNAL_DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuildVariant.INTERNAL_DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BuildVariant.INTERNAL_RELEASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BuildVariant.EXTERNAL_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final BwWebViewManager getBwWebViewManager() {
        return this.bwWebViewManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BlackWidowAdvancedChartDuxo(BlackWidowAdvancedChartStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, InstrumentAccountSwitcherStore accountSwitcherStore, AccountStore accountStore, BwWebViewManager bwWebViewManager) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(bwWebViewManager, "bwWebViewManager");
        Companion companion = INSTANCE;
        super(new BlackWidowAdvancedChartDataState(StringsKt.toUuid(((InitArgs) companion.getArgs(savedStateHandle)).getInstrumentId()), ((InitArgs) companion.getArgs(savedStateHandle)).getInstrumentType(), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67108860, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.accountSwitcherStore = accountSwitcherStore;
        this.accountStore = accountStore;
        this.bwWebViewManager = bwWebViewManager;
        this.activeInstrumentFlow = StateFlow4.MutableStateFlow(Tuples4.m3642to(StringsKt.toUuid(((InitArgs) getArgs(getSavedStateHandle())).getInstrumentId()), ((InitArgs) getArgs(getSavedStateHandle())).getInstrumentType()));
        this.addedIndicatorsMap = new LinkedHashMap();
        this.screenStateQueue = new ArrayDeque<>();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C105481(null));
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo$InitArgs;", "Landroid/os/Parcelable;", "instrumentId", "", "instrumentType", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;)V", "getInstrumentId", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String instrumentId;
        private final BlackWidowAdvancedChartFragmentKey2 instrumentType;

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(parcel.readString(), BlackWidowAdvancedChartFragmentKey2.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, String str, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initArgs.instrumentId;
            }
            if ((i & 2) != 0) {
                blackWidowAdvancedChartFragmentKey2 = initArgs.instrumentType;
            }
            return initArgs.copy(str, blackWidowAdvancedChartFragmentKey2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final BlackWidowAdvancedChartFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }

        public final InitArgs copy(String instrumentId, BlackWidowAdvancedChartFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new InitArgs(instrumentId, instrumentType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.instrumentId, initArgs.instrumentId) && this.instrumentType == initArgs.instrumentType;
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "InitArgs(instrumentId=" + this.instrumentId + ", instrumentType=" + this.instrumentType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.instrumentId);
            dest.writeString(this.instrumentType.name());
        }

        public InitArgs(String instrumentId, BlackWidowAdvancedChartFragmentKey2 instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.instrumentId = instrumentId;
            this.instrumentType = instrumentType;
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final BlackWidowAdvancedChartFragmentKey2 getInstrumentType() {
            return this.instrumentType;
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDuxo$InitArgs;", "<init>", "()V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<BlackWidowAdvancedChartDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, blackWidowAdvancedChartDuxo);
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$1 */
    static final class C105481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C105481(Continuation<? super C105481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartDuxo.this.getBwWebViewManager();
                this.label = 1;
                if (bwWebViewManager.retainUntilCanceled(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1 */
    static final class C105521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C105521(Continuation<? super C105521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105521 c105521 = BlackWidowAdvancedChartDuxo.this.new C105521(continuation);
            c105521.L$0 = obj;
            return c105521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(BlackWidowAdvancedChartDuxo.this.accountSwitcherStore.streamActiveAccountNumber()), Integer.MAX_VALUE, null, 2, null);
                Flow flowOnEach = FlowKt.onEach(FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(new Flow<String>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String str = (String) ((Optional) obj).component1();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                })), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1), new BlackWidowAdvancedChartDuxo4(BlackWidowAdvancedChartDuxo.this, null));
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flowOnEach, BlackWidowAdvancedChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(flowOnEach, BlackWidowAdvancedChartDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(BlackWidowAdvancedChartDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $accountNumberStream;
            int label;
            final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Flow<String> flow, BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountNumberStream = flow;
                this.this$0 = blackWidowAdvancedChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$accountNumberStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BlackWidowAdvancedChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$1$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496501 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496501(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super C496501> continuation) {
                    super(2, continuation);
                    this.this$0 = blackWidowAdvancedChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496501 c496501 = new C496501(this.this$0, continuation);
                    c496501.L$0 = obj;
                    return c496501;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C496501) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: BlackWidowAdvancedChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$1$1$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496511 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
                    final /* synthetic */ String $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C496511(String str, Continuation<? super C496511> continuation) {
                        super(2, continuation);
                        this.$it = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496511 c496511 = new C496511(this.$it, continuation);
                        c496511.L$0 = obj;
                        return c496511;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
                        return ((C496511) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, this.$it, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67108859, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496511((String) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<String> flow = this.$accountNumberStream;
                    C496501 c496501 = new C496501(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c496501, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<String> $accountNumberStream;
            int label;
            final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow<String> flow, BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$accountNumberStream = flow;
                this.this$0 = blackWidowAdvancedChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$accountNumberStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberStream, new C10546xcd5caa4d(null, this.this$0));
                    C496522 c496522 = new C496522(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c496522, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: BlackWidowAdvancedChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$2$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C496522 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496522(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super C496522> continuation) {
                    super(2, continuation);
                    this.this$0 = blackWidowAdvancedChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496522 c496522 = new C496522(this.this$0, continuation);
                    c496522.L$0 = obj;
                    return c496522;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((C496522) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: BlackWidowAdvancedChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$2$2$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
                    final /* synthetic */ Account $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Account account, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$it = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
                        return ((AnonymousClass1) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, this.$it, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67108855, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$3", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = blackWidowAdvancedChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BlackWidowAdvancedChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "features", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$3$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends MobileAppFeature>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = blackWidowAdvancedChartDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(List<? extends MobileAppFeature> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: BlackWidowAdvancedChartDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$3$1$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C496531 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
                    final /* synthetic */ List<MobileAppFeature> $features;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C496531(List<? extends MobileAppFeature> list, Continuation<? super C496531> continuation) {
                        super(2, continuation);
                        this.$features = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C496531 c496531 = new C496531(this.$features, continuation);
                        c496531.L$0 = obj;
                        return c496531;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
                        return ((C496531) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, this.$features.contains(MobileAppFeature.MOBILE_APP_FEATURE_SCROLLING_INTERVAL_PICKER), this.$features.contains(MobileAppFeature.MOBILE_APP_FEATURE_LOADING_SKELETON), 16777215, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C496531((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<List<MobileAppFeature>> chartFeatures = this.this$0.getBwWebViewManager().getChartFeatures();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(chartFeatures, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C105521(null));
        streamChartData();
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1 */
    static final class C105711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C105711(Continuation<? super C105711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105711 c105711 = BlackWidowAdvancedChartDuxo.this.new C105711(continuation);
            c105711.L$0 = obj;
            return c105711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = blackWidowAdvancedChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BlackWidowAdvancedChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$1$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496541 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496541(boolean z, Continuation<? super C496541> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496541 c496541 = new C496541(this.$it, continuation);
                    c496541.L$0 = obj;
                    return c496541;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
                    return ((C496541) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, this.$it, false, false, 58720255, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496541(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FlowKt.launchIn(FlowKt.onEach(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getWebViewVersionUnsupported(), new AnonymousClass1(BlackWidowAdvancedChartDuxo.this, null)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getSpanIntervalData(), new AnonymousClass2(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getQuote(), new AnonymousClass3(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getScrubMode()), new AnonymousClass4(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getChartSettings()), new AnonymousClass5(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getAvailableIndicators()), new AnonymousClass6(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getCurrentIndicators()), new AnonymousClass7(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getAvailableIndicatorTemplates()), new AnonymousClass8(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(FlowKt.filterNotNull(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getAvailableColorPickerColors()), new AnonymousClass9(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getActiveTemplate(), new AnonymousClass10(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getWebViewState(), new AnonymousClass11(BlackWidowAdvancedChartDuxo.this)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getOnYAxisLongPress(), new AnonymousClass12(BlackWidowAdvancedChartDuxo.this, null)), coroutineScope);
            FlowKt.launchIn(FlowKt.onEach(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getHapticEvents(), new AnonymousClass13(BlackWidowAdvancedChartDuxo.this, null)), coroutineScope);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<SpanIntervalData, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass2(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setSpanIntervalData", "setSpanIntervalData(Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SpanIntervalData spanIntervalData, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setSpanIntervalData((BlackWidowAdvancedChartDuxo) this.receiver, spanIntervalData, continuation);
            }
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$3, reason: invalid class name */
        /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function2<QuoteDto, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass3(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setQuote", "setQuote(Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QuoteDto quoteDto, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setQuote((BlackWidowAdvancedChartDuxo) this.receiver, quoteDto, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setSpanIntervalData(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, SpanIntervalData spanIntervalData, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setSpanIntervalData(spanIntervalData);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$4, reason: invalid class name */
        /* synthetic */ class AnonymousClass4 extends AdaptedFunctionReference implements Function2<Boolean, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass4(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setScrubMode", "setScrubMode(Z)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setScrubMode((BlackWidowAdvancedChartDuxo) this.receiver, z, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setQuote(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, QuoteDto quoteDto, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setQuote(quoteDto);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$5, reason: invalid class name */
        /* synthetic */ class AnonymousClass5 extends AdaptedFunctionReference implements Function2<SetChartSettingsDto, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass5(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setChartSettings", "setChartSettings(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SetChartSettingsDto setChartSettingsDto, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setChartSettings((BlackWidowAdvancedChartDuxo) this.receiver, setChartSettingsDto, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setScrubMode(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, boolean z, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setScrubMode(z);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$6, reason: invalid class name */
        /* synthetic */ class AnonymousClass6 extends AdaptedFunctionReference implements Function2<SetIndicatorsDto, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass6(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setAvailableIndicators", "setAvailableIndicators(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SetIndicatorsDto setIndicatorsDto, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setAvailableIndicators((BlackWidowAdvancedChartDuxo) this.receiver, setIndicatorsDto, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setChartSettings(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, SetChartSettingsDto setChartSettingsDto, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setChartSettings(setChartSettingsDto);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$7, reason: invalid class name */
        /* synthetic */ class AnonymousClass7 extends AdaptedFunctionReference implements Function2<List<? extends IndicatorStateDto>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass7(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setCurrentIndicators", "setCurrentIndicators(Ljava/util/List;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends IndicatorStateDto> list, Continuation<? super Unit> continuation) {
                return invoke2((List<IndicatorStateDto>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<IndicatorStateDto> list, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setCurrentIndicators((BlackWidowAdvancedChartDuxo) this.receiver, list, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setAvailableIndicators(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, SetIndicatorsDto setIndicatorsDto, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setAvailableIndicators(setIndicatorsDto);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$8, reason: invalid class name */
        /* synthetic */ class AnonymousClass8 extends AdaptedFunctionReference implements Function2<List<? extends TemplateDto>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass8(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setAvailableIndicatorsTemplates", "setAvailableIndicatorsTemplates(Ljava/util/List;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends TemplateDto> list, Continuation<? super Unit> continuation) {
                return invoke2((List<TemplateDto>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<TemplateDto> list, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setAvailableIndicatorsTemplates((BlackWidowAdvancedChartDuxo) this.receiver, list, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setCurrentIndicators(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, List list, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setCurrentIndicators(list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setAvailableIndicatorsTemplates(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, List list, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setAvailableIndicatorsTemplates(list);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$9, reason: invalid class name */
        /* synthetic */ class AnonymousClass9 extends AdaptedFunctionReference implements Function2<List<? extends ThemedColorDto>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass9(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setAvailableColorPickerColors", "setAvailableColorPickerColors(Ljava/util/List;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends ThemedColorDto> list, Continuation<? super Unit> continuation) {
                return invoke2((List<ThemedColorDto>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<ThemedColorDto> list, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setAvailableColorPickerColors((BlackWidowAdvancedChartDuxo) this.receiver, list, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setAvailableColorPickerColors(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, List list, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setAvailableColorPickerColors(list);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$10, reason: invalid class name */
        /* synthetic */ class AnonymousClass10 extends AdaptedFunctionReference implements Function2<TemplateDto, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass10(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "setActiveTemplate", "setActiveTemplate(Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TemplateDto templateDto, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$setActiveTemplate((BlackWidowAdvancedChartDuxo) this.receiver, templateDto, continuation);
            }
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$11, reason: invalid class name */
        /* synthetic */ class AnonymousClass11 extends AdaptedFunctionReference implements Function2<BwWebViewManagerState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass11(Object obj) {
                super(2, obj, BlackWidowAdvancedChartDuxo.class, "webViewState", "webViewState(Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BwWebViewManagerState bwWebViewManagerState, Continuation<? super Unit> continuation) {
                return C105711.invokeSuspend$webViewState((BlackWidowAdvancedChartDuxo) this.receiver, bwWebViewManagerState, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setActiveTemplate(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, TemplateDto templateDto, Continuation continuation) {
            blackWidowAdvancedChartDuxo.setActiveTemplate(templateDto);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/YAxisLongPress;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$12", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<YAxisLongPress, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = blackWidowAdvancedChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(YAxisLongPress yAxisLongPress, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(yAxisLongPress, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.onYAxisLongPress();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$webViewState(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, BwWebViewManagerState bwWebViewManagerState, Continuation continuation) {
            blackWidowAdvancedChartDuxo.webViewState(bwWebViewManagerState);
            return Unit.INSTANCE;
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$13", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartData$1$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<HapticDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.this$0 = blackWidowAdvancedChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass13 anonymousClass13 = new AnonymousClass13(this.this$0, continuation);
                anonymousClass13.L$0 = obj;
                return anonymousClass13;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(HapticDto hapticDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(hapticDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.submit(new HapticEvent(((HapticDto) this.L$0).getStyle()));
                return Unit.INSTANCE;
            }
        }
    }

    private final void streamChartData() {
        streamChartUrl();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C105711(null));
    }

    public final void displayThrowableDialog(Throwable throwable) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        if (errorResponseExtractErrorResponse != null) {
            String fieldError = errorResponseExtractErrorResponse.getFieldError("title");
            if (fieldError != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(fieldError);
            } else {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C11048R.string.general_error_title, new Object[0]);
            }
            submit(new ChartDialog(stringResourceInvoke, StringResource.INSTANCE.invoke(String.valueOf(errorResponseExtractErrorResponse.getDisplayMessage()))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onYAxisLongPress() {
        submit(new HapticEvent(HapticStyleDto.HAPTIC_STYLE_CUSTOM_Y_AXIS));
        setScreenState(new YAxisSettings(false, null, 3, null), true);
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setSpanIntervalData$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setSpanIntervalData$1 */
    static final class C105701 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ SpanIntervalData $spanIntervalData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105701(SpanIntervalData spanIntervalData, Continuation<? super C105701> continuation) {
            super(2, continuation);
            this.$spanIntervalData = spanIntervalData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105701 c105701 = new C105701(this.$spanIntervalData, continuation);
            c105701.L$0 = obj;
            return c105701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105701) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, SpanSelector.toUnifiedSpans(this.$spanIntervalData.getAvailableSpans()), this.$spanIntervalData.getCurrentSpan(), this.$spanIntervalData.getAvailableIntervals(), this.$spanIntervalData.getCurrentInterval(), null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67108623, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpanIntervalData(SpanIntervalData spanIntervalData) {
        applyMutation(new C105701(spanIntervalData, null));
    }

    private final void streamChartUrl() {
        int i = WhenMappings.$EnumSwitchMapping$0[BuildVariant.INSTANCE.compute().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C105721(null));
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartUrl$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartUrl$1 */
    static final class C105721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C105721(Continuation<? super C105721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "url", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartUrl$1$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartUrl$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BlackWidowAdvancedChartDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = blackWidowAdvancedChartDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BlackWidowAdvancedChartDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartUrl$1$1$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$streamChartUrl$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496551 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
                final /* synthetic */ String $url;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496551(String str, Continuation<? super C496551> continuation) {
                    super(2, continuation);
                    this.$url = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496551 c496551 = new C496551(this.$url, continuation);
                    c496551.L$0 = obj;
                    return c496551;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
                    return ((C496551) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, this.$url, false, false, false, 62914559, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496551((String) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(BlackWidowAdvancedChartDuxo.this.getBwWebViewManager().getChartUrl());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BlackWidowAdvancedChartDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setQuote$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setQuote$1 */
    static final class C105681 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ QuoteDto $quote;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105681(QuoteDto quoteDto, Continuation<? super C105681> continuation) {
            super(2, continuation);
            this.$quote = quoteDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105681 c105681 = new C105681(this.$quote, continuation);
            c105681.L$0 = obj;
            return c105681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105681) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, this.$quote, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67108607, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setQuote(QuoteDto quote) {
        applyMutation(new C105681(quote, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScrubMode(boolean scrubbing) {
        if (scrubbing) {
            submit(new HapticEvent(HapticStyleDto.HAPTIC_STYLE_HEAVY));
        }
        applyMutation(new C105691(scrubbing, null));
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setScrubMode$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setScrubMode$1 */
    static final class C105691 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ boolean $scrubbing;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105691(boolean z, Continuation<? super C105691> continuation) {
            super(2, continuation);
            this.$scrubbing = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105691 c105691 = new C105691(this.$scrubbing, continuation);
            c105691.L$0 = obj;
            return c105691;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105691) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, this.$scrubbing, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67108351, null);
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setChartSettings$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setChartSettings$1 */
    static final class C105661 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ SetChartSettingsDto $setChartSettings;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105661(SetChartSettingsDto setChartSettingsDto, Continuation<? super C105661> continuation) {
            super(2, continuation);
            this.$setChartSettings = setChartSettingsDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105661 c105661 = new C105661(this.$setChartSettings, continuation);
            c105661.L$0 = obj;
            return c105661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105661) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, this.$setChartSettings.getSections(), this.$setChartSettings.getY_axis_section(), null, null, null, null, null, null, null, null, null, false, false, false, 67096575, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChartSettings(SetChartSettingsDto setChartSettings) {
        applyMutation(new C105661(setChartSettings, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void webViewState(BwWebViewManagerState state) {
        if (Intrinsics.areEqual(state, BwWebViewManagerState.Error.INSTANCE)) {
            TimberLogger.INSTANCE.mo1679d("BlackWidowWebView: Chart failed to initialize", new Object[0]);
            applyMutation(new C105741(null));
        } else if (state instanceof BwWebViewManagerState.ChartAppStarted) {
            applyMutation(new C105752(null));
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$webViewState$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$webViewState$1 */
    static final class C105741 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C105741(Continuation<? super C105741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105741 c105741 = new C105741(continuation);
            c105741.L$0 = obj;
            return c105741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105741) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, true, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67105791, null);
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$webViewState$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$webViewState$2 */
    static final class C105752 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C105752(Continuation<? super C105752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105752 c105752 = new C105752(continuation);
            c105752.L$0 = obj;
            return c105752;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105752) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, true, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67105791, null);
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setAvailableIndicators$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setAvailableIndicators$1 */
    static final class C105641 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ SetIndicatorsDto $availableIndicators;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105641(SetIndicatorsDto setIndicatorsDto, Continuation<? super C105641> continuation) {
            super(2, continuation);
            this.$availableIndicators = setIndicatorsDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105641 c105641 = new C105641(this.$availableIndicators, continuation);
            c105641.L$0 = obj;
            return c105641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105641) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, this.$availableIndicators.getIndicators(), this.$availableIndicators.getPopular_indicators(), null, null, null, null, null, null, null, false, false, false, 67059711, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAvailableIndicators(SetIndicatorsDto availableIndicators) {
        applyMutation(new C105641(availableIndicators, null));
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setActiveTemplate$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setActiveTemplate$1 */
    static final class C105621 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ TemplateDto $template;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105621(TemplateDto templateDto, Continuation<? super C105621> continuation) {
            super(2, continuation);
            this.$template = templateDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105621 c105621 = new C105621(this.$template, continuation);
            c105621.L$0 = obj;
            return c105621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105621) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, this.$template, null, null, null, null, false, false, false, 66846719, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveTemplate(TemplateDto template) {
        applyMutation(new C105621(template, null));
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setCurrentIndicators$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setCurrentIndicators$1 */
    static final class C105671 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ List<IndicatorStateDto> $addedIndicators;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105671(List<IndicatorStateDto> list, Continuation<? super C105671> continuation) {
            super(2, continuation);
            this.$addedIndicators = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105671 c105671 = new C105671(this.$addedIndicators, continuation);
            c105671.L$0 = obj;
            return c105671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105671) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ChartScreenState screenState;
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState = (BlackWidowAdvancedChartDataState) this.L$0;
            List<IndicatorStateDto> list = this.$addedIndicators;
            if (blackWidowAdvancedChartDataState.getScreenState() instanceof IndicatorSettings) {
                IndicatorSettings indicatorSettings = (IndicatorSettings) blackWidowAdvancedChartDataState.getScreenState();
                Iterator<T> it = this.$addedIndicators.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((IndicatorStateDto) next).getUuid(), ((IndicatorSettings) blackWidowAdvancedChartDataState.getScreenState()).getIndicator().getUuid())) {
                        break;
                    }
                }
                IndicatorStateDto indicator = (IndicatorStateDto) next;
                if (indicator == null) {
                    indicator = ((IndicatorSettings) blackWidowAdvancedChartDataState.getScreenState()).getIndicator();
                }
                screenState = indicatorSettings.copy(indicator);
            } else {
                screenState = blackWidowAdvancedChartDataState.getScreenState();
            }
            return BlackWidowAdvancedChartDataState.copy$default(blackWidowAdvancedChartDataState, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, list, null, null, screenState, null, null, null, false, false, false, 66519039, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentIndicators(List<IndicatorStateDto> addedIndicators) {
        setAddedIndicators(addedIndicators);
        applyMutation(new C105671(addedIndicators, null));
    }

    private final void setAddedIndicators(List<IndicatorStateDto> addedIndicators) {
        List<IndicatorStateDto> list = addedIndicators;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((IndicatorStateDto) obj).getUuid(), obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            IndicatorStateDto indicatorStateDto = (IndicatorStateDto) entry.getValue();
            IndicatorStateDto indicatorStateDto2 = this.addedIndicatorsMap.get(str);
            String strValidationErrorMessage = BlackWidowAdvancedChartDuxo8.validationErrorMessage(indicatorStateDto);
            if (strValidationErrorMessage != null && !Intrinsics.areEqual(strValidationErrorMessage, BlackWidowAdvancedChartDuxo8.validationErrorMessage(indicatorStateDto2))) {
                submit(new ChartSnackbar(null, StringResource.INSTANCE.invoke(strValidationErrorMessage), null, null, 12, null));
            }
            this.addedIndicatorsMap.put(str, indicatorStateDto);
        }
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setAvailableIndicatorsTemplates$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setAvailableIndicatorsTemplates$1 */
    static final class C105651 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ List<TemplateDto> $availableIndicatorsTemplates;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105651(List<TemplateDto> list, Continuation<? super C105651> continuation) {
            super(2, continuation);
            this.$availableIndicatorsTemplates = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105651 c105651 = new C105651(this.$availableIndicatorsTemplates, continuation);
            c105651.L$0 = obj;
            return c105651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105651) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, this.$availableIndicatorsTemplates, null, null, null, null, null, false, false, false, 66977791, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAvailableIndicatorsTemplates(List<TemplateDto> availableIndicatorsTemplates) {
        applyMutation(new C105651(availableIndicatorsTemplates, null));
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setAvailableColorPickerColors$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$setAvailableColorPickerColors$1 */
    static final class C105631 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ List<ThemedColorDto> $colors;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105631(List<ThemedColorDto> list, Continuation<? super C105631> continuation) {
            super(2, continuation);
            this.$colors = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105631 c105631 = new C105631(this.$colors, continuation);
            c105631.L$0 = obj;
            return c105631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105631) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, this.$colors, null, false, false, false, 65011711, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAvailableColorPickerColors(List<ThemedColorDto> colors) {
        applyMutation(new C105631(colors, null));
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$updateIndicator$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {362}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$updateIndicator$1 */
    static final class C105731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IndicatorAction $action;
        final /* synthetic */ String $indicatorId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105731(String str, IndicatorAction indicatorAction, Continuation<? super C105731> continuation) {
            super(2, continuation);
            this.$indicatorId = str;
            this.$action = indicatorAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105731(this.$indicatorId, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartDuxo.this.getBwWebViewManager();
                InitializeChartApp initializeChartApp = null;
                SetTimeSpan setTimeSpan = null;
                SetInterval setInterval = null;
                SetChartSetting setChartSetting = null;
                StartChartApp startChartApp = null;
                SetIndicatorTemplateAction setIndicatorTemplateAction = null;
                UpdateAuthState updateAuthState = null;
                OrderSubmittedEvent orderSubmittedEvent = null;
                OrderEditedEvent orderEditedEvent = null;
                OrderFailedToSubmitEvent orderFailedToSubmitEvent = null;
                SetIndicatorLegendCollapsed setIndicatorLegendCollapsed = null;
                AdvancedChartOpenedEvent advancedChartOpenedEvent = null;
                OrderFailedToEditEvent orderFailedToEditEvent = null;
                OrderCancelledEvent orderCancelledEvent = null;
                OrderFailedToCancelEvent orderFailedToCancelEvent = null;
                AdvancedChartClosedEvent advancedChartClosedEvent = null;
                ByteString byteString = null;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                WebBlackWidowChartMessage webBlackWidowChartMessage = new WebBlackWidowChartMessage(initializeChartApp, setTimeSpan, setInterval, objArr2, setChartSetting, objArr, startChartApp, new SetIndicatorAction(this.$indicatorId, this.$action, null, 4, null), setIndicatorTemplateAction, updateAuthState, orderSubmittedEvent, orderEditedEvent, orderFailedToSubmitEvent, setIndicatorLegendCollapsed, advancedChartOpenedEvent, orderFailedToEditEvent, orderCancelledEvent, orderFailedToCancelEvent, advancedChartClosedEvent, byteString, 1048447, null);
                this.label = 1;
                if (bwWebViewManager.sendMessage(webBlackWidowChartMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void updateIndicator(String indicatorId, IndicatorAction action) {
        Intrinsics.checkNotNullParameter(indicatorId, "indicatorId");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105731(indicatorId, action, null), 3, null);
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void setScreenState(final ChartScreenState screenState, final boolean advance) {
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        withDataState(new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackWidowAdvancedChartDuxo.setScreenState$lambda$2(this.f$0, screenState, advance, (BlackWidowAdvancedChartDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setScreenState$lambda$2(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, ChartScreenState chartScreenState, boolean z, BlackWidowAdvancedChartDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (!blackWidowAdvancedChartDuxo.screenStateQueue.isEmpty() || !Intrinsics.areEqual(ds.getScreenState(), Chart.INSTANCE)) {
            blackWidowAdvancedChartDuxo.screenStateQueue.add(chartScreenState);
            if (z) {
                BlackWidowAdvanceChartCallbacks.DefaultImpls.advanceScreenState$default(blackWidowAdvancedChartDuxo, null, 1, null);
            }
        } else {
            blackWidowAdvancedChartDuxo.advanceScreenState(chartScreenState);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$advanceScreenState$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$advanceScreenState$1 */
    static final class C105491 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ ChartScreenState $newScreenState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105491(ChartScreenState chartScreenState, Continuation<? super C105491> continuation) {
            super(2, continuation);
            this.$newScreenState = chartScreenState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105491 c105491 = new C105491(this.$newScreenState, continuation);
            c105491.L$0 = obj;
            return c105491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105491) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState = (BlackWidowAdvancedChartDataState) this.L$0;
            ChartScreenState chartScreenState = this.$newScreenState;
            return BlackWidowAdvancedChartDataState.copy$default(blackWidowAdvancedChartDataState, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, chartScreenState, chartScreenState instanceof ChartSettings ? LowerTopBarState.DisplayStatus.Gone.INSTANCE : blackWidowAdvancedChartDataState.getLowerTopBarDisplayStatus(), null, null, false, false, false, 65535999, null);
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void advanceScreenState(ChartScreenState screenState) {
        if (screenState == null && (screenState = this.screenStateQueue.removeFirstOrNull()) == null) {
            screenState = Chart.INSTANCE;
        }
        applyMutation(new C105491(screenState, null));
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onSpanSelected$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {398}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onSpanSelected$1 */
    static final class C105561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TimeSpanDto $timeSpan;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105561(TimeSpanDto timeSpanDto, Continuation<? super C105561> continuation) {
            super(2, continuation);
            this.$timeSpan = timeSpanDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105561(this.$timeSpan, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartDuxo.this.getBwWebViewManager();
                TimeSpanDto timeSpanDto = this.$timeSpan;
                this.label = 1;
                if (bwWebViewManager.setChartSpan(timeSpanDto, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void onSpanSelected(TimeSpanDto timeSpan) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105561(timeSpan, null), 3, null);
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onIntervalSelected$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {404}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onIntervalSelected$1 */
    static final class C105531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IntervalDto $interval;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105531(IntervalDto intervalDto, Continuation<? super C105531> continuation) {
            super(2, continuation);
            this.$interval = intervalDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105531(this.$interval, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartDuxo.this.getBwWebViewManager();
                IntervalDto intervalDto = this.$interval;
                this.label = 1;
                if (bwWebViewManager.setChartInterval(intervalDto, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void onIntervalSelected(IntervalDto interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105531(interval, null), 3, null);
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onSetChartSetting$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {HttpStatusCode.GONE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onSetChartSetting$1 */
    static final class C105551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SetChartSetting $setting;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105551(SetChartSetting setChartSetting, Continuation<? super C105551> continuation) {
            super(2, continuation);
            this.$setting = setChartSetting;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105551(this.$setting, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartDuxo.this.getBwWebViewManager();
                WebBlackWidowChartMessage webBlackWidowChartMessage = new WebBlackWidowChartMessage(null, null, null, null, this.$setting, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048559, null);
                this.label = 1;
                if (bwWebViewManager.sendMessage(webBlackWidowChartMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void onSetChartSetting(SetChartSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105551(setting, null), 3, null);
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onSearchItemSelected$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onSearchItemSelected$1 */
    static final class C105541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $id;
        final /* synthetic */ BlackWidowAdvancedChartFragmentKey2 $instrumentType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105541(UUID uuid, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, Continuation<? super C105541> continuation) {
            super(2, continuation);
            this.$id = uuid;
            this.$instrumentType = blackWidowAdvancedChartFragmentKey2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105541(this.$id, this.$instrumentType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = BlackWidowAdvancedChartDuxo.this.activeInstrumentFlow;
                UUID uuid = this.$id;
                BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2 = this.$instrumentType;
                do {
                    value = stateFlow2.getValue();
                } while (!stateFlow2.compareAndSet(value, Tuples4.m3642to(uuid, blackWidowAdvancedChartFragmentKey2)));
                BlackWidowAdvancedChartDuxo.this.applyMutation(new AnonymousClass2(this.$id, this.$instrumentType, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: BlackWidowAdvancedChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onSearchItemSelected$1$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$onSearchItemSelected$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
            final /* synthetic */ UUID $id;
            final /* synthetic */ BlackWidowAdvancedChartFragmentKey2 $instrumentType;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UUID uuid, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$id = uuid;
                this.$instrumentType = blackWidowAdvancedChartFragmentKey2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$id, this.$instrumentType, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
                return ((AnonymousClass2) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, this.$id, this.$instrumentType, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 67108860, null);
            }
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void onSearchItemSelected(UUID id, BlackWidowAdvancedChartFragmentKey2 instrumentType) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105541(id, instrumentType, null), 3, null);
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void showAutoSendEnabledToast() {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CHECKMARK_16;
        StringResource.Companion companion = StringResource.INSTANCE;
        submit(new ChartSnackbar(serverToBentoAssetMapper2, companion.invoke(C41061R.string.auto_send_enabled_tooltip, new Object[0]), companion.invoke(C41061R.string.settings, new Object[0]), new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlackWidowAdvancedChartDuxo.showAutoSendEnabledToast$lambda$3(this.f$0);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAutoSendEnabledToast$lambda$3(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo) {
        blackWidowAdvancedChartDuxo.submit(new SetChartScreenState(new ChartSettings(true, null, 2, null), true));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void onToggleIndicatorsRow() {
        withDataState(new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackWidowAdvancedChartDuxo.onToggleIndicatorsRow$lambda$4(this.f$0, (BlackWidowAdvancedChartDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onToggleIndicatorsRow$lambda$4(BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, BlackWidowAdvancedChartDataState ds) {
        boolean z;
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (Intrinsics.areEqual(ds.getLowerTopBarDisplayStatus(), LowerTopBarState.DisplayStatus.Indicators.INSTANCE)) {
            blackWidowAdvancedChartDuxo.applyMutation(new BlackWidowAdvancedChartDuxo6(null));
            z = false;
        } else {
            blackWidowAdvancedChartDuxo.applyMutation(new BlackWidowAdvancedChartDuxo7(null));
            z = true;
        }
        BuildersKt__Builders_commonKt.launch$default(blackWidowAdvancedChartDuxo.getLifecycleScope(), null, null, new BlackWidowAdvancedChartDuxo5(blackWidowAdvancedChartDuxo, z, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$hideIndicatorsRow$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$hideIndicatorsRow$1 */
    static final class C105511 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C105511(Continuation<? super C105511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105511 c105511 = new C105511(continuation);
            c105511.L$0 = obj;
            return c105511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105511) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, LowerTopBarState.DisplayStatus.Gone.INSTANCE, null, null, false, false, false, 66060287, null);
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void hideIndicatorsRow() {
        applyMutation(new C105511(null));
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$createTemplate$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {476}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$createTemplate$1 */
    static final class C105501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $templateName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105501(String str, Continuation<? super C105501> continuation) {
            super(2, continuation);
            this.$templateName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105501(this.$templateName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartDuxo.this.getBwWebViewManager();
                DeleteIndicatorTemplateAction deleteIndicatorTemplateAction = null;
                RenameIndicatorTemplateAction renameIndicatorTemplateAction = null;
                ByteString byteString = null;
                Object[] objArr = 0 == true ? 1 : 0;
                String str = null;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                InitializeChartApp initializeChartApp = null;
                SetInterval setInterval = null;
                SetChartSetting setChartSetting = null;
                SetIndicatorAction setIndicatorAction = null;
                UpdateAuthState updateAuthState = null;
                OrderSubmittedEvent orderSubmittedEvent = null;
                OrderEditedEvent orderEditedEvent = null;
                OrderFailedToSubmitEvent orderFailedToSubmitEvent = null;
                SetIndicatorLegendCollapsed setIndicatorLegendCollapsed = null;
                AdvancedChartOpenedEvent advancedChartOpenedEvent = null;
                OrderFailedToEditEvent orderFailedToEditEvent = null;
                OrderCancelledEvent orderCancelledEvent = null;
                OrderFailedToCancelEvent orderFailedToCancelEvent = null;
                AdvancedChartClosedEvent advancedChartClosedEvent = null;
                ByteString byteString2 = null;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Object[] objArr5 = 0 == true ? 1 : 0;
                Object[] objArr6 = 0 == true ? 1 : 0;
                Object[] objArr7 = 0 == true ? 1 : 0;
                WebBlackWidowChartMessage webBlackWidowChartMessage = new WebBlackWidowChartMessage(initializeChartApp, objArr7, setInterval, objArr5, setChartSetting, objArr4, objArr6, setIndicatorAction, new SetIndicatorTemplateAction(str, new IndicatorTemplateAction(new AddIndicatorTemplateAction(this.$templateName, null, 2, 0 == true ? 1 : 0), deleteIndicatorTemplateAction, renameIndicatorTemplateAction, objArr, byteString, 30, null), objArr3, 5, objArr2), updateAuthState, orderSubmittedEvent, orderEditedEvent, orderFailedToSubmitEvent, setIndicatorLegendCollapsed, advancedChartOpenedEvent, orderFailedToEditEvent, orderCancelledEvent, orderFailedToCancelEvent, advancedChartClosedEvent, byteString2, 1048319, null);
                this.label = 1;
                if (bwWebViewManager.sendMessage(webBlackWidowChartMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void createTemplate(String templateName) {
        Intrinsics.checkNotNullParameter(templateName, "templateName");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105501(templateName, null), 3, null);
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvancedChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$selectTemplate$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$selectTemplate$1 */
    static final class C105601 extends ContinuationImpl7 implements Function2<BlackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState>, Object> {
        final /* synthetic */ TemplateDto $template;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105601(TemplateDto templateDto, Continuation<? super C105601> continuation) {
            super(2, continuation);
            this.$template = templateDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105601 c105601 = new C105601(this.$template, continuation);
            c105601.L$0 = obj;
            return c105601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BlackWidowAdvancedChartDataState blackWidowAdvancedChartDataState, Continuation<? super BlackWidowAdvancedChartDataState> continuation) {
            return ((C105601) create(blackWidowAdvancedChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BlackWidowAdvancedChartDataState.copy$default((BlackWidowAdvancedChartDataState) this.L$0, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, this.$template, null, null, null, null, false, false, false, 66846719, null);
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void selectTemplate(TemplateDto template) {
        Intrinsics.checkNotNullParameter(template, "template");
        applyMutation(new C105601(template, null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105612(template, null), 3, null);
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$selectTemplate$2", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {495}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$selectTemplate$2 */
    static final class C105612 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TemplateDto $template;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105612(TemplateDto templateDto, Continuation<? super C105612> continuation) {
            super(2, continuation);
            this.$template = templateDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105612(this.$template, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartDuxo.this.getBwWebViewManager();
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                InitializeChartApp initializeChartApp = null;
                SetTimeSpan setTimeSpan = null;
                SetInterval setInterval = null;
                SetChartSetting setChartSetting = null;
                StartChartApp startChartApp = null;
                OrderSubmittedEvent orderSubmittedEvent = null;
                OrderEditedEvent orderEditedEvent = null;
                OrderFailedToSubmitEvent orderFailedToSubmitEvent = null;
                SetIndicatorLegendCollapsed setIndicatorLegendCollapsed = null;
                AdvancedChartOpenedEvent advancedChartOpenedEvent = null;
                OrderFailedToEditEvent orderFailedToEditEvent = null;
                OrderCancelledEvent orderCancelledEvent = null;
                OrderFailedToCancelEvent orderFailedToCancelEvent = null;
                AdvancedChartClosedEvent advancedChartClosedEvent = null;
                ByteString byteString = null;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Object[] objArr5 = 0 == true ? 1 : 0;
                Object[] objArr6 = 0 == true ? 1 : 0;
                WebBlackWidowChartMessage webBlackWidowChartMessage = new WebBlackWidowChartMessage(initializeChartApp, setTimeSpan, setInterval, objArr3, setChartSetting, objArr5, startChartApp, objArr6, new SetIndicatorTemplateAction(this.$template.getId(), new IndicatorTemplateAction(objArr, null, null, new ApplyIndicatorTemplateAction(null, i2, 0 == true ? 1 : 0), null, 23, null), objArr2, 4, 0 == true ? 1 : 0), objArr4, orderSubmittedEvent, orderEditedEvent, orderFailedToSubmitEvent, setIndicatorLegendCollapsed, advancedChartOpenedEvent, orderFailedToEditEvent, orderCancelledEvent, orderFailedToCancelEvent, advancedChartClosedEvent, byteString, 1048319, null);
                this.label = 1;
                if (bwWebViewManager.sendMessage(webBlackWidowChartMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void deleteTemplate(final TemplateDto template) {
        Intrinsics.checkNotNullParameter(template, "template");
        withDataState(new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlackWidowAdvancedChartDuxo.deleteTemplate$lambda$5(template, this, (BlackWidowAdvancedChartDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteTemplate$lambda$5(TemplateDto templateDto, BlackWidowAdvancedChartDuxo blackWidowAdvancedChartDuxo, BlackWidowAdvancedChartDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (Intrinsics.areEqual(ds.getSelectedTemplate(), templateDto)) {
            blackWidowAdvancedChartDuxo.applyMutation(new BlackWidowAdvancedChartDuxo2(null));
        }
        BuildersKt__Builders_commonKt.launch$default(blackWidowAdvancedChartDuxo.getLifecycleScope(), null, null, new BlackWidowAdvancedChartDuxo3(blackWidowAdvancedChartDuxo, templateDto, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: BlackWidowAdvancedChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$renameTemplate$1", m3645f = "BlackWidowAdvancedChartDuxo.kt", m3646l = {532}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxo$renameTemplate$1 */
    static final class C105591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ TemplateDto $template;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105591(TemplateDto templateDto, String str, Continuation<? super C105591> continuation) {
            super(2, continuation);
            this.$template = templateDto;
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlackWidowAdvancedChartDuxo.this.new C105591(this.$template, this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewManager bwWebViewManager = BlackWidowAdvancedChartDuxo.this.getBwWebViewManager();
                AddIndicatorTemplateAction addIndicatorTemplateAction = null;
                DeleteIndicatorTemplateAction deleteIndicatorTemplateAction = null;
                ByteString byteString = null;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                InitializeChartApp initializeChartApp = null;
                SetTimeSpan setTimeSpan = null;
                SetInterval setInterval = null;
                SetChartSetting setChartSetting = null;
                OrderSubmittedEvent orderSubmittedEvent = null;
                OrderEditedEvent orderEditedEvent = null;
                OrderFailedToSubmitEvent orderFailedToSubmitEvent = null;
                SetIndicatorLegendCollapsed setIndicatorLegendCollapsed = null;
                AdvancedChartOpenedEvent advancedChartOpenedEvent = null;
                OrderFailedToEditEvent orderFailedToEditEvent = null;
                OrderCancelledEvent orderCancelledEvent = null;
                OrderFailedToCancelEvent orderFailedToCancelEvent = null;
                AdvancedChartClosedEvent advancedChartClosedEvent = null;
                ByteString byteString2 = null;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Object[] objArr5 = 0 == true ? 1 : 0;
                Object[] objArr6 = 0 == true ? 1 : 0;
                Object[] objArr7 = 0 == true ? 1 : 0;
                WebBlackWidowChartMessage webBlackWidowChartMessage = new WebBlackWidowChartMessage(initializeChartApp, setTimeSpan, setInterval, objArr5, setChartSetting, objArr7, objArr3, objArr6, new SetIndicatorTemplateAction(this.$template.getId(), new IndicatorTemplateAction(addIndicatorTemplateAction, deleteIndicatorTemplateAction, new RenameIndicatorTemplateAction(this.$name, null, 2, 0 == true ? 1 : 0), objArr, byteString, 27, null), objArr2, 4, null), objArr4, orderSubmittedEvent, orderEditedEvent, orderFailedToSubmitEvent, setIndicatorLegendCollapsed, advancedChartOpenedEvent, orderFailedToEditEvent, orderCancelledEvent, orderFailedToCancelEvent, advancedChartClosedEvent, byteString2, 1048319, null);
                this.label = 1;
                if (bwWebViewManager.sendMessage(webBlackWidowChartMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks
    public void renameTemplate(String name, TemplateDto template) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(template, "template");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C105591(template, name, null), 3, null);
    }
}
