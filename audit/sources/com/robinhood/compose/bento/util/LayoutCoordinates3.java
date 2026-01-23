package com.robinhood.compose.bento.util;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutCoordinates.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, m3636d2 = {"isVisible", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "view", "Landroid/view/View;", "globalRootRect", "Landroid/graphics/Rect;", "isFullyVisible", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.util.LayoutCoordinatesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class LayoutCoordinates3 {
    public static final boolean isVisible(LayoutCoordinates layoutCoordinates, View view, Rect globalRootRect) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(globalRootRect, "globalRootRect");
        if (!layoutCoordinates.isAttached() || !view.getGlobalVisibleRect(globalRootRect)) {
            return false;
        }
        androidx.compose.p011ui.geometry.Rect rectBoundsInWindow = LayoutCoordinates2.boundsInWindow(layoutCoordinates);
        return (rectBoundsInWindow.getTop() >= ((float) globalRootRect.top) || rectBoundsInWindow.getBottom() <= ((float) globalRootRect.bottom)) && (rectBoundsInWindow.getLeft() >= ((float) globalRootRect.left) || rectBoundsInWindow.getRight() <= ((float) globalRootRect.right));
    }

    public static final boolean isFullyVisible(LayoutCoordinates layoutCoordinates, View view, Rect globalRootRect) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(globalRootRect, "globalRootRect");
        if (!layoutCoordinates.isAttached() || !view.getGlobalVisibleRect(globalRootRect)) {
            return false;
        }
        androidx.compose.p011ui.geometry.Rect rectBoundsInWindow = LayoutCoordinates2.boundsInWindow(layoutCoordinates);
        return rectBoundsInWindow.getTop() >= ((float) globalRootRect.top) && rectBoundsInWindow.getBottom() <= ((float) globalRootRect.bottom) && rectBoundsInWindow.getLeft() >= ((float) globalRootRect.left) && rectBoundsInWindow.getRight() <= ((float) globalRootRect.right);
    }
}
