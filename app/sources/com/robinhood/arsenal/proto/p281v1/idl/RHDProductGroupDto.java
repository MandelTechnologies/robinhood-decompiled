package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RHDProductGroupDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RHD_PRODUCT_GROUP_UNSPECIFIED", "RHD_PRODUCT_GROUP_STOCK_INDEX", "RHD_PRODUCT_GROUP_ENERGY", "RHD_PRODUCT_GROUP_CURRENCY", "RHD_PRODUCT_GROUP_METALS", "RHD_PRODUCT_GROUP_CRYPTO", "RHD_PRODUCT_GROUP_AGRICULTURE", "RHD_PRODUCT_GROUP_INTEREST_RATES", "RHD_PRODUCT_GROUP_EVENT_CONTRACTS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes5.dex */
public abstract class RHDProductGroupDto implements Dto2<RHDProductGroup>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RHDProductGroupDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<RHDProductGroupDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RHDProductGroupDto, RHDProductGroup>> binaryBase64Serializer$delegate;
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_UNSPECIFIED = new RHDProductGroupDto("RHD_PRODUCT_GROUP_UNSPECIFIED", 0) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_UNSPECIFIED;
        }
    };
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_STOCK_INDEX = new RHDProductGroupDto("RHD_PRODUCT_GROUP_STOCK_INDEX", 1) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_STOCK_INDEX
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_STOCK_INDEX;
        }
    };
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_ENERGY = new RHDProductGroupDto("RHD_PRODUCT_GROUP_ENERGY", 2) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_ENERGY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_ENERGY;
        }
    };
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_CURRENCY = new RHDProductGroupDto("RHD_PRODUCT_GROUP_CURRENCY", 3) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_CURRENCY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_CURRENCY;
        }
    };
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_METALS = new RHDProductGroupDto("RHD_PRODUCT_GROUP_METALS", 4) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_METALS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_METALS;
        }
    };
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_CRYPTO = new RHDProductGroupDto("RHD_PRODUCT_GROUP_CRYPTO", 5) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_CRYPTO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_CRYPTO;
        }
    };
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_AGRICULTURE = new RHDProductGroupDto("RHD_PRODUCT_GROUP_AGRICULTURE", 6) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_AGRICULTURE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_AGRICULTURE;
        }
    };
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_INTEREST_RATES = new RHDProductGroupDto("RHD_PRODUCT_GROUP_INTEREST_RATES", 7) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_INTEREST_RATES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_INTEREST_RATES;
        }
    };
    public static final RHDProductGroupDto RHD_PRODUCT_GROUP_EVENT_CONTRACTS = new RHDProductGroupDto("RHD_PRODUCT_GROUP_EVENT_CONTRACTS", 8) { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto.RHD_PRODUCT_GROUP_EVENT_CONTRACTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public RHDProductGroup toProto() {
            return RHDProductGroup.RHD_PRODUCT_GROUP_EVENT_CONTRACTS;
        }
    };

    private static final /* synthetic */ RHDProductGroupDto[] $values() {
        return new RHDProductGroupDto[]{RHD_PRODUCT_GROUP_UNSPECIFIED, RHD_PRODUCT_GROUP_STOCK_INDEX, RHD_PRODUCT_GROUP_ENERGY, RHD_PRODUCT_GROUP_CURRENCY, RHD_PRODUCT_GROUP_METALS, RHD_PRODUCT_GROUP_CRYPTO, RHD_PRODUCT_GROUP_AGRICULTURE, RHD_PRODUCT_GROUP_INTEREST_RATES, RHD_PRODUCT_GROUP_EVENT_CONTRACTS};
    }

    public /* synthetic */ RHDProductGroupDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<RHDProductGroupDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RHDProductGroupDto(String str, int i) {
    }

    static {
        RHDProductGroupDto[] rHDProductGroupDtoArr$values = $values();
        $VALUES = rHDProductGroupDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rHDProductGroupDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.RHDProductGroupDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RHDProductGroupDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: RHDProductGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;", "Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroup;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<RHDProductGroupDto, RHDProductGroup> {

        /* compiled from: RHDProductGroupDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RHDProductGroup.values().length];
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_STOCK_INDEX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_ENERGY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_CURRENCY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_METALS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_CRYPTO.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_AGRICULTURE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_INTEREST_RATES.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[RHDProductGroup.RHD_PRODUCT_GROUP_EVENT_CONTRACTS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RHDProductGroupDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RHDProductGroupDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RHDProductGroupDto> getBinaryBase64Serializer() {
            return (KSerializer) RHDProductGroupDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RHDProductGroup> getProtoAdapter() {
            return RHDProductGroup.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RHDProductGroupDto getZeroValue() {
            return RHDProductGroupDto.RHD_PRODUCT_GROUP_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RHDProductGroupDto fromProto(RHDProductGroup proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_UNSPECIFIED;
                case 2:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_STOCK_INDEX;
                case 3:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_ENERGY;
                case 4:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_CURRENCY;
                case 5:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_METALS;
                case 6:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_CRYPTO;
                case 7:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_AGRICULTURE;
                case 8:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_INTEREST_RATES;
                case 9:
                    return RHDProductGroupDto.RHD_PRODUCT_GROUP_EVENT_CONTRACTS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RHDProductGroupDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/RHDProductGroupDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RHDProductGroupDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<RHDProductGroupDto, RHDProductGroup> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/arsenal.public.RHDProductGroup", RHDProductGroupDto.getEntries(), RHDProductGroupDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public RHDProductGroupDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (RHDProductGroupDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RHDProductGroupDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static RHDProductGroupDto valueOf(String str) {
        return (RHDProductGroupDto) Enum.valueOf(RHDProductGroupDto.class, str);
    }

    public static RHDProductGroupDto[] values() {
        return (RHDProductGroupDto[]) $VALUES.clone();
    }
}
