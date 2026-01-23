package com.robinhood.android.udf;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OldDuxoLifecycleObserver.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/udf/OldDuxoLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "duxo", "Lcom/robinhood/android/udf/OldDuxo;", "<init>", "(Lcom/robinhood/android/udf/OldDuxo;)V", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OldDuxoLifecycleObserver implements DefaultLifecycleObserver {
    public static final int $stable = 8;
    private final OldDuxo<?> duxo;

    public OldDuxoLifecycleObserver(OldDuxo<?> duxo) {
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        this.duxo = duxo;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.duxo.getLifecycleEvents().accept(LifecycleEvent.ON_CREATE);
        this.duxo.getLifecycleState().accept(LifecycleState.CREATED);
        this.duxo.onCreate();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.duxo.getLifecycleEvents().accept(LifecycleEvent.ON_START);
        this.duxo.getLifecycleState().accept(LifecycleState.STARTED);
        this.duxo.onStart();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.duxo.getLifecycleEvents().accept(LifecycleEvent.ON_RESUME);
        this.duxo.getLifecycleState().accept(LifecycleState.RESUMED);
        this.duxo.onResume();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.duxo.getLifecycleEvents().accept(LifecycleEvent.ON_PAUSE);
        this.duxo.getLifecycleState().accept(LifecycleState.STARTED);
        this.duxo.onPause();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.duxo.getLifecycleEvents().accept(LifecycleEvent.ON_STOP);
        this.duxo.getLifecycleState().accept(LifecycleState.CREATED);
        this.duxo.onStop();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.duxo.getLifecycleEvents().accept(LifecycleEvent.ON_DESTROY);
        this.duxo.getLifecycleState().accept(LifecycleState.DEAD);
        this.duxo.onDestroy();
        this.duxo.getLifecycleEvents().accept(LifecycleEvent.ON_CREATE);
    }
}
