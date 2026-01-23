package com.robinhood.utils;

import com.robinhood.Logger;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;

/* compiled from: LogoutKillswitch.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0017R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/utils/LogoutKillswitch;", "", "rootScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "logoutSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "loggedInScope", "getLoggedInScope", "()Lkotlinx/coroutines/CoroutineScope;", "killswitchObservable", "Lio/reactivex/Observable;", "getKillswitchObservable", "()Lio/reactivex/Observable;", "killswitchFlowable", "Lio/reactivex/Flowable;", "getKillswitchFlowable", "()Lio/reactivex/Flowable;", "onLoggedOut", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLoggedOut", "()Z", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LogoutKillswitch {
    private final Flowable<Boolean> killswitchFlowable;
    private final Observable<Boolean> killswitchObservable;
    private final CoroutineScope loggedInScope;
    private final BehaviorSubject<Boolean> logoutSubject;

    public LogoutKillswitch(@RootCoroutineScope CoroutineScope rootScope) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        BehaviorSubject<Boolean> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.logoutSubject = behaviorSubjectCreate;
        this.loggedInScope = CoroutineScope2.plus(rootScope, new CoroutineName("Logged In"));
        this.killswitchObservable = behaviorSubjectCreate;
        Flowable<Boolean> flowable = behaviorSubjectCreate.toFlowable(BackpressureStrategy.LATEST);
        Intrinsics.checkNotNullExpressionValue(flowable, "toFlowable(...)");
        this.killswitchFlowable = flowable;
    }

    public final CoroutineScope getLoggedInScope() {
        return this.loggedInScope;
    }

    public final Observable<Boolean> getKillswitchObservable() {
        return this.killswitchObservable;
    }

    public final Flowable<Boolean> getKillswitchFlowable() {
        return this.killswitchFlowable;
    }

    public final Object onLoggedOut(Continuation<? super Unit> continuation) {
        Logger.INSTANCE.mo1683i("LogoutKillswitch terminating all db and network observables", new Object[0]);
        this.logoutSubject.onNext(boxing.boxBoolean(true));
        CoroutineContext.Element element = this.loggedInScope.getCoroutineContext().get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        Job job = (Job) element;
        Job6.cancel$default(job, "Logged out", null, 2, null);
        Object objJoin = job.join(continuation);
        return objJoin == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoin : Unit.INSTANCE;
    }

    public final boolean isLoggedOut() {
        return Intrinsics.areEqual(this.logoutSubject.getValue(), Boolean.TRUE);
    }
}
