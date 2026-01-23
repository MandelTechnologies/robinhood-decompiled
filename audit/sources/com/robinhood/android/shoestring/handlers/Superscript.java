package com.robinhood.android.shoestring.handlers;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Superscript.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/shoestring/handlers/Superscript;", "Lcom/robinhood/android/shoestring/handlers/SimpleSpanStyleTagHandler;", ResourceTypes.STYLE, "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Landroidx/compose/ui/text/TextStyle;)V", "equals", "", "other", "", "hashCode", "", "Companion", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class Superscript extends SimpleSpanStyleTagHandler {
    private static final String DEFAULT_TAG_TEXT = "superscript";
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public Superscript(TextStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        float fM7835getSuperscripty9eOQZs = BaselineShift.INSTANCE.m7835getSuperscripty9eOQZs();
        long jM7662getFontSizeXSAIIZE = style.m7662getFontSizeXSAIIZE();
        TextUnit2.m8082checkArithmeticR2X_6o(jM7662getFontSizeXSAIIZE);
        super(DEFAULT_TAG_TEXT, TextStyle.m7655copyp1EtxEg$default(style, 0L, TextUnit2.pack(TextUnit.m8072getRawTypeimpl(jM7662getFontSizeXSAIIZE), (float) (TextUnit.m8074getValueimpl(jM7662getFontSizeXSAIIZE) * 0.6d)), null, null, null, null, null, 0L, BaselineShift.m7827boximpl(fM7835getSuperscripty9eOQZs), null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16776957, null).toSpanStyle());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return Intrinsics.areEqual(Superscript.class, other != null ? other.getClass() : null);
    }

    public int hashCode() {
        return Superscript.class.hashCode();
    }
}
