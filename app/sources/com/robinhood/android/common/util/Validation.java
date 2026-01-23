package com.robinhood.android.common.util;

import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Consumers;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Validation.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tJ&\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J$\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0015\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tH\u0007J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\tJ\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/util/Validation;", "", "<init>", "()V", "VALIDATION_DEBOUNCE_IN_MILLIS", "", "isPasswordValid", "", "password", "", "isEmailValid", "email", "subscribeValidator", "Lio/reactivex/disposables/Disposable;", "validator", "Lio/reactivex/Observable;", "inputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "errorStr", "", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", "subscribeValidatorHelper", "Landroid/view/View;", "isAchRoutingNumberValid", "charSequence", "isAchAccountNumberValid", "setError", "", "view", "error", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class Validation {
    public static final int $stable = 0;
    public static final Validation INSTANCE = new Validation();
    private static final long VALIDATION_DEBOUNCE_IN_MILLIS = 1000;

    private Validation() {
    }

    public final boolean isPasswordValid(CharSequence password) {
        Intrinsics.checkNotNullParameter(password, "password");
        return password.length() > 9;
    }

    public final boolean isEmailValid(CharSequence email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    @JvmStatic
    public static final Disposable subscribeValidator(Observable<Boolean> validator, TextInputLayout inputLayout, String errorStr) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(inputLayout, "inputLayout");
        Intrinsics.checkNotNullParameter(errorStr, "errorStr");
        return INSTANCE.subscribeValidatorHelper(validator, inputLayout, errorStr);
    }

    public final Disposable subscribeValidator(Observable<Boolean> validator, RdsTextInputContainerView inputLayout, String errorStr) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(inputLayout, "inputLayout");
        Intrinsics.checkNotNullParameter(errorStr, "errorStr");
        return subscribeValidatorHelper(validator, inputLayout, errorStr);
    }

    private final Disposable subscribeValidatorHelper(Observable<Boolean> validator, final View inputLayout, final String errorStr) {
        Disposable disposableSubscribe = validator.skip(1L).debounce(1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.robinhood.android.common.util.Validation.subscribeValidatorHelper.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                if (!bool.booleanValue()) {
                    Validation.INSTANCE.setError(inputLayout, errorStr);
                } else {
                    Validation.INSTANCE.setError(inputLayout, null);
                }
            }
        }, Consumers.onError());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return disposableSubscribe;
    }

    @JvmStatic
    public static final boolean isAchRoutingNumberValid(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return charSequence.length() == 9;
    }

    public final boolean isAchAccountNumberValid(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        int length = charSequence.length();
        return 1 <= length && length < 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setError(View view, String error) {
        if (view instanceof EditText) {
            ((EditText) view).setError(error);
            return;
        }
        if (view instanceof TextInputLayout) {
            ((TextInputLayout) view).setError(error);
        } else if (view instanceof RdsTextInputContainerView) {
            ((RdsTextInputContainerView) view).setErrorText(error);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(view);
            throw new ExceptionsH();
        }
    }
}
