package rosetta.cashier;

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
/* compiled from: TransferEventDto.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m3636d2 = {"rosetta/cashier/TransferEventDto$SourceTypeDto", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/cashier/TransferEvent$SourceType;", "Landroid/os/Parcelable;", "", "Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "Serializer", "SOURCE_TYPE_UNSPECIFIED", "AUTO_INVESTMENT", "DEPOSIT_SCHEDULE", "IRA", "IRA_RECURRING", "CATPAY", "DEVICE_RISK", "ACH_DEPOSIT_SCHEDULE", "MAJOR_OAK", "RECEIVED_ACH_TRANSFER", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* renamed from: rosetta.cashier.TransferEventDto$SourceTypeDto, reason: use source file name */
/* loaded from: classes25.dex */
public abstract class TransferEventDto2 implements Dto2<TransferEvent>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferEventDto2[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TransferEventDto2> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferEventDto2, TransferEvent>> binaryBase64Serializer$delegate;
    public static final TransferEventDto2 SOURCE_TYPE_UNSPECIFIED = new TransferEventDto2("SOURCE_TYPE_UNSPECIFIED", 0) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.SOURCE_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.SOURCE_TYPE_UNSPECIFIED;
        }
    };
    public static final TransferEventDto2 AUTO_INVESTMENT = new TransferEventDto2("AUTO_INVESTMENT", 1) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.AUTO_INVESTMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.AUTO_INVESTMENT;
        }
    };
    public static final TransferEventDto2 DEPOSIT_SCHEDULE = new TransferEventDto2("DEPOSIT_SCHEDULE", 2) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.DEPOSIT_SCHEDULE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.DEPOSIT_SCHEDULE;
        }
    };
    public static final TransferEventDto2 IRA = new TransferEventDto2("IRA", 3) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.IRA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.IRA;
        }
    };
    public static final TransferEventDto2 IRA_RECURRING = new TransferEventDto2("IRA_RECURRING", 4) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.IRA_RECURRING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.IRA_RECURRING;
        }
    };
    public static final TransferEventDto2 CATPAY = new TransferEventDto2("CATPAY", 5) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.CATPAY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.CATPAY;
        }
    };
    public static final TransferEventDto2 DEVICE_RISK = new TransferEventDto2("DEVICE_RISK", 6) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.DEVICE_RISK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.DEVICE_RISK;
        }
    };
    public static final TransferEventDto2 ACH_DEPOSIT_SCHEDULE = new TransferEventDto2("ACH_DEPOSIT_SCHEDULE", 7) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.ACH_DEPOSIT_SCHEDULE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.ACH_DEPOSIT_SCHEDULE;
        }
    };
    public static final TransferEventDto2 MAJOR_OAK = new TransferEventDto2("MAJOR_OAK", 8) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.MAJOR_OAK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.MAJOR_OAK;
        }
    };
    public static final TransferEventDto2 RECEIVED_ACH_TRANSFER = new TransferEventDto2("RECEIVED_ACH_TRANSFER", 9) { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto.RECEIVED_ACH_TRANSFER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferEvent toProto() {
            return TransferEvent.RECEIVED_ACH_TRANSFER;
        }
    };

    private static final /* synthetic */ TransferEventDto2[] $values() {
        return new TransferEventDto2[]{SOURCE_TYPE_UNSPECIFIED, AUTO_INVESTMENT, DEPOSIT_SCHEDULE, IRA, IRA_RECURRING, CATPAY, DEVICE_RISK, ACH_DEPOSIT_SCHEDULE, MAJOR_OAK, RECEIVED_ACH_TRANSFER};
    }

    public /* synthetic */ TransferEventDto2(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<TransferEventDto2> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransferEventDto2(String str, int i) {
    }

    static {
        TransferEventDto2[] transferEventDto2Arr$values = $values();
        $VALUES = transferEventDto2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferEventDto2Arr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.cashier.TransferEventDto$SourceTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferEventDto2.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TransferEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/cashier/TransferEventDto$SourceTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "Lrosetta/cashier/TransferEvent$SourceType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: rosetta.cashier.TransferEventDto$SourceTypeDto$Companion, reason: from kotlin metadata */
    public static final class Companion implements Dto2.Creator<TransferEventDto2, TransferEvent> {

        /* compiled from: TransferEventDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: rosetta.cashier.TransferEventDto$SourceTypeDto$Companion$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferEvent.values().length];
                try {
                    iArr[TransferEvent.SOURCE_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferEvent.AUTO_INVESTMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransferEvent.DEPOSIT_SCHEDULE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TransferEvent.IRA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TransferEvent.IRA_RECURRING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TransferEvent.CATPAY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TransferEvent.DEVICE_RISK.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TransferEvent.ACH_DEPOSIT_SCHEDULE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TransferEvent.MAJOR_OAK.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TransferEvent.RECEIVED_ACH_TRANSFER.ordinal()] = 10;
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

        public final KSerializer<TransferEventDto2> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferEventDto2> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferEventDto2> getBinaryBase64Serializer() {
            return (KSerializer) TransferEventDto2.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TransferEvent> getProtoAdapter() {
            return TransferEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferEventDto2 getZeroValue() {
            return TransferEventDto2.SOURCE_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferEventDto2 fromProto(TransferEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TransferEventDto2.SOURCE_TYPE_UNSPECIFIED;
                case 2:
                    return TransferEventDto2.AUTO_INVESTMENT;
                case 3:
                    return TransferEventDto2.DEPOSIT_SCHEDULE;
                case 4:
                    return TransferEventDto2.IRA;
                case 5:
                    return TransferEventDto2.IRA_RECURRING;
                case 6:
                    return TransferEventDto2.CATPAY;
                case 7:
                    return TransferEventDto2.DEVICE_RISK;
                case 8:
                    return TransferEventDto2.ACH_DEPOSIT_SCHEDULE;
                case 9:
                    return TransferEventDto2.MAJOR_OAK;
                case 10:
                    return TransferEventDto2.RECEIVED_ACH_TRANSFER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TransferEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/cashier/TransferEventDto$SourceTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/cashier/TransferEventDto$SourceTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: rosetta.cashier.TransferEventDto$SourceTypeDto$Serializer */
    public static final class Serializer implements KSerializer<TransferEventDto2> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TransferEventDto2, TransferEvent> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.TransferEvent.SourceType", TransferEventDto2.getEntries(), TransferEventDto2.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TransferEventDto2 deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TransferEventDto2) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransferEventDto2 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TransferEventDto2 valueOf(String str) {
        return (TransferEventDto2) Enum.valueOf(TransferEventDto2.class, str);
    }

    public static TransferEventDto2[] values() {
        return (TransferEventDto2[]) $VALUES.clone();
    }
}
