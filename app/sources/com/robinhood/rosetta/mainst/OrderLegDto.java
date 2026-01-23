package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.UUIDDto;
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
import rosetta.mainst.InstrumentType;
import rosetta.mainst.InstrumentTypeDto;
import rosetta.mainst.PositionEffect;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;

/* compiled from: OrderLegDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B_\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0006\u0010\u0017J\\\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\u000bH\u0016J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020\u0012H\u0016J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderLegDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/OrderLeg;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OrderLegDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OrderLegDto$Surrogate;)V", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "id", "", "instrument_id", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "side", "Lrosetta/mainst/SideDto;", "ratio_quantity", "", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/PositionEffectDto;Lrosetta/mainst/SideDto;ILcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getId", "()Ljava/lang/String;", "getInstrument_id", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getSide", "()Lrosetta/mainst/SideDto;", "getRatio_quantity", "()I", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class OrderLegDto implements Dto3<OrderLeg>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderLegDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderLegDto, OrderLeg>> binaryBase64Serializer$delegate;
    private static final OrderLegDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderLegDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderLegDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final UUIDDto getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final PositionEffectDto getPosition_effect() {
        return this.surrogate.getPosition_effect();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final int getRatio_quantity() {
        return this.surrogate.getRatio_quantity();
    }

    public final DecimalDto getCancelled_quantity() {
        return this.surrogate.getCancelled_quantity();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public /* synthetic */ OrderLegDto(UUIDDto uUIDDto, String str, UUIDDto uUIDDto2, PositionEffectDto positionEffectDto, SideDto sideDto, int i, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : uUIDDto2, (i2 & 8) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i2 & 16) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : decimalDto, (i2 & 128) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderLegDto(UUIDDto uUIDDto, String id, UUIDDto uUIDDto2, PositionEffectDto position_effect, SideDto side, int i, DecimalDto decimalDto, InstrumentTypeDto instrument_type) {
        this(new Surrogate(uUIDDto, id, uUIDDto2, position_effect, side, i, decimalDto, instrument_type));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
    }

    public static /* synthetic */ OrderLegDto copy$default(OrderLegDto orderLegDto, UUIDDto uUIDDto, String str, UUIDDto uUIDDto2, PositionEffectDto positionEffectDto, SideDto sideDto, int i, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uUIDDto = orderLegDto.surrogate.getOrder_id();
        }
        if ((i2 & 2) != 0) {
            str = orderLegDto.surrogate.getId();
        }
        if ((i2 & 4) != 0) {
            uUIDDto2 = orderLegDto.surrogate.getInstrument_id();
        }
        if ((i2 & 8) != 0) {
            positionEffectDto = orderLegDto.surrogate.getPosition_effect();
        }
        if ((i2 & 16) != 0) {
            sideDto = orderLegDto.surrogate.getSide();
        }
        if ((i2 & 32) != 0) {
            i = orderLegDto.surrogate.getRatio_quantity();
        }
        if ((i2 & 64) != 0) {
            decimalDto = orderLegDto.surrogate.getCancelled_quantity();
        }
        if ((i2 & 128) != 0) {
            instrumentTypeDto = orderLegDto.surrogate.getInstrument_type();
        }
        DecimalDto decimalDto2 = decimalDto;
        InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
        SideDto sideDto2 = sideDto;
        int i3 = i;
        return orderLegDto.copy(uUIDDto, str, uUIDDto2, positionEffectDto, sideDto2, i3, decimalDto2, instrumentTypeDto2);
    }

    public final OrderLegDto copy(UUIDDto order_id, String id, UUIDDto instrument_id, PositionEffectDto position_effect, SideDto side, int ratio_quantity, DecimalDto cancelled_quantity, InstrumentTypeDto instrument_type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        return new OrderLegDto(new Surrogate(order_id, id, instrument_id, position_effect, side, ratio_quantity, cancelled_quantity, instrument_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderLeg toProto() {
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto = order_id != null ? order_id.toProto() : null;
        String id = this.surrogate.getId();
        UUIDDto instrument_id = this.surrogate.getInstrument_id();
        UUID proto2 = instrument_id != null ? instrument_id.toProto() : null;
        PositionEffect positionEffect = (PositionEffect) this.surrogate.getPosition_effect().toProto();
        Side side = (Side) this.surrogate.getSide().toProto();
        int ratio_quantity = this.surrogate.getRatio_quantity();
        DecimalDto cancelled_quantity = this.surrogate.getCancelled_quantity();
        return new OrderLeg(proto, id, proto2, positionEffect, side, ratio_quantity, cancelled_quantity != null ? cancelled_quantity.toProto() : null, (InstrumentType) this.surrogate.getInstrument_type().toProto(), null, 256, null);
    }

    public String toString() {
        return "[OrderLegDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderLegDto) && Intrinsics.areEqual(((OrderLegDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderLegDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002HIBl\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015Bi\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u0019J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u0018\u00107\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003Jn\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\fHÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001J%\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001¢\u0006\u0002\bGR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010(R+\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010+R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010.R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001b\u001a\u0004\b0\u00101¨\u0006J"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderLegDto$Surrogate;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "id", "", "instrument_id", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "side", "Lrosetta/mainst/SideDto;", "ratio_quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/PositionEffectDto;Lrosetta/mainst/SideDto;ILcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/PositionEffectDto;Lrosetta/mainst/SideDto;ILcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getId$annotations", "getId", "()Ljava/lang/String;", "getInstrument_id$annotations", "getInstrument_id", "getPosition_effect$annotations", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getRatio_quantity$annotations", "getRatio_quantity", "()I", "getCancelled_quantity$annotations", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getInstrument_type$annotations", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto cancelled_quantity;
        private final String id;
        private final UUIDDto instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final UUIDDto order_id;
        private final PositionEffectDto position_effect;
        private final int ratio_quantity;
        private final SideDto side;

        public Surrogate() {
            this((UUIDDto) null, (String) null, (UUIDDto) null, (PositionEffectDto) null, (SideDto) null, 0, (DecimalDto) null, (InstrumentTypeDto) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, String str, UUIDDto uUIDDto2, PositionEffectDto positionEffectDto, SideDto sideDto, int i, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uUIDDto = surrogate.order_id;
            }
            if ((i2 & 2) != 0) {
                str = surrogate.id;
            }
            if ((i2 & 4) != 0) {
                uUIDDto2 = surrogate.instrument_id;
            }
            if ((i2 & 8) != 0) {
                positionEffectDto = surrogate.position_effect;
            }
            if ((i2 & 16) != 0) {
                sideDto = surrogate.side;
            }
            if ((i2 & 32) != 0) {
                i = surrogate.ratio_quantity;
            }
            if ((i2 & 64) != 0) {
                decimalDto = surrogate.cancelled_quantity;
            }
            if ((i2 & 128) != 0) {
                instrumentTypeDto = surrogate.instrument_type;
            }
            DecimalDto decimalDto2 = decimalDto;
            InstrumentTypeDto instrumentTypeDto2 = instrumentTypeDto;
            SideDto sideDto2 = sideDto;
            int i3 = i;
            return surrogate.copy(uUIDDto, str, uUIDDto2, positionEffectDto, sideDto2, i3, decimalDto2, instrumentTypeDto2);
        }

        @SerialName("cancelledQuantity")
        @JsonAnnotations2(names = {"cancelled_quantity"})
        public static /* synthetic */ void getCancelled_quantity$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("positionEffect")
        @JsonAnnotations2(names = {"position_effect"})
        public static /* synthetic */ void getPosition_effect$annotations() {
        }

        @SerialName("ratioQuantity")
        @JsonAnnotations2(names = {"ratio_quantity"})
        public static /* synthetic */ void getRatio_quantity$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component4, reason: from getter */
        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component5, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        /* renamed from: component7, reason: from getter */
        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        /* renamed from: component8, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final Surrogate copy(UUIDDto order_id, String id, UUIDDto instrument_id, PositionEffectDto position_effect, SideDto side, int ratio_quantity, DecimalDto cancelled_quantity, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            return new Surrogate(order_id, id, instrument_id, position_effect, side, ratio_quantity, cancelled_quantity, instrument_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && this.position_effect == surrogate.position_effect && this.side == surrogate.side && this.ratio_quantity == surrogate.ratio_quantity && Intrinsics.areEqual(this.cancelled_quantity, surrogate.cancelled_quantity) && this.instrument_type == surrogate.instrument_type;
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.order_id;
            int iHashCode = (((uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31) + this.id.hashCode()) * 31;
            UUIDDto uUIDDto2 = this.instrument_id;
            int iHashCode2 = (((((((iHashCode + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31) + this.position_effect.hashCode()) * 31) + this.side.hashCode()) * 31) + Integer.hashCode(this.ratio_quantity)) * 31;
            DecimalDto decimalDto = this.cancelled_quantity;
            return ((iHashCode2 + (decimalDto != null ? decimalDto.hashCode() : 0)) * 31) + this.instrument_type.hashCode();
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", id=" + this.id + ", instrument_id=" + this.instrument_id + ", position_effect=" + this.position_effect + ", side=" + this.side + ", ratio_quantity=" + this.ratio_quantity + ", cancelled_quantity=" + this.cancelled_quantity + ", instrument_type=" + this.instrument_type + ")";
        }

        /* compiled from: OrderLegDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderLegDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderLegDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderLegDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, String str, UUIDDto uUIDDto2, PositionEffectDto positionEffectDto, SideDto sideDto, int i2, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 4) == 0) {
                this.instrument_id = null;
            } else {
                this.instrument_id = uUIDDto2;
            }
            if ((i & 8) == 0) {
                this.position_effect = PositionEffectDto.INSTANCE.getZeroValue();
            } else {
                this.position_effect = positionEffectDto;
            }
            if ((i & 16) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 32) == 0) {
                this.ratio_quantity = 0;
            } else {
                this.ratio_quantity = i2;
            }
            if ((i & 64) == 0) {
                this.cancelled_quantity = null;
            } else {
                this.cancelled_quantity = decimalDto;
            }
            if ((i & 128) == 0) {
                this.instrument_type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_type = instrumentTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.order_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 1, self.id);
            }
            UUIDDto uUIDDto2 = self.instrument_id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            if (self.position_effect != PositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, PositionEffectDto.Serializer.INSTANCE, self.position_effect);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, SideDto.Serializer.INSTANCE, self.side);
            }
            int i = self.ratio_quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            DecimalDto decimalDto = self.cancelled_quantity;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
        }

        public Surrogate(UUIDDto uUIDDto, String id, UUIDDto uUIDDto2, PositionEffectDto position_effect, SideDto side, int i, DecimalDto decimalDto, InstrumentTypeDto instrument_type) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            this.order_id = uUIDDto;
            this.id = id;
            this.instrument_id = uUIDDto2;
            this.position_effect = position_effect;
            this.side = side;
            this.ratio_quantity = i;
            this.cancelled_quantity = decimalDto;
            this.instrument_type = instrument_type;
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, String str, UUIDDto uUIDDto2, PositionEffectDto positionEffectDto, SideDto sideDto, int i, DecimalDto decimalDto, InstrumentTypeDto instrumentTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : uUIDDto2, (i2 & 8) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i2 & 16) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : decimalDto, (i2 & 128) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto);
        }

        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }
    }

    /* compiled from: OrderLegDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderLegDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderLegDto;", "Lcom/robinhood/rosetta/mainst/OrderLeg;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OrderLegDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderLegDto, OrderLeg> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderLegDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderLegDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderLegDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderLegDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderLeg> getProtoAdapter() {
            return OrderLeg.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderLegDto getZeroValue() {
            return OrderLegDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderLegDto fromProto(OrderLeg proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID order_id = proto.getOrder_id();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            String id = proto.getId();
            UUID instrument_id = proto.getInstrument_id();
            UUIDDto uUIDDtoFromProto2 = instrument_id != null ? UUIDDto.INSTANCE.fromProto(instrument_id) : null;
            PositionEffectDto positionEffectDtoFromProto = PositionEffectDto.INSTANCE.fromProto(proto.getPosition_effect());
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            int ratio_quantity = proto.getRatio_quantity();
            Decimal cancelled_quantity = proto.getCancelled_quantity();
            return new OrderLegDto(new Surrogate(uUIDDtoFromProto, id, uUIDDtoFromProto2, positionEffectDtoFromProto, sideDtoFromProto, ratio_quantity, cancelled_quantity != null ? DecimalDto.INSTANCE.fromProto(cancelled_quantity) : null, InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OrderLegDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderLegDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OrderLegDto(null, null, null, null, null, 0, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderLegDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderLegDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderLegDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OrderLegDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderLegDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.OrderLeg", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderLegDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderLegDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderLegDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderLegDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderLegDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OrderLegDto";
        }
    }
}
