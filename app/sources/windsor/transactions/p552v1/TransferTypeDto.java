package windsor.transactions.p552v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
/* compiled from: TransferTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001e\u001fB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006 "}, m3636d2 = {"Lwindsor/transactions/v1/TransferTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lwindsor/transactions/v1/TransferType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TRANSFER_TYPE_UNSPECIFIED", "ACH_TRANSFER", "CHECK", "WIRE_TRANSFER", "RECURRING_ACH", "INTERNAL_ACCOUNT_TRANSFER", "INTERNAL_ASSET_TRANSFER", "ACAT_IN", "ROLLOVER_ACH", "UK_BANK_TRANSFER", "ISA_CASH_TRANSFER", "UK_OPEN_BANKING_TRANSFER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public abstract class TransferTypeDto implements Dto2<TransferType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TransferTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferTypeDto, TransferType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TransferTypeDto TRANSFER_TYPE_UNSPECIFIED = new TransferTypeDto("TRANSFER_TYPE_UNSPECIFIED", 0) { // from class: windsor.transactions.v1.TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_UNSPECIFIED;
        }
    };
    public static final TransferTypeDto ACH_TRANSFER = new TransferTypeDto("ACH_TRANSFER", 1) { // from class: windsor.transactions.v1.TransferTypeDto.ACH_TRANSFER
        {
            String str = AnalyticsStrings.ERROR_ACH_TRANSFER;
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.ACH_TRANSFER;
        }
    };
    public static final TransferTypeDto CHECK = new TransferTypeDto("CHECK", 2) { // from class: windsor.transactions.v1.TransferTypeDto.CHECK
        {
            String str = "check";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.CHECK;
        }
    };
    public static final TransferTypeDto WIRE_TRANSFER = new TransferTypeDto("WIRE_TRANSFER", 3) { // from class: windsor.transactions.v1.TransferTypeDto.WIRE_TRANSFER
        {
            String str = "wire_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.WIRE_TRANSFER;
        }
    };
    public static final TransferTypeDto RECURRING_ACH = new TransferTypeDto("RECURRING_ACH", 4) { // from class: windsor.transactions.v1.TransferTypeDto.RECURRING_ACH
        {
            String str = "recurring_ach";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.RECURRING_ACH;
        }
    };
    public static final TransferTypeDto INTERNAL_ACCOUNT_TRANSFER = new TransferTypeDto("INTERNAL_ACCOUNT_TRANSFER", 5) { // from class: windsor.transactions.v1.TransferTypeDto.INTERNAL_ACCOUNT_TRANSFER
        {
            String str = "internal_account_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.INTERNAL_ACCOUNT_TRANSFER;
        }
    };
    public static final TransferTypeDto INTERNAL_ASSET_TRANSFER = new TransferTypeDto("INTERNAL_ASSET_TRANSFER", 6) { // from class: windsor.transactions.v1.TransferTypeDto.INTERNAL_ASSET_TRANSFER
        {
            String str = "internal_asset_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.INTERNAL_ASSET_TRANSFER;
        }
    };
    public static final TransferTypeDto ACAT_IN = new TransferTypeDto("ACAT_IN", 7) { // from class: windsor.transactions.v1.TransferTypeDto.ACAT_IN
        {
            String str = "acat_in";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.ACAT_IN;
        }
    };
    public static final TransferTypeDto ROLLOVER_ACH = new TransferTypeDto("ROLLOVER_ACH", 8) { // from class: windsor.transactions.v1.TransferTypeDto.ROLLOVER_ACH
        {
            String str = "rollover_ach";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.ROLLOVER_ACH;
        }
    };
    public static final TransferTypeDto UK_BANK_TRANSFER = new TransferTypeDto("UK_BANK_TRANSFER", 9) { // from class: windsor.transactions.v1.TransferTypeDto.UK_BANK_TRANSFER
        {
            String str = "uk_bank_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.UK_BANK_TRANSFER;
        }
    };
    public static final TransferTypeDto ISA_CASH_TRANSFER = new TransferTypeDto("ISA_CASH_TRANSFER", 10) { // from class: windsor.transactions.v1.TransferTypeDto.ISA_CASH_TRANSFER
        {
            String str = "isa_cash_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.ISA_CASH_TRANSFER;
        }
    };
    public static final TransferTypeDto UK_OPEN_BANKING_TRANSFER = new TransferTypeDto("UK_OPEN_BANKING_TRANSFER", 11) { // from class: windsor.transactions.v1.TransferTypeDto.UK_OPEN_BANKING_TRANSFER
        {
            String str = "uk_open_banking_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.UK_OPEN_BANKING_TRANSFER;
        }
    };

    private static final /* synthetic */ TransferTypeDto[] $values() {
        return new TransferTypeDto[]{TRANSFER_TYPE_UNSPECIFIED, ACH_TRANSFER, CHECK, WIRE_TRANSFER, RECURRING_ACH, INTERNAL_ACCOUNT_TRANSFER, INTERNAL_ASSET_TRANSFER, ACAT_IN, ROLLOVER_ACH, UK_BANK_TRANSFER, ISA_CASH_TRANSFER, UK_OPEN_BANKING_TRANSFER};
    }

    public /* synthetic */ TransferTypeDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<TransferTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransferTypeDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        TransferTypeDto[] transferTypeDtoArr$values = $values();
        $VALUES = transferTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: windsor.transactions.v1.TransferTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TransferTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwindsor/transactions/v1/TransferTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lwindsor/transactions/v1/TransferTypeDto;", "Lwindsor/transactions/v1/TransferType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwindsor/transactions/v1/TransferTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TransferTypeDto, TransferType> {

        /* compiled from: TransferTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferType.values().length];
                try {
                    iArr[TransferType.TRANSFER_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferType.ACH_TRANSFER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransferType.CHECK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TransferType.WIRE_TRANSFER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TransferType.RECURRING_ACH.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TransferType.INTERNAL_ACCOUNT_TRANSFER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TransferType.INTERNAL_ASSET_TRANSFER.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TransferType.ACAT_IN.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TransferType.ROLLOVER_ACH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TransferType.UK_BANK_TRANSFER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[TransferType.ISA_CASH_TRANSFER.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[TransferType.UK_OPEN_BANKING_TRANSFER.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TransferTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TransferType> getProtoAdapter() {
            return TransferType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferTypeDto getZeroValue() {
            return TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferTypeDto fromProto(TransferType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TransferTypeDto.TRANSFER_TYPE_UNSPECIFIED;
                case 2:
                    return TransferTypeDto.ACH_TRANSFER;
                case 3:
                    return TransferTypeDto.CHECK;
                case 4:
                    return TransferTypeDto.WIRE_TRANSFER;
                case 5:
                    return TransferTypeDto.RECURRING_ACH;
                case 6:
                    return TransferTypeDto.INTERNAL_ACCOUNT_TRANSFER;
                case 7:
                    return TransferTypeDto.INTERNAL_ASSET_TRANSFER;
                case 8:
                    return TransferTypeDto.ACAT_IN;
                case 9:
                    return TransferTypeDto.ROLLOVER_ACH;
                case 10:
                    return TransferTypeDto.UK_BANK_TRANSFER;
                case 11:
                    return TransferTypeDto.ISA_CASH_TRANSFER;
                case 12:
                    return TransferTypeDto.UK_OPEN_BANKING_TRANSFER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TransferTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lwindsor/transactions/v1/TransferTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwindsor/transactions/v1/TransferTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TransferTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TransferTypeDto, TransferType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/windsor.transactions.v1.TransferType", TransferTypeDto.getEntries(), TransferTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TransferTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TransferTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransferTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TransferTypeDto valueOf(String str) {
        return (TransferTypeDto) Enum.valueOf(TransferTypeDto.class, str);
    }

    public static TransferTypeDto[] values() {
        return (TransferTypeDto[]) $VALUES.clone();
    }
}
