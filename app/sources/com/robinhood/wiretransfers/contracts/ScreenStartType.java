package com.robinhood.wiretransfers.contracts;

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
/* compiled from: ScreenStartType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/ScreenStartType;", "", "(Ljava/lang/String;I)V", "VAN_DETAILS", "SCAM_PREVENTION_DETAILS", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes12.dex */
public final class ScreenStartType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenStartType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ScreenStartType VAN_DETAILS = new ScreenStartType("VAN_DETAILS", 0);
    public static final ScreenStartType SCAM_PREVENTION_DETAILS = new ScreenStartType("SCAM_PREVENTION_DETAILS", 1);

    private static final /* synthetic */ ScreenStartType[] $values() {
        return new ScreenStartType[]{VAN_DETAILS, SCAM_PREVENTION_DETAILS};
    }

    public static EnumEntries<ScreenStartType> getEntries() {
        return $ENTRIES;
    }

    public static ScreenStartType valueOf(String str) {
        return (ScreenStartType) Enum.valueOf(ScreenStartType.class, str);
    }

    public static ScreenStartType[] values() {
        return (ScreenStartType[]) $VALUES.clone();
    }

    /* compiled from: ScreenStartType.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/wiretransfers/contracts/ScreenStartType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/wiretransfers/contracts/ScreenStartType;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ScreenStartType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ScreenStartType> serializer() {
            return get$cachedSerializer();
        }
    }

    private ScreenStartType(String str, int i) {
    }

    static {
        ScreenStartType[] screenStartTypeArr$values = $values();
        $VALUES = screenStartTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(screenStartTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.wiretransfers.contracts.ScreenStartType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createSimpleEnumSerializer("com.robinhood.wiretransfers.contracts.ScreenStartType", ScreenStartType.values());
            }
        });
    }
}
