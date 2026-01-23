package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: PnLCostBasisInfoDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000fJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006+"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/PnLCostBasisInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$Surrogate;)V", "open_pnl_cost_basis", "Lcom/robinhood/rosetta/common/MoneyDto;", "day_pnl_cost_basis", "signed_quantity", "Lcom/robinhood/idl/IdlDecimal;", "avg_trade_price", "day_open_pnl_cost_basis", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;)V", "getOpen_pnl_cost_basis", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getDay_pnl_cost_basis", "getSigned_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getAvg_trade_price", "getDay_open_pnl_cost_basis", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class PnLCostBasisInfoDto implements Dto3<PnLCostBasisInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PnLCostBasisInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PnLCostBasisInfoDto, PnLCostBasisInfo>> binaryBase64Serializer$delegate;
    private static final PnLCostBasisInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PnLCostBasisInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PnLCostBasisInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getOpen_pnl_cost_basis() {
        return this.surrogate.getOpen_pnl_cost_basis();
    }

    public final MoneyDto getDay_pnl_cost_basis() {
        return this.surrogate.getDay_pnl_cost_basis();
    }

    public final IdlDecimal getSigned_quantity() {
        return this.surrogate.getSigned_quantity();
    }

    public final IdlDecimal getAvg_trade_price() {
        return this.surrogate.getAvg_trade_price();
    }

    public final MoneyDto getDay_open_pnl_cost_basis() {
        return this.surrogate.getDay_open_pnl_cost_basis();
    }

    public /* synthetic */ PnLCostBasisInfoDto(MoneyDto moneyDto, MoneyDto moneyDto2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, MoneyDto moneyDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? null : moneyDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PnLCostBasisInfoDto(MoneyDto moneyDto, MoneyDto moneyDto2, IdlDecimal signed_quantity, IdlDecimal avg_trade_price, MoneyDto moneyDto3) {
        this(new Surrogate(moneyDto, moneyDto2, signed_quantity, avg_trade_price, moneyDto3));
        Intrinsics.checkNotNullParameter(signed_quantity, "signed_quantity");
        Intrinsics.checkNotNullParameter(avg_trade_price, "avg_trade_price");
    }

    public static /* synthetic */ PnLCostBasisInfoDto copy$default(PnLCostBasisInfoDto pnLCostBasisInfoDto, MoneyDto moneyDto, MoneyDto moneyDto2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, MoneyDto moneyDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyDto = pnLCostBasisInfoDto.surrogate.getOpen_pnl_cost_basis();
        }
        if ((i & 2) != 0) {
            moneyDto2 = pnLCostBasisInfoDto.surrogate.getDay_pnl_cost_basis();
        }
        if ((i & 4) != 0) {
            idlDecimal = pnLCostBasisInfoDto.surrogate.getSigned_quantity();
        }
        if ((i & 8) != 0) {
            idlDecimal2 = pnLCostBasisInfoDto.surrogate.getAvg_trade_price();
        }
        if ((i & 16) != 0) {
            moneyDto3 = pnLCostBasisInfoDto.surrogate.getDay_open_pnl_cost_basis();
        }
        MoneyDto moneyDto4 = moneyDto3;
        IdlDecimal idlDecimal3 = idlDecimal;
        return pnLCostBasisInfoDto.copy(moneyDto, moneyDto2, idlDecimal3, idlDecimal2, moneyDto4);
    }

    public final PnLCostBasisInfoDto copy(MoneyDto open_pnl_cost_basis, MoneyDto day_pnl_cost_basis, IdlDecimal signed_quantity, IdlDecimal avg_trade_price, MoneyDto day_open_pnl_cost_basis) {
        Intrinsics.checkNotNullParameter(signed_quantity, "signed_quantity");
        Intrinsics.checkNotNullParameter(avg_trade_price, "avg_trade_price");
        return new PnLCostBasisInfoDto(new Surrogate(open_pnl_cost_basis, day_pnl_cost_basis, signed_quantity, avg_trade_price, day_open_pnl_cost_basis));
    }

    @Override // com.robinhood.idl.Dto
    public PnLCostBasisInfo toProto() {
        MoneyDto open_pnl_cost_basis = this.surrogate.getOpen_pnl_cost_basis();
        Money proto = open_pnl_cost_basis != null ? open_pnl_cost_basis.toProto() : null;
        MoneyDto day_pnl_cost_basis = this.surrogate.getDay_pnl_cost_basis();
        Money proto2 = day_pnl_cost_basis != null ? day_pnl_cost_basis.toProto() : null;
        String stringValue = this.surrogate.getSigned_quantity().getStringValue();
        String stringValue2 = this.surrogate.getAvg_trade_price().getStringValue();
        MoneyDto day_open_pnl_cost_basis = this.surrogate.getDay_open_pnl_cost_basis();
        return new PnLCostBasisInfo(proto, proto2, stringValue, stringValue2, day_open_pnl_cost_basis != null ? day_open_pnl_cost_basis.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[PnLCostBasisInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PnLCostBasisInfoDto) && Intrinsics.areEqual(((PnLCostBasisInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: PnLCostBasisInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010#\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000fHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR+\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001bR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u00066"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$Surrogate;", "", "open_pnl_cost_basis", "Lcom/robinhood/rosetta/common/MoneyDto;", "day_pnl_cost_basis", "signed_quantity", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "avg_trade_price", "day_open_pnl_cost_basis", "<init>", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOpen_pnl_cost_basis$annotations", "()V", "getOpen_pnl_cost_basis", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getDay_pnl_cost_basis$annotations", "getDay_pnl_cost_basis", "getSigned_quantity$annotations", "getSigned_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getAvg_trade_price$annotations", "getAvg_trade_price", "getDay_open_pnl_cost_basis$annotations", "getDay_open_pnl_cost_basis", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal avg_trade_price;
        private final MoneyDto day_open_pnl_cost_basis;
        private final MoneyDto day_pnl_cost_basis;
        private final MoneyDto open_pnl_cost_basis;
        private final IdlDecimal signed_quantity;

        public Surrogate() {
            this((MoneyDto) null, (MoneyDto) null, (IdlDecimal) null, (IdlDecimal) null, (MoneyDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MoneyDto moneyDto, MoneyDto moneyDto2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, MoneyDto moneyDto3, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyDto = surrogate.open_pnl_cost_basis;
            }
            if ((i & 2) != 0) {
                moneyDto2 = surrogate.day_pnl_cost_basis;
            }
            if ((i & 4) != 0) {
                idlDecimal = surrogate.signed_quantity;
            }
            if ((i & 8) != 0) {
                idlDecimal2 = surrogate.avg_trade_price;
            }
            if ((i & 16) != 0) {
                moneyDto3 = surrogate.day_open_pnl_cost_basis;
            }
            MoneyDto moneyDto4 = moneyDto3;
            IdlDecimal idlDecimal3 = idlDecimal;
            return surrogate.copy(moneyDto, moneyDto2, idlDecimal3, idlDecimal2, moneyDto4);
        }

        @SerialName("avgTradePrice")
        @JsonAnnotations2(names = {"avg_trade_price"})
        public static /* synthetic */ void getAvg_trade_price$annotations() {
        }

        @SerialName("dayOpenPnlCostBasis")
        @JsonAnnotations2(names = {"day_open_pnl_cost_basis"})
        public static /* synthetic */ void getDay_open_pnl_cost_basis$annotations() {
        }

        @SerialName("dayPnlCostBasis")
        @JsonAnnotations2(names = {"day_pnl_cost_basis"})
        public static /* synthetic */ void getDay_pnl_cost_basis$annotations() {
        }

        @SerialName("openPnlCostBasis")
        @JsonAnnotations2(names = {"open_pnl_cost_basis"})
        public static /* synthetic */ void getOpen_pnl_cost_basis$annotations() {
        }

        @SerialName("signedQuantity")
        @JsonAnnotations2(names = {"signed_quantity"})
        public static /* synthetic */ void getSigned_quantity$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyDto getOpen_pnl_cost_basis() {
            return this.open_pnl_cost_basis;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getDay_pnl_cost_basis() {
            return this.day_pnl_cost_basis;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getSigned_quantity() {
            return this.signed_quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getAvg_trade_price() {
            return this.avg_trade_price;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getDay_open_pnl_cost_basis() {
            return this.day_open_pnl_cost_basis;
        }

        public final Surrogate copy(MoneyDto open_pnl_cost_basis, MoneyDto day_pnl_cost_basis, IdlDecimal signed_quantity, IdlDecimal avg_trade_price, MoneyDto day_open_pnl_cost_basis) {
            Intrinsics.checkNotNullParameter(signed_quantity, "signed_quantity");
            Intrinsics.checkNotNullParameter(avg_trade_price, "avg_trade_price");
            return new Surrogate(open_pnl_cost_basis, day_pnl_cost_basis, signed_quantity, avg_trade_price, day_open_pnl_cost_basis);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.open_pnl_cost_basis, surrogate.open_pnl_cost_basis) && Intrinsics.areEqual(this.day_pnl_cost_basis, surrogate.day_pnl_cost_basis) && Intrinsics.areEqual(this.signed_quantity, surrogate.signed_quantity) && Intrinsics.areEqual(this.avg_trade_price, surrogate.avg_trade_price) && Intrinsics.areEqual(this.day_open_pnl_cost_basis, surrogate.day_open_pnl_cost_basis);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.open_pnl_cost_basis;
            int iHashCode = (moneyDto == null ? 0 : moneyDto.hashCode()) * 31;
            MoneyDto moneyDto2 = this.day_pnl_cost_basis;
            int iHashCode2 = (((((iHashCode + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.signed_quantity.hashCode()) * 31) + this.avg_trade_price.hashCode()) * 31;
            MoneyDto moneyDto3 = this.day_open_pnl_cost_basis;
            return iHashCode2 + (moneyDto3 != null ? moneyDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(open_pnl_cost_basis=" + this.open_pnl_cost_basis + ", day_pnl_cost_basis=" + this.day_pnl_cost_basis + ", signed_quantity=" + this.signed_quantity + ", avg_trade_price=" + this.avg_trade_price + ", day_open_pnl_cost_basis=" + this.day_open_pnl_cost_basis + ")";
        }

        /* compiled from: PnLCostBasisInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PnLCostBasisInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, MoneyDto moneyDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.open_pnl_cost_basis = null;
            } else {
                this.open_pnl_cost_basis = moneyDto;
            }
            if ((i & 2) == 0) {
                this.day_pnl_cost_basis = null;
            } else {
                this.day_pnl_cost_basis = moneyDto2;
            }
            if ((i & 4) == 0) {
                this.signed_quantity = new IdlDecimal("");
            } else {
                this.signed_quantity = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.avg_trade_price = new IdlDecimal("");
            } else {
                this.avg_trade_price = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.day_open_pnl_cost_basis = null;
            } else {
                this.day_open_pnl_cost_basis = moneyDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.open_pnl_cost_basis;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.day_pnl_cost_basis;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.signed_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.signed_quantity);
            }
            if (!Intrinsics.areEqual(self.avg_trade_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.avg_trade_price);
            }
            MoneyDto moneyDto3 = self.day_open_pnl_cost_basis;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
        }

        public Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, IdlDecimal signed_quantity, IdlDecimal avg_trade_price, MoneyDto moneyDto3) {
            Intrinsics.checkNotNullParameter(signed_quantity, "signed_quantity");
            Intrinsics.checkNotNullParameter(avg_trade_price, "avg_trade_price");
            this.open_pnl_cost_basis = moneyDto;
            this.day_pnl_cost_basis = moneyDto2;
            this.signed_quantity = signed_quantity;
            this.avg_trade_price = avg_trade_price;
            this.day_open_pnl_cost_basis = moneyDto3;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, MoneyDto moneyDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? null : moneyDto3);
        }

        public final MoneyDto getOpen_pnl_cost_basis() {
            return this.open_pnl_cost_basis;
        }

        public final MoneyDto getDay_pnl_cost_basis() {
            return this.day_pnl_cost_basis;
        }

        public final IdlDecimal getSigned_quantity() {
            return this.signed_quantity;
        }

        public final IdlDecimal getAvg_trade_price() {
            return this.avg_trade_price;
        }

        public final MoneyDto getDay_open_pnl_cost_basis() {
            return this.day_open_pnl_cost_basis;
        }
    }

    /* compiled from: PnLCostBasisInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto;", "Lcom/robinhood/ceres/v1/PnLCostBasisInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PnLCostBasisInfoDto, PnLCostBasisInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PnLCostBasisInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PnLCostBasisInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PnLCostBasisInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) PnLCostBasisInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PnLCostBasisInfo> getProtoAdapter() {
            return PnLCostBasisInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PnLCostBasisInfoDto getZeroValue() {
            return PnLCostBasisInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PnLCostBasisInfoDto fromProto(PnLCostBasisInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money open_pnl_cost_basis = proto.getOpen_pnl_cost_basis();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = open_pnl_cost_basis != null ? MoneyDto.INSTANCE.fromProto(open_pnl_cost_basis) : null;
            Money day_pnl_cost_basis = proto.getDay_pnl_cost_basis();
            MoneyDto moneyDtoFromProto2 = day_pnl_cost_basis != null ? MoneyDto.INSTANCE.fromProto(day_pnl_cost_basis) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getSigned_quantity());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getAvg_trade_price());
            Money day_open_pnl_cost_basis = proto.getDay_open_pnl_cost_basis();
            return new PnLCostBasisInfoDto(new Surrogate(moneyDtoFromProto, moneyDtoFromProto2, idlDecimal, idlDecimal2, day_open_pnl_cost_basis != null ? MoneyDto.INSTANCE.fromProto(day_open_pnl_cost_basis) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.PnLCostBasisInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PnLCostBasisInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PnLCostBasisInfoDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PnLCostBasisInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PnLCostBasisInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.PnLCostBasisInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PnLCostBasisInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PnLCostBasisInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PnLCostBasisInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PnLCostBasisInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/PnLCostBasisInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.PnLCostBasisInfoDto";
        }
    }
}
