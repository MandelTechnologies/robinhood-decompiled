package com.robinhood.android.udf;

import com.robinhood.android.udf.event.DuxoEventHandler;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventProducer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0017\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "VS", "", "E", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/udf/event/EventProducer;", "initialViewState", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljava/lang/Object;Lcom/robinhood/android/udf/DuxoBundle;)V", "eventHandler", "Lcom/robinhood/android/udf/event/DuxoEventHandler;", "eventFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/udf/event/Event;", "getEventFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "submit", "", "eventData", "(Ljava/lang/Object;)V", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.udf.BaseIdentityEventDuxo, reason: use source file name */
/* loaded from: classes20.dex */
public class BaseDuxo5<VS, E> extends BaseDuxo4<VS> implements EventProducer<E> {
    public static final int $stable = 8;
    private final StateFlow<Event<E>> eventFlow;
    private final DuxoEventHandler<E> eventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDuxo5(VS initialViewState, DuxoBundle duxoBundle) {
        super(initialViewState, duxoBundle);
        Intrinsics.checkNotNullParameter(initialViewState, "initialViewState");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        DuxoEventHandler<E> duxoEventHandler = new DuxoEventHandler<>(new Function0() { // from class: com.robinhood.android.udf.BaseIdentityEventDuxo$$ExternalSyntheticLambda0
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
