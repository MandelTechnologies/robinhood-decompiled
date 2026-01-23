package com.robinhood.compose.bento.component;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BentoAppBar.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/AppBarType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CENTER_ALIGNED", "MEDIUM", "LARGE", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class AppBarType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppBarType[] $VALUES;
    public static final AppBarType DEFAULT = new AppBarType("DEFAULT", 0);
    public static final AppBarType CENTER_ALIGNED = new AppBarType("CENTER_ALIGNED", 1);
    public static final AppBarType MEDIUM = new AppBarType("MEDIUM", 2);
    public static final AppBarType LARGE = new AppBarType("LARGE", 3);

    private static final /* synthetic */ AppBarType[] $values() {
        return new AppBarType[]{DEFAULT, CENTER_ALIGNED, MEDIUM, LARGE};
    }

    public static EnumEntries<AppBarType> getEntries() {
        return $ENTRIES;
    }

    private AppBarType(String str, int i) {
    }

    static {
        AppBarType[] appBarTypeArr$values = $values();
        $VALUES = appBarTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(appBarTypeArr$values);
    }

    public static AppBarType valueOf(String str) {
        return (AppBarType) Enum.valueOf(AppBarType.class, str);
    }

    public static AppBarType[] values() {
        return (AppBarType[]) $VALUES.clone();
    }
}
