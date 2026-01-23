package com.stripe.hcaptcha.task;

import android.os.Handler;
import android.os.Looper;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

/* compiled from: Task.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u001a\u0010*\u001a\u00020)8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, m3636d2 = {"Lcom/stripe/hcaptcha/task/Task;", "TResult", "", "<init>", "()V", "", "reset", "tryCallbacks", "result", "setResult", "(Ljava/lang/Object;)V", "Lcom/stripe/hcaptcha/HCaptchaException;", "exception", "setException", "(Lcom/stripe/hcaptcha/HCaptchaException;)V", "captchaOpened", "Lkotlin/time/Duration;", "tokenExpiration", "scheduleCaptchaExpired-LRDsOJo", "(J)V", "scheduleCaptchaExpired", "Lcom/stripe/hcaptcha/task/OnSuccessListener;", "onSuccessListener", "addOnSuccessListener", "(Lcom/stripe/hcaptcha/task/OnSuccessListener;)Lcom/stripe/hcaptcha/task/Task;", "Lcom/stripe/hcaptcha/task/OnFailureListener;", "onFailureListener", "addOnFailureListener", "(Lcom/stripe/hcaptcha/task/OnFailureListener;)Lcom/stripe/hcaptcha/task/Task;", "", "isComplete", "Z", "isSuccessful", "Ljava/lang/Object;", "Lcom/stripe/hcaptcha/HCaptchaException;", "", "onSuccessListeners", "Ljava/util/List;", "onFailureListeners", "Lcom/stripe/hcaptcha/task/OnOpenListener;", "onOpenListeners", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public class Task<TResult> {
    private HCaptchaException exception;
    private boolean isComplete;
    private boolean isSuccessful;
    private TResult result;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final List<OnSuccessListener<TResult>> onSuccessListeners = new ArrayList();
    private final List<OnFailureListener> onFailureListeners = new ArrayList();
    private final List<OnOpenListener> onOpenListeners = new ArrayList();

    protected Task() {
        reset();
    }

    protected final Handler getHandler() {
        return this.handler;
    }

    private final void reset() {
        this.isComplete = false;
        this.isSuccessful = false;
        this.result = null;
        this.exception = null;
    }

    protected final void setResult(TResult result) {
        this.result = result;
        this.isSuccessful = true;
        this.isComplete = true;
        tryCallbacks();
    }

    protected final void setException(HCaptchaException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.exception = exception;
        this.isSuccessful = false;
        this.isComplete = true;
        tryCallbacks();
    }

    protected final void captchaOpened() {
        Iterator<T> it = this.onOpenListeners.iterator();
        while (it.hasNext()) {
            ((OnOpenListener) it.next()).onOpen();
        }
    }

    /* renamed from: scheduleCaptchaExpired-LRDsOJo, reason: not valid java name */
    protected final void m26983scheduleCaptchaExpiredLRDsOJo(long tokenExpiration) {
        this.handler.postDelayed(new Runnable() { // from class: com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Task.scheduleCaptchaExpired_LRDsOJo$lambda$1(this.f$0);
            }
        }, Duration.m28738getInWholeMillisecondsimpl(tokenExpiration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleCaptchaExpired_LRDsOJo$lambda$1(Task this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<OnFailureListener> it = this$0.onFailureListeners.iterator();
        while (it.hasNext()) {
            it.next().onFailure(new HCaptchaException(HCaptchaError.TOKEN_TIMEOUT, null, 2, null));
        }
    }

    public final Task<TResult> addOnSuccessListener(OnSuccessListener<TResult> onSuccessListener) {
        Intrinsics.checkNotNullParameter(onSuccessListener, "onSuccessListener");
        this.onSuccessListeners.add(onSuccessListener);
        tryCallbacks();
        return this;
    }

    public final Task<TResult> addOnFailureListener(OnFailureListener onFailureListener) {
        Intrinsics.checkNotNullParameter(onFailureListener, "onFailureListener");
        this.onFailureListeners.add(onFailureListener);
        tryCallbacks();
        return this;
    }

    private final void tryCallbacks() {
        TResult tresult = this.result;
        boolean z = false;
        if (tresult != null) {
            Iterator<T> it = this.onSuccessListeners.iterator();
            while (it.hasNext()) {
                ((OnSuccessListener) it.next()).onSuccess(tresult);
                z = true;
            }
        }
        HCaptchaException hCaptchaException = this.exception;
        if (hCaptchaException != null) {
            Iterator<T> it2 = this.onFailureListeners.iterator();
            while (it2.hasNext()) {
                ((OnFailureListener) it2.next()).onFailure(hCaptchaException);
                z = true;
            }
        }
        if (z) {
            reset();
        }
    }
}
