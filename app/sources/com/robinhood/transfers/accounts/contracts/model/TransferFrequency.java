package com.robinhood.transfers.accounts.contracts.model;

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
/* compiled from: TransferFrequency.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/model/TransferFrequency;", "", "<init>", "(Ljava/lang/String;I)V", "ONCE", "WEEKLY", "BIWEEKLY", "MONTHLY", "QUARTERLY", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class TransferFrequency {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferFrequency[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferFrequency ONCE = new TransferFrequency("ONCE", 0);
    public static final TransferFrequency WEEKLY = new TransferFrequency("WEEKLY", 1);
    public static final TransferFrequency BIWEEKLY = new TransferFrequency("BIWEEKLY", 2);
    public static final TransferFrequency MONTHLY = new TransferFrequency("MONTHLY", 3);
    public static final TransferFrequency QUARTERLY = new TransferFrequency("QUARTERLY", 4);

    private static final /* synthetic */ TransferFrequency[] $values() {
        return new TransferFrequency[]{ONCE, WEEKLY, BIWEEKLY, MONTHLY, QUARTERLY};
    }

    public static EnumEntries<TransferFrequency> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: TransferFrequency.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/accounts/contracts/model/TransferFrequency$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/accounts/contracts/model/TransferFrequency;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TransferFrequency.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransferFrequency> serializer() {
            return get$cachedSerializer();
        }
    }

    private TransferFrequency(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return Enums4.createSimpleEnumSerializer("com.robinhood.transfers.accounts.contracts.model.TransferFrequency", values());
    }

    static {
        TransferFrequency[] transferFrequencyArr$values = $values();
        $VALUES = transferFrequencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferFrequencyArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.transfers.accounts.contracts.model.TransferFrequency$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFrequency._init_$_anonymous_();
            }
        });
    }

    public static TransferFrequency valueOf(String str) {
        return (TransferFrequency) Enum.valueOf(TransferFrequency.class, str);
    }

    public static TransferFrequency[] values() {
        return (TransferFrequency[]) $VALUES.clone();
    }
}
