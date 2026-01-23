package idl.recurring.proto.p474v1;

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
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
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

/* compiled from: GetScheduleConfigResponseDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Be\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00061"}, m3636d2 = {"Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lidl/recurring/proto/v1/GetScheduleConfigResponse;", "Landroid/os/Parcelable;", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Surrogate;", "surrogate", "<init>", "(Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Surrogate;)V", "Lcom/robinhood/rosetta/common/DateDto;", "min_start_date", "max_start_date", "", "weekend_enabled", "Lcom/robinhood/rosetta/common/MoneyDto;", "buying_power", "Lcom/robinhood/idl/IdlDecimal;", "fee_ratio", "min_order_size", "max_order_size", "min_fee", "(Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lidl/recurring/proto/v1/GetScheduleConfigResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Surrogate;", "getBuying_power", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getMin_order_size", "getMax_order_size", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.recurring.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class GetScheduleConfigResponseDto implements Dto3<GetScheduleConfigResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetScheduleConfigResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetScheduleConfigResponseDto, GetScheduleConfigResponse>> binaryBase64Serializer$delegate;
    private static final GetScheduleConfigResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetScheduleConfigResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetScheduleConfigResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getBuying_power() {
        return this.surrogate.getBuying_power();
    }

    public final MoneyDto getMin_order_size() {
        return this.surrogate.getMin_order_size();
    }

    public final MoneyDto getMax_order_size() {
        return this.surrogate.getMax_order_size();
    }

    public /* synthetic */ GetScheduleConfigResponseDto(DateDto dateDto, DateDto dateDto2, boolean z, MoneyDto moneyDto, IdlDecimal idlDecimal, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dateDto, (i & 2) != 0 ? null : dateDto2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? null : moneyDto2, (i & 64) != 0 ? null : moneyDto3, (i & 128) != 0 ? null : moneyDto4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetScheduleConfigResponseDto(DateDto dateDto, DateDto dateDto2, boolean z, MoneyDto moneyDto, IdlDecimal fee_ratio, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4) {
        this(new Surrogate(dateDto, dateDto2, z, moneyDto, fee_ratio, moneyDto2, moneyDto3, moneyDto4));
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
    }

    @Override // com.robinhood.idl.Dto
    public GetScheduleConfigResponse toProto() {
        DateDto min_start_date = this.surrogate.getMin_start_date();
        Date proto = min_start_date != null ? min_start_date.toProto() : null;
        DateDto max_start_date = this.surrogate.getMax_start_date();
        Date proto2 = max_start_date != null ? max_start_date.toProto() : null;
        boolean weekend_enabled = this.surrogate.getWeekend_enabled();
        MoneyDto buying_power = this.surrogate.getBuying_power();
        Money proto3 = buying_power != null ? buying_power.toProto() : null;
        String stringValue = this.surrogate.getFee_ratio().getStringValue();
        MoneyDto min_order_size = this.surrogate.getMin_order_size();
        Money proto4 = min_order_size != null ? min_order_size.toProto() : null;
        MoneyDto max_order_size = this.surrogate.getMax_order_size();
        Money proto5 = max_order_size != null ? max_order_size.toProto() : null;
        MoneyDto min_fee = this.surrogate.getMin_fee();
        return new GetScheduleConfigResponse(proto, proto2, weekend_enabled, proto3, stringValue, proto4, proto5, min_fee != null ? min_fee.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[GetScheduleConfigResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetScheduleConfigResponseDto) && Intrinsics.areEqual(((GetScheduleConfigResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetScheduleConfigResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002CBBr\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0017\b\u0002\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012Bi\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b3\u0010-\u001a\u0004\b1\u00102R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b7\u0010-\u001a\u0004\b5\u00106R/\u0010\r\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00104\u0012\u0004\b=\u0010-\u001a\u0004\b<\u00106R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00104\u0012\u0004\b?\u0010-\u001a\u0004\b>\u00106R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00104\u0012\u0004\bA\u0010-\u001a\u0004\b@\u00106¨\u0006D"}, m3636d2 = {"Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Surrogate;", "", "Lcom/robinhood/rosetta/common/DateDto;", "min_start_date", "max_start_date", "", "weekend_enabled", "Lcom/robinhood/rosetta/common/MoneyDto;", "buying_power", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "fee_ratio", "min_order_size", "max_order_size", "min_fee", "<init>", "(Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;ZLcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_recurring_v1_externalRelease", "(Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/common/DateDto;", "getMin_start_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getMin_start_date$annotations", "()V", "getMax_start_date", "getMax_start_date$annotations", "Z", "getWeekend_enabled", "()Z", "getWeekend_enabled$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getBuying_power", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getBuying_power$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio$annotations", "getMin_order_size", "getMin_order_size$annotations", "getMax_order_size", "getMax_order_size$annotations", "getMin_fee", "getMin_fee$annotations", "Companion", "$serializer", "bonfire.proto.idl.recurring.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto buying_power;
        private final IdlDecimal fee_ratio;
        private final MoneyDto max_order_size;
        private final DateDto max_start_date;
        private final MoneyDto min_fee;
        private final MoneyDto min_order_size;
        private final DateDto min_start_date;
        private final boolean weekend_enabled;

        public Surrogate() {
            this((DateDto) null, (DateDto) null, false, (MoneyDto) null, (IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.min_start_date, surrogate.min_start_date) && Intrinsics.areEqual(this.max_start_date, surrogate.max_start_date) && this.weekend_enabled == surrogate.weekend_enabled && Intrinsics.areEqual(this.buying_power, surrogate.buying_power) && Intrinsics.areEqual(this.fee_ratio, surrogate.fee_ratio) && Intrinsics.areEqual(this.min_order_size, surrogate.min_order_size) && Intrinsics.areEqual(this.max_order_size, surrogate.max_order_size) && Intrinsics.areEqual(this.min_fee, surrogate.min_fee);
        }

        public int hashCode() {
            DateDto dateDto = this.min_start_date;
            int iHashCode = (dateDto == null ? 0 : dateDto.hashCode()) * 31;
            DateDto dateDto2 = this.max_start_date;
            int iHashCode2 = (((iHashCode + (dateDto2 == null ? 0 : dateDto2.hashCode())) * 31) + Boolean.hashCode(this.weekend_enabled)) * 31;
            MoneyDto moneyDto = this.buying_power;
            int iHashCode3 = (((iHashCode2 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.fee_ratio.hashCode()) * 31;
            MoneyDto moneyDto2 = this.min_order_size;
            int iHashCode4 = (iHashCode3 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.max_order_size;
            int iHashCode5 = (iHashCode4 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.min_fee;
            return iHashCode5 + (moneyDto4 != null ? moneyDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(min_start_date=" + this.min_start_date + ", max_start_date=" + this.max_start_date + ", weekend_enabled=" + this.weekend_enabled + ", buying_power=" + this.buying_power + ", fee_ratio=" + this.fee_ratio + ", min_order_size=" + this.min_order_size + ", max_order_size=" + this.max_order_size + ", min_fee=" + this.min_fee + ")";
        }

        /* compiled from: GetScheduleConfigResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Surrogate;", "bonfire.proto.idl.recurring.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetScheduleConfigResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DateDto dateDto, DateDto dateDto2, boolean z, MoneyDto moneyDto, IdlDecimal idlDecimal, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.min_start_date = null;
            } else {
                this.min_start_date = dateDto;
            }
            if ((i & 2) == 0) {
                this.max_start_date = null;
            } else {
                this.max_start_date = dateDto2;
            }
            if ((i & 4) == 0) {
                this.weekend_enabled = false;
            } else {
                this.weekend_enabled = z;
            }
            if ((i & 8) == 0) {
                this.buying_power = null;
            } else {
                this.buying_power = moneyDto;
            }
            if ((i & 16) == 0) {
                this.fee_ratio = new IdlDecimal("");
            } else {
                this.fee_ratio = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.min_order_size = null;
            } else {
                this.min_order_size = moneyDto2;
            }
            if ((i & 64) == 0) {
                this.max_order_size = null;
            } else {
                this.max_order_size = moneyDto3;
            }
            if ((i & 128) == 0) {
                this.min_fee = null;
            } else {
                this.min_fee = moneyDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_recurring_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DateDto dateDto = self.min_start_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DateDto.Serializer.INSTANCE, dateDto);
            }
            DateDto dateDto2 = self.max_start_date;
            if (dateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, DateDto.Serializer.INSTANCE, dateDto2);
            }
            boolean z = self.weekend_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            MoneyDto moneyDto = self.buying_power;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.fee_ratio, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.fee_ratio);
            }
            MoneyDto moneyDto2 = self.min_order_size;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.max_order_size;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.min_fee;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
        }

        public Surrogate(DateDto dateDto, DateDto dateDto2, boolean z, MoneyDto moneyDto, IdlDecimal fee_ratio, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4) {
            Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
            this.min_start_date = dateDto;
            this.max_start_date = dateDto2;
            this.weekend_enabled = z;
            this.buying_power = moneyDto;
            this.fee_ratio = fee_ratio;
            this.min_order_size = moneyDto2;
            this.max_order_size = moneyDto3;
            this.min_fee = moneyDto4;
        }

        public final DateDto getMin_start_date() {
            return this.min_start_date;
        }

        public final DateDto getMax_start_date() {
            return this.max_start_date;
        }

        public final boolean getWeekend_enabled() {
            return this.weekend_enabled;
        }

        public final MoneyDto getBuying_power() {
            return this.buying_power;
        }

        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }

        public /* synthetic */ Surrogate(DateDto dateDto, DateDto dateDto2, boolean z, MoneyDto moneyDto, IdlDecimal idlDecimal, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : dateDto, (i & 2) != 0 ? null : dateDto2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? null : moneyDto2, (i & 64) != 0 ? null : moneyDto3, (i & 128) != 0 ? null : moneyDto4);
        }

        public final MoneyDto getMin_order_size() {
            return this.min_order_size;
        }

        public final MoneyDto getMax_order_size() {
            return this.max_order_size;
        }

        public final MoneyDto getMin_fee() {
            return this.min_fee;
        }
    }

    /* compiled from: GetScheduleConfigResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;", "Lidl/recurring/proto/v1/GetScheduleConfigResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.recurring.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetScheduleConfigResponseDto, GetScheduleConfigResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetScheduleConfigResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetScheduleConfigResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetScheduleConfigResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetScheduleConfigResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetScheduleConfigResponse> getProtoAdapter() {
            return GetScheduleConfigResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetScheduleConfigResponseDto getZeroValue() {
            return GetScheduleConfigResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetScheduleConfigResponseDto fromProto(GetScheduleConfigResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Date min_start_date = proto.getMin_start_date();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DateDto dateDtoFromProto = min_start_date != null ? DateDto.INSTANCE.fromProto(min_start_date) : null;
            Date max_start_date = proto.getMax_start_date();
            DateDto dateDtoFromProto2 = max_start_date != null ? DateDto.INSTANCE.fromProto(max_start_date) : null;
            boolean weekend_enabled = proto.getWeekend_enabled();
            Money buying_power = proto.getBuying_power();
            MoneyDto moneyDtoFromProto = buying_power != null ? MoneyDto.INSTANCE.fromProto(buying_power) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getFee_ratio());
            Money min_order_size = proto.getMin_order_size();
            MoneyDto moneyDtoFromProto2 = min_order_size != null ? MoneyDto.INSTANCE.fromProto(min_order_size) : null;
            Money max_order_size = proto.getMax_order_size();
            MoneyDto moneyDtoFromProto3 = max_order_size != null ? MoneyDto.INSTANCE.fromProto(max_order_size) : null;
            Money min_fee = proto.getMin_fee();
            return new GetScheduleConfigResponseDto(new Surrogate(dateDtoFromProto, dateDtoFromProto2, weekend_enabled, moneyDtoFromProto, idlDecimal, moneyDtoFromProto2, moneyDtoFromProto3, min_fee != null ? MoneyDto.INSTANCE.fromProto(min_fee) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: idl.recurring.proto.v1.GetScheduleConfigResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetScheduleConfigResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetScheduleConfigResponseDto(null, null, false, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetScheduleConfigResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;", "<init>", "()V", "surrogateSerializer", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.recurring.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetScheduleConfigResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/idl.recurring.proto.v1.GetScheduleConfigResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetScheduleConfigResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetScheduleConfigResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetScheduleConfigResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetScheduleConfigResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidl/recurring/proto/v1/GetScheduleConfigResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.recurring.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "idl.recurring.proto.v1.GetScheduleConfigResponseDto";
        }
    }
}
