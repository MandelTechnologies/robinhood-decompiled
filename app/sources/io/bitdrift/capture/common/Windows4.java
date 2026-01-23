package io.bitdrift.capture.common;

import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Windows.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"phoneWindow", "Landroid/view/Window;", "Landroid/view/View;", "getPhoneWindow", "(Landroid/view/View;)Landroid/view/Window;", "platform_jvm_common-lib_kt"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.common.WindowsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Windows4 {
    public static final Window getPhoneWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Windows windows = Windows.INSTANCE;
        View rootView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "getRootView(...)");
        return windows.pullWindow(rootView);
    }
}
