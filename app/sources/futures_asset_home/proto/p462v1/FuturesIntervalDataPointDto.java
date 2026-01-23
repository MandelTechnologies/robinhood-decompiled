package futures_asset_home.proto.p462v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.squareup.wire.ProtoAdapter;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: FuturesIntervalDataPointDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006*"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto;", "Lcom/robinhood/idl/MessageDto;", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPoint;", "Landroid/os/Parcelable;", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Surrogate;", "surrogate", "<init>", "(Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Surrogate;)V", "", "start_time", "end_time", "", "interval_pnl", "Lcom/robinhood/rosetta/common/DateDto;", "start_trade_date", "end_trade_date", "(JJDLcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;)V", "toProto", "()Lfutures_asset_home/proto/v1/FuturesIntervalDataPoint;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class FuturesIntervalDataPointDto implements Dto3<FuturesIntervalDataPoint>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesIntervalDataPointDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesIntervalDataPointDto, FuturesIntervalDataPoint>> binaryBase64Serializer$delegate;
    private static final FuturesIntervalDataPointDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesIntervalDataPointDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesIntervalDataPointDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ FuturesIntervalDataPointDto(long j, long j2, double d, DateDto dateDto, DateDto dateDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : dateDto, (i & 16) != 0 ? null : dateDto2);
    }

    public FuturesIntervalDataPointDto(long j, long j2, double d, DateDto dateDto, DateDto dateDto2) {
        this(new Surrogate(j, j2, d, dateDto, dateDto2));
    }

    @Override // com.robinhood.idl.Dto
    public FuturesIntervalDataPoint toProto() {
        long start_time = this.surrogate.getStart_time();
        long end_time = this.surrogate.getEnd_time();
        double interval_pnl = this.surrogate.getInterval_pnl();
        DateDto start_trade_date = this.surrogate.getStart_trade_date();
        Date proto = start_trade_date != null ? start_trade_date.toProto() : null;
        DateDto end_trade_date = this.surrogate.getEnd_trade_date();
        return new FuturesIntervalDataPoint(start_time, end_time, interval_pnl, proto, end_trade_date != null ? end_trade_date.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[FuturesIntervalDataPointDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesIntervalDataPointDto) && Intrinsics.areEqual(((FuturesIntervalDataPointDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesIntervalDataPointDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298Bj\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\n\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBG\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010)R/\u0010\n\u001a\u00110\b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010+\u001a\u0004\b/\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b7\u0010+\u001a\u0004\b6\u00104¨\u0006:"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Surrogate;", "", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "start_time", "end_time", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "interval_pnl", "Lcom/robinhood/rosetta/common/DateDto;", "start_trade_date", "end_trade_date", "<init>", "(JJDLcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJJDLcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$futures_asset_home_proto_v1_externalRelease", "(Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getStart_time", "()J", "getStart_time$annotations", "()V", "getEnd_time", "getEnd_time$annotations", "D", "getInterval_pnl", "()D", "getInterval_pnl$annotations", "Lcom/robinhood/rosetta/common/DateDto;", "getStart_trade_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getStart_trade_date$annotations", "getEnd_trade_date", "getEnd_trade_date$annotations", "Companion", "$serializer", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long end_time;
        private final DateDto end_trade_date;
        private final double interval_pnl;
        private final long start_time;
        private final DateDto start_trade_date;

        public Surrogate() {
            this(0L, 0L, 0.0d, (DateDto) null, (DateDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.start_time == surrogate.start_time && this.end_time == surrogate.end_time && Double.compare(this.interval_pnl, surrogate.interval_pnl) == 0 && Intrinsics.areEqual(this.start_trade_date, surrogate.start_trade_date) && Intrinsics.areEqual(this.end_trade_date, surrogate.end_trade_date);
        }

        public int hashCode() {
            int iHashCode = ((((Long.hashCode(this.start_time) * 31) + Long.hashCode(this.end_time)) * 31) + Double.hashCode(this.interval_pnl)) * 31;
            DateDto dateDto = this.start_trade_date;
            int iHashCode2 = (iHashCode + (dateDto == null ? 0 : dateDto.hashCode())) * 31;
            DateDto dateDto2 = this.end_trade_date;
            return iHashCode2 + (dateDto2 != null ? dateDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(start_time=" + this.start_time + ", end_time=" + this.end_time + ", interval_pnl=" + this.interval_pnl + ", start_trade_date=" + this.start_trade_date + ", end_trade_date=" + this.end_trade_date + ")";
        }

        /* compiled from: FuturesIntervalDataPointDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Surrogate;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesIntervalDataPointDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, long j, long j2, double d, DateDto dateDto, DateDto dateDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.start_time = 0L;
            } else {
                this.start_time = j;
            }
            if ((i & 2) == 0) {
                this.end_time = 0L;
            } else {
                this.end_time = j2;
            }
            if ((i & 4) == 0) {
                this.interval_pnl = 0.0d;
            } else {
                this.interval_pnl = d;
            }
            if ((i & 8) == 0) {
                this.start_trade_date = null;
            } else {
                this.start_trade_date = dateDto;
            }
            if ((i & 16) == 0) {
                this.end_trade_date = null;
            } else {
                this.end_trade_date = dateDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$futures_asset_home_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            long j = self.start_time;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            long j2 = self.end_time;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            if (Double.compare(self.interval_pnl, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.interval_pnl));
            }
            DateDto dateDto = self.start_trade_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DateDto.Serializer.INSTANCE, dateDto);
            }
            DateDto dateDto2 = self.end_trade_date;
            if (dateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DateDto.Serializer.INSTANCE, dateDto2);
            }
        }

        public Surrogate(long j, long j2, double d, DateDto dateDto, DateDto dateDto2) {
            this.start_time = j;
            this.end_time = j2;
            this.interval_pnl = d;
            this.start_trade_date = dateDto;
            this.end_trade_date = dateDto2;
        }

        public /* synthetic */ Surrogate(long j, long j2, double d, DateDto dateDto, DateDto dateDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : dateDto, (i & 16) != 0 ? null : dateDto2);
        }

        public final long getStart_time() {
            return this.start_time;
        }

        public final long getEnd_time() {
            return this.end_time;
        }

        public final double getInterval_pnl() {
            return this.interval_pnl;
        }

        public final DateDto getStart_trade_date() {
            return this.start_trade_date;
        }

        public final DateDto getEnd_trade_date() {
            return this.end_trade_date;
        }
    }

    /* compiled from: FuturesIntervalDataPointDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto;", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesIntervalDataPointDto, FuturesIntervalDataPoint> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesIntervalDataPointDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesIntervalDataPointDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesIntervalDataPointDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesIntervalDataPointDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesIntervalDataPoint> getProtoAdapter() {
            return FuturesIntervalDataPoint.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesIntervalDataPointDto getZeroValue() {
            return FuturesIntervalDataPointDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesIntervalDataPointDto fromProto(FuturesIntervalDataPoint proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            long start_time = proto.getStart_time();
            long end_time = proto.getEnd_time();
            double interval_pnl = proto.getInterval_pnl();
            Date start_trade_date = proto.getStart_trade_date();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DateDto dateDtoFromProto = start_trade_date != null ? DateDto.INSTANCE.fromProto(start_trade_date) : null;
            Date end_trade_date = proto.getEnd_trade_date();
            return new FuturesIntervalDataPointDto(new Surrogate(start_time, end_time, interval_pnl, dateDtoFromProto, end_trade_date != null ? DateDto.INSTANCE.fromProto(end_trade_date) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: futures_asset_home.proto.v1.FuturesIntervalDataPointDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesIntervalDataPointDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesIntervalDataPointDto(0L, 0L, 0.0d, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesIntervalDataPointDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto;", "<init>", "()V", "surrogateSerializer", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesIntervalDataPointDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/futures_asset_home.proto.v1.FuturesIntervalDataPoint", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesIntervalDataPointDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesIntervalDataPointDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesIntervalDataPointDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesIntervalDataPointDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "futures_asset_home.proto.v1.FuturesIntervalDataPointDto";
        }
    }
}
