package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StackStyling.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, m3636d2 = {"applyBaseStackStyles", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$HorizontalStackComponentStyle;", "applyBaseClickableStackStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "applyActiveClickableStackStyles", "applyDisabledClickableStackStyles", "applyMarginsAndPadding", "getStyledBackground", "Landroid/graphics/drawable/LayerDrawable;", "state", "Lcom/withpersona/sdk2/inquiry/steps/ui/styling/StackState;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.StackStylingKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class StackStyling2 {

    /* compiled from: StackStyling.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.StackStylingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StackStyling.values().length];
            try {
                iArr[StackStyling.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackStyling.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StackStyling.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyBaseStackStyles(ConstraintLayout constraintLayout, HorizontalStack.HorizontalStackComponentStyle styles) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        applyMarginsAndPadding(constraintLayout, styles);
        constraintLayout.setBackground(getStyledBackground(styles));
        Double widthValue = styles.getWidthValue();
        if (widthValue != null) {
            int dpToPx = (int) ExtensionsKt.getDpToPx(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.endToEnd = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = dpToPx;
                constraintLayout.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public static final void applyBaseClickableStackStyles(ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle styles) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        applyMarginsAndPadding(constraintLayout, styles);
        constraintLayout.setBackground(getStyledBackground(styles, StackStyling.BASE));
        Double widthValue = styles.getWidthValue();
        if (widthValue != null) {
            int dpToPx = (int) ExtensionsKt.getDpToPx(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.endToEnd = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = dpToPx;
                constraintLayout.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public static final void applyActiveClickableStackStyles(ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        if (clickableStackComponentStyle != null) {
            applyMarginsAndPadding(constraintLayout, clickableStackComponentStyle);
            constraintLayout.setBackground(getStyledBackground(clickableStackComponentStyle, StackStyling.ACTIVE));
        }
    }

    public static final void applyDisabledClickableStackStyles(ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        if (clickableStackComponentStyle != null) {
            applyMarginsAndPadding(constraintLayout, clickableStackComponentStyle);
            constraintLayout.setBackground(getStyledBackground(clickableStackComponentStyle, StackStyling.DISABLED));
        }
    }

    private static final void applyMarginsAndPadding(ConstraintLayout constraintLayout, ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        StyleElements.SizeSet marginValue = clickableStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            ViewUtils5.setMargins(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = clickableStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) ExtensionsKt.getDpToPx(dp.doubleValue()));
        }
    }

    private static final void applyMarginsAndPadding(ConstraintLayout constraintLayout, HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Double dp;
        Double dp2;
        Double dp3;
        Double dp4;
        StyleElements.SizeSet marginValue = horizontalStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            ViewUtils5.setMargins(constraintLayout, marginValue);
        }
        StyleElements.SizeSet paddingValue = horizontalStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.Size left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp4 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) ExtensionsKt.getDpToPx(dp4.doubleValue());
            StyleElements.Size top = paddingValue.getTop();
            int paddingTop = (top == null || (dp3 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) ExtensionsKt.getDpToPx(dp3.doubleValue());
            StyleElements.Size right = paddingValue.getRight();
            int paddingRight = (right == null || (dp2 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
            StyleElements.Size bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) ExtensionsKt.getDpToPx(dp.doubleValue()));
        }
    }

    private static final LayerDrawable getStyledBackground(HorizontalStack.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        Object dp;
        Object dp2;
        Object dp3;
        Object dp4;
        Object obj;
        StyleElements.Size right;
        Double dp5;
        StyleElements.Size left;
        Double dp6;
        StyleElements.Size bottom;
        Double dp7;
        StyleElements.Size top;
        Double dp8;
        Double dp9;
        StyleElements.Size right2;
        StyleElements.Size left2;
        StyleElements.Size bottom2;
        StyleElements.Size top2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        StyleElements.SizeSet borderWidthValue = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue == null || (top2 = borderWidthValue.getTop()) == null || (dp = top2.getDp()) == null) {
            dp = obj;
        }
        StyleElements.SizeSet borderWidthValue2 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue2 == null || (bottom2 = borderWidthValue2.getBottom()) == null || (dp2 = bottom2.getDp()) == null) {
            dp2 = obj;
        }
        StyleElements.SizeSet borderWidthValue3 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue3 == null || (left2 = borderWidthValue3.getLeft()) == null || (dp3 = left2.getDp()) == null) {
            dp3 = obj;
        }
        StyleElements.SizeSet borderWidthValue4 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue4 == null || (right2 = borderWidthValue4.getRight()) == null || (dp4 = right2.getDp()) == null) {
            dp4 = obj;
        }
        Iterator it = CollectionsKt.listOf(dp, dp2, dp3, dp4).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dCeil = Math.ceil(ExtensionsKt.getDpToPx(((Number) next).doubleValue()));
                do {
                    Object next2 = it.next();
                    double dCeil2 = Math.ceil(ExtensionsKt.getDpToPx(((Number) next2).doubleValue()));
                    if (Double.compare(dCeil, dCeil2) < 0) {
                        next = next2;
                        dCeil = dCeil2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        int iIntValue = ((Number) (obj != null ? obj : 0)).intValue();
        Integer baseBorderColorValue = horizontalStackComponentStyle.getBaseBorderColorValue();
        gradientDrawable.setStroke(iIntValue, baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0);
        StyleElements.Size borderRadiusValue = horizontalStackComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null && (dp9 = borderRadiusValue.getDp()) != null) {
            float dpToPx = (float) ExtensionsKt.getDpToPx(dp9.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx});
        }
        Integer baseBackgroundColorValue = horizontalStackComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.SizeSet borderWidthValue5 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp8 = top.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp8.doubleValue())));
        StyleElements.SizeSet borderWidthValue6 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp7 = bottom.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp7.doubleValue())));
        StyleElements.SizeSet borderWidthValue7 = horizontalStackComponentStyle.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp6 = left.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp6.doubleValue())));
        StyleElements.SizeSet borderWidthValue8 = horizontalStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp5 = right.getDp()) != null) {
            iIntValue -= (int) Math.ceil(ExtensionsKt.getDpToPx(dp5.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue, -iCeil2);
        return layerDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LayerDrawable getStyledBackground(ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle, StackStyling stackStyling) {
        int iIntValue;
        Integer baseBackgroundColorValue;
        StyleElements.Size right;
        Double dp;
        StyleElements.Size left;
        Double dp2;
        StyleElements.Size bottom;
        Double dp3;
        StyleElements.Size top;
        Double dp4;
        Double dp5;
        StyleElements.Size right2;
        Double dp6;
        StyleElements.Size left2;
        Double dp7;
        StyleElements.Size bottom2;
        Double dp8;
        StyleElements.Size top2;
        Double dp9;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        StyleElements.SizeSet borderWidthValue = clickableStackComponentStyle.getBorderWidthValue();
        double dDoubleValue = 0.0d;
        Double dValueOf = Double.valueOf((borderWidthValue == null || (top2 = borderWidthValue.getTop()) == null || (dp9 = top2.getDp()) == null) ? 0.0d : dp9.doubleValue());
        StyleElements.SizeSet borderWidthValue2 = clickableStackComponentStyle.getBorderWidthValue();
        Double dValueOf2 = Double.valueOf((borderWidthValue2 == null || (bottom2 = borderWidthValue2.getBottom()) == null || (dp8 = bottom2.getDp()) == null) ? 0.0d : dp8.doubleValue());
        StyleElements.SizeSet borderWidthValue3 = clickableStackComponentStyle.getBorderWidthValue();
        Double dValueOf3 = Double.valueOf((borderWidthValue3 == null || (left2 = borderWidthValue3.getLeft()) == null || (dp7 = left2.getDp()) == null) ? 0.0d : dp7.doubleValue());
        StyleElements.SizeSet borderWidthValue4 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue4 != null && (right2 = borderWidthValue4.getRight()) != null && (dp6 = right2.getDp()) != null) {
            dDoubleValue = dp6.doubleValue();
        }
        List listListOf = CollectionsKt.listOf((Object[]) new Double[]{dValueOf, dValueOf2, dValueOf3, Double.valueOf(dDoubleValue)});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) Math.ceil(ExtensionsKt.getDpToPx(((Number) it.next()).doubleValue()))));
        }
        int iIntValue2 = ((Number) CollectionsKt.maxOrThrow(arrayList)).intValue();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[stackStyling.ordinal()];
        if (i == 1) {
            Integer baseBorderColorValue = clickableStackComponentStyle.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                iIntValue = baseBorderColorValue.intValue();
            }
        } else if (i == 2) {
            Integer activeBorderColorValue = clickableStackComponentStyle.getActiveBorderColorValue();
            if (activeBorderColorValue != null) {
                iIntValue = activeBorderColorValue.intValue();
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Integer disabledBorderColorValue = clickableStackComponentStyle.getDisabledBorderColorValue();
            iIntValue = disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : 0;
        }
        gradientDrawable.setStroke(iIntValue2, iIntValue);
        StyleElements.Size borderRadiusValue = clickableStackComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null && (dp5 = borderRadiusValue.getDp()) != null) {
            float dpToPx = (float) ExtensionsKt.getDpToPx(dp5.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            Intrinsics.checkNotNull(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx});
        }
        int i2 = iArr[stackStyling.ordinal()];
        if (i2 == 1) {
            baseBackgroundColorValue = clickableStackComponentStyle.getBaseBackgroundColorValue();
        } else if (i2 == 2) {
            baseBackgroundColorValue = clickableStackComponentStyle.getActiveBackgroundColorValue();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            baseBackgroundColorValue = clickableStackComponentStyle.getDisabledBackgroundColorValue();
        }
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.SizeSet borderWidthValue5 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp4 = top.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp4.doubleValue())));
        StyleElements.SizeSet borderWidthValue6 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp3 = bottom.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp3.doubleValue())));
        StyleElements.SizeSet borderWidthValue7 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp2 = left.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(ExtensionsKt.getDpToPx(dp2.doubleValue())));
        StyleElements.SizeSet borderWidthValue8 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp = right.getDp()) != null) {
            iIntValue2 -= (int) Math.ceil(ExtensionsKt.getDpToPx(dp.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue2, -iCeil2);
        return layerDrawable;
    }
}
