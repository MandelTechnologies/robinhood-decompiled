package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesIntervalDataPointDto;
import com.robinhood.ceres.p284v1.FuturesIntervalDto;
import com.robinhood.ceres.p284v1.GetFuturesIntervalPerformanceResponseDto;
import com.robinhood.ceres.p284v1.SpanDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
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
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: GetFuturesIntervalPerformanceResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00049:;<B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u0006\u0010\u001aJz\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\u0014H\u0016J\u0013\u0010.\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000202H\u0016J\b\u00108\u001a\u000202H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b%\u0010 R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010(R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006="}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$Surrogate;)V", "span", "Lcom/robinhood/ceres/v1/SpanDto;", "interval", "Lcom/robinhood/ceres/v1/FuturesIntervalDto;", "open_pnl", "Lcom/robinhood/idl/IdlDecimal;", "day_pnl", "gross_pnl", "total_commissions", "total_fees", "net_pnl", "time_zone", "", "is_market_open", "", "futures_interval_data_points", "", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto;", "(Lcom/robinhood/ceres/v1/SpanDto;Lcom/robinhood/ceres/v1/FuturesIntervalDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;ZLjava/util/List;)V", "getSpan", "()Lcom/robinhood/ceres/v1/SpanDto;", "getInterval", "()Lcom/robinhood/ceres/v1/FuturesIntervalDto;", "getOpen_pnl", "()Lcom/robinhood/idl/IdlDecimal;", "getDay_pnl", "getGross_pnl", "getTotal_commissions", "getTotal_fees", "getNet_pnl", "getTime_zone", "()Ljava/lang/String;", "()Z", "getFutures_interval_data_points", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class GetFuturesIntervalPerformanceResponseDto implements Dto3<GetFuturesIntervalPerformanceResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetFuturesIntervalPerformanceResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetFuturesIntervalPerformanceResponseDto, GetFuturesIntervalPerformanceResponse>> binaryBase64Serializer$delegate;
    private static final GetFuturesIntervalPerformanceResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetFuturesIntervalPerformanceResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetFuturesIntervalPerformanceResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final SpanDto getSpan() {
        return this.surrogate.getSpan();
    }

    public final FuturesIntervalDto getInterval() {
        return this.surrogate.getInterval();
    }

    public final IdlDecimal getOpen_pnl() {
        return this.surrogate.getOpen_pnl();
    }

    public final IdlDecimal getDay_pnl() {
        return this.surrogate.getDay_pnl();
    }

    public final IdlDecimal getGross_pnl() {
        return this.surrogate.getGross_pnl();
    }

    public final IdlDecimal getTotal_commissions() {
        return this.surrogate.getTotal_commissions();
    }

    public final IdlDecimal getTotal_fees() {
        return this.surrogate.getTotal_fees();
    }

    public final IdlDecimal getNet_pnl() {
        return this.surrogate.getNet_pnl();
    }

    public final String getTime_zone() {
        return this.surrogate.getTime_zone();
    }

    public final boolean is_market_open() {
        return this.surrogate.is_market_open();
    }

    public final List<FuturesIntervalDataPointDto> getFutures_interval_data_points() {
        return this.surrogate.getFutures_interval_data_points();
    }

    public /* synthetic */ GetFuturesIntervalPerformanceResponseDto(SpanDto spanDto, FuturesIntervalDto futuresIntervalDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto, (i & 2) != 0 ? FuturesIntervalDto.INSTANCE.getZeroValue() : futuresIntervalDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal5, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal6, (i & 256) != 0 ? "" : str, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetFuturesIntervalPerformanceResponseDto(SpanDto span, FuturesIntervalDto interval, IdlDecimal open_pnl, IdlDecimal day_pnl, IdlDecimal gross_pnl, IdlDecimal total_commissions, IdlDecimal total_fees, IdlDecimal net_pnl, String time_zone, boolean z, List<FuturesIntervalDataPointDto> futures_interval_data_points) {
        this(new Surrogate(span, interval, open_pnl, day_pnl, gross_pnl, total_commissions, total_fees, net_pnl, time_zone, z, futures_interval_data_points));
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(open_pnl, "open_pnl");
        Intrinsics.checkNotNullParameter(day_pnl, "day_pnl");
        Intrinsics.checkNotNullParameter(gross_pnl, "gross_pnl");
        Intrinsics.checkNotNullParameter(total_commissions, "total_commissions");
        Intrinsics.checkNotNullParameter(total_fees, "total_fees");
        Intrinsics.checkNotNullParameter(net_pnl, "net_pnl");
        Intrinsics.checkNotNullParameter(time_zone, "time_zone");
        Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
    }

    public static /* synthetic */ GetFuturesIntervalPerformanceResponseDto copy$default(GetFuturesIntervalPerformanceResponseDto getFuturesIntervalPerformanceResponseDto, SpanDto spanDto, FuturesIntervalDto futuresIntervalDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            spanDto = getFuturesIntervalPerformanceResponseDto.surrogate.getSpan();
        }
        if ((i & 2) != 0) {
            futuresIntervalDto = getFuturesIntervalPerformanceResponseDto.surrogate.getInterval();
        }
        if ((i & 4) != 0) {
            idlDecimal = getFuturesIntervalPerformanceResponseDto.surrogate.getOpen_pnl();
        }
        if ((i & 8) != 0) {
            idlDecimal2 = getFuturesIntervalPerformanceResponseDto.surrogate.getDay_pnl();
        }
        if ((i & 16) != 0) {
            idlDecimal3 = getFuturesIntervalPerformanceResponseDto.surrogate.getGross_pnl();
        }
        if ((i & 32) != 0) {
            idlDecimal4 = getFuturesIntervalPerformanceResponseDto.surrogate.getTotal_commissions();
        }
        if ((i & 64) != 0) {
            idlDecimal5 = getFuturesIntervalPerformanceResponseDto.surrogate.getTotal_fees();
        }
        if ((i & 128) != 0) {
            idlDecimal6 = getFuturesIntervalPerformanceResponseDto.surrogate.getNet_pnl();
        }
        if ((i & 256) != 0) {
            str = getFuturesIntervalPerformanceResponseDto.surrogate.getTime_zone();
        }
        if ((i & 512) != 0) {
            z = getFuturesIntervalPerformanceResponseDto.surrogate.is_market_open();
        }
        if ((i & 1024) != 0) {
            list = getFuturesIntervalPerformanceResponseDto.surrogate.getFutures_interval_data_points();
        }
        boolean z2 = z;
        List list2 = list;
        IdlDecimal idlDecimal7 = idlDecimal6;
        String str2 = str;
        IdlDecimal idlDecimal8 = idlDecimal4;
        IdlDecimal idlDecimal9 = idlDecimal5;
        IdlDecimal idlDecimal10 = idlDecimal3;
        IdlDecimal idlDecimal11 = idlDecimal;
        return getFuturesIntervalPerformanceResponseDto.copy(spanDto, futuresIntervalDto, idlDecimal11, idlDecimal2, idlDecimal10, idlDecimal8, idlDecimal9, idlDecimal7, str2, z2, list2);
    }

    public final GetFuturesIntervalPerformanceResponseDto copy(SpanDto span, FuturesIntervalDto interval, IdlDecimal open_pnl, IdlDecimal day_pnl, IdlDecimal gross_pnl, IdlDecimal total_commissions, IdlDecimal total_fees, IdlDecimal net_pnl, String time_zone, boolean is_market_open, List<FuturesIntervalDataPointDto> futures_interval_data_points) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(open_pnl, "open_pnl");
        Intrinsics.checkNotNullParameter(day_pnl, "day_pnl");
        Intrinsics.checkNotNullParameter(gross_pnl, "gross_pnl");
        Intrinsics.checkNotNullParameter(total_commissions, "total_commissions");
        Intrinsics.checkNotNullParameter(total_fees, "total_fees");
        Intrinsics.checkNotNullParameter(net_pnl, "net_pnl");
        Intrinsics.checkNotNullParameter(time_zone, "time_zone");
        Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
        return new GetFuturesIntervalPerformanceResponseDto(new Surrogate(span, interval, open_pnl, day_pnl, gross_pnl, total_commissions, total_fees, net_pnl, time_zone, is_market_open, futures_interval_data_points));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetFuturesIntervalPerformanceResponse toProto() {
        Span span = (Span) this.surrogate.getSpan().toProto();
        FuturesInterval futuresInterval = (FuturesInterval) this.surrogate.getInterval().toProto();
        String stringValue = this.surrogate.getOpen_pnl().getStringValue();
        String stringValue2 = this.surrogate.getDay_pnl().getStringValue();
        String stringValue3 = this.surrogate.getGross_pnl().getStringValue();
        String stringValue4 = this.surrogate.getTotal_commissions().getStringValue();
        String stringValue5 = this.surrogate.getTotal_fees().getStringValue();
        String stringValue6 = this.surrogate.getNet_pnl().getStringValue();
        String time_zone = this.surrogate.getTime_zone();
        boolean zIs_market_open = this.surrogate.is_market_open();
        List<FuturesIntervalDataPointDto> futures_interval_data_points = this.surrogate.getFutures_interval_data_points();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(futures_interval_data_points, 10));
        Iterator<T> it = futures_interval_data_points.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesIntervalDataPointDto) it.next()).toProto());
        }
        return new GetFuturesIntervalPerformanceResponse(span, futuresInterval, stringValue, stringValue2, stringValue3, stringValue4, stringValue5, stringValue6, time_zone, zIs_market_open, arrayList, null, 2048, null);
    }

    public String toString() {
        return "[GetFuturesIntervalPerformanceResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetFuturesIntervalPerformanceResponseDto) && Intrinsics.areEqual(((GetFuturesIntervalPerformanceResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetFuturesIntervalPerformanceResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 S2\u00020\u0001:\u0002RSBÕ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001dJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u0018\u0010<\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010=\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010>\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010?\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010@\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010A\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\u0013HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J×\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\r\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000e\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0001J\u0013\u0010F\u001a\u00020\u00132\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u001aHÖ\u0001J\t\u0010I\u001a\u00020\u0011HÖ\u0001J%\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0001¢\u0006\u0002\bQR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010$R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'R+\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010'R+\u0010\f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010'R+\u0010\r\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010'R+\u0010\u000e\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010'R+\u0010\u000f\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010'R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001f\u001a\u0004\b3\u00104R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001f\u001a\u0004\b\u0012\u00106R\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001f\u001a\u0004\b8\u00109¨\u0006T"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$Surrogate;", "", "span", "Lcom/robinhood/ceres/v1/SpanDto;", "interval", "Lcom/robinhood/ceres/v1/FuturesIntervalDto;", "open_pnl", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "day_pnl", "gross_pnl", "total_commissions", "total_fees", "net_pnl", "time_zone", "", "is_market_open", "", "futures_interval_data_points", "", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto;", "<init>", "(Lcom/robinhood/ceres/v1/SpanDto;Lcom/robinhood/ceres/v1/FuturesIntervalDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;ZLjava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/ceres/v1/SpanDto;Lcom/robinhood/ceres/v1/FuturesIntervalDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSpan$annotations", "()V", "getSpan", "()Lcom/robinhood/ceres/v1/SpanDto;", "getInterval$annotations", "getInterval", "()Lcom/robinhood/ceres/v1/FuturesIntervalDto;", "getOpen_pnl$annotations", "getOpen_pnl", "()Lcom/robinhood/idl/IdlDecimal;", "getDay_pnl$annotations", "getDay_pnl", "getGross_pnl$annotations", "getGross_pnl", "getTotal_commissions$annotations", "getTotal_commissions", "getTotal_fees$annotations", "getTotal_fees", "getNet_pnl$annotations", "getNet_pnl", "getTime_zone$annotations", "getTime_zone", "()Ljava/lang/String;", "is_market_open$annotations", "()Z", "getFutures_interval_data_points$annotations", "getFutures_interval_data_points", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final IdlDecimal day_pnl;
        private final List<FuturesIntervalDataPointDto> futures_interval_data_points;
        private final IdlDecimal gross_pnl;
        private final FuturesIntervalDto interval;
        private final boolean is_market_open;
        private final IdlDecimal net_pnl;
        private final IdlDecimal open_pnl;
        private final SpanDto span;
        private final String time_zone;
        private final IdlDecimal total_commissions;
        private final IdlDecimal total_fees;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.GetFuturesIntervalPerformanceResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFuturesIntervalPerformanceResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((SpanDto) null, (FuturesIntervalDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, false, (List) null, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FuturesIntervalDataPointDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, SpanDto spanDto, FuturesIntervalDto futuresIntervalDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, String str, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                spanDto = surrogate.span;
            }
            if ((i & 2) != 0) {
                futuresIntervalDto = surrogate.interval;
            }
            if ((i & 4) != 0) {
                idlDecimal = surrogate.open_pnl;
            }
            if ((i & 8) != 0) {
                idlDecimal2 = surrogate.day_pnl;
            }
            if ((i & 16) != 0) {
                idlDecimal3 = surrogate.gross_pnl;
            }
            if ((i & 32) != 0) {
                idlDecimal4 = surrogate.total_commissions;
            }
            if ((i & 64) != 0) {
                idlDecimal5 = surrogate.total_fees;
            }
            if ((i & 128) != 0) {
                idlDecimal6 = surrogate.net_pnl;
            }
            if ((i & 256) != 0) {
                str = surrogate.time_zone;
            }
            if ((i & 512) != 0) {
                z = surrogate.is_market_open;
            }
            if ((i & 1024) != 0) {
                list = surrogate.futures_interval_data_points;
            }
            boolean z2 = z;
            List list2 = list;
            IdlDecimal idlDecimal7 = idlDecimal6;
            String str2 = str;
            IdlDecimal idlDecimal8 = idlDecimal4;
            IdlDecimal idlDecimal9 = idlDecimal5;
            IdlDecimal idlDecimal10 = idlDecimal3;
            IdlDecimal idlDecimal11 = idlDecimal;
            return surrogate.copy(spanDto, futuresIntervalDto, idlDecimal11, idlDecimal2, idlDecimal10, idlDecimal8, idlDecimal9, idlDecimal7, str2, z2, list2);
        }

        @SerialName("dayPnl")
        @JsonAnnotations2(names = {"day_pnl"})
        public static /* synthetic */ void getDay_pnl$annotations() {
        }

        @SerialName("futuresIntervalDataPoints")
        @JsonAnnotations2(names = {"futures_interval_data_points"})
        public static /* synthetic */ void getFutures_interval_data_points$annotations() {
        }

        @SerialName("grossPnl")
        @JsonAnnotations2(names = {"gross_pnl"})
        public static /* synthetic */ void getGross_pnl$annotations() {
        }

        @SerialName("interval")
        @JsonAnnotations2(names = {"interval"})
        public static /* synthetic */ void getInterval$annotations() {
        }

        @SerialName("netPnl")
        @JsonAnnotations2(names = {"net_pnl"})
        public static /* synthetic */ void getNet_pnl$annotations() {
        }

        @SerialName("openPnl")
        @JsonAnnotations2(names = {"open_pnl"})
        public static /* synthetic */ void getOpen_pnl$annotations() {
        }

        @SerialName("span")
        @JsonAnnotations2(names = {"span"})
        public static /* synthetic */ void getSpan$annotations() {
        }

        @SerialName("timeZone")
        @JsonAnnotations2(names = {"time_zone"})
        public static /* synthetic */ void getTime_zone$annotations() {
        }

        @SerialName("totalCommissions")
        @JsonAnnotations2(names = {"total_commissions"})
        public static /* synthetic */ void getTotal_commissions$annotations() {
        }

        @SerialName("totalFees")
        @JsonAnnotations2(names = {"total_fees"})
        public static /* synthetic */ void getTotal_fees$annotations() {
        }

        @SerialName("isMarketOpen")
        @JsonAnnotations2(names = {"is_market_open"})
        public static /* synthetic */ void is_market_open$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final SpanDto getSpan() {
            return this.span;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIs_market_open() {
            return this.is_market_open;
        }

        public final List<FuturesIntervalDataPointDto> component11() {
            return this.futures_interval_data_points;
        }

        /* renamed from: component2, reason: from getter */
        public final FuturesIntervalDto getInterval() {
            return this.interval;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getOpen_pnl() {
            return this.open_pnl;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getDay_pnl() {
            return this.day_pnl;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getGross_pnl() {
            return this.gross_pnl;
        }

        /* renamed from: component6, reason: from getter */
        public final IdlDecimal getTotal_commissions() {
            return this.total_commissions;
        }

        /* renamed from: component7, reason: from getter */
        public final IdlDecimal getTotal_fees() {
            return this.total_fees;
        }

        /* renamed from: component8, reason: from getter */
        public final IdlDecimal getNet_pnl() {
            return this.net_pnl;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTime_zone() {
            return this.time_zone;
        }

        public final Surrogate copy(SpanDto span, FuturesIntervalDto interval, IdlDecimal open_pnl, IdlDecimal day_pnl, IdlDecimal gross_pnl, IdlDecimal total_commissions, IdlDecimal total_fees, IdlDecimal net_pnl, String time_zone, boolean is_market_open, List<FuturesIntervalDataPointDto> futures_interval_data_points) {
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(open_pnl, "open_pnl");
            Intrinsics.checkNotNullParameter(day_pnl, "day_pnl");
            Intrinsics.checkNotNullParameter(gross_pnl, "gross_pnl");
            Intrinsics.checkNotNullParameter(total_commissions, "total_commissions");
            Intrinsics.checkNotNullParameter(total_fees, "total_fees");
            Intrinsics.checkNotNullParameter(net_pnl, "net_pnl");
            Intrinsics.checkNotNullParameter(time_zone, "time_zone");
            Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
            return new Surrogate(span, interval, open_pnl, day_pnl, gross_pnl, total_commissions, total_fees, net_pnl, time_zone, is_market_open, futures_interval_data_points);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.span == surrogate.span && this.interval == surrogate.interval && Intrinsics.areEqual(this.open_pnl, surrogate.open_pnl) && Intrinsics.areEqual(this.day_pnl, surrogate.day_pnl) && Intrinsics.areEqual(this.gross_pnl, surrogate.gross_pnl) && Intrinsics.areEqual(this.total_commissions, surrogate.total_commissions) && Intrinsics.areEqual(this.total_fees, surrogate.total_fees) && Intrinsics.areEqual(this.net_pnl, surrogate.net_pnl) && Intrinsics.areEqual(this.time_zone, surrogate.time_zone) && this.is_market_open == surrogate.is_market_open && Intrinsics.areEqual(this.futures_interval_data_points, surrogate.futures_interval_data_points);
        }

        public int hashCode() {
            return (((((((((((((((((((this.span.hashCode() * 31) + this.interval.hashCode()) * 31) + this.open_pnl.hashCode()) * 31) + this.day_pnl.hashCode()) * 31) + this.gross_pnl.hashCode()) * 31) + this.total_commissions.hashCode()) * 31) + this.total_fees.hashCode()) * 31) + this.net_pnl.hashCode()) * 31) + this.time_zone.hashCode()) * 31) + Boolean.hashCode(this.is_market_open)) * 31) + this.futures_interval_data_points.hashCode();
        }

        public String toString() {
            return "Surrogate(span=" + this.span + ", interval=" + this.interval + ", open_pnl=" + this.open_pnl + ", day_pnl=" + this.day_pnl + ", gross_pnl=" + this.gross_pnl + ", total_commissions=" + this.total_commissions + ", total_fees=" + this.total_fees + ", net_pnl=" + this.net_pnl + ", time_zone=" + this.time_zone + ", is_market_open=" + this.is_market_open + ", futures_interval_data_points=" + this.futures_interval_data_points + ")";
        }

        /* compiled from: GetFuturesIntervalPerformanceResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetFuturesIntervalPerformanceResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SpanDto spanDto, FuturesIntervalDto futuresIntervalDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, String str, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.span = (i & 1) == 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto;
            if ((i & 2) == 0) {
                this.interval = FuturesIntervalDto.INSTANCE.getZeroValue();
            } else {
                this.interval = futuresIntervalDto;
            }
            if ((i & 4) == 0) {
                this.open_pnl = new IdlDecimal("");
            } else {
                this.open_pnl = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.day_pnl = new IdlDecimal("");
            } else {
                this.day_pnl = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.gross_pnl = new IdlDecimal("");
            } else {
                this.gross_pnl = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.total_commissions = new IdlDecimal("");
            } else {
                this.total_commissions = idlDecimal4;
            }
            if ((i & 64) == 0) {
                this.total_fees = new IdlDecimal("");
            } else {
                this.total_fees = idlDecimal5;
            }
            if ((i & 128) == 0) {
                this.net_pnl = new IdlDecimal("");
            } else {
                this.net_pnl = idlDecimal6;
            }
            if ((i & 256) == 0) {
                this.time_zone = "";
            } else {
                this.time_zone = str;
            }
            if ((i & 512) == 0) {
                this.is_market_open = false;
            } else {
                this.is_market_open = z;
            }
            if ((i & 1024) == 0) {
                this.futures_interval_data_points = CollectionsKt.emptyList();
            } else {
                this.futures_interval_data_points = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.span != SpanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, SpanDto.Serializer.INSTANCE, self.span);
            }
            if (self.interval != FuturesIntervalDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, FuturesIntervalDto.Serializer.INSTANCE, self.interval);
            }
            if (!Intrinsics.areEqual(self.open_pnl, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.open_pnl);
            }
            if (!Intrinsics.areEqual(self.day_pnl, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.day_pnl);
            }
            if (!Intrinsics.areEqual(self.gross_pnl, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.gross_pnl);
            }
            if (!Intrinsics.areEqual(self.total_commissions, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.total_commissions);
            }
            if (!Intrinsics.areEqual(self.total_fees, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.total_fees);
            }
            if (!Intrinsics.areEqual(self.net_pnl, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.net_pnl);
            }
            if (!Intrinsics.areEqual(self.time_zone, "")) {
                output.encodeStringElement(serialDesc, 8, self.time_zone);
            }
            boolean z = self.is_market_open;
            if (z) {
                output.encodeBooleanElement(serialDesc, 9, z);
            }
            if (Intrinsics.areEqual(self.futures_interval_data_points, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 10, lazyArr[10].getValue(), self.futures_interval_data_points);
        }

        public Surrogate(SpanDto span, FuturesIntervalDto interval, IdlDecimal open_pnl, IdlDecimal day_pnl, IdlDecimal gross_pnl, IdlDecimal total_commissions, IdlDecimal total_fees, IdlDecimal net_pnl, String time_zone, boolean z, List<FuturesIntervalDataPointDto> futures_interval_data_points) {
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(open_pnl, "open_pnl");
            Intrinsics.checkNotNullParameter(day_pnl, "day_pnl");
            Intrinsics.checkNotNullParameter(gross_pnl, "gross_pnl");
            Intrinsics.checkNotNullParameter(total_commissions, "total_commissions");
            Intrinsics.checkNotNullParameter(total_fees, "total_fees");
            Intrinsics.checkNotNullParameter(net_pnl, "net_pnl");
            Intrinsics.checkNotNullParameter(time_zone, "time_zone");
            Intrinsics.checkNotNullParameter(futures_interval_data_points, "futures_interval_data_points");
            this.span = span;
            this.interval = interval;
            this.open_pnl = open_pnl;
            this.day_pnl = day_pnl;
            this.gross_pnl = gross_pnl;
            this.total_commissions = total_commissions;
            this.total_fees = total_fees;
            this.net_pnl = net_pnl;
            this.time_zone = time_zone;
            this.is_market_open = z;
            this.futures_interval_data_points = futures_interval_data_points;
        }

        public final SpanDto getSpan() {
            return this.span;
        }

        public /* synthetic */ Surrogate(SpanDto spanDto, FuturesIntervalDto futuresIntervalDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SpanDto.INSTANCE.getZeroValue() : spanDto, (i & 2) != 0 ? FuturesIntervalDto.INSTANCE.getZeroValue() : futuresIntervalDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 64) != 0 ? new IdlDecimal("") : idlDecimal5, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal6, (i & 256) != 0 ? "" : str, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final FuturesIntervalDto getInterval() {
            return this.interval;
        }

        public final IdlDecimal getOpen_pnl() {
            return this.open_pnl;
        }

        public final IdlDecimal getDay_pnl() {
            return this.day_pnl;
        }

        public final IdlDecimal getGross_pnl() {
            return this.gross_pnl;
        }

        public final IdlDecimal getTotal_commissions() {
            return this.total_commissions;
        }

        public final IdlDecimal getTotal_fees() {
            return this.total_fees;
        }

        public final IdlDecimal getNet_pnl() {
            return this.net_pnl;
        }

        public final String getTime_zone() {
            return this.time_zone;
        }

        public final boolean is_market_open() {
            return this.is_market_open;
        }

        public final List<FuturesIntervalDataPointDto> getFutures_interval_data_points() {
            return this.futures_interval_data_points;
        }
    }

    /* compiled from: GetFuturesIntervalPerformanceResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetFuturesIntervalPerformanceResponseDto, GetFuturesIntervalPerformanceResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetFuturesIntervalPerformanceResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFuturesIntervalPerformanceResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFuturesIntervalPerformanceResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetFuturesIntervalPerformanceResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetFuturesIntervalPerformanceResponse> getProtoAdapter() {
            return GetFuturesIntervalPerformanceResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFuturesIntervalPerformanceResponseDto getZeroValue() {
            return GetFuturesIntervalPerformanceResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFuturesIntervalPerformanceResponseDto fromProto(GetFuturesIntervalPerformanceResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SpanDto spanDtoFromProto = SpanDto.INSTANCE.fromProto(proto.getSpan());
            FuturesIntervalDto futuresIntervalDtoFromProto = FuturesIntervalDto.INSTANCE.fromProto(proto.getInterval());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getOpen_pnl());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getDay_pnl());
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getGross_pnl());
            IdlDecimal idlDecimal4 = new IdlDecimal(proto.getTotal_commissions());
            IdlDecimal idlDecimal5 = new IdlDecimal(proto.getTotal_fees());
            IdlDecimal idlDecimal6 = new IdlDecimal(proto.getNet_pnl());
            String time_zone = proto.getTime_zone();
            boolean is_market_open = proto.getIs_market_open();
            List<FuturesIntervalDataPoint> futures_interval_data_points = proto.getFutures_interval_data_points();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(futures_interval_data_points, 10));
            Iterator<T> it = futures_interval_data_points.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesIntervalDataPointDto.INSTANCE.fromProto((FuturesIntervalDataPoint) it.next()));
            }
            return new GetFuturesIntervalPerformanceResponseDto(new Surrogate(spanDtoFromProto, futuresIntervalDtoFromProto, idlDecimal, idlDecimal2, idlDecimal3, idlDecimal4, idlDecimal5, idlDecimal6, time_zone, is_market_open, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.GetFuturesIntervalPerformanceResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFuturesIntervalPerformanceResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetFuturesIntervalPerformanceResponseDto(null, null, null, null, null, null, null, null, null, false, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetFuturesIntervalPerformanceResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetFuturesIntervalPerformanceResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.GetFuturesIntervalPerformanceResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetFuturesIntervalPerformanceResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetFuturesIntervalPerformanceResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetFuturesIntervalPerformanceResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetFuturesIntervalPerformanceResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.GetFuturesIntervalPerformanceResponseDto";
        }
    }
}
