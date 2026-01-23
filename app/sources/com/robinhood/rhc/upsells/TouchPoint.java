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
/* compiled from: TouchPoint.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/TouchPoint;", "", "(Ljava/lang/String;I)V", "CRYPTO_HOME_TAB", "CRYPTO_DETAIL_PAGE", "TRADE_RECEIPT", "REWARD_DEEP_LINK", "LEARN_AND_EARN_COMPLETION", "CRYPTO_TRANSFERS", "Companion", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes26.dex */
public final class TouchPoint {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TouchPoint[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("crypto_home_tab")
    public static final TouchPoint CRYPTO_HOME_TAB = new TouchPoint("CRYPTO_HOME_TAB", 0);

    @SerialName("crypto_detail_page")
    public static final TouchPoint CRYPTO_DETAIL_PAGE = new TouchPoint("CRYPTO_DETAIL_PAGE", 1);

    @SerialName("trade_receipt")
    public static final TouchPoint TRADE_RECEIPT = new TouchPoint("TRADE_RECEIPT", 2);

    @SerialName("reward_deep_link")
    public static final TouchPoint REWARD_DEEP_LINK = new TouchPoint("REWARD_DEEP_LINK", 3);

    @SerialName("learn_and_earn_completion")
    public static final TouchPoint LEARN_AND_EARN_COMPLETION = new TouchPoint("LEARN_AND_EARN_COMPLETION", 4);

    @SerialName("crypto_transfers")
    public static final TouchPoint CRYPTO_TRANSFERS = new TouchPoint("CRYPTO_TRANSFERS", 5);

    private static final /* synthetic */ TouchPoint[] $values() {
        return new TouchPoint[]{CRYPTO_HOME_TAB, CRYPTO_DETAIL_PAGE, TRADE_RECEIPT, REWARD_DEEP_LINK, LEARN_AND_EARN_COMPLETION, CRYPTO_TRANSFERS};
    }

    public static EnumEntries<TouchPoint> getEntries() {
        return $ENTRIES;
    }

    public static TouchPoint valueOf(String str) {
        return (TouchPoint) Enum.valueOf(TouchPoint.class, str);
    }

    public static TouchPoint[] values() {
        return (TouchPoint[]) $VALUES.clone();
    }

    /* compiled from: TouchPoint.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rhc/upsells/TouchPoint$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rhc/upsells/TouchPoint;", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TouchPoint.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TouchPoint> serializer() {
            return get$cachedSerializer();
        }
    }

    private TouchPoint(String str, int i) {
    }

    static {
        TouchPoint[] touchPointArr$values = $values();
        $VALUES = touchPointArr$values;
        $ENTRIES = EnumEntries2.enumEntries(touchPointArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: com.robinhood.rhc.upsells.TouchPoint.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("com.robinhood.rhc.upsells.TouchPoint", TouchPoint.values(), new String[]{"crypto_home_tab", "crypto_detail_page", "trade_receipt", "reward_deep_link", "learn_and_earn_completion", "crypto_transfers"}, new Annotation[][]{null, null, null, null, null, null}, null);
            }
        });
    }
}
