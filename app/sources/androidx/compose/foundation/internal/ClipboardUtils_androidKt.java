package androidx.compose.foundation.internal;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClipboardUtils.android.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/ui/platform/ClipEntry;", "Landroidx/compose/ui/text/AnnotatedString;", "readAnnotatedString", "(Landroidx/compose/ui/platform/ClipEntry;)Landroidx/compose/ui/text/AnnotatedString;", "toClipEntry", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/platform/ClipEntry;", "", "hasText", "(Landroidx/compose/ui/platform/ClipEntry;)Z", "", "convertToCharSequence", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/CharSequence;", "convertToAnnotatedString", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ClipboardUtils_androidKt {
    public static final AnnotatedString readAnnotatedString(ClipEntry clipEntry) {
        return ClipboardUtils.readAnnotatedString(clipEntry);
    }

    public static final ClipEntry toClipEntry(AnnotatedString annotatedString) {
        return ClipboardUtils.toClipEntry(annotatedString);
    }

    public static final boolean hasText(ClipEntry clipEntry) {
        return ClipboardUtils.hasText(clipEntry);
    }

    public static final CharSequence convertToCharSequence(AnnotatedString annotatedString) {
        if (annotatedString.getSpanStyles().isEmpty()) {
            return annotatedString.getText();
        }
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        EncodeHelper encodeHelper = new EncodeHelper();
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i);
            SpanStyle spanStyleComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            encodeHelper.reset();
            encodeHelper.encode(spanStyleComponent1);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper.encodedString()), start, end, 33);
        }
        return spannableString;
    }

    public static final AnnotatedString convertToAnnotatedString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int lastIndex = ArraysKt.getLastIndex(annotationArr);
        if (lastIndex >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i];
                if (Intrinsics.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AnnotatedString.Range(new DecodeHelper(annotation.getValue()).decodeSpanStyle(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }
}
