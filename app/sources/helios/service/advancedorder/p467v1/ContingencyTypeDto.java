package helios.service.advancedorder.p467v1;

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
/* compiled from: ContingencyTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lhelios/service/advancedorder/v1/ContingencyType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "CONTINGENCY_TYPE_UNSPECIFIED", "CONTINGENCY_TYPE_CFO", "CONTINGENCY_TYPE_OCO", "CONTINGENCY_TYPE_OTO", "CONTINGENCY_TYPE_FX_AT_TRADE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public abstract class ContingencyTypeDto implements Dto2<ContingencyType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContingencyTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ContingencyTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContingencyTypeDto, ContingencyType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final ContingencyTypeDto CONTINGENCY_TYPE_UNSPECIFIED = new ContingencyTypeDto("CONTINGENCY_TYPE_UNSPECIFIED", 0) { // from class: helios.service.advancedorder.v1.ContingencyTypeDto.CONTINGENCY_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ContingencyType toProto() {
            return ContingencyType.CONTINGENCY_TYPE_UNSPECIFIED;
        }
    };
    public static final ContingencyTypeDto CONTINGENCY_TYPE_CFO = new ContingencyTypeDto("CONTINGENCY_TYPE_CFO", 1) { // from class: helios.service.advancedorder.v1.ContingencyTypeDto.CONTINGENCY_TYPE_CFO
        {
            String str = "cfo";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ContingencyType toProto() {
            return ContingencyType.CONTINGENCY_TYPE_CFO;
        }
    };
    public static final ContingencyTypeDto CONTINGENCY_TYPE_OCO = new ContingencyTypeDto("CONTINGENCY_TYPE_OCO", 2) { // from class: helios.service.advancedorder.v1.ContingencyTypeDto.CONTINGENCY_TYPE_OCO
        {
            String str = "oco";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ContingencyType toProto() {
            return ContingencyType.CONTINGENCY_TYPE_OCO;
        }
    };
    public static final ContingencyTypeDto CONTINGENCY_TYPE_OTO = new ContingencyTypeDto("CONTINGENCY_TYPE_OTO", 3) { // from class: helios.service.advancedorder.v1.ContingencyTypeDto.CONTINGENCY_TYPE_OTO
        {
            String str = "oto";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ContingencyType toProto() {
            return ContingencyType.CONTINGENCY_TYPE_OTO;
        }
    };
    public static final ContingencyTypeDto CONTINGENCY_TYPE_FX_AT_TRADE = new ContingencyTypeDto("CONTINGENCY_TYPE_FX_AT_TRADE", 4) { // from class: helios.service.advancedorder.v1.ContingencyTypeDto.CONTINGENCY_TYPE_FX_AT_TRADE
        {
            String str = "fx_at_trade";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ContingencyType toProto() {
            return ContingencyType.CONTINGENCY_TYPE_FX_AT_TRADE;
        }
    };

    private static final /* synthetic */ ContingencyTypeDto[] $values() {
        return new ContingencyTypeDto[]{CONTINGENCY_TYPE_UNSPECIFIED, CONTINGENCY_TYPE_CFO, CONTINGENCY_TYPE_OCO, CONTINGENCY_TYPE_OTO, CONTINGENCY_TYPE_FX_AT_TRADE};
    }

    public /* synthetic */ ContingencyTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<ContingencyTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContingencyTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        ContingencyTypeDto[] contingencyTypeDtoArr$values = $values();
        $VALUES = contingencyTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(contingencyTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: helios.service.advancedorder.v1.ContingencyTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContingencyTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ContingencyTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lhelios/service/advancedorder/v1/ContingencyTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "Lhelios/service/advancedorder/v1/ContingencyType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ContingencyTypeDto, ContingencyType> {

        /* compiled from: ContingencyTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ContingencyType.values().length];
                try {
                    iArr[ContingencyType.CONTINGENCY_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ContingencyType.CONTINGENCY_TYPE_CFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ContingencyType.CONTINGENCY_TYPE_OCO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ContingencyType.CONTINGENCY_TYPE_OTO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ContingencyType.CONTINGENCY_TYPE_FX_AT_TRADE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContingencyTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContingencyTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContingencyTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) ContingencyTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ContingencyType> getProtoAdapter() {
            return ContingencyType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContingencyTypeDto getZeroValue() {
            return ContingencyTypeDto.CONTINGENCY_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContingencyTypeDto fromProto(ContingencyType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return ContingencyTypeDto.CONTINGENCY_TYPE_UNSPECIFIED;
            }
            if (i == 2) {
                return ContingencyTypeDto.CONTINGENCY_TYPE_CFO;
            }
            if (i == 3) {
                return ContingencyTypeDto.CONTINGENCY_TYPE_OCO;
            }
            if (i == 4) {
                return ContingencyTypeDto.CONTINGENCY_TYPE_OTO;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return ContingencyTypeDto.CONTINGENCY_TYPE_FX_AT_TRADE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContingencyTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lhelios/service/advancedorder/v1/ContingencyTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lhelios/service/advancedorder/v1/ContingencyTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ContingencyTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ContingencyTypeDto, ContingencyType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/helios.service.advancedorder.v1.ContingencyType", ContingencyTypeDto.getEntries(), ContingencyTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ContingencyTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ContingencyTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContingencyTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ContingencyTypeDto valueOf(String str) {
        return (ContingencyTypeDto) Enum.valueOf(ContingencyTypeDto.class, str);
    }

    public static ContingencyTypeDto[] values() {
        return (ContingencyTypeDto[]) $VALUES.clone();
    }
}
