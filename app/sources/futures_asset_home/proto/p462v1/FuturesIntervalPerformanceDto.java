package futures_asset_home.proto.p462v1;

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
import com.squareup.wire.ProtoAdapter;
import futures_asset_home.proto.p462v1.DisplaySpanDto;
import futures_asset_home.proto.p462v1.FuturesIntervalDataPointDto;
import futures_asset_home.proto.p462v1.FuturesIntervalPerformance;
import futures_asset_home.proto.p462v1.FuturesIntervalPerformanceDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: FuturesIntervalPerformanceDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005.-/01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bs\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0006\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,¨\u00062"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto;", "Lcom/robinhood/idl/MessageDto;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance;", "Landroid/os/Parcelable;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Surrogate;", "surrogate", "<init>", "(Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Surrogate;)V", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "futures_performance_interval", "Lfutures_asset_home/proto/v1/DisplaySpanDto;", "display_span", "", "open_pnl", "day_pnl", "total_pnl", "net_return", "total_commissions", "total_fees", "", "market_open", "", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto;", "futures_interval_data_points", "(Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;Lfutures_asset_home/proto/v1/DisplaySpanDto;DDDDDDZLjava/util/List;)V", "toProto", "()Lfutures_asset_home/proto/v1/FuturesIntervalPerformance;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Surrogate;", "Companion", "Surrogate", "FuturesPerformanceIntervalDto", "Serializer", "MultibindingModule", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class FuturesIntervalPerformanceDto implements Dto3<FuturesIntervalPerformance>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesIntervalPerformanceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesIntervalPerformanceDto, FuturesIntervalPerformance>> binaryBase64Serializer$delegate;
    private static final FuturesIntervalPerformanceDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesIntervalPerformanceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesIntervalPerformanceDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ FuturesIntervalPerformanceDto(FuturesPerformanceIntervalDto futuresPerformanceIntervalDto, DisplaySpanDto displaySpanDto, double d, double d2, double d3, double d4, double d5, double d6, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FuturesPerformanceIntervalDto.INSTANCE.getZeroValue() : futuresPerformanceIntervalDto, (i & 2) != 0 ? DisplaySpanDto.INSTANCE.getZeroValue() : displaySpanDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? 0.0d : d3, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) == 0 ? d6 : 0.0d, (i & 256) != 0 ? false : z, (i & 512) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesIntervalPerformanceDto(FuturesPerformanceIntervalDto futures_performance_interval, DisplaySpanDto display_span, double d, double d2, double d3, double d4, double d5, double d6, boolean z, List<FuturesIntervalDataPointDto> futures_interval_data_points) {
        this(new Surrogate(futures_performance_interval, display_span, d, d2, d3, d4, d5, d6, z, futures_interval_data_points));
        Intrinsics.checkNotNullParameter(futures_performance_interval, "futures_performance_interval");
        Intrinsics.checkNotNullParameter(display_span, "display_span");
        Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesIntervalPerformance toProto() {
        FuturesIntervalPerformance.FuturesPerformanceInterval futuresPerformanceInterval = (FuturesIntervalPerformance.FuturesPerformanceInterval) this.surrogate.getFutures_performance_interval().toProto();
        DisplaySpan displaySpan = (DisplaySpan) this.surrogate.getDisplay_span().toProto();
        double open_pnl = this.surrogate.getOpen_pnl();
        double day_pnl = this.surrogate.getDay_pnl();
        double total_pnl = this.surrogate.getTotal_pnl();
        double net_return = this.surrogate.getNet_return();
        double total_commissions = this.surrogate.getTotal_commissions();
        double total_fees = this.surrogate.getTotal_fees();
        boolean market_open = this.surrogate.getMarket_open();
        List<FuturesIntervalDataPointDto> futures_interval_data_points = this.surrogate.getFutures_interval_data_points();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(futures_interval_data_points, 10));
        Iterator<T> it = futures_interval_data_points.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesIntervalDataPointDto) it.next()).toProto());
        }
        return new FuturesIntervalPerformance(futuresPerformanceInterval, displaySpan, open_pnl, day_pnl, total_pnl, net_return, total_commissions, total_fees, market_open, arrayList, null, 1024, null);
    }

    public String toString() {
        return "[FuturesIntervalPerformanceDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesIntervalPerformanceDto) && Intrinsics.areEqual(((FuturesIntervalPerformanceDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesIntervalPerformanceDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b)\b\u0083\b\u0018\u0000 L2\u00020\u0001:\u0002MLBË\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016Bw\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b9\u00101\u001a\u0004\b7\u00108R/\u0010\u000b\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b;\u00101\u001a\u0004\b:\u00108R/\u0010\f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b=\u00101\u001a\u0004\b<\u00108R/\u0010\r\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b?\u00101\u001a\u0004\b>\u00108R/\u0010\u000e\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\bA\u00101\u001a\u0004\b@\u00108R/\u0010\u000f\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00106\u0012\u0004\bC\u00101\u001a\u0004\bB\u00108R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010D\u0012\u0004\bG\u00101\u001a\u0004\bE\u0010FR&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010H\u0012\u0004\bK\u00101\u001a\u0004\bI\u0010J¨\u0006N"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Surrogate;", "", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "futures_performance_interval", "Lfutures_asset_home/proto/v1/DisplaySpanDto;", "display_span", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "open_pnl", "day_pnl", "total_pnl", "net_return", "total_commissions", "total_fees", "", "market_open", "", "Lfutures_asset_home/proto/v1/FuturesIntervalDataPointDto;", "futures_interval_data_points", "<init>", "(Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;Lfutures_asset_home/proto/v1/DisplaySpanDto;DDDDDDZLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;Lfutures_asset_home/proto/v1/DisplaySpanDto;DDDDDDZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$futures_asset_home_proto_v1_externalRelease", "(Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "getFutures_performance_interval", "()Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "getFutures_performance_interval$annotations", "()V", "Lfutures_asset_home/proto/v1/DisplaySpanDto;", "getDisplay_span", "()Lfutures_asset_home/proto/v1/DisplaySpanDto;", "getDisplay_span$annotations", "D", "getOpen_pnl", "()D", "getOpen_pnl$annotations", "getDay_pnl", "getDay_pnl$annotations", "getTotal_pnl", "getTotal_pnl$annotations", "getNet_return", "getNet_return$annotations", "getTotal_commissions", "getTotal_commissions$annotations", "getTotal_fees", "getTotal_fees$annotations", "Z", "getMarket_open", "()Z", "getMarket_open$annotations", "Ljava/util/List;", "getFutures_interval_data_points", "()Ljava/util/List;", "getFutures_interval_data_points$annotations", "Companion", "$serializer", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final double day_pnl;
        private final DisplaySpanDto display_span;
        private final List<FuturesIntervalDataPointDto> futures_interval_data_points;
        private final FuturesPerformanceIntervalDto futures_performance_interval;
        private final boolean market_open;
        private final double net_return;
        private final double open_pnl;
        private final double total_commissions;
        private final double total_fees;
        private final double total_pnl;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: futures_asset_home.proto.v1.FuturesIntervalPerformanceDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesIntervalPerformanceDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((FuturesPerformanceIntervalDto) null, (DisplaySpanDto) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, (List) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FuturesIntervalDataPointDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.futures_performance_interval == surrogate.futures_performance_interval && this.display_span == surrogate.display_span && Double.compare(this.open_pnl, surrogate.open_pnl) == 0 && Double.compare(this.day_pnl, surrogate.day_pnl) == 0 && Double.compare(this.total_pnl, surrogate.total_pnl) == 0 && Double.compare(this.net_return, surrogate.net_return) == 0 && Double.compare(this.total_commissions, surrogate.total_commissions) == 0 && Double.compare(this.total_fees, surrogate.total_fees) == 0 && this.market_open == surrogate.market_open && Intrinsics.areEqual(this.futures_interval_data_points, surrogate.futures_interval_data_points);
        }

        public int hashCode() {
            return (((((((((((((((((this.futures_performance_interval.hashCode() * 31) + this.display_span.hashCode()) * 31) + Double.hashCode(this.open_pnl)) * 31) + Double.hashCode(this.day_pnl)) * 31) + Double.hashCode(this.total_pnl)) * 31) + Double.hashCode(this.net_return)) * 31) + Double.hashCode(this.total_commissions)) * 31) + Double.hashCode(this.total_fees)) * 31) + Boolean.hashCode(this.market_open)) * 31) + this.futures_interval_data_points.hashCode();
        }

        public String toString() {
            return "Surrogate(futures_performance_interval=" + this.futures_performance_interval + ", display_span=" + this.display_span + ", open_pnl=" + this.open_pnl + ", day_pnl=" + this.day_pnl + ", total_pnl=" + this.total_pnl + ", net_return=" + this.net_return + ", total_commissions=" + this.total_commissions + ", total_fees=" + this.total_fees + ", market_open=" + this.market_open + ", futures_interval_data_points=" + this.futures_interval_data_points + ")";
        }

        /* compiled from: FuturesIntervalPerformanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Surrogate;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesIntervalPerformanceDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FuturesPerformanceIntervalDto futuresPerformanceIntervalDto, DisplaySpanDto displaySpanDto, double d, double d2, double d3, double d4, double d5, double d6, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.futures_performance_interval = (i & 1) == 0 ? FuturesPerformanceIntervalDto.INSTANCE.getZeroValue() : futuresPerformanceIntervalDto;
            if ((i & 2) == 0) {
                this.display_span = DisplaySpanDto.INSTANCE.getZeroValue();
            } else {
                this.display_span = displaySpanDto;
            }
            if ((i & 4) == 0) {
                this.open_pnl = 0.0d;
            } else {
                this.open_pnl = d;
            }
            if ((i & 8) == 0) {
                this.day_pnl = 0.0d;
            } else {
                this.day_pnl = d2;
            }
            if ((i & 16) == 0) {
                this.total_pnl = 0.0d;
            } else {
                this.total_pnl = d3;
            }
            if ((i & 32) == 0) {
                this.net_return = 0.0d;
            } else {
                this.net_return = d4;
            }
            if ((i & 64) == 0) {
                this.total_commissions = 0.0d;
            } else {
                this.total_commissions = d5;
            }
            if ((i & 128) == 0) {
                this.total_fees = 0.0d;
            } else {
                this.total_fees = d6;
            }
            this.market_open = (i & 256) == 0 ? false : z;
            this.futures_interval_data_points = (i & 512) == 0 ? CollectionsKt.emptyList() : list;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$futures_asset_home_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.futures_performance_interval != FuturesPerformanceIntervalDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, FuturesPerformanceIntervalDto.Serializer.INSTANCE, self.futures_performance_interval);
            }
            if (self.display_span != DisplaySpanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, DisplaySpanDto.Serializer.INSTANCE, self.display_span);
            }
            if (Double.compare(self.open_pnl, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.open_pnl));
            }
            if (Double.compare(self.day_pnl, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.day_pnl));
            }
            if (Double.compare(self.total_pnl, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 4, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_pnl));
            }
            if (Double.compare(self.net_return, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.net_return));
            }
            if (Double.compare(self.total_commissions, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 6, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_commissions));
            }
            if (Double.compare(self.total_fees, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 7, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.total_fees));
            }
            boolean z = self.market_open;
            if (z) {
                output.encodeBooleanElement(serialDesc, 8, z);
            }
            if (Intrinsics.areEqual(self.futures_interval_data_points, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.futures_interval_data_points);
        }

        public Surrogate(FuturesPerformanceIntervalDto futures_performance_interval, DisplaySpanDto display_span, double d, double d2, double d3, double d4, double d5, double d6, boolean z, List<FuturesIntervalDataPointDto> futures_interval_data_points) {
            Intrinsics.checkNotNullParameter(futures_performance_interval, "futures_performance_interval");
            Intrinsics.checkNotNullParameter(display_span, "display_span");
            Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
            this.futures_performance_interval = futures_performance_interval;
            this.display_span = display_span;
            this.open_pnl = d;
            this.day_pnl = d2;
            this.total_pnl = d3;
            this.net_return = d4;
            this.total_commissions = d5;
            this.total_fees = d6;
            this.market_open = z;
            this.futures_interval_data_points = futures_interval_data_points;
        }

        public final FuturesPerformanceIntervalDto getFutures_performance_interval() {
            return this.futures_performance_interval;
        }

        public /* synthetic */ Surrogate(FuturesPerformanceIntervalDto futuresPerformanceIntervalDto, DisplaySpanDto displaySpanDto, double d, double d2, double d3, double d4, double d5, double d6, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FuturesPerformanceIntervalDto.INSTANCE.getZeroValue() : futuresPerformanceIntervalDto, (i & 2) != 0 ? DisplaySpanDto.INSTANCE.getZeroValue() : displaySpanDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2, (i & 16) != 0 ? 0.0d : d3, (i & 32) != 0 ? 0.0d : d4, (i & 64) != 0 ? 0.0d : d5, (i & 128) == 0 ? d6 : 0.0d, (i & 256) != 0 ? false : z, (i & 512) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final DisplaySpanDto getDisplay_span() {
            return this.display_span;
        }

        public final double getOpen_pnl() {
            return this.open_pnl;
        }

        public final double getDay_pnl() {
            return this.day_pnl;
        }

        public final double getTotal_pnl() {
            return this.total_pnl;
        }

        public final double getNet_return() {
            return this.net_return;
        }

        public final double getTotal_commissions() {
            return this.total_commissions;
        }

        public final double getTotal_fees() {
            return this.total_fees;
        }

        public final boolean getMarket_open() {
            return this.market_open;
        }

        public final List<FuturesIntervalDataPointDto> getFutures_interval_data_points() {
            return this.futures_interval_data_points;
        }
    }

    /* compiled from: FuturesIntervalPerformanceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesIntervalPerformanceDto, FuturesIntervalPerformance> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesIntervalPerformanceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesIntervalPerformanceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesIntervalPerformanceDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesIntervalPerformanceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesIntervalPerformance> getProtoAdapter() {
            return FuturesIntervalPerformance.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesIntervalPerformanceDto getZeroValue() {
            return FuturesIntervalPerformanceDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesIntervalPerformanceDto fromProto(FuturesIntervalPerformance proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FuturesPerformanceIntervalDto futuresPerformanceIntervalDtoFromProto = FuturesPerformanceIntervalDto.INSTANCE.fromProto(proto.getFutures_performance_interval());
            DisplaySpanDto displaySpanDtoFromProto = DisplaySpanDto.INSTANCE.fromProto(proto.getDisplay_span());
            double open_pnl = proto.getOpen_pnl();
            double day_pnl = proto.getDay_pnl();
            double total_pnl = proto.getTotal_pnl();
            double net_return = proto.getNet_return();
            double total_commissions = proto.getTotal_commissions();
            double total_fees = proto.getTotal_fees();
            boolean market_open = proto.getMarket_open();
            List<FuturesIntervalDataPoint> futures_interval_data_points = proto.getFutures_interval_data_points();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(futures_interval_data_points, 10));
            Iterator<T> it = futures_interval_data_points.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesIntervalDataPointDto.INSTANCE.fromProto((FuturesIntervalDataPoint) it.next()));
            }
            return new FuturesIntervalPerformanceDto(new Surrogate(futuresPerformanceIntervalDtoFromProto, displaySpanDtoFromProto, open_pnl, day_pnl, total_pnl, net_return, total_commissions, total_fees, market_open, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: futures_asset_home.proto.v1.FuturesIntervalPerformanceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesIntervalPerformanceDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new FuturesIntervalPerformanceDto(null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FuturesIntervalPerformanceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "Lcom/robinhood/idl/EnumDto;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED", "DAY_INTERVAL", "WEEK_INTERVAL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FuturesPerformanceIntervalDto implements Dto2<FuturesIntervalPerformance.FuturesPerformanceInterval>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FuturesPerformanceIntervalDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<FuturesPerformanceIntervalDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FuturesPerformanceIntervalDto, FuturesIntervalPerformance.FuturesPerformanceInterval>> binaryBase64Serializer$delegate;
        public static final FuturesPerformanceIntervalDto FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED = new FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED("FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED", 0);
        public static final FuturesPerformanceIntervalDto DAY_INTERVAL = new DAY_INTERVAL("DAY_INTERVAL", 1);
        public static final FuturesPerformanceIntervalDto WEEK_INTERVAL = new WEEK_INTERVAL("WEEK_INTERVAL", 2);

        private static final /* synthetic */ FuturesPerformanceIntervalDto[] $values() {
            return new FuturesPerformanceIntervalDto[]{FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED, DAY_INTERVAL, WEEK_INTERVAL};
        }

        public /* synthetic */ FuturesPerformanceIntervalDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<FuturesPerformanceIntervalDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private FuturesPerformanceIntervalDto(String str, int i) {
        }

        /* compiled from: FuturesIntervalPerformanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"futures_asset_home/proto/v1/FuturesIntervalPerformanceDto.FuturesPerformanceIntervalDto.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "toProto", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED extends FuturesPerformanceIntervalDto {
            FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesIntervalPerformance.FuturesPerformanceInterval toProto() {
                return FuturesIntervalPerformance.FuturesPerformanceInterval.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED;
            }
        }

        static {
            FuturesPerformanceIntervalDto[] futuresPerformanceIntervalDtoArr$values = $values();
            $VALUES = futuresPerformanceIntervalDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(futuresPerformanceIntervalDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: futures_asset_home.proto.v1.FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesIntervalPerformanceDto.FuturesPerformanceIntervalDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FuturesIntervalPerformanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"futures_asset_home/proto/v1/FuturesIntervalPerformanceDto.FuturesPerformanceIntervalDto.DAY_INTERVAL", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "toProto", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DAY_INTERVAL extends FuturesPerformanceIntervalDto {
            DAY_INTERVAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesIntervalPerformance.FuturesPerformanceInterval toProto() {
                return FuturesIntervalPerformance.FuturesPerformanceInterval.DAY_INTERVAL;
            }
        }

        /* compiled from: FuturesIntervalPerformanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"futures_asset_home/proto/v1/FuturesIntervalPerformanceDto.FuturesPerformanceIntervalDto.WEEK_INTERVAL", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "toProto", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEEK_INTERVAL extends FuturesPerformanceIntervalDto {
            WEEK_INTERVAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FuturesIntervalPerformance.FuturesPerformanceInterval toProto() {
                return FuturesIntervalPerformance.FuturesPerformanceInterval.WEEK_INTERVAL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FuturesIntervalPerformanceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance$FuturesPerformanceInterval;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<FuturesPerformanceIntervalDto, FuturesIntervalPerformance.FuturesPerformanceInterval> {

            /* compiled from: FuturesIntervalPerformanceDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesIntervalPerformance.FuturesPerformanceInterval.values().length];
                    try {
                        iArr[FuturesIntervalPerformance.FuturesPerformanceInterval.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesIntervalPerformance.FuturesPerformanceInterval.DAY_INTERVAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesIntervalPerformance.FuturesPerformanceInterval.WEEK_INTERVAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FuturesPerformanceIntervalDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FuturesPerformanceIntervalDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FuturesPerformanceIntervalDto> getBinaryBase64Serializer() {
                return (KSerializer) FuturesPerformanceIntervalDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FuturesIntervalPerformance.FuturesPerformanceInterval> getProtoAdapter() {
                return FuturesIntervalPerformance.FuturesPerformanceInterval.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FuturesPerformanceIntervalDto getZeroValue() {
                return FuturesPerformanceIntervalDto.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FuturesPerformanceIntervalDto fromProto(FuturesIntervalPerformance.FuturesPerformanceInterval proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return FuturesPerformanceIntervalDto.FUTURES_INTERVAL_PERFORMANCE_INTERVAL_UNSPECIFIED;
                }
                if (i == 2) {
                    return FuturesPerformanceIntervalDto.DAY_INTERVAL;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return FuturesPerformanceIntervalDto.WEEK_INTERVAL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FuturesIntervalPerformanceDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$FuturesPerformanceIntervalDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<FuturesPerformanceIntervalDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<FuturesPerformanceIntervalDto, FuturesIntervalPerformance.FuturesPerformanceInterval> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/futures_asset_home.proto.v1.FuturesIntervalPerformance.FuturesPerformanceInterval", FuturesPerformanceIntervalDto.getEntries(), FuturesPerformanceIntervalDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public FuturesPerformanceIntervalDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (FuturesPerformanceIntervalDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FuturesPerformanceIntervalDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static FuturesPerformanceIntervalDto valueOf(String str) {
            return (FuturesPerformanceIntervalDto) Enum.valueOf(FuturesPerformanceIntervalDto.class, str);
        }

        public static FuturesPerformanceIntervalDto[] values() {
            return (FuturesPerformanceIntervalDto[]) $VALUES.clone();
        }
    }

    /* compiled from: FuturesIntervalPerformanceDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto;", "<init>", "()V", "surrogateSerializer", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesIntervalPerformanceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/futures_asset_home.proto.v1.FuturesIntervalPerformance", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesIntervalPerformanceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesIntervalPerformanceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesIntervalPerformanceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesIntervalPerformanceDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lfutures_asset_home/proto/v1/FuturesIntervalPerformanceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "futures_asset_home.proto.v1.FuturesIntervalPerformanceDto";
        }
    }
}
