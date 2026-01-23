package com.robinhood.android.common.mcduckling.location;

import com.google.android.gms.tasks.Task;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocationProtectionManager.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a#\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0002¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0002\u001a&\u0010\b\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¨\u0006\r"}, m3636d2 = {"asResult", "T", "", "Lcom/google/android/gms/tasks/Task;", "(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;", "toCompletable", "Lio/reactivex/Completable;", "Ljava/lang/Void;", "asCompletable", "block", "Lkotlin/Function1;", "Lio/reactivex/CompletableEmitter;", "", "feature-lib-mcduckling_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.mcduckling.location.LocationProtectionManagerKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LocationProtectionManager3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T asResult(Task<T> task) throws Exception {
        if (task.isComplete()) {
            if (!task.isCanceled()) {
                Exception exception = task.getException();
                if (exception != null) {
                    throw exception;
                }
                return task.getResult();
            }
            throw new CancellationException("Task " + task + " was cancelled normally");
        }
        throw new IllegalStateException(("Task " + task + " not complete").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Completable toCompletable(final Task<Void> task) {
        return asCompletable(task, new Function1() { // from class: com.robinhood.android.common.mcduckling.location.LocationProtectionManagerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocationProtectionManager3.toCompletable$lambda$1(task, (CompletableEmitter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toCompletable$lambda$1(Task task, CompletableEmitter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        task.addOnCompleteListener(new LocationProtectionManager2(it));
        return Unit.INSTANCE;
    }

    private static final Completable asCompletable(final Task<Void> task, final Function1<? super CompletableEmitter, Unit> function1) {
        Completable completableFromCallable = task.isComplete() ? Completable.fromCallable(new Callable() { // from class: com.robinhood.android.common.mcduckling.location.LocationProtectionManagerKt.asCompletable.1
            @Override // java.util.concurrent.Callable
            public final Void call() {
                return (Void) LocationProtectionManager3.asResult(task);
            }
        }) : Completable.create(new CompletableOnSubscribe(function1) { // from class: com.robinhood.android.common.mcduckling.location.LocationProtectionManagerKt$sam$io_reactivex_CompletableOnSubscribe$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // io.reactivex.CompletableOnSubscribe
            public final /* synthetic */ void subscribe(CompletableEmitter completableEmitter) {
                this.function.invoke(completableEmitter);
            }
        });
        Intrinsics.checkNotNull(completableFromCallable);
        return completableFromCallable;
    }
}
