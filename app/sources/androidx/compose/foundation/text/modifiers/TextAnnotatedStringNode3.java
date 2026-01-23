package androidx.compose.foundation.text.modifiers;

import androidx.compose.p011ui.text.AnnotatedString;
import kotlin.Metadata;

/* compiled from: TextAnnotatedStringNode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"hasLinks", "", "Landroidx/compose/ui/text/AnnotatedString;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class TextAnnotatedStringNode3 {
    public static final boolean hasLinks(AnnotatedString annotatedString) {
        return annotatedString.hasLinkAnnotations(0, annotatedString.length());
    }
}
