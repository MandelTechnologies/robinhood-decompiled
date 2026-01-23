package com.plaid.internal;

import com.plaid.internal.AbstractC6043b4;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;

/* renamed from: com.plaid.internal.T */
/* loaded from: classes16.dex */
public final class C5965T<S, E> implements Call<AbstractC6043b4<? extends S, ? extends E>> {

    /* renamed from: a */
    public final Call<S> f1697a;

    /* renamed from: b */
    public final Converter<ResponseBody, E> f1698b;

    /* renamed from: com.plaid.internal.T$a */
    public static final class a implements Callback<S> {

        /* renamed from: a */
        public final /* synthetic */ Callback<AbstractC6043b4<S, E>> f1699a;

        /* renamed from: b */
        public final /* synthetic */ C5965T<S, E> f1700b;

        public a(Callback<AbstractC6043b4<S, E>> callback, C5965T<S, E> c5965t) {
            this.f1699a = callback;
            this.f1700b = c5965t;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<S> call, Throwable throwable) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f1699a.onResponse(this.f1700b, Response.success(throwable instanceof IOException ? new AbstractC6043b4.b((IOException) throwable) : new AbstractC6043b4.d(throwable)));
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<S> call, Response<S> response) {
            E eConvert;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            S sBody = response.body();
            int iCode = response.code();
            ResponseBody responseBodyErrorBody = response.errorBody();
            if (response.isSuccessful()) {
                if (sBody != null) {
                    this.f1699a.onResponse(this.f1700b, Response.success(new AbstractC6043b4.c(sBody)));
                    return;
                } else {
                    this.f1699a.onResponse(this.f1700b, Response.success(new AbstractC6043b4.d(null)));
                    return;
                }
            }
            if (responseBodyErrorBody == null || responseBodyErrorBody.getContentLength() == 0) {
                eConvert = null;
            } else {
                try {
                    eConvert = this.f1700b.f1698b.convert(responseBodyErrorBody);
                } catch (Exception unused) {
                }
            }
            if (eConvert != null) {
                this.f1699a.onResponse(this.f1700b, Response.success(new AbstractC6043b4.a(eConvert, iCode)));
            } else {
                this.f1699a.onResponse(this.f1700b, Response.success(new AbstractC6043b4.d(null)));
            }
        }
    }

    public C5965T(Call<S> delegate, Converter<ResponseBody, E> errorConverter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(errorConverter, "errorConverter");
        this.f1697a = delegate;
        this.f1698b = errorConverter;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f1697a.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback<AbstractC6043b4<S, E>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f1697a.enqueue(new a(callback, this));
    }

    @Override // retrofit2.Call
    public final Response<AbstractC6043b4<S, E>> execute() {
        throw new UnsupportedOperationException("NetworkResponseCall doesn't support execute");
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f1697a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f1697a.isExecuted();
    }

    @Override // retrofit2.Call
    public final Request request() {
        Request request = this.f1697a.request();
        Intrinsics.checkNotNullExpressionValue(request, "request(...)");
        return request;
    }

    @Override // retrofit2.Call
    public final Timeout timeout() {
        Timeout timeout = this.f1697a.timeout();
        Intrinsics.checkNotNullExpressionValue(timeout, "timeout(...)");
        return timeout;
    }

    @Override // retrofit2.Call
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final C5965T<S, E> m9468clone() {
        Call<S> callM9468clone = this.f1697a.m9468clone();
        Intrinsics.checkNotNullExpressionValue(callM9468clone, "clone(...)");
        return new C5965T<>(callM9468clone, this.f1698b);
    }
}
