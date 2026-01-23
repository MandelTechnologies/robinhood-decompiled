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
import com.robinhood.rosetta.eventlogging.AdjustDataDto;
import com.robinhood.rosetta.eventlogging.AppEventDataDto;
import com.robinhood.rosetta.eventlogging.AppSessionEventDataDto;
import com.robinhood.rosetta.eventlogging.ArkoseLabsEventDataDto;
import com.robinhood.rosetta.eventlogging.ButtonGroupEventDataDto;
import com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.CryptoOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.DebitCardSCAEventDataDto;
import com.robinhood.rosetta.eventlogging.DeepLinkEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceApprovalReenrollmentEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventDataDto;
import com.robinhood.rosetta.eventlogging.EmailEventDataDto;
import com.robinhood.rosetta.eventlogging.EquityOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.ErrorEventDataDto;
import com.robinhood.rosetta.eventlogging.ExperimentsEventDataDto;
import com.robinhood.rosetta.eventlogging.HttpCallDataDto;
import com.robinhood.rosetta.eventlogging.NetworkErrorDataDto;
import com.robinhood.rosetta.eventlogging.NotificationStackEventDataDto;
import com.robinhood.rosetta.eventlogging.OAuthLoginEventDataDto;
import com.robinhood.rosetta.eventlogging.OptionOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.OrderEventDataDto;
import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventDataDto;
import com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventDataDto;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto;
import com.robinhood.rosetta.eventlogging.PerpetualOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.PlaidEventDataDto;
import com.robinhood.rosetta.eventlogging.PromptsChallengeEventDataDto;
import com.robinhood.rosetta.eventlogging.PushNotificationEventDataDto;
import com.robinhood.rosetta.eventlogging.RecommendationsEventDataDto;
import com.robinhood.rosetta.eventlogging.SMSDataDto;
import com.robinhood.rosetta.eventlogging.ScreenTransitionEventDataDto;
import com.robinhood.rosetta.eventlogging.TabGroupEventDataDto;
import com.robinhood.rosetta.eventlogging.TimeFirstInteractionDataDto;
import com.robinhood.rosetta.eventlogging.TutorialEventDataDto;
import com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventDataDto;
import com.robinhood.rosetta.eventlogging.UserActionDataDto;
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

/* compiled from: AppEventDto.kt */
@Metadata(m3635d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bb\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Ó\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\bÒ\u0001Ó\u0001Ô\u0001Õ\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BÑ\u0004\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010^\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010b\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010d¢\u0006\u0004\b\u0006\u0010eJÏ\u0004\u0010Ã\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010^2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010b2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010dJ\t\u0010Ä\u0001\u001a\u00020\u0002H\u0016J\t\u0010Å\u0001\u001a\u00020\tH\u0016J\u0017\u0010Æ\u0001\u001a\u00030Ç\u00012\n\u0010È\u0001\u001a\u0005\u0018\u00010É\u0001H\u0096\u0002J\n\u0010Ê\u0001\u001a\u00030Ë\u0001H\u0016J\u001e\u0010Ì\u0001\u001a\u00030Í\u00012\b\u0010Î\u0001\u001a\u00030Ï\u00012\b\u0010Ð\u0001\u001a\u00030Ë\u0001H\u0016J\n\u0010Ñ\u0001\u001a\u00030Ë\u0001H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bh\u0010gR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bj\u0010gR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bk\u0010gR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bl\u0010gR\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bm\u0010gR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bn\u0010gR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0014\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0015\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0015\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0015\u00101\u001a\u0004\u0018\u0001028F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0015\u00103\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u00105\u001a\u0004\u0018\u0001068F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0015\u00107\u001a\u0004\u0018\u0001088F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0015\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0015\u0010;\u001a\u0004\u0018\u00010<8F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0015\u0010=\u001a\u0004\u0018\u00010>8F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0015\u0010?\u001a\u0004\u0018\u00010@8F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0015\u0010A\u001a\u0004\u0018\u00010B8F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0015\u0010C\u001a\u0004\u0018\u00010D8F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010E\u001a\u0004\u0018\u00010F8F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0015\u0010G\u001a\u0004\u0018\u00010H8F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010I\u001a\u0004\u0018\u00010J8F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010K\u001a\u0004\u0018\u00010L8F¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0015\u0010M\u001a\u0004\u0018\u00010N8F¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0015\u0010O\u001a\u0004\u0018\u00010P8F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0015\u0010Q\u001a\u0004\u0018\u00010R8F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0015\u0010S\u001a\u0004\u0018\u00010T8F¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0015\u0010U\u001a\u0004\u0018\u00010V8F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0015\u0010W\u001a\u0004\u0018\u00010X8F¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0015\u0010Y\u001a\u0004\u0018\u00010Z8F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0015\u0010[\u001a\u0004\u0018\u00010\\8F¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u0015\u0010]\u001a\u0004\u0018\u00010^8F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0015\u0010_\u001a\u0004\u0018\u00010`8F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0015\u0010a\u001a\u0004\u0018\u00010b8F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0015\u0010c\u001a\u0004\u0018\u00010d8F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001¨\u0006Ö\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AppEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AppEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AppEventDto$Surrogate;)V", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "nav_tab", "experiments", "session_id", "url", "web_referrer", "web_referrer_host", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "screen_data", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "push_notification_data", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "notification_stack_data", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "tab_group_data", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "button_group_data", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;", "app_session_data", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "tutorial_data", "Lcom/robinhood/rosetta/eventlogging/TutorialEventDataDto;", "deep_link_data", "Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "email_data", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "error_data", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "web_data", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "user_action_data", "Lcom/robinhood/rosetta/eventlogging/UserActionDataDto;", "sms_data", "Lcom/robinhood/rosetta/eventlogging/SMSDataDto;", "adjust_data", "Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;", "plaid_event_data", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;", "debit_card_s_c_a_event_data", "Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventDataDto;", "user_interaction_event_data", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "performance_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "performance_metric_span_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "order_data", "Lcom/robinhood/rosetta/eventlogging/OrderEventDataDto;", "time_first_interaction_data", "Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionDataDto;", "experiments_data", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "equity_order_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;", "option_order_data", "Lcom/robinhood/rosetta/eventlogging/OptionOrderEventDataDto;", "crypto_order_data", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "web_view_navigation_data", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "network_error_data", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "device_security_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "http_call_data", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "device_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "arkose_labs_event_data", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "oauth_login_event_data", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;", "prompts_challenge_event_data", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;", "twilio_conversations_sdk_event_data", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "pathfinder_fallback_to_web_view_event_data", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "recommendations_event_data", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;", "device_approval_reenrollment_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;", "account_security_event_data", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "catpay_order_data", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "perpetual_order_data", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;", "perceived_loading_time_event_data", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/TutorialEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserActionDataDto;Lcom/robinhood/rosetta/eventlogging/SMSDataDto;Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/OrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/OptionOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;)V", "getCategory", "()Ljava/lang/String;", "getEvent", "getNav_tab", "getExperiments", "getSession_id", "getUrl", "getWeb_referrer", "getWeb_referrer_host", "getData", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "getScreen_data", "()Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "getPush_notification_data", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "getNotification_stack_data", "()Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "getTab_group_data", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "getButton_group_data", "()Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;", "getApp_session_data", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "getTutorial_data", "()Lcom/robinhood/rosetta/eventlogging/TutorialEventDataDto;", "getDeep_link_data", "()Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "getEmail_data", "()Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "getError_data", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "getWeb_data", "()Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "getUser_action_data", "()Lcom/robinhood/rosetta/eventlogging/UserActionDataDto;", "getSms_data", "()Lcom/robinhood/rosetta/eventlogging/SMSDataDto;", "getAdjust_data", "()Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;", "getPlaid_event_data", "()Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;", "getDebit_card_s_c_a_event_data", "()Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventDataDto;", "getUser_interaction_event_data", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "getPerformance_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "getPerformance_metric_span_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "getOrder_data", "()Lcom/robinhood/rosetta/eventlogging/OrderEventDataDto;", "getTime_first_interaction_data", "()Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionDataDto;", "getExperiments_data", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "getEquity_order_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;", "getOption_order_data", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderEventDataDto;", "getCrypto_order_data", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "getWeb_view_navigation_data", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "getNetwork_error_data", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "getDevice_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "getHttp_call_data", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "getDevice_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "getArkose_labs_event_data", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "getOauth_login_event_data", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;", "getPrompts_challenge_event_data", "()Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;", "getTwilio_conversations_sdk_event_data", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "getPathfinder_fallback_to_web_view_event_data", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "getRecommendations_event_data", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;", "getDevice_approval_reenrollment_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;", "getAccount_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "getCatpay_order_data", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "getPerpetual_order_data", "()Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;", "getPerceived_loading_time_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class AppEventDto implements Dto3<AppEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AppEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AppEventDto, AppEvent>> binaryBase64Serializer$delegate;
    private static final AppEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AppEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AppEventDto(Surrogate surrogate) {
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

    public final ButtonGroupEventDataDto getButton_group_data() {
        return this.surrogate.getButton_group_data();
    }

    public final AppSessionEventDataDto getApp_session_data() {
        return this.surrogate.getApp_session_data();
    }

    public final TutorialEventDataDto getTutorial_data() {
        return this.surrogate.getTutorial_data();
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

    public final UserActionDataDto getUser_action_data() {
        return this.surrogate.getUser_action_data();
    }

    public final SMSDataDto getSms_data() {
        return this.surrogate.getSms_data();
    }

    public final AdjustDataDto getAdjust_data() {
        return this.surrogate.getAdjust_data();
    }

    public final PlaidEventDataDto getPlaid_event_data() {
        return this.surrogate.getPlaid_event_data();
    }

    public final DebitCardSCAEventDataDto getDebit_card_s_c_a_event_data() {
        return this.surrogate.getDebit_card_s_c_a_event_data();
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

    public final OrderEventDataDto getOrder_data() {
        return this.surrogate.getOrder_data();
    }

    public final TimeFirstInteractionDataDto getTime_first_interaction_data() {
        return this.surrogate.getTime_first_interaction_data();
    }

    public final ExperimentsEventDataDto getExperiments_data() {
        return this.surrogate.getExperiments_data();
    }

    public final EquityOrderEventDataDto getEquity_order_data() {
        return this.surrogate.getEquity_order_data();
    }

    public final OptionOrderEventDataDto getOption_order_data() {
        return this.surrogate.getOption_order_data();
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

    public final HttpCallDataDto getHttp_call_data() {
        return this.surrogate.getHttp_call_data();
    }

    public final DeviceMetricEventDataDto getDevice_metric_event_data() {
        return this.surrogate.getDevice_metric_event_data();
    }

    public final ArkoseLabsEventDataDto getArkose_labs_event_data() {
        return this.surrogate.getArkose_labs_event_data();
    }

    public final OAuthLoginEventDataDto getOauth_login_event_data() {
        return this.surrogate.getOauth_login_event_data();
    }

    public final PromptsChallengeEventDataDto getPrompts_challenge_event_data() {
        return this.surrogate.getPrompts_challenge_event_data();
    }

    public final TwilioConversationsSdkEventDataDto getTwilio_conversations_sdk_event_data() {
        return this.surrogate.getTwilio_conversations_sdk_event_data();
    }

    public final PathfinderFallbackToWebViewEventDataDto getPathfinder_fallback_to_web_view_event_data() {
        return this.surrogate.getPathfinder_fallback_to_web_view_event_data();
    }

    public final RecommendationsEventDataDto getRecommendations_event_data() {
        return this.surrogate.getRecommendations_event_data();
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

    public final PerpetualOrderEventDataDto getPerpetual_order_data() {
        return this.surrogate.getPerpetual_order_data();
    }

    public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
        return this.surrogate.getPerceived_loading_time_event_data();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppEventDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, ButtonGroupEventDataDto buttonGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, TutorialEventDataDto tutorialEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserActionDataDto userActionDataDto, SMSDataDto sMSDataDto, AdjustDataDto adjustDataDto, PlaidEventDataDto plaidEventDataDto, DebitCardSCAEventDataDto debitCardSCAEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, OrderEventDataDto orderEventDataDto, TimeFirstInteractionDataDto timeFirstInteractionDataDto, ExperimentsEventDataDto experimentsEventDataDto, EquityOrderEventDataDto equityOrderEventDataDto, OptionOrderEventDataDto optionOrderEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, OAuthLoginEventDataDto oAuthLoginEventDataDto, PromptsChallengeEventDataDto promptsChallengeEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, RecommendationsEventDataDto recommendationsEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str9 = (i & 1) != 0 ? "" : str;
        this(str9, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : appEventDataDto, (i & 512) != 0 ? null : screenTransitionEventDataDto, (i & 1024) != 0 ? null : pushNotificationEventDataDto, (i & 2048) != 0 ? null : notificationStackEventDataDto, (i & 4096) != 0 ? null : tabGroupEventDataDto, (i & 8192) != 0 ? null : buttonGroupEventDataDto, (i & 16384) != 0 ? null : appSessionEventDataDto, (i & 32768) != 0 ? null : tutorialEventDataDto, (i & 65536) != 0 ? null : deepLinkEventDataDto, (i & 131072) != 0 ? null : emailEventDataDto, (i & 262144) != 0 ? null : errorEventDataDto, (i & 524288) != 0 ? null : webEventDataDto, (i & 1048576) != 0 ? null : userActionDataDto, (i & 2097152) != 0 ? null : sMSDataDto, (i & 4194304) != 0 ? null : adjustDataDto, (i & 8388608) != 0 ? null : plaidEventDataDto, (i & 16777216) != 0 ? null : debitCardSCAEventDataDto, (i & 33554432) != 0 ? null : userInteractionEventDataDto, (i & 67108864) != 0 ? null : performanceMetricEventDataDto, (i & 134217728) != 0 ? null : performanceMetricSpanEventDataDto, (i & 268435456) != 0 ? null : orderEventDataDto, (i & 536870912) != 0 ? null : timeFirstInteractionDataDto, (i & 1073741824) != 0 ? null : experimentsEventDataDto, (i & Integer.MIN_VALUE) != 0 ? null : equityOrderEventDataDto, (i2 & 1) != 0 ? null : optionOrderEventDataDto, (i2 & 2) != 0 ? null : cryptoOrderEventDataDto, (i2 & 4) != 0 ? null : webViewNavigationDataDto, (i2 & 8) != 0 ? null : networkErrorDataDto, (i2 & 16) != 0 ? null : deviceSecurityEventDataDto, (i2 & 32) != 0 ? null : httpCallDataDto, (i2 & 64) != 0 ? null : deviceMetricEventDataDto, (i2 & 128) != 0 ? null : arkoseLabsEventDataDto, (i2 & 256) != 0 ? null : oAuthLoginEventDataDto, (i2 & 512) != 0 ? null : promptsChallengeEventDataDto, (i2 & 1024) != 0 ? null : twilioConversationsSdkEventDataDto, (i2 & 2048) != 0 ? null : pathfinderFallbackToWebViewEventDataDto, (i2 & 4096) != 0 ? null : recommendationsEventDataDto, (i2 & 8192) != 0 ? null : deviceApprovalReenrollmentEventDataDto, (i2 & 16384) != 0 ? null : accountSecurityEventDataDto, (i2 & 32768) != 0 ? null : catpayOrderEventDataDto, (i2 & 65536) != 0 ? null : perpetualOrderEventDataDto, (i2 & 131072) != 0 ? null : perceivedLoadingTimeEventDataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppEventDto(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, ButtonGroupEventDataDto buttonGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, TutorialEventDataDto tutorialEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserActionDataDto userActionDataDto, SMSDataDto sMSDataDto, AdjustDataDto adjustDataDto, PlaidEventDataDto plaidEventDataDto, DebitCardSCAEventDataDto debitCardSCAEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, OrderEventDataDto orderEventDataDto, TimeFirstInteractionDataDto timeFirstInteractionDataDto, ExperimentsEventDataDto experimentsEventDataDto, EquityOrderEventDataDto equityOrderEventDataDto, OptionOrderEventDataDto optionOrderEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, OAuthLoginEventDataDto oAuthLoginEventDataDto, PromptsChallengeEventDataDto promptsChallengeEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, RecommendationsEventDataDto recommendationsEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto) {
        this(new Surrogate(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, appEventDataDto, screenTransitionEventDataDto, pushNotificationEventDataDto, notificationStackEventDataDto, tabGroupEventDataDto, buttonGroupEventDataDto, appSessionEventDataDto, tutorialEventDataDto, deepLinkEventDataDto, emailEventDataDto, errorEventDataDto, webEventDataDto, userActionDataDto, sMSDataDto, adjustDataDto, plaidEventDataDto, debitCardSCAEventDataDto, userInteractionEventDataDto, performanceMetricEventDataDto, performanceMetricSpanEventDataDto, orderEventDataDto, timeFirstInteractionDataDto, experimentsEventDataDto, equityOrderEventDataDto, optionOrderEventDataDto, cryptoOrderEventDataDto, webViewNavigationDataDto, networkErrorDataDto, deviceSecurityEventDataDto, httpCallDataDto, deviceMetricEventDataDto, arkoseLabsEventDataDto, oAuthLoginEventDataDto, promptsChallengeEventDataDto, twilioConversationsSdkEventDataDto, pathfinderFallbackToWebViewEventDataDto, recommendationsEventDataDto, deviceApprovalReenrollmentEventDataDto, accountSecurityEventDataDto, catpayOrderEventDataDto, perpetualOrderEventDataDto, perceivedLoadingTimeEventDataDto));
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
    }

    public final AppEventDto copy(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventDataDto data, ScreenTransitionEventDataDto screen_data, PushNotificationEventDataDto push_notification_data, NotificationStackEventDataDto notification_stack_data, TabGroupEventDataDto tab_group_data, ButtonGroupEventDataDto button_group_data, AppSessionEventDataDto app_session_data, TutorialEventDataDto tutorial_data, DeepLinkEventDataDto deep_link_data, EmailEventDataDto email_data, ErrorEventDataDto error_data, WebEventDataDto web_data, UserActionDataDto user_action_data, SMSDataDto sms_data, AdjustDataDto adjust_data, PlaidEventDataDto plaid_event_data, DebitCardSCAEventDataDto debit_card_s_c_a_event_data, UserInteractionEventDataDto user_interaction_event_data, PerformanceMetricEventDataDto performance_metric_event_data, PerformanceMetricSpanEventDataDto performance_metric_span_event_data, OrderEventDataDto order_data, TimeFirstInteractionDataDto time_first_interaction_data, ExperimentsEventDataDto experiments_data, EquityOrderEventDataDto equity_order_data, OptionOrderEventDataDto option_order_data, CryptoOrderEventDataDto crypto_order_data, WebViewNavigationDataDto web_view_navigation_data, NetworkErrorDataDto network_error_data, DeviceSecurityEventDataDto device_security_event_data, HttpCallDataDto http_call_data, DeviceMetricEventDataDto device_metric_event_data, ArkoseLabsEventDataDto arkose_labs_event_data, OAuthLoginEventDataDto oauth_login_event_data, PromptsChallengeEventDataDto prompts_challenge_event_data, TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data, PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data, RecommendationsEventDataDto recommendations_event_data, DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data, AccountSecurityEventDataDto account_security_event_data, CatpayOrderEventDataDto catpay_order_data, PerpetualOrderEventDataDto perpetual_order_data, PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
        return new AppEventDto(new Surrogate(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, data, screen_data, push_notification_data, notification_stack_data, tab_group_data, button_group_data, app_session_data, tutorial_data, deep_link_data, email_data, error_data, web_data, user_action_data, sms_data, adjust_data, plaid_event_data, debit_card_s_c_a_event_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, order_data, time_first_interaction_data, experiments_data, equity_order_data, option_order_data, crypto_order_data, web_view_navigation_data, network_error_data, device_security_event_data, http_call_data, device_metric_event_data, arkose_labs_event_data, oauth_login_event_data, prompts_challenge_event_data, twilio_conversations_sdk_event_data, pathfinder_fallback_to_web_view_event_data, recommendations_event_data, device_approval_reenrollment_event_data, account_security_event_data, catpay_order_data, perpetual_order_data, perceived_loading_time_event_data));
    }

    @Override // com.robinhood.idl.Dto
    public AppEvent toProto() {
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
        ButtonGroupEventDataDto button_group_data = this.surrogate.getButton_group_data();
        ButtonGroupEventData proto6 = button_group_data != null ? button_group_data.toProto() : null;
        AppSessionEventDataDto app_session_data = this.surrogate.getApp_session_data();
        AppSessionEventData proto7 = app_session_data != null ? app_session_data.toProto() : null;
        TutorialEventDataDto tutorial_data = this.surrogate.getTutorial_data();
        TutorialEventData proto8 = tutorial_data != null ? tutorial_data.toProto() : null;
        DeepLinkEventDataDto deep_link_data = this.surrogate.getDeep_link_data();
        DeepLinkEventData proto9 = deep_link_data != null ? deep_link_data.toProto() : null;
        EmailEventDataDto email_data = this.surrogate.getEmail_data();
        EmailEventData proto10 = email_data != null ? email_data.toProto() : null;
        ErrorEventDataDto error_data = this.surrogate.getError_data();
        ErrorEventData proto11 = error_data != null ? error_data.toProto() : null;
        WebEventDataDto web_data = this.surrogate.getWeb_data();
        WebEventData proto12 = web_data != null ? web_data.toProto() : null;
        UserActionDataDto user_action_data = this.surrogate.getUser_action_data();
        UserActionData proto13 = user_action_data != null ? user_action_data.toProto() : null;
        SMSDataDto sms_data = this.surrogate.getSms_data();
        SMSData proto14 = sms_data != null ? sms_data.toProto() : null;
        AdjustDataDto adjust_data = this.surrogate.getAdjust_data();
        AdjustData proto15 = adjust_data != null ? adjust_data.toProto() : null;
        PlaidEventDataDto plaid_event_data = this.surrogate.getPlaid_event_data();
        PlaidEventData proto16 = plaid_event_data != null ? plaid_event_data.toProto() : null;
        DebitCardSCAEventDataDto debit_card_s_c_a_event_data = this.surrogate.getDebit_card_s_c_a_event_data();
        DebitCardSCAEventData proto17 = debit_card_s_c_a_event_data != null ? debit_card_s_c_a_event_data.toProto() : null;
        UserInteractionEventDataDto user_interaction_event_data = this.surrogate.getUser_interaction_event_data();
        UserInteractionEventData proto18 = user_interaction_event_data != null ? user_interaction_event_data.toProto() : null;
        PerformanceMetricEventDataDto performance_metric_event_data = this.surrogate.getPerformance_metric_event_data();
        PerformanceMetricEventData proto19 = performance_metric_event_data != null ? performance_metric_event_data.toProto() : null;
        PerformanceMetricSpanEventDataDto performance_metric_span_event_data = this.surrogate.getPerformance_metric_span_event_data();
        PerformanceMetricSpanEventData proto20 = performance_metric_span_event_data != null ? performance_metric_span_event_data.toProto() : null;
        OrderEventDataDto order_data = this.surrogate.getOrder_data();
        OrderEventData proto21 = order_data != null ? order_data.toProto() : null;
        TimeFirstInteractionDataDto time_first_interaction_data = this.surrogate.getTime_first_interaction_data();
        TimeFirstInteractionData proto22 = time_first_interaction_data != null ? time_first_interaction_data.toProto() : null;
        ExperimentsEventDataDto experiments_data = this.surrogate.getExperiments_data();
        ExperimentsEventData proto23 = experiments_data != null ? experiments_data.toProto() : null;
        EquityOrderEventDataDto equity_order_data = this.surrogate.getEquity_order_data();
        EquityOrderEventData proto24 = equity_order_data != null ? equity_order_data.toProto() : null;
        OptionOrderEventDataDto option_order_data = this.surrogate.getOption_order_data();
        OptionOrderEventData proto25 = option_order_data != null ? option_order_data.toProto() : null;
        CryptoOrderEventDataDto crypto_order_data = this.surrogate.getCrypto_order_data();
        CryptoOrderEventData proto26 = crypto_order_data != null ? crypto_order_data.toProto() : null;
        WebViewNavigationDataDto web_view_navigation_data = this.surrogate.getWeb_view_navigation_data();
        WebViewNavigationData proto27 = web_view_navigation_data != null ? web_view_navigation_data.toProto() : null;
        NetworkErrorDataDto network_error_data = this.surrogate.getNetwork_error_data();
        NetworkErrorData proto28 = network_error_data != null ? network_error_data.toProto() : null;
        DeviceSecurityEventDataDto device_security_event_data = this.surrogate.getDevice_security_event_data();
        DeviceSecurityEventData proto29 = device_security_event_data != null ? device_security_event_data.toProto() : null;
        HttpCallDataDto http_call_data = this.surrogate.getHttp_call_data();
        HttpCallData proto30 = http_call_data != null ? http_call_data.toProto() : null;
        DeviceMetricEventDataDto device_metric_event_data = this.surrogate.getDevice_metric_event_data();
        DeviceMetricEventData proto31 = device_metric_event_data != null ? device_metric_event_data.toProto() : null;
        ArkoseLabsEventDataDto arkose_labs_event_data = this.surrogate.getArkose_labs_event_data();
        ArkoseLabsEventData proto32 = arkose_labs_event_data != null ? arkose_labs_event_data.toProto() : null;
        OAuthLoginEventDataDto oauth_login_event_data = this.surrogate.getOauth_login_event_data();
        OAuthLoginEventData proto33 = oauth_login_event_data != null ? oauth_login_event_data.toProto() : null;
        PromptsChallengeEventDataDto prompts_challenge_event_data = this.surrogate.getPrompts_challenge_event_data();
        PromptsChallengeEventData proto34 = prompts_challenge_event_data != null ? prompts_challenge_event_data.toProto() : null;
        TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data = this.surrogate.getTwilio_conversations_sdk_event_data();
        TwilioConversationsSdkEventData proto35 = twilio_conversations_sdk_event_data != null ? twilio_conversations_sdk_event_data.toProto() : null;
        PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data = this.surrogate.getPathfinder_fallback_to_web_view_event_data();
        PathfinderFallbackToWebViewEventData proto36 = pathfinder_fallback_to_web_view_event_data != null ? pathfinder_fallback_to_web_view_event_data.toProto() : null;
        RecommendationsEventDataDto recommendations_event_data = this.surrogate.getRecommendations_event_data();
        RecommendationsEventData proto37 = recommendations_event_data != null ? recommendations_event_data.toProto() : null;
        DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data = this.surrogate.getDevice_approval_reenrollment_event_data();
        DeviceApprovalReenrollmentEventData proto38 = device_approval_reenrollment_event_data != null ? device_approval_reenrollment_event_data.toProto() : null;
        AccountSecurityEventDataDto account_security_event_data = this.surrogate.getAccount_security_event_data();
        AccountSecurityEventData proto39 = account_security_event_data != null ? account_security_event_data.toProto() : null;
        CatpayOrderEventDataDto catpay_order_data = this.surrogate.getCatpay_order_data();
        CatpayOrderEventData proto40 = catpay_order_data != null ? catpay_order_data.toProto() : null;
        PerpetualOrderEventDataDto perpetual_order_data = this.surrogate.getPerpetual_order_data();
        PerpetualOrderEventData proto41 = perpetual_order_data != null ? perpetual_order_data.toProto() : null;
        PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data = this.surrogate.getPerceived_loading_time_event_data();
        return new AppEvent(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, proto18, proto19, proto20, proto21, proto22, proto23, proto24, proto25, proto26, proto27, proto28, proto29, proto30, proto31, proto32, proto33, proto34, proto35, proto36, proto37, proto38, proto39, proto40, proto41, perceived_loading_time_event_data != null ? perceived_loading_time_event_data.toProto() : null, null, 0, 262144, null);
    }

    public String toString() {
        return "[AppEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AppEventDto) && Intrinsics.areEqual(((AppEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: AppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000¿\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\bÅ\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ¸\u00022\u00020\u0001:\u0004·\u0002¸\u0002BÏ\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010^¢\u0006\u0004\b_\u0010`B\u0097\u0004\b\u0010\u0012\u0006\u0010a\u001a\u00020b\u0012\u0006\u0010c\u001a\u00020b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010,\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u000102\u0012\b\u00103\u001a\u0004\u0018\u000104\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\b\u0010=\u001a\u0004\u0018\u00010>\u0012\b\u0010?\u001a\u0004\u0018\u00010@\u0012\b\u0010A\u001a\u0004\u0018\u00010B\u0012\b\u0010C\u001a\u0004\u0018\u00010D\u0012\b\u0010E\u001a\u0004\u0018\u00010F\u0012\b\u0010G\u001a\u0004\u0018\u00010H\u0012\b\u0010I\u001a\u0004\u0018\u00010J\u0012\b\u0010K\u001a\u0004\u0018\u00010L\u0012\b\u0010M\u001a\u0004\u0018\u00010N\u0012\b\u0010O\u001a\u0004\u0018\u00010P\u0012\b\u0010Q\u001a\u0004\u0018\u00010R\u0012\b\u0010S\u001a\u0004\u0018\u00010T\u0012\b\u0010U\u001a\u0004\u0018\u00010V\u0012\b\u0010W\u001a\u0004\u0018\u00010X\u0012\b\u0010Y\u001a\u0004\u0018\u00010Z\u0012\b\u0010[\u001a\u0004\u0018\u00010\\\u0012\b\u0010]\u001a\u0004\u0018\u00010^\u0012\b\u0010d\u001a\u0004\u0018\u00010e¢\u0006\u0004\b_\u0010fJ\n\u0010÷\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010 HÆ\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010,HÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010.HÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u000100HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u000102HÆ\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010\u0094\u0002\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010\u0095\u0002\u001a\u0004\u0018\u000108HÆ\u0003J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010>HÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010@HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010BHÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010DHÆ\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010FHÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010HHÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010JHÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010LHÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010NHÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u00010PHÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u00010RHÆ\u0003J\f\u0010£\u0002\u001a\u0004\u0018\u00010THÆ\u0003J\f\u0010¤\u0002\u001a\u0004\u0018\u00010VHÆ\u0003J\f\u0010¥\u0002\u001a\u0004\u0018\u00010XHÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010ZHÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010\\HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010^HÆ\u0003JÒ\u0004\u0010©\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010^HÆ\u0001J\u0016\u0010ª\u0002\u001a\u00030«\u00022\t\u0010¬\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u00ad\u0002\u001a\u00020bHÖ\u0001J\n\u0010®\u0002\u001a\u00020\u0003HÖ\u0001J-\u0010¯\u0002\u001a\u00030°\u00022\u0007\u0010±\u0002\u001a\u00020\u00002\b\u0010²\u0002\u001a\u00030³\u00022\b\u0010´\u0002\u001a\u00030µ\u0002H\u0001¢\u0006\u0003\b¶\u0002R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bk\u0010h\u001a\u0004\bl\u0010jR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bm\u0010h\u001a\u0004\bn\u0010jR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bo\u0010h\u001a\u0004\bp\u0010jR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bq\u0010h\u001a\u0004\br\u0010jR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bs\u0010h\u001a\u0004\bt\u0010jR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u0010h\u001a\u0004\bv\u0010jR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u0010h\u001a\u0004\bx\u0010jR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u0010h\u001a\u0004\bz\u0010{R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b|\u0010h\u001a\u0004\b}\u0010~R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0004\b\u007f\u0010h\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0082\u0001\u0010h\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0085\u0001\u0010h\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0088\u0001\u0010h\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008b\u0001\u0010h\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008e\u0001\u0010h\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R!\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0091\u0001\u0010h\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R!\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0094\u0001\u0010h\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R!\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0097\u0001\u0010h\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R!\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009a\u0001\u0010h\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009d\u0001\u0010h\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b \u0001\u0010h\u001a\u0006\b¡\u0001\u0010¢\u0001R!\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b£\u0001\u0010h\u001a\u0006\b¤\u0001\u0010¥\u0001R!\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¦\u0001\u0010h\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b©\u0001\u0010h\u001a\u0006\bª\u0001\u0010«\u0001R!\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¬\u0001\u0010h\u001a\u0006\b\u00ad\u0001\u0010®\u0001R!\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¯\u0001\u0010h\u001a\u0006\b°\u0001\u0010±\u0001R!\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b²\u0001\u0010h\u001a\u0006\b³\u0001\u0010´\u0001R!\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bµ\u0001\u0010h\u001a\u0006\b¶\u0001\u0010·\u0001R!\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¸\u0001\u0010h\u001a\u0006\b¹\u0001\u0010º\u0001R!\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b»\u0001\u0010h\u001a\u0006\b¼\u0001\u0010½\u0001R!\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¾\u0001\u0010h\u001a\u0006\b¿\u0001\u0010À\u0001R!\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÁ\u0001\u0010h\u001a\u0006\bÂ\u0001\u0010Ã\u0001R!\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÄ\u0001\u0010h\u001a\u0006\bÅ\u0001\u0010Æ\u0001R!\u0010?\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÇ\u0001\u0010h\u001a\u0006\bÈ\u0001\u0010É\u0001R!\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÊ\u0001\u0010h\u001a\u0006\bË\u0001\u0010Ì\u0001R!\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÍ\u0001\u0010h\u001a\u0006\bÎ\u0001\u0010Ï\u0001R!\u0010E\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÐ\u0001\u0010h\u001a\u0006\bÑ\u0001\u0010Ò\u0001R!\u0010G\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÓ\u0001\u0010h\u001a\u0006\bÔ\u0001\u0010Õ\u0001R!\u0010I\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÖ\u0001\u0010h\u001a\u0006\b×\u0001\u0010Ø\u0001R!\u0010K\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÙ\u0001\u0010h\u001a\u0006\bÚ\u0001\u0010Û\u0001R!\u0010M\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÜ\u0001\u0010h\u001a\u0006\bÝ\u0001\u0010Þ\u0001R!\u0010O\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bß\u0001\u0010h\u001a\u0006\bà\u0001\u0010á\u0001R!\u0010Q\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bâ\u0001\u0010h\u001a\u0006\bã\u0001\u0010ä\u0001R!\u0010S\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bå\u0001\u0010h\u001a\u0006\bæ\u0001\u0010ç\u0001R!\u0010U\u001a\u0004\u0018\u00010V8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bè\u0001\u0010h\u001a\u0006\bé\u0001\u0010ê\u0001R!\u0010W\u001a\u0004\u0018\u00010X8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bë\u0001\u0010h\u001a\u0006\bì\u0001\u0010í\u0001R!\u0010Y\u001a\u0004\u0018\u00010Z8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bî\u0001\u0010h\u001a\u0006\bï\u0001\u0010ð\u0001R!\u0010[\u001a\u0004\u0018\u00010\\8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bñ\u0001\u0010h\u001a\u0006\bò\u0001\u0010ó\u0001R!\u0010]\u001a\u0004\u0018\u00010^8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bô\u0001\u0010h\u001a\u0006\bõ\u0001\u0010ö\u0001¨\u0006¹\u0002"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDto$Surrogate;", "", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "nav_tab", "experiments", "session_id", "url", "web_referrer", "web_referrer_host", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "screen_data", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "push_notification_data", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "notification_stack_data", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "tab_group_data", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "button_group_data", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;", "app_session_data", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "tutorial_data", "Lcom/robinhood/rosetta/eventlogging/TutorialEventDataDto;", "deep_link_data", "Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "email_data", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "error_data", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "web_data", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "user_action_data", "Lcom/robinhood/rosetta/eventlogging/UserActionDataDto;", "sms_data", "Lcom/robinhood/rosetta/eventlogging/SMSDataDto;", "adjust_data", "Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;", "plaid_event_data", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;", "debit_card_s_c_a_event_data", "Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventDataDto;", "user_interaction_event_data", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "performance_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "performance_metric_span_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "order_data", "Lcom/robinhood/rosetta/eventlogging/OrderEventDataDto;", "time_first_interaction_data", "Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionDataDto;", "experiments_data", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "equity_order_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;", "option_order_data", "Lcom/robinhood/rosetta/eventlogging/OptionOrderEventDataDto;", "crypto_order_data", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "web_view_navigation_data", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "network_error_data", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "device_security_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "http_call_data", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "device_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "arkose_labs_event_data", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "oauth_login_event_data", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;", "prompts_challenge_event_data", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;", "twilio_conversations_sdk_event_data", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "pathfinder_fallback_to_web_view_event_data", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "recommendations_event_data", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;", "device_approval_reenrollment_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;", "account_security_event_data", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "catpay_order_data", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "perpetual_order_data", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;", "perceived_loading_time_event_data", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/TutorialEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserActionDataDto;Lcom/robinhood/rosetta/eventlogging/SMSDataDto;Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/OrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/OptionOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;)V", "seen0", "", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/TutorialEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserActionDataDto;Lcom/robinhood/rosetta/eventlogging/SMSDataDto;Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/OrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/OptionOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCategory$annotations", "()V", "getCategory", "()Ljava/lang/String;", "getEvent$annotations", "getEvent", "getNav_tab$annotations", "getNav_tab", "getExperiments$annotations", "getExperiments", "getSession_id$annotations", "getSession_id", "getUrl$annotations", "getUrl", "getWeb_referrer$annotations", "getWeb_referrer", "getWeb_referrer_host$annotations", "getWeb_referrer_host", "getData$annotations", "getData", "()Lcom/robinhood/rosetta/eventlogging/AppEventDataDto;", "getScreen_data$annotations", "getScreen_data", "()Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventDataDto;", "getPush_notification_data$annotations", "getPush_notification_data", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "getNotification_stack_data$annotations", "getNotification_stack_data", "()Lcom/robinhood/rosetta/eventlogging/NotificationStackEventDataDto;", "getTab_group_data$annotations", "getTab_group_data", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventDataDto;", "getButton_group_data$annotations", "getButton_group_data", "()Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventDataDto;", "getApp_session_data$annotations", "getApp_session_data", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "getTutorial_data$annotations", "getTutorial_data", "()Lcom/robinhood/rosetta/eventlogging/TutorialEventDataDto;", "getDeep_link_data$annotations", "getDeep_link_data", "()Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "getEmail_data$annotations", "getEmail_data", "()Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "getError_data$annotations", "getError_data", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "getWeb_data$annotations", "getWeb_data", "()Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "getUser_action_data$annotations", "getUser_action_data", "()Lcom/robinhood/rosetta/eventlogging/UserActionDataDto;", "getSms_data$annotations", "getSms_data", "()Lcom/robinhood/rosetta/eventlogging/SMSDataDto;", "getAdjust_data$annotations", "getAdjust_data", "()Lcom/robinhood/rosetta/eventlogging/AdjustDataDto;", "getPlaid_event_data$annotations", "getPlaid_event_data", "()Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;", "getDebit_card_s_c_a_event_data$annotations", "getDebit_card_s_c_a_event_data", "()Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventDataDto;", "getUser_interaction_event_data$annotations", "getUser_interaction_event_data", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "getPerformance_metric_event_data$annotations", "getPerformance_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "getPerformance_metric_span_event_data$annotations", "getPerformance_metric_span_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "getOrder_data$annotations", "getOrder_data", "()Lcom/robinhood/rosetta/eventlogging/OrderEventDataDto;", "getTime_first_interaction_data$annotations", "getTime_first_interaction_data", "()Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionDataDto;", "getExperiments_data$annotations", "getExperiments_data", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "getEquity_order_data$annotations", "getEquity_order_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;", "getOption_order_data$annotations", "getOption_order_data", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderEventDataDto;", "getCrypto_order_data$annotations", "getCrypto_order_data", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventDataDto;", "getWeb_view_navigation_data$annotations", "getWeb_view_navigation_data", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationDataDto;", "getNetwork_error_data$annotations", "getNetwork_error_data", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "getDevice_security_event_data$annotations", "getDevice_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "getHttp_call_data$annotations", "getHttp_call_data", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "getDevice_metric_event_data$annotations", "getDevice_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "getArkose_labs_event_data$annotations", "getArkose_labs_event_data", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventDataDto;", "getOauth_login_event_data$annotations", "getOauth_login_event_data", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventDataDto;", "getPrompts_challenge_event_data$annotations", "getPrompts_challenge_event_data", "()Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;", "getTwilio_conversations_sdk_event_data$annotations", "getTwilio_conversations_sdk_event_data", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventDataDto;", "getPathfinder_fallback_to_web_view_event_data$annotations", "getPathfinder_fallback_to_web_view_event_data", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventDataDto;", "getRecommendations_event_data$annotations", "getRecommendations_event_data", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;", "getDevice_approval_reenrollment_event_data$annotations", "getDevice_approval_reenrollment_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventDataDto;", "getAccount_security_event_data$annotations", "getAccount_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "getCatpay_order_data$annotations", "getCatpay_order_data", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "getPerpetual_order_data$annotations", "getPerpetual_order_data", "()Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventDataDto;", "getPerceived_loading_time_event_data$annotations", "getPerceived_loading_time_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AccountSecurityEventDataDto account_security_event_data;
        private final AdjustDataDto adjust_data;
        private final AppSessionEventDataDto app_session_data;
        private final ArkoseLabsEventDataDto arkose_labs_event_data;
        private final ButtonGroupEventDataDto button_group_data;
        private final String category;
        private final CatpayOrderEventDataDto catpay_order_data;
        private final CryptoOrderEventDataDto crypto_order_data;
        private final AppEventDataDto data;
        private final DebitCardSCAEventDataDto debit_card_s_c_a_event_data;
        private final DeepLinkEventDataDto deep_link_data;
        private final DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data;
        private final DeviceMetricEventDataDto device_metric_event_data;
        private final DeviceSecurityEventDataDto device_security_event_data;
        private final EmailEventDataDto email_data;
        private final EquityOrderEventDataDto equity_order_data;
        private final ErrorEventDataDto error_data;
        private final String event;
        private final String experiments;
        private final ExperimentsEventDataDto experiments_data;
        private final HttpCallDataDto http_call_data;
        private final String nav_tab;
        private final NetworkErrorDataDto network_error_data;
        private final NotificationStackEventDataDto notification_stack_data;
        private final OAuthLoginEventDataDto oauth_login_event_data;
        private final OptionOrderEventDataDto option_order_data;
        private final OrderEventDataDto order_data;
        private final PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data;
        private final PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data;
        private final PerformanceMetricEventDataDto performance_metric_event_data;
        private final PerformanceMetricSpanEventDataDto performance_metric_span_event_data;
        private final PerpetualOrderEventDataDto perpetual_order_data;
        private final PlaidEventDataDto plaid_event_data;
        private final PromptsChallengeEventDataDto prompts_challenge_event_data;
        private final PushNotificationEventDataDto push_notification_data;
        private final RecommendationsEventDataDto recommendations_event_data;
        private final ScreenTransitionEventDataDto screen_data;
        private final String session_id;
        private final SMSDataDto sms_data;
        private final TabGroupEventDataDto tab_group_data;
        private final TimeFirstInteractionDataDto time_first_interaction_data;
        private final TutorialEventDataDto tutorial_data;
        private final TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data;
        private final String url;
        private final UserActionDataDto user_action_data;
        private final UserInteractionEventDataDto user_interaction_event_data;
        private final WebEventDataDto web_data;
        private final String web_referrer;
        private final String web_referrer_host;
        private final WebViewNavigationDataDto web_view_navigation_data;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AppEventDataDto) null, (ScreenTransitionEventDataDto) null, (PushNotificationEventDataDto) null, (NotificationStackEventDataDto) null, (TabGroupEventDataDto) null, (ButtonGroupEventDataDto) null, (AppSessionEventDataDto) null, (TutorialEventDataDto) null, (DeepLinkEventDataDto) null, (EmailEventDataDto) null, (ErrorEventDataDto) null, (WebEventDataDto) null, (UserActionDataDto) null, (SMSDataDto) null, (AdjustDataDto) null, (PlaidEventDataDto) null, (DebitCardSCAEventDataDto) null, (UserInteractionEventDataDto) null, (PerformanceMetricEventDataDto) null, (PerformanceMetricSpanEventDataDto) null, (OrderEventDataDto) null, (TimeFirstInteractionDataDto) null, (ExperimentsEventDataDto) null, (EquityOrderEventDataDto) null, (OptionOrderEventDataDto) null, (CryptoOrderEventDataDto) null, (WebViewNavigationDataDto) null, (NetworkErrorDataDto) null, (DeviceSecurityEventDataDto) null, (HttpCallDataDto) null, (DeviceMetricEventDataDto) null, (ArkoseLabsEventDataDto) null, (OAuthLoginEventDataDto) null, (PromptsChallengeEventDataDto) null, (TwilioConversationsSdkEventDataDto) null, (PathfinderFallbackToWebViewEventDataDto) null, (RecommendationsEventDataDto) null, (DeviceApprovalReenrollmentEventDataDto) null, (AccountSecurityEventDataDto) null, (CatpayOrderEventDataDto) null, (PerpetualOrderEventDataDto) null, (PerceivedLoadingTimeEventDataDto) null, -1, 262143, (DefaultConstructorMarker) null);
        }

        @SerialName("accountSecurityEventData")
        @JsonAnnotations2(names = {"account_security_event_data"})
        public static /* synthetic */ void getAccount_security_event_data$annotations() {
        }

        @SerialName("adjustData")
        @JsonAnnotations2(names = {"adjust_data"})
        public static /* synthetic */ void getAdjust_data$annotations() {
        }

        @SerialName("appSessionData")
        @JsonAnnotations2(names = {"app_session_data"})
        public static /* synthetic */ void getApp_session_data$annotations() {
        }

        @SerialName("arkoseLabsEventData")
        @JsonAnnotations2(names = {"arkose_labs_event_data"})
        public static /* synthetic */ void getArkose_labs_event_data$annotations() {
        }

        @SerialName("buttonGroupData")
        @JsonAnnotations2(names = {"button_group_data"})
        public static /* synthetic */ void getButton_group_data$annotations() {
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

        @SerialName("debitCardSCAEventData")
        @JsonAnnotations2(names = {"debit_card_s_c_a_event_data"})
        public static /* synthetic */ void getDebit_card_s_c_a_event_data$annotations() {
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

        @SerialName("equityOrderData")
        @JsonAnnotations2(names = {"equity_order_data"})
        public static /* synthetic */ void getEquity_order_data$annotations() {
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

        @SerialName("oauthLoginEventData")
        @JsonAnnotations2(names = {"oauth_login_event_data"})
        public static /* synthetic */ void getOauth_login_event_data$annotations() {
        }

        @SerialName("optionOrderData")
        @JsonAnnotations2(names = {"option_order_data"})
        public static /* synthetic */ void getOption_order_data$annotations() {
        }

        @SerialName("orderData")
        @JsonAnnotations2(names = {"order_data"})
        public static /* synthetic */ void getOrder_data$annotations() {
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

        @SerialName("plaidEventData")
        @JsonAnnotations2(names = {"plaid_event_data"})
        public static /* synthetic */ void getPlaid_event_data$annotations() {
        }

        @SerialName("promptsChallengeEventData")
        @JsonAnnotations2(names = {"prompts_challenge_event_data"})
        public static /* synthetic */ void getPrompts_challenge_event_data$annotations() {
        }

        @SerialName("pushNotificationData")
        @JsonAnnotations2(names = {"push_notification_data"})
        public static /* synthetic */ void getPush_notification_data$annotations() {
        }

        @SerialName("recommendationsEventData")
        @JsonAnnotations2(names = {"recommendations_event_data"})
        public static /* synthetic */ void getRecommendations_event_data$annotations() {
        }

        @SerialName("screenData")
        @JsonAnnotations2(names = {"screen_data"})
        public static /* synthetic */ void getScreen_data$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("smsData")
        @JsonAnnotations2(names = {"sms_data"})
        public static /* synthetic */ void getSms_data$annotations() {
        }

        @SerialName("tabGroupData")
        @JsonAnnotations2(names = {"tab_group_data"})
        public static /* synthetic */ void getTab_group_data$annotations() {
        }

        @SerialName("timeFirstInteractionData")
        @JsonAnnotations2(names = {"time_first_interaction_data"})
        public static /* synthetic */ void getTime_first_interaction_data$annotations() {
        }

        @SerialName("tutorialData")
        @JsonAnnotations2(names = {"tutorial_data"})
        public static /* synthetic */ void getTutorial_data$annotations() {
        }

        @SerialName("twilioConversationsSdkEventData")
        @JsonAnnotations2(names = {"twilio_conversations_sdk_event_data"})
        public static /* synthetic */ void getTwilio_conversations_sdk_event_data$annotations() {
        }

        @SerialName("url")
        @JsonAnnotations2(names = {"url"})
        public static /* synthetic */ void getUrl$annotations() {
        }

        @SerialName("userActionData")
        @JsonAnnotations2(names = {"user_action_data"})
        public static /* synthetic */ void getUser_action_data$annotations() {
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
        public final ButtonGroupEventDataDto getButton_group_data() {
            return this.button_group_data;
        }

        /* renamed from: component15, reason: from getter */
        public final AppSessionEventDataDto getApp_session_data() {
            return this.app_session_data;
        }

        /* renamed from: component16, reason: from getter */
        public final TutorialEventDataDto getTutorial_data() {
            return this.tutorial_data;
        }

        /* renamed from: component17, reason: from getter */
        public final DeepLinkEventDataDto getDeep_link_data() {
            return this.deep_link_data;
        }

        /* renamed from: component18, reason: from getter */
        public final EmailEventDataDto getEmail_data() {
            return this.email_data;
        }

        /* renamed from: component19, reason: from getter */
        public final ErrorEventDataDto getError_data() {
            return this.error_data;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent() {
            return this.event;
        }

        /* renamed from: component20, reason: from getter */
        public final WebEventDataDto getWeb_data() {
            return this.web_data;
        }

        /* renamed from: component21, reason: from getter */
        public final UserActionDataDto getUser_action_data() {
            return this.user_action_data;
        }

        /* renamed from: component22, reason: from getter */
        public final SMSDataDto getSms_data() {
            return this.sms_data;
        }

        /* renamed from: component23, reason: from getter */
        public final AdjustDataDto getAdjust_data() {
            return this.adjust_data;
        }

        /* renamed from: component24, reason: from getter */
        public final PlaidEventDataDto getPlaid_event_data() {
            return this.plaid_event_data;
        }

        /* renamed from: component25, reason: from getter */
        public final DebitCardSCAEventDataDto getDebit_card_s_c_a_event_data() {
            return this.debit_card_s_c_a_event_data;
        }

        /* renamed from: component26, reason: from getter */
        public final UserInteractionEventDataDto getUser_interaction_event_data() {
            return this.user_interaction_event_data;
        }

        /* renamed from: component27, reason: from getter */
        public final PerformanceMetricEventDataDto getPerformance_metric_event_data() {
            return this.performance_metric_event_data;
        }

        /* renamed from: component28, reason: from getter */
        public final PerformanceMetricSpanEventDataDto getPerformance_metric_span_event_data() {
            return this.performance_metric_span_event_data;
        }

        /* renamed from: component29, reason: from getter */
        public final OrderEventDataDto getOrder_data() {
            return this.order_data;
        }

        /* renamed from: component3, reason: from getter */
        public final String getNav_tab() {
            return this.nav_tab;
        }

        /* renamed from: component30, reason: from getter */
        public final TimeFirstInteractionDataDto getTime_first_interaction_data() {
            return this.time_first_interaction_data;
        }

        /* renamed from: component31, reason: from getter */
        public final ExperimentsEventDataDto getExperiments_data() {
            return this.experiments_data;
        }

        /* renamed from: component32, reason: from getter */
        public final EquityOrderEventDataDto getEquity_order_data() {
            return this.equity_order_data;
        }

        /* renamed from: component33, reason: from getter */
        public final OptionOrderEventDataDto getOption_order_data() {
            return this.option_order_data;
        }

        /* renamed from: component34, reason: from getter */
        public final CryptoOrderEventDataDto getCrypto_order_data() {
            return this.crypto_order_data;
        }

        /* renamed from: component35, reason: from getter */
        public final WebViewNavigationDataDto getWeb_view_navigation_data() {
            return this.web_view_navigation_data;
        }

        /* renamed from: component36, reason: from getter */
        public final NetworkErrorDataDto getNetwork_error_data() {
            return this.network_error_data;
        }

        /* renamed from: component37, reason: from getter */
        public final DeviceSecurityEventDataDto getDevice_security_event_data() {
            return this.device_security_event_data;
        }

        /* renamed from: component38, reason: from getter */
        public final HttpCallDataDto getHttp_call_data() {
            return this.http_call_data;
        }

        /* renamed from: component39, reason: from getter */
        public final DeviceMetricEventDataDto getDevice_metric_event_data() {
            return this.device_metric_event_data;
        }

        /* renamed from: component4, reason: from getter */
        public final String getExperiments() {
            return this.experiments;
        }

        /* renamed from: component40, reason: from getter */
        public final ArkoseLabsEventDataDto getArkose_labs_event_data() {
            return this.arkose_labs_event_data;
        }

        /* renamed from: component41, reason: from getter */
        public final OAuthLoginEventDataDto getOauth_login_event_data() {
            return this.oauth_login_event_data;
        }

        /* renamed from: component42, reason: from getter */
        public final PromptsChallengeEventDataDto getPrompts_challenge_event_data() {
            return this.prompts_challenge_event_data;
        }

        /* renamed from: component43, reason: from getter */
        public final TwilioConversationsSdkEventDataDto getTwilio_conversations_sdk_event_data() {
            return this.twilio_conversations_sdk_event_data;
        }

        /* renamed from: component44, reason: from getter */
        public final PathfinderFallbackToWebViewEventDataDto getPathfinder_fallback_to_web_view_event_data() {
            return this.pathfinder_fallback_to_web_view_event_data;
        }

        /* renamed from: component45, reason: from getter */
        public final RecommendationsEventDataDto getRecommendations_event_data() {
            return this.recommendations_event_data;
        }

        /* renamed from: component46, reason: from getter */
        public final DeviceApprovalReenrollmentEventDataDto getDevice_approval_reenrollment_event_data() {
            return this.device_approval_reenrollment_event_data;
        }

        /* renamed from: component47, reason: from getter */
        public final AccountSecurityEventDataDto getAccount_security_event_data() {
            return this.account_security_event_data;
        }

        /* renamed from: component48, reason: from getter */
        public final CatpayOrderEventDataDto getCatpay_order_data() {
            return this.catpay_order_data;
        }

        /* renamed from: component49, reason: from getter */
        public final PerpetualOrderEventDataDto getPerpetual_order_data() {
            return this.perpetual_order_data;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component50, reason: from getter */
        public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
            return this.perceived_loading_time_event_data;
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

        public final Surrogate copy(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventDataDto data, ScreenTransitionEventDataDto screen_data, PushNotificationEventDataDto push_notification_data, NotificationStackEventDataDto notification_stack_data, TabGroupEventDataDto tab_group_data, ButtonGroupEventDataDto button_group_data, AppSessionEventDataDto app_session_data, TutorialEventDataDto tutorial_data, DeepLinkEventDataDto deep_link_data, EmailEventDataDto email_data, ErrorEventDataDto error_data, WebEventDataDto web_data, UserActionDataDto user_action_data, SMSDataDto sms_data, AdjustDataDto adjust_data, PlaidEventDataDto plaid_event_data, DebitCardSCAEventDataDto debit_card_s_c_a_event_data, UserInteractionEventDataDto user_interaction_event_data, PerformanceMetricEventDataDto performance_metric_event_data, PerformanceMetricSpanEventDataDto performance_metric_span_event_data, OrderEventDataDto order_data, TimeFirstInteractionDataDto time_first_interaction_data, ExperimentsEventDataDto experiments_data, EquityOrderEventDataDto equity_order_data, OptionOrderEventDataDto option_order_data, CryptoOrderEventDataDto crypto_order_data, WebViewNavigationDataDto web_view_navigation_data, NetworkErrorDataDto network_error_data, DeviceSecurityEventDataDto device_security_event_data, HttpCallDataDto http_call_data, DeviceMetricEventDataDto device_metric_event_data, ArkoseLabsEventDataDto arkose_labs_event_data, OAuthLoginEventDataDto oauth_login_event_data, PromptsChallengeEventDataDto prompts_challenge_event_data, TwilioConversationsSdkEventDataDto twilio_conversations_sdk_event_data, PathfinderFallbackToWebViewEventDataDto pathfinder_fallback_to_web_view_event_data, RecommendationsEventDataDto recommendations_event_data, DeviceApprovalReenrollmentEventDataDto device_approval_reenrollment_event_data, AccountSecurityEventDataDto account_security_event_data, CatpayOrderEventDataDto catpay_order_data, PerpetualOrderEventDataDto perpetual_order_data, PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
            Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
            return new Surrogate(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, data, screen_data, push_notification_data, notification_stack_data, tab_group_data, button_group_data, app_session_data, tutorial_data, deep_link_data, email_data, error_data, web_data, user_action_data, sms_data, adjust_data, plaid_event_data, debit_card_s_c_a_event_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, order_data, time_first_interaction_data, experiments_data, equity_order_data, option_order_data, crypto_order_data, web_view_navigation_data, network_error_data, device_security_event_data, http_call_data, device_metric_event_data, arkose_labs_event_data, oauth_login_event_data, prompts_challenge_event_data, twilio_conversations_sdk_event_data, pathfinder_fallback_to_web_view_event_data, recommendations_event_data, device_approval_reenrollment_event_data, account_security_event_data, catpay_order_data, perpetual_order_data, perceived_loading_time_event_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.category, surrogate.category) && Intrinsics.areEqual(this.event, surrogate.event) && Intrinsics.areEqual(this.nav_tab, surrogate.nav_tab) && Intrinsics.areEqual(this.experiments, surrogate.experiments) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.web_referrer, surrogate.web_referrer) && Intrinsics.areEqual(this.web_referrer_host, surrogate.web_referrer_host) && Intrinsics.areEqual(this.data, surrogate.data) && Intrinsics.areEqual(this.screen_data, surrogate.screen_data) && Intrinsics.areEqual(this.push_notification_data, surrogate.push_notification_data) && Intrinsics.areEqual(this.notification_stack_data, surrogate.notification_stack_data) && Intrinsics.areEqual(this.tab_group_data, surrogate.tab_group_data) && Intrinsics.areEqual(this.button_group_data, surrogate.button_group_data) && Intrinsics.areEqual(this.app_session_data, surrogate.app_session_data) && Intrinsics.areEqual(this.tutorial_data, surrogate.tutorial_data) && Intrinsics.areEqual(this.deep_link_data, surrogate.deep_link_data) && Intrinsics.areEqual(this.email_data, surrogate.email_data) && Intrinsics.areEqual(this.error_data, surrogate.error_data) && Intrinsics.areEqual(this.web_data, surrogate.web_data) && Intrinsics.areEqual(this.user_action_data, surrogate.user_action_data) && Intrinsics.areEqual(this.sms_data, surrogate.sms_data) && Intrinsics.areEqual(this.adjust_data, surrogate.adjust_data) && Intrinsics.areEqual(this.plaid_event_data, surrogate.plaid_event_data) && Intrinsics.areEqual(this.debit_card_s_c_a_event_data, surrogate.debit_card_s_c_a_event_data) && Intrinsics.areEqual(this.user_interaction_event_data, surrogate.user_interaction_event_data) && Intrinsics.areEqual(this.performance_metric_event_data, surrogate.performance_metric_event_data) && Intrinsics.areEqual(this.performance_metric_span_event_data, surrogate.performance_metric_span_event_data) && Intrinsics.areEqual(this.order_data, surrogate.order_data) && Intrinsics.areEqual(this.time_first_interaction_data, surrogate.time_first_interaction_data) && Intrinsics.areEqual(this.experiments_data, surrogate.experiments_data) && Intrinsics.areEqual(this.equity_order_data, surrogate.equity_order_data) && Intrinsics.areEqual(this.option_order_data, surrogate.option_order_data) && Intrinsics.areEqual(this.crypto_order_data, surrogate.crypto_order_data) && Intrinsics.areEqual(this.web_view_navigation_data, surrogate.web_view_navigation_data) && Intrinsics.areEqual(this.network_error_data, surrogate.network_error_data) && Intrinsics.areEqual(this.device_security_event_data, surrogate.device_security_event_data) && Intrinsics.areEqual(this.http_call_data, surrogate.http_call_data) && Intrinsics.areEqual(this.device_metric_event_data, surrogate.device_metric_event_data) && Intrinsics.areEqual(this.arkose_labs_event_data, surrogate.arkose_labs_event_data) && Intrinsics.areEqual(this.oauth_login_event_data, surrogate.oauth_login_event_data) && Intrinsics.areEqual(this.prompts_challenge_event_data, surrogate.prompts_challenge_event_data) && Intrinsics.areEqual(this.twilio_conversations_sdk_event_data, surrogate.twilio_conversations_sdk_event_data) && Intrinsics.areEqual(this.pathfinder_fallback_to_web_view_event_data, surrogate.pathfinder_fallback_to_web_view_event_data) && Intrinsics.areEqual(this.recommendations_event_data, surrogate.recommendations_event_data) && Intrinsics.areEqual(this.device_approval_reenrollment_event_data, surrogate.device_approval_reenrollment_event_data) && Intrinsics.areEqual(this.account_security_event_data, surrogate.account_security_event_data) && Intrinsics.areEqual(this.catpay_order_data, surrogate.catpay_order_data) && Intrinsics.areEqual(this.perpetual_order_data, surrogate.perpetual_order_data) && Intrinsics.areEqual(this.perceived_loading_time_event_data, surrogate.perceived_loading_time_event_data);
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
            ButtonGroupEventDataDto buttonGroupEventDataDto = this.button_group_data;
            int iHashCode7 = (iHashCode6 + (buttonGroupEventDataDto == null ? 0 : buttonGroupEventDataDto.hashCode())) * 31;
            AppSessionEventDataDto appSessionEventDataDto = this.app_session_data;
            int iHashCode8 = (iHashCode7 + (appSessionEventDataDto == null ? 0 : appSessionEventDataDto.hashCode())) * 31;
            TutorialEventDataDto tutorialEventDataDto = this.tutorial_data;
            int iHashCode9 = (iHashCode8 + (tutorialEventDataDto == null ? 0 : tutorialEventDataDto.hashCode())) * 31;
            DeepLinkEventDataDto deepLinkEventDataDto = this.deep_link_data;
            int iHashCode10 = (iHashCode9 + (deepLinkEventDataDto == null ? 0 : deepLinkEventDataDto.hashCode())) * 31;
            EmailEventDataDto emailEventDataDto = this.email_data;
            int iHashCode11 = (iHashCode10 + (emailEventDataDto == null ? 0 : emailEventDataDto.hashCode())) * 31;
            ErrorEventDataDto errorEventDataDto = this.error_data;
            int iHashCode12 = (iHashCode11 + (errorEventDataDto == null ? 0 : errorEventDataDto.hashCode())) * 31;
            WebEventDataDto webEventDataDto = this.web_data;
            int iHashCode13 = (iHashCode12 + (webEventDataDto == null ? 0 : webEventDataDto.hashCode())) * 31;
            UserActionDataDto userActionDataDto = this.user_action_data;
            int iHashCode14 = (iHashCode13 + (userActionDataDto == null ? 0 : userActionDataDto.hashCode())) * 31;
            SMSDataDto sMSDataDto = this.sms_data;
            int iHashCode15 = (iHashCode14 + (sMSDataDto == null ? 0 : sMSDataDto.hashCode())) * 31;
            AdjustDataDto adjustDataDto = this.adjust_data;
            int iHashCode16 = (iHashCode15 + (adjustDataDto == null ? 0 : adjustDataDto.hashCode())) * 31;
            PlaidEventDataDto plaidEventDataDto = this.plaid_event_data;
            int iHashCode17 = (iHashCode16 + (plaidEventDataDto == null ? 0 : plaidEventDataDto.hashCode())) * 31;
            DebitCardSCAEventDataDto debitCardSCAEventDataDto = this.debit_card_s_c_a_event_data;
            int iHashCode18 = (iHashCode17 + (debitCardSCAEventDataDto == null ? 0 : debitCardSCAEventDataDto.hashCode())) * 31;
            UserInteractionEventDataDto userInteractionEventDataDto = this.user_interaction_event_data;
            int iHashCode19 = (iHashCode18 + (userInteractionEventDataDto == null ? 0 : userInteractionEventDataDto.hashCode())) * 31;
            PerformanceMetricEventDataDto performanceMetricEventDataDto = this.performance_metric_event_data;
            int iHashCode20 = (iHashCode19 + (performanceMetricEventDataDto == null ? 0 : performanceMetricEventDataDto.hashCode())) * 31;
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto = this.performance_metric_span_event_data;
            int iHashCode21 = (iHashCode20 + (performanceMetricSpanEventDataDto == null ? 0 : performanceMetricSpanEventDataDto.hashCode())) * 31;
            OrderEventDataDto orderEventDataDto = this.order_data;
            int iHashCode22 = (iHashCode21 + (orderEventDataDto == null ? 0 : orderEventDataDto.hashCode())) * 31;
            TimeFirstInteractionDataDto timeFirstInteractionDataDto = this.time_first_interaction_data;
            int iHashCode23 = (iHashCode22 + (timeFirstInteractionDataDto == null ? 0 : timeFirstInteractionDataDto.hashCode())) * 31;
            ExperimentsEventDataDto experimentsEventDataDto = this.experiments_data;
            int iHashCode24 = (iHashCode23 + (experimentsEventDataDto == null ? 0 : experimentsEventDataDto.hashCode())) * 31;
            EquityOrderEventDataDto equityOrderEventDataDto = this.equity_order_data;
            int iHashCode25 = (iHashCode24 + (equityOrderEventDataDto == null ? 0 : equityOrderEventDataDto.hashCode())) * 31;
            OptionOrderEventDataDto optionOrderEventDataDto = this.option_order_data;
            int iHashCode26 = (iHashCode25 + (optionOrderEventDataDto == null ? 0 : optionOrderEventDataDto.hashCode())) * 31;
            CryptoOrderEventDataDto cryptoOrderEventDataDto = this.crypto_order_data;
            int iHashCode27 = (iHashCode26 + (cryptoOrderEventDataDto == null ? 0 : cryptoOrderEventDataDto.hashCode())) * 31;
            WebViewNavigationDataDto webViewNavigationDataDto = this.web_view_navigation_data;
            int iHashCode28 = (iHashCode27 + (webViewNavigationDataDto == null ? 0 : webViewNavigationDataDto.hashCode())) * 31;
            NetworkErrorDataDto networkErrorDataDto = this.network_error_data;
            int iHashCode29 = (iHashCode28 + (networkErrorDataDto == null ? 0 : networkErrorDataDto.hashCode())) * 31;
            DeviceSecurityEventDataDto deviceSecurityEventDataDto = this.device_security_event_data;
            int iHashCode30 = (iHashCode29 + (deviceSecurityEventDataDto == null ? 0 : deviceSecurityEventDataDto.hashCode())) * 31;
            HttpCallDataDto httpCallDataDto = this.http_call_data;
            int iHashCode31 = (iHashCode30 + (httpCallDataDto == null ? 0 : httpCallDataDto.hashCode())) * 31;
            DeviceMetricEventDataDto deviceMetricEventDataDto = this.device_metric_event_data;
            int iHashCode32 = (iHashCode31 + (deviceMetricEventDataDto == null ? 0 : deviceMetricEventDataDto.hashCode())) * 31;
            ArkoseLabsEventDataDto arkoseLabsEventDataDto = this.arkose_labs_event_data;
            int iHashCode33 = (iHashCode32 + (arkoseLabsEventDataDto == null ? 0 : arkoseLabsEventDataDto.hashCode())) * 31;
            OAuthLoginEventDataDto oAuthLoginEventDataDto = this.oauth_login_event_data;
            int iHashCode34 = (iHashCode33 + (oAuthLoginEventDataDto == null ? 0 : oAuthLoginEventDataDto.hashCode())) * 31;
            PromptsChallengeEventDataDto promptsChallengeEventDataDto = this.prompts_challenge_event_data;
            int iHashCode35 = (iHashCode34 + (promptsChallengeEventDataDto == null ? 0 : promptsChallengeEventDataDto.hashCode())) * 31;
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto = this.twilio_conversations_sdk_event_data;
            int iHashCode36 = (iHashCode35 + (twilioConversationsSdkEventDataDto == null ? 0 : twilioConversationsSdkEventDataDto.hashCode())) * 31;
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto = this.pathfinder_fallback_to_web_view_event_data;
            int iHashCode37 = (iHashCode36 + (pathfinderFallbackToWebViewEventDataDto == null ? 0 : pathfinderFallbackToWebViewEventDataDto.hashCode())) * 31;
            RecommendationsEventDataDto recommendationsEventDataDto = this.recommendations_event_data;
            int iHashCode38 = (iHashCode37 + (recommendationsEventDataDto == null ? 0 : recommendationsEventDataDto.hashCode())) * 31;
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto = this.device_approval_reenrollment_event_data;
            int iHashCode39 = (iHashCode38 + (deviceApprovalReenrollmentEventDataDto == null ? 0 : deviceApprovalReenrollmentEventDataDto.hashCode())) * 31;
            AccountSecurityEventDataDto accountSecurityEventDataDto = this.account_security_event_data;
            int iHashCode40 = (iHashCode39 + (accountSecurityEventDataDto == null ? 0 : accountSecurityEventDataDto.hashCode())) * 31;
            CatpayOrderEventDataDto catpayOrderEventDataDto = this.catpay_order_data;
            int iHashCode41 = (iHashCode40 + (catpayOrderEventDataDto == null ? 0 : catpayOrderEventDataDto.hashCode())) * 31;
            PerpetualOrderEventDataDto perpetualOrderEventDataDto = this.perpetual_order_data;
            int iHashCode42 = (iHashCode41 + (perpetualOrderEventDataDto == null ? 0 : perpetualOrderEventDataDto.hashCode())) * 31;
            PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto = this.perceived_loading_time_event_data;
            return iHashCode42 + (perceivedLoadingTimeEventDataDto != null ? perceivedLoadingTimeEventDataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(category=" + this.category + ", event=" + this.event + ", nav_tab=" + this.nav_tab + ", experiments=" + this.experiments + ", session_id=" + this.session_id + ", url=" + this.url + ", web_referrer=" + this.web_referrer + ", web_referrer_host=" + this.web_referrer_host + ", data=" + this.data + ", screen_data=" + this.screen_data + ", push_notification_data=" + this.push_notification_data + ", notification_stack_data=" + this.notification_stack_data + ", tab_group_data=" + this.tab_group_data + ", button_group_data=" + this.button_group_data + ", app_session_data=" + this.app_session_data + ", tutorial_data=" + this.tutorial_data + ", deep_link_data=" + this.deep_link_data + ", email_data=" + this.email_data + ", error_data=" + this.error_data + ", web_data=" + this.web_data + ", user_action_data=" + this.user_action_data + ", sms_data=" + this.sms_data + ", adjust_data=" + this.adjust_data + ", plaid_event_data=" + this.plaid_event_data + ", debit_card_s_c_a_event_data=" + this.debit_card_s_c_a_event_data + ", user_interaction_event_data=" + this.user_interaction_event_data + ", performance_metric_event_data=" + this.performance_metric_event_data + ", performance_metric_span_event_data=" + this.performance_metric_span_event_data + ", order_data=" + this.order_data + ", time_first_interaction_data=" + this.time_first_interaction_data + ", experiments_data=" + this.experiments_data + ", equity_order_data=" + this.equity_order_data + ", option_order_data=" + this.option_order_data + ", crypto_order_data=" + this.crypto_order_data + ", web_view_navigation_data=" + this.web_view_navigation_data + ", network_error_data=" + this.network_error_data + ", device_security_event_data=" + this.device_security_event_data + ", http_call_data=" + this.http_call_data + ", device_metric_event_data=" + this.device_metric_event_data + ", arkose_labs_event_data=" + this.arkose_labs_event_data + ", oauth_login_event_data=" + this.oauth_login_event_data + ", prompts_challenge_event_data=" + this.prompts_challenge_event_data + ", twilio_conversations_sdk_event_data=" + this.twilio_conversations_sdk_event_data + ", pathfinder_fallback_to_web_view_event_data=" + this.pathfinder_fallback_to_web_view_event_data + ", recommendations_event_data=" + this.recommendations_event_data + ", device_approval_reenrollment_event_data=" + this.device_approval_reenrollment_event_data + ", account_security_event_data=" + this.account_security_event_data + ", catpay_order_data=" + this.catpay_order_data + ", perpetual_order_data=" + this.perpetual_order_data + ", perceived_loading_time_event_data=" + this.perceived_loading_time_event_data + ")";
        }

        /* compiled from: AppEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AppEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, ButtonGroupEventDataDto buttonGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, TutorialEventDataDto tutorialEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserActionDataDto userActionDataDto, SMSDataDto sMSDataDto, AdjustDataDto adjustDataDto, PlaidEventDataDto plaidEventDataDto, DebitCardSCAEventDataDto debitCardSCAEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, OrderEventDataDto orderEventDataDto, TimeFirstInteractionDataDto timeFirstInteractionDataDto, ExperimentsEventDataDto experimentsEventDataDto, EquityOrderEventDataDto equityOrderEventDataDto, OptionOrderEventDataDto optionOrderEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, OAuthLoginEventDataDto oAuthLoginEventDataDto, PromptsChallengeEventDataDto promptsChallengeEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, RecommendationsEventDataDto recommendationsEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.button_group_data = null;
            } else {
                this.button_group_data = buttonGroupEventDataDto;
            }
            if ((i & 16384) == 0) {
                this.app_session_data = null;
            } else {
                this.app_session_data = appSessionEventDataDto;
            }
            if ((i & 32768) == 0) {
                this.tutorial_data = null;
            } else {
                this.tutorial_data = tutorialEventDataDto;
            }
            if ((i & 65536) == 0) {
                this.deep_link_data = null;
            } else {
                this.deep_link_data = deepLinkEventDataDto;
            }
            if ((i & 131072) == 0) {
                this.email_data = null;
            } else {
                this.email_data = emailEventDataDto;
            }
            if ((262144 & i) == 0) {
                this.error_data = null;
            } else {
                this.error_data = errorEventDataDto;
            }
            if ((524288 & i) == 0) {
                this.web_data = null;
            } else {
                this.web_data = webEventDataDto;
            }
            if ((1048576 & i) == 0) {
                this.user_action_data = null;
            } else {
                this.user_action_data = userActionDataDto;
            }
            if ((2097152 & i) == 0) {
                this.sms_data = null;
            } else {
                this.sms_data = sMSDataDto;
            }
            if ((4194304 & i) == 0) {
                this.adjust_data = null;
            } else {
                this.adjust_data = adjustDataDto;
            }
            if ((8388608 & i) == 0) {
                this.plaid_event_data = null;
            } else {
                this.plaid_event_data = plaidEventDataDto;
            }
            if ((16777216 & i) == 0) {
                this.debit_card_s_c_a_event_data = null;
            } else {
                this.debit_card_s_c_a_event_data = debitCardSCAEventDataDto;
            }
            if ((33554432 & i) == 0) {
                this.user_interaction_event_data = null;
            } else {
                this.user_interaction_event_data = userInteractionEventDataDto;
            }
            if ((67108864 & i) == 0) {
                this.performance_metric_event_data = null;
            } else {
                this.performance_metric_event_data = performanceMetricEventDataDto;
            }
            if ((134217728 & i) == 0) {
                this.performance_metric_span_event_data = null;
            } else {
                this.performance_metric_span_event_data = performanceMetricSpanEventDataDto;
            }
            if ((268435456 & i) == 0) {
                this.order_data = null;
            } else {
                this.order_data = orderEventDataDto;
            }
            if ((536870912 & i) == 0) {
                this.time_first_interaction_data = null;
            } else {
                this.time_first_interaction_data = timeFirstInteractionDataDto;
            }
            if ((1073741824 & i) == 0) {
                this.experiments_data = null;
            } else {
                this.experiments_data = experimentsEventDataDto;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.equity_order_data = null;
            } else {
                this.equity_order_data = equityOrderEventDataDto;
            }
            if ((i2 & 1) == 0) {
                this.option_order_data = null;
            } else {
                this.option_order_data = optionOrderEventDataDto;
            }
            if ((i2 & 2) == 0) {
                this.crypto_order_data = null;
            } else {
                this.crypto_order_data = cryptoOrderEventDataDto;
            }
            if ((i2 & 4) == 0) {
                this.web_view_navigation_data = null;
            } else {
                this.web_view_navigation_data = webViewNavigationDataDto;
            }
            if ((i2 & 8) == 0) {
                this.network_error_data = null;
            } else {
                this.network_error_data = networkErrorDataDto;
            }
            if ((i2 & 16) == 0) {
                this.device_security_event_data = null;
            } else {
                this.device_security_event_data = deviceSecurityEventDataDto;
            }
            if ((i2 & 32) == 0) {
                this.http_call_data = null;
            } else {
                this.http_call_data = httpCallDataDto;
            }
            if ((i2 & 64) == 0) {
                this.device_metric_event_data = null;
            } else {
                this.device_metric_event_data = deviceMetricEventDataDto;
            }
            if ((i2 & 128) == 0) {
                this.arkose_labs_event_data = null;
            } else {
                this.arkose_labs_event_data = arkoseLabsEventDataDto;
            }
            if ((i2 & 256) == 0) {
                this.oauth_login_event_data = null;
            } else {
                this.oauth_login_event_data = oAuthLoginEventDataDto;
            }
            if ((i2 & 512) == 0) {
                this.prompts_challenge_event_data = null;
            } else {
                this.prompts_challenge_event_data = promptsChallengeEventDataDto;
            }
            if ((i2 & 1024) == 0) {
                this.twilio_conversations_sdk_event_data = null;
            } else {
                this.twilio_conversations_sdk_event_data = twilioConversationsSdkEventDataDto;
            }
            if ((i2 & 2048) == 0) {
                this.pathfinder_fallback_to_web_view_event_data = null;
            } else {
                this.pathfinder_fallback_to_web_view_event_data = pathfinderFallbackToWebViewEventDataDto;
            }
            if ((i2 & 4096) == 0) {
                this.recommendations_event_data = null;
            } else {
                this.recommendations_event_data = recommendationsEventDataDto;
            }
            if ((i2 & 8192) == 0) {
                this.device_approval_reenrollment_event_data = null;
            } else {
                this.device_approval_reenrollment_event_data = deviceApprovalReenrollmentEventDataDto;
            }
            if ((i2 & 16384) == 0) {
                this.account_security_event_data = null;
            } else {
                this.account_security_event_data = accountSecurityEventDataDto;
            }
            if ((i2 & 32768) == 0) {
                this.catpay_order_data = null;
            } else {
                this.catpay_order_data = catpayOrderEventDataDto;
            }
            if ((i2 & 65536) == 0) {
                this.perpetual_order_data = null;
            } else {
                this.perpetual_order_data = perpetualOrderEventDataDto;
            }
            if ((i2 & 131072) == 0) {
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
            ButtonGroupEventDataDto buttonGroupEventDataDto = self.button_group_data;
            if (buttonGroupEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, ButtonGroupEventDataDto.Serializer.INSTANCE, buttonGroupEventDataDto);
            }
            AppSessionEventDataDto appSessionEventDataDto = self.app_session_data;
            if (appSessionEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, AppSessionEventDataDto.Serializer.INSTANCE, appSessionEventDataDto);
            }
            TutorialEventDataDto tutorialEventDataDto = self.tutorial_data;
            if (tutorialEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, TutorialEventDataDto.Serializer.INSTANCE, tutorialEventDataDto);
            }
            DeepLinkEventDataDto deepLinkEventDataDto = self.deep_link_data;
            if (deepLinkEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, DeepLinkEventDataDto.Serializer.INSTANCE, deepLinkEventDataDto);
            }
            EmailEventDataDto emailEventDataDto = self.email_data;
            if (emailEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, EmailEventDataDto.Serializer.INSTANCE, emailEventDataDto);
            }
            ErrorEventDataDto errorEventDataDto = self.error_data;
            if (errorEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, ErrorEventDataDto.Serializer.INSTANCE, errorEventDataDto);
            }
            WebEventDataDto webEventDataDto = self.web_data;
            if (webEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, WebEventDataDto.Serializer.INSTANCE, webEventDataDto);
            }
            UserActionDataDto userActionDataDto = self.user_action_data;
            if (userActionDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, UserActionDataDto.Serializer.INSTANCE, userActionDataDto);
            }
            SMSDataDto sMSDataDto = self.sms_data;
            if (sMSDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, SMSDataDto.Serializer.INSTANCE, sMSDataDto);
            }
            AdjustDataDto adjustDataDto = self.adjust_data;
            if (adjustDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, AdjustDataDto.Serializer.INSTANCE, adjustDataDto);
            }
            PlaidEventDataDto plaidEventDataDto = self.plaid_event_data;
            if (plaidEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, PlaidEventDataDto.Serializer.INSTANCE, plaidEventDataDto);
            }
            DebitCardSCAEventDataDto debitCardSCAEventDataDto = self.debit_card_s_c_a_event_data;
            if (debitCardSCAEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, DebitCardSCAEventDataDto.Serializer.INSTANCE, debitCardSCAEventDataDto);
            }
            UserInteractionEventDataDto userInteractionEventDataDto = self.user_interaction_event_data;
            if (userInteractionEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, UserInteractionEventDataDto.Serializer.INSTANCE, userInteractionEventDataDto);
            }
            PerformanceMetricEventDataDto performanceMetricEventDataDto = self.performance_metric_event_data;
            if (performanceMetricEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, PerformanceMetricEventDataDto.Serializer.INSTANCE, performanceMetricEventDataDto);
            }
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto = self.performance_metric_span_event_data;
            if (performanceMetricSpanEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, PerformanceMetricSpanEventDataDto.Serializer.INSTANCE, performanceMetricSpanEventDataDto);
            }
            OrderEventDataDto orderEventDataDto = self.order_data;
            if (orderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, OrderEventDataDto.Serializer.INSTANCE, orderEventDataDto);
            }
            TimeFirstInteractionDataDto timeFirstInteractionDataDto = self.time_first_interaction_data;
            if (timeFirstInteractionDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, TimeFirstInteractionDataDto.Serializer.INSTANCE, timeFirstInteractionDataDto);
            }
            ExperimentsEventDataDto experimentsEventDataDto = self.experiments_data;
            if (experimentsEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, ExperimentsEventDataDto.Serializer.INSTANCE, experimentsEventDataDto);
            }
            EquityOrderEventDataDto equityOrderEventDataDto = self.equity_order_data;
            if (equityOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, EquityOrderEventDataDto.Serializer.INSTANCE, equityOrderEventDataDto);
            }
            OptionOrderEventDataDto optionOrderEventDataDto = self.option_order_data;
            if (optionOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, OptionOrderEventDataDto.Serializer.INSTANCE, optionOrderEventDataDto);
            }
            CryptoOrderEventDataDto cryptoOrderEventDataDto = self.crypto_order_data;
            if (cryptoOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, CryptoOrderEventDataDto.Serializer.INSTANCE, cryptoOrderEventDataDto);
            }
            WebViewNavigationDataDto webViewNavigationDataDto = self.web_view_navigation_data;
            if (webViewNavigationDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 34, WebViewNavigationDataDto.Serializer.INSTANCE, webViewNavigationDataDto);
            }
            NetworkErrorDataDto networkErrorDataDto = self.network_error_data;
            if (networkErrorDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, NetworkErrorDataDto.Serializer.INSTANCE, networkErrorDataDto);
            }
            DeviceSecurityEventDataDto deviceSecurityEventDataDto = self.device_security_event_data;
            if (deviceSecurityEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 36, DeviceSecurityEventDataDto.Serializer.INSTANCE, deviceSecurityEventDataDto);
            }
            HttpCallDataDto httpCallDataDto = self.http_call_data;
            if (httpCallDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 37, HttpCallDataDto.Serializer.INSTANCE, httpCallDataDto);
            }
            DeviceMetricEventDataDto deviceMetricEventDataDto = self.device_metric_event_data;
            if (deviceMetricEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 38, DeviceMetricEventDataDto.Serializer.INSTANCE, deviceMetricEventDataDto);
            }
            ArkoseLabsEventDataDto arkoseLabsEventDataDto = self.arkose_labs_event_data;
            if (arkoseLabsEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 39, ArkoseLabsEventDataDto.Serializer.INSTANCE, arkoseLabsEventDataDto);
            }
            OAuthLoginEventDataDto oAuthLoginEventDataDto = self.oauth_login_event_data;
            if (oAuthLoginEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 40, OAuthLoginEventDataDto.Serializer.INSTANCE, oAuthLoginEventDataDto);
            }
            PromptsChallengeEventDataDto promptsChallengeEventDataDto = self.prompts_challenge_event_data;
            if (promptsChallengeEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 41, PromptsChallengeEventDataDto.Serializer.INSTANCE, promptsChallengeEventDataDto);
            }
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto = self.twilio_conversations_sdk_event_data;
            if (twilioConversationsSdkEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 42, TwilioConversationsSdkEventDataDto.Serializer.INSTANCE, twilioConversationsSdkEventDataDto);
            }
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto = self.pathfinder_fallback_to_web_view_event_data;
            if (pathfinderFallbackToWebViewEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 43, PathfinderFallbackToWebViewEventDataDto.Serializer.INSTANCE, pathfinderFallbackToWebViewEventDataDto);
            }
            RecommendationsEventDataDto recommendationsEventDataDto = self.recommendations_event_data;
            if (recommendationsEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 44, RecommendationsEventDataDto.Serializer.INSTANCE, recommendationsEventDataDto);
            }
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto = self.device_approval_reenrollment_event_data;
            if (deviceApprovalReenrollmentEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 45, DeviceApprovalReenrollmentEventDataDto.Serializer.INSTANCE, deviceApprovalReenrollmentEventDataDto);
            }
            AccountSecurityEventDataDto accountSecurityEventDataDto = self.account_security_event_data;
            if (accountSecurityEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 46, AccountSecurityEventDataDto.Serializer.INSTANCE, accountSecurityEventDataDto);
            }
            CatpayOrderEventDataDto catpayOrderEventDataDto = self.catpay_order_data;
            if (catpayOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 47, CatpayOrderEventDataDto.Serializer.INSTANCE, catpayOrderEventDataDto);
            }
            PerpetualOrderEventDataDto perpetualOrderEventDataDto = self.perpetual_order_data;
            if (perpetualOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 48, PerpetualOrderEventDataDto.Serializer.INSTANCE, perpetualOrderEventDataDto);
            }
            PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto = self.perceived_loading_time_event_data;
            if (perceivedLoadingTimeEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 49, PerceivedLoadingTimeEventDataDto.Serializer.INSTANCE, perceivedLoadingTimeEventDataDto);
            }
        }

        public Surrogate(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, ButtonGroupEventDataDto buttonGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, TutorialEventDataDto tutorialEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserActionDataDto userActionDataDto, SMSDataDto sMSDataDto, AdjustDataDto adjustDataDto, PlaidEventDataDto plaidEventDataDto, DebitCardSCAEventDataDto debitCardSCAEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, OrderEventDataDto orderEventDataDto, TimeFirstInteractionDataDto timeFirstInteractionDataDto, ExperimentsEventDataDto experimentsEventDataDto, EquityOrderEventDataDto equityOrderEventDataDto, OptionOrderEventDataDto optionOrderEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, OAuthLoginEventDataDto oAuthLoginEventDataDto, PromptsChallengeEventDataDto promptsChallengeEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, RecommendationsEventDataDto recommendationsEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto) {
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
            this.button_group_data = buttonGroupEventDataDto;
            this.app_session_data = appSessionEventDataDto;
            this.tutorial_data = tutorialEventDataDto;
            this.deep_link_data = deepLinkEventDataDto;
            this.email_data = emailEventDataDto;
            this.error_data = errorEventDataDto;
            this.web_data = webEventDataDto;
            this.user_action_data = userActionDataDto;
            this.sms_data = sMSDataDto;
            this.adjust_data = adjustDataDto;
            this.plaid_event_data = plaidEventDataDto;
            this.debit_card_s_c_a_event_data = debitCardSCAEventDataDto;
            this.user_interaction_event_data = userInteractionEventDataDto;
            this.performance_metric_event_data = performanceMetricEventDataDto;
            this.performance_metric_span_event_data = performanceMetricSpanEventDataDto;
            this.order_data = orderEventDataDto;
            this.time_first_interaction_data = timeFirstInteractionDataDto;
            this.experiments_data = experimentsEventDataDto;
            this.equity_order_data = equityOrderEventDataDto;
            this.option_order_data = optionOrderEventDataDto;
            this.crypto_order_data = cryptoOrderEventDataDto;
            this.web_view_navigation_data = webViewNavigationDataDto;
            this.network_error_data = networkErrorDataDto;
            this.device_security_event_data = deviceSecurityEventDataDto;
            this.http_call_data = httpCallDataDto;
            this.device_metric_event_data = deviceMetricEventDataDto;
            this.arkose_labs_event_data = arkoseLabsEventDataDto;
            this.oauth_login_event_data = oAuthLoginEventDataDto;
            this.prompts_challenge_event_data = promptsChallengeEventDataDto;
            this.twilio_conversations_sdk_event_data = twilioConversationsSdkEventDataDto;
            this.pathfinder_fallback_to_web_view_event_data = pathfinderFallbackToWebViewEventDataDto;
            this.recommendations_event_data = recommendationsEventDataDto;
            this.device_approval_reenrollment_event_data = deviceApprovalReenrollmentEventDataDto;
            this.account_security_event_data = accountSecurityEventDataDto;
            this.catpay_order_data = catpayOrderEventDataDto;
            this.perpetual_order_data = perpetualOrderEventDataDto;
            this.perceived_loading_time_event_data = perceivedLoadingTimeEventDataDto;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventDataDto appEventDataDto, ScreenTransitionEventDataDto screenTransitionEventDataDto, PushNotificationEventDataDto pushNotificationEventDataDto, NotificationStackEventDataDto notificationStackEventDataDto, TabGroupEventDataDto tabGroupEventDataDto, ButtonGroupEventDataDto buttonGroupEventDataDto, AppSessionEventDataDto appSessionEventDataDto, TutorialEventDataDto tutorialEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, EmailEventDataDto emailEventDataDto, ErrorEventDataDto errorEventDataDto, WebEventDataDto webEventDataDto, UserActionDataDto userActionDataDto, SMSDataDto sMSDataDto, AdjustDataDto adjustDataDto, PlaidEventDataDto plaidEventDataDto, DebitCardSCAEventDataDto debitCardSCAEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, OrderEventDataDto orderEventDataDto, TimeFirstInteractionDataDto timeFirstInteractionDataDto, ExperimentsEventDataDto experimentsEventDataDto, EquityOrderEventDataDto equityOrderEventDataDto, OptionOrderEventDataDto optionOrderEventDataDto, CryptoOrderEventDataDto cryptoOrderEventDataDto, WebViewNavigationDataDto webViewNavigationDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, ArkoseLabsEventDataDto arkoseLabsEventDataDto, OAuthLoginEventDataDto oAuthLoginEventDataDto, PromptsChallengeEventDataDto promptsChallengeEventDataDto, TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto, PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto, RecommendationsEventDataDto recommendationsEventDataDto, DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto, AccountSecurityEventDataDto accountSecurityEventDataDto, CatpayOrderEventDataDto catpayOrderEventDataDto, PerpetualOrderEventDataDto perpetualOrderEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            String str9 = (i & 1) != 0 ? "" : str;
            this(str9, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : appEventDataDto, (i & 512) != 0 ? null : screenTransitionEventDataDto, (i & 1024) != 0 ? null : pushNotificationEventDataDto, (i & 2048) != 0 ? null : notificationStackEventDataDto, (i & 4096) != 0 ? null : tabGroupEventDataDto, (i & 8192) != 0 ? null : buttonGroupEventDataDto, (i & 16384) != 0 ? null : appSessionEventDataDto, (i & 32768) != 0 ? null : tutorialEventDataDto, (i & 65536) != 0 ? null : deepLinkEventDataDto, (i & 131072) != 0 ? null : emailEventDataDto, (i & 262144) != 0 ? null : errorEventDataDto, (i & 524288) != 0 ? null : webEventDataDto, (i & 1048576) != 0 ? null : userActionDataDto, (i & 2097152) != 0 ? null : sMSDataDto, (i & 4194304) != 0 ? null : adjustDataDto, (i & 8388608) != 0 ? null : plaidEventDataDto, (i & 16777216) != 0 ? null : debitCardSCAEventDataDto, (i & 33554432) != 0 ? null : userInteractionEventDataDto, (i & 67108864) != 0 ? null : performanceMetricEventDataDto, (i & 134217728) != 0 ? null : performanceMetricSpanEventDataDto, (i & 268435456) != 0 ? null : orderEventDataDto, (i & 536870912) != 0 ? null : timeFirstInteractionDataDto, (i & 1073741824) != 0 ? null : experimentsEventDataDto, (i & Integer.MIN_VALUE) != 0 ? null : equityOrderEventDataDto, (i2 & 1) != 0 ? null : optionOrderEventDataDto, (i2 & 2) != 0 ? null : cryptoOrderEventDataDto, (i2 & 4) != 0 ? null : webViewNavigationDataDto, (i2 & 8) != 0 ? null : networkErrorDataDto, (i2 & 16) != 0 ? null : deviceSecurityEventDataDto, (i2 & 32) != 0 ? null : httpCallDataDto, (i2 & 64) != 0 ? null : deviceMetricEventDataDto, (i2 & 128) != 0 ? null : arkoseLabsEventDataDto, (i2 & 256) != 0 ? null : oAuthLoginEventDataDto, (i2 & 512) != 0 ? null : promptsChallengeEventDataDto, (i2 & 1024) != 0 ? null : twilioConversationsSdkEventDataDto, (i2 & 2048) != 0 ? null : pathfinderFallbackToWebViewEventDataDto, (i2 & 4096) != 0 ? null : recommendationsEventDataDto, (i2 & 8192) != 0 ? null : deviceApprovalReenrollmentEventDataDto, (i2 & 16384) != 0 ? null : accountSecurityEventDataDto, (i2 & 32768) != 0 ? null : catpayOrderEventDataDto, (i2 & 65536) != 0 ? null : perpetualOrderEventDataDto, (i2 & 131072) != 0 ? null : perceivedLoadingTimeEventDataDto);
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

        public final ButtonGroupEventDataDto getButton_group_data() {
            return this.button_group_data;
        }

        public final AppSessionEventDataDto getApp_session_data() {
            return this.app_session_data;
        }

        public final TutorialEventDataDto getTutorial_data() {
            return this.tutorial_data;
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

        public final UserActionDataDto getUser_action_data() {
            return this.user_action_data;
        }

        public final SMSDataDto getSms_data() {
            return this.sms_data;
        }

        public final AdjustDataDto getAdjust_data() {
            return this.adjust_data;
        }

        public final PlaidEventDataDto getPlaid_event_data() {
            return this.plaid_event_data;
        }

        public final DebitCardSCAEventDataDto getDebit_card_s_c_a_event_data() {
            return this.debit_card_s_c_a_event_data;
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

        public final OrderEventDataDto getOrder_data() {
            return this.order_data;
        }

        public final TimeFirstInteractionDataDto getTime_first_interaction_data() {
            return this.time_first_interaction_data;
        }

        public final ExperimentsEventDataDto getExperiments_data() {
            return this.experiments_data;
        }

        public final EquityOrderEventDataDto getEquity_order_data() {
            return this.equity_order_data;
        }

        public final OptionOrderEventDataDto getOption_order_data() {
            return this.option_order_data;
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

        public final HttpCallDataDto getHttp_call_data() {
            return this.http_call_data;
        }

        public final DeviceMetricEventDataDto getDevice_metric_event_data() {
            return this.device_metric_event_data;
        }

        public final ArkoseLabsEventDataDto getArkose_labs_event_data() {
            return this.arkose_labs_event_data;
        }

        public final OAuthLoginEventDataDto getOauth_login_event_data() {
            return this.oauth_login_event_data;
        }

        public final PromptsChallengeEventDataDto getPrompts_challenge_event_data() {
            return this.prompts_challenge_event_data;
        }

        public final TwilioConversationsSdkEventDataDto getTwilio_conversations_sdk_event_data() {
            return this.twilio_conversations_sdk_event_data;
        }

        public final PathfinderFallbackToWebViewEventDataDto getPathfinder_fallback_to_web_view_event_data() {
            return this.pathfinder_fallback_to_web_view_event_data;
        }

        public final RecommendationsEventDataDto getRecommendations_event_data() {
            return this.recommendations_event_data;
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

        public final PerpetualOrderEventDataDto getPerpetual_order_data() {
            return this.perpetual_order_data;
        }

        public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
            return this.perceived_loading_time_event_data;
        }
    }

    /* compiled from: AppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AppEventDto;", "Lcom/robinhood/rosetta/eventlogging/AppEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AppEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AppEventDto, AppEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AppEventDto> getBinaryBase64Serializer() {
            return (KSerializer) AppEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AppEvent> getProtoAdapter() {
            return AppEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppEventDto getZeroValue() {
            return AppEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AppEventDto fromProto(AppEvent proto) {
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
            ButtonGroupEventData button_group_data = proto.getButton_group_data();
            ButtonGroupEventDataDto buttonGroupEventDataDtoFromProto = button_group_data != null ? ButtonGroupEventDataDto.INSTANCE.fromProto(button_group_data) : null;
            AppSessionEventData app_session_data = proto.getApp_session_data();
            AppEventDataDto appEventDataDto = appEventDataDtoFromProto;
            AppSessionEventDataDto appSessionEventDataDtoFromProto = app_session_data != null ? AppSessionEventDataDto.INSTANCE.fromProto(app_session_data) : null;
            TutorialEventData tutorial_data = proto.getTutorial_data();
            AppSessionEventDataDto appSessionEventDataDto = appSessionEventDataDtoFromProto;
            TutorialEventDataDto tutorialEventDataDtoFromProto = tutorial_data != null ? TutorialEventDataDto.INSTANCE.fromProto(tutorial_data) : null;
            DeepLinkEventData deep_link_data = proto.getDeep_link_data();
            TutorialEventDataDto tutorialEventDataDto = tutorialEventDataDtoFromProto;
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
            UserActionData user_action_data = proto.getUser_action_data();
            WebEventDataDto webEventDataDto = webEventDataDtoFromProto;
            UserActionDataDto userActionDataDtoFromProto = user_action_data != null ? UserActionDataDto.INSTANCE.fromProto(user_action_data) : null;
            SMSData sms_data = proto.getSms_data();
            UserActionDataDto userActionDataDto = userActionDataDtoFromProto;
            SMSDataDto sMSDataDtoFromProto = sms_data != null ? SMSDataDto.INSTANCE.fromProto(sms_data) : null;
            AdjustData adjust_data = proto.getAdjust_data();
            SMSDataDto sMSDataDto = sMSDataDtoFromProto;
            AdjustDataDto adjustDataDtoFromProto = adjust_data != null ? AdjustDataDto.INSTANCE.fromProto(adjust_data) : null;
            PlaidEventData plaid_event_data = proto.getPlaid_event_data();
            AdjustDataDto adjustDataDto = adjustDataDtoFromProto;
            PlaidEventDataDto plaidEventDataDtoFromProto = plaid_event_data != null ? PlaidEventDataDto.INSTANCE.fromProto(plaid_event_data) : null;
            DebitCardSCAEventData debit_card_s_c_a_event_data = proto.getDebit_card_s_c_a_event_data();
            PlaidEventDataDto plaidEventDataDto = plaidEventDataDtoFromProto;
            DebitCardSCAEventDataDto debitCardSCAEventDataDtoFromProto = debit_card_s_c_a_event_data != null ? DebitCardSCAEventDataDto.INSTANCE.fromProto(debit_card_s_c_a_event_data) : null;
            UserInteractionEventData user_interaction_event_data = proto.getUser_interaction_event_data();
            DebitCardSCAEventDataDto debitCardSCAEventDataDto = debitCardSCAEventDataDtoFromProto;
            UserInteractionEventDataDto userInteractionEventDataDtoFromProto = user_interaction_event_data != null ? UserInteractionEventDataDto.INSTANCE.fromProto(user_interaction_event_data) : null;
            PerformanceMetricEventData performance_metric_event_data = proto.getPerformance_metric_event_data();
            UserInteractionEventDataDto userInteractionEventDataDto = userInteractionEventDataDtoFromProto;
            PerformanceMetricEventDataDto performanceMetricEventDataDtoFromProto = performance_metric_event_data != null ? PerformanceMetricEventDataDto.INSTANCE.fromProto(performance_metric_event_data) : null;
            PerformanceMetricSpanEventData performance_metric_span_event_data = proto.getPerformance_metric_span_event_data();
            PerformanceMetricEventDataDto performanceMetricEventDataDto = performanceMetricEventDataDtoFromProto;
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDtoFromProto = performance_metric_span_event_data != null ? PerformanceMetricSpanEventDataDto.INSTANCE.fromProto(performance_metric_span_event_data) : null;
            OrderEventData order_data = proto.getOrder_data();
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto = performanceMetricSpanEventDataDtoFromProto;
            OrderEventDataDto orderEventDataDtoFromProto = order_data != null ? OrderEventDataDto.INSTANCE.fromProto(order_data) : null;
            TimeFirstInteractionData time_first_interaction_data = proto.getTime_first_interaction_data();
            OrderEventDataDto orderEventDataDto = orderEventDataDtoFromProto;
            TimeFirstInteractionDataDto timeFirstInteractionDataDtoFromProto = time_first_interaction_data != null ? TimeFirstInteractionDataDto.INSTANCE.fromProto(time_first_interaction_data) : null;
            ExperimentsEventData experiments_data = proto.getExperiments_data();
            TimeFirstInteractionDataDto timeFirstInteractionDataDto = timeFirstInteractionDataDtoFromProto;
            ExperimentsEventDataDto experimentsEventDataDtoFromProto = experiments_data != null ? ExperimentsEventDataDto.INSTANCE.fromProto(experiments_data) : null;
            EquityOrderEventData equity_order_data = proto.getEquity_order_data();
            ExperimentsEventDataDto experimentsEventDataDto = experimentsEventDataDtoFromProto;
            EquityOrderEventDataDto equityOrderEventDataDtoFromProto = equity_order_data != null ? EquityOrderEventDataDto.INSTANCE.fromProto(equity_order_data) : null;
            OptionOrderEventData option_order_data = proto.getOption_order_data();
            EquityOrderEventDataDto equityOrderEventDataDto = equityOrderEventDataDtoFromProto;
            OptionOrderEventDataDto optionOrderEventDataDtoFromProto = option_order_data != null ? OptionOrderEventDataDto.INSTANCE.fromProto(option_order_data) : null;
            CryptoOrderEventData crypto_order_data = proto.getCrypto_order_data();
            OptionOrderEventDataDto optionOrderEventDataDto = optionOrderEventDataDtoFromProto;
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
            HttpCallData http_call_data = proto.getHttp_call_data();
            DeviceSecurityEventDataDto deviceSecurityEventDataDto = deviceSecurityEventDataDtoFromProto;
            HttpCallDataDto httpCallDataDtoFromProto = http_call_data != null ? HttpCallDataDto.INSTANCE.fromProto(http_call_data) : null;
            DeviceMetricEventData device_metric_event_data = proto.getDevice_metric_event_data();
            HttpCallDataDto httpCallDataDto = httpCallDataDtoFromProto;
            DeviceMetricEventDataDto deviceMetricEventDataDtoFromProto = device_metric_event_data != null ? DeviceMetricEventDataDto.INSTANCE.fromProto(device_metric_event_data) : null;
            ArkoseLabsEventData arkose_labs_event_data = proto.getArkose_labs_event_data();
            DeviceMetricEventDataDto deviceMetricEventDataDto = deviceMetricEventDataDtoFromProto;
            ArkoseLabsEventDataDto arkoseLabsEventDataDtoFromProto = arkose_labs_event_data != null ? ArkoseLabsEventDataDto.INSTANCE.fromProto(arkose_labs_event_data) : null;
            OAuthLoginEventData oauth_login_event_data = proto.getOauth_login_event_data();
            ArkoseLabsEventDataDto arkoseLabsEventDataDto = arkoseLabsEventDataDtoFromProto;
            OAuthLoginEventDataDto oAuthLoginEventDataDtoFromProto = oauth_login_event_data != null ? OAuthLoginEventDataDto.INSTANCE.fromProto(oauth_login_event_data) : null;
            PromptsChallengeEventData prompts_challenge_event_data = proto.getPrompts_challenge_event_data();
            OAuthLoginEventDataDto oAuthLoginEventDataDto = oAuthLoginEventDataDtoFromProto;
            PromptsChallengeEventDataDto promptsChallengeEventDataDtoFromProto = prompts_challenge_event_data != null ? PromptsChallengeEventDataDto.INSTANCE.fromProto(prompts_challenge_event_data) : null;
            TwilioConversationsSdkEventData twilio_conversations_sdk_event_data = proto.getTwilio_conversations_sdk_event_data();
            PromptsChallengeEventDataDto promptsChallengeEventDataDto = promptsChallengeEventDataDtoFromProto;
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDtoFromProto = twilio_conversations_sdk_event_data != null ? TwilioConversationsSdkEventDataDto.INSTANCE.fromProto(twilio_conversations_sdk_event_data) : null;
            PathfinderFallbackToWebViewEventData pathfinder_fallback_to_web_view_event_data = proto.getPathfinder_fallback_to_web_view_event_data();
            TwilioConversationsSdkEventDataDto twilioConversationsSdkEventDataDto = twilioConversationsSdkEventDataDtoFromProto;
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDtoFromProto = pathfinder_fallback_to_web_view_event_data != null ? PathfinderFallbackToWebViewEventDataDto.INSTANCE.fromProto(pathfinder_fallback_to_web_view_event_data) : null;
            RecommendationsEventData recommendations_event_data = proto.getRecommendations_event_data();
            PathfinderFallbackToWebViewEventDataDto pathfinderFallbackToWebViewEventDataDto = pathfinderFallbackToWebViewEventDataDtoFromProto;
            RecommendationsEventDataDto recommendationsEventDataDtoFromProto = recommendations_event_data != null ? RecommendationsEventDataDto.INSTANCE.fromProto(recommendations_event_data) : null;
            DeviceApprovalReenrollmentEventData device_approval_reenrollment_event_data = proto.getDevice_approval_reenrollment_event_data();
            RecommendationsEventDataDto recommendationsEventDataDto = recommendationsEventDataDtoFromProto;
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDtoFromProto = device_approval_reenrollment_event_data != null ? DeviceApprovalReenrollmentEventDataDto.INSTANCE.fromProto(device_approval_reenrollment_event_data) : null;
            AccountSecurityEventData account_security_event_data = proto.getAccount_security_event_data();
            DeviceApprovalReenrollmentEventDataDto deviceApprovalReenrollmentEventDataDto = deviceApprovalReenrollmentEventDataDtoFromProto;
            AccountSecurityEventDataDto accountSecurityEventDataDtoFromProto = account_security_event_data != null ? AccountSecurityEventDataDto.INSTANCE.fromProto(account_security_event_data) : null;
            CatpayOrderEventData catpay_order_data = proto.getCatpay_order_data();
            AccountSecurityEventDataDto accountSecurityEventDataDto = accountSecurityEventDataDtoFromProto;
            CatpayOrderEventDataDto catpayOrderEventDataDtoFromProto = catpay_order_data != null ? CatpayOrderEventDataDto.INSTANCE.fromProto(catpay_order_data) : null;
            PerpetualOrderEventData perpetual_order_data = proto.getPerpetual_order_data();
            CatpayOrderEventDataDto catpayOrderEventDataDto = catpayOrderEventDataDtoFromProto;
            PerpetualOrderEventDataDto perpetualOrderEventDataDtoFromProto = perpetual_order_data != null ? PerpetualOrderEventDataDto.INSTANCE.fromProto(perpetual_order_data) : null;
            PerceivedLoadingTimeEventData perceived_loading_time_event_data = proto.getPerceived_loading_time_event_data();
            return new AppEventDto(new Surrogate(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, appEventDataDto, screenTransitionEventDataDtoFromProto, pushNotificationEventDataDtoFromProto, notificationStackEventDataDtoFromProto, tabGroupEventDataDtoFromProto, buttonGroupEventDataDtoFromProto, appSessionEventDataDto, tutorialEventDataDto, deepLinkEventDataDto, emailEventDataDto, errorEventDataDto, webEventDataDto, userActionDataDto, sMSDataDto, adjustDataDto, plaidEventDataDto, debitCardSCAEventDataDto, userInteractionEventDataDto, performanceMetricEventDataDto, performanceMetricSpanEventDataDto, orderEventDataDto, timeFirstInteractionDataDto, experimentsEventDataDto, equityOrderEventDataDto, optionOrderEventDataDto, cryptoOrderEventDataDto, webViewNavigationDataDto, networkErrorDataDto, deviceSecurityEventDataDto, httpCallDataDto, deviceMetricEventDataDto, arkoseLabsEventDataDto, oAuthLoginEventDataDto, promptsChallengeEventDataDto, twilioConversationsSdkEventDataDto, pathfinderFallbackToWebViewEventDataDto, recommendationsEventDataDto, deviceApprovalReenrollmentEventDataDto, accountSecurityEventDataDto, catpayOrderEventDataDto, perpetualOrderEventDataDtoFromProto, perceived_loading_time_event_data != null ? PerceivedLoadingTimeEventDataDto.INSTANCE.fromProto(perceived_loading_time_event_data) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AppEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AppEventDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AppEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AppEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AppEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AppEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AppEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AppEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AppEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AppEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AppEventDto";
        }
    }
}
