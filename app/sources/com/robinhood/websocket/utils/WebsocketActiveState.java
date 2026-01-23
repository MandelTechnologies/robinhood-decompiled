package com.robinhood.websocket.utils;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: WebsocketActiveState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J-\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/websocket/utils/WebsocketActiveState;", "Lcom/robinhood/websocket/utils/WebsocketLifecycleBinder;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "defaultValue", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "isWebsocketActive", "websocketLifecycleJobs", "", "Lkotlinx/coroutines/Job;", "set", "", "get", "launchWithLifecycle", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "lib-websocket_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class WebsocketActiveState implements WebsocketActiveState3 {
    private boolean isWebsocketActive;
    private final CoroutineScope rootCoroutineScope;
    private final Set<Job> websocketLifecycleJobs;

    public WebsocketActiveState(CoroutineScope rootCoroutineScope, boolean z) {
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        this.rootCoroutineScope = rootCoroutineScope;
        this.isWebsocketActive = z;
        this.websocketLifecycleJobs = new LinkedHashSet();
    }

    public final void set(boolean isWebsocketActive) {
        synchronized (this) {
            try {
                this.isWebsocketActive = isWebsocketActive;
                if (!isWebsocketActive) {
                    Iterator<T> it = this.websocketLifecycleJobs.iterator();
                    while (it.hasNext()) {
                        Job.DefaultImpls.cancel$default((Job) it.next(), null, 1, null);
                    }
                    this.websocketLifecycleJobs.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: get, reason: from getter */
    public final boolean getIsWebsocketActive() {
        return this.isWebsocketActive;
    }

    @Override // com.robinhood.websocket.utils.WebsocketActiveState3
    public Job launchWithLifecycle(Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            if (!this.isWebsocketActive) {
                return null;
            }
            final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.rootCoroutineScope, null, null, new WebsocketActiveState2(block, null), 3, null);
            this.websocketLifecycleJobs.add(jobLaunch$default);
            jobLaunch$default.invokeOnCompletion(new Function1() { // from class: com.robinhood.websocket.utils.WebsocketActiveState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebsocketActiveState.launchWithLifecycle$lambda$4$lambda$3(this.f$0, jobLaunch$default, (Throwable) obj);
                }
            });
            return jobLaunch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchWithLifecycle$lambda$4$lambda$3(WebsocketActiveState websocketActiveState, Job job, Throwable th) {
        synchronized (websocketActiveState) {
            websocketActiveState.websocketLifecycleJobs.remove(job);
        }
        return Unit.INSTANCE;
    }
}
