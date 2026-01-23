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

/* compiled from: WebBlackWidowChartMessage.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 ]2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001]Bõ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020*¢\u0006\u0004\b+\u0010,J\b\u0010S\u001a\u00020\u0002H\u0017J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0096\u0002J\b\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u00020[H\u0016Jô\u0001\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010R¨\u0006^"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/WebBlackWidowChartMessage;", "Lcom/squareup/wire/Message;", "", "initialize_chart_app", "Lblack_widow/contracts/mobile_app_chart/proto/v1/InitializeChartApp;", "set_time_span", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpan;", "set_interval", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetInterval;", "set_account", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAccount;", "set_chart_setting", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;", "set_chart_instrument", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "start_chart_app", "Lblack_widow/contracts/mobile_app_chart/proto/v1/StartChartApp;", "set_indicator_action", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorAction;", "set_indicator_template_action", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplateAction;", "update_auth_state", "Lblack_widow/contracts/mobile_app_chart/proto/v1/UpdateAuthState;", "order_submitted", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderSubmittedEvent;", "order_edited", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;", "order_failed_to_submit", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToSubmitEvent;", "set_indicator_legend_collapsed", "Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorLegendCollapsed;", "advanced_chart_opened", "Lblack_widow/contracts/mobile_app_chart/proto/v1/AdvancedChartOpenedEvent;", "order_failed_to_edit", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToEditEvent;", "order_cancelled", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderCancelledEvent;", "order_failed_to_cancel", "Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToCancelEvent;", "advanced_chart_closed", "Lblack_widow/contracts/mobile_app_chart/proto/v1/AdvancedChartClosedEvent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/InitializeChartApp;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpan;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetInterval;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAccount;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;Lblack_widow/contracts/mobile_app_chart/proto/v1/StartChartApp;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplateAction;Lblack_widow/contracts/mobile_app_chart/proto/v1/UpdateAuthState;Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderSubmittedEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToSubmitEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorLegendCollapsed;Lblack_widow/contracts/mobile_app_chart/proto/v1/AdvancedChartOpenedEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToEditEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderCancelledEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToCancelEvent;Lblack_widow/contracts/mobile_app_chart/proto/v1/AdvancedChartClosedEvent;Lokio/ByteString;)V", "getInitialize_chart_app", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/InitializeChartApp;", "getSet_time_span", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetTimeSpan;", "getSet_interval", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetInterval;", "getSet_account", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetAccount;", "getSet_chart_setting", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartSetting;", "getSet_chart_instrument", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetChartInstrument;", "getStart_chart_app", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/StartChartApp;", "getSet_indicator_action", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorAction;", "getSet_indicator_template_action", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorTemplateAction;", "getUpdate_auth_state", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/UpdateAuthState;", "getOrder_submitted", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderSubmittedEvent;", "getOrder_edited", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderEditedEvent;", "getOrder_failed_to_submit", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToSubmitEvent;", "getSet_indicator_legend_collapsed", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/SetIndicatorLegendCollapsed;", "getAdvanced_chart_opened", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/AdvancedChartOpenedEvent;", "getOrder_failed_to_edit", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToEditEvent;", "getOrder_cancelled", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderCancelledEvent;", "getOrder_failed_to_cancel", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/OrderFailedToCancelEvent;", "getAdvanced_chart_closed", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/AdvancedChartClosedEvent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class WebBlackWidowChartMessage extends Message {

    @JvmField
    public static final ProtoAdapter<WebBlackWidowChartMessage> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.AdvancedChartClosedEvent#ADAPTER", jsonName = "advancedChartClosed", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 18, tag = 21)
    private final AdvancedChartClosedEvent advanced_chart_closed;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.AdvancedChartOpenedEvent#ADAPTER", jsonName = "advancedChartOpened", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 14, tag = 17)
    private final AdvancedChartOpenedEvent advanced_chart_opened;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.InitializeChartApp#ADAPTER", jsonName = "initializeChartApp", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 0, tag = 1)
    private final InitializeChartApp initialize_chart_app;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.OrderCancelledEvent#ADAPTER", jsonName = "orderCancelled", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 16, tag = 19)
    private final OrderCancelledEvent order_cancelled;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.OrderEditedEvent#ADAPTER", jsonName = "orderEdited", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 11, tag = 14)
    private final OrderEditedEvent order_edited;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.OrderFailedToCancelEvent#ADAPTER", jsonName = "orderFailedToCancel", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 17, tag = 20)
    private final OrderFailedToCancelEvent order_failed_to_cancel;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.OrderFailedToEditEvent#ADAPTER", jsonName = "orderFailedToEdit", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 15, tag = 18)
    private final OrderFailedToEditEvent order_failed_to_edit;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.OrderFailedToSubmitEvent#ADAPTER", jsonName = "orderFailedToSubmit", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 12, tag = 15)
    private final OrderFailedToSubmitEvent order_failed_to_submit;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.OrderSubmittedEvent#ADAPTER", jsonName = "orderSubmitted", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 10, tag = 13)
    private final OrderSubmittedEvent order_submitted;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetAccount#ADAPTER", jsonName = "setAccount", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 3, tag = 4)
    private final SetAccount set_account;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetChartInstrument#ADAPTER", jsonName = "setChartInstrument", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 5, tag = 7)
    private final SetChartInstrument set_chart_instrument;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetChartSetting#ADAPTER", jsonName = "setChartSetting", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 4, tag = 6)
    private final SetChartSetting set_chart_setting;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetIndicatorAction#ADAPTER", jsonName = "setIndicatorAction", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 7, tag = 9)
    private final SetIndicatorAction set_indicator_action;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetIndicatorLegendCollapsed#ADAPTER", jsonName = "setIndicatorLegendCollapsed", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 13, tag = 16)
    private final SetIndicatorLegendCollapsed set_indicator_legend_collapsed;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetIndicatorTemplateAction#ADAPTER", jsonName = "setIndicatorTemplateAction", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 8, tag = 10)
    private final SetIndicatorTemplateAction set_indicator_template_action;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetInterval#ADAPTER", jsonName = "setInterval", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 2, tag = 3)
    private final SetInterval set_interval;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.SetTimeSpan#ADAPTER", jsonName = "setTimeSpan", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 1, tag = 2)
    private final SetTimeSpan set_time_span;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.StartChartApp#ADAPTER", jsonName = "startChartApp", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 6, tag = 8)
    private final StartChartApp start_chart_app;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.UpdateAuthState#ADAPTER", jsonName = "updateAuthState", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 9, tag = 11)
    private final UpdateAuthState update_auth_state;

    public WebBlackWidowChartMessage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8684newBuilder();
    }

    public final InitializeChartApp getInitialize_chart_app() {
        return this.initialize_chart_app;
    }

    public final SetTimeSpan getSet_time_span() {
        return this.set_time_span;
    }

    public final SetInterval getSet_interval() {
        return this.set_interval;
    }

    public final SetAccount getSet_account() {
        return this.set_account;
    }

    public final SetChartSetting getSet_chart_setting() {
        return this.set_chart_setting;
    }

    public final SetChartInstrument getSet_chart_instrument() {
        return this.set_chart_instrument;
    }

    public final StartChartApp getStart_chart_app() {
        return this.start_chart_app;
    }

    public final SetIndicatorAction getSet_indicator_action() {
        return this.set_indicator_action;
    }

    public final SetIndicatorTemplateAction getSet_indicator_template_action() {
        return this.set_indicator_template_action;
    }

    public final UpdateAuthState getUpdate_auth_state() {
        return this.update_auth_state;
    }

    public final OrderSubmittedEvent getOrder_submitted() {
        return this.order_submitted;
    }

    public final OrderEditedEvent getOrder_edited() {
        return this.order_edited;
    }

    public final OrderFailedToSubmitEvent getOrder_failed_to_submit() {
        return this.order_failed_to_submit;
    }

    public final SetIndicatorLegendCollapsed getSet_indicator_legend_collapsed() {
        return this.set_indicator_legend_collapsed;
    }

    public final AdvancedChartOpenedEvent getAdvanced_chart_opened() {
        return this.advanced_chart_opened;
    }

    public final OrderFailedToEditEvent getOrder_failed_to_edit() {
        return this.order_failed_to_edit;
    }

    public final OrderCancelledEvent getOrder_cancelled() {
        return this.order_cancelled;
    }

    public final OrderFailedToCancelEvent getOrder_failed_to_cancel() {
        return this.order_failed_to_cancel;
    }

    public final AdvancedChartClosedEvent getAdvanced_chart_closed() {
        return this.advanced_chart_closed;
    }

    public /* synthetic */ WebBlackWidowChartMessage(InitializeChartApp initializeChartApp, SetTimeSpan setTimeSpan, SetInterval setInterval, SetAccount setAccount, SetChartSetting setChartSetting, SetChartInstrument setChartInstrument, StartChartApp startChartApp, SetIndicatorAction setIndicatorAction, SetIndicatorTemplateAction setIndicatorTemplateAction, UpdateAuthState updateAuthState, OrderSubmittedEvent orderSubmittedEvent, OrderEditedEvent orderEditedEvent, OrderFailedToSubmitEvent orderFailedToSubmitEvent, SetIndicatorLegendCollapsed setIndicatorLegendCollapsed, AdvancedChartOpenedEvent advancedChartOpenedEvent, OrderFailedToEditEvent orderFailedToEditEvent, OrderCancelledEvent orderCancelledEvent, OrderFailedToCancelEvent orderFailedToCancelEvent, AdvancedChartClosedEvent advancedChartClosedEvent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : initializeChartApp, (i & 2) != 0 ? null : setTimeSpan, (i & 4) != 0 ? null : setInterval, (i & 8) != 0 ? null : setAccount, (i & 16) != 0 ? null : setChartSetting, (i & 32) != 0 ? null : setChartInstrument, (i & 64) != 0 ? null : startChartApp, (i & 128) != 0 ? null : setIndicatorAction, (i & 256) != 0 ? null : setIndicatorTemplateAction, (i & 512) != 0 ? null : updateAuthState, (i & 1024) != 0 ? null : orderSubmittedEvent, (i & 2048) != 0 ? null : orderEditedEvent, (i & 4096) != 0 ? null : orderFailedToSubmitEvent, (i & 8192) != 0 ? null : setIndicatorLegendCollapsed, (i & 16384) != 0 ? null : advancedChartOpenedEvent, (i & 32768) != 0 ? null : orderFailedToEditEvent, (i & 65536) != 0 ? null : orderCancelledEvent, (i & 131072) != 0 ? null : orderFailedToCancelEvent, (i & 262144) != 0 ? null : advancedChartClosedEvent, (i & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebBlackWidowChartMessage(InitializeChartApp initializeChartApp, SetTimeSpan setTimeSpan, SetInterval setInterval, SetAccount setAccount, SetChartSetting setChartSetting, SetChartInstrument setChartInstrument, StartChartApp startChartApp, SetIndicatorAction setIndicatorAction, SetIndicatorTemplateAction setIndicatorTemplateAction, UpdateAuthState updateAuthState, OrderSubmittedEvent orderSubmittedEvent, OrderEditedEvent orderEditedEvent, OrderFailedToSubmitEvent orderFailedToSubmitEvent, SetIndicatorLegendCollapsed setIndicatorLegendCollapsed, AdvancedChartOpenedEvent advancedChartOpenedEvent, OrderFailedToEditEvent orderFailedToEditEvent, OrderCancelledEvent orderCancelledEvent, OrderFailedToCancelEvent orderFailedToCancelEvent, AdvancedChartClosedEvent advancedChartClosedEvent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.initialize_chart_app = initializeChartApp;
        this.set_time_span = setTimeSpan;
        this.set_interval = setInterval;
        this.set_account = setAccount;
        this.set_chart_setting = setChartSetting;
        this.set_chart_instrument = setChartInstrument;
        this.start_chart_app = startChartApp;
        this.set_indicator_action = setIndicatorAction;
        this.set_indicator_template_action = setIndicatorTemplateAction;
        this.update_auth_state = updateAuthState;
        this.order_submitted = orderSubmittedEvent;
        this.order_edited = orderEditedEvent;
        this.order_failed_to_submit = orderFailedToSubmitEvent;
        this.set_indicator_legend_collapsed = setIndicatorLegendCollapsed;
        this.advanced_chart_opened = advancedChartOpenedEvent;
        this.order_failed_to_edit = orderFailedToEditEvent;
        this.order_cancelled = orderCancelledEvent;
        this.order_failed_to_cancel = orderFailedToCancelEvent;
        this.advanced_chart_closed = advancedChartClosedEvent;
        if (Internal.countNonNull(initializeChartApp, setTimeSpan, setInterval, setAccount, setChartSetting, setChartInstrument, startChartApp, setIndicatorAction, setIndicatorTemplateAction, updateAuthState, orderSubmittedEvent, orderEditedEvent, orderFailedToSubmitEvent, setIndicatorLegendCollapsed, advancedChartOpenedEvent, orderFailedToEditEvent, orderCancelledEvent, orderFailedToCancelEvent, advancedChartClosedEvent) > 1) {
            throw new IllegalArgumentException("At most one of initialize_chart_app, set_time_span, set_interval, set_account, set_chart_setting, set_chart_instrument, start_chart_app, set_indicator_action, set_indicator_template_action, update_auth_state, order_submitted, order_edited, order_failed_to_submit, set_indicator_legend_collapsed, advanced_chart_opened, order_failed_to_edit, order_cancelled, order_failed_to_cancel, advanced_chart_closed may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8684newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WebBlackWidowChartMessage)) {
            return false;
        }
        WebBlackWidowChartMessage webBlackWidowChartMessage = (WebBlackWidowChartMessage) other;
        return Intrinsics.areEqual(unknownFields(), webBlackWidowChartMessage.unknownFields()) && Intrinsics.areEqual(this.initialize_chart_app, webBlackWidowChartMessage.initialize_chart_app) && Intrinsics.areEqual(this.set_time_span, webBlackWidowChartMessage.set_time_span) && Intrinsics.areEqual(this.set_interval, webBlackWidowChartMessage.set_interval) && Intrinsics.areEqual(this.set_account, webBlackWidowChartMessage.set_account) && Intrinsics.areEqual(this.set_chart_setting, webBlackWidowChartMessage.set_chart_setting) && Intrinsics.areEqual(this.set_chart_instrument, webBlackWidowChartMessage.set_chart_instrument) && Intrinsics.areEqual(this.start_chart_app, webBlackWidowChartMessage.start_chart_app) && Intrinsics.areEqual(this.set_indicator_action, webBlackWidowChartMessage.set_indicator_action) && Intrinsics.areEqual(this.set_indicator_template_action, webBlackWidowChartMessage.set_indicator_template_action) && Intrinsics.areEqual(this.update_auth_state, webBlackWidowChartMessage.update_auth_state) && Intrinsics.areEqual(this.order_submitted, webBlackWidowChartMessage.order_submitted) && Intrinsics.areEqual(this.order_edited, webBlackWidowChartMessage.order_edited) && Intrinsics.areEqual(this.order_failed_to_submit, webBlackWidowChartMessage.order_failed_to_submit) && Intrinsics.areEqual(this.set_indicator_legend_collapsed, webBlackWidowChartMessage.set_indicator_legend_collapsed) && Intrinsics.areEqual(this.advanced_chart_opened, webBlackWidowChartMessage.advanced_chart_opened) && Intrinsics.areEqual(this.order_failed_to_edit, webBlackWidowChartMessage.order_failed_to_edit) && Intrinsics.areEqual(this.order_cancelled, webBlackWidowChartMessage.order_cancelled) && Intrinsics.areEqual(this.order_failed_to_cancel, webBlackWidowChartMessage.order_failed_to_cancel) && Intrinsics.areEqual(this.advanced_chart_closed, webBlackWidowChartMessage.advanced_chart_closed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        InitializeChartApp initializeChartApp = this.initialize_chart_app;
        int iHashCode2 = (iHashCode + (initializeChartApp != null ? initializeChartApp.hashCode() : 0)) * 37;
        SetTimeSpan setTimeSpan = this.set_time_span;
        int iHashCode3 = (iHashCode2 + (setTimeSpan != null ? setTimeSpan.hashCode() : 0)) * 37;
        SetInterval setInterval = this.set_interval;
        int iHashCode4 = (iHashCode3 + (setInterval != null ? setInterval.hashCode() : 0)) * 37;
        SetAccount setAccount = this.set_account;
        int iHashCode5 = (iHashCode4 + (setAccount != null ? setAccount.hashCode() : 0)) * 37;
        SetChartSetting setChartSetting = this.set_chart_setting;
        int iHashCode6 = (iHashCode5 + (setChartSetting != null ? setChartSetting.hashCode() : 0)) * 37;
        SetChartInstrument setChartInstrument = this.set_chart_instrument;
        int iHashCode7 = (iHashCode6 + (setChartInstrument != null ? setChartInstrument.hashCode() : 0)) * 37;
        StartChartApp startChartApp = this.start_chart_app;
        int iHashCode8 = (iHashCode7 + (startChartApp != null ? startChartApp.hashCode() : 0)) * 37;
        SetIndicatorAction setIndicatorAction = this.set_indicator_action;
        int iHashCode9 = (iHashCode8 + (setIndicatorAction != null ? setIndicatorAction.hashCode() : 0)) * 37;
        SetIndicatorTemplateAction setIndicatorTemplateAction = this.set_indicator_template_action;
        int iHashCode10 = (iHashCode9 + (setIndicatorTemplateAction != null ? setIndicatorTemplateAction.hashCode() : 0)) * 37;
        UpdateAuthState updateAuthState = this.update_auth_state;
        int iHashCode11 = (iHashCode10 + (updateAuthState != null ? updateAuthState.hashCode() : 0)) * 37;
        OrderSubmittedEvent orderSubmittedEvent = this.order_submitted;
        int iHashCode12 = (iHashCode11 + (orderSubmittedEvent != null ? orderSubmittedEvent.hashCode() : 0)) * 37;
        OrderEditedEvent orderEditedEvent = this.order_edited;
        int iHashCode13 = (iHashCode12 + (orderEditedEvent != null ? orderEditedEvent.hashCode() : 0)) * 37;
        OrderFailedToSubmitEvent orderFailedToSubmitEvent = this.order_failed_to_submit;
        int iHashCode14 = (iHashCode13 + (orderFailedToSubmitEvent != null ? orderFailedToSubmitEvent.hashCode() : 0)) * 37;
        SetIndicatorLegendCollapsed setIndicatorLegendCollapsed = this.set_indicator_legend_collapsed;
        int iHashCode15 = (iHashCode14 + (setIndicatorLegendCollapsed != null ? setIndicatorLegendCollapsed.hashCode() : 0)) * 37;
        AdvancedChartOpenedEvent advancedChartOpenedEvent = this.advanced_chart_opened;
        int iHashCode16 = (iHashCode15 + (advancedChartOpenedEvent != null ? advancedChartOpenedEvent.hashCode() : 0)) * 37;
        OrderFailedToEditEvent orderFailedToEditEvent = this.order_failed_to_edit;
        int iHashCode17 = (iHashCode16 + (orderFailedToEditEvent != null ? orderFailedToEditEvent.hashCode() : 0)) * 37;
        OrderCancelledEvent orderCancelledEvent = this.order_cancelled;
        int iHashCode18 = (iHashCode17 + (orderCancelledEvent != null ? orderCancelledEvent.hashCode() : 0)) * 37;
        OrderFailedToCancelEvent orderFailedToCancelEvent = this.order_failed_to_cancel;
        int iHashCode19 = (iHashCode18 + (orderFailedToCancelEvent != null ? orderFailedToCancelEvent.hashCode() : 0)) * 37;
        AdvancedChartClosedEvent advancedChartClosedEvent = this.advanced_chart_closed;
        int iHashCode20 = iHashCode19 + (advancedChartClosedEvent != null ? advancedChartClosedEvent.hashCode() : 0);
        this.hashCode = iHashCode20;
        return iHashCode20;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        InitializeChartApp initializeChartApp = this.initialize_chart_app;
        if (initializeChartApp != null) {
            arrayList.add("initialize_chart_app=" + initializeChartApp);
        }
        SetTimeSpan setTimeSpan = this.set_time_span;
        if (setTimeSpan != null) {
            arrayList.add("set_time_span=" + setTimeSpan);
        }
        SetInterval setInterval = this.set_interval;
        if (setInterval != null) {
            arrayList.add("set_interval=" + setInterval);
        }
        SetAccount setAccount = this.set_account;
        if (setAccount != null) {
            arrayList.add("set_account=" + setAccount);
        }
        SetChartSetting setChartSetting = this.set_chart_setting;
        if (setChartSetting != null) {
            arrayList.add("set_chart_setting=" + setChartSetting);
        }
        SetChartInstrument setChartInstrument = this.set_chart_instrument;
        if (setChartInstrument != null) {
            arrayList.add("set_chart_instrument=" + setChartInstrument);
        }
        StartChartApp startChartApp = this.start_chart_app;
        if (startChartApp != null) {
            arrayList.add("start_chart_app=" + startChartApp);
        }
        SetIndicatorAction setIndicatorAction = this.set_indicator_action;
        if (setIndicatorAction != null) {
            arrayList.add("set_indicator_action=" + setIndicatorAction);
        }
        SetIndicatorTemplateAction setIndicatorTemplateAction = this.set_indicator_template_action;
        if (setIndicatorTemplateAction != null) {
            arrayList.add("set_indicator_template_action=" + setIndicatorTemplateAction);
        }
        UpdateAuthState updateAuthState = this.update_auth_state;
        if (updateAuthState != null) {
            arrayList.add("update_auth_state=" + updateAuthState);
        }
        OrderSubmittedEvent orderSubmittedEvent = this.order_submitted;
        if (orderSubmittedEvent != null) {
            arrayList.add("order_submitted=" + orderSubmittedEvent);
        }
        OrderEditedEvent orderEditedEvent = this.order_edited;
        if (orderEditedEvent != null) {
            arrayList.add("order_edited=" + orderEditedEvent);
        }
        OrderFailedToSubmitEvent orderFailedToSubmitEvent = this.order_failed_to_submit;
        if (orderFailedToSubmitEvent != null) {
            arrayList.add("order_failed_to_submit=" + orderFailedToSubmitEvent);
        }
        SetIndicatorLegendCollapsed setIndicatorLegendCollapsed = this.set_indicator_legend_collapsed;
        if (setIndicatorLegendCollapsed != null) {
            arrayList.add("set_indicator_legend_collapsed=" + setIndicatorLegendCollapsed);
        }
        AdvancedChartOpenedEvent advancedChartOpenedEvent = this.advanced_chart_opened;
        if (advancedChartOpenedEvent != null) {
            arrayList.add("advanced_chart_opened=" + advancedChartOpenedEvent);
        }
        OrderFailedToEditEvent orderFailedToEditEvent = this.order_failed_to_edit;
        if (orderFailedToEditEvent != null) {
            arrayList.add("order_failed_to_edit=" + orderFailedToEditEvent);
        }
        OrderCancelledEvent orderCancelledEvent = this.order_cancelled;
        if (orderCancelledEvent != null) {
            arrayList.add("order_cancelled=" + orderCancelledEvent);
        }
        OrderFailedToCancelEvent orderFailedToCancelEvent = this.order_failed_to_cancel;
        if (orderFailedToCancelEvent != null) {
            arrayList.add("order_failed_to_cancel=" + orderFailedToCancelEvent);
        }
        AdvancedChartClosedEvent advancedChartClosedEvent = this.advanced_chart_closed;
        if (advancedChartClosedEvent != null) {
            arrayList.add("advanced_chart_closed=" + advancedChartClosedEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebBlackWidowChartMessage{", "}", 0, null, null, 56, null);
    }

    public final WebBlackWidowChartMessage copy(InitializeChartApp initialize_chart_app, SetTimeSpan set_time_span, SetInterval set_interval, SetAccount set_account, SetChartSetting set_chart_setting, SetChartInstrument set_chart_instrument, StartChartApp start_chart_app, SetIndicatorAction set_indicator_action, SetIndicatorTemplateAction set_indicator_template_action, UpdateAuthState update_auth_state, OrderSubmittedEvent order_submitted, OrderEditedEvent order_edited, OrderFailedToSubmitEvent order_failed_to_submit, SetIndicatorLegendCollapsed set_indicator_legend_collapsed, AdvancedChartOpenedEvent advanced_chart_opened, OrderFailedToEditEvent order_failed_to_edit, OrderCancelledEvent order_cancelled, OrderFailedToCancelEvent order_failed_to_cancel, AdvancedChartClosedEvent advanced_chart_closed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WebBlackWidowChartMessage(initialize_chart_app, set_time_span, set_interval, set_account, set_chart_setting, set_chart_instrument, start_chart_app, set_indicator_action, set_indicator_template_action, update_auth_state, order_submitted, order_edited, order_failed_to_submit, set_indicator_legend_collapsed, advanced_chart_opened, order_failed_to_edit, order_cancelled, order_failed_to_cancel, advanced_chart_closed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WebBlackWidowChartMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WebBlackWidowChartMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.WebBlackWidowChartMessage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WebBlackWidowChartMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + InitializeChartApp.ADAPTER.encodedSizeWithTag(1, value.getInitialize_chart_app()) + SetTimeSpan.ADAPTER.encodedSizeWithTag(2, value.getSet_time_span()) + SetInterval.ADAPTER.encodedSizeWithTag(3, value.getSet_interval()) + SetAccount.ADAPTER.encodedSizeWithTag(4, value.getSet_account()) + SetChartSetting.ADAPTER.encodedSizeWithTag(6, value.getSet_chart_setting()) + SetChartInstrument.ADAPTER.encodedSizeWithTag(7, value.getSet_chart_instrument()) + StartChartApp.ADAPTER.encodedSizeWithTag(8, value.getStart_chart_app()) + SetIndicatorAction.ADAPTER.encodedSizeWithTag(9, value.getSet_indicator_action()) + SetIndicatorTemplateAction.ADAPTER.encodedSizeWithTag(10, value.getSet_indicator_template_action()) + UpdateAuthState.ADAPTER.encodedSizeWithTag(11, value.getUpdate_auth_state()) + OrderSubmittedEvent.ADAPTER.encodedSizeWithTag(13, value.getOrder_submitted()) + OrderEditedEvent.ADAPTER.encodedSizeWithTag(14, value.getOrder_edited()) + OrderFailedToSubmitEvent.ADAPTER.encodedSizeWithTag(15, value.getOrder_failed_to_submit()) + SetIndicatorLegendCollapsed.ADAPTER.encodedSizeWithTag(16, value.getSet_indicator_legend_collapsed()) + AdvancedChartOpenedEvent.ADAPTER.encodedSizeWithTag(17, value.getAdvanced_chart_opened()) + OrderFailedToEditEvent.ADAPTER.encodedSizeWithTag(18, value.getOrder_failed_to_edit()) + OrderCancelledEvent.ADAPTER.encodedSizeWithTag(19, value.getOrder_cancelled()) + OrderFailedToCancelEvent.ADAPTER.encodedSizeWithTag(20, value.getOrder_failed_to_cancel()) + AdvancedChartClosedEvent.ADAPTER.encodedSizeWithTag(21, value.getAdvanced_chart_closed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WebBlackWidowChartMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                InitializeChartApp.ADAPTER.encodeWithTag(writer, 1, (int) value.getInitialize_chart_app());
                SetTimeSpan.ADAPTER.encodeWithTag(writer, 2, (int) value.getSet_time_span());
                SetInterval.ADAPTER.encodeWithTag(writer, 3, (int) value.getSet_interval());
                SetAccount.ADAPTER.encodeWithTag(writer, 4, (int) value.getSet_account());
                SetChartSetting.ADAPTER.encodeWithTag(writer, 6, (int) value.getSet_chart_setting());
                SetChartInstrument.ADAPTER.encodeWithTag(writer, 7, (int) value.getSet_chart_instrument());
                StartChartApp.ADAPTER.encodeWithTag(writer, 8, (int) value.getStart_chart_app());
                SetIndicatorAction.ADAPTER.encodeWithTag(writer, 9, (int) value.getSet_indicator_action());
                SetIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 10, (int) value.getSet_indicator_template_action());
                UpdateAuthState.ADAPTER.encodeWithTag(writer, 11, (int) value.getUpdate_auth_state());
                OrderSubmittedEvent.ADAPTER.encodeWithTag(writer, 13, (int) value.getOrder_submitted());
                OrderEditedEvent.ADAPTER.encodeWithTag(writer, 14, (int) value.getOrder_edited());
                OrderFailedToSubmitEvent.ADAPTER.encodeWithTag(writer, 15, (int) value.getOrder_failed_to_submit());
                SetIndicatorLegendCollapsed.ADAPTER.encodeWithTag(writer, 16, (int) value.getSet_indicator_legend_collapsed());
                AdvancedChartOpenedEvent.ADAPTER.encodeWithTag(writer, 17, (int) value.getAdvanced_chart_opened());
                OrderFailedToEditEvent.ADAPTER.encodeWithTag(writer, 18, (int) value.getOrder_failed_to_edit());
                OrderCancelledEvent.ADAPTER.encodeWithTag(writer, 19, (int) value.getOrder_cancelled());
                OrderFailedToCancelEvent.ADAPTER.encodeWithTag(writer, 20, (int) value.getOrder_failed_to_cancel());
                AdvancedChartClosedEvent.ADAPTER.encodeWithTag(writer, 21, (int) value.getAdvanced_chart_closed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WebBlackWidowChartMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvancedChartClosedEvent.ADAPTER.encodeWithTag(writer, 21, (int) value.getAdvanced_chart_closed());
                OrderFailedToCancelEvent.ADAPTER.encodeWithTag(writer, 20, (int) value.getOrder_failed_to_cancel());
                OrderCancelledEvent.ADAPTER.encodeWithTag(writer, 19, (int) value.getOrder_cancelled());
                OrderFailedToEditEvent.ADAPTER.encodeWithTag(writer, 18, (int) value.getOrder_failed_to_edit());
                AdvancedChartOpenedEvent.ADAPTER.encodeWithTag(writer, 17, (int) value.getAdvanced_chart_opened());
                SetIndicatorLegendCollapsed.ADAPTER.encodeWithTag(writer, 16, (int) value.getSet_indicator_legend_collapsed());
                OrderFailedToSubmitEvent.ADAPTER.encodeWithTag(writer, 15, (int) value.getOrder_failed_to_submit());
                OrderEditedEvent.ADAPTER.encodeWithTag(writer, 14, (int) value.getOrder_edited());
                OrderSubmittedEvent.ADAPTER.encodeWithTag(writer, 13, (int) value.getOrder_submitted());
                UpdateAuthState.ADAPTER.encodeWithTag(writer, 11, (int) value.getUpdate_auth_state());
                SetIndicatorTemplateAction.ADAPTER.encodeWithTag(writer, 10, (int) value.getSet_indicator_template_action());
                SetIndicatorAction.ADAPTER.encodeWithTag(writer, 9, (int) value.getSet_indicator_action());
                StartChartApp.ADAPTER.encodeWithTag(writer, 8, (int) value.getStart_chart_app());
                SetChartInstrument.ADAPTER.encodeWithTag(writer, 7, (int) value.getSet_chart_instrument());
                SetChartSetting.ADAPTER.encodeWithTag(writer, 6, (int) value.getSet_chart_setting());
                SetAccount.ADAPTER.encodeWithTag(writer, 4, (int) value.getSet_account());
                SetInterval.ADAPTER.encodeWithTag(writer, 3, (int) value.getSet_interval());
                SetTimeSpan.ADAPTER.encodeWithTag(writer, 2, (int) value.getSet_time_span());
                InitializeChartApp.ADAPTER.encodeWithTag(writer, 1, (int) value.getInitialize_chart_app());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WebBlackWidowChartMessage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SetTimeSpan setTimeSpanDecode = null;
                SetInterval setIntervalDecode = null;
                SetAccount setAccountDecode = null;
                SetChartSetting setChartSettingDecode = null;
                SetChartInstrument setChartInstrumentDecode = null;
                StartChartApp startChartAppDecode = null;
                SetIndicatorAction setIndicatorActionDecode = null;
                SetIndicatorTemplateAction setIndicatorTemplateActionDecode = null;
                UpdateAuthState updateAuthStateDecode = null;
                OrderSubmittedEvent orderSubmittedEventDecode = null;
                OrderEditedEvent orderEditedEventDecode = null;
                OrderFailedToSubmitEvent orderFailedToSubmitEventDecode = null;
                SetIndicatorLegendCollapsed setIndicatorLegendCollapsedDecode = null;
                AdvancedChartOpenedEvent advancedChartOpenedEventDecode = null;
                OrderFailedToEditEvent orderFailedToEditEventDecode = null;
                OrderCancelledEvent orderCancelledEventDecode = null;
                OrderFailedToCancelEvent orderFailedToCancelEventDecode = null;
                AdvancedChartClosedEvent advancedChartClosedEventDecode = null;
                InitializeChartApp initializeChartAppDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    SetTimeSpan setTimeSpan = setTimeSpanDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                initializeChartAppDecode = InitializeChartApp.ADAPTER.decode(reader);
                                break;
                            case 2:
                                setTimeSpanDecode = SetTimeSpan.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                setIntervalDecode = SetInterval.ADAPTER.decode(reader);
                                break;
                            case 4:
                                setAccountDecode = SetAccount.ADAPTER.decode(reader);
                                break;
                            case 5:
                            case 12:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 6:
                                setChartSettingDecode = SetChartSetting.ADAPTER.decode(reader);
                                break;
                            case 7:
                                setChartInstrumentDecode = SetChartInstrument.ADAPTER.decode(reader);
                                break;
                            case 8:
                                startChartAppDecode = StartChartApp.ADAPTER.decode(reader);
                                break;
                            case 9:
                                setIndicatorActionDecode = SetIndicatorAction.ADAPTER.decode(reader);
                                break;
                            case 10:
                                setIndicatorTemplateActionDecode = SetIndicatorTemplateAction.ADAPTER.decode(reader);
                                break;
                            case 11:
                                updateAuthStateDecode = UpdateAuthState.ADAPTER.decode(reader);
                                break;
                            case 13:
                                orderSubmittedEventDecode = OrderSubmittedEvent.ADAPTER.decode(reader);
                                break;
                            case 14:
                                orderEditedEventDecode = OrderEditedEvent.ADAPTER.decode(reader);
                                break;
                            case 15:
                                orderFailedToSubmitEventDecode = OrderFailedToSubmitEvent.ADAPTER.decode(reader);
                                break;
                            case 16:
                                setIndicatorLegendCollapsedDecode = SetIndicatorLegendCollapsed.ADAPTER.decode(reader);
                                break;
                            case 17:
                                advancedChartOpenedEventDecode = AdvancedChartOpenedEvent.ADAPTER.decode(reader);
                                break;
                            case 18:
                                orderFailedToEditEventDecode = OrderFailedToEditEvent.ADAPTER.decode(reader);
                                break;
                            case 19:
                                orderCancelledEventDecode = OrderCancelledEvent.ADAPTER.decode(reader);
                                break;
                            case 20:
                                orderFailedToCancelEventDecode = OrderFailedToCancelEvent.ADAPTER.decode(reader);
                                break;
                            case 21:
                                advancedChartClosedEventDecode = AdvancedChartClosedEvent.ADAPTER.decode(reader);
                                break;
                        }
                        setTimeSpanDecode = setTimeSpan;
                    } else {
                        return new WebBlackWidowChartMessage(initializeChartAppDecode, setTimeSpan, setIntervalDecode, setAccountDecode, setChartSettingDecode, setChartInstrumentDecode, startChartAppDecode, setIndicatorActionDecode, setIndicatorTemplateActionDecode, updateAuthStateDecode, orderSubmittedEventDecode, orderEditedEventDecode, orderFailedToSubmitEventDecode, setIndicatorLegendCollapsedDecode, advancedChartOpenedEventDecode, orderFailedToEditEventDecode, orderCancelledEventDecode, orderFailedToCancelEventDecode, advancedChartClosedEventDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WebBlackWidowChartMessage redact(WebBlackWidowChartMessage value) {
                OrderFailedToCancelEvent orderFailedToCancelEvent;
                InitializeChartApp initializeChartApp;
                OrderFailedToEditEvent orderFailedToEditEvent;
                AdvancedChartClosedEvent advancedChartClosedEventRedact;
                Intrinsics.checkNotNullParameter(value, "value");
                InitializeChartApp initialize_chart_app = value.getInitialize_chart_app();
                InitializeChartApp initializeChartAppRedact = initialize_chart_app != null ? InitializeChartApp.ADAPTER.redact(initialize_chart_app) : null;
                SetTimeSpan set_time_span = value.getSet_time_span();
                SetTimeSpan setTimeSpanRedact = set_time_span != null ? SetTimeSpan.ADAPTER.redact(set_time_span) : null;
                SetInterval set_interval = value.getSet_interval();
                SetInterval setIntervalRedact = set_interval != null ? SetInterval.ADAPTER.redact(set_interval) : null;
                SetAccount set_account = value.getSet_account();
                SetAccount setAccountRedact = set_account != null ? SetAccount.ADAPTER.redact(set_account) : null;
                SetChartSetting set_chart_setting = value.getSet_chart_setting();
                SetChartSetting setChartSettingRedact = set_chart_setting != null ? SetChartSetting.ADAPTER.redact(set_chart_setting) : null;
                SetChartInstrument set_chart_instrument = value.getSet_chart_instrument();
                SetChartInstrument setChartInstrumentRedact = set_chart_instrument != null ? SetChartInstrument.ADAPTER.redact(set_chart_instrument) : null;
                StartChartApp start_chart_app = value.getStart_chart_app();
                StartChartApp startChartAppRedact = start_chart_app != null ? StartChartApp.ADAPTER.redact(start_chart_app) : null;
                SetIndicatorAction set_indicator_action = value.getSet_indicator_action();
                SetIndicatorAction setIndicatorActionRedact = set_indicator_action != null ? SetIndicatorAction.ADAPTER.redact(set_indicator_action) : null;
                SetIndicatorTemplateAction set_indicator_template_action = value.getSet_indicator_template_action();
                SetIndicatorTemplateAction setIndicatorTemplateActionRedact = set_indicator_template_action != null ? SetIndicatorTemplateAction.ADAPTER.redact(set_indicator_template_action) : null;
                UpdateAuthState update_auth_state = value.getUpdate_auth_state();
                UpdateAuthState updateAuthStateRedact = update_auth_state != null ? UpdateAuthState.ADAPTER.redact(update_auth_state) : null;
                OrderSubmittedEvent order_submitted = value.getOrder_submitted();
                OrderSubmittedEvent orderSubmittedEventRedact = order_submitted != null ? OrderSubmittedEvent.ADAPTER.redact(order_submitted) : null;
                OrderEditedEvent order_edited = value.getOrder_edited();
                OrderEditedEvent orderEditedEventRedact = order_edited != null ? OrderEditedEvent.ADAPTER.redact(order_edited) : null;
                OrderFailedToSubmitEvent order_failed_to_submit = value.getOrder_failed_to_submit();
                OrderFailedToSubmitEvent orderFailedToSubmitEventRedact = order_failed_to_submit != null ? OrderFailedToSubmitEvent.ADAPTER.redact(order_failed_to_submit) : null;
                SetIndicatorLegendCollapsed set_indicator_legend_collapsed = value.getSet_indicator_legend_collapsed();
                SetIndicatorLegendCollapsed setIndicatorLegendCollapsedRedact = set_indicator_legend_collapsed != null ? SetIndicatorLegendCollapsed.ADAPTER.redact(set_indicator_legend_collapsed) : null;
                AdvancedChartOpenedEvent advanced_chart_opened = value.getAdvanced_chart_opened();
                InitializeChartApp initializeChartApp2 = initializeChartAppRedact;
                AdvancedChartOpenedEvent advancedChartOpenedEventRedact = advanced_chart_opened != null ? AdvancedChartOpenedEvent.ADAPTER.redact(advanced_chart_opened) : null;
                OrderFailedToEditEvent order_failed_to_edit = value.getOrder_failed_to_edit();
                AdvancedChartOpenedEvent advancedChartOpenedEvent = advancedChartOpenedEventRedact;
                OrderFailedToEditEvent orderFailedToEditEventRedact = order_failed_to_edit != null ? OrderFailedToEditEvent.ADAPTER.redact(order_failed_to_edit) : null;
                OrderCancelledEvent order_cancelled = value.getOrder_cancelled();
                OrderFailedToEditEvent orderFailedToEditEvent2 = orderFailedToEditEventRedact;
                OrderCancelledEvent orderCancelledEventRedact = order_cancelled != null ? OrderCancelledEvent.ADAPTER.redact(order_cancelled) : null;
                OrderFailedToCancelEvent order_failed_to_cancel = value.getOrder_failed_to_cancel();
                OrderCancelledEvent orderCancelledEvent = orderCancelledEventRedact;
                OrderFailedToCancelEvent orderFailedToCancelEventRedact = order_failed_to_cancel != null ? OrderFailedToCancelEvent.ADAPTER.redact(order_failed_to_cancel) : null;
                AdvancedChartClosedEvent advanced_chart_closed = value.getAdvanced_chart_closed();
                if (advanced_chart_closed != null) {
                    OrderFailedToCancelEvent orderFailedToCancelEvent2 = orderFailedToCancelEventRedact;
                    advancedChartClosedEventRedact = AdvancedChartClosedEvent.ADAPTER.redact(advanced_chart_closed);
                    initializeChartApp = initializeChartApp2;
                    orderFailedToEditEvent = orderFailedToEditEvent2;
                    orderFailedToCancelEvent = orderFailedToCancelEvent2;
                } else {
                    orderFailedToCancelEvent = orderFailedToCancelEventRedact;
                    initializeChartApp = initializeChartApp2;
                    orderFailedToEditEvent = orderFailedToEditEvent2;
                    advancedChartClosedEventRedact = null;
                }
                return value.copy(initializeChartApp, setTimeSpanRedact, setIntervalRedact, setAccountRedact, setChartSettingRedact, setChartInstrumentRedact, startChartAppRedact, setIndicatorActionRedact, setIndicatorTemplateActionRedact, updateAuthStateRedact, orderSubmittedEventRedact, orderEditedEventRedact, orderFailedToSubmitEventRedact, setIndicatorLegendCollapsedRedact, advancedChartOpenedEvent, orderFailedToEditEvent, orderCancelledEvent, orderFailedToCancelEvent, advancedChartClosedEventRedact, ByteString.EMPTY);
            }
        };
    }
}
