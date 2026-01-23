package com.robinhood.api.utils;

import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.utils.LogoutKillswitch;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* compiled from: RhCallAdapterFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B-\b\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0019\u0010\u0012\u001a\u00028\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0019R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u001a\u001b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/api/utils/RxAdapter;", "R", "T", "", "Lretrofit2/CallAdapter;", "callAdapter", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "throwableTransformer", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "<init>", "(Lretrofit2/CallAdapter;Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;)V", "getLogoutKillswitch", "()Lcom/robinhood/utils/LogoutKillswitch;", "getThrowableTransformer", "()Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "responseType", "Ljava/lang/reflect/Type;", "adapt", "call", "Lretrofit2/Call;", "(Lretrofit2/Call;)Ljava/lang/Object;", "request", "Lokhttp3/Request;", "result", "(Lokhttp3/Request;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/robinhood/api/utils/MaybeAdapter;", "Lcom/robinhood/api/utils/ObservableAdapter;", "Lcom/robinhood/api/utils/SingleAdapter;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.RxAdapter, reason: use source file name */
/* loaded from: classes16.dex */
abstract class RhCallAdapterFactory8<R, T> implements CallAdapter<R, T> {
    private final CallAdapter<R, T> callAdapter;
    private final LogoutKillswitch logoutKillswitch;
    private final RhCallAdapterFactory.ThrowableTransformer throwableTransformer;

    public /* synthetic */ RhCallAdapterFactory8(CallAdapter callAdapter, LogoutKillswitch logoutKillswitch, RhCallAdapterFactory.ThrowableTransformer throwableTransformer, DefaultConstructorMarker defaultConstructorMarker) {
        this(callAdapter, logoutKillswitch, throwableTransformer);
    }

    protected abstract T adapt(Request request, T result);

    private RhCallAdapterFactory8(CallAdapter<R, T> callAdapter, LogoutKillswitch logoutKillswitch, RhCallAdapterFactory.ThrowableTransformer throwableTransformer) {
        this.callAdapter = callAdapter;
        this.logoutKillswitch = logoutKillswitch;
        this.throwableTransformer = throwableTransformer;
    }

    protected final LogoutKillswitch getLogoutKillswitch() {
        return this.logoutKillswitch;
    }

    protected final RhCallAdapterFactory.ThrowableTransformer getThrowableTransformer() {
        return this.throwableTransformer;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: responseType */
    public final Type getResponseType() {
        Type responseType = this.callAdapter.getResponseType();
        Intrinsics.checkNotNullExpressionValue(responseType, "responseType(...)");
        return responseType;
    }

    @Override // retrofit2.CallAdapter
    public final T adapt(Call<R> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Request request = call.request();
        Intrinsics.checkNotNullExpressionValue(request, "request(...)");
        T tAdapt = this.callAdapter.adapt(call);
        Intrinsics.checkNotNullExpressionValue(tAdapt, "adapt(...)");
        return adapt(request, tAdapt);
    }
}
