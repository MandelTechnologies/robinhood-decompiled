package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.AccountSecurityEventDataDto;
import com.robinhood.rosetta.eventlogging.AppEventDataDto;
import com.robinhood.rosetta.eventlogging.AppSessionEventDataDto;
import com.robinhood.rosetta.eventlogging.ArkoseLabsEventDataDto;
import com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.CryptoOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.DeepLinkEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceApprovalReenrollmentEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventDataDto;
import com.robinhood.rosetta.eventlogging.EmailEventDataDto;
import com.robinhood.rosetta.eventlogging.ErrorEventDataDto;
import com.robinhood.rosetta.eventlogging.ExperimentsEventDataDto;
import com.robinhood.rosetta.eventlogging.HttpCallDataDto;
import com.robinhood.rosetta.eventlogging.NetworkErrorDataDto;
import com.robinhood.rosetta.eventlogging.NotificationStackEventDataDto;
import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventDataDto;
import com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventDataDto;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto;
import com.robinhood.rosetta.eventlogging.PerpetualOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.PushNotificationEventDataDto;
import com.robinhood.rosetta.eventlogging.ScreenTransitionEventDataDto;
import com.robinhood.rosetta.eventlogging.TabGroupEventDataDto;
import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventDataDto;
import com.robinhood.rosetta.eventlogging.UserInteractionEventDataDto;
import com.robinhood.rosetta.eventlogging.WebEventDataDto;
import com.robinhood.rosetta.eventlogging.WebViewNavigationDataDto;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: RhGlobalAppEventDto.kt */
@Metadata(m3635d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u009b\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B©\u0003\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H¢\u0006\u0004\b\u0006\u0010IJ§\u0003\u0010\u008b\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010HJ\t\u0010\u008c\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u008d\u0001\u001a\u00020\tH\u0016J\u0017\u0010\u008e\u0001\u001a\u00030\u008f\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0096\u0002J\n\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0016J\u001e\u0010\u0094\u0001\u001a\u00030\u0095\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0093\u0001H\u0016J\n\u0010\u0099\u0001\u001a\u00030\u0093\u0001H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bL\u0010KR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bN\u0010KR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bO\u0010KR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bP\u0010KR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bR\u0010KR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u00101\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u00107\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0013\u0010;\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0014\u0010=\u001a\u0004\u0018\u00010>8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010?\u001a\u0004\u0018\u00010@8F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010A\u001a\u0004\u0018\u00010B8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010C\u001a\u0004\u0018\u00010D8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010E\u001a\u0004\u0018\u00010F8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010G\u001a\u0004\u0018\u00010H8F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u009e\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$Surrogate;)V", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "nav_tab", "experiments", "session_id", "url", "web_referrer", "web_referrer_host", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "screen_data", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "push_notification_data", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "notification_stack_data", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "tab_group_data", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "app_session_data", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "deep_link_data", "Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "email_data", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "error_data", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "web_data", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "user_interaction_event_data", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "performance_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "performance_metric_span_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "experiments_data", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "crypto_order_data", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "web_view_navigation_data", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "network_error_data", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "device_security_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "device_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "arkose_labs_event_data", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "twilio_conversations_sdk_event_data", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "pathfinder_fallback_to_web_view_event_data", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "device_approval_reenrollment_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;", "account_security_event_data", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "catpay_order_data", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "http_call_data", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "perpetual_order_data", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;", "perceived_loading_time_event_data", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;)V", "getCategory", "()Ljava/lang/String;", "getEvent", "getNav_tab", "getExperiments", "getSession_id", "getUrl", "getWeb_referrer", "getWeb_referrer_host", "getData", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "getScreen_data", "()Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "getPush_notification_data", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "getNotification_stack_data", "()Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "getTab_group_data", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "getApp_session_data", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "getDeep_link_data", "()Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "getEmail_data", "()Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "getError_data", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "getWeb_data", "()Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "getUser_interaction_event_data", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "getPerformance_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "getPerformance_metric_span_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "getExperiments_data", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "getCrypto_order_data", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "getWeb_view_navigation_data", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "getNetwork_error_data", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "getDevice_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "getDevice_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "getArkose_labs_event_data", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "getTwilio_conversations_sdk_event_data", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "getPathfinder_fallback_to_web_view_event_data", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "getDevice_approval_reenrollment_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;", "getAccount_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "getCatpay_order_data", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "getHttp_call_data", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "getPerpetual_order_data", "()Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;", "getPerceived_loading_time_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class RhGlobalAppEventDto implements Dto3<RhGlobalAppEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RhGlobalAppEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RhGlobalAppEventDto, RhGlobalAppEvent>> binaryBase64Serializer$delegate;
    private static final RhGlobalAppEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RhGlobalAppEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RhGlobalAppEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCategory() {
        return this.surrogate.getCategory();
    }

    public final String getEvent() {
        return this.surrogate.getEvent();
    }

    public final String getNav_tab() {
        return this.surrogate.getNav_tab();
    }

    public final String getExperiments() {
        return this.surrogate.getExperiments();
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final String getUrl() {
        return this.surrogate.getUrl();
    }

    public final String getWeb_referrer() {
        return this.surrogate.getWeb_referrer();
    }

    public final String getWeb_referrer_host() {
        return this.surrogate.getWeb_referrer_host();
    }

    public final AppEventDataDto getData() {
        return this.surrogate.getData();
    }

    public final ScreenTransitionEventDataDto getScreen_data() {
        return this.surrogate.getScreen_data();
    }

    public final PushNotificationEventDataDto getPush_notification_data() {
        return this.surrogate.getPush_notification_data();
    }

    public final NotificationStackEventDataDto getNotification_stack_data() {
        return this.surrogate.getNotification_stack_data();
    }

    public final TabGroupEventDataDto getTab_group_data() {
        return this.surrogate.getTab_group_data();
    }

    public final AppSessionEventDataDto getApp_session_data() {
        return this.surrogate.getApp_session_data();
    }

    public final DeepLinkEventDataDto getDeep_link_data() {
        return this.surrogate.getDeep_link_data();
    }

    public final EmailEventDataDto getEmail_data() {
        return this.surrogate.getEmail_data();
    }

    public final ErrorEventDataDto getError_data() {
        return this.surrogate.getError_data();
    }

    public final WebEventDataDto getWeb_data() {
        return this.surrogate.getWeb_data();
    }

    public final UserInteractionEventDataDto getUser_interaction_event_data() {
        return this.surrogate.getUser_interaction_event_data();
    }

    public final PerformanceMetricEventDataDto getPerformance_metric_event_data() {
        return this.surrogate.getPerformance_metric_event_data();
    }

    public final PerformanceMetricSpanEventDataDto getPerformance_metric_span_event_data() {
        return this.surrogate.getPerformance_metric_span_event_data();
    }

    public final ExperimentsEventDataDto getExperiments_data() {
        return this.surrogate.getExperiments_data();
    }

    public final CryptoOrderEventDataDto getCrypto_order_data() {
        return this.surrogate.getCrypto_order_data();
    }

    public final WebViewNavigationDataDto getWeb_view_navigation_data() {
        return this.surrogate.getWeb_view_navigation_data();
    }

    public final NetworkErrorDataDto getNetwork_error_data() {
        return this.surrogate.getNetwork_error_data();
    }

    public final DeviceSecurityEventDataDto getDevice_security_event_data() {
        return this.surrogate.getDevice_security_event_data();
    }

    public final DeviceMetricEventDataDto getDevice_metric_event_data() {
        return this.surrogate.getDevice_metric_event_data();
    }

    public final ArkoseLabsEventDataDto getArkose_labs_event_data() {
        return this.surrogate.getArkose_labs_event_data();
    }

    public final TwilioConversationsSdkEventDataDto getTwilio_conversations_sdk_event_data() {
        return this.surrogate.getTwilio_conversations_sdk_event_data();
    }

    public final PathfinderFallbackToWebViewEventDataDto getPathfinder_fallback_to_web_view_event_data() {
        return this.surrogate.getPathfinder_fallback_to_web_view_event_data();
    }

    public final DeviceApprovalReenrollmentEventDataDto getDevice_approval_reenrollment_event_data() {
        return this.surrogate.getDevice_approval_reenrollment_event_data();
    }

    public final AccountSecurityEventDataDto getAccount_security_event_data() {
        return this.surrogate.getAccount_security_event_data();
    }

    public final CatpayOrderEventDataDto getCatpay_order_data() {
        return this.surrogate.getCatpay_order_data();
    }

    public final HttpCallDataDto getHttp_call_data() {
        return this.surrogate.getHttp_call_data();
    }

    public final PerpetualOrderEventDataDto getPerpetual_order_data() {
        return this.surrogate.getPerpetual_order_data();
    }

    public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
        return this.surrogate.getPerceived_loading_time_event_data();
    }

    public /* synthetic */ RhGlobalAppEventDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, HttpCallDataDto httpCallDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : appEventDataDto, (i & 512) != 0 ? null : screenTransitionEventDataDto, (i & 1024) != 0 ? null : pushNotificationEventDataDto, (i & 2048) != 0 ? null : notificationStackEventDataDto, (i & 4096) != 0 ? null : tabGroupEventDataDto, (i & 8192) != 0 ? null : appSessionEventDataDto, (i & 16384) != 0 ? null : deepLinkEventDataDto, (i & 32768) != 0 ? null : emailEventDataDto, (i & 65536) != 0 ? null : errorEventDataDto, (i & 131072) != 0 ? null : webEventDataDto, (i & 262144) != 0 ? null : userInteractionEventDataDto, (i & 524288) != 0 ? null : performanceMetricEventDataDto, (i & 1048576) != 0 ? null : performanceMetricSpanEventDataDto, (i & 2097152) != 0 ? null : experimentsEventDataDto, (i & 4194304) != 0 ? null : cryptoOrderEventDataDto, (i & 8388608) != 0 ? null : webViewNavigationDataDto, (i & 16777216) != 0 ? null : networkErrorDataDto, (i & 33554432) != 0 ? null : deviceSecurityEventDataDto, (i & 67108864) != 0 ? null : deviceMetricEventDataDto, (i & 134217728) != 0 ? null : arkoseLabsEventDataDto, (i & 268435456) != 0 ? null : twilioConversationsSdkEventDataDto, (i & 536870912) != 0 ? null : pathfinderFallbackToWebViewEventDataDto, (i & 1073741824) != 0 ? null : deviceApprovalReenrollmentEventDataDto, (i & Integer.MIN_VALUE) != 0 ? null : accountSecurityEventDataDto, (i2 & 1) != 0 ? null : catpayOrderEventDataDto, (i2 & 2) != 0 ? null : httpCallDataDto, (i2 & 4) != 0 ? null : perpetualOrderEventDataDto, (i2 & 8) != 0 ? null : perceivedLoadingTimeEventDataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RhGlobalAppEventDto(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, HttpCallDataDto httpCallDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto) {
        this(new Surrogate(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, appEventDataDto, screenTransitionEventDataDto, pushNotificationEventDataDto, notificationStackEventDataDto, tabGroupEventDataDto, appSessionEventDataDto, deepLinkEventDataDto, emailEventDataDto, errorEventDataDto, webEventDataDto, userInteractionEventDataDto, performanceMetricEventDataDto, performanceMetricSpanEventDataDto, experimentsEventDataDto, cryptoOrderEventDataDto, webViewNavigationDataDto, networkErrorDataDto, deviceSecurityEventDataDto, deviceMetricEventDataDto, arkoseLabsEventDataDto, twilioConversationsSdkEventDataDto, pathfinderFallbackToWebViewEventDataDto, deviceApprovalReenrollmentEventDataDto, accountSecurityEventDataDto, catpayOrderEventDataDto, httpCallDataDto, perpetualOrderEventDataDto, perceivedLoadingTimeEventDataDto));
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
    }

    public static /* synthetic */ RhGlobalAppEventDto copy$default(RhGlobalAppEventDto rhGlobalAppEventDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, HttpCallDataDto httpCallDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, int i2, Object obj) {
        PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data;
        PerpetualOrderEventDataDto perpetualOrderEventDataDto2;
        PerformanceMetricEventDataDto performanceMetricEventDataDto2;
        PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto2;
        ExperimentsEventDataDto experimentsEventDataDto2;
        CryptoOrderEventDataDto cryptoOrderEventDataDto2;
        WebViewNavigationDataDto webViewNavigationDataDto2;
        NetworkErrorDataDto networkErrorDataDto2;
        DeviceSecurityEventDataDto deviceSecurityEventDataDto2;
        DeviceMetricEventDataDto deviceMetricEventDataDto2;
        ArkoseLabsEventDataDto arkoseLabsEventDataDto2;
        TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto2;
        PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto2;
        DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto2;
        AccountSecurityEventDataDto accountSecurityEventDataDto2;
        CatpayOrderEventDataDto catpayOrderEventDataDto2;
        HttpCallDataDto httpCallDataDto2;
        DeepLinkEventDataDto deepLinkEventDataDto2;
        String str9;
        String str10;
        String str11;
        String str12;
        AppEventDataDto appEventDataDto2;
        ScreenTransitionEventDataDto screenTransitionEventDataDto2;
        PushNotificationEventDataDto pushNotificationEventDataDto2;
        NotificationStackEventDataDto notificationStackEventDataDto2;
        TabGroupEventDataDto tabGroupEventDataDto2;
        AppSessionEventDataDto appSessionEventDataDto2;
        EmailEventDataDto emailEventDataDto2;
        ErrorEventDataDto errorEventDataDto2;
        WebEventDataDto webEventDataDto2;
        UserInteractionEventDataDto userInteractionEventDataDto2;
        String str13;
        String str14;
        String str15;
        String category = (i & 1) != 0 ? rhGlobalAppEventDto.surrogate.getCategory() : str;
        String event = (i & 2) != 0 ? rhGlobalAppEventDto.surrogate.getEvent() : str2;
        String nav_tab = (i & 4) != 0 ? rhGlobalAppEventDto.surrogate.getNav_tab() : str3;
        String experiments = (i & 8) != 0 ? rhGlobalAppEventDto.surrogate.getExperiments() : str4;
        String session_id = (i & 16) != 0 ? rhGlobalAppEventDto.surrogate.getSession_id() : str5;
        String url = (i & 32) != 0 ? rhGlobalAppEventDto.surrogate.getUrl() : str6;
        String web_referrer = (i & 64) != 0 ? rhGlobalAppEventDto.surrogate.getWeb_referrer() : str7;
        String web_referrer_host = (i & 128) != 0 ? rhGlobalAppEventDto.surrogate.getWeb_referrer_host() : str8;
        AppEventDataDto data = (i & 256) != 0 ? rhGlobalAppEventDto.surrogate.getData() : appEventDataDto;
        ScreenTransitionEventDataDto screen_data = (i & 512) != 0 ? rhGlobalAppEventDto.surrogate.getScreen_data() : screenTransitionEventDataDto;
        PushNotificationEventDataDto push_notification_data = (i & 1024) != 0 ? rhGlobalAppEventDto.surrogate.getPush_notification_data() : pushNotificationEventDataDto;
        NotificationStackEventDataDto notification_stack_data = (i & 2048) != 0 ? rhGlobalAppEventDto.surrogate.getNotification_stack_data() : notificationStackEventDataDto;
        TabGroupEventDataDto tab_group_data = (i & 4096) != 0 ? rhGlobalAppEventDto.surrogate.getTab_group_data() : tabGroupEventDataDto;
        AppSessionEventDataDto app_session_data = (i & 8192) != 0 ? rhGlobalAppEventDto.surrogate.getApp_session_data() : appSessionEventDataDto;
        String str16 = category;
        DeepLinkEventDataDto deep_link_data = (i & 16384) != 0 ? rhGlobalAppEventDto.surrogate.getDeep_link_data() : deepLinkEventDataDto;
        EmailEventDataDto email_data = (i & 32768) != 0 ? rhGlobalAppEventDto.surrogate.getEmail_data() : emailEventDataDto;
        ErrorEventDataDto error_data = (i & 65536) != 0 ? rhGlobalAppEventDto.surrogate.getError_data() : errorEventDataDto;
        WebEventDataDto web_data = (i & 131072) != 0 ? rhGlobalAppEventDto.surrogate.getWeb_data() : webEventDataDto;
        UserInteractionEventDataDto user_interaction_event_data = (i & 262144) != 0 ? rhGlobalAppEventDto.surrogate.getUser_interaction_event_data() : userInteractionEventDataDto;
        PerformanceMetricEventDataDto performance_metric_event_data = (i & 524288) != 0 ? rhGlobalAppEventDto.surrogate.getPerformance_metric_event_data() : performanceMetricEventDataDto;
        PerformanceMetricSpanEventDataDto performance_metric_span_event_data = (i & 1048576) != 0 ? rhGlobalAppEventDto.surrogate.getPerformance_metric_span_event_data() : performanceMetricSpanEventDataDto;
        ExperimentsEventDataDto experiments_data = (i & 2097152) != 0 ? rhGlobalAppEventDto.surrogate.getExperiments_data() : experimentsEventDataDto;
        CryptoOrderEventDataDto crypto_order_data = (i & 4194304) != 0 ? rhGlobalAppEventDto.surrogate.getCrypto_order_data() : cryptoOrderEventDataDto;
        WebViewNavigationDataDto web_view_navigation_data = (i & 8388608) != 0 ? rhGlobalAppEventDto.surrogate.getWeb_view_navigation_data() : webViewNavigationDataDto;
        NetworkErrorDataDto network_error_data = (i & 16777216) != 0 ? rhGlobalAppEventDto.surrogate.getNetwork_error_data() : networkErrorDataDto;
        DeviceSecurityEventDataDto device_security_event_data = (i & 33554432) != 0 ? rhGlobalAppEventDto.surrogate.getDevice_security_event_data() : deviceSecurityEventDataDto;
        DeviceMetricEventDataDto device_metric_event_data = (i & 67108864) != 0 ? rhGlobalAppEventDto.surrogate.getDevice_metric_event_data() : deviceMetricEventDataDto;
        ArkoseLabsEventDataDto arkose_labs_event_data = (i & 134217728) != 0 ? rhGlobalAppEventDto.surrogate.getArkose_labs_event_data() : arkoseLabsEventDataDto;
        TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data = (i & 268435456) != 0 ? rhGlobalAppEventDto.surrogate.getTwilio_conversations_sdk_event_data() : twilioConversationsSdkEventDataDto;
        PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data = (i & 536870912) != 0 ? rhGlobalAppEventDto.surrogate.getPathfinder_fallback_to_web_view_event_data() : pathfinderFallbackToWebViewEventDataDto;
        DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data = (i & 1073741824) != 0 ? rhGlobalAppEventDto.surrogate.getDevice_approval_reenrollment_event_data() : deviceApprovalReenrollmentEventDataDto;
        AccountSecurityEventDataDto account_security_event_data = (i & Integer.MIN_VALUE) != 0 ? rhGlobalAppEventDto.surrogate.getAccount_security_event_data() : accountSecurityEventDataDto;
        CatpayOrderEventDataDto catpay_order_data = (i2 & 1) != 0 ? rhGlobalAppEventDto.surrogate.getCatpay_order_data() : catpayOrderEventDataDto;
        HttpCallDataDto http_call_data = (i2 & 2) != 0 ? rhGlobalAppEventDto.surrogate.getHttp_call_data() : httpCallDataDto;
        PerpetualOrderEventDataDto perpetual_order_data = (i2 & 4) != 0 ? rhGlobalAppEventDto.surrogate.getPerpetual_order_data() : perpetualOrderEventDataDto;
        if ((i2 & 8) != 0) {
            perpetualOrderEventDataDto2 = perpetual_order_data;
            perceived_loading_time_event_data = rhGlobalAppEventDto.surrogate.getPerceived_loading_time_event_data();
            performanceMetricSpanEventDataDto2 = performance_metric_span_event_data;
            experimentsEventDataDto2 = experiments_data;
            cryptoOrderEventDataDto2 = crypto_order_data;
            webViewNavigationDataDto2 = web_view_navigation_data;
            networkErrorDataDto2 = network_error_data;
            deviceSecurityEventDataDto2 = device_security_event_data;
            deviceMetricEventDataDto2 = device_metric_event_data;
            arkoseLabsEventDataDto2 = arkose_labs_event_data;
            twilioConversationsSdkEventDataDto2 = twilio_conversations_sdk_event_data;
            pathfinderFallbackToWebViewEventDataDto2 = pathfinder_fallback_to_web_view_event_data;
            deviceApprovalReenrollmentEventDataDto2 = device_approval_reenrollment_event_data;
            accountSecurityEventDataDto2 = account_security_event_data;
            catpayOrderEventDataDto2 = catpay_order_data;
            httpCallDataDto2 = http_call_data;
            deepLinkEventDataDto2 = deep_link_data;
            str10 = url;
            str11 = web_referrer;
            str12 = web_referrer_host;
            appEventDataDto2 = data;
            screenTransitionEventDataDto2 = screen_data;
            pushNotificationEventDataDto2 = push_notification_data;
            notificationStackEventDataDto2 = notification_stack_data;
            tabGroupEventDataDto2 = tab_group_data;
            appSessionEventDataDto2 = app_session_data;
            emailEventDataDto2 = email_data;
            errorEventDataDto2 = error_data;
            webEventDataDto2 = web_data;
            userInteractionEventDataDto2 = user_interaction_event_data;
            performanceMetricEventDataDto2 = performance_metric_event_data;
            str13 = event;
            str14 = nav_tab;
            str15 = experiments;
            str9 = session_id;
        } else {
            perceived_loading_time_event_data = perceivedLoadingTimeEventDataDto;
            perpetualOrderEventDataDto2 = perpetual_order_data;
            performanceMetricEventDataDto2 = performance_metric_event_data;
            performanceMetricSpanEventDataDto2 = performance_metric_span_event_data;
            experimentsEventDataDto2 = experiments_data;
            cryptoOrderEventDataDto2 = crypto_order_data;
            webViewNavigationDataDto2 = web_view_navigation_data;
            networkErrorDataDto2 = network_error_data;
            deviceSecurityEventDataDto2 = device_security_event_data;
            deviceMetricEventDataDto2 = device_metric_event_data;
            arkoseLabsEventDataDto2 = arkose_labs_event_data;
            twilioConversationsSdkEventDataDto2 = twilio_conversations_sdk_event_data;
            pathfinderFallbackToWebViewEventDataDto2 = pathfinder_fallback_to_web_view_event_data;
            deviceApprovalReenrollmentEventDataDto2 = device_approval_reenrollment_event_data;
            accountSecurityEventDataDto2 = account_security_event_data;
            catpayOrderEventDataDto2 = catpay_order_data;
            httpCallDataDto2 = http_call_data;
            deepLinkEventDataDto2 = deep_link_data;
            str9 = session_id;
            str10 = url;
            str11 = web_referrer;
            str12 = web_referrer_host;
            appEventDataDto2 = data;
            screenTransitionEventDataDto2 = screen_data;
            pushNotificationEventDataDto2 = push_notification_data;
            notificationStackEventDataDto2 = notification_stack_data;
            tabGroupEventDataDto2 = tab_group_data;
            appSessionEventDataDto2 = app_session_data;
            emailEventDataDto2 = email_data;
            errorEventDataDto2 = error_data;
            webEventDataDto2 = web_data;
            userInteractionEventDataDto2 = user_interaction_event_data;
            str13 = event;
            str14 = nav_tab;
            str15 = experiments;
        }
        return rhGlobalAppEventDto.copy(str16, str13, str14, str15, str9, str10, str11, str12, appEventDataDto2, screenTransitionEventDataDto2, pushNotificationEventDataDto2, notificationStackEventDataDto2, tabGroupEventDataDto2, appSessionEventDataDto2, deepLinkEventDataDto2, emailEventDataDto2, errorEventDataDto2, webEventDataDto2, userInteractionEventDataDto2, performanceMetricEventDataDto2, performanceMetricSpanEventDataDto2, experimentsEventDataDto2, cryptoOrderEventDataDto2, webViewNavigationDataDto2, networkErrorDataDto2, deviceSecurityEventDataDto2, deviceMetricEventDataDto2, arkoseLabsEventDataDto2, twilioConversationsSdkEventDataDto2, pathfinderFallbackToWebViewEventDataDto2, deviceApprovalReenrollmentEventDataDto2, accountSecurityEventDataDto2, catpayOrderEventDataDto2, httpCallDataDto2, perpetualOrderEventDataDto2, perceived_loading_time_event_data);
    }

    public final RhGlobalAppEventDto copy(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventDataDto data, ScreenTransitionEventDataDto screen_data, PushNotificationEventDataDto push_notification_data, NotificationStackEventDataDto notification_stack_data, TabGroupEventDataDto tab_group_data, AppSessionEventDataDto app_session_data, DeepLinkEventDataDto deep_link_data, EmailEventDataDto email_data, ErrorEventDataDto error_data, WebEventDataDto web_data, UserInteractionEventDataDto user_interaction_event_data, PerformanceMetricEventDataDto performance_metric_event_data, PerformanceMetricSpanEventDataDto performance_metric_span_event_data, ExperimentsEventDataDto experiments_data, CryptoOrderEventDataDto crypto_order_data, WebViewNavigationDataDto web_view_navigation_data, NetworkErrorDataDto network_error_data, DeviceSecurityEventDataDto device_security_event_data, DeviceMetricEventDataDto device_metric_event_data, ArkoseLabsEventDataDto arkose_labs_event_data, TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data, PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data, DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data, AccountSecurityEventDataDto account_security_event_data, CatpayOrderEventDataDto catpay_order_data, HttpCallDataDto http_call_data, PerpetualOrderEventDataDto perpetual_order_data, PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
        return new RhGlobalAppEventDto(new Surrogate(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, data, screen_data, push_notification_data, notification_stack_data, tab_group_data, app_session_data, deep_link_data, email_data, error_data, web_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, experiments_data, crypto_order_data, web_view_navigation_data, network_error_data, device_security_event_data, device_metric_event_data, arkose_labs_event_data, twilio_conversations_sdk_event_data, pathfinder_fallback_to_web_view_event_data, device_approval_reenrollment_event_data, account_security_event_data, catpay_order_data, http_call_data, perpetual_order_data, perceived_loading_time_event_data));
    }

    @Override // com.robinhood.idl.Dto
    public RhGlobalAppEvent toProto() {
        String category = this.surrogate.getCategory();
        String event = this.surrogate.getEvent();
        String nav_tab = this.surrogate.getNav_tab();
        String experiments = this.surrogate.getExperiments();
        String session_id = this.surrogate.getSession_id();
        String url = this.surrogate.getUrl();
        String web_referrer = this.surrogate.getWeb_referrer();
        String web_referrer_host = this.surrogate.getWeb_referrer_host();
        AppEventDataDto data = this.surrogate.getData();
        AppEventData proto = data != null ? data.toProto() : null;
        ScreenTransitionEventDataDto screen_data = this.surrogate.getScreen_data();
        ScreenTransitionEventData proto2 = screen_data != null ? screen_data.toProto() : null;
        PushNotificationEventDataDto push_notification_data = this.surrogate.getPush_notification_data();
        PushNotificationEventData proto3 = push_notification_data != null ? push_notification_data.toProto() : null;
        NotificationStackEventDataDto notification_stack_data = this.surrogate.getNotification_stack_data();
        NotificationStackEventData proto4 = notification_stack_data != null ? notification_stack_data.toProto() : null;
        TabGroupEventDataDto tab_group_data = this.surrogate.getTab_group_data();
        TabGroupEventData proto5 = tab_group_data != null ? tab_group_data.toProto() : null;
        AppSessionEventDataDto app_session_data = this.surrogate.getApp_session_data();
        AppSessionEventData proto6 = app_session_data != null ? app_session_data.toProto() : null;
        DeepLinkEventDataDto deep_link_data = this.surrogate.getDeep_link_data();
        DeepLinkEventData proto7 = deep_link_data != null ? deep_link_data.toProto() : null;
        EmailEventDataDto email_data = this.surrogate.getEmail_data();
        EmailEventData proto8 = email_data != null ? email_data.toProto() : null;
        ErrorEventDataDto error_data = this.surrogate.getError_data();
        ErrorEventData proto9 = error_data != null ? error_data.toProto() : null;
        WebEventDataDto web_data = this.surrogate.getWeb_data();
        WebEventData proto10 = web_data != null ? web_data.toProto() : null;
        UserInteractionEventDataDto user_interaction_event_data = this.surrogate.getUser_interaction_event_data();
        UserInteractionEventData proto11 = user_interaction_event_data != null ? user_interaction_event_data.toProto() : null;
        PerformanceMetricEventDataDto performance_metric_event_data = this.surrogate.getPerformance_metric_event_data();
        PerformanceMetricEventData proto12 = performance_metric_event_data != null ? performance_metric_event_data.toProto() : null;
        PerformanceMetricSpanEventDataDto performance_metric_span_event_data = this.surrogate.getPerformance_metric_span_event_data();
        PerformanceMetricSpanEventData proto13 = performance_metric_span_event_data != null ? performance_metric_span_event_data.toProto() : null;
        ExperimentsEventDataDto experiments_data = this.surrogate.getExperiments_data();
        ExperimentsEventData proto14 = experiments_data != null ? experiments_data.toProto() : null;
        CryptoOrderEventDataDto crypto_order_data = this.surrogate.getCrypto_order_data();
        CryptoOrderEventData proto15 = crypto_order_data != null ? crypto_order_data.toProto() : null;
        WebViewNavigationDataDto web_view_navigation_data = this.surrogate.getWeb_view_navigation_data();
        WebViewNavigationData proto16 = web_view_navigation_data != null ? web_view_navigation_data.toProto() : null;
        NetworkErrorDataDto network_error_data = this.surrogate.getNetwork_error_data();
        NetworkErrorData proto17 = network_error_data != null ? network_error_data.toProto() : null;
        DeviceSecurityEventDataDto device_security_event_data = this.surrogate.getDevice_security_event_data();
        DeviceSecurityEventData proto18 = device_security_event_data != null ? device_security_event_data.toProto() : null;
        DeviceMetricEventDataDto device_metric_event_data = this.surrogate.getDevice_metric_event_data();
        DeviceMetricEventData proto19 = device_metric_event_data != null ? device_metric_event_data.toProto() : null;
        ArkoseLabsEventDataDto arkose_labs_event_data = this.surrogate.getArkose_labs_event_data();
        ArkoseLabsEventData proto20 = arkose_labs_event_data != null ? arkose_labs_event_data.toProto() : null;
        TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data = this.surrogate.getTwilio_conversations_sdk_event_data();
        TwilioConversationsSdkEventData proto21 = twilio_conversations_sdk_event_data != null ? twilio_conversations_sdk_event_data.toProto() : null;
        PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data = this.surrogate.getPathfinder_fallback_to_web_view_event_data();
        PathfinderFallbackToWebViewEventData proto22 = pathfinder_fallback_to_web_view_event_data != null ? pathfinder_fallback_to_web_view_event_data.toProto() : null;
        DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data = this.surrogate.getDevice_approval_reenrollment_event_data();
        DeviceApprovalReenrollmentEventData proto23 = device_approval_reenrollment_event_data != null ? device_approval_reenrollment_event_data.toProto() : null;
        AccountSecurityEventDataDto account_security_event_data = this.surrogate.getAccount_security_event_data();
        AccountSecurityEventData proto24 = account_security_event_data != null ? account_security_event_data.toProto() : null;
        CatpayOrderEventDataDto catpay_order_data = this.surrogate.getCatpay_order_data();
        CatpayOrderEventData proto25 = catpay_order_data != null ? catpay_order_data.toProto() : null;
        HttpCallDataDto http_call_data = this.surrogate.getHttp_call_data();
        HttpCallData proto26 = http_call_data != null ? http_call_data.toProto() : null;
        PerpetualOrderEventDataDto perpetual_order_data = this.surrogate.getPerpetual_order_data();
        PerpetualOrderEventData proto27 = perpetual_order_data != null ? perpetual_order_data.toProto() : null;
        PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data = this.surrogate.getPerceived_loading_time_event_data();
        return new RhGlobalAppEvent(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, proto18, proto19, proto20, proto21, proto22, proto23, proto24, proto25, proto26, proto27, perceived_loading_time_event_data != null ? perceived_loading_time_event_data.toProto() : null, null, 0, 16, null);
    }

    public String toString() {
        return "[RhGlobalAppEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RhGlobalAppEventDto) && Intrinsics.areEqual(((RhGlobalAppEventDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RhGlobalAppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000ë\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u008d\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ä\u00012\u00020\u0001:\u0004ã\u0001ä\u0001B§\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B¢\u0006\u0004\bC\u0010DB\u008b\u0003\b\u0010\u0012\u0006\u0010E\u001a\u00020F\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u000102\u0012\b\u00103\u001a\u0004\u0018\u000104\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\b\u0010=\u001a\u0004\u0018\u00010>\u0012\b\u0010?\u001a\u0004\u0018\u00010@\u0012\b\u0010A\u001a\u0004\u0018\u00010B\u0012\b\u0010H\u001a\u0004\u0018\u00010I¢\u0006\u0004\bC\u0010JJ\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010.HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010>HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010@HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010BHÆ\u0003Jª\u0003\u0010Õ\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010BHÆ\u0001J\u0016\u0010Ö\u0001\u001a\u00030×\u00012\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ù\u0001\u001a\u00020FHÖ\u0001J\n\u0010Ú\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010Û\u0001\u001a\u00030Ü\u00012\u0007\u0010Ý\u0001\u001a\u00020\u00002\b\u0010Þ\u0001\u001a\u00030ß\u00012\b\u0010à\u0001\u001a\u00030á\u0001H\u0001¢\u0006\u0003\bâ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010L\u001a\u0004\bR\u0010NR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010L\u001a\u0004\bT\u0010NR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010L\u001a\u0004\bV\u0010NR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010L\u001a\u0004\bX\u0010NR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010L\u001a\u0004\bZ\u0010NR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010L\u001a\u0004\b\\\u0010NR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010L\u001a\u0004\b^\u0010_R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010L\u001a\u0004\ba\u0010bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u0010L\u001a\u0004\bd\u0010eR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u0010L\u001a\u0004\bg\u0010hR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bi\u0010L\u001a\u0004\bj\u0010kR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bl\u0010L\u001a\u0004\bm\u0010nR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bo\u0010L\u001a\u0004\bp\u0010qR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u0010L\u001a\u0004\bs\u0010tR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010L\u001a\u0004\bv\u0010wR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bx\u0010L\u001a\u0004\by\u0010zR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u0010L\u001a\u0004\b|\u0010}R\u001f\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u000f\n\u0000\u0012\u0004\b~\u0010L\u001a\u0005\b\u007f\u0010\u0080\u0001R!\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0081\u0001\u0010L\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R!\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0084\u0001\u0010L\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R!\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0087\u0001\u0010L\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R!\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008a\u0001\u0010L\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008d\u0001\u0010L\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0090\u0001\u0010L\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0093\u0001\u0010L\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0096\u0001\u0010L\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R!\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0099\u0001\u0010L\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R!\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009c\u0001\u0010L\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009f\u0001\u0010L\u001a\u0006\b \u0001\u0010¡\u0001R!\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¢\u0001\u0010L\u001a\u0006\b£\u0001\u0010¤\u0001R!\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¥\u0001\u0010L\u001a\u0006\b¦\u0001\u0010§\u0001R!\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¨\u0001\u0010L\u001a\u0006\b©\u0001\u0010ª\u0001R!\u0010?\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b«\u0001\u0010L\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R!\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b®\u0001\u0010L\u001a\u0006\b¯\u0001\u0010°\u0001¨\u0006å\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$Surrogate;", "", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "nav_tab", "experiments", "session_id", "url", "web_referrer", "web_referrer_host", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "screen_data", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "push_notification_data", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "notification_stack_data", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "tab_group_data", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "app_session_data", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "deep_link_data", "Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "email_data", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "error_data", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "web_data", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "user_interaction_event_data", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "performance_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "performance_metric_span_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "experiments_data", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "crypto_order_data", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "web_view_navigation_data", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "network_error_data", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "device_security_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "device_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "arkose_labs_event_data", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "twilio_conversations_sdk_event_data", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "pathfinder_fallback_to_web_view_event_data", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "device_approval_reenrollment_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;", "account_security_event_data", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "catpay_order_data", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "http_call_data", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "perpetual_order_data", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;", "perceived_loading_time_event_data", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;)V", "seen0", "", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCategory$annotations", "()V", "getCategory", "()Ljava/lang/String;", "getEvent$annotations", "getEvent", "getNav_tab$annotations", "getNav_tab", "getExperiments$annotations", "getExperiments", "getSession_id$annotations", "getSession_id", "getUrl$annotations", "getUrl", "getWeb_referrer$annotations", "getWeb_referrer", "getWeb_referrer_host$annotations", "getWeb_referrer_host", "getData$annotations", "getData", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "getScreen_data$annotations", "getScreen_data", "()Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "getPush_notification_data$annotations", "getPush_notification_data", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "getNotification_stack_data$annotations", "getNotification_stack_data", "()Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "getTab_group_data$annotations", "getTab_group_data", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "getApp_session_data$annotations", "getApp_session_data", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "getDeep_link_data$annotations", "getDeep_link_data", "()Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "getEmail_data$annotations", "getEmail_data", "()Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "getError_data$annotations", "getError_data", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "getWeb_data$annotations", "getWeb_data", "()Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "getUser_interaction_event_data$annotations", "getUser_interaction_event_data", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "getPerformance_metric_event_data$annotations", "getPerformance_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "getPerformance_metric_span_event_data$annotations", "getPerformance_metric_span_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "getExperiments_data$annotations", "getExperiments_data", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "getCrypto_order_data$annotations", "getCrypto_order_data", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "getWeb_view_navigation_data$annotations", "getWeb_view_navigation_data", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "getNetwork_error_data$annotations", "getNetwork_error_data", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "getDevice_security_event_data$annotations", "getDevice_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "getDevice_metric_event_data$annotations", "getDevice_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "getArkose_labs_event_data$annotations", "getArkose_labs_event_data", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "getTwilio_conversations_sdk_event_data$annotations", "getTwilio_conversations_sdk_event_data", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "getPathfinder_fallback_to_web_view_event_data$annotations", "getPathfinder_fallback_to_web_view_event_data", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "getDevice_approval_reenrollment_event_data$annotations", "getDevice_approval_reenrollment_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;", "getAccount_security_event_data$annotations", "getAccount_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "getCatpay_order_data$annotations", "getCatpay_order_data", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "getHttp_call_data$annotations", "getHttp_call_data", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "getPerpetual_order_data$annotations", "getPerpetual_order_data", "()Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;", "getPerceived_loading_time_event_data$annotations", "getPerceived_loading_time_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AccountSecurityEventDataDto account_security_event_data;
        private final AppSessionEventDataDto app_session_data;
        private final ArkoseLabsEventDataDto arkose_labs_event_data;
        private final String category;
        private final CatpayOrderEventDataDto catpay_order_data;
        private final CryptoOrderEventDataDto crypto_order_data;
        private final AppEventDataDto data;
        private final DeepLinkEventDataDto deep_link_data;
        private final DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data;
        private final DeviceMetricEventDataDto device_metric_event_data;
        private final DeviceSecurityEventDataDto device_security_event_data;
        private final EmailEventDataDto email_data;
        private final ErrorEventDataDto error_data;
        private final String event;
        private final String experiments;
        private final ExperimentsEventDataDto experiments_data;
        private final HttpCallDataDto http_call_data;
        private final String nav_tab;
        private final NetworkErrorDataDto network_error_data;
        private final NotificationStackEventDataDto notification_stack_data;
        private final PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data;
        private final PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data;
        private final PerformanceMetricEventDataDto performance_metric_event_data;
        private final PerformanceMetricSpanEventDataDto performance_metric_span_event_data;
        private final PerpetualOrderEventDataDto perpetual_order_data;
        private final PushNotificationEventDataDto push_notification_data;
        private final ScreenTransitionEventDataDto screen_data;
        private final String session_id;
        private final TabGroupEventDataDto tab_group_data;
        private final TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data;
        private final String url;
        private final UserInteractionEventDataDto user_interaction_event_data;
        private final WebEventDataDto web_data;
        private final String web_referrer;
        private final String web_referrer_host;
        private final WebViewNavigationDataDto web_view_navigation_data;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AppEventDataDto) null, (ScreenTransitionEventDataDto) null, (PushNotificationEventDataDto) null, (NotificationStackEventDataDto) null, (TabGroupEventDataDto) null, (AppSessionEventDataDto) null, (DeepLinkEventDataDto) null, (EmailEventDataDto) null, (ErrorEventDataDto) null, (WebEventDataDto) null, (UserInteractionEventDataDto) null, (PerformanceMetricEventDataDto) null, (PerformanceMetricSpanEventDataDto) null, (ExperimentsEventDataDto) null, (CryptoOrderEventDataDto) null, (WebViewNavigationDataDto) null, (NetworkErrorDataDto) null, (DeviceSecurityEventDataDto) null, (DeviceMetricEventDataDto) null, (ArkoseLabsEventDataDto) null, (TwilioConversationsSdkEventDataDto) null, (PathfinderFallbackToWebViewEventDataDto) null, (DeviceApprovalReenrollmentEventDataDto) null, (AccountSecurityEventDataDto) null, (CatpayOrderEventDataDto) null, (HttpCallDataDto) null, (PerpetualOrderEventDataDto) null, (PerceivedLoadingTimeEventDataDto) null, -1, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, HttpCallDataDto httpCallDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, int i2, Object obj) {
            PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto2;
            PerpetualOrderEventDataDto perpetualOrderEventDataDto2;
            PerformanceMetricEventDataDto performanceMetricEventDataDto2;
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto2;
            ExperimentsEventDataDto experimentsEventDataDto2;
            CryptoOrderEventDataDto cryptoOrderEventDataDto2;
            WebViewNavigationDataDto webViewNavigationDataDto2;
            NetworkErrorDataDto networkErrorDataDto2;
            DeviceSecurityEventDataDto deviceSecurityEventDataDto2;
            DeviceMetricEventDataDto deviceMetricEventDataDto2;
            ArkoseLabsEventDataDto arkoseLabsEventDataDto2;
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto2;
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto2;
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto2;
            AccountSecurityEventDataDto accountSecurityEventDataDto2;
            CatpayOrderEventDataDto catpayOrderEventDataDto2;
            HttpCallDataDto httpCallDataDto2;
            DeepLinkEventDataDto deepLinkEventDataDto2;
            String str9;
            String str10;
            String str11;
            String str12;
            AppEventDataDto appEventDataDto2;
            ScreenTransitionEventDataDto screenTransitionEventDataDto2;
            PushNotificationEventDataDto pushNotificationEventDataDto2;
            NotificationStackEventDataDto notificationStackEventDataDto2;
            TabGroupEventDataDto tabGroupEventDataDto2;
            AppSessionEventDataDto appSessionEventDataDto2;
            EmailEventDataDto emailEventDataDto2;
            ErrorEventDataDto errorEventDataDto2;
            WebEventDataDto webEventDataDto2;
            UserInteractionEventDataDto userInteractionEventDataDto2;
            String str13;
            String str14;
            String str15;
            String str16 = (i & 1) != 0 ? surrogate.category : str;
            String str17 = (i & 2) != 0 ? surrogate.event : str2;
            String str18 = (i & 4) != 0 ? surrogate.nav_tab : str3;
            String str19 = (i & 8) != 0 ? surrogate.experiments : str4;
            String str20 = (i & 16) != 0 ? surrogate.session_id : str5;
            String str21 = (i & 32) != 0 ? surrogate.url : str6;
            String str22 = (i & 64) != 0 ? surrogate.web_referrer : str7;
            String str23 = (i & 128) != 0 ? surrogate.web_referrer_host : str8;
            AppEventDataDto appEventDataDto3 = (i & 256) != 0 ? surrogate.data : appEventDataDto;
            ScreenTransitionEventDataDto screenTransitionEventDataDto3 = (i & 512) != 0 ? surrogate.screen_data : screenTransitionEventDataDto;
            PushNotificationEventDataDto pushNotificationEventDataDto3 = (i & 1024) != 0 ? surrogate.push_notification_data : pushNotificationEventDataDto;
            NotificationStackEventDataDto notificationStackEventDataDto3 = (i & 2048) != 0 ? surrogate.notification_stack_data : notificationStackEventDataDto;
            TabGroupEventDataDto tabGroupEventDataDto3 = (i & 4096) != 0 ? surrogate.tab_group_data : tabGroupEventDataDto;
            AppSessionEventDataDto appSessionEventDataDto3 = (i & 8192) != 0 ? surrogate.app_session_data : appSessionEventDataDto;
            String str24 = str16;
            DeepLinkEventDataDto deepLinkEventDataDto3 = (i & 16384) != 0 ? surrogate.deep_link_data : deepLinkEventDataDto;
            EmailEventDataDto emailEventDataDto3 = (i & 32768) != 0 ? surrogate.email_data : emailEventDataDto;
            ErrorEventDataDto errorEventDataDto3 = (i & 65536) != 0 ? surrogate.error_data : errorEventDataDto;
            WebEventDataDto webEventDataDto3 = (i & 131072) != 0 ? surrogate.web_data : webEventDataDto;
            UserInteractionEventDataDto userInteractionEventDataDto3 = (i & 262144) != 0 ? surrogate.user_interaction_event_data : userInteractionEventDataDto;
            PerformanceMetricEventDataDto performanceMetricEventDataDto3 = (i & 524288) != 0 ? surrogate.performance_metric_event_data : performanceMetricEventDataDto;
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto3 = (i & 1048576) != 0 ? surrogate.performance_metric_span_event_data : performanceMetricSpanEventDataDto;
            ExperimentsEventDataDto experimentsEventDataDto3 = (i & 2097152) != 0 ? surrogate.experiments_data : experimentsEventDataDto;
            CryptoOrderEventDataDto cryptoOrderEventDataDto3 = (i & 4194304) != 0 ? surrogate.crypto_order_data : cryptoOrderEventDataDto;
            WebViewNavigationDataDto webViewNavigationDataDto3 = (i & 8388608) != 0 ? surrogate.web_view_navigation_data : webViewNavigationDataDto;
            NetworkErrorDataDto networkErrorDataDto3 = (i & 16777216) != 0 ? surrogate.network_error_data : networkErrorDataDto;
            DeviceSecurityEventDataDto deviceSecurityEventDataDto3 = (i & 33554432) != 0 ? surrogate.device_security_event_data : deviceSecurityEventDataDto;
            DeviceMetricEventDataDto deviceMetricEventDataDto3 = (i & 67108864) != 0 ? surrogate.device_metric_event_data : deviceMetricEventDataDto;
            ArkoseLabsEventDataDto arkoseLabsEventDataDto3 = (i & 134217728) != 0 ? surrogate.arkose_labs_event_data : arkoseLabsEventDataDto;
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto3 = (i & 268435456) != 0 ? surrogate.twilio_conversations_sdk_event_data : twilioConversationsSdkEventDataDto;
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto3 = (i & 536870912) != 0 ? surrogate.pathfinder_fallback_to_web_view_event_data : pathfinderFallbackToWebViewEventDataDto;
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto3 = (i & 1073741824) != 0 ? surrogate.device_approval_reenrollment_event_data : deviceApprovalReenrollmentEventDataDto;
            AccountSecurityEventDataDto accountSecurityEventDataDto3 = (i & Integer.MIN_VALUE) != 0 ? surrogate.account_security_event_data : accountSecurityEventDataDto;
            CatpayOrderEventDataDto catpayOrderEventDataDto3 = (i2 & 1) != 0 ? surrogate.catpay_order_data : catpayOrderEventDataDto;
            HttpCallDataDto httpCallDataDto3 = (i2 & 2) != 0 ? surrogate.http_call_data : httpCallDataDto;
            PerpetualOrderEventDataDto perpetualOrderEventDataDto3 = (i2 & 4) != 0 ? surrogate.perpetual_order_data : perpetualOrderEventDataDto;
            if ((i2 & 8) != 0) {
                perpetualOrderEventDataDto2 = perpetualOrderEventDataDto3;
                perceivedLoadingTimeEventDataDto2 = surrogate.perceived_loading_time_event_data;
                performanceMetricSpanEventDataDto2 = performanceMetricSpanEventDataDto3;
                experimentsEventDataDto2 = experimentsEventDataDto3;
                cryptoOrderEventDataDto2 = cryptoOrderEventDataDto3;
                webViewNavigationDataDto2 = webViewNavigationDataDto3;
                networkErrorDataDto2 = networkErrorDataDto3;
                deviceSecurityEventDataDto2 = deviceSecurityEventDataDto3;
                deviceMetricEventDataDto2 = deviceMetricEventDataDto3;
                arkoseLabsEventDataDto2 = arkoseLabsEventDataDto3;
                twilioConversationsSdkEventDataDto2 = twilioConversationsSdkEventDataDto3;
                pathfinderFallbackToWebViewEventDataDto2 = pathfinderFallbackToWebViewEventDataDto3;
                deviceApprovalReenrollmentEventDataDto2 = deviceApprovalReenrollmentEventDataDto3;
                accountSecurityEventDataDto2 = accountSecurityEventDataDto3;
                catpayOrderEventDataDto2 = catpayOrderEventDataDto3;
                httpCallDataDto2 = httpCallDataDto3;
                deepLinkEventDataDto2 = deepLinkEventDataDto3;
                str10 = str21;
                str11 = str22;
                str12 = str23;
                appEventDataDto2 = appEventDataDto3;
                screenTransitionEventDataDto2 = screenTransitionEventDataDto3;
                pushNotificationEventDataDto2 = pushNotificationEventDataDto3;
                notificationStackEventDataDto2 = notificationStackEventDataDto3;
                tabGroupEventDataDto2 = tabGroupEventDataDto3;
                appSessionEventDataDto2 = appSessionEventDataDto3;
                emailEventDataDto2 = emailEventDataDto3;
                errorEventDataDto2 = errorEventDataDto3;
                webEventDataDto2 = webEventDataDto3;
                userInteractionEventDataDto2 = userInteractionEventDataDto3;
                performanceMetricEventDataDto2 = performanceMetricEventDataDto3;
                str13 = str17;
                str14 = str18;
                str15 = str19;
                str9 = str20;
            } else {
                perceivedLoadingTimeEventDataDto2 = perceivedLoadingTimeEventDataDto;
                perpetualOrderEventDataDto2 = perpetualOrderEventDataDto3;
                performanceMetricEventDataDto2 = performanceMetricEventDataDto3;
                performanceMetricSpanEventDataDto2 = performanceMetricSpanEventDataDto3;
                experimentsEventDataDto2 = experimentsEventDataDto3;
                cryptoOrderEventDataDto2 = cryptoOrderEventDataDto3;
                webViewNavigationDataDto2 = webViewNavigationDataDto3;
                networkErrorDataDto2 = networkErrorDataDto3;
                deviceSecurityEventDataDto2 = deviceSecurityEventDataDto3;
                deviceMetricEventDataDto2 = deviceMetricEventDataDto3;
                arkoseLabsEventDataDto2 = arkoseLabsEventDataDto3;
                twilioConversationsSdkEventDataDto2 = twilioConversationsSdkEventDataDto3;
                pathfinderFallbackToWebViewEventDataDto2 = pathfinderFallbackToWebViewEventDataDto3;
                deviceApprovalReenrollmentEventDataDto2 = deviceApprovalReenrollmentEventDataDto3;
                accountSecurityEventDataDto2 = accountSecurityEventDataDto3;
                catpayOrderEventDataDto2 = catpayOrderEventDataDto3;
                httpCallDataDto2 = httpCallDataDto3;
                deepLinkEventDataDto2 = deepLinkEventDataDto3;
                str9 = str20;
                str10 = str21;
                str11 = str22;
                str12 = str23;
                appEventDataDto2 = appEventDataDto3;
                screenTransitionEventDataDto2 = screenTransitionEventDataDto3;
                pushNotificationEventDataDto2 = pushNotificationEventDataDto3;
                notificationStackEventDataDto2 = notificationStackEventDataDto3;
                tabGroupEventDataDto2 = tabGroupEventDataDto3;
                appSessionEventDataDto2 = appSessionEventDataDto3;
                emailEventDataDto2 = emailEventDataDto3;
                errorEventDataDto2 = errorEventDataDto3;
                webEventDataDto2 = webEventDataDto3;
                userInteractionEventDataDto2 = userInteractionEventDataDto3;
                str13 = str17;
                str14 = str18;
                str15 = str19;
            }
            return surrogate.copy(str24, str13, str14, str15, str9, str10, str11, str12, appEventDataDto2, screenTransitionEventDataDto2, pushNotificationEventDataDto2, notificationStackEventDataDto2, tabGroupEventDataDto2, appSessionEventDataDto2, deepLinkEventDataDto2, emailEventDataDto2, errorEventDataDto2, webEventDataDto2, userInteractionEventDataDto2, performanceMetricEventDataDto2, performanceMetricSpanEventDataDto2, experimentsEventDataDto2, cryptoOrderEventDataDto2, webViewNavigationDataDto2, networkErrorDataDto2, deviceSecurityEventDataDto2, deviceMetricEventDataDto2, arkoseLabsEventDataDto2, twilioConversationsSdkEventDataDto2, pathfinderFallbackToWebViewEventDataDto2, deviceApprovalReenrollmentEventDataDto2, accountSecurityEventDataDto2, catpayOrderEventDataDto2, httpCallDataDto2, perpetualOrderEventDataDto2, perceivedLoadingTimeEventDataDto2);
        }

        @SerialName("accountSecurityEventData")
        @JsonAnnotations2(names = {"account_security_event_data"})
        public static /* synthetic */ void getAccount_security_event_data$annotations() {
        }

        @SerialName("appSessionData")
        @JsonAnnotations2(names = {"app_session_data"})
        public static /* synthetic */ void getApp_session_data$annotations() {
        }

        @SerialName("arkoseLabsEventData")
        @JsonAnnotations2(names = {"arkose_labs_event_data"})
        public static /* synthetic */ void getArkose_labs_event_data$annotations() {
        }

        @SerialName(RhGcmListenerService.EXTRA_CATEGORY)
        @JsonAnnotations2(names = {RhGcmListenerService.EXTRA_CATEGORY})
        public static /* synthetic */ void getCategory$annotations() {
        }

        @SerialName("catpayOrderData")
        @JsonAnnotations2(names = {"catpay_order_data"})
        public static /* synthetic */ void getCatpay_order_data$annotations() {
        }

        @SerialName("cryptoOrderData")
        @JsonAnnotations2(names = {"crypto_order_data"})
        public static /* synthetic */ void getCrypto_order_data$annotations() {
        }

        @SerialName(WebsocketGatewayConstants.DATA_KEY)
        @JsonAnnotations2(names = {WebsocketGatewayConstants.DATA_KEY})
        public static /* synthetic */ void getData$annotations() {
        }

        @SerialName("deepLinkData")
        @JsonAnnotations2(names = {"deep_link_data"})
        public static /* synthetic */ void getDeep_link_data$annotations() {
        }

        @SerialName("deviceApprovalReenrollmentEventData")
        @JsonAnnotations2(names = {"device_approval_reenrollment_event_data"})
        public static /* synthetic */ void getDevice_approval_reenrollment_event_data$annotations() {
        }

        @SerialName("deviceMetricEventData")
        @JsonAnnotations2(names = {"device_metric_event_data"})
        public static /* synthetic */ void getDevice_metric_event_data$annotations() {
        }

        @SerialName("deviceSecurityEventData")
        @JsonAnnotations2(names = {"device_security_event_data"})
        public static /* synthetic */ void getDevice_security_event_data$annotations() {
        }

        @SerialName("emailData")
        @JsonAnnotations2(names = {"email_data"})
        public static /* synthetic */ void getEmail_data$annotations() {
        }

        @SerialName("errorData")
        @JsonAnnotations2(names = {"error_data"})
        public static /* synthetic */ void getError_data$annotations() {
        }

        @SerialName("event")
        @JsonAnnotations2(names = {"event"})
        public static /* synthetic */ void getEvent$annotations() {
        }

        @SerialName("experiments")
        @JsonAnnotations2(names = {"experiments"})
        public static /* synthetic */ void getExperiments$annotations() {
        }

        @SerialName("experimentsData")
        @JsonAnnotations2(names = {"experiments_data"})
        public static /* synthetic */ void getExperiments_data$annotations() {
        }

        @SerialName("httpCallData")
        @JsonAnnotations2(names = {"http_call_data"})
        public static /* synthetic */ void getHttp_call_data$annotations() {
        }

        @SerialName("navTab")
        @JsonAnnotations2(names = {"nav_tab"})
        public static /* synthetic */ void getNav_tab$annotations() {
        }

        @SerialName("networkErrorData")
        @JsonAnnotations2(names = {"network_error_data"})
        public static /* synthetic */ void getNetwork_error_data$annotations() {
        }

        @SerialName("notificationStackData")
        @JsonAnnotations2(names = {"notification_stack_data"})
        public static /* synthetic */ void getNotification_stack_data$annotations() {
        }

        @SerialName("pathfinderFallbackToWebViewEventData")
        @JsonAnnotations2(names = {"pathfinder_fallback_to_web_view_event_data"})
        public static /* synthetic */ void getPathfinder_fallback_to_web_view_event_data$annotations() {
        }

        @SerialName("perceivedLoadingTimeEventData")
        @JsonAnnotations2(names = {"perceived_loading_time_event_data"})
        public static /* synthetic */ void getPerceived_loading_time_event_data$annotations() {
        }

        @SerialName("performanceMetricEventData")
        @JsonAnnotations2(names = {"performance_metric_event_data"})
        public static /* synthetic */ void getPerformance_metric_event_data$annotations() {
        }

        @SerialName("performanceMetricSpanEventData")
        @JsonAnnotations2(names = {"performance_metric_span_event_data"})
        public static /* synthetic */ void getPerformance_metric_span_event_data$annotations() {
        }

        @SerialName("perpetualOrderData")
        @JsonAnnotations2(names = {"perpetual_order_data"})
        public static /* synthetic */ void getPerpetual_order_data$annotations() {
        }

        @SerialName("pushNotificationData")
        @JsonAnnotations2(names = {"push_notification_data"})
        public static /* synthetic */ void getPush_notification_data$annotations() {
        }

        @SerialName("screenData")
        @JsonAnnotations2(names = {"screen_data"})
        public static /* synthetic */ void getScreen_data$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("tabGroupData")
        @JsonAnnotations2(names = {"tab_group_data"})
        public static /* synthetic */ void getTab_group_data$annotations() {
        }

        @SerialName("twilioConversationsSdkEventData")
        @JsonAnnotations2(names = {"twilio_conversations_sdk_event_data"})
        public static /* synthetic */ void getTwilio_conversations_sdk_event_data$annotations() {
        }

        @SerialName("url")
        @JsonAnnotations2(names = {"url"})
        public static /* synthetic */ void getUrl$annotations() {
        }

        @SerialName("userInteractionEventData")
        @JsonAnnotations2(names = {"user_interaction_event_data"})
        public static /* synthetic */ void getUser_interaction_event_data$annotations() {
        }

        @SerialName("webData")
        @JsonAnnotations2(names = {"web_data"})
        public static /* synthetic */ void getWeb_data$annotations() {
        }

        @SerialName("webReferrer")
        @JsonAnnotations2(names = {"web_referrer"})
        public static /* synthetic */ void getWeb_referrer$annotations() {
        }

        @SerialName("webReferrerHost")
        @JsonAnnotations2(names = {"web_referrer_host"})
        public static /* synthetic */ void getWeb_referrer_host$annotations() {
        }

        @SerialName("webViewNavigationData")
        @JsonAnnotations2(names = {"web_view_navigation_data"})
        public static /* synthetic */ void getWeb_view_navigation_data$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component10, reason: from getter */
        public final ScreenTransitionEventDataDto getScreen_data() {
            return this.screen_data;
        }

        /* renamed from: component11, reason: from getter */
        public final PushNotificationEventDataDto getPush_notification_data() {
            return this.push_notification_data;
        }

        /* renamed from: component12, reason: from getter */
        public final NotificationStackEventDataDto getNotification_stack_data() {
            return this.notification_stack_data;
        }

        /* renamed from: component13, reason: from getter */
        public final TabGroupEventDataDto getTab_group_data() {
            return this.tab_group_data;
        }

        /* renamed from: component14, reason: from getter */
        public final AppSessionEventDataDto getApp_session_data() {
            return this.app_session_data;
        }

        /* renamed from: component15, reason: from getter */
        public final DeepLinkEventDataDto getDeep_link_data() {
            return this.deep_link_data;
        }

        /* renamed from: component16, reason: from getter */
        public final EmailEventDataDto getEmail_data() {
            return this.email_data;
        }

        /* renamed from: component17, reason: from getter */
        public final ErrorEventDataDto getError_data() {
            return this.error_data;
        }

        /* renamed from: component18, reason: from getter */
        public final WebEventDataDto getWeb_data() {
            return this.web_data;
        }

        /* renamed from: component19, reason: from getter */
        public final UserInteractionEventDataDto getUser_interaction_event_data() {
            return this.user_interaction_event_data;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent() {
            return this.event;
        }

        /* renamed from: component20, reason: from getter */
        public final PerformanceMetricEventDataDto getPerformance_metric_event_data() {
            return this.performance_metric_event_data;
        }

        /* renamed from: component21, reason: from getter */
        public final PerformanceMetricSpanEventDataDto getPerformance_metric_span_event_data() {
            return this.performance_metric_span_event_data;
        }

        /* renamed from: component22, reason: from getter */
        public final ExperimentsEventDataDto getExperiments_data() {
            return this.experiments_data;
        }

        /* renamed from: component23, reason: from getter */
        public final CryptoOrderEventDataDto getCrypto_order_data() {
            return this.crypto_order_data;
        }

        /* renamed from: component24, reason: from getter */
        public final WebViewNavigationDataDto getWeb_view_navigation_data() {
            return this.web_view_navigation_data;
        }

        /* renamed from: component25, reason: from getter */
        public final NetworkErrorDataDto getNetwork_error_data() {
            return this.network_error_data;
        }

        /* renamed from: component26, reason: from getter */
        public final DeviceSecurityEventDataDto getDevice_security_event_data() {
            return this.device_security_event_data;
        }

        /* renamed from: component27, reason: from getter */
        public final DeviceMetricEventDataDto getDevice_metric_event_data() {
            return this.device_metric_event_data;
        }

        /* renamed from: component28, reason: from getter */
        public final ArkoseLabsEventDataDto getArkose_labs_event_data() {
            return this.arkose_labs_event_data;
        }

        /* renamed from: component29, reason: from getter */
        public final TwilioConversationsSdkEventDataDto getTwilio_conversations_sdk_event_data() {
            return this.twilio_conversations_sdk_event_data;
        }

        /* renamed from: component3, reason: from getter */
        public final String getNav_tab() {
            return this.nav_tab;
        }

        /* renamed from: component30, reason: from getter */
        public final PathfinderFallbackToWebViewEventDataDto getPathfinder_fallback_to_web_view_event_data() {
            return this.pathfinder_fallback_to_web_view_event_data;
        }

        /* renamed from: component31, reason: from getter */
        public final DeviceApprovalReenrollmentEventDataDto getDevice_approval_reenrollment_event_data() {
            return this.device_approval_reenrollment_event_data;
        }

        /* renamed from: component32, reason: from getter */
        public final AccountSecurityEventDataDto getAccount_security_event_data() {
            return this.account_security_event_data;
        }

        /* renamed from: component33, reason: from getter */
        public final CatpayOrderEventDataDto getCatpay_order_data() {
            return this.catpay_order_data;
        }

        /* renamed from: component34, reason: from getter */
        public final HttpCallDataDto getHttp_call_data() {
            return this.http_call_data;
        }

        /* renamed from: component35, reason: from getter */
        public final PerpetualOrderEventDataDto getPerpetual_order_data() {
            return this.perpetual_order_data;
        }

        /* renamed from: component36, reason: from getter */
        public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
            return this.perceived_loading_time_event_data;
        }

        /* renamed from: component4, reason: from getter */
        public final String getExperiments() {
            return this.experiments;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component7, reason: from getter */
        public final String getWeb_referrer() {
            return this.web_referrer;
        }

        /* renamed from: component8, reason: from getter */
        public final String getWeb_referrer_host() {
            return this.web_referrer_host;
        }

        /* renamed from: component9, reason: from getter */
        public final AppEventDataDto getData() {
            return this.data;
        }

        public final Surrogate copy(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventDataDto data, ScreenTransitionEventDataDto screen_data, PushNotificationEventDataDto push_notification_data, NotificationStackEventDataDto notification_stack_data, TabGroupEventDataDto tab_group_data, AppSessionEventDataDto app_session_data, DeepLinkEventDataDto deep_link_data, EmailEventDataDto email_data, ErrorEventDataDto error_data, WebEventDataDto web_data, UserInteractionEventDataDto user_interaction_event_data, PerformanceMetricEventDataDto performance_metric_event_data, PerformanceMetricSpanEventDataDto performance_metric_span_event_data, ExperimentsEventDataDto experiments_data, CryptoOrderEventDataDto crypto_order_data, WebViewNavigationDataDto web_view_navigation_data, NetworkErrorDataDto network_error_data, DeviceSecurityEventDataDto device_security_event_data, DeviceMetricEventDataDto device_metric_event_data, ArkoseLabsEventDataDto arkose_labs_event_data, TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data, PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data, DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data, AccountSecurityEventDataDto account_security_event_data, CatpayOrderEventDataDto catpay_order_data, HttpCallDataDto http_call_data, PerpetualOrderEventDataDto perpetual_order_data, PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
            Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
            return new Surrogate(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, data, screen_data, push_notification_data, notification_stack_data, tab_group_data, app_session_data, deep_link_data, email_data, error_data, web_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, experiments_data, crypto_order_data, web_view_navigation_data, network_error_data, device_security_event_data, device_metric_event_data, arkose_labs_event_data, twilio_conversations_sdk_event_data, pathfinder_fallback_to_web_view_event_data, device_approval_reenrollment_event_data, account_security_event_data, catpay_order_data, http_call_data, perpetual_order_data, perceived_loading_time_event_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.category, surrogate.category) && Intrinsics.areEqual(this.event, surrogate.event) && Intrinsics.areEqual(this.nav_tab, surrogate.nav_tab) && Intrinsics.areEqual(this.experiments, surrogate.experiments) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.web_referrer, surrogate.web_referrer) && Intrinsics.areEqual(this.web_referrer_host, surrogate.web_referrer_host) && Intrinsics.areEqual(this.data, surrogate.data) && Intrinsics.areEqual(this.screen_data, surrogate.screen_data) && Intrinsics.areEqual(this.push_notification_data, surrogate.push_notification_data) && Intrinsics.areEqual(this.notification_stack_data, surrogate.notification_stack_data) && Intrinsics.areEqual(this.tab_group_data, surrogate.tab_group_data) && Intrinsics.areEqual(this.app_session_data, surrogate.app_session_data) && Intrinsics.areEqual(this.deep_link_data, surrogate.deep_link_data) && Intrinsics.areEqual(this.email_data, surrogate.email_data) && Intrinsics.areEqual(this.error_data, surrogate.error_data) && Intrinsics.areEqual(this.web_data, surrogate.web_data) && Intrinsics.areEqual(this.user_interaction_event_data, surrogate.user_interaction_event_data) && Intrinsics.areEqual(this.performance_metric_event_data, surrogate.performance_metric_event_data) && Intrinsics.areEqual(this.performance_metric_span_event_data, surrogate.performance_metric_span_event_data) && Intrinsics.areEqual(this.experiments_data, surrogate.experiments_data) && Intrinsics.areEqual(this.crypto_order_data, surrogate.crypto_order_data) && Intrinsics.areEqual(this.web_view_navigation_data, surrogate.web_view_navigation_data) && Intrinsics.areEqual(this.network_error_data, surrogate.network_error_data) && Intrinsics.areEqual(this.device_security_event_data, surrogate.device_security_event_data) && Intrinsics.areEqual(this.device_metric_event_data, surrogate.device_metric_event_data) && Intrinsics.areEqual(this.arkose_labs_event_data, surrogate.arkose_labs_event_data) && Intrinsics.areEqual(this.twilio_conversations_sdk_event_data, surrogate.twilio_conversations_sdk_event_data) && Intrinsics.areEqual(this.pathfinder_fallback_to_web_view_event_data, surrogate.pathfinder_fallback_to_web_view_event_data) && Intrinsics.areEqual(this.device_approval_reenrollment_event_data, surrogate.device_approval_reenrollment_event_data) && Intrinsics.areEqual(this.account_security_event_data, surrogate.account_security_event_data) && Intrinsics.areEqual(this.catpay_order_data, surrogate.catpay_order_data) && Intrinsics.areEqual(this.http_call_data, surrogate.http_call_data) && Intrinsics.areEqual(this.perpetual_order_data, surrogate.perpetual_order_data) && Intrinsics.areEqual(this.perceived_loading_time_event_data, surrogate.perceived_loading_time_event_data);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.category.hashCode() * 31) + this.event.hashCode()) * 31) + this.nav_tab.hashCode()) * 31) + this.experiments.hashCode()) * 31) + this.session_id.hashCode()) * 31) + this.url.hashCode()) * 31) + this.web_referrer.hashCode()) * 31) + this.web_referrer_host.hashCode()) * 31;
            AppEventDataDto appEventDataDto = this.data;
            int iHashCode2 = (iHashCode + (appEventDataDto == null ? 0 : appEventDataDto.hashCode())) * 31;
            ScreenTransitionEventDataDto screenTransitionEventDataDto = this.screen_data;
            int iHashCode3 = (iHashCode2 + (screenTransitionEventDataDto == null ? 0 : screenTransitionEventDataDto.hashCode())) * 31;
            PushNotificationEventDataDto pushNotificationEventDataDto = this.push_notification_data;
            int iHashCode4 = (iHashCode3 + (pushNotificationEventDataDto == null ? 0 : pushNotificationEventDataDto.hashCode())) * 31;
            NotificationStackEventDataDto notificationStackEventDataDto = this.notification_stack_data;
            int iHashCode5 = (iHashCode4 + (notificationStackEventDataDto == null ? 0 : notificationStackEventDataDto.hashCode())) * 31;
            TabGroupEventDataDto tabGroupEventDataDto = this.tab_group_data;
            int iHashCode6 = (iHashCode5 + (tabGroupEventDataDto == null ? 0 : tabGroupEventDataDto.hashCode())) * 31;
            AppSessionEventDataDto appSessionEventDataDto = this.app_session_data;
            int iHashCode7 = (iHashCode6 + (appSessionEventDataDto == null ? 0 : appSessionEventDataDto.hashCode())) * 31;
            DeepLinkEventDataDto deepLinkEventDataDto = this.deep_link_data;
            int iHashCode8 = (iHashCode7 + (deepLinkEventDataDto == null ? 0 : deepLinkEventDataDto.hashCode())) * 31;
            EmailEventDataDto emailEventDataDto = this.email_data;
            int iHashCode9 = (iHashCode8 + (emailEventDataDto == null ? 0 : emailEventDataDto.hashCode())) * 31;
            ErrorEventDataDto errorEventDataDto = this.error_data;
            int iHashCode10 = (iHashCode9 + (errorEventDataDto == null ? 0 : errorEventDataDto.hashCode())) * 31;
            WebEventDataDto webEventDataDto = this.web_data;
            int iHashCode11 = (iHashCode10 + (webEventDataDto == null ? 0 : webEventDataDto.hashCode())) * 31;
            UserInteractionEventDataDto userInteractionEventDataDto = this.user_interaction_event_data;
            int iHashCode12 = (iHashCode11 + (userInteractionEventDataDto == null ? 0 : userInteractionEventDataDto.hashCode())) * 31;
            PerformanceMetricEventDataDto performanceMetricEventDataDto = this.performance_metric_event_data;
            int iHashCode13 = (iHashCode12 + (performanceMetricEventDataDto == null ? 0 : performanceMetricEventDataDto.hashCode())) * 31;
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto = this.performance_metric_span_event_data;
            int iHashCode14 = (iHashCode13 + (performanceMetricSpanEventDataDto == null ? 0 : performanceMetricSpanEventDataDto.hashCode())) * 31;
            ExperimentsEventDataDto experimentsEventDataDto = this.experiments_data;
            int iHashCode15 = (iHashCode14 + (experimentsEventDataDto == null ? 0 : experimentsEventDataDto.hashCode())) * 31;
            CryptoOrderEventDataDto cryptoOrderEventDataDto = this.crypto_order_data;
            int iHashCode16 = (iHashCode15 + (cryptoOrderEventDataDto == null ? 0 : cryptoOrderEventDataDto.hashCode())) * 31;
            WebViewNavigationDataDto webViewNavigationDataDto = this.web_view_navigation_data;
            int iHashCode17 = (iHashCode16 + (webViewNavigationDataDto == null ? 0 : webViewNavigationDataDto.hashCode())) * 31;
            NetworkErrorDataDto networkErrorDataDto = this.network_error_data;
            int iHashCode18 = (iHashCode17 + (networkErrorDataDto == null ? 0 : networkErrorDataDto.hashCode())) * 31;
            DeviceSecurityEventDataDto deviceSecurityEventDataDto = this.device_security_event_data;
            int iHashCode19 = (iHashCode18 + (deviceSecurityEventDataDto == null ? 0 : deviceSecurityEventDataDto.hashCode())) * 31;
            DeviceMetricEventDataDto deviceMetricEventDataDto = this.device_metric_event_data;
            int iHashCode20 = (iHashCode19 + (deviceMetricEventDataDto == null ? 0 : deviceMetricEventDataDto.hashCode())) * 31;
            ArkoseLabsEventDataDto arkoseLabsEventDataDto = this.arkose_labs_event_data;
            int iHashCode21 = (iHashCode20 + (arkoseLabsEventDataDto == null ? 0 : arkoseLabsEventDataDto.hashCode())) * 31;
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto = this.twilio_conversations_sdk_event_data;
            int iHashCode22 = (iHashCode21 + (twilioConversationsSdkEventDataDto == null ? 0 : twilioConversationsSdkEventDataDto.hashCode())) * 31;
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto = this.pathfinder_fallback_to_web_view_event_data;
            int iHashCode23 = (iHashCode22 + (pathfinderFallbackToWebViewEventDataDto == null ? 0 : pathfinderFallbackToWebViewEventDataDto.hashCode())) * 31;
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto = this.device_approval_reenrollment_event_data;
            int iHashCode24 = (iHashCode23 + (deviceApprovalReenrollmentEventDataDto == null ? 0 : deviceApprovalReenrollmentEventDataDto.hashCode())) * 31;
            AccountSecurityEventDataDto accountSecurityEventDataDto = this.account_security_event_data;
            int iHashCode25 = (iHashCode24 + (accountSecurityEventDataDto == null ? 0 : accountSecurityEventDataDto.hashCode())) * 31;
            CatpayOrderEventDataDto catpayOrderEventDataDto = this.catpay_order_data;
            int iHashCode26 = (iHashCode25 + (catpayOrderEventDataDto == null ? 0 : catpayOrderEventDataDto.hashCode())) * 31;
            HttpCallDataDto httpCallDataDto = this.http_call_data;
            int iHashCode27 = (iHashCode26 + (httpCallDataDto == null ? 0 : httpCallDataDto.hashCode())) * 31;
            PerpetualOrderEventDataDto perpetualOrderEventDataDto = this.perpetual_order_data;
            int iHashCode28 = (iHashCode27 + (perpetualOrderEventDataDto == null ? 0 : perpetualOrderEventDataDto.hashCode())) * 31;
            PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto = this.perceived_loading_time_event_data;
            return iHashCode28 + (perceivedLoadingTimeEventDataDto != null ? perceivedLoadingTimeEventDataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(category=" + this.category + ", event=" + this.event + ", nav_tab=" + this.nav_tab + ", experiments=" + this.experiments + ", session_id=" + this.session_id + ", url=" + this.url + ", web_referrer=" + this.web_referrer + ", web_referrer_host=" + this.web_referrer_host + ", data=" + this.data + ", screen_data=" + this.screen_data + ", push_notification_data=" + this.push_notification_data + ", notification_stack_data=" + this.notification_stack_data + ", tab_group_data=" + this.tab_group_data + ", app_session_data=" + this.app_session_data + ", deep_link_data=" + this.deep_link_data + ", email_data=" + this.email_data + ", error_data=" + this.error_data + ", web_data=" + this.web_data + ", user_interaction_event_data=" + this.user_interaction_event_data + ", performance_metric_event_data=" + this.performance_metric_event_data + ", performance_metric_span_event_data=" + this.performance_metric_span_event_data + ", experiments_data=" + this.experiments_data + ", crypto_order_data=" + this.crypto_order_data + ", web_view_navigation_data=" + this.web_view_navigation_data + ", network_error_data=" + this.network_error_data + ", device_security_event_data=" + this.device_security_event_data + ", device_metric_event_data=" + this.device_metric_event_data + ", arkose_labs_event_data=" + this.arkose_labs_event_data + ", twilio_conversations_sdk_event_data=" + this.twilio_conversations_sdk_event_data + ", pathfinder_fallback_to_web_view_event_data=" + this.pathfinder_fallback_to_web_view_event_data + ", device_approval_reenrollment_event_data=" + this.device_approval_reenrollment_event_data + ", account_security_event_data=" + this.account_security_event_data + ", catpay_order_data=" + this.catpay_order_data + ", http_call_data=" + this.http_call_data + ", perpetual_order_data=" + this.perpetual_order_data + ", perceived_loading_time_event_data=" + this.perceived_loading_time_event_data + ")";
        }

        /* compiled from: RhGlobalAppEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RhGlobalAppEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, HttpCallDataDto httpCallDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.category = "";
            } else {
                this.category = str;
            }
            if ((i & 2) == 0) {
                this.event = "";
            } else {
                this.event = str2;
            }
            if ((i & 4) == 0) {
                this.nav_tab = "";
            } else {
                this.nav_tab = str3;
            }
            if ((i & 8) == 0) {
                this.experiments = "";
            } else {
                this.experiments = str4;
            }
            if ((i & 16) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str5;
            }
            if ((i & 32) == 0) {
                this.url = "";
            } else {
                this.url = str6;
            }
            if ((i & 64) == 0) {
                this.web_referrer = "";
            } else {
                this.web_referrer = str7;
            }
            if ((i & 128) == 0) {
                this.web_referrer_host = "";
            } else {
                this.web_referrer_host = str8;
            }
            if ((i & 256) == 0) {
                this.data = null;
            } else {
                this.data = appEventDataDto;
            }
            if ((i & 512) == 0) {
                this.screen_data = null;
            } else {
                this.screen_data = screenTransitionEventDataDto;
            }
            if ((i & 1024) == 0) {
                this.push_notification_data = null;
            } else {
                this.push_notification_data = pushNotificationEventDataDto;
            }
            if ((i & 2048) == 0) {
                this.notification_stack_data = null;
            } else {
                this.notification_stack_data = notificationStackEventDataDto;
            }
            if ((i & 4096) == 0) {
                this.tab_group_data = null;
            } else {
                this.tab_group_data = tabGroupEventDataDto;
            }
            if ((i & 8192) == 0) {
                this.app_session_data = null;
            } else {
                this.app_session_data = appSessionEventDataDto;
            }
            if ((i & 16384) == 0) {
                this.deep_link_data = null;
            } else {
                this.deep_link_data = deepLinkEventDataDto;
            }
            if ((32768 & i) == 0) {
                this.email_data = null;
            } else {
                this.email_data = emailEventDataDto;
            }
            if ((65536 & i) == 0) {
                this.error_data = null;
            } else {
                this.error_data = errorEventDataDto;
            }
            if ((131072 & i) == 0) {
                this.web_data = null;
            } else {
                this.web_data = webEventDataDto;
            }
            if ((262144 & i) == 0) {
                this.user_interaction_event_data = null;
            } else {
                this.user_interaction_event_data = userInteractionEventDataDto;
            }
            if ((524288 & i) == 0) {
                this.performance_metric_event_data = null;
            } else {
                this.performance_metric_event_data = performanceMetricEventDataDto;
            }
            if ((1048576 & i) == 0) {
                this.performance_metric_span_event_data = null;
            } else {
                this.performance_metric_span_event_data = performanceMetricSpanEventDataDto;
            }
            if ((2097152 & i) == 0) {
                this.experiments_data = null;
            } else {
                this.experiments_data = experimentsEventDataDto;
            }
            if ((4194304 & i) == 0) {
                this.crypto_order_data = null;
            } else {
                this.crypto_order_data = cryptoOrderEventDataDto;
            }
            if ((8388608 & i) == 0) {
                this.web_view_navigation_data = null;
            } else {
                this.web_view_navigation_data = webViewNavigationDataDto;
            }
            if ((16777216 & i) == 0) {
                this.network_error_data = null;
            } else {
                this.network_error_data = networkErrorDataDto;
            }
            if ((33554432 & i) == 0) {
                this.device_security_event_data = null;
            } else {
                this.device_security_event_data = deviceSecurityEventDataDto;
            }
            if ((67108864 & i) == 0) {
                this.device_metric_event_data = null;
            } else {
                this.device_metric_event_data = deviceMetricEventDataDto;
            }
            if ((134217728 & i) == 0) {
                this.arkose_labs_event_data = null;
            } else {
                this.arkose_labs_event_data = arkoseLabsEventDataDto;
            }
            if ((268435456 & i) == 0) {
                this.twilio_conversations_sdk_event_data = null;
            } else {
                this.twilio_conversations_sdk_event_data = twilioConversationsSdkEventDataDto;
            }
            if ((536870912 & i) == 0) {
                this.pathfinder_fallback_to_web_view_event_data = null;
            } else {
                this.pathfinder_fallback_to_web_view_event_data = pathfinderFallbackToWebViewEventDataDto;
            }
            if ((1073741824 & i) == 0) {
                this.device_approval_reenrollment_event_data = null;
            } else {
                this.device_approval_reenrollment_event_data = deviceApprovalReenrollmentEventDataDto;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.account_security_event_data = null;
            } else {
                this.account_security_event_data = accountSecurityEventDataDto;
            }
            if ((i2 & 1) == 0) {
                this.catpay_order_data = null;
            } else {
                this.catpay_order_data = catpayOrderEventDataDto;
            }
            if ((i2 & 2) == 0) {
                this.http_call_data = null;
            } else {
                this.http_call_data = httpCallDataDto;
            }
            if ((i2 & 4) == 0) {
                this.perpetual_order_data = null;
            } else {
                this.perpetual_order_data = perpetualOrderEventDataDto;
            }
            if ((i2 & 8) == 0) {
                this.perceived_loading_time_event_data = null;
            } else {
                this.perceived_loading_time_event_data = perceivedLoadingTimeEventDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.category, "")) {
                output.encodeStringElement(serialDesc, 0, self.category);
            }
            if (!Intrinsics.areEqual(self.event, "")) {
                output.encodeStringElement(serialDesc, 1, self.event);
            }
            if (!Intrinsics.areEqual(self.nav_tab, "")) {
                output.encodeStringElement(serialDesc, 2, self.nav_tab);
            }
            if (!Intrinsics.areEqual(self.experiments, "")) {
                output.encodeStringElement(serialDesc, 3, self.experiments);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.session_id);
            }
            if (!Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 5, self.url);
            }
            if (!Intrinsics.areEqual(self.web_referrer, "")) {
                output.encodeStringElement(serialDesc, 6, self.web_referrer);
            }
            if (!Intrinsics.areEqual(self.web_referrer_host, "")) {
                output.encodeStringElement(serialDesc, 7, self.web_referrer_host);
            }
            AppEventDataDto appEventDataDto = self.data;
            if (appEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, AppEventDataDto.Serializer.INSTANCE, appEventDataDto);
            }
            ScreenTransitionEventDataDto screenTransitionEventDataDto = self.screen_data;
            if (screenTransitionEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ScreenTransitionEventDataDto.Serializer.INSTANCE, screenTransitionEventDataDto);
            }
            PushNotificationEventDataDto pushNotificationEventDataDto = self.push_notification_data;
            if (pushNotificationEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, PushNotificationEventDataDto.Serializer.INSTANCE, pushNotificationEventDataDto);
            }
            NotificationStackEventDataDto notificationStackEventDataDto = self.notification_stack_data;
            if (notificationStackEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, NotificationStackEventDataDto.Serializer.INSTANCE, notificationStackEventDataDto);
            }
            TabGroupEventDataDto tabGroupEventDataDto = self.tab_group_data;
            if (tabGroupEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, TabGroupEventDataDto.Serializer.INSTANCE, tabGroupEventDataDto);
            }
            AppSessionEventDataDto appSessionEventDataDto = self.app_session_data;
            if (appSessionEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, AppSessionEventDataDto.Serializer.INSTANCE, appSessionEventDataDto);
            }
            DeepLinkEventDataDto deepLinkEventDataDto = self.deep_link_data;
            if (deepLinkEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, DeepLinkEventDataDto.Serializer.INSTANCE, deepLinkEventDataDto);
            }
            EmailEventDataDto emailEventDataDto = self.email_data;
            if (emailEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, EmailEventDataDto.Serializer.INSTANCE, emailEventDataDto);
            }
            ErrorEventDataDto errorEventDataDto = self.error_data;
            if (errorEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, ErrorEventDataDto.Serializer.INSTANCE, errorEventDataDto);
            }
            WebEventDataDto webEventDataDto = self.web_data;
            if (webEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, WebEventDataDto.Serializer.INSTANCE, webEventDataDto);
            }
            UserInteractionEventDataDto userInteractionEventDataDto = self.user_interaction_event_data;
            if (userInteractionEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, UserInteractionEventDataDto.Serializer.INSTANCE, userInteractionEventDataDto);
            }
            PerformanceMetricEventDataDto performanceMetricEventDataDto = self.performance_metric_event_data;
            if (performanceMetricEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, PerformanceMetricEventDataDto.Serializer.INSTANCE, performanceMetricEventDataDto);
            }
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto = self.performance_metric_span_event_data;
            if (performanceMetricSpanEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, PerformanceMetricSpanEventDataDto.Serializer.INSTANCE, performanceMetricSpanEventDataDto);
            }
            ExperimentsEventDataDto experimentsEventDataDto = self.experiments_data;
            if (experimentsEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, ExperimentsEventDataDto.Serializer.INSTANCE, experimentsEventDataDto);
            }
            CryptoOrderEventDataDto cryptoOrderEventDataDto = self.crypto_order_data;
            if (cryptoOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, CryptoOrderEventDataDto.Serializer.INSTANCE, cryptoOrderEventDataDto);
            }
            WebViewNavigationDataDto webViewNavigationDataDto = self.web_view_navigation_data;
            if (webViewNavigationDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, WebViewNavigationDataDto.Serializer.INSTANCE, webViewNavigationDataDto);
            }
            NetworkErrorDataDto networkErrorDataDto = self.network_error_data;
            if (networkErrorDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, NetworkErrorDataDto.Serializer.INSTANCE, networkErrorDataDto);
            }
            DeviceSecurityEventDataDto deviceSecurityEventDataDto = self.device_security_event_data;
            if (deviceSecurityEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, DeviceSecurityEventDataDto.Serializer.INSTANCE, deviceSecurityEventDataDto);
            }
            DeviceMetricEventDataDto deviceMetricEventDataDto = self.device_metric_event_data;
            if (deviceMetricEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, DeviceMetricEventDataDto.Serializer.INSTANCE, deviceMetricEventDataDto);
            }
            ArkoseLabsEventDataDto arkoseLabsEventDataDto = self.arkose_labs_event_data;
            if (arkoseLabsEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, ArkoseLabsEventDataDto.Serializer.INSTANCE, arkoseLabsEventDataDto);
            }
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto = self.twilio_conversations_sdk_event_data;
            if (twilioConversationsSdkEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, TwilioConversationsSdkEventDataDto.Serializer.INSTANCE, twilioConversationsSdkEventDataDto);
            }
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto = self.pathfinder_fallback_to_web_view_event_data;
            if (pathfinderFallbackToWebViewEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, PathfinderFallbackToWebViewEventDataDto.Serializer.INSTANCE, pathfinderFallbackToWebViewEventDataDto);
            }
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto = self.device_approval_reenrollment_event_data;
            if (deviceApprovalReenrollmentEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, DeviceApprovalReenrollmentEventDataDto.Serializer.INSTANCE, deviceApprovalReenrollmentEventDataDto);
            }
            AccountSecurityEventDataDto accountSecurityEventDataDto = self.account_security_event_data;
            if (accountSecurityEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, AccountSecurityEventDataDto.Serializer.INSTANCE, accountSecurityEventDataDto);
            }
            CatpayOrderEventDataDto catpayOrderEventDataDto = self.catpay_order_data;
            if (catpayOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, CatpayOrderEventDataDto.Serializer.INSTANCE, catpayOrderEventDataDto);
            }
            HttpCallDataDto httpCallDataDto = self.http_call_data;
            if (httpCallDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, HttpCallDataDto.Serializer.INSTANCE, httpCallDataDto);
            }
            PerpetualOrderEventDataDto perpetualOrderEventDataDto = self.perpetual_order_data;
            if (perpetualOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 34, PerpetualOrderEventDataDto.Serializer.INSTANCE, perpetualOrderEventDataDto);
            }
            PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto = self.perceived_loading_time_event_data;
            if (perceivedLoadingTimeEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, PerceivedLoadingTimeEventDataDto.Serializer.INSTANCE, perceivedLoadingTimeEventDataDto);
            }
        }

        public Surrogate(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, HttpCallDataDto httpCallDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
            Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
            this.category = category;
            this.event = event;
            this.nav_tab = nav_tab;
            this.experiments = experiments;
            this.session_id = session_id;
            this.url = url;
            this.web_referrer = web_referrer;
            this.web_referrer_host = web_referrer_host;
            this.data = appEventDataDto;
            this.screen_data = screenTransitionEventDataDto;
            this.push_notification_data = pushNotificationEventDataDto;
            this.notification_stack_data = notificationStackEventDataDto;
            this.tab_group_data = tabGroupEventDataDto;
            this.app_session_data = appSessionEventDataDto;
            this.deep_link_data = deepLinkEventDataDto;
            this.email_data = emailEventDataDto;
            this.error_data = errorEventDataDto;
            this.web_data = webEventDataDto;
            this.user_interaction_event_data = userInteractionEventDataDto;
            this.performance_metric_event_data = performanceMetricEventDataDto;
            this.performance_metric_span_event_data = performanceMetricSpanEventDataDto;
            this.experiments_data = experimentsEventDataDto;
            this.crypto_order_data = cryptoOrderEventDataDto;
            this.web_view_navigation_data = webViewNavigationDataDto;
            this.network_error_data = networkErrorDataDto;
            this.device_security_event_data = deviceSecurityEventDataDto;
            this.device_metric_event_data = deviceMetricEventDataDto;
            this.arkose_labs_event_data = arkoseLabsEventDataDto;
            this.twilio_conversations_sdk_event_data = twilioConversationsSdkEventDataDto;
            this.pathfinder_fallback_to_web_view_event_data = pathfinderFallbackToWebViewEventDataDto;
            this.device_approval_reenrollment_event_data = deviceApprovalReenrollmentEventDataDto;
            this.account_security_event_data = accountSecurityEventDataDto;
            this.catpay_order_data = catpayOrderEventDataDto;
            this.http_call_data = httpCallDataDto;
            this.perpetual_order_data = perpetualOrderEventDataDto;
            this.perceived_loading_time_event_data = perceivedLoadingTimeEventDataDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, HttpCallDataDto httpCallDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : appEventDataDto, (i & 512) != 0 ? null : screenTransitionEventDataDto, (i & 1024) != 0 ? null : pushNotificationEventDataDto, (i & 2048) != 0 ? null : notificationStackEventDataDto, (i & 4096) != 0 ? null : tabGroupEventDataDto, (i & 8192) != 0 ? null : appSessionEventDataDto, (i & 16384) != 0 ? null : deepLinkEventDataDto, (i & 32768) != 0 ? null : emailEventDataDto, (i & 65536) != 0 ? null : errorEventDataDto, (i & 131072) != 0 ? null : webEventDataDto, (i & 262144) != 0 ? null : userInteractionEventDataDto, (i & 524288) != 0 ? null : performanceMetricEventDataDto, (i & 1048576) != 0 ? null : performanceMetricSpanEventDataDto, (i & 2097152) != 0 ? null : experimentsEventDataDto, (i & 4194304) != 0 ? null : cryptoOrderEventDataDto, (i & 8388608) != 0 ? null : webViewNavigationDataDto, (i & 16777216) != 0 ? null : networkErrorDataDto, (i & 33554432) != 0 ? null : deviceSecurityEventDataDto, (i & 67108864) != 0 ? null : deviceMetricEventDataDto, (i & 134217728) != 0 ? null : arkoseLabsEventDataDto, (i & 268435456) != 0 ? null : twilioConversationsSdkEventDataDto, (i & 536870912) != 0 ? null : pathfinderFallbackToWebViewEventDataDto, (i & 1073741824) != 0 ? null : deviceApprovalReenrollmentEventDataDto, (i & Integer.MIN_VALUE) != 0 ? null : accountSecurityEventDataDto, (i2 & 1) != 0 ? null : catpayOrderEventDataDto, (i2 & 2) != 0 ? null : httpCallDataDto, (i2 & 4) != 0 ? null : perpetualOrderEventDataDto, (i2 & 8) != 0 ? null : perceivedLoadingTimeEventDataDto);
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getEvent() {
            return this.event;
        }

        public final String getNav_tab() {
            return this.nav_tab;
        }

        public final String getExperiments() {
            return this.experiments;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getWeb_referrer() {
            return this.web_referrer;
        }

        public final String getWeb_referrer_host() {
            return this.web_referrer_host;
        }

        public final AppEventDataDto getData() {
            return this.data;
        }

        public final ScreenTransitionEventDataDto getScreen_data() {
            return this.screen_data;
        }

        public final PushNotificationEventDataDto getPush_notification_data() {
            return this.push_notification_data;
        }

        public final NotificationStackEventDataDto getNotification_stack_data() {
            return this.notification_stack_data;
        }

        public final TabGroupEventDataDto getTab_group_data() {
            return this.tab_group_data;
        }

        public final AppSessionEventDataDto getApp_session_data() {
            return this.app_session_data;
        }

        public final DeepLinkEventDataDto getDeep_link_data() {
            return this.deep_link_data;
        }

        public final EmailEventDataDto getEmail_data() {
            return this.email_data;
        }

        public final ErrorEventDataDto getError_data() {
            return this.error_data;
        }

        public final WebEventDataDto getWeb_data() {
            return this.web_data;
        }

        public final UserInteractionEventDataDto getUser_interaction_event_data() {
            return this.user_interaction_event_data;
        }

        public final PerformanceMetricEventDataDto getPerformance_metric_event_data() {
            return this.performance_metric_event_data;
        }

        public final PerformanceMetricSpanEventDataDto getPerformance_metric_span_event_data() {
            return this.performance_metric_span_event_data;
        }

        public final ExperimentsEventDataDto getExperiments_data() {
            return this.experiments_data;
        }

        public final CryptoOrderEventDataDto getCrypto_order_data() {
            return this.crypto_order_data;
        }

        public final WebViewNavigationDataDto getWeb_view_navigation_data() {
            return this.web_view_navigation_data;
        }

        public final NetworkErrorDataDto getNetwork_error_data() {
            return this.network_error_data;
        }

        public final DeviceSecurityEventDataDto getDevice_security_event_data() {
            return this.device_security_event_data;
        }

        public final DeviceMetricEventDataDto getDevice_metric_event_data() {
            return this.device_metric_event_data;
        }

        public final ArkoseLabsEventDataDto getArkose_labs_event_data() {
            return this.arkose_labs_event_data;
        }

        public final TwilioConversationsSdkEventDataDto getTwilio_conversations_sdk_event_data() {
            return this.twilio_conversations_sdk_event_data;
        }

        public final PathfinderFallbackToWebViewEventDataDto getPathfinder_fallback_to_web_view_event_data() {
            return this.pathfinder_fallback_to_web_view_event_data;
        }

        public final DeviceApprovalReenrollmentEventDataDto getDevice_approval_reenrollment_event_data() {
            return this.device_approval_reenrollment_event_data;
        }

        public final AccountSecurityEventDataDto getAccount_security_event_data() {
            return this.account_security_event_data;
        }

        public final CatpayOrderEventDataDto getCatpay_order_data() {
            return this.catpay_order_data;
        }

        public final HttpCallDataDto getHttp_call_data() {
            return this.http_call_data;
        }

        public final PerpetualOrderEventDataDto getPerpetual_order_data() {
            return this.perpetual_order_data;
        }

        public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
            return this.perceived_loading_time_event_data;
        }
    }

    /* compiled from: RhGlobalAppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto;", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RhGlobalAppEventDto, RhGlobalAppEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RhGlobalAppEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RhGlobalAppEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RhGlobalAppEventDto> getBinaryBase64Serializer() {
            return (KSerializer) RhGlobalAppEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RhGlobalAppEvent> getProtoAdapter() {
            return RhGlobalAppEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RhGlobalAppEventDto getZeroValue() {
            return RhGlobalAppEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RhGlobalAppEventDto fromProto(RhGlobalAppEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String category = proto.getCategory();
            String event = proto.getEvent();
            String nav_tab = proto.getNav_tab();
            String experiments = proto.getExperiments();
            String session_id = proto.getSession_id();
            String url = proto.getUrl();
            String web_referrer = proto.getWeb_referrer();
            String web_referrer_host = proto.getWeb_referrer_host();
            AppEventData data = proto.getData();
            AppEventDataDto appEventDataDtoFromProto = data != null ? AppEventDataDto.INSTANCE.fromProto(data) : null;
            ScreenTransitionEventData screen_data = proto.getScreen_data();
            ScreenTransitionEventDataDto screenTransitionEventDataDtoFromProto = screen_data != null ? ScreenTransitionEventDataDto.INSTANCE.fromProto(screen_data) : null;
            PushNotificationEventData push_notification_data = proto.getPush_notification_data();
            PushNotificationEventDataDto pushNotificationEventDataDtoFromProto = push_notification_data != null ? PushNotificationEventDataDto.INSTANCE.fromProto(push_notification_data) : null;
            NotificationStackEventData notification_stack_data = proto.getNotification_stack_data();
            NotificationStackEventDataDto notificationStackEventDataDtoFromProto = notification_stack_data != null ? NotificationStackEventDataDto.INSTANCE.fromProto(notification_stack_data) : null;
            TabGroupEventData tab_group_data = proto.getTab_group_data();
            TabGroupEventDataDto tabGroupEventDataDtoFromProto = tab_group_data != null ? TabGroupEventDataDto.INSTANCE.fromProto(tab_group_data) : null;
            AppSessionEventData app_session_data = proto.getApp_session_data();
            AppSessionEventDataDto appSessionEventDataDtoFromProto = app_session_data != null ? AppSessionEventDataDto.INSTANCE.fromProto(app_session_data) : null;
            DeepLinkEventData deep_link_data = proto.getDeep_link_data();
            AppEventDataDto appEventDataDto = appEventDataDtoFromProto;
            DeepLinkEventDataDto deepLinkEventDataDtoFromProto = deep_link_data != null ? DeepLinkEventDataDto.INSTANCE.fromProto(deep_link_data) : null;
            EmailEventData email_data = proto.getEmail_data();
            DeepLinkEventDataDto deepLinkEventDataDto = deepLinkEventDataDtoFromProto;
            EmailEventDataDto emailEventDataDtoFromProto = email_data != null ? EmailEventDataDto.INSTANCE.fromProto(email_data) : null;
            ErrorEventData error_data = proto.getError_data();
            EmailEventDataDto emailEventDataDto = emailEventDataDtoFromProto;
            ErrorEventDataDto errorEventDataDtoFromProto = error_data != null ? ErrorEventDataDto.INSTANCE.fromProto(error_data) : null;
            WebEventData web_data = proto.getWeb_data();
            ErrorEventDataDto errorEventDataDto = errorEventDataDtoFromProto;
            WebEventDataDto webEventDataDtoFromProto = web_data != null ? WebEventDataDto.INSTANCE.fromProto(web_data) : null;
            UserInteractionEventData user_interaction_event_data = proto.getUser_interaction_event_data();
            WebEventDataDto webEventDataDto = webEventDataDtoFromProto;
            UserInteractionEventDataDto userInteractionEventDataDtoFromProto = user_interaction_event_data != null ? UserInteractionEventDataDto.INSTANCE.fromProto(user_interaction_event_data) : null;
            PerformanceMetricEventData performance_metric_event_data = proto.getPerformance_metric_event_data();
            UserInteractionEventDataDto userInteractionEventDataDto = userInteractionEventDataDtoFromProto;
            PerformanceMetricEventDataDto performanceMetricEventDataDtoFromProto = performance_metric_event_data != null ? PerformanceMetricEventDataDto.INSTANCE.fromProto(performance_metric_event_data) : null;
            PerformanceMetricSpanEventData performance_metric_span_event_data = proto.getPerformance_metric_span_event_data();
            PerformanceMetricEventDataDto performanceMetricEventDataDto = performanceMetricEventDataDtoFromProto;
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDtoFromProto = performance_metric_span_event_data != null ? PerformanceMetricSpanEventDataDto.INSTANCE.fromProto(performance_metric_span_event_data) : null;
            ExperimentsEventData experiments_data = proto.getExperiments_data();
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto = performanceMetricSpanEventDataDtoFromProto;
            ExperimentsEventDataDto experimentsEventDataDtoFromProto = experiments_data != null ? ExperimentsEventDataDto.INSTANCE.fromProto(experiments_data) : null;
            CryptoOrderEventData crypto_order_data = proto.getCrypto_order_data();
            ExperimentsEventDataDto experimentsEventDataDto = experimentsEventDataDtoFromProto;
            CryptoOrderEventDataDto cryptoOrderEventDataDtoFromProto = crypto_order_data != null ? CryptoOrderEventDataDto.INSTANCE.fromProto(crypto_order_data) : null;
            WebViewNavigationData web_view_navigation_data = proto.getWeb_view_navigation_data();
            CryptoOrderEventDataDto cryptoOrderEventDataDto = cryptoOrderEventDataDtoFromProto;
            WebViewNavigationDataDto webViewNavigationDataDtoFromProto = web_view_navigation_data != null ? WebViewNavigationDataDto.INSTANCE.fromProto(web_view_navigation_data) : null;
            NetworkErrorData network_error_data = proto.getNetwork_error_data();
            WebViewNavigationDataDto webViewNavigationDataDto = webViewNavigationDataDtoFromProto;
            NetworkErrorDataDto networkErrorDataDtoFromProto = network_error_data != null ? NetworkErrorDataDto.INSTANCE.fromProto(network_error_data) : null;
            DeviceSecurityEventData device_security_event_data = proto.getDevice_security_event_data();
            NetworkErrorDataDto networkErrorDataDto = networkErrorDataDtoFromProto;
            DeviceSecurityEventDataDto deviceSecurityEventDataDtoFromProto = device_security_event_data != null ? DeviceSecurityEventDataDto.INSTANCE.fromProto(device_security_event_data) : null;
            DeviceMetricEventData device_metric_event_data = proto.getDevice_metric_event_data();
            DeviceSecurityEventDataDto deviceSecurityEventDataDto = deviceSecurityEventDataDtoFromProto;
            DeviceMetricEventDataDto deviceMetricEventDataDtoFromProto = device_metric_event_data != null ? DeviceMetricEventDataDto.INSTANCE.fromProto(device_metric_event_data) : null;
            ArkoseLabsEventData arkose_labs_event_data = proto.getArkose_labs_event_data();
            DeviceMetricEventDataDto deviceMetricEventDataDto = deviceMetricEventDataDtoFromProto;
            ArkoseLabsEventDataDto arkoseLabsEventDataDtoFromProto = arkose_labs_event_data != null ? ArkoseLabsEventDataDto.INSTANCE.fromProto(arkose_labs_event_data) : null;
            TwilioConversationsSdkEventData twilio_conversations_sdk_event_data = proto.getTwilio_conversations_sdk_event_data();
            ArkoseLabsEventDataDto arkoseLabsEventDataDto = arkoseLabsEventDataDtoFromProto;
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDtoFromProto = twilio_conversations_sdk_event_data != null ? TwilioConversationsSdkEventDataDto.INSTANCE.fromProto(twilio_conversations_sdk_event_data) : null;
            PathfinderFallbackToWebViewEventData pathfinder_fallback_to_web_view_event_data = proto.getPathfinder_fallback_to_web_view_event_data();
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto = twilioConversationsSdkEventDataDtoFromProto;
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDtoFromProto = pathfinder_fallback_to_web_view_event_data != null ? PathfinderFallbackToWebViewEventDataDto.INSTANCE.fromProto(pathfinder_fallback_to_web_view_event_data) : null;
            DeviceApprovalReenrollmentEventData device_approval_reenrollment_event_data = proto.getDevice_approval_reenrollment_event_data();
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto = pathfinderFallbackToWebViewEventDataDtoFromProto;
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDtoFromProto = device_approval_reenrollment_event_data != null ? DeviceApprovalReenrollmentEventDataDto.INSTANCE.fromProto(device_approval_reenrollment_event_data) : null;
            AccountSecurityEventData account_security_event_data = proto.getAccount_security_event_data();
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto = deviceApprovalReenrollmentEventDataDtoFromProto;
            AccountSecurityEventDataDto accountSecurityEventDataDtoFromProto = account_security_event_data != null ? AccountSecurityEventDataDto.INSTANCE.fromProto(account_security_event_data) : null;
            CatpayOrderEventData catpay_order_data = proto.getCatpay_order_data();
            AccountSecurityEventDataDto accountSecurityEventDataDto = accountSecurityEventDataDtoFromProto;
            CatpayOrderEventDataDto catpayOrderEventDataDtoFromProto = catpay_order_data != null ? CatpayOrderEventDataDto.INSTANCE.fromProto(catpay_order_data) : null;
            HttpCallData http_call_data = proto.getHttp_call_data();
            CatpayOrderEventDataDto catpayOrderEventDataDto = catpayOrderEventDataDtoFromProto;
            HttpCallDataDto httpCallDataDtoFromProto = http_call_data != null ? HttpCallDataDto.INSTANCE.fromProto(http_call_data) : null;
            PerpetualOrderEventData perpetual_order_data = proto.getPerpetual_order_data();
            HttpCallDataDto httpCallDataDto = httpCallDataDtoFromProto;
            PerpetualOrderEventDataDto perpetualOrderEventDataDtoFromProto = perpetual_order_data != null ? PerpetualOrderEventDataDto.INSTANCE.fromProto(perpetual_order_data) : null;
            PerceivedLoadingTimeEventData perceived_loading_time_event_data = proto.getPerceived_loading_time_event_data();
            return new RhGlobalAppEventDto(new Surrogate(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, appEventDataDto, screenTransitionEventDataDtoFromProto, pushNotificationEventDataDtoFromProto, notificationStackEventDataDtoFromProto, tabGroupEventDataDtoFromProto, appSessionEventDataDtoFromProto, deepLinkEventDataDto, emailEventDataDto, errorEventDataDto, webEventDataDto, userInteractionEventDataDto, performanceMetricEventDataDto, performanceMetricSpanEventDataDto, experimentsEventDataDto, cryptoOrderEventDataDto, webViewNavigationDataDto, networkErrorDataDto, deviceSecurityEventDataDto, deviceMetricEventDataDto, arkoseLabsEventDataDto, twilioConversationsSdkEventDataDto, pathfinderFallbackToWebViewEventDataDto, deviceApprovalReenrollmentEventDataDto, accountSecurityEventDataDto, catpayOrderEventDataDto, httpCallDataDto, perpetualOrderEventDataDtoFromProto, perceived_loading_time_event_data != null ? PerceivedLoadingTimeEventDataDto.INSTANCE.fromProto(perceived_loading_time_event_data) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RhGlobalAppEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhGlobalAppEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RhGlobalAppEventDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RhGlobalAppEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RhGlobalAppEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.RhGlobalAppEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RhGlobalAppEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RhGlobalAppEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RhGlobalAppEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RhGlobalAppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RhGlobalAppEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.RhGlobalAppEventDto";
        }
    }
}
