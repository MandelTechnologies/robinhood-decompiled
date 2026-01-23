package com.robinhood.android.doc.p109ui.persona;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PersonaStartStyle.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartStyle;", "", "<init>", "(Ljava/lang/String;I)V", "PHOTO_ID", "SELFIE", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class PersonaStartStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PersonaStartStyle[] $VALUES;
    public static final PersonaStartStyle PHOTO_ID = new PersonaStartStyle("PHOTO_ID", 0);
    public static final PersonaStartStyle SELFIE = new PersonaStartStyle("SELFIE", 1);

    private static final /* synthetic */ PersonaStartStyle[] $values() {
        return new PersonaStartStyle[]{PHOTO_ID, SELFIE};
    }

    public static EnumEntries<PersonaStartStyle> getEntries() {
        return $ENTRIES;
    }

    private PersonaStartStyle(String str, int i) {
    }

    static {
        PersonaStartStyle[] personaStartStyleArr$values = $values();
        $VALUES = personaStartStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(personaStartStyleArr$values);
    }

    public static PersonaStartStyle valueOf(String str) {
        return (PersonaStartStyle) Enum.valueOf(PersonaStartStyle.class, str);
    }

    public static PersonaStartStyle[] values() {
        return (PersonaStartStyle[]) $VALUES.clone();
    }
}
