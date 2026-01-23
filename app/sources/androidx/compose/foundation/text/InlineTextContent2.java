package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.p011ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InlineTextContent.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "id", "alternateText", "", "appendInlineContent", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;)V", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.InlineTextContentKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class InlineTextContent2 {
    public static /* synthetic */ void appendInlineContent$default(AnnotatedString.Builder builder, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "�";
        }
        appendInlineContent(builder, str, str2);
    }

    public static final void appendInlineContent(AnnotatedString.Builder builder, String str, String str2) {
        if (!(str2.length() > 0)) {
            InlineClassHelper.throwIllegalArgumentException("alternateText can't be an empty string.");
        }
        builder.pushStringAnnotation("androidx.compose.foundation.text.inlineContent", str);
        builder.append(str2);
        builder.pop();
    }
}
