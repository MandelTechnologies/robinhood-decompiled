package com.plaid.link.configuration;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/plaid/link/configuration/LinkLogLevel;", "", "(Ljava/lang/String;I)V", "ASSERT", "DEBUG", "ERROR", "INFO", "VERBOSE", "WARN", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class LinkLogLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkLogLevel[] $VALUES;
    public static final LinkLogLevel ASSERT = new LinkLogLevel("ASSERT", 0);
    public static final LinkLogLevel DEBUG = new LinkLogLevel("DEBUG", 1);
    public static final LinkLogLevel ERROR = new LinkLogLevel("ERROR", 2);
    public static final LinkLogLevel INFO = new LinkLogLevel("INFO", 3);
    public static final LinkLogLevel VERBOSE = new LinkLogLevel("VERBOSE", 4);
    public static final LinkLogLevel WARN = new LinkLogLevel("WARN", 5);

    private static final /* synthetic */ LinkLogLevel[] $values() {
        return new LinkLogLevel[]{ASSERT, DEBUG, ERROR, INFO, VERBOSE, WARN};
    }

    static {
        LinkLogLevel[] linkLogLevelArr$values = $values();
        $VALUES = linkLogLevelArr$values;
        $ENTRIES = EnumEntries2.enumEntries(linkLogLevelArr$values);
    }

    private LinkLogLevel(String str, int i) {
    }

    public static EnumEntries<LinkLogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LinkLogLevel valueOf(String str) {
        return (LinkLogLevel) Enum.valueOf(LinkLogLevel.class, str);
    }

    public static LinkLogLevel[] values() {
        return (LinkLogLevel[]) $VALUES.clone();
    }
}
