package com.withpersona.sdk2.inquiry.launchers;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: PictureLauncherResult.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0096A¢\u0006\u0002\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/PictureLauncherResult;", "Lkotlinx/coroutines/flow/SharedFlow;", "", "<init>", "()V", "sendStatus", InquiryField.BooleanField.TYPE, "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "Companion", "launchers_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PictureLauncherResult implements SharedFlow<Boolean> {
    private static final SharedFlow2<Boolean> flow = SharedFlow4.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
    private final /* synthetic */ SharedFlow2<Boolean> $$delegate_0 = flow;

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation<?> continuation) {
        return this.$$delegate_0.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<Boolean> getReplayCache() {
        return this.$$delegate_0.getReplayCache();
    }

    public final boolean sendStatus(boolean z) {
        return flow.tryEmit(Boolean.valueOf(z));
    }
}
