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
/* compiled from: TransactionStateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lwindsor/transactions/v1/TransactionState;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "STATUS_UNSPECIFIED", "NEW", "PENDING_TRANSFER_INITIATION", "TRANSFER_INITIATED", "COMPLETE", "FAILED", "CANCELED", "PENDING_CANCEL", "PENDING_REVERSE", "CANCEL_REQUESTED_UNCONFIRMED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public abstract class TransactionStateDto implements Dto2<TransactionState>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionStateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TransactionStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransactionStateDto, TransactionState>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TransactionStateDto STATUS_UNSPECIFIED = new TransactionStateDto("STATUS_UNSPECIFIED", 0) { // from class: windsor.transactions.v1.TransactionStateDto.STATUS_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.STATUS_UNSPECIFIED;
        }
    };
    public static final TransactionStateDto NEW = new TransactionStateDto("NEW", 1) { // from class: windsor.transactions.v1.TransactionStateDto.NEW
        {
            String str = "new";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.NEW;
        }
    };
    public static final TransactionStateDto PENDING_TRANSFER_INITIATION = new TransactionStateDto("PENDING_TRANSFER_INITIATION", 2) { // from class: windsor.transactions.v1.TransactionStateDto.PENDING_TRANSFER_INITIATION
        {
            String str = "pending_transfer_initiation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.PENDING_TRANSFER_INITIATION;
        }
    };
    public static final TransactionStateDto TRANSFER_INITIATED = new TransactionStateDto("TRANSFER_INITIATED", 3) { // from class: windsor.transactions.v1.TransactionStateDto.TRANSFER_INITIATED
        {
            String str = "transfer_initiated";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.TRANSFER_INITIATED;
        }
    };
    public static final TransactionStateDto COMPLETE = new TransactionStateDto("COMPLETE", 4) { // from class: windsor.transactions.v1.TransactionStateDto.COMPLETE
        {
            String str = "complete";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.COMPLETE;
        }
    };
    public static final TransactionStateDto FAILED = new TransactionStateDto("FAILED", 5) { // from class: windsor.transactions.v1.TransactionStateDto.FAILED
        {
            String str = "failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.FAILED;
        }
    };
    public static final TransactionStateDto CANCELED = new TransactionStateDto("CANCELED", 6) { // from class: windsor.transactions.v1.TransactionStateDto.CANCELED
        {
            String str = "canceled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.CANCELED;
        }
    };
    public static final TransactionStateDto PENDING_CANCEL = new TransactionStateDto("PENDING_CANCEL", 7) { // from class: windsor.transactions.v1.TransactionStateDto.PENDING_CANCEL
        {
            String str = "pending_cancel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.PENDING_CANCEL;
        }
    };
    public static final TransactionStateDto PENDING_REVERSE = new TransactionStateDto("PENDING_REVERSE", 8) { // from class: windsor.transactions.v1.TransactionStateDto.PENDING_REVERSE
        {
            String str = "pending_reverse";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.PENDING_REVERSE;
        }
    };
    public static final TransactionStateDto CANCEL_REQUESTED_UNCONFIRMED = new TransactionStateDto("CANCEL_REQUESTED_UNCONFIRMED", 9) { // from class: windsor.transactions.v1.TransactionStateDto.CANCEL_REQUESTED_UNCONFIRMED
        {
            String str = "cancel_requested_unconfirmed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransactionState toProto() {
            return TransactionState.CANCEL_REQUESTED_UNCONFIRMED;
        }
    };

    private static final /* synthetic */ TransactionStateDto[] $values() {
        return new TransactionStateDto[]{STATUS_UNSPECIFIED, NEW, PENDING_TRANSFER_INITIATION, TRANSFER_INITIATED, COMPLETE, FAILED, CANCELED, PENDING_CANCEL, PENDING_REVERSE, CANCEL_REQUESTED_UNCONFIRMED};
    }

    public /* synthetic */ TransactionStateDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<TransactionStateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransactionStateDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        TransactionStateDto[] transactionStateDtoArr$values = $values();
        $VALUES = transactionStateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transactionStateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: windsor.transactions.v1.TransactionStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TransactionStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lwindsor/transactions/v1/TransactionStateDto;", "Lwindsor/transactions/v1/TransactionState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwindsor/transactions/v1/TransactionStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TransactionStateDto, TransactionState> {

        /* compiled from: TransactionStateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransactionState.values().length];
                try {
                    iArr[TransactionState.STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransactionState.NEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransactionState.PENDING_TRANSFER_INITIATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TransactionState.TRANSFER_INITIATED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TransactionState.COMPLETE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TransactionState.FAILED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TransactionState.CANCELED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TransactionState.PENDING_CANCEL.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TransactionState.PENDING_REVERSE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TransactionState.CANCEL_REQUESTED_UNCONFIRMED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransactionStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransactionStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransactionStateDto> getBinaryBase64Serializer() {
            return (KSerializer) TransactionStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TransactionState> getProtoAdapter() {
            return TransactionState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransactionStateDto getZeroValue() {
            return TransactionStateDto.STATUS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransactionStateDto fromProto(TransactionState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TransactionStateDto.STATUS_UNSPECIFIED;
                case 2:
                    return TransactionStateDto.NEW;
                case 3:
                    return TransactionStateDto.PENDING_TRANSFER_INITIATION;
                case 4:
                    return TransactionStateDto.TRANSFER_INITIATED;
                case 5:
                    return TransactionStateDto.COMPLETE;
                case 6:
                    return TransactionStateDto.FAILED;
                case 7:
                    return TransactionStateDto.CANCELED;
                case 8:
                    return TransactionStateDto.PENDING_CANCEL;
                case 9:
                    return TransactionStateDto.PENDING_REVERSE;
                case 10:
                    return TransactionStateDto.CANCEL_REQUESTED_UNCONFIRMED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TransactionStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwindsor/transactions/v1/TransactionStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TransactionStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TransactionStateDto, TransactionState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/windsor.transactions.v1.TransactionState", TransactionStateDto.getEntries(), TransactionStateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TransactionStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TransactionStateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransactionStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TransactionStateDto valueOf(String str) {
        return (TransactionStateDto) Enum.valueOf(TransactionStateDto.class, str);
    }

    public static TransactionStateDto[] values() {
        return (TransactionStateDto[]) $VALUES.clone();
    }
}
