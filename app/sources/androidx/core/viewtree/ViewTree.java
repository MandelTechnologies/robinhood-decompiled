package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewTree.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Landroid/view/View;", "Landroid/view/ViewParent;", "getParentOrViewTreeDisjointParent", "(Landroid/view/View;)Landroid/view/ViewParent;", "core-viewtree_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class ViewTree {
    public static final ViewParent getParentOrViewTreeDisjointParent(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R$id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
