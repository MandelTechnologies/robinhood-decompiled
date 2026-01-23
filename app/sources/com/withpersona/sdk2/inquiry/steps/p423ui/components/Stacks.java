package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p423ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.AssociatedHideableView;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.StackGapView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Stacks.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0000\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0000¨\u0006\u0011"}, m3636d2 = {"setupHorizontalStack", "", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/ViewGroup;", "constraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "componentViews", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/ComponentView;", "childrenIds", "", "childSizes", "", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "gap", "setupVerticalStack", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.StacksKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class Stacks {

    /* compiled from: Stacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.StacksKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void setupHorizontalStack(ViewGroup viewGroup, ConstraintSet constraintSet, List<ComponentView> componentViews, List<Integer> childrenIds, int[] iArr, StyleElements.PositionType positionType, int i) {
        Integer num;
        int i2;
        int i3;
        Object next;
        Object next2;
        List<AssociatedHideableView> associatedViews;
        ViewGroup root = viewGroup;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(childrenIds, "childrenIds");
        double dSum = iArr != null ? ArraysKt.sum(iArr) : 0.0d;
        ArrayList arrayList = new ArrayList();
        List<Integer> list = childrenIds;
        int i4 = 0;
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            StackGapView stackGapView = new StackGapView(context);
            stackGapView.setId(View.generateViewId());
            stackGapView.setSaveEnabled(false);
            if (i5 != CollectionsKt.getLastIndex(childrenIds)) {
                Iterator<T> it = componentViews.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next2 = it.next();
                        if (((ComponentView) next2).getView().getId() == iIntValue) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ComponentView componentView = (ComponentView) next2;
                UiComponent component = componentView != null ? componentView.getComponent() : null;
                UiComponentAttributes3 uiComponentAttributes3 = component instanceof UiComponentAttributes3 ? (UiComponentAttributes3) component : null;
                if (uiComponentAttributes3 != null && (associatedViews = uiComponentAttributes3.getAssociatedViews()) != null) {
                    associatedViews.add(stackGapView);
                }
                root.addView(stackGapView);
                constraintSet.constrainWidth(stackGapView.getId(), i);
                constraintSet.constrainedWidth(stackGapView.getId(), true);
                constraintSet.constrainHeight(stackGapView.getId(), 1);
                constraintSet.constrainedHeight(stackGapView.getId(), true);
                arrayList.add(Integer.valueOf(stackGapView.getId()));
            }
            i5 = i6;
        }
        int i7 = 0;
        for (Object obj2 : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            Integer num2 = i7 > 0 ? (Integer) arrayList.get(i7 - 1) : null;
            if (i7 == CollectionsKt.getLastIndex(childrenIds)) {
                constraintSet.connect(iIntValue2, 7, i4, 7);
                Iterator<T> it2 = componentViews.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((ComponentView) next).getView().getId() == iIntValue2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ComponentView componentView2 = (ComponentView) next;
                if ((componentView2 != null ? componentView2.getComponent() : null) != null && num2 != null) {
                    ((StackGapView) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.getComponent()));
                }
                num = null;
                i2 = 6;
            } else {
                num = (Integer) arrayList.get(i7);
                i2 = 6;
                constraintSet.connect(iIntValue2, 7, num.intValue(), 6);
                constraintSet.connect(num.intValue(), 7, childrenIds.get(i8).intValue(), 6);
                constraintSet.connect(num.intValue(), 6, iIntValue2, 7);
            }
            if (num2 != null) {
                constraintSet.connect(iIntValue2, i2, num2.intValue(), 7);
            } else {
                constraintSet.connect(iIntValue2, i2, 0, i2);
            }
            constraintSet.constrainHeight(iIntValue2, -2);
            constraintSet.constrainedHeight(iIntValue2, true);
            if (dSum > 0.0d) {
                double d = (iArr != null ? iArr[i7] : 0) / dSum;
                if (d > 0.0d) {
                    constraintSet.setHorizontalWeight(iIntValue2, (float) d);
                } else {
                    constraintSet.constrainWidth(iIntValue2, -2);
                }
                i3 = 0;
            } else {
                i3 = 0;
                constraintSet.constrainDefaultWidth(iIntValue2, 0);
            }
            constraintSet.connect(iIntValue2, 3, i3, 3);
            constraintSet.connect(iIntValue2, 4, i3, 4);
            if (num != null) {
                constraintSet.connect(num.intValue(), 3, i3, 3);
                constraintSet.connect(num.intValue(), 4, i3, 4);
            }
            int i9 = positionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[positionType.ordinal()];
            if (i9 == 1) {
                constraintSet.setVerticalBias(iIntValue2, 0.0f);
            } else if (i9 == 2) {
                constraintSet.setVerticalBias(iIntValue2, 1.0f);
            } else {
                constraintSet.setVerticalBias(iIntValue2, 0.5f);
            }
            i4 = i3;
            i7 = i8;
            root = viewGroup;
        }
    }

    public static final void setupVerticalStack(ViewGroup root, ConstraintSet constraintSet, List<ComponentView> componentViews, List<Integer> childrenIds, StyleElements.PositionType positionType, int i) {
        Integer num;
        Object next;
        Object next2;
        List<AssociatedHideableView> associatedViews;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(childrenIds, "childrenIds");
        ArrayList arrayList = new ArrayList();
        List<Integer> list = childrenIds;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            StackGapView stackGapView = new StackGapView(context);
            stackGapView.setId(View.generateViewId());
            stackGapView.setSaveEnabled(false);
            if (i2 != CollectionsKt.getLastIndex(childrenIds)) {
                Iterator<T> it = componentViews.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next2 = it.next();
                        if (((ComponentView) next2).getView().getId() == iIntValue) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ComponentView componentView = (ComponentView) next2;
                UiComponent component = componentView != null ? componentView.getComponent() : null;
                UiComponentAttributes3 uiComponentAttributes3 = component instanceof UiComponentAttributes3 ? (UiComponentAttributes3) component : null;
                if (uiComponentAttributes3 != null && (associatedViews = uiComponentAttributes3.getAssociatedViews()) != null) {
                    associatedViews.add(stackGapView);
                }
                root.addView(stackGapView);
                constraintSet.constrainWidth(stackGapView.getId(), 1);
                constraintSet.constrainedWidth(stackGapView.getId(), true);
                constraintSet.constrainHeight(stackGapView.getId(), i);
                constraintSet.constrainedHeight(stackGapView.getId(), true);
                arrayList.add(Integer.valueOf(stackGapView.getId()));
            }
            i2 = i3;
        }
        int i4 = 0;
        for (Object obj2 : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue2 = ((Number) obj2).intValue();
            Integer num2 = i4 > 0 ? (Integer) arrayList.get(i4 - 1) : null;
            if (i4 == CollectionsKt.getLastIndex(childrenIds)) {
                constraintSet.connect(iIntValue2, 4, 0, 4);
                Iterator<T> it2 = componentViews.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((ComponentView) next).getView().getId() == iIntValue2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ComponentView componentView2 = (ComponentView) next;
                if ((componentView2 != null ? componentView2.getComponent() : null) != null && num2 != null) {
                    ((StackGapView) root.findViewById(num2.intValue())).getAssociatedComponents().add(new WeakReference<>(componentView2.getComponent()));
                }
                num = null;
            } else {
                num = (Integer) arrayList.get(i4);
                constraintSet.connect(num.intValue(), 3, iIntValue2, 4);
            }
            if (i4 == 0) {
                constraintSet.connect(iIntValue2, 3, 0, 3);
            }
            if (num2 != null) {
                constraintSet.connect(num2.intValue(), 4, iIntValue2, 3);
                constraintSet.connect(iIntValue2, 3, num2.intValue(), 4);
            }
            constraintSet.connect(iIntValue2, 6, 0, 6);
            constraintSet.connect(iIntValue2, 7, 0, 7);
            if (num != null) {
                constraintSet.connect(num.intValue(), 6, 0, 6);
                constraintSet.connect(num.intValue(), 7, 0, 7);
            }
            constraintSet.constrainHeight(iIntValue2, -2);
            constraintSet.constrainWidth(iIntValue2, 0);
            int i6 = positionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[positionType.ordinal()];
            if (i6 == 1) {
                constraintSet.setHorizontalBias(iIntValue2, 0.0f);
            } else if (i6 == 2) {
                constraintSet.setHorizontalBias(iIntValue2, 1.0f);
            } else {
                constraintSet.setHorizontalBias(iIntValue2, 0.5f);
            }
            i4 = i5;
        }
    }
}
