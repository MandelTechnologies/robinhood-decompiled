package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.R$dimen;
import com.withpersona.sdk2.inquiry.steps.p423ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiFooterBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: FooterComponent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"makeView", "Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "componentViews", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/ComponentView;", "children", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Footer;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class FooterComponent2 {
    public static final View makeView(FooterComponent footerComponent, UiComponentHelper uiComponentHelper, List<ComponentView> componentViews, List<? extends View> children, Footer config) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Intrinsics.checkNotNullParameter(footerComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(componentViews, "componentViews");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(config, "config");
        Context context = uiComponentHelper.getContext();
        Pi2UiFooterBinding pi2UiFooterBindingInflate = Pi2UiFooterBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(pi2UiFooterBindingInflate, "inflate(...)");
        Integer backgroundColor = config.getBackgroundColor();
        if (backgroundColor != null) {
            pi2UiFooterBindingInflate.footerContainer.setBackgroundColor(backgroundColor.intValue());
        }
        StyleElements.SizeSet padding = config.getPadding();
        if (padding != null) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.startEndMargin);
            StyleElements.Size left = padding.getLeft();
            int iCoerceAtLeast = RangesKt.coerceAtLeast((left == null || (dp5 = left.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp5.doubleValue()), dimensionPixelOffset);
            StyleElements.Size right = padding.getRight();
            int iCoerceAtLeast2 = RangesKt.coerceAtLeast((right == null || (dp4 = right.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp4.doubleValue()), dimensionPixelOffset);
            ConstraintLayout constraintLayout = pi2UiFooterBindingInflate.footerContainerInner;
            StyleElements.Size top = padding.getTop();
            int dpToPx = (top == null || (dp3 = top.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
            StyleElements.Size bottom = padding.getBottom();
            constraintLayout.setPadding(iCoerceAtLeast, dpToPx, iCoerceAtLeast2, (bottom == null || (dp2 = bottom.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp2.doubleValue()));
        }
        StyleElements.SizeSet borderWidth = config.getBorderWidth();
        if (borderWidth != null) {
            View hairline = pi2UiFooterBindingInflate.hairline;
            Intrinsics.checkNotNullExpressionValue(hairline, "hairline");
            ViewGroup.LayoutParams layoutParams = hairline.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            StyleElements.Size top2 = borderWidth.getTop();
            layoutParams.height = (top2 == null || (dp = top2.getDp()) == null) ? 0 : (int) ExtensionsKt.getDpToPx(dp.doubleValue());
            hairline.setLayoutParams(layoutParams);
        } else {
            View hairline2 = pi2UiFooterBindingInflate.hairline;
            Intrinsics.checkNotNullExpressionValue(hairline2, "hairline");
            ViewGroup.LayoutParams layoutParams2 = hairline2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = (int) ExtensionsKt.getDpToPx(1.0d);
            hairline2.setLayoutParams(layoutParams2);
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(pi2UiFooterBindingInflate.footerContainerInner);
        ConstraintLayout footerContainerInner = pi2UiFooterBindingInflate.footerContainerInner;
        Intrinsics.checkNotNullExpressionValue(footerContainerInner, "footerContainerInner");
        List<? extends View> list = children;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (View view : list) {
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            footerContainerInner.addView(view);
            arrayList.add(Integer.valueOf(view.getId()));
        }
        Stacks.setupVerticalStack(footerContainerInner, constraintSet, componentViews, arrayList, StyleElements.PositionType.CENTER, 0);
        constraintSet.applyTo(pi2UiFooterBindingInflate.footerContainerInner);
        LinearLayout root = pi2UiFooterBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
