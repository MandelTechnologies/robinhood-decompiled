package androidx.compose.p011ui.text.android.selection;

import android.text.SegmentFinder;
import androidx.compose.p011ui.text.android.AndroidLayoutApi34$$ExternalSyntheticApiModelOutline2;
import kotlin.Metadata;

/* compiled from: SegmentFinder.android.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;", "", "()V", "toAndroidSegmentFinder", "Landroid/text/SegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "toAndroidSegmentFinder$ui_text_release", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class Api34SegmentFinder {
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final SegmentFinder toAndroidSegmentFinder$ui_text_release(final SegmentFinder segmentFinder) {
        return AndroidLayoutApi34$$ExternalSyntheticApiModelOutline2.m325m(new SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int previousStartBoundary(int offset) {
                return segmentFinder.previousStartBoundary(offset);
            }

            public int previousEndBoundary(int offset) {
                return segmentFinder.previousEndBoundary(offset);
            }

            public int nextStartBoundary(int offset) {
                return segmentFinder.nextStartBoundary(offset);
            }

            public int nextEndBoundary(int offset) {
                return segmentFinder.nextEndBoundary(offset);
            }
        });
    }
}
