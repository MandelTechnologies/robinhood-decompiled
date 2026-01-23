package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Optional.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/Some;", "T", "", "Lcom/robinhood/utils/Optional;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getOrNull", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/utils/Some;", "equals", "", "other", "hashCode", "", "toString", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class Some<T> extends Optional<T> {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Some copy$default(Some some, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = some.value;
        }
        return some.copy(obj);
    }

    @Override // com.robinhood.utils.Optional
    public final T component1() {
        return this.value;
    }

    public final Some<T> copy(T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new Some<>(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Some) && Intrinsics.areEqual(this.value, ((Some) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "Some(value=" + this.value + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Some(T value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final T getValue() {
        return this.value;
    }

    @Override // com.robinhood.utils.Optional
    public T getOrNull() {
        return this.value;
    }
}
