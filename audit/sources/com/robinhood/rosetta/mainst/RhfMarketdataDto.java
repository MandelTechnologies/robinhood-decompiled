package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: RhfMarketdataDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\rJ*\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/RhfMarketdata;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$Surrogate;)V", "bid", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "ask", "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "(Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;)V", "getBid", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getAsk", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class RhfMarketdataDto implements Dto3<RhfMarketdata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RhfMarketdataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RhfMarketdataDto, RhfMarketdata>> binaryBase64Serializer$delegate;
    private static final RhfMarketdataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RhfMarketdataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RhfMarketdataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DecimalDto getBid() {
        return this.surrogate.getBid();
    }

    public final DecimalDto getAsk() {
        return this.surrogate.getAsk();
    }

    public final TimeDto getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public /* synthetic */ RhfMarketdataDto(DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : decimalDto, (i & 2) != 0 ? null : decimalDto2, (i & 4) != 0 ? null : timeDto);
    }

    public RhfMarketdataDto(DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto) {
        this(new Surrogate(decimalDto, decimalDto2, timeDto));
    }

    public static /* synthetic */ RhfMarketdataDto copy$default(RhfMarketdataDto rhfMarketdataDto, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            decimalDto = rhfMarketdataDto.surrogate.getBid();
        }
        if ((i & 2) != 0) {
            decimalDto2 = rhfMarketdataDto.surrogate.getAsk();
        }
        if ((i & 4) != 0) {
            timeDto = rhfMarketdataDto.surrogate.getTimestamp();
        }
        return rhfMarketdataDto.copy(decimalDto, decimalDto2, timeDto);
    }

    public final RhfMarketdataDto copy(DecimalDto bid, DecimalDto ask, TimeDto timestamp) {
        return new RhfMarketdataDto(new Surrogate(bid, ask, timestamp));
    }

    @Override // com.robinhood.idl.Dto
    public RhfMarketdata toProto() {
        DecimalDto bid = this.surrogate.getBid();
        Decimal proto = bid != null ? bid.toProto() : null;
        DecimalDto ask = this.surrogate.getAsk();
        Decimal proto2 = ask != null ? ask.toProto() : null;
        TimeDto timestamp = this.surrogate.getTimestamp();
        return new RhfMarketdata(proto, proto2, timestamp != null ? timestamp.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[RhfMarketdataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RhfMarketdataDto) && Intrinsics.areEqual(((RhfMarketdataDto) other).surrogate, this.surrogate);
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
    /* compiled from: RhfMarketdataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002)*B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$Surrogate;", "", "bid", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "ask", "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBid$annotations", "()V", "getBid", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getAsk$annotations", "getAsk", "getTimestamp$annotations", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto ask;
        private final DecimalDto bid;
        private final TimeDto timestamp;

        public Surrogate() {
            this((DecimalDto) null, (DecimalDto) null, (TimeDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                decimalDto = surrogate.bid;
            }
            if ((i & 2) != 0) {
                decimalDto2 = surrogate.ask;
            }
            if ((i & 4) != 0) {
                timeDto = surrogate.timestamp;
            }
            return surrogate.copy(decimalDto, decimalDto2, timeDto);
        }

        @SerialName("ask")
        @JsonAnnotations2(names = {"ask"})
        public static /* synthetic */ void getAsk$annotations() {
        }

        @SerialName("bid")
        @JsonAnnotations2(names = {"bid"})
        public static /* synthetic */ void getBid$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DecimalDto getBid() {
            return this.bid;
        }

        /* renamed from: component2, reason: from getter */
        public final DecimalDto getAsk() {
            return this.ask;
        }

        /* renamed from: component3, reason: from getter */
        public final TimeDto getTimestamp() {
            return this.timestamp;
        }

        public final Surrogate copy(DecimalDto bid, DecimalDto ask, TimeDto timestamp) {
            return new Surrogate(bid, ask, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.bid, surrogate.bid) && Intrinsics.areEqual(this.ask, surrogate.ask) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp);
        }

        public int hashCode() {
            DecimalDto decimalDto = this.bid;
            int iHashCode = (decimalDto == null ? 0 : decimalDto.hashCode()) * 31;
            DecimalDto decimalDto2 = this.ask;
            int iHashCode2 = (iHashCode + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            TimeDto timeDto = this.timestamp;
            return iHashCode2 + (timeDto != null ? timeDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(bid=" + this.bid + ", ask=" + this.ask + ", timestamp=" + this.timestamp + ")";
        }

        /* compiled from: RhfMarketdataDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RhfMarketdataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.bid = null;
            } else {
                this.bid = decimalDto;
            }
            if ((i & 2) == 0) {
                this.ask = null;
            } else {
                this.ask = decimalDto2;
            }
            if ((i & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = timeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DecimalDto decimalDto = self.bid;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.ask;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            TimeDto timeDto = self.timestamp;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TimeDto.Serializer.INSTANCE, timeDto);
            }
        }

        public Surrogate(DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto) {
            this.bid = decimalDto;
            this.ask = decimalDto2;
            this.timestamp = timeDto;
        }

        public /* synthetic */ Surrogate(DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : decimalDto, (i & 2) != 0 ? null : decimalDto2, (i & 4) != 0 ? null : timeDto);
        }

        public final DecimalDto getBid() {
            return this.bid;
        }

        public final DecimalDto getAsk() {
            return this.ask;
        }

        public final TimeDto getTimestamp() {
            return this.timestamp;
        }
    }

    /* compiled from: RhfMarketdataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;", "Lcom/robinhood/rosetta/mainst/RhfMarketdata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RhfMarketdataDto, RhfMarketdata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RhfMarketdataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RhfMarketdataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RhfMarketdataDto> getBinaryBase64Serializer() {
            return (KSerializer) RhfMarketdataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RhfMarketdata> getProtoAdapter() {
            return RhfMarketdata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RhfMarketdataDto getZeroValue() {
            return RhfMarketdataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RhfMarketdataDto fromProto(RhfMarketdata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Decimal bid = proto.getBid();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DecimalDto decimalDtoFromProto = bid != null ? DecimalDto.INSTANCE.fromProto(bid) : null;
            Decimal ask = proto.getAsk();
            DecimalDto decimalDtoFromProto2 = ask != null ? DecimalDto.INSTANCE.fromProto(ask) : null;
            Time timestamp = proto.getTimestamp();
            return new RhfMarketdataDto(new Surrogate(decimalDtoFromProto, decimalDtoFromProto2, timestamp != null ? TimeDto.INSTANCE.fromProto(timestamp) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.RhfMarketdataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhfMarketdataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RhfMarketdataDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RhfMarketdataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/RhfMarketdataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RhfMarketdataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.RhfMarketdata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RhfMarketdataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RhfMarketdataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RhfMarketdataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RhfMarketdataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/RhfMarketdataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.RhfMarketdataDto";
        }
    }
}
