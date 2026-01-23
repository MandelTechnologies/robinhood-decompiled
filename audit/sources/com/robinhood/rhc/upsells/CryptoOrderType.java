package com.robinhood.rhc.upsells;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoOrderType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/CryptoOrderType;", "", "(Ljava/lang/String;I)V", "MARKET", "LIMIT", "STOP_LOSS", "STOP_LIMIT", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes26.dex */
public final class CryptoOrderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoOrderType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("market")
    public static final CryptoOrderType MARKET = new CryptoOrderType("MARKET", 0);

    @SerialName("limit")
    public static final CryptoOrderType LIMIT = new CryptoOrderType("LIMIT", 1);

    @SerialName("stop_loss")
    public static final CryptoOrderType STOP_LOSS = new CryptoOrderType("STOP_LOSS", 2);

    @SerialName("stop_limit")
    public static final CryptoOrderType STOP_LIMIT = new CryptoOrderType("STOP_LIMIT", 3);

    private static final /* synthetic */ CryptoOrderType[] $values() {
        return new CryptoOrderType[]{MARKET, LIMIT, STOP_LOSS, STOP_LIMIT};
    }

    public static EnumEntries<CryptoOrderType> getEntries() {
        return $ENTRIES;
    }

    public static CryptoOrderType valueOf(String str) {
        return (CryptoOrderType) Enum.valueOf(CryptoOrderType.class, str);
    }

    public static CryptoOrderType[] values() {
        return (CryptoOrderType[]) $VALUES.clone();
    }

    /* compiled from: CryptoOrderType.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/CryptoOrderType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/CryptoOrderType;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CryptoOrderType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CryptoOrderType> serializer() {
            return get$cachedSerializer();
        }
    }

    private CryptoOrderType(String str, int i) {
    }

    static {
        CryptoOrderType[] cryptoOrderTypeArr$values = $values();
        $VALUES = cryptoOrderTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoOrderTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.rhc.upsells.CryptoOrderType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("com.robinhood.rhc.upsells.CryptoOrderType", CryptoOrderType.values(), new String[]{"market", "limit", "stop_loss", "stop_limit"}, new Annotation[][]{null, null, null, null}, null);
            }
        });
    }
}
