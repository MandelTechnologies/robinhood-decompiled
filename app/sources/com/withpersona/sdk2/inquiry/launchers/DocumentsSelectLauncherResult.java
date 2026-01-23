package com.withpersona.sdk2.inquiry.launchers;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: DocumentsSelectLauncherResult.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\t0\u0002J\"\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\rH\u0096A¢\u0006\u0002\u0010\u000eR\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/DocumentsSelectLauncherResult;", "Lkotlinx/coroutines/flow/SharedFlow;", "", "Landroid/net/Uri;", "<init>", "()V", "sendDocuments", "", "uri", "Lkotlin/jvm/JvmSuppressWildcards;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replayCache", "getReplayCache", "()Ljava/util/List;", "Companion", "launchers_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DocumentsSelectLauncherResult implements SharedFlow<List<? extends Uri>> {
    private static final SharedFlow2<List<Uri>> flow = SharedFlow4.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
    private final /* synthetic */ SharedFlow2<List<Uri>> $$delegate_0 = flow;

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super List<? extends Uri>> flowCollector, Continuation<?> continuation) {
        return this.$$delegate_0.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<List<? extends Uri>> getReplayCache() {
        return this.$$delegate_0.getReplayCache();
    }

    public final boolean sendDocuments(List<Uri> uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return flow.tryEmit(uri);
    }
}
