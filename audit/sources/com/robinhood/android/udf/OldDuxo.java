package com.robinhood.android.udf;

import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedCompletable;
import com.robinhood.disposer.ScopedFlowable;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.disposer.ScopedSingle;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OldDuxo.kt */
@Deprecated
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004J\u001c\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0010H&J!\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\b\u0012H&J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/udf/OldDuxo;", "VS", "", "Lcom/robinhood/disposer/LifecycleHost;", "Lcom/robinhood/coroutines/rx/RxFactory;", "states", "Lio/reactivex/Observable;", "getStates", "()Lio/reactivex/Observable;", "statesFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStatesFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "mutate", "", "mutator", "Lkotlin/Function1;", "applyMutation", "Lkotlin/ExtensionFunctionType;", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface OldDuxo<VS> extends LifecycleHost, RxFactory {
    void applyMutation(Function1<? super VS, ? extends VS> mutator);

    Observable<VS> getStates();

    StateFlow<VS> getStatesFlow();

    void mutate(Function1<? super VS, ? extends VS> mutator);

    void onCreate();

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    /* compiled from: OldDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <VS> void onCreate(OldDuxo<VS> oldDuxo) {
        }

        public static <VS> void onDestroy(OldDuxo<VS> oldDuxo) {
        }

        public static <VS> void onPause(OldDuxo<VS> oldDuxo) {
        }

        public static <VS> void onResume(OldDuxo<VS> oldDuxo) {
        }

        public static <VS> void onStart(OldDuxo<VS> oldDuxo) {
        }

        public static <VS> void onStop(OldDuxo<VS> oldDuxo) {
        }

        public static <VS, T> Observable<T> asObservable(OldDuxo<VS> oldDuxo, Flow<? extends T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return RxFactory.DefaultImpls.asObservable(oldDuxo, receiver);
        }

        public static <VS> ScopedCompletable bind(OldDuxo<VS> oldDuxo, Completable receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(oldDuxo, receiver, terminalEvent);
        }

        public static <VS, T> ScopedFlowable<T> bind(OldDuxo<VS> oldDuxo, Flowable<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(oldDuxo, receiver, terminalEvent);
        }

        public static <VS, T> ScopedMaybe<T> bind(OldDuxo<VS> oldDuxo, Maybe<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(oldDuxo, receiver, terminalEvent);
        }

        public static <VS, T> ScopedObservable<T> bind(OldDuxo<VS> oldDuxo, Observable<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(oldDuxo, receiver, terminalEvent);
        }

        public static <VS, T> ScopedSingle<T> bind(OldDuxo<VS> oldDuxo, Single<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(oldDuxo, receiver, terminalEvent);
        }
    }
}
