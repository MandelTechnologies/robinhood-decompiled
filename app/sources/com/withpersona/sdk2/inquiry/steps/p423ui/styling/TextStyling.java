package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextStyling.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/TextStyleElements;", "", "<init>", "(Ljava/lang/String;I)V", "LineHeight", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.TextStyleElements, reason: use source file name */
/* loaded from: classes18.dex */
public final class TextStyling {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextStyling[] $VALUES;
    public static final TextStyling LineHeight = new TextStyling("LineHeight", 0);

    private static final /* synthetic */ TextStyling[] $values() {
        return new TextStyling[]{LineHeight};
    }

    public static EnumEntries<TextStyling> getEntries() {
        return $ENTRIES;
    }

    private TextStyling(String str, int i) {
    }

    static {
        TextStyling[] textStylingArr$values = $values();
        $VALUES = textStylingArr$values;
        $ENTRIES = EnumEntries2.enumEntries(textStylingArr$values);
    }

    public static TextStyling valueOf(String str) {
        return (TextStyling) Enum.valueOf(TextStyling.class, str);
    }

    public static TextStyling[] values() {
        return (TextStyling[]) $VALUES.clone();
    }
}
