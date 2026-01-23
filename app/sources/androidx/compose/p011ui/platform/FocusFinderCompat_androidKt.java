package androidx.compose.p011ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ObjectList2;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FocusFinderCompat.android.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\"\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001e\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002\u001a*\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0010H\u0002\u001a,\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0013"}, m3636d2 = {"findViewInsideOutShouldExist", "Landroid/view/View;", BentoCurrencyPicker.ROOT_TEST_TAG, "start", "id", "", "addFocusableViews", "", "views", "Landroidx/collection/MutableObjectList;", "direction", "inTouchMode", "", "findUserSetNextFocus", "findViewByPredicateInsideOut", "predicate", "Lkotlin/Function1;", "findViewByPredicateTraversal", "childToSkip", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FocusFinderCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View findUserSetNextFocus(final View view, final View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return findViewByPredicateInsideOut(view2, view, new Function1<View, Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt.findUserSetNextFocus.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(View view3) {
                    return Boolean.valueOf(FocusFinderCompat_androidKt.findViewInsideOutShouldExist(view2, view3, view3.getNextFocusForwardId()) == view);
                }
            });
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return findViewInsideOutShouldExist(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewInsideOutShouldExist(View view, View view2, final int i) {
        return findViewByPredicateInsideOut(view, view2, new Function1<View, Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt.findViewInsideOutShouldExist.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(View view3) {
                return Boolean.valueOf(view3.getId() == i);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final View findViewByPredicateInsideOut(View view, View view2, Function1<? super View, Boolean> function1) {
        View view3 = null;
        while (true) {
            View viewFindViewByPredicateTraversal = findViewByPredicateTraversal(view2, function1, view3);
            if (viewFindViewByPredicateTraversal != null || view2 == view) {
                break;
            }
            Object parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            View view4 = (View) parent;
            view3 = view2;
            view2 = view4;
        }
        return null;
    }

    private static final View findViewByPredicateTraversal(View view, Function1<? super View, Boolean> function1, View view2) {
        View viewFindViewByPredicateTraversal;
        if (function1.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewFindViewByPredicateTraversal = findViewByPredicateTraversal(childAt, function1, view2)) != null) {
                return viewFindViewByPredicateTraversal;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addFocusableViews(View view, ObjectList2<View> objectList2, int i) {
        addFocusableViews(view, objectList2, i, view.isInTouchMode());
    }

    private static final void addFocusableViews(View view, ObjectList2<View> objectList2, int i, boolean z) {
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode())) {
            objectList2.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                addFocusableViews(viewGroup.getChildAt(i2), objectList2, i, z);
            }
        }
    }
}
