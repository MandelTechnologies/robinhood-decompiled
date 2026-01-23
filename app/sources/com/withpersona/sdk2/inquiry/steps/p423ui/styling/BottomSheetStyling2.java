package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroup2;
import com.google.android.material.R$attr;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.StepStyleUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: BottomSheetStyling.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, m3636d2 = {"applyBottomSheetStyles", "", "Landroid/view/ViewGroup;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "innerView", "Landroid/view/View;", "viewBuiltInPadding", "Landroid/graphics/Rect;", "createRoundedSheetBackground", "Landroid/graphics/drawable/GradientDrawable;", "cornerRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "styleModalBackgroundImage", "backgroundImage", "Landroid/graphics/drawable/Drawable;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.BottomSheetStylingKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class BottomSheetStyling2 {
    public static /* synthetic */ void applyBottomSheetStyles$default(ViewGroup viewGroup, StepStyles2 stepStyles2, View view, Rect rect, int i, Object obj) {
        if ((i & 2) != 0) {
            view = viewGroup;
        }
        if ((i & 4) != 0) {
            rect = null;
        }
        applyBottomSheetStyles(viewGroup, stepStyles2, view, rect);
    }

    public static final void applyBottomSheetStyles(ViewGroup viewGroup, StepStyles2 stepStyles2, View innerView, Rect rect) {
        int colorFromAttr$default;
        StyleElements.SizeSet modalPaddingValue;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Integer backgroundColorValue;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(innerView, "innerView");
        if (stepStyles2 == null || (backgroundColorValue = stepStyles2.getBackgroundColorValue()) == null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            colorFromAttr$default = ResTools.getColorFromAttr$default(context, R$attr.colorSurface, null, false, 6, null);
        } else {
            colorFromAttr$default = backgroundColorValue.intValue();
        }
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(colorFromAttr$default));
        if (stepStyles2 != null) {
            Context context2 = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = StepStyleUtils.backgroundImageDrawable(stepStyles2, context2);
            if (drawableBackgroundImageDrawable != null) {
                styleModalBackgroundImage(viewGroup, drawableBackgroundImageDrawable);
            }
        }
        if (stepStyles2 != null && (modalPaddingValue = stepStyles2.getModalPaddingValue()) != null) {
            StyleElements.Size left = modalPaddingValue.getLeft();
            if (left == null || (dp4 = left.getDp()) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(((int) ExtensionsKt.getDpToPx(dp4.doubleValue())) - (rect != null ? rect.left : 0));
            }
            StyleElements.Size top = modalPaddingValue.getTop();
            if (top == null || (dp3 = top.getDp()) == null) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(((int) ExtensionsKt.getDpToPx(dp3.doubleValue())) - (rect != null ? rect.top : 0));
            }
            StyleElements.Size right = modalPaddingValue.getRight();
            if (right == null || (dp2 = right.getDp()) == null) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(((int) ExtensionsKt.getDpToPx(dp2.doubleValue())) - (rect != null ? rect.right : 0));
            }
            StyleElements.Size bottom = modalPaddingValue.getBottom();
            if (bottom == null || (dp = bottom.getDp()) == null) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(((int) ExtensionsKt.getDpToPx(dp.doubleValue())) - (rect != null ? rect.bottom : 0));
            }
            innerView.setPadding(numValueOf != null ? numValueOf.intValue() : viewGroup.getPaddingLeft(), numValueOf2 != null ? numValueOf2.intValue() : viewGroup.getPaddingTop(), numValueOf3 != null ? numValueOf3.intValue() : viewGroup.getPaddingRight(), numValueOf4 != null ? numValueOf4.intValue() : viewGroup.getPaddingBottom());
        }
        viewGroup.setBackground(createRoundedSheetBackground(stepStyles2 != null ? stepStyles2.getModalBorderRadiusValue() : null));
    }

    private static final GradientDrawable createRoundedSheetBackground(StyleElements.Size size) {
        Double dp;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float dpToPx = (float) ExtensionsKt.getDpToPx((size == null || (dp = size.getDp()) == null) ? 12.0d : dp.doubleValue());
        gradientDrawable.setCornerRadii(new float[]{dpToPx, dpToPx, dpToPx, dpToPx, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        return gradientDrawable;
    }

    private static final void styleModalBackgroundImage(ViewGroup viewGroup, Drawable drawable) {
        Sequence sequenceFilter = SequencesKt.filter(ViewGroup2.getChildren(viewGroup), new Function1() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.BottomSheetStylingKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BottomSheetStyling2.styleModalBackgroundImage$lambda$7((View) obj));
            }
        });
        if (SequencesKt.any(sequenceFilter)) {
            ((View) SequencesKt.first(sequenceFilter)).setBackground(drawable);
            return;
        }
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View bottomSheetStyling = new BottomSheetStyling(context);
        bottomSheetStyling.setBackground(drawable);
        viewGroup.addView(bottomSheetStyling, 0);
        ViewGroup.LayoutParams layoutParams = bottomSheetStyling.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
            layoutParams2.startToStart = viewGroup.getId();
            layoutParams2.endToEnd = viewGroup.getId();
            layoutParams2.topToTop = viewGroup.getId();
            layoutParams2.bottomToBottom = viewGroup.getId();
            bottomSheetStyling.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean styleModalBackgroundImage$lambda$7(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof BottomSheetStyling;
    }
}
