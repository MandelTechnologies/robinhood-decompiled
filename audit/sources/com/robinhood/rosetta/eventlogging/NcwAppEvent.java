package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.util.notification.RhGcmListenerService;
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

/* compiled from: NcwAppEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001TBó\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\b\u0010K\u001a\u00020\u0002H\u0017J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OH\u0096\u0002J\b\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020\u0004H\u0016Jò\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010J¨\u0006U"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwAppEvent;", "Lcom/squareup/wire/Message;", "", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "experiments", "session_id", "url", "web_referrer", "web_referrer_host", "push_notification_data", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;", "deep_link_data", "Lcom/robinhood/rosetta/eventlogging/DeepLinkEventData;", "error_data", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData;", "user_interaction_event_data", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "performance_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;", "performance_metric_span_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;", "experiments_data", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;", "network_error_data", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;", "device_security_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;", "http_call_data", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "device_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "app_session_event_data", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;", "perceived_loading_time_event_data", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventData;Lcom/robinhood/rosetta/eventlogging/ErrorEventData;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;Lcom/robinhood/rosetta/eventlogging/HttpCallData;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;Lokio/ByteString;)V", "getCategory", "()Ljava/lang/String;", "getEvent", "getExperiments", "getSession_id", "getUrl", "getWeb_referrer", "getWeb_referrer_host", "getPush_notification_data", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;", "getDeep_link_data", "()Lcom/robinhood/rosetta/eventlogging/DeepLinkEventData;", "getError_data", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventData;", "getUser_interaction_event_data", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getPerformance_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;", "getPerformance_metric_span_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;", "getExperiments_data", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;", "getNetwork_error_data", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;", "getDevice_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;", "getHttp_call_data", "()Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "getDevice_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "getApp_session_event_data", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;", "getPerceived_loading_time_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NcwAppEvent extends Message {

    @JvmField
    public static final ProtoAdapter<NcwAppEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AppSessionEventData#ADAPTER", jsonName = "appSessionEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 25)
    private final AppSessionEventData app_session_event_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String category;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeepLinkEventData#ADAPTER", jsonName = "deepLinkData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 13)
    private final DeepLinkEventData deep_link_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData#ADAPTER", jsonName = "deviceMetricEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 24)
    private final DeviceMetricEventData device_metric_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceSecurityEventData#ADAPTER", jsonName = "deviceSecurityEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 22)
    private final DeviceSecurityEventData device_security_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ErrorEventData#ADAPTER", jsonName = "errorData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 14)
    private final ErrorEventData error_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String experiments;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ExperimentsEventData#ADAPTER", jsonName = "experimentsData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 19)
    private final ExperimentsEventData experiments_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCallData#ADAPTER", jsonName = "httpCallData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 23)
    private final HttpCallData http_call_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NetworkErrorData#ADAPTER", jsonName = "networkErrorData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 21)
    private final NetworkErrorData network_error_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventData#ADAPTER", jsonName = "perceivedLoadingTimeEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 26)
    private final PerceivedLoadingTimeEventData perceived_loading_time_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData#ADAPTER", jsonName = "performanceMetricEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 16)
    private final PerformanceMetricEventData performance_metric_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData#ADAPTER", jsonName = "performanceMetricSpanEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 17)
    private final PerformanceMetricSpanEventData performance_metric_span_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PushNotificationEventData#ADAPTER", jsonName = "pushNotificationData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final PushNotificationEventData push_notification_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final String url;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.UserInteractionEventData#ADAPTER", jsonName = "userInteractionEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 15)
    private final UserInteractionEventData user_interaction_event_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webReferrer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final String web_referrer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webReferrerHost", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final String web_referrer_host;

    public NcwAppEvent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public /* synthetic */ NcwAppEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, PushNotificationEventData pushNotificationEventData, DeepLinkEventData deepLinkEventData, ErrorEventData errorEventData, UserInteractionEventData userInteractionEventData, PerformanceMetricEventData performanceMetricEventData, PerformanceMetricSpanEventData performanceMetricSpanEventData, ExperimentsEventData experimentsEventData, NetworkErrorData networkErrorData, DeviceSecurityEventData deviceSecurityEventData, HttpCallData httpCallData, DeviceMetricEventData deviceMetricEventData, AppSessionEventData appSessionEventData, PerceivedLoadingTimeEventData perceivedLoadingTimeEventData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? null : pushNotificationEventData, (i & 256) != 0 ? null : deepLinkEventData, (i & 512) != 0 ? null : errorEventData, (i & 1024) != 0 ? null : userInteractionEventData, (i & 2048) != 0 ? null : performanceMetricEventData, (i & 4096) != 0 ? null : performanceMetricSpanEventData, (i & 8192) != 0 ? null : experimentsEventData, (i & 16384) != 0 ? null : networkErrorData, (i & 32768) != 0 ? null : deviceSecurityEventData, (i & 65536) != 0 ? null : httpCallData, (i & 131072) != 0 ? null : deviceMetricEventData, (i & 262144) != 0 ? null : appSessionEventData, (i & 524288) != 0 ? null : perceivedLoadingTimeEventData, (i & 1048576) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24393newBuilder();
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

    public final PushNotificationEventData getPush_notification_data() {
        return this.push_notification_data;
    }

    public final DeepLinkEventData getDeep_link_data() {
        return this.deep_link_data;
    }

    public final ErrorEventData getError_data() {
        return this.error_data;
    }

    public final UserInteractionEventData getUser_interaction_event_data() {
        return this.user_interaction_event_data;
    }

    public final PerformanceMetricEventData getPerformance_metric_event_data() {
        return this.performance_metric_event_data;
    }

    public final PerformanceMetricSpanEventData getPerformance_metric_span_event_data() {
        return this.performance_metric_span_event_data;
    }

    public final ExperimentsEventData getExperiments_data() {
        return this.experiments_data;
    }

    public final NetworkErrorData getNetwork_error_data() {
        return this.network_error_data;
    }

    public final DeviceSecurityEventData getDevice_security_event_data() {
        return this.device_security_event_data;
    }

    public final HttpCallData getHttp_call_data() {
        return this.http_call_data;
    }

    public final DeviceMetricEventData getDevice_metric_event_data() {
        return this.device_metric_event_data;
    }

    public final AppSessionEventData getApp_session_event_data() {
        return this.app_session_event_data;
    }

    public final PerceivedLoadingTimeEventData getPerceived_loading_time_event_data() {
        return this.perceived_loading_time_event_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcwAppEvent(String category, String event, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, PushNotificationEventData pushNotificationEventData, DeepLinkEventData deepLinkEventData, ErrorEventData errorEventData, UserInteractionEventData userInteractionEventData, PerformanceMetricEventData performanceMetricEventData, PerformanceMetricSpanEventData performanceMetricSpanEventData, ExperimentsEventData experimentsEventData, NetworkErrorData networkErrorData, DeviceSecurityEventData deviceSecurityEventData, HttpCallData httpCallData, DeviceMetricEventData deviceMetricEventData, AppSessionEventData appSessionEventData, PerceivedLoadingTimeEventData perceivedLoadingTimeEventData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.category = category;
        this.event = event;
        this.experiments = experiments;
        this.session_id = session_id;
        this.url = url;
        this.web_referrer = web_referrer;
        this.web_referrer_host = web_referrer_host;
        this.push_notification_data = pushNotificationEventData;
        this.deep_link_data = deepLinkEventData;
        this.error_data = errorEventData;
        this.user_interaction_event_data = userInteractionEventData;
        this.performance_metric_event_data = performanceMetricEventData;
        this.performance_metric_span_event_data = performanceMetricSpanEventData;
        this.experiments_data = experimentsEventData;
        this.network_error_data = networkErrorData;
        this.device_security_event_data = deviceSecurityEventData;
        this.http_call_data = httpCallData;
        this.device_metric_event_data = deviceMetricEventData;
        this.app_session_event_data = appSessionEventData;
        this.perceived_loading_time_event_data = perceivedLoadingTimeEventData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24393newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NcwAppEvent)) {
            return false;
        }
        NcwAppEvent ncwAppEvent = (NcwAppEvent) other;
        return Intrinsics.areEqual(unknownFields(), ncwAppEvent.unknownFields()) && Intrinsics.areEqual(this.category, ncwAppEvent.category) && Intrinsics.areEqual(this.event, ncwAppEvent.event) && Intrinsics.areEqual(this.experiments, ncwAppEvent.experiments) && Intrinsics.areEqual(this.session_id, ncwAppEvent.session_id) && Intrinsics.areEqual(this.url, ncwAppEvent.url) && Intrinsics.areEqual(this.web_referrer, ncwAppEvent.web_referrer) && Intrinsics.areEqual(this.web_referrer_host, ncwAppEvent.web_referrer_host) && Intrinsics.areEqual(this.push_notification_data, ncwAppEvent.push_notification_data) && Intrinsics.areEqual(this.deep_link_data, ncwAppEvent.deep_link_data) && Intrinsics.areEqual(this.error_data, ncwAppEvent.error_data) && Intrinsics.areEqual(this.user_interaction_event_data, ncwAppEvent.user_interaction_event_data) && Intrinsics.areEqual(this.performance_metric_event_data, ncwAppEvent.performance_metric_event_data) && Intrinsics.areEqual(this.performance_metric_span_event_data, ncwAppEvent.performance_metric_span_event_data) && Intrinsics.areEqual(this.experiments_data, ncwAppEvent.experiments_data) && Intrinsics.areEqual(this.network_error_data, ncwAppEvent.network_error_data) && Intrinsics.areEqual(this.device_security_event_data, ncwAppEvent.device_security_event_data) && Intrinsics.areEqual(this.http_call_data, ncwAppEvent.http_call_data) && Intrinsics.areEqual(this.device_metric_event_data, ncwAppEvent.device_metric_event_data) && Intrinsics.areEqual(this.app_session_event_data, ncwAppEvent.app_session_event_data) && Intrinsics.areEqual(this.perceived_loading_time_event_data, ncwAppEvent.perceived_loading_time_event_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.category.hashCode()) * 37) + this.event.hashCode()) * 37) + this.experiments.hashCode()) * 37) + this.session_id.hashCode()) * 37) + this.url.hashCode()) * 37) + this.web_referrer.hashCode()) * 37) + this.web_referrer_host.hashCode()) * 37;
        PushNotificationEventData pushNotificationEventData = this.push_notification_data;
        int iHashCode2 = (iHashCode + (pushNotificationEventData != null ? pushNotificationEventData.hashCode() : 0)) * 37;
        DeepLinkEventData deepLinkEventData = this.deep_link_data;
        int iHashCode3 = (iHashCode2 + (deepLinkEventData != null ? deepLinkEventData.hashCode() : 0)) * 37;
        ErrorEventData errorEventData = this.error_data;
        int iHashCode4 = (iHashCode3 + (errorEventData != null ? errorEventData.hashCode() : 0)) * 37;
        UserInteractionEventData userInteractionEventData = this.user_interaction_event_data;
        int iHashCode5 = (iHashCode4 + (userInteractionEventData != null ? userInteractionEventData.hashCode() : 0)) * 37;
        PerformanceMetricEventData performanceMetricEventData = this.performance_metric_event_data;
        int iHashCode6 = (iHashCode5 + (performanceMetricEventData != null ? performanceMetricEventData.hashCode() : 0)) * 37;
        PerformanceMetricSpanEventData performanceMetricSpanEventData = this.performance_metric_span_event_data;
        int iHashCode7 = (iHashCode6 + (performanceMetricSpanEventData != null ? performanceMetricSpanEventData.hashCode() : 0)) * 37;
        ExperimentsEventData experimentsEventData = this.experiments_data;
        int iHashCode8 = (iHashCode7 + (experimentsEventData != null ? experimentsEventData.hashCode() : 0)) * 37;
        NetworkErrorData networkErrorData = this.network_error_data;
        int iHashCode9 = (iHashCode8 + (networkErrorData != null ? networkErrorData.hashCode() : 0)) * 37;
        DeviceSecurityEventData deviceSecurityEventData = this.device_security_event_data;
        int iHashCode10 = (iHashCode9 + (deviceSecurityEventData != null ? deviceSecurityEventData.hashCode() : 0)) * 37;
        HttpCallData httpCallData = this.http_call_data;
        int iHashCode11 = (iHashCode10 + (httpCallData != null ? httpCallData.hashCode() : 0)) * 37;
        DeviceMetricEventData deviceMetricEventData = this.device_metric_event_data;
        int iHashCode12 = (iHashCode11 + (deviceMetricEventData != null ? deviceMetricEventData.hashCode() : 0)) * 37;
        AppSessionEventData appSessionEventData = this.app_session_event_data;
        int iHashCode13 = (iHashCode12 + (appSessionEventData != null ? appSessionEventData.hashCode() : 0)) * 37;
        PerceivedLoadingTimeEventData perceivedLoadingTimeEventData = this.perceived_loading_time_event_data;
        int iHashCode14 = iHashCode13 + (perceivedLoadingTimeEventData != null ? perceivedLoadingTimeEventData.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("category=" + Internal.sanitize(this.category));
        arrayList.add("event=" + Internal.sanitize(this.event));
        arrayList.add("experiments=" + Internal.sanitize(this.experiments));
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("web_referrer=" + Internal.sanitize(this.web_referrer));
        arrayList.add("web_referrer_host=" + Internal.sanitize(this.web_referrer_host));
        PushNotificationEventData pushNotificationEventData = this.push_notification_data;
        if (pushNotificationEventData != null) {
            arrayList.add("push_notification_data=" + pushNotificationEventData);
        }
        DeepLinkEventData deepLinkEventData = this.deep_link_data;
        if (deepLinkEventData != null) {
            arrayList.add("deep_link_data=" + deepLinkEventData);
        }
        ErrorEventData errorEventData = this.error_data;
        if (errorEventData != null) {
            arrayList.add("error_data=" + errorEventData);
        }
        UserInteractionEventData userInteractionEventData = this.user_interaction_event_data;
        if (userInteractionEventData != null) {
            arrayList.add("user_interaction_event_data=" + userInteractionEventData);
        }
        PerformanceMetricEventData performanceMetricEventData = this.performance_metric_event_data;
        if (performanceMetricEventData != null) {
            arrayList.add("performance_metric_event_data=" + performanceMetricEventData);
        }
        PerformanceMetricSpanEventData performanceMetricSpanEventData = this.performance_metric_span_event_data;
        if (performanceMetricSpanEventData != null) {
            arrayList.add("performance_metric_span_event_data=" + performanceMetricSpanEventData);
        }
        ExperimentsEventData experimentsEventData = this.experiments_data;
        if (experimentsEventData != null) {
            arrayList.add("experiments_data=" + experimentsEventData);
        }
        NetworkErrorData networkErrorData = this.network_error_data;
        if (networkErrorData != null) {
            arrayList.add("network_error_data=" + networkErrorData);
        }
        DeviceSecurityEventData deviceSecurityEventData = this.device_security_event_data;
        if (deviceSecurityEventData != null) {
            arrayList.add("device_security_event_data=" + deviceSecurityEventData);
        }
        HttpCallData httpCallData = this.http_call_data;
        if (httpCallData != null) {
            arrayList.add("http_call_data=" + httpCallData);
        }
        DeviceMetricEventData deviceMetricEventData = this.device_metric_event_data;
        if (deviceMetricEventData != null) {
            arrayList.add("device_metric_event_data=" + deviceMetricEventData);
        }
        AppSessionEventData appSessionEventData = this.app_session_event_data;
        if (appSessionEventData != null) {
            arrayList.add("app_session_event_data=" + appSessionEventData);
        }
        PerceivedLoadingTimeEventData perceivedLoadingTimeEventData = this.perceived_loading_time_event_data;
        if (perceivedLoadingTimeEventData != null) {
            arrayList.add("perceived_loading_time_event_data=" + perceivedLoadingTimeEventData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NcwAppEvent{", "}", 0, null, null, 56, null);
    }

    public final NcwAppEvent copy(String category, String event, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, PushNotificationEventData push_notification_data, DeepLinkEventData deep_link_data, ErrorEventData error_data, UserInteractionEventData user_interaction_event_data, PerformanceMetricEventData performance_metric_event_data, PerformanceMetricSpanEventData performance_metric_span_event_data, ExperimentsEventData experiments_data, NetworkErrorData network_error_data, DeviceSecurityEventData device_security_event_data, HttpCallData http_call_data, DeviceMetricEventData device_metric_event_data, AppSessionEventData app_session_event_data, PerceivedLoadingTimeEventData perceived_loading_time_event_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NcwAppEvent(category, event, experiments, session_id, url, web_referrer, web_referrer_host, push_notification_data, deep_link_data, error_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, experiments_data, network_error_data, device_security_event_data, http_call_data, device_metric_event_data, app_session_event_data, perceived_loading_time_event_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NcwAppEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NcwAppEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NcwAppEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NcwAppEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCategory());
                }
                if (!Intrinsics.areEqual(value.getEvent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getExperiments(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getExperiments());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getWeb_referrer());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer_host(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getWeb_referrer_host());
                }
                if (value.getPush_notification_data() != null) {
                    size += PushNotificationEventData.ADAPTER.encodedSizeWithTag(9, value.getPush_notification_data());
                }
                if (value.getDeep_link_data() != null) {
                    size += DeepLinkEventData.ADAPTER.encodedSizeWithTag(13, value.getDeep_link_data());
                }
                if (value.getError_data() != null) {
                    size += ErrorEventData.ADAPTER.encodedSizeWithTag(14, value.getError_data());
                }
                if (value.getUser_interaction_event_data() != null) {
                    size += UserInteractionEventData.ADAPTER.encodedSizeWithTag(15, value.getUser_interaction_event_data());
                }
                if (value.getPerformance_metric_event_data() != null) {
                    size += PerformanceMetricEventData.ADAPTER.encodedSizeWithTag(16, value.getPerformance_metric_event_data());
                }
                if (value.getPerformance_metric_span_event_data() != null) {
                    size += PerformanceMetricSpanEventData.ADAPTER.encodedSizeWithTag(17, value.getPerformance_metric_span_event_data());
                }
                if (value.getExperiments_data() != null) {
                    size += ExperimentsEventData.ADAPTER.encodedSizeWithTag(19, value.getExperiments_data());
                }
                if (value.getNetwork_error_data() != null) {
                    size += NetworkErrorData.ADAPTER.encodedSizeWithTag(21, value.getNetwork_error_data());
                }
                if (value.getDevice_security_event_data() != null) {
                    size += DeviceSecurityEventData.ADAPTER.encodedSizeWithTag(22, value.getDevice_security_event_data());
                }
                if (value.getHttp_call_data() != null) {
                    size += HttpCallData.ADAPTER.encodedSizeWithTag(23, value.getHttp_call_data());
                }
                if (value.getDevice_metric_event_data() != null) {
                    size += DeviceMetricEventData.ADAPTER.encodedSizeWithTag(24, value.getDevice_metric_event_data());
                }
                if (value.getApp_session_event_data() != null) {
                    size += AppSessionEventData.ADAPTER.encodedSizeWithTag(25, value.getApp_session_event_data());
                }
                return value.getPerceived_loading_time_event_data() != null ? size + PerceivedLoadingTimeEventData.ADAPTER.encodedSizeWithTag(26, value.getPerceived_loading_time_event_data()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NcwAppEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCategory());
                }
                if (!Intrinsics.areEqual(value.getEvent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getExperiments(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExperiments());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getWeb_referrer());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getWeb_referrer_host());
                }
                if (value.getPush_notification_data() != null) {
                    PushNotificationEventData.ADAPTER.encodeWithTag(writer, 9, (int) value.getPush_notification_data());
                }
                if (value.getDeep_link_data() != null) {
                    DeepLinkEventData.ADAPTER.encodeWithTag(writer, 13, (int) value.getDeep_link_data());
                }
                if (value.getError_data() != null) {
                    ErrorEventData.ADAPTER.encodeWithTag(writer, 14, (int) value.getError_data());
                }
                if (value.getUser_interaction_event_data() != null) {
                    UserInteractionEventData.ADAPTER.encodeWithTag(writer, 15, (int) value.getUser_interaction_event_data());
                }
                if (value.getPerformance_metric_event_data() != null) {
                    PerformanceMetricEventData.ADAPTER.encodeWithTag(writer, 16, (int) value.getPerformance_metric_event_data());
                }
                if (value.getPerformance_metric_span_event_data() != null) {
                    PerformanceMetricSpanEventData.ADAPTER.encodeWithTag(writer, 17, (int) value.getPerformance_metric_span_event_data());
                }
                if (value.getExperiments_data() != null) {
                    ExperimentsEventData.ADAPTER.encodeWithTag(writer, 19, (int) value.getExperiments_data());
                }
                if (value.getNetwork_error_data() != null) {
                    NetworkErrorData.ADAPTER.encodeWithTag(writer, 21, (int) value.getNetwork_error_data());
                }
                if (value.getDevice_security_event_data() != null) {
                    DeviceSecurityEventData.ADAPTER.encodeWithTag(writer, 22, (int) value.getDevice_security_event_data());
                }
                if (value.getHttp_call_data() != null) {
                    HttpCallData.ADAPTER.encodeWithTag(writer, 23, (int) value.getHttp_call_data());
                }
                if (value.getDevice_metric_event_data() != null) {
                    DeviceMetricEventData.ADAPTER.encodeWithTag(writer, 24, (int) value.getDevice_metric_event_data());
                }
                if (value.getApp_session_event_data() != null) {
                    AppSessionEventData.ADAPTER.encodeWithTag(writer, 25, (int) value.getApp_session_event_data());
                }
                if (value.getPerceived_loading_time_event_data() != null) {
                    PerceivedLoadingTimeEventData.ADAPTER.encodeWithTag(writer, 26, (int) value.getPerceived_loading_time_event_data());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NcwAppEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPerceived_loading_time_event_data() != null) {
                    PerceivedLoadingTimeEventData.ADAPTER.encodeWithTag(writer, 26, (int) value.getPerceived_loading_time_event_data());
                }
                if (value.getApp_session_event_data() != null) {
                    AppSessionEventData.ADAPTER.encodeWithTag(writer, 25, (int) value.getApp_session_event_data());
                }
                if (value.getDevice_metric_event_data() != null) {
                    DeviceMetricEventData.ADAPTER.encodeWithTag(writer, 24, (int) value.getDevice_metric_event_data());
                }
                if (value.getHttp_call_data() != null) {
                    HttpCallData.ADAPTER.encodeWithTag(writer, 23, (int) value.getHttp_call_data());
                }
                if (value.getDevice_security_event_data() != null) {
                    DeviceSecurityEventData.ADAPTER.encodeWithTag(writer, 22, (int) value.getDevice_security_event_data());
                }
                if (value.getNetwork_error_data() != null) {
                    NetworkErrorData.ADAPTER.encodeWithTag(writer, 21, (int) value.getNetwork_error_data());
                }
                if (value.getExperiments_data() != null) {
                    ExperimentsEventData.ADAPTER.encodeWithTag(writer, 19, (int) value.getExperiments_data());
                }
                if (value.getPerformance_metric_span_event_data() != null) {
                    PerformanceMetricSpanEventData.ADAPTER.encodeWithTag(writer, 17, (int) value.getPerformance_metric_span_event_data());
                }
                if (value.getPerformance_metric_event_data() != null) {
                    PerformanceMetricEventData.ADAPTER.encodeWithTag(writer, 16, (int) value.getPerformance_metric_event_data());
                }
                if (value.getUser_interaction_event_data() != null) {
                    UserInteractionEventData.ADAPTER.encodeWithTag(writer, 15, (int) value.getUser_interaction_event_data());
                }
                if (value.getError_data() != null) {
                    ErrorEventData.ADAPTER.encodeWithTag(writer, 14, (int) value.getError_data());
                }
                if (value.getDeep_link_data() != null) {
                    DeepLinkEventData.ADAPTER.encodeWithTag(writer, 13, (int) value.getDeep_link_data());
                }
                if (value.getPush_notification_data() != null) {
                    PushNotificationEventData.ADAPTER.encodeWithTag(writer, 9, (int) value.getPush_notification_data());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getWeb_referrer_host());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getWeb_referrer());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getExperiments(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExperiments());
                }
                if (!Intrinsics.areEqual(value.getEvent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent());
                }
                if (Intrinsics.areEqual(value.getCategory(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCategory());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NcwAppEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                PushNotificationEventData pushNotificationEventDataDecode = null;
                DeepLinkEventData deepLinkEventDataDecode = null;
                ErrorEventData errorEventDataDecode = null;
                UserInteractionEventData userInteractionEventDataDecode = null;
                PerformanceMetricEventData performanceMetricEventDataDecode = null;
                PerformanceMetricSpanEventData performanceMetricSpanEventDataDecode = null;
                ExperimentsEventData experimentsEventDataDecode = null;
                NetworkErrorData networkErrorDataDecode = null;
                DeviceSecurityEventData deviceSecurityEventDataDecode = null;
                HttpCallData httpCallDataDecode = null;
                DeviceMetricEventData deviceMetricEventDataDecode = null;
                AppSessionEventData appSessionEventDataDecode = null;
                PerceivedLoadingTimeEventData perceivedLoadingTimeEventDataDecode = null;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode7;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                            case 10:
                            case 11:
                            case 12:
                            case 18:
                            case 20:
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                pushNotificationEventDataDecode = PushNotificationEventData.ADAPTER.decode(reader);
                                break;
                            case 13:
                                deepLinkEventDataDecode = DeepLinkEventData.ADAPTER.decode(reader);
                                break;
                            case 14:
                                errorEventDataDecode = ErrorEventData.ADAPTER.decode(reader);
                                break;
                            case 15:
                                userInteractionEventDataDecode = UserInteractionEventData.ADAPTER.decode(reader);
                                break;
                            case 16:
                                performanceMetricEventDataDecode = PerformanceMetricEventData.ADAPTER.decode(reader);
                                break;
                            case 17:
                                performanceMetricSpanEventDataDecode = PerformanceMetricSpanEventData.ADAPTER.decode(reader);
                                break;
                            case 19:
                                experimentsEventDataDecode = ExperimentsEventData.ADAPTER.decode(reader);
                                break;
                            case 21:
                                networkErrorDataDecode = NetworkErrorData.ADAPTER.decode(reader);
                                break;
                            case 22:
                                deviceSecurityEventDataDecode = DeviceSecurityEventData.ADAPTER.decode(reader);
                                break;
                            case 23:
                                httpCallDataDecode = HttpCallData.ADAPTER.decode(reader);
                                break;
                            case 24:
                                deviceMetricEventDataDecode = DeviceMetricEventData.ADAPTER.decode(reader);
                                break;
                            case 25:
                                appSessionEventDataDecode = AppSessionEventData.ADAPTER.decode(reader);
                                break;
                            case 26:
                                perceivedLoadingTimeEventDataDecode = PerceivedLoadingTimeEventData.ADAPTER.decode(reader);
                                break;
                        }
                        strDecode7 = str;
                    } else {
                        return new NcwAppEvent(strDecode6, str, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, pushNotificationEventDataDecode, deepLinkEventDataDecode, errorEventDataDecode, userInteractionEventDataDecode, performanceMetricEventDataDecode, performanceMetricSpanEventDataDecode, experimentsEventDataDecode, networkErrorDataDecode, deviceSecurityEventDataDecode, httpCallDataDecode, deviceMetricEventDataDecode, appSessionEventDataDecode, perceivedLoadingTimeEventDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NcwAppEvent redact(NcwAppEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PushNotificationEventData push_notification_data = value.getPush_notification_data();
                PushNotificationEventData pushNotificationEventDataRedact = push_notification_data != null ? PushNotificationEventData.ADAPTER.redact(push_notification_data) : null;
                DeepLinkEventData deep_link_data = value.getDeep_link_data();
                DeepLinkEventData deepLinkEventDataRedact = deep_link_data != null ? DeepLinkEventData.ADAPTER.redact(deep_link_data) : null;
                ErrorEventData error_data = value.getError_data();
                ErrorEventData errorEventDataRedact = error_data != null ? ErrorEventData.ADAPTER.redact(error_data) : null;
                UserInteractionEventData user_interaction_event_data = value.getUser_interaction_event_data();
                UserInteractionEventData userInteractionEventDataRedact = user_interaction_event_data != null ? UserInteractionEventData.ADAPTER.redact(user_interaction_event_data) : null;
                PerformanceMetricEventData performance_metric_event_data = value.getPerformance_metric_event_data();
                PerformanceMetricEventData performanceMetricEventDataRedact = performance_metric_event_data != null ? PerformanceMetricEventData.ADAPTER.redact(performance_metric_event_data) : null;
                PerformanceMetricSpanEventData performance_metric_span_event_data = value.getPerformance_metric_span_event_data();
                PerformanceMetricSpanEventData performanceMetricSpanEventDataRedact = performance_metric_span_event_data != null ? PerformanceMetricSpanEventData.ADAPTER.redact(performance_metric_span_event_data) : null;
                ExperimentsEventData experiments_data = value.getExperiments_data();
                ExperimentsEventData experimentsEventDataRedact = experiments_data != null ? ExperimentsEventData.ADAPTER.redact(experiments_data) : null;
                NetworkErrorData network_error_data = value.getNetwork_error_data();
                NetworkErrorData networkErrorDataRedact = network_error_data != null ? NetworkErrorData.ADAPTER.redact(network_error_data) : null;
                DeviceSecurityEventData device_security_event_data = value.getDevice_security_event_data();
                DeviceSecurityEventData deviceSecurityEventDataRedact = device_security_event_data != null ? DeviceSecurityEventData.ADAPTER.redact(device_security_event_data) : null;
                HttpCallData http_call_data = value.getHttp_call_data();
                HttpCallData httpCallDataRedact = http_call_data != null ? HttpCallData.ADAPTER.redact(http_call_data) : null;
                DeviceMetricEventData device_metric_event_data = value.getDevice_metric_event_data();
                DeviceMetricEventData deviceMetricEventDataRedact = device_metric_event_data != null ? DeviceMetricEventData.ADAPTER.redact(device_metric_event_data) : null;
                AppSessionEventData app_session_event_data = value.getApp_session_event_data();
                AppSessionEventData appSessionEventDataRedact = app_session_event_data != null ? AppSessionEventData.ADAPTER.redact(app_session_event_data) : null;
                PerceivedLoadingTimeEventData perceived_loading_time_event_data = value.getPerceived_loading_time_event_data();
                return value.copy((EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 1) != 0 ? value.category : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 2) != 0 ? value.event : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 4) != 0 ? value.experiments : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 8) != 0 ? value.session_id : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 16) != 0 ? value.url : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 32) != 0 ? value.web_referrer : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 64) != 0 ? value.web_referrer_host : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 128) != 0 ? value.push_notification_data : pushNotificationEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 256) != 0 ? value.deep_link_data : deepLinkEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 512) != 0 ? value.error_data : errorEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 1024) != 0 ? value.user_interaction_event_data : userInteractionEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 2048) != 0 ? value.performance_metric_event_data : performanceMetricEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 4096) != 0 ? value.performance_metric_span_event_data : performanceMetricSpanEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 8192) != 0 ? value.experiments_data : experimentsEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 16384) != 0 ? value.network_error_data : networkErrorDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 32768) != 0 ? value.device_security_event_data : deviceSecurityEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 65536) != 0 ? value.http_call_data : httpCallDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 131072) != 0 ? value.device_metric_event_data : deviceMetricEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 262144) != 0 ? value.app_session_event_data : appSessionEventDataRedact, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 524288) != 0 ? value.perceived_loading_time_event_data : perceived_loading_time_event_data != null ? PerceivedLoadingTimeEventData.ADAPTER.redact(perceived_loading_time_event_data) : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 1048576) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
