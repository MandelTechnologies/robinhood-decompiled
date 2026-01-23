package com.robinhood.android.udf;

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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: Duxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/udf/Duxo;", "VS", "", "Lcom/robinhood/disposer/LifecycleHost;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "onCreate", "", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Duxo<VS> extends LifecycleHost {
    StateFlow<VS> getStateFlow();

    void onCreate();

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    /* compiled from: Duxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <VS> void onCreate(Duxo<? extends VS> duxo) {
        }

        public static <VS> void onDestroy(Duxo<? extends VS> duxo) {
        }

        public static <VS> void onPause(Duxo<? extends VS> duxo) {
        }

        public static <VS> void onResume(Duxo<? extends VS> duxo) {
        }

        public static <VS> void onStart(Duxo<? extends VS> duxo) {
        }

        public static <VS> void onStop(Duxo<? extends VS> duxo) {
        }

        public static <VS> ScopedCompletable bind(Duxo<? extends VS> duxo, Completable receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(duxo, receiver, terminalEvent);
        }

        public static <VS, T> ScopedFlowable<T> bind(Duxo<? extends VS> duxo, Flowable<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(duxo, receiver, terminalEvent);
        }

        public static <VS, T> ScopedMaybe<T> bind(Duxo<? extends VS> duxo, Maybe<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(duxo, receiver, terminalEvent);
        }

        public static <VS, T> ScopedObservable<T> bind(Duxo<? extends VS> duxo, Observable<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(duxo, receiver, terminalEvent);
        }

        public static <VS, T> ScopedSingle<T> bind(Duxo<? extends VS> duxo, Single<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return LifecycleHost.DefaultImpls.bind(duxo, receiver, terminalEvent);
        }
    }
}
