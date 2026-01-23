package com.squareup.workflow1.p415ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.JobKt;

/* compiled from: ViewLaunchWhenAttached.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0012\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/squareup/workflow1/ui/AttachedScope;", "Landroid/view/View$OnAttachStateChangeListener;", "parentCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "attachHandlers", "", "Lkotlin/Function0;", "", "attachedJob", "Lkotlinx/coroutines/CompletableJob;", "coroutineScope", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "onViewAttachedToWindow", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "runWhenAttached", "block", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.AttachedScope, reason: use source file name */
/* loaded from: classes12.dex */
final class ViewLaunchWhenAttached implements View.OnAttachStateChangeListener {
    private final List<Function0<Unit>> attachHandlers;
    private final CompletableJob attachedJob;
    private final CoroutineScope coroutineScope;

    public ViewLaunchWhenAttached(CoroutineScope parentCoroutineScope) {
        Intrinsics.checkNotNullParameter(parentCoroutineScope, "parentCoroutineScope");
        this.attachHandlers = new ArrayList();
        CompletableJob completableJobJob = JobKt.Job(JobKt.getJob(parentCoroutineScope.getCoroutineContext()));
        completableJobJob.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.squareup.workflow1.ui.AttachedScope$attachedJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.this$0.attachHandlers.clear();
            }
        });
        this.attachedJob = completableJobJob;
        this.coroutineScope = CoroutineScope2.plus(parentCoroutineScope, completableJobJob);
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void runWhenAttached(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!CoroutineScope2.isActive(this.coroutineScope)) {
            throw new IllegalStateException("Expected AttachedScope to be active when adding attach handler.");
        }
        this.attachHandlers.add(block);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        List<Function0<Unit>> list = this.attachHandlers;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        list.clear();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        CoroutineScope2.cancel$default(this.coroutineScope, "View detached", null, 2, null);
        v.removeOnAttachStateChangeListener(this);
    }
}
