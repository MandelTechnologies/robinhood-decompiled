package com.stripe.android.payments.core.authentication;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RedirectResolver.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0017¢\u0006\u0002\u0010\u0002B\"\u0012\u001b\u0010\u0003\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096B¢\u0006\u0002\u0010\rR#\u0010\u0003\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/RealRedirectResolver;", "Lcom/stripe/android/payments/core/authentication/RedirectResolver;", "()V", "configureSSL", "Lkotlin/Function1;", "Ljavax/net/ssl/HttpsURLConnection;", "", "Lcom/stripe/android/payments/core/authentication/ConfigureSslHandler;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.core.authentication.RealRedirectResolver, reason: use source file name */
/* loaded from: classes22.dex */
public final class RedirectResolver2 implements RedirectResolver {
    private final Function1<HttpsURLConnection, Unit> configureSSL;

    /* JADX WARN: Multi-variable type inference failed */
    public RedirectResolver2(Function1<? super HttpsURLConnection, Unit> configureSSL) {
        Intrinsics.checkNotNullParameter(configureSSL, "configureSSL");
        this.configureSSL = configureSSL;
    }

    public RedirectResolver2() {
        this(new Function1<HttpsURLConnection, Unit>() { // from class: com.stripe.android.payments.core.authentication.RealRedirectResolver.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(HttpsURLConnection httpsURLConnection) {
                Intrinsics.checkNotNullParameter(httpsURLConnection, "$this$null");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpsURLConnection httpsURLConnection) {
                invoke2(httpsURLConnection);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.payments.core.authentication.RedirectResolver
    public Object invoke(String str, Continuation<? super String> continuation) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            if (httpURLConnection instanceof HttpsURLConnection) {
                this.configureSSL.invoke(httpURLConnection);
            }
            httpURLConnection.getResponseCode();
            objM28550constructorimpl = Result.m28550constructorimpl(httpURLConnection.getURL().toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null ? objM28550constructorimpl : str;
    }
}
