package rosetta.payment_hub.p540v1.service;

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
/* compiled from: TransferTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002*+B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006,"}, m3636d2 = {"Lrosetta/payment_hub/v1/service/TransferTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/payment_hub/v1/service/TransferType;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TRANSFER_TYPE__UNSPECIFIED", "TRANSFER_TYPE_ORIGINATED_ACH", "TRANSFER_TYPE_NON_ORIGINATED_ACH", "TRANSFER_TYPE_INTER_ENTITY", "TRANSFER_TYPE_DEBIT_CARD_FUNDING", "TRANSFER_TYPE_P2P", "TRANSFER_TYPE_INTERNAL", "TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT", "TRANSFER_TYPE_INSTANT_BANK_TRANSFER", "TRANSFER_TYPE_CHECK", "TRANSFER_TYPE_INCOMING_WIRE", "TRANSFER_TYPE_SEPA_CREDIT", "TRANSFER_TYPE_WALLET", "TRANSFER_TYPE_UK_BANK_TRANSFER", "TRANSFER_TYPE_OUTGOING_WIRE", "TRANSFER_TYPE_SG_BANK_DEPOSIT", "TRANSFER_TYPE_SG_BANK_WITHDRAWAL", "TRANSFER_TYPE_FX_TRANSFER", "TRANSFER_TYPE_ROLLOVER_ACH", "TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY", "TRANSFER_TYPE_SVB_ACH_TRANSFER", "TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER", "TRANSFER_TYPE_ISA_CASH_TRANSFER", "TRANSFER_TYPE_OUTGOING_CHECK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class TransferTypeDto implements Dto2<TransferType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TransferTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferTypeDto, TransferType>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final TransferTypeDto TRANSFER_TYPE__UNSPECIFIED = new TransferTypeDto("TRANSFER_TYPE__UNSPECIFIED", 0) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE__UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE__UNSPECIFIED;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_ORIGINATED_ACH = new TransferTypeDto("TRANSFER_TYPE_ORIGINATED_ACH", 1) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_ORIGINATED_ACH
        {
            String str = "originated_ach";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_ORIGINATED_ACH;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_NON_ORIGINATED_ACH = new TransferTypeDto("TRANSFER_TYPE_NON_ORIGINATED_ACH", 2) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_NON_ORIGINATED_ACH
        {
            String str = "non_originated_ach";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_NON_ORIGINATED_ACH;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_INTER_ENTITY = new TransferTypeDto("TRANSFER_TYPE_INTER_ENTITY", 3) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_INTER_ENTITY
        {
            String str = "inter_entity";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_INTER_ENTITY;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_DEBIT_CARD_FUNDING = new TransferTypeDto("TRANSFER_TYPE_DEBIT_CARD_FUNDING", 4) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_DEBIT_CARD_FUNDING
        {
            String str = "debit_card_funding";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_DEBIT_CARD_FUNDING;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_P2P = new TransferTypeDto("TRANSFER_TYPE_P2P", 5) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_P2P
        {
            String str = "p2p";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_P2P;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_INTERNAL = new TransferTypeDto("TRANSFER_TYPE_INTERNAL", 6) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_INTERNAL
        {
            String str = "internal";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_INTERNAL;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT = new TransferTypeDto("TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT", 7) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT
        {
            String str = "instant_firm_settlement";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_INSTANT_BANK_TRANSFER = new TransferTypeDto("TRANSFER_TYPE_INSTANT_BANK_TRANSFER", 8) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_INSTANT_BANK_TRANSFER
        {
            String str = "instant_bank_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_INSTANT_BANK_TRANSFER;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_CHECK = new TransferTypeDto("TRANSFER_TYPE_CHECK", 9) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_CHECK
        {
            String str = "check";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_CHECK;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_INCOMING_WIRE = new TransferTypeDto("TRANSFER_TYPE_INCOMING_WIRE", 10) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_INCOMING_WIRE
        {
            String str = "incoming_wire";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_INCOMING_WIRE;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_SEPA_CREDIT = new TransferTypeDto("TRANSFER_TYPE_SEPA_CREDIT", 11) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_SEPA_CREDIT
        {
            String str = "sepa_credit";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_SEPA_CREDIT;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_WALLET = new TransferTypeDto("TRANSFER_TYPE_WALLET", 12) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_WALLET
        {
            String str = "wallet";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_WALLET;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_UK_BANK_TRANSFER = new TransferTypeDto("TRANSFER_TYPE_UK_BANK_TRANSFER", 13) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_UK_BANK_TRANSFER
        {
            String str = "uk_bank_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_UK_BANK_TRANSFER;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_OUTGOING_WIRE = new TransferTypeDto("TRANSFER_TYPE_OUTGOING_WIRE", 14) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_OUTGOING_WIRE
        {
            String str = "outgoing_wire";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_OUTGOING_WIRE;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_SG_BANK_DEPOSIT = new TransferTypeDto("TRANSFER_TYPE_SG_BANK_DEPOSIT", 15) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_SG_BANK_DEPOSIT
        {
            String str = "sg_bank_deposit";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_SG_BANK_DEPOSIT;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_SG_BANK_WITHDRAWAL = new TransferTypeDto("TRANSFER_TYPE_SG_BANK_WITHDRAWAL", 16) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_SG_BANK_WITHDRAWAL
        {
            String str = "sg_bank_withdrawal";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_SG_BANK_WITHDRAWAL;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_FX_TRANSFER = new TransferTypeDto("TRANSFER_TYPE_FX_TRANSFER", 17) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_FX_TRANSFER
        {
            String str = "fx_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_FX_TRANSFER;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_ROLLOVER_ACH = new TransferTypeDto("TRANSFER_TYPE_ROLLOVER_ACH", 18) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_ROLLOVER_ACH
        {
            String str = "rollover_ach";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_ROLLOVER_ACH;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY = new TransferTypeDto("TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY", 19) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY
        {
            String str = "non_originated_ach_early_pay";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_SVB_ACH_TRANSFER = new TransferTypeDto("TRANSFER_TYPE_SVB_ACH_TRANSFER", 20) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_SVB_ACH_TRANSFER
        {
            String str = "svb_ach_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_SVB_ACH_TRANSFER;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER = new TransferTypeDto("TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER", 21) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER
        {
            String str = "uk_open_banking_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_ISA_CASH_TRANSFER = new TransferTypeDto("TRANSFER_TYPE_ISA_CASH_TRANSFER", 22) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_ISA_CASH_TRANSFER
        {
            String str = "isa_cash_transfer";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_ISA_CASH_TRANSFER;
        }
    };
    public static final TransferTypeDto TRANSFER_TYPE_OUTGOING_CHECK = new TransferTypeDto("TRANSFER_TYPE_OUTGOING_CHECK", 23) { // from class: rosetta.payment_hub.v1.service.TransferTypeDto.TRANSFER_TYPE_OUTGOING_CHECK
        {
            String str = "outgoing_check";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferType toProto() {
            return TransferType.TRANSFER_TYPE_OUTGOING_CHECK;
        }
    };

    private static final /* synthetic */ TransferTypeDto[] $values() {
        return new TransferTypeDto[]{TRANSFER_TYPE__UNSPECIFIED, TRANSFER_TYPE_ORIGINATED_ACH, TRANSFER_TYPE_NON_ORIGINATED_ACH, TRANSFER_TYPE_INTER_ENTITY, TRANSFER_TYPE_DEBIT_CARD_FUNDING, TRANSFER_TYPE_P2P, TRANSFER_TYPE_INTERNAL, TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT, TRANSFER_TYPE_INSTANT_BANK_TRANSFER, TRANSFER_TYPE_CHECK, TRANSFER_TYPE_INCOMING_WIRE, TRANSFER_TYPE_SEPA_CREDIT, TRANSFER_TYPE_WALLET, TRANSFER_TYPE_UK_BANK_TRANSFER, TRANSFER_TYPE_OUTGOING_WIRE, TRANSFER_TYPE_SG_BANK_DEPOSIT, TRANSFER_TYPE_SG_BANK_WITHDRAWAL, TRANSFER_TYPE_FX_TRANSFER, TRANSFER_TYPE_ROLLOVER_ACH, TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY, TRANSFER_TYPE_SVB_ACH_TRANSFER, TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER, TRANSFER_TYPE_ISA_CASH_TRANSFER, TRANSFER_TYPE_OUTGOING_CHECK};
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
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.payment_hub.v1.service.TransferTypeDto$$ExternalSyntheticLambda0
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
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/payment_hub/v1/service/TransferTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "Lrosetta/payment_hub/v1/service/TransferType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/payment_hub/v1/service/TransferTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TransferTypeDto, TransferType> {

        /* compiled from: TransferTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferType.values().length];
                try {
                    iArr[TransferType.TRANSFER_TYPE__UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_ORIGINATED_ACH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_NON_ORIGINATED_ACH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_INTER_ENTITY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_DEBIT_CARD_FUNDING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_P2P.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_INTERNAL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_INSTANT_BANK_TRANSFER.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_CHECK.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_INCOMING_WIRE.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_SEPA_CREDIT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_WALLET.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_UK_BANK_TRANSFER.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_OUTGOING_WIRE.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_SG_BANK_DEPOSIT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_SG_BANK_WITHDRAWAL.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_FX_TRANSFER.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_ROLLOVER_ACH.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_SVB_ACH_TRANSFER.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_ISA_CASH_TRANSFER.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[TransferType.TRANSFER_TYPE_OUTGOING_CHECK.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
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
            return TransferTypeDto.TRANSFER_TYPE__UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferTypeDto fromProto(TransferType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TransferTypeDto.TRANSFER_TYPE__UNSPECIFIED;
                case 2:
                    return TransferTypeDto.TRANSFER_TYPE_ORIGINATED_ACH;
                case 3:
                    return TransferTypeDto.TRANSFER_TYPE_NON_ORIGINATED_ACH;
                case 4:
                    return TransferTypeDto.TRANSFER_TYPE_INTER_ENTITY;
                case 5:
                    return TransferTypeDto.TRANSFER_TYPE_DEBIT_CARD_FUNDING;
                case 6:
                    return TransferTypeDto.TRANSFER_TYPE_P2P;
                case 7:
                    return TransferTypeDto.TRANSFER_TYPE_INTERNAL;
                case 8:
                    return TransferTypeDto.TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT;
                case 9:
                    return TransferTypeDto.TRANSFER_TYPE_INSTANT_BANK_TRANSFER;
                case 10:
                    return TransferTypeDto.TRANSFER_TYPE_CHECK;
                case 11:
                    return TransferTypeDto.TRANSFER_TYPE_INCOMING_WIRE;
                case 12:
                    return TransferTypeDto.TRANSFER_TYPE_SEPA_CREDIT;
                case 13:
                    return TransferTypeDto.TRANSFER_TYPE_WALLET;
                case 14:
                    return TransferTypeDto.TRANSFER_TYPE_UK_BANK_TRANSFER;
                case 15:
                    return TransferTypeDto.TRANSFER_TYPE_OUTGOING_WIRE;
                case 16:
                    return TransferTypeDto.TRANSFER_TYPE_SG_BANK_DEPOSIT;
                case 17:
                    return TransferTypeDto.TRANSFER_TYPE_SG_BANK_WITHDRAWAL;
                case 18:
                    return TransferTypeDto.TRANSFER_TYPE_FX_TRANSFER;
                case 19:
                    return TransferTypeDto.TRANSFER_TYPE_ROLLOVER_ACH;
                case 20:
                    return TransferTypeDto.TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY;
                case 21:
                    return TransferTypeDto.TRANSFER_TYPE_SVB_ACH_TRANSFER;
                case 22:
                    return TransferTypeDto.TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER;
                case 23:
                    return TransferTypeDto.TRANSFER_TYPE_ISA_CASH_TRANSFER;
                case 24:
                    return TransferTypeDto.TRANSFER_TYPE_OUTGOING_CHECK;
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
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/payment_hub/v1/service/TransferTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/payment_hub/v1/service/TransferTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TransferTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TransferTypeDto, TransferType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.payment_hub.v1.service.TransferType", TransferTypeDto.getEntries(), TransferTypeDto.INSTANCE.getZeroValue());

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
