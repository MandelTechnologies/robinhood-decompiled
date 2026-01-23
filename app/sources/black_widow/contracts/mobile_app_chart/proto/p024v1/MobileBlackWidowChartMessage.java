package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: MobileBlackWidowChartMessage.kt */
@Metadata(m3635d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u0081\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0081\u0001Bá\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010;\u001a\u00020<¢\u0006\u0004\b=\u0010>J\b\u0010w\u001a\u00020\u0002H\u0017J\u0013\u0010x\u001a\u00020y2\b\u0010z\u001a\u0004\u0018\u00010{H\u0096\u0002J\b\u0010|\u001a\u00020}H\u0016J\b\u0010~\u001a\u00020\u007fH\u0016Já\u0002\u0010\u0080\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020<R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0018\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0018\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0018\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0018\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0018\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0018\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0018\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0018\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0018\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010v¨\u0006\u0082\u0001"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/MobileBlackWidowChartMessage;", "Lcom/squareup/wire/Message;", "", "notify_chart_loaded", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoaded;", "set_available_time_spans", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpans;", "set_time_span", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpan;", "set_quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuote;", "set_scrub_mode", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubMode;", "set_intervals", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervals;", "set_chart_settings", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettings;", "set_interval", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetInterval;", "set_mobile_app_chart_initialized", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitialized;", "set_mobile_app_chart_ready", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReady;", "set_indicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicators;", "set_added_indicators", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicators;", "set_indicator_templates", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplates;", "refresh_auth_state", "Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthState;", "set_color_picker_colors", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColors;", "set_active_indicator_template_id", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateId;", "submit_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEvent;", "edit_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEvent;", "price_row_shown", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShown;", "price_row_hidden", "Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHidden;", "start_edit_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrder;", "y_axis_long_press_event", "Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEvent;", "notify_fatal_error", "Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalError;", "reload_app", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadApp;", "open_options_chain_event", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEvent;", "cancel_order", "Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrder;", "perform_haptic", "Lblack_widow/contracts/mobile_app_chart/proto/v1/Haptic;", "start_sell_position_drag", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDrag;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoaded;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpans;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpan;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuote;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubMode;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervals;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettings;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetInterval;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitialized;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReady;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicators;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicators;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplates;Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthState;Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColors;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateId;Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShown;Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHidden;Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrder;Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalError;Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadApp;Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrder;Lblack_widow/contracts/mobile_app_chart/proto/v1/Haptic;Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDrag;Lokio/ByteString;)V", "getNotify_chart_loaded", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyChartLoaded;", "getSet_available_time_spans", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAvailableTimeSpans;", "getSet_time_span", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpan;", "getSet_quote", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetQuote;", "getSet_scrub_mode", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetScrubMode;", "getSet_intervals", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIntervals;", "getSet_chart_settings", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSettings;", "getSet_interval", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetInterval;", "getSet_mobile_app_chart_initialized", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartInitialized;", "getSet_mobile_app_chart_ready", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetMobileAppChartReady;", "getSet_indicators", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicators;", "getSet_added_indicators", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAddedIndicators;", "getSet_indicator_templates", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplates;", "getRefresh_auth_state", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/RefreshAuthState;", "getSet_color_picker_colors", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ColorPickerColors;", "getSet_active_indicator_template_id", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetActiveIndicatorTemplateId;", "getSubmit_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SubmitOrderEvent;", "getEdit_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EditOrderEvent;", "getPrice_row_shown", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowShown;", "getPrice_row_hidden", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/PriceRowHidden;", "getStart_edit_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/StartEditOrder;", "getY_axis_long_press_event", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/YAxisLongPressEvent;", "getNotify_fatal_error", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/NotifyFatalError;", "getReload_app", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/ReloadApp;", "getOpen_options_chain_event", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OpenOptionsChainEvent;", "getCancel_order", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/CancelOrder;", "getPerform_haptic", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/Haptic;", "getStart_sell_position_drag", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/StartSellPositionDrag;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MobileBlackWidowChartMessage extends Message {

    @JvmField
    public static final ProtoAdapter<MobileBlackWidowChartMessage> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.CancelOrder#ADAPTER", jsonName = "cancelOrder", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 25, tag = 29)
    private final CancelOrder cancel_order;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.EditOrderEvent#ADAPTER", jsonName = "editOrder", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 17, tag = 21)
    private final EditOrderEvent edit_order;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.NotifyChartLoaded#ADAPTER", jsonName = "notifyChartLoaded", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 0, tag = 1)
    private final NotifyChartLoaded notify_chart_loaded;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.NotifyFatalError#ADAPTER", jsonName = "notifyFatalError", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 22, tag = 26)
    private final NotifyFatalError notify_fatal_error;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.OpenOptionsChainEvent#ADAPTER", jsonName = "openOptionsChainEvent", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 24, tag = 28)
    private final OpenOptionsChainEvent open_options_chain_event;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.Haptic#ADAPTER", jsonName = "performHaptic", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 26, tag = 30)
    private final Haptic perform_haptic;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.PriceRowHidden#ADAPTER", jsonName = "priceRowHidden", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 19, tag = 23)
    private final PriceRowHidden price_row_hidden;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.PriceRowShown#ADAPTER", jsonName = "priceRowShown", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 18, tag = 22)
    private final PriceRowShown price_row_shown;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.RefreshAuthState#ADAPTER", jsonName = "refreshAuthState", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 13, tag = 17)
    private final RefreshAuthState refresh_auth_state;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ReloadApp#ADAPTER", jsonName = "reloadApp", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 23, tag = 27)
    private final ReloadApp reload_app;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetActiveIndicatorTemplateId#ADAPTER", jsonName = "setActiveIndicatorTemplateId", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 15, tag = 19)
    private final SetActiveIndicatorTemplateId set_active_indicator_template_id;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetAddedIndicators#ADAPTER", jsonName = "setAddedIndicators", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 11, tag = 14)
    private final SetAddedIndicators set_added_indicators;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetAvailableTimeSpans#ADAPTER", jsonName = "setAvailableTimeSpans", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 1, tag = 2)
    private final SetAvailableTimeSpans set_available_time_spans;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetChartSettings#ADAPTER", jsonName = "setChartSettings", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 6, tag = 9)
    private final SetChartSettings set_chart_settings;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.ColorPickerColors#ADAPTER", jsonName = "setColorPickerColors", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 14, tag = 18)
    private final ColorPickerColors set_color_picker_colors;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetIndicatorTemplates#ADAPTER", jsonName = "setIndicatorTemplates", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 12, tag = 15)
    private final SetIndicatorTemplates set_indicator_templates;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetIndicators#ADAPTER", jsonName = "setIndicators", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 10, tag = 13)
    private final SetIndicators set_indicators;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetInterval#ADAPTER", jsonName = "setInterval", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 7, tag = 10)
    private final SetInterval set_interval;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetIntervals#ADAPTER", jsonName = "setIntervals", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 5, tag = 7)
    private final SetIntervals set_intervals;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetMobileAppChartInitialized#ADAPTER", jsonName = "setMobileAppChartInitialized", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 8, tag = 11)
    private final SetMobileAppChartInitialized set_mobile_app_chart_initialized;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetMobileAppChartReady#ADAPTER", jsonName = "setMobileAppChartReady", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 9, tag = 12)
    private final SetMobileAppChartReady set_mobile_app_chart_ready;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetQuote#ADAPTER", jsonName = "setQuote", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 3, tag = 4)
    private final SetQuote set_quote;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetScrubMode#ADAPTER", jsonName = "setScrubMode", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 4, tag = 5)
    private final SetScrubMode set_scrub_mode;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetTimeSpan#ADAPTER", jsonName = "setTimeSpan", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 2, tag = 3)
    private final SetTimeSpan set_time_span;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.StartEditOrder#ADAPTER", jsonName = "startEditOrder", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 20, tag = 24)
    private final StartEditOrder start_edit_order;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.StartSellPositionDrag#ADAPTER", jsonName = "startSellPositionDrag", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 27, tag = 31)
    private final StartSellPositionDrag start_sell_position_drag;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SubmitOrderEvent#ADAPTER", jsonName = "submitOrder", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 16, tag = 20)
    private final SubmitOrderEvent submit_order;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.YAxisLongPressEvent#ADAPTER", jsonName = "yAxisLongPressEvent", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 21, tag = 25)
    private final YAxisLongPressEvent y_axis_long_press_event;

    public MobileBlackWidowChartMessage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8622newBuilder();
    }

    public final NotifyChartLoaded getNotify_chart_loaded() {
        return this.notify_chart_loaded;
    }

    public final SetAvailableTimeSpans getSet_available_time_spans() {
        return this.set_available_time_spans;
    }

    public final SetTimeSpan getSet_time_span() {
        return this.set_time_span;
    }

    public final SetQuote getSet_quote() {
        return this.set_quote;
    }

    public final SetScrubMode getSet_scrub_mode() {
        return this.set_scrub_mode;
    }

    public final SetIntervals getSet_intervals() {
        return this.set_intervals;
    }

    public final SetChartSettings getSet_chart_settings() {
        return this.set_chart_settings;
    }

    public final SetInterval getSet_interval() {
        return this.set_interval;
    }

    public final SetMobileAppChartInitialized getSet_mobile_app_chart_initialized() {
        return this.set_mobile_app_chart_initialized;
    }

    public final SetMobileAppChartReady getSet_mobile_app_chart_ready() {
        return this.set_mobile_app_chart_ready;
    }

    public final SetIndicators getSet_indicators() {
        return this.set_indicators;
    }

    public final SetAddedIndicators getSet_added_indicators() {
        return this.set_added_indicators;
    }

    public final SetIndicatorTemplates getSet_indicator_templates() {
        return this.set_indicator_templates;
    }

    public final RefreshAuthState getRefresh_auth_state() {
        return this.refresh_auth_state;
    }

    public final ColorPickerColors getSet_color_picker_colors() {
        return this.set_color_picker_colors;
    }

    public final SetActiveIndicatorTemplateId getSet_active_indicator_template_id() {
        return this.set_active_indicator_template_id;
    }

    public final SubmitOrderEvent getSubmit_order() {
        return this.submit_order;
    }

    public final EditOrderEvent getEdit_order() {
        return this.edit_order;
    }

    public final PriceRowShown getPrice_row_shown() {
        return this.price_row_shown;
    }

    public final PriceRowHidden getPrice_row_hidden() {
        return this.price_row_hidden;
    }

    public final StartEditOrder getStart_edit_order() {
        return this.start_edit_order;
    }

    public final YAxisLongPressEvent getY_axis_long_press_event() {
        return this.y_axis_long_press_event;
    }

    public final NotifyFatalError getNotify_fatal_error() {
        return this.notify_fatal_error;
    }

    public final ReloadApp getReload_app() {
        return this.reload_app;
    }

    public final OpenOptionsChainEvent getOpen_options_chain_event() {
        return this.open_options_chain_event;
    }

    public final CancelOrder getCancel_order() {
        return this.cancel_order;
    }

    public final Haptic getPerform_haptic() {
        return this.perform_haptic;
    }

    public final StartSellPositionDrag getStart_sell_position_drag() {
        return this.start_sell_position_drag;
    }

    public /* synthetic */ MobileBlackWidowChartMessage(NotifyChartLoaded notifyChartLoaded, SetAvailableTimeSpans setAvailableTimeSpans, SetTimeSpan setTimeSpan, SetQuote setQuote, SetScrubMode setScrubMode, SetIntervals setIntervals, SetChartSettings setChartSettings, SetInterval setInterval, SetMobileAppChartInitialized setMobileAppChartInitialized, SetMobileAppChartReady setMobileAppChartReady, SetIndicators setIndicators, SetAddedIndicators setAddedIndicators, SetIndicatorTemplates setIndicatorTemplates, RefreshAuthState refreshAuthState, ColorPickerColors colorPickerColors, SetActiveIndicatorTemplateId setActiveIndicatorTemplateId, SubmitOrderEvent submitOrderEvent, EditOrderEvent editOrderEvent, PriceRowShown priceRowShown, PriceRowHidden priceRowHidden, StartEditOrder startEditOrder, YAxisLongPressEvent yAxisLongPressEvent, NotifyFatalError notifyFatalError, ReloadApp reloadApp, OpenOptionsChainEvent openOptionsChainEvent, CancelOrder cancelOrder, Haptic haptic, StartSellPositionDrag startSellPositionDrag, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : notifyChartLoaded, (i & 2) != 0 ? null : setAvailableTimeSpans, (i & 4) != 0 ? null : setTimeSpan, (i & 8) != 0 ? null : setQuote, (i & 16) != 0 ? null : setScrubMode, (i & 32) != 0 ? null : setIntervals, (i & 64) != 0 ? null : setChartSettings, (i & 128) != 0 ? null : setInterval, (i & 256) != 0 ? null : setMobileAppChartInitialized, (i & 512) != 0 ? null : setMobileAppChartReady, (i & 1024) != 0 ? null : setIndicators, (i & 2048) != 0 ? null : setAddedIndicators, (i & 4096) != 0 ? null : setIndicatorTemplates, (i & 8192) != 0 ? null : refreshAuthState, (i & 16384) != 0 ? null : colorPickerColors, (i & 32768) != 0 ? null : setActiveIndicatorTemplateId, (i & 65536) != 0 ? null : submitOrderEvent, (i & 131072) != 0 ? null : editOrderEvent, (i & 262144) != 0 ? null : priceRowShown, (i & 524288) != 0 ? null : priceRowHidden, (i & 1048576) != 0 ? null : startEditOrder, (i & 2097152) != 0 ? null : yAxisLongPressEvent, (i & 4194304) != 0 ? null : notifyFatalError, (i & 8388608) != 0 ? null : reloadApp, (i & 16777216) != 0 ? null : openOptionsChainEvent, (i & 33554432) != 0 ? null : cancelOrder, (i & 67108864) != 0 ? null : haptic, (i & 134217728) != 0 ? null : startSellPositionDrag, (i & 268435456) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileBlackWidowChartMessage(NotifyChartLoaded notifyChartLoaded, SetAvailableTimeSpans setAvailableTimeSpans, SetTimeSpan setTimeSpan, SetQuote setQuote, SetScrubMode setScrubMode, SetIntervals setIntervals, SetChartSettings setChartSettings, SetInterval setInterval, SetMobileAppChartInitialized setMobileAppChartInitialized, SetMobileAppChartReady setMobileAppChartReady, SetIndicators setIndicators, SetAddedIndicators setAddedIndicators, SetIndicatorTemplates setIndicatorTemplates, RefreshAuthState refreshAuthState, ColorPickerColors colorPickerColors, SetActiveIndicatorTemplateId setActiveIndicatorTemplateId, SubmitOrderEvent submitOrderEvent, EditOrderEvent editOrderEvent, PriceRowShown priceRowShown, PriceRowHidden priceRowHidden, StartEditOrder startEditOrder, YAxisLongPressEvent yAxisLongPressEvent, NotifyFatalError notifyFatalError, ReloadApp reloadApp, OpenOptionsChainEvent openOptionsChainEvent, CancelOrder cancelOrder, Haptic haptic, StartSellPositionDrag startSellPositionDrag, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.notify_chart_loaded = notifyChartLoaded;
        this.set_available_time_spans = setAvailableTimeSpans;
        this.set_time_span = setTimeSpan;
        this.set_quote = setQuote;
        this.set_scrub_mode = setScrubMode;
        this.set_intervals = setIntervals;
        this.set_chart_settings = setChartSettings;
        this.set_interval = setInterval;
        this.set_mobile_app_chart_initialized = setMobileAppChartInitialized;
        this.set_mobile_app_chart_ready = setMobileAppChartReady;
        this.set_indicators = setIndicators;
        this.set_added_indicators = setAddedIndicators;
        this.set_indicator_templates = setIndicatorTemplates;
        this.refresh_auth_state = refreshAuthState;
        this.set_color_picker_colors = colorPickerColors;
        this.set_active_indicator_template_id = setActiveIndicatorTemplateId;
        this.submit_order = submitOrderEvent;
        this.edit_order = editOrderEvent;
        this.price_row_shown = priceRowShown;
        this.price_row_hidden = priceRowHidden;
        this.start_edit_order = startEditOrder;
        this.y_axis_long_press_event = yAxisLongPressEvent;
        this.notify_fatal_error = notifyFatalError;
        this.reload_app = reloadApp;
        this.open_options_chain_event = openOptionsChainEvent;
        this.cancel_order = cancelOrder;
        this.perform_haptic = haptic;
        this.start_sell_position_drag = startSellPositionDrag;
        if (Internal.countNonNull(notifyChartLoaded, setAvailableTimeSpans, setTimeSpan, setQuote, setScrubMode, setIntervals, setChartSettings, setInterval, setMobileAppChartInitialized, setMobileAppChartReady, setIndicators, setAddedIndicators, setIndicatorTemplates, refreshAuthState, colorPickerColors, setActiveIndicatorTemplateId, submitOrderEvent, editOrderEvent, priceRowShown, priceRowHidden, startEditOrder, yAxisLongPressEvent, notifyFatalError, reloadApp, openOptionsChainEvent, cancelOrder, haptic, startSellPositionDrag) > 1) {
            throw new IllegalArgumentException("At most one of notify_chart_loaded, set_available_time_spans, set_time_span, set_quote, set_scrub_mode, set_intervals, set_chart_settings, set_interval, set_mobile_app_chart_initialized, set_mobile_app_chart_ready, set_indicators, set_added_indicators, set_indicator_templates, refresh_auth_state, set_color_picker_colors, set_active_indicator_template_id, submit_order, edit_order, price_row_shown, price_row_hidden, start_edit_order, y_axis_long_press_event, notify_fatal_error, reload_app, open_options_chain_event, cancel_order, perform_haptic, start_sell_position_drag may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8622newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MobileBlackWidowChartMessage)) {
            return false;
        }
        MobileBlackWidowChartMessage mobileBlackWidowChartMessage = (MobileBlackWidowChartMessage) other;
        return Intrinsics.areEqual(unknownFields(), mobileBlackWidowChartMessage.unknownFields()) && Intrinsics.areEqual(this.notify_chart_loaded, mobileBlackWidowChartMessage.notify_chart_loaded) && Intrinsics.areEqual(this.set_available_time_spans, mobileBlackWidowChartMessage.set_available_time_spans) && Intrinsics.areEqual(this.set_time_span, mobileBlackWidowChartMessage.set_time_span) && Intrinsics.areEqual(this.set_quote, mobileBlackWidowChartMessage.set_quote) && Intrinsics.areEqual(this.set_scrub_mode, mobileBlackWidowChartMessage.set_scrub_mode) && Intrinsics.areEqual(this.set_intervals, mobileBlackWidowChartMessage.set_intervals) && Intrinsics.areEqual(this.set_chart_settings, mobileBlackWidowChartMessage.set_chart_settings) && Intrinsics.areEqual(this.set_interval, mobileBlackWidowChartMessage.set_interval) && Intrinsics.areEqual(this.set_mobile_app_chart_initialized, mobileBlackWidowChartMessage.set_mobile_app_chart_initialized) && Intrinsics.areEqual(this.set_mobile_app_chart_ready, mobileBlackWidowChartMessage.set_mobile_app_chart_ready) && Intrinsics.areEqual(this.set_indicators, mobileBlackWidowChartMessage.set_indicators) && Intrinsics.areEqual(this.set_added_indicators, mobileBlackWidowChartMessage.set_added_indicators) && Intrinsics.areEqual(this.set_indicator_templates, mobileBlackWidowChartMessage.set_indicator_templates) && Intrinsics.areEqual(this.refresh_auth_state, mobileBlackWidowChartMessage.refresh_auth_state) && Intrinsics.areEqual(this.set_color_picker_colors, mobileBlackWidowChartMessage.set_color_picker_colors) && Intrinsics.areEqual(this.set_active_indicator_template_id, mobileBlackWidowChartMessage.set_active_indicator_template_id) && Intrinsics.areEqual(this.submit_order, mobileBlackWidowChartMessage.submit_order) && Intrinsics.areEqual(this.edit_order, mobileBlackWidowChartMessage.edit_order) && Intrinsics.areEqual(this.price_row_shown, mobileBlackWidowChartMessage.price_row_shown) && Intrinsics.areEqual(this.price_row_hidden, mobileBlackWidowChartMessage.price_row_hidden) && Intrinsics.areEqual(this.start_edit_order, mobileBlackWidowChartMessage.start_edit_order) && Intrinsics.areEqual(this.y_axis_long_press_event, mobileBlackWidowChartMessage.y_axis_long_press_event) && Intrinsics.areEqual(this.notify_fatal_error, mobileBlackWidowChartMessage.notify_fatal_error) && Intrinsics.areEqual(this.reload_app, mobileBlackWidowChartMessage.reload_app) && Intrinsics.areEqual(this.open_options_chain_event, mobileBlackWidowChartMessage.open_options_chain_event) && Intrinsics.areEqual(this.cancel_order, mobileBlackWidowChartMessage.cancel_order) && Intrinsics.areEqual(this.perform_haptic, mobileBlackWidowChartMessage.perform_haptic) && Intrinsics.areEqual(this.start_sell_position_drag, mobileBlackWidowChartMessage.start_sell_position_drag);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        NotifyChartLoaded notifyChartLoaded = this.notify_chart_loaded;
        int iHashCode2 = (iHashCode + (notifyChartLoaded != null ? notifyChartLoaded.hashCode() : 0)) * 37;
        SetAvailableTimeSpans setAvailableTimeSpans = this.set_available_time_spans;
        int iHashCode3 = (iHashCode2 + (setAvailableTimeSpans != null ? setAvailableTimeSpans.hashCode() : 0)) * 37;
        SetTimeSpan setTimeSpan = this.set_time_span;
        int iHashCode4 = (iHashCode3 + (setTimeSpan != null ? setTimeSpan.hashCode() : 0)) * 37;
        SetQuote setQuote = this.set_quote;
        int iHashCode5 = (iHashCode4 + (setQuote != null ? setQuote.hashCode() : 0)) * 37;
        SetScrubMode setScrubMode = this.set_scrub_mode;
        int iHashCode6 = (iHashCode5 + (setScrubMode != null ? setScrubMode.hashCode() : 0)) * 37;
        SetIntervals setIntervals = this.set_intervals;
        int iHashCode7 = (iHashCode6 + (setIntervals != null ? setIntervals.hashCode() : 0)) * 37;
        SetChartSettings setChartSettings = this.set_chart_settings;
        int iHashCode8 = (iHashCode7 + (setChartSettings != null ? setChartSettings.hashCode() : 0)) * 37;
        SetInterval setInterval = this.set_interval;
        int iHashCode9 = (iHashCode8 + (setInterval != null ? setInterval.hashCode() : 0)) * 37;
        SetMobileAppChartInitialized setMobileAppChartInitialized = this.set_mobile_app_chart_initialized;
        int iHashCode10 = (iHashCode9 + (setMobileAppChartInitialized != null ? setMobileAppChartInitialized.hashCode() : 0)) * 37;
        SetMobileAppChartReady setMobileAppChartReady = this.set_mobile_app_chart_ready;
        int iHashCode11 = (iHashCode10 + (setMobileAppChartReady != null ? setMobileAppChartReady.hashCode() : 0)) * 37;
        SetIndicators setIndicators = this.set_indicators;
        int iHashCode12 = (iHashCode11 + (setIndicators != null ? setIndicators.hashCode() : 0)) * 37;
        SetAddedIndicators setAddedIndicators = this.set_added_indicators;
        int iHashCode13 = (iHashCode12 + (setAddedIndicators != null ? setAddedIndicators.hashCode() : 0)) * 37;
        SetIndicatorTemplates setIndicatorTemplates = this.set_indicator_templates;
        int iHashCode14 = (iHashCode13 + (setIndicatorTemplates != null ? setIndicatorTemplates.hashCode() : 0)) * 37;
        RefreshAuthState refreshAuthState = this.refresh_auth_state;
        int iHashCode15 = (iHashCode14 + (refreshAuthState != null ? refreshAuthState.hashCode() : 0)) * 37;
        ColorPickerColors colorPickerColors = this.set_color_picker_colors;
        int iHashCode16 = (iHashCode15 + (colorPickerColors != null ? colorPickerColors.hashCode() : 0)) * 37;
        SetActiveIndicatorTemplateId setActiveIndicatorTemplateId = this.set_active_indicator_template_id;
        int iHashCode17 = (iHashCode16 + (setActiveIndicatorTemplateId != null ? setActiveIndicatorTemplateId.hashCode() : 0)) * 37;
        SubmitOrderEvent submitOrderEvent = this.submit_order;
        int iHashCode18 = (iHashCode17 + (submitOrderEvent != null ? submitOrderEvent.hashCode() : 0)) * 37;
        EditOrderEvent editOrderEvent = this.edit_order;
        int iHashCode19 = (iHashCode18 + (editOrderEvent != null ? editOrderEvent.hashCode() : 0)) * 37;
        PriceRowShown priceRowShown = this.price_row_shown;
        int iHashCode20 = (iHashCode19 + (priceRowShown != null ? priceRowShown.hashCode() : 0)) * 37;
        PriceRowHidden priceRowHidden = this.price_row_hidden;
        int iHashCode21 = (iHashCode20 + (priceRowHidden != null ? priceRowHidden.hashCode() : 0)) * 37;
        StartEditOrder startEditOrder = this.start_edit_order;
        int iHashCode22 = (iHashCode21 + (startEditOrder != null ? startEditOrder.hashCode() : 0)) * 37;
        YAxisLongPressEvent yAxisLongPressEvent = this.y_axis_long_press_event;
        int iHashCode23 = (iHashCode22 + (yAxisLongPressEvent != null ? yAxisLongPressEvent.hashCode() : 0)) * 37;
        NotifyFatalError notifyFatalError = this.notify_fatal_error;
        int iHashCode24 = (iHashCode23 + (notifyFatalError != null ? notifyFatalError.hashCode() : 0)) * 37;
        ReloadApp reloadApp = this.reload_app;
        int iHashCode25 = (iHashCode24 + (reloadApp != null ? reloadApp.hashCode() : 0)) * 37;
        OpenOptionsChainEvent openOptionsChainEvent = this.open_options_chain_event;
        int iHashCode26 = (iHashCode25 + (openOptionsChainEvent != null ? openOptionsChainEvent.hashCode() : 0)) * 37;
        CancelOrder cancelOrder = this.cancel_order;
        int iHashCode27 = (iHashCode26 + (cancelOrder != null ? cancelOrder.hashCode() : 0)) * 37;
        Haptic haptic = this.perform_haptic;
        int iHashCode28 = (iHashCode27 + (haptic != null ? haptic.hashCode() : 0)) * 37;
        StartSellPositionDrag startSellPositionDrag = this.start_sell_position_drag;
        int iHashCode29 = iHashCode28 + (startSellPositionDrag != null ? startSellPositionDrag.hashCode() : 0);
        this.hashCode = iHashCode29;
        return iHashCode29;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        NotifyChartLoaded notifyChartLoaded = this.notify_chart_loaded;
        if (notifyChartLoaded != null) {
            arrayList.add("notify_chart_loaded=" + notifyChartLoaded);
        }
        SetAvailableTimeSpans setAvailableTimeSpans = this.set_available_time_spans;
        if (setAvailableTimeSpans != null) {
            arrayList.add("set_available_time_spans=" + setAvailableTimeSpans);
        }
        SetTimeSpan setTimeSpan = this.set_time_span;
        if (setTimeSpan != null) {
            arrayList.add("set_time_span=" + setTimeSpan);
        }
        SetQuote setQuote = this.set_quote;
        if (setQuote != null) {
            arrayList.add("set_quote=" + setQuote);
        }
        SetScrubMode setScrubMode = this.set_scrub_mode;
        if (setScrubMode != null) {
            arrayList.add("set_scrub_mode=" + setScrubMode);
        }
        SetIntervals setIntervals = this.set_intervals;
        if (setIntervals != null) {
            arrayList.add("set_intervals=" + setIntervals);
        }
        SetChartSettings setChartSettings = this.set_chart_settings;
        if (setChartSettings != null) {
            arrayList.add("set_chart_settings=" + setChartSettings);
        }
        SetInterval setInterval = this.set_interval;
        if (setInterval != null) {
            arrayList.add("set_interval=" + setInterval);
        }
        SetMobileAppChartInitialized setMobileAppChartInitialized = this.set_mobile_app_chart_initialized;
        if (setMobileAppChartInitialized != null) {
            arrayList.add("set_mobile_app_chart_initialized=" + setMobileAppChartInitialized);
        }
        SetMobileAppChartReady setMobileAppChartReady = this.set_mobile_app_chart_ready;
        if (setMobileAppChartReady != null) {
            arrayList.add("set_mobile_app_chart_ready=" + setMobileAppChartReady);
        }
        SetIndicators setIndicators = this.set_indicators;
        if (setIndicators != null) {
            arrayList.add("set_indicators=" + setIndicators);
        }
        SetAddedIndicators setAddedIndicators = this.set_added_indicators;
        if (setAddedIndicators != null) {
            arrayList.add("set_added_indicators=" + setAddedIndicators);
        }
        SetIndicatorTemplates setIndicatorTemplates = this.set_indicator_templates;
        if (setIndicatorTemplates != null) {
            arrayList.add("set_indicator_templates=" + setIndicatorTemplates);
        }
        RefreshAuthState refreshAuthState = this.refresh_auth_state;
        if (refreshAuthState != null) {
            arrayList.add("refresh_auth_state=" + refreshAuthState);
        }
        ColorPickerColors colorPickerColors = this.set_color_picker_colors;
        if (colorPickerColors != null) {
            arrayList.add("set_color_picker_colors=" + colorPickerColors);
        }
        SetActiveIndicatorTemplateId setActiveIndicatorTemplateId = this.set_active_indicator_template_id;
        if (setActiveIndicatorTemplateId != null) {
            arrayList.add("set_active_indicator_template_id=" + setActiveIndicatorTemplateId);
        }
        SubmitOrderEvent submitOrderEvent = this.submit_order;
        if (submitOrderEvent != null) {
            arrayList.add("submit_order=" + submitOrderEvent);
        }
        EditOrderEvent editOrderEvent = this.edit_order;
        if (editOrderEvent != null) {
            arrayList.add("edit_order=" + editOrderEvent);
        }
        PriceRowShown priceRowShown = this.price_row_shown;
        if (priceRowShown != null) {
            arrayList.add("price_row_shown=" + priceRowShown);
        }
        PriceRowHidden priceRowHidden = this.price_row_hidden;
        if (priceRowHidden != null) {
            arrayList.add("price_row_hidden=" + priceRowHidden);
        }
        StartEditOrder startEditOrder = this.start_edit_order;
        if (startEditOrder != null) {
            arrayList.add("start_edit_order=" + startEditOrder);
        }
        YAxisLongPressEvent yAxisLongPressEvent = this.y_axis_long_press_event;
        if (yAxisLongPressEvent != null) {
            arrayList.add("y_axis_long_press_event=" + yAxisLongPressEvent);
        }
        NotifyFatalError notifyFatalError = this.notify_fatal_error;
        if (notifyFatalError != null) {
            arrayList.add("notify_fatal_error=" + notifyFatalError);
        }
        ReloadApp reloadApp = this.reload_app;
        if (reloadApp != null) {
            arrayList.add("reload_app=" + reloadApp);
        }
        OpenOptionsChainEvent openOptionsChainEvent = this.open_options_chain_event;
        if (openOptionsChainEvent != null) {
            arrayList.add("open_options_chain_event=" + openOptionsChainEvent);
        }
        CancelOrder cancelOrder = this.cancel_order;
        if (cancelOrder != null) {
            arrayList.add("cancel_order=" + cancelOrder);
        }
        Haptic haptic = this.perform_haptic;
        if (haptic != null) {
            arrayList.add("perform_haptic=" + haptic);
        }
        StartSellPositionDrag startSellPositionDrag = this.start_sell_position_drag;
        if (startSellPositionDrag != null) {
            arrayList.add("start_sell_position_drag=" + startSellPositionDrag);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MobileBlackWidowChartMessage{", "}", 0, null, null, 56, null);
    }

    public final MobileBlackWidowChartMessage copy(NotifyChartLoaded notify_chart_loaded, SetAvailableTimeSpans set_available_time_spans, SetTimeSpan set_time_span, SetQuote set_quote, SetScrubMode set_scrub_mode, SetIntervals set_intervals, SetChartSettings set_chart_settings, SetInterval set_interval, SetMobileAppChartInitialized set_mobile_app_chart_initialized, SetMobileAppChartReady set_mobile_app_chart_ready, SetIndicators set_indicators, SetAddedIndicators set_added_indicators, SetIndicatorTemplates set_indicator_templates, RefreshAuthState refresh_auth_state, ColorPickerColors set_color_picker_colors, SetActiveIndicatorTemplateId set_active_indicator_template_id, SubmitOrderEvent submit_order, EditOrderEvent edit_order, PriceRowShown price_row_shown, PriceRowHidden price_row_hidden, StartEditOrder start_edit_order, YAxisLongPressEvent y_axis_long_press_event, NotifyFatalError notify_fatal_error, ReloadApp reload_app, OpenOptionsChainEvent open_options_chain_event, CancelOrder cancel_order, Haptic perform_haptic, StartSellPositionDrag start_sell_position_drag, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MobileBlackWidowChartMessage(notify_chart_loaded, set_available_time_spans, set_time_span, set_quote, set_scrub_mode, set_intervals, set_chart_settings, set_interval, set_mobile_app_chart_initialized, set_mobile_app_chart_ready, set_indicators, set_added_indicators, set_indicator_templates, refresh_auth_state, set_color_picker_colors, set_active_indicator_template_id, submit_order, edit_order, price_row_shown, price_row_hidden, start_edit_order, y_axis_long_press_event, notify_fatal_error, reload_app, open_options_chain_event, cancel_order, perform_haptic, start_sell_position_drag, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MobileBlackWidowChartMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MobileBlackWidowChartMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.MobileBlackWidowChartMessage$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MobileBlackWidowChartMessage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SetAvailableTimeSpans setAvailableTimeSpansDecode = null;
                SetTimeSpan setTimeSpanDecode = null;
                SetQuote setQuoteDecode = null;
                SetScrubMode setScrubModeDecode = null;
                SetIntervals setIntervalsDecode = null;
                SetChartSettings setChartSettingsDecode = null;
                SetInterval setIntervalDecode = null;
                SetMobileAppChartInitialized setMobileAppChartInitializedDecode = null;
                SetMobileAppChartReady setMobileAppChartReadyDecode = null;
                SetIndicators setIndicatorsDecode = null;
                SetAddedIndicators setAddedIndicatorsDecode = null;
                SetIndicatorTemplates setIndicatorTemplatesDecode = null;
                RefreshAuthState refreshAuthStateDecode = null;
                ColorPickerColors colorPickerColorsDecode = null;
                SetActiveIndicatorTemplateId setActiveIndicatorTemplateIdDecode = null;
                SubmitOrderEvent submitOrderEventDecode = null;
                EditOrderEvent editOrderEventDecode = null;
                PriceRowShown priceRowShownDecode = null;
                PriceRowHidden priceRowHiddenDecode = null;
                StartEditOrder startEditOrderDecode = null;
                YAxisLongPressEvent yAxisLongPressEventDecode = null;
                NotifyFatalError notifyFatalErrorDecode = null;
                ReloadApp reloadAppDecode = null;
                OpenOptionsChainEvent openOptionsChainEventDecode = null;
                CancelOrder cancelOrderDecode = null;
                Haptic hapticDecode = null;
                StartSellPositionDrag startSellPositionDragDecode = null;
                NotifyChartLoaded notifyChartLoadedDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    SetAvailableTimeSpans setAvailableTimeSpans = setAvailableTimeSpansDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                notifyChartLoadedDecode = NotifyChartLoaded.ADAPTER.decode(reader);
                                break;
                            case 2:
                                setAvailableTimeSpansDecode = SetAvailableTimeSpans.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                setTimeSpanDecode = SetTimeSpan.ADAPTER.decode(reader);
                                break;
                            case 4:
                                setQuoteDecode = SetQuote.ADAPTER.decode(reader);
                                break;
                            case 5:
                                setScrubModeDecode = SetScrubMode.ADAPTER.decode(reader);
                                break;
                            case 6:
                            case 8:
                            case 16:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 7:
                                setIntervalsDecode = SetIntervals.ADAPTER.decode(reader);
                                break;
                            case 9:
                                setChartSettingsDecode = SetChartSettings.ADAPTER.decode(reader);
                                break;
                            case 10:
                                setIntervalDecode = SetInterval.ADAPTER.decode(reader);
                                break;
                            case 11:
                                setMobileAppChartInitializedDecode = SetMobileAppChartInitialized.ADAPTER.decode(reader);
                                break;
                            case 12:
                                setMobileAppChartReadyDecode = SetMobileAppChartReady.ADAPTER.decode(reader);
                                break;
                            case 13:
                                setIndicatorsDecode = SetIndicators.ADAPTER.decode(reader);
                                break;
                            case 14:
                                setAddedIndicatorsDecode = SetAddedIndicators.ADAPTER.decode(reader);
                                break;
                            case 15:
                                setIndicatorTemplatesDecode = SetIndicatorTemplates.ADAPTER.decode(reader);
                                break;
                            case 17:
                                refreshAuthStateDecode = RefreshAuthState.ADAPTER.decode(reader);
                                break;
                            case 18:
                                colorPickerColorsDecode = ColorPickerColors.ADAPTER.decode(reader);
                                break;
                            case 19:
                                setActiveIndicatorTemplateIdDecode = SetActiveIndicatorTemplateId.ADAPTER.decode(reader);
                                break;
                            case 20:
                                submitOrderEventDecode = SubmitOrderEvent.ADAPTER.decode(reader);
                                break;
                            case 21:
                                editOrderEventDecode = EditOrderEvent.ADAPTER.decode(reader);
                                break;
                            case 22:
                                priceRowShownDecode = PriceRowShown.ADAPTER.decode(reader);
                                break;
                            case 23:
                                priceRowHiddenDecode = PriceRowHidden.ADAPTER.decode(reader);
                                break;
                            case 24:
                                startEditOrderDecode = StartEditOrder.ADAPTER.decode(reader);
                                break;
                            case 25:
                                yAxisLongPressEventDecode = YAxisLongPressEvent.ADAPTER.decode(reader);
                                break;
                            case 26:
                                notifyFatalErrorDecode = NotifyFatalError.ADAPTER.decode(reader);
                                break;
                            case 27:
                                reloadAppDecode = ReloadApp.ADAPTER.decode(reader);
                                break;
                            case 28:
                                openOptionsChainEventDecode = OpenOptionsChainEvent.ADAPTER.decode(reader);
                                break;
                            case 29:
                                cancelOrderDecode = CancelOrder.ADAPTER.decode(reader);
                                break;
                            case 30:
                                hapticDecode = Haptic.ADAPTER.decode(reader);
                                break;
                            case 31:
                                startSellPositionDragDecode = StartSellPositionDrag.ADAPTER.decode(reader);
                                break;
                        }
                        setAvailableTimeSpansDecode = setAvailableTimeSpans;
                    } else {
                        return new MobileBlackWidowChartMessage(notifyChartLoadedDecode, setAvailableTimeSpans, setTimeSpanDecode, setQuoteDecode, setScrubModeDecode, setIntervalsDecode, setChartSettingsDecode, setIntervalDecode, setMobileAppChartInitializedDecode, setMobileAppChartReadyDecode, setIndicatorsDecode, setAddedIndicatorsDecode, setIndicatorTemplatesDecode, refreshAuthStateDecode, colorPickerColorsDecode, setActiveIndicatorTemplateIdDecode, submitOrderEventDecode, editOrderEventDecode, priceRowShownDecode, priceRowHiddenDecode, startEditOrderDecode, yAxisLongPressEventDecode, notifyFatalErrorDecode, reloadAppDecode, openOptionsChainEventDecode, cancelOrderDecode, hapticDecode, startSellPositionDragDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MobileBlackWidowChartMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + NotifyChartLoaded.ADAPTER.encodedSizeWithTag(1, value.getNotify_chart_loaded()) + SetAvailableTimeSpans.ADAPTER.encodedSizeWithTag(2, value.getSet_available_time_spans()) + SetTimeSpan.ADAPTER.encodedSizeWithTag(3, value.getSet_time_span()) + SetQuote.ADAPTER.encodedSizeWithTag(4, value.getSet_quote()) + SetScrubMode.ADAPTER.encodedSizeWithTag(5, value.getSet_scrub_mode()) + SetIntervals.ADAPTER.encodedSizeWithTag(7, value.getSet_intervals()) + SetChartSettings.ADAPTER.encodedSizeWithTag(9, value.getSet_chart_settings()) + SetInterval.ADAPTER.encodedSizeWithTag(10, value.getSet_interval()) + SetMobileAppChartInitialized.ADAPTER.encodedSizeWithTag(11, value.getSet_mobile_app_chart_initialized()) + SetMobileAppChartReady.ADAPTER.encodedSizeWithTag(12, value.getSet_mobile_app_chart_ready()) + SetIndicators.ADAPTER.encodedSizeWithTag(13, value.getSet_indicators()) + SetAddedIndicators.ADAPTER.encodedSizeWithTag(14, value.getSet_added_indicators()) + SetIndicatorTemplates.ADAPTER.encodedSizeWithTag(15, value.getSet_indicator_templates()) + RefreshAuthState.ADAPTER.encodedSizeWithTag(17, value.getRefresh_auth_state()) + ColorPickerColors.ADAPTER.encodedSizeWithTag(18, value.getSet_color_picker_colors()) + SetActiveIndicatorTemplateId.ADAPTER.encodedSizeWithTag(19, value.getSet_active_indicator_template_id()) + SubmitOrderEvent.ADAPTER.encodedSizeWithTag(20, value.getSubmit_order()) + EditOrderEvent.ADAPTER.encodedSizeWithTag(21, value.getEdit_order()) + PriceRowShown.ADAPTER.encodedSizeWithTag(22, value.getPrice_row_shown()) + PriceRowHidden.ADAPTER.encodedSizeWithTag(23, value.getPrice_row_hidden()) + StartEditOrder.ADAPTER.encodedSizeWithTag(24, value.getStart_edit_order()) + YAxisLongPressEvent.ADAPTER.encodedSizeWithTag(25, value.getY_axis_long_press_event()) + NotifyFatalError.ADAPTER.encodedSizeWithTag(26, value.getNotify_fatal_error()) + ReloadApp.ADAPTER.encodedSizeWithTag(27, value.getReload_app()) + OpenOptionsChainEvent.ADAPTER.encodedSizeWithTag(28, value.getOpen_options_chain_event()) + CancelOrder.ADAPTER.encodedSizeWithTag(29, value.getCancel_order()) + Haptic.ADAPTER.encodedSizeWithTag(30, value.getPerform_haptic()) + StartSellPositionDrag.ADAPTER.encodedSizeWithTag(31, value.getStart_sell_position_drag());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MobileBlackWidowChartMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                NotifyChartLoaded.ADAPTER.encodeWithTag(writer, 1, (int) value.getNotify_chart_loaded());
                SetAvailableTimeSpans.ADAPTER.encodeWithTag(writer, 2, (int) value.getSet_available_time_spans());
                SetTimeSpan.ADAPTER.encodeWithTag(writer, 3, (int) value.getSet_time_span());
                SetQuote.ADAPTER.encodeWithTag(writer, 4, (int) value.getSet_quote());
                SetScrubMode.ADAPTER.encodeWithTag(writer, 5, (int) value.getSet_scrub_mode());
                SetIntervals.ADAPTER.encodeWithTag(writer, 7, (int) value.getSet_intervals());
                SetChartSettings.ADAPTER.encodeWithTag(writer, 9, (int) value.getSet_chart_settings());
                SetInterval.ADAPTER.encodeWithTag(writer, 10, (int) value.getSet_interval());
                SetMobileAppChartInitialized.ADAPTER.encodeWithTag(writer, 11, (int) value.getSet_mobile_app_chart_initialized());
                SetMobileAppChartReady.ADAPTER.encodeWithTag(writer, 12, (int) value.getSet_mobile_app_chart_ready());
                SetIndicators.ADAPTER.encodeWithTag(writer, 13, (int) value.getSet_indicators());
                SetAddedIndicators.ADAPTER.encodeWithTag(writer, 14, (int) value.getSet_added_indicators());
                SetIndicatorTemplates.ADAPTER.encodeWithTag(writer, 15, (int) value.getSet_indicator_templates());
                RefreshAuthState.ADAPTER.encodeWithTag(writer, 17, (int) value.getRefresh_auth_state());
                ColorPickerColors.ADAPTER.encodeWithTag(writer, 18, (int) value.getSet_color_picker_colors());
                SetActiveIndicatorTemplateId.ADAPTER.encodeWithTag(writer, 19, (int) value.getSet_active_indicator_template_id());
                SubmitOrderEvent.ADAPTER.encodeWithTag(writer, 20, (int) value.getSubmit_order());
                EditOrderEvent.ADAPTER.encodeWithTag(writer, 21, (int) value.getEdit_order());
                PriceRowShown.ADAPTER.encodeWithTag(writer, 22, (int) value.getPrice_row_shown());
                PriceRowHidden.ADAPTER.encodeWithTag(writer, 23, (int) value.getPrice_row_hidden());
                StartEditOrder.ADAPTER.encodeWithTag(writer, 24, (int) value.getStart_edit_order());
                YAxisLongPressEvent.ADAPTER.encodeWithTag(writer, 25, (int) value.getY_axis_long_press_event());
                NotifyFatalError.ADAPTER.encodeWithTag(writer, 26, (int) value.getNotify_fatal_error());
                ReloadApp.ADAPTER.encodeWithTag(writer, 27, (int) value.getReload_app());
                OpenOptionsChainEvent.ADAPTER.encodeWithTag(writer, 28, (int) value.getOpen_options_chain_event());
                CancelOrder.ADAPTER.encodeWithTag(writer, 29, (int) value.getCancel_order());
                Haptic.ADAPTER.encodeWithTag(writer, 30, (int) value.getPerform_haptic());
                StartSellPositionDrag.ADAPTER.encodeWithTag(writer, 31, (int) value.getStart_sell_position_drag());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MobileBlackWidowChartMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StartSellPositionDrag.ADAPTER.encodeWithTag(writer, 31, (int) value.getStart_sell_position_drag());
                Haptic.ADAPTER.encodeWithTag(writer, 30, (int) value.getPerform_haptic());
                CancelOrder.ADAPTER.encodeWithTag(writer, 29, (int) value.getCancel_order());
                OpenOptionsChainEvent.ADAPTER.encodeWithTag(writer, 28, (int) value.getOpen_options_chain_event());
                ReloadApp.ADAPTER.encodeWithTag(writer, 27, (int) value.getReload_app());
                NotifyFatalError.ADAPTER.encodeWithTag(writer, 26, (int) value.getNotify_fatal_error());
                YAxisLongPressEvent.ADAPTER.encodeWithTag(writer, 25, (int) value.getY_axis_long_press_event());
                StartEditOrder.ADAPTER.encodeWithTag(writer, 24, (int) value.getStart_edit_order());
                PriceRowHidden.ADAPTER.encodeWithTag(writer, 23, (int) value.getPrice_row_hidden());
                PriceRowShown.ADAPTER.encodeWithTag(writer, 22, (int) value.getPrice_row_shown());
                EditOrderEvent.ADAPTER.encodeWithTag(writer, 21, (int) value.getEdit_order());
                SubmitOrderEvent.ADAPTER.encodeWithTag(writer, 20, (int) value.getSubmit_order());
                SetActiveIndicatorTemplateId.ADAPTER.encodeWithTag(writer, 19, (int) value.getSet_active_indicator_template_id());
                ColorPickerColors.ADAPTER.encodeWithTag(writer, 18, (int) value.getSet_color_picker_colors());
                RefreshAuthState.ADAPTER.encodeWithTag(writer, 17, (int) value.getRefresh_auth_state());
                SetIndicatorTemplates.ADAPTER.encodeWithTag(writer, 15, (int) value.getSet_indicator_templates());
                SetAddedIndicators.ADAPTER.encodeWithTag(writer, 14, (int) value.getSet_added_indicators());
                SetIndicators.ADAPTER.encodeWithTag(writer, 13, (int) value.getSet_indicators());
                SetMobileAppChartReady.ADAPTER.encodeWithTag(writer, 12, (int) value.getSet_mobile_app_chart_ready());
                SetMobileAppChartInitialized.ADAPTER.encodeWithTag(writer, 11, (int) value.getSet_mobile_app_chart_initialized());
                SetInterval.ADAPTER.encodeWithTag(writer, 10, (int) value.getSet_interval());
                SetChartSettings.ADAPTER.encodeWithTag(writer, 9, (int) value.getSet_chart_settings());
                SetIntervals.ADAPTER.encodeWithTag(writer, 7, (int) value.getSet_intervals());
                SetScrubMode.ADAPTER.encodeWithTag(writer, 5, (int) value.getSet_scrub_mode());
                SetQuote.ADAPTER.encodeWithTag(writer, 4, (int) value.getSet_quote());
                SetTimeSpan.ADAPTER.encodeWithTag(writer, 3, (int) value.getSet_time_span());
                SetAvailableTimeSpans.ADAPTER.encodeWithTag(writer, 2, (int) value.getSet_available_time_spans());
                NotifyChartLoaded.ADAPTER.encodeWithTag(writer, 1, (int) value.getNotify_chart_loaded());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MobileBlackWidowChartMessage redact(MobileBlackWidowChartMessage value) {
                ColorPickerColors colorPickerColors;
                SubmitOrderEvent submitOrderEvent;
                PriceRowShown priceRowShown;
                StartEditOrder startEditOrder;
                NotifyFatalError notifyFatalError;
                OpenOptionsChainEvent openOptionsChainEvent;
                StartSellPositionDrag startSellPositionDragRedact;
                Haptic haptic;
                Intrinsics.checkNotNullParameter(value, "value");
                NotifyChartLoaded notify_chart_loaded = value.getNotify_chart_loaded();
                NotifyChartLoaded notifyChartLoadedRedact = notify_chart_loaded != null ? NotifyChartLoaded.ADAPTER.redact(notify_chart_loaded) : null;
                SetAvailableTimeSpans set_available_time_spans = value.getSet_available_time_spans();
                SetAvailableTimeSpans setAvailableTimeSpansRedact = set_available_time_spans != null ? SetAvailableTimeSpans.ADAPTER.redact(set_available_time_spans) : null;
                SetTimeSpan set_time_span = value.getSet_time_span();
                SetTimeSpan setTimeSpanRedact = set_time_span != null ? SetTimeSpan.ADAPTER.redact(set_time_span) : null;
                SetQuote set_quote = value.getSet_quote();
                SetQuote setQuoteRedact = set_quote != null ? SetQuote.ADAPTER.redact(set_quote) : null;
                SetScrubMode set_scrub_mode = value.getSet_scrub_mode();
                SetScrubMode setScrubModeRedact = set_scrub_mode != null ? SetScrubMode.ADAPTER.redact(set_scrub_mode) : null;
                SetIntervals set_intervals = value.getSet_intervals();
                SetIntervals setIntervalsRedact = set_intervals != null ? SetIntervals.ADAPTER.redact(set_intervals) : null;
                SetChartSettings set_chart_settings = value.getSet_chart_settings();
                SetChartSettings setChartSettingsRedact = set_chart_settings != null ? SetChartSettings.ADAPTER.redact(set_chart_settings) : null;
                SetInterval set_interval = value.getSet_interval();
                SetInterval setIntervalRedact = set_interval != null ? SetInterval.ADAPTER.redact(set_interval) : null;
                SetMobileAppChartInitialized set_mobile_app_chart_initialized = value.getSet_mobile_app_chart_initialized();
                SetMobileAppChartInitialized setMobileAppChartInitializedRedact = set_mobile_app_chart_initialized != null ? SetMobileAppChartInitialized.ADAPTER.redact(set_mobile_app_chart_initialized) : null;
                SetMobileAppChartReady set_mobile_app_chart_ready = value.getSet_mobile_app_chart_ready();
                SetMobileAppChartReady setMobileAppChartReadyRedact = set_mobile_app_chart_ready != null ? SetMobileAppChartReady.ADAPTER.redact(set_mobile_app_chart_ready) : null;
                SetIndicators set_indicators = value.getSet_indicators();
                SetIndicators setIndicatorsRedact = set_indicators != null ? SetIndicators.ADAPTER.redact(set_indicators) : null;
                SetAddedIndicators set_added_indicators = value.getSet_added_indicators();
                SetAddedIndicators setAddedIndicatorsRedact = set_added_indicators != null ? SetAddedIndicators.ADAPTER.redact(set_added_indicators) : null;
                SetIndicatorTemplates set_indicator_templates = value.getSet_indicator_templates();
                SetIndicatorTemplates setIndicatorTemplatesRedact = set_indicator_templates != null ? SetIndicatorTemplates.ADAPTER.redact(set_indicator_templates) : null;
                RefreshAuthState refresh_auth_state = value.getRefresh_auth_state();
                RefreshAuthState refreshAuthStateRedact = refresh_auth_state != null ? RefreshAuthState.ADAPTER.redact(refresh_auth_state) : null;
                ColorPickerColors set_color_picker_colors = value.getSet_color_picker_colors();
                NotifyChartLoaded notifyChartLoaded = notifyChartLoadedRedact;
                ColorPickerColors colorPickerColorsRedact = set_color_picker_colors != null ? ColorPickerColors.ADAPTER.redact(set_color_picker_colors) : null;
                SetActiveIndicatorTemplateId set_active_indicator_template_id = value.getSet_active_indicator_template_id();
                ColorPickerColors colorPickerColors2 = colorPickerColorsRedact;
                SetActiveIndicatorTemplateId setActiveIndicatorTemplateIdRedact = set_active_indicator_template_id != null ? SetActiveIndicatorTemplateId.ADAPTER.redact(set_active_indicator_template_id) : null;
                SubmitOrderEvent submit_order = value.getSubmit_order();
                SetActiveIndicatorTemplateId setActiveIndicatorTemplateId = setActiveIndicatorTemplateIdRedact;
                SubmitOrderEvent submitOrderEventRedact = submit_order != null ? SubmitOrderEvent.ADAPTER.redact(submit_order) : null;
                EditOrderEvent edit_order = value.getEdit_order();
                SubmitOrderEvent submitOrderEvent2 = submitOrderEventRedact;
                EditOrderEvent editOrderEventRedact = edit_order != null ? EditOrderEvent.ADAPTER.redact(edit_order) : null;
                PriceRowShown price_row_shown = value.getPrice_row_shown();
                EditOrderEvent editOrderEvent = editOrderEventRedact;
                PriceRowShown priceRowShownRedact = price_row_shown != null ? PriceRowShown.ADAPTER.redact(price_row_shown) : null;
                PriceRowHidden price_row_hidden = value.getPrice_row_hidden();
                PriceRowShown priceRowShown2 = priceRowShownRedact;
                PriceRowHidden priceRowHiddenRedact = price_row_hidden != null ? PriceRowHidden.ADAPTER.redact(price_row_hidden) : null;
                StartEditOrder start_edit_order = value.getStart_edit_order();
                PriceRowHidden priceRowHidden = priceRowHiddenRedact;
                StartEditOrder startEditOrderRedact = start_edit_order != null ? StartEditOrder.ADAPTER.redact(start_edit_order) : null;
                YAxisLongPressEvent y_axis_long_press_event = value.getY_axis_long_press_event();
                StartEditOrder startEditOrder2 = startEditOrderRedact;
                YAxisLongPressEvent yAxisLongPressEventRedact = y_axis_long_press_event != null ? YAxisLongPressEvent.ADAPTER.redact(y_axis_long_press_event) : null;
                NotifyFatalError notify_fatal_error = value.getNotify_fatal_error();
                YAxisLongPressEvent yAxisLongPressEvent = yAxisLongPressEventRedact;
                NotifyFatalError notifyFatalErrorRedact = notify_fatal_error != null ? NotifyFatalError.ADAPTER.redact(notify_fatal_error) : null;
                ReloadApp reload_app = value.getReload_app();
                NotifyFatalError notifyFatalError2 = notifyFatalErrorRedact;
                ReloadApp reloadAppRedact = reload_app != null ? ReloadApp.ADAPTER.redact(reload_app) : null;
                OpenOptionsChainEvent open_options_chain_event = value.getOpen_options_chain_event();
                ReloadApp reloadApp = reloadAppRedact;
                OpenOptionsChainEvent openOptionsChainEventRedact = open_options_chain_event != null ? OpenOptionsChainEvent.ADAPTER.redact(open_options_chain_event) : null;
                CancelOrder cancel_order = value.getCancel_order();
                OpenOptionsChainEvent openOptionsChainEvent2 = openOptionsChainEventRedact;
                CancelOrder cancelOrderRedact = cancel_order != null ? CancelOrder.ADAPTER.redact(cancel_order) : null;
                Haptic perform_haptic = value.getPerform_haptic();
                CancelOrder cancelOrder = cancelOrderRedact;
                Haptic hapticRedact = perform_haptic != null ? Haptic.ADAPTER.redact(perform_haptic) : null;
                StartSellPositionDrag start_sell_position_drag = value.getStart_sell_position_drag();
                if (start_sell_position_drag != null) {
                    startSellPositionDragRedact = StartSellPositionDrag.ADAPTER.redact(start_sell_position_drag);
                    colorPickerColors = colorPickerColors2;
                    submitOrderEvent = submitOrderEvent2;
                    priceRowShown = priceRowShown2;
                    startEditOrder = startEditOrder2;
                    notifyFatalError = notifyFatalError2;
                    openOptionsChainEvent = openOptionsChainEvent2;
                    haptic = hapticRedact;
                } else {
                    colorPickerColors = colorPickerColors2;
                    submitOrderEvent = submitOrderEvent2;
                    priceRowShown = priceRowShown2;
                    startEditOrder = startEditOrder2;
                    notifyFatalError = notifyFatalError2;
                    openOptionsChainEvent = openOptionsChainEvent2;
                    startSellPositionDragRedact = null;
                    haptic = hapticRedact;
                }
                return value.copy(notifyChartLoaded, setAvailableTimeSpansRedact, setTimeSpanRedact, setQuoteRedact, setScrubModeRedact, setIntervalsRedact, setChartSettingsRedact, setIntervalRedact, setMobileAppChartInitializedRedact, setMobileAppChartReadyRedact, setIndicatorsRedact, setAddedIndicatorsRedact, setIndicatorTemplatesRedact, refreshAuthStateRedact, colorPickerColors, setActiveIndicatorTemplateId, submitOrderEvent, editOrderEvent, priceRowShown, priceRowHidden, startEditOrder, yAxisLongPressEvent, notifyFatalError, reloadApp, openOptionsChainEvent, cancelOrder, haptic, startSellPositionDragRedact, ByteString.EMPTY);
            }
        };
    }
}
