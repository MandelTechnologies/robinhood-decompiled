package com.robinhood.transfers.hub.contracts;

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
/* compiled from: TransferHubItemClickIdentifier.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;", "", "<init>", "(Ljava/lang/String;I)V", "DEPOSIT", "WITHDRAWAL", "TRANSFER", "RECURRING_DEPOSITS", "DIRECT_DEPOSITS", "RETIREMENT_ACCOUNT_TRANSFER", "TRANSFER_ACCOUNT", "WIRE_TRANSFER", "MOVE_MONEY", "LIMITS_HUB", "TRANSFER_CRYPTO", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class TransferHubItemClickIdentifier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferHubItemClickIdentifier[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferHubItemClickIdentifier DEPOSIT = new TransferHubItemClickIdentifier("DEPOSIT", 0);
    public static final TransferHubItemClickIdentifier WITHDRAWAL = new TransferHubItemClickIdentifier("WITHDRAWAL", 1);
    public static final TransferHubItemClickIdentifier TRANSFER = new TransferHubItemClickIdentifier("TRANSFER", 2);
    public static final TransferHubItemClickIdentifier RECURRING_DEPOSITS = new TransferHubItemClickIdentifier("RECURRING_DEPOSITS", 3);
    public static final TransferHubItemClickIdentifier DIRECT_DEPOSITS = new TransferHubItemClickIdentifier("DIRECT_DEPOSITS", 4);
    public static final TransferHubItemClickIdentifier RETIREMENT_ACCOUNT_TRANSFER = new TransferHubItemClickIdentifier("RETIREMENT_ACCOUNT_TRANSFER", 5);
    public static final TransferHubItemClickIdentifier TRANSFER_ACCOUNT = new TransferHubItemClickIdentifier("TRANSFER_ACCOUNT", 6);
    public static final TransferHubItemClickIdentifier WIRE_TRANSFER = new TransferHubItemClickIdentifier("WIRE_TRANSFER", 7);
    public static final TransferHubItemClickIdentifier MOVE_MONEY = new TransferHubItemClickIdentifier("MOVE_MONEY", 8);
    public static final TransferHubItemClickIdentifier LIMITS_HUB = new TransferHubItemClickIdentifier("LIMITS_HUB", 9);
    public static final TransferHubItemClickIdentifier TRANSFER_CRYPTO = new TransferHubItemClickIdentifier("TRANSFER_CRYPTO", 10);

    private static final /* synthetic */ TransferHubItemClickIdentifier[] $values() {
        return new TransferHubItemClickIdentifier[]{DEPOSIT, WITHDRAWAL, TRANSFER, RECURRING_DEPOSITS, DIRECT_DEPOSITS, RETIREMENT_ACCOUNT_TRANSFER, TRANSFER_ACCOUNT, WIRE_TRANSFER, MOVE_MONEY, LIMITS_HUB, TRANSFER_CRYPTO};
    }

    public static EnumEntries<TransferHubItemClickIdentifier> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: TransferHubItemClickIdentifier.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/hub/contracts/TransferHubItemClickIdentifier;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TransferHubItemClickIdentifier.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransferHubItemClickIdentifier> serializer() {
            return get$cachedSerializer();
        }
    }

    private TransferHubItemClickIdentifier(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return Enums4.createSimpleEnumSerializer("com.robinhood.transfers.hub.contracts.TransferHubItemClickIdentifier", values());
    }

    static {
        TransferHubItemClickIdentifier[] transferHubItemClickIdentifierArr$values = $values();
        $VALUES = transferHubItemClickIdentifierArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferHubItemClickIdentifierArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.transfers.hub.contracts.TransferHubItemClickIdentifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferHubItemClickIdentifier._init_$_anonymous_();
            }
        });
    }

    public static TransferHubItemClickIdentifier valueOf(String str) {
        return (TransferHubItemClickIdentifier) Enum.valueOf(TransferHubItemClickIdentifier.class, str);
    }

    public static TransferHubItemClickIdentifier[] values() {
        return (TransferHubItemClickIdentifier[]) $VALUES.clone();
    }
}
