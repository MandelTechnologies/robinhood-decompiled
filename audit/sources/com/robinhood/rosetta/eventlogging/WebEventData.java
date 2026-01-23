package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.rosetta.eventlogging.WebEventData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: WebEventData.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002abBó\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\f\u0012\b\b\u0002\u0010!\u001a\u00020\f\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\f\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020$\u0012\b\b\u0002\u0010(\u001a\u00020\f\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\b\b\u0002\u0010,\u001a\u00020-¢\u0006\u0004\b.\u0010/J\b\u0010Y\u001a\u00020\u0002H\u0017J\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0096\u0002J\b\u0010^\u001a\u00020$H\u0016J\b\u0010_\u001a\u00020\u0004H\u0016Jò\u0002\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020-R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00101R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00101R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0016\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00109R\u0016\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00109R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u0018\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0016\u0010\u0019\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u0016\u0010\u001a\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00109R\u0016\u0010\u001b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00109R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0016\u0010\u001e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00109R\u0016\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00101R\u0016\u0010 \u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00109R\u0016\u0010!\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00109R\u0016\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0016\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0016\u0010%\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00109R\u0016\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0016\u0010'\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010QR\u0016\u0010(\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00109R\u0016\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00101R\u0016\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00101R\u0016\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00101¨\u0006c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventData;", "Lcom/squareup/wire/Message;", "", "page", "", "section", "component", "element", "url", "additional_info", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfo;", "clp_value", "", "lcp_value", "etr_value", "description", "instrument_id", "symbol", "direction", "type", "fid_value", "etr_duration", "etr_source", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "etr_avg_long_task_duration", "fcp_value", "cls_value", "ttfb_value", "navigation_timing_data", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingData;", "inp_value", "debug_target", "loading_navigation_value", "loading_navigation_largest_request_duration", "loading_navigation_largest_request_url", "loading_navigation_num_requests", "", "request_duration", "request_url", "response_status_code", "duration", "masked_url", "masked_loading_navigation_largest_request_url", "masked_request_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfo;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;DDDDLcom/robinhood/rosetta/eventlogging/NavigationTimingData;DLjava/lang/String;DDLjava/lang/String;IDLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPage", "()Ljava/lang/String;", "getSection", "getComponent", "getElement", "getUrl", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfo;", "getClp_value", "()D", "getLcp_value", "getEtr_value", "getDescription", "getInstrument_id", "getSymbol", "getDirection", "getType", "getFid_value", "getEtr_duration", "getEtr_source", "()Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "getEtr_avg_long_task_duration", "getFcp_value", "getCls_value", "getTtfb_value", "getNavigation_timing_data", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingData;", "getInp_value", "getDebug_target", "getLoading_navigation_value", "getLoading_navigation_largest_request_duration", "getLoading_navigation_largest_request_url", "getLoading_navigation_num_requests", "()I", "getRequest_duration", "getRequest_url", "getResponse_status_code", "getDuration", "getMasked_url", "getMasked_loading_navigation_largest_request_url", "getMasked_request_url", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "ETRSource", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class WebEventData extends Message {

    @JvmField
    public static final ProtoAdapter<WebEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WebAdditionalInfo#ADAPTER", jsonName = "additionalInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final WebAdditionalInfo additional_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "clpValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double clp_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "clsValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final double cls_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String component;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "debugTarget", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final String debug_target;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 32)
    private final double duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String element;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "etrAvgLongTaskDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final double etr_avg_long_task_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "etrDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final double etr_duration;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WebEventData$ETRSource#ADAPTER", jsonName = "etrSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final ETRSource etr_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "etrValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final double etr_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "fcpValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final double fcp_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "fidValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final double fid_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "inpValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final double inp_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "lcpValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double lcp_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "loadingNavigationLargestRequestDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final double loading_navigation_largest_request_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loadingNavigationLargestRequestUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final String loading_navigation_largest_request_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "loadingNavigationNumRequests", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final int loading_navigation_num_requests;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "loadingNavigationValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final double loading_navigation_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedLoadingNavigationLargestRequestUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 1027)
    private final String masked_loading_navigation_largest_request_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedRequestUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 1030)
    private final String masked_request_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = ErrorCodes.SOCKET_TIMEOUT_EXCEPTION)
    private final String masked_url;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NavigationTimingData#ADAPTER", jsonName = "navigationTimingData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final NavigationTimingData navigation_timing_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String page;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "requestDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final double request_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 30)
    private final String request_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "responseStatusCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 31)
    private final int response_status_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String section;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "ttfbValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final double ttfb_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String url;

    public WebEventData() {
        this(null, null, null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, null, null, null, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, null, 0, 0.0d, null, null, null, null, -1, 15, null);
    }

    public /* synthetic */ WebEventData(String str, String str2, String str3, String str4, String str5, WebAdditionalInfo webAdditionalInfo, double d, double d2, double d3, String str6, String str7, String str8, String str9, String str10, double d4, double d5, ETRSource eTRSource, double d6, double d7, double d8, double d9, NavigationTimingData navigationTimingData, double d10, String str11, double d11, double d12, String str12, int i, double d13, String str13, int i2, double d14, String str14, String str15, String str16, ByteString byteString, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : webAdditionalInfo, (i3 & 64) != 0 ? 0.0d : d, (i3 & 128) != 0 ? 0.0d : d2, (i3 & 256) != 0 ? 0.0d : d3, (i3 & 512) != 0 ? "" : str6, (i3 & 1024) != 0 ? "" : str7, (i3 & 2048) != 0 ? "" : str8, (i3 & 4096) != 0 ? "" : str9, (i3 & 8192) != 0 ? "" : str10, (i3 & 16384) != 0 ? 0.0d : d4, (32768 & i3) != 0 ? 0.0d : d5, (65536 & i3) != 0 ? ETRSource.SOURCE_UNSPECIFIED : eTRSource, (i3 & 131072) != 0 ? 0.0d : d6, (i3 & 262144) != 0 ? 0.0d : d7, (i3 & 524288) != 0 ? 0.0d : d8, (i3 & 1048576) != 0 ? 0.0d : d9, (i3 & 2097152) != 0 ? null : navigationTimingData, (i3 & 4194304) != 0 ? 0.0d : d10, (i3 & 8388608) != 0 ? "" : str11, (i3 & 16777216) != 0 ? 0.0d : d11, (i3 & 33554432) != 0 ? 0.0d : d12, (i3 & 67108864) != 0 ? "" : str12, (i3 & 134217728) != 0 ? 0 : i, (i3 & 268435456) != 0 ? 0.0d : d13, (i3 & 536870912) != 0 ? "" : str13, (i3 & 1073741824) == 0 ? i2 : 0, (i3 & Integer.MIN_VALUE) != 0 ? 0.0d : d14, (i4 & 1) != 0 ? "" : str14, (i4 & 2) != 0 ? "" : str15, (i4 & 4) == 0 ? str16 : "", (i4 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24609newBuilder();
    }

    public final String getPage() {
        return this.page;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getComponent() {
        return this.component;
    }

    public final String getElement() {
        return this.element;
    }

    public final String getUrl() {
        return this.url;
    }

    public final WebAdditionalInfo getAdditional_info() {
        return this.additional_info;
    }

    public final double getClp_value() {
        return this.clp_value;
    }

    public final double getLcp_value() {
        return this.lcp_value;
    }

    public final double getEtr_value() {
        return this.etr_value;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getType() {
        return this.type;
    }

    public final double getFid_value() {
        return this.fid_value;
    }

    public final double getEtr_duration() {
        return this.etr_duration;
    }

    public final ETRSource getEtr_source() {
        return this.etr_source;
    }

    public final double getEtr_avg_long_task_duration() {
        return this.etr_avg_long_task_duration;
    }

    public final double getFcp_value() {
        return this.fcp_value;
    }

    public final double getCls_value() {
        return this.cls_value;
    }

    public final double getTtfb_value() {
        return this.ttfb_value;
    }

    public final NavigationTimingData getNavigation_timing_data() {
        return this.navigation_timing_data;
    }

    public final double getInp_value() {
        return this.inp_value;
    }

    public final String getDebug_target() {
        return this.debug_target;
    }

    public final double getLoading_navigation_value() {
        return this.loading_navigation_value;
    }

    public final double getLoading_navigation_largest_request_duration() {
        return this.loading_navigation_largest_request_duration;
    }

    public final String getLoading_navigation_largest_request_url() {
        return this.loading_navigation_largest_request_url;
    }

    public final int getLoading_navigation_num_requests() {
        return this.loading_navigation_num_requests;
    }

    public final double getRequest_duration() {
        return this.request_duration;
    }

    public final String getRequest_url() {
        return this.request_url;
    }

    public final int getResponse_status_code() {
        return this.response_status_code;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final String getMasked_url() {
        return this.masked_url;
    }

    public final String getMasked_loading_navigation_largest_request_url() {
        return this.masked_loading_navigation_largest_request_url;
    }

    public final String getMasked_request_url() {
        return this.masked_request_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebEventData(String page, String section, String component, String element, String url, WebAdditionalInfo webAdditionalInfo, double d, double d2, double d3, String description, String instrument_id, String symbol, String direction, String type2, double d4, double d5, ETRSource etr_source, double d6, double d7, double d8, double d9, NavigationTimingData navigationTimingData, double d10, String debug_target, double d11, double d12, String loading_navigation_largest_request_url, int i, double d13, String request_url, int i2, double d14, String masked_url, String masked_loading_navigation_largest_request_url, String masked_request_url, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(etr_source, "etr_source");
        Intrinsics.checkNotNullParameter(debug_target, "debug_target");
        Intrinsics.checkNotNullParameter(loading_navigation_largest_request_url, "loading_navigation_largest_request_url");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(masked_url, "masked_url");
        Intrinsics.checkNotNullParameter(masked_loading_navigation_largest_request_url, "masked_loading_navigation_largest_request_url");
        Intrinsics.checkNotNullParameter(masked_request_url, "masked_request_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.page = page;
        this.section = section;
        this.component = component;
        this.element = element;
        this.url = url;
        this.additional_info = webAdditionalInfo;
        this.clp_value = d;
        this.lcp_value = d2;
        this.etr_value = d3;
        this.description = description;
        this.instrument_id = instrument_id;
        this.symbol = symbol;
        this.direction = direction;
        this.type = type2;
        this.fid_value = d4;
        this.etr_duration = d5;
        this.etr_source = etr_source;
        this.etr_avg_long_task_duration = d6;
        this.fcp_value = d7;
        this.cls_value = d8;
        this.ttfb_value = d9;
        this.navigation_timing_data = navigationTimingData;
        this.inp_value = d10;
        this.debug_target = debug_target;
        this.loading_navigation_value = d11;
        this.loading_navigation_largest_request_duration = d12;
        this.loading_navigation_largest_request_url = loading_navigation_largest_request_url;
        this.loading_navigation_num_requests = i;
        this.request_duration = d13;
        this.request_url = request_url;
        this.response_status_code = i2;
        this.duration = d14;
        this.masked_url = masked_url;
        this.masked_loading_navigation_largest_request_url = masked_loading_navigation_largest_request_url;
        this.masked_request_url = masked_request_url;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24609newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WebEventData)) {
            return false;
        }
        WebEventData webEventData = (WebEventData) other;
        return Intrinsics.areEqual(unknownFields(), webEventData.unknownFields()) && Intrinsics.areEqual(this.page, webEventData.page) && Intrinsics.areEqual(this.section, webEventData.section) && Intrinsics.areEqual(this.component, webEventData.component) && Intrinsics.areEqual(this.element, webEventData.element) && Intrinsics.areEqual(this.url, webEventData.url) && Intrinsics.areEqual(this.additional_info, webEventData.additional_info) && this.clp_value == webEventData.clp_value && this.lcp_value == webEventData.lcp_value && this.etr_value == webEventData.etr_value && Intrinsics.areEqual(this.description, webEventData.description) && Intrinsics.areEqual(this.instrument_id, webEventData.instrument_id) && Intrinsics.areEqual(this.symbol, webEventData.symbol) && Intrinsics.areEqual(this.direction, webEventData.direction) && Intrinsics.areEqual(this.type, webEventData.type) && this.fid_value == webEventData.fid_value && this.etr_duration == webEventData.etr_duration && this.etr_source == webEventData.etr_source && this.etr_avg_long_task_duration == webEventData.etr_avg_long_task_duration && this.fcp_value == webEventData.fcp_value && this.cls_value == webEventData.cls_value && this.ttfb_value == webEventData.ttfb_value && Intrinsics.areEqual(this.navigation_timing_data, webEventData.navigation_timing_data) && this.inp_value == webEventData.inp_value && Intrinsics.areEqual(this.debug_target, webEventData.debug_target) && this.loading_navigation_value == webEventData.loading_navigation_value && this.loading_navigation_largest_request_duration == webEventData.loading_navigation_largest_request_duration && Intrinsics.areEqual(this.loading_navigation_largest_request_url, webEventData.loading_navigation_largest_request_url) && this.loading_navigation_num_requests == webEventData.loading_navigation_num_requests && this.request_duration == webEventData.request_duration && Intrinsics.areEqual(this.request_url, webEventData.request_url) && this.response_status_code == webEventData.response_status_code && this.duration == webEventData.duration && Intrinsics.areEqual(this.masked_url, webEventData.masked_url) && Intrinsics.areEqual(this.masked_loading_navigation_largest_request_url, webEventData.masked_loading_navigation_largest_request_url) && Intrinsics.areEqual(this.masked_request_url, webEventData.masked_request_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.page.hashCode()) * 37) + this.section.hashCode()) * 37) + this.component.hashCode()) * 37) + this.element.hashCode()) * 37) + this.url.hashCode()) * 37;
        WebAdditionalInfo webAdditionalInfo = this.additional_info;
        int iHashCode2 = (((((((((((((((((((((((((((((((iHashCode + (webAdditionalInfo != null ? webAdditionalInfo.hashCode() : 0)) * 37) + Double.hashCode(this.clp_value)) * 37) + Double.hashCode(this.lcp_value)) * 37) + Double.hashCode(this.etr_value)) * 37) + this.description.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.direction.hashCode()) * 37) + this.type.hashCode()) * 37) + Double.hashCode(this.fid_value)) * 37) + Double.hashCode(this.etr_duration)) * 37) + this.etr_source.hashCode()) * 37) + Double.hashCode(this.etr_avg_long_task_duration)) * 37) + Double.hashCode(this.fcp_value)) * 37) + Double.hashCode(this.cls_value)) * 37) + Double.hashCode(this.ttfb_value)) * 37;
        NavigationTimingData navigationTimingData = this.navigation_timing_data;
        int iHashCode3 = ((((((((((((((((((((((((((iHashCode2 + (navigationTimingData != null ? navigationTimingData.hashCode() : 0)) * 37) + Double.hashCode(this.inp_value)) * 37) + this.debug_target.hashCode()) * 37) + Double.hashCode(this.loading_navigation_value)) * 37) + Double.hashCode(this.loading_navigation_largest_request_duration)) * 37) + this.loading_navigation_largest_request_url.hashCode()) * 37) + Integer.hashCode(this.loading_navigation_num_requests)) * 37) + Double.hashCode(this.request_duration)) * 37) + this.request_url.hashCode()) * 37) + Integer.hashCode(this.response_status_code)) * 37) + Double.hashCode(this.duration)) * 37) + this.masked_url.hashCode()) * 37) + this.masked_loading_navigation_largest_request_url.hashCode()) * 37) + this.masked_request_url.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("page=" + Internal.sanitize(this.page));
        arrayList.add("section=" + Internal.sanitize(this.section));
        arrayList.add("component=" + Internal.sanitize(this.component));
        arrayList.add("element=" + Internal.sanitize(this.element));
        arrayList.add("url=" + Internal.sanitize(this.url));
        WebAdditionalInfo webAdditionalInfo = this.additional_info;
        if (webAdditionalInfo != null) {
            arrayList.add("additional_info=" + webAdditionalInfo);
        }
        arrayList.add("clp_value=" + this.clp_value);
        arrayList.add("lcp_value=" + this.lcp_value);
        arrayList.add("etr_value=" + this.etr_value);
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("direction=" + Internal.sanitize(this.direction));
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("fid_value=" + this.fid_value);
        arrayList.add("etr_duration=" + this.etr_duration);
        arrayList.add("etr_source=" + this.etr_source);
        arrayList.add("etr_avg_long_task_duration=" + this.etr_avg_long_task_duration);
        arrayList.add("fcp_value=" + this.fcp_value);
        arrayList.add("cls_value=" + this.cls_value);
        arrayList.add("ttfb_value=" + this.ttfb_value);
        NavigationTimingData navigationTimingData = this.navigation_timing_data;
        if (navigationTimingData != null) {
            arrayList.add("navigation_timing_data=" + navigationTimingData);
        }
        arrayList.add("inp_value=" + this.inp_value);
        arrayList.add("debug_target=" + Internal.sanitize(this.debug_target));
        arrayList.add("loading_navigation_value=" + this.loading_navigation_value);
        arrayList.add("loading_navigation_largest_request_duration=" + this.loading_navigation_largest_request_duration);
        arrayList.add("loading_navigation_largest_request_url=" + Internal.sanitize(this.loading_navigation_largest_request_url));
        arrayList.add("loading_navigation_num_requests=" + this.loading_navigation_num_requests);
        arrayList.add("request_duration=" + this.request_duration);
        arrayList.add("request_url=" + Internal.sanitize(this.request_url));
        arrayList.add("response_status_code=" + this.response_status_code);
        arrayList.add("duration=" + this.duration);
        arrayList.add("masked_url=" + Internal.sanitize(this.masked_url));
        arrayList.add("masked_loading_navigation_largest_request_url=" + Internal.sanitize(this.masked_loading_navigation_largest_request_url));
        arrayList.add("masked_request_url=" + Internal.sanitize(this.masked_request_url));
        return CollectionsKt.joinToString$default(arrayList, ", ", "WebEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ WebEventData copy$default(WebEventData webEventData, String str, String str2, String str3, String str4, String str5, WebAdditionalInfo webAdditionalInfo, double d, double d2, double d3, String str6, String str7, String str8, String str9, String str10, double d4, double d5, ETRSource eTRSource, double d6, double d7, double d8, double d9, NavigationTimingData navigationTimingData, double d10, String str11, double d11, double d12, String str12, int i, double d13, String str13, int i2, double d14, String str14, String str15, String str16, ByteString byteString, int i3, int i4, Object obj) {
        String str17 = (i3 & 1) != 0 ? webEventData.page : str;
        return webEventData.copy(str17, (i3 & 2) != 0 ? webEventData.section : str2, (i3 & 4) != 0 ? webEventData.component : str3, (i3 & 8) != 0 ? webEventData.element : str4, (i3 & 16) != 0 ? webEventData.url : str5, (i3 & 32) != 0 ? webEventData.additional_info : webAdditionalInfo, (i3 & 64) != 0 ? webEventData.clp_value : d, (i3 & 128) != 0 ? webEventData.lcp_value : d2, (i3 & 256) != 0 ? webEventData.etr_value : d3, (i3 & 512) != 0 ? webEventData.description : str6, (i3 & 1024) != 0 ? webEventData.instrument_id : str7, (i3 & 2048) != 0 ? webEventData.symbol : str8, (i3 & 4096) != 0 ? webEventData.direction : str9, (i3 & 8192) != 0 ? webEventData.type : str10, (i3 & 16384) != 0 ? webEventData.fid_value : d4, (i3 & 32768) != 0 ? webEventData.etr_duration : d5, (i3 & 65536) != 0 ? webEventData.etr_source : eTRSource, (i3 & 131072) != 0 ? webEventData.etr_avg_long_task_duration : d6, (i3 & 262144) != 0 ? webEventData.fcp_value : d7, (i3 & 524288) != 0 ? webEventData.cls_value : d8, (i3 & 1048576) != 0 ? webEventData.ttfb_value : d9, (i3 & 2097152) != 0 ? webEventData.navigation_timing_data : navigationTimingData, (i3 & 4194304) != 0 ? webEventData.inp_value : d10, (i3 & 8388608) != 0 ? webEventData.debug_target : str11, (i3 & 16777216) != 0 ? webEventData.loading_navigation_value : d11, (i3 & 33554432) != 0 ? webEventData.loading_navigation_largest_request_duration : d12, (i3 & 67108864) != 0 ? webEventData.loading_navigation_largest_request_url : str12, (i3 & 134217728) != 0 ? webEventData.loading_navigation_num_requests : i, (i3 & 268435456) != 0 ? webEventData.request_duration : d13, (i3 & 536870912) != 0 ? webEventData.request_url : str13, (i3 & 1073741824) != 0 ? webEventData.response_status_code : i2, (i3 & Integer.MIN_VALUE) != 0 ? webEventData.duration : d14, (i4 & 1) != 0 ? webEventData.masked_url : str14, (i4 & 2) != 0 ? webEventData.masked_loading_navigation_largest_request_url : str15, (i4 & 4) != 0 ? webEventData.masked_request_url : str16, (i4 & 8) != 0 ? webEventData.unknownFields() : byteString);
    }

    public final WebEventData copy(String page, String section, String component, String element, String url, WebAdditionalInfo additional_info, double clp_value, double lcp_value, double etr_value, String description, String instrument_id, String symbol, String direction, String type2, double fid_value, double etr_duration, ETRSource etr_source, double etr_avg_long_task_duration, double fcp_value, double cls_value, double ttfb_value, NavigationTimingData navigation_timing_data, double inp_value, String debug_target, double loading_navigation_value, double loading_navigation_largest_request_duration, String loading_navigation_largest_request_url, int loading_navigation_num_requests, double request_duration, String request_url, int response_status_code, double duration, String masked_url, String masked_loading_navigation_largest_request_url, String masked_request_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(etr_source, "etr_source");
        Intrinsics.checkNotNullParameter(debug_target, "debug_target");
        Intrinsics.checkNotNullParameter(loading_navigation_largest_request_url, "loading_navigation_largest_request_url");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(masked_url, "masked_url");
        Intrinsics.checkNotNullParameter(masked_loading_navigation_largest_request_url, "masked_loading_navigation_largest_request_url");
        Intrinsics.checkNotNullParameter(masked_request_url, "masked_request_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WebEventData(page, section, component, element, url, additional_info, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, type2, fid_value, etr_duration, etr_source, etr_avg_long_task_duration, fcp_value, cls_value, ttfb_value, navigation_timing_data, inp_value, debug_target, loading_navigation_value, loading_navigation_largest_request_duration, loading_navigation_largest_request_url, loading_navigation_num_requests, request_duration, request_url, response_status_code, duration, masked_url, masked_loading_navigation_largest_request_url, masked_request_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WebEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WebEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.WebEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WebEventData value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPage());
                }
                if (!Intrinsics.areEqual(value.getSection(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSection());
                }
                if (!Intrinsics.areEqual(value.getComponent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getComponent());
                }
                if (!Intrinsics.areEqual(value.getElement(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getElement());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getUrl());
                }
                if (value.getAdditional_info() != null) {
                    size += WebAdditionalInfo.ADAPTER.encodedSizeWithTag(6, value.getAdditional_info());
                }
                if (!Double.valueOf(value.getClp_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getClp_value()));
                }
                if (!Double.valueOf(value.getLcp_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getLcp_value()));
                }
                if (!Double.valueOf(value.getEtr_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(9, Double.valueOf(value.getEtr_value()));
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getType());
                }
                if (!Double.valueOf(value.getFid_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(15, Double.valueOf(value.getFid_value()));
                }
                if (!Double.valueOf(value.getEtr_duration()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(16, Double.valueOf(value.getEtr_duration()));
                }
                if (value.getEtr_source() != WebEventData.ETRSource.SOURCE_UNSPECIFIED) {
                    size += WebEventData.ETRSource.ADAPTER.encodedSizeWithTag(17, value.getEtr_source());
                }
                if (!Double.valueOf(value.getEtr_avg_long_task_duration()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(18, Double.valueOf(value.getEtr_avg_long_task_duration()));
                }
                if (!Double.valueOf(value.getFcp_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(19, Double.valueOf(value.getFcp_value()));
                }
                if (!Double.valueOf(value.getCls_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(20, Double.valueOf(value.getCls_value()));
                }
                if (!Double.valueOf(value.getTtfb_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(21, Double.valueOf(value.getTtfb_value()));
                }
                if (value.getNavigation_timing_data() != null) {
                    size += NavigationTimingData.ADAPTER.encodedSizeWithTag(22, value.getNavigation_timing_data());
                }
                if (!Double.valueOf(value.getInp_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(23, Double.valueOf(value.getInp_value()));
                }
                if (!Intrinsics.areEqual(value.getDebug_target(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(24, value.getDebug_target());
                }
                if (!Double.valueOf(value.getLoading_navigation_value()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(25, Double.valueOf(value.getLoading_navigation_value()));
                }
                if (!Double.valueOf(value.getLoading_navigation_largest_request_duration()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(26, Double.valueOf(value.getLoading_navigation_largest_request_duration()));
                }
                if (!Intrinsics.areEqual(value.getLoading_navigation_largest_request_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(27, value.getLoading_navigation_largest_request_url());
                }
                if (value.getLoading_navigation_num_requests() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(28, Integer.valueOf(value.getLoading_navigation_num_requests()));
                }
                if (!Double.valueOf(value.getRequest_duration()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(29, Double.valueOf(value.getRequest_duration()));
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(30, value.getRequest_url());
                }
                if (value.getResponse_status_code() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(31, Integer.valueOf(value.getResponse_status_code()));
                }
                if (!Double.valueOf(value.getDuration()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(32, Double.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getMasked_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, value.getMasked_url());
                }
                if (!Intrinsics.areEqual(value.getMasked_loading_navigation_largest_request_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1027, value.getMasked_loading_navigation_largest_request_url());
                }
                return !Intrinsics.areEqual(value.getMasked_request_url(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1030, value.getMasked_request_url()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WebEventData value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPage());
                }
                if (!Intrinsics.areEqual(value.getSection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSection());
                }
                if (!Intrinsics.areEqual(value.getComponent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getComponent());
                }
                if (!Intrinsics.areEqual(value.getElement(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getElement());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUrl());
                }
                if (value.getAdditional_info() != null) {
                    WebAdditionalInfo.ADAPTER.encodeWithTag(writer, 6, (int) value.getAdditional_info());
                }
                if (!Double.valueOf(value.getClp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getClp_value()));
                }
                if (!Double.valueOf(value.getLcp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getLcp_value()));
                }
                if (!Double.valueOf(value.getEtr_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getEtr_value()));
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getType());
                }
                if (!Double.valueOf(value.getFid_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getFid_value()));
                }
                if (!Double.valueOf(value.getEtr_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getEtr_duration()));
                }
                if (value.getEtr_source() != WebEventData.ETRSource.SOURCE_UNSPECIFIED) {
                    WebEventData.ETRSource.ADAPTER.encodeWithTag(writer, 17, (int) value.getEtr_source());
                }
                if (!Double.valueOf(value.getEtr_avg_long_task_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 18, (int) Double.valueOf(value.getEtr_avg_long_task_duration()));
                }
                if (!Double.valueOf(value.getFcp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getFcp_value()));
                }
                if (!Double.valueOf(value.getCls_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 20, (int) Double.valueOf(value.getCls_value()));
                }
                if (!Double.valueOf(value.getTtfb_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 21, (int) Double.valueOf(value.getTtfb_value()));
                }
                if (value.getNavigation_timing_data() != null) {
                    NavigationTimingData.ADAPTER.encodeWithTag(writer, 22, (int) value.getNavigation_timing_data());
                }
                if (!Double.valueOf(value.getInp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 23, (int) Double.valueOf(value.getInp_value()));
                }
                if (!Intrinsics.areEqual(value.getDebug_target(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getDebug_target());
                }
                if (!Double.valueOf(value.getLoading_navigation_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 25, (int) Double.valueOf(value.getLoading_navigation_value()));
                }
                if (!Double.valueOf(value.getLoading_navigation_largest_request_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 26, (int) Double.valueOf(value.getLoading_navigation_largest_request_duration()));
                }
                if (!Intrinsics.areEqual(value.getLoading_navigation_largest_request_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 27, (int) value.getLoading_navigation_largest_request_url());
                }
                if (value.getLoading_navigation_num_requests() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 28, (int) Integer.valueOf(value.getLoading_navigation_num_requests()));
                }
                if (!Double.valueOf(value.getRequest_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 29, (int) Double.valueOf(value.getRequest_duration()));
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getRequest_url());
                }
                if (value.getResponse_status_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 31, (int) Integer.valueOf(value.getResponse_status_code()));
                }
                if (!Double.valueOf(value.getDuration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 32, (int) Double.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getMasked_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, (int) value.getMasked_url());
                }
                if (!Intrinsics.areEqual(value.getMasked_loading_navigation_largest_request_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1027, (int) value.getMasked_loading_navigation_largest_request_url());
                }
                if (!Intrinsics.areEqual(value.getMasked_request_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1030, (int) value.getMasked_request_url());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WebEventData value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_request_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1030, (int) value.getMasked_request_url());
                }
                if (!Intrinsics.areEqual(value.getMasked_loading_navigation_largest_request_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1027, (int) value.getMasked_loading_navigation_largest_request_url());
                }
                if (!Intrinsics.areEqual(value.getMasked_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, (int) value.getMasked_url());
                }
                if (!Double.valueOf(value.getDuration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 32, (int) Double.valueOf(value.getDuration()));
                }
                if (value.getResponse_status_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 31, (int) Integer.valueOf(value.getResponse_status_code()));
                }
                if (!Intrinsics.areEqual(value.getRequest_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 30, (int) value.getRequest_url());
                }
                if (!Double.valueOf(value.getRequest_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 29, (int) Double.valueOf(value.getRequest_duration()));
                }
                if (value.getLoading_navigation_num_requests() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 28, (int) Integer.valueOf(value.getLoading_navigation_num_requests()));
                }
                if (!Intrinsics.areEqual(value.getLoading_navigation_largest_request_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 27, (int) value.getLoading_navigation_largest_request_url());
                }
                if (!Double.valueOf(value.getLoading_navigation_largest_request_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 26, (int) Double.valueOf(value.getLoading_navigation_largest_request_duration()));
                }
                if (!Double.valueOf(value.getLoading_navigation_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 25, (int) Double.valueOf(value.getLoading_navigation_value()));
                }
                if (!Intrinsics.areEqual(value.getDebug_target(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getDebug_target());
                }
                if (!Double.valueOf(value.getInp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 23, (int) Double.valueOf(value.getInp_value()));
                }
                if (value.getNavigation_timing_data() != null) {
                    NavigationTimingData.ADAPTER.encodeWithTag(writer, 22, (int) value.getNavigation_timing_data());
                }
                if (!Double.valueOf(value.getTtfb_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 21, (int) Double.valueOf(value.getTtfb_value()));
                }
                if (!Double.valueOf(value.getCls_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 20, (int) Double.valueOf(value.getCls_value()));
                }
                if (!Double.valueOf(value.getFcp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 19, (int) Double.valueOf(value.getFcp_value()));
                }
                if (!Double.valueOf(value.getEtr_avg_long_task_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 18, (int) Double.valueOf(value.getEtr_avg_long_task_duration()));
                }
                if (value.getEtr_source() != WebEventData.ETRSource.SOURCE_UNSPECIFIED) {
                    WebEventData.ETRSource.ADAPTER.encodeWithTag(writer, 17, (int) value.getEtr_source());
                }
                if (!Double.valueOf(value.getEtr_duration()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 16, (int) Double.valueOf(value.getEtr_duration()));
                }
                if (!Double.valueOf(value.getFid_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 15, (int) Double.valueOf(value.getFid_value()));
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getDirection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getDescription());
                }
                if (!Double.valueOf(value.getEtr_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 9, (int) Double.valueOf(value.getEtr_value()));
                }
                if (!Double.valueOf(value.getLcp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getLcp_value()));
                }
                if (!Double.valueOf(value.getClp_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getClp_value()));
                }
                if (value.getAdditional_info() != null) {
                    WebAdditionalInfo.ADAPTER.encodeWithTag(writer, 6, (int) value.getAdditional_info());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getElement(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getElement());
                }
                if (!Intrinsics.areEqual(value.getComponent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getComponent());
                }
                if (!Intrinsics.areEqual(value.getSection(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSection());
                }
                if (Intrinsics.areEqual(value.getPage(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPage());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WebEventData decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                String str4;
                Intrinsics.checkNotNullParameter(reader, "reader");
                WebEventData.ETRSource eTRSource = WebEventData.ETRSource.SOURCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                WebEventData.ETRSource eTRSourceDecode = eTRSource;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                WebAdditionalInfo webAdditionalInfoDecode = null;
                NavigationTimingData navigationTimingDataDecode = null;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                double dDoubleValue6 = 0.0d;
                double dDoubleValue7 = 0.0d;
                double dDoubleValue8 = 0.0d;
                double dDoubleValue9 = 0.0d;
                double dDoubleValue10 = 0.0d;
                double dDoubleValue11 = 0.0d;
                double dDoubleValue12 = 0.0d;
                double dDoubleValue13 = 0.0d;
                double dDoubleValue14 = 0.0d;
                int iIntValue = 0;
                int iIntValue2 = 0;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                String strDecode16 = strDecode15;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WebEventData(strDecode13, strDecode14, strDecode15, strDecode16, strDecode, webAdditionalInfoDecode, dDoubleValue, dDoubleValue2, dDoubleValue3, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, dDoubleValue4, dDoubleValue5, eTRSourceDecode, dDoubleValue6, dDoubleValue7, dDoubleValue8, dDoubleValue9, navigationTimingDataDecode, dDoubleValue10, strDecode7, dDoubleValue11, dDoubleValue12, strDecode8, iIntValue, dDoubleValue13, strDecode9, iIntValue2, dDoubleValue14, strDecode10, strDecode11, strDecode12, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1005) {
                        strDecode10 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1027) {
                        strDecode11 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 1030) {
                        switch (iNextTag) {
                            case 1:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                webAdditionalInfoDecode = WebAdditionalInfo.ADAPTER.decode(reader);
                                break;
                            case 7:
                                str4 = strDecode13;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                strDecode13 = str4;
                                break;
                            case 8:
                                str4 = strDecode13;
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                strDecode13 = str4;
                                break;
                            case 9:
                                str4 = strDecode13;
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                strDecode13 = str4;
                                break;
                            case 10:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                str4 = strDecode13;
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                strDecode13 = str4;
                                break;
                            case 16:
                                str4 = strDecode13;
                                dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                strDecode13 = str4;
                                break;
                            case 17:
                                try {
                                    eTRSourceDecode = WebEventData.ETRSource.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode13;
                                    str2 = strDecode14;
                                    str3 = strDecode15;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 18:
                                dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 19:
                                dDoubleValue7 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 20:
                                dDoubleValue8 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 21:
                                dDoubleValue9 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 22:
                                navigationTimingDataDecode = NavigationTimingData.ADAPTER.decode(reader);
                                break;
                            case 23:
                                dDoubleValue10 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 24:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 25:
                                dDoubleValue11 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 26:
                                dDoubleValue12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 27:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 28:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 29:
                                dDoubleValue13 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 30:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 31:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 32:
                                dDoubleValue14 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode13;
                                str2 = strDecode14;
                                str3 = strDecode15;
                                strDecode13 = str;
                                strDecode14 = str2;
                                strDecode15 = str3;
                                break;
                        }
                    } else {
                        strDecode12 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WebEventData redact(WebEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                WebAdditionalInfo additional_info = value.getAdditional_info();
                WebAdditionalInfo webAdditionalInfoRedact = additional_info != null ? WebAdditionalInfo.ADAPTER.redact(additional_info) : null;
                NavigationTimingData navigation_timing_data = value.getNavigation_timing_data();
                return WebEventData.copy$default(value, null, null, null, null, null, webAdditionalInfoRedact, 0.0d, 0.0d, 0.0d, null, null, null, null, null, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, navigation_timing_data != null ? NavigationTimingData.ADAPTER.redact(navigation_timing_data) : null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, null, 0, 0.0d, null, null, null, ByteString.EMPTY, -2097185, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SOURCE_UNSPECIFIED", "SOURCE_INITIAL_LOAD", "SOURCE_ROUTE_CHANGE", "SOURCE_SELECT_OPTION_CONTRACT", "SOURCE_OPTION_ORDER_SUBMISSION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ETRSource implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ETRSource[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ETRSource> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ETRSource SOURCE_INITIAL_LOAD;
        public static final ETRSource SOURCE_OPTION_ORDER_SUBMISSION;
        public static final ETRSource SOURCE_ROUTE_CHANGE;
        public static final ETRSource SOURCE_SELECT_OPTION_CONTRACT;
        public static final ETRSource SOURCE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ ETRSource[] $values() {
            return new ETRSource[]{SOURCE_UNSPECIFIED, SOURCE_INITIAL_LOAD, SOURCE_ROUTE_CHANGE, SOURCE_SELECT_OPTION_CONTRACT, SOURCE_OPTION_ORDER_SUBMISSION};
        }

        @JvmStatic
        public static final ETRSource fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ETRSource> getEntries() {
            return $ENTRIES;
        }

        private ETRSource(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ETRSource eTRSource = new ETRSource("SOURCE_UNSPECIFIED", 0, 0);
            SOURCE_UNSPECIFIED = eTRSource;
            SOURCE_INITIAL_LOAD = new ETRSource("SOURCE_INITIAL_LOAD", 1, 1);
            SOURCE_ROUTE_CHANGE = new ETRSource("SOURCE_ROUTE_CHANGE", 2, 2);
            SOURCE_SELECT_OPTION_CONTRACT = new ETRSource("SOURCE_SELECT_OPTION_CONTRACT", 3, 3);
            SOURCE_OPTION_ORDER_SUBMISSION = new ETRSource("SOURCE_OPTION_ORDER_SUBMISSION", 4, 4);
            ETRSource[] eTRSourceArr$values = $values();
            $VALUES = eTRSourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eTRSourceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ETRSource.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ETRSource>(orCreateKotlinClass, syntax, eTRSource) { // from class: com.robinhood.rosetta.eventlogging.WebEventData$ETRSource$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WebEventData.ETRSource fromValue(int value) {
                    return WebEventData.ETRSource.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WebEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ETRSource fromValue(int value) {
                if (value == 0) {
                    return ETRSource.SOURCE_UNSPECIFIED;
                }
                if (value == 1) {
                    return ETRSource.SOURCE_INITIAL_LOAD;
                }
                if (value == 2) {
                    return ETRSource.SOURCE_ROUTE_CHANGE;
                }
                if (value == 3) {
                    return ETRSource.SOURCE_SELECT_OPTION_CONTRACT;
                }
                if (value != 4) {
                    return null;
                }
                return ETRSource.SOURCE_OPTION_ORDER_SUBMISSION;
            }
        }

        public static ETRSource valueOf(String str) {
            return (ETRSource) Enum.valueOf(ETRSource.class, str);
        }

        public static ETRSource[] values() {
            return (ETRSource[]) $VALUES.clone();
        }
    }
}
