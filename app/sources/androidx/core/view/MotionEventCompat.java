package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes4.dex */
public final class MotionEventCompat {
    public static boolean isFromSource(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
