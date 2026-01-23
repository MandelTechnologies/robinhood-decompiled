package com.robinhood.udf;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiEvent.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u000f0\u0011J\u000e\u0010\u0014\u001a\u00028\u0000HÂ\u0003¢\u0006\u0002\u0010\rJ\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/udf/UiEvent;", "T", "", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "value", "", "consumed", "getConsumed", "()Z", "consume", "()Ljava/lang/Object;", "consumeWith", "", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/udf/UiEvent;", "equals", "other", "hashCode", "", "toString", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class UiEvent<T> {
    private boolean consumed;
    private final T data;

    private final T component1() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiEvent copy$default(UiEvent uiEvent, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = uiEvent.data;
        }
        return uiEvent.copy(obj);
    }

    public final UiEvent<T> copy(T data) {
        return new UiEvent<>(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UiEvent) && Intrinsics.areEqual(this.data, ((UiEvent) other).data);
    }

    public int hashCode() {
        T t = this.data;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        return "UiEvent(data=" + this.data + ")";
    }

    public UiEvent(T t) {
        this.data = t;
    }

    public final boolean getConsumed() {
        return this.consumed;
    }

    public final T consume() {
        if (this.consumed) {
            return null;
        }
        this.consumed = true;
        return this.data;
    }

    public final void consumeWith(Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T tConsume = consume();
        if (tConsume != null) {
            block.invoke(tConsume);
        }
    }
}
