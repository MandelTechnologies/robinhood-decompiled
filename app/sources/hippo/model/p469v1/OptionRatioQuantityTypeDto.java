package hippo.model.p469v1;

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
/* compiled from: OptionRatioQuantityTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/OptionRatioQuantityTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lhippo/model/v1/OptionRatioQuantityType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED", "OPTION_RATIO_QUANTITY_TYPE_DEFAULT", "OPTION_RATIO_QUANTITY_TYPE_CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public abstract class OptionRatioQuantityTypeDto implements Dto2<OptionRatioQuantityType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionRatioQuantityTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<OptionRatioQuantityTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionRatioQuantityTypeDto, OptionRatioQuantityType>> binaryBase64Serializer$delegate;
    public static final OptionRatioQuantityTypeDto OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED = new OptionRatioQuantityTypeDto("OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED", 0) { // from class: hippo.model.v1.OptionRatioQuantityTypeDto.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionRatioQuantityType toProto() {
            return OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED;
        }
    };
    public static final OptionRatioQuantityTypeDto OPTION_RATIO_QUANTITY_TYPE_DEFAULT = new OptionRatioQuantityTypeDto("OPTION_RATIO_QUANTITY_TYPE_DEFAULT", 1) { // from class: hippo.model.v1.OptionRatioQuantityTypeDto.OPTION_RATIO_QUANTITY_TYPE_DEFAULT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionRatioQuantityType toProto() {
            return OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_DEFAULT;
        }
    };
    public static final OptionRatioQuantityTypeDto OPTION_RATIO_QUANTITY_TYPE_CUSTOM = new OptionRatioQuantityTypeDto("OPTION_RATIO_QUANTITY_TYPE_CUSTOM", 2) { // from class: hippo.model.v1.OptionRatioQuantityTypeDto.OPTION_RATIO_QUANTITY_TYPE_CUSTOM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public OptionRatioQuantityType toProto() {
            return OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_CUSTOM;
        }
    };

    private static final /* synthetic */ OptionRatioQuantityTypeDto[] $values() {
        return new OptionRatioQuantityTypeDto[]{OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED, OPTION_RATIO_QUANTITY_TYPE_DEFAULT, OPTION_RATIO_QUANTITY_TYPE_CUSTOM};
    }

    public /* synthetic */ OptionRatioQuantityTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<OptionRatioQuantityTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionRatioQuantityTypeDto(String str, int i) {
    }

    static {
        OptionRatioQuantityTypeDto[] optionRatioQuantityTypeDtoArr$values = $values();
        $VALUES = optionRatioQuantityTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionRatioQuantityTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: hippo.model.v1.OptionRatioQuantityTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionRatioQuantityTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: OptionRatioQuantityTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhippo/model/v1/OptionRatioQuantityTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lhippo/model/v1/OptionRatioQuantityTypeDto;", "Lhippo/model/v1/OptionRatioQuantityType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhippo/model/v1/OptionRatioQuantityTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<OptionRatioQuantityTypeDto, OptionRatioQuantityType> {

        /* compiled from: OptionRatioQuantityTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionRatioQuantityType.values().length];
                try {
                    iArr[OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OptionRatioQuantityType.OPTION_RATIO_QUANTITY_TYPE_CUSTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionRatioQuantityTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionRatioQuantityTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionRatioQuantityTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionRatioQuantityTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionRatioQuantityType> getProtoAdapter() {
            return OptionRatioQuantityType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionRatioQuantityTypeDto getZeroValue() {
            return OptionRatioQuantityTypeDto.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionRatioQuantityTypeDto fromProto(OptionRatioQuantityType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return OptionRatioQuantityTypeDto.OPTION_RATIO_QUANTITY_TYPE_UNSPECIFIED;
            }
            if (i == 2) {
                return OptionRatioQuantityTypeDto.OPTION_RATIO_QUANTITY_TYPE_DEFAULT;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return OptionRatioQuantityTypeDto.OPTION_RATIO_QUANTITY_TYPE_CUSTOM;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionRatioQuantityTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lhippo/model/v1/OptionRatioQuantityTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhippo/model/v1/OptionRatioQuantityTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OptionRatioQuantityTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<OptionRatioQuantityTypeDto, OptionRatioQuantityType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/hippo.model.v1.OptionRatioQuantityType", OptionRatioQuantityTypeDto.getEntries(), OptionRatioQuantityTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public OptionRatioQuantityTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (OptionRatioQuantityTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionRatioQuantityTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static OptionRatioQuantityTypeDto valueOf(String str) {
        return (OptionRatioQuantityTypeDto) Enum.valueOf(OptionRatioQuantityTypeDto.class, str);
    }

    public static OptionRatioQuantityTypeDto[] values() {
        return (OptionRatioQuantityTypeDto[]) $VALUES.clone();
    }
}
