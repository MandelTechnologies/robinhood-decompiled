package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.ceres.p284v1.ShardNumberDto;
import com.robinhood.ceres.p284v1.ShardRegionDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: GetCurrentAggregatedPositionsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000489:;B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0006\u0010\u0019J\u008d\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\tH\u0016J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u00020\rH\u0016J\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\rH\u0016J\b\u00107\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006<"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Surrogate;)V", "account_id", "", "contract_id", "cursor", "page_size", "", "is_download_csv", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "account_number", "start_oldest_event_date", "end_oldest_event_date", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegionDto;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumberDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)V", "getAccount_id", "()Ljava/lang/String;", "getContract_id", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getAccount_number", "getStart_oldest_event_date", "getEnd_oldest_event_date", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegionDto;", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumberDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetCurrentAggregatedPositionsRequestDto implements Dto3<GetCurrentAggregatedPositionsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCurrentAggregatedPositionsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCurrentAggregatedPositionsRequestDto, GetCurrentAggregatedPositionsRequest>> binaryBase64Serializer$delegate;
    private static final GetCurrentAggregatedPositionsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCurrentAggregatedPositionsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCurrentAggregatedPositionsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final String getCursor() {
        return this.surrogate.getCursor();
    }

    public final Integer getPage_size() {
        return this.surrogate.getPage_size();
    }

    public final Boolean is_download_csv() {
        return this.surrogate.is_download_csv();
    }

    public final FuturesContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getStart_oldest_event_date() {
        return this.surrogate.getStart_oldest_event_date();
    }

    public final String getEnd_oldest_event_date() {
        return this.surrogate.getEnd_oldest_event_date();
    }

    public final ShardRegionDto getShard_region() {
        return this.surrogate.getShard_region();
    }

    public final ShardNumberDto getShard_number() {
        return this.surrogate.getShard_number();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetCurrentAggregatedPositionsRequestDto(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Integer r5, java.lang.Boolean r6, com.robinhood.ceres.p284v1.FuturesContractTypeDto r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.robinhood.ceres.p284v1.ShardRegionDto r11, com.robinhood.ceres.p284v1.ShardNumberDto r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r1 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto Lc
            r3 = r0
        Lc:
            r14 = r13 & 4
            if (r14 == 0) goto L11
            r4 = r0
        L11:
            r14 = r13 & 8
            if (r14 == 0) goto L16
            r5 = r0
        L16:
            r14 = r13 & 16
            if (r14 == 0) goto L1b
            r6 = r0
        L1b:
            r14 = r13 & 32
            if (r14 == 0) goto L20
            r7 = r0
        L20:
            r14 = r13 & 64
            if (r14 == 0) goto L25
            r8 = r0
        L25:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L2a
            r9 = r0
        L2a:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L2f
            r10 = r0
        L2f:
            r14 = r13 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L34
            r11 = r0
        L34:
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L45
            r14 = r0
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L51
        L45:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L51:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.GetCurrentAggregatedPositionsRequestDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, com.robinhood.ceres.v1.FuturesContractTypeDto, java.lang.String, java.lang.String, java.lang.String, com.robinhood.ceres.v1.ShardRegionDto, com.robinhood.ceres.v1.ShardNumberDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCurrentAggregatedPositionsRequestDto(String account_id, String str, String str2, Integer num, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, String str3, String str4, String str5, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto) {
        this(new Surrogate(account_id, str, str2, num, bool, futuresContractTypeDto, str3, str4, str5, shardRegionDto, shardNumberDto));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
    }

    public static /* synthetic */ GetCurrentAggregatedPositionsRequestDto copy$default(GetCurrentAggregatedPositionsRequestDto getCurrentAggregatedPositionsRequestDto, String str, String str2, String str3, Integer num, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, String str4, String str5, String str6, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCurrentAggregatedPositionsRequestDto.surrogate.getAccount_id();
        }
        if ((i & 2) != 0) {
            str2 = getCurrentAggregatedPositionsRequestDto.surrogate.getContract_id();
        }
        if ((i & 4) != 0) {
            str3 = getCurrentAggregatedPositionsRequestDto.surrogate.getCursor();
        }
        if ((i & 8) != 0) {
            num = getCurrentAggregatedPositionsRequestDto.surrogate.getPage_size();
        }
        if ((i & 16) != 0) {
            bool = getCurrentAggregatedPositionsRequestDto.surrogate.is_download_csv();
        }
        if ((i & 32) != 0) {
            futuresContractTypeDto = getCurrentAggregatedPositionsRequestDto.surrogate.getContract_type();
        }
        if ((i & 64) != 0) {
            str4 = getCurrentAggregatedPositionsRequestDto.surrogate.getAccount_number();
        }
        if ((i & 128) != 0) {
            str5 = getCurrentAggregatedPositionsRequestDto.surrogate.getStart_oldest_event_date();
        }
        if ((i & 256) != 0) {
            str6 = getCurrentAggregatedPositionsRequestDto.surrogate.getEnd_oldest_event_date();
        }
        if ((i & 512) != 0) {
            shardRegionDto = getCurrentAggregatedPositionsRequestDto.surrogate.getShard_region();
        }
        if ((i & 1024) != 0) {
            shardNumberDto = getCurrentAggregatedPositionsRequestDto.surrogate.getShard_number();
        }
        ShardRegionDto shardRegionDto2 = shardRegionDto;
        ShardNumberDto shardNumberDto2 = shardNumberDto;
        String str7 = str5;
        String str8 = str6;
        FuturesContractTypeDto futuresContractTypeDto2 = futuresContractTypeDto;
        String str9 = str4;
        Boolean bool2 = bool;
        String str10 = str3;
        return getCurrentAggregatedPositionsRequestDto.copy(str, str2, str10, num, bool2, futuresContractTypeDto2, str9, str7, str8, shardRegionDto2, shardNumberDto2);
    }

    public final GetCurrentAggregatedPositionsRequestDto copy(String account_id, String contract_id, String cursor, Integer page_size, Boolean is_download_csv, FuturesContractTypeDto contract_type, String account_number, String start_oldest_event_date, String end_oldest_event_date, ShardRegionDto shard_region, ShardNumberDto shard_number) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        return new GetCurrentAggregatedPositionsRequestDto(new Surrogate(account_id, contract_id, cursor, page_size, is_download_csv, contract_type, account_number, start_oldest_event_date, end_oldest_event_date, shard_region, shard_number));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCurrentAggregatedPositionsRequest toProto() {
        String account_id = this.surrogate.getAccount_id();
        String contract_id = this.surrogate.getContract_id();
        String cursor = this.surrogate.getCursor();
        Integer page_size = this.surrogate.getPage_size();
        Boolean boolIs_download_csv = this.surrogate.is_download_csv();
        FuturesContractTypeDto contract_type = this.surrogate.getContract_type();
        FuturesContractType futuresContractType = contract_type != null ? (FuturesContractType) contract_type.toProto() : null;
        String account_number = this.surrogate.getAccount_number();
        String start_oldest_event_date = this.surrogate.getStart_oldest_event_date();
        String end_oldest_event_date = this.surrogate.getEnd_oldest_event_date();
        ShardRegionDto shard_region = this.surrogate.getShard_region();
        ShardRegion shardRegion = shard_region != null ? (ShardRegion) shard_region.toProto() : null;
        ShardNumberDto shard_number = this.surrogate.getShard_number();
        return new GetCurrentAggregatedPositionsRequest(account_id, contract_id, cursor, page_size, boolIs_download_csv, futuresContractType, account_number, start_oldest_event_date, end_oldest_event_date, shardRegion, shard_number != null ? (ShardNumber) shard_number.toProto() : null, null, 2048, null);
    }

    public String toString() {
        return "[GetCurrentAggregatedPositionsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCurrentAggregatedPositionsRequestDto) && Intrinsics.areEqual(((GetCurrentAggregatedPositionsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCurrentAggregatedPositionsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 T2\u00020\u0001:\u0002STB\u0098\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010=\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u009f\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020\f2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0007HÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001J%\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0001¢\u0006\u0002\bRR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR/\u0010\u0006\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010'\u0012\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010*\u0012\u0004\b(\u0010\u001d\u001a\u0004\b\u000b\u0010)R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010-R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u001fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001d\u001a\u0004\b5\u00106R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001d\u001a\u0004\b8\u00109¨\u0006U"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Surrogate;", "", "account_id", "", "contract_id", "cursor", "page_size", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "is_download_csv", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "account_number", "start_oldest_event_date", "end_oldest_event_date", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegionDto;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumberDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_id$annotations", "()V", "getAccount_id", "()Ljava/lang/String;", "getContract_id$annotations", "getContract_id", "getCursor$annotations", "getCursor", "getPage_size$annotations", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "is_download_csv$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContract_type$annotations", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getAccount_number$annotations", "getAccount_number", "getStart_oldest_event_date$annotations", "getStart_oldest_event_date", "getEnd_oldest_event_date$annotations", "getEnd_oldest_event_date", "getShard_region$annotations", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegionDto;", "getShard_number$annotations", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumberDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String account_number;
        private final String contract_id;
        private final FuturesContractTypeDto contract_type;
        private final String cursor;
        private final String end_oldest_event_date;
        private final Boolean is_download_csv;
        private final Integer page_size;
        private final ShardNumberDto shard_number;
        private final ShardRegionDto shard_region;
        private final String start_oldest_event_date;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (Integer) null, (Boolean) null, (FuturesContractTypeDto) null, (String) null, (String) null, (String) null, (ShardRegionDto) null, (ShardNumberDto) null, 2047, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, Integer num, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, String str4, String str5, String str6, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.account_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.contract_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.cursor;
            }
            if ((i & 8) != 0) {
                num = surrogate.page_size;
            }
            if ((i & 16) != 0) {
                bool = surrogate.is_download_csv;
            }
            if ((i & 32) != 0) {
                futuresContractTypeDto = surrogate.contract_type;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.account_number;
            }
            if ((i & 128) != 0) {
                str5 = surrogate.start_oldest_event_date;
            }
            if ((i & 256) != 0) {
                str6 = surrogate.end_oldest_event_date;
            }
            if ((i & 512) != 0) {
                shardRegionDto = surrogate.shard_region;
            }
            if ((i & 1024) != 0) {
                shardNumberDto = surrogate.shard_number;
            }
            ShardRegionDto shardRegionDto2 = shardRegionDto;
            ShardNumberDto shardNumberDto2 = shardNumberDto;
            String str7 = str5;
            String str8 = str6;
            FuturesContractTypeDto futuresContractTypeDto2 = futuresContractTypeDto;
            String str9 = str4;
            Boolean bool2 = bool;
            String str10 = str3;
            return surrogate.copy(str, str2, str10, num, bool2, futuresContractTypeDto2, str9, str7, str8, shardRegionDto2, shardNumberDto2);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("cursor")
        @JsonAnnotations2(names = {"cursor"})
        public static /* synthetic */ void getCursor$annotations() {
        }

        @SerialName("endOldestEventDate")
        @JsonAnnotations2(names = {"end_oldest_event_date"})
        public static /* synthetic */ void getEnd_oldest_event_date$annotations() {
        }

        @SerialName("pageSize")
        @JsonAnnotations2(names = {"page_size"})
        public static /* synthetic */ void getPage_size$annotations() {
        }

        @SerialName("shardNumber")
        @JsonAnnotations2(names = {"shard_number"})
        public static /* synthetic */ void getShard_number$annotations() {
        }

        @SerialName("shardRegion")
        @JsonAnnotations2(names = {"shard_region"})
        public static /* synthetic */ void getShard_region$annotations() {
        }

        @SerialName("startOldestEventDate")
        @JsonAnnotations2(names = {"start_oldest_event_date"})
        public static /* synthetic */ void getStart_oldest_event_date$annotations() {
        }

        @SerialName("isDownloadCsv")
        @JsonAnnotations2(names = {"is_download_csv"})
        public static /* synthetic */ void is_download_csv$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component10, reason: from getter */
        public final ShardRegionDto getShard_region() {
            return this.shard_region;
        }

        /* renamed from: component11, reason: from getter */
        public final ShardNumberDto getShard_number() {
            return this.shard_number;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCursor() {
            return this.cursor;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getPage_size() {
            return this.page_size;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIs_download_csv() {
            return this.is_download_csv;
        }

        /* renamed from: component6, reason: from getter */
        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        /* renamed from: component7, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component8, reason: from getter */
        public final String getStart_oldest_event_date() {
            return this.start_oldest_event_date;
        }

        /* renamed from: component9, reason: from getter */
        public final String getEnd_oldest_event_date() {
            return this.end_oldest_event_date;
        }

        public final Surrogate copy(String account_id, String contract_id, String cursor, Integer page_size, Boolean is_download_csv, FuturesContractTypeDto contract_type, String account_number, String start_oldest_event_date, String end_oldest_event_date, ShardRegionDto shard_region, ShardNumberDto shard_number) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            return new Surrogate(account_id, contract_id, cursor, page_size, is_download_csv, contract_type, account_number, start_oldest_event_date, end_oldest_event_date, shard_region, shard_number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.cursor, surrogate.cursor) && Intrinsics.areEqual(this.page_size, surrogate.page_size) && Intrinsics.areEqual(this.is_download_csv, surrogate.is_download_csv) && this.contract_type == surrogate.contract_type && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.start_oldest_event_date, surrogate.start_oldest_event_date) && Intrinsics.areEqual(this.end_oldest_event_date, surrogate.end_oldest_event_date) && this.shard_region == surrogate.shard_region && this.shard_number == surrogate.shard_number;
        }

        public int hashCode() {
            int iHashCode = this.account_id.hashCode() * 31;
            String str = this.contract_id;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cursor;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.page_size;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.is_download_csv;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            FuturesContractTypeDto futuresContractTypeDto = this.contract_type;
            int iHashCode6 = (iHashCode5 + (futuresContractTypeDto == null ? 0 : futuresContractTypeDto.hashCode())) * 31;
            String str3 = this.account_number;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.start_oldest_event_date;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.end_oldest_event_date;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            ShardRegionDto shardRegionDto = this.shard_region;
            int iHashCode10 = (iHashCode9 + (shardRegionDto == null ? 0 : shardRegionDto.hashCode())) * 31;
            ShardNumberDto shardNumberDto = this.shard_number;
            return iHashCode10 + (shardNumberDto != null ? shardNumberDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", contract_id=" + this.contract_id + ", cursor=" + this.cursor + ", page_size=" + this.page_size + ", is_download_csv=" + this.is_download_csv + ", contract_type=" + this.contract_type + ", account_number=" + this.account_number + ", start_oldest_event_date=" + this.start_oldest_event_date + ", end_oldest_event_date=" + this.end_oldest_event_date + ", shard_region=" + this.shard_region + ", shard_number=" + this.shard_number + ")";
        }

        /* compiled from: GetCurrentAggregatedPositionsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCurrentAggregatedPositionsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, Integer num, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, String str4, String str5, String str6, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.contract_id = null;
            } else {
                this.contract_id = str2;
            }
            if ((i & 4) == 0) {
                this.cursor = null;
            } else {
                this.cursor = str3;
            }
            if ((i & 8) == 0) {
                this.page_size = null;
            } else {
                this.page_size = num;
            }
            if ((i & 16) == 0) {
                this.is_download_csv = null;
            } else {
                this.is_download_csv = bool;
            }
            if ((i & 32) == 0) {
                this.contract_type = null;
            } else {
                this.contract_type = futuresContractTypeDto;
            }
            if ((i & 64) == 0) {
                this.account_number = null;
            } else {
                this.account_number = str4;
            }
            if ((i & 128) == 0) {
                this.start_oldest_event_date = null;
            } else {
                this.start_oldest_event_date = str5;
            }
            if ((i & 256) == 0) {
                this.end_oldest_event_date = null;
            } else {
                this.end_oldest_event_date = str6;
            }
            if ((i & 512) == 0) {
                this.shard_region = null;
            } else {
                this.shard_region = shardRegionDto;
            }
            if ((i & 1024) == 0) {
                this.shard_number = null;
            } else {
                this.shard_number = shardNumberDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            String str = self.contract_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            String str2 = self.cursor;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str2);
            }
            Integer num = self.page_size;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            Boolean bool = self.is_download_csv;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, bool);
            }
            FuturesContractTypeDto futuresContractTypeDto = self.contract_type;
            if (futuresContractTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, FuturesContractTypeDto.Serializer.INSTANCE, futuresContractTypeDto);
            }
            String str3 = self.account_number;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.start_oldest_event_date;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.end_oldest_event_date;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str5);
            }
            ShardRegionDto shardRegionDto = self.shard_region;
            if (shardRegionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ShardRegionDto.Serializer.INSTANCE, shardRegionDto);
            }
            ShardNumberDto shardNumberDto = self.shard_number;
            if (shardNumberDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ShardNumberDto.Serializer.INSTANCE, shardNumberDto);
            }
        }

        public Surrogate(String account_id, String str, String str2, Integer num, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, String str3, String str4, String str5, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            this.account_id = account_id;
            this.contract_id = str;
            this.cursor = str2;
            this.page_size = num;
            this.is_download_csv = bool;
            this.contract_type = futuresContractTypeDto;
            this.account_number = str3;
            this.start_oldest_event_date = str4;
            this.end_oldest_event_date = str5;
            this.shard_region = shardRegionDto;
            this.shard_number = shardNumberDto;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Integer r5, java.lang.Boolean r6, com.robinhood.ceres.p284v1.FuturesContractTypeDto r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.robinhood.ceres.p284v1.ShardRegionDto r11, com.robinhood.ceres.p284v1.ShardNumberDto r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r1 = this;
                r14 = r13 & 1
                if (r14 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r14 = r13 & 2
                r0 = 0
                if (r14 == 0) goto Lc
                r3 = r0
            Lc:
                r14 = r13 & 4
                if (r14 == 0) goto L11
                r4 = r0
            L11:
                r14 = r13 & 8
                if (r14 == 0) goto L16
                r5 = r0
            L16:
                r14 = r13 & 16
                if (r14 == 0) goto L1b
                r6 = r0
            L1b:
                r14 = r13 & 32
                if (r14 == 0) goto L20
                r7 = r0
            L20:
                r14 = r13 & 64
                if (r14 == 0) goto L25
                r8 = r0
            L25:
                r14 = r13 & 128(0x80, float:1.794E-43)
                if (r14 == 0) goto L2a
                r9 = r0
            L2a:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L2f
                r10 = r0
            L2f:
                r14 = r13 & 512(0x200, float:7.175E-43)
                if (r14 == 0) goto L34
                r11 = r0
            L34:
                r13 = r13 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L45
                r14 = r0
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L51
            L45:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L51:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.ceres.p284v1.GetCurrentAggregatedPositionsRequestDto.Surrogate.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, com.robinhood.ceres.v1.FuturesContractTypeDto, java.lang.String, java.lang.String, java.lang.String, com.robinhood.ceres.v1.ShardRegionDto, com.robinhood.ceres.v1.ShardNumberDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final String getCursor() {
            return this.cursor;
        }

        public final Integer getPage_size() {
            return this.page_size;
        }

        public final Boolean is_download_csv() {
            return this.is_download_csv;
        }

        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getStart_oldest_event_date() {
            return this.start_oldest_event_date;
        }

        public final String getEnd_oldest_event_date() {
            return this.end_oldest_event_date;
        }

        public final ShardRegionDto getShard_region() {
            return this.shard_region;
        }

        public final ShardNumberDto getShard_number() {
            return this.shard_number;
        }
    }

    /* compiled from: GetCurrentAggregatedPositionsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCurrentAggregatedPositionsRequestDto, GetCurrentAggregatedPositionsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCurrentAggregatedPositionsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCurrentAggregatedPositionsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCurrentAggregatedPositionsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCurrentAggregatedPositionsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCurrentAggregatedPositionsRequest> getProtoAdapter() {
            return GetCurrentAggregatedPositionsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCurrentAggregatedPositionsRequestDto getZeroValue() {
            return GetCurrentAggregatedPositionsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCurrentAggregatedPositionsRequestDto fromProto(GetCurrentAggregatedPositionsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            String contract_id = proto.getContract_id();
            String cursor = proto.getCursor();
            Integer page_size = proto.getPage_size();
            Boolean is_download_csv = proto.getIs_download_csv();
            FuturesContractType contract_type = proto.getContract_type();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FuturesContractTypeDto futuresContractTypeDtoFromProto = contract_type != null ? FuturesContractTypeDto.INSTANCE.fromProto(contract_type) : null;
            String account_number = proto.getAccount_number();
            String start_oldest_event_date = proto.getStart_oldest_event_date();
            String end_oldest_event_date = proto.getEnd_oldest_event_date();
            ShardRegion shard_region = proto.getShard_region();
            ShardRegionDto shardRegionDtoFromProto = shard_region != null ? ShardRegionDto.INSTANCE.fromProto(shard_region) : null;
            ShardNumber shard_number = proto.getShard_number();
            return new GetCurrentAggregatedPositionsRequestDto(new Surrogate(account_id, contract_id, cursor, page_size, is_download_csv, futuresContractTypeDtoFromProto, account_number, start_oldest_event_date, end_oldest_event_date, shardRegionDtoFromProto, shard_number != null ? ShardNumberDto.INSTANCE.fromProto(shard_number) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.GetCurrentAggregatedPositionsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCurrentAggregatedPositionsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCurrentAggregatedPositionsRequestDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCurrentAggregatedPositionsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCurrentAggregatedPositionsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.GetCurrentAggregatedPositionsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCurrentAggregatedPositionsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCurrentAggregatedPositionsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCurrentAggregatedPositionsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCurrentAggregatedPositionsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCurrentAggregatedPositionsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.GetCurrentAggregatedPositionsRequestDto";
        }
    }
}
