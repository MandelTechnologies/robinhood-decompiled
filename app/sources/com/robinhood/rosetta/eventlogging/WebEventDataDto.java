package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.NavigationTimingDataDto;
import com.robinhood.rosetta.eventlogging.WebAdditionalInfoDto;
import com.robinhood.rosetta.eventlogging.WebEventData;
import com.robinhood.rosetta.eventlogging.WebEventDataDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: WebEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005ijklmB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bë\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\t\u0012\b\b\u0002\u0010%\u001a\u00020\u0011\u0012\b\b\u0002\u0010&\u001a\u00020\u0011\u0012\b\b\u0002\u0010'\u001a\u00020\t\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020\u0011\u0012\b\b\u0002\u0010+\u001a\u00020\t\u0012\b\b\u0002\u0010,\u001a\u00020)\u0012\b\b\u0002\u0010-\u001a\u00020\u0011\u0012\b\b\u0002\u0010.\u001a\u00020\t\u0012\b\b\u0002\u0010/\u001a\u00020\t\u0012\b\b\u0002\u00100\u001a\u00020\t¢\u0006\u0004\b\u0006\u00101Jè\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020)2\b\b\u0002\u0010-\u001a\u00020\u00112\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u00020\tJ\b\u0010\\\u001a\u00020\u0002H\u0016J\b\u0010]\u001a\u00020\tH\u0016J\u0013\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0096\u0002J\b\u0010b\u001a\u00020)H\u0016J\u0018\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020)H\u0016J\b\u0010h\u001a\u00020)H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b6\u00103R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b7\u00103R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b<\u0010;R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b>\u00103R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b?\u00103R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b@\u00103R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bA\u00103R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bB\u00103R\u0011\u0010\u0019\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bC\u0010;R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010\u001d\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bG\u0010;R\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bH\u0010;R\u0011\u0010\u001f\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bI\u0010;R\u0011\u0010 \u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bJ\u0010;R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010#\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bM\u0010;R\u0011\u0010$\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bN\u00103R\u0011\u0010%\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bO\u0010;R\u0011\u0010&\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bP\u0010;R\u0011\u0010'\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bQ\u00103R\u0011\u0010(\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010*\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bT\u0010;R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bU\u00103R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bV\u0010SR\u0011\u0010-\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bW\u0010;R\u0011\u0010.\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bX\u00103R\u0011\u0010/\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bY\u00103R\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bZ\u00103¨\u0006n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/WebEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$Surrogate;)V", "page", "", "section", "component", "element", "url", "additional_info", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;", "clp_value", "", "lcp_value", "etr_value", "description", "instrument_id", "symbol", "direction", "type", "fid_value", "etr_duration", "etr_source", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "etr_avg_long_task_duration", "fcp_value", "cls_value", "ttfb_value", "navigation_timing_data", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;", "inp_value", "debug_target", "loading_navigation_value", "loading_navigation_largest_request_duration", "loading_navigation_largest_request_url", "loading_navigation_num_requests", "", "request_duration", "request_url", "response_status_code", "duration", "masked_url", "masked_loading_navigation_largest_request_url", "masked_request_url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;DDDDLcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;DLjava/lang/String;DDLjava/lang/String;IDLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPage", "()Ljava/lang/String;", "getSection", "getComponent", "getElement", "getUrl", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;", "getClp_value", "()D", "getLcp_value", "getEtr_value", "getDescription", "getInstrument_id", "getSymbol", "getDirection", "getType", "getFid_value", "getEtr_duration", "getEtr_source", "()Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "getEtr_avg_long_task_duration", "getFcp_value", "getCls_value", "getTtfb_value", "getNavigation_timing_data", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;", "getInp_value", "getDebug_target", "getLoading_navigation_value", "getLoading_navigation_largest_request_duration", "getLoading_navigation_largest_request_url", "getLoading_navigation_num_requests", "()I", "getRequest_duration", "getRequest_url", "getResponse_status_code", "getDuration", "getMasked_url", "getMasked_loading_navigation_largest_request_url", "getMasked_request_url", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ETRSourceDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class WebEventDataDto implements Dto3<WebEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WebEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WebEventDataDto, WebEventData>> binaryBase64Serializer$delegate;
    private static final WebEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WebEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WebEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPage() {
        return this.surrogate.getPage();
    }

    public final String getSection() {
        return this.surrogate.getSection();
    }

    public final String getComponent() {
        return this.surrogate.getComponent();
    }

    public final String getElement() {
        return this.surrogate.getElement();
    }

    public final String getUrl() {
        return this.surrogate.getUrl();
    }

    public final WebAdditionalInfoDto getAdditional_info() {
        return this.surrogate.getAdditional_info();
    }

    public final double getClp_value() {
        return this.surrogate.getClp_value();
    }

    public final double getLcp_value() {
        return this.surrogate.getLcp_value();
    }

    public final double getEtr_value() {
        return this.surrogate.getEtr_value();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getDirection() {
        return this.surrogate.getDirection();
    }

    public final String getType() {
        return this.surrogate.getType();
    }

    public final double getFid_value() {
        return this.surrogate.getFid_value();
    }

    public final double getEtr_duration() {
        return this.surrogate.getEtr_duration();
    }

    public final ETRSourceDto getEtr_source() {
        return this.surrogate.getEtr_source();
    }

    public final double getEtr_avg_long_task_duration() {
        return this.surrogate.getEtr_avg_long_task_duration();
    }

    public final double getFcp_value() {
        return this.surrogate.getFcp_value();
    }

    public final double getCls_value() {
        return this.surrogate.getCls_value();
    }

    public final double getTtfb_value() {
        return this.surrogate.getTtfb_value();
    }

    public final NavigationTimingDataDto getNavigation_timing_data() {
        return this.surrogate.getNavigation_timing_data();
    }

    public final double getInp_value() {
        return this.surrogate.getInp_value();
    }

    public final String getDebug_target() {
        return this.surrogate.getDebug_target();
    }

    public final double getLoading_navigation_value() {
        return this.surrogate.getLoading_navigation_value();
    }

    public final double getLoading_navigation_largest_request_duration() {
        return this.surrogate.getLoading_navigation_largest_request_duration();
    }

    public final String getLoading_navigation_largest_request_url() {
        return this.surrogate.getLoading_navigation_largest_request_url();
    }

    public final int getLoading_navigation_num_requests() {
        return this.surrogate.getLoading_navigation_num_requests();
    }

    public final double getRequest_duration() {
        return this.surrogate.getRequest_duration();
    }

    public final String getRequest_url() {
        return this.surrogate.getRequest_url();
    }

    public final int getResponse_status_code() {
        return this.surrogate.getResponse_status_code();
    }

    public final double getDuration() {
        return this.surrogate.getDuration();
    }

    public final String getMasked_url() {
        return this.surrogate.getMasked_url();
    }

    public final String getMasked_loading_navigation_largest_request_url() {
        return this.surrogate.getMasked_loading_navigation_largest_request_url();
    }

    public final String getMasked_request_url() {
        return this.surrogate.getMasked_request_url();
    }

    public /* synthetic */ WebEventDataDto(String str, String str2, String str3, String str4, String str5, WebAdditionalInfoDto webAdditionalInfoDto, double d, double d2, double d3, String str6, String str7, String str8, String str9, String str10, double d4, double d5, ETRSourceDto eTRSourceDto, double d6, double d7, double d8, double d9, NavigationTimingDataDto navigationTimingDataDto, double d10, String str11, double d11, double d12, String str12, int i, double d13, String str13, int i2, double d14, String str14, String str15, String str16, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : webAdditionalInfoDto, (i3 & 64) != 0 ? 0.0d : d, (i3 & 128) != 0 ? 0.0d : d2, (i3 & 256) != 0 ? 0.0d : d3, (i3 & 512) != 0 ? "" : str6, (i3 & 1024) != 0 ? "" : str7, (i3 & 2048) != 0 ? "" : str8, (i3 & 4096) != 0 ? "" : str9, (i3 & 8192) != 0 ? "" : str10, (i3 & 16384) != 0 ? 0.0d : d4, (32768 & i3) != 0 ? 0.0d : d5, (65536 & i3) != 0 ? ETRSourceDto.INSTANCE.getZeroValue() : eTRSourceDto, (i3 & 131072) != 0 ? 0.0d : d6, (i3 & 262144) != 0 ? 0.0d : d7, (i3 & 524288) != 0 ? 0.0d : d8, (i3 & 1048576) != 0 ? 0.0d : d9, (i3 & 2097152) != 0 ? null : navigationTimingDataDto, (i3 & 4194304) != 0 ? 0.0d : d10, (i3 & 8388608) != 0 ? "" : str11, (i3 & 16777216) != 0 ? 0.0d : d11, (i3 & 33554432) != 0 ? 0.0d : d12, (i3 & 67108864) != 0 ? "" : str12, (i3 & 134217728) != 0 ? 0 : i, (i3 & 268435456) != 0 ? 0.0d : d13, (i3 & 536870912) != 0 ? "" : str13, (i3 & 1073741824) == 0 ? i2 : 0, (i3 & Integer.MIN_VALUE) != 0 ? 0.0d : d14, (i4 & 1) != 0 ? "" : str14, (i4 & 2) != 0 ? "" : str15, (i4 & 4) != 0 ? "" : str16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebEventDataDto(String page, String section, String component, String element, String url, WebAdditionalInfoDto webAdditionalInfoDto, double d, double d2, double d3, String description, String instrument_id, String symbol, String direction, String type2, double d4, double d5, ETRSourceDto etr_source, double d6, double d7, double d8, double d9, NavigationTimingDataDto navigationTimingDataDto, double d10, String debug_target, double d11, double d12, String loading_navigation_largest_request_url, int i, double d13, String request_url, int i2, double d14, String masked_url, String masked_loading_navigation_largest_request_url, String masked_request_url) {
        this(new Surrogate(page, section, component, element, url, webAdditionalInfoDto, d, d2, d3, description, instrument_id, symbol, direction, type2, d4, d5, etr_source, d6, d7, d8, d9, navigationTimingDataDto, d10, debug_target, d11, d12, loading_navigation_largest_request_url, i, d13, request_url, i2, d14, masked_url, masked_loading_navigation_largest_request_url, masked_request_url));
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
    }

    public static /* synthetic */ WebEventDataDto copy$default(WebEventDataDto webEventDataDto, String str, String str2, String str3, String str4, String str5, WebAdditionalInfoDto webAdditionalInfoDto, double d, double d2, double d3, String str6, String str7, String str8, String str9, String str10, double d4, double d5, ETRSourceDto eTRSourceDto, double d6, double d7, double d8, double d9, NavigationTimingDataDto navigationTimingDataDto, double d10, String str11, double d11, double d12, String str12, int i, double d13, String str13, int i2, double d14, String str14, String str15, String str16, int i3, int i4, Object obj) {
        String masked_request_url;
        String str17;
        String page = (i3 & 1) != 0 ? webEventDataDto.surrogate.getPage() : str;
        String section = (i3 & 2) != 0 ? webEventDataDto.surrogate.getSection() : str2;
        String component = (i3 & 4) != 0 ? webEventDataDto.surrogate.getComponent() : str3;
        String element = (i3 & 8) != 0 ? webEventDataDto.surrogate.getElement() : str4;
        String url = (i3 & 16) != 0 ? webEventDataDto.surrogate.getUrl() : str5;
        WebAdditionalInfoDto additional_info = (i3 & 32) != 0 ? webEventDataDto.surrogate.getAdditional_info() : webAdditionalInfoDto;
        double clp_value = (i3 & 64) != 0 ? webEventDataDto.surrogate.getClp_value() : d;
        double lcp_value = (i3 & 128) != 0 ? webEventDataDto.surrogate.getLcp_value() : d2;
        double etr_value = (i3 & 256) != 0 ? webEventDataDto.surrogate.getEtr_value() : d3;
        String description = (i3 & 512) != 0 ? webEventDataDto.surrogate.getDescription() : str6;
        String instrument_id = (i3 & 1024) != 0 ? webEventDataDto.surrogate.getInstrument_id() : str7;
        String str18 = page;
        String symbol = (i3 & 2048) != 0 ? webEventDataDto.surrogate.getSymbol() : str8;
        String direction = (i3 & 4096) != 0 ? webEventDataDto.surrogate.getDirection() : str9;
        String type2 = (i3 & 8192) != 0 ? webEventDataDto.surrogate.getType() : str10;
        double fid_value = (i3 & 16384) != 0 ? webEventDataDto.surrogate.getFid_value() : d4;
        double etr_duration = (32768 & i3) != 0 ? webEventDataDto.surrogate.getEtr_duration() : d5;
        ETRSourceDto etr_source = (65536 & i3) != 0 ? webEventDataDto.surrogate.getEtr_source() : eTRSourceDto;
        double etr_avg_long_task_duration = (i3 & 131072) != 0 ? webEventDataDto.surrogate.getEtr_avg_long_task_duration() : d6;
        double fcp_value = (i3 & 262144) != 0 ? webEventDataDto.surrogate.getFcp_value() : d7;
        double cls_value = (i3 & 524288) != 0 ? webEventDataDto.surrogate.getCls_value() : d8;
        double ttfb_value = (i3 & 1048576) != 0 ? webEventDataDto.surrogate.getTtfb_value() : d9;
        NavigationTimingDataDto navigation_timing_data = (i3 & 2097152) != 0 ? webEventDataDto.surrogate.getNavigation_timing_data() : navigationTimingDataDto;
        double inp_value = (i3 & 4194304) != 0 ? webEventDataDto.surrogate.getInp_value() : d10;
        String debug_target = (i3 & 8388608) != 0 ? webEventDataDto.surrogate.getDebug_target() : str11;
        double loading_navigation_value = (i3 & 16777216) != 0 ? webEventDataDto.surrogate.getLoading_navigation_value() : d11;
        double loading_navigation_largest_request_duration = (i3 & 33554432) != 0 ? webEventDataDto.surrogate.getLoading_navigation_largest_request_duration() : d12;
        String loading_navigation_largest_request_url = (i3 & 67108864) != 0 ? webEventDataDto.surrogate.getLoading_navigation_largest_request_url() : str12;
        int loading_navigation_num_requests = (i3 & 134217728) != 0 ? webEventDataDto.surrogate.getLoading_navigation_num_requests() : i;
        double request_duration = (i3 & 268435456) != 0 ? webEventDataDto.surrogate.getRequest_duration() : d13;
        String request_url = (i3 & 536870912) != 0 ? webEventDataDto.surrogate.getRequest_url() : str13;
        int response_status_code = (i3 & 1073741824) != 0 ? webEventDataDto.surrogate.getResponse_status_code() : i2;
        double duration = (i3 & Integer.MIN_VALUE) != 0 ? webEventDataDto.surrogate.getDuration() : d14;
        String masked_url = (i4 & 1) != 0 ? webEventDataDto.surrogate.getMasked_url() : str14;
        String masked_loading_navigation_largest_request_url = (i4 & 2) != 0 ? webEventDataDto.surrogate.getMasked_loading_navigation_largest_request_url() : str15;
        if ((i4 & 4) != 0) {
            str17 = masked_loading_navigation_largest_request_url;
            masked_request_url = webEventDataDto.surrogate.getMasked_request_url();
        } else {
            masked_request_url = str16;
            str17 = masked_loading_navigation_largest_request_url;
        }
        return webEventDataDto.copy(str18, section, component, element, url, additional_info, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, type2, fid_value, etr_duration, etr_source, etr_avg_long_task_duration, fcp_value, cls_value, ttfb_value, navigation_timing_data, inp_value, debug_target, loading_navigation_value, loading_navigation_largest_request_duration, loading_navigation_largest_request_url, loading_navigation_num_requests, request_duration, request_url, response_status_code, duration, masked_url, str17, masked_request_url);
    }

    public final WebEventDataDto copy(String page, String section, String component, String element, String url, WebAdditionalInfoDto additional_info, double clp_value, double lcp_value, double etr_value, String description, String instrument_id, String symbol, String direction, String type2, double fid_value, double etr_duration, ETRSourceDto etr_source, double etr_avg_long_task_duration, double fcp_value, double cls_value, double ttfb_value, NavigationTimingDataDto navigation_timing_data, double inp_value, String debug_target, double loading_navigation_value, double loading_navigation_largest_request_duration, String loading_navigation_largest_request_url, int loading_navigation_num_requests, double request_duration, String request_url, int response_status_code, double duration, String masked_url, String masked_loading_navigation_largest_request_url, String masked_request_url) {
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
        return new WebEventDataDto(new Surrogate(page, section, component, element, url, additional_info, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, type2, fid_value, etr_duration, etr_source, etr_avg_long_task_duration, fcp_value, cls_value, ttfb_value, navigation_timing_data, inp_value, debug_target, loading_navigation_value, loading_navigation_largest_request_duration, loading_navigation_largest_request_url, loading_navigation_num_requests, request_duration, request_url, response_status_code, duration, masked_url, masked_loading_navigation_largest_request_url, masked_request_url));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public WebEventData toProto() {
        String page = this.surrogate.getPage();
        String section = this.surrogate.getSection();
        String component = this.surrogate.getComponent();
        String element = this.surrogate.getElement();
        String url = this.surrogate.getUrl();
        WebAdditionalInfoDto additional_info = this.surrogate.getAdditional_info();
        WebAdditionalInfo proto = additional_info != null ? additional_info.toProto() : null;
        double clp_value = this.surrogate.getClp_value();
        double lcp_value = this.surrogate.getLcp_value();
        double etr_value = this.surrogate.getEtr_value();
        String description = this.surrogate.getDescription();
        String instrument_id = this.surrogate.getInstrument_id();
        String symbol = this.surrogate.getSymbol();
        String direction = this.surrogate.getDirection();
        String type2 = this.surrogate.getType();
        double fid_value = this.surrogate.getFid_value();
        double etr_duration = this.surrogate.getEtr_duration();
        WebEventData.ETRSource eTRSource = (WebEventData.ETRSource) this.surrogate.getEtr_source().toProto();
        double etr_avg_long_task_duration = this.surrogate.getEtr_avg_long_task_duration();
        double fcp_value = this.surrogate.getFcp_value();
        double cls_value = this.surrogate.getCls_value();
        double ttfb_value = this.surrogate.getTtfb_value();
        NavigationTimingDataDto navigation_timing_data = this.surrogate.getNavigation_timing_data();
        return new WebEventData(page, section, component, element, url, proto, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, type2, fid_value, etr_duration, eTRSource, etr_avg_long_task_duration, fcp_value, cls_value, ttfb_value, navigation_timing_data != null ? navigation_timing_data.toProto() : null, this.surrogate.getInp_value(), this.surrogate.getDebug_target(), this.surrogate.getLoading_navigation_value(), this.surrogate.getLoading_navigation_largest_request_duration(), this.surrogate.getLoading_navigation_largest_request_url(), this.surrogate.getLoading_navigation_num_requests(), this.surrogate.getRequest_duration(), this.surrogate.getRequest_url(), this.surrogate.getResponse_status_code(), this.surrogate.getDuration(), this.surrogate.getMasked_url(), this.surrogate.getMasked_loading_navigation_largest_request_url(), this.surrogate.getMasked_request_url(), null, 0, 8, null);
    }

    public String toString() {
        return "[WebEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WebEventDataDto) && Intrinsics.areEqual(((WebEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: WebEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bs\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 µ\u00012\u00020\u0001:\u0004´\u0001µ\u0001BÙ\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0017\b\u0002\u0010\u001a\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u001b\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u001c\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0017\b\u0002\u0010 \u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\"\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010#\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010%\u001a\u00110&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0'\u0012\u0017\b\u0002\u0010(\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010*\u001a\u00110&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0'\u0012\u0017\b\u0002\u0010+\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010,\u001a\u00020\u0003\u0012\b\b\u0002\u0010-\u001a\u00020\u0003\u0012\b\b\u0002\u0010.\u001a\u00020\u0003¢\u0006\u0004\b/\u00100Bá\u0002\b\u0010\u0012\u0006\u00101\u001a\u00020&\u0012\u0006\u00102\u001a\u00020&\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010*\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u000104¢\u0006\u0004\b/\u00105J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0019\u0010\u0089\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0019\u0010\u008a\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0019\u0010\u008b\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0091\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0019\u0010\u0092\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0019HÆ\u0003J\u0019\u0010\u0094\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0019\u0010\u0095\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0019\u0010\u0096\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0019\u0010\u0097\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0019\u0010\u0099\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u009b\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0019\u0010\u009c\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u009e\u0001\u001a\u00110&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0'HÆ\u0003J\u0019\u0010\u009f\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\u0019\u0010¡\u0001\u001a\u00110&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0'HÆ\u0003J\u0019\u0010¢\u0001\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003JÜ\u0004\u0010¦\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0010\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0017\b\u0002\u0010\u0016\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0017\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0017\b\u0002\u0010\u001a\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u001b\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u001c\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u001d\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0017\b\u0002\u0010 \u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010!\u001a\u00020\u00032\u0017\b\u0002\u0010\"\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010#\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010$\u001a\u00020\u00032\u0017\b\u0002\u0010%\u001a\u00110&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0'2\u0017\b\u0002\u0010(\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010)\u001a\u00020\u00032\u0017\b\u0002\u0010*\u001a\u00110&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0'2\u0017\b\u0002\u0010+\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u0003HÆ\u0001J\u0016\u0010§\u0001\u001a\u00030¨\u00012\t\u0010©\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ª\u0001\u001a\u00020&HÖ\u0001J\n\u0010«\u0001\u001a\u00020\u0003HÖ\u0001J-\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0007\u0010®\u0001\u001a\u00020\u00002\b\u0010¯\u0001\u001a\u00030°\u00012\b\u0010±\u0001\u001a\u00030²\u0001H\u0001¢\u0006\u0003\b³\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u00107\u001a\u0004\b=\u00109R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u00107\u001a\u0004\b?\u00109R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u00107\u001a\u0004\bA\u00109R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u00107\u001a\u0004\bC\u0010DR+\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u00107\u001a\u0004\bF\u0010GR+\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u00107\u001a\u0004\bI\u0010GR+\u0010\u0010\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u00107\u001a\u0004\bK\u0010GR\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u00107\u001a\u0004\bM\u00109R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u00107\u001a\u0004\bO\u00109R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u00107\u001a\u0004\bQ\u00109R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u00107\u001a\u0004\bS\u00109R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u00107\u001a\u0004\bU\u00109R+\u0010\u0016\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u00107\u001a\u0004\bW\u0010GR+\u0010\u0017\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u00107\u001a\u0004\bY\u0010GR\u001c\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u00107\u001a\u0004\b[\u0010\\R+\u0010\u001a\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u00107\u001a\u0004\b^\u0010GR+\u0010\u001b\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u00107\u001a\u0004\b`\u0010GR+\u0010\u001c\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\ba\u00107\u001a\u0004\bb\u0010GR+\u0010\u001d\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u00107\u001a\u0004\bd\u0010GR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\be\u00107\u001a\u0004\bf\u0010gR+\u0010 \u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bh\u00107\u001a\u0004\bi\u0010GR\u001c\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bj\u00107\u001a\u0004\bk\u00109R+\u0010\"\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bl\u00107\u001a\u0004\bm\u0010GR+\u0010#\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bn\u00107\u001a\u0004\bo\u0010GR\u001c\u0010$\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bp\u00107\u001a\u0004\bq\u00109R+\u0010%\u001a\u00110&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u00107\u001a\u0004\bs\u0010tR+\u0010(\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u00107\u001a\u0004\bv\u0010GR\u001c\u0010)\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u00107\u001a\u0004\bx\u00109R+\u0010*\u001a\u00110&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\by\u00107\u001a\u0004\bz\u0010tR+\u0010+\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b{\u00107\u001a\u0004\b|\u0010GR\u001c\u0010,\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u00107\u001a\u0004\b~\u00109R\u001d\u0010-\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0000\u0012\u0004\b\u007f\u00107\u001a\u0005\b\u0080\u0001\u00109R\u001e\u0010.\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0081\u0001\u00107\u001a\u0005\b\u0082\u0001\u00109¨\u0006¶\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$Surrogate;", "", "page", "", "section", "component", "element", "url", "additional_info", "Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;", "clp_value", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "lcp_value", "etr_value", "description", "instrument_id", "symbol", "direction", "type", "fid_value", "etr_duration", "etr_source", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "etr_avg_long_task_duration", "fcp_value", "cls_value", "ttfb_value", "navigation_timing_data", "Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;", "inp_value", "debug_target", "loading_navigation_value", "loading_navigation_largest_request_duration", "loading_navigation_largest_request_url", "loading_navigation_num_requests", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "request_duration", "request_url", "response_status_code", "duration", "masked_url", "masked_loading_navigation_largest_request_url", "masked_request_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;DDDDLcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;DLjava/lang/String;DDLjava/lang/String;IDLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;DDDDLcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;DLjava/lang/String;DDLjava/lang/String;IDLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPage$annotations", "()V", "getPage", "()Ljava/lang/String;", "getSection$annotations", "getSection", "getComponent$annotations", "getComponent", "getElement$annotations", "getElement", "getUrl$annotations", "getUrl", "getAdditional_info$annotations", "getAdditional_info", "()Lcom/robinhood/rosetta/eventlogging/WebAdditionalInfoDto;", "getClp_value$annotations", "getClp_value", "()D", "getLcp_value$annotations", "getLcp_value", "getEtr_value$annotations", "getEtr_value", "getDescription$annotations", "getDescription", "getInstrument_id$annotations", "getInstrument_id", "getSymbol$annotations", "getSymbol", "getDirection$annotations", "getDirection", "getType$annotations", "getType", "getFid_value$annotations", "getFid_value", "getEtr_duration$annotations", "getEtr_duration", "getEtr_source$annotations", "getEtr_source", "()Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "getEtr_avg_long_task_duration$annotations", "getEtr_avg_long_task_duration", "getFcp_value$annotations", "getFcp_value", "getCls_value$annotations", "getCls_value", "getTtfb_value$annotations", "getTtfb_value", "getNavigation_timing_data$annotations", "getNavigation_timing_data", "()Lcom/robinhood/rosetta/eventlogging/NavigationTimingDataDto;", "getInp_value$annotations", "getInp_value", "getDebug_target$annotations", "getDebug_target", "getLoading_navigation_value$annotations", "getLoading_navigation_value", "getLoading_navigation_largest_request_duration$annotations", "getLoading_navigation_largest_request_duration", "getLoading_navigation_largest_request_url$annotations", "getLoading_navigation_largest_request_url", "getLoading_navigation_num_requests$annotations", "getLoading_navigation_num_requests", "()I", "getRequest_duration$annotations", "getRequest_duration", "getRequest_url$annotations", "getRequest_url", "getResponse_status_code$annotations", "getResponse_status_code", "getDuration$annotations", "getDuration", "getMasked_url$annotations", "getMasked_url", "getMasked_loading_navigation_largest_request_url$annotations", "getMasked_loading_navigation_largest_request_url", "getMasked_request_url$annotations", "getMasked_request_url", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final WebAdditionalInfoDto additional_info;
        private final double clp_value;
        private final double cls_value;
        private final String component;
        private final String debug_target;
        private final String description;
        private final String direction;
        private final double duration;
        private final String element;
        private final double etr_avg_long_task_duration;
        private final double etr_duration;
        private final ETRSourceDto etr_source;
        private final double etr_value;
        private final double fcp_value;
        private final double fid_value;
        private final double inp_value;
        private final String instrument_id;
        private final double lcp_value;
        private final double loading_navigation_largest_request_duration;
        private final String loading_navigation_largest_request_url;
        private final int loading_navigation_num_requests;
        private final double loading_navigation_value;
        private final String masked_loading_navigation_largest_request_url;
        private final String masked_request_url;
        private final String masked_url;
        private final NavigationTimingDataDto navigation_timing_data;
        private final String page;
        private final double request_duration;
        private final String request_url;
        private final int response_status_code;
        private final String section;
        private final String symbol;
        private final double ttfb_value;
        private final String type;
        private final String url;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (WebAdditionalInfoDto) null, 0.0d, 0.0d, 0.0d, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0d, 0.0d, (ETRSourceDto) null, 0.0d, 0.0d, 0.0d, 0.0d, (NavigationTimingDataDto) null, 0.0d, (String) null, 0.0d, 0.0d, (String) null, 0, 0.0d, (String) null, 0, 0.0d, (String) null, (String) null, (String) null, -1, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, WebAdditionalInfoDto webAdditionalInfoDto, double d, double d2, double d3, String str6, String str7, String str8, String str9, String str10, double d4, double d5, ETRSourceDto eTRSourceDto, double d6, double d7, double d8, double d9, NavigationTimingDataDto navigationTimingDataDto, double d10, String str11, double d11, double d12, String str12, int i, double d13, String str13, int i2, double d14, String str14, String str15, String str16, int i3, int i4, Object obj) {
            String str17;
            String str18;
            String str19 = (i3 & 1) != 0 ? surrogate.page : str;
            String str20 = (i3 & 2) != 0 ? surrogate.section : str2;
            String str21 = (i3 & 4) != 0 ? surrogate.component : str3;
            String str22 = (i3 & 8) != 0 ? surrogate.element : str4;
            String str23 = (i3 & 16) != 0 ? surrogate.url : str5;
            WebAdditionalInfoDto webAdditionalInfoDto2 = (i3 & 32) != 0 ? surrogate.additional_info : webAdditionalInfoDto;
            double d15 = (i3 & 64) != 0 ? surrogate.clp_value : d;
            double d16 = (i3 & 128) != 0 ? surrogate.lcp_value : d2;
            double d17 = (i3 & 256) != 0 ? surrogate.etr_value : d3;
            String str24 = (i3 & 512) != 0 ? surrogate.description : str6;
            String str25 = (i3 & 1024) != 0 ? surrogate.instrument_id : str7;
            String str26 = str19;
            String str27 = (i3 & 2048) != 0 ? surrogate.symbol : str8;
            String str28 = (i3 & 4096) != 0 ? surrogate.direction : str9;
            String str29 = (i3 & 8192) != 0 ? surrogate.type : str10;
            double d18 = (i3 & 16384) != 0 ? surrogate.fid_value : d4;
            double d19 = (i3 & 32768) != 0 ? surrogate.etr_duration : d5;
            ETRSourceDto eTRSourceDto2 = (i3 & 65536) != 0 ? surrogate.etr_source : eTRSourceDto;
            double d20 = (i3 & 131072) != 0 ? surrogate.etr_avg_long_task_duration : d6;
            double d21 = (i3 & 262144) != 0 ? surrogate.fcp_value : d7;
            double d22 = (i3 & 524288) != 0 ? surrogate.cls_value : d8;
            double d23 = (i3 & 1048576) != 0 ? surrogate.ttfb_value : d9;
            NavigationTimingDataDto navigationTimingDataDto2 = (i3 & 2097152) != 0 ? surrogate.navigation_timing_data : navigationTimingDataDto;
            double d24 = (i3 & 4194304) != 0 ? surrogate.inp_value : d10;
            String str30 = (i3 & 8388608) != 0 ? surrogate.debug_target : str11;
            double d25 = (i3 & 16777216) != 0 ? surrogate.loading_navigation_value : d11;
            double d26 = (i3 & 33554432) != 0 ? surrogate.loading_navigation_largest_request_duration : d12;
            String str31 = (i3 & 67108864) != 0 ? surrogate.loading_navigation_largest_request_url : str12;
            int i5 = (i3 & 134217728) != 0 ? surrogate.loading_navigation_num_requests : i;
            double d27 = (i3 & 268435456) != 0 ? surrogate.request_duration : d13;
            String str32 = (i3 & 536870912) != 0 ? surrogate.request_url : str13;
            int i6 = (i3 & 1073741824) != 0 ? surrogate.response_status_code : i2;
            double d28 = (i3 & Integer.MIN_VALUE) != 0 ? surrogate.duration : d14;
            String str33 = (i4 & 1) != 0 ? surrogate.masked_url : str14;
            String str34 = (i4 & 2) != 0 ? surrogate.masked_loading_navigation_largest_request_url : str15;
            if ((i4 & 4) != 0) {
                str18 = str33;
                str17 = surrogate.masked_request_url;
            } else {
                str17 = str16;
                str18 = str33;
            }
            return surrogate.copy(str26, str20, str21, str22, str23, webAdditionalInfoDto2, d15, d16, d17, str24, str25, str27, str28, str29, d18, d19, eTRSourceDto2, d20, d21, d22, d23, navigationTimingDataDto2, d24, str30, d25, d26, str31, i5, d27, str32, i6, d28, str18, str34, str17);
        }

        @SerialName("additionalInfo")
        @JsonAnnotations2(names = {"additional_info"})
        public static /* synthetic */ void getAdditional_info$annotations() {
        }

        @SerialName("clpValue")
        @JsonAnnotations2(names = {"clp_value"})
        public static /* synthetic */ void getClp_value$annotations() {
        }

        @SerialName("clsValue")
        @JsonAnnotations2(names = {"cls_value"})
        public static /* synthetic */ void getCls_value$annotations() {
        }

        @SerialName("component")
        @JsonAnnotations2(names = {"component"})
        public static /* synthetic */ void getComponent$annotations() {
        }

        @SerialName("debugTarget")
        @JsonAnnotations2(names = {"debug_target"})
        public static /* synthetic */ void getDebug_target$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("element")
        @JsonAnnotations2(names = {"element"})
        public static /* synthetic */ void getElement$annotations() {
        }

        @SerialName("etrAvgLongTaskDuration")
        @JsonAnnotations2(names = {"etr_avg_long_task_duration"})
        public static /* synthetic */ void getEtr_avg_long_task_duration$annotations() {
        }

        @SerialName("etrDuration")
        @JsonAnnotations2(names = {"etr_duration"})
        public static /* synthetic */ void getEtr_duration$annotations() {
        }

        @SerialName("etrSource")
        @JsonAnnotations2(names = {"etr_source"})
        public static /* synthetic */ void getEtr_source$annotations() {
        }

        @SerialName("etrValue")
        @JsonAnnotations2(names = {"etr_value"})
        public static /* synthetic */ void getEtr_value$annotations() {
        }

        @SerialName("fcpValue")
        @JsonAnnotations2(names = {"fcp_value"})
        public static /* synthetic */ void getFcp_value$annotations() {
        }

        @SerialName("fidValue")
        @JsonAnnotations2(names = {"fid_value"})
        public static /* synthetic */ void getFid_value$annotations() {
        }

        @SerialName("inpValue")
        @JsonAnnotations2(names = {"inp_value"})
        public static /* synthetic */ void getInp_value$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("lcpValue")
        @JsonAnnotations2(names = {"lcp_value"})
        public static /* synthetic */ void getLcp_value$annotations() {
        }

        @SerialName("loadingNavigationLargestRequestDuration")
        @JsonAnnotations2(names = {"loading_navigation_largest_request_duration"})
        public static /* synthetic */ void getLoading_navigation_largest_request_duration$annotations() {
        }

        @SerialName("loadingNavigationLargestRequestUrl")
        @JsonAnnotations2(names = {"loading_navigation_largest_request_url"})
        public static /* synthetic */ void getLoading_navigation_largest_request_url$annotations() {
        }

        @SerialName("loadingNavigationNumRequests")
        @JsonAnnotations2(names = {"loading_navigation_num_requests"})
        public static /* synthetic */ void getLoading_navigation_num_requests$annotations() {
        }

        @SerialName("loadingNavigationValue")
        @JsonAnnotations2(names = {"loading_navigation_value"})
        public static /* synthetic */ void getLoading_navigation_value$annotations() {
        }

        @SerialName("maskedLoadingNavigationLargestRequestUrl")
        @JsonAnnotations2(names = {"masked_loading_navigation_largest_request_url"})
        public static /* synthetic */ void getMasked_loading_navigation_largest_request_url$annotations() {
        }

        @SerialName("maskedRequestUrl")
        @JsonAnnotations2(names = {"masked_request_url"})
        public static /* synthetic */ void getMasked_request_url$annotations() {
        }

        @SerialName("maskedUrl")
        @JsonAnnotations2(names = {"masked_url"})
        public static /* synthetic */ void getMasked_url$annotations() {
        }

        @SerialName("navigationTimingData")
        @JsonAnnotations2(names = {"navigation_timing_data"})
        public static /* synthetic */ void getNavigation_timing_data$annotations() {
        }

        @SerialName("page")
        @JsonAnnotations2(names = {"page"})
        public static /* synthetic */ void getPage$annotations() {
        }

        @SerialName("requestDuration")
        @JsonAnnotations2(names = {"request_duration"})
        public static /* synthetic */ void getRequest_duration$annotations() {
        }

        @SerialName("requestUrl")
        @JsonAnnotations2(names = {"request_url"})
        public static /* synthetic */ void getRequest_url$annotations() {
        }

        @SerialName("responseStatusCode")
        @JsonAnnotations2(names = {"response_status_code"})
        public static /* synthetic */ void getResponse_status_code$annotations() {
        }

        @SerialName("section")
        @JsonAnnotations2(names = {"section"})
        public static /* synthetic */ void getSection$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("ttfbValue")
        @JsonAnnotations2(names = {"ttfb_value"})
        public static /* synthetic */ void getTtfb_value$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("url")
        @JsonAnnotations2(names = {"url"})
        public static /* synthetic */ void getUrl$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPage() {
            return this.page;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component11, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component12, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component13, reason: from getter */
        public final String getDirection() {
            return this.direction;
        }

        /* renamed from: component14, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component15, reason: from getter */
        public final double getFid_value() {
            return this.fid_value;
        }

        /* renamed from: component16, reason: from getter */
        public final double getEtr_duration() {
            return this.etr_duration;
        }

        /* renamed from: component17, reason: from getter */
        public final ETRSourceDto getEtr_source() {
            return this.etr_source;
        }

        /* renamed from: component18, reason: from getter */
        public final double getEtr_avg_long_task_duration() {
            return this.etr_avg_long_task_duration;
        }

        /* renamed from: component19, reason: from getter */
        public final double getFcp_value() {
            return this.fcp_value;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSection() {
            return this.section;
        }

        /* renamed from: component20, reason: from getter */
        public final double getCls_value() {
            return this.cls_value;
        }

        /* renamed from: component21, reason: from getter */
        public final double getTtfb_value() {
            return this.ttfb_value;
        }

        /* renamed from: component22, reason: from getter */
        public final NavigationTimingDataDto getNavigation_timing_data() {
            return this.navigation_timing_data;
        }

        /* renamed from: component23, reason: from getter */
        public final double getInp_value() {
            return this.inp_value;
        }

        /* renamed from: component24, reason: from getter */
        public final String getDebug_target() {
            return this.debug_target;
        }

        /* renamed from: component25, reason: from getter */
        public final double getLoading_navigation_value() {
            return this.loading_navigation_value;
        }

        /* renamed from: component26, reason: from getter */
        public final double getLoading_navigation_largest_request_duration() {
            return this.loading_navigation_largest_request_duration;
        }

        /* renamed from: component27, reason: from getter */
        public final String getLoading_navigation_largest_request_url() {
            return this.loading_navigation_largest_request_url;
        }

        /* renamed from: component28, reason: from getter */
        public final int getLoading_navigation_num_requests() {
            return this.loading_navigation_num_requests;
        }

        /* renamed from: component29, reason: from getter */
        public final double getRequest_duration() {
            return this.request_duration;
        }

        /* renamed from: component3, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        /* renamed from: component30, reason: from getter */
        public final String getRequest_url() {
            return this.request_url;
        }

        /* renamed from: component31, reason: from getter */
        public final int getResponse_status_code() {
            return this.response_status_code;
        }

        /* renamed from: component32, reason: from getter */
        public final double getDuration() {
            return this.duration;
        }

        /* renamed from: component33, reason: from getter */
        public final String getMasked_url() {
            return this.masked_url;
        }

        /* renamed from: component34, reason: from getter */
        public final String getMasked_loading_navigation_largest_request_url() {
            return this.masked_loading_navigation_largest_request_url;
        }

        /* renamed from: component35, reason: from getter */
        public final String getMasked_request_url() {
            return this.masked_request_url;
        }

        /* renamed from: component4, reason: from getter */
        public final String getElement() {
            return this.element;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component6, reason: from getter */
        public final WebAdditionalInfoDto getAdditional_info() {
            return this.additional_info;
        }

        /* renamed from: component7, reason: from getter */
        public final double getClp_value() {
            return this.clp_value;
        }

        /* renamed from: component8, reason: from getter */
        public final double getLcp_value() {
            return this.lcp_value;
        }

        /* renamed from: component9, reason: from getter */
        public final double getEtr_value() {
            return this.etr_value;
        }

        public final Surrogate copy(String page, String section, String component, String element, String url, WebAdditionalInfoDto additional_info, double clp_value, double lcp_value, double etr_value, String description, String instrument_id, String symbol, String direction, String type2, double fid_value, double etr_duration, ETRSourceDto etr_source, double etr_avg_long_task_duration, double fcp_value, double cls_value, double ttfb_value, NavigationTimingDataDto navigation_timing_data, double inp_value, String debug_target, double loading_navigation_value, double loading_navigation_largest_request_duration, String loading_navigation_largest_request_url, int loading_navigation_num_requests, double request_duration, String request_url, int response_status_code, double duration, String masked_url, String masked_loading_navigation_largest_request_url, String masked_request_url) {
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
            return new Surrogate(page, section, component, element, url, additional_info, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, type2, fid_value, etr_duration, etr_source, etr_avg_long_task_duration, fcp_value, cls_value, ttfb_value, navigation_timing_data, inp_value, debug_target, loading_navigation_value, loading_navigation_largest_request_duration, loading_navigation_largest_request_url, loading_navigation_num_requests, request_duration, request_url, response_status_code, duration, masked_url, masked_loading_navigation_largest_request_url, masked_request_url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.page, surrogate.page) && Intrinsics.areEqual(this.section, surrogate.section) && Intrinsics.areEqual(this.component, surrogate.component) && Intrinsics.areEqual(this.element, surrogate.element) && Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.additional_info, surrogate.additional_info) && Double.compare(this.clp_value, surrogate.clp_value) == 0 && Double.compare(this.lcp_value, surrogate.lcp_value) == 0 && Double.compare(this.etr_value, surrogate.etr_value) == 0 && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.direction, surrogate.direction) && Intrinsics.areEqual(this.type, surrogate.type) && Double.compare(this.fid_value, surrogate.fid_value) == 0 && Double.compare(this.etr_duration, surrogate.etr_duration) == 0 && this.etr_source == surrogate.etr_source && Double.compare(this.etr_avg_long_task_duration, surrogate.etr_avg_long_task_duration) == 0 && Double.compare(this.fcp_value, surrogate.fcp_value) == 0 && Double.compare(this.cls_value, surrogate.cls_value) == 0 && Double.compare(this.ttfb_value, surrogate.ttfb_value) == 0 && Intrinsics.areEqual(this.navigation_timing_data, surrogate.navigation_timing_data) && Double.compare(this.inp_value, surrogate.inp_value) == 0 && Intrinsics.areEqual(this.debug_target, surrogate.debug_target) && Double.compare(this.loading_navigation_value, surrogate.loading_navigation_value) == 0 && Double.compare(this.loading_navigation_largest_request_duration, surrogate.loading_navigation_largest_request_duration) == 0 && Intrinsics.areEqual(this.loading_navigation_largest_request_url, surrogate.loading_navigation_largest_request_url) && this.loading_navigation_num_requests == surrogate.loading_navigation_num_requests && Double.compare(this.request_duration, surrogate.request_duration) == 0 && Intrinsics.areEqual(this.request_url, surrogate.request_url) && this.response_status_code == surrogate.response_status_code && Double.compare(this.duration, surrogate.duration) == 0 && Intrinsics.areEqual(this.masked_url, surrogate.masked_url) && Intrinsics.areEqual(this.masked_loading_navigation_largest_request_url, surrogate.masked_loading_navigation_largest_request_url) && Intrinsics.areEqual(this.masked_request_url, surrogate.masked_request_url);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.page.hashCode() * 31) + this.section.hashCode()) * 31) + this.component.hashCode()) * 31) + this.element.hashCode()) * 31) + this.url.hashCode()) * 31;
            WebAdditionalInfoDto webAdditionalInfoDto = this.additional_info;
            int iHashCode2 = (((((((((((((((((((((((((((((((iHashCode + (webAdditionalInfoDto == null ? 0 : webAdditionalInfoDto.hashCode())) * 31) + Double.hashCode(this.clp_value)) * 31) + Double.hashCode(this.lcp_value)) * 31) + Double.hashCode(this.etr_value)) * 31) + this.description.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.direction.hashCode()) * 31) + this.type.hashCode()) * 31) + Double.hashCode(this.fid_value)) * 31) + Double.hashCode(this.etr_duration)) * 31) + this.etr_source.hashCode()) * 31) + Double.hashCode(this.etr_avg_long_task_duration)) * 31) + Double.hashCode(this.fcp_value)) * 31) + Double.hashCode(this.cls_value)) * 31) + Double.hashCode(this.ttfb_value)) * 31;
            NavigationTimingDataDto navigationTimingDataDto = this.navigation_timing_data;
            return ((((((((((((((((((((((((((iHashCode2 + (navigationTimingDataDto != null ? navigationTimingDataDto.hashCode() : 0)) * 31) + Double.hashCode(this.inp_value)) * 31) + this.debug_target.hashCode()) * 31) + Double.hashCode(this.loading_navigation_value)) * 31) + Double.hashCode(this.loading_navigation_largest_request_duration)) * 31) + this.loading_navigation_largest_request_url.hashCode()) * 31) + Integer.hashCode(this.loading_navigation_num_requests)) * 31) + Double.hashCode(this.request_duration)) * 31) + this.request_url.hashCode()) * 31) + Integer.hashCode(this.response_status_code)) * 31) + Double.hashCode(this.duration)) * 31) + this.masked_url.hashCode()) * 31) + this.masked_loading_navigation_largest_request_url.hashCode()) * 31) + this.masked_request_url.hashCode();
        }

        public String toString() {
            return "Surrogate(page=" + this.page + ", section=" + this.section + ", component=" + this.component + ", element=" + this.element + ", url=" + this.url + ", additional_info=" + this.additional_info + ", clp_value=" + this.clp_value + ", lcp_value=" + this.lcp_value + ", etr_value=" + this.etr_value + ", description=" + this.description + ", instrument_id=" + this.instrument_id + ", symbol=" + this.symbol + ", direction=" + this.direction + ", type=" + this.type + ", fid_value=" + this.fid_value + ", etr_duration=" + this.etr_duration + ", etr_source=" + this.etr_source + ", etr_avg_long_task_duration=" + this.etr_avg_long_task_duration + ", fcp_value=" + this.fcp_value + ", cls_value=" + this.cls_value + ", ttfb_value=" + this.ttfb_value + ", navigation_timing_data=" + this.navigation_timing_data + ", inp_value=" + this.inp_value + ", debug_target=" + this.debug_target + ", loading_navigation_value=" + this.loading_navigation_value + ", loading_navigation_largest_request_duration=" + this.loading_navigation_largest_request_duration + ", loading_navigation_largest_request_url=" + this.loading_navigation_largest_request_url + ", loading_navigation_num_requests=" + this.loading_navigation_num_requests + ", request_duration=" + this.request_duration + ", request_url=" + this.request_url + ", response_status_code=" + this.response_status_code + ", duration=" + this.duration + ", masked_url=" + this.masked_url + ", masked_loading_navigation_largest_request_url=" + this.masked_loading_navigation_largest_request_url + ", masked_request_url=" + this.masked_request_url + ")";
        }

        /* compiled from: WebEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WebEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, String str, String str2, String str3, String str4, String str5, WebAdditionalInfoDto webAdditionalInfoDto, double d, double d2, double d3, String str6, String str7, String str8, String str9, String str10, double d4, double d5, ETRSourceDto eTRSourceDto, double d6, double d7, double d8, double d9, NavigationTimingDataDto navigationTimingDataDto, double d10, String str11, double d11, double d12, String str12, int i3, double d13, String str13, int i4, double d14, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.page = "";
            } else {
                this.page = str;
            }
            if ((i & 2) == 0) {
                this.section = "";
            } else {
                this.section = str2;
            }
            if ((i & 4) == 0) {
                this.component = "";
            } else {
                this.component = str3;
            }
            if ((i & 8) == 0) {
                this.element = "";
            } else {
                this.element = str4;
            }
            if ((i & 16) == 0) {
                this.url = "";
            } else {
                this.url = str5;
            }
            if ((i & 32) == 0) {
                this.additional_info = null;
            } else {
                this.additional_info = webAdditionalInfoDto;
            }
            if ((i & 64) == 0) {
                this.clp_value = 0.0d;
            } else {
                this.clp_value = d;
            }
            if ((i & 128) == 0) {
                this.lcp_value = 0.0d;
            } else {
                this.lcp_value = d2;
            }
            if ((i & 256) == 0) {
                this.etr_value = 0.0d;
            } else {
                this.etr_value = d3;
            }
            if ((i & 512) == 0) {
                this.description = "";
            } else {
                this.description = str6;
            }
            if ((i & 1024) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str7;
            }
            if ((i & 2048) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str8;
            }
            if ((i & 4096) == 0) {
                this.direction = "";
            } else {
                this.direction = str9;
            }
            if ((i & 8192) == 0) {
                this.type = "";
            } else {
                this.type = str10;
            }
            if ((i & 16384) == 0) {
                this.fid_value = 0.0d;
            } else {
                this.fid_value = d4;
            }
            if ((32768 & i) == 0) {
                this.etr_duration = 0.0d;
            } else {
                this.etr_duration = d5;
            }
            this.etr_source = (65536 & i) == 0 ? ETRSourceDto.INSTANCE.getZeroValue() : eTRSourceDto;
            if ((131072 & i) == 0) {
                this.etr_avg_long_task_duration = 0.0d;
            } else {
                this.etr_avg_long_task_duration = d6;
            }
            if ((262144 & i) == 0) {
                this.fcp_value = 0.0d;
            } else {
                this.fcp_value = d7;
            }
            if ((524288 & i) == 0) {
                this.cls_value = 0.0d;
            } else {
                this.cls_value = d8;
            }
            if ((1048576 & i) == 0) {
                this.ttfb_value = 0.0d;
            } else {
                this.ttfb_value = d9;
            }
            if ((2097152 & i) == 0) {
                this.navigation_timing_data = null;
            } else {
                this.navigation_timing_data = navigationTimingDataDto;
            }
            if ((4194304 & i) == 0) {
                this.inp_value = 0.0d;
            } else {
                this.inp_value = d10;
            }
            if ((8388608 & i) == 0) {
                this.debug_target = "";
            } else {
                this.debug_target = str11;
            }
            if ((16777216 & i) == 0) {
                this.loading_navigation_value = 0.0d;
            } else {
                this.loading_navigation_value = d11;
            }
            if ((33554432 & i) == 0) {
                this.loading_navigation_largest_request_duration = 0.0d;
            } else {
                this.loading_navigation_largest_request_duration = d12;
            }
            if ((67108864 & i) == 0) {
                this.loading_navigation_largest_request_url = "";
            } else {
                this.loading_navigation_largest_request_url = str12;
            }
            if ((134217728 & i) == 0) {
                this.loading_navigation_num_requests = 0;
            } else {
                this.loading_navigation_num_requests = i3;
            }
            if ((268435456 & i) == 0) {
                this.request_duration = 0.0d;
            } else {
                this.request_duration = d13;
            }
            if ((536870912 & i) == 0) {
                this.request_url = "";
            } else {
                this.request_url = str13;
            }
            if ((1073741824 & i) == 0) {
                this.response_status_code = 0;
            } else {
                this.response_status_code = i4;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.duration = 0.0d;
            } else {
                this.duration = d14;
            }
            if ((i2 & 1) == 0) {
                this.masked_url = "";
            } else {
                this.masked_url = str14;
            }
            if ((i2 & 2) == 0) {
                this.masked_loading_navigation_largest_request_url = "";
            } else {
                this.masked_loading_navigation_largest_request_url = str15;
            }
            if ((i2 & 4) == 0) {
                this.masked_request_url = "";
            } else {
                this.masked_request_url = str16;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.page, "")) {
                output.encodeStringElement(serialDesc, 0, self.page);
            }
            if (!Intrinsics.areEqual(self.section, "")) {
                output.encodeStringElement(serialDesc, 1, self.section);
            }
            if (!Intrinsics.areEqual(self.component, "")) {
                output.encodeStringElement(serialDesc, 2, self.component);
            }
            if (!Intrinsics.areEqual(self.element, "")) {
                output.encodeStringElement(serialDesc, 3, self.element);
            }
            if (!Intrinsics.areEqual(self.url, "")) {
                output.encodeStringElement(serialDesc, 4, self.url);
            }
            WebAdditionalInfoDto webAdditionalInfoDto = self.additional_info;
            if (webAdditionalInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WebAdditionalInfoDto.Serializer.INSTANCE, webAdditionalInfoDto);
            }
            if (Double.compare(self.clp_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.clp_value));
            }
            if (Double.compare(self.lcp_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.lcp_value));
            }
            if (Double.compare(self.etr_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 8, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.etr_value));
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 9, self.description);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 10, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 11, self.symbol);
            }
            if (!Intrinsics.areEqual(self.direction, "")) {
                output.encodeStringElement(serialDesc, 12, self.direction);
            }
            if (!Intrinsics.areEqual(self.type, "")) {
                output.encodeStringElement(serialDesc, 13, self.type);
            }
            if (Double.compare(self.fid_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 14, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.fid_value));
            }
            if (Double.compare(self.etr_duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 15, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.etr_duration));
            }
            if (self.etr_source != ETRSourceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 16, ETRSourceDto.Serializer.INSTANCE, self.etr_source);
            }
            if (Double.compare(self.etr_avg_long_task_duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 17, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.etr_avg_long_task_duration));
            }
            if (Double.compare(self.fcp_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 18, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.fcp_value));
            }
            if (Double.compare(self.cls_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 19, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.cls_value));
            }
            if (Double.compare(self.ttfb_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 20, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.ttfb_value));
            }
            NavigationTimingDataDto navigationTimingDataDto = self.navigation_timing_data;
            if (navigationTimingDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, NavigationTimingDataDto.Serializer.INSTANCE, navigationTimingDataDto);
            }
            if (Double.compare(self.inp_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 22, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.inp_value));
            }
            if (!Intrinsics.areEqual(self.debug_target, "")) {
                output.encodeStringElement(serialDesc, 23, self.debug_target);
            }
            if (Double.compare(self.loading_navigation_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 24, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.loading_navigation_value));
            }
            if (Double.compare(self.loading_navigation_largest_request_duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 25, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.loading_navigation_largest_request_duration));
            }
            if (!Intrinsics.areEqual(self.loading_navigation_largest_request_url, "")) {
                output.encodeStringElement(serialDesc, 26, self.loading_navigation_largest_request_url);
            }
            int i = self.loading_navigation_num_requests;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 27, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Double.compare(self.request_duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 28, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.request_duration));
            }
            if (!Intrinsics.areEqual(self.request_url, "")) {
                output.encodeStringElement(serialDesc, 29, self.request_url);
            }
            int i2 = self.response_status_code;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 30, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (Double.compare(self.duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 31, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.duration));
            }
            if (!Intrinsics.areEqual(self.masked_url, "")) {
                output.encodeStringElement(serialDesc, 32, self.masked_url);
            }
            if (!Intrinsics.areEqual(self.masked_loading_navigation_largest_request_url, "")) {
                output.encodeStringElement(serialDesc, 33, self.masked_loading_navigation_largest_request_url);
            }
            if (Intrinsics.areEqual(self.masked_request_url, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 34, self.masked_request_url);
        }

        public Surrogate(String page, String section, String component, String element, String url, WebAdditionalInfoDto webAdditionalInfoDto, double d, double d2, double d3, String description, String instrument_id, String symbol, String direction, String type2, double d4, double d5, ETRSourceDto etr_source, double d6, double d7, double d8, double d9, NavigationTimingDataDto navigationTimingDataDto, double d10, String debug_target, double d11, double d12, String loading_navigation_largest_request_url, int i, double d13, String request_url, int i2, double d14, String masked_url, String masked_loading_navigation_largest_request_url, String masked_request_url) {
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
            this.page = page;
            this.section = section;
            this.component = component;
            this.element = element;
            this.url = url;
            this.additional_info = webAdditionalInfoDto;
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
            this.navigation_timing_data = navigationTimingDataDto;
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

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, WebAdditionalInfoDto webAdditionalInfoDto, double d, double d2, double d3, String str6, String str7, String str8, String str9, String str10, double d4, double d5, ETRSourceDto eTRSourceDto, double d6, double d7, double d8, double d9, NavigationTimingDataDto navigationTimingDataDto, double d10, String str11, double d11, double d12, String str12, int i, double d13, String str13, int i2, double d14, String str14, String str15, String str16, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : webAdditionalInfoDto, (i3 & 64) != 0 ? 0.0d : d, (i3 & 128) != 0 ? 0.0d : d2, (i3 & 256) != 0 ? 0.0d : d3, (i3 & 512) != 0 ? "" : str6, (i3 & 1024) != 0 ? "" : str7, (i3 & 2048) != 0 ? "" : str8, (i3 & 4096) != 0 ? "" : str9, (i3 & 8192) != 0 ? "" : str10, (i3 & 16384) != 0 ? 0.0d : d4, (32768 & i3) != 0 ? 0.0d : d5, (65536 & i3) != 0 ? ETRSourceDto.INSTANCE.getZeroValue() : eTRSourceDto, (i3 & 131072) != 0 ? 0.0d : d6, (i3 & 262144) != 0 ? 0.0d : d7, (i3 & 524288) != 0 ? 0.0d : d8, (i3 & 1048576) != 0 ? 0.0d : d9, (i3 & 2097152) != 0 ? null : navigationTimingDataDto, (i3 & 4194304) != 0 ? 0.0d : d10, (i3 & 8388608) != 0 ? "" : str11, (i3 & 16777216) != 0 ? 0.0d : d11, (i3 & 33554432) != 0 ? 0.0d : d12, (i3 & 67108864) != 0 ? "" : str12, (i3 & 134217728) != 0 ? 0 : i, (i3 & 268435456) != 0 ? 0.0d : d13, (i3 & 536870912) != 0 ? "" : str13, (i3 & 1073741824) == 0 ? i2 : 0, (i3 & Integer.MIN_VALUE) != 0 ? 0.0d : d14, (i4 & 1) != 0 ? "" : str14, (i4 & 2) != 0 ? "" : str15, (i4 & 4) != 0 ? "" : str16);
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

        public final WebAdditionalInfoDto getAdditional_info() {
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

        public final ETRSourceDto getEtr_source() {
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

        public final NavigationTimingDataDto getNavigation_timing_data() {
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
    }

    /* compiled from: WebEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/WebEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<WebEventDataDto, WebEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WebEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WebEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WebEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) WebEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WebEventData> getProtoAdapter() {
            return WebEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WebEventDataDto getZeroValue() {
            return WebEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WebEventDataDto fromProto(WebEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String page = proto.getPage();
            String section = proto.getSection();
            String component = proto.getComponent();
            String element = proto.getElement();
            String url = proto.getUrl();
            WebAdditionalInfo additional_info = proto.getAdditional_info();
            WebAdditionalInfoDto webAdditionalInfoDtoFromProto = additional_info != null ? WebAdditionalInfoDto.INSTANCE.fromProto(additional_info) : null;
            double clp_value = proto.getClp_value();
            double lcp_value = proto.getLcp_value();
            double etr_value = proto.getEtr_value();
            String description = proto.getDescription();
            String instrument_id = proto.getInstrument_id();
            String symbol = proto.getSymbol();
            String direction = proto.getDirection();
            String type2 = proto.getType();
            double fid_value = proto.getFid_value();
            double etr_duration = proto.getEtr_duration();
            WebAdditionalInfoDto webAdditionalInfoDto = webAdditionalInfoDtoFromProto;
            ETRSourceDto eTRSourceDtoFromProto = ETRSourceDto.INSTANCE.fromProto(proto.getEtr_source());
            double etr_avg_long_task_duration = proto.getEtr_avg_long_task_duration();
            double fcp_value = proto.getFcp_value();
            double cls_value = proto.getCls_value();
            double ttfb_value = proto.getTtfb_value();
            NavigationTimingData navigation_timing_data = proto.getNavigation_timing_data();
            return new WebEventDataDto(new Surrogate(page, section, component, element, url, webAdditionalInfoDto, clp_value, lcp_value, etr_value, description, instrument_id, symbol, direction, type2, fid_value, etr_duration, eTRSourceDtoFromProto, etr_avg_long_task_duration, fcp_value, cls_value, ttfb_value, navigation_timing_data != null ? NavigationTimingDataDto.INSTANCE.fromProto(navigation_timing_data) : null, proto.getInp_value(), proto.getDebug_target(), proto.getLoading_navigation_value(), proto.getLoading_navigation_largest_request_duration(), proto.getLoading_navigation_largest_request_url(), proto.getLoading_navigation_num_requests(), proto.getRequest_duration(), proto.getRequest_url(), proto.getResponse_status_code(), proto.getDuration(), proto.getMasked_url(), proto.getMasked_loading_navigation_largest_request_url(), proto.getMasked_request_url()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WebEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WebEventDataDto(null, null, null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, null, null, null, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0.0d, null, 0, 0.0d, null, null, null, -1, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_UNSPECIFIED", "SOURCE_INITIAL_LOAD", "SOURCE_ROUTE_CHANGE", "SOURCE_SELECT_OPTION_CONTRACT", "SOURCE_OPTION_ORDER_SUBMISSION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ETRSourceDto implements Dto2<WebEventData.ETRSource>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ETRSourceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ETRSourceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ETRSourceDto, WebEventData.ETRSource>> binaryBase64Serializer$delegate;
        public static final ETRSourceDto SOURCE_UNSPECIFIED = new SOURCE_UNSPECIFIED("SOURCE_UNSPECIFIED", 0);
        public static final ETRSourceDto SOURCE_INITIAL_LOAD = new SOURCE_INITIAL_LOAD("SOURCE_INITIAL_LOAD", 1);
        public static final ETRSourceDto SOURCE_ROUTE_CHANGE = new SOURCE_ROUTE_CHANGE("SOURCE_ROUTE_CHANGE", 2);
        public static final ETRSourceDto SOURCE_SELECT_OPTION_CONTRACT = new SOURCE_SELECT_OPTION_CONTRACT("SOURCE_SELECT_OPTION_CONTRACT", 3);
        public static final ETRSourceDto SOURCE_OPTION_ORDER_SUBMISSION = new SOURCE_OPTION_ORDER_SUBMISSION("SOURCE_OPTION_ORDER_SUBMISSION", 4);

        private static final /* synthetic */ ETRSourceDto[] $values() {
            return new ETRSourceDto[]{SOURCE_UNSPECIFIED, SOURCE_INITIAL_LOAD, SOURCE_ROUTE_CHANGE, SOURCE_SELECT_OPTION_CONTRACT, SOURCE_OPTION_ORDER_SUBMISSION};
        }

        public /* synthetic */ ETRSourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ETRSourceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: WebEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebEventDataDto.ETRSourceDto.SOURCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_UNSPECIFIED extends ETRSourceDto {
            SOURCE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebEventData.ETRSource toProto() {
                return WebEventData.ETRSource.SOURCE_UNSPECIFIED;
            }
        }

        private ETRSourceDto(String str, int i) {
        }

        static {
            ETRSourceDto[] eTRSourceDtoArr$values = $values();
            $VALUES = eTRSourceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eTRSourceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WebEventDataDto$ETRSourceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WebEventDataDto.ETRSourceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: WebEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebEventDataDto.ETRSourceDto.SOURCE_INITIAL_LOAD", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_INITIAL_LOAD extends ETRSourceDto {
            SOURCE_INITIAL_LOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebEventData.ETRSource toProto() {
                return WebEventData.ETRSource.SOURCE_INITIAL_LOAD;
            }
        }

        /* compiled from: WebEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebEventDataDto.ETRSourceDto.SOURCE_ROUTE_CHANGE", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_ROUTE_CHANGE extends ETRSourceDto {
            SOURCE_ROUTE_CHANGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebEventData.ETRSource toProto() {
                return WebEventData.ETRSource.SOURCE_ROUTE_CHANGE;
            }
        }

        /* compiled from: WebEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebEventDataDto.ETRSourceDto.SOURCE_SELECT_OPTION_CONTRACT", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_SELECT_OPTION_CONTRACT extends ETRSourceDto {
            SOURCE_SELECT_OPTION_CONTRACT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebEventData.ETRSource toProto() {
                return WebEventData.ETRSource.SOURCE_SELECT_OPTION_CONTRACT;
            }
        }

        /* compiled from: WebEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WebEventDataDto.ETRSourceDto.SOURCE_OPTION_ORDER_SUBMISSION", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SOURCE_OPTION_ORDER_SUBMISSION extends ETRSourceDto {
            SOURCE_OPTION_ORDER_SUBMISSION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WebEventData.ETRSource toProto() {
                return WebEventData.ETRSource.SOURCE_OPTION_ORDER_SUBMISSION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: WebEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "Lcom/robinhood/rosetta/eventlogging/WebEventData$ETRSource;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ETRSourceDto, WebEventData.ETRSource> {

            /* compiled from: WebEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[WebEventData.ETRSource.values().length];
                    try {
                        iArr[WebEventData.ETRSource.SOURCE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WebEventData.ETRSource.SOURCE_INITIAL_LOAD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WebEventData.ETRSource.SOURCE_ROUTE_CHANGE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[WebEventData.ETRSource.SOURCE_SELECT_OPTION_CONTRACT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[WebEventData.ETRSource.SOURCE_OPTION_ORDER_SUBMISSION.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ETRSourceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ETRSourceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ETRSourceDto> getBinaryBase64Serializer() {
                return (KSerializer) ETRSourceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WebEventData.ETRSource> getProtoAdapter() {
                return WebEventData.ETRSource.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ETRSourceDto getZeroValue() {
                return ETRSourceDto.SOURCE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ETRSourceDto fromProto(WebEventData.ETRSource proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ETRSourceDto.SOURCE_UNSPECIFIED;
                }
                if (i == 2) {
                    return ETRSourceDto.SOURCE_INITIAL_LOAD;
                }
                if (i == 3) {
                    return ETRSourceDto.SOURCE_ROUTE_CHANGE;
                }
                if (i == 4) {
                    return ETRSourceDto.SOURCE_SELECT_OPTION_CONTRACT;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return ETRSourceDto.SOURCE_OPTION_ORDER_SUBMISSION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: WebEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$ETRSourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ETRSourceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ETRSourceDto, WebEventData.ETRSource> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.WebEventData.ETRSource", ETRSourceDto.getEntries(), ETRSourceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ETRSourceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ETRSourceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ETRSourceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ETRSourceDto valueOf(String str) {
            return (ETRSourceDto) Enum.valueOf(ETRSourceDto.class, str);
        }

        public static ETRSourceDto[] values() {
            return (ETRSourceDto[]) $VALUES.clone();
        }
    }

    /* compiled from: WebEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<WebEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.WebEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WebEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WebEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WebEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WebEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WebEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.WebEventDataDto";
        }
    }
}
