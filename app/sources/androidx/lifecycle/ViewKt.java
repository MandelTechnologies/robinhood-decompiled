package androidx.lifecycle;

import android.view.View;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: View.android.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m3636d2 = {"findViewTreeLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "view", "Landroid/view/View;", "lifecycle-runtime_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class ViewKt {
    @Deprecated
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewTreeLifecycleOwner.get(view);
    }
}
