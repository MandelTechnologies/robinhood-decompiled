package kotlinx.coroutines.flow;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0018\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/flow/SharingStarted;", "started", "", AnalyticsStrings.BUTTON_EARNINGS_REPLAY, "Lkotlinx/coroutines/flow/SharedFlow;", "shareIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;I)Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharingConfig;", "configureSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/SharingConfig;", "configureSharing", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "shared", "initialValue", "Lkotlinx/coroutines/Job;", "launchSharing$FlowKt__ShareKt", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "launchSharing", "Lkotlinx/coroutines/flow/StateFlow;", "stateIn", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "asSharedFlow", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "asStateFlow", "(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;", "kotlinx-coroutines-core"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 48, m3641xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt, reason: use source file name */
/* loaded from: classes23.dex */
public final /* synthetic */ class Share3 {
    public static /* synthetic */ SharedFlow shareIn$default(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return FlowKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        Share7 share7ConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, i);
        SharedFlow2 sharedFlow2MutableSharedFlow = SharedFlow4.MutableSharedFlow(i, share7ConfigureSharing$FlowKt__ShareKt.extraBufferCapacity, share7ConfigureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new Share5(sharedFlow2MutableSharedFlow, launchSharing$FlowKt__ShareKt(coroutineScope, share7ConfigureSharing$FlowKt__ShareKt.context, share7ConfigureSharing$FlowKt__ShareKt.upstream, sharedFlow2MutableSharedFlow, sharingStarted, SharedFlow4.NO_VALUE));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> Share7<T> configureSharing$FlowKt__ShareKt(Flow<? extends T> flow, int i) {
        ChannelFlow channelFlow;
        Flow<T> flowDropChannelOperators;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i, Channel.INSTANCE.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()) - i;
        if ((flow instanceof ChannelFlow) && (flowDropChannelOperators = (channelFlow = (ChannelFlow) flow).dropChannelOperators()) != null) {
            int i2 = channelFlow.capacity;
            if (i2 != -3 && i2 != -2 && i2 != 0) {
                iCoerceAtLeast = i2;
            } else if (channelFlow.onBufferOverflow == BufferOverflow.SUSPEND) {
                if (i2 == 0) {
                    iCoerceAtLeast = 0;
                }
            } else if (i == 0) {
                iCoerceAtLeast = 1;
            }
            return new Share7<>(flowDropChannelOperators, iCoerceAtLeast, channelFlow.onBufferOverflow, channelFlow.context);
        }
        return new Share7<>(flow, iCoerceAtLeast, BufferOverflow.SUSPEND, CoroutineContextImpl6.INSTANCE);
    }

    private static final <T> Job launchSharing$FlowKt__ShareKt(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow<? extends T> flow, SharedFlow2<T> sharedFlow2, SharingStarted sharingStarted, T t) {
        return BuildersKt.launch(coroutineScope, coroutineContext, Intrinsics.areEqual(sharingStarted, SharingStarted.INSTANCE.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new Share4(sharingStarted, flow, sharedFlow2, t, null));
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t) {
        Share7 share7ConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        StateFlow2 stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(t);
        return new Share6(stateFlow2MutableStateFlow, launchSharing$FlowKt__ShareKt(coroutineScope, share7ConfigureSharing$FlowKt__ShareKt.context, share7ConfigureSharing$FlowKt__ShareKt.upstream, stateFlow2MutableStateFlow, sharingStarted, t));
    }

    public static final <T> SharedFlow<T> asSharedFlow(SharedFlow2<T> sharedFlow2) {
        return new Share5(sharedFlow2, null);
    }

    public static final <T> StateFlow<T> asStateFlow(StateFlow2<T> stateFlow2) {
        return new Share6(stateFlow2, null);
    }
}
