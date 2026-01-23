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
import com.robinhood.rosetta.eventlogging.AppSessionEventDataDto;
import com.robinhood.rosetta.eventlogging.DeepLinkEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceMetricEventDataDto;
import com.robinhood.rosetta.eventlogging.DeviceSecurityEventDataDto;
import com.robinhood.rosetta.eventlogging.ErrorEventDataDto;
import com.robinhood.rosetta.eventlogging.ExperimentsEventDataDto;
import com.robinhood.rosetta.eventlogging.HttpCallDataDto;
import com.robinhood.rosetta.eventlogging.NetworkErrorDataDto;
import com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventDataDto;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventDataDto;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventDataDto;
import com.robinhood.rosetta.eventlogging.PushNotificationEventDataDto;
import com.robinhood.rosetta.eventlogging.UserInteractionEventDataDto;
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

/* compiled from: NcwAppEventDto.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\\]^_B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bë\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0004\b\u0006\u0010*Jè\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)J\b\u0010N\u001a\u00020\u0002H\u0016J\b\u0010O\u001a\u00020\tH\u0016J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0096\u0002J\b\u0010T\u001a\u00020UH\u0016J\u0018\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020UH\u0016J\b\u0010[\u001a\u00020UH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010,R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010,R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010$\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006`"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NcwAppEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$Surrogate;)V", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "experiments", "session_id", "url", "web_referrer", "web_referrer_host", "push_notification_data", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "deep_link_data", "Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "error_data", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "user_interaction_event_data", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "performance_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "performance_metric_span_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "experiments_data", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "network_error_data", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "device_security_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "http_call_data", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "device_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "app_session_event_data", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "perceived_loading_time_event_data", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;)V", "getCategory", "()Ljava/lang/String;", "getEvent", "getExperiments", "getSession_id", "getUrl", "getWeb_referrer", "getWeb_referrer_host", "getPush_notification_data", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "getDeep_link_data", "()Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "getError_data", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "getUser_interaction_event_data", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "getPerformance_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "getPerformance_metric_span_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "getExperiments_data", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "getNetwork_error_data", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "getDevice_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "getHttp_call_data", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "getDevice_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "getApp_session_event_data", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "getPerceived_loading_time_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NcwAppEventDto implements Dto3<NcwAppEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NcwAppEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NcwAppEventDto, NcwAppEvent>> binaryBase64Serializer$delegate;
    private static final NcwAppEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NcwAppEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NcwAppEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCategory() {
        return this.surrogate.getCategory();
    }

    public final String getEvent() {
        return this.surrogate.getEvent();
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

    public final PushNotificationEventDataDto getPush_notification_data() {
        return this.surrogate.getPush_notification_data();
    }

    public final DeepLinkEventDataDto getDeep_link_data() {
        return this.surrogate.getDeep_link_data();
    }

    public final ErrorEventDataDto getError_data() {
        return this.surrogate.getError_data();
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

    public final AppSessionEventDataDto getApp_session_event_data() {
        return this.surrogate.getApp_session_event_data();
    }

    public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
        return this.surrogate.getPerceived_loading_time_event_data();
    }

    public /* synthetic */ NcwAppEventDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, PushNotificationEventDataDto pushNotificationEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, ErrorEventDataDto errorEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, AppSessionEventDataDto appSessionEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : pushNotificationEventDataDto, (i & 256) != 0 ? null : deepLinkEventDataDto, (i & 512) != 0 ? null : errorEventDataDto, (i & 1024) != 0 ? null : userInteractionEventDataDto, (i & 2048) != 0 ? null : performanceMetricEventDataDto, (i & 4096) != 0 ? null : performanceMetricSpanEventDataDto, (i & 8192) != 0 ? null : experimentsEventDataDto, (i & 16384) != 0 ? null : networkErrorDataDto, (i & 32768) != 0 ? null : deviceSecurityEventDataDto, (i & 65536) != 0 ? null : httpCallDataDto, (i & 131072) != 0 ? null : deviceMetricEventDataDto, (i & 262144) != 0 ? null : appSessionEventDataDto, (i & 524288) != 0 ? null : perceivedLoadingTimeEventDataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NcwAppEventDto(String category, String event, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, PushNotificationEventDataDto pushNotificationEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, ErrorEventDataDto errorEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, AppSessionEventDataDto appSessionEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto) {
        this(new Surrogate(category, event, experiments, session_id, url, web_referrer, web_referrer_host, pushNotificationEventDataDto, deepLinkEventDataDto, errorEventDataDto, userInteractionEventDataDto, performanceMetricEventDataDto, performanceMetricSpanEventDataDto, experimentsEventDataDto, networkErrorDataDto, deviceSecurityEventDataDto, httpCallDataDto, deviceMetricEventDataDto, appSessionEventDataDto, perceivedLoadingTimeEventDataDto));
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
    }

    public static /* synthetic */ NcwAppEventDto copy$default(NcwAppEventDto ncwAppEventDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, PushNotificationEventDataDto pushNotificationEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, ErrorEventDataDto errorEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, AppSessionEventDataDto appSessionEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, Object obj) {
        PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data;
        AppSessionEventDataDto appSessionEventDataDto2;
        String category = (i & 1) != 0 ? ncwAppEventDto.surrogate.getCategory() : str;
        String event = (i & 2) != 0 ? ncwAppEventDto.surrogate.getEvent() : str2;
        String experiments = (i & 4) != 0 ? ncwAppEventDto.surrogate.getExperiments() : str3;
        String session_id = (i & 8) != 0 ? ncwAppEventDto.surrogate.getSession_id() : str4;
        String url = (i & 16) != 0 ? ncwAppEventDto.surrogate.getUrl() : str5;
        String web_referrer = (i & 32) != 0 ? ncwAppEventDto.surrogate.getWeb_referrer() : str6;
        String web_referrer_host = (i & 64) != 0 ? ncwAppEventDto.surrogate.getWeb_referrer_host() : str7;
        PushNotificationEventDataDto push_notification_data = (i & 128) != 0 ? ncwAppEventDto.surrogate.getPush_notification_data() : pushNotificationEventDataDto;
        DeepLinkEventDataDto deep_link_data = (i & 256) != 0 ? ncwAppEventDto.surrogate.getDeep_link_data() : deepLinkEventDataDto;
        ErrorEventDataDto error_data = (i & 512) != 0 ? ncwAppEventDto.surrogate.getError_data() : errorEventDataDto;
        UserInteractionEventDataDto user_interaction_event_data = (i & 1024) != 0 ? ncwAppEventDto.surrogate.getUser_interaction_event_data() : userInteractionEventDataDto;
        PerformanceMetricEventDataDto performance_metric_event_data = (i & 2048) != 0 ? ncwAppEventDto.surrogate.getPerformance_metric_event_data() : performanceMetricEventDataDto;
        PerformanceMetricSpanEventDataDto performance_metric_span_event_data = (i & 4096) != 0 ? ncwAppEventDto.surrogate.getPerformance_metric_span_event_data() : performanceMetricSpanEventDataDto;
        ExperimentsEventDataDto experiments_data = (i & 8192) != 0 ? ncwAppEventDto.surrogate.getExperiments_data() : experimentsEventDataDto;
        String str8 = category;
        NetworkErrorDataDto network_error_data = (i & 16384) != 0 ? ncwAppEventDto.surrogate.getNetwork_error_data() : networkErrorDataDto;
        DeviceSecurityEventDataDto device_security_event_data = (i & 32768) != 0 ? ncwAppEventDto.surrogate.getDevice_security_event_data() : deviceSecurityEventDataDto;
        HttpCallDataDto http_call_data = (i & 65536) != 0 ? ncwAppEventDto.surrogate.getHttp_call_data() : httpCallDataDto;
        DeviceMetricEventDataDto device_metric_event_data = (i & 131072) != 0 ? ncwAppEventDto.surrogate.getDevice_metric_event_data() : deviceMetricEventDataDto;
        AppSessionEventDataDto app_session_event_data = (i & 262144) != 0 ? ncwAppEventDto.surrogate.getApp_session_event_data() : appSessionEventDataDto;
        if ((i & 524288) != 0) {
            appSessionEventDataDto2 = app_session_event_data;
            perceived_loading_time_event_data = ncwAppEventDto.surrogate.getPerceived_loading_time_event_data();
        } else {
            perceived_loading_time_event_data = perceivedLoadingTimeEventDataDto;
            appSessionEventDataDto2 = app_session_event_data;
        }
        return ncwAppEventDto.copy(str8, event, experiments, session_id, url, web_referrer, web_referrer_host, push_notification_data, deep_link_data, error_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, experiments_data, network_error_data, device_security_event_data, http_call_data, device_metric_event_data, appSessionEventDataDto2, perceived_loading_time_event_data);
    }

    public final NcwAppEventDto copy(String category, String event, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, PushNotificationEventDataDto push_notification_data, DeepLinkEventDataDto deep_link_data, ErrorEventDataDto error_data, UserInteractionEventDataDto user_interaction_event_data, PerformanceMetricEventDataDto performance_metric_event_data, PerformanceMetricSpanEventDataDto performance_metric_span_event_data, ExperimentsEventDataDto experiments_data, NetworkErrorDataDto network_error_data, DeviceSecurityEventDataDto device_security_event_data, HttpCallDataDto http_call_data, DeviceMetricEventDataDto device_metric_event_data, AppSessionEventDataDto app_session_event_data, PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
        return new NcwAppEventDto(new Surrogate(category, event, experiments, session_id, url, web_referrer, web_referrer_host, push_notification_data, deep_link_data, error_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, experiments_data, network_error_data, device_security_event_data, http_call_data, device_metric_event_data, app_session_event_data, perceived_loading_time_event_data));
    }

    @Override // com.robinhood.idl.Dto
    public NcwAppEvent toProto() {
        String category = this.surrogate.getCategory();
        String event = this.surrogate.getEvent();
        String experiments = this.surrogate.getExperiments();
        String session_id = this.surrogate.getSession_id();
        String url = this.surrogate.getUrl();
        String web_referrer = this.surrogate.getWeb_referrer();
        String web_referrer_host = this.surrogate.getWeb_referrer_host();
        PushNotificationEventDataDto push_notification_data = this.surrogate.getPush_notification_data();
        PushNotificationEventData proto = push_notification_data != null ? push_notification_data.toProto() : null;
        DeepLinkEventDataDto deep_link_data = this.surrogate.getDeep_link_data();
        DeepLinkEventData proto2 = deep_link_data != null ? deep_link_data.toProto() : null;
        ErrorEventDataDto error_data = this.surrogate.getError_data();
        ErrorEventData proto3 = error_data != null ? error_data.toProto() : null;
        UserInteractionEventDataDto user_interaction_event_data = this.surrogate.getUser_interaction_event_data();
        UserInteractionEventData proto4 = user_interaction_event_data != null ? user_interaction_event_data.toProto() : null;
        PerformanceMetricEventDataDto performance_metric_event_data = this.surrogate.getPerformance_metric_event_data();
        PerformanceMetricEventData proto5 = performance_metric_event_data != null ? performance_metric_event_data.toProto() : null;
        PerformanceMetricSpanEventDataDto performance_metric_span_event_data = this.surrogate.getPerformance_metric_span_event_data();
        PerformanceMetricSpanEventData proto6 = performance_metric_span_event_data != null ? performance_metric_span_event_data.toProto() : null;
        ExperimentsEventDataDto experiments_data = this.surrogate.getExperiments_data();
        ExperimentsEventData proto7 = experiments_data != null ? experiments_data.toProto() : null;
        NetworkErrorDataDto network_error_data = this.surrogate.getNetwork_error_data();
        NetworkErrorData proto8 = network_error_data != null ? network_error_data.toProto() : null;
        DeviceSecurityEventDataDto device_security_event_data = this.surrogate.getDevice_security_event_data();
        DeviceSecurityEventData proto9 = device_security_event_data != null ? device_security_event_data.toProto() : null;
        HttpCallDataDto http_call_data = this.surrogate.getHttp_call_data();
        HttpCallData proto10 = http_call_data != null ? http_call_data.toProto() : null;
        DeviceMetricEventDataDto device_metric_event_data = this.surrogate.getDevice_metric_event_data();
        DeviceMetricEventData proto11 = device_metric_event_data != null ? device_metric_event_data.toProto() : null;
        AppSessionEventDataDto app_session_event_data = this.surrogate.getApp_session_event_data();
        AppSessionEventData proto12 = app_session_event_data != null ? app_session_event_data.toProto() : null;
        PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data = this.surrogate.getPerceived_loading_time_event_data();
        return new NcwAppEvent(category, event, experiments, session_id, url, web_referrer, web_referrer_host, proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, perceived_loading_time_event_data != null ? perceived_loading_time_event_data.toProto() : null, null, 1048576, null);
    }

    public String toString() {
        return "[NcwAppEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NcwAppEventDto) && Intrinsics.areEqual(((NcwAppEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: NcwAppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u0085\u00012\u00020\u0001:\u0004\u0084\u0001\u0085\u0001Bé\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%Bã\u0001\b\u0010\u0012\u0006\u0010&\u001a\u00020'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0004\b$\u0010*J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010#HÆ\u0003Jë\u0001\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#HÆ\u0001J\u0013\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010z\u001a\u00020'HÖ\u0001J\t\u0010{\u001a\u00020\u0003HÖ\u0001J)\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u00002\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0001¢\u0006\u0003\b\u0083\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010,\u001a\u0004\b8\u0010.R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010,\u001a\u0004\b:\u0010.R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010,\u001a\u0004\b<\u0010=R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010,\u001a\u0004\b?\u0010@R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010,\u001a\u0004\bB\u0010CR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010,\u001a\u0004\bE\u0010FR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010,\u001a\u0004\bH\u0010IR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010,\u001a\u0004\bK\u0010LR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010,\u001a\u0004\bN\u0010OR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010,\u001a\u0004\bQ\u0010RR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010,\u001a\u0004\bT\u0010UR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010,\u001a\u0004\bW\u0010XR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010,\u001a\u0004\bZ\u0010[R\u001e\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010,\u001a\u0004\b]\u0010^R\u001e\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u0010,\u001a\u0004\b`\u0010a¨\u0006\u0086\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$Surrogate;", "", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "experiments", "session_id", "url", "web_referrer", "web_referrer_host", "push_notification_data", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "deep_link_data", "Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "error_data", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "user_interaction_event_data", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "performance_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "performance_metric_span_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "experiments_data", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "network_error_data", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "device_security_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "http_call_data", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "device_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "app_session_event_data", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "perceived_loading_time_event_data", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCategory$annotations", "()V", "getCategory", "()Ljava/lang/String;", "getEvent$annotations", "getEvent", "getExperiments$annotations", "getExperiments", "getSession_id$annotations", "getSession_id", "getUrl$annotations", "getUrl", "getWeb_referrer$annotations", "getWeb_referrer", "getWeb_referrer_host$annotations", "getWeb_referrer_host", "getPush_notification_data$annotations", "getPush_notification_data", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventDataDto;", "getDeep_link_data$annotations", "getDeep_link_data", "()Lcom/robinhood/rosetta/eventlogging/DeepLinkEventDataDto;", "getError_data$annotations", "getError_data", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "getUser_interaction_event_data$annotations", "getUser_interaction_event_data", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventDataDto;", "getPerformance_metric_event_data$annotations", "getPerformance_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventDataDto;", "getPerformance_metric_span_event_data$annotations", "getPerformance_metric_span_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventDataDto;", "getExperiments_data$annotations", "getExperiments_data", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventDataDto;", "getNetwork_error_data$annotations", "getNetwork_error_data", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "getDevice_security_event_data$annotations", "getDevice_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventDataDto;", "getHttp_call_data$annotations", "getHttp_call_data", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "getDevice_metric_event_data$annotations", "getDevice_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventDataDto;", "getApp_session_event_data$annotations", "getApp_session_event_data", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventDataDto;", "getPerceived_loading_time_event_data$annotations", "getPerceived_loading_time_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AppSessionEventDataDto app_session_event_data;
        private final String category;
        private final DeepLinkEventDataDto deep_link_data;
        private final DeviceMetricEventDataDto device_metric_event_data;
        private final DeviceSecurityEventDataDto device_security_event_data;
        private final ErrorEventDataDto error_data;
        private final String event;
        private final String experiments;
        private final ExperimentsEventDataDto experiments_data;
        private final HttpCallDataDto http_call_data;
        private final NetworkErrorDataDto network_error_data;
        private final PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data;
        private final PerformanceMetricEventDataDto performance_metric_event_data;
        private final PerformanceMetricSpanEventDataDto performance_metric_span_event_data;
        private final PushNotificationEventDataDto push_notification_data;
        private final String session_id;
        private final String url;
        private final UserInteractionEventDataDto user_interaction_event_data;
        private final String web_referrer;
        private final String web_referrer_host;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (PushNotificationEventDataDto) null, (DeepLinkEventDataDto) null, (ErrorEventDataDto) null, (UserInteractionEventDataDto) null, (PerformanceMetricEventDataDto) null, (PerformanceMetricSpanEventDataDto) null, (ExperimentsEventDataDto) null, (NetworkErrorDataDto) null, (DeviceSecurityEventDataDto) null, (HttpCallDataDto) null, (DeviceMetricEventDataDto) null, (AppSessionEventDataDto) null, (PerceivedLoadingTimeEventDataDto) null, 1048575, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, PushNotificationEventDataDto pushNotificationEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, ErrorEventDataDto errorEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, AppSessionEventDataDto appSessionEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, Object obj) {
            PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto2;
            AppSessionEventDataDto appSessionEventDataDto2;
            String str8 = (i & 1) != 0 ? surrogate.category : str;
            String str9 = (i & 2) != 0 ? surrogate.event : str2;
            String str10 = (i & 4) != 0 ? surrogate.experiments : str3;
            String str11 = (i & 8) != 0 ? surrogate.session_id : str4;
            String str12 = (i & 16) != 0 ? surrogate.url : str5;
            String str13 = (i & 32) != 0 ? surrogate.web_referrer : str6;
            String str14 = (i & 64) != 0 ? surrogate.web_referrer_host : str7;
            PushNotificationEventDataDto pushNotificationEventDataDto2 = (i & 128) != 0 ? surrogate.push_notification_data : pushNotificationEventDataDto;
            DeepLinkEventDataDto deepLinkEventDataDto2 = (i & 256) != 0 ? surrogate.deep_link_data : deepLinkEventDataDto;
            ErrorEventDataDto errorEventDataDto2 = (i & 512) != 0 ? surrogate.error_data : errorEventDataDto;
            UserInteractionEventDataDto userInteractionEventDataDto2 = (i & 1024) != 0 ? surrogate.user_interaction_event_data : userInteractionEventDataDto;
            PerformanceMetricEventDataDto performanceMetricEventDataDto2 = (i & 2048) != 0 ? surrogate.performance_metric_event_data : performanceMetricEventDataDto;
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto2 = (i & 4096) != 0 ? surrogate.performance_metric_span_event_data : performanceMetricSpanEventDataDto;
            ExperimentsEventDataDto experimentsEventDataDto2 = (i & 8192) != 0 ? surrogate.experiments_data : experimentsEventDataDto;
            String str15 = str8;
            NetworkErrorDataDto networkErrorDataDto2 = (i & 16384) != 0 ? surrogate.network_error_data : networkErrorDataDto;
            DeviceSecurityEventDataDto deviceSecurityEventDataDto2 = (i & 32768) != 0 ? surrogate.device_security_event_data : deviceSecurityEventDataDto;
            HttpCallDataDto httpCallDataDto2 = (i & 65536) != 0 ? surrogate.http_call_data : httpCallDataDto;
            DeviceMetricEventDataDto deviceMetricEventDataDto2 = (i & 131072) != 0 ? surrogate.device_metric_event_data : deviceMetricEventDataDto;
            AppSessionEventDataDto appSessionEventDataDto3 = (i & 262144) != 0 ? surrogate.app_session_event_data : appSessionEventDataDto;
            if ((i & 524288) != 0) {
                appSessionEventDataDto2 = appSessionEventDataDto3;
                perceivedLoadingTimeEventDataDto2 = surrogate.perceived_loading_time_event_data;
            } else {
                perceivedLoadingTimeEventDataDto2 = perceivedLoadingTimeEventDataDto;
                appSessionEventDataDto2 = appSessionEventDataDto3;
            }
            return surrogate.copy(str15, str9, str10, str11, str12, str13, str14, pushNotificationEventDataDto2, deepLinkEventDataDto2, errorEventDataDto2, userInteractionEventDataDto2, performanceMetricEventDataDto2, performanceMetricSpanEventDataDto2, experimentsEventDataDto2, networkErrorDataDto2, deviceSecurityEventDataDto2, httpCallDataDto2, deviceMetricEventDataDto2, appSessionEventDataDto2, perceivedLoadingTimeEventDataDto2);
        }

        @SerialName("appSessionEventData")
        @JsonAnnotations2(names = {"app_session_event_data"})
        public static /* synthetic */ void getApp_session_event_data$annotations() {
        }

        @SerialName(RhGcmListenerService.EXTRA_CATEGORY)
        @JsonAnnotations2(names = {RhGcmListenerService.EXTRA_CATEGORY})
        public static /* synthetic */ void getCategory$annotations() {
        }

        @SerialName("deepLinkData")
        @JsonAnnotations2(names = {"deep_link_data"})
        public static /* synthetic */ void getDeep_link_data$annotations() {
        }

        @SerialName("deviceMetricEventData")
        @JsonAnnotations2(names = {"device_metric_event_data"})
        public static /* synthetic */ void getDevice_metric_event_data$annotations() {
        }

        @SerialName("deviceSecurityEventData")
        @JsonAnnotations2(names = {"device_security_event_data"})
        public static /* synthetic */ void getDevice_security_event_data$annotations() {
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

        @SerialName("networkErrorData")
        @JsonAnnotations2(names = {"network_error_data"})
        public static /* synthetic */ void getNetwork_error_data$annotations() {
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

        @SerialName("pushNotificationData")
        @JsonAnnotations2(names = {"push_notification_data"})
        public static /* synthetic */ void getPush_notification_data$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("url")
        @JsonAnnotations2(names = {"url"})
        public static /* synthetic */ void getUrl$annotations() {
        }

        @SerialName("userInteractionEventData")
        @JsonAnnotations2(names = {"user_interaction_event_data"})
        public static /* synthetic */ void getUser_interaction_event_data$annotations() {
        }

        @SerialName("webReferrer")
        @JsonAnnotations2(names = {"web_referrer"})
        public static /* synthetic */ void getWeb_referrer$annotations() {
        }

        @SerialName("webReferrerHost")
        @JsonAnnotations2(names = {"web_referrer_host"})
        public static /* synthetic */ void getWeb_referrer_host$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* renamed from: component10, reason: from getter */
        public final ErrorEventDataDto getError_data() {
            return this.error_data;
        }

        /* renamed from: component11, reason: from getter */
        public final UserInteractionEventDataDto getUser_interaction_event_data() {
            return this.user_interaction_event_data;
        }

        /* renamed from: component12, reason: from getter */
        public final PerformanceMetricEventDataDto getPerformance_metric_event_data() {
            return this.performance_metric_event_data;
        }

        /* renamed from: component13, reason: from getter */
        public final PerformanceMetricSpanEventDataDto getPerformance_metric_span_event_data() {
            return this.performance_metric_span_event_data;
        }

        /* renamed from: component14, reason: from getter */
        public final ExperimentsEventDataDto getExperiments_data() {
            return this.experiments_data;
        }

        /* renamed from: component15, reason: from getter */
        public final NetworkErrorDataDto getNetwork_error_data() {
            return this.network_error_data;
        }

        /* renamed from: component16, reason: from getter */
        public final DeviceSecurityEventDataDto getDevice_security_event_data() {
            return this.device_security_event_data;
        }

        /* renamed from: component17, reason: from getter */
        public final HttpCallDataDto getHttp_call_data() {
            return this.http_call_data;
        }

        /* renamed from: component18, reason: from getter */
        public final DeviceMetricEventDataDto getDevice_metric_event_data() {
            return this.device_metric_event_data;
        }

        /* renamed from: component19, reason: from getter */
        public final AppSessionEventDataDto getApp_session_event_data() {
            return this.app_session_event_data;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent() {
            return this.event;
        }

        /* renamed from: component20, reason: from getter */
        public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
            return this.perceived_loading_time_event_data;
        }

        /* renamed from: component3, reason: from getter */
        public final String getExperiments() {
            return this.experiments;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component6, reason: from getter */
        public final String getWeb_referrer() {
            return this.web_referrer;
        }

        /* renamed from: component7, reason: from getter */
        public final String getWeb_referrer_host() {
            return this.web_referrer_host;
        }

        /* renamed from: component8, reason: from getter */
        public final PushNotificationEventDataDto getPush_notification_data() {
            return this.push_notification_data;
        }

        /* renamed from: component9, reason: from getter */
        public final DeepLinkEventDataDto getDeep_link_data() {
            return this.deep_link_data;
        }

        public final Surrogate copy(String category, String event, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, PushNotificationEventDataDto push_notification_data, DeepLinkEventDataDto deep_link_data, ErrorEventDataDto error_data, UserInteractionEventDataDto user_interaction_event_data, PerformanceMetricEventDataDto performance_metric_event_data, PerformanceMetricSpanEventDataDto performance_metric_span_event_data, ExperimentsEventDataDto experiments_data, NetworkErrorDataDto network_error_data, DeviceSecurityEventDataDto device_security_event_data, HttpCallDataDto http_call_data, DeviceMetricEventDataDto device_metric_event_data, AppSessionEventDataDto app_session_event_data, PerceivedLoadingTimeEventDataDto perceived_loading_time_event_data) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
            Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
            return new Surrogate(category, event, experiments, session_id, url, web_referrer, web_referrer_host, push_notification_data, deep_link_data, error_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, experiments_data, network_error_data, device_security_event_data, http_call_data, device_metric_event_data, app_session_event_data, perceived_loading_time_event_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.category, surrogate.category) && Intrinsics.areEqual(this.event, surrogate.event) && Intrinsics.areEqual(this.experiments, surrogate.experiments) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.web_referrer, surrogate.web_referrer) && Intrinsics.areEqual(this.web_referrer_host, surrogate.web_referrer_host) && Intrinsics.areEqual(this.push_notification_data, surrogate.push_notification_data) && Intrinsics.areEqual(this.deep_link_data, surrogate.deep_link_data) && Intrinsics.areEqual(this.error_data, surrogate.error_data) && Intrinsics.areEqual(this.user_interaction_event_data, surrogate.user_interaction_event_data) && Intrinsics.areEqual(this.performance_metric_event_data, surrogate.performance_metric_event_data) && Intrinsics.areEqual(this.performance_metric_span_event_data, surrogate.performance_metric_span_event_data) && Intrinsics.areEqual(this.experiments_data, surrogate.experiments_data) && Intrinsics.areEqual(this.network_error_data, surrogate.network_error_data) && Intrinsics.areEqual(this.device_security_event_data, surrogate.device_security_event_data) && Intrinsics.areEqual(this.http_call_data, surrogate.http_call_data) && Intrinsics.areEqual(this.device_metric_event_data, surrogate.device_metric_event_data) && Intrinsics.areEqual(this.app_session_event_data, surrogate.app_session_event_data) && Intrinsics.areEqual(this.perceived_loading_time_event_data, surrogate.perceived_loading_time_event_data);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.category.hashCode() * 31) + this.event.hashCode()) * 31) + this.experiments.hashCode()) * 31) + this.session_id.hashCode()) * 31) + this.url.hashCode()) * 31) + this.web_referrer.hashCode()) * 31) + this.web_referrer_host.hashCode()) * 31;
            PushNotificationEventDataDto pushNotificationEventDataDto = this.push_notification_data;
            int iHashCode2 = (iHashCode + (pushNotificationEventDataDto == null ? 0 : pushNotificationEventDataDto.hashCode())) * 31;
            DeepLinkEventDataDto deepLinkEventDataDto = this.deep_link_data;
            int iHashCode3 = (iHashCode2 + (deepLinkEventDataDto == null ? 0 : deepLinkEventDataDto.hashCode())) * 31;
            ErrorEventDataDto errorEventDataDto = this.error_data;
            int iHashCode4 = (iHashCode3 + (errorEventDataDto == null ? 0 : errorEventDataDto.hashCode())) * 31;
            UserInteractionEventDataDto userInteractionEventDataDto = this.user_interaction_event_data;
            int iHashCode5 = (iHashCode4 + (userInteractionEventDataDto == null ? 0 : userInteractionEventDataDto.hashCode())) * 31;
            PerformanceMetricEventDataDto performanceMetricEventDataDto = this.performance_metric_event_data;
            int iHashCode6 = (iHashCode5 + (performanceMetricEventDataDto == null ? 0 : performanceMetricEventDataDto.hashCode())) * 31;
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto = this.performance_metric_span_event_data;
            int iHashCode7 = (iHashCode6 + (performanceMetricSpanEventDataDto == null ? 0 : performanceMetricSpanEventDataDto.hashCode())) * 31;
            ExperimentsEventDataDto experimentsEventDataDto = this.experiments_data;
            int iHashCode8 = (iHashCode7 + (experimentsEventDataDto == null ? 0 : experimentsEventDataDto.hashCode())) * 31;
            NetworkErrorDataDto networkErrorDataDto = this.network_error_data;
            int iHashCode9 = (iHashCode8 + (networkErrorDataDto == null ? 0 : networkErrorDataDto.hashCode())) * 31;
            DeviceSecurityEventDataDto deviceSecurityEventDataDto = this.device_security_event_data;
            int iHashCode10 = (iHashCode9 + (deviceSecurityEventDataDto == null ? 0 : deviceSecurityEventDataDto.hashCode())) * 31;
            HttpCallDataDto httpCallDataDto = this.http_call_data;
            int iHashCode11 = (iHashCode10 + (httpCallDataDto == null ? 0 : httpCallDataDto.hashCode())) * 31;
            DeviceMetricEventDataDto deviceMetricEventDataDto = this.device_metric_event_data;
            int iHashCode12 = (iHashCode11 + (deviceMetricEventDataDto == null ? 0 : deviceMetricEventDataDto.hashCode())) * 31;
            AppSessionEventDataDto appSessionEventDataDto = this.app_session_event_data;
            int iHashCode13 = (iHashCode12 + (appSessionEventDataDto == null ? 0 : appSessionEventDataDto.hashCode())) * 31;
            PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto = this.perceived_loading_time_event_data;
            return iHashCode13 + (perceivedLoadingTimeEventDataDto != null ? perceivedLoadingTimeEventDataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(category=" + this.category + ", event=" + this.event + ", experiments=" + this.experiments + ", session_id=" + this.session_id + ", url=" + this.url + ", web_referrer=" + this.web_referrer + ", web_referrer_host=" + this.web_referrer_host + ", push_notification_data=" + this.push_notification_data + ", deep_link_data=" + this.deep_link_data + ", error_data=" + this.error_data + ", user_interaction_event_data=" + this.user_interaction_event_data + ", performance_metric_event_data=" + this.performance_metric_event_data + ", performance_metric_span_event_data=" + this.performance_metric_span_event_data + ", experiments_data=" + this.experiments_data + ", network_error_data=" + this.network_error_data + ", device_security_event_data=" + this.device_security_event_data + ", http_call_data=" + this.http_call_data + ", device_metric_event_data=" + this.device_metric_event_data + ", app_session_event_data=" + this.app_session_event_data + ", perceived_loading_time_event_data=" + this.perceived_loading_time_event_data + ")";
        }

        /* compiled from: NcwAppEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NcwAppEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, PushNotificationEventDataDto pushNotificationEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, ErrorEventDataDto errorEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, AppSessionEventDataDto appSessionEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.experiments = "";
            } else {
                this.experiments = str3;
            }
            if ((i & 8) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str4;
            }
            if ((i & 16) == 0) {
                this.url = "";
            } else {
                this.url = str5;
            }
            if ((i & 32) == 0) {
                this.web_referrer = "";
            } else {
                this.web_referrer = str6;
            }
            if ((i & 64) == 0) {
                this.web_referrer_host = "";
            } else {
                this.web_referrer_host = str7;
            }
            if ((i & 128) == 0) {
                this.push_notification_data = null;
            } else {
                this.push_notification_data = pushNotificationEventDataDto;
            }
            if ((i & 256) == 0) {
                this.deep_link_data = null;
            } else {
                this.deep_link_data = deepLinkEventDataDto;
            }
            if ((i & 512) == 0) {
                this.error_data = null;
            } else {
                this.error_data = errorEventDataDto;
            }
            if ((i & 1024) == 0) {
                this.user_interaction_event_data = null;
            } else {
                this.user_interaction_event_data = userInteractionEventDataDto;
            }
            if ((i & 2048) == 0) {
                this.performance_metric_event_data = null;
            } else {
                this.performance_metric_event_data = performanceMetricEventDataDto;
            }
            if ((i & 4096) == 0) {
                this.performance_metric_span_event_data = null;
            } else {
                this.performance_metric_span_event_data = performanceMetricSpanEventDataDto;
            }
            if ((i & 8192) == 0) {
                this.experiments_data = null;
            } else {
                this.experiments_data = experimentsEventDataDto;
            }
            if ((i & 16384) == 0) {
                this.network_error_data = null;
            } else {
                this.network_error_data = networkErrorDataDto;
            }
            if ((32768 & i) == 0) {
                this.device_security_event_data = null;
            } else {
                this.device_security_event_data = deviceSecurityEventDataDto;
            }
            if ((65536 & i) == 0) {
                this.http_call_data = null;
            } else {
                this.http_call_data = httpCallDataDto;
            }
            if ((131072 & i) == 0) {
                this.device_metric_event_data = null;
            } else {
                this.device_metric_event_data = deviceMetricEventDataDto;
            }
            if ((262144 & i) == 0) {
                this.app_session_event_data = null;
            } else {
                this.app_session_event_data = appSessionEventDataDto;
            }
            if ((i & 524288) == 0) {
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
            if (!Intrinsics.areEqual(self.experiments, "")) {
                output.encodeStringElement(serialDesc, 2, self.experiments);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.session_id);
            }
            if (!Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 4, self.url);
            }
            if (!Intrinsics.areEqual(self.web_referrer, "")) {
                output.encodeStringElement(serialDesc, 5, self.web_referrer);
            }
            if (!Intrinsics.areEqual(self.web_referrer_host, "")) {
                output.encodeStringElement(serialDesc, 6, self.web_referrer_host);
            }
            PushNotificationEventDataDto pushNotificationEventDataDto = self.push_notification_data;
            if (pushNotificationEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, PushNotificationEventDataDto.Serializer.INSTANCE, pushNotificationEventDataDto);
            }
            DeepLinkEventDataDto deepLinkEventDataDto = self.deep_link_data;
            if (deepLinkEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DeepLinkEventDataDto.Serializer.INSTANCE, deepLinkEventDataDto);
            }
            ErrorEventDataDto errorEventDataDto = self.error_data;
            if (errorEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ErrorEventDataDto.Serializer.INSTANCE, errorEventDataDto);
            }
            UserInteractionEventDataDto userInteractionEventDataDto = self.user_interaction_event_data;
            if (userInteractionEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, UserInteractionEventDataDto.Serializer.INSTANCE, userInteractionEventDataDto);
            }
            PerformanceMetricEventDataDto performanceMetricEventDataDto = self.performance_metric_event_data;
            if (performanceMetricEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, PerformanceMetricEventDataDto.Serializer.INSTANCE, performanceMetricEventDataDto);
            }
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto = self.performance_metric_span_event_data;
            if (performanceMetricSpanEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, PerformanceMetricSpanEventDataDto.Serializer.INSTANCE, performanceMetricSpanEventDataDto);
            }
            ExperimentsEventDataDto experimentsEventDataDto = self.experiments_data;
            if (experimentsEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, ExperimentsEventDataDto.Serializer.INSTANCE, experimentsEventDataDto);
            }
            NetworkErrorDataDto networkErrorDataDto = self.network_error_data;
            if (networkErrorDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, NetworkErrorDataDto.Serializer.INSTANCE, networkErrorDataDto);
            }
            DeviceSecurityEventDataDto deviceSecurityEventDataDto = self.device_security_event_data;
            if (deviceSecurityEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, DeviceSecurityEventDataDto.Serializer.INSTANCE, deviceSecurityEventDataDto);
            }
            HttpCallDataDto httpCallDataDto = self.http_call_data;
            if (httpCallDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, HttpCallDataDto.Serializer.INSTANCE, httpCallDataDto);
            }
            DeviceMetricEventDataDto deviceMetricEventDataDto = self.device_metric_event_data;
            if (deviceMetricEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, DeviceMetricEventDataDto.Serializer.INSTANCE, deviceMetricEventDataDto);
            }
            AppSessionEventDataDto appSessionEventDataDto = self.app_session_event_data;
            if (appSessionEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, AppSessionEventDataDto.Serializer.INSTANCE, appSessionEventDataDto);
            }
            PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto = self.perceived_loading_time_event_data;
            if (perceivedLoadingTimeEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, PerceivedLoadingTimeEventDataDto.Serializer.INSTANCE, perceivedLoadingTimeEventDataDto);
            }
        }

        public Surrogate(String category, String event, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, PushNotificationEventDataDto pushNotificationEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, ErrorEventDataDto errorEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, AppSessionEventDataDto appSessionEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
            Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
            this.category = category;
            this.event = event;
            this.experiments = experiments;
            this.session_id = session_id;
            this.url = url;
            this.web_referrer = web_referrer;
            this.web_referrer_host = web_referrer_host;
            this.push_notification_data = pushNotificationEventDataDto;
            this.deep_link_data = deepLinkEventDataDto;
            this.error_data = errorEventDataDto;
            this.user_interaction_event_data = userInteractionEventDataDto;
            this.performance_metric_event_data = performanceMetricEventDataDto;
            this.performance_metric_span_event_data = performanceMetricSpanEventDataDto;
            this.experiments_data = experimentsEventDataDto;
            this.network_error_data = networkErrorDataDto;
            this.device_security_event_data = deviceSecurityEventDataDto;
            this.http_call_data = httpCallDataDto;
            this.device_metric_event_data = deviceMetricEventDataDto;
            this.app_session_event_data = appSessionEventDataDto;
            this.perceived_loading_time_event_data = perceivedLoadingTimeEventDataDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, PushNotificationEventDataDto pushNotificationEventDataDto, DeepLinkEventDataDto deepLinkEventDataDto, ErrorEventDataDto errorEventDataDto, UserInteractionEventDataDto userInteractionEventDataDto, PerformanceMetricEventDataDto performanceMetricEventDataDto, PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDto, ExperimentsEventDataDto experimentsEventDataDto, NetworkErrorDataDto networkErrorDataDto, DeviceSecurityEventDataDto deviceSecurityEventDataDto, HttpCallDataDto httpCallDataDto, DeviceMetricEventDataDto deviceMetricEventDataDto, AppSessionEventDataDto appSessionEventDataDto, PerceivedLoadingTimeEventDataDto perceivedLoadingTimeEventDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : pushNotificationEventDataDto, (i & 256) != 0 ? null : deepLinkEventDataDto, (i & 512) != 0 ? null : errorEventDataDto, (i & 1024) != 0 ? null : userInteractionEventDataDto, (i & 2048) != 0 ? null : performanceMetricEventDataDto, (i & 4096) != 0 ? null : performanceMetricSpanEventDataDto, (i & 8192) != 0 ? null : experimentsEventDataDto, (i & 16384) != 0 ? null : networkErrorDataDto, (i & 32768) != 0 ? null : deviceSecurityEventDataDto, (i & 65536) != 0 ? null : httpCallDataDto, (i & 131072) != 0 ? null : deviceMetricEventDataDto, (i & 262144) != 0 ? null : appSessionEventDataDto, (i & 524288) != 0 ? null : perceivedLoadingTimeEventDataDto);
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getEvent() {
            return this.event;
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

        public final PushNotificationEventDataDto getPush_notification_data() {
            return this.push_notification_data;
        }

        public final DeepLinkEventDataDto getDeep_link_data() {
            return this.deep_link_data;
        }

        public final ErrorEventDataDto getError_data() {
            return this.error_data;
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

        public final AppSessionEventDataDto getApp_session_event_data() {
            return this.app_session_event_data;
        }

        public final PerceivedLoadingTimeEventDataDto getPerceived_loading_time_event_data() {
            return this.perceived_loading_time_event_data;
        }
    }

    /* compiled from: NcwAppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;", "Lcom/robinhood/rosetta/eventlogging/NcwAppEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NcwAppEventDto, NcwAppEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NcwAppEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwAppEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwAppEventDto> getBinaryBase64Serializer() {
            return (KSerializer) NcwAppEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NcwAppEvent> getProtoAdapter() {
            return NcwAppEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwAppEventDto getZeroValue() {
            return NcwAppEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwAppEventDto fromProto(NcwAppEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String category = proto.getCategory();
            String event = proto.getEvent();
            String experiments = proto.getExperiments();
            String session_id = proto.getSession_id();
            String url = proto.getUrl();
            String web_referrer = proto.getWeb_referrer();
            String web_referrer_host = proto.getWeb_referrer_host();
            PushNotificationEventData push_notification_data = proto.getPush_notification_data();
            PushNotificationEventDataDto pushNotificationEventDataDtoFromProto = push_notification_data != null ? PushNotificationEventDataDto.INSTANCE.fromProto(push_notification_data) : null;
            DeepLinkEventData deep_link_data = proto.getDeep_link_data();
            DeepLinkEventDataDto deepLinkEventDataDtoFromProto = deep_link_data != null ? DeepLinkEventDataDto.INSTANCE.fromProto(deep_link_data) : null;
            ErrorEventData error_data = proto.getError_data();
            ErrorEventDataDto errorEventDataDtoFromProto = error_data != null ? ErrorEventDataDto.INSTANCE.fromProto(error_data) : null;
            UserInteractionEventData user_interaction_event_data = proto.getUser_interaction_event_data();
            UserInteractionEventDataDto userInteractionEventDataDtoFromProto = user_interaction_event_data != null ? UserInteractionEventDataDto.INSTANCE.fromProto(user_interaction_event_data) : null;
            PerformanceMetricEventData performance_metric_event_data = proto.getPerformance_metric_event_data();
            PerformanceMetricEventDataDto performanceMetricEventDataDtoFromProto = performance_metric_event_data != null ? PerformanceMetricEventDataDto.INSTANCE.fromProto(performance_metric_event_data) : null;
            PerformanceMetricSpanEventData performance_metric_span_event_data = proto.getPerformance_metric_span_event_data();
            PerformanceMetricSpanEventDataDto performanceMetricSpanEventDataDtoFromProto = performance_metric_span_event_data != null ? PerformanceMetricSpanEventDataDto.INSTANCE.fromProto(performance_metric_span_event_data) : null;
            ExperimentsEventData experiments_data = proto.getExperiments_data();
            ExperimentsEventDataDto experimentsEventDataDtoFromProto = experiments_data != null ? ExperimentsEventDataDto.INSTANCE.fromProto(experiments_data) : null;
            NetworkErrorData network_error_data = proto.getNetwork_error_data();
            PushNotificationEventDataDto pushNotificationEventDataDto = pushNotificationEventDataDtoFromProto;
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
            AppSessionEventData app_session_event_data = proto.getApp_session_event_data();
            DeviceMetricEventDataDto deviceMetricEventDataDto = deviceMetricEventDataDtoFromProto;
            AppSessionEventDataDto appSessionEventDataDtoFromProto = app_session_event_data != null ? AppSessionEventDataDto.INSTANCE.fromProto(app_session_event_data) : null;
            PerceivedLoadingTimeEventData perceived_loading_time_event_data = proto.getPerceived_loading_time_event_data();
            return new NcwAppEventDto(new Surrogate(category, event, experiments, session_id, url, web_referrer, web_referrer_host, pushNotificationEventDataDto, deepLinkEventDataDtoFromProto, errorEventDataDtoFromProto, userInteractionEventDataDtoFromProto, performanceMetricEventDataDtoFromProto, performanceMetricSpanEventDataDtoFromProto, experimentsEventDataDtoFromProto, networkErrorDataDto, deviceSecurityEventDataDto, httpCallDataDto, deviceMetricEventDataDto, appSessionEventDataDtoFromProto, perceived_loading_time_event_data != null ? PerceivedLoadingTimeEventDataDto.INSTANCE.fromProto(perceived_loading_time_event_data) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwAppEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NcwAppEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NcwAppEventDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NcwAppEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NcwAppEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NcwAppEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NcwAppEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NcwAppEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NcwAppEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NcwAppEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwAppEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NcwAppEventDto";
        }
    }
}
