package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesIntervalDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FuturesIntervalDataPointDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012JF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPoint;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$Surrogate;)V", "interval", "Lcom/robinhood/ceres/v1/FuturesIntervalDto;", "start_trade_date", "Lcom/robinhood/rosetta/common/DateDto;", "end_trade_date", "interval_pnl", "Lcom/robinhood/idl/IdlDecimal;", "start_time", "", "end_time", "(Lcom/robinhood/ceres/v1/FuturesIntervalDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getInterval", "()Lcom/robinhood/ceres/v1/FuturesIntervalDto;", "getStart_trade_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getEnd_trade_date", "getInterval_pnl", "()Lcom/robinhood/idl/IdlDecimal;", "getStart_time", "()Ljava/lang/String;", "getEnd_time", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
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

    public final FuturesIntervalDto getInterval() {
        return this.surrogate.getInterval();
    }

    public final DateDto getStart_trade_date() {
        return this.surrogate.getStart_trade_date();
    }

    public final DateDto getEnd_trade_date() {
        return this.surrogate.getEnd_trade_date();
    }

    public final IdlDecimal getInterval_pnl() {
        return this.surrogate.getInterval_pnl();
    }

    public final String getStart_time() {
        return this.surrogate.getStart_time();
    }

    public final String getEnd_time() {
        return this.surrogate.getEnd_time();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FuturesIntervalDataPointDto(com.robinhood.ceres.p284v1.FuturesIntervalDto r2, com.robinhood.rosetta.common.DateDto r3, com.robinhood.rosetta.common.DateDto r4, com.robinhood.idl.IdlDecimal r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            com.robinhood.ceres.v1.FuturesIntervalDto$Companion r2 = com.robinhood.ceres.p284v1.FuturesIntervalDto.INSTANCE
            com.robinhood.ceres.v1.FuturesIntervalDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto L10
            r3 = r0
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L15
            r4 = r0
        L15:
            r9 = r8 & 8
            java.lang.String r0 = ""
            if (r9 == 0) goto L20
            com.robinhood.idl.IdlDecimal r5 = new com.robinhood.idl.IdlDecimal
            r5.<init>(r0)
        L20:
            r9 = r8 & 16
            if (r9 == 0) goto L25
            r6 = r0
        L25:
            r8 = r8 & 32
            if (r8 == 0) goto L31
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L38
        L31:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L38:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.FuturesIntervalDataPointDto.<init>(com.robinhood.ceres.v1.FuturesIntervalDto, com.robinhood.rosetta.common.DateDto, com.robinhood.rosetta.common.DateDto, com.robinhood.idl.IdlDecimal, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesIntervalDataPointDto(FuturesIntervalDto interval, DateDto dateDto, DateDto dateDto2, IdlDecimal interval_pnl, String start_time, String end_time) {
        this(new Surrogate(interval, dateDto, dateDto2, interval_pnl, start_time, end_time));
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(interval_pnl, "interval_pnl");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
    }

    public static /* synthetic */ FuturesIntervalDataPointDto copy$default(FuturesIntervalDataPointDto futuresIntervalDataPointDto, FuturesIntervalDto futuresIntervalDto, DateDto dateDto, DateDto dateDto2, IdlDecimal idlDecimal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresIntervalDto = futuresIntervalDataPointDto.surrogate.getInterval();
        }
        if ((i & 2) != 0) {
            dateDto = futuresIntervalDataPointDto.surrogate.getStart_trade_date();
        }
        if ((i & 4) != 0) {
            dateDto2 = futuresIntervalDataPointDto.surrogate.getEnd_trade_date();
        }
        if ((i & 8) != 0) {
            idlDecimal = futuresIntervalDataPointDto.surrogate.getInterval_pnl();
        }
        if ((i & 16) != 0) {
            str = futuresIntervalDataPointDto.surrogate.getStart_time();
        }
        if ((i & 32) != 0) {
            str2 = futuresIntervalDataPointDto.surrogate.getEnd_time();
        }
        String str3 = str;
        String str4 = str2;
        return futuresIntervalDataPointDto.copy(futuresIntervalDto, dateDto, dateDto2, idlDecimal, str3, str4);
    }

    public final FuturesIntervalDataPointDto copy(FuturesIntervalDto interval, DateDto start_trade_date, DateDto end_trade_date, IdlDecimal interval_pnl, String start_time, String end_time) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(interval_pnl, "interval_pnl");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        return new FuturesIntervalDataPointDto(new Surrogate(interval, start_trade_date, end_trade_date, interval_pnl, start_time, end_time));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesIntervalDataPoint toProto() {
        FuturesInterval futuresInterval = (FuturesInterval) this.surrogate.getInterval().toProto();
        DateDto start_trade_date = this.surrogate.getStart_trade_date();
        Date proto = start_trade_date != null ? start_trade_date.toProto() : null;
        DateDto end_trade_date = this.surrogate.getEnd_trade_date();
        return new FuturesIntervalDataPoint(futuresInterval, proto, end_trade_date != null ? end_trade_date.toProto() : null, this.surrogate.getInterval_pnl().getStringValue(), this.surrogate.getStart_time(), this.surrogate.getEnd_time(), null, 64, null);
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
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002;<BV\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0018\u0010*\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003JX\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0012HÖ\u0001J\t\u00102\u001a\u00020\rHÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001cR+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010$¨\u0006="}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$Surrogate;", "", "interval", "Lcom/robinhood/ceres/v1/FuturesIntervalDto;", "start_trade_date", "Lcom/robinhood/rosetta/common/DateDto;", "end_trade_date", "interval_pnl", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "start_time", "", "end_time", "<init>", "(Lcom/robinhood/ceres/v1/FuturesIntervalDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/ceres/v1/FuturesIntervalDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInterval$annotations", "()V", "getInterval", "()Lcom/robinhood/ceres/v1/FuturesIntervalDto;", "getStart_trade_date$annotations", "getStart_trade_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getEnd_trade_date$annotations", "getEnd_trade_date", "getInterval_pnl$annotations", "getInterval_pnl", "()Lcom/robinhood/idl/IdlDecimal;", "getStart_time$annotations", "getStart_time", "()Ljava/lang/String;", "getEnd_time$annotations", "getEnd_time", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String end_time;
        private final DateDto end_trade_date;
        private final FuturesIntervalDto interval;
        private final IdlDecimal interval_pnl;
        private final String start_time;
        private final DateDto start_trade_date;

        public Surrogate() {
            this((FuturesIntervalDto) null, (DateDto) null, (DateDto) null, (IdlDecimal) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, FuturesIntervalDto futuresIntervalDto, DateDto dateDto, DateDto dateDto2, IdlDecimal idlDecimal, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresIntervalDto = surrogate.interval;
            }
            if ((i & 2) != 0) {
                dateDto = surrogate.start_trade_date;
            }
            if ((i & 4) != 0) {
                dateDto2 = surrogate.end_trade_date;
            }
            if ((i & 8) != 0) {
                idlDecimal = surrogate.interval_pnl;
            }
            if ((i & 16) != 0) {
                str = surrogate.start_time;
            }
            if ((i & 32) != 0) {
                str2 = surrogate.end_time;
            }
            String str3 = str;
            String str4 = str2;
            return surrogate.copy(futuresIntervalDto, dateDto, dateDto2, idlDecimal, str3, str4);
        }

        @SerialName("endTime")
        @JsonAnnotations2(names = {"end_time"})
        public static /* synthetic */ void getEnd_time$annotations() {
        }

        @SerialName("endTradeDate")
        @JsonAnnotations2(names = {"end_trade_date"})
        public static /* synthetic */ void getEnd_trade_date$annotations() {
        }

        @SerialName("interval")
        @JsonAnnotations2(names = {"interval"})
        public static /* synthetic */ void getInterval$annotations() {
        }

        @SerialName("intervalPnl")
        @JsonAnnotations2(names = {"interval_pnl"})
        public static /* synthetic */ void getInterval_pnl$annotations() {
        }

        @SerialName("startTime")
        @JsonAnnotations2(names = {"start_time"})
        public static /* synthetic */ void getStart_time$annotations() {
        }

        @SerialName("startTradeDate")
        @JsonAnnotations2(names = {"start_trade_date"})
        public static /* synthetic */ void getStart_trade_date$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesIntervalDto getInterval() {
            return this.interval;
        }

        /* renamed from: component2, reason: from getter */
        public final DateDto getStart_trade_date() {
            return this.start_trade_date;
        }

        /* renamed from: component3, reason: from getter */
        public final DateDto getEnd_trade_date() {
            return this.end_trade_date;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getInterval_pnl() {
            return this.interval_pnl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getStart_time() {
            return this.start_time;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEnd_time() {
            return this.end_time;
        }

        public final Surrogate copy(FuturesIntervalDto interval, DateDto start_trade_date, DateDto end_trade_date, IdlDecimal interval_pnl, String start_time, String end_time) {
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(interval_pnl, "interval_pnl");
            Intrinsics.checkNotNullParameter(start_time, "start_time");
            Intrinsics.checkNotNullParameter(end_time, "end_time");
            return new Surrogate(interval, start_trade_date, end_trade_date, interval_pnl, start_time, end_time);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.interval == surrogate.interval && Intrinsics.areEqual(this.start_trade_date, surrogate.start_trade_date) && Intrinsics.areEqual(this.end_trade_date, surrogate.end_trade_date) && Intrinsics.areEqual(this.interval_pnl, surrogate.interval_pnl) && Intrinsics.areEqual(this.start_time, surrogate.start_time) && Intrinsics.areEqual(this.end_time, surrogate.end_time);
        }

        public int hashCode() {
            int iHashCode = this.interval.hashCode() * 31;
            DateDto dateDto = this.start_trade_date;
            int iHashCode2 = (iHashCode + (dateDto == null ? 0 : dateDto.hashCode())) * 31;
            DateDto dateDto2 = this.end_trade_date;
            return ((((((iHashCode2 + (dateDto2 != null ? dateDto2.hashCode() : 0)) * 31) + this.interval_pnl.hashCode()) * 31) + this.start_time.hashCode()) * 31) + this.end_time.hashCode();
        }

        public String toString() {
            return "Surrogate(interval=" + this.interval + ", start_trade_date=" + this.start_trade_date + ", end_trade_date=" + this.end_trade_date + ", interval_pnl=" + this.interval_pnl + ", start_time=" + this.start_time + ", end_time=" + this.end_time + ")";
        }

        /* compiled from: FuturesIntervalDataPointDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesIntervalDataPointDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FuturesIntervalDto futuresIntervalDto, DateDto dateDto, DateDto dateDto2, IdlDecimal idlDecimal, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.interval = (i & 1) == 0 ? FuturesIntervalDto.INSTANCE.getZeroValue() : futuresIntervalDto;
            if ((i & 2) == 0) {
                this.start_trade_date = null;
            } else {
                this.start_trade_date = dateDto;
            }
            if ((i & 4) == 0) {
                this.end_trade_date = null;
            } else {
                this.end_trade_date = dateDto2;
            }
            if ((i & 8) == 0) {
                this.interval_pnl = new IdlDecimal("");
            } else {
                this.interval_pnl = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.start_time = "";
            } else {
                this.start_time = str;
            }
            if ((i & 32) == 0) {
                this.end_time = "";
            } else {
                this.end_time = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.interval != FuturesIntervalDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, FuturesIntervalDto.Serializer.INSTANCE, self.interval);
            }
            DateDto dateDto = self.start_trade_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DateDto.Serializer.INSTANCE, dateDto);
            }
            DateDto dateDto2 = self.end_trade_date;
            if (dateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DateDto.Serializer.INSTANCE, dateDto2);
            }
            if (!Intrinsics.areEqual(self.interval_pnl, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.interval_pnl);
            }
            if (!Intrinsics.areEqual(self.start_time, "")) {
                output.encodeStringElement(serialDesc, 4, self.start_time);
            }
            if (Intrinsics.areEqual(self.end_time, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.end_time);
        }

        public Surrogate(FuturesIntervalDto interval, DateDto dateDto, DateDto dateDto2, IdlDecimal interval_pnl, String start_time, String end_time) {
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(interval_pnl, "interval_pnl");
            Intrinsics.checkNotNullParameter(start_time, "start_time");
            Intrinsics.checkNotNullParameter(end_time, "end_time");
            this.interval = interval;
            this.start_trade_date = dateDto;
            this.end_trade_date = dateDto2;
            this.interval_pnl = interval_pnl;
            this.start_time = start_time;
            this.end_time = end_time;
        }

        public final FuturesIntervalDto getInterval() {
            return this.interval;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.ceres.p284v1.FuturesIntervalDto r2, com.robinhood.rosetta.common.DateDto r3, com.robinhood.rosetta.common.DateDto r4, com.robinhood.idl.IdlDecimal r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                com.robinhood.ceres.v1.FuturesIntervalDto$Companion r2 = com.robinhood.ceres.p284v1.FuturesIntervalDto.INSTANCE
                com.robinhood.ceres.v1.FuturesIntervalDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto L10
                r3 = r0
            L10:
                r9 = r8 & 4
                if (r9 == 0) goto L15
                r4 = r0
            L15:
                r9 = r8 & 8
                java.lang.String r0 = ""
                if (r9 == 0) goto L20
                com.robinhood.idl.IdlDecimal r5 = new com.robinhood.idl.IdlDecimal
                r5.<init>(r0)
            L20:
                r9 = r8 & 16
                if (r9 == 0) goto L25
                r6 = r0
            L25:
                r8 = r8 & 32
                if (r8 == 0) goto L31
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L38
            L31:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L38:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.FuturesIntervalDataPointDto.Surrogate.<init>(com.robinhood.ceres.v1.FuturesIntervalDto, com.robinhood.rosetta.common.DateDto, com.robinhood.rosetta.common.DateDto, com.robinhood.idl.IdlDecimal, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final DateDto getStart_trade_date() {
            return this.start_trade_date;
        }

        public final DateDto getEnd_trade_date() {
            return this.end_trade_date;
        }

        public final IdlDecimal getInterval_pnl() {
            return this.interval_pnl;
        }

        public final String getStart_time() {
            return this.start_time;
        }

        public final String getEnd_time() {
            return this.end_time;
        }
    }

    /* compiled from: FuturesIntervalDataPointDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto;", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
            FuturesIntervalDto futuresIntervalDtoFromProto = FuturesIntervalDto.INSTANCE.fromProto(proto.getInterval());
            Date start_trade_date = proto.getStart_trade_date();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DateDto dateDtoFromProto = start_trade_date != null ? DateDto.INSTANCE.fromProto(start_trade_date) : null;
            Date end_trade_date = proto.getEnd_trade_date();
            return new FuturesIntervalDataPointDto(new Surrogate(futuresIntervalDtoFromProto, dateDtoFromProto, end_trade_date != null ? DateDto.INSTANCE.fromProto(end_trade_date) : null, new IdlDecimal(proto.getInterval_pnl()), proto.getStart_time(), proto.getEnd_time()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesIntervalDataPointDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesIntervalDataPointDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesIntervalDataPointDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesIntervalDataPointDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesIntervalDataPointDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesIntervalDataPoint", kSerializerSerializer.getDescriptor());
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
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesIntervalDataPointDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesIntervalDataPointDto";
        }
    }
}
