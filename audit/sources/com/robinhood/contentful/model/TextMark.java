package com.robinhood.contentful.model;

import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/contentful/model/TextMark;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "BOLD", "CODE", "ITALIC", "SECONDARY", "UNDERLINE", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TextMark {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextMark[] $VALUES;
    public static final TextMark BOLD = new TextMark("BOLD", 0, "bold");
    public static final TextMark CODE = new TextMark("CODE", 1, "code");
    public static final TextMark ITALIC = new TextMark("ITALIC", 2, "italic");
    public static final TextMark SECONDARY = new TextMark("SECONDARY", 3, InstantRetirementSplashScreen.SecondaryButtonTag);
    public static final TextMark UNDERLINE = new TextMark("UNDERLINE", 4, "underline");
    private final String type;

    private static final /* synthetic */ TextMark[] $values() {
        return new TextMark[]{BOLD, CODE, ITALIC, SECONDARY, UNDERLINE};
    }

    public static EnumEntries<TextMark> getEntries() {
        return $ENTRIES;
    }

    private TextMark(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        TextMark[] textMarkArr$values = $values();
        $VALUES = textMarkArr$values;
        $ENTRIES = EnumEntries2.enumEntries(textMarkArr$values);
    }

    public static TextMark valueOf(String str) {
        return (TextMark) Enum.valueOf(TextMark.class, str);
    }

    public static TextMark[] values() {
        return (TextMark[]) $VALUES.clone();
    }
}
