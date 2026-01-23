package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: GetBuyingPowerEffectResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u0012Jd\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u00060"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$Surrogate;)V", "buying_power_effect", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_fee", "stale_data", "", "total_commission", "total_gold_savings", "estimated_margin_required", "buying_power_before_order", "buying_power_after_order", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "getBuying_power_effect", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_fee", "getStale_data", "()Z", "getTotal_commission", "getTotal_gold_savings", "getEstimated_margin_required", "getBuying_power_before_order", "getBuying_power_after_order", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetBuyingPowerEffectResponseDto implements Dto3<GetBuyingPowerEffectResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetBuyingPowerEffectResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetBuyingPowerEffectResponseDto, GetBuyingPowerEffectResponse>> binaryBase64Serializer$delegate;
    private static final GetBuyingPowerEffectResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetBuyingPowerEffectResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetBuyingPowerEffectResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getBuying_power_effect() {
        return this.surrogate.getBuying_power_effect();
    }

    public final MoneyDto getTotal_fee() {
        return this.surrogate.getTotal_fee();
    }

    public final boolean getStale_data() {
        return this.surrogate.getStale_data();
    }

    public final MoneyDto getTotal_commission() {
        return this.surrogate.getTotal_commission();
    }

    public final MoneyDto getTotal_gold_savings() {
        return this.surrogate.getTotal_gold_savings();
    }

    public final MoneyDto getEstimated_margin_required() {
        return this.surrogate.getEstimated_margin_required();
    }

    public final MoneyDto getBuying_power_before_order() {
        return this.surrogate.getBuying_power_before_order();
    }

    public final MoneyDto getBuying_power_after_order() {
        return this.surrogate.getBuying_power_after_order();
    }

    public /* synthetic */ GetBuyingPowerEffectResponseDto(MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : moneyDto3, (i & 16) != 0 ? null : moneyDto4, (i & 32) != 0 ? null : moneyDto5, (i & 64) != 0 ? null : moneyDto6, (i & 128) != 0 ? null : moneyDto7);
    }

    public GetBuyingPowerEffectResponseDto(MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7) {
        this(new Surrogate(moneyDto, moneyDto2, z, moneyDto3, moneyDto4, moneyDto5, moneyDto6, moneyDto7));
    }

    public static /* synthetic */ GetBuyingPowerEffectResponseDto copy$default(GetBuyingPowerEffectResponseDto getBuyingPowerEffectResponseDto, MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyDto = getBuyingPowerEffectResponseDto.surrogate.getBuying_power_effect();
        }
        if ((i & 2) != 0) {
            moneyDto2 = getBuyingPowerEffectResponseDto.surrogate.getTotal_fee();
        }
        if ((i & 4) != 0) {
            z = getBuyingPowerEffectResponseDto.surrogate.getStale_data();
        }
        if ((i & 8) != 0) {
            moneyDto3 = getBuyingPowerEffectResponseDto.surrogate.getTotal_commission();
        }
        if ((i & 16) != 0) {
            moneyDto4 = getBuyingPowerEffectResponseDto.surrogate.getTotal_gold_savings();
        }
        if ((i & 32) != 0) {
            moneyDto5 = getBuyingPowerEffectResponseDto.surrogate.getEstimated_margin_required();
        }
        if ((i & 64) != 0) {
            moneyDto6 = getBuyingPowerEffectResponseDto.surrogate.getBuying_power_before_order();
        }
        if ((i & 128) != 0) {
            moneyDto7 = getBuyingPowerEffectResponseDto.surrogate.getBuying_power_after_order();
        }
        MoneyDto moneyDto8 = moneyDto6;
        MoneyDto moneyDto9 = moneyDto7;
        MoneyDto moneyDto10 = moneyDto4;
        MoneyDto moneyDto11 = moneyDto5;
        return getBuyingPowerEffectResponseDto.copy(moneyDto, moneyDto2, z, moneyDto3, moneyDto10, moneyDto11, moneyDto8, moneyDto9);
    }

    public final GetBuyingPowerEffectResponseDto copy(MoneyDto buying_power_effect, MoneyDto total_fee, boolean stale_data, MoneyDto total_commission, MoneyDto total_gold_savings, MoneyDto estimated_margin_required, MoneyDto buying_power_before_order, MoneyDto buying_power_after_order) {
        return new GetBuyingPowerEffectResponseDto(new Surrogate(buying_power_effect, total_fee, stale_data, total_commission, total_gold_savings, estimated_margin_required, buying_power_before_order, buying_power_after_order));
    }

    @Override // com.robinhood.idl.Dto
    public GetBuyingPowerEffectResponse toProto() {
        MoneyDto buying_power_effect = this.surrogate.getBuying_power_effect();
        Money proto = buying_power_effect != null ? buying_power_effect.toProto() : null;
        MoneyDto total_fee = this.surrogate.getTotal_fee();
        Money proto2 = total_fee != null ? total_fee.toProto() : null;
        boolean stale_data = this.surrogate.getStale_data();
        MoneyDto total_commission = this.surrogate.getTotal_commission();
        Money proto3 = total_commission != null ? total_commission.toProto() : null;
        MoneyDto total_gold_savings = this.surrogate.getTotal_gold_savings();
        Money proto4 = total_gold_savings != null ? total_gold_savings.toProto() : null;
        MoneyDto estimated_margin_required = this.surrogate.getEstimated_margin_required();
        Money proto5 = estimated_margin_required != null ? estimated_margin_required.toProto() : null;
        MoneyDto buying_power_before_order = this.surrogate.getBuying_power_before_order();
        Money proto6 = buying_power_before_order != null ? buying_power_before_order.toProto() : null;
        MoneyDto buying_power_after_order = this.surrogate.getBuying_power_after_order();
        return new GetBuyingPowerEffectResponse(proto, proto2, stale_data, proto3, proto4, proto5, proto6, buying_power_after_order != null ? buying_power_after_order.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[GetBuyingPowerEffectResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetBuyingPowerEffectResponseDto) && Intrinsics.areEqual(((GetBuyingPowerEffectResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetBuyingPowerEffectResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002<=Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rBi\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jg\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010/\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u000fHÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016¨\u0006>"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$Surrogate;", "", "buying_power_effect", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_fee", "stale_data", "", "total_commission", "total_gold_savings", "estimated_margin_required", "buying_power_before_order", "buying_power_after_order", "<init>", "(Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBuying_power_effect$annotations", "()V", "getBuying_power_effect", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_fee$annotations", "getTotal_fee", "getStale_data$annotations", "getStale_data", "()Z", "getTotal_commission$annotations", "getTotal_commission", "getTotal_gold_savings$annotations", "getTotal_gold_savings", "getEstimated_margin_required$annotations", "getEstimated_margin_required", "getBuying_power_before_order$annotations", "getBuying_power_before_order", "getBuying_power_after_order$annotations", "getBuying_power_after_order", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto buying_power_after_order;
        private final MoneyDto buying_power_before_order;
        private final MoneyDto buying_power_effect;
        private final MoneyDto estimated_margin_required;
        private final boolean stale_data;
        private final MoneyDto total_commission;
        private final MoneyDto total_fee;
        private final MoneyDto total_gold_savings;

        public Surrogate() {
            this((MoneyDto) null, (MoneyDto) null, false, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyDto = surrogate.buying_power_effect;
            }
            if ((i & 2) != 0) {
                moneyDto2 = surrogate.total_fee;
            }
            if ((i & 4) != 0) {
                z = surrogate.stale_data;
            }
            if ((i & 8) != 0) {
                moneyDto3 = surrogate.total_commission;
            }
            if ((i & 16) != 0) {
                moneyDto4 = surrogate.total_gold_savings;
            }
            if ((i & 32) != 0) {
                moneyDto5 = surrogate.estimated_margin_required;
            }
            if ((i & 64) != 0) {
                moneyDto6 = surrogate.buying_power_before_order;
            }
            if ((i & 128) != 0) {
                moneyDto7 = surrogate.buying_power_after_order;
            }
            MoneyDto moneyDto8 = moneyDto6;
            MoneyDto moneyDto9 = moneyDto7;
            MoneyDto moneyDto10 = moneyDto4;
            MoneyDto moneyDto11 = moneyDto5;
            return surrogate.copy(moneyDto, moneyDto2, z, moneyDto3, moneyDto10, moneyDto11, moneyDto8, moneyDto9);
        }

        @SerialName("buyingPowerAfterOrder")
        @JsonAnnotations2(names = {"buying_power_after_order"})
        public static /* synthetic */ void getBuying_power_after_order$annotations() {
        }

        @SerialName("buyingPowerBeforeOrder")
        @JsonAnnotations2(names = {"buying_power_before_order"})
        public static /* synthetic */ void getBuying_power_before_order$annotations() {
        }

        @SerialName("buyingPowerEffect")
        @JsonAnnotations2(names = {"buying_power_effect"})
        public static /* synthetic */ void getBuying_power_effect$annotations() {
        }

        @SerialName("estimatedMarginRequired")
        @JsonAnnotations2(names = {"estimated_margin_required"})
        public static /* synthetic */ void getEstimated_margin_required$annotations() {
        }

        @SerialName("staleData")
        @JsonAnnotations2(names = {"stale_data"})
        public static /* synthetic */ void getStale_data$annotations() {
        }

        @SerialName("totalCommission")
        @JsonAnnotations2(names = {"total_commission"})
        public static /* synthetic */ void getTotal_commission$annotations() {
        }

        @SerialName("totalFee")
        @JsonAnnotations2(names = {"total_fee"})
        public static /* synthetic */ void getTotal_fee$annotations() {
        }

        @SerialName("totalGoldSavings")
        @JsonAnnotations2(names = {"total_gold_savings"})
        public static /* synthetic */ void getTotal_gold_savings$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyDto getBuying_power_effect() {
            return this.buying_power_effect;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getTotal_fee() {
            return this.total_fee;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getStale_data() {
            return this.stale_data;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyDto getTotal_commission() {
            return this.total_commission;
        }

        /* renamed from: component5, reason: from getter */
        public final MoneyDto getTotal_gold_savings() {
            return this.total_gold_savings;
        }

        /* renamed from: component6, reason: from getter */
        public final MoneyDto getEstimated_margin_required() {
            return this.estimated_margin_required;
        }

        /* renamed from: component7, reason: from getter */
        public final MoneyDto getBuying_power_before_order() {
            return this.buying_power_before_order;
        }

        /* renamed from: component8, reason: from getter */
        public final MoneyDto getBuying_power_after_order() {
            return this.buying_power_after_order;
        }

        public final Surrogate copy(MoneyDto buying_power_effect, MoneyDto total_fee, boolean stale_data, MoneyDto total_commission, MoneyDto total_gold_savings, MoneyDto estimated_margin_required, MoneyDto buying_power_before_order, MoneyDto buying_power_after_order) {
            return new Surrogate(buying_power_effect, total_fee, stale_data, total_commission, total_gold_savings, estimated_margin_required, buying_power_before_order, buying_power_after_order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.buying_power_effect, surrogate.buying_power_effect) && Intrinsics.areEqual(this.total_fee, surrogate.total_fee) && this.stale_data == surrogate.stale_data && Intrinsics.areEqual(this.total_commission, surrogate.total_commission) && Intrinsics.areEqual(this.total_gold_savings, surrogate.total_gold_savings) && Intrinsics.areEqual(this.estimated_margin_required, surrogate.estimated_margin_required) && Intrinsics.areEqual(this.buying_power_before_order, surrogate.buying_power_before_order) && Intrinsics.areEqual(this.buying_power_after_order, surrogate.buying_power_after_order);
        }

        public int hashCode() {
            MoneyDto moneyDto = this.buying_power_effect;
            int iHashCode = (moneyDto == null ? 0 : moneyDto.hashCode()) * 31;
            MoneyDto moneyDto2 = this.total_fee;
            int iHashCode2 = (((iHashCode + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + Boolean.hashCode(this.stale_data)) * 31;
            MoneyDto moneyDto3 = this.total_commission;
            int iHashCode3 = (iHashCode2 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.total_gold_savings;
            int iHashCode4 = (iHashCode3 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            MoneyDto moneyDto5 = this.estimated_margin_required;
            int iHashCode5 = (iHashCode4 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31;
            MoneyDto moneyDto6 = this.buying_power_before_order;
            int iHashCode6 = (iHashCode5 + (moneyDto6 == null ? 0 : moneyDto6.hashCode())) * 31;
            MoneyDto moneyDto7 = this.buying_power_after_order;
            return iHashCode6 + (moneyDto7 != null ? moneyDto7.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(buying_power_effect=" + this.buying_power_effect + ", total_fee=" + this.total_fee + ", stale_data=" + this.stale_data + ", total_commission=" + this.total_commission + ", total_gold_savings=" + this.total_gold_savings + ", estimated_margin_required=" + this.estimated_margin_required + ", buying_power_before_order=" + this.buying_power_before_order + ", buying_power_after_order=" + this.buying_power_after_order + ")";
        }

        /* compiled from: GetBuyingPowerEffectResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetBuyingPowerEffectResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.buying_power_effect = null;
            } else {
                this.buying_power_effect = moneyDto;
            }
            if ((i & 2) == 0) {
                this.total_fee = null;
            } else {
                this.total_fee = moneyDto2;
            }
            if ((i & 4) == 0) {
                this.stale_data = false;
            } else {
                this.stale_data = z;
            }
            if ((i & 8) == 0) {
                this.total_commission = null;
            } else {
                this.total_commission = moneyDto3;
            }
            if ((i & 16) == 0) {
                this.total_gold_savings = null;
            } else {
                this.total_gold_savings = moneyDto4;
            }
            if ((i & 32) == 0) {
                this.estimated_margin_required = null;
            } else {
                this.estimated_margin_required = moneyDto5;
            }
            if ((i & 64) == 0) {
                this.buying_power_before_order = null;
            } else {
                this.buying_power_before_order = moneyDto6;
            }
            if ((i & 128) == 0) {
                this.buying_power_after_order = null;
            } else {
                this.buying_power_after_order = moneyDto7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MoneyDto moneyDto = self.buying_power_effect;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.total_fee;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            boolean z = self.stale_data;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            MoneyDto moneyDto3 = self.total_commission;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.total_gold_savings;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            MoneyDto moneyDto5 = self.estimated_margin_required;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            MoneyDto moneyDto6 = self.buying_power_before_order;
            if (moneyDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto6);
            }
            MoneyDto moneyDto7 = self.buying_power_after_order;
            if (moneyDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto7);
            }
        }

        public Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7) {
            this.buying_power_effect = moneyDto;
            this.total_fee = moneyDto2;
            this.stale_data = z;
            this.total_commission = moneyDto3;
            this.total_gold_savings = moneyDto4;
            this.estimated_margin_required = moneyDto5;
            this.buying_power_before_order = moneyDto6;
            this.buying_power_after_order = moneyDto7;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, MoneyDto moneyDto2, boolean z, MoneyDto moneyDto3, MoneyDto moneyDto4, MoneyDto moneyDto5, MoneyDto moneyDto6, MoneyDto moneyDto7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? null : moneyDto2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : moneyDto3, (i & 16) != 0 ? null : moneyDto4, (i & 32) != 0 ? null : moneyDto5, (i & 64) != 0 ? null : moneyDto6, (i & 128) != 0 ? null : moneyDto7);
        }

        public final MoneyDto getBuying_power_effect() {
            return this.buying_power_effect;
        }

        public final MoneyDto getTotal_fee() {
            return this.total_fee;
        }

        public final boolean getStale_data() {
            return this.stale_data;
        }

        public final MoneyDto getTotal_commission() {
            return this.total_commission;
        }

        public final MoneyDto getTotal_gold_savings() {
            return this.total_gold_savings;
        }

        public final MoneyDto getEstimated_margin_required() {
            return this.estimated_margin_required;
        }

        public final MoneyDto getBuying_power_before_order() {
            return this.buying_power_before_order;
        }

        public final MoneyDto getBuying_power_after_order() {
            return this.buying_power_after_order;
        }
    }

    /* compiled from: GetBuyingPowerEffectResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetBuyingPowerEffectResponseDto, GetBuyingPowerEffectResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetBuyingPowerEffectResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetBuyingPowerEffectResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetBuyingPowerEffectResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetBuyingPowerEffectResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetBuyingPowerEffectResponse> getProtoAdapter() {
            return GetBuyingPowerEffectResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetBuyingPowerEffectResponseDto getZeroValue() {
            return GetBuyingPowerEffectResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetBuyingPowerEffectResponseDto fromProto(GetBuyingPowerEffectResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money buying_power_effect = proto.getBuying_power_effect();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = buying_power_effect != null ? MoneyDto.INSTANCE.fromProto(buying_power_effect) : null;
            Money total_fee = proto.getTotal_fee();
            MoneyDto moneyDtoFromProto2 = total_fee != null ? MoneyDto.INSTANCE.fromProto(total_fee) : null;
            boolean stale_data = proto.getStale_data();
            Money total_commission = proto.getTotal_commission();
            MoneyDto moneyDtoFromProto3 = total_commission != null ? MoneyDto.INSTANCE.fromProto(total_commission) : null;
            Money total_gold_savings = proto.getTotal_gold_savings();
            MoneyDto moneyDtoFromProto4 = total_gold_savings != null ? MoneyDto.INSTANCE.fromProto(total_gold_savings) : null;
            Money estimated_margin_required = proto.getEstimated_margin_required();
            MoneyDto moneyDtoFromProto5 = estimated_margin_required != null ? MoneyDto.INSTANCE.fromProto(estimated_margin_required) : null;
            Money buying_power_before_order = proto.getBuying_power_before_order();
            MoneyDto moneyDtoFromProto6 = buying_power_before_order != null ? MoneyDto.INSTANCE.fromProto(buying_power_before_order) : null;
            Money buying_power_after_order = proto.getBuying_power_after_order();
            return new GetBuyingPowerEffectResponseDto(new Surrogate(moneyDtoFromProto, moneyDtoFromProto2, stale_data, moneyDtoFromProto3, moneyDtoFromProto4, moneyDtoFromProto5, moneyDtoFromProto6, buying_power_after_order != null ? MoneyDto.INSTANCE.fromProto(buying_power_after_order) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.GetBuyingPowerEffectResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetBuyingPowerEffectResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetBuyingPowerEffectResponseDto(null, null, false, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetBuyingPowerEffectResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetBuyingPowerEffectResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.GetBuyingPowerEffectResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetBuyingPowerEffectResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetBuyingPowerEffectResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetBuyingPowerEffectResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetBuyingPowerEffectResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.GetBuyingPowerEffectResponseDto";
        }
    }
}
