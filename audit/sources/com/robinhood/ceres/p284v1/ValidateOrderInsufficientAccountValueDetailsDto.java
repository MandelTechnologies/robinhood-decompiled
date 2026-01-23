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

/* compiled from: ValidateOrderInsufficientAccountValueDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$Surrogate;)V", "total_account_value", "Lcom/robinhood/idl/IdlDecimal;", "total_account_value_threshold", "total_account_value_deficiency", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "getTotal_account_value", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_account_value_threshold", "getTotal_account_value_deficiency", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class ValidateOrderInsufficientAccountValueDetailsDto implements Dto3<ValidateOrderInsufficientAccountValueDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ValidateOrderInsufficientAccountValueDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValidateOrderInsufficientAccountValueDetailsDto, ValidateOrderInsufficientAccountValueDetails>> binaryBase64Serializer$delegate;
    private static final ValidateOrderInsufficientAccountValueDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ValidateOrderInsufficientAccountValueDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValidateOrderInsufficientAccountValueDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getTotal_account_value() {
        return this.surrogate.getTotal_account_value();
    }

    public final IdlDecimal getTotal_account_value_threshold() {
        return this.surrogate.getTotal_account_value_threshold();
    }

    public final IdlDecimal getTotal_account_value_deficiency() {
        return this.surrogate.getTotal_account_value_deficiency();
    }

    public /* synthetic */ ValidateOrderInsufficientAccountValueDetailsDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValidateOrderInsufficientAccountValueDetailsDto(IdlDecimal total_account_value, IdlDecimal total_account_value_threshold, IdlDecimal total_account_value_deficiency) {
        this(new Surrogate(total_account_value, total_account_value_threshold, total_account_value_deficiency));
        Intrinsics.checkNotNullParameter(total_account_value, "total_account_value");
        Intrinsics.checkNotNullParameter(total_account_value_threshold, "total_account_value_threshold");
        Intrinsics.checkNotNullParameter(total_account_value_deficiency, "total_account_value_deficiency");
    }

    public static /* synthetic */ ValidateOrderInsufficientAccountValueDetailsDto copy$default(ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            idlDecimal = validateOrderInsufficientAccountValueDetailsDto.surrogate.getTotal_account_value();
        }
        if ((i & 2) != 0) {
            idlDecimal2 = validateOrderInsufficientAccountValueDetailsDto.surrogate.getTotal_account_value_threshold();
        }
        if ((i & 4) != 0) {
            idlDecimal3 = validateOrderInsufficientAccountValueDetailsDto.surrogate.getTotal_account_value_deficiency();
        }
        return validateOrderInsufficientAccountValueDetailsDto.copy(idlDecimal, idlDecimal2, idlDecimal3);
    }

    public final ValidateOrderInsufficientAccountValueDetailsDto copy(IdlDecimal total_account_value, IdlDecimal total_account_value_threshold, IdlDecimal total_account_value_deficiency) {
        Intrinsics.checkNotNullParameter(total_account_value, "total_account_value");
        Intrinsics.checkNotNullParameter(total_account_value_threshold, "total_account_value_threshold");
        Intrinsics.checkNotNullParameter(total_account_value_deficiency, "total_account_value_deficiency");
        return new ValidateOrderInsufficientAccountValueDetailsDto(new Surrogate(total_account_value, total_account_value_threshold, total_account_value_deficiency));
    }

    @Override // com.robinhood.idl.Dto
    public ValidateOrderInsufficientAccountValueDetails toProto() {
        return new ValidateOrderInsufficientAccountValueDetails(this.surrogate.getTotal_account_value().getStringValue(), this.surrogate.getTotal_account_value_threshold().getStringValue(), this.surrogate.getTotal_account_value_deficiency().getStringValue(), null, 8, null);
    }

    public String toString() {
        return "[ValidateOrderInsufficientAccountValueDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ValidateOrderInsufficientAccountValueDetailsDto) && Intrinsics.areEqual(((ValidateOrderInsufficientAccountValueDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ValidateOrderInsufficientAccountValueDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+BR\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u0018\u0010\u0018\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u0019\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\u001a\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003JT\u0010\u001b\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006,"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$Surrogate;", "", "total_account_value", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "total_account_value_threshold", "total_account_value_deficiency", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTotal_account_value$annotations", "()V", "getTotal_account_value", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_account_value_threshold$annotations", "getTotal_account_value_threshold", "getTotal_account_value_deficiency$annotations", "getTotal_account_value_deficiency", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal total_account_value;
        private final IdlDecimal total_account_value_deficiency;
        private final IdlDecimal total_account_value_threshold;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, Object obj) {
            if ((i & 1) != 0) {
                idlDecimal = surrogate.total_account_value;
            }
            if ((i & 2) != 0) {
                idlDecimal2 = surrogate.total_account_value_threshold;
            }
            if ((i & 4) != 0) {
                idlDecimal3 = surrogate.total_account_value_deficiency;
            }
            return surrogate.copy(idlDecimal, idlDecimal2, idlDecimal3);
        }

        @SerialName("totalAccountValue")
        @JsonAnnotations2(names = {"total_account_value"})
        public static /* synthetic */ void getTotal_account_value$annotations() {
        }

        @SerialName("totalAccountValueDeficiency")
        @JsonAnnotations2(names = {"total_account_value_deficiency"})
        public static /* synthetic */ void getTotal_account_value_deficiency$annotations() {
        }

        @SerialName("totalAccountValueThreshold")
        @JsonAnnotations2(names = {"total_account_value_threshold"})
        public static /* synthetic */ void getTotal_account_value_threshold$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final IdlDecimal getTotal_account_value() {
            return this.total_account_value;
        }

        /* renamed from: component2, reason: from getter */
        public final IdlDecimal getTotal_account_value_threshold() {
            return this.total_account_value_threshold;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getTotal_account_value_deficiency() {
            return this.total_account_value_deficiency;
        }

        public final Surrogate copy(IdlDecimal total_account_value, IdlDecimal total_account_value_threshold, IdlDecimal total_account_value_deficiency) {
            Intrinsics.checkNotNullParameter(total_account_value, "total_account_value");
            Intrinsics.checkNotNullParameter(total_account_value_threshold, "total_account_value_threshold");
            Intrinsics.checkNotNullParameter(total_account_value_deficiency, "total_account_value_deficiency");
            return new Surrogate(total_account_value, total_account_value_threshold, total_account_value_deficiency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.total_account_value, surrogate.total_account_value) && Intrinsics.areEqual(this.total_account_value_threshold, surrogate.total_account_value_threshold) && Intrinsics.areEqual(this.total_account_value_deficiency, surrogate.total_account_value_deficiency);
        }

        public int hashCode() {
            return (((this.total_account_value.hashCode() * 31) + this.total_account_value_threshold.hashCode()) * 31) + this.total_account_value_deficiency.hashCode();
        }

        public String toString() {
            return "Surrogate(total_account_value=" + this.total_account_value + ", total_account_value_threshold=" + this.total_account_value_threshold + ", total_account_value_deficiency=" + this.total_account_value_deficiency + ")";
        }

        /* compiled from: ValidateOrderInsufficientAccountValueDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ValidateOrderInsufficientAccountValueDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
            this.total_account_value = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.total_account_value_threshold = new IdlDecimal("");
            } else {
                this.total_account_value_threshold = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.total_account_value_deficiency = new IdlDecimal("");
            } else {
                this.total_account_value_deficiency = idlDecimal3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.total_account_value, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.total_account_value);
            }
            if (!Intrinsics.areEqual(self.total_account_value_threshold, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.total_account_value_threshold);
            }
            if (Intrinsics.areEqual(self.total_account_value_deficiency, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.total_account_value_deficiency);
        }

        public Surrogate(IdlDecimal total_account_value, IdlDecimal total_account_value_threshold, IdlDecimal total_account_value_deficiency) {
            Intrinsics.checkNotNullParameter(total_account_value, "total_account_value");
            Intrinsics.checkNotNullParameter(total_account_value_threshold, "total_account_value_threshold");
            Intrinsics.checkNotNullParameter(total_account_value_deficiency, "total_account_value_deficiency");
            this.total_account_value = total_account_value;
            this.total_account_value_threshold = total_account_value_threshold;
            this.total_account_value_deficiency = total_account_value_deficiency;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
        }

        public final IdlDecimal getTotal_account_value() {
            return this.total_account_value;
        }

        public final IdlDecimal getTotal_account_value_threshold() {
            return this.total_account_value_threshold;
        }

        public final IdlDecimal getTotal_account_value_deficiency() {
            return this.total_account_value_deficiency;
        }
    }

    /* compiled from: ValidateOrderInsufficientAccountValueDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ValidateOrderInsufficientAccountValueDetailsDto, ValidateOrderInsufficientAccountValueDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValidateOrderInsufficientAccountValueDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateOrderInsufficientAccountValueDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateOrderInsufficientAccountValueDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ValidateOrderInsufficientAccountValueDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValidateOrderInsufficientAccountValueDetails> getProtoAdapter() {
            return ValidateOrderInsufficientAccountValueDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateOrderInsufficientAccountValueDetailsDto getZeroValue() {
            return ValidateOrderInsufficientAccountValueDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateOrderInsufficientAccountValueDetailsDto fromProto(ValidateOrderInsufficientAccountValueDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ValidateOrderInsufficientAccountValueDetailsDto(new Surrogate(new IdlDecimal(proto.getTotal_account_value()), new IdlDecimal(proto.getTotal_account_value_threshold()), new IdlDecimal(proto.getTotal_account_value_deficiency())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ValidateOrderInsufficientAccountValueDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValidateOrderInsufficientAccountValueDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ValidateOrderInsufficientAccountValueDetailsDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValidateOrderInsufficientAccountValueDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ValidateOrderInsufficientAccountValueDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.ValidateOrderInsufficientAccountValueDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValidateOrderInsufficientAccountValueDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ValidateOrderInsufficientAccountValueDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ValidateOrderInsufficientAccountValueDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ValidateOrderInsufficientAccountValueDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.ValidateOrderInsufficientAccountValueDetailsDto";
        }
    }
}
