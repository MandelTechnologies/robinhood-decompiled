package androidx.window.layout.util;

import android.content.Context;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DensityCompatHelper.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Landroidx/window/layout/util/DensityCompatHelperApi34Impl;", "Landroidx/window/layout/util/DensityCompatHelper;", "<init>", "()V", "Landroid/content/Context;", "context", "", "density", "(Landroid/content/Context;)F", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.window.layout.util.DensityCompatHelperApi34Impl, reason: use source file name */
/* loaded from: classes16.dex */
final class DensityCompatHelper2 implements DensityCompatHelper {
    public static final DensityCompatHelper2 INSTANCE = new DensityCompatHelper2();

    private DensityCompatHelper2() {
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
