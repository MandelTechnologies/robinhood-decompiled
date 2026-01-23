package rosetta.mainst;

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
/* compiled from: LastLiquidityIndDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lrosetta/mainst/LastLiquidityIndDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/mainst/LastLiquidityInd;", "Landroid/os/Parcelable;", "", "db_enum", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDb_enum", "()Ljava/lang/String;", "LAST_LIQUIDITY_IND_UNSPECIFIED", "LAST_LIQUIDITY_IND_ADDED_LIQUIDITY", "LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public abstract class LastLiquidityIndDto implements Dto2<LastLiquidityInd>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LastLiquidityIndDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<LastLiquidityIndDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LastLiquidityIndDto, LastLiquidityInd>> binaryBase64Serializer$delegate;
    private final String db_enum;
    public static final LastLiquidityIndDto LAST_LIQUIDITY_IND_UNSPECIFIED = new LastLiquidityIndDto("LAST_LIQUIDITY_IND_UNSPECIFIED", 0) { // from class: rosetta.mainst.LastLiquidityIndDto.LAST_LIQUIDITY_IND_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public LastLiquidityInd toProto() {
            return LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED;
        }
    };
    public static final LastLiquidityIndDto LAST_LIQUIDITY_IND_ADDED_LIQUIDITY = new LastLiquidityIndDto("LAST_LIQUIDITY_IND_ADDED_LIQUIDITY", 1) { // from class: rosetta.mainst.LastLiquidityIndDto.LAST_LIQUIDITY_IND_ADDED_LIQUIDITY
        {
            String str = "added_liquidity";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public LastLiquidityInd toProto() {
            return LastLiquidityInd.LAST_LIQUIDITY_IND_ADDED_LIQUIDITY;
        }
    };
    public static final LastLiquidityIndDto LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY = new LastLiquidityIndDto("LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY", 2) { // from class: rosetta.mainst.LastLiquidityIndDto.LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY
        {
            String str = "removed_liquidity";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public LastLiquidityInd toProto() {
            return LastLiquidityInd.LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY;
        }
    };

    private static final /* synthetic */ LastLiquidityIndDto[] $values() {
        return new LastLiquidityIndDto[]{LAST_LIQUIDITY_IND_UNSPECIFIED, LAST_LIQUIDITY_IND_ADDED_LIQUIDITY, LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY};
    }

    public /* synthetic */ LastLiquidityIndDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<LastLiquidityIndDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LastLiquidityIndDto(String str, int i, String str2) {
        this.db_enum = str2;
    }

    public final String getDb_enum() {
        return this.db_enum;
    }

    static {
        LastLiquidityIndDto[] lastLiquidityIndDtoArr$values = $values();
        $VALUES = lastLiquidityIndDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lastLiquidityIndDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.mainst.LastLiquidityIndDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LastLiquidityIndDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: LastLiquidityIndDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/mainst/LastLiquidityIndDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/mainst/LastLiquidityIndDto;", "Lrosetta/mainst/LastLiquidityInd;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/mainst/LastLiquidityIndDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<LastLiquidityIndDto, LastLiquidityInd> {

        /* compiled from: LastLiquidityIndDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LastLiquidityInd.values().length];
                try {
                    iArr[LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LastLiquidityInd.LAST_LIQUIDITY_IND_ADDED_LIQUIDITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LastLiquidityInd.LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY.ordinal()] = 3;
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

        public final KSerializer<LastLiquidityIndDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LastLiquidityIndDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LastLiquidityIndDto> getBinaryBase64Serializer() {
            return (KSerializer) LastLiquidityIndDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LastLiquidityInd> getProtoAdapter() {
            return LastLiquidityInd.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LastLiquidityIndDto getZeroValue() {
            return LastLiquidityIndDto.LAST_LIQUIDITY_IND_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LastLiquidityIndDto fromProto(LastLiquidityInd proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return LastLiquidityIndDto.LAST_LIQUIDITY_IND_UNSPECIFIED;
            }
            if (i == 2) {
                return LastLiquidityIndDto.LAST_LIQUIDITY_IND_ADDED_LIQUIDITY;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return LastLiquidityIndDto.LAST_LIQUIDITY_IND_REMOVED_LIQUIDITY;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LastLiquidityIndDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/LastLiquidityIndDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/mainst/LastLiquidityIndDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LastLiquidityIndDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<LastLiquidityIndDto, LastLiquidityInd> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.mainst.LastLiquidityInd", LastLiquidityIndDto.getEntries(), LastLiquidityIndDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public LastLiquidityIndDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (LastLiquidityIndDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LastLiquidityIndDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static LastLiquidityIndDto valueOf(String str) {
        return (LastLiquidityIndDto) Enum.valueOf(LastLiquidityIndDto.class, str);
    }

    public static LastLiquidityIndDto[] values() {
        return (LastLiquidityIndDto[]) $VALUES.clone();
    }
}
