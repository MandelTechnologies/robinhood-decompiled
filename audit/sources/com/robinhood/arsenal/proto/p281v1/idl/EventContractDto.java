package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.arsenal.proto.p281v1.idl.ColorDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventContractStateDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventContractTradabilityDto;
import com.robinhood.arsenal.proto.p281v1.idl.PayoutDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: EventContractDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b&\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\\[]^B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B³\u0002\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\u0010\b\u0002\u0010#\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010$\u001a\u00020\u0018\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010(J·\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010\"\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\u0010\b\u0002\u0010#\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u00105J\u001f\u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0018H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0018H\u0016¢\u0006\u0004\b<\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010.R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b?\u0010.R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b@\u0010.R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u0010.R\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0019\u0010\u0011\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0019\u0010\u0012\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0019\u0010\u0017\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bK\u0010DR\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bL\u00105R\u0011\u0010\u001a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bM\u0010.R\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bN\u0010.R\u0011\u0010\u001c\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bO\u0010.R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010\u001f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bR\u0010.R\u0013\u0010!\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0019\u0010\"\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bU\u0010DR\u0019\u0010#\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\bV\u0010DR\u0011\u0010$\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bW\u00105R\u0013\u0010%\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bX\u0010.R\u0013\u0010&\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bY\u0010.R\u0013\u0010'\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bZ\u0010.¨\u0006_"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "Landroid/os/Parcelable;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate;)V", "", "id", "event_id", "name", "description", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_trade_date", GovernmentIdNfcScan.expirationDateName, "customer_last_close_date", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "state", "open_date", "", "min_contract_quantity", "display_short_name", "display_long_name", "image_url", "Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;", ResourceTypes.COLOR, "multiplier", "Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;", "payout", "settlement_time", "resolution_time", "exchange_source", "name_prefix", "banner_text", "order_receipt_background_image_url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;Lj$/time/Instant;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;Lj$/time/Instant;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "toProto", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate;", "getId", "getEvent_id", "getName", "getDescription", "getSymbol", "getLast_trade_date", "()Lj$/time/Instant;", "getExpiration_date", "getCustomer_last_close_date", "getTradability", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "getOpen_date", "getMin_contract_quantity", "getDisplay_short_name", "getDisplay_long_name", "getImage_url", "getColor", "()Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;", "getMultiplier", "getPayout", "()Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;", "getSettlement_time", "getResolution_time", "getExchange_source", "getName_prefix", "getBanner_text", "getOrder_receipt_background_image_url", "Companion", "Surrogate", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
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

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final Instant getLast_trade_date() {
        return this.surrogate.getLast_trade_date();
    }

    public final Instant getExpiration_date() {
        return this.surrogate.getExpiration_date();
    }

    public final Instant getCustomer_last_close_date() {
        return this.surrogate.getCustomer_last_close_date();
    }

    public final EventContractTradabilityDto getTradability() {
        return this.surrogate.getTradability();
    }

    public final EventContractStateDto getState() {
        return this.surrogate.getState();
    }

    public final Instant getOpen_date() {
        return this.surrogate.getOpen_date();
    }

    public final int getMin_contract_quantity() {
        return this.surrogate.getMin_contract_quantity();
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

    public final String getMultiplier() {
        return this.surrogate.getMultiplier();
    }

    public final PayoutDto getPayout() {
        return this.surrogate.getPayout();
    }

    public final Instant getSettlement_time() {
        return this.surrogate.getSettlement_time();
    }

    public final Instant getResolution_time() {
        return this.surrogate.getResolution_time();
    }

    public final int getExchange_source() {
        return this.surrogate.getExchange_source();
    }

    public final String getName_prefix() {
        return this.surrogate.getName_prefix();
    }

    public final String getBanner_text() {
        return this.surrogate.getBanner_text();
    }

    public final String getOrder_receipt_background_image_url() {
        return this.surrogate.getOrder_receipt_background_image_url();
    }

    public /* synthetic */ EventContractDto(String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, Instant instant3, EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Instant instant4, int i, String str6, String str7, String str8, ColorDto colorDto, String str9, PayoutDto payoutDto, Instant instant5, Instant instant6, int i2, String str10, String str11, String str12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : instant, (i3 & 64) != 0 ? null : instant2, (i3 & 128) != 0 ? null : instant3, (i3 & 256) != 0 ? EventContractTradabilityDto.INSTANCE.getZeroValue() : eventContractTradabilityDto, (i3 & 512) != 0 ? EventContractStateDto.INSTANCE.getZeroValue() : eventContractStateDto, (i3 & 1024) != 0 ? null : instant4, (i3 & 2048) != 0 ? 0 : i, (i3 & 4096) != 0 ? "" : str6, (i3 & 8192) != 0 ? "" : str7, (i3 & 16384) != 0 ? "" : str8, (i3 & 32768) != 0 ? null : colorDto, (i3 & 65536) == 0 ? str9 : "", (i3 & 131072) != 0 ? null : payoutDto, (i3 & 262144) != 0 ? null : instant5, (i3 & 524288) != 0 ? null : instant6, (i3 & 1048576) != 0 ? 0 : i2, (i3 & 2097152) != 0 ? null : str10, (i3 & 4194304) != 0 ? null : str11, (i3 & 8388608) != 0 ? null : str12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventContractDto(String id, String event_id, String name, String description, String symbol, Instant instant, Instant instant2, Instant instant3, EventContractTradabilityDto tradability, EventContractStateDto state, Instant instant4, int i, String display_short_name, String display_long_name, String image_url, ColorDto colorDto, String multiplier, PayoutDto payoutDto, Instant instant5, Instant instant6, int i2, String str, String str2, String str3) {
        this(new Surrogate(id, event_id, name, description, symbol, instant, instant2, instant3, tradability, state, instant4, i, display_short_name, display_long_name, image_url, colorDto, multiplier, payoutDto, instant5, instant6, i2, str, str2, str3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(display_short_name, "display_short_name");
        Intrinsics.checkNotNullParameter(display_long_name, "display_long_name");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
    }

    public static /* synthetic */ EventContractDto copy$default(EventContractDto eventContractDto, String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, Instant instant3, EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Instant instant4, int i, String str6, String str7, String str8, ColorDto colorDto, String str9, PayoutDto payoutDto, Instant instant5, Instant instant6, int i2, String str10, String str11, String str12, int i3, Object obj) {
        String order_receipt_background_image_url;
        String str13;
        String id = (i3 & 1) != 0 ? eventContractDto.surrogate.getId() : str;
        String event_id = (i3 & 2) != 0 ? eventContractDto.surrogate.getEvent_id() : str2;
        String name = (i3 & 4) != 0 ? eventContractDto.surrogate.getName() : str3;
        String description = (i3 & 8) != 0 ? eventContractDto.surrogate.getDescription() : str4;
        String symbol = (i3 & 16) != 0 ? eventContractDto.surrogate.getSymbol() : str5;
        Instant last_trade_date = (i3 & 32) != 0 ? eventContractDto.surrogate.getLast_trade_date() : instant;
        Instant expiration_date = (i3 & 64) != 0 ? eventContractDto.surrogate.getExpiration_date() : instant2;
        Instant customer_last_close_date = (i3 & 128) != 0 ? eventContractDto.surrogate.getCustomer_last_close_date() : instant3;
        EventContractTradabilityDto tradability = (i3 & 256) != 0 ? eventContractDto.surrogate.getTradability() : eventContractTradabilityDto;
        EventContractStateDto state = (i3 & 512) != 0 ? eventContractDto.surrogate.getState() : eventContractStateDto;
        Instant open_date = (i3 & 1024) != 0 ? eventContractDto.surrogate.getOpen_date() : instant4;
        int min_contract_quantity = (i3 & 2048) != 0 ? eventContractDto.surrogate.getMin_contract_quantity() : i;
        String display_short_name = (i3 & 4096) != 0 ? eventContractDto.surrogate.getDisplay_short_name() : str6;
        String display_long_name = (i3 & 8192) != 0 ? eventContractDto.surrogate.getDisplay_long_name() : str7;
        String str14 = id;
        String image_url = (i3 & 16384) != 0 ? eventContractDto.surrogate.getImage_url() : str8;
        ColorDto color = (i3 & 32768) != 0 ? eventContractDto.surrogate.getColor() : colorDto;
        String multiplier = (i3 & 65536) != 0 ? eventContractDto.surrogate.getMultiplier() : str9;
        PayoutDto payout = (i3 & 131072) != 0 ? eventContractDto.surrogate.getPayout() : payoutDto;
        Instant settlement_time = (i3 & 262144) != 0 ? eventContractDto.surrogate.getSettlement_time() : instant5;
        Instant resolution_time = (i3 & 524288) != 0 ? eventContractDto.surrogate.getResolution_time() : instant6;
        int exchange_source = (i3 & 1048576) != 0 ? eventContractDto.surrogate.getExchange_source() : i2;
        String name_prefix = (i3 & 2097152) != 0 ? eventContractDto.surrogate.getName_prefix() : str10;
        String banner_text = (i3 & 4194304) != 0 ? eventContractDto.surrogate.getBanner_text() : str11;
        if ((i3 & 8388608) != 0) {
            str13 = banner_text;
            order_receipt_background_image_url = eventContractDto.surrogate.getOrder_receipt_background_image_url();
        } else {
            order_receipt_background_image_url = str12;
            str13 = banner_text;
        }
        return eventContractDto.copy(str14, event_id, name, description, symbol, last_trade_date, expiration_date, customer_last_close_date, tradability, state, open_date, min_contract_quantity, display_short_name, display_long_name, image_url, color, multiplier, payout, settlement_time, resolution_time, exchange_source, name_prefix, str13, order_receipt_background_image_url);
    }

    public final EventContractDto copy(String id, String event_id, String name, String description, String symbol, Instant last_trade_date, Instant expiration_date, Instant customer_last_close_date, EventContractTradabilityDto tradability, EventContractStateDto state, Instant open_date, int min_contract_quantity, String display_short_name, String display_long_name, String image_url, ColorDto color, String multiplier, PayoutDto payout, Instant settlement_time, Instant resolution_time, int exchange_source, String name_prefix, String banner_text, String order_receipt_background_image_url) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(display_short_name, "display_short_name");
        Intrinsics.checkNotNullParameter(display_long_name, "display_long_name");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        return new EventContractDto(new Surrogate(id, event_id, name, description, symbol, last_trade_date, expiration_date, customer_last_close_date, tradability, state, open_date, min_contract_quantity, display_short_name, display_long_name, image_url, color, multiplier, payout, settlement_time, resolution_time, exchange_source, name_prefix, banner_text, order_receipt_background_image_url));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EventContract toProto() {
        String id = this.surrogate.getId();
        String event_id = this.surrogate.getEvent_id();
        String name = this.surrogate.getName();
        String description = this.surrogate.getDescription();
        String symbol = this.surrogate.getSymbol();
        Instant last_trade_date = this.surrogate.getLast_trade_date();
        Instant expiration_date = this.surrogate.getExpiration_date();
        Instant customer_last_close_date = this.surrogate.getCustomer_last_close_date();
        EventContractTradability eventContractTradability = (EventContractTradability) this.surrogate.getTradability().toProto();
        EventContractState eventContractState = (EventContractState) this.surrogate.getState().toProto();
        Instant open_date = this.surrogate.getOpen_date();
        int min_contract_quantity = this.surrogate.getMin_contract_quantity();
        String display_short_name = this.surrogate.getDisplay_short_name();
        String display_long_name = this.surrogate.getDisplay_long_name();
        String image_url = this.surrogate.getImage_url();
        ColorDto color = this.surrogate.getColor();
        Color proto = color != null ? color.toProto() : null;
        String multiplier = this.surrogate.getMultiplier();
        PayoutDto payout = this.surrogate.getPayout();
        return new EventContract(id, event_id, name, description, symbol, last_trade_date, expiration_date, customer_last_close_date, eventContractTradability, eventContractState, open_date, min_contract_quantity, display_short_name, display_long_name, image_url, proto, multiplier, payout != null ? payout.toProto() : null, this.surrogate.getSettlement_time(), this.surrogate.getResolution_time(), this.surrogate.getExchange_source(), this.surrogate.getName_prefix(), this.surrogate.getBanner_text(), this.surrogate.getOrder_receipt_background_image_url(), null, 16777216, null);
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
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b=\b\u0083\b\u0018\u0000 \u0094\u00012\u00020\u0001:\u0004\u0095\u0001\u0094\u0001B\u0083\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010\u000f\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012.\b\u0002\u0010\u0014\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012.\b\u0002\u0010 \u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012.\b\u0002\u0010!\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\"\u001a\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0016\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'B\u0087\u0002\b\u0010\u0012\u0006\u0010(\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\"\u001a\u00020\u0015\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u00106J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u00106J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u00106J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u00106J6\u0010;\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b;\u0010<J6\u0010=\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b=\u0010<J6\u0010>\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b>\u0010<J\u0010\u0010?\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bA\u0010BJ6\u0010C\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\bC\u0010<J\u001f\u0010D\u001a\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0016HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u00106J\u0010\u0010G\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bG\u00106J\u0010\u0010H\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bH\u00106J\u0012\u0010I\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bK\u00106J\u0012\u0010L\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bL\u0010MJ6\u0010N\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\bN\u0010<J6\u0010O\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\bO\u0010<J\u001f\u0010P\u001a\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0016HÆ\u0003¢\u0006\u0004\bP\u0010EJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u00106J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u00106J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00106J\u008c\u0004\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2.\b\u0002\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2.\b\u0002\u0010\u000f\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122.\b\u0002\u0010\u0014\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\u0017\b\u0002\u0010\u0017\u001a\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2.\b\u0002\u0010 \u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2.\b\u0002\u0010!\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\u0017\b\u0002\u0010\"\u001a\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00162\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bV\u00106J\u0010\u0010W\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\bW\u0010EJ\u001a\u0010Z\u001a\u00020Y2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bZ\u0010[R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\\\u0012\u0004\b^\u0010_\u001a\u0004\b]\u00106R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\\\u0012\u0004\ba\u0010_\u001a\u0004\b`\u00106R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\\\u0012\u0004\bc\u0010_\u001a\u0004\bb\u00106R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\\\u0012\u0004\be\u0010_\u001a\u0004\bd\u00106R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\\\u0012\u0004\bg\u0010_\u001a\u0004\bf\u00106RF\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010h\u0012\u0004\bj\u0010_\u001a\u0004\bi\u0010<RF\u0010\u000e\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010h\u0012\u0004\bl\u0010_\u001a\u0004\bk\u0010<RF\u0010\u000f\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010h\u0012\u0004\bn\u0010_\u001a\u0004\bm\u0010<R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010o\u0012\u0004\bq\u0010_\u001a\u0004\bp\u0010@R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010r\u0012\u0004\bt\u0010_\u001a\u0004\bs\u0010BRF\u0010\u0014\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010h\u0012\u0004\bv\u0010_\u001a\u0004\bu\u0010<R/\u0010\u0017\u001a\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010w\u0012\u0004\by\u0010_\u001a\u0004\bx\u0010ER \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\\\u0012\u0004\b{\u0010_\u001a\u0004\bz\u00106R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\\\u0012\u0004\b}\u0010_\u001a\u0004\b|\u00106R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\\\u0012\u0004\b\u007f\u0010_\u001a\u0004\b~\u00106R%\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001c\u0010\u0080\u0001\u0012\u0005\b\u0082\u0001\u0010_\u001a\u0005\b\u0081\u0001\u0010JR\"\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\u001d\u0010\\\u0012\u0005\b\u0084\u0001\u0010_\u001a\u0005\b\u0083\u0001\u00106R%\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0015\n\u0005\b\u001f\u0010\u0085\u0001\u0012\u0005\b\u0087\u0001\u0010_\u001a\u0005\b\u0086\u0001\u0010MRH\u0010 \u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b \u0010h\u0012\u0005\b\u0089\u0001\u0010_\u001a\u0005\b\u0088\u0001\u0010<RH\u0010!\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b!\u0010h\u0012\u0005\b\u008b\u0001\u0010_\u001a\u0005\b\u008a\u0001\u0010<R1\u0010\"\u001a\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00168\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\"\u0010w\u0012\u0005\b\u008d\u0001\u0010_\u001a\u0005\b\u008c\u0001\u0010ER$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b#\u0010\\\u0012\u0005\b\u008f\u0001\u0010_\u001a\u0005\b\u008e\u0001\u00106R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010\\\u0012\u0005\b\u0091\u0001\u0010_\u001a\u0005\b\u0090\u0001\u00106R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b%\u0010\\\u0012\u0005\b\u0093\u0001\u0010_\u001a\u0005\b\u0092\u0001\u00106¨\u0006\u0096\u0001"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate;", "", "", "id", "event_id", "name", "description", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "last_trade_date", GovernmentIdNfcScan.expirationDateName, "customer_last_close_date", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "state", "open_date", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "min_contract_quantity", "display_short_name", "display_long_name", "image_url", "Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;", ResourceTypes.COLOR, "multiplier", "Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;", "payout", "settlement_time", "resolution_time", "exchange_source", "name_prefix", "banner_text", "order_receipt_background_image_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;Lj$/time/Instant;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;Lj$/time/Instant;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$arsenal_v1_public_externalRelease", "(Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lj$/time/Instant;", "component7", "component8", "component9", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "component10", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "component11", "component12", "()I", "component13", "component14", "component15", "component16", "()Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;", "component17", "component18", "()Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;Lj$/time/Instant;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getEvent_id", "getEvent_id$annotations", "getName", "getName$annotations", "getDescription", "getDescription$annotations", "getSymbol", "getSymbol$annotations", "Lj$/time/Instant;", "getLast_trade_date", "getLast_trade_date$annotations", "getExpiration_date", "getExpiration_date$annotations", "getCustomer_last_close_date", "getCustomer_last_close_date$annotations", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradabilityDto;", "getTradability", "getTradability$annotations", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractStateDto;", "getState", "getState$annotations", "getOpen_date", "getOpen_date$annotations", "I", "getMin_contract_quantity", "getMin_contract_quantity$annotations", "getDisplay_short_name", "getDisplay_short_name$annotations", "getDisplay_long_name", "getDisplay_long_name$annotations", "getImage_url", "getImage_url$annotations", "Lcom/robinhood/arsenal/proto/v1/idl/ColorDto;", "getColor", "getColor$annotations", "getMultiplier", "getMultiplier$annotations", "Lcom/robinhood/arsenal/proto/v1/idl/PayoutDto;", "getPayout", "getPayout$annotations", "getSettlement_time", "getSettlement_time$annotations", "getResolution_time", "getResolution_time$annotations", "getExchange_source", "getExchange_source$annotations", "getName_prefix", "getName_prefix$annotations", "getBanner_text", "getBanner_text$annotations", "getOrder_receipt_background_image_url", "getOrder_receipt_background_image_url$annotations", "Companion", "$serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String banner_text;
        private final ColorDto color;
        private final Instant customer_last_close_date;
        private final String description;
        private final String display_long_name;
        private final String display_short_name;
        private final String event_id;
        private final int exchange_source;
        private final Instant expiration_date;
        private final String id;
        private final String image_url;
        private final Instant last_trade_date;
        private final int min_contract_quantity;
        private final String multiplier;
        private final String name;
        private final String name_prefix;
        private final Instant open_date;
        private final String order_receipt_background_image_url;
        private final PayoutDto payout;
        private final Instant resolution_time;
        private final Instant settlement_time;
        private final EventContractStateDto state;
        private final String symbol;
        private final EventContractTradabilityDto tradability;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (Instant) null, (Instant) null, (Instant) null, (EventContractTradabilityDto) null, (EventContractStateDto) null, (Instant) null, 0, (String) null, (String) null, (String) null, (ColorDto) null, (String) null, (PayoutDto) null, (Instant) null, (Instant) null, 0, (String) null, (String) null, (String) null, 16777215, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, Instant instant3, EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Instant instant4, int i, String str6, String str7, String str8, ColorDto colorDto, String str9, PayoutDto payoutDto, Instant instant5, Instant instant6, int i2, String str10, String str11, String str12, int i3, Object obj) {
            String str13;
            String str14;
            String str15 = (i3 & 1) != 0 ? surrogate.id : str;
            String str16 = (i3 & 2) != 0 ? surrogate.event_id : str2;
            String str17 = (i3 & 4) != 0 ? surrogate.name : str3;
            String str18 = (i3 & 8) != 0 ? surrogate.description : str4;
            String str19 = (i3 & 16) != 0 ? surrogate.symbol : str5;
            Instant instant7 = (i3 & 32) != 0 ? surrogate.last_trade_date : instant;
            Instant instant8 = (i3 & 64) != 0 ? surrogate.expiration_date : instant2;
            Instant instant9 = (i3 & 128) != 0 ? surrogate.customer_last_close_date : instant3;
            EventContractTradabilityDto eventContractTradabilityDto2 = (i3 & 256) != 0 ? surrogate.tradability : eventContractTradabilityDto;
            EventContractStateDto eventContractStateDto2 = (i3 & 512) != 0 ? surrogate.state : eventContractStateDto;
            Instant instant10 = (i3 & 1024) != 0 ? surrogate.open_date : instant4;
            int i4 = (i3 & 2048) != 0 ? surrogate.min_contract_quantity : i;
            String str20 = (i3 & 4096) != 0 ? surrogate.display_short_name : str6;
            String str21 = (i3 & 8192) != 0 ? surrogate.display_long_name : str7;
            String str22 = str15;
            String str23 = (i3 & 16384) != 0 ? surrogate.image_url : str8;
            ColorDto colorDto2 = (i3 & 32768) != 0 ? surrogate.color : colorDto;
            String str24 = (i3 & 65536) != 0 ? surrogate.multiplier : str9;
            PayoutDto payoutDto2 = (i3 & 131072) != 0 ? surrogate.payout : payoutDto;
            Instant instant11 = (i3 & 262144) != 0 ? surrogate.settlement_time : instant5;
            Instant instant12 = (i3 & 524288) != 0 ? surrogate.resolution_time : instant6;
            int i5 = (i3 & 1048576) != 0 ? surrogate.exchange_source : i2;
            String str25 = (i3 & 2097152) != 0 ? surrogate.name_prefix : str10;
            String str26 = (i3 & 4194304) != 0 ? surrogate.banner_text : str11;
            if ((i3 & 8388608) != 0) {
                str14 = str26;
                str13 = surrogate.order_receipt_background_image_url;
            } else {
                str13 = str12;
                str14 = str26;
            }
            return surrogate.copy(str22, str16, str17, str18, str19, instant7, instant8, instant9, eventContractTradabilityDto2, eventContractStateDto2, instant10, i4, str20, str21, str23, colorDto2, str24, payoutDto2, instant11, instant12, i5, str25, str14, str13);
        }

        @SerialName("bannerText")
        @JsonAnnotations2(names = {"banner_text"})
        public static /* synthetic */ void getBanner_text$annotations() {
        }

        @SerialName(ResourceTypes.COLOR)
        @JsonAnnotations2(names = {ResourceTypes.COLOR})
        public static /* synthetic */ void getColor$annotations() {
        }

        @SerialName("customerLastCloseDate")
        @JsonAnnotations2(names = {"customer_last_close_date"})
        public static /* synthetic */ void getCustomer_last_close_date$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
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

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName(MarkdownText4.TagImageUrl)
        @JsonAnnotations2(names = {"image_url"})
        public static /* synthetic */ void getImage_url$annotations() {
        }

        @SerialName("lastTradeDate")
        @JsonAnnotations2(names = {"last_trade_date"})
        public static /* synthetic */ void getLast_trade_date$annotations() {
        }

        @SerialName("minContractQuantity")
        @JsonAnnotations2(names = {"min_contract_quantity"})
        public static /* synthetic */ void getMin_contract_quantity$annotations() {
        }

        @SerialName("multiplier")
        @JsonAnnotations2(names = {"multiplier"})
        public static /* synthetic */ void getMultiplier$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("namePrefix")
        @JsonAnnotations2(names = {"name_prefix"})
        public static /* synthetic */ void getName_prefix$annotations() {
        }

        @SerialName("openDate")
        @JsonAnnotations2(names = {"open_date"})
        public static /* synthetic */ void getOpen_date$annotations() {
        }

        @SerialName("orderReceiptBackgroundImageUrl")
        @JsonAnnotations2(names = {"order_receipt_background_image_url"})
        public static /* synthetic */ void getOrder_receipt_background_image_url$annotations() {
        }

        @SerialName("payout")
        @JsonAnnotations2(names = {"payout"})
        public static /* synthetic */ void getPayout$annotations() {
        }

        @SerialName("resolutionTime")
        @JsonAnnotations2(names = {"resolution_time"})
        public static /* synthetic */ void getResolution_time$annotations() {
        }

        @SerialName("settlementTime")
        @JsonAnnotations2(names = {"settlement_time"})
        public static /* synthetic */ void getSettlement_time$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tradability")
        @JsonAnnotations2(names = {"tradability"})
        public static /* synthetic */ void getTradability$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final EventContractStateDto getState() {
            return this.state;
        }

        /* renamed from: component11, reason: from getter */
        public final Instant getOpen_date() {
            return this.open_date;
        }

        /* renamed from: component12, reason: from getter */
        public final int getMin_contract_quantity() {
            return this.min_contract_quantity;
        }

        /* renamed from: component13, reason: from getter */
        public final String getDisplay_short_name() {
            return this.display_short_name;
        }

        /* renamed from: component14, reason: from getter */
        public final String getDisplay_long_name() {
            return this.display_long_name;
        }

        /* renamed from: component15, reason: from getter */
        public final String getImage_url() {
            return this.image_url;
        }

        /* renamed from: component16, reason: from getter */
        public final ColorDto getColor() {
            return this.color;
        }

        /* renamed from: component17, reason: from getter */
        public final String getMultiplier() {
            return this.multiplier;
        }

        /* renamed from: component18, reason: from getter */
        public final PayoutDto getPayout() {
            return this.payout;
        }

        /* renamed from: component19, reason: from getter */
        public final Instant getSettlement_time() {
            return this.settlement_time;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent_id() {
            return this.event_id;
        }

        /* renamed from: component20, reason: from getter */
        public final Instant getResolution_time() {
            return this.resolution_time;
        }

        /* renamed from: component21, reason: from getter */
        public final int getExchange_source() {
            return this.exchange_source;
        }

        /* renamed from: component22, reason: from getter */
        public final String getName_prefix() {
            return this.name_prefix;
        }

        /* renamed from: component23, reason: from getter */
        public final String getBanner_text() {
            return this.banner_text;
        }

        /* renamed from: component24, reason: from getter */
        public final String getOrder_receipt_background_image_url() {
            return this.order_receipt_background_image_url;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getLast_trade_date() {
            return this.last_trade_date;
        }

        /* renamed from: component7, reason: from getter */
        public final Instant getExpiration_date() {
            return this.expiration_date;
        }

        /* renamed from: component8, reason: from getter */
        public final Instant getCustomer_last_close_date() {
            return this.customer_last_close_date;
        }

        /* renamed from: component9, reason: from getter */
        public final EventContractTradabilityDto getTradability() {
            return this.tradability;
        }

        public final Surrogate copy(String id, String event_id, String name, String description, String symbol, Instant last_trade_date, Instant expiration_date, Instant customer_last_close_date, EventContractTradabilityDto tradability, EventContractStateDto state, Instant open_date, int min_contract_quantity, String display_short_name, String display_long_name, String image_url, ColorDto color, String multiplier, PayoutDto payout, Instant settlement_time, Instant resolution_time, int exchange_source, String name_prefix, String banner_text, String order_receipt_background_image_url) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(event_id, "event_id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(display_short_name, "display_short_name");
            Intrinsics.checkNotNullParameter(display_long_name, "display_long_name");
            Intrinsics.checkNotNullParameter(image_url, "image_url");
            Intrinsics.checkNotNullParameter(multiplier, "multiplier");
            return new Surrogate(id, event_id, name, description, symbol, last_trade_date, expiration_date, customer_last_close_date, tradability, state, open_date, min_contract_quantity, display_short_name, display_long_name, image_url, color, multiplier, payout, settlement_time, resolution_time, exchange_source, name_prefix, banner_text, order_receipt_background_image_url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.event_id, surrogate.event_id) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.last_trade_date, surrogate.last_trade_date) && Intrinsics.areEqual(this.expiration_date, surrogate.expiration_date) && Intrinsics.areEqual(this.customer_last_close_date, surrogate.customer_last_close_date) && this.tradability == surrogate.tradability && this.state == surrogate.state && Intrinsics.areEqual(this.open_date, surrogate.open_date) && this.min_contract_quantity == surrogate.min_contract_quantity && Intrinsics.areEqual(this.display_short_name, surrogate.display_short_name) && Intrinsics.areEqual(this.display_long_name, surrogate.display_long_name) && Intrinsics.areEqual(this.image_url, surrogate.image_url) && Intrinsics.areEqual(this.color, surrogate.color) && Intrinsics.areEqual(this.multiplier, surrogate.multiplier) && Intrinsics.areEqual(this.payout, surrogate.payout) && Intrinsics.areEqual(this.settlement_time, surrogate.settlement_time) && Intrinsics.areEqual(this.resolution_time, surrogate.resolution_time) && this.exchange_source == surrogate.exchange_source && Intrinsics.areEqual(this.name_prefix, surrogate.name_prefix) && Intrinsics.areEqual(this.banner_text, surrogate.banner_text) && Intrinsics.areEqual(this.order_receipt_background_image_url, surrogate.order_receipt_background_image_url);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.event_id.hashCode()) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.symbol.hashCode()) * 31;
            Instant instant = this.last_trade_date;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.expiration_date;
            int iHashCode3 = (iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.customer_last_close_date;
            int iHashCode4 = (((((iHashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31) + this.tradability.hashCode()) * 31) + this.state.hashCode()) * 31;
            Instant instant4 = this.open_date;
            int iHashCode5 = (((((((((iHashCode4 + (instant4 == null ? 0 : instant4.hashCode())) * 31) + Integer.hashCode(this.min_contract_quantity)) * 31) + this.display_short_name.hashCode()) * 31) + this.display_long_name.hashCode()) * 31) + this.image_url.hashCode()) * 31;
            ColorDto colorDto = this.color;
            int iHashCode6 = (((iHashCode5 + (colorDto == null ? 0 : colorDto.hashCode())) * 31) + this.multiplier.hashCode()) * 31;
            PayoutDto payoutDto = this.payout;
            int iHashCode7 = (iHashCode6 + (payoutDto == null ? 0 : payoutDto.hashCode())) * 31;
            Instant instant5 = this.settlement_time;
            int iHashCode8 = (iHashCode7 + (instant5 == null ? 0 : instant5.hashCode())) * 31;
            Instant instant6 = this.resolution_time;
            int iHashCode9 = (((iHashCode8 + (instant6 == null ? 0 : instant6.hashCode())) * 31) + Integer.hashCode(this.exchange_source)) * 31;
            String str = this.name_prefix;
            int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.banner_text;
            int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.order_receipt_background_image_url;
            return iHashCode11 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", event_id=" + this.event_id + ", name=" + this.name + ", description=" + this.description + ", symbol=" + this.symbol + ", last_trade_date=" + this.last_trade_date + ", expiration_date=" + this.expiration_date + ", customer_last_close_date=" + this.customer_last_close_date + ", tradability=" + this.tradability + ", state=" + this.state + ", open_date=" + this.open_date + ", min_contract_quantity=" + this.min_contract_quantity + ", display_short_name=" + this.display_short_name + ", display_long_name=" + this.display_long_name + ", image_url=" + this.image_url + ", color=" + this.color + ", multiplier=" + this.multiplier + ", payout=" + this.payout + ", settlement_time=" + this.settlement_time + ", resolution_time=" + this.resolution_time + ", exchange_source=" + this.exchange_source + ", name_prefix=" + this.name_prefix + ", banner_text=" + this.banner_text + ", order_receipt_background_image_url=" + this.order_receipt_background_image_url + ")";
        }

        /* compiled from: EventContractDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventContractDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, Instant instant3, EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Instant instant4, int i2, String str6, String str7, String str8, ColorDto colorDto, String str9, PayoutDto payoutDto, Instant instant5, Instant instant6, int i3, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.name = "";
            } else {
                this.name = str3;
            }
            if ((i & 8) == 0) {
                this.description = "";
            } else {
                this.description = str4;
            }
            if ((i & 16) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str5;
            }
            if ((i & 32) == 0) {
                this.last_trade_date = null;
            } else {
                this.last_trade_date = instant;
            }
            if ((i & 64) == 0) {
                this.expiration_date = null;
            } else {
                this.expiration_date = instant2;
            }
            if ((i & 128) == 0) {
                this.customer_last_close_date = null;
            } else {
                this.customer_last_close_date = instant3;
            }
            if ((i & 256) == 0) {
                this.tradability = EventContractTradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.tradability = eventContractTradabilityDto;
            }
            if ((i & 512) == 0) {
                this.state = EventContractStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = eventContractStateDto;
            }
            if ((i & 1024) == 0) {
                this.open_date = null;
            } else {
                this.open_date = instant4;
            }
            if ((i & 2048) == 0) {
                this.min_contract_quantity = 0;
            } else {
                this.min_contract_quantity = i2;
            }
            if ((i & 4096) == 0) {
                this.display_short_name = "";
            } else {
                this.display_short_name = str6;
            }
            if ((i & 8192) == 0) {
                this.display_long_name = "";
            } else {
                this.display_long_name = str7;
            }
            if ((i & 16384) == 0) {
                this.image_url = "";
            } else {
                this.image_url = str8;
            }
            if ((32768 & i) == 0) {
                this.color = null;
            } else {
                this.color = colorDto;
            }
            if ((65536 & i) == 0) {
                this.multiplier = "";
            } else {
                this.multiplier = str9;
            }
            if ((131072 & i) == 0) {
                this.payout = null;
            } else {
                this.payout = payoutDto;
            }
            if ((262144 & i) == 0) {
                this.settlement_time = null;
            } else {
                this.settlement_time = instant5;
            }
            if ((524288 & i) == 0) {
                this.resolution_time = null;
            } else {
                this.resolution_time = instant6;
            }
            if ((1048576 & i) == 0) {
                this.exchange_source = 0;
            } else {
                this.exchange_source = i3;
            }
            if ((2097152 & i) == 0) {
                this.name_prefix = null;
            } else {
                this.name_prefix = str10;
            }
            if ((4194304 & i) == 0) {
                this.banner_text = null;
            } else {
                this.banner_text = str11;
            }
            if ((i & 8388608) == 0) {
                this.order_receipt_background_image_url = null;
            } else {
                this.order_receipt_background_image_url = str12;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.event_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.event_id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 2, self.name);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 3, self.description);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 4, self.symbol);
            }
            Instant instant = self.last_trade_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.expiration_date;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.customer_last_close_date;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant3);
            }
            if (self.tradability != EventContractTradabilityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, EventContractTradabilityDto.Serializer.INSTANCE, self.tradability);
            }
            if (self.state != EventContractStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, EventContractStateDto.Serializer.INSTANCE, self.state);
            }
            Instant instant4 = self.open_date;
            if (instant4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant4);
            }
            int i = self.min_contract_quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 11, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.display_short_name, "")) {
                output.encodeStringElement(serialDesc, 12, self.display_short_name);
            }
            if (!Intrinsics.areEqual(self.display_long_name, "")) {
                output.encodeStringElement(serialDesc, 13, self.display_long_name);
            }
            if (!Intrinsics.areEqual(self.image_url, "")) {
                output.encodeStringElement(serialDesc, 14, self.image_url);
            }
            ColorDto colorDto = self.color;
            if (colorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, ColorDto.Serializer.INSTANCE, colorDto);
            }
            if (!Intrinsics.areEqual(self.multiplier, "")) {
                output.encodeStringElement(serialDesc, 16, self.multiplier);
            }
            PayoutDto payoutDto = self.payout;
            if (payoutDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, PayoutDto.Serializer.INSTANCE, payoutDto);
            }
            Instant instant5 = self.settlement_time;
            if (instant5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, WireInstantSerializer.INSTANCE, instant5);
            }
            Instant instant6 = self.resolution_time;
            if (instant6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, WireInstantSerializer.INSTANCE, instant6);
            }
            int i2 = self.exchange_source;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 20, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            String str = self.name_prefix;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, str);
            }
            String str2 = self.banner_text;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.order_receipt_background_image_url;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, StringSerializer.INSTANCE, str3);
            }
        }

        public Surrogate(String id, String event_id, String name, String description, String symbol, Instant instant, Instant instant2, Instant instant3, EventContractTradabilityDto tradability, EventContractStateDto state, Instant instant4, int i, String display_short_name, String display_long_name, String image_url, ColorDto colorDto, String multiplier, PayoutDto payoutDto, Instant instant5, Instant instant6, int i2, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(event_id, "event_id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(display_short_name, "display_short_name");
            Intrinsics.checkNotNullParameter(display_long_name, "display_long_name");
            Intrinsics.checkNotNullParameter(image_url, "image_url");
            Intrinsics.checkNotNullParameter(multiplier, "multiplier");
            this.id = id;
            this.event_id = event_id;
            this.name = name;
            this.description = description;
            this.symbol = symbol;
            this.last_trade_date = instant;
            this.expiration_date = instant2;
            this.customer_last_close_date = instant3;
            this.tradability = tradability;
            this.state = state;
            this.open_date = instant4;
            this.min_contract_quantity = i;
            this.display_short_name = display_short_name;
            this.display_long_name = display_long_name;
            this.image_url = image_url;
            this.color = colorDto;
            this.multiplier = multiplier;
            this.payout = payoutDto;
            this.settlement_time = instant5;
            this.resolution_time = instant6;
            this.exchange_source = i2;
            this.name_prefix = str;
            this.banner_text = str2;
            this.order_receipt_background_image_url = str3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, Instant instant3, EventContractTradabilityDto eventContractTradabilityDto, EventContractStateDto eventContractStateDto, Instant instant4, int i, String str6, String str7, String str8, ColorDto colorDto, String str9, PayoutDto payoutDto, Instant instant5, Instant instant6, int i2, String str10, String str11, String str12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : instant, (i3 & 64) != 0 ? null : instant2, (i3 & 128) != 0 ? null : instant3, (i3 & 256) != 0 ? EventContractTradabilityDto.INSTANCE.getZeroValue() : eventContractTradabilityDto, (i3 & 512) != 0 ? EventContractStateDto.INSTANCE.getZeroValue() : eventContractStateDto, (i3 & 1024) != 0 ? null : instant4, (i3 & 2048) != 0 ? 0 : i, (i3 & 4096) != 0 ? "" : str6, (i3 & 8192) != 0 ? "" : str7, (i3 & 16384) != 0 ? "" : str8, (i3 & 32768) != 0 ? null : colorDto, (i3 & 65536) == 0 ? str9 : "", (i3 & 131072) != 0 ? null : payoutDto, (i3 & 262144) != 0 ? null : instant5, (i3 & 524288) != 0 ? null : instant6, (i3 & 1048576) != 0 ? 0 : i2, (i3 & 2097152) != 0 ? null : str10, (i3 & 4194304) != 0 ? null : str11, (i3 & 8388608) != 0 ? null : str12);
        }

        public final String getId() {
            return this.id;
        }

        public final String getEvent_id() {
            return this.event_id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final Instant getLast_trade_date() {
            return this.last_trade_date;
        }

        public final Instant getExpiration_date() {
            return this.expiration_date;
        }

        public final Instant getCustomer_last_close_date() {
            return this.customer_last_close_date;
        }

        public final EventContractTradabilityDto getTradability() {
            return this.tradability;
        }

        public final EventContractStateDto getState() {
            return this.state;
        }

        public final Instant getOpen_date() {
            return this.open_date;
        }

        public final int getMin_contract_quantity() {
            return this.min_contract_quantity;
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

        public final String getMultiplier() {
            return this.multiplier;
        }

        public final PayoutDto getPayout() {
            return this.payout;
        }

        public final Instant getSettlement_time() {
            return this.settlement_time;
        }

        public final Instant getResolution_time() {
            return this.resolution_time;
        }

        public final int getExchange_source() {
            return this.exchange_source;
        }

        public final String getName_prefix() {
            return this.name_prefix;
        }

        public final String getBanner_text() {
            return this.banner_text;
        }

        public final String getOrder_receipt_background_image_url() {
            return this.order_receipt_background_image_url;
        }
    }

    /* compiled from: EventContractDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            String name = proto.getName();
            String description = proto.getDescription();
            String symbol = proto.getSymbol();
            Instant last_trade_date = proto.getLast_trade_date();
            Instant expiration_date = proto.getExpiration_date();
            Instant customer_last_close_date = proto.getCustomer_last_close_date();
            EventContractTradabilityDto eventContractTradabilityDtoFromProto = EventContractTradabilityDto.INSTANCE.fromProto(proto.getTradability());
            EventContractStateDto eventContractStateDtoFromProto = EventContractStateDto.INSTANCE.fromProto(proto.getState());
            Instant open_date = proto.getOpen_date();
            int min_contract_quantity = proto.getMin_contract_quantity();
            String display_short_name = proto.getDisplay_short_name();
            String display_long_name = proto.getDisplay_long_name();
            String image_url = proto.getImage_url();
            Color color = proto.getColor();
            ColorDto colorDtoFromProto = color != null ? ColorDto.INSTANCE.fromProto(color) : null;
            String multiplier = proto.getMultiplier();
            Payout payout = proto.getPayout();
            return new EventContractDto(new Surrogate(id, event_id, name, description, symbol, last_trade_date, expiration_date, customer_last_close_date, eventContractTradabilityDtoFromProto, eventContractStateDtoFromProto, open_date, min_contract_quantity, display_short_name, display_long_name, image_url, colorDtoFromProto, multiplier, payout != null ? PayoutDto.INSTANCE.fromProto(payout) : null, proto.getSettlement_time(), proto.getResolution_time(), proto.getExchange_source(), proto.getName_prefix(), proto.getBanner_text(), proto.getOrder_receipt_background_image_url()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventContractDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventContractDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EventContractDto(null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, 16777215, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventContractDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventContractDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.EventContract", kSerializerSerializer.getDescriptor());
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
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventContractDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.EventContractDto";
        }
    }
}
