package com.truelayer.payments.analytics.utils;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResourceType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/analytics/utils/ResourceType;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "PAYMENT", "MANDATE", "payments-analytics_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ResourceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResourceType[] $VALUES;
    private final String key;
    public static final ResourceType PAYMENT = new ResourceType("PAYMENT", 0, Card.Icon.PAYMENT);
    public static final ResourceType MANDATE = new ResourceType("MANDATE", 1, "mandate");

    private static final /* synthetic */ ResourceType[] $values() {
        return new ResourceType[]{PAYMENT, MANDATE};
    }

    public static EnumEntries<ResourceType> getEntries() {
        return $ENTRIES;
    }

    public static ResourceType valueOf(String str) {
        return (ResourceType) Enum.valueOf(ResourceType.class, str);
    }

    public static ResourceType[] values() {
        return (ResourceType[]) $VALUES.clone();
    }

    private ResourceType(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        ResourceType[] resourceTypeArr$values = $values();
        $VALUES = resourceTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(resourceTypeArr$values);
    }
}
