package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes4.dex */
public final class AccessibilityEventCompat {
    @Deprecated
    public static void setContentChangeTypes(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    @SuppressLint({"WrongConstant"})
    @Deprecated
    public static int getContentChangeTypes(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }
}
