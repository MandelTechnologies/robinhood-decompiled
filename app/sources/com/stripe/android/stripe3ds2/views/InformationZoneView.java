package com.stripe.android.stripe3ds2.views;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContent2;
import com.stripe.android.stripe3ds2.databinding.StripeInformationZoneViewBinding;
import com.stripe.android.stripe3ds2.init.p418ui.LabelCustomization;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InformationZoneView.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010&\u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010!\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010#R \u0010*\u001a\u00020)8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010%\u001a\u0004\b,\u0010-R \u00100\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010%\u001a\u0004\b2\u00103R \u00105\u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b5\u0010!\u0012\u0004\b7\u0010%\u001a\u0004\b6\u0010#R \u00108\u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b8\u0010!\u0012\u0004\b:\u0010%\u001a\u0004\b9\u0010#R \u0010;\u001a\u00020)8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b;\u0010+\u0012\u0004\b=\u0010%\u001a\u0004\b<\u0010-R \u0010>\u001a\u00020/8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b>\u00101\u0012\u0004\b@\u0010%\u001a\u0004\b?\u00103R\"\u0010A\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010BR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010B¨\u0006I"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", SduiMarginStatusCardContent2.INLINE_CONTENT_ARROW_ID, "Landroid/widget/TextView;", AnnotatedPrivateKey.LABEL, "detailsView", "", "toggleView", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "", "whyInfoLabel", "whyInfoText", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "labelCustomization", "setWhyInfo", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "expandInfoLabel", "expandInfoText", "setExpandInfo", "Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;", "viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "whyLabel", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release$annotations", "()V", "whyText", "getWhyText$3ds2sdk_release", "getWhyText$3ds2sdk_release$annotations", "Landroid/widget/LinearLayout;", "whyContainer", "Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release$annotations", "Landroidx/appcompat/widget/AppCompatImageView;", "whyArrow", "Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release", "()Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release$annotations", "expandLabel", "getExpandLabel$3ds2sdk_release", "getExpandLabel$3ds2sdk_release$annotations", "expandText", "getExpandText$3ds2sdk_release", "getExpandText$3ds2sdk_release$annotations", "expandContainer", "getExpandContainer$3ds2sdk_release", "getExpandContainer$3ds2sdk_release$annotations", "expandArrow", "getExpandArrow$3ds2sdk_release", "getExpandArrow$3ds2sdk_release$annotations", "toggleColor", "I", "getToggleColor$3ds2sdk_release", "()I", "setToggleColor$3ds2sdk_release", "(I)V", "defaultColor", "animationDuration", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class InformationZoneView extends FrameLayout {
    private final int animationDuration;
    private int defaultColor;
    private final AppCompatImageView expandArrow;
    private final LinearLayout expandContainer;
    private final ThreeDS2TextView expandLabel;
    private final ThreeDS2TextView expandText;
    private int toggleColor;
    private final StripeInformationZoneViewBinding viewBinding;
    private final AppCompatImageView whyArrow;
    private final LinearLayout whyContainer;
    private final ThreeDS2TextView whyLabel;
    private final ThreeDS2TextView whyText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InformationZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeInformationZoneViewBinding stripeInformationZoneViewBindingInflate = StripeInformationZoneViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeInformationZoneViewBindingInflate, "inflate(...)");
        this.viewBinding = stripeInformationZoneViewBindingInflate;
        ThreeDS2TextView whyLabel = stripeInformationZoneViewBindingInflate.whyLabel;
        Intrinsics.checkNotNullExpressionValue(whyLabel, "whyLabel");
        this.whyLabel = whyLabel;
        ThreeDS2TextView whyText = stripeInformationZoneViewBindingInflate.whyText;
        Intrinsics.checkNotNullExpressionValue(whyText, "whyText");
        this.whyText = whyText;
        LinearLayout whyContainer = stripeInformationZoneViewBindingInflate.whyContainer;
        Intrinsics.checkNotNullExpressionValue(whyContainer, "whyContainer");
        this.whyContainer = whyContainer;
        AppCompatImageView whyArrow = stripeInformationZoneViewBindingInflate.whyArrow;
        Intrinsics.checkNotNullExpressionValue(whyArrow, "whyArrow");
        this.whyArrow = whyArrow;
        ThreeDS2TextView expandLabel = stripeInformationZoneViewBindingInflate.expandLabel;
        Intrinsics.checkNotNullExpressionValue(expandLabel, "expandLabel");
        this.expandLabel = expandLabel;
        ThreeDS2TextView expandText = stripeInformationZoneViewBindingInflate.expandText;
        Intrinsics.checkNotNullExpressionValue(expandText, "expandText");
        this.expandText = expandText;
        LinearLayout expandContainer = stripeInformationZoneViewBindingInflate.expandContainer;
        Intrinsics.checkNotNullExpressionValue(expandContainer, "expandContainer");
        this.expandContainer = expandContainer;
        AppCompatImageView expandArrow = stripeInformationZoneViewBindingInflate.expandArrow;
        Intrinsics.checkNotNullExpressionValue(expandArrow, "expandArrow");
        this.expandArrow = expandArrow;
        this.animationDuration = getResources().getInteger(R.integer.config_shortAnimTime);
        whyContainer.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.InformationZoneView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView._init_$lambda$0(this.f$0, view);
            }
        });
        expandContainer.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.InformationZoneView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView._init_$lambda$1(this.f$0, view);
            }
        });
    }

    /* renamed from: getWhyLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyLabel() {
        return this.whyLabel;
    }

    /* renamed from: getWhyText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhyText() {
        return this.whyText;
    }

    /* renamed from: getWhyContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getWhyContainer() {
        return this.whyContainer;
    }

    /* renamed from: getWhyArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getWhyArrow() {
        return this.whyArrow;
    }

    /* renamed from: getExpandLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandLabel() {
        return this.expandLabel;
    }

    /* renamed from: getExpandText$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getExpandText() {
        return this.expandText;
    }

    /* renamed from: getExpandContainer$3ds2sdk_release, reason: from getter */
    public final LinearLayout getExpandContainer() {
        return this.expandContainer;
    }

    /* renamed from: getExpandArrow$3ds2sdk_release, reason: from getter */
    public final AppCompatImageView getExpandArrow() {
        return this.expandArrow;
    }

    /* renamed from: getToggleColor$3ds2sdk_release, reason: from getter */
    public final int getToggleColor() {
        return this.toggleColor;
    }

    public final void setToggleColor$3ds2sdk_release(int i) {
        this.toggleColor = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(InformationZoneView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.toggleView(this$0.whyArrow, this$0.whyLabel, this$0.whyText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(InformationZoneView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.toggleView(this$0.expandArrow, this$0.expandLabel, this$0.expandText);
    }

    public final void setWhyInfo(String whyInfoLabel, String whyInfoText, LabelCustomization labelCustomization) {
        if (whyInfoLabel == null || StringsKt.isBlank(whyInfoLabel)) {
            return;
        }
        this.whyLabel.setText(whyInfoLabel, labelCustomization);
        this.whyContainer.setVisibility(0);
        this.whyText.setText(whyInfoText, labelCustomization);
    }

    public final void setExpandInfo(String expandInfoLabel, String expandInfoText, LabelCustomization labelCustomization) {
        if (expandInfoLabel == null || StringsKt.isBlank(expandInfoLabel)) {
            return;
        }
        this.expandLabel.setText(expandInfoLabel, labelCustomization);
        this.expandContainer.setVisibility(0);
        this.expandText.setText(expandInfoText, labelCustomization);
    }

    private final void toggleView(View arrow, TextView label, final View detailsView) {
        boolean z = detailsView.getVisibility() == 8;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(arrow, "rotation", z ? EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 0);
        objectAnimatorOfFloat.setDuration(this.animationDuration);
        objectAnimatorOfFloat.start();
        label.setEnabled(z);
        arrow.setEnabled(z);
        if (this.toggleColor != 0) {
            if (this.defaultColor == 0) {
                this.defaultColor = label.getTextColors().getDefaultColor();
            }
            label.setTextColor(z ? this.toggleColor : this.defaultColor);
        }
        detailsView.setVisibility(z ? 0 : 8);
        if (z) {
            detailsView.postDelayed(new Runnable() { // from class: com.stripe.android.stripe3ds2.views.InformationZoneView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    InformationZoneView.toggleView$lambda$2(detailsView);
                }
            }, this.animationDuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleView$lambda$2(View detailsView) {
        Intrinsics.checkNotNullParameter(detailsView, "$detailsView");
        Rect rect = new Rect(0, 0, detailsView.getWidth(), detailsView.getHeight());
        detailsView.getHitRect(rect);
        detailsView.requestRectangleOnScreen(rect, false);
    }
}
