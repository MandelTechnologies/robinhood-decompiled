package com.robinhood.utils.p409ui.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnHierarchyChangeListenerAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/OnHierarchyChangeListenerAdapter;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "onChildViewRemoved", "", "parent", "Landroid/view/View;", "child", "onChildViewAdded", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface OnHierarchyChangeListenerAdapter extends ViewGroup.OnHierarchyChangeListener {

    /* compiled from: OnHierarchyChangeListenerAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onChildViewAdded(OnHierarchyChangeListenerAdapter onHierarchyChangeListenerAdapter, View parent, View child) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
        }

        public static void onChildViewRemoved(OnHierarchyChangeListenerAdapter onHierarchyChangeListenerAdapter, View parent, View child) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    void onChildViewAdded(View parent, View child);

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    void onChildViewRemoved(View parent, View child);
}
