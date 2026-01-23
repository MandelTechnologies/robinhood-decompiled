package com.stripe.hcaptcha.task;

import com.stripe.hcaptcha.HCaptchaException;
import kotlin.Metadata;

/* compiled from: OnFailureListener.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/hcaptcha/task/OnFailureListener;", "", "onFailure", "", "exception", "Lcom/stripe/hcaptcha/HCaptchaException;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface OnFailureListener {
    void onFailure(HCaptchaException exception);
}
