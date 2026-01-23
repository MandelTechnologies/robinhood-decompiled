package com.robinhood.transfers.disclosures.contracts;

import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreateTransferState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/TransferFrequency;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "ONCE", "WEEKLY", "BIWEEKLY", "MONTHLY", "QUARTERLY", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* renamed from: com.robinhood.transfers.disclosures.contracts.TransferFrequency, reason: use source file name */
/* loaded from: classes12.dex */
public final class CreateTransferState6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CreateTransferState6[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final CreateTransferState6 BIWEEKLY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CreateTransferState6 MONTHLY;
    public static final CreateTransferState6 ONCE;
    public static final CreateTransferState6 QUARTERLY;
    public static final CreateTransferState6 WEEKLY;
    private static final Set<CreateTransferState6> recurringFrequencySet;
    private final String serverValue;

    private static final /* synthetic */ CreateTransferState6[] $values() {
        return new CreateTransferState6[]{ONCE, WEEKLY, BIWEEKLY, MONTHLY, QUARTERLY};
    }

    public static EnumEntries<CreateTransferState6> getEntries() {
        return $ENTRIES;
    }

    private CreateTransferState6(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        CreateTransferState6 createTransferState6 = new CreateTransferState6("ONCE", 0, "once");
        ONCE = createTransferState6;
        WEEKLY = new CreateTransferState6("WEEKLY", 1, "weekly");
        BIWEEKLY = new CreateTransferState6("BIWEEKLY", 2, "biweekly");
        MONTHLY = new CreateTransferState6("MONTHLY", 3, "monthly");
        QUARTERLY = new CreateTransferState6("QUARTERLY", 4, "quarterly");
        CreateTransferState6[] createTransferState6Arr$values = $values();
        $VALUES = createTransferState6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(createTransferState6Arr$values);
        INSTANCE = new Companion(null);
        recurringFrequencySet = SetsKt.minus((Set<? extends CreateTransferState6>) CollectionsKt.toSet(getEntries()), createTransferState6);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.transfers.disclosures.contracts.TransferFrequency$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferState6._init_$_anonymous_();
            }
        });
    }

    /* compiled from: CreateTransferState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/TransferFrequency$Companion;", "", "<init>", "()V", "recurringFrequencySet", "", "Lcom/robinhood/transfers/disclosures/contracts/TransferFrequency;", "getRecurringFrequencySet", "()Ljava/util/Set;", "serializer", "Lkotlinx/serialization/KSerializer;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.transfers.disclosures.contracts.TransferFrequency$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CreateTransferState6.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CreateTransferState6> serializer() {
            return get$cachedSerializer();
        }

        public final Set<CreateTransferState6> getRecurringFrequencySet() {
            return CreateTransferState6.recurringFrequencySet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return Enums4.createSimpleEnumSerializer("com.robinhood.transfers.disclosures.contracts.TransferFrequency", values());
    }

    public static CreateTransferState6 valueOf(String str) {
        return (CreateTransferState6) Enum.valueOf(CreateTransferState6.class, str);
    }

    public static CreateTransferState6[] values() {
        return (CreateTransferState6[]) $VALUES.clone();
    }
}
