package crypto_perpetuals.common.p435v1;

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
/* compiled from: PerpetualDetailComponentTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/PerpetualDetailComponentTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcrypto_perpetuals/common/v1/PerpetualDetailComponentType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED", "PERPETUAL_DETAIL_COMPONENT_TYPE_CHART", "PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS", "PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS", "PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS", "PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT", "PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY", "PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION", "PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public abstract class PerpetualDetailComponentTypeDto implements Dto2<PerpetualDetailComponentType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PerpetualDetailComponentTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<PerpetualDetailComponentTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerpetualDetailComponentTypeDto, PerpetualDetailComponentType>> binaryBase64Serializer$delegate;
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED", 0) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED;
        }
    };
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_CHART = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_CHART", 1) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_CHART
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_CHART;
        }
    };
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS", 2) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS;
        }
    };
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS", 3) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS;
        }
    };
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS", 4) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS;
        }
    };
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT", 5) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT;
        }
    };
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY", 6) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY;
        }
    };
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION", 7) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION;
        }
    };
    public static final PerpetualDetailComponentTypeDto PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES = new PerpetualDetailComponentTypeDto("PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES", 8) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public PerpetualDetailComponentType toProto() {
            return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES;
        }
    };

    private static final /* synthetic */ PerpetualDetailComponentTypeDto[] $values() {
        return new PerpetualDetailComponentTypeDto[]{PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED, PERPETUAL_DETAIL_COMPONENT_TYPE_CHART, PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS, PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS, PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS, PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT, PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY, PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION, PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES};
    }

    public /* synthetic */ PerpetualDetailComponentTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<PerpetualDetailComponentTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerpetualDetailComponentTypeDto(String str, int i) {
    }

    static {
        PerpetualDetailComponentTypeDto[] perpetualDetailComponentTypeDtoArr$values = $values();
        $VALUES = perpetualDetailComponentTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(perpetualDetailComponentTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerpetualDetailComponentTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: PerpetualDetailComponentTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/PerpetualDetailComponentTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcrypto_perpetuals/common/v1/PerpetualDetailComponentTypeDto;", "Lcrypto_perpetuals/common/v1/PerpetualDetailComponentType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/common/v1/PerpetualDetailComponentTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<PerpetualDetailComponentTypeDto, PerpetualDetailComponentType> {

        /* compiled from: PerpetualDetailComponentTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PerpetualDetailComponentType.values().length];
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_CHART.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES.ordinal()] = 9;
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

        public final KSerializer<PerpetualDetailComponentTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualDetailComponentTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualDetailComponentTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) PerpetualDetailComponentTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerpetualDetailComponentType> getProtoAdapter() {
            return PerpetualDetailComponentType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualDetailComponentTypeDto getZeroValue() {
            return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualDetailComponentTypeDto fromProto(PerpetualDetailComponentType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED;
                case 2:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_CHART;
                case 3:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS;
                case 4:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS;
                case 5:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS;
                case 6:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT;
                case 7:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY;
                case 8:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION;
                case 9:
                    return PerpetualDetailComponentTypeDto.PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PerpetualDetailComponentTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/PerpetualDetailComponentTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/common/v1/PerpetualDetailComponentTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PerpetualDetailComponentTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<PerpetualDetailComponentTypeDto, PerpetualDetailComponentType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/crypto_perpetuals.common.v1.PerpetualDetailComponentType", PerpetualDetailComponentTypeDto.getEntries(), PerpetualDetailComponentTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public PerpetualDetailComponentTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (PerpetualDetailComponentTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerpetualDetailComponentTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static PerpetualDetailComponentTypeDto valueOf(String str) {
        return (PerpetualDetailComponentTypeDto) Enum.valueOf(PerpetualDetailComponentTypeDto.class, str);
    }

    public static PerpetualDetailComponentTypeDto[] values() {
        return (PerpetualDetailComponentTypeDto[]) $VALUES.clone();
    }
}
