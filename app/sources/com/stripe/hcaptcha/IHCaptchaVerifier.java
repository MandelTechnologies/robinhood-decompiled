package com.stripe.hcaptcha;

import androidx.fragment.app.FragmentActivity;
import com.stripe.hcaptcha.task.OnFailureListener;
import com.stripe.hcaptcha.task.OnLoadedListener;
import com.stripe.hcaptcha.task.OnOpenListener;
import com.stripe.hcaptcha.task.OnSuccessListener;
import kotlin.Metadata;

/* compiled from: IHCaptchaVerifier.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "Lcom/stripe/hcaptcha/task/OnLoadedListener;", "Lcom/stripe/hcaptcha/task/OnOpenListener;", "Lcom/stripe/hcaptcha/task/OnSuccessListener;", "", "Lcom/stripe/hcaptcha/task/OnFailureListener;", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "startVerification", "(Landroidx/fragment/app/FragmentActivity;)V", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface IHCaptchaVerifier extends OnLoadedListener, OnOpenListener, OnSuccessListener<String>, OnFailureListener {
    void startVerification(FragmentActivity activity);
}
