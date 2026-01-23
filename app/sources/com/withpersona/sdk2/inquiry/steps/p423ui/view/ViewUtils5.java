package com.withpersona.sdk2.inquiry.steps.p423ui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ViewUtils.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, m3636d2 = {"setMargins", "", "Landroid/view/View;", "margins", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "setPaddingFromSizeSet", "padding", "applyWidth", "width", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "applyHeight", "height", "setOrClearError", "Lcom/google/android/material/textfield/TextInputLayout;", "errorMessage", "", "errorTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ViewUtils5 {
    public static final void setPaddingFromSizeSet(View view, StyleElements.SizeSet padding) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(padding, "padding");
        StyleElements.Size left = padding.getLeft();
        int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? view.getPaddingLeft() : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
        StyleElements.Size top = padding.getTop();
        int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? view.getPaddingTop() : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
        StyleElements.Size right = padding.getRight();
        int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? view.getPaddingRight() : (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
        StyleElements.Size bottom = padding.getBottom();
        view.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? view.getPaddingBottom() : (int) ExtensionsKt.getDpToPx(dp.doubleValue()));
    }

    public static final void setOrClearError(TextInputLayout textInputLayout, String str, TextBasedComponentStyle textBasedComponentStyle) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (str == null || StringsKt.isBlank(str)) {
            textInputLayout.setErrorEnabled(false);
            return;
        }
        textInputLayout.setError(str);
        if (textBasedComponentStyle != null) {
            SpannableString spannableString = new SpannableString(textInputLayout.getError());
            String fontNameValue = textBasedComponentStyle.getFontNameValue();
            if (fontNameValue != null) {
                Context context = textInputLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Typeface typeface = UtilsKt.getTypeface(context, fontNameValue);
                if (typeface != null) {
                    spannableString.setSpan(new ViewUtils4(typeface), 0, spannableString.length(), 33);
                }
            }
            Double fontSizeValue = textBasedComponentStyle.getFontSizeValue();
            if (fontSizeValue != null) {
                spannableString.setSpan(new AbsoluteSizeSpan((int) ExtensionsKt.getDpToPx(fontSizeValue.doubleValue())), 0, spannableString.length(), 33);
            }
            textInputLayout.setError(spannableString);
        }
    }

    public static final void applyHeight(View view, StyleElements.Size size) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (size instanceof StyleElements.DPSize) {
                Double dp = ((StyleElements.DPSize) size).getDp();
                if (dp == null) {
                    return;
                } else {
                    layoutParams.height = (int) ExtensionsKt.getDpToPx(dp.doubleValue());
                }
            } else if (size instanceof StyleElements.Size.PercentSize) {
                Object parent = view.getParent();
                if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                    ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentHeight = (float) ((StyleElements.Size.PercentSize) size).getPercent();
                } else if (parent instanceof View) {
                    layoutParams.height = (int) (((StyleElements.Size.PercentSize) size).getPercent() * ((View) parent).getHeight());
                }
            } else if (size != null) {
                throw new NoWhenBranchMatchedException();
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void applyWidth(View view, StyleElements.Size size) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (size instanceof StyleElements.DPSize) {
                Double dp = ((StyleElements.DPSize) size).getDp();
                if (dp == null) {
                    return;
                }
                int dpToPx = (int) ExtensionsKt.getDpToPx(dp.doubleValue());
                ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
                int width = Integer.MAX_VALUE;
                if ((layoutParams2 == null || layoutParams2.width != -2) && view2 != null) {
                    width = view2.getWidth();
                }
                layoutParams.width = RangesKt.coerceAtMost(dpToPx, width);
            } else if (size instanceof StyleElements.Size.PercentSize) {
                if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                    ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = (float) ((StyleElements.Size.PercentSize) size).getPercent();
                } else if (view2 != null) {
                    layoutParams.width = (int) (((StyleElements.Size.PercentSize) size).getPercent() * view2.getWidth());
                }
            } else if (size != null) {
                throw new NoWhenBranchMatchedException();
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void setMargins(View view, StyleElements.SizeSet margins) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(margins, "margins");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                StyleElements.Size left = margins.getLeft();
                marginLayoutParams.leftMargin = (left == null || (dp4 = left.getDp()) == null) ? marginLayoutParams.leftMargin : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
                StyleElements.Size right = margins.getRight();
                marginLayoutParams.rightMargin = (right == null || (dp3 = right.getDp()) == null) ? marginLayoutParams.rightMargin : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
                StyleElements.Size top = margins.getTop();
                marginLayoutParams.topMargin = (top == null || (dp2 = top.getDp()) == null) ? marginLayoutParams.topMargin : (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
                StyleElements.Size bottom = margins.getBottom();
                marginLayoutParams.bottomMargin = (bottom == null || (dp = bottom.getDp()) == null) ? marginLayoutParams.bottomMargin : (int) ExtensionsKt.getDpToPx(dp.doubleValue());
            }
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
