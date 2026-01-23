package com.robinhood.transfers.api;

import com.robinhood.enums.RhEnum;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferType.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/transfers/api/TransferType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "historyTransactionType", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;)V", "getServerValue", "()Ljava/lang/String;", "getHistoryTransactionType", "()Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "UNKNOWN", "CHECK", "DEBIT_CARD_TRANSFER", "ORIGINATED_ACH", "INSTANT_BANK_TRANSFER", "NON_ORIGINATED_ACH", "NON_ORIGINATED_ACH_EARLY_PAY", "INTER_ENTITY", "INTRA_ENTITY", "INTERNAL", "INCOMING_WIRE", "OUTGOING_WIRE", "UK_BANK_TRANSFER", "UK_OPEN_BANKING_TRANSFER", "ROLLOVER_ACH", "SEPA_CREDIT", "SG_BANK_WITHDRAWAL", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TransferType implements RhEnum<TransferType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferType INCOMING_WIRE;
    public static final TransferType INTERNAL;
    public static final TransferType INTER_ENTITY;
    public static final TransferType INTRA_ENTITY;
    public static final TransferType NON_ORIGINATED_ACH;
    public static final TransferType NON_ORIGINATED_ACH_EARLY_PAY;
    public static final TransferType OUTGOING_WIRE;
    public static final TransferType ROLLOVER_ACH;
    public static final TransferType SEPA_CREDIT;
    public static final TransferType SG_BANK_WITHDRAWAL;
    public static final TransferType UK_BANK_TRANSFER;
    public static final TransferType UK_OPEN_BANKING_TRANSFER;
    private final HistoryTransactionType historyTransactionType;
    private final String serverValue;
    public static final TransferType UNKNOWN = new TransferType("UNKNOWN", 0, "unknown", HistoryTransactionType.UNKNOWN);
    public static final TransferType CHECK = new TransferType("CHECK", 1, "check", HistoryTransactionType.CHECK_TRANSFER);
    public static final TransferType DEBIT_CARD_TRANSFER = new TransferType("DEBIT_CARD_TRANSFER", 2, "debit_card_funding", HistoryTransactionType.DEBIT_CARD_TRANSFER);
    public static final TransferType ORIGINATED_ACH = new TransferType("ORIGINATED_ACH", 3, "originated_ach", HistoryTransactionType.RHY_ORIGINATED_ACH_TRANSFER);
    public static final TransferType INSTANT_BANK_TRANSFER = new TransferType("INSTANT_BANK_TRANSFER", 4, "instant_bank_transfer", HistoryTransactionType.INSTANT_BANK_TRANSFER);

    private static final /* synthetic */ TransferType[] $values() {
        return new TransferType[]{UNKNOWN, CHECK, DEBIT_CARD_TRANSFER, ORIGINATED_ACH, INSTANT_BANK_TRANSFER, NON_ORIGINATED_ACH, NON_ORIGINATED_ACH_EARLY_PAY, INTER_ENTITY, INTRA_ENTITY, INTERNAL, INCOMING_WIRE, OUTGOING_WIRE, UK_BANK_TRANSFER, UK_OPEN_BANKING_TRANSFER, ROLLOVER_ACH, SEPA_CREDIT, SG_BANK_WITHDRAWAL};
    }

    @JvmStatic
    public static TransferType fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<TransferType> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(TransferType transferType) {
        return INSTANCE.toServerValue(transferType);
    }

    private TransferType(String str, int i, String str2, HistoryTransactionType historyTransactionType) {
        this.serverValue = str2;
        this.historyTransactionType = historyTransactionType;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    public final HistoryTransactionType getHistoryTransactionType() {
        return this.historyTransactionType;
    }

    static {
        HistoryTransactionType historyTransactionType = HistoryTransactionType.RHY_NON_ORIGINATED_ACH_TRANSFER;
        NON_ORIGINATED_ACH = new TransferType("NON_ORIGINATED_ACH", 5, "non_originated_ach", historyTransactionType);
        NON_ORIGINATED_ACH_EARLY_PAY = new TransferType("NON_ORIGINATED_ACH_EARLY_PAY", 6, "non_originated_ach_early_pay", historyTransactionType);
        HistoryTransactionType historyTransactionType2 = HistoryTransactionType.RHY_INTER_ENTITY_TRANSFER;
        INTER_ENTITY = new TransferType("INTER_ENTITY", 7, "inter_entity", historyTransactionType2);
        INTRA_ENTITY = new TransferType("INTRA_ENTITY", 8, "intra_entity", historyTransactionType2);
        INTERNAL = new TransferType("INTERNAL", 9, "internal", HistoryTransactionType.INTERNAL_TRANSFER);
        INCOMING_WIRE = new TransferType("INCOMING_WIRE", 10, "incoming_wire", HistoryTransactionType.INCOMING_WIRE);
        OUTGOING_WIRE = new TransferType("OUTGOING_WIRE", 11, "outgoing_wire", HistoryTransactionType.OUTGOING_WIRE);
        UK_BANK_TRANSFER = new TransferType("UK_BANK_TRANSFER", 12, "uk_bank_transfer", HistoryTransactionType.UK_BANK_TRANSFER);
        UK_OPEN_BANKING_TRANSFER = new TransferType("UK_OPEN_BANKING_TRANSFER", 13, "uk_open_banking_transfer", HistoryTransactionType.UK_OPEN_BANKING_TRANSFER);
        ROLLOVER_ACH = new TransferType("ROLLOVER_ACH", 14, "rollover_ach", HistoryTransactionType.ROLLOVER_ACH);
        SEPA_CREDIT = new TransferType("SEPA_CREDIT", 15, "sepa_credit", HistoryTransactionType.SEPA_CREDIT);
        SG_BANK_WITHDRAWAL = new TransferType("SG_BANK_WITHDRAWAL", 16, "sg_bank_withdrawal", HistoryTransactionType.SG_BANK_TRANSFER);
        TransferType[] transferTypeArr$values = $values();
        $VALUES = transferTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: TransferType.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/api/TransferType$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/transfers/api/TransferType;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<TransferType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(TransferType.values(), TransferType.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(TransferType enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public TransferType fromServerValue(String serverValue) {
            return (TransferType) super.fromServerValue(serverValue);
        }
    }

    public static TransferType valueOf(String str) {
        return (TransferType) Enum.valueOf(TransferType.class, str);
    }

    public static TransferType[] values() {
        return (TransferType[]) $VALUES.clone();
    }
}
