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
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.BandwidthDto;
import com.robinhood.rosetta.eventlogging.NetworkConnection;
import com.robinhood.rosetta.eventlogging.NetworkConnectionDto;
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

/* compiled from: NetworkConnectionDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0010J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$Surrogate;)V", "connection_type", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "is_metered", "", "signal_level", "", "link_bandwidth", "Lcom/robinhood/rosetta/eventlogging/BandwidthDto;", "(Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;ZFLcom/robinhood/rosetta/eventlogging/BandwidthDto;)V", "getConnection_type", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "()Z", "getSignal_level", "()F", "getLink_bandwidth", "()Lcom/robinhood/rosetta/eventlogging/BandwidthDto;", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ConnectionTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NetworkConnectionDto implements Dto3<NetworkConnection>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NetworkConnectionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NetworkConnectionDto, NetworkConnection>> binaryBase64Serializer$delegate;
    private static final NetworkConnectionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NetworkConnectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NetworkConnectionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ConnectionTypeDto getConnection_type() {
        return this.surrogate.getConnection_type();
    }

    public final boolean is_metered() {
        return this.surrogate.is_metered();
    }

    public final float getSignal_level() {
        return this.surrogate.getSignal_level();
    }

    public final BandwidthDto getLink_bandwidth() {
        return this.surrogate.getLink_bandwidth();
    }

    public /* synthetic */ NetworkConnectionDto(ConnectionTypeDto connectionTypeDto, boolean z, float f, BandwidthDto bandwidthDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ConnectionTypeDto.INSTANCE.getZeroValue() : connectionTypeDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : bandwidthDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkConnectionDto(ConnectionTypeDto connection_type, boolean z, float f, BandwidthDto bandwidthDto) {
        this(new Surrogate(connection_type, z, f, bandwidthDto));
        Intrinsics.checkNotNullParameter(connection_type, "connection_type");
    }

    public static /* synthetic */ NetworkConnectionDto copy$default(NetworkConnectionDto networkConnectionDto, ConnectionTypeDto connectionTypeDto, boolean z, float f, BandwidthDto bandwidthDto, int i, Object obj) {
        if ((i & 1) != 0) {
            connectionTypeDto = networkConnectionDto.surrogate.getConnection_type();
        }
        if ((i & 2) != 0) {
            z = networkConnectionDto.surrogate.is_metered();
        }
        if ((i & 4) != 0) {
            f = networkConnectionDto.surrogate.getSignal_level();
        }
        if ((i & 8) != 0) {
            bandwidthDto = networkConnectionDto.surrogate.getLink_bandwidth();
        }
        return networkConnectionDto.copy(connectionTypeDto, z, f, bandwidthDto);
    }

    public final NetworkConnectionDto copy(ConnectionTypeDto connection_type, boolean is_metered, float signal_level, BandwidthDto link_bandwidth) {
        Intrinsics.checkNotNullParameter(connection_type, "connection_type");
        return new NetworkConnectionDto(new Surrogate(connection_type, is_metered, signal_level, link_bandwidth));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NetworkConnection toProto() {
        NetworkConnection.ConnectionType connectionType = (NetworkConnection.ConnectionType) this.surrogate.getConnection_type().toProto();
        boolean zIs_metered = this.surrogate.is_metered();
        float signal_level = this.surrogate.getSignal_level();
        BandwidthDto link_bandwidth = this.surrogate.getLink_bandwidth();
        return new NetworkConnection(connectionType, zIs_metered, signal_level, link_bandwidth != null ? link_bandwidth.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[NetworkConnectionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NetworkConnectionDto) && Intrinsics.areEqual(((NetworkConnectionDto) other).surrogate, this.surrogate);
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
    /* compiled from: NetworkConnectionDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223B@\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eB?\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003JB\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0010HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0004\u0010\u0019R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$Surrogate;", "", "connection_type", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "is_metered", "", "signal_level", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "link_bandwidth", "Lcom/robinhood/rosetta/eventlogging/BandwidthDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;ZFLcom/robinhood/rosetta/eventlogging/BandwidthDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;ZFLcom/robinhood/rosetta/eventlogging/BandwidthDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConnection_type$annotations", "()V", "getConnection_type", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "is_metered$annotations", "()Z", "getSignal_level$annotations", "getSignal_level", "()F", "getLink_bandwidth$annotations", "getLink_bandwidth", "()Lcom/robinhood/rosetta/eventlogging/BandwidthDto;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ConnectionTypeDto connection_type;
        private final boolean is_metered;
        private final BandwidthDto link_bandwidth;
        private final float signal_level;

        public Surrogate() {
            this((ConnectionTypeDto) null, false, 0.0f, (BandwidthDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ConnectionTypeDto connectionTypeDto, boolean z, float f, BandwidthDto bandwidthDto, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionTypeDto = surrogate.connection_type;
            }
            if ((i & 2) != 0) {
                z = surrogate.is_metered;
            }
            if ((i & 4) != 0) {
                f = surrogate.signal_level;
            }
            if ((i & 8) != 0) {
                bandwidthDto = surrogate.link_bandwidth;
            }
            return surrogate.copy(connectionTypeDto, z, f, bandwidthDto);
        }

        @SerialName("connectionType")
        @JsonAnnotations2(names = {"connection_type"})
        public static /* synthetic */ void getConnection_type$annotations() {
        }

        @SerialName("linkBandwidth")
        @JsonAnnotations2(names = {"link_bandwidth"})
        public static /* synthetic */ void getLink_bandwidth$annotations() {
        }

        @SerialName("signalLevel")
        @JsonAnnotations2(names = {"signal_level"})
        public static /* synthetic */ void getSignal_level$annotations() {
        }

        @SerialName("isMetered")
        @JsonAnnotations2(names = {"is_metered"})
        public static /* synthetic */ void is_metered$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ConnectionTypeDto getConnection_type() {
            return this.connection_type;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIs_metered() {
            return this.is_metered;
        }

        /* renamed from: component3, reason: from getter */
        public final float getSignal_level() {
            return this.signal_level;
        }

        /* renamed from: component4, reason: from getter */
        public final BandwidthDto getLink_bandwidth() {
            return this.link_bandwidth;
        }

        public final Surrogate copy(ConnectionTypeDto connection_type, boolean is_metered, float signal_level, BandwidthDto link_bandwidth) {
            Intrinsics.checkNotNullParameter(connection_type, "connection_type");
            return new Surrogate(connection_type, is_metered, signal_level, link_bandwidth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.connection_type == surrogate.connection_type && this.is_metered == surrogate.is_metered && Float.compare(this.signal_level, surrogate.signal_level) == 0 && Intrinsics.areEqual(this.link_bandwidth, surrogate.link_bandwidth);
        }

        public int hashCode() {
            int iHashCode = ((((this.connection_type.hashCode() * 31) + java.lang.Boolean.hashCode(this.is_metered)) * 31) + Float.hashCode(this.signal_level)) * 31;
            BandwidthDto bandwidthDto = this.link_bandwidth;
            return iHashCode + (bandwidthDto == null ? 0 : bandwidthDto.hashCode());
        }

        public String toString() {
            return "Surrogate(connection_type=" + this.connection_type + ", is_metered=" + this.is_metered + ", signal_level=" + this.signal_level + ", link_bandwidth=" + this.link_bandwidth + ")";
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NetworkConnectionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ConnectionTypeDto connectionTypeDto, boolean z, float f, BandwidthDto bandwidthDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.connection_type = (i & 1) == 0 ? ConnectionTypeDto.INSTANCE.getZeroValue() : connectionTypeDto;
            if ((i & 2) == 0) {
                this.is_metered = false;
            } else {
                this.is_metered = z;
            }
            if ((i & 4) == 0) {
                this.signal_level = 0.0f;
            } else {
                this.signal_level = f;
            }
            if ((i & 8) == 0) {
                this.link_bandwidth = null;
            } else {
                this.link_bandwidth = bandwidthDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.connection_type != ConnectionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ConnectionTypeDto.Serializer.INSTANCE, self.connection_type);
            }
            boolean z = self.is_metered;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            if (Float.compare(self.signal_level, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.signal_level));
            }
            BandwidthDto bandwidthDto = self.link_bandwidth;
            if (bandwidthDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BandwidthDto.Serializer.INSTANCE, bandwidthDto);
            }
        }

        public Surrogate(ConnectionTypeDto connection_type, boolean z, float f, BandwidthDto bandwidthDto) {
            Intrinsics.checkNotNullParameter(connection_type, "connection_type");
            this.connection_type = connection_type;
            this.is_metered = z;
            this.signal_level = f;
            this.link_bandwidth = bandwidthDto;
        }

        public final ConnectionTypeDto getConnection_type() {
            return this.connection_type;
        }

        public /* synthetic */ Surrogate(ConnectionTypeDto connectionTypeDto, boolean z, float f, BandwidthDto bandwidthDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ConnectionTypeDto.INSTANCE.getZeroValue() : connectionTypeDto, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? null : bandwidthDto);
        }

        public final boolean is_metered() {
            return this.is_metered;
        }

        public final float getSignal_level() {
            return this.signal_level;
        }

        public final BandwidthDto getLink_bandwidth() {
            return this.link_bandwidth;
        }
    }

    /* compiled from: NetworkConnectionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<NetworkConnectionDto, NetworkConnection> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NetworkConnectionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NetworkConnectionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NetworkConnectionDto> getBinaryBase64Serializer() {
            return (KSerializer) NetworkConnectionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NetworkConnection> getProtoAdapter() {
            return NetworkConnection.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NetworkConnectionDto getZeroValue() {
            return NetworkConnectionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NetworkConnectionDto fromProto(NetworkConnection proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ConnectionTypeDto connectionTypeDtoFromProto = ConnectionTypeDto.INSTANCE.fromProto(proto.getConnection_type());
            boolean is_metered = proto.getIs_metered();
            float signal_level = proto.getSignal_level();
            Bandwidth link_bandwidth = proto.getLink_bandwidth();
            return new NetworkConnectionDto(new Surrogate(connectionTypeDtoFromProto, is_metered, signal_level, link_bandwidth != null ? BandwidthDto.INSTANCE.fromProto(link_bandwidth) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NetworkConnectionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetworkConnectionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NetworkConnectionDto(null, false, 0.0f, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkConnectionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTION_TYPE_UNSPECIFIED", "WIFI", "CELLULAR", "NOT_CONNECTED", "BLUETOOTH", "ETHERNET", "VPN", "WIFI_AWARE", "LOWPAN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ConnectionTypeDto implements Dto2<NetworkConnection.ConnectionType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConnectionTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ConnectionTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ConnectionTypeDto, NetworkConnection.ConnectionType>> binaryBase64Serializer$delegate;
        public static final ConnectionTypeDto CONNECTION_TYPE_UNSPECIFIED = new CONNECTION_TYPE_UNSPECIFIED("CONNECTION_TYPE_UNSPECIFIED", 0);
        public static final ConnectionTypeDto WIFI = new WIFI("WIFI", 1);
        public static final ConnectionTypeDto CELLULAR = new CELLULAR("CELLULAR", 2);
        public static final ConnectionTypeDto NOT_CONNECTED = new NOT_CONNECTED("NOT_CONNECTED", 3);
        public static final ConnectionTypeDto BLUETOOTH = new BLUETOOTH("BLUETOOTH", 4);
        public static final ConnectionTypeDto ETHERNET = new ETHERNET("ETHERNET", 5);
        public static final ConnectionTypeDto VPN = new VPN("VPN", 6);
        public static final ConnectionTypeDto WIFI_AWARE = new WIFI_AWARE("WIFI_AWARE", 7);
        public static final ConnectionTypeDto LOWPAN = new LOWPAN("LOWPAN", 8);

        private static final /* synthetic */ ConnectionTypeDto[] $values() {
            return new ConnectionTypeDto[]{CONNECTION_TYPE_UNSPECIFIED, WIFI, CELLULAR, NOT_CONNECTED, BLUETOOTH, ETHERNET, VPN, WIFI_AWARE, LOWPAN};
        }

        public /* synthetic */ ConnectionTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ConnectionTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.CONNECTION_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECTION_TYPE_UNSPECIFIED extends ConnectionTypeDto {
            CONNECTION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
            }
        }

        private ConnectionTypeDto(String str, int i) {
        }

        static {
            ConnectionTypeDto[] connectionTypeDtoArr$values = $values();
            $VALUES = connectionTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(connectionTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NetworkConnectionDto$ConnectionTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetworkConnectionDto.ConnectionTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.WIFI", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WIFI extends ConnectionTypeDto {
            WIFI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.WIFI;
            }
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.CELLULAR", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CELLULAR extends ConnectionTypeDto {
            CELLULAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.CELLULAR;
            }
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.NOT_CONNECTED", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOT_CONNECTED extends ConnectionTypeDto {
            NOT_CONNECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.NOT_CONNECTED;
            }
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.BLUETOOTH", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BLUETOOTH extends ConnectionTypeDto {
            BLUETOOTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.BLUETOOTH;
            }
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.ETHERNET", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ETHERNET extends ConnectionTypeDto {
            ETHERNET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.ETHERNET;
            }
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.VPN", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VPN extends ConnectionTypeDto {
            VPN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.VPN;
            }
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.WIFI_AWARE", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WIFI_AWARE extends ConnectionTypeDto {
            WIFI_AWARE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.WIFI_AWARE;
            }
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkConnectionDto.ConnectionTypeDto.LOWPAN", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOWPAN extends ConnectionTypeDto {
            LOWPAN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkConnection.ConnectionType toProto() {
                return NetworkConnection.ConnectionType.LOWPAN;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection$ConnectionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ConnectionTypeDto, NetworkConnection.ConnectionType> {

            /* compiled from: NetworkConnectionDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NetworkConnection.ConnectionType.values().length];
                    try {
                        iArr[NetworkConnection.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NetworkConnection.ConnectionType.WIFI.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NetworkConnection.ConnectionType.CELLULAR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NetworkConnection.ConnectionType.NOT_CONNECTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[NetworkConnection.ConnectionType.BLUETOOTH.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[NetworkConnection.ConnectionType.ETHERNET.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[NetworkConnection.ConnectionType.VPN.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[NetworkConnection.ConnectionType.WIFI_AWARE.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[NetworkConnection.ConnectionType.LOWPAN.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ConnectionTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ConnectionTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ConnectionTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ConnectionTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NetworkConnection.ConnectionType> getProtoAdapter() {
                return NetworkConnection.ConnectionType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConnectionTypeDto getZeroValue() {
                return ConnectionTypeDto.CONNECTION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConnectionTypeDto fromProto(NetworkConnection.ConnectionType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ConnectionTypeDto.CONNECTION_TYPE_UNSPECIFIED;
                    case 2:
                        return ConnectionTypeDto.WIFI;
                    case 3:
                        return ConnectionTypeDto.CELLULAR;
                    case 4:
                        return ConnectionTypeDto.NOT_CONNECTED;
                    case 5:
                        return ConnectionTypeDto.BLUETOOTH;
                    case 6:
                        return ConnectionTypeDto.ETHERNET;
                    case 7:
                        return ConnectionTypeDto.VPN;
                    case 8:
                        return ConnectionTypeDto.WIFI_AWARE;
                    case 9:
                        return ConnectionTypeDto.LOWPAN;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NetworkConnectionDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$ConnectionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ConnectionTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ConnectionTypeDto, NetworkConnection.ConnectionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NetworkConnection.ConnectionType", ConnectionTypeDto.getEntries(), ConnectionTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ConnectionTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ConnectionTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ConnectionTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ConnectionTypeDto valueOf(String str) {
            return (ConnectionTypeDto) Enum.valueOf(ConnectionTypeDto.class, str);
        }

        public static ConnectionTypeDto[] values() {
            return (ConnectionTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NetworkConnectionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NetworkConnectionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NetworkConnection", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NetworkConnectionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NetworkConnectionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NetworkConnectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NetworkConnectionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkConnectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NetworkConnectionDto";
        }
    }
}
