package com.robinhood.android.pathfinder.corepages.contactemail;

import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactEmailComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "Title", "Subtitle", "EmailAddressInput", "DescriptionInput", "EmailOptionalField", "TimeOptionalField", "DateOptionalField", CreateTransferV2Composable3.ContinueButtonTag, "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailTestTag, reason: use source file name */
/* loaded from: classes11.dex */
public final class ContactEmailComposable4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContactEmailComposable4[] $VALUES;
    public static final ContactEmailComposable4 Title = new ContactEmailComposable4("Title", 0);
    public static final ContactEmailComposable4 Subtitle = new ContactEmailComposable4("Subtitle", 1);
    public static final ContactEmailComposable4 EmailAddressInput = new ContactEmailComposable4("EmailAddressInput", 2);
    public static final ContactEmailComposable4 DescriptionInput = new ContactEmailComposable4("DescriptionInput", 3);
    public static final ContactEmailComposable4 EmailOptionalField = new ContactEmailComposable4("EmailOptionalField", 4);
    public static final ContactEmailComposable4 TimeOptionalField = new ContactEmailComposable4("TimeOptionalField", 5);
    public static final ContactEmailComposable4 DateOptionalField = new ContactEmailComposable4("DateOptionalField", 6);
    public static final ContactEmailComposable4 ContinueButton = new ContactEmailComposable4(CreateTransferV2Composable3.ContinueButtonTag, 7);

    private static final /* synthetic */ ContactEmailComposable4[] $values() {
        return new ContactEmailComposable4[]{Title, Subtitle, EmailAddressInput, DescriptionInput, EmailOptionalField, TimeOptionalField, DateOptionalField, ContinueButton};
    }

    public static EnumEntries<ContactEmailComposable4> getEntries() {
        return $ENTRIES;
    }

    private ContactEmailComposable4(String str, int i) {
    }

    static {
        ContactEmailComposable4[] contactEmailComposable4Arr$values = $values();
        $VALUES = contactEmailComposable4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(contactEmailComposable4Arr$values);
    }

    public static ContactEmailComposable4 valueOf(String str) {
        return (ContactEmailComposable4) Enum.valueOf(ContactEmailComposable4.class, str);
    }

    public static ContactEmailComposable4[] values() {
        return (ContactEmailComposable4[]) $VALUES.clone();
    }
}
