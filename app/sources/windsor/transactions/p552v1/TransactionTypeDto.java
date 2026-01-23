package windsor.transactions.p552v1;

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
/* compiled from: TransactionTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0019\u001aB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u001b"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lwindsor/transactions/v1/TransactionType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TYPE_UNSPECIFIED", "CONTRIBUTION_REGULAR", "CONTRIBUTION_ROLLOVER", "DISTRIBUTION_REGULAR", "DISTRIBUTION_EARLY", "DISTRIBUTION_CORRECTION", "CASH_TRANSFER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public abstract class TransactionTypeDto implements Dto2<TransactionType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TransactionTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransactionTypeDto, TransactionType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TransactionTypeDto TYPE_UNSPECIFIED = new TransactionTypeDto("TYPE_UNSPECIFIED", 0) { // from class: windsor.transactions.v1.TransactionTypeDto.TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionType toProto() {
            return TransactionType.TYPE_UNSPECIFIED;
        }
    };
    public static final TransactionTypeDto CONTRIBUTION_REGULAR = new TransactionTypeDto("CONTRIBUTION_REGULAR", 1) { // from class: windsor.transactions.v1.TransactionTypeDto.CONTRIBUTION_REGULAR
        {
            String str = "contribution_regular";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionType toProto() {
            return TransactionType.CONTRIBUTION_REGULAR;
        }
    };
    public static final TransactionTypeDto CONTRIBUTION_ROLLOVER = new TransactionTypeDto("CONTRIBUTION_ROLLOVER", 2) { // from class: windsor.transactions.v1.TransactionTypeDto.CONTRIBUTION_ROLLOVER
        {
            String str = "contribution_rollover";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionType toProto() {
            return TransactionType.CONTRIBUTION_ROLLOVER;
        }
    };
    public static final TransactionTypeDto DISTRIBUTION_REGULAR = new TransactionTypeDto("DISTRIBUTION_REGULAR", 3) { // from class: windsor.transactions.v1.TransactionTypeDto.DISTRIBUTION_REGULAR
        {
            String str = "distribution_regular";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionType toProto() {
            return TransactionType.DISTRIBUTION_REGULAR;
        }
    };
    public static final TransactionTypeDto DISTRIBUTION_EARLY = new TransactionTypeDto("DISTRIBUTION_EARLY", 4) { // from class: windsor.transactions.v1.TransactionTypeDto.DISTRIBUTION_EARLY
        {
            String str = "distribution_early";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionType toProto() {
            return TransactionType.DISTRIBUTION_EARLY;
        }
    };
    public static final TransactionTypeDto DISTRIBUTION_CORRECTION = new TransactionTypeDto("DISTRIBUTION_CORRECTION", 5) { // from class: windsor.transactions.v1.TransactionTypeDto.DISTRIBUTION_CORRECTION
        {
            String str = "distribution_correction";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionType toProto() {
            return TransactionType.DISTRIBUTION_CORRECTION;
        }
    };
    public static final TransactionTypeDto CASH_TRANSFER = new TransactionTypeDto("CASH_TRANSFER", 6) { // from class: windsor.transactions.v1.TransactionTypeDto.CASH_TRANSFER
        {
            String str = "cash_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionType toProto() {
            return TransactionType.CASH_TRANSFER;
        }
    };

    private static final /* synthetic */ TransactionTypeDto[] $values() {
        return new TransactionTypeDto[]{TYPE_UNSPECIFIED, CONTRIBUTION_REGULAR, CONTRIBUTION_ROLLOVER, DISTRIBUTION_REGULAR, DISTRIBUTION_EARLY, DISTRIBUTION_CORRECTION, CASH_TRANSFER};
    }

    public /* synthetic */ TransactionTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<TransactionTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransactionTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        TransactionTypeDto[] transactionTypeDtoArr$values = $values();
        $VALUES = transactionTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transactionTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: windsor.transactions.v1.TransactionTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TransactionTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lwindsor/transactions/v1/TransactionTypeDto;", "Lwindsor/transactions/v1/TransactionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwindsor/transactions/v1/TransactionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TransactionTypeDto, TransactionType> {

        /* compiled from: TransactionTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransactionType.values().length];
                try {
                    iArr[TransactionType.TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransactionType.CONTRIBUTION_REGULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransactionType.CONTRIBUTION_ROLLOVER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TransactionType.DISTRIBUTION_REGULAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TransactionType.DISTRIBUTION_EARLY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TransactionType.DISTRIBUTION_CORRECTION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TransactionType.CASH_TRANSFER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransactionTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransactionTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransactionTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TransactionTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TransactionType> getProtoAdapter() {
            return TransactionType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransactionTypeDto getZeroValue() {
            return TransactionTypeDto.TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransactionTypeDto fromProto(TransactionType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TransactionTypeDto.TYPE_UNSPECIFIED;
                case 2:
                    return TransactionTypeDto.CONTRIBUTION_REGULAR;
                case 3:
                    return TransactionTypeDto.CONTRIBUTION_ROLLOVER;
                case 4:
                    return TransactionTypeDto.DISTRIBUTION_REGULAR;
                case 5:
                    return TransactionTypeDto.DISTRIBUTION_EARLY;
                case 6:
                    return TransactionTypeDto.DISTRIBUTION_CORRECTION;
                case 7:
                    return TransactionTypeDto.CASH_TRANSFER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TransactionTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwindsor/transactions/v1/TransactionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TransactionTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TransactionTypeDto, TransactionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/windsor.transactions.v1.TransactionType", TransactionTypeDto.getEntries(), TransactionTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TransactionTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TransactionTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransactionTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TransactionTypeDto valueOf(String str) {
        return (TransactionTypeDto) Enum.valueOf(TransactionTypeDto.class, str);
    }

    public static TransactionTypeDto[] values() {
        return (TransactionTypeDto[]) $VALUES.clone();
    }
}
