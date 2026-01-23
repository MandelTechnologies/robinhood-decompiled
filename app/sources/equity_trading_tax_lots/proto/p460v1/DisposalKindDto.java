package equity_trading_tax_lots.proto.p460v1;

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
/* compiled from: DisposalKindDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/DisposalKindDto;", "Lcom/robinhood/idl/EnumDto;", "Lequity_trading_tax_lots/proto/v1/DisposalKind;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DISPOSAL_KIND_UNSPECIFIED", "FIRST_IN", "LAST_IN", "HIGHEST_COST", "LOWEST_COST", "CUSTOM", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public abstract class DisposalKindDto implements Dto2<DisposalKind>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DisposalKindDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<DisposalKindDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DisposalKindDto, DisposalKind>> binaryBase64Serializer$delegate;
    public static final DisposalKindDto DISPOSAL_KIND_UNSPECIFIED = new DisposalKindDto("DISPOSAL_KIND_UNSPECIFIED", 0) { // from class: equity_trading_tax_lots.proto.v1.DisposalKindDto.DISPOSAL_KIND_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisposalKind toProto() {
            return DisposalKind.DISPOSAL_KIND_UNSPECIFIED;
        }
    };
    public static final DisposalKindDto FIRST_IN = new DisposalKindDto("FIRST_IN", 1) { // from class: equity_trading_tax_lots.proto.v1.DisposalKindDto.FIRST_IN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisposalKind toProto() {
            return DisposalKind.FIRST_IN;
        }
    };
    public static final DisposalKindDto LAST_IN = new DisposalKindDto("LAST_IN", 2) { // from class: equity_trading_tax_lots.proto.v1.DisposalKindDto.LAST_IN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisposalKind toProto() {
            return DisposalKind.LAST_IN;
        }
    };
    public static final DisposalKindDto HIGHEST_COST = new DisposalKindDto("HIGHEST_COST", 3) { // from class: equity_trading_tax_lots.proto.v1.DisposalKindDto.HIGHEST_COST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisposalKind toProto() {
            return DisposalKind.HIGHEST_COST;
        }
    };
    public static final DisposalKindDto LOWEST_COST = new DisposalKindDto("LOWEST_COST", 4) { // from class: equity_trading_tax_lots.proto.v1.DisposalKindDto.LOWEST_COST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisposalKind toProto() {
            return DisposalKind.LOWEST_COST;
        }
    };
    public static final DisposalKindDto CUSTOM = new DisposalKindDto("CUSTOM", 5) { // from class: equity_trading_tax_lots.proto.v1.DisposalKindDto.CUSTOM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public DisposalKind toProto() {
            return DisposalKind.CUSTOM;
        }
    };

    private static final /* synthetic */ DisposalKindDto[] $values() {
        return new DisposalKindDto[]{DISPOSAL_KIND_UNSPECIFIED, FIRST_IN, LAST_IN, HIGHEST_COST, LOWEST_COST, CUSTOM};
    }

    public /* synthetic */ DisposalKindDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<DisposalKindDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DisposalKindDto(String str, int i) {
    }

    static {
        DisposalKindDto[] disposalKindDtoArr$values = $values();
        $VALUES = disposalKindDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(disposalKindDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.DisposalKindDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DisposalKindDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: DisposalKindDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/DisposalKindDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lequity_trading_tax_lots/proto/v1/DisposalKindDto;", "Lequity_trading_tax_lots/proto/v1/DisposalKind;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/DisposalKindDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<DisposalKindDto, DisposalKind> {

        /* compiled from: DisposalKindDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DisposalKind.values().length];
                try {
                    iArr[DisposalKind.DISPOSAL_KIND_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DisposalKind.FIRST_IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DisposalKind.LAST_IN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DisposalKind.HIGHEST_COST.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DisposalKind.LOWEST_COST.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DisposalKind.CUSTOM.ordinal()] = 6;
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

        public final KSerializer<DisposalKindDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DisposalKindDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DisposalKindDto> getBinaryBase64Serializer() {
            return (KSerializer) DisposalKindDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DisposalKind> getProtoAdapter() {
            return DisposalKind.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DisposalKindDto getZeroValue() {
            return DisposalKindDto.DISPOSAL_KIND_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DisposalKindDto fromProto(DisposalKind proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return DisposalKindDto.DISPOSAL_KIND_UNSPECIFIED;
                case 2:
                    return DisposalKindDto.FIRST_IN;
                case 3:
                    return DisposalKindDto.LAST_IN;
                case 4:
                    return DisposalKindDto.HIGHEST_COST;
                case 5:
                    return DisposalKindDto.LOWEST_COST;
                case 6:
                    return DisposalKindDto.CUSTOM;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DisposalKindDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/DisposalKindDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/DisposalKindDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<DisposalKindDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<DisposalKindDto, DisposalKind> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/equity_trading_tax_lots.proto.v1.DisposalKind", DisposalKindDto.getEntries(), DisposalKindDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public DisposalKindDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (DisposalKindDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DisposalKindDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static DisposalKindDto valueOf(String str) {
        return (DisposalKindDto) Enum.valueOf(DisposalKindDto.class, str);
    }

    public static DisposalKindDto[] values() {
        return (DisposalKindDto[]) $VALUES.clone();
    }
}
