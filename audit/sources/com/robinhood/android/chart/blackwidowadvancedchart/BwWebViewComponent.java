package com.robinhood.android.chart.blackwidowadvancedchart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import black_widow.contracts.mobile_app_chart.proto.p024v1.AdvancedChartClosedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.AdvancedChartOpenedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.AuthState;
import black_widow.contracts.mobile_app_chart.proto.p024v1.HapticDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.InitializeChartApp;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.MobileAppFeature;
import black_widow.contracts.mobile_app_chart.proto.p024v1.MobileBlackWidowChartMessageDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderCancelledEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderEditedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToCancelEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToEditEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderFailedToSubmitEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderPayloadDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.OrderSubmittedEvent;
import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetAccount;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartInstrumentDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSetting;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetChartSettingsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorLegendCollapsed;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorTemplateAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetIndicatorsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetInterval;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetMobileAppChartInitializedDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetMobileAppChartReadyDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.SetTimeSpan;
import black_widow.contracts.mobile_app_chart.proto.p024v1.StartChartApp;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanIntervalsDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TradingAccount;
import black_widow.contracts.mobile_app_chart.proto.p024v1.UpdateAuthState;
import black_widow.contracts.mobile_app_chart.proto.p024v1.WebBlackWidowChartMessage;
import black_widow_bff.model.p025v1.AppChannelDto;
import black_widow_bff.model.p025v1.MobileAppChartUpdateActionDto;
import black_widow_bff.service.p026v1.BlackWidowBffService;
import black_widow_bff.service.p026v1.MobileAppChartVersionRequestDto;
import black_widow_bff.service.p026v1.MobileAppChartVersionResponseDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManagerState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.CancelOrder;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartCursorPrice;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartTradeAction;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartTradeAction5;
import com.robinhood.android.chart.blackwidowadvancedchart.models.EditOrder;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SpanIntervalData;
import com.robinhood.android.chart.blackwidowadvancedchart.models.StartEditOrder;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SubmitOrder;
import com.robinhood.android.chart.blackwidowadvancedchart.models.YAxisLongPress;
import com.robinhood.android.chart.blackwidowadvancedchart.webclients.ChromeClient;
import com.robinhood.android.chart.blackwidowadvancedchart.webclients.ViewClient;
import com.robinhood.android.chart.sharedchartspan.SharedSpanService;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.trading.contracts.ExperimentsKt;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.buildconfig.BuildVariant;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.logging.TimberLogger;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.flow.internal.Combine;
import okio.ByteString;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: BwWebViewComponent.kt */
@Metadata(m3635d1 = {"\u0000à\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ½\u00012\u00020\u0001:\u0002½\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u008c\u0001\u001a\u00030\u008d\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010%H\u0007J\t\u0010\u0091\u0001\u001a\u00020@H\u0007J(\u0010\u0092\u0001\u001a\u00030\u008d\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010%H\u0087@¢\u0006\u0003\u0010\u0093\u0001J*\u0010\u0094\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0095\u0001\u001a\u00020%2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010%H\u0007J\u0011\u0010\u0096\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0097\u0001\u001a\u00020@J\u0013\u0010\u0098\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0099\u0001\u001a\u00020%H\u0007J\u001b\u0010\u009a\u0001\u001a\u00030\u008d\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0087@¢\u0006\u0003\u0010\u009d\u0001J\n\u0010\u009e\u0001\u001a\u00030\u008d\u0001H\u0002J\t\u0010\u009f\u0001\u001a\u00020%H\u0002J\u0013\u0010 \u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0095\u0001\u001a\u00020%H\u0007J3\u0010¡\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010^0k2\u001b\u0010¢\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0087\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0k0£\u0001H\u0002J\n\u0010¤\u0001\u001a\u00030\u008d\u0001H\u0007J\u0011\u0010¥\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0090\u0001\u001a\u00020%J\u001d\u0010¦\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u00012\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010%J\u0014\u0010¦\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0002J\u0011\u0010§\u0001\u001a\u00030\u008d\u00012\u0007\u0010¨\u0001\u001a\u00020yJ\u0011\u0010©\u0001\u001a\u00030\u008d\u00012\u0007\u0010ª\u0001\u001a\u00020&J\u0013\u0010«\u0001\u001a\u00030\u008d\u00012\u0007\u0010ª\u0001\u001a\u00020&H\u0002J\u0011\u0010¬\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00ad\u0001\u001a\u00020%J\u0011\u0010®\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00ad\u0001\u001a\u00020%J\u0012\u0010¯\u0001\u001a\u00030\u008d\u00012\b\u0010°\u0001\u001a\u00030±\u0001J\u0012\u0010²\u0001\u001a\u00030\u008d\u00012\b\u0010°\u0001\u001a\u00030³\u0001J\u0011\u0010´\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00ad\u0001\u001a\u00020%J\u0011\u0010µ\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u00ad\u0001\u001a\u00020%J\u0011\u0010¶\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0099\u0001\u001a\u00020\"J\u0011\u0010·\u0001\u001a\u00030\u008d\u0001H\u0086@¢\u0006\u0003\u0010¸\u0001J\n\u0010¹\u0001\u001a\u00030\u008d\u0001H\u0002J\n\u0010º\u0001\u001a\u00030\u008d\u0001H\u0002J\n\u0010»\u0001\u001a\u00030\u008d\u0001H\u0002J\n\u0010¼\u0001\u001a\u00030\u008d\u0001H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00104\u001a\u0002058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\"\u00108\u001a\b\u0012\u0004\u0012\u00020:098\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u000e\u0010?\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010B\u001a\n D*\u0004\u0018\u00010C0CX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020H0G¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020M0L¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020@0G¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010JR\u0019\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0G¢\u0006\b\n\u0000\u001a\u0004\bT\u0010JR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020@0G¢\u0006\b\n\u0000\u001a\u0004\bV\u0010JR\u0019\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0G¢\u0006\b\n\u0000\u001a\u0004\bY\u0010JR\u0019\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0G¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010JR\u001f\u0010]\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020_\u0018\u00010^0G¢\u0006\b\n\u0000\u001a\u0004\b`\u0010JR\u001f\u0010a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020b\u0018\u00010^0G¢\u0006\b\n\u0000\u001a\u0004\bc\u0010JR\u001f\u0010d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020e\u0018\u00010^0G¢\u0006\b\n\u0000\u001a\u0004\bf\u0010JR$\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0G8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u0010<\u001a\u0004\bi\u0010JR\u0019\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b0k¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020o0L¢\u0006\b\n\u0000\u001a\u0004\bp\u0010OR\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020r0L¢\u0006\b\n\u0000\u001a\u0004\bs\u0010OR\"\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010J\"\u0004\bv\u0010wR*\u0010x\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020y\u0018\u00010^0G8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bz\u0010<\u001a\u0004\b{\u0010JR*\u0010|\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020}\u0018\u00010^0G8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b~\u0010<\u001a\u0004\b\u007f\u0010JR'\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0G8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0081\u0001\u0010<\u001a\u0005\b\u0082\u0001\u0010JR'\u0010\u0083\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y0G8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0084\u0001\u0010<\u001a\u0005\b\u0085\u0001\u0010JR \u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010^0k¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010mR\u001a\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010k¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010m¨\u0006¾\u0001"}, m3636d2 = {"Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewComponent;", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "blackWidowBffService", "Lblack_widow_bff/service/v1/BlackWidowBffService;", "context", "Landroid/content/Context;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "webViewScope", "Lkotlinx/coroutines/CoroutineScope;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "sharedSpanService", "Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "cachedBwChartUrl", "Lcom/robinhood/prefs/StringPreference;", "cachedBwChartVersion", "cachedSpanInterval", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;Lblack_widow_bff/service/v1/BlackWidowBffService;Landroid/content/Context;Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/user/agent/UserAgentProvider;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/chart/sharedchartspan/SharedSpanService;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;)V", "blackWidowMobileMessageAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto;", "blackWidowWebMessageAdapter", "Lblack_widow/contracts/mobile_app_chart/proto/v1/WebBlackWidowChartMessage;", "spanIntervalCacheAdapter", "", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IntervalDto;", "spanIntervalCache", "getSpanIntervalCache", "()Ljava/util/Map;", "spanIntervalCache$delegate", "Lkotlin/Lazy;", "viewClient", "Lcom/robinhood/android/chart/blackwidowadvancedchart/webclients/ViewClient;", "chromeClient", "Lcom/robinhood/android/chart/blackwidowadvancedchart/webclients/ChromeClient;", "scarletContextWrapper", "Lcom/robinhood/scarlet/ScarletContextWrapper;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "onLoadedActions", "Lkotlin/collections/ArrayDeque;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/OnLoadAction;", "getOnLoadedActions$annotations", "()V", "getOnLoadedActions", "()Lkotlin/collections/ArrayDeque;", "webviewPreloaded", "", "chartOpenMetricStarted", "performanceLoggingContextualId", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "webViewAuthToken", "webViewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "getWebViewState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "chartTradeActions", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/ChartTradeAction;", "getChartTradeActions", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "webViewVersionUnsupported", "getWebViewVersionUnsupported", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "getQuote", "scrubMode", "getScrubMode", "chartSettings", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettingsDto;", "getChartSettings", "availableIndicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorsDto;", "getAvailableIndicators", "currentIndicators", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "getCurrentIndicators", "availableIndicatorTemplates", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;", "getAvailableIndicatorTemplates", "availableColorPickerColors", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getAvailableColorPickerColors", "activeTemplateId", "getActiveTemplateId$annotations", "getActiveTemplateId", "activeTemplate", "Lkotlinx/coroutines/flow/Flow;", "getActiveTemplate", "()Lkotlinx/coroutines/flow/Flow;", "onYAxisLongPress", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/YAxisLongPress;", "getOnYAxisLongPress", "hapticEvents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticDto;", "getHapticEvents", "currentChartUrl", "getCurrentChartUrl", "setCurrentChartUrl", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "availableTimeSpans", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "getAvailableTimeSpans$annotations", "getAvailableTimeSpans", "availableIntervals", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanIntervalsDto;", "getAvailableIntervals$annotations", "getAvailableIntervals", "currentInterval", "getCurrentInterval$annotations", "getCurrentInterval", "currentTimeSpan", "getCurrentTimeSpan$annotations", "getCurrentTimeSpan", "chartFeatures", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileAppFeature;", "getChartFeatures", "spanIntervalData", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;", "getSpanIntervalData", "initializeWebView", "", "instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;", "accountNumber", "isChromiumVersionSupported", "getChartVersionAndHandleAction", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrumentDto$InstrumentDto;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeWebViewWithUrl", "chartUrl", "setWebViewTheme", "isDay", "handleMessage", "message", "processMessage", "parsedMessage", "Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessageDto$DataDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleOnLoadActions", "getWebViewAuthToken", "initializeChartApp", "featuresToExperiment", "featureMap", "", "updateAuthToken", "setAccountNumber", "setChartInstrument", "setChartSpan", "timeSpan", "setChartInterval", "interval", "updateSpanIntervalCache", "notifyOrderFailedToSubmit", "refId", "notifyOrderFailedToEdit", "notifyOrderEditSuccess", "event", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;", "notifyOrderSubmitSuccess", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderSubmittedEvent;", "notifyOrderCanceled", "notifyOrderFailedToCancel", "sendMessage", "destroyWebView", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logWebViewPreloadStart", "logWebviewLoadComplete", "logWebViewOpen", "logWebViewPreloadAbort", "Companion", "lib-black-widow-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BwWebViewComponent {
    private static final String JAVASCRIPT_INTERFACE_NAME = "androidClient";
    public static final String RUNTIME_BRIDGE_SCRIPT = "javascript:function blackWidowMobileAppHandleMessage(message) { \n           androidClient.handleMessage(message);\n        }";
    private final Flow<TemplateDto> activeTemplate;
    private final StateFlow2<String> activeTemplateId;
    private final AuthManager authManager;
    private final AuthTokenManager authTokenManager;
    private final StateFlow2<List<ThemedColorDto>> availableColorPickerColors;
    private final StateFlow2<List<TemplateDto>> availableIndicatorTemplates;
    private final StateFlow2<SetIndicatorsDto> availableIndicators;
    private final StateFlow2<List<TimeSpanIntervalsDto>> availableIntervals;
    private final StateFlow2<List<TimeSpanDto>> availableTimeSpans;
    private final BlackWidowBffService blackWidowBffService;
    private final JsonAdapter<MobileBlackWidowChartMessageDto> blackWidowMobileMessageAdapter;
    private final JsonAdapter<WebBlackWidowChartMessage> blackWidowWebMessageAdapter;
    private final StringPreference cachedBwChartUrl;
    private final StringPreference cachedBwChartVersion;
    private final StringPreference cachedSpanInterval;
    private final Flow<List<MobileAppFeature>> chartFeatures;
    private boolean chartOpenMetricStarted;
    private final StateFlow2<SetChartSettingsDto> chartSettings;
    private final SharedFlow2<ChartTradeAction> chartTradeActions;
    private final ChromeClient chromeClient;
    private final ColorSchemeManager colorSchemeManager;
    private final Context context;
    private StateFlow2<String> currentChartUrl;
    private final StateFlow2<List<IndicatorStateDto>> currentIndicators;
    private final StateFlow2<IntervalDto> currentInterval;
    private final StateFlow2<TimeSpanDto> currentTimeSpan;
    private final ExperimentsStore experimentsStore;
    private final SharedFlow2<HapticDto> hapticEvents;
    private final ArrayDeque<OnLoadAction> onLoadedActions;
    private final SharedFlow2<YAxisLongPress> onYAxisLongPress;
    private final PerformanceLogger performanceLogger;
    private final UUID performanceLoggingContextualId;
    private final StateFlow2<QuoteDto> quote;
    private final ScarletContextWrapper scarletContextWrapper;
    private final ScarletManager scarletManager;
    private final StateFlow2<Boolean> scrubMode;
    private final SharedSpanService sharedSpanService;

    /* renamed from: spanIntervalCache$delegate, reason: from kotlin metadata */
    private final Lazy spanIntervalCache;
    private final JsonAdapter<Map<String, IntervalDto>> spanIntervalCacheAdapter;
    private final Flow<SpanIntervalData> spanIntervalData;
    private final UserAgentProvider userAgentProvider;
    private final ViewClient viewClient;

    @SuppressLint({"SetJavaScriptEnabled"})
    private final WebView webView;
    private String webViewAuthToken;
    private final CoroutineScope webViewScope;
    private final StateFlow2<BwWebViewManagerState> webViewState;
    private final StateFlow2<Boolean> webViewVersionUnsupported;
    private boolean webviewPreloaded;
    public static final int $stable = 8;

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[MobileAppChartUpdateActionDto.values().length];
            try {
                iArr2[MobileAppChartUpdateActionDto.UPDATE_IMMEDIATELY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MobileAppChartUpdateActionDto.UPDATE_NEXT_RESTART.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[MobileAppChartUpdateActionDto.MOBILE_APP_CHART_UPDATE_ACTION_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MobileAppChartUpdateActionDto.NO_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent", m3645f = "BwWebViewComponent.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m3647m = "getChartVersionAndHandleAction")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$getChartVersionAndHandleAction$1 */
    static final class C105871 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C105871(Continuation<? super C105871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BwWebViewComponent.this.getChartVersionAndHandleAction(null, null, this);
        }
    }

    public static /* synthetic */ void getActiveTemplateId$annotations() {
    }

    public static /* synthetic */ void getAvailableIntervals$annotations() {
    }

    public static /* synthetic */ void getAvailableTimeSpans$annotations() {
    }

    public static /* synthetic */ void getCurrentInterval$annotations() {
    }

    public static /* synthetic */ void getCurrentTimeSpan$annotations() {
    }

    public static /* synthetic */ void getOnLoadedActions$annotations() {
    }

    public BwWebViewComponent(LazyMoshi moshi, BlackWidowBffService blackWidowBffService, Context context, AuthTokenManager authTokenManager, AuthManager authManager, UserAgentProvider userAgentProvider, CoroutineScope webViewScope, ColorSchemeManager colorSchemeManager, ExperimentsStore experimentsStore, SharedSpanService sharedSpanService, PerformanceLogger performanceLogger, @BwChartPrefModule2 StringPreference cachedBwChartUrl, @BwChartPrefModule3 StringPreference cachedBwChartVersion, @BwChartPrefModule5 StringPreference cachedSpanInterval) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(blackWidowBffService, "blackWidowBffService");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(webViewScope, "webViewScope");
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(sharedSpanService, "sharedSpanService");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(cachedBwChartUrl, "cachedBwChartUrl");
        Intrinsics.checkNotNullParameter(cachedBwChartVersion, "cachedBwChartVersion");
        Intrinsics.checkNotNullParameter(cachedSpanInterval, "cachedSpanInterval");
        this.blackWidowBffService = blackWidowBffService;
        this.context = context;
        this.authTokenManager = authTokenManager;
        this.authManager = authManager;
        this.userAgentProvider = userAgentProvider;
        this.webViewScope = webViewScope;
        this.colorSchemeManager = colorSchemeManager;
        this.experimentsStore = experimentsStore;
        this.sharedSpanService = sharedSpanService;
        this.performanceLogger = performanceLogger;
        this.cachedBwChartUrl = cachedBwChartUrl;
        this.cachedBwChartVersion = cachedBwChartVersion;
        this.cachedSpanInterval = cachedSpanInterval;
        Types types = Types.INSTANCE;
        this.blackWidowMobileMessageAdapter = moshi.adapter(new TypeToken<MobileBlackWidowChartMessageDto>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$special$$inlined$getAdapter$1
        }.getType());
        this.blackWidowWebMessageAdapter = moshi.adapter(new TypeToken<WebBlackWidowChartMessage>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$special$$inlined$getAdapter$2
        }.getType());
        this.spanIntervalCacheAdapter = moshi.adapter(new TypeToken<Map<String, IntervalDto>>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$special$$inlined$getAdapter$3
        }.getType());
        this.spanIntervalCache = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BwWebViewComponent.spanIntervalCache_delegate$lambda$1(this.f$0);
            }
        });
        ViewClient viewClient = new ViewClient(context, experimentsStore, new BwWebViewComponent5(this), cachedBwChartVersion, webViewScope);
        this.viewClient = viewClient;
        ChromeClient chromeClient = new ChromeClient();
        this.chromeClient = chromeClient;
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        this.scarletContextWrapper = scarletContextWrapper;
        this.scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper);
        WebView webView = new WebView(scarletContextWrapper);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(viewClient);
        webView.setWebChromeClient(chromeClient);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        this.webView = webView;
        this.onLoadedActions = new ArrayDeque<>();
        this.performanceLoggingContextualId = UUID.randomUUID();
        this.webViewState = StateFlow4.MutableStateFlow(BwWebViewManagerState.Stopped.INSTANCE);
        this.chartTradeActions = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        Boolean bool = Boolean.FALSE;
        this.webViewVersionUnsupported = StateFlow4.MutableStateFlow(bool);
        this.quote = StateFlow4.MutableStateFlow(null);
        this.scrubMode = StateFlow4.MutableStateFlow(bool);
        this.chartSettings = StateFlow4.MutableStateFlow(null);
        this.availableIndicators = StateFlow4.MutableStateFlow(null);
        this.currentIndicators = StateFlow4.MutableStateFlow(null);
        StateFlow2<List<TemplateDto>> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this.availableIndicatorTemplates = stateFlow2MutableStateFlow;
        this.availableColorPickerColors = StateFlow4.MutableStateFlow(null);
        StateFlow2<String> stateFlow2MutableStateFlow2 = StateFlow4.MutableStateFlow(null);
        this.activeTemplateId = stateFlow2MutableStateFlow2;
        this.activeTemplate = FlowKt.distinctUntilChanged(FlowKt.flowCombine(stateFlow2MutableStateFlow, stateFlow2MutableStateFlow2, new BwWebViewComponent2(null)));
        this.onYAxisLongPress = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.hapticEvents = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.currentChartUrl = StateFlow4.MutableStateFlow(null);
        StateFlow2<List<TimeSpanDto>> stateFlow2MutableStateFlow3 = StateFlow4.MutableStateFlow(null);
        this.availableTimeSpans = stateFlow2MutableStateFlow3;
        StateFlow2<List<TimeSpanIntervalsDto>> stateFlow2MutableStateFlow4 = StateFlow4.MutableStateFlow(null);
        this.availableIntervals = stateFlow2MutableStateFlow4;
        StateFlow2<IntervalDto> stateFlow2MutableStateFlow5 = StateFlow4.MutableStateFlow(null);
        this.currentInterval = stateFlow2MutableStateFlow5;
        StateFlow2<TimeSpanDto> stateFlow2MutableStateFlow6 = StateFlow4.MutableStateFlow(null);
        this.currentTimeSpan = stateFlow2MutableStateFlow6;
        this.chartFeatures = featuresToExperiment(MapsKt.mapOf(Tuples4.m3642to(MobileAppFeature.MOBILE_APP_FEATURE_SCROLLING_INTERVAL_PICKER, ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, new Experiment[]{BlackWidowAdvancedChartScrollingIntervalPicker.INSTANCE}, false, null, 6, null)), Tuples4.m3642to(MobileAppFeature.MOBILE_APP_FEATURE_EQUITIES_TRADING, ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, new Experiment[]{AdvancedChartEquityTrading.INSTANCE}, false, null, 6, null)), Tuples4.m3642to(MobileAppFeature.MOBILE_APP_FEATURE_EQUITIES_SHORTING, FlowKt.combine(ExperimentsKt.isShortingEnabled$default(experimentsStore, false, 1, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, new Experiment[]{EquitiesMacShorting.INSTANCE}, false, null, 6, null), new BwWebViewComponent3(null))), Tuples4.m3642to(MobileAppFeature.MOBILE_APP_FEATURE_LOADING_SKELETON, ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, new Experiment[]{BlackWidowAdvancedChartLoadingSkeleton.INSTANCE}, false, null, 6, null))));
        Flow flowFilterNotNull = FlowKt.filterNotNull(stateFlow2MutableStateFlow6);
        Flow flowFilterNotNull2 = FlowKt.filterNotNull(stateFlow2MutableStateFlow5);
        Flow flowFilterNotNull3 = FlowKt.filterNotNull(stateFlow2MutableStateFlow3);
        final Flow flowFilterNotNull4 = FlowKt.filterNotNull(stateFlow2MutableStateFlow4);
        this.spanIntervalData = FlowKt.filterNotNull(FlowKt.combine(flowFilterNotNull, flowFilterNotNull2, flowFilterNotNull3, new Flow<Map<String, ? extends List<? extends IntervalDto>>>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<String, ? extends List<? extends IntervalDto>>> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull4.collect(new C105832(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$special$$inlined$map$1$2 */
            public static final class C105832<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$special$$inlined$map$1$2", m3645f = "BwWebViewComponent.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C105832.this.emit(null, this);
                    }
                }

                public C105832(FlowCollector flowCollector) {
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
                        List<TimeSpanIntervalsDto> list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (TimeSpanIntervalsDto timeSpanIntervalsDto : list) {
                            TimeSpanDto span = timeSpanIntervalsDto.getSpan();
                            Tuples2 tuples2M3642to = Tuples4.m3642to(span != null ? span.getId() : null, timeSpanIntervalsDto.getIntervals());
                            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
        }, new BwWebViewComponent4(this, null)));
        BuildersKt__Builders_commonKt.launch$default(webViewScope, null, null, new C105841(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(webViewScope, Dispatchers.getDefault(), null, new C105852(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, IntervalDto> getSpanIntervalCache() {
        return (Map) this.spanIntervalCache.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map spanIntervalCache_delegate$lambda$1(BwWebViewComponent bwWebViewComponent) {
        Map<String, IntervalDto> mapFromJson;
        String str = bwWebViewComponent.cachedSpanInterval.get();
        return (str == null || (mapFromJson = bwWebViewComponent.spanIntervalCacheAdapter.fromJson(str)) == null) ? new LinkedHashMap() : mapFromJson;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final ArrayDeque<OnLoadAction> getOnLoadedActions() {
        return this.onLoadedActions;
    }

    public final StateFlow2<BwWebViewManagerState> getWebViewState() {
        return this.webViewState;
    }

    public final SharedFlow2<ChartTradeAction> getChartTradeActions() {
        return this.chartTradeActions;
    }

    public final StateFlow2<Boolean> getWebViewVersionUnsupported() {
        return this.webViewVersionUnsupported;
    }

    public final StateFlow2<QuoteDto> getQuote() {
        return this.quote;
    }

    public final StateFlow2<Boolean> getScrubMode() {
        return this.scrubMode;
    }

    public final StateFlow2<SetChartSettingsDto> getChartSettings() {
        return this.chartSettings;
    }

    public final StateFlow2<SetIndicatorsDto> getAvailableIndicators() {
        return this.availableIndicators;
    }

    public final StateFlow2<List<IndicatorStateDto>> getCurrentIndicators() {
        return this.currentIndicators;
    }

    public final StateFlow2<List<TemplateDto>> getAvailableIndicatorTemplates() {
        return this.availableIndicatorTemplates;
    }

    public final StateFlow2<List<ThemedColorDto>> getAvailableColorPickerColors() {
        return this.availableColorPickerColors;
    }

    public final StateFlow2<String> getActiveTemplateId() {
        return this.activeTemplateId;
    }

    public final Flow<TemplateDto> getActiveTemplate() {
        return this.activeTemplate;
    }

    public final SharedFlow2<YAxisLongPress> getOnYAxisLongPress() {
        return this.onYAxisLongPress;
    }

    public final SharedFlow2<HapticDto> getHapticEvents() {
        return this.hapticEvents;
    }

    public final StateFlow2<String> getCurrentChartUrl() {
        return this.currentChartUrl;
    }

    public final void setCurrentChartUrl(StateFlow2<String> stateFlow2) {
        Intrinsics.checkNotNullParameter(stateFlow2, "<set-?>");
        this.currentChartUrl = stateFlow2;
    }

    public final StateFlow2<List<TimeSpanDto>> getAvailableTimeSpans() {
        return this.availableTimeSpans;
    }

    public final StateFlow2<List<TimeSpanIntervalsDto>> getAvailableIntervals() {
        return this.availableIntervals;
    }

    public final StateFlow2<IntervalDto> getCurrentInterval() {
        return this.currentInterval;
    }

    public final StateFlow2<TimeSpanDto> getCurrentTimeSpan() {
        return this.currentTimeSpan;
    }

    public final Flow<List<MobileAppFeature>> getChartFeatures() {
        return this.chartFeatures;
    }

    public final Flow<SpanIntervalData> getSpanIntervalData() {
        return this.spanIntervalData;
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$1", m3645f = "BwWebViewComponent.kt", m3646l = {255}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$1 */
    static final class C105841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C105841(Continuation<? super C105841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewComponent.this.getWebView().addJavascriptInterface(BwWebViewComponent.this, BwWebViewComponent.JAVASCRIPT_INTERFACE_NAME);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(BwWebViewComponent.this.experimentsStore, new Experiment[]{BlackWidowAdvancedChartPreloadKillSwitch.INSTANCE}, false, null, 6, null);
                final BwWebViewComponent bwWebViewComponent = BwWebViewComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (!z) {
                            bwWebViewComponent.logWebViewPreloadStart();
                            bwWebViewComponent.initializeWebView(null, null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowStreamStateFlow$default.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$2", m3645f = "BwWebViewComponent.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$2 */
    static final class C105852 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C105852(Continuation<? super C105852> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105852(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105852) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(BwWebViewComponent.this.getWebViewState(), BwWebViewComponent.this.getAvailableTimeSpans(), BwWebViewComponent.this.sharedSpanService.streamSpanStringWithReplay(), new AnonymousClass1(null)));
                final BwWebViewComponent bwWebViewComponent = BwWebViewComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((TimeSpanDto) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(TimeSpanDto timeSpanDto, Continuation<? super Unit> continuation) {
                        if (timeSpanDto != null) {
                            bwWebViewComponent.setChartSpan(timeSpanDto);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: BwWebViewComponent.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, m3636d2 = {"<anonymous>", "Lblack_widow/contracts/mobile_app_chart/proto/v1/TimeSpanDto;", "state", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManagerState;", "availableSpans", "", "spanString", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$2$1", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<BwWebViewManagerState, List<? extends TimeSpanDto>, String, Continuation<? super TimeSpanDto>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(BwWebViewManagerState bwWebViewManagerState, List<TimeSpanDto> list, String str, Continuation<? super TimeSpanDto> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = bwWebViewManagerState;
                anonymousClass1.L$1 = list;
                anonymousClass1.L$2 = str;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(BwWebViewManagerState bwWebViewManagerState, List<? extends TimeSpanDto> list, String str, Continuation<? super TimeSpanDto> continuation) {
                return invoke2(bwWebViewManagerState, (List<TimeSpanDto>) list, str, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                List list;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BwWebViewManagerState bwWebViewManagerState = (BwWebViewManagerState) this.L$0;
                List list2 = (List) this.L$1;
                String str = (String) this.L$2;
                Object obj2 = null;
                if (!(bwWebViewManagerState instanceof BwWebViewManagerState.ChartAppStarted) || (list = list2) == null || list.isEmpty()) {
                    return null;
                }
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.areEqual(((TimeSpanDto) next).getId(), str)) {
                        obj2 = next;
                        break;
                    }
                }
                return (TimeSpanDto) obj2;
            }
        }
    }

    public final void initializeWebView(SetChartInstrumentDto.InstrumentDto instrument, String accountNumber) {
        Boolean value;
        try {
            if (isChromiumVersionSupported()) {
                String str = this.cachedBwChartUrl.get();
                if (str != null) {
                    initializeWebViewWithUrl(str, instrument, accountNumber);
                }
                BuildersKt__Builders_commonKt.launch$default(this.webViewScope, Dispatchers.getIO(), null, new C105902(instrument, accountNumber, null), 2, null);
                return;
            }
            StateFlow2<Boolean> stateFlow2 = this.webViewVersionUnsupported;
            do {
                value = stateFlow2.getValue();
                value.getClass();
            } while (!stateFlow2.compareAndSet(value, Boolean.TRUE));
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Throwable("[MAC] Webview version get failed: " + e.getMessage()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
            StateFlow2<BwWebViewManagerState> stateFlow22 = this.webViewState;
            while (!stateFlow22.compareAndSet(stateFlow22.getValue(), BwWebViewManagerState.Error.INSTANCE)) {
            }
        }
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$initializeWebView$2", m3645f = "BwWebViewComponent.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$initializeWebView$2 */
    static final class C105902 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ SetChartInstrumentDto.InstrumentDto $instrument;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105902(SetChartInstrumentDto.InstrumentDto instrumentDto, String str, Continuation<? super C105902> continuation) {
            super(2, continuation);
            this.$instrument = instrumentDto;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105902(this.$instrument, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105902) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BwWebViewComponent bwWebViewComponent = BwWebViewComponent.this;
                SetChartInstrumentDto.InstrumentDto instrumentDto = this.$instrument;
                String str = this.$accountNumber;
                this.label = 1;
                if (bwWebViewComponent.getChartVersionAndHandleAction(instrumentDto, str, this) == coroutine_suspended) {
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

    public final boolean isChromiumVersionSupported() {
        String str;
        List listSplit$default;
        String str2;
        PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(this.context);
        Integer intOrNull = (currentWebViewPackage == null || (str = currentWebViewPackage.versionName) == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null)) == null || (str2 = (String) listSplit$default.get(0)) == null) ? null : StringsKt.toIntOrNull(str2);
        return intOrNull != null && intOrNull.intValue() >= 111;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getChartVersionAndHandleAction(SetChartInstrumentDto.InstrumentDto instrumentDto, String str, Continuation<? super Unit> continuation) {
        C105871 c105871;
        AppChannelDto appChannelDto;
        if (continuation instanceof C105871) {
            c105871 = (C105871) continuation;
            int i = c105871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105871.label = i - Integer.MIN_VALUE;
            } else {
                c105871 = new C105871(continuation);
            }
        }
        Object objMobileAppChartVersion = c105871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c105871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMobileAppChartVersion);
            BlackWidowBffService blackWidowBffService = this.blackWidowBffService;
            int i3 = WhenMappings.$EnumSwitchMapping$0[BuildVariant.INSTANCE.compute().ordinal()];
            if (i3 == 1 || i3 == 2) {
                appChannelDto = AppChannelDto.ANDROID_APP_DEV;
            } else if (i3 == 3) {
                appChannelDto = AppChannelDto.ANDROID_APP_NIGHTLY;
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                appChannelDto = AppChannelDto.ANDROID_APP_PROD;
            }
            MobileAppChartVersionRequestDto mobileAppChartVersionRequestDto = new MobileAppChartVersionRequestDto(appChannelDto, this.cachedBwChartVersion.get());
            c105871.L$0 = instrumentDto;
            c105871.L$1 = str;
            c105871.label = 1;
            objMobileAppChartVersion = blackWidowBffService.MobileAppChartVersion(mobileAppChartVersionRequestDto, c105871);
            if (objMobileAppChartVersion == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c105871.L$1;
            instrumentDto = (SetChartInstrumentDto.InstrumentDto) c105871.L$0;
            ResultKt.throwOnFailure(objMobileAppChartVersion);
        }
        MobileAppChartVersionResponseDto mobileAppChartVersionResponseDto = (MobileAppChartVersionResponseDto) objMobileAppChartVersion;
        int i4 = WhenMappings.$EnumSwitchMapping$1[mobileAppChartVersionResponseDto.getAction().ordinal()];
        if (i4 == 1) {
            this.cachedBwChartUrl.set(mobileAppChartVersionResponseDto.getChart_url());
            this.cachedBwChartVersion.set(mobileAppChartVersionResponseDto.getChart_version());
            initializeWebViewWithUrl(mobileAppChartVersionResponseDto.getChart_url(), instrumentDto, str);
        } else if (i4 == 2) {
            if (this.cachedBwChartUrl.get() == null) {
                initializeWebViewWithUrl(mobileAppChartVersionResponseDto.getChart_url(), instrumentDto, str);
            }
            this.cachedBwChartUrl.set(mobileAppChartVersionResponseDto.getChart_url());
            this.cachedBwChartVersion.set(mobileAppChartVersionResponseDto.getChart_version());
        } else {
            if (i4 != 3 && i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.cachedBwChartUrl.get() == null) {
                initializeWebViewWithUrl(mobileAppChartVersionResponseDto.getChart_url(), instrumentDto, str);
            }
        }
        return Unit.INSTANCE;
    }

    public final void initializeWebViewWithUrl(String chartUrl, SetChartInstrumentDto.InstrumentDto instrument, String accountNumber) {
        Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
        StateFlow2<String> stateFlow2 = this.currentChartUrl;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), chartUrl)) {
        }
        StateFlow2<BwWebViewManagerState> stateFlow22 = this.webViewState;
        while (!stateFlow22.compareAndSet(stateFlow22.getValue(), new BwWebViewManagerState.InitializingWebView(chartUrl, instrument, accountNumber))) {
        }
        BuildersKt__Builders_commonKt.launch$default(this.webViewScope, null, null, new C105913(chartUrl, null), 3, null);
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$initializeWebViewWithUrl$3", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$initializeWebViewWithUrl$3 */
    static final class C105913 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chartUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105913(String str, Continuation<? super C105913> continuation) {
            super(2, continuation);
            this.$chartUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105913(this.$chartUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105913) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BwWebViewComponent.this.getWebView().loadUrl(this.$chartUrl);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$setWebViewTheme$1", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$setWebViewTheme$1 */
    static final class C105941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isDay;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105941(boolean z, Continuation<? super C105941> continuation) {
            super(2, continuation);
            this.$isDay = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105941(this.$isDay, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ScarletOverlay scarletOverlay2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ScarletManager scarletManager = BwWebViewComponent.this.scarletManager;
                if (this.$isDay) {
                    scarletOverlay2 = new ScarletOverlay3();
                } else {
                    scarletOverlay2 = new ScarletOverlay2();
                }
                ScarletManager.putOverlay$default(scarletManager, scarletOverlay2, null, 2, null);
                BwWebViewComponent.this.getWebView().dispatchConfigurationChanged(new Configuration());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void setWebViewTheme(boolean isDay) {
        BuildersKt__Builders_commonKt.launch$default(this.webViewScope, null, null, new C105941(isDay, null), 3, null);
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$handleMessage$1", m3645f = "BwWebViewComponent.kt", m3646l = {398}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$handleMessage$1 */
    static final class C105881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105881(String str, Continuation<? super C105881> continuation) {
            super(2, continuation);
            this.$message = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105881(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            MobileBlackWidowChartMessageDto.DataDto data;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MobileBlackWidowChartMessageDto mobileBlackWidowChartMessageDto = (MobileBlackWidowChartMessageDto) BwWebViewComponent.this.blackWidowMobileMessageAdapter.fromJson(this.$message);
                    if (mobileBlackWidowChartMessageDto != null && (data = mobileBlackWidowChartMessageDto.getData()) != null) {
                        BwWebViewComponent bwWebViewComponent = BwWebViewComponent.this;
                        if ((data instanceof MobileBlackWidowChartMessageDto.DataDto.SetMobileAppChartInitialized) || (data instanceof MobileBlackWidowChartMessageDto.DataDto.SetMobileAppChartReady)) {
                            TimberLogger.INSTANCE.mo1679d("BlackWidowWebView: " + data, new Object[0]);
                        }
                        this.label = 1;
                        if (bwWebViewComponent.processMessage(data, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                TimberLogger.INSTANCE.mo1679d("BlackWidowWebView: Error handling message: " + e.getMessage(), new Object[0]);
                StateFlow2<BwWebViewManagerState> webViewState = BwWebViewComponent.this.getWebViewState();
                while (!webViewState.compareAndSet(webViewState.getValue(), BwWebViewManagerState.Error.INSTANCE)) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    @JavascriptInterface
    public final void handleMessage(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(this.webViewScope, Dispatchers.getIO(), null, new C105881(message, null), 2, null);
    }

    public final Object processMessage(MobileBlackWidowChartMessageDto.DataDto dataDto, Continuation<? super Unit> continuation) {
        OrderPayloadDto.OrderDto order;
        Object objEmit;
        Boolean value;
        if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetAvailableTimeSpans) {
            StateFlow2<List<TimeSpanDto>> stateFlow2 = this.availableTimeSpans;
            while (!stateFlow2.compareAndSet(stateFlow2.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetAvailableTimeSpans) dataDto).getValue().getSpans())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetChartSettings) {
            StateFlow2<SetChartSettingsDto> stateFlow22 = this.chartSettings;
            while (!stateFlow22.compareAndSet(stateFlow22.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetChartSettings) dataDto).getValue())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetInterval) {
            StateFlow2<IntervalDto> stateFlow23 = this.currentInterval;
            while (!stateFlow23.compareAndSet(stateFlow23.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetInterval) dataDto).getValue().getInterval())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetIntervals) {
            StateFlow2<List<TimeSpanIntervalsDto>> stateFlow24 = this.availableIntervals;
            while (!stateFlow24.compareAndSet(stateFlow24.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetIntervals) dataDto).getValue().getIntervals())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetQuote) {
            StateFlow2<QuoteDto> stateFlow25 = this.quote;
            while (!stateFlow25.compareAndSet(stateFlow25.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetQuote) dataDto).getValue().getQuote())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetScrubMode) {
            StateFlow2<Boolean> stateFlow26 = this.scrubMode;
            do {
                value = stateFlow26.getValue();
                value.getClass();
            } while (!stateFlow26.compareAndSet(value, boxing.boxBoolean(((MobileBlackWidowChartMessageDto.DataDto.SetScrubMode) dataDto).getValue().getScrub_mode())));
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetTimeSpan) {
            StateFlow2<TimeSpanDto> stateFlow27 = this.currentTimeSpan;
            while (!stateFlow27.compareAndSet(stateFlow27.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetTimeSpan) dataDto).getValue().getSpan())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetIndicators) {
            StateFlow2<SetIndicatorsDto> stateFlow28 = this.availableIndicators;
            while (!stateFlow28.compareAndSet(stateFlow28.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetIndicators) dataDto).getValue())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetAddedIndicators) {
            StateFlow2<List<IndicatorStateDto>> stateFlow29 = this.currentIndicators;
            while (!stateFlow29.compareAndSet(stateFlow29.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetAddedIndicators) dataDto).getValue().getAdded_indicators())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetIndicatorTemplates) {
            StateFlow2<List<TemplateDto>> stateFlow210 = this.availableIndicatorTemplates;
            while (!stateFlow210.compareAndSet(stateFlow210.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetIndicatorTemplates) dataDto).getValue().getTemplates())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetColorPickerColors) {
            StateFlow2<List<ThemedColorDto>> stateFlow211 = this.availableColorPickerColors;
            while (!stateFlow211.compareAndSet(stateFlow211.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetColorPickerColors) dataDto).getValue().getColors())) {
            }
        } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetActiveIndicatorTemplateId) {
            StateFlow2<String> stateFlow212 = this.activeTemplateId;
            while (!stateFlow212.compareAndSet(stateFlow212.getValue(), ((MobileBlackWidowChartMessageDto.DataDto.SetActiveIndicatorTemplateId) dataDto).getValue().getTemplate_id())) {
            }
        } else {
            if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.PerformHaptic) {
                Object objEmit2 = this.hapticEvents.emit(((MobileBlackWidowChartMessageDto.DataDto.PerformHaptic) dataDto).getValue(), continuation);
                return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
            }
            if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.RefreshAuthState) {
                updateAuthToken();
            } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.NotifyFatalError) {
                StateFlow2<BwWebViewManagerState> stateFlow213 = this.webViewState;
                while (!stateFlow213.compareAndSet(stateFlow213.getValue(), BwWebViewManagerState.Error.INSTANCE)) {
                }
            } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.ReloadApp) {
                BuildersKt__Builders_commonKt.launch$default(this.webViewScope, null, null, new C1059215(null), 3, null);
            } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SubmitOrder) {
                MobileBlackWidowChartMessageDto.DataDto.SubmitOrder submitOrder = (MobileBlackWidowChartMessageDto.DataDto.SubmitOrder) dataDto;
                OrderPayloadDto order2 = submitOrder.getValue().getOrder();
                if (order2 != null && (order = order2.getOrder()) != null && (objEmit = this.chartTradeActions.emit(new SubmitOrder(submitOrder.getValue().getRef_id(), order), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objEmit;
                }
            } else {
                if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.EditOrder) {
                    MobileBlackWidowChartMessageDto.DataDto.EditOrder editOrder = (MobileBlackWidowChartMessageDto.DataDto.EditOrder) dataDto;
                    Object objEmit3 = this.chartTradeActions.emit(new EditOrder(editOrder.getValue().getRef_id(), editOrder.getValue().getOrder_id(), editOrder.getValue().getUpdated_price()), continuation);
                    return objEmit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit3 : Unit.INSTANCE;
                }
                if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.StartEditOrder) {
                    Object objEmit4 = this.chartTradeActions.emit(new StartEditOrder(((MobileBlackWidowChartMessageDto.DataDto.StartEditOrder) dataDto).getValue().getOrder_id()), continuation);
                    return objEmit4 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit4 : Unit.INSTANCE;
                }
                if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.OpenOptionsChainEvent) {
                    Object objEmit5 = this.chartTradeActions.emit(ChartTradeAction5.INSTANCE, continuation);
                    return objEmit5 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit5 : Unit.INSTANCE;
                }
                if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.PriceRowShown) {
                    Object objEmit6 = this.chartTradeActions.emit(new ChartCursorPrice(((MobileBlackWidowChartMessageDto.DataDto.PriceRowShown) dataDto).getValue().getPrice()), continuation);
                    return objEmit6 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit6 : Unit.INSTANCE;
                }
                if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.PriceRowHidden) {
                    Object objEmit7 = this.chartTradeActions.emit(new ChartCursorPrice(null), continuation);
                    return objEmit7 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit7 : Unit.INSTANCE;
                }
                if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.CancelOrder) {
                    MobileBlackWidowChartMessageDto.DataDto.CancelOrder cancelOrder = (MobileBlackWidowChartMessageDto.DataDto.CancelOrder) dataDto;
                    Object objEmit8 = this.chartTradeActions.emit(new CancelOrder(cancelOrder.getValue().getRef_id(), cancelOrder.getValue().getOrder_id()), continuation);
                    return objEmit8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit8 : Unit.INSTANCE;
                }
                if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.YAxisLongPressEvent) {
                    Object objEmit9 = this.onYAxisLongPress.emit(YAxisLongPress.INSTANCE, continuation);
                    return objEmit9 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit9 : Unit.INSTANCE;
                }
                if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetMobileAppChartInitialized) {
                    SetMobileAppChartInitializedDto value2 = ((MobileBlackWidowChartMessageDto.DataDto.SetMobileAppChartInitialized) dataDto).getValue();
                    if (value2.getHas_failed()) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("[MAC] Chart app failed to initialize: " + value2.getError_message()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
                        StateFlow2<BwWebViewManagerState> stateFlow214 = this.webViewState;
                        while (!stateFlow214.compareAndSet(stateFlow214.getValue(), BwWebViewManagerState.Error.INSTANCE)) {
                        }
                        this.viewClient.deleteFileCacheIfExists();
                        return Unit.INSTANCE;
                    }
                    BwWebViewManagerState value3 = this.webViewState.getValue();
                    SetChartInstrumentDto.InstrumentDto instrument = value3.getInstrument();
                    String chartUrl = value3.getChartUrl();
                    if (chartUrl != null) {
                        StateFlow2<BwWebViewManagerState> stateFlow215 = this.webViewState;
                        while (!stateFlow215.compareAndSet(stateFlow215.getValue(), new BwWebViewManagerState.ChartAppInitialized(chartUrl))) {
                        }
                        if (instrument != null) {
                            setChartInstrument(instrument, value3.getAccountNumber());
                        }
                    } else {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("[MAC] Unexpected state on initialized: " + Reflection.getOrCreateKotlinClass(value3.getClass()).getSimpleName()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
                        StateFlow2<BwWebViewManagerState> stateFlow216 = this.webViewState;
                        while (!stateFlow216.compareAndSet(stateFlow216.getValue(), BwWebViewManagerState.Error.INSTANCE)) {
                        }
                    }
                } else if (dataDto instanceof MobileBlackWidowChartMessageDto.DataDto.SetMobileAppChartReady) {
                    SetMobileAppChartReadyDto value4 = ((MobileBlackWidowChartMessageDto.DataDto.SetMobileAppChartReady) dataDto).getValue();
                    if (value4.getHas_failed()) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("[MAC] Chart app failed to start: " + value4.getError_message()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
                        StateFlow2<BwWebViewManagerState> stateFlow217 = this.webViewState;
                        while (!stateFlow217.compareAndSet(stateFlow217.getValue(), BwWebViewManagerState.Error.INSTANCE)) {
                        }
                        this.viewClient.deleteFileCacheIfExists();
                        return Unit.INSTANCE;
                    }
                    BwWebViewManagerState value5 = this.webViewState.getValue();
                    SetChartInstrumentDto.InstrumentDto instrument2 = value5.getInstrument();
                    String chartUrl2 = value5.getChartUrl();
                    if (instrument2 == null || chartUrl2 == null) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("[MAC] Unexpected state on ready: " + Reflection.getOrCreateKotlinClass(value5.getClass()).getSimpleName()), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null), 2, null);
                        StateFlow2<BwWebViewManagerState> stateFlow218 = this.webViewState;
                        while (!stateFlow218.compareAndSet(stateFlow218.getValue(), BwWebViewManagerState.Error.INSTANCE)) {
                        }
                    } else {
                        logWebviewLoadComplete();
                        StateFlow2<BwWebViewManagerState> stateFlow219 = this.webViewState;
                        while (!stateFlow219.compareAndSet(stateFlow219.getValue(), new BwWebViewManagerState.ChartAppStarted(chartUrl2, instrument2, value5.getAccountNumber()))) {
                        }
                        handleOnLoadActions();
                    }
                } else {
                    TimberLogger.INSTANCE.mo1679d("BlackWidowWebView: unhandled message " + dataDto, new Object[0]);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$processMessage$15", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$processMessage$15 */
    static final class C1059215 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C1059215(Continuation<? super C1059215> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C1059215(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1059215) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BwWebViewComponent.this.getWebView().reload();
            return Unit.INSTANCE;
        }
    }

    private final void handleOnLoadActions() {
        CollectionsKt.removeAll((List) this.onLoadedActions, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BwWebViewComponent.handleOnLoadActions$lambda$30(this.f$0, (OnLoadAction) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean handleOnLoadActions$lambda$30(BwWebViewComponent bwWebViewComponent, OnLoadAction loadAction) {
        Intrinsics.checkNotNullParameter(loadAction, "loadAction");
        if (!(loadAction instanceof SetInstrument)) {
            throw new NoWhenBranchMatchedException();
        }
        bwWebViewComponent.setChartInstrument(((SetInstrument) loadAction).getInstrument());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getWebViewAuthToken() {
        String str = this.webViewAuthToken;
        if (str != null) {
            return str;
        }
        String rawAuthToken = this.authTokenManager.getRawAuthToken();
        if (rawAuthToken == null) {
            rawAuthToken = "";
        }
        this.webViewAuthToken = rawAuthToken;
        return getWebViewAuthToken();
    }

    public final void initializeChartApp(String chartUrl) {
        BwWebViewManagerState value;
        BwWebViewManagerState bwWebViewManagerState;
        Intrinsics.checkNotNullParameter(chartUrl, "chartUrl");
        if (this.webViewState.getValue() instanceof BwWebViewManagerState.InitializingChartApp) {
            return;
        }
        StateFlow2<BwWebViewManagerState> stateFlow2 = this.webViewState;
        do {
            value = stateFlow2.getValue();
            bwWebViewManagerState = value;
        } while (!stateFlow2.compareAndSet(value, new BwWebViewManagerState.InitializingChartApp(chartUrl, bwWebViewManagerState.getInstrument(), bwWebViewManagerState.getAccountNumber())));
        BuildersKt__Builders_commonKt.launch$default(this.webViewScope, Dispatchers.getIO(), null, new C105892(null), 2, null);
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$initializeChartApp$2", m3645f = "BwWebViewComponent.kt", m3646l = {592}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$initializeChartApp$2 */
    static final class C105892 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;

        C105892(Continuation<? super C105892> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105892(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            BwWebViewComponent bwWebViewComponent;
            AuthState authState;
            boolean zIsAccessibleAlternate;
            Object objFirst;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                bwWebViewComponent = BwWebViewComponent.this;
                authState = new AuthState(BwWebViewComponent.this.getWebViewAuthToken(), null, 2, null);
                String userAgent = BwWebViewComponent.this.userAgentProvider.getUserAgent();
                zIsAccessibleAlternate = BwWebViewComponent.this.colorSchemeManager.getColorScheme().isAccessibleAlternate();
                Flow<List<MobileAppFeature>> chartFeatures = BwWebViewComponent.this.getChartFeatures();
                this.L$0 = authState;
                this.L$1 = userAgent;
                this.L$2 = bwWebViewComponent;
                this.Z$0 = zIsAccessibleAlternate;
                this.label = 1;
                objFirst = FlowKt.first(chartFeatures, this);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = userAgent;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z = this.Z$0;
                bwWebViewComponent = (BwWebViewComponent) this.L$2;
                String str2 = (String) this.L$1;
                authState = (AuthState) this.L$0;
                ResultKt.throwOnFailure(obj);
                zIsAccessibleAlternate = z;
                str = str2;
                objFirst = obj;
            }
            bwWebViewComponent.sendMessage(new WebBlackWidowChartMessage(new InitializeChartApp(authState, zIsAccessibleAlternate, str, (List) objFirst, null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048574, null));
            return Unit.INSTANCE;
        }
    }

    private final Flow<List<MobileAppFeature>> featuresToExperiment(Map<MobileAppFeature, ? extends Flow<Boolean>> featureMap) {
        Set<Map.Entry<MobileAppFeature, ? extends Flow<Boolean>>> setEntrySet = featureMap.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            final MobileAppFeature mobileAppFeature = (MobileAppFeature) entry.getKey();
            final Flow flow = (Flow) entry.getValue();
            arrayList.add(new Flow<Tuples2<? extends MobileAppFeature, ? extends Boolean>>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$featuresToExperiment$lambda$33$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends MobileAppFeature, ? extends Boolean>> flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new C105822(flowCollector, mobileAppFeature), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$featuresToExperiment$lambda$33$$inlined$map$1$2 */
                public static final class C105822<T> implements FlowCollector {
                    final /* synthetic */ MobileAppFeature $feature$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$featuresToExperiment$lambda$33$$inlined$map$1$2", m3645f = "BwWebViewComponent.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$featuresToExperiment$lambda$33$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C105822.this.emit(null, this);
                        }
                    }

                    public C105822(FlowCollector flowCollector, MobileAppFeature mobileAppFeature) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$feature$inlined = mobileAppFeature;
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
                            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$feature$inlined, boxing.boxBoolean(((Boolean) obj).booleanValue()));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
            });
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
        return new Flow<List<? extends MobileAppFeature>>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$featuresToExperiment$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends MobileAppFeature>> flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objCombineInternal = Combine.combineInternal(flowCollector, flowArr2, new Function0<Tuples2<? extends MobileAppFeature, ? extends Boolean>[]>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$featuresToExperiment$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Tuples2<? extends MobileAppFeature, ? extends Boolean>[] invoke() {
                        return new Tuples2[flowArr2.length];
                    }
                }, new C105813(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$featuresToExperiment$$inlined$combine$1$3", m3645f = "BwWebViewComponent.kt", m3646l = {288}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$featuresToExperiment$$inlined$combine$1$3 */
            public static final class C105813 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends MobileAppFeature>>, Tuples2<? extends MobileAppFeature, ? extends Boolean>[], Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public C105813(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super List<? extends MobileAppFeature>> flowCollector, Tuples2<? extends MobileAppFeature, ? extends Boolean>[] tuples2Arr, Continuation<? super Unit> continuation) {
                    C105813 c105813 = new C105813(continuation);
                    c105813.L$0 = flowCollector;
                    c105813.L$1 = tuples2Arr;
                    return c105813.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Tuples2[] tuples2Arr = (Tuples2[]) ((Object[]) this.L$1);
                        ArrayList arrayList = new ArrayList();
                        for (Tuples2 tuples2 : tuples2Arr) {
                            if (((Boolean) tuples2.getSecond()).booleanValue()) {
                                arrayList.add(tuples2);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((MobileAppFeature) ((Tuples2) it.next()).getFirst());
                        }
                        this.label = 1;
                        if (flowCollector.emit(arrayList2, this) == coroutine_suspended) {
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
        };
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$updateAuthToken$1", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$updateAuthToken$1 */
    static final class C105951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: BwWebViewComponent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$updateAuthToken$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AuthTokenManager.TokenRefreshResult.values().length];
                try {
                    iArr[AuthTokenManager.TokenRefreshResult.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AuthTokenManager.TokenRefreshResult.FAILURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AuthTokenManager.TokenRefreshResult.DEBOUNCED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AuthTokenManager.TokenRefreshResult.FORCE_LOGOUT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C105951(Continuation<? super C105951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String rawAuthToken = BwWebViewComponent.this.authTokenManager.getRawAuthToken();
                if (rawAuthToken == null || Intrinsics.areEqual(rawAuthToken, BwWebViewComponent.this.getWebViewAuthToken())) {
                    int i = WhenMappings.$EnumSwitchMapping$0[BwWebViewComponent.this.authTokenManager.attemptToRefreshToken(BwWebViewComponent.this.getWebViewAuthToken()).ordinal()];
                    if (i == 1 || i == 2 || i == 3) {
                        BwWebViewComponent.this.updateAuthToken();
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AuthManager.DefaultImpls.initiateLogout$default(BwWebViewComponent.this.authManager, BwWebViewComponent.this.context, LogoutType.HTTP_401, null, false, null, "mac_web_token_refresh", 28, null);
                    }
                } else {
                    BwWebViewComponent.this.webViewAuthToken = rawAuthToken;
                    BwWebViewComponent.this.sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, null, null, null, null, new UpdateAuthState(new AuthState(BwWebViewComponent.this.getWebViewAuthToken(), null, 2, null), null, 2, null), null, null, null, null, null, null, null, null, null, null, 1048063, null));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updateAuthToken() {
        BuildersKt__Builders_commonKt.launch$default(this.webViewScope, Dispatchers.getIO(), null, new C105951(null), 2, null);
    }

    public final void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        sendMessage(new WebBlackWidowChartMessage(null, null, null, new SetAccount(new TradingAccount(accountNumber, null, 2, null), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048567, null));
    }

    public final void setChartInstrument(SetChartInstrumentDto.InstrumentDto instrument, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AdvancedChartOpenedEvent(null, 1, null), null, null, null, null, null, 1032191, null));
        BwWebViewManagerState value = this.webViewState.getValue();
        if (Intrinsics.areEqual(value, BwWebViewManagerState.Stopped.INSTANCE)) {
            logWebViewOpen();
            initializeWebView(instrument, accountNumber);
            return;
        }
        if (value instanceof BwWebViewManagerState.InitializingWebView) {
            logWebViewOpen();
            StateFlow2<BwWebViewManagerState> stateFlow2 = this.webViewState;
            while (!stateFlow2.compareAndSet(stateFlow2.getValue(), new BwWebViewManagerState.InitializingWebView(((BwWebViewManagerState.InitializingWebView) value).getChartUrl(), instrument, accountNumber))) {
            }
            return;
        }
        if (value instanceof BwWebViewManagerState.WaitingForChartUrl) {
            logWebViewOpen();
            StateFlow2<BwWebViewManagerState> stateFlow22 = this.webViewState;
            while (!stateFlow22.compareAndSet(stateFlow22.getValue(), new BwWebViewManagerState.WaitingForChartUrl(instrument, accountNumber))) {
            }
            return;
        }
        if (value instanceof BwWebViewManagerState.InitializingChartApp) {
            logWebViewOpen();
            StateFlow2<BwWebViewManagerState> stateFlow23 = this.webViewState;
            while (!stateFlow23.compareAndSet(stateFlow23.getValue(), new BwWebViewManagerState.InitializingChartApp(((BwWebViewManagerState.InitializingChartApp) value).getChartUrl(), instrument, accountNumber))) {
            }
            return;
        }
        if (!(value instanceof BwWebViewManagerState.ChartAppInitialized)) {
            if (value instanceof BwWebViewManagerState.StartingChartApp) {
                this.onLoadedActions.add(new SetInstrument(instrument));
                return;
            } else if (value instanceof BwWebViewManagerState.ChartAppStarted) {
                setChartInstrument(instrument);
                return;
            } else {
                if (!Intrinsics.areEqual(value, BwWebViewManagerState.Error.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        logWebViewOpen();
        StateFlow2<BwWebViewManagerState> stateFlow24 = this.webViewState;
        while (!stateFlow24.compareAndSet(stateFlow24.getValue(), new BwWebViewManagerState.StartingChartApp(((BwWebViewManagerState.ChartAppInitialized) value).getChartUrl(), instrument, accountNumber))) {
        }
        SetAccount setAccount = null;
        InitializeChartApp initializeChartApp = null;
        SetTimeSpan setTimeSpan = null;
        SetInterval setInterval = null;
        SetChartSetting setChartSetting = null;
        SetIndicatorAction setIndicatorAction = null;
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
        sendMessage(new WebBlackWidowChartMessage(initializeChartApp, setTimeSpan, setInterval, setAccount, setChartSetting, null, new StartChartApp(new SetChartInstrumentDto(instrument).toProto(), new TradingAccount(accountNumber, null, 2, null), null, 4, null), setIndicatorAction, setIndicatorTemplateAction, updateAuthState, orderSubmittedEvent, orderEditedEvent, orderFailedToSubmitEvent, setIndicatorLegendCollapsed, advancedChartOpenedEvent, orderFailedToEditEvent, orderCancelledEvent, orderFailedToCancelEvent, advancedChartClosedEvent, byteString, 1048511, null));
    }

    private final void setChartInstrument(SetChartInstrumentDto.InstrumentDto instrument) {
        BwWebViewManagerState value = this.webViewState.getValue();
        if (value instanceof BwWebViewManagerState.ChartAppStarted) {
            BwWebViewManagerState.ChartAppStarted chartAppStarted = (BwWebViewManagerState.ChartAppStarted) value;
            if (!Intrinsics.areEqual(chartAppStarted.getInstrument(), instrument)) {
                StateFlow2<BwWebViewManagerState> stateFlow2 = this.webViewState;
                while (!stateFlow2.compareAndSet(stateFlow2.getValue(), BwWebViewManagerState.ChartAppStarted.copy$default(chartAppStarted, null, instrument, null, 5, null))) {
                }
                StateFlow2<QuoteDto> stateFlow22 = this.quote;
                while (!stateFlow22.compareAndSet(stateFlow22.getValue(), null)) {
                }
            }
            sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, new SetChartInstrumentDto(instrument).toProto(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048543, null));
            return;
        }
        this.onLoadedActions.add(new SetInstrument(instrument));
    }

    public final void setChartSpan(TimeSpanDto timeSpan) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        this.sharedSpanService.sendSharedSpanEvent(timeSpan);
        StateFlow2<TimeSpanDto> stateFlow2 = this.currentTimeSpan;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), timeSpan)) {
        }
        IntervalDto intervalDto = getSpanIntervalCache().get(timeSpan.getId());
        if (intervalDto != null) {
            StateFlow2<IntervalDto> stateFlow22 = this.currentInterval;
            while (!stateFlow22.compareAndSet(stateFlow22.getValue(), intervalDto)) {
            }
        }
        InitializeChartApp initializeChartApp = null;
        sendMessage(new WebBlackWidowChartMessage(initializeChartApp, new SetTimeSpan(timeSpan.toProto(), intervalDto != null ? intervalDto.toProto() : null, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573, null));
    }

    public final void setChartInterval(IntervalDto interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        updateSpanIntervalCache(interval);
        StateFlow2<IntervalDto> stateFlow2 = this.currentInterval;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), interval)) {
        }
        sendMessage(new WebBlackWidowChartMessage(null, null, new SetInterval(interval.toProto(), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048571, null));
    }

    private final void updateSpanIntervalCache(IntervalDto interval) {
        TimeSpanDto value = this.currentTimeSpan.getValue();
        if (value != null) {
            getSpanIntervalCache().put(value.getId(), interval);
            this.cachedSpanInterval.set(this.spanIntervalCacheAdapter.toJson(getSpanIntervalCache()));
        }
    }

    public final void notifyOrderFailedToSubmit(String refId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, null, null, null, null, null, null, null, new OrderFailedToSubmitEvent(refId, null, 2, null), null, null, null, null, null, null, null, 1044479, null));
    }

    public final void notifyOrderFailedToEdit(String refId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OrderFailedToEditEvent(refId, null, 2, null), null, null, null, null, 1015807, null));
    }

    public final void notifyOrderEditSuccess(OrderEditedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, null, null, null, null, null, null, event, null, null, null, null, null, null, null, null, 1046527, null));
    }

    public final void notifyOrderSubmitSuccess(OrderSubmittedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, null, null, null, null, null, event, null, null, null, null, null, null, null, null, null, 1047551, null));
    }

    public final void notifyOrderCanceled(String refId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OrderCancelledEvent(refId, null, 2, null), null, null, null, 983039, null));
    }

    public final void notifyOrderFailedToCancel(String refId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        sendMessage(new WebBlackWidowChartMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OrderFailedToCancelEvent(refId, null, 2, null), null, null, 917503, null));
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$sendMessage$1", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$sendMessage$1 */
    static final class C105931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WebBlackWidowChartMessage $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C105931(WebBlackWidowChartMessage webBlackWidowChartMessage, Continuation<? super C105931> continuation) {
            super(2, continuation);
            this.$message = webBlackWidowChartMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105931(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default(BwWebViewComponent.this.webViewScope, null, null, new AnonymousClass1(BwWebViewComponent.this, BwWebViewComponent.this.blackWidowWebMessageAdapter.toJson(this.$message), null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: BwWebViewComponent.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$sendMessage$1$1", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$sendMessage$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $jsonMessage;
            int label;
            final /* synthetic */ BwWebViewComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BwWebViewComponent bwWebViewComponent, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = bwWebViewComponent;
                this.$jsonMessage = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$jsonMessage, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getWebView().loadUrl("\n                    javascript:window.dispatchEvent(\n                        new CustomEvent(\n                            \"_bw_handle_message\",\n                            {\n                                detail: " + this.$jsonMessage + "\n                            }\n                        )\n                    )");
                return Unit.INSTANCE;
            }
        }
    }

    public final void sendMessage(WebBlackWidowChartMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(this.webViewScope, Dispatchers.getIO(), null, new C105931(message, null), 2, null);
    }

    /* compiled from: BwWebViewComponent.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$destroyWebView$2", m3645f = "BwWebViewComponent.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewComponent$destroyWebView$2 */
    static final class C105862 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C105862(Continuation<? super C105862> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BwWebViewComponent.this.new C105862(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BwWebViewComponent.this.getWebView().destroy();
            return Unit.INSTANCE;
        }
    }

    public final Object destroyWebView(Continuation<? super Unit> continuation) {
        logWebViewPreloadAbort();
        Object objWithContext = BuildersKt.withContext(this.webViewScope.getCoroutineContext(), new C105862(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logWebViewPreloadStart() {
        this.webviewPreloaded = true;
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.MOBILE_ADVANCED_CHARTS, null, this.performanceLoggingContextualId, null, 10, null);
    }

    private final void logWebviewLoadComplete() {
        this.performanceLogger.completeMetric(PerformanceMetricEventData.Name.SCREEN_LOAD, this.performanceLoggingContextualId);
    }

    private final void logWebViewOpen() {
        if (this.chartOpenMetricStarted) {
            return;
        }
        this.chartOpenMetricStarted = true;
        if (this.webviewPreloaded) {
            this.performanceLogger.completeMetric(PerformanceMetricEventData.Name.MOBILE_ADVANCED_CHARTS, this.performanceLoggingContextualId);
        }
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.SCREEN_LOAD, null, this.performanceLoggingContextualId, new PerformanceMetricEventData.Context(!this.webviewPreloaded, false, false, null, null, null, null, new PerformanceMetricEventData.Context.ScreenLoad(new Screen(Screen.Name.MOBILE_ADVANCED_CHARTS, null, null, null, 14, null), null, null, 6, null), null, null, null, null, 3966, null), 2, null);
    }

    private final void logWebViewPreloadAbort() {
        this.performanceLogger.abortMetric(PerformanceMetricEventData.Name.MOBILE_ADVANCED_CHARTS, this.performanceLoggingContextualId);
    }
}
