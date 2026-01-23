package com.robinhood.android.udf.event;

import android.annotation.SuppressLint;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EventCompose.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001ab\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\n\b\u0001\u0010\u0003\u0018\u0001*\u0002H\u0004*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0087\b¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u000f\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u000fH\u0086\b¨\u0006\u0010"}, m3636d2 = {"collectEventAsStateWithLifecycle", "Landroidx/compose/runtime/State;", "Lcom/robinhood/android/udf/event/Event;", "E", "T", "", "Lkotlinx/coroutines/flow/StateFlow;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "filterIsEventInstance", "Lkotlinx/coroutines/flow/Flow;", "lib-udf_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.udf.event.EventComposeKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class EventCompose {
    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final /* synthetic */ <T, E extends T> SnapshotState4<Event<E>> collectEventAsStateWithLifecycle(StateFlow<Event<T>> stateFlow, LifecycleOwner lifecycleOwner, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(stateFlow, "<this>");
        composer.startReplaceGroup(-523522313);
        if ((i2 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i2 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i2 & 4) != 0) {
            coroutineContext = CoroutineContextImpl6.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        Intrinsics.needClassReification();
        C31259x4100da09 c31259x4100da09 = new C31259x4100da09(stateFlow);
        Event<T> value = stateFlow.getValue();
        Event<T> event = value;
        T data = event != null ? event.getData() : null;
        Intrinsics.reifiedOperationMarker(3, "E");
        if (data == null) {
            value = null;
        }
        SnapshotState4<Event<E>> snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(c31259x4100da09, value, lifecycleOwner.getLifecycle(), state2, coroutineContext2, composer, (i << 3) & 64512, 0);
        composer.endReplaceGroup();
        return snapshotState4CollectAsStateWithLifecycle;
    }

    public static final /* synthetic */ <E> Flow<Event<E>> filterIsEventInstance(Flow<? extends Event<?>> flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.needClassReification();
        return new EventComposeKt$filterIsEventInstance$$inlined$filter$1(flow);
    }
}
