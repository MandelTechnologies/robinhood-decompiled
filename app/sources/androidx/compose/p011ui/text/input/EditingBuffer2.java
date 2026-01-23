package androidx.compose.p011ui.text.input;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m3636d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.text.input.EditingBufferKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class EditingBuffer2 {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m7738updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM7642getLengthimpl;
        int iM7644getMinimpl = TextRange.m7644getMinimpl(j);
        int iM7643getMaximpl = TextRange.m7643getMaximpl(j);
        if (TextRange.m7648intersects5zctL8(j2, j)) {
            if (TextRange.m7636contains5zctL8(j2, j)) {
                iM7644getMinimpl = TextRange.m7644getMinimpl(j2);
                iM7643getMaximpl = iM7644getMinimpl;
            } else {
                if (TextRange.m7636contains5zctL8(j, j2)) {
                    iM7642getLengthimpl = TextRange.m7642getLengthimpl(j2);
                } else if (TextRange.m7637containsimpl(j2, iM7644getMinimpl)) {
                    iM7644getMinimpl = TextRange.m7644getMinimpl(j2);
                    iM7642getLengthimpl = TextRange.m7642getLengthimpl(j2);
                } else {
                    iM7643getMaximpl = TextRange.m7644getMinimpl(j2);
                }
                iM7643getMaximpl -= iM7642getLengthimpl;
            }
        } else if (iM7643getMaximpl > TextRange.m7644getMinimpl(j2)) {
            iM7644getMinimpl -= TextRange.m7642getLengthimpl(j2);
            iM7642getLengthimpl = TextRange.m7642getLengthimpl(j2);
            iM7643getMaximpl -= iM7642getLengthimpl;
        }
        return TextRange2.TextRange(iM7644getMinimpl, iM7643getMaximpl);
    }
}
