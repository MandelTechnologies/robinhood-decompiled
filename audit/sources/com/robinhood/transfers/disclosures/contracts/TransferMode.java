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
/* compiled from: TransferMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/TransferMode;", "", "<init>", "(Ljava/lang/String;I)V", "EDIT", "REVIEW", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class TransferMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferMode[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferMode EDIT = new TransferMode("EDIT", 0);
    public static final TransferMode REVIEW = new TransferMode("REVIEW", 1);

    private static final /* synthetic */ TransferMode[] $values() {
        return new TransferMode[]{EDIT, REVIEW};
    }

    public static EnumEntries<TransferMode> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: TransferMode.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/TransferMode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/TransferMode;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TransferMode.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransferMode> serializer() {
            return get$cachedSerializer();
        }
    }

    private TransferMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return Enums4.createSimpleEnumSerializer("com.robinhood.transfers.disclosures.contracts.TransferMode", values());
    }

    static {
        TransferMode[] transferModeArr$values = $values();
        $VALUES = transferModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferModeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.transfers.disclosures.contracts.TransferMode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferMode._init_$_anonymous_();
            }
        });
    }

    public static TransferMode valueOf(String str) {
        return (TransferMode) Enum.valueOf(TransferMode.class, str);
    }

    public static TransferMode[] values() {
        return (TransferMode[]) $VALUES.clone();
    }
}
