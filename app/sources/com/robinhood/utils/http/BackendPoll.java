package com.robinhood.utils.http;

import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: BackendPoll.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u0005 \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/utils/http/BackendPoll;", "T", "Lio/reactivex/ObservableTransformer;", "Lretrofit2/Response;", "defaultIntervalInSeconds", "", "delayFirstEmit", "", "retryIfNetworkError", "<init>", "(JZZ)V", "delay", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "apply", "Lio/reactivex/ObservableSource;", "upstream", "pollInterval", "getPollInterval", "(Lretrofit2/Response;)Ljava/lang/Long;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BackendPoll<T> implements ObservableTransformer<Response<T>, T> {
    private final long defaultIntervalInSeconds;
    private final Observable<Long> delay;
    private final boolean delayFirstEmit;
    private final boolean retryIfNetworkError;

    @JvmOverloads
    public BackendPoll(long j) {
        this(j, false, false, 6, null);
    }

    @JvmOverloads
    public BackendPoll(long j, boolean z) {
        this(j, z, false, 4, null);
    }

    @JvmOverloads
    public BackendPoll(long j, boolean z, boolean z2) {
        this.defaultIntervalInSeconds = j;
        this.delayFirstEmit = z;
        this.retryIfNetworkError = z2;
        this.delay = Observable.timer(j, TimeUnit.SECONDS);
    }

    public /* synthetic */ BackendPoll(long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource<T> apply(Observable<Response<T>> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = this.defaultIntervalInSeconds;
        final Observable<T> observableRetryWhen = upstream.doOnNext(new Consumer(this) { // from class: com.robinhood.utils.http.BackendPoll$apply$poll$1
            final /* synthetic */ BackendPoll<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Response<T> response) {
                BackendPoll<T> backendPoll = this.this$0;
                Intrinsics.checkNotNull(response);
                Long pollInterval = backendPoll.getPollInterval(response);
                longRef.element = pollInterval != null ? pollInterval.longValue() : ((BackendPoll) this.this$0).defaultIntervalInSeconds;
            }
        }).map(new Function() { // from class: com.robinhood.utils.http.BackendPoll$apply$poll$2
            @Override // io.reactivex.functions.Function
            public final T apply(Response<T> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccessful()) {
                    T tBody = response.body();
                    Intrinsics.checkNotNull(tBody);
                    return tBody;
                }
                throw new HttpException(response);
            }
        }).repeatWhen(new Function() { // from class: com.robinhood.utils.http.BackendPoll$apply$poll$3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<?> apply(Observable<Object> observable) {
                Intrinsics.checkNotNullParameter(observable, "observable");
                final Ref.LongRef longRef2 = longRef;
                return observable.flatMap(new Function() { // from class: com.robinhood.utils.http.BackendPoll$apply$poll$3.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends Long> apply(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Observable.timer(longRef2.element, TimeUnit.SECONDS, Schedulers.m3346io());
                    }
                });
            }
        }).retryWhen(new Function(this) { // from class: com.robinhood.utils.http.BackendPoll$apply$poll$4
            final /* synthetic */ BackendPoll<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<?> apply(Observable<Throwable> observable) {
                Intrinsics.checkNotNullParameter(observable, "observable");
                final BackendPoll<T> backendPoll = this.this$0;
                return observable.flatMap(new Function() { // from class: com.robinhood.utils.http.BackendPoll$apply$poll$4.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends Long> apply(Throwable t) {
                        Long pollInterval;
                        Intrinsics.checkNotNullParameter(t, "t");
                        if (!Throwables.isNetworkRelated(t) || !((BackendPoll) backendPoll).retryIfNetworkError) {
                            return Observable.error(t);
                        }
                        if (!(t instanceof HttpException)) {
                            return ((BackendPoll) backendPoll).delay;
                        }
                        Response<?> response = ((HttpException) t).response();
                        return Observable.timer((response == null || (pollInterval = backendPoll.getPollInterval(response)) == null) ? ((BackendPoll) backendPoll).defaultIntervalInSeconds : pollInterval.longValue(), TimeUnit.SECONDS, Schedulers.m3346io());
                    }
                });
            }
        });
        if (this.delayFirstEmit) {
            ObservableSource<T> observableSourceFlatMap = Observable.timer(this.defaultIntervalInSeconds, TimeUnit.SECONDS).flatMap(new Function() { // from class: com.robinhood.utils.http.BackendPoll.apply.1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends T> apply(Long it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return observableRetryWhen;
                }
            });
            Intrinsics.checkNotNull(observableSourceFlatMap);
            return observableSourceFlatMap;
        }
        Intrinsics.checkNotNull(observableRetryWhen);
        return observableRetryWhen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getPollInterval(Response<?> response) {
        String str = response.headers().get(Headers.POLL_INTERVAL);
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }
}
