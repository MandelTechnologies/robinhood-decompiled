package com.truelayer.payments.core.domain.experience.scheme;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeIcon.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/scheme/SchemeIcon;", "", "(Ljava/lang/String;I)V", "Bolt", "Clock", "Undefined", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SchemeIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SchemeIcon[] $VALUES;
    public static final SchemeIcon Bolt = new SchemeIcon("Bolt", 0);
    public static final SchemeIcon Clock = new SchemeIcon("Clock", 1);
    public static final SchemeIcon Undefined = new SchemeIcon("Undefined", 2);

    private static final /* synthetic */ SchemeIcon[] $values() {
        return new SchemeIcon[]{Bolt, Clock, Undefined};
    }

    public static EnumEntries<SchemeIcon> getEntries() {
        return $ENTRIES;
    }

    public static SchemeIcon valueOf(String str) {
        return (SchemeIcon) Enum.valueOf(SchemeIcon.class, str);
    }

    public static SchemeIcon[] values() {
        return (SchemeIcon[]) $VALUES.clone();
    }

    private SchemeIcon(String str, int i) {
    }

    static {
        SchemeIcon[] schemeIconArr$values = $values();
        $VALUES = schemeIconArr$values;
        $ENTRIES = EnumEntries2.enumEntries(schemeIconArr$values);
    }
}
