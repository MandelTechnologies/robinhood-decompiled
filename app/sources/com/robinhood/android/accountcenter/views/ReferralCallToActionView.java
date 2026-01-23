package com.robinhood.android.accountcenter.views;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ViewGroups;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ReferralCallToActionView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0014J0\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0014J\u0014\u0010#\u001a\u00020\n*\u00020\r2\u0006\u0010$\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020&H\u0014J\u0012\u0010'\u001a\u00020&2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ReferralCallToActionView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "textView", "Landroid/widget/TextView;", "value", "", "buttonLabel", "getButtonLabel", "()Ljava/lang/String;", "setButtonLabel", "(Ljava/lang/String;)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "", "l", "t", Constants.REVENUE_AMOUNT_KEY, "b", "getTopForLayout", "parentHeight", "generateDefaultLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "generateLayoutParams", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ReferralCallToActionView extends ViewGroup {
    public static final int $stable = 8;
    private final View iconView;
    private final TextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCallToActionView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(getResources().getDrawable(C8293R.drawable.referral_button_background, getContext().getTheme()));
        ScarletManager2.overrideAttribute(this, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorPrimaryGhost));
        ViewGroups.inflate(this, C8293R.layout.referral_call_to_action_views, true);
        this.iconView = findViewById(C8293R.id.referral_cta_icon);
        this.textView = (TextView) findViewById(C8293R.id.referral_cta_text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCallToActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(getResources().getDrawable(C8293R.drawable.referral_button_background, getContext().getTheme()));
        ScarletManager2.overrideAttribute(this, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorPrimaryGhost));
        ViewGroups.inflate(this, C8293R.layout.referral_call_to_action_views, true);
        this.iconView = findViewById(C8293R.id.referral_cta_icon);
        this.textView = (TextView) findViewById(C8293R.id.referral_cta_text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferralCallToActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setBackground(getResources().getDrawable(C8293R.drawable.referral_button_background, getContext().getTheme()));
        ScarletManager2.overrideAttribute(this, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorPrimaryGhost));
        ViewGroups.inflate(this, C8293R.layout.referral_call_to_action_views, true);
        this.iconView = findViewById(C8293R.id.referral_cta_icon);
        this.textView = (TextView) findViewById(C8293R.id.referral_cta_text);
    }

    public final String getButtonLabel() {
        return this.textView.getText().toString();
    }

    public final void setButtonLabel(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.textView.setText(value);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iCoerceAtLeast;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        measureChildWithMargins(this.iconView, widthMeasureSpec, 0, heightMeasureSpec, 0);
        int paddingLeft = getPaddingLeft() + this.iconView.getMeasuredWidth() + getPaddingRight();
        View iconView = this.iconView;
        Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = paddingLeft + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        View iconView2 = this.iconView;
        Intrinsics.checkNotNullExpressionValue(iconView2, "iconView");
        ViewGroup.LayoutParams layoutParams2 = iconView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = i + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
        if (i2 > size && mode != 0) {
            this.iconView.setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        }
        this.iconView.setVisibility(0);
        measureChildWithMargins(this.textView, widthMeasureSpec, 0, heightMeasureSpec, 0);
        int measuredWidth = this.textView.getMeasuredWidth();
        TextView textView = this.textView;
        Intrinsics.checkNotNullExpressionValue(textView, "textView");
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = measuredWidth + (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
        TextView textView2 = this.textView;
        Intrinsics.checkNotNullExpressionValue(textView2, "textView");
        ViewGroup.LayoutParams layoutParams4 = textView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = i3 + (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0) + i2;
        boolean z = i4 <= size;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (!z) {
            this.textView.setVisibility(8);
            iCoerceAtLeast = paddingTop + this.iconView.getMeasuredHeight();
        } else {
            this.textView.setVisibility(0);
            iCoerceAtLeast = paddingTop + RangesKt.coerceAtLeast(this.iconView.getMeasuredHeight(), this.textView.getMeasuredHeight());
            i2 = i4;
        }
        setMeasuredDimension(i2, iCoerceAtLeast);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int bottom = getBottom() - getTop();
        View iconView = this.iconView;
        Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
        if (iconView.getVisibility() == 8) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        View iconView2 = this.iconView;
        Intrinsics.checkNotNullExpressionValue(iconView2, "iconView");
        int topForLayout = getTopForLayout(iconView2, bottom);
        View view = this.iconView;
        view.layout(paddingLeft, topForLayout, view.getMeasuredWidth() + paddingLeft, this.iconView.getMeasuredHeight() + topForLayout);
        TextView textView = this.textView;
        Intrinsics.checkNotNullExpressionValue(textView, "textView");
        if (textView.getVisibility() == 8) {
            return;
        }
        int measuredWidth = paddingLeft + this.iconView.getMeasuredWidth();
        View iconView3 = this.iconView;
        Intrinsics.checkNotNullExpressionValue(iconView3, "iconView");
        ViewGroup.LayoutParams layoutParams = iconView3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredWidth + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
        TextView textView2 = this.textView;
        Intrinsics.checkNotNullExpressionValue(textView2, "textView");
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = i + (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
        TextView textView3 = this.textView;
        Intrinsics.checkNotNullExpressionValue(textView3, "textView");
        int topForLayout2 = getTopForLayout(textView3, bottom);
        TextView textView4 = this.textView;
        textView4.layout(i2, topForLayout2, textView4.getMeasuredWidth() + i2, this.textView.getMeasuredHeight() + topForLayout2);
    }

    private final int getTopForLayout(View view, int i) {
        return (i - view.getMeasuredHeight()) / 2;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }
}
