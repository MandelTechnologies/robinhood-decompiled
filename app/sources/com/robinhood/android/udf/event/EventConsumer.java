package com.robinhood.android.udf.event;

import com.robinhood.android.udf.event.EventConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventConsumer.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J,\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/udf/event/EventConsumer;", "E", "", "consume", "", "event", "Lcom/robinhood/android/udf/event/Event;", "block", "Lkotlin/Function1;", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface EventConsumer<E> {
    void consume(Event<E> event, Function1<? super E, Unit> block);

    /* compiled from: EventConsumer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void consume$default(EventConsumer eventConsumer, Event event, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: consume");
            }
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: com.robinhood.android.udf.event.EventConsumer$DefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EventConsumer.DefaultImpls.consume$lambda$0(obj2);
                    }
                };
            }
            eventConsumer.consume(event, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit consume$lambda$0(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }
}
