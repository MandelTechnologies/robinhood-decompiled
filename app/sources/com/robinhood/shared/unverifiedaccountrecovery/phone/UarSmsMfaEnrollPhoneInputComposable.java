package com.robinhood.shared.unverifiedaccountrecovery.phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.shared.unverifiedaccountrecovery.C41128R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UarSmsMfaEnrollPhoneInputComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PhoneInputView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "editText", "Lcom/robinhood/android/designsystem/textinput/RdsFormattedEditText;", "getEditText", "()Lcom/robinhood/android/designsystem/textinput/RdsFormattedEditText;", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.PhoneInputView, reason: use source file name */
/* loaded from: classes12.dex */
final class UarSmsMfaEnrollPhoneInputComposable extends FrameLayout {
    private final RdsFormattedEditText editText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UarSmsMfaEnrollPhoneInputComposable(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(C41128R.layout.uar_phone_input, (ViewGroup) this, true);
        View viewFindViewById = findViewById(C41128R.id.uar_phone_edit_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.editText = (RdsFormattedEditText) viewFindViewById;
    }

    public final RdsFormattedEditText getEditText() {
        return this.editText;
    }
}
