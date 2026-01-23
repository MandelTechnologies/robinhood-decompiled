package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.internal.InlineClassHelper5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, m3636d2 = {"getLocalPlaceholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "start", "", "end", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.text.MultiParagraphIntrinsicsKt, reason: use source file name */
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsics4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<Placeholder> range = list.get(i3);
            if (AnnotatedString2.intersect(i, i2, range.getStart(), range.getEnd())) {
                if (!(i <= range.getStart() && range.getEnd() <= i2)) {
                    InlineClassHelper5.throwIllegalArgumentException("placeholder can not overlap with paragraph.");
                }
                arrayList.add(new AnnotatedString.Range(range.getItem(), range.getStart() - i, range.getEnd() - i));
            }
        }
        return arrayList;
    }
}
