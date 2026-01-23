package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;

/* compiled from: FuturesOrderLegDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043456B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u0016Jd\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\tJ\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020\tH\u0016J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u000fH\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000fH\u0016J\b\u00102\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0018¨\u00067"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesOrderLeg;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesOrderLegDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesOrderLegDto$Surrogate;)V", "id", "", "leg_id", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "contract_id", "ratio_quantity", "", "order_side", "Lrosetta/mainst/SideDto;", "average_price", "Lcom/robinhood/idl/IdlDecimal;", "symbol", "symbol_description", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;ILrosetta/mainst/SideDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLeg_id", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getContract_id", "getRatio_quantity", "()I", "getOrder_side", "()Lrosetta/mainst/SideDto;", "getAverage_price", "()Lcom/robinhood/idl/IdlDecimal;", "getSymbol", "getSymbol_description", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesOrderLegDto implements Dto3<FuturesOrderLeg>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesOrderLegDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesOrderLegDto, FuturesOrderLeg>> binaryBase64Serializer$delegate;
    private static final FuturesOrderLegDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesOrderLegDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesOrderLegDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getLeg_id() {
        return this.surrogate.getLeg_id();
    }

    public final FuturesContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final int getRatio_quantity() {
        return this.surrogate.getRatio_quantity();
    }

    public final SideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final IdlDecimal getAverage_price() {
        return this.surrogate.getAverage_price();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getSymbol_description() {
        return this.surrogate.getSymbol_description();
    }

    public /* synthetic */ FuturesOrderLegDto(String str, String str2, FuturesContractTypeDto futuresContractTypeDto, String str3, int i, SideDto sideDto, IdlDecimal idlDecimal, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 64) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesOrderLegDto(String id, String leg_id, FuturesContractTypeDto contract_type, String contract_id, int i, SideDto order_side, IdlDecimal average_price, String str, String str2) {
        this(new Surrogate(id, leg_id, contract_type, contract_id, i, order_side, average_price, str, str2));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(average_price, "average_price");
    }

    public static /* synthetic */ FuturesOrderLegDto copy$default(FuturesOrderLegDto futuresOrderLegDto, String str, String str2, FuturesContractTypeDto futuresContractTypeDto, String str3, int i, SideDto sideDto, IdlDecimal idlDecimal, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = futuresOrderLegDto.surrogate.getId();
        }
        if ((i2 & 2) != 0) {
            str2 = futuresOrderLegDto.surrogate.getLeg_id();
        }
        if ((i2 & 4) != 0) {
            futuresContractTypeDto = futuresOrderLegDto.surrogate.getContract_type();
        }
        if ((i2 & 8) != 0) {
            str3 = futuresOrderLegDto.surrogate.getContract_id();
        }
        if ((i2 & 16) != 0) {
            i = futuresOrderLegDto.surrogate.getRatio_quantity();
        }
        if ((i2 & 32) != 0) {
            sideDto = futuresOrderLegDto.surrogate.getOrder_side();
        }
        if ((i2 & 64) != 0) {
            idlDecimal = futuresOrderLegDto.surrogate.getAverage_price();
        }
        if ((i2 & 128) != 0) {
            str4 = futuresOrderLegDto.surrogate.getSymbol();
        }
        if ((i2 & 256) != 0) {
            str5 = futuresOrderLegDto.surrogate.getSymbol_description();
        }
        String str6 = str4;
        String str7 = str5;
        SideDto sideDto2 = sideDto;
        IdlDecimal idlDecimal2 = idlDecimal;
        int i3 = i;
        FuturesContractTypeDto futuresContractTypeDto2 = futuresContractTypeDto;
        return futuresOrderLegDto.copy(str, str2, futuresContractTypeDto2, str3, i3, sideDto2, idlDecimal2, str6, str7);
    }

    public final FuturesOrderLegDto copy(String id, String leg_id, FuturesContractTypeDto contract_type, String contract_id, int ratio_quantity, SideDto order_side, IdlDecimal average_price, String symbol, String symbol_description) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(leg_id, "leg_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(average_price, "average_price");
        return new FuturesOrderLegDto(new Surrogate(id, leg_id, contract_type, contract_id, ratio_quantity, order_side, average_price, symbol, symbol_description));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesOrderLeg toProto() {
        return new FuturesOrderLeg(this.surrogate.getId(), this.surrogate.getLeg_id(), (FuturesContractType) this.surrogate.getContract_type().toProto(), this.surrogate.getContract_id(), this.surrogate.getRatio_quantity(), (Side) this.surrogate.getOrder_side().toProto(), this.surrogate.getAverage_price().getStringValue(), this.surrogate.getSymbol(), this.surrogate.getSymbol_description(), null, 512, null);
    }

    public String toString() {
        return "[FuturesOrderLegDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesOrderLegDto) && Intrinsics.areEqual(((FuturesOrderLegDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesOrderLegDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002IJB\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u0019J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0018\u00106\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J\t\u00107\u001a\u00020\u000eHÆ\u0003J\u0018\u00108\u001a\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u0011HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0085\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\b\u0002\u0010\u000f\u001a\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\tHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001J%\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0001¢\u0006\u0002\bHR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*R+\u0010\u000f\u001a\u00110\u0010¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u001dR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001d¨\u0006K"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegDto$Surrogate;", "", "id", "", "leg_id", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "contract_id", "ratio_quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "order_side", "Lrosetta/mainst/SideDto;", "average_price", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "symbol", "symbol_description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;ILrosetta/mainst/SideDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Ljava/lang/String;ILrosetta/mainst/SideDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLeg_id$annotations", "getLeg_id", "getContract_type$annotations", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getContract_id$annotations", "getContract_id", "getRatio_quantity$annotations", "getRatio_quantity", "()I", "getOrder_side$annotations", "getOrder_side", "()Lrosetta/mainst/SideDto;", "getAverage_price$annotations", "getAverage_price", "()Lcom/robinhood/idl/IdlDecimal;", "getSymbol$annotations", "getSymbol", "getSymbol_description$annotations", "getSymbol_description", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal average_price;
        private final String contract_id;
        private final FuturesContractTypeDto contract_type;
        private final String id;
        private final String leg_id;
        private final SideDto order_side;
        private final int ratio_quantity;
        private final String symbol;
        private final String symbol_description;

        public Surrogate() {
            this((String) null, (String) null, (FuturesContractTypeDto) null, (String) null, 0, (SideDto) null, (IdlDecimal) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, FuturesContractTypeDto futuresContractTypeDto, String str3, int i, SideDto sideDto, IdlDecimal idlDecimal, String str4, String str5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.id;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.leg_id;
            }
            if ((i2 & 4) != 0) {
                futuresContractTypeDto = surrogate.contract_type;
            }
            if ((i2 & 8) != 0) {
                str3 = surrogate.contract_id;
            }
            if ((i2 & 16) != 0) {
                i = surrogate.ratio_quantity;
            }
            if ((i2 & 32) != 0) {
                sideDto = surrogate.order_side;
            }
            if ((i2 & 64) != 0) {
                idlDecimal = surrogate.average_price;
            }
            if ((i2 & 128) != 0) {
                str4 = surrogate.symbol;
            }
            if ((i2 & 256) != 0) {
                str5 = surrogate.symbol_description;
            }
            String str6 = str4;
            String str7 = str5;
            SideDto sideDto2 = sideDto;
            IdlDecimal idlDecimal2 = idlDecimal;
            int i3 = i;
            FuturesContractTypeDto futuresContractTypeDto2 = futuresContractTypeDto;
            return surrogate.copy(str, str2, futuresContractTypeDto2, str3, i3, sideDto2, idlDecimal2, str6, str7);
        }

        @SerialName("averagePrice")
        @JsonAnnotations2(names = {"average_price"})
        public static /* synthetic */ void getAverage_price$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("legId")
        @JsonAnnotations2(names = {"leg_id"})
        public static /* synthetic */ void getLeg_id$annotations() {
        }

        @SerialName("orderSide")
        @JsonAnnotations2(names = {"order_side"})
        public static /* synthetic */ void getOrder_side$annotations() {
        }

        @SerialName("ratioQuantity")
        @JsonAnnotations2(names = {"ratio_quantity"})
        public static /* synthetic */ void getRatio_quantity$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("symbolDescription")
        @JsonAnnotations2(names = {"symbol_description"})
        public static /* synthetic */ void getSymbol_description$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLeg_id() {
            return this.leg_id;
        }

        /* renamed from: component3, reason: from getter */
        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component5, reason: from getter */
        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        /* renamed from: component6, reason: from getter */
        public final SideDto getOrder_side() {
            return this.order_side;
        }

        /* renamed from: component7, reason: from getter */
        public final IdlDecimal getAverage_price() {
            return this.average_price;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSymbol_description() {
            return this.symbol_description;
        }

        public final Surrogate copy(String id, String leg_id, FuturesContractTypeDto contract_type, String contract_id, int ratio_quantity, SideDto order_side, IdlDecimal average_price, String symbol, String symbol_description) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(leg_id, "leg_id");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(average_price, "average_price");
            return new Surrogate(id, leg_id, contract_type, contract_id, ratio_quantity, order_side, average_price, symbol, symbol_description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.leg_id, surrogate.leg_id) && this.contract_type == surrogate.contract_type && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.ratio_quantity == surrogate.ratio_quantity && this.order_side == surrogate.order_side && Intrinsics.areEqual(this.average_price, surrogate.average_price) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.symbol_description, surrogate.symbol_description);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.leg_id.hashCode()) * 31) + this.contract_type.hashCode()) * 31) + this.contract_id.hashCode()) * 31) + Integer.hashCode(this.ratio_quantity)) * 31) + this.order_side.hashCode()) * 31) + this.average_price.hashCode()) * 31;
            String str = this.symbol;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.symbol_description;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", leg_id=" + this.leg_id + ", contract_type=" + this.contract_type + ", contract_id=" + this.contract_id + ", ratio_quantity=" + this.ratio_quantity + ", order_side=" + this.order_side + ", average_price=" + this.average_price + ", symbol=" + this.symbol + ", symbol_description=" + this.symbol_description + ")";
        }

        /* compiled from: FuturesOrderLegDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderLegDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesOrderLegDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, FuturesContractTypeDto futuresContractTypeDto, String str3, int i2, SideDto sideDto, IdlDecimal idlDecimal, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.leg_id = "";
            } else {
                this.leg_id = str2;
            }
            if ((i & 4) == 0) {
                this.contract_type = FuturesContractTypeDto.INSTANCE.getZeroValue();
            } else {
                this.contract_type = futuresContractTypeDto;
            }
            if ((i & 8) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str3;
            }
            if ((i & 16) == 0) {
                this.ratio_quantity = 0;
            } else {
                this.ratio_quantity = i2;
            }
            if ((i & 32) == 0) {
                this.order_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = sideDto;
            }
            if ((i & 64) == 0) {
                this.average_price = new IdlDecimal("");
            } else {
                this.average_price = idlDecimal;
            }
            if ((i & 128) == 0) {
                this.symbol = null;
            } else {
                this.symbol = str4;
            }
            if ((i & 256) == 0) {
                this.symbol_description = null;
            } else {
                this.symbol_description = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.leg_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.leg_id);
            }
            if (self.contract_type != FuturesContractTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, FuturesContractTypeDto.Serializer.INSTANCE, self.contract_type);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.contract_id);
            }
            int i = self.ratio_quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, SideDto.Serializer.INSTANCE, self.order_side);
            }
            if (!Intrinsics.areEqual(self.average_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.average_price);
            }
            String str = self.symbol;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str);
            }
            String str2 = self.symbol_description;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(String id, String leg_id, FuturesContractTypeDto contract_type, String contract_id, int i, SideDto order_side, IdlDecimal average_price, String str, String str2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(leg_id, "leg_id");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(average_price, "average_price");
            this.id = id;
            this.leg_id = leg_id;
            this.contract_type = contract_type;
            this.contract_id = contract_id;
            this.ratio_quantity = i;
            this.order_side = order_side;
            this.average_price = average_price;
            this.symbol = str;
            this.symbol_description = str2;
        }

        public /* synthetic */ Surrogate(String str, String str2, FuturesContractTypeDto futuresContractTypeDto, String str3, int i, SideDto sideDto, IdlDecimal idlDecimal, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 64) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5);
        }

        public final String getId() {
            return this.id;
        }

        public final String getLeg_id() {
            return this.leg_id;
        }

        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }

        public final IdlDecimal getAverage_price() {
            return this.average_price;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getSymbol_description() {
            return this.symbol_description;
        }
    }

    /* compiled from: FuturesOrderLegDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesOrderLegDto;", "Lcom/robinhood/ceres/v1/FuturesOrderLeg;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesOrderLegDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FuturesOrderLegDto, FuturesOrderLeg> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesOrderLegDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderLegDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderLegDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesOrderLegDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesOrderLeg> getProtoAdapter() {
            return FuturesOrderLeg.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderLegDto getZeroValue() {
            return FuturesOrderLegDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderLegDto fromProto(FuturesOrderLeg proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FuturesOrderLegDto(new Surrogate(proto.getId(), proto.getLeg_id(), FuturesContractTypeDto.INSTANCE.fromProto(proto.getContract_type()), proto.getContract_id(), proto.getRatio_quantity(), SideDto.INSTANCE.fromProto(proto.getOrder_side()), new IdlDecimal(proto.getAverage_price()), proto.getSymbol(), proto.getSymbol_description()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesOrderLegDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesOrderLegDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesOrderLegDto(null, null, null, null, 0, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesOrderLegDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderLegDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesOrderLegDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesOrderLegDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesOrderLeg", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesOrderLegDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesOrderLegDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesOrderLegDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesOrderLegDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderLegDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesOrderLegDto";
        }
    }
}
