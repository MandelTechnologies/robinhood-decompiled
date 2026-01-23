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
/* compiled from: IsaCashTransferStateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002 !B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\""}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lwindsor/transactions/v1/IsaCashTransferState;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "ISA_STATUS_UNSPECIFIED", "PENDING_FILE_GENERATION", "FILE_GENERATED", "PENDING_QUAI_UPLOAD", "FILE_UPLOADED", "PENDING_MORE_INFORMATION", "LANDED", "PENDING_REVERSAL", "SUCCESS", "PENDING_CANCELLATION", "ISA_CASH_TRANSFER_FAILED", "CANCELLED", "RETURNED", "CANCEL_REQUESTED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public abstract class IsaCashTransferStateDto implements Dto2<IsaCashTransferState>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IsaCashTransferStateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<IsaCashTransferStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IsaCashTransferStateDto, IsaCashTransferState>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final IsaCashTransferStateDto ISA_STATUS_UNSPECIFIED = new IsaCashTransferStateDto("ISA_STATUS_UNSPECIFIED", 0) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.ISA_STATUS_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.ISA_STATUS_UNSPECIFIED;
        }
    };
    public static final IsaCashTransferStateDto PENDING_FILE_GENERATION = new IsaCashTransferStateDto("PENDING_FILE_GENERATION", 1) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.PENDING_FILE_GENERATION
        {
            String str = "pending_file_generation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.PENDING_FILE_GENERATION;
        }
    };
    public static final IsaCashTransferStateDto FILE_GENERATED = new IsaCashTransferStateDto("FILE_GENERATED", 2) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.FILE_GENERATED
        {
            String str = "file_generated";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.FILE_GENERATED;
        }
    };
    public static final IsaCashTransferStateDto PENDING_QUAI_UPLOAD = new IsaCashTransferStateDto("PENDING_QUAI_UPLOAD", 3) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.PENDING_QUAI_UPLOAD
        {
            String str = "pending_quai_upload";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.PENDING_QUAI_UPLOAD;
        }
    };
    public static final IsaCashTransferStateDto FILE_UPLOADED = new IsaCashTransferStateDto("FILE_UPLOADED", 4) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.FILE_UPLOADED
        {
            String str = "file_uploaded";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.FILE_UPLOADED;
        }
    };
    public static final IsaCashTransferStateDto PENDING_MORE_INFORMATION = new IsaCashTransferStateDto("PENDING_MORE_INFORMATION", 5) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.PENDING_MORE_INFORMATION
        {
            String str = "pending_more_information";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.PENDING_MORE_INFORMATION;
        }
    };
    public static final IsaCashTransferStateDto LANDED = new IsaCashTransferStateDto("LANDED", 6) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.LANDED
        {
            String str = "landed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.LANDED;
        }
    };
    public static final IsaCashTransferStateDto PENDING_REVERSAL = new IsaCashTransferStateDto("PENDING_REVERSAL", 7) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.PENDING_REVERSAL
        {
            String str = "pending_reversal";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.PENDING_REVERSAL;
        }
    };
    public static final IsaCashTransferStateDto SUCCESS = new IsaCashTransferStateDto("SUCCESS", 8) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.SUCCESS
        {
            String str = "success";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.SUCCESS;
        }
    };
    public static final IsaCashTransferStateDto PENDING_CANCELLATION = new IsaCashTransferStateDto("PENDING_CANCELLATION", 9) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.PENDING_CANCELLATION
        {
            String str = "pending_cancellation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.PENDING_CANCELLATION;
        }
    };
    public static final IsaCashTransferStateDto ISA_CASH_TRANSFER_FAILED = new IsaCashTransferStateDto("ISA_CASH_TRANSFER_FAILED", 10) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.ISA_CASH_TRANSFER_FAILED
        {
            String str = "isa_cash_transfer_failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.ISA_CASH_TRANSFER_FAILED;
        }
    };
    public static final IsaCashTransferStateDto CANCELLED = new IsaCashTransferStateDto("CANCELLED", 11) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.CANCELLED
        {
            String str = "cancelled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.CANCELLED;
        }
    };
    public static final IsaCashTransferStateDto RETURNED = new IsaCashTransferStateDto("RETURNED", 12) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.RETURNED
        {
            String str = "returned";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.RETURNED;
        }
    };
    public static final IsaCashTransferStateDto CANCEL_REQUESTED = new IsaCashTransferStateDto("CANCEL_REQUESTED", 13) { // from class: windsor.transactions.v1.IsaCashTransferStateDto.CANCEL_REQUESTED
        {
            String str = "cancel_requested";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public IsaCashTransferState toProto() {
            return IsaCashTransferState.CANCEL_REQUESTED;
        }
    };

    private static final /* synthetic */ IsaCashTransferStateDto[] $values() {
        return new IsaCashTransferStateDto[]{ISA_STATUS_UNSPECIFIED, PENDING_FILE_GENERATION, FILE_GENERATED, PENDING_QUAI_UPLOAD, FILE_UPLOADED, PENDING_MORE_INFORMATION, LANDED, PENDING_REVERSAL, SUCCESS, PENDING_CANCELLATION, ISA_CASH_TRANSFER_FAILED, CANCELLED, RETURNED, CANCEL_REQUESTED};
    }

    public /* synthetic */ IsaCashTransferStateDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<IsaCashTransferStateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IsaCashTransferStateDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        IsaCashTransferStateDto[] isaCashTransferStateDtoArr$values = $values();
        $VALUES = isaCashTransferStateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(isaCashTransferStateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: windsor.transactions.v1.IsaCashTransferStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsaCashTransferStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: IsaCashTransferStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lwindsor/transactions/v1/IsaCashTransferStateDto;", "Lwindsor/transactions/v1/IsaCashTransferState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwindsor/transactions/v1/IsaCashTransferStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<IsaCashTransferStateDto, IsaCashTransferState> {

        /* compiled from: IsaCashTransferStateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IsaCashTransferState.values().length];
                try {
                    iArr[IsaCashTransferState.ISA_STATUS_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[IsaCashTransferState.PENDING_FILE_GENERATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[IsaCashTransferState.FILE_GENERATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[IsaCashTransferState.PENDING_QUAI_UPLOAD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IsaCashTransferState.FILE_UPLOADED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IsaCashTransferState.PENDING_MORE_INFORMATION.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[IsaCashTransferState.LANDED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[IsaCashTransferState.PENDING_REVERSAL.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[IsaCashTransferState.SUCCESS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[IsaCashTransferState.PENDING_CANCELLATION.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[IsaCashTransferState.ISA_CASH_TRANSFER_FAILED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[IsaCashTransferState.CANCELLED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[IsaCashTransferState.RETURNED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[IsaCashTransferState.CANCEL_REQUESTED.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IsaCashTransferStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaCashTransferStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IsaCashTransferStateDto> getBinaryBase64Serializer() {
            return (KSerializer) IsaCashTransferStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IsaCashTransferState> getProtoAdapter() {
            return IsaCashTransferState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaCashTransferStateDto getZeroValue() {
            return IsaCashTransferStateDto.ISA_STATUS_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IsaCashTransferStateDto fromProto(IsaCashTransferState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return IsaCashTransferStateDto.ISA_STATUS_UNSPECIFIED;
                case 2:
                    return IsaCashTransferStateDto.PENDING_FILE_GENERATION;
                case 3:
                    return IsaCashTransferStateDto.FILE_GENERATED;
                case 4:
                    return IsaCashTransferStateDto.PENDING_QUAI_UPLOAD;
                case 5:
                    return IsaCashTransferStateDto.FILE_UPLOADED;
                case 6:
                    return IsaCashTransferStateDto.PENDING_MORE_INFORMATION;
                case 7:
                    return IsaCashTransferStateDto.LANDED;
                case 8:
                    return IsaCashTransferStateDto.PENDING_REVERSAL;
                case 9:
                    return IsaCashTransferStateDto.SUCCESS;
                case 10:
                    return IsaCashTransferStateDto.PENDING_CANCELLATION;
                case 11:
                    return IsaCashTransferStateDto.ISA_CASH_TRANSFER_FAILED;
                case 12:
                    return IsaCashTransferStateDto.CANCELLED;
                case 13:
                    return IsaCashTransferStateDto.RETURNED;
                case 14:
                    return IsaCashTransferStateDto.CANCEL_REQUESTED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IsaCashTransferStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwindsor/transactions/v1/IsaCashTransferStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IsaCashTransferStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<IsaCashTransferStateDto, IsaCashTransferState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/windsor.transactions.v1.IsaCashTransferState", IsaCashTransferStateDto.getEntries(), IsaCashTransferStateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public IsaCashTransferStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (IsaCashTransferStateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IsaCashTransferStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static IsaCashTransferStateDto valueOf(String str) {
        return (IsaCashTransferStateDto) Enum.valueOf(IsaCashTransferStateDto.class, str);
    }

    public static IsaCashTransferStateDto[] values() {
        return (IsaCashTransferStateDto[]) $VALUES.clone();
    }
}
