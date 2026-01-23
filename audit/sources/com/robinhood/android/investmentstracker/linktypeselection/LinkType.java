package com.robinhood.android.investmentstracker.linktypeselection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/linktypeselection/LinkType;", "", "<init>", "(Ljava/lang/String;I)V", "INVESTMENTS", "BANK", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LinkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkType[] $VALUES;
    public static final LinkType INVESTMENTS = new LinkType("INVESTMENTS", 0);
    public static final LinkType BANK = new LinkType("BANK", 1);

    private static final /* synthetic */ LinkType[] $values() {
        return new LinkType[]{INVESTMENTS, BANK};
    }

    public static EnumEntries<LinkType> getEntries() {
        return $ENTRIES;
    }

    private LinkType(String str, int i) {
    }

    static {
        LinkType[] linkTypeArr$values = $values();
        $VALUES = linkTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(linkTypeArr$values);
    }

    public static LinkType valueOf(String str) {
        return (LinkType) Enum.valueOf(LinkType.class, str);
    }

    public static LinkType[] values() {
        return (LinkType[]) $VALUES.clone();
    }
}
