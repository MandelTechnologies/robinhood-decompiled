package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.ColorDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ComboSelectedLegDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventContractDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.EventContractTradabilityDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ImageStyleDto;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: EventContractDto.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b(\b\u0007\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004a`bcB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¹\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010'\u001a\u00020#\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\b\b\u0002\u0010+\u001a\u00020#¢\u0006\u0004\b\u0006\u0010,J½\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020#2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010+\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020#2\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u0014H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0014H\u0016¢\u0006\u0004\b?\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bA\u00102R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u00102R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bC\u00102R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bD\u00102R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bG\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bH\u00102R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bI\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bN\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bO\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bP\u00102R\u0011\u0010\u0019\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bQ\u00102R\u0019\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0019\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8F¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0011\u0010\u001e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bU\u00102R\u0011\u0010 \u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010!\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bX\u00102R\u0013\u0010\"\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bY\u00102R\u0011\u0010$\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010%\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\\\u00102R\u0011\u0010&\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b]\u00102R\u0011\u0010'\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b'\u0010[R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010+\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b+\u0010[¨\u0006d"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "Landroid/os/Parcelable;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate;)V", "", "id", "event_id", "description", "symbol", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "tradability", "display_short_name", "display_long_name", "image_url", "Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", ResourceTypes.COLOR, "", "exchange_source", "banner_text", "order_form_background_image_url", "order_receipt_background_image_url", "name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", GovernmentIdNfcScan.expirationDateName, "open_date", "multiplier", "Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "image_style", "receipt_shortname", "tertiary_text", "", "disable_header_image_flip", "parent_event_id", "floor_strike_value", "is_team_contract", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboSelectedLegDto;", "selected_legs", "is_combo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto;", "toProto", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate;", "getId", "getEvent_id", "getDescription", "getSymbol", "getTradability", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "getDisplay_short_name", "getDisplay_long_name", "getImage_url", "getColor", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "getExchange_source", "()Ljava/lang/Integer;", "getBanner_text", "getOrder_form_background_image_url", "getOrder_receipt_background_image_url", "getName", "getExpiration_date", "()Lj$/time/Instant;", "getOpen_date", "getMultiplier", "getImage_style", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "getReceipt_shortname", "getTertiary_text", "getDisable_header_image_flip", "()Z", "getParent_event_id", "getFloor_strike_value", "getSelected_legs", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class EventContractDto implements Dto3<EventContract>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventContractDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventContractDto, EventContract>> binaryBase64Serializer$delegate;
    private static final EventContractDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventContractDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventContractDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getEvent_id() {
        return this.surrogate.getEvent_id();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final EventContractTradabilityDto getTradability() {
        return this.surrogate.getTradability();
    }

    public final String getDisplay_short_name() {
        return this.surrogate.getDisplay_short_name();
    }

    public final String getDisplay_long_name() {
        return this.surrogate.getDisplay_long_name();
    }

    public final String getImage_url() {
        return this.surrogate.getImage_url();
    }

    public final ColorDto getColor() {
        return this.surrogate.getColor();
    }

    public final Integer getExchange_source() {
        return this.surrogate.getExchange_source();
    }

    public final String getBanner_text() {
        return this.surrogate.getBanner_text();
    }

    public final String getOrder_form_background_image_url() {
        return this.surrogate.getOrder_form_background_image_url();
    }

    public final String getOrder_receipt_background_image_url() {
        return this.surrogate.getOrder_receipt_background_image_url();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final Instant getExpiration_date() {
        return this.surrogate.getExpiration_date();
    }

    public final Instant getOpen_date() {
        return this.surrogate.getOpen_date();
    }

    public final String getMultiplier() {
        return this.surrogate.getMultiplier();
    }

    public final ImageStyleDto getImage_style() {
        return this.surrogate.getImage_style();
    }

    public final String getReceipt_shortname() {
        return this.surrogate.getReceipt_shortname();
    }

    public final String getTertiary_text() {
        return this.surrogate.getTertiary_text();
    }

    public final boolean getDisable_header_image_flip() {
        return this.surrogate.getDisable_header_image_flip();
    }

    public final String getParent_event_id() {
        return this.surrogate.getParent_event_id();
    }

    public final String getFloor_strike_value() {
        return this.surrogate.getFloor_strike_value();
    }

    public final boolean is_team_contract() {
        return this.surrogate.is_team_contract();
    }

    public final List<ComboSelectedLegDto> getSelected_legs() {
        return this.surrogate.getSelected_legs();
    }

    public final boolean is_combo() {
        return this.surrogate.is_combo();
    }

    public /* synthetic */ EventContractDto(String str, String str2, String str3, String str4, EventContractTradabilityDto eventContractTradabilityDto, String str5, String str6, String str7, ColorDto colorDto, Integer num, String str8, String str9, String str10, String str11, Instant instant, Instant instant2, String str12, ImageStyleDto imageStyleDto, String str13, String str14, boolean z, String str15, String str16, boolean z2, List list, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? EventContractTradabilityDto.INSTANCE.getZeroValue() : eventContractTradabilityDto, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : colorDto, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? null : instant, (i & 32768) != 0 ? null : instant2, (i & 65536) != 0 ? "" : str12, (i & 131072) != 0 ? ImageStyleDto.INSTANCE.getZeroValue() : imageStyleDto, (i & 262144) != 0 ? null : str13, (i & 524288) != 0 ? null : str14, (i & 1048576) != 0 ? false : z, (i & 2097152) != 0 ? null : str15, (i & 4194304) == 0 ? str16 : "", (i & 8388608) != 0 ? false : z2, (i & 16777216) != 0 ? CollectionsKt.emptyList() : list, (i & 33554432) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventContractDto(String id, String event_id, String description, String symbol, EventContractTradabilityDto tradability, String str, String str2, String str3, ColorDto colorDto, Integer num, String str4, String str5, String str6, String name, Instant instant, Instant instant2, String multiplier, ImageStyleDto image_style, String str7, String str8, boolean z, String str9, String floor_strike_value, boolean z2, List<ComboSelectedLegDto> selected_legs, boolean z3) {
        this(new Surrogate(id, event_id, description, symbol, tradability, str, str2, str3, colorDto, num, str4, str5, str6, name, instant, instant2, multiplier, image_style, str7, str8, z, str9, floor_strike_value, z2, selected_legs, z3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(image_style, "image_style");
        Intrinsics.checkNotNullParameter(floor_strike_value, "floor_strike_value");
        Intrinsics.checkNotNullParameter(selected_legs, "selected_legs");
    }

    public static /* synthetic */ EventContractDto copy$default(EventContractDto eventContractDto, String str, String str2, String str3, String str4, EventContractTradabilityDto eventContractTradabilityDto, String str5, String str6, String str7, ColorDto colorDto, Integer num, String str8, String str9, String str10, String str11, Instant instant, Instant instant2, String str12, ImageStyleDto imageStyleDto, String str13, String str14, boolean z, String str15, String str16, boolean z2, List list, boolean z3, int i, Object obj) {
        boolean zIs_combo;
        List list2;
        String id = (i & 1) != 0 ? eventContractDto.surrogate.getId() : str;
        String event_id = (i & 2) != 0 ? eventContractDto.surrogate.getEvent_id() : str2;
        String description = (i & 4) != 0 ? eventContractDto.surrogate.getDescription() : str3;
        String symbol = (i & 8) != 0 ? eventContractDto.surrogate.getSymbol() : str4;
        EventContractTradabilityDto tradability = (i & 16) != 0 ? eventContractDto.surrogate.getTradability() : eventContractTradabilityDto;
        String display_short_name = (i & 32) != 0 ? eventContractDto.surrogate.getDisplay_short_name() : str5;
        String display_long_name = (i & 64) != 0 ? eventContractDto.surrogate.getDisplay_long_name() : str6;
        String image_url = (i & 128) != 0 ? eventContractDto.surrogate.getImage_url() : str7;
        ColorDto color = (i & 256) != 0 ? eventContractDto.surrogate.getColor() : colorDto;
        Integer exchange_source = (i & 512) != 0 ? eventContractDto.surrogate.getExchange_source() : num;
        String banner_text = (i & 1024) != 0 ? eventContractDto.surrogate.getBanner_text() : str8;
        String order_form_background_image_url = (i & 2048) != 0 ? eventContractDto.surrogate.getOrder_form_background_image_url() : str9;
        String order_receipt_background_image_url = (i & 4096) != 0 ? eventContractDto.surrogate.getOrder_receipt_background_image_url() : str10;
        String name = (i & 8192) != 0 ? eventContractDto.surrogate.getName() : str11;
        String str17 = id;
        Instant expiration_date = (i & 16384) != 0 ? eventContractDto.surrogate.getExpiration_date() : instant;
        Instant open_date = (i & 32768) != 0 ? eventContractDto.surrogate.getOpen_date() : instant2;
        String multiplier = (i & 65536) != 0 ? eventContractDto.surrogate.getMultiplier() : str12;
        ImageStyleDto image_style = (i & 131072) != 0 ? eventContractDto.surrogate.getImage_style() : imageStyleDto;
        String receipt_shortname = (i & 262144) != 0 ? eventContractDto.surrogate.getReceipt_shortname() : str13;
        String tertiary_text = (i & 524288) != 0 ? eventContractDto.surrogate.getTertiary_text() : str14;
        boolean disable_header_image_flip = (i & 1048576) != 0 ? eventContractDto.surrogate.getDisable_header_image_flip() : z;
        String parent_event_id = (i & 2097152) != 0 ? eventContractDto.surrogate.getParent_event_id() : str15;
        String floor_strike_value = (i & 4194304) != 0 ? eventContractDto.surrogate.getFloor_strike_value() : str16;
        boolean zIs_team_contract = (i & 8388608) != 0 ? eventContractDto.surrogate.is_team_contract() : z2;
        List selected_legs = (i & 16777216) != 0 ? eventContractDto.surrogate.getSelected_legs() : list;
        if ((i & 33554432) != 0) {
            list2 = selected_legs;
            zIs_combo = eventContractDto.surrogate.is_combo();
        } else {
            zIs_combo = z3;
            list2 = selected_legs;
        }
        return eventContractDto.copy(str17, event_id, description, symbol, tradability, display_short_name, display_long_name, image_url, color, exchange_source, banner_text, order_form_background_image_url, order_receipt_background_image_url, name, expiration_date, open_date, multiplier, image_style, receipt_shortname, tertiary_text, disable_header_image_flip, parent_event_id, floor_strike_value, zIs_team_contract, list2, zIs_combo);
    }

    public final EventContractDto copy(String id, String event_id, String description, String symbol, EventContractTradabilityDto tradability, String display_short_name, String display_long_name, String image_url, ColorDto color, Integer exchange_source, String banner_text, String order_form_background_image_url, String order_receipt_background_image_url, String name, Instant expiration_date, Instant open_date, String multiplier, ImageStyleDto image_style, String receipt_shortname, String tertiary_text, boolean disable_header_image_flip, String parent_event_id, String floor_strike_value, boolean is_team_contract, List<ComboSelectedLegDto> selected_legs, boolean is_combo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(image_style, "image_style");
        Intrinsics.checkNotNullParameter(floor_strike_value, "floor_strike_value");
        Intrinsics.checkNotNullParameter(selected_legs, "selected_legs");
        return new EventContractDto(new Surrogate(id, event_id, description, symbol, tradability, display_short_name, display_long_name, image_url, color, exchange_source, banner_text, order_form_background_image_url, order_receipt_background_image_url, name, expiration_date, open_date, multiplier, image_style, receipt_shortname, tertiary_text, disable_header_image_flip, parent_event_id, floor_strike_value, is_team_contract, selected_legs, is_combo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EventContract toProto() {
        String id = this.surrogate.getId();
        String event_id = this.surrogate.getEvent_id();
        String description = this.surrogate.getDescription();
        String symbol = this.surrogate.getSymbol();
        EventContractTradability eventContractTradability = (EventContractTradability) this.surrogate.getTradability().toProto();
        String display_short_name = this.surrogate.getDisplay_short_name();
        String display_long_name = this.surrogate.getDisplay_long_name();
        String image_url = this.surrogate.getImage_url();
        ColorDto color = this.surrogate.getColor();
        Color proto = color != null ? color.toProto() : null;
        Integer exchange_source = this.surrogate.getExchange_source();
        String banner_text = this.surrogate.getBanner_text();
        String order_form_background_image_url = this.surrogate.getOrder_form_background_image_url();
        String order_receipt_background_image_url = this.surrogate.getOrder_receipt_background_image_url();
        String name = this.surrogate.getName();
        Instant expiration_date = this.surrogate.getExpiration_date();
        Instant open_date = this.surrogate.getOpen_date();
        String multiplier = this.surrogate.getMultiplier();
        ImageStyle imageStyle = (ImageStyle) this.surrogate.getImage_style().toProto();
        String receipt_shortname = this.surrogate.getReceipt_shortname();
        String tertiary_text = this.surrogate.getTertiary_text();
        boolean disable_header_image_flip = this.surrogate.getDisable_header_image_flip();
        String parent_event_id = this.surrogate.getParent_event_id();
        String floor_strike_value = this.surrogate.getFloor_strike_value();
        boolean zIs_team_contract = this.surrogate.is_team_contract();
        List<ComboSelectedLegDto> selected_legs = this.surrogate.getSelected_legs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_legs, 10));
        Iterator<T> it = selected_legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComboSelectedLegDto) it.next()).toProto());
        }
        return new EventContract(id, event_id, description, symbol, eventContractTradability, display_short_name, display_long_name, image_url, proto, exchange_source, banner_text, order_form_background_image_url, order_receipt_background_image_url, name, expiration_date, open_date, multiplier, imageStyle, receipt_shortname, tertiary_text, disable_header_image_flip, parent_event_id, floor_strike_value, zIs_team_contract, arrayList, this.surrogate.is_combo(), null, 67108864, null);
    }

    public String toString() {
        return "[EventContractDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventContractDto) && Intrinsics.areEqual(((EventContractDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventContractDto.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bk\b\u0083\b\u0018\u0000 \u009e\u00012\u00020\u0001:\u0004\u009f\u0001\u009e\u0001B\u0082\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019\u0012.\b\u0002\u0010\u001b\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020!\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\b\b\u0002\u0010)\u001a\u00020!¢\u0006\u0004\b*\u0010+B\u009f\u0002\b\u0010\u0012\u0006\u0010,\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010%\u001a\u00020!\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&\u0012\u0006\u0010)\u001a\u00020!\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010:J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010:J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010:J\u0010\u0010>\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010:J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010:J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010:J\u0012\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bG\u0010:J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010:J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bI\u0010:J\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010:J6\u0010K\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019HÆ\u0003¢\u0006\u0004\bK\u0010LJ6\u0010M\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019HÆ\u0003¢\u0006\u0004\bM\u0010LJ\u0010\u0010N\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bN\u0010:J\u0010\u0010O\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010:J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010:J\u0010\u0010S\u001a\u00020!HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u0010:J\u0010\u0010V\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bV\u0010:J\u0010\u0010W\u001a\u00020!HÆ\u0003¢\u0006\u0004\bW\u0010TJ\u0016\u0010X\u001a\b\u0012\u0004\u0012\u00020'0&HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020!HÆ\u0003¢\u0006\u0004\bZ\u0010TJ\u008b\u0003\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00192.\b\u0002\u0010\u001b\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020!2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010)\u001a\u00020!HÆ\u0001¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b]\u0010:J\u0010\u0010^\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b^\u0010_J\u001a\u0010a\u001a\u00020!2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\ba\u0010bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010c\u0012\u0004\be\u0010f\u001a\u0004\bd\u0010:R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010c\u0012\u0004\bh\u0010f\u001a\u0004\bg\u0010:R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010c\u0012\u0004\bj\u0010f\u001a\u0004\bi\u0010:R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010c\u0012\u0004\bl\u0010f\u001a\u0004\bk\u0010:R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010m\u0012\u0004\bo\u0010f\u001a\u0004\bn\u0010?R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010c\u0012\u0004\bq\u0010f\u001a\u0004\bp\u0010:R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010c\u0012\u0004\bs\u0010f\u001a\u0004\br\u0010:R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010c\u0012\u0004\bu\u0010f\u001a\u0004\bt\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010v\u0012\u0004\bx\u0010f\u001a\u0004\bw\u0010DR1\u0010\u0012\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010y\u0012\u0004\b{\u0010f\u001a\u0004\bz\u0010FR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010c\u0012\u0004\b}\u0010f\u001a\u0004\b|\u0010:R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010c\u0012\u0004\b\u007f\u0010f\u001a\u0004\b~\u0010:R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0015\u0010c\u0012\u0005\b\u0081\u0001\u0010f\u001a\u0005\b\u0080\u0001\u0010:R\"\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u0016\u0010c\u0012\u0005\b\u0083\u0001\u0010f\u001a\u0005\b\u0082\u0001\u0010:RI\u0010\u001a\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001a\u0010\u0084\u0001\u0012\u0005\b\u0086\u0001\u0010f\u001a\u0005\b\u0085\u0001\u0010LRI\u0010\u001b\u001a(\u0018\u00010\u0017j\u0013\u0018\u0001`\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00198\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001b\u0010\u0084\u0001\u0012\u0005\b\u0088\u0001\u0010f\u001a\u0005\b\u0087\u0001\u0010LR\"\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001c\u0010c\u0012\u0005\b\u008a\u0001\u0010f\u001a\u0005\b\u0089\u0001\u0010:R#\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001e\u0010\u008b\u0001\u0012\u0005\b\u008d\u0001\u0010f\u001a\u0005\b\u008c\u0001\u0010PR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001f\u0010c\u0012\u0005\b\u008f\u0001\u0010f\u001a\u0005\b\u008e\u0001\u0010:R$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b \u0010c\u0012\u0005\b\u0091\u0001\u0010f\u001a\u0005\b\u0090\u0001\u0010:R#\u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\"\u0010\u0092\u0001\u0012\u0005\b\u0094\u0001\u0010f\u001a\u0005\b\u0093\u0001\u0010TR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b#\u0010c\u0012\u0005\b\u0096\u0001\u0010f\u001a\u0005\b\u0095\u0001\u0010:R\"\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010c\u0012\u0005\b\u0098\u0001\u0010f\u001a\u0005\b\u0097\u0001\u0010:R\"\u0010%\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b%\u0010\u0092\u0001\u0012\u0005\b\u0099\u0001\u0010f\u001a\u0004\b%\u0010TR)\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b(\u0010\u009a\u0001\u0012\u0005\b\u009c\u0001\u0010f\u001a\u0005\b\u009b\u0001\u0010YR\"\u0010)\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b)\u0010\u0092\u0001\u0012\u0005\b\u009d\u0001\u0010f\u001a\u0004\b)\u0010T¨\u0006 \u0001"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate;", "", "", "id", "event_id", "description", "symbol", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "tradability", "display_short_name", "display_long_name", "image_url", "Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", ResourceTypes.COLOR, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "exchange_source", "banner_text", "order_form_background_image_url", "order_receipt_background_image_url", "name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", GovernmentIdNfcScan.expirationDateName, "open_date", "multiplier", "Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "image_style", "receipt_shortname", "tertiary_text", "", "disable_header_image_flip", "parent_event_id", "floor_strike_value", "is_team_contract", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboSelectedLegDto;", "selected_legs", "is_combo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$prediction_markets_v1_externalRelease", "(Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "component6", "component7", "component8", "component9", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "component14", "component15", "()Lj$/time/Instant;", "component16", "component17", "component18", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "component19", "component20", "component21", "()Z", "component22", "component23", "component24", "component25", "()Ljava/util/List;", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getEvent_id", "getEvent_id$annotations", "getDescription", "getDescription$annotations", "getSymbol", "getSymbol$annotations", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradabilityDto;", "getTradability", "getTradability$annotations", "getDisplay_short_name", "getDisplay_short_name$annotations", "getDisplay_long_name", "getDisplay_long_name$annotations", "getImage_url", "getImage_url$annotations", "Lcom/robinhood/prediction_markets/proto/v1/idl/ColorDto;", "getColor", "getColor$annotations", "Ljava/lang/Integer;", "getExchange_source", "getExchange_source$annotations", "getBanner_text", "getBanner_text$annotations", "getOrder_form_background_image_url", "getOrder_form_background_image_url$annotations", "getOrder_receipt_background_image_url", "getOrder_receipt_background_image_url$annotations", "getName", "getName$annotations", "Lj$/time/Instant;", "getExpiration_date", "getExpiration_date$annotations", "getOpen_date", "getOpen_date$annotations", "getMultiplier", "getMultiplier$annotations", "Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyleDto;", "getImage_style", "getImage_style$annotations", "getReceipt_shortname", "getReceipt_shortname$annotations", "getTertiary_text", "getTertiary_text$annotations", "Z", "getDisable_header_image_flip", "getDisable_header_image_flip$annotations", "getParent_event_id", "getParent_event_id$annotations", "getFloor_strike_value", "getFloor_strike_value$annotations", "is_team_contract$annotations", "Ljava/util/List;", "getSelected_legs", "getSelected_legs$annotations", "is_combo$annotations", "Companion", "$serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String banner_text;
        private final ColorDto color;
        private final String description;
        private final boolean disable_header_image_flip;
        private final String display_long_name;
        private final String display_short_name;
        private final String event_id;
        private final Integer exchange_source;
        private final Instant expiration_date;
        private final String floor_strike_value;
        private final String id;
        private final ImageStyleDto image_style;
        private final String image_url;
        private final boolean is_combo;
        private final boolean is_team_contract;
        private final String multiplier;
        private final String name;
        private final Instant open_date;
        private final String order_form_background_image_url;
        private final String order_receipt_background_image_url;
        private final String parent_event_id;
        private final String receipt_shortname;
        private final List<ComboSelectedLegDto> selected_legs;
        private final String symbol;
        private final String tertiary_text;
        private final EventContractTradabilityDto tradability;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventContractDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventContractDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (EventContractTradabilityDto) null, (String) null, (String) null, (String) null, (ColorDto) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Instant) null, (Instant) null, (String) null, (ImageStyleDto) null, (String) null, (String) null, false, (String) null, (String) null, false, (List) null, false, 67108863, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ComboSelectedLegDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, EventContractTradabilityDto eventContractTradabilityDto, String str5, String str6, String str7, ColorDto colorDto, Integer num, String str8, String str9, String str10, String str11, Instant instant, Instant instant2, String str12, ImageStyleDto imageStyleDto, String str13, String str14, boolean z, String str15, String str16, boolean z2, List list, boolean z3, int i, Object obj) {
            boolean z4;
            List list2;
            String str17 = (i & 1) != 0 ? surrogate.id : str;
            String str18 = (i & 2) != 0 ? surrogate.event_id : str2;
            String str19 = (i & 4) != 0 ? surrogate.description : str3;
            String str20 = (i & 8) != 0 ? surrogate.symbol : str4;
            EventContractTradabilityDto eventContractTradabilityDto2 = (i & 16) != 0 ? surrogate.tradability : eventContractTradabilityDto;
            String str21 = (i & 32) != 0 ? surrogate.display_short_name : str5;
            String str22 = (i & 64) != 0 ? surrogate.display_long_name : str6;
            String str23 = (i & 128) != 0 ? surrogate.image_url : str7;
            ColorDto colorDto2 = (i & 256) != 0 ? surrogate.color : colorDto;
            Integer num2 = (i & 512) != 0 ? surrogate.exchange_source : num;
            String str24 = (i & 1024) != 0 ? surrogate.banner_text : str8;
            String str25 = (i & 2048) != 0 ? surrogate.order_form_background_image_url : str9;
            String str26 = (i & 4096) != 0 ? surrogate.order_receipt_background_image_url : str10;
            String str27 = (i & 8192) != 0 ? surrogate.name : str11;
            String str28 = str17;
            Instant instant3 = (i & 16384) != 0 ? surrogate.expiration_date : instant;
            Instant instant4 = (i & 32768) != 0 ? surrogate.open_date : instant2;
            String str29 = (i & 65536) != 0 ? surrogate.multiplier : str12;
            ImageStyleDto imageStyleDto2 = (i & 131072) != 0 ? surrogate.image_style : imageStyleDto;
            String str30 = (i & 262144) != 0 ? surrogate.receipt_shortname : str13;
            String str31 = (i & 524288) != 0 ? surrogate.tertiary_text : str14;
            boolean z5 = (i & 1048576) != 0 ? surrogate.disable_header_image_flip : z;
            String str32 = (i & 2097152) != 0 ? surrogate.parent_event_id : str15;
            String str33 = (i & 4194304) != 0 ? surrogate.floor_strike_value : str16;
            boolean z6 = (i & 8388608) != 0 ? surrogate.is_team_contract : z2;
            List list3 = (i & 16777216) != 0 ? surrogate.selected_legs : list;
            if ((i & 33554432) != 0) {
                list2 = list3;
                z4 = surrogate.is_combo;
            } else {
                z4 = z3;
                list2 = list3;
            }
            return surrogate.copy(str28, str18, str19, str20, eventContractTradabilityDto2, str21, str22, str23, colorDto2, num2, str24, str25, str26, str27, instant3, instant4, str29, imageStyleDto2, str30, str31, z5, str32, str33, z6, list2, z4);
        }

        @SerialName("bannerText")
        @JsonAnnotations2(names = {"banner_text"})
        public static /* synthetic */ void getBanner_text$annotations() {
        }

        @SerialName(ResourceTypes.COLOR)
        @JsonAnnotations2(names = {ResourceTypes.COLOR})
        public static /* synthetic */ void getColor$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("disableHeaderImageFlip")
        @JsonAnnotations2(names = {"disable_header_image_flip"})
        public static /* synthetic */ void getDisable_header_image_flip$annotations() {
        }

        @SerialName("displayLongName")
        @JsonAnnotations2(names = {"display_long_name"})
        public static /* synthetic */ void getDisplay_long_name$annotations() {
        }

        @SerialName("displayShortName")
        @JsonAnnotations2(names = {"display_short_name"})
        public static /* synthetic */ void getDisplay_short_name$annotations() {
        }

        @SerialName("eventId")
        @JsonAnnotations2(names = {"event_id"})
        public static /* synthetic */ void getEvent_id$annotations() {
        }

        @SerialName("exchangeSource")
        @JsonAnnotations2(names = {"exchange_source"})
        public static /* synthetic */ void getExchange_source$annotations() {
        }

        @SerialName("expirationDate")
        @JsonAnnotations2(names = {GovernmentIdNfcScan.expirationDateName})
        public static /* synthetic */ void getExpiration_date$annotations() {
        }

        @SerialName("floorStrikeValue")
        @JsonAnnotations2(names = {"floor_strike_value"})
        public static /* synthetic */ void getFloor_strike_value$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("imageStyle")
        @JsonAnnotations2(names = {"image_style"})
        public static /* synthetic */ void getImage_style$annotations() {
        }

        @SerialName(MarkdownText4.TagImageUrl)
        @JsonAnnotations2(names = {"image_url"})
        public static /* synthetic */ void getImage_url$annotations() {
        }

        @SerialName("multiplier")
        @JsonAnnotations2(names = {"multiplier"})
        public static /* synthetic */ void getMultiplier$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("openDate")
        @JsonAnnotations2(names = {"open_date"})
        public static /* synthetic */ void getOpen_date$annotations() {
        }

        @SerialName("orderFormBackgroundImageUrl")
        @JsonAnnotations2(names = {"order_form_background_image_url"})
        public static /* synthetic */ void getOrder_form_background_image_url$annotations() {
        }

        @SerialName("orderReceiptBackgroundImageUrl")
        @JsonAnnotations2(names = {"order_receipt_background_image_url"})
        public static /* synthetic */ void getOrder_receipt_background_image_url$annotations() {
        }

        @SerialName("parentEventId")
        @JsonAnnotations2(names = {"parent_event_id"})
        public static /* synthetic */ void getParent_event_id$annotations() {
        }

        @SerialName("receiptShortname")
        @JsonAnnotations2(names = {"receipt_shortname"})
        public static /* synthetic */ void getReceipt_shortname$annotations() {
        }

        @SerialName("selectedLegs")
        @JsonAnnotations2(names = {"selected_legs"})
        public static /* synthetic */ void getSelected_legs$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tertiaryText")
        @JsonAnnotations2(names = {"tertiary_text"})
        public static /* synthetic */ void getTertiary_text$annotations() {
        }

        @SerialName("tradability")
        @JsonAnnotations2(names = {"tradability"})
        public static /* synthetic */ void getTradability$annotations() {
        }

        @SerialName("isCombo")
        @JsonAnnotations2(names = {"is_combo"})
        public static /* synthetic */ void is_combo$annotations() {
        }

        @SerialName("isTeamContract")
        @JsonAnnotations2(names = {"is_team_contract"})
        public static /* synthetic */ void is_team_contract$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Integer getExchange_source() {
            return this.exchange_source;
        }

        /* renamed from: component11, reason: from getter */
        public final String getBanner_text() {
            return this.banner_text;
        }

        /* renamed from: component12, reason: from getter */
        public final String getOrder_form_background_image_url() {
            return this.order_form_background_image_url;
        }

        /* renamed from: component13, reason: from getter */
        public final String getOrder_receipt_background_image_url() {
            return this.order_receipt_background_image_url;
        }

        /* renamed from: component14, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component15, reason: from getter */
        public final Instant getExpiration_date() {
            return this.expiration_date;
        }

        /* renamed from: component16, reason: from getter */
        public final Instant getOpen_date() {
            return this.open_date;
        }

        /* renamed from: component17, reason: from getter */
        public final String getMultiplier() {
            return this.multiplier;
        }

        /* renamed from: component18, reason: from getter */
        public final ImageStyleDto getImage_style() {
            return this.image_style;
        }

        /* renamed from: component19, reason: from getter */
        public final String getReceipt_shortname() {
            return this.receipt_shortname;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent_id() {
            return this.event_id;
        }

        /* renamed from: component20, reason: from getter */
        public final String getTertiary_text() {
            return this.tertiary_text;
        }

        /* renamed from: component21, reason: from getter */
        public final boolean getDisable_header_image_flip() {
            return this.disable_header_image_flip;
        }

        /* renamed from: component22, reason: from getter */
        public final String getParent_event_id() {
            return this.parent_event_id;
        }

        /* renamed from: component23, reason: from getter */
        public final String getFloor_strike_value() {
            return this.floor_strike_value;
        }

        /* renamed from: component24, reason: from getter */
        public final boolean getIs_team_contract() {
            return this.is_team_contract;
        }

        public final List<ComboSelectedLegDto> component25() {
            return this.selected_legs;
        }

        /* renamed from: component26, reason: from getter */
        public final boolean getIs_combo() {
            return this.is_combo;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component5, reason: from getter */
        public final EventContractTradabilityDto getTradability() {
            return this.tradability;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDisplay_short_name() {
            return this.display_short_name;
        }

        /* renamed from: component7, reason: from getter */
        public final String getDisplay_long_name() {
            return this.display_long_name;
        }

        /* renamed from: component8, reason: from getter */
        public final String getImage_url() {
            return this.image_url;
        }

        /* renamed from: component9, reason: from getter */
        public final ColorDto getColor() {
            return this.color;
        }

        public final Surrogate copy(String id, String event_id, String description, String symbol, EventContractTradabilityDto tradability, String display_short_name, String display_long_name, String image_url, ColorDto color, Integer exchange_source, String banner_text, String order_form_background_image_url, String order_receipt_background_image_url, String name, Instant expiration_date, Instant open_date, String multiplier, ImageStyleDto image_style, String receipt_shortname, String tertiary_text, boolean disable_header_image_flip, String parent_event_id, String floor_strike_value, boolean is_team_contract, List<ComboSelectedLegDto> selected_legs, boolean is_combo) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(event_id, "event_id");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(multiplier, "multiplier");
            Intrinsics.checkNotNullParameter(image_style, "image_style");
            Intrinsics.checkNotNullParameter(floor_strike_value, "floor_strike_value");
            Intrinsics.checkNotNullParameter(selected_legs, "selected_legs");
            return new Surrogate(id, event_id, description, symbol, tradability, display_short_name, display_long_name, image_url, color, exchange_source, banner_text, order_form_background_image_url, order_receipt_background_image_url, name, expiration_date, open_date, multiplier, image_style, receipt_shortname, tertiary_text, disable_header_image_flip, parent_event_id, floor_strike_value, is_team_contract, selected_legs, is_combo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.event_id, surrogate.event_id) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.tradability == surrogate.tradability && Intrinsics.areEqual(this.display_short_name, surrogate.display_short_name) && Intrinsics.areEqual(this.display_long_name, surrogate.display_long_name) && Intrinsics.areEqual(this.image_url, surrogate.image_url) && Intrinsics.areEqual(this.color, surrogate.color) && Intrinsics.areEqual(this.exchange_source, surrogate.exchange_source) && Intrinsics.areEqual(this.banner_text, surrogate.banner_text) && Intrinsics.areEqual(this.order_form_background_image_url, surrogate.order_form_background_image_url) && Intrinsics.areEqual(this.order_receipt_background_image_url, surrogate.order_receipt_background_image_url) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.expiration_date, surrogate.expiration_date) && Intrinsics.areEqual(this.open_date, surrogate.open_date) && Intrinsics.areEqual(this.multiplier, surrogate.multiplier) && this.image_style == surrogate.image_style && Intrinsics.areEqual(this.receipt_shortname, surrogate.receipt_shortname) && Intrinsics.areEqual(this.tertiary_text, surrogate.tertiary_text) && this.disable_header_image_flip == surrogate.disable_header_image_flip && Intrinsics.areEqual(this.parent_event_id, surrogate.parent_event_id) && Intrinsics.areEqual(this.floor_strike_value, surrogate.floor_strike_value) && this.is_team_contract == surrogate.is_team_contract && Intrinsics.areEqual(this.selected_legs, surrogate.selected_legs) && this.is_combo == surrogate.is_combo;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.event_id.hashCode()) * 31) + this.description.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.tradability.hashCode()) * 31;
            String str = this.display_short_name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.display_long_name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.image_url;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ColorDto colorDto = this.color;
            int iHashCode5 = (iHashCode4 + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
            Integer num = this.exchange_source;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.banner_text;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.order_form_background_image_url;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.order_receipt_background_image_url;
            int iHashCode9 = (((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.name.hashCode()) * 31;
            Instant instant = this.expiration_date;
            int iHashCode10 = (iHashCode9 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.open_date;
            int iHashCode11 = (((((iHashCode10 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.multiplier.hashCode()) * 31) + this.image_style.hashCode()) * 31;
            String str7 = this.receipt_shortname;
            int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.tertiary_text;
            int iHashCode13 = (((iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31) + Boolean.hashCode(this.disable_header_image_flip)) * 31;
            String str9 = this.parent_event_id;
            return ((((((((iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.floor_strike_value.hashCode()) * 31) + Boolean.hashCode(this.is_team_contract)) * 31) + this.selected_legs.hashCode()) * 31) + Boolean.hashCode(this.is_combo);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", event_id=" + this.event_id + ", description=" + this.description + ", symbol=" + this.symbol + ", tradability=" + this.tradability + ", display_short_name=" + this.display_short_name + ", display_long_name=" + this.display_long_name + ", image_url=" + this.image_url + ", color=" + this.color + ", exchange_source=" + this.exchange_source + ", banner_text=" + this.banner_text + ", order_form_background_image_url=" + this.order_form_background_image_url + ", order_receipt_background_image_url=" + this.order_receipt_background_image_url + ", name=" + this.name + ", expiration_date=" + this.expiration_date + ", open_date=" + this.open_date + ", multiplier=" + this.multiplier + ", image_style=" + this.image_style + ", receipt_shortname=" + this.receipt_shortname + ", tertiary_text=" + this.tertiary_text + ", disable_header_image_flip=" + this.disable_header_image_flip + ", parent_event_id=" + this.parent_event_id + ", floor_strike_value=" + this.floor_strike_value + ", is_team_contract=" + this.is_team_contract + ", selected_legs=" + this.selected_legs + ", is_combo=" + this.is_combo + ")";
        }

        /* compiled from: EventContractDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventContractDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, EventContractTradabilityDto eventContractTradabilityDto, String str5, String str6, String str7, ColorDto colorDto, Integer num, String str8, String str9, String str10, String str11, Instant instant, Instant instant2, String str12, ImageStyleDto imageStyleDto, String str13, String str14, boolean z, String str15, String str16, boolean z2, List list, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.event_id = "";
            } else {
                this.event_id = str2;
            }
            if ((i & 4) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
            if ((i & 8) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str4;
            }
            if ((i & 16) == 0) {
                this.tradability = EventContractTradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.tradability = eventContractTradabilityDto;
            }
            if ((i & 32) == 0) {
                this.display_short_name = null;
            } else {
                this.display_short_name = str5;
            }
            if ((i & 64) == 0) {
                this.display_long_name = null;
            } else {
                this.display_long_name = str6;
            }
            if ((i & 128) == 0) {
                this.image_url = null;
            } else {
                this.image_url = str7;
            }
            if ((i & 256) == 0) {
                this.color = null;
            } else {
                this.color = colorDto;
            }
            if ((i & 512) == 0) {
                this.exchange_source = null;
            } else {
                this.exchange_source = num;
            }
            if ((i & 1024) == 0) {
                this.banner_text = null;
            } else {
                this.banner_text = str8;
            }
            if ((i & 2048) == 0) {
                this.order_form_background_image_url = null;
            } else {
                this.order_form_background_image_url = str9;
            }
            if ((i & 4096) == 0) {
                this.order_receipt_background_image_url = null;
            } else {
                this.order_receipt_background_image_url = str10;
            }
            if ((i & 8192) == 0) {
                this.name = "";
            } else {
                this.name = str11;
            }
            if ((i & 16384) == 0) {
                this.expiration_date = null;
            } else {
                this.expiration_date = instant;
            }
            if ((32768 & i) == 0) {
                this.open_date = null;
            } else {
                this.open_date = instant2;
            }
            if ((65536 & i) == 0) {
                this.multiplier = "";
            } else {
                this.multiplier = str12;
            }
            this.image_style = (131072 & i) == 0 ? ImageStyleDto.INSTANCE.getZeroValue() : imageStyleDto;
            if ((262144 & i) == 0) {
                this.receipt_shortname = null;
            } else {
                this.receipt_shortname = str13;
            }
            if ((524288 & i) == 0) {
                this.tertiary_text = null;
            } else {
                this.tertiary_text = str14;
            }
            if ((1048576 & i) == 0) {
                this.disable_header_image_flip = false;
            } else {
                this.disable_header_image_flip = z;
            }
            if ((2097152 & i) == 0) {
                this.parent_event_id = null;
            } else {
                this.parent_event_id = str15;
            }
            if ((4194304 & i) == 0) {
                this.floor_strike_value = "";
            } else {
                this.floor_strike_value = str16;
            }
            if ((8388608 & i) == 0) {
                this.is_team_contract = false;
            } else {
                this.is_team_contract = z2;
            }
            this.selected_legs = (16777216 & i) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 33554432) == 0) {
                this.is_combo = false;
            } else {
                this.is_combo = z3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.event_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.event_id);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 2, self.description);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 3, self.symbol);
            }
            if (self.tradability != EventContractTradabilityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, EventContractTradabilityDto.Serializer.INSTANCE, self.tradability);
            }
            String str = self.display_short_name;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            String str2 = self.display_long_name;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.image_url;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str3);
            }
            ColorDto colorDto = self.color;
            if (colorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ColorDto.Serializer.INSTANCE, colorDto);
            }
            Integer num = self.exchange_source;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            String str4 = self.banner_text;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.order_form_background_image_url;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.order_receipt_background_image_url;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str6);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 13, self.name);
            }
            Instant instant = self.expiration_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.open_date;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.multiplier, "")) {
                output.encodeStringElement(serialDesc, 16, self.multiplier);
            }
            if (self.image_style != ImageStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 17, ImageStyleDto.Serializer.INSTANCE, self.image_style);
            }
            String str7 = self.receipt_shortname;
            if (str7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, str7);
            }
            String str8 = self.tertiary_text;
            if (str8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, StringSerializer.INSTANCE, str8);
            }
            boolean z = self.disable_header_image_flip;
            if (z) {
                output.encodeBooleanElement(serialDesc, 20, z);
            }
            String str9 = self.parent_event_id;
            if (str9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, str9);
            }
            if (!Intrinsics.areEqual(self.floor_strike_value, "")) {
                output.encodeStringElement(serialDesc, 22, self.floor_strike_value);
            }
            boolean z2 = self.is_team_contract;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 23, z2);
            }
            if (!Intrinsics.areEqual(self.selected_legs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 24, lazyArr[24].getValue(), self.selected_legs);
            }
            boolean z3 = self.is_combo;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 25, z3);
            }
        }

        public Surrogate(String id, String event_id, String description, String symbol, EventContractTradabilityDto tradability, String str, String str2, String str3, ColorDto colorDto, Integer num, String str4, String str5, String str6, String name, Instant instant, Instant instant2, String multiplier, ImageStyleDto image_style, String str7, String str8, boolean z, String str9, String floor_strike_value, boolean z2, List<ComboSelectedLegDto> selected_legs, boolean z3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(event_id, "event_id");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(multiplier, "multiplier");
            Intrinsics.checkNotNullParameter(image_style, "image_style");
            Intrinsics.checkNotNullParameter(floor_strike_value, "floor_strike_value");
            Intrinsics.checkNotNullParameter(selected_legs, "selected_legs");
            this.id = id;
            this.event_id = event_id;
            this.description = description;
            this.symbol = symbol;
            this.tradability = tradability;
            this.display_short_name = str;
            this.display_long_name = str2;
            this.image_url = str3;
            this.color = colorDto;
            this.exchange_source = num;
            this.banner_text = str4;
            this.order_form_background_image_url = str5;
            this.order_receipt_background_image_url = str6;
            this.name = name;
            this.expiration_date = instant;
            this.open_date = instant2;
            this.multiplier = multiplier;
            this.image_style = image_style;
            this.receipt_shortname = str7;
            this.tertiary_text = str8;
            this.disable_header_image_flip = z;
            this.parent_event_id = str9;
            this.floor_strike_value = floor_strike_value;
            this.is_team_contract = z2;
            this.selected_legs = selected_legs;
            this.is_combo = z3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, EventContractTradabilityDto eventContractTradabilityDto, String str5, String str6, String str7, ColorDto colorDto, Integer num, String str8, String str9, String str10, String str11, Instant instant, Instant instant2, String str12, ImageStyleDto imageStyleDto, String str13, String str14, boolean z, String str15, String str16, boolean z2, List list, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? EventContractTradabilityDto.INSTANCE.getZeroValue() : eventContractTradabilityDto, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : colorDto, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? null : instant, (i & 32768) != 0 ? null : instant2, (i & 65536) != 0 ? "" : str12, (i & 131072) != 0 ? ImageStyleDto.INSTANCE.getZeroValue() : imageStyleDto, (i & 262144) != 0 ? null : str13, (i & 524288) != 0 ? null : str14, (i & 1048576) != 0 ? false : z, (i & 2097152) != 0 ? null : str15, (i & 4194304) == 0 ? str16 : "", (i & 8388608) != 0 ? false : z2, (i & 16777216) != 0 ? CollectionsKt.emptyList() : list, (i & 33554432) != 0 ? false : z3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getEvent_id() {
            return this.event_id;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final EventContractTradabilityDto getTradability() {
            return this.tradability;
        }

        public final String getDisplay_short_name() {
            return this.display_short_name;
        }

        public final String getDisplay_long_name() {
            return this.display_long_name;
        }

        public final String getImage_url() {
            return this.image_url;
        }

        public final ColorDto getColor() {
            return this.color;
        }

        public final Integer getExchange_source() {
            return this.exchange_source;
        }

        public final String getBanner_text() {
            return this.banner_text;
        }

        public final String getOrder_form_background_image_url() {
            return this.order_form_background_image_url;
        }

        public final String getOrder_receipt_background_image_url() {
            return this.order_receipt_background_image_url;
        }

        public final String getName() {
            return this.name;
        }

        public final Instant getExpiration_date() {
            return this.expiration_date;
        }

        public final Instant getOpen_date() {
            return this.open_date;
        }

        public final String getMultiplier() {
            return this.multiplier;
        }

        public final ImageStyleDto getImage_style() {
            return this.image_style;
        }

        public final String getReceipt_shortname() {
            return this.receipt_shortname;
        }

        public final String getTertiary_text() {
            return this.tertiary_text;
        }

        public final boolean getDisable_header_image_flip() {
            return this.disable_header_image_flip;
        }

        public final String getParent_event_id() {
            return this.parent_event_id;
        }

        public final String getFloor_strike_value() {
            return this.floor_strike_value;
        }

        public final boolean is_team_contract() {
            return this.is_team_contract;
        }

        public final List<ComboSelectedLegDto> getSelected_legs() {
            return this.selected_legs;
        }

        public final boolean is_combo() {
            return this.is_combo;
        }
    }

    /* compiled from: EventContractDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EventContractDto, EventContract> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventContractDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventContractDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventContractDto> getBinaryBase64Serializer() {
            return (KSerializer) EventContractDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventContract> getProtoAdapter() {
            return EventContract.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventContractDto getZeroValue() {
            return EventContractDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventContractDto fromProto(EventContract proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String event_id = proto.getEvent_id();
            String description = proto.getDescription();
            String symbol = proto.getSymbol();
            EventContractTradabilityDto eventContractTradabilityDtoFromProto = EventContractTradabilityDto.INSTANCE.fromProto(proto.getTradability());
            String display_short_name = proto.getDisplay_short_name();
            String display_long_name = proto.getDisplay_long_name();
            String image_url = proto.getImage_url();
            Color color = proto.getColor();
            ColorDto colorDtoFromProto = color != null ? ColorDto.INSTANCE.fromProto(color) : null;
            Integer exchange_source = proto.getExchange_source();
            String banner_text = proto.getBanner_text();
            String order_form_background_image_url = proto.getOrder_form_background_image_url();
            String order_receipt_background_image_url = proto.getOrder_receipt_background_image_url();
            String name = proto.getName();
            Instant expiration_date = proto.getExpiration_date();
            Instant open_date = proto.getOpen_date();
            String multiplier = proto.getMultiplier();
            ColorDto colorDto = colorDtoFromProto;
            ImageStyleDto imageStyleDtoFromProto = ImageStyleDto.INSTANCE.fromProto(proto.getImage_style());
            String receipt_shortname = proto.getReceipt_shortname();
            String tertiary_text = proto.getTertiary_text();
            boolean disable_header_image_flip = proto.getDisable_header_image_flip();
            String parent_event_id = proto.getParent_event_id();
            String floor_strike_value = proto.getFloor_strike_value();
            boolean is_team_contract = proto.getIs_team_contract();
            List<ComboSelectedLeg> selected_legs = proto.getSelected_legs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_legs, 10));
            for (Iterator it = selected_legs.iterator(); it.hasNext(); it = it) {
                arrayList.add(ComboSelectedLegDto.INSTANCE.fromProto((ComboSelectedLeg) it.next()));
            }
            return new EventContractDto(new Surrogate(id, event_id, description, symbol, eventContractTradabilityDtoFromProto, display_short_name, display_long_name, image_url, colorDto, exchange_source, banner_text, order_form_background_image_url, order_receipt_background_image_url, name, expiration_date, open_date, multiplier, imageStyleDtoFromProto, receipt_shortname, tertiary_text, disable_header_image_flip, parent_event_id, floor_strike_value, is_team_contract, arrayList, proto.getIs_combo()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventContractDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventContractDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new EventContractDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 67108863, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventContractDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventContractDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.EventContract", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventContractDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventContractDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventContractDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventContractDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.EventContractDto";
        }
    }
}
