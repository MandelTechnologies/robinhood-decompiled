package io.bitdrift.capture.common;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainThreadHandler.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lio/bitdrift/capture/common/MainThreadHandler;", "", "<init>", "()V", "Lkotlin/Function0;", "", "run", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "Companion", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MainThreadHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public final Handler getMainHandler() {
        return this.mainHandler;
    }

    public final void run(final Function0<Unit> run) {
        Intrinsics.checkNotNullParameter(run, "run");
        if (INSTANCE.isOnMainThread()) {
            run.invoke();
        } else {
            this.mainHandler.post(new Runnable() { // from class: io.bitdrift.capture.common.MainThreadHandler.run.1
                @Override // java.lang.Runnable
                public final void run() {
                    run.invoke();
                }
            });
        }
    }

    /* compiled from: MainThreadHandler.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"Lio/bitdrift/capture/common/MainThreadHandler$Companion;", "", "()V", "isOnMainThread", "", "platform_jvm_common-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isOnMainThread() {
            return Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper());
        }
    }
}
