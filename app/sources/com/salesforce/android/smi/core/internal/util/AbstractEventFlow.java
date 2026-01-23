package com.salesforce.android.smi.core.internal.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: AbstractEventFlow.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/util/AbstractEventFlow;", "T", "", AnalyticsStrings.BUTTON_EARNINGS_REPLAY, "", "bufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;)V", "_flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "flow", "Lkotlinx/coroutines/flow/SharedFlow;", "getFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "sendEvent", "", "event", "(Ljava/lang/Object;)Z", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class AbstractEventFlow<T> {
    private final SharedFlow2<T> _flow;
    private final SharedFlow<T> flow;

    public AbstractEventFlow(int i, BufferOverflow bufferOverflow) {
        Intrinsics.checkNotNullParameter(bufferOverflow, "bufferOverflow");
        SharedFlow2<T> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(i, 0, bufferOverflow, 2, null);
        this._flow = sharedFlow2MutableSharedFlow$default;
        this.flow = FlowKt.asSharedFlow(sharedFlow2MutableSharedFlow$default);
    }

    public /* synthetic */ AbstractEventFlow(int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? BufferOverflow.DROP_OLDEST : bufferOverflow);
    }

    public final SharedFlow<T> getFlow() {
        return this.flow;
    }

    public final boolean sendEvent(T event) {
        return this._flow.tryEmit(event);
    }
}
