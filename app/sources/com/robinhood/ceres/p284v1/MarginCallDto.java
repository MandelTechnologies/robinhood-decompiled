package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
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
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: MarginCallDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0012JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\rH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\rH\u0016J\b\u0010*\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006/"}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarginCallDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/MarginCall;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/MarginCallDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/MarginCallDto$Surrogate;)V", "id", "", "rhs_account_number", "rhd_account_number", "days_aged", "", "amount_start_of_day", "Lcom/robinhood/idl/IdlDecimal;", "outstanding_margin_call_amount", "non_displayable_outstanding_margin_call_amount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "getId", "()Ljava/lang/String;", "getRhs_account_number", "getRhd_account_number", "getDays_aged", "()I", "getAmount_start_of_day", "()Lcom/robinhood/idl/IdlDecimal;", "getOutstanding_margin_call_amount", "getNon_displayable_outstanding_margin_call_amount", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class MarginCallDto implements Dto3<MarginCall>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginCallDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginCallDto, MarginCall>> binaryBase64Serializer$delegate;
    private static final MarginCallDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginCallDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginCallDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final String getRhd_account_number() {
        return this.surrogate.getRhd_account_number();
    }

    public final int getDays_aged() {
        return this.surrogate.getDays_aged();
    }

    public final IdlDecimal getAmount_start_of_day() {
        return this.surrogate.getAmount_start_of_day();
    }

    public final IdlDecimal getOutstanding_margin_call_amount() {
        return this.surrogate.getOutstanding_margin_call_amount();
    }

    public final IdlDecimal getNon_displayable_outstanding_margin_call_amount() {
        return this.surrogate.getNon_displayable_outstanding_margin_call_amount();
    }

    public /* synthetic */ MarginCallDto(String str, String str2, String str3, int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i2 & 64) != 0 ? new IdlDecimal("") : idlDecimal3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginCallDto(String id, String rhs_account_number, String rhd_account_number, int i, IdlDecimal amount_start_of_day, IdlDecimal outstanding_margin_call_amount, IdlDecimal non_displayable_outstanding_margin_call_amount) {
        this(new Surrogate(id, rhs_account_number, rhd_account_number, i, amount_start_of_day, outstanding_margin_call_amount, non_displayable_outstanding_margin_call_amount));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
        Intrinsics.checkNotNullParameter(amount_start_of_day, "amount_start_of_day");
        Intrinsics.checkNotNullParameter(outstanding_margin_call_amount, "outstanding_margin_call_amount");
        Intrinsics.checkNotNullParameter(non_displayable_outstanding_margin_call_amount, "non_displayable_outstanding_margin_call_amount");
    }

    public static /* synthetic */ MarginCallDto copy$default(MarginCallDto marginCallDto, String str, String str2, String str3, int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = marginCallDto.surrogate.getId();
        }
        if ((i2 & 2) != 0) {
            str2 = marginCallDto.surrogate.getRhs_account_number();
        }
        if ((i2 & 4) != 0) {
            str3 = marginCallDto.surrogate.getRhd_account_number();
        }
        if ((i2 & 8) != 0) {
            i = marginCallDto.surrogate.getDays_aged();
        }
        if ((i2 & 16) != 0) {
            idlDecimal = marginCallDto.surrogate.getAmount_start_of_day();
        }
        if ((i2 & 32) != 0) {
            idlDecimal2 = marginCallDto.surrogate.getOutstanding_margin_call_amount();
        }
        if ((i2 & 64) != 0) {
            idlDecimal3 = marginCallDto.surrogate.getNon_displayable_outstanding_margin_call_amount();
        }
        IdlDecimal idlDecimal4 = idlDecimal2;
        IdlDecimal idlDecimal5 = idlDecimal3;
        IdlDecimal idlDecimal6 = idlDecimal;
        String str4 = str3;
        return marginCallDto.copy(str, str2, str4, i, idlDecimal6, idlDecimal4, idlDecimal5);
    }

    public final MarginCallDto copy(String id, String rhs_account_number, String rhd_account_number, int days_aged, IdlDecimal amount_start_of_day, IdlDecimal outstanding_margin_call_amount, IdlDecimal non_displayable_outstanding_margin_call_amount) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
        Intrinsics.checkNotNullParameter(amount_start_of_day, "amount_start_of_day");
        Intrinsics.checkNotNullParameter(outstanding_margin_call_amount, "outstanding_margin_call_amount");
        Intrinsics.checkNotNullParameter(non_displayable_outstanding_margin_call_amount, "non_displayable_outstanding_margin_call_amount");
        return new MarginCallDto(new Surrogate(id, rhs_account_number, rhd_account_number, days_aged, amount_start_of_day, outstanding_margin_call_amount, non_displayable_outstanding_margin_call_amount));
    }

    @Override // com.robinhood.idl.Dto
    public MarginCall toProto() {
        return new MarginCall(this.surrogate.getId(), this.surrogate.getRhs_account_number(), this.surrogate.getRhd_account_number(), this.surrogate.getDays_aged(), this.surrogate.getAmount_start_of_day().getStringValue(), this.surrogate.getOutstanding_margin_call_amount().getStringValue(), this.surrogate.getNon_displayable_outstanding_margin_call_amount().getStringValue(), null, 128, null);
    }

    public String toString() {
        return "[MarginCallDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginCallDto) && Intrinsics.areEqual(((MarginCallDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginCallDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002=>B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r¢\u0006\u0004\b\u0010\u0010\u0011B_\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0018\u0010+\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010,\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010-\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\rHÆ\u0003J\u0018\u0010.\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\rHÆ\u0003J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u000f\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\rHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0007HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010 R+\u0010\u000b\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R+\u0010\u000e\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010#R+\u0010\u000f\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010#¨\u0006?"}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarginCallDto$Surrogate;", "", "id", "", "rhs_account_number", "rhd_account_number", "days_aged", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "amount_start_of_day", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "outstanding_margin_call_amount", "non_displayable_outstanding_margin_call_amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getRhs_account_number$annotations", "getRhs_account_number", "getRhd_account_number$annotations", "getRhd_account_number", "getDays_aged$annotations", "getDays_aged", "()I", "getAmount_start_of_day$annotations", "getAmount_start_of_day", "()Lcom/robinhood/idl/IdlDecimal;", "getOutstanding_margin_call_amount$annotations", "getOutstanding_margin_call_amount", "getNon_displayable_outstanding_margin_call_amount$annotations", "getNon_displayable_outstanding_margin_call_amount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal amount_start_of_day;
        private final int days_aged;
        private final String id;
        private final IdlDecimal non_displayable_outstanding_margin_call_amount;
        private final IdlDecimal outstanding_margin_call_amount;
        private final String rhd_account_number;
        private final String rhs_account_number;

        public Surrogate() {
            this((String) null, (String) null, (String) null, 0, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.id;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.rhs_account_number;
            }
            if ((i2 & 4) != 0) {
                str3 = surrogate.rhd_account_number;
            }
            if ((i2 & 8) != 0) {
                i = surrogate.days_aged;
            }
            if ((i2 & 16) != 0) {
                idlDecimal = surrogate.amount_start_of_day;
            }
            if ((i2 & 32) != 0) {
                idlDecimal2 = surrogate.outstanding_margin_call_amount;
            }
            if ((i2 & 64) != 0) {
                idlDecimal3 = surrogate.non_displayable_outstanding_margin_call_amount;
            }
            IdlDecimal idlDecimal4 = idlDecimal2;
            IdlDecimal idlDecimal5 = idlDecimal3;
            IdlDecimal idlDecimal6 = idlDecimal;
            String str4 = str3;
            return surrogate.copy(str, str2, str4, i, idlDecimal6, idlDecimal4, idlDecimal5);
        }

        @SerialName("amountStartOfDay")
        @JsonAnnotations2(names = {"amount_start_of_day"})
        public static /* synthetic */ void getAmount_start_of_day$annotations() {
        }

        @SerialName("daysAged")
        @JsonAnnotations2(names = {"days_aged"})
        public static /* synthetic */ void getDays_aged$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("nonDisplayableOutstandingMarginCallAmount")
        @JsonAnnotations2(names = {"non_displayable_outstanding_margin_call_amount"})
        public static /* synthetic */ void getNon_displayable_outstanding_margin_call_amount$annotations() {
        }

        @SerialName("outstandingMarginCallAmount")
        @JsonAnnotations2(names = {"outstanding_margin_call_amount"})
        public static /* synthetic */ void getOutstanding_margin_call_amount$annotations() {
        }

        @SerialName("rhdAccountNumber")
        @JsonAnnotations2(names = {"rhd_account_number"})
        public static /* synthetic */ void getRhd_account_number$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhd_account_number() {
            return this.rhd_account_number;
        }

        /* renamed from: component4, reason: from getter */
        public final int getDays_aged() {
            return this.days_aged;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getAmount_start_of_day() {
            return this.amount_start_of_day;
        }

        /* renamed from: component6, reason: from getter */
        public final IdlDecimal getOutstanding_margin_call_amount() {
            return this.outstanding_margin_call_amount;
        }

        /* renamed from: component7, reason: from getter */
        public final IdlDecimal getNon_displayable_outstanding_margin_call_amount() {
            return this.non_displayable_outstanding_margin_call_amount;
        }

        public final Surrogate copy(String id, String rhs_account_number, String rhd_account_number, int days_aged, IdlDecimal amount_start_of_day, IdlDecimal outstanding_margin_call_amount, IdlDecimal non_displayable_outstanding_margin_call_amount) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
            Intrinsics.checkNotNullParameter(amount_start_of_day, "amount_start_of_day");
            Intrinsics.checkNotNullParameter(outstanding_margin_call_amount, "outstanding_margin_call_amount");
            Intrinsics.checkNotNullParameter(non_displayable_outstanding_margin_call_amount, "non_displayable_outstanding_margin_call_amount");
            return new Surrogate(id, rhs_account_number, rhd_account_number, days_aged, amount_start_of_day, outstanding_margin_call_amount, non_displayable_outstanding_margin_call_amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.rhd_account_number, surrogate.rhd_account_number) && this.days_aged == surrogate.days_aged && Intrinsics.areEqual(this.amount_start_of_day, surrogate.amount_start_of_day) && Intrinsics.areEqual(this.outstanding_margin_call_amount, surrogate.outstanding_margin_call_amount) && Intrinsics.areEqual(this.non_displayable_outstanding_margin_call_amount, surrogate.non_displayable_outstanding_margin_call_amount);
        }

        public int hashCode() {
            return (((((((((((this.id.hashCode() * 31) + this.rhs_account_number.hashCode()) * 31) + this.rhd_account_number.hashCode()) * 31) + Integer.hashCode(this.days_aged)) * 31) + this.amount_start_of_day.hashCode()) * 31) + this.outstanding_margin_call_amount.hashCode()) * 31) + this.non_displayable_outstanding_margin_call_amount.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", rhs_account_number=" + this.rhs_account_number + ", rhd_account_number=" + this.rhd_account_number + ", days_aged=" + this.days_aged + ", amount_start_of_day=" + this.amount_start_of_day + ", outstanding_margin_call_amount=" + this.outstanding_margin_call_amount + ", non_displayable_outstanding_margin_call_amount=" + this.non_displayable_outstanding_margin_call_amount + ")";
        }

        /* compiled from: MarginCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarginCallDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/MarginCallDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginCallDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, int i2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str2;
            }
            if ((i & 4) == 0) {
                this.rhd_account_number = "";
            } else {
                this.rhd_account_number = str3;
            }
            if ((i & 8) == 0) {
                this.days_aged = 0;
            } else {
                this.days_aged = i2;
            }
            if ((i & 16) == 0) {
                this.amount_start_of_day = new IdlDecimal("");
            } else {
                this.amount_start_of_day = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.outstanding_margin_call_amount = new IdlDecimal("");
            } else {
                this.outstanding_margin_call_amount = idlDecimal2;
            }
            if ((i & 64) == 0) {
                this.non_displayable_outstanding_margin_call_amount = new IdlDecimal("");
            } else {
                this.non_displayable_outstanding_margin_call_amount = idlDecimal3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.rhs_account_number);
            }
            if (!Intrinsics.areEqual(self.rhd_account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.rhd_account_number);
            }
            int i = self.days_aged;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.amount_start_of_day, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.amount_start_of_day);
            }
            if (!Intrinsics.areEqual(self.outstanding_margin_call_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.outstanding_margin_call_amount);
            }
            if (Intrinsics.areEqual(self.non_displayable_outstanding_margin_call_amount, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.non_displayable_outstanding_margin_call_amount);
        }

        public Surrogate(String id, String rhs_account_number, String rhd_account_number, int i, IdlDecimal amount_start_of_day, IdlDecimal outstanding_margin_call_amount, IdlDecimal non_displayable_outstanding_margin_call_amount) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(rhd_account_number, "rhd_account_number");
            Intrinsics.checkNotNullParameter(amount_start_of_day, "amount_start_of_day");
            Intrinsics.checkNotNullParameter(outstanding_margin_call_amount, "outstanding_margin_call_amount");
            Intrinsics.checkNotNullParameter(non_displayable_outstanding_margin_call_amount, "non_displayable_outstanding_margin_call_amount");
            this.id = id;
            this.rhs_account_number = rhs_account_number;
            this.rhd_account_number = rhd_account_number;
            this.days_aged = i;
            this.amount_start_of_day = amount_start_of_day;
            this.outstanding_margin_call_amount = outstanding_margin_call_amount;
            this.non_displayable_outstanding_margin_call_amount = non_displayable_outstanding_margin_call_amount;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i2 & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i2 & 64) != 0 ? new IdlDecimal("") : idlDecimal3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final String getRhd_account_number() {
            return this.rhd_account_number;
        }

        public final int getDays_aged() {
            return this.days_aged;
        }

        public final IdlDecimal getAmount_start_of_day() {
            return this.amount_start_of_day;
        }

        public final IdlDecimal getOutstanding_margin_call_amount() {
            return this.outstanding_margin_call_amount;
        }

        public final IdlDecimal getNon_displayable_outstanding_margin_call_amount() {
            return this.non_displayable_outstanding_margin_call_amount;
        }
    }

    /* compiled from: MarginCallDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarginCallDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/MarginCallDto;", "Lcom/robinhood/ceres/v1/MarginCall;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/MarginCallDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MarginCallDto, MarginCall> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginCallDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginCallDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginCallDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginCallDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginCall> getProtoAdapter() {
            return MarginCall.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginCallDto getZeroValue() {
            return MarginCallDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginCallDto fromProto(MarginCall proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MarginCallDto(new Surrogate(proto.getId(), proto.getRhs_account_number(), proto.getRhd_account_number(), proto.getDays_aged(), new IdlDecimal(proto.getAmount_start_of_day()), new IdlDecimal(proto.getOutstanding_margin_call_amount()), new IdlDecimal(proto.getNon_displayable_outstanding_margin_call_amount())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.MarginCallDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginCallDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginCallDto(null, null, null, 0, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginCallDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarginCallDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/MarginCallDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/MarginCallDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MarginCallDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.MarginCall", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginCallDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginCallDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginCallDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginCallDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/MarginCallDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.MarginCallDto";
        }
    }
}
