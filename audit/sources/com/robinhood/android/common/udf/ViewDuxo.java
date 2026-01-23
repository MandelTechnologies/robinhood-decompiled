package com.robinhood.android.common.udf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.view.ViewAttachState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.DisposerKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.schedulers.Schedulers;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/udf/ViewDuxo;", "VS", "", "Lcom/robinhood/android/udf/OldBaseDuxo;", "hostView", "Landroid/view/View;", "initialState", "mutationScheduler", "Lio/reactivex/Scheduler;", "<init>", "(Landroid/view/View;Ljava/lang/Object;Lio/reactivex/Scheduler;)V", "bindToLifecycle", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public class ViewDuxo<VS> extends OldBaseDuxo<VS> {
    public static final int $stable = OldBaseDuxo.$stable;

    public /* synthetic */ ViewDuxo(View view, Object obj, Scheduler scheduler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, obj, (i & 4) != 0 ? Schedulers.single() : scheduler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewDuxo(View hostView, VS initialState, Scheduler mutationScheduler) {
        super(initialState, mutationScheduler);
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(mutationScheduler, "mutationScheduler");
        bindToLifecycle(hostView);
    }

    @SuppressLint({"CheckResult"})
    private final void bindToLifecycle(View hostView) {
        Context context = hostView.getContext();
        Intrinsics.checkNotNull(context);
        BaseActivity baseActivityRequireBaseActivityBaseContext = Contexts7.requireBaseActivityBaseContext(context);
        Observable<Boolean> observableAttachState = ViewAttachState.attachState(hostView);
        BehaviorRelay<LifecycleState> lifecycleState = baseActivityRequireBaseActivityBaseContext.getLifecycleState();
        Observable observableJust = Observable.just(LifecycleState.DEAD);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        ConnectableObservable connectableObservablePublish = ObservablesKt.connectWhen(lifecycleState, observableAttachState, observableJust).distinctUntilChanged().publish();
        Intrinsics.checkNotNull(connectableObservablePublish);
        ConnectableObservable<LifecycleEvent> connectableObservablePublish2 = DisposerKt.transitionEvents(connectableObservablePublish).publish();
        connectableObservablePublish.subscribe(getLifecycleState());
        connectableObservablePublish2.subscribe(getLifecycleEvents());
        connectableObservablePublish2.subscribe(new Consumer(this) { // from class: com.robinhood.android.common.udf.ViewDuxo.bindToLifecycle.1
            final /* synthetic */ ViewDuxo<VS> this$0;

            /* compiled from: ViewDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.common.udf.ViewDuxo$bindToLifecycle$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LifecycleEvent.values().length];
                    try {
                        iArr[LifecycleEvent.ON_CREATE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LifecycleEvent.ON_START.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[LifecycleEvent.ON_RESUME.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[LifecycleEvent.ON_PAUSE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[LifecycleEvent.ON_STOP.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[LifecycleEvent.ON_DESTROY.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(LifecycleEvent lifecycleEvent) {
                switch (lifecycleEvent == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lifecycleEvent.ordinal()]) {
                    case 1:
                        this.this$0.onCreate();
                        return;
                    case 2:
                        this.this$0.onStart();
                        return;
                    case 3:
                        this.this$0.onResume();
                        return;
                    case 4:
                        this.this$0.onPause();
                        return;
                    case 5:
                        this.this$0.onStop();
                        return;
                    case 6:
                        this.this$0.onDestroy();
                        return;
                    default:
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(lifecycleEvent);
                        throw new ExceptionsH();
                }
            }
        });
        connectableObservablePublish2.connect();
        connectableObservablePublish.connect();
    }
}
