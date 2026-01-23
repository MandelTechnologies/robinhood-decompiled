package com.robinhood.api.utils;

import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.api.utils.RhCallAdapterFactory2;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job4;
import kotlinx.coroutines.JobKt;
import okhttp3.Request;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.Response;

/* compiled from: RhCallAdapterFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002:\u0001\u0012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/api/utils/CoroutinesAdapter;", "R", "Lretrofit2/CallAdapter;", "Lretrofit2/Call;", "responseType", "Ljava/lang/reflect/Type;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "throwableTransformer", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "<init>", "(Ljava/lang/reflect/Type;Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getThrowableTransformer", "()Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "adapt", "call", "ScopedCall", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.CoroutinesAdapter, reason: use source file name */
/* loaded from: classes20.dex */
final class RhCallAdapterFactory2<R> implements CallAdapter<R, Call<R>> {
    private final Type responseType;
    private final CoroutineScope scope;
    private final RhCallAdapterFactory.ThrowableTransformer throwableTransformer;

    public RhCallAdapterFactory2(Type responseType, CoroutineScope scope, RhCallAdapterFactory.ThrowableTransformer throwableTransformer) {
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(throwableTransformer, "throwableTransformer");
        this.responseType = responseType;
        this.scope = scope;
        this.throwableTransformer = throwableTransformer;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    public final RhCallAdapterFactory.ThrowableTransformer getThrowableTransformer() {
        return this.throwableTransformer;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: responseType, reason: from getter */
    public Type getResponseType() {
        return this.responseType;
    }

    @Override // retrofit2.CallAdapter
    public Call<R> adapt(Call<R> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new ScopedCall(JobKt.getJob(this.scope.getCoroutineContext()), call, this.throwableTransformer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RhCallAdapterFactory.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0016J\t\u0010\u0011\u001a\u00020\rH\u0096\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J\u0011\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001J\u0011\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00190\u0019H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/api/utils/CoroutinesAdapter$ScopedCall;", "R", "Lretrofit2/Call;", "job", "Lkotlinx/coroutines/Job;", "source", "throwableTransformer", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "<init>", "(Lkotlinx/coroutines/Job;Lretrofit2/Call;Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;)V", "execute", "Lretrofit2/Response;", "enqueue", "", "callback", "Lretrofit2/Callback;", "clone", "cancel", "isCanceled", "", "isExecuted", "request", "Lokhttp3/Request;", "kotlin.jvm.PlatformType", "timeout", "Lokio/Timeout;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.api.utils.CoroutinesAdapter$ScopedCall */
    static final class ScopedCall<R> implements Call<R> {
        private final Job job;
        private final Call<R> source;
        private final RhCallAdapterFactory.ThrowableTransformer throwableTransformer;

        @Override // retrofit2.Call
        public void cancel() {
            this.source.cancel();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.source.isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.source.isExecuted();
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.source.request();
        }

        @Override // retrofit2.Call
        public Timeout timeout() {
            return this.source.timeout();
        }

        public ScopedCall(Job job, Call<R> source, RhCallAdapterFactory.ThrowableTransformer throwableTransformer) {
            Intrinsics.checkNotNullParameter(job, "job");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(throwableTransformer, "throwableTransformer");
            this.job = job;
            this.source = source;
            this.throwableTransformer = throwableTransformer;
        }

        @Override // retrofit2.Call
        public Response<R> execute() {
            return (Response) BuildersKt__BuildersKt.runBlocking$default(null, new RhCallAdapterFactory4(this, null), 1, null);
        }

        @Override // retrofit2.Call
        public void enqueue(final Callback<R> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Call<R> call = this.source;
            final Job4 job4InvokeOnCompletion = this.job.invokeOnCompletion(new Function1() { // from class: com.robinhood.api.utils.CoroutinesAdapter$ScopedCall$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhCallAdapterFactory2.ScopedCall.enqueue$lambda$0(this.f$0, (Throwable) obj);
                }
            });
            call.enqueue(new Callback<R>() { // from class: com.robinhood.api.utils.CoroutinesAdapter$ScopedCall$enqueue$1
                @Override // retrofit2.Callback
                public void onResponse(Call<R> call2, Response<R> response) {
                    Intrinsics.checkNotNullParameter(call2, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    job4InvokeOnCompletion.dispose();
                    callback.onResponse(call2, response);
                }

                @Override // retrofit2.Callback
                public void onFailure(Call<R> call2, Throwable t) {
                    Intrinsics.checkNotNullParameter(call2, "call");
                    Intrinsics.checkNotNullParameter(t, "t");
                    job4InvokeOnCompletion.dispose();
                    Callback<R> callback2 = callback;
                    RhCallAdapterFactory.ThrowableTransformer throwableTransformer = ((RhCallAdapterFactory2.ScopedCall) this).throwableTransformer;
                    Request request = this.request();
                    Intrinsics.checkNotNullExpressionValue(request, "request(...)");
                    callback2.onFailure(call2, throwableTransformer.transform(request, t));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit enqueue$lambda$0(ScopedCall scopedCall, Throwable th) {
            scopedCall.cancel();
            return Unit.INSTANCE;
        }

        @Override // retrofit2.Call
        /* renamed from: clone, reason: collision with other method in class */
        public Call<R> clone() {
            Job job = this.job;
            Call<R> callClone = this.source.m9468clone();
            Intrinsics.checkNotNullExpressionValue(callClone, "clone(...)");
            return new ScopedCall(job, callClone, this.throwableTransformer);
        }
    }
}
