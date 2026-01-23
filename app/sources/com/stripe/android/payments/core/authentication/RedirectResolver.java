package com.stripe.android.payments.core.authentication;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: RedirectResolver.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H¦B¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/RedirectResolver;", "", "invoke", "", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface RedirectResolver {
    Object invoke(String str, Continuation<? super String> continuation);
}
