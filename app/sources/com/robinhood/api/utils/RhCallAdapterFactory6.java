package com.robinhood.api.utils;

import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import retrofit2.CallAdapter;

/* compiled from: RhCallAdapterFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B/\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0014¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/api/utils/ObservableAdapter;", "R", "Lcom/robinhood/api/utils/RxAdapter;", "Lio/reactivex/Observable;", "callAdapter", "Lretrofit2/CallAdapter;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "throwableTransformer", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "<init>", "(Lretrofit2/CallAdapter;Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;)V", "adapt", "request", "Lokhttp3/Request;", "result", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.ObservableAdapter, reason: use source file name */
/* loaded from: classes16.dex */
final class RhCallAdapterFactory6<R> extends RhCallAdapterFactory8<R, Observable<?>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhCallAdapterFactory6(CallAdapter<R, Observable<?>> callAdapter, LogoutKillswitch logoutKillswitch, RhCallAdapterFactory.ThrowableTransformer throwableTransformer) {
        super(callAdapter, logoutKillswitch, throwableTransformer, null);
        Intrinsics.checkNotNullParameter(callAdapter, "callAdapter");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(throwableTransformer, "throwableTransformer");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.api.utils.RhCallAdapterFactory8
    public Observable<?> adapt(final Request request, Observable<?> result) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        Observable<?> observableSubscribeOn = result.takeUntil(getLogoutKillswitch().getKillswitchObservable()).onErrorResumeNext(new Function(this) { // from class: com.robinhood.api.utils.ObservableAdapter.adapt.1
            final /* synthetic */ RhCallAdapterFactory6<R> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Object> apply(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return Observable.error(this.this$0.getThrowableTransformer().transform(request, throwable));
            }
        }).switchIfEmpty(Observable.error(RhCallAdapterFactory7.create401())).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }
}
