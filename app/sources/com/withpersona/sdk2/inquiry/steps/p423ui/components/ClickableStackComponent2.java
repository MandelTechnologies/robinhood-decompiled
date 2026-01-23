package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiClickableStackBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.StackStyling2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClickableStackComponent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"makeView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "componentViews", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/ComponentView;", "children", "Landroid/view/View;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ClickableStackComponent2 {
    public static final ConstraintLayout makeView(ClickableStackComponent clickableStackComponent, UiComponentHelper uiComponentHelper, List<ComponentView> componentViews, List<? extends View> children, ClickableStack config) {
        StyleElements.Axis axisValue;
        StyleElements.Size gapValue;
        Double dp;
        Intrinsics.checkNotNullParameter(clickableStackComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiClickableStackBinding pi2UiClickableStackBindingInflate = Pi2UiClickableStackBinding.inflate(uiComponentHelper.getLayoutInflater());
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(pi2UiClickableStackBindingInflate.getRoot());
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            pi2UiClickableStackBindingInflate.getRoot().addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        final ClickableStack.ClickableStackComponentStyle styles = config.getStyles();
        int dpToPx = (int) ExtensionsKt.getDpToPx((styles == null || (gapValue = styles.getGapValue()) == null || (dp = gapValue.getDp()) == null) ? 16.0d : dp.doubleValue());
        if (styles == null || (axisValue = styles.getAxisValue()) == null) {
            axisValue = StyleElements.Axis.HORIZONTAL;
        }
        if (axisValue == StyleElements.Axis.HORIZONTAL) {
            ConstraintLayout root = pi2UiClickableStackBindingInflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            Stacks.setupHorizontalStack(root, constraintSet, componentViews, arrayList, styles != null ? styles.getChildSizesValue() : null, styles != null ? styles.getAlignmentValue() : null, dpToPx);
        } else {
            ConstraintLayout root2 = pi2UiClickableStackBindingInflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            Stacks.setupVerticalStack(root2, constraintSet, componentViews, arrayList, styles != null ? styles.getAlignmentValue() : null, dpToPx);
        }
        if (styles != null) {
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClickableStackComponent2.makeView$lambda$3$lambda$2(pi2UiClickableStackBindingInflate, styles);
                }
            });
        }
        constraintSet.applyTo(pi2UiClickableStackBindingInflate.getRoot());
        ConstraintLayout root3 = pi2UiClickableStackBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        return root3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$3$lambda$2(Pi2UiClickableStackBinding pi2UiClickableStackBinding, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        ConstraintLayout root = pi2UiClickableStackBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StackStyling2.applyBaseClickableStackStyles(root, clickableStackComponentStyle);
        return Unit.INSTANCE;
    }
}
