package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneTextViewBinding;
import com.stripe.android.stripe3ds2.init.p418ui.TextBoxCustomization;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ChallengeZoneTextView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", AnnotatedPrivateKey.LABEL, "", "setTextEntryLabel", "(Ljava/lang/String;)V", "text", "setText", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "textBoxCustomization", "setTextBoxCustomization", "(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V", "Lcom/google/android/material/textfield/TextInputLayout;", "infoLabel", "Lcom/google/android/material/textfield/TextInputLayout;", "getInfoLabel$3ds2sdk_release", "()Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/google/android/material/textfield/TextInputEditText;", "textEntryView", "Lcom/google/android/material/textfield/TextInputEditText;", "getTextEntryView$3ds2sdk_release", "()Lcom/google/android/material/textfield/TextInputEditText;", "getUserEntry", "()Ljava/lang/String;", "userEntry", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ChallengeZoneTextView extends LinearLayout {
    private final TextInputLayout infoLabel;
    private final TextInputEditText textEntryView;

    public /* synthetic */ ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StripeChallengeZoneTextViewBinding stripeChallengeZoneTextViewBindingInflate = StripeChallengeZoneTextViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneTextViewBindingInflate, "inflate(...)");
        TextInputLayout label = stripeChallengeZoneTextViewBindingInflate.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        this.infoLabel = label;
        TextInputEditText textEntry = stripeChallengeZoneTextViewBindingInflate.textEntry;
        Intrinsics.checkNotNullExpressionValue(textEntry, "textEntry");
        this.textEntryView = textEntry;
    }

    /* renamed from: getInfoLabel$3ds2sdk_release, reason: from getter */
    public final TextInputLayout getInfoLabel() {
        return this.infoLabel;
    }

    /* renamed from: getTextEntryView$3ds2sdk_release, reason: from getter */
    public final TextInputEditText getTextEntryView() {
        return this.textEntryView;
    }

    public String getUserEntry() {
        Editable text = this.textEntryView.getText();
        String string2 = text != null ? text.toString() : null;
        return string2 == null ? "" : string2;
    }

    public final void setTextEntryLabel(String label) {
        this.infoLabel.setHint(label);
    }

    public final void setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.textEntryView.setText(text);
    }

    public final void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        if (textBoxCustomization == null) {
            return;
        }
        String textColor = textBoxCustomization.getTextColor();
        if (textColor != null) {
            this.textEntryView.setTextColor(Color.parseColor(textColor));
        }
        Integer numValueOf = Integer.valueOf(textBoxCustomization.getTextFontSize());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.textEntryView.setTextSize(2, numValueOf.intValue());
        }
        if (textBoxCustomization.getCornerRadius() >= 0) {
            float cornerRadius = textBoxCustomization.getCornerRadius();
            this.infoLabel.setBoxCornerRadii(cornerRadius, cornerRadius, cornerRadius, cornerRadius);
        }
        String borderColor = textBoxCustomization.getBorderColor();
        if (borderColor != null) {
            this.infoLabel.setBoxBackgroundMode(2);
            this.infoLabel.setBoxStrokeColor(Color.parseColor(borderColor));
        }
        String hintTextColor = textBoxCustomization.getHintTextColor();
        if (hintTextColor != null) {
            this.infoLabel.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(hintTextColor)));
        }
    }
}
