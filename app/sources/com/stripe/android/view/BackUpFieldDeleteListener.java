package com.stripe.android.view;

import android.text.Editable;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackUpFieldDeleteListener.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/BackUpFieldDeleteListener;", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "backUpTarget", "Lcom/stripe/android/view/StripeEditText;", "(Lcom/stripe/android/view/StripeEditText;)V", "onDeleteEmpty", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BackUpFieldDeleteListener implements StripeEditText.DeleteEmptyListener {
    private final StripeEditText backUpTarget;

    public BackUpFieldDeleteListener(StripeEditText backUpTarget) {
        Intrinsics.checkNotNullParameter(backUpTarget, "backUpTarget");
        this.backUpTarget = backUpTarget;
    }

    @Override // com.stripe.android.view.StripeEditText.DeleteEmptyListener
    public void onDeleteEmpty() {
        String string2;
        Editable text = this.backUpTarget.getText();
        if (text == null || (string2 = text.toString()) == null) {
            string2 = "";
        }
        if (string2.length() > 1) {
            StripeEditText stripeEditText = this.backUpTarget;
            String strSubstring = string2.substring(0, string2.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            stripeEditText.setText(strSubstring);
        }
        this.backUpTarget.requestFocus();
        StripeEditText stripeEditText2 = this.backUpTarget;
        stripeEditText2.setSelection(stripeEditText2.length());
    }
}
