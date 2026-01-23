package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
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

/* compiled from: GetCashSettlementExecutionsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0014J_\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\u0013\u0010$\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\fH\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\fH\u0016J\b\u0010-\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Surrogate;)V", "account_id", "", "cursor", "page_size", "", "contract_id", "is_download_csv", "", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegionDto;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumberDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)V", "getAccount_id", "()Ljava/lang/String;", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "getContract_id", "()Ljava/lang/Boolean;", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegionDto;", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumberDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetCashSettlementExecutionsRequestDto implements Dto3<GetCashSettlementExecutionsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCashSettlementExecutionsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCashSettlementExecutionsRequestDto, GetCashSettlementExecutionsRequest>> binaryBase64Serializer$delegate;
    private static final GetCashSettlementExecutionsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCashSettlementExecutionsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCashSettlementExecutionsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getCursor() {
        return this.surrogate.getCursor();
    }

    public final Integer getPage_size() {
        return this.surrogate.getPage_size();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final Boolean is_download_csv() {
        return this.surrogate.is_download_csv();
    }

    public final ShardRegionDto getShard_region() {
        return this.surrogate.getShard_region();
    }

    public final ShardNumberDto getShard_number() {
        return this.surrogate.getShard_number();
    }

    public /* synthetic */ GetCashSettlementExecutionsRequestDto(String str, String str2, Integer num, String str3, Boolean bool, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : shardRegionDto, (i & 64) != 0 ? null : shardNumberDto);
    }

    public GetCashSettlementExecutionsRequestDto(String str, String str2, Integer num, String str3, Boolean bool, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto) {
        this(new Surrogate(str, str2, num, str3, bool, shardRegionDto, shardNumberDto));
    }

    public static /* synthetic */ GetCashSettlementExecutionsRequestDto copy$default(GetCashSettlementExecutionsRequestDto getCashSettlementExecutionsRequestDto, String str, String str2, Integer num, String str3, Boolean bool, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCashSettlementExecutionsRequestDto.surrogate.getAccount_id();
        }
        if ((i & 2) != 0) {
            str2 = getCashSettlementExecutionsRequestDto.surrogate.getCursor();
        }
        if ((i & 4) != 0) {
            num = getCashSettlementExecutionsRequestDto.surrogate.getPage_size();
        }
        if ((i & 8) != 0) {
            str3 = getCashSettlementExecutionsRequestDto.surrogate.getContract_id();
        }
        if ((i & 16) != 0) {
            bool = getCashSettlementExecutionsRequestDto.surrogate.is_download_csv();
        }
        if ((i & 32) != 0) {
            shardRegionDto = getCashSettlementExecutionsRequestDto.surrogate.getShard_region();
        }
        if ((i & 64) != 0) {
            shardNumberDto = getCashSettlementExecutionsRequestDto.surrogate.getShard_number();
        }
        ShardRegionDto shardRegionDto2 = shardRegionDto;
        ShardNumberDto shardNumberDto2 = shardNumberDto;
        Boolean bool2 = bool;
        Integer num2 = num;
        return getCashSettlementExecutionsRequestDto.copy(str, str2, num2, str3, bool2, shardRegionDto2, shardNumberDto2);
    }

    public final GetCashSettlementExecutionsRequestDto copy(String account_id, String cursor, Integer page_size, String contract_id, Boolean is_download_csv, ShardRegionDto shard_region, ShardNumberDto shard_number) {
        return new GetCashSettlementExecutionsRequestDto(new Surrogate(account_id, cursor, page_size, contract_id, is_download_csv, shard_region, shard_number));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCashSettlementExecutionsRequest toProto() {
        String account_id = this.surrogate.getAccount_id();
        String cursor = this.surrogate.getCursor();
        Integer page_size = this.surrogate.getPage_size();
        String contract_id = this.surrogate.getContract_id();
        Boolean boolIs_download_csv = this.surrogate.is_download_csv();
        ShardRegionDto shard_region = this.surrogate.getShard_region();
        ShardRegion shardRegion = shard_region != null ? (ShardRegion) shard_region.toProto() : null;
        ShardNumberDto shard_number = this.surrogate.getShard_number();
        return new GetCashSettlementExecutionsRequest(account_id, cursor, page_size, contract_id, boolIs_download_csv, shardRegion, shard_number != null ? (ShardNumber) shard_number.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[GetCashSettlementExecutionsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCashSettlementExecutionsRequestDto) && Intrinsics.areEqual(((GetCashSettlementExecutionsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCashSettlementExecutionsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002ABBj\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0019\b\u0002\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012Ba\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010.\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jq\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0006HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J%\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR/\u0010\u0005\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010%\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\u000b\u0010$R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010(R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010+¨\u0006C"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Surrogate;", "", "account_id", "", "cursor", "page_size", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "contract_id", "is_download_csv", "", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegionDto;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumberDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_id$annotations", "()V", "getAccount_id", "()Ljava/lang/String;", "getCursor$annotations", "getCursor", "getPage_size$annotations", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContract_id$annotations", "getContract_id", "is_download_csv$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShard_region$annotations", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegionDto;", "getShard_number$annotations", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumberDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String contract_id;
        private final String cursor;
        private final Boolean is_download_csv;
        private final Integer page_size;
        private final ShardNumberDto shard_number;
        private final ShardRegionDto shard_region;

        public Surrogate() {
            this((String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (ShardRegionDto) null, (ShardNumberDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Integer num, String str3, Boolean bool, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.account_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.cursor;
            }
            if ((i & 4) != 0) {
                num = surrogate.page_size;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.contract_id;
            }
            if ((i & 16) != 0) {
                bool = surrogate.is_download_csv;
            }
            if ((i & 32) != 0) {
                shardRegionDto = surrogate.shard_region;
            }
            if ((i & 64) != 0) {
                shardNumberDto = surrogate.shard_number;
            }
            ShardRegionDto shardRegionDto2 = shardRegionDto;
            ShardNumberDto shardNumberDto2 = shardNumberDto;
            Boolean bool2 = bool;
            Integer num2 = num;
            return surrogate.copy(str, str2, num2, str3, bool2, shardRegionDto2, shardNumberDto2);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("cursor")
        @JsonAnnotations2(names = {"cursor"})
        public static /* synthetic */ void getCursor$annotations() {
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

        @SerialName("isDownloadCsv")
        @JsonAnnotations2(names = {"is_download_csv"})
        public static /* synthetic */ void is_download_csv$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCursor() {
            return this.cursor;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getPage_size() {
            return this.page_size;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIs_download_csv() {
            return this.is_download_csv;
        }

        /* renamed from: component6, reason: from getter */
        public final ShardRegionDto getShard_region() {
            return this.shard_region;
        }

        /* renamed from: component7, reason: from getter */
        public final ShardNumberDto getShard_number() {
            return this.shard_number;
        }

        public final Surrogate copy(String account_id, String cursor, Integer page_size, String contract_id, Boolean is_download_csv, ShardRegionDto shard_region, ShardNumberDto shard_number) {
            return new Surrogate(account_id, cursor, page_size, contract_id, is_download_csv, shard_region, shard_number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.cursor, surrogate.cursor) && Intrinsics.areEqual(this.page_size, surrogate.page_size) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.is_download_csv, surrogate.is_download_csv) && this.shard_region == surrogate.shard_region && this.shard_number == surrogate.shard_number;
        }

        public int hashCode() {
            String str = this.account_id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.cursor;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.page_size;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.contract_id;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.is_download_csv;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            ShardRegionDto shardRegionDto = this.shard_region;
            int iHashCode6 = (iHashCode5 + (shardRegionDto == null ? 0 : shardRegionDto.hashCode())) * 31;
            ShardNumberDto shardNumberDto = this.shard_number;
            return iHashCode6 + (shardNumberDto != null ? shardNumberDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", cursor=" + this.cursor + ", page_size=" + this.page_size + ", contract_id=" + this.contract_id + ", is_download_csv=" + this.is_download_csv + ", shard_region=" + this.shard_region + ", shard_number=" + this.shard_number + ")";
        }

        /* compiled from: GetCashSettlementExecutionsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCashSettlementExecutionsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Integer num, String str3, Boolean bool, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_id = null;
            } else {
                this.account_id = str;
            }
            if ((i & 2) == 0) {
                this.cursor = null;
            } else {
                this.cursor = str2;
            }
            if ((i & 4) == 0) {
                this.page_size = null;
            } else {
                this.page_size = num;
            }
            if ((i & 8) == 0) {
                this.contract_id = null;
            } else {
                this.contract_id = str3;
            }
            if ((i & 16) == 0) {
                this.is_download_csv = null;
            } else {
                this.is_download_csv = bool;
            }
            if ((i & 32) == 0) {
                this.shard_region = null;
            } else {
                this.shard_region = shardRegionDto;
            }
            if ((i & 64) == 0) {
                this.shard_number = null;
            } else {
                this.shard_number = shardNumberDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.account_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.cursor;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            Integer num = self.page_size;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            String str3 = self.contract_id;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            Boolean bool = self.is_download_csv;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, bool);
            }
            ShardRegionDto shardRegionDto = self.shard_region;
            if (shardRegionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ShardRegionDto.Serializer.INSTANCE, shardRegionDto);
            }
            ShardNumberDto shardNumberDto = self.shard_number;
            if (shardNumberDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ShardNumberDto.Serializer.INSTANCE, shardNumberDto);
            }
        }

        public Surrogate(String str, String str2, Integer num, String str3, Boolean bool, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto) {
            this.account_id = str;
            this.cursor = str2;
            this.page_size = num;
            this.contract_id = str3;
            this.is_download_csv = bool;
            this.shard_region = shardRegionDto;
            this.shard_number = shardNumberDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, Integer num, String str3, Boolean bool, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : shardRegionDto, (i & 64) != 0 ? null : shardNumberDto);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getCursor() {
            return this.cursor;
        }

        public final Integer getPage_size() {
            return this.page_size;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final Boolean is_download_csv() {
            return this.is_download_csv;
        }

        public final ShardRegionDto getShard_region() {
            return this.shard_region;
        }

        public final ShardNumberDto getShard_number() {
            return this.shard_number;
        }
    }

    /* compiled from: GetCashSettlementExecutionsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCashSettlementExecutionsRequestDto, GetCashSettlementExecutionsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCashSettlementExecutionsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCashSettlementExecutionsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCashSettlementExecutionsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCashSettlementExecutionsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCashSettlementExecutionsRequest> getProtoAdapter() {
            return GetCashSettlementExecutionsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCashSettlementExecutionsRequestDto getZeroValue() {
            return GetCashSettlementExecutionsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCashSettlementExecutionsRequestDto fromProto(GetCashSettlementExecutionsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            String cursor = proto.getCursor();
            Integer page_size = proto.getPage_size();
            String contract_id = proto.getContract_id();
            Boolean is_download_csv = proto.getIs_download_csv();
            ShardRegion shard_region = proto.getShard_region();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ShardRegionDto shardRegionDtoFromProto = shard_region != null ? ShardRegionDto.INSTANCE.fromProto(shard_region) : null;
            ShardNumber shard_number = proto.getShard_number();
            return new GetCashSettlementExecutionsRequestDto(new Surrogate(account_id, cursor, page_size, contract_id, is_download_csv, shardRegionDtoFromProto, shard_number != null ? ShardNumberDto.INSTANCE.fromProto(shard_number) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.GetCashSettlementExecutionsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCashSettlementExecutionsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCashSettlementExecutionsRequestDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCashSettlementExecutionsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCashSettlementExecutionsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.GetCashSettlementExecutionsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCashSettlementExecutionsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCashSettlementExecutionsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCashSettlementExecutionsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCashSettlementExecutionsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.GetCashSettlementExecutionsRequestDto";
        }
    }
}
