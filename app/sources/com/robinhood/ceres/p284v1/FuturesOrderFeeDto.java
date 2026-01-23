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

/* compiled from: FuturesOrderFeeDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderFeeDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesOrderFee;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$Surrogate;)V", "fee_type_name", "", "fee_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;)V", "getFee_type_name", "()Ljava/lang/String;", "getFee_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesOrderFeeDto implements Dto3<FuturesOrderFee>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesOrderFeeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesOrderFeeDto, FuturesOrderFee>> binaryBase64Serializer$delegate;
    private static final FuturesOrderFeeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesOrderFeeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesOrderFeeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFee_type_name() {
        return this.surrogate.getFee_type_name();
    }

    public final MoneyDto getFee_amount() {
        return this.surrogate.getFee_amount();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesOrderFeeDto(String fee_type_name, MoneyDto moneyDto) {
        this(new Surrogate(fee_type_name, moneyDto));
        Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
    }

    public /* synthetic */ FuturesOrderFeeDto(String str, MoneyDto moneyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto);
    }

    public static /* synthetic */ FuturesOrderFeeDto copy$default(FuturesOrderFeeDto futuresOrderFeeDto, String str, MoneyDto moneyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresOrderFeeDto.surrogate.getFee_type_name();
        }
        if ((i & 2) != 0) {
            moneyDto = futuresOrderFeeDto.surrogate.getFee_amount();
        }
        return futuresOrderFeeDto.copy(str, moneyDto);
    }

    public final FuturesOrderFeeDto copy(String fee_type_name, MoneyDto fee_amount) {
        Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
        return new FuturesOrderFeeDto(new Surrogate(fee_type_name, fee_amount));
    }

    @Override // com.robinhood.idl.Dto
    public FuturesOrderFee toProto() {
        String fee_type_name = this.surrogate.getFee_type_name();
        MoneyDto fee_amount = this.surrogate.getFee_amount();
        return new FuturesOrderFee(fee_type_name, fee_amount != null ? fee_amount.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[FuturesOrderFeeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesOrderFeeDto) && Intrinsics.areEqual(((FuturesOrderFeeDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesOrderFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$Surrogate;", "", "fee_type_name", "", "fee_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFee_type_name$annotations", "()V", "getFee_type_name", "()Ljava/lang/String;", "getFee_amount$annotations", "getFee_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto fee_amount;
        private final String fee_type_name;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((String) null, (MoneyDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, MoneyDto moneyDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.fee_type_name;
            }
            if ((i & 2) != 0) {
                moneyDto = surrogate.fee_amount;
            }
            return surrogate.copy(str, moneyDto);
        }

        @SerialName("feeAmount")
        @JsonAnnotations2(names = {"fee_amount"})
        public static /* synthetic */ void getFee_amount$annotations() {
        }

        @SerialName("feeTypeName")
        @JsonAnnotations2(names = {"fee_type_name"})
        public static /* synthetic */ void getFee_type_name$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFee_type_name() {
            return this.fee_type_name;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getFee_amount() {
            return this.fee_amount;
        }

        public final Surrogate copy(String fee_type_name, MoneyDto fee_amount) {
            Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
            return new Surrogate(fee_type_name, fee_amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.fee_type_name, surrogate.fee_type_name) && Intrinsics.areEqual(this.fee_amount, surrogate.fee_amount);
        }

        public int hashCode() {
            int iHashCode = this.fee_type_name.hashCode() * 31;
            MoneyDto moneyDto = this.fee_amount;
            return iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode());
        }

        public String toString() {
            return "Surrogate(fee_type_name=" + this.fee_type_name + ", fee_amount=" + this.fee_amount + ")";
        }

        /* compiled from: FuturesOrderFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesOrderFeeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MoneyDto moneyDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.fee_type_name = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.fee_amount = null;
            } else {
                this.fee_amount = moneyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.fee_type_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.fee_type_name);
            }
            MoneyDto moneyDto = self.fee_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
        }

        public Surrogate(String fee_type_name, MoneyDto moneyDto) {
            Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
            this.fee_type_name = fee_type_name;
            this.fee_amount = moneyDto;
        }

        public final String getFee_type_name() {
            return this.fee_type_name;
        }

        public /* synthetic */ Surrogate(String str, MoneyDto moneyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto);
        }

        public final MoneyDto getFee_amount() {
            return this.fee_amount;
        }
    }

    /* compiled from: FuturesOrderFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesOrderFeeDto;", "Lcom/robinhood/ceres/v1/FuturesOrderFee;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesOrderFeeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesOrderFeeDto, FuturesOrderFee> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesOrderFeeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderFeeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderFeeDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesOrderFeeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesOrderFee> getProtoAdapter() {
            return FuturesOrderFee.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderFeeDto getZeroValue() {
            return FuturesOrderFeeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderFeeDto fromProto(FuturesOrderFee proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String fee_type_name = proto.getFee_type_name();
            Money fee_amount = proto.getFee_amount();
            return new FuturesOrderFeeDto(new Surrogate(fee_type_name, fee_amount != null ? MoneyDto.INSTANCE.fromProto(fee_amount) : null), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesOrderFeeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesOrderFeeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesOrderFeeDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesOrderFeeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderFeeDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesOrderFeeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesOrderFee", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesOrderFeeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesOrderFeeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesOrderFeeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: FuturesOrderFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderFeeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesOrderFeeDto";
        }
    }
}
