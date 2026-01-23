package nimbus.service.p511v1;

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
/* compiled from: AssetTransferStateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lnimbus/service/v1/AssetTransferState;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "STATE_UNSPECIFIED", "INITIATED", "SOURCE_HOLDS_PLACED", "DESTINATION_ADJUSTMENTS_MADE", "SUCCEEDED", "FAILED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class AssetTransferStateDto implements Dto2<AssetTransferState>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetTransferStateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AssetTransferStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssetTransferStateDto, AssetTransferState>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final AssetTransferStateDto STATE_UNSPECIFIED = new AssetTransferStateDto("STATE_UNSPECIFIED", 0) { // from class: nimbus.service.v1.AssetTransferStateDto.STATE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferState toProto() {
            return AssetTransferState.STATE_UNSPECIFIED;
        }
    };
    public static final AssetTransferStateDto INITIATED = new AssetTransferStateDto("INITIATED", 1) { // from class: nimbus.service.v1.AssetTransferStateDto.INITIATED
        {
            String str = "initiated";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferState toProto() {
            return AssetTransferState.INITIATED;
        }
    };
    public static final AssetTransferStateDto SOURCE_HOLDS_PLACED = new AssetTransferStateDto("SOURCE_HOLDS_PLACED", 2) { // from class: nimbus.service.v1.AssetTransferStateDto.SOURCE_HOLDS_PLACED
        {
            String str = "source_holds_placed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferState toProto() {
            return AssetTransferState.SOURCE_HOLDS_PLACED;
        }
    };
    public static final AssetTransferStateDto DESTINATION_ADJUSTMENTS_MADE = new AssetTransferStateDto("DESTINATION_ADJUSTMENTS_MADE", 3) { // from class: nimbus.service.v1.AssetTransferStateDto.DESTINATION_ADJUSTMENTS_MADE
        {
            String str = "destination_adjustments_made";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferState toProto() {
            return AssetTransferState.DESTINATION_ADJUSTMENTS_MADE;
        }
    };
    public static final AssetTransferStateDto SUCCEEDED = new AssetTransferStateDto("SUCCEEDED", 4) { // from class: nimbus.service.v1.AssetTransferStateDto.SUCCEEDED
        {
            String str = "succeeded";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferState toProto() {
            return AssetTransferState.SUCCEEDED;
        }
    };
    public static final AssetTransferStateDto FAILED = new AssetTransferStateDto("FAILED", 5) { // from class: nimbus.service.v1.AssetTransferStateDto.FAILED
        {
            String str = "failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetTransferState toProto() {
            return AssetTransferState.FAILED;
        }
    };

    private static final /* synthetic */ AssetTransferStateDto[] $values() {
        return new AssetTransferStateDto[]{STATE_UNSPECIFIED, INITIATED, SOURCE_HOLDS_PLACED, DESTINATION_ADJUSTMENTS_MADE, SUCCEEDED, FAILED};
    }

    public /* synthetic */ AssetTransferStateDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<AssetTransferStateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssetTransferStateDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        AssetTransferStateDto[] assetTransferStateDtoArr$values = $values();
        $VALUES = assetTransferStateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTransferStateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nimbus.service.v1.AssetTransferStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetTransferStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AssetTransferStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lnimbus/service/v1/AssetTransferStateDto;", "Lnimbus/service/v1/AssetTransferState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnimbus/service/v1/AssetTransferStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AssetTransferStateDto, AssetTransferState> {

        /* compiled from: AssetTransferStateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetTransferState.values().length];
                try {
                    iArr[AssetTransferState.STATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetTransferState.INITIATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssetTransferState.SOURCE_HOLDS_PLACED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AssetTransferState.DESTINATION_ADJUSTMENTS_MADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AssetTransferState.SUCCEEDED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AssetTransferState.FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssetTransferStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTransferStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTransferStateDto> getBinaryBase64Serializer() {
            return (KSerializer) AssetTransferStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssetTransferState> getProtoAdapter() {
            return AssetTransferState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTransferStateDto getZeroValue() {
            return AssetTransferStateDto.STATE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTransferStateDto fromProto(AssetTransferState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AssetTransferStateDto.STATE_UNSPECIFIED;
                case 2:
                    return AssetTransferStateDto.INITIATED;
                case 3:
                    return AssetTransferStateDto.SOURCE_HOLDS_PLACED;
                case 4:
                    return AssetTransferStateDto.DESTINATION_ADJUSTMENTS_MADE;
                case 5:
                    return AssetTransferStateDto.SUCCEEDED;
                case 6:
                    return AssetTransferStateDto.FAILED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssetTransferStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/AssetTransferStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Serializer implements KSerializer<AssetTransferStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AssetTransferStateDto, AssetTransferState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/nimbus.service.v1.AssetTransferState", AssetTransferStateDto.getEntries(), AssetTransferStateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AssetTransferStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AssetTransferStateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssetTransferStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AssetTransferStateDto valueOf(String str) {
        return (AssetTransferStateDto) Enum.valueOf(AssetTransferStateDto.class, str);
    }

    public static AssetTransferStateDto[] values() {
        return (AssetTransferStateDto[]) $VALUES.clone();
    }
}
