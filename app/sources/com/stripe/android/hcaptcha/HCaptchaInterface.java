package com.stripe.android.hcaptcha;

import androidx.fragment.app.FragmentActivity;
import com.stripe.hcaptcha.HCaptcha;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.HCaptchaTokenResponse;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaOrientation;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.config.HCaptchaTheme;
import com.stripe.hcaptcha.task.OnFailureListener;
import com.stripe.hcaptcha.task.OnSuccessListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: HCaptchaInterface.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0087@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"performPassiveHCaptcha", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "siteKey", "rqdata", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.hcaptcha.HCaptchaInterfaceKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class HCaptchaInterface {
    public static final Object performPassiveHCaptcha(FragmentActivity fragmentActivity, String str, String str2, Continuation<? super String> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        HCaptcha client$default = HCaptcha.Companion.getClient$default(HCaptcha.INSTANCE, fragmentActivity, null, 2, null);
        client$default.addOnSuccessListener(new OnSuccessListener<HCaptchaTokenResponse>() { // from class: com.stripe.android.hcaptcha.HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1
            @Override // com.stripe.hcaptcha.task.OnSuccessListener
            public void onSuccess(HCaptchaTokenResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                cancellableContinuationImpl.resume((CancellableContinuation<String>) result.getTokenResult(), (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: com.stripe.android.hcaptcha.HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$1$onSuccess$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                });
            }
        });
        client$default.addOnFailureListener(new OnFailureListener() { // from class: com.stripe.android.hcaptcha.HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$2
            @Override // com.stripe.hcaptcha.task.OnFailureListener
            public void onFailure(HCaptchaException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                cancellableContinuationImpl.resume((CancellableContinuation<String>) exception.getHCaptchaError().name(), (Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: com.stripe.android.hcaptcha.HCaptchaInterfaceKt$performPassiveHCaptcha$2$hcaptcha$1$2$onFailure$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                });
            }
        });
        client$default.setup(new HCaptchaConfig(str, false, false, true, (str2 == null || str2.length() == 0) ? null : str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, HCaptchaSize.INVISIBLE, (HCaptchaOrientation) null, (HCaptchaTheme) null, (String) null, (String) null, (Function2) new Function2<HCaptchaConfig, HCaptchaException, Boolean>() { // from class: com.stripe.android.hcaptcha.HCaptchaInterfaceKt$performPassiveHCaptcha$2$config$1
            @Override // kotlin.jvm.functions.Function2
            public final Boolean invoke(HCaptchaConfig hCaptchaConfig, HCaptchaException exception) {
                Intrinsics.checkNotNullParameter(hCaptchaConfig, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(exception, "exception");
                return Boolean.valueOf(exception.getHCaptchaError() == HCaptchaError.SESSION_TIMEOUT);
            }
        }, 0L, true, 194530, (DefaultConstructorMarker) null)).verifyWithHCaptcha();
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
