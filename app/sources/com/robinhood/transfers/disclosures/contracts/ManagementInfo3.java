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
/* compiled from: ManagementInfo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/ManagementType;", "", "<init>", "(Ljava/lang/String;I)V", "MANAGED", "SELF_DIRECTED", "UNKNOWN", "Companion", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@Serializable
/* renamed from: com.robinhood.transfers.disclosures.contracts.ManagementType, reason: use source file name */
/* loaded from: classes12.dex */
public final class ManagementInfo3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ManagementInfo3[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ManagementInfo3 MANAGED = new ManagementInfo3("MANAGED", 0);
    public static final ManagementInfo3 SELF_DIRECTED = new ManagementInfo3("SELF_DIRECTED", 1);
    public static final ManagementInfo3 UNKNOWN = new ManagementInfo3("UNKNOWN", 2);

    private static final /* synthetic */ ManagementInfo3[] $values() {
        return new ManagementInfo3[]{MANAGED, SELF_DIRECTED, UNKNOWN};
    }

    public static EnumEntries<ManagementInfo3> getEntries() {
        return $ENTRIES;
    }

    /* compiled from: ManagementInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/transfers/disclosures/contracts/ManagementType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/transfers/disclosures/contracts/ManagementType;", "contracts"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.transfers.disclosures.contracts.ManagementType$Companion, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ManagementInfo3.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ManagementInfo3> serializer() {
            return get$cachedSerializer();
        }
    }

    private ManagementInfo3(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return Enums4.createSimpleEnumSerializer("com.robinhood.transfers.disclosures.contracts.ManagementType", values());
    }

    static {
        ManagementInfo3[] managementInfo3Arr$values = $values();
        $VALUES = managementInfo3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(managementInfo3Arr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.transfers.disclosures.contracts.ManagementType$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManagementInfo3._init_$_anonymous_();
            }
        });
    }

    public static ManagementInfo3 valueOf(String str) {
        return (ManagementInfo3) Enum.valueOf(ManagementInfo3.class, str);
    }

    public static ManagementInfo3[] values() {
        return (ManagementInfo3[]) $VALUES.clone();
    }
}
