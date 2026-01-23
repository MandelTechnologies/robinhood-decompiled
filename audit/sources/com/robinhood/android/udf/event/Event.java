package com.robinhood.android.udf.event;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Event.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\f¢\u0006\u0004\b\t\u0010\rJ.\u0010\u0016\u001a\u00020\u0017\"\n\b\u0001\u0010\u0018\u0018\u0001*\u00028\u00002\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020\u00170\u001aH\u0086\bø\u0001\u0000J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016R\u001e\u0010\u0003\u001a\u00028\u00008\u0000X\u0081\u0004¢\u0006\u0010\n\u0002\u0010\u0012\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/udf/event/Event;", "E", "", WebsocketGatewayConstants.DATA_KEY, "id", "Ljava/util/UUID;", "getEventConsumer", "Lkotlin/Function0;", "Lcom/robinhood/android/udf/event/EventConsumer;", "<init>", "(Ljava/lang/Object;Ljava/util/UUID;Lkotlin/jvm/functions/Function0;)V", "eventConsumerRef", "Ljava/lang/ref/WeakReference;", "(Ljava/lang/Object;Ljava/util/UUID;Ljava/lang/ref/WeakReference;)V", "getData$annotations", "()V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getGetEventConsumer$annotations", "getGetEventConsumer", "()Lkotlin/jvm/functions/Function0;", "consumeIfType", "", "T", "block", "Lkotlin/Function1;", "equals", "", "other", "hashCode", "", "toString", "", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class Event<E> {
    public static final int $stable = 0;
    private final E data;
    private final Function0<EventConsumer<E>> getEventConsumer;
    private final UUID id;

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getGetEventConsumer$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Event(E data, UUID id, Function0<? extends EventConsumer<E>> getEventConsumer) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(getEventConsumer, "getEventConsumer");
        this.data = data;
        this.id = id;
        this.getEventConsumer = getEventConsumer;
    }

    public final E getData() {
        return this.data;
    }

    public /* synthetic */ Event(Object obj, UUID uuid, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? UUID.randomUUID() : uuid, (Function0<? extends EventConsumer<Object>>) function0);
    }

    public final Function0<EventConsumer<E>> getGetEventConsumer() {
        return this.getEventConsumer;
    }

    public /* synthetic */ Event(Object obj, UUID uuid, WeakReference weakReference, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? UUID.randomUUID() : uuid, (WeakReference<EventConsumer<Object>>) weakReference);
    }

    /* compiled from: Event.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.udf.event.Event$1 */
    /* loaded from: classes9.dex */
    /* synthetic */ class C312571 extends FunctionReferenceImpl implements Function0<EventConsumer<E>> {
        C312571(Object obj) {
            super(0, obj, WeakReference.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final EventConsumer<E> invoke() {
            return (EventConsumer) ((WeakReference) this.receiver).get();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Event(E data, UUID id, WeakReference<EventConsumer<E>> eventConsumerRef) {
        this(data, id, new C312571(eventConsumerRef));
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(eventConsumerRef, "eventConsumerRef");
    }

    public final /* synthetic */ <T extends E> void consumeIfType(final Function1<? super T, Unit> block) {
        EventConsumer<E> eventConsumerInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        E data = getData();
        Intrinsics.reifiedOperationMarker(3, "T");
        if (data == null || (eventConsumerInvoke = getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(this, new Function1<E, Unit>() { // from class: com.robinhood.android.udf.event.Event.consumeIfType.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C312581) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(E it) {
                Intrinsics.checkNotNullParameter(it, "it");
                block.invoke(this.getData());
            }
        });
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Event.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.robinhood.android.udf.event.Event<*>");
        Event event = (Event) other;
        return Intrinsics.areEqual(this.id, event.id) && Intrinsics.areEqual(this.data, event.data);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.id.hashCode();
    }

    public String toString() {
        return StringsKt.trimIndent("\n            Event(\n                id = " + this.id + "\n                data = " + this.data + "\n            )\n        ");
    }
}
