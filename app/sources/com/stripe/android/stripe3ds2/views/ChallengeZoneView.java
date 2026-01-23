package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.widget.CompoundButtonCompat;
import com.stripe.android.stripe3ds2.R$id;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneViewBinding;
import com.stripe.android.stripe3ds2.init.p418ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.p418ui.LabelCustomization;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ChallengeZoneView.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020-J\u001c\u0010.\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u000102J\u001c\u00103\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u000102J\u0010\u00105\u001a\u00020,2\b\b\u0001\u00106\u001a\u00020\u0007J\u0010\u00107\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000109J\u001c\u0010:\u001a\u00020,2\b\u0010;\u001a\u0004\u0018\u0001002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=J\u001c\u0010>\u001a\u00020,2\b\u0010?\u001a\u0004\u0018\u0001002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=J\u0010\u0010@\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000109J(\u0010A\u001a\u00020,2\b\u0010%\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0014\u0010'\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006B"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "challengeEntryView", "Landroid/widget/FrameLayout;", "getChallengeEntryView$3ds2sdk_release", "()Landroid/widget/FrameLayout;", "infoHeader", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "getInfoHeader$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "infoTextView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "resendButton", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "getResendButton$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "submitButton", "getSubmitButton$3ds2sdk_release", "whitelistNoRadioButton", "Landroid/widget/RadioButton;", "getWhitelistNoRadioButton$3ds2sdk_release", "()Landroid/widget/RadioButton;", "whitelistRadioGroup", "Landroid/widget/RadioGroup;", "getWhitelistRadioGroup$3ds2sdk_release", "()Landroid/widget/RadioGroup;", "whitelistYesRadioButton", "getWhitelistYesRadioButton$3ds2sdk_release", "whitelistingLabel", "getWhitelistingLabel$3ds2sdk_release", "whitelistingSelection", "", "getWhitelistingSelection$3ds2sdk_release", "()Z", "setChallengeEntryView", "", "Landroid/view/View;", "setInfoHeaderText", "headerText", "", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "setInfoText", "infoText", "setInfoTextIndicator", "indicatorResId", "setResendButtonClickListener", "listener", "Landroid/view/View$OnClickListener;", "setResendButtonLabel", "resendButtonLabel", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "setSubmitButton", "submitButtonLabel", "setSubmitButtonClickListener", "setWhitelistingLabel", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ChallengeZoneView extends LinearLayout {
    private final FrameLayout challengeEntryView;
    private final ThreeDS2HeaderTextView infoHeader;
    private final ThreeDS2TextView infoTextView;
    private final ThreeDS2Button resendButton;
    private final ThreeDS2Button submitButton;
    private final RadioButton whitelistNoRadioButton;
    private final RadioGroup whitelistRadioGroup;
    private final RadioButton whitelistYesRadioButton;
    private final ThreeDS2TextView whitelistingLabel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeChallengeZoneViewBinding stripeChallengeZoneViewBindingInflate = StripeChallengeZoneViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneViewBindingInflate, "inflate(...)");
        ThreeDS2HeaderTextView czvHeader = stripeChallengeZoneViewBindingInflate.czvHeader;
        Intrinsics.checkNotNullExpressionValue(czvHeader, "czvHeader");
        this.infoHeader = czvHeader;
        ThreeDS2TextView czvInfo = stripeChallengeZoneViewBindingInflate.czvInfo;
        Intrinsics.checkNotNullExpressionValue(czvInfo, "czvInfo");
        this.infoTextView = czvInfo;
        ThreeDS2Button czvSubmitButton = stripeChallengeZoneViewBindingInflate.czvSubmitButton;
        Intrinsics.checkNotNullExpressionValue(czvSubmitButton, "czvSubmitButton");
        this.submitButton = czvSubmitButton;
        ThreeDS2Button czvResendButton = stripeChallengeZoneViewBindingInflate.czvResendButton;
        Intrinsics.checkNotNullExpressionValue(czvResendButton, "czvResendButton");
        this.resendButton = czvResendButton;
        ThreeDS2TextView czvWhitelistingLabel = stripeChallengeZoneViewBindingInflate.czvWhitelistingLabel;
        Intrinsics.checkNotNullExpressionValue(czvWhitelistingLabel, "czvWhitelistingLabel");
        this.whitelistingLabel = czvWhitelistingLabel;
        RadioGroup czvWhitelistRadioGroup = stripeChallengeZoneViewBindingInflate.czvWhitelistRadioGroup;
        Intrinsics.checkNotNullExpressionValue(czvWhitelistRadioGroup, "czvWhitelistRadioGroup");
        this.whitelistRadioGroup = czvWhitelistRadioGroup;
        FrameLayout czvEntryView = stripeChallengeZoneViewBindingInflate.czvEntryView;
        Intrinsics.checkNotNullExpressionValue(czvEntryView, "czvEntryView");
        this.challengeEntryView = czvEntryView;
        RadioButton czvWhitelistYesButton = stripeChallengeZoneViewBindingInflate.czvWhitelistYesButton;
        Intrinsics.checkNotNullExpressionValue(czvWhitelistYesButton, "czvWhitelistYesButton");
        this.whitelistYesRadioButton = czvWhitelistYesButton;
        RadioButton czvWhitelistNoButton = stripeChallengeZoneViewBindingInflate.czvWhitelistNoButton;
        Intrinsics.checkNotNullExpressionValue(czvWhitelistNoButton, "czvWhitelistNoButton");
        this.whitelistNoRadioButton = czvWhitelistNoButton;
    }

    /* renamed from: getInfoHeader$3ds2sdk_release, reason: from getter */
    public final ThreeDS2HeaderTextView getInfoHeader() {
        return this.infoHeader;
    }

    /* renamed from: getInfoTextView$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getInfoTextView() {
        return this.infoTextView;
    }

    /* renamed from: getSubmitButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: getResendButton$3ds2sdk_release, reason: from getter */
    public final ThreeDS2Button getResendButton() {
        return this.resendButton;
    }

    /* renamed from: getWhitelistingLabel$3ds2sdk_release, reason: from getter */
    public final ThreeDS2TextView getWhitelistingLabel() {
        return this.whitelistingLabel;
    }

    /* renamed from: getWhitelistRadioGroup$3ds2sdk_release, reason: from getter */
    public final RadioGroup getWhitelistRadioGroup() {
        return this.whitelistRadioGroup;
    }

    /* renamed from: getChallengeEntryView$3ds2sdk_release, reason: from getter */
    public final FrameLayout getChallengeEntryView() {
        return this.challengeEntryView;
    }

    /* renamed from: getWhitelistYesRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistYesRadioButton() {
        return this.whitelistYesRadioButton;
    }

    /* renamed from: getWhitelistNoRadioButton$3ds2sdk_release, reason: from getter */
    public final RadioButton getWhitelistNoRadioButton() {
        return this.whitelistNoRadioButton;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        return this.whitelistRadioGroup.getCheckedRadioButtonId() == R$id.czv_whitelist_yes_button;
    }

    public final void setInfoHeaderText(String headerText, LabelCustomization labelCustomization) {
        if (headerText == null || StringsKt.isBlank(headerText)) {
            this.infoHeader.setVisibility(8);
        } else {
            this.infoHeader.setText(headerText, labelCustomization);
        }
    }

    public final void setInfoText(String infoText, LabelCustomization labelCustomization) {
        if (infoText == null || StringsKt.isBlank(infoText)) {
            this.infoTextView.setVisibility(8);
        } else {
            this.infoTextView.setText(infoText, labelCustomization);
        }
    }

    public final void setInfoTextIndicator(int indicatorResId) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(indicatorResId, 0, 0, 0);
    }

    public final void setSubmitButton(String submitButtonLabel, ButtonCustomization buttonCustomization) {
        if (submitButtonLabel == null || StringsKt.isBlank(submitButtonLabel)) {
            this.submitButton.setVisibility(8);
        } else {
            this.submitButton.setText(submitButtonLabel);
            this.submitButton.setButtonCustomization(buttonCustomization);
        }
    }

    public final void setSubmitButtonClickListener(View.OnClickListener listener) {
        this.submitButton.setOnClickListener(listener);
    }

    public final void setResendButtonLabel(String resendButtonLabel, ButtonCustomization buttonCustomization) {
        if (resendButtonLabel == null || StringsKt.isBlank(resendButtonLabel)) {
            return;
        }
        this.resendButton.setVisibility(0);
        this.resendButton.setText(resendButtonLabel);
        this.resendButton.setButtonCustomization(buttonCustomization);
    }

    public final void setResendButtonClickListener(View.OnClickListener listener) {
        this.resendButton.setOnClickListener(listener);
    }

    public final void setWhitelistingLabel(String whitelistingLabel, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization) {
        if (whitelistingLabel == null || StringsKt.isBlank(whitelistingLabel)) {
            return;
        }
        this.whitelistingLabel.setText(whitelistingLabel, labelCustomization);
        if (buttonCustomization != null) {
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, this.whitelistRadioGroup.getChildCount());
            ArrayList<RadioButton> arrayList = new ArrayList();
            Iterator<Integer> it = primitiveRanges2Until.iterator();
            while (it.hasNext()) {
                View childAt = this.whitelistRadioGroup.getChildAt(((PrimitiveIterators6) it).nextInt());
                RadioButton radioButton = childAt instanceof RadioButton ? (RadioButton) childAt : null;
                if (radioButton != null) {
                    arrayList.add(radioButton);
                }
            }
            for (RadioButton radioButton2 : arrayList) {
                String backgroundColor = buttonCustomization.getBackgroundColor();
                if (backgroundColor != null && !StringsKt.isBlank(backgroundColor)) {
                    CompoundButtonCompat.setButtonTintList(radioButton2, ColorStateList.valueOf(Color.parseColor(buttonCustomization.getBackgroundColor())));
                }
                String textColor = buttonCustomization.getTextColor();
                if (textColor != null && !StringsKt.isBlank(textColor)) {
                    radioButton2.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
                }
            }
        }
        this.whitelistingLabel.setVisibility(0);
        this.whitelistRadioGroup.setVisibility(0);
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        Intrinsics.checkNotNullParameter(challengeEntryView, "challengeEntryView");
        this.challengeEntryView.addView(challengeEntryView);
    }
}
