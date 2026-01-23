package com.withpersona.sdk2.inquiry.governmentid;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdIcon.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "", "<init>", "(Ljava/lang/String;I)V", "World", "Card", "Flag", "House", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class IdIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IdIcon[] $VALUES;
    public static final IdIcon World = new IdIcon("World", 0);
    public static final IdIcon Card = new IdIcon("Card", 1);
    public static final IdIcon Flag = new IdIcon("Flag", 2);
    public static final IdIcon House = new IdIcon("House", 3);

    private static final /* synthetic */ IdIcon[] $values() {
        return new IdIcon[]{World, Card, Flag, House};
    }

    public static EnumEntries<IdIcon> getEntries() {
        return $ENTRIES;
    }

    private IdIcon(String str, int i) {
    }

    static {
        IdIcon[] idIconArr$values = $values();
        $VALUES = idIconArr$values;
        $ENTRIES = EnumEntries2.enumEntries(idIconArr$values);
    }

    public static IdIcon valueOf(String str) {
        return (IdIcon) Enum.valueOf(IdIcon.class, str);
    }

    public static IdIcon[] values() {
        return (IdIcon[]) $VALUES.clone();
    }
}
