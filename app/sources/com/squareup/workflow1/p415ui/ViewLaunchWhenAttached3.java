package com.squareup.workflow1.p415ui;

import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import com.squareup.workflow1.p415ui.androidx.WorkflowAndroidXSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: ViewLaunchWhenAttached.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0003\u001aG\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m3636d2 = {"ensureAttachedScope", "Lcom/squareup/workflow1/ui/AttachedScope;", "Landroid/view/View;", "launchWhenAttached", "Lkotlinx/coroutines/Job;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.ViewLaunchWhenAttachedKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ViewLaunchWhenAttached3 {
    public static /* synthetic */ Job launchWhenAttached$default(View view, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = CoroutineContextImpl6.INSTANCE;
        }
        return launchWhenAttached(view, coroutineContext, function2);
    }

    public static final Job launchWhenAttached(View view, final CoroutineContext context, final Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        if (context.get(Job.INSTANCE) != null) {
            throw new IllegalArgumentException("Expected custom CoroutineContext to not contain a Job.");
        }
        final ViewLaunchWhenAttached viewLaunchWhenAttachedEnsureAttachedScope = ensureAttachedScope(view);
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.squareup.workflow1.ui.ViewLaunchWhenAttachedKt$launchWhenAttached$launch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BuildersKt.launch(viewLaunchWhenAttachedEnsureAttachedScope.getCoroutineScope(), context, CoroutineStart.UNDISPATCHED, block);
            }
        };
        if (view.isAttachedToWindow()) {
            function0.invoke();
        } else {
            viewLaunchWhenAttachedEnsureAttachedScope.runWhenAttached(function0);
        }
        return JobKt.getJob(viewLaunchWhenAttachedEnsureAttachedScope.getCoroutineScope().getCoroutineContext());
    }

    private static final ViewLaunchWhenAttached ensureAttachedScope(View view) throws Resources.NotFoundException {
        Object tag = view.getTag(R$id.view_attached_coroutine_scope);
        ViewLaunchWhenAttached viewLaunchWhenAttached = null;
        ViewLaunchWhenAttached viewLaunchWhenAttached2 = tag instanceof ViewLaunchWhenAttached ? (ViewLaunchWhenAttached) tag : null;
        if (viewLaunchWhenAttached2 != null && CoroutineScope2.isActive(viewLaunchWhenAttached2.getCoroutineScope())) {
            viewLaunchWhenAttached = viewLaunchWhenAttached2;
        }
        if (viewLaunchWhenAttached != null) {
            return viewLaunchWhenAttached;
        }
        LifecycleOwner lifecycleOwnerLifecycleOwnerFromViewTreeOrContextOrNull = WorkflowAndroidXSupport.INSTANCE.lifecycleOwnerFromViewTreeOrContextOrNull(view);
        if (lifecycleOwnerLifecycleOwnerFromViewTreeOrContextOrNull == null) {
            throw new IllegalStateException("ViewTreeLifecycleOwner is required by View.ensureAttachedScope");
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwner2.getLifecycleScope(lifecycleOwnerLifecycleOwnerFromViewTreeOrContextOrNull);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) view.getClass().getName());
        sb2.append('@');
        sb2.append(view.hashCode());
        sb.append(sb2.toString());
        if (view.getId() != -1) {
            try {
                String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                sb.append('-');
                sb.append(resourceEntryName);
            } catch (Resources.NotFoundException unused) {
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        ViewLaunchWhenAttached viewLaunchWhenAttached3 = new ViewLaunchWhenAttached(CoroutineScope2.plus(lifecycleScope, new CoroutineName(string2)));
        view.setTag(R$id.view_attached_coroutine_scope, viewLaunchWhenAttached3);
        view.addOnAttachStateChangeListener(viewLaunchWhenAttached3);
        return viewLaunchWhenAttached3;
    }
}
