package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.CashSettlementStatusDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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

/* compiled from: CashSettlementDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0012JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u00060"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/CashSettlement;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/CashSettlementDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/CashSettlementDto$Surrogate;)V", "id", "", "contract_id", "ref_id", "settlement_price", "Lcom/robinhood/idl/IdlDecimal;", "status", "Lcom/robinhood/ceres/v1/CashSettlementStatusDto;", "initiated_by_alias", "created_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/ceres/v1/CashSettlementStatusDto;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getContract_id", "getRef_id", "getSettlement_price", "()Lcom/robinhood/idl/IdlDecimal;", "getStatus", "()Lcom/robinhood/ceres/v1/CashSettlementStatusDto;", "getInitiated_by_alias", "getCreated_at", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class CashSettlementDto implements Dto3<CashSettlement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CashSettlementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CashSettlementDto, CashSettlement>> binaryBase64Serializer$delegate;
    private static final CashSettlementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CashSettlementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CashSettlementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final IdlDecimal getSettlement_price() {
        return this.surrogate.getSettlement_price();
    }

    public final CashSettlementStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final String getInitiated_by_alias() {
        return this.surrogate.getInitiated_by_alias();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public /* synthetic */ CashSettlementDto(String str, String str2, String str3, IdlDecimal idlDecimal, CashSettlementStatusDto cashSettlementStatusDto, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CashSettlementStatusDto.INSTANCE.getZeroValue() : cashSettlementStatusDto, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashSettlementDto(String id, String contract_id, String ref_id, IdlDecimal settlement_price, CashSettlementStatusDto status, String initiated_by_alias, String created_at) {
        this(new Surrogate(id, contract_id, ref_id, settlement_price, status, initiated_by_alias, created_at));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(settlement_price, "settlement_price");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(initiated_by_alias, "initiated_by_alias");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
    }

    public static /* synthetic */ CashSettlementDto copy$default(CashSettlementDto cashSettlementDto, String str, String str2, String str3, IdlDecimal idlDecimal, CashSettlementStatusDto cashSettlementStatusDto, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashSettlementDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = cashSettlementDto.surrogate.getContract_id();
        }
        if ((i & 4) != 0) {
            str3 = cashSettlementDto.surrogate.getRef_id();
        }
        if ((i & 8) != 0) {
            idlDecimal = cashSettlementDto.surrogate.getSettlement_price();
        }
        if ((i & 16) != 0) {
            cashSettlementStatusDto = cashSettlementDto.surrogate.getStatus();
        }
        if ((i & 32) != 0) {
            str4 = cashSettlementDto.surrogate.getInitiated_by_alias();
        }
        if ((i & 64) != 0) {
            str5 = cashSettlementDto.surrogate.getCreated_at();
        }
        String str6 = str4;
        String str7 = str5;
        CashSettlementStatusDto cashSettlementStatusDto2 = cashSettlementStatusDto;
        String str8 = str3;
        return cashSettlementDto.copy(str, str2, str8, idlDecimal, cashSettlementStatusDto2, str6, str7);
    }

    public final CashSettlementDto copy(String id, String contract_id, String ref_id, IdlDecimal settlement_price, CashSettlementStatusDto status, String initiated_by_alias, String created_at) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(settlement_price, "settlement_price");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(initiated_by_alias, "initiated_by_alias");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        return new CashSettlementDto(new Surrogate(id, contract_id, ref_id, settlement_price, status, initiated_by_alias, created_at));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CashSettlement toProto() {
        return new CashSettlement(this.surrogate.getId(), this.surrogate.getContract_id(), this.surrogate.getRef_id(), this.surrogate.getSettlement_price().getStringValue(), (CashSettlementStatus) this.surrogate.getStatus().toProto(), this.surrogate.getInitiated_by_alias(), this.surrogate.getCreated_at(), null, 128, null);
    }

    public String toString() {
        return "[CashSettlementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CashSettlementDto) && Intrinsics.areEqual(((CashSettlementDto) other).surrogate, this.surrogate);
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
    /* compiled from: CashSettlementDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002=>B\\\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0018\u0010+\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J^\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0012HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019¨\u0006?"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementDto$Surrogate;", "", "id", "", "contract_id", "ref_id", "settlement_price", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "status", "Lcom/robinhood/ceres/v1/CashSettlementStatusDto;", "initiated_by_alias", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/ceres/v1/CashSettlementStatusDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/ceres/v1/CashSettlementStatusDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getContract_id$annotations", "getContract_id", "getRef_id$annotations", "getRef_id", "getSettlement_price$annotations", "getSettlement_price", "()Lcom/robinhood/idl/IdlDecimal;", "getStatus$annotations", "getStatus", "()Lcom/robinhood/ceres/v1/CashSettlementStatusDto;", "getInitiated_by_alias$annotations", "getInitiated_by_alias", "getCreated_at$annotations", "getCreated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contract_id;
        private final String created_at;
        private final String id;
        private final String initiated_by_alias;
        private final String ref_id;
        private final IdlDecimal settlement_price;
        private final CashSettlementStatusDto status;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (IdlDecimal) null, (CashSettlementStatusDto) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, IdlDecimal idlDecimal, CashSettlementStatusDto cashSettlementStatusDto, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.contract_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.ref_id;
            }
            if ((i & 8) != 0) {
                idlDecimal = surrogate.settlement_price;
            }
            if ((i & 16) != 0) {
                cashSettlementStatusDto = surrogate.status;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.initiated_by_alias;
            }
            if ((i & 64) != 0) {
                str5 = surrogate.created_at;
            }
            String str6 = str4;
            String str7 = str5;
            CashSettlementStatusDto cashSettlementStatusDto2 = cashSettlementStatusDto;
            String str8 = str3;
            return surrogate.copy(str, str2, str8, idlDecimal, cashSettlementStatusDto2, str6, str7);
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("initiatedByAlias")
        @JsonAnnotations2(names = {"initiated_by_alias"})
        public static /* synthetic */ void getInitiated_by_alias$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("settlementPrice")
        @JsonAnnotations2(names = {"settlement_price"})
        public static /* synthetic */ void getSettlement_price$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getSettlement_price() {
            return this.settlement_price;
        }

        /* renamed from: component5, reason: from getter */
        public final CashSettlementStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final String getInitiated_by_alias() {
            return this.initiated_by_alias;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        public final Surrogate copy(String id, String contract_id, String ref_id, IdlDecimal settlement_price, CashSettlementStatusDto status, String initiated_by_alias, String created_at) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(settlement_price, "settlement_price");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(initiated_by_alias, "initiated_by_alias");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            return new Surrogate(id, contract_id, ref_id, settlement_price, status, initiated_by_alias, created_at);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.settlement_price, surrogate.settlement_price) && this.status == surrogate.status && Intrinsics.areEqual(this.initiated_by_alias, surrogate.initiated_by_alias) && Intrinsics.areEqual(this.created_at, surrogate.created_at);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.contract_id.hashCode()) * 31) + this.ref_id.hashCode()) * 31) + this.settlement_price.hashCode()) * 31) + this.status.hashCode()) * 31) + this.initiated_by_alias.hashCode()) * 31) + this.created_at.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", contract_id=" + this.contract_id + ", ref_id=" + this.ref_id + ", settlement_price=" + this.settlement_price + ", status=" + this.status + ", initiated_by_alias=" + this.initiated_by_alias + ", created_at=" + this.created_at + ")";
        }

        /* compiled from: CashSettlementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CashSettlementDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CashSettlementDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, IdlDecimal idlDecimal, CashSettlementStatusDto cashSettlementStatusDto, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str2;
            }
            if ((i & 4) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str3;
            }
            if ((i & 8) == 0) {
                this.settlement_price = new IdlDecimal("");
            } else {
                this.settlement_price = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.status = CashSettlementStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = cashSettlementStatusDto;
            }
            if ((i & 32) == 0) {
                this.initiated_by_alias = "";
            } else {
                this.initiated_by_alias = str4;
            }
            if ((i & 64) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.contract_id);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.settlement_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.settlement_price);
            }
            if (self.status != CashSettlementStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, CashSettlementStatusDto.Serializer.INSTANCE, self.status);
            }
            if (!Intrinsics.areEqual(self.initiated_by_alias, "")) {
                output.encodeStringElement(serialDesc, 5, self.initiated_by_alias);
            }
            if (Intrinsics.areEqual(self.created_at, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.created_at);
        }

        public Surrogate(String id, String contract_id, String ref_id, IdlDecimal settlement_price, CashSettlementStatusDto status, String initiated_by_alias, String created_at) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(settlement_price, "settlement_price");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(initiated_by_alias, "initiated_by_alias");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            this.id = id;
            this.contract_id = contract_id;
            this.ref_id = ref_id;
            this.settlement_price = settlement_price;
            this.status = status;
            this.initiated_by_alias = initiated_by_alias;
            this.created_at = created_at;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, IdlDecimal idlDecimal, CashSettlementStatusDto cashSettlementStatusDto, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CashSettlementStatusDto.INSTANCE.getZeroValue() : cashSettlementStatusDto, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
        }

        public final String getId() {
            return this.id;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final IdlDecimal getSettlement_price() {
            return this.settlement_price;
        }

        public final CashSettlementStatusDto getStatus() {
            return this.status;
        }

        public final String getInitiated_by_alias() {
            return this.initiated_by_alias;
        }

        public final String getCreated_at() {
            return this.created_at;
        }
    }

    /* compiled from: CashSettlementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/CashSettlementDto;", "Lcom/robinhood/ceres/v1/CashSettlement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/CashSettlementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CashSettlementDto, CashSettlement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CashSettlementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashSettlementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashSettlementDto> getBinaryBase64Serializer() {
            return (KSerializer) CashSettlementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CashSettlement> getProtoAdapter() {
            return CashSettlement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashSettlementDto getZeroValue() {
            return CashSettlementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashSettlementDto fromProto(CashSettlement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CashSettlementDto(new Surrogate(proto.getId(), proto.getContract_id(), proto.getRef_id(), new IdlDecimal(proto.getSettlement_price()), CashSettlementStatusDto.INSTANCE.fromProto(proto.getStatus()), proto.getInitiated_by_alias(), proto.getCreated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CashSettlementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashSettlementDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CashSettlementDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CashSettlementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CashSettlementDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/CashSettlementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CashSettlementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.CashSettlement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CashSettlementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CashSettlementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CashSettlementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CashSettlementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.CashSettlementDto";
        }
    }
}
