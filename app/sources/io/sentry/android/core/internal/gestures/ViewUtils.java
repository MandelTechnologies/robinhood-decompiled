package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;
import io.sentry.util.Objects;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes14.dex */
public final class ViewUtils {
    private static boolean isViewIdGenerated(int i) {
        return ((-16777216) & i) == 0 && (i & 16777215) != 0;
    }

    static UiElement findTarget(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, UiElement.Type type2) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        UiElement uiElement = null;
        while (linkedList.size() > 0) {
            View view2 = (View) Objects.requireNonNull((View) linkedList.poll(), "view is required");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
            Iterator<GestureTargetLocator> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
            while (it.hasNext()) {
                UiElement uiElementLocate = it.next().locate(view2, f, f2, type2);
                if (uiElementLocate != null) {
                    if (type2 != UiElement.Type.CLICKABLE) {
                        return uiElementLocate;
                    }
                    uiElement = uiElementLocate;
                }
            }
        }
        return uiElement;
    }

    public static String getResourceId(View view) throws Resources.NotFoundException {
        int id = view.getId();
        if (id == -1 || isViewIdGenerated(id)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        if (resources != null) {
            return resources.getResourceEntryName(id);
        }
        return "";
    }
}
