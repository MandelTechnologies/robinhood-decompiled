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

/* compiled from: ClientMarketdataDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J>\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$Surrogate;)V", "platform", "", "bid", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "ask", "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "marketable", "", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Z)V", "getPlatform", "()Ljava/lang/String;", "getBid", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getAsk", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getMarketable", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class ClientMarketdataDto implements Dto3<ClientMarketdata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientMarketdataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientMarketdataDto, ClientMarketdata>> binaryBase64Serializer$delegate;
    private static final ClientMarketdataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientMarketdataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientMarketdataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPlatform() {
        return this.surrogate.getPlatform();
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

    public final boolean getMarketable() {
        return this.surrogate.getMarketable();
    }

    public /* synthetic */ ClientMarketdataDto(String str, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : decimalDto, (i & 4) != 0 ? null : decimalDto2, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientMarketdataDto(String platform, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, boolean z) {
        this(new Surrogate(platform, decimalDto, decimalDto2, timeDto, z));
        Intrinsics.checkNotNullParameter(platform, "platform");
    }

    public static /* synthetic */ ClientMarketdataDto copy$default(ClientMarketdataDto clientMarketdataDto, String str, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientMarketdataDto.surrogate.getPlatform();
        }
        if ((i & 2) != 0) {
            decimalDto = clientMarketdataDto.surrogate.getBid();
        }
        if ((i & 4) != 0) {
            decimalDto2 = clientMarketdataDto.surrogate.getAsk();
        }
        if ((i & 8) != 0) {
            timeDto = clientMarketdataDto.surrogate.getTimestamp();
        }
        if ((i & 16) != 0) {
            z = clientMarketdataDto.surrogate.getMarketable();
        }
        boolean z2 = z;
        DecimalDto decimalDto3 = decimalDto2;
        return clientMarketdataDto.copy(str, decimalDto, decimalDto3, timeDto, z2);
    }

    public final ClientMarketdataDto copy(String platform, DecimalDto bid, DecimalDto ask, TimeDto timestamp, boolean marketable) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new ClientMarketdataDto(new Surrogate(platform, bid, ask, timestamp, marketable));
    }

    @Override // com.robinhood.idl.Dto
    public ClientMarketdata toProto() {
        String platform = this.surrogate.getPlatform();
        DecimalDto bid = this.surrogate.getBid();
        Decimal proto = bid != null ? bid.toProto() : null;
        DecimalDto ask = this.surrogate.getAsk();
        Decimal proto2 = ask != null ? ask.toProto() : null;
        TimeDto timestamp = this.surrogate.getTimestamp();
        return new ClientMarketdata(platform, proto, proto2, timestamp != null ? timestamp.toProto() : null, this.surrogate.getMarketable(), null, 32, null);
    }

    public String toString() {
        return "[ClientMarketdataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientMarketdataDto) && Intrinsics.areEqual(((ClientMarketdataDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientMarketdataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003JA\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000eHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 ¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$Surrogate;", "", "platform", "", "bid", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "ask", "timestamp", "Lcom/robinhood/rosetta/mainst/TimeDto;", "marketable", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPlatform$annotations", "()V", "getPlatform", "()Ljava/lang/String;", "getBid$annotations", "getBid", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getAsk$annotations", "getAsk", "getTimestamp$annotations", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getMarketable$annotations", "getMarketable", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto ask;
        private final DecimalDto bid;
        private final boolean marketable;
        private final String platform;
        private final TimeDto timestamp;

        public Surrogate() {
            this((String) null, (DecimalDto) null, (DecimalDto) null, (TimeDto) null, false, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.platform;
            }
            if ((i & 2) != 0) {
                decimalDto = surrogate.bid;
            }
            if ((i & 4) != 0) {
                decimalDto2 = surrogate.ask;
            }
            if ((i & 8) != 0) {
                timeDto = surrogate.timestamp;
            }
            if ((i & 16) != 0) {
                z = surrogate.marketable;
            }
            boolean z2 = z;
            DecimalDto decimalDto3 = decimalDto2;
            return surrogate.copy(str, decimalDto, decimalDto3, timeDto, z2);
        }

        @SerialName("ask")
        @JsonAnnotations2(names = {"ask"})
        public static /* synthetic */ void getAsk$annotations() {
        }

        @SerialName("bid")
        @JsonAnnotations2(names = {"bid"})
        public static /* synthetic */ void getBid$annotations() {
        }

        @SerialName("marketable")
        @JsonAnnotations2(names = {"marketable"})
        public static /* synthetic */ void getMarketable$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final DecimalDto getBid() {
            return this.bid;
        }

        /* renamed from: component3, reason: from getter */
        public final DecimalDto getAsk() {
            return this.ask;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeDto getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getMarketable() {
            return this.marketable;
        }

        public final Surrogate copy(String platform, DecimalDto bid, DecimalDto ask, TimeDto timestamp, boolean marketable) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            return new Surrogate(platform, bid, ask, timestamp, marketable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.platform, surrogate.platform) && Intrinsics.areEqual(this.bid, surrogate.bid) && Intrinsics.areEqual(this.ask, surrogate.ask) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && this.marketable == surrogate.marketable;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            DecimalDto decimalDto = this.bid;
            int iHashCode2 = (iHashCode + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            DecimalDto decimalDto2 = this.ask;
            int iHashCode3 = (iHashCode2 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            TimeDto timeDto = this.timestamp;
            return ((iHashCode3 + (timeDto != null ? timeDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.marketable);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", bid=" + this.bid + ", ask=" + this.ask + ", timestamp=" + this.timestamp + ", marketable=" + this.marketable + ")";
        }

        /* compiled from: ClientMarketdataDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientMarketdataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.bid = null;
            } else {
                this.bid = decimalDto;
            }
            if ((i & 4) == 0) {
                this.ask = null;
            } else {
                this.ask = decimalDto2;
            }
            if ((i & 8) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = timeDto;
            }
            if ((i & 16) == 0) {
                this.marketable = false;
            } else {
                this.marketable = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.platform, "")) {
                output.encodeStringElement(serialDesc, 0, self.platform);
            }
            DecimalDto decimalDto = self.bid;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.ask;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            TimeDto timeDto = self.timestamp;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TimeDto.Serializer.INSTANCE, timeDto);
            }
            boolean z = self.marketable;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
        }

        public Surrogate(String platform, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, boolean z) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            this.platform = platform;
            this.bid = decimalDto;
            this.ask = decimalDto2;
            this.timestamp = timeDto;
            this.marketable = z;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(String str, DecimalDto decimalDto, DecimalDto decimalDto2, TimeDto timeDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : decimalDto, (i & 4) != 0 ? null : decimalDto2, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? false : z);
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

        public final boolean getMarketable() {
            return this.marketable;
        }
    }

    /* compiled from: ClientMarketdataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "Lcom/robinhood/rosetta/mainst/ClientMarketdata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientMarketdataDto, ClientMarketdata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientMarketdataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientMarketdataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientMarketdataDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientMarketdataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientMarketdata> getProtoAdapter() {
            return ClientMarketdata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientMarketdataDto getZeroValue() {
            return ClientMarketdataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientMarketdataDto fromProto(ClientMarketdata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String platform = proto.getPlatform();
            Decimal bid = proto.getBid();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DecimalDto decimalDtoFromProto = bid != null ? DecimalDto.INSTANCE.fromProto(bid) : null;
            Decimal ask = proto.getAsk();
            DecimalDto decimalDtoFromProto2 = ask != null ? DecimalDto.INSTANCE.fromProto(ask) : null;
            Time timestamp = proto.getTimestamp();
            return new ClientMarketdataDto(new Surrogate(platform, decimalDtoFromProto, decimalDtoFromProto2, timestamp != null ? TimeDto.INSTANCE.fromProto(timestamp) : null, proto.getMarketable()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.ClientMarketdataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientMarketdataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientMarketdataDto(null, null, null, null, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientMarketdataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientMarketdataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.ClientMarketdata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientMarketdataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientMarketdataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientMarketdataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientMarketdataDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/ClientMarketdataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.ClientMarketdataDto";
        }
    }
}
