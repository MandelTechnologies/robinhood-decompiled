package com.robinhood.android.pathfinder.corepages.contactchannel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactChannelComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "Title", "Banner", "ChannelRow", "Disclosure", "Loading", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelTestTag, reason: use source file name */
/* loaded from: classes11.dex */
public final class ContactChannelComposable3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContactChannelComposable3[] $VALUES;
    public static final ContactChannelComposable3 Title = new ContactChannelComposable3("Title", 0);
    public static final ContactChannelComposable3 Banner = new ContactChannelComposable3("Banner", 1);
    public static final ContactChannelComposable3 ChannelRow = new ContactChannelComposable3("ChannelRow", 2);
    public static final ContactChannelComposable3 Disclosure = new ContactChannelComposable3("Disclosure", 3);
    public static final ContactChannelComposable3 Loading = new ContactChannelComposable3("Loading", 4);

    private static final /* synthetic */ ContactChannelComposable3[] $values() {
        return new ContactChannelComposable3[]{Title, Banner, ChannelRow, Disclosure, Loading};
    }

    public static EnumEntries<ContactChannelComposable3> getEntries() {
        return $ENTRIES;
    }

    private ContactChannelComposable3(String str, int i) {
    }

    static {
        ContactChannelComposable3[] contactChannelComposable3Arr$values = $values();
        $VALUES = contactChannelComposable3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(contactChannelComposable3Arr$values);
    }

    public static ContactChannelComposable3 valueOf(String str) {
        return (ContactChannelComposable3) Enum.valueOf(ContactChannelComposable3.class, str);
    }

    public static ContactChannelComposable3[] values() {
        return (ContactChannelComposable3[]) $VALUES.clone();
    }
}
