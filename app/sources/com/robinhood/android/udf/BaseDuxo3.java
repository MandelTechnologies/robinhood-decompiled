package com.robinhood.android.udf;

import com.robinhood.android.udf.event.DuxoEventHandler;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventProducer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0012\u0004\u0012\u0002H\u00040\u0006B+\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0018R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00120\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/udf/BaseEventDuxo;", "DS", "", "VS", "E", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/udf/event/EventProducer;", "initialDataState", "stateProvider", "Lcom/robinhood/android/udf/StateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljava/lang/Object;Lcom/robinhood/android/udf/StateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "eventHandler", "Lcom/robinhood/android/udf/event/DuxoEventHandler;", "eventFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/udf/event/Event;", "getEventFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "submit", "", "eventData", "(Ljava/lang/Object;)V", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.udf.BaseEventDuxo, reason: use source file name */
/* loaded from: classes20.dex */
public class BaseDuxo3<DS, VS, E> extends BaseDuxo<DS, VS> implements EventProducer<E> {
    public static final int $stable = 8;
    private final StateFlow<Event<E>> eventFlow;
    private final DuxoEventHandler<E> eventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDuxo3(DS initialDataState, StateProvider<? super DS, ? extends VS> stateProvider, DuxoBundle duxoBundle) {
        super(initialDataState, stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(initialDataState, "initialDataState");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        DuxoEventHandler<E> duxoEventHandler = new DuxoEventHandler<>(new Function0() { // from class: com.robinhood.android.udf.BaseEventDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getLifecycleScope();
            }
        });
        this.eventHandler = duxoEventHandler;
        this.eventFlow = duxoEventHandler.getEventFlow();
    }

    @Override // com.robinhood.android.udf.event.EventProducer
    public StateFlow<Event<E>> getEventFlow() {
        return this.eventFlow;
    }

    @Override // com.robinhood.android.udf.event.EventProducer
    public void submit(E eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.eventHandler.submit(eventData);
    }
}
