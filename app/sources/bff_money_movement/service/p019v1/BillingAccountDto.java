package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.BillingAccountTypeDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.Image;
import rh_server_driven_ui.p531v1.ImageDto;

/* compiled from: BillingAccountDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00047689B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0091\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u00103R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001f¨\u0006:"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/BillingAccount;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/BillingAccountDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/BillingAccountDto$Surrogate;)V", "", "id", "Lbff_money_movement/service/v1/BillingAccountTypeDto;", "type", "Lcom/robinhood/rosetta/common/MoneyDto;", "instant_available_amount", "instant_daily_amount", "", "remaining_count_limit", "daily_count_limit", "primary_label", "secondary_label", "Lrh_server_driven_ui/v1/ImageDto;", "icon", "", "is_3ds_required", "nickname", "type_name", "trailing_digits", "(Ljava/lang/String;Lbff_money_movement/service/v1/BillingAccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;IILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ImageDto;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbff_money_movement/service/v1/BillingAccount;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/BillingAccountDto$Surrogate;", "getId", "getType", "()Lbff_money_movement/service/v1/BillingAccountTypeDto;", "getInstant_available_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "()Z", "getNickname", "getTrailing_digits", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class BillingAccountDto implements Dto3<BillingAccount>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BillingAccountDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BillingAccountDto, BillingAccount>> binaryBase64Serializer$delegate;
    private static final BillingAccountDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BillingAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BillingAccountDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final BillingAccountTypeDto getType() {
        return this.surrogate.getType();
    }

    public final MoneyDto getInstant_available_amount() {
        return this.surrogate.getInstant_available_amount();
    }

    public final boolean is_3ds_required() {
        return this.surrogate.getIs_3ds_required();
    }

    public final String getNickname() {
        return this.surrogate.getNickname();
    }

    public final String getTrailing_digits() {
        return this.surrogate.getTrailing_digits();
    }

    public /* synthetic */ BillingAccountDto(String str, BillingAccountTypeDto billingAccountTypeDto, MoneyDto moneyDto, MoneyDto moneyDto2, int i, int i2, String str2, String str3, ImageDto imageDto, boolean z, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? BillingAccountTypeDto.INSTANCE.getZeroValue() : billingAccountTypeDto, (i3 & 4) != 0 ? null : moneyDto, (i3 & 8) != 0 ? null : moneyDto2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str2, (i3 & 128) != 0 ? "" : str3, (i3 & 256) == 0 ? imageDto : null, (i3 & 512) == 0 ? z : false, (i3 & 1024) != 0 ? "" : str4, (i3 & 2048) != 0 ? "" : str5, (i3 & 4096) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BillingAccountDto(String id, BillingAccountTypeDto type2, MoneyDto moneyDto, MoneyDto moneyDto2, int i, int i2, String primary_label, String secondary_label, ImageDto imageDto, boolean z, String nickname, String type_name, String trailing_digits) {
        this(new Surrogate(id, type2, moneyDto, moneyDto2, i, i2, primary_label, secondary_label, imageDto, z, nickname, type_name, trailing_digits));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(primary_label, "primary_label");
        Intrinsics.checkNotNullParameter(secondary_label, "secondary_label");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(type_name, "type_name");
        Intrinsics.checkNotNullParameter(trailing_digits, "trailing_digits");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BillingAccount toProto() {
        String id = this.surrogate.getId();
        BillingAccountType billingAccountType = (BillingAccountType) this.surrogate.getType().toProto();
        MoneyDto instant_available_amount = this.surrogate.getInstant_available_amount();
        Money proto = instant_available_amount != null ? instant_available_amount.toProto() : null;
        MoneyDto instant_daily_amount = this.surrogate.getInstant_daily_amount();
        Money proto2 = instant_daily_amount != null ? instant_daily_amount.toProto() : null;
        int remaining_count_limit = this.surrogate.getRemaining_count_limit();
        int daily_count_limit = this.surrogate.getDaily_count_limit();
        String primary_label = this.surrogate.getPrimary_label();
        String secondary_label = this.surrogate.getSecondary_label();
        ImageDto icon = this.surrogate.getIcon();
        return new BillingAccount(id, billingAccountType, proto, proto2, remaining_count_limit, daily_count_limit, primary_label, secondary_label, icon != null ? icon.toProto() : null, this.surrogate.getIs_3ds_required(), this.surrogate.getNickname(), this.surrogate.getType_name(), this.surrogate.getTrailing_digits(), null, 8192, null);
    }

    public String toString() {
        return "[BillingAccountDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BillingAccountDto) && Intrinsics.areEqual(((BillingAccountDto) other).surrogate, this.surrogate);
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
    /* compiled from: BillingAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b1\b\u0083\b\u0018\u0000 R2\u00020\u0001:\u0002SRB\u00ad\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019B\u0097\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010(R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b5\u00101\u001a\u0004\b3\u00104R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b9\u00101\u001a\u0004\b7\u00108R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b;\u00101\u001a\u0004\b:\u00108R/\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b>\u00101\u001a\u0004\b=\u0010*R/\u0010\u000e\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010<\u0012\u0004\b@\u00101\u001a\u0004\b?\u0010*R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010.\u0012\u0004\bB\u00101\u001a\u0004\bA\u0010(R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010.\u0012\u0004\bD\u00101\u001a\u0004\bC\u0010(R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010E\u0012\u0004\bH\u00101\u001a\u0004\bF\u0010GR \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010I\u0012\u0004\bK\u00101\u001a\u0004\b\u0014\u0010JR \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010.\u0012\u0004\bM\u00101\u001a\u0004\bL\u0010(R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010.\u0012\u0004\bO\u00101\u001a\u0004\bN\u0010(R \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010.\u0012\u0004\bQ\u00101\u001a\u0004\bP\u0010(¨\u0006T"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccountDto$Surrogate;", "", "", "id", "Lbff_money_movement/service/v1/BillingAccountTypeDto;", "type", "Lcom/robinhood/rosetta/common/MoneyDto;", "instant_available_amount", "instant_daily_amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "remaining_count_limit", "daily_count_limit", "primary_label", "secondary_label", "Lrh_server_driven_ui/v1/ImageDto;", "icon", "", "is_3ds_required", "nickname", "type_name", "trailing_digits", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/BillingAccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;IILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ImageDto;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbff_money_movement/service/v1/BillingAccountTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;IILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ImageDto;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/BillingAccountDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lbff_money_movement/service/v1/BillingAccountTypeDto;", "getType", "()Lbff_money_movement/service/v1/BillingAccountTypeDto;", "getType$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getInstant_available_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getInstant_available_amount$annotations", "getInstant_daily_amount", "getInstant_daily_amount$annotations", "I", "getRemaining_count_limit", "getRemaining_count_limit$annotations", "getDaily_count_limit", "getDaily_count_limit$annotations", "getPrimary_label", "getPrimary_label$annotations", "getSecondary_label", "getSecondary_label$annotations", "Lrh_server_driven_ui/v1/ImageDto;", "getIcon", "()Lrh_server_driven_ui/v1/ImageDto;", "getIcon$annotations", "Z", "()Z", "is_3ds_required$annotations", "getNickname", "getNickname$annotations", "getType_name", "getType_name$annotations", "getTrailing_digits", "getTrailing_digits$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int daily_count_limit;
        private final ImageDto icon;
        private final String id;
        private final MoneyDto instant_available_amount;
        private final MoneyDto instant_daily_amount;
        private final boolean is_3ds_required;
        private final String nickname;
        private final String primary_label;
        private final int remaining_count_limit;
        private final String secondary_label;
        private final String trailing_digits;
        private final BillingAccountTypeDto type;
        private final String type_name;

        public Surrogate() {
            this((String) null, (BillingAccountTypeDto) null, (MoneyDto) null, (MoneyDto) null, 0, 0, (String) null, (String) null, (ImageDto) null, false, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.type == surrogate.type && Intrinsics.areEqual(this.instant_available_amount, surrogate.instant_available_amount) && Intrinsics.areEqual(this.instant_daily_amount, surrogate.instant_daily_amount) && this.remaining_count_limit == surrogate.remaining_count_limit && this.daily_count_limit == surrogate.daily_count_limit && Intrinsics.areEqual(this.primary_label, surrogate.primary_label) && Intrinsics.areEqual(this.secondary_label, surrogate.secondary_label) && Intrinsics.areEqual(this.icon, surrogate.icon) && this.is_3ds_required == surrogate.is_3ds_required && Intrinsics.areEqual(this.nickname, surrogate.nickname) && Intrinsics.areEqual(this.type_name, surrogate.type_name) && Intrinsics.areEqual(this.trailing_digits, surrogate.trailing_digits);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.type.hashCode()) * 31;
            MoneyDto moneyDto = this.instant_available_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.instant_daily_amount;
            int iHashCode3 = (((((((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + Integer.hashCode(this.remaining_count_limit)) * 31) + Integer.hashCode(this.daily_count_limit)) * 31) + this.primary_label.hashCode()) * 31) + this.secondary_label.hashCode()) * 31;
            ImageDto imageDto = this.icon;
            return ((((((((iHashCode3 + (imageDto != null ? imageDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.is_3ds_required)) * 31) + this.nickname.hashCode()) * 31) + this.type_name.hashCode()) * 31) + this.trailing_digits.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", type=" + this.type + ", instant_available_amount=" + this.instant_available_amount + ", instant_daily_amount=" + this.instant_daily_amount + ", remaining_count_limit=" + this.remaining_count_limit + ", daily_count_limit=" + this.daily_count_limit + ", primary_label=" + this.primary_label + ", secondary_label=" + this.secondary_label + ", icon=" + this.icon + ", is_3ds_required=" + this.is_3ds_required + ", nickname=" + this.nickname + ", type_name=" + this.type_name + ", trailing_digits=" + this.trailing_digits + ")";
        }

        /* compiled from: BillingAccountDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/BillingAccountDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BillingAccountDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BillingAccountTypeDto billingAccountTypeDto, MoneyDto moneyDto, MoneyDto moneyDto2, int i2, int i3, String str2, String str3, ImageDto imageDto, boolean z, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.type = BillingAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = billingAccountTypeDto;
            }
            if ((i & 4) == 0) {
                this.instant_available_amount = null;
            } else {
                this.instant_available_amount = moneyDto;
            }
            if ((i & 8) == 0) {
                this.instant_daily_amount = null;
            } else {
                this.instant_daily_amount = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.remaining_count_limit = 0;
            } else {
                this.remaining_count_limit = i2;
            }
            if ((i & 32) == 0) {
                this.daily_count_limit = 0;
            } else {
                this.daily_count_limit = i3;
            }
            if ((i & 64) == 0) {
                this.primary_label = "";
            } else {
                this.primary_label = str2;
            }
            if ((i & 128) == 0) {
                this.secondary_label = "";
            } else {
                this.secondary_label = str3;
            }
            if ((i & 256) == 0) {
                this.icon = null;
            } else {
                this.icon = imageDto;
            }
            if ((i & 512) == 0) {
                this.is_3ds_required = false;
            } else {
                this.is_3ds_required = z;
            }
            if ((i & 1024) == 0) {
                this.nickname = "";
            } else {
                this.nickname = str4;
            }
            if ((i & 2048) == 0) {
                this.type_name = "";
            } else {
                this.type_name = str5;
            }
            if ((i & 4096) == 0) {
                this.trailing_digits = "";
            } else {
                this.trailing_digits = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.type != BillingAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BillingAccountTypeDto.Serializer.INSTANCE, self.type);
            }
            MoneyDto moneyDto = self.instant_available_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.instant_daily_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            int i = self.remaining_count_limit;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.daily_count_limit;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (!Intrinsics.areEqual(self.primary_label, "")) {
                output.encodeStringElement(serialDesc, 6, self.primary_label);
            }
            if (!Intrinsics.areEqual(self.secondary_label, "")) {
                output.encodeStringElement(serialDesc, 7, self.secondary_label);
            }
            ImageDto imageDto = self.icon;
            if (imageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ImageDto.Serializer.INSTANCE, imageDto);
            }
            boolean z = self.is_3ds_required;
            if (z) {
                output.encodeBooleanElement(serialDesc, 9, z);
            }
            if (!Intrinsics.areEqual(self.nickname, "")) {
                output.encodeStringElement(serialDesc, 10, self.nickname);
            }
            if (!Intrinsics.areEqual(self.type_name, "")) {
                output.encodeStringElement(serialDesc, 11, self.type_name);
            }
            if (Intrinsics.areEqual(self.trailing_digits, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 12, self.trailing_digits);
        }

        public Surrogate(String id, BillingAccountTypeDto type2, MoneyDto moneyDto, MoneyDto moneyDto2, int i, int i2, String primary_label, String secondary_label, ImageDto imageDto, boolean z, String nickname, String type_name, String trailing_digits) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(primary_label, "primary_label");
            Intrinsics.checkNotNullParameter(secondary_label, "secondary_label");
            Intrinsics.checkNotNullParameter(nickname, "nickname");
            Intrinsics.checkNotNullParameter(type_name, "type_name");
            Intrinsics.checkNotNullParameter(trailing_digits, "trailing_digits");
            this.id = id;
            this.type = type2;
            this.instant_available_amount = moneyDto;
            this.instant_daily_amount = moneyDto2;
            this.remaining_count_limit = i;
            this.daily_count_limit = i2;
            this.primary_label = primary_label;
            this.secondary_label = secondary_label;
            this.icon = imageDto;
            this.is_3ds_required = z;
            this.nickname = nickname;
            this.type_name = type_name;
            this.trailing_digits = trailing_digits;
        }

        public /* synthetic */ Surrogate(String str, BillingAccountTypeDto billingAccountTypeDto, MoneyDto moneyDto, MoneyDto moneyDto2, int i, int i2, String str2, String str3, ImageDto imageDto, boolean z, String str4, String str5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? BillingAccountTypeDto.INSTANCE.getZeroValue() : billingAccountTypeDto, (i3 & 4) != 0 ? null : moneyDto, (i3 & 8) != 0 ? null : moneyDto2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str2, (i3 & 128) != 0 ? "" : str3, (i3 & 256) == 0 ? imageDto : null, (i3 & 512) == 0 ? z : false, (i3 & 1024) != 0 ? "" : str4, (i3 & 2048) != 0 ? "" : str5, (i3 & 4096) != 0 ? "" : str6);
        }

        public final String getId() {
            return this.id;
        }

        public final BillingAccountTypeDto getType() {
            return this.type;
        }

        public final MoneyDto getInstant_available_amount() {
            return this.instant_available_amount;
        }

        public final MoneyDto getInstant_daily_amount() {
            return this.instant_daily_amount;
        }

        public final int getRemaining_count_limit() {
            return this.remaining_count_limit;
        }

        public final int getDaily_count_limit() {
            return this.daily_count_limit;
        }

        public final String getPrimary_label() {
            return this.primary_label;
        }

        public final String getSecondary_label() {
            return this.secondary_label;
        }

        public final ImageDto getIcon() {
            return this.icon;
        }

        /* renamed from: is_3ds_required, reason: from getter */
        public final boolean getIs_3ds_required() {
            return this.is_3ds_required;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public final String getType_name() {
            return this.type_name;
        }

        public final String getTrailing_digits() {
            return this.trailing_digits;
        }
    }

    /* compiled from: BillingAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/BillingAccountDto;", "Lbff_money_movement/service/v1/BillingAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/BillingAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BillingAccountDto, BillingAccount> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BillingAccountDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BillingAccountDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BillingAccountDto> getBinaryBase64Serializer() {
            return (KSerializer) BillingAccountDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BillingAccount> getProtoAdapter() {
            return BillingAccount.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BillingAccountDto getZeroValue() {
            return BillingAccountDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BillingAccountDto fromProto(BillingAccount proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            BillingAccountTypeDto billingAccountTypeDtoFromProto = BillingAccountTypeDto.INSTANCE.fromProto(proto.getType());
            Money instant_available_amount = proto.getInstant_available_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = instant_available_amount != null ? MoneyDto.INSTANCE.fromProto(instant_available_amount) : null;
            Money instant_daily_amount = proto.getInstant_daily_amount();
            MoneyDto moneyDtoFromProto2 = instant_daily_amount != null ? MoneyDto.INSTANCE.fromProto(instant_daily_amount) : null;
            int remaining_count_limit = proto.getRemaining_count_limit();
            int daily_count_limit = proto.getDaily_count_limit();
            String primary_label = proto.getPrimary_label();
            String secondary_label = proto.getSecondary_label();
            Image icon = proto.getIcon();
            return new BillingAccountDto(new Surrogate(id, billingAccountTypeDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, remaining_count_limit, daily_count_limit, primary_label, secondary_label, icon != null ? ImageDto.INSTANCE.fromProto(icon) : null, proto.getIs_3ds_required(), proto.getNickname(), proto.getType_name(), proto.getTrailing_digits()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.BillingAccountDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BillingAccountDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BillingAccountDto(null, null, null, null, 0, 0, null, null, null, false, null, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BillingAccountDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/BillingAccountDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/BillingAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BillingAccountDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.BillingAccount", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BillingAccountDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BillingAccountDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BillingAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BillingAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.BillingAccountDto";
        }
    }
}
