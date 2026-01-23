package com.robinhood.transfers.disclosures.contracts;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/TransferType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "CHECK", "DEBIT_CARD_TRANSFER", "ORIGINATED_ACH", "INSTANT_BANK_TRANSFER", "NON_ORIGINATED_ACH", "NON_ORIGINATED_ACH_EARLY_PAY", "INTER_ENTITY", "INTRA_ENTITY", "INTERNAL_TRANSFER", "INCOMING_WIRE", "OUTGOING_WIRE", "SG_BANK_TRANSFER", "UK_BANK_TRANSFER", "SEPA_CREDIT", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class TransferType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final TransferType UNKNOWN = new TransferType("UNKNOWN", 0, "unknown");
    public static final TransferType CHECK = new TransferType("CHECK", 1, "check");
    public static final TransferType DEBIT_CARD_TRANSFER = new TransferType("DEBIT_CARD_TRANSFER", 2, "debit_card_funding");
    public static final TransferType ORIGINATED_ACH = new TransferType("ORIGINATED_ACH", 3, "originated_ach");
    public static final TransferType INSTANT_BANK_TRANSFER = new TransferType("INSTANT_BANK_TRANSFER", 4, "instant_bank_transfer");
    public static final TransferType NON_ORIGINATED_ACH = new TransferType("NON_ORIGINATED_ACH", 5, "non_originated_ach");
    public static final TransferType NON_ORIGINATED_ACH_EARLY_PAY = new TransferType("NON_ORIGINATED_ACH_EARLY_PAY", 6, "non_originated_ach_early_pay");
    public static final TransferType INTER_ENTITY = new TransferType("INTER_ENTITY", 7, "inter_entity");
    public static final TransferType INTRA_ENTITY = new TransferType("INTRA_ENTITY", 8, "intra_entity");
    public static final TransferType INTERNAL_TRANSFER = new TransferType("INTERNAL_TRANSFER", 9, "internal");
    public static final TransferType INCOMING_WIRE = new TransferType("INCOMING_WIRE", 10, "incoming_wire");
    public static final TransferType OUTGOING_WIRE = new TransferType("OUTGOING_WIRE", 11, "outgoing_wire");
    public static final TransferType SG_BANK_TRANSFER = new TransferType("SG_BANK_TRANSFER", 12, "sg_bank_transfer");
    public static final TransferType UK_BANK_TRANSFER = new TransferType("UK_BANK_TRANSFER", 13, "uk_bank_transfer");
    public static final TransferType SEPA_CREDIT = new TransferType("SEPA_CREDIT", 14, "sepa_credit");

    private static final /* synthetic */ TransferType[] $values() {
        return new TransferType[]{UNKNOWN, CHECK, DEBIT_CARD_TRANSFER, ORIGINATED_ACH, INSTANT_BANK_TRANSFER, NON_ORIGINATED_ACH, NON_ORIGINATED_ACH_EARLY_PAY, INTER_ENTITY, INTRA_ENTITY, INTERNAL_TRANSFER, INCOMING_WIRE, OUTGOING_WIRE, SG_BANK_TRANSFER, UK_BANK_TRANSFER, SEPA_CREDIT};
    }

    public static EnumEntries<TransferType> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: TransferType.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/TransferType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/TransferType;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TransferType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransferType> serializer() {
            return get$cachedSerializer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return Enums4.createSimpleEnumSerializer("com.robinhood.transfers.disclosures.contracts.TransferType", values());
    }

    private TransferType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        TransferType[] transferTypeArr$values = $values();
        $VALUES = transferTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.transfers.disclosures.contracts.TransferType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferType._init_$_anonymous_();
            }
        });
    }

    public static TransferType valueOf(String str) {
        return (TransferType) Enum.valueOf(TransferType.class, str);
    }

    public static TransferType[] values() {
        return (TransferType[]) $VALUES.clone();
    }
}
