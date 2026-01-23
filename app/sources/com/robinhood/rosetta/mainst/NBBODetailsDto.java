package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import rosetta.mainst.Venue;
import rosetta.mainst.VenueDto;

/* compiled from: NBBODetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043456B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u0015Jz\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tJ\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020,H\u0016J\b\u00102\u001a\u00020,H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/NBBODetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/NBBODetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/NBBODetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/NBBODetailsDto$Surrogate;)V", BidAskDetails3.ASK_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "ask_quantity", "bid_venue", "Lrosetta/mainst/VenueDto;", BidAskDetails3.BID_PRICE, "bid_quantity", "ask_venue", "exchange_timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "mid_price", "limit_up_price", "limit_down_price", "(Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;)V", "getAsk_price", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getAsk_quantity", "getBid_venue", "()Lrosetta/mainst/VenueDto;", "getBid_price", "getBid_quantity", "getAsk_venue", "getExchange_timestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getMid_price", "getLimit_up_price", "getLimit_down_price", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class NBBODetailsDto implements Dto3<NBBODetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NBBODetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NBBODetailsDto, NBBODetails>> binaryBase64Serializer$delegate;
    private static final NBBODetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NBBODetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NBBODetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DecimalDto getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final DecimalDto getAsk_quantity() {
        return this.surrogate.getAsk_quantity();
    }

    public final VenueDto getBid_venue() {
        return this.surrogate.getBid_venue();
    }

    public final DecimalDto getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final DecimalDto getBid_quantity() {
        return this.surrogate.getBid_quantity();
    }

    public final VenueDto getAsk_venue() {
        return this.surrogate.getAsk_venue();
    }

    public final TimeDto getExchange_timestamp() {
        return this.surrogate.getExchange_timestamp();
    }

    public final DecimalDto getMid_price() {
        return this.surrogate.getMid_price();
    }

    public final DecimalDto getLimit_up_price() {
        return this.surrogate.getLimit_up_price();
    }

    public final DecimalDto getLimit_down_price() {
        return this.surrogate.getLimit_down_price();
    }

    public /* synthetic */ NBBODetailsDto(DecimalDto decimalDto, DecimalDto decimalDto2, VenueDto venueDto, DecimalDto decimalDto3, DecimalDto decimalDto4, VenueDto venueDto2, TimeDto timeDto, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : decimalDto, (i & 2) != 0 ? null : decimalDto2, (i & 4) != 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto, (i & 8) != 0 ? null : decimalDto3, (i & 16) != 0 ? null : decimalDto4, (i & 32) != 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto2, (i & 64) != 0 ? null : timeDto, (i & 128) != 0 ? null : decimalDto5, (i & 256) != 0 ? null : decimalDto6, (i & 512) != 0 ? null : decimalDto7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NBBODetailsDto(DecimalDto decimalDto, DecimalDto decimalDto2, VenueDto bid_venue, DecimalDto decimalDto3, DecimalDto decimalDto4, VenueDto ask_venue, TimeDto timeDto, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7) {
        this(new Surrogate(decimalDto, decimalDto2, bid_venue, decimalDto3, decimalDto4, ask_venue, timeDto, decimalDto5, decimalDto6, decimalDto7));
        Intrinsics.checkNotNullParameter(bid_venue, "bid_venue");
        Intrinsics.checkNotNullParameter(ask_venue, "ask_venue");
    }

    public static /* synthetic */ NBBODetailsDto copy$default(NBBODetailsDto nBBODetailsDto, DecimalDto decimalDto, DecimalDto decimalDto2, VenueDto venueDto, DecimalDto decimalDto3, DecimalDto decimalDto4, VenueDto venueDto2, TimeDto timeDto, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, int i, Object obj) {
        if ((i & 1) != 0) {
            decimalDto = nBBODetailsDto.surrogate.getAsk_price();
        }
        if ((i & 2) != 0) {
            decimalDto2 = nBBODetailsDto.surrogate.getAsk_quantity();
        }
        if ((i & 4) != 0) {
            venueDto = nBBODetailsDto.surrogate.getBid_venue();
        }
        if ((i & 8) != 0) {
            decimalDto3 = nBBODetailsDto.surrogate.getBid_price();
        }
        if ((i & 16) != 0) {
            decimalDto4 = nBBODetailsDto.surrogate.getBid_quantity();
        }
        if ((i & 32) != 0) {
            venueDto2 = nBBODetailsDto.surrogate.getAsk_venue();
        }
        if ((i & 64) != 0) {
            timeDto = nBBODetailsDto.surrogate.getExchange_timestamp();
        }
        if ((i & 128) != 0) {
            decimalDto5 = nBBODetailsDto.surrogate.getMid_price();
        }
        if ((i & 256) != 0) {
            decimalDto6 = nBBODetailsDto.surrogate.getLimit_up_price();
        }
        if ((i & 512) != 0) {
            decimalDto7 = nBBODetailsDto.surrogate.getLimit_down_price();
        }
        DecimalDto decimalDto8 = decimalDto6;
        DecimalDto decimalDto9 = decimalDto7;
        TimeDto timeDto2 = timeDto;
        DecimalDto decimalDto10 = decimalDto5;
        DecimalDto decimalDto11 = decimalDto4;
        VenueDto venueDto3 = venueDto2;
        return nBBODetailsDto.copy(decimalDto, decimalDto2, venueDto, decimalDto3, decimalDto11, venueDto3, timeDto2, decimalDto10, decimalDto8, decimalDto9);
    }

    public final NBBODetailsDto copy(DecimalDto ask_price, DecimalDto ask_quantity, VenueDto bid_venue, DecimalDto bid_price, DecimalDto bid_quantity, VenueDto ask_venue, TimeDto exchange_timestamp, DecimalDto mid_price, DecimalDto limit_up_price, DecimalDto limit_down_price) {
        Intrinsics.checkNotNullParameter(bid_venue, "bid_venue");
        Intrinsics.checkNotNullParameter(ask_venue, "ask_venue");
        return new NBBODetailsDto(new Surrogate(ask_price, ask_quantity, bid_venue, bid_price, bid_quantity, ask_venue, exchange_timestamp, mid_price, limit_up_price, limit_down_price));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NBBODetails toProto() {
        DecimalDto ask_price = this.surrogate.getAsk_price();
        Decimal proto = ask_price != null ? ask_price.toProto() : null;
        DecimalDto ask_quantity = this.surrogate.getAsk_quantity();
        Decimal proto2 = ask_quantity != null ? ask_quantity.toProto() : null;
        Venue venue = (Venue) this.surrogate.getBid_venue().toProto();
        DecimalDto bid_price = this.surrogate.getBid_price();
        Decimal proto3 = bid_price != null ? bid_price.toProto() : null;
        DecimalDto bid_quantity = this.surrogate.getBid_quantity();
        Decimal proto4 = bid_quantity != null ? bid_quantity.toProto() : null;
        Venue venue2 = (Venue) this.surrogate.getAsk_venue().toProto();
        TimeDto exchange_timestamp = this.surrogate.getExchange_timestamp();
        Time proto5 = exchange_timestamp != null ? exchange_timestamp.toProto() : null;
        DecimalDto mid_price = this.surrogate.getMid_price();
        Decimal proto6 = mid_price != null ? mid_price.toProto() : null;
        DecimalDto limit_up_price = this.surrogate.getLimit_up_price();
        Decimal proto7 = limit_up_price != null ? limit_up_price.toProto() : null;
        DecimalDto limit_down_price = this.surrogate.getLimit_down_price();
        return new NBBODetails(proto, proto2, venue, proto3, proto4, venue2, proto5, proto6, proto7, limit_down_price != null ? limit_down_price.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[NBBODetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NBBODetailsDto) && Intrinsics.areEqual(((NBBODetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: NBBODetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 H2\u00020\u0001:\u0002GHB{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J}\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0012HÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001J%\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\bFR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u001c\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019¨\u0006I"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/NBBODetailsDto$Surrogate;", "", BidAskDetails3.ASK_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "ask_quantity", "bid_venue", "Lrosetta/mainst/VenueDto;", BidAskDetails3.BID_PRICE, "bid_quantity", "ask_venue", "exchange_timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "mid_price", "limit_up_price", "limit_down_price", "<init>", "(Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/VenueDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAsk_price$annotations", "()V", "getAsk_price", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getAsk_quantity$annotations", "getAsk_quantity", "getBid_venue$annotations", "getBid_venue", "()Lrosetta/mainst/VenueDto;", "getBid_price$annotations", "getBid_price", "getBid_quantity$annotations", "getBid_quantity", "getAsk_venue$annotations", "getAsk_venue", "getExchange_timestamp$annotations", "getExchange_timestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getMid_price$annotations", "getMid_price", "getLimit_up_price$annotations", "getLimit_up_price", "getLimit_down_price$annotations", "getLimit_down_price", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto ask_price;
        private final DecimalDto ask_quantity;
        private final VenueDto ask_venue;
        private final DecimalDto bid_price;
        private final DecimalDto bid_quantity;
        private final VenueDto bid_venue;
        private final TimeDto exchange_timestamp;
        private final DecimalDto limit_down_price;
        private final DecimalDto limit_up_price;
        private final DecimalDto mid_price;

        public Surrogate() {
            this((DecimalDto) null, (DecimalDto) null, (VenueDto) null, (DecimalDto) null, (DecimalDto) null, (VenueDto) null, (TimeDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DecimalDto decimalDto, DecimalDto decimalDto2, VenueDto venueDto, DecimalDto decimalDto3, DecimalDto decimalDto4, VenueDto venueDto2, TimeDto timeDto, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, int i, Object obj) {
            if ((i & 1) != 0) {
                decimalDto = surrogate.ask_price;
            }
            if ((i & 2) != 0) {
                decimalDto2 = surrogate.ask_quantity;
            }
            if ((i & 4) != 0) {
                venueDto = surrogate.bid_venue;
            }
            if ((i & 8) != 0) {
                decimalDto3 = surrogate.bid_price;
            }
            if ((i & 16) != 0) {
                decimalDto4 = surrogate.bid_quantity;
            }
            if ((i & 32) != 0) {
                venueDto2 = surrogate.ask_venue;
            }
            if ((i & 64) != 0) {
                timeDto = surrogate.exchange_timestamp;
            }
            if ((i & 128) != 0) {
                decimalDto5 = surrogate.mid_price;
            }
            if ((i & 256) != 0) {
                decimalDto6 = surrogate.limit_up_price;
            }
            if ((i & 512) != 0) {
                decimalDto7 = surrogate.limit_down_price;
            }
            DecimalDto decimalDto8 = decimalDto6;
            DecimalDto decimalDto9 = decimalDto7;
            TimeDto timeDto2 = timeDto;
            DecimalDto decimalDto10 = decimalDto5;
            DecimalDto decimalDto11 = decimalDto4;
            VenueDto venueDto3 = venueDto2;
            return surrogate.copy(decimalDto, decimalDto2, venueDto, decimalDto3, decimalDto11, venueDto3, timeDto2, decimalDto10, decimalDto8, decimalDto9);
        }

        @SerialName("askPrice")
        @JsonAnnotations2(names = {BidAskDetails3.ASK_PRICE})
        public static /* synthetic */ void getAsk_price$annotations() {
        }

        @SerialName("askQuantity")
        @JsonAnnotations2(names = {"ask_quantity"})
        public static /* synthetic */ void getAsk_quantity$annotations() {
        }

        @SerialName("askVenue")
        @JsonAnnotations2(names = {"ask_venue"})
        public static /* synthetic */ void getAsk_venue$annotations() {
        }

        @SerialName("bidPrice")
        @JsonAnnotations2(names = {BidAskDetails3.BID_PRICE})
        public static /* synthetic */ void getBid_price$annotations() {
        }

        @SerialName("bidQuantity")
        @JsonAnnotations2(names = {"bid_quantity"})
        public static /* synthetic */ void getBid_quantity$annotations() {
        }

        @SerialName("bidVenue")
        @JsonAnnotations2(names = {"bid_venue"})
        public static /* synthetic */ void getBid_venue$annotations() {
        }

        @SerialName("exchangeTimestamp")
        @JsonAnnotations2(names = {"exchange_timestamp"})
        public static /* synthetic */ void getExchange_timestamp$annotations() {
        }

        @SerialName("limitDownPrice")
        @JsonAnnotations2(names = {"limit_down_price"})
        public static /* synthetic */ void getLimit_down_price$annotations() {
        }

        @SerialName("limitUpPrice")
        @JsonAnnotations2(names = {"limit_up_price"})
        public static /* synthetic */ void getLimit_up_price$annotations() {
        }

        @SerialName("midPrice")
        @JsonAnnotations2(names = {"mid_price"})
        public static /* synthetic */ void getMid_price$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DecimalDto getAsk_price() {
            return this.ask_price;
        }

        /* renamed from: component10, reason: from getter */
        public final DecimalDto getLimit_down_price() {
            return this.limit_down_price;
        }

        /* renamed from: component2, reason: from getter */
        public final DecimalDto getAsk_quantity() {
            return this.ask_quantity;
        }

        /* renamed from: component3, reason: from getter */
        public final VenueDto getBid_venue() {
            return this.bid_venue;
        }

        /* renamed from: component4, reason: from getter */
        public final DecimalDto getBid_price() {
            return this.bid_price;
        }

        /* renamed from: component5, reason: from getter */
        public final DecimalDto getBid_quantity() {
            return this.bid_quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final VenueDto getAsk_venue() {
            return this.ask_venue;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeDto getExchange_timestamp() {
            return this.exchange_timestamp;
        }

        /* renamed from: component8, reason: from getter */
        public final DecimalDto getMid_price() {
            return this.mid_price;
        }

        /* renamed from: component9, reason: from getter */
        public final DecimalDto getLimit_up_price() {
            return this.limit_up_price;
        }

        public final Surrogate copy(DecimalDto ask_price, DecimalDto ask_quantity, VenueDto bid_venue, DecimalDto bid_price, DecimalDto bid_quantity, VenueDto ask_venue, TimeDto exchange_timestamp, DecimalDto mid_price, DecimalDto limit_up_price, DecimalDto limit_down_price) {
            Intrinsics.checkNotNullParameter(bid_venue, "bid_venue");
            Intrinsics.checkNotNullParameter(ask_venue, "ask_venue");
            return new Surrogate(ask_price, ask_quantity, bid_venue, bid_price, bid_quantity, ask_venue, exchange_timestamp, mid_price, limit_up_price, limit_down_price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.ask_quantity, surrogate.ask_quantity) && this.bid_venue == surrogate.bid_venue && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.bid_quantity, surrogate.bid_quantity) && this.ask_venue == surrogate.ask_venue && Intrinsics.areEqual(this.exchange_timestamp, surrogate.exchange_timestamp) && Intrinsics.areEqual(this.mid_price, surrogate.mid_price) && Intrinsics.areEqual(this.limit_up_price, surrogate.limit_up_price) && Intrinsics.areEqual(this.limit_down_price, surrogate.limit_down_price);
        }

        public int hashCode() {
            DecimalDto decimalDto = this.ask_price;
            int iHashCode = (decimalDto == null ? 0 : decimalDto.hashCode()) * 31;
            DecimalDto decimalDto2 = this.ask_quantity;
            int iHashCode2 = (((iHashCode + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31) + this.bid_venue.hashCode()) * 31;
            DecimalDto decimalDto3 = this.bid_price;
            int iHashCode3 = (iHashCode2 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            DecimalDto decimalDto4 = this.bid_quantity;
            int iHashCode4 = (((iHashCode3 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31) + this.ask_venue.hashCode()) * 31;
            TimeDto timeDto = this.exchange_timestamp;
            int iHashCode5 = (iHashCode4 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            DecimalDto decimalDto5 = this.mid_price;
            int iHashCode6 = (iHashCode5 + (decimalDto5 == null ? 0 : decimalDto5.hashCode())) * 31;
            DecimalDto decimalDto6 = this.limit_up_price;
            int iHashCode7 = (iHashCode6 + (decimalDto6 == null ? 0 : decimalDto6.hashCode())) * 31;
            DecimalDto decimalDto7 = this.limit_down_price;
            return iHashCode7 + (decimalDto7 != null ? decimalDto7.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(ask_price=" + this.ask_price + ", ask_quantity=" + this.ask_quantity + ", bid_venue=" + this.bid_venue + ", bid_price=" + this.bid_price + ", bid_quantity=" + this.bid_quantity + ", ask_venue=" + this.ask_venue + ", exchange_timestamp=" + this.exchange_timestamp + ", mid_price=" + this.mid_price + ", limit_up_price=" + this.limit_up_price + ", limit_down_price=" + this.limit_down_price + ")";
        }

        /* compiled from: NBBODetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/NBBODetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/NBBODetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NBBODetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DecimalDto decimalDto, DecimalDto decimalDto2, VenueDto venueDto, DecimalDto decimalDto3, DecimalDto decimalDto4, VenueDto venueDto2, TimeDto timeDto, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ask_price = null;
            } else {
                this.ask_price = decimalDto;
            }
            if ((i & 2) == 0) {
                this.ask_quantity = null;
            } else {
                this.ask_quantity = decimalDto2;
            }
            if ((i & 4) == 0) {
                this.bid_venue = VenueDto.INSTANCE.getZeroValue();
            } else {
                this.bid_venue = venueDto;
            }
            if ((i & 8) == 0) {
                this.bid_price = null;
            } else {
                this.bid_price = decimalDto3;
            }
            if ((i & 16) == 0) {
                this.bid_quantity = null;
            } else {
                this.bid_quantity = decimalDto4;
            }
            if ((i & 32) == 0) {
                this.ask_venue = VenueDto.INSTANCE.getZeroValue();
            } else {
                this.ask_venue = venueDto2;
            }
            if ((i & 64) == 0) {
                this.exchange_timestamp = null;
            } else {
                this.exchange_timestamp = timeDto;
            }
            if ((i & 128) == 0) {
                this.mid_price = null;
            } else {
                this.mid_price = decimalDto5;
            }
            if ((i & 256) == 0) {
                this.limit_up_price = null;
            } else {
                this.limit_up_price = decimalDto6;
            }
            if ((i & 512) == 0) {
                this.limit_down_price = null;
            } else {
                this.limit_down_price = decimalDto7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DecimalDto decimalDto = self.ask_price;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.ask_quantity;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            VenueDto venueDto = self.bid_venue;
            VenueDto.Companion companion = VenueDto.INSTANCE;
            if (venueDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, VenueDto.Serializer.INSTANCE, self.bid_venue);
            }
            DecimalDto decimalDto3 = self.bid_price;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            DecimalDto decimalDto4 = self.bid_quantity;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            if (self.ask_venue != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, VenueDto.Serializer.INSTANCE, self.ask_venue);
            }
            TimeDto timeDto = self.exchange_timestamp;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TimeDto.Serializer.INSTANCE, timeDto);
            }
            DecimalDto decimalDto5 = self.mid_price;
            if (decimalDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DecimalDto.Serializer.INSTANCE, decimalDto5);
            }
            DecimalDto decimalDto6 = self.limit_up_price;
            if (decimalDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DecimalDto.Serializer.INSTANCE, decimalDto6);
            }
            DecimalDto decimalDto7 = self.limit_down_price;
            if (decimalDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DecimalDto.Serializer.INSTANCE, decimalDto7);
            }
        }

        public Surrogate(DecimalDto decimalDto, DecimalDto decimalDto2, VenueDto bid_venue, DecimalDto decimalDto3, DecimalDto decimalDto4, VenueDto ask_venue, TimeDto timeDto, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7) {
            Intrinsics.checkNotNullParameter(bid_venue, "bid_venue");
            Intrinsics.checkNotNullParameter(ask_venue, "ask_venue");
            this.ask_price = decimalDto;
            this.ask_quantity = decimalDto2;
            this.bid_venue = bid_venue;
            this.bid_price = decimalDto3;
            this.bid_quantity = decimalDto4;
            this.ask_venue = ask_venue;
            this.exchange_timestamp = timeDto;
            this.mid_price = decimalDto5;
            this.limit_up_price = decimalDto6;
            this.limit_down_price = decimalDto7;
        }

        public final DecimalDto getAsk_price() {
            return this.ask_price;
        }

        public final DecimalDto getAsk_quantity() {
            return this.ask_quantity;
        }

        public final VenueDto getBid_venue() {
            return this.bid_venue;
        }

        public /* synthetic */ Surrogate(DecimalDto decimalDto, DecimalDto decimalDto2, VenueDto venueDto, DecimalDto decimalDto3, DecimalDto decimalDto4, VenueDto venueDto2, TimeDto timeDto, DecimalDto decimalDto5, DecimalDto decimalDto6, DecimalDto decimalDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : decimalDto, (i & 2) != 0 ? null : decimalDto2, (i & 4) != 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto, (i & 8) != 0 ? null : decimalDto3, (i & 16) != 0 ? null : decimalDto4, (i & 32) != 0 ? VenueDto.INSTANCE.getZeroValue() : venueDto2, (i & 64) != 0 ? null : timeDto, (i & 128) != 0 ? null : decimalDto5, (i & 256) != 0 ? null : decimalDto6, (i & 512) != 0 ? null : decimalDto7);
        }

        public final DecimalDto getBid_price() {
            return this.bid_price;
        }

        public final DecimalDto getBid_quantity() {
            return this.bid_quantity;
        }

        public final VenueDto getAsk_venue() {
            return this.ask_venue;
        }

        public final TimeDto getExchange_timestamp() {
            return this.exchange_timestamp;
        }

        public final DecimalDto getMid_price() {
            return this.mid_price;
        }

        public final DecimalDto getLimit_up_price() {
            return this.limit_up_price;
        }

        public final DecimalDto getLimit_down_price() {
            return this.limit_down_price;
        }
    }

    /* compiled from: NBBODetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/NBBODetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/NBBODetailsDto;", "Lcom/robinhood/rosetta/mainst/NBBODetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/NBBODetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NBBODetailsDto, NBBODetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NBBODetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NBBODetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NBBODetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) NBBODetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NBBODetails> getProtoAdapter() {
            return NBBODetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NBBODetailsDto getZeroValue() {
            return NBBODetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NBBODetailsDto fromProto(NBBODetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Decimal ask_price = proto.getAsk_price();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DecimalDto decimalDtoFromProto = ask_price != null ? DecimalDto.INSTANCE.fromProto(ask_price) : null;
            Decimal ask_quantity = proto.getAsk_quantity();
            DecimalDto decimalDtoFromProto2 = ask_quantity != null ? DecimalDto.INSTANCE.fromProto(ask_quantity) : null;
            VenueDto.Companion companion = VenueDto.INSTANCE;
            VenueDto venueDtoFromProto = companion.fromProto(proto.getBid_venue());
            Decimal bid_price = proto.getBid_price();
            DecimalDto decimalDtoFromProto3 = bid_price != null ? DecimalDto.INSTANCE.fromProto(bid_price) : null;
            Decimal bid_quantity = proto.getBid_quantity();
            DecimalDto decimalDtoFromProto4 = bid_quantity != null ? DecimalDto.INSTANCE.fromProto(bid_quantity) : null;
            VenueDto venueDtoFromProto2 = companion.fromProto(proto.getAsk_venue());
            Time exchange_timestamp = proto.getExchange_timestamp();
            TimeDto timeDtoFromProto = exchange_timestamp != null ? TimeDto.INSTANCE.fromProto(exchange_timestamp) : null;
            Decimal mid_price = proto.getMid_price();
            DecimalDto decimalDtoFromProto5 = mid_price != null ? DecimalDto.INSTANCE.fromProto(mid_price) : null;
            Decimal limit_up_price = proto.getLimit_up_price();
            DecimalDto decimalDtoFromProto6 = limit_up_price != null ? DecimalDto.INSTANCE.fromProto(limit_up_price) : null;
            Decimal limit_down_price = proto.getLimit_down_price();
            return new NBBODetailsDto(new Surrogate(decimalDtoFromProto, decimalDtoFromProto2, venueDtoFromProto, decimalDtoFromProto3, decimalDtoFromProto4, venueDtoFromProto2, timeDtoFromProto, decimalDtoFromProto5, decimalDtoFromProto6, limit_down_price != null ? DecimalDto.INSTANCE.fromProto(limit_down_price) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.NBBODetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NBBODetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NBBODetailsDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NBBODetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/NBBODetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/NBBODetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/NBBODetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NBBODetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.NBBODetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NBBODetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NBBODetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NBBODetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NBBODetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/NBBODetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.NBBODetailsDto";
        }
    }
}
