package com.robinhood.android.idl.common.pagination;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdlPaginatedResult.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "T", "", "result", "previous", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "next", "<init>", "(Ljava/lang/Object;Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPrevious", "()Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "getNext", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;)Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResult;", "equals", "", "other", "hashCode", "", "toString", "", "lib-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IdlPaginatedResult<T> {
    private final IdlPaginationCursor next;
    private final IdlPaginationCursor previous;
    private final T result;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdlPaginatedResult copy$default(IdlPaginatedResult idlPaginatedResult, Object obj, IdlPaginationCursor idlPaginationCursor, IdlPaginationCursor idlPaginationCursor2, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = idlPaginatedResult.result;
        }
        if ((i & 2) != 0) {
            idlPaginationCursor = idlPaginatedResult.previous;
        }
        if ((i & 4) != 0) {
            idlPaginationCursor2 = idlPaginatedResult.next;
        }
        return idlPaginatedResult.copy(obj, idlPaginationCursor, idlPaginationCursor2);
    }

    public final T component1() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final IdlPaginationCursor getPrevious() {
        return this.previous;
    }

    /* renamed from: component3, reason: from getter */
    public final IdlPaginationCursor getNext() {
        return this.next;
    }

    public final IdlPaginatedResult<T> copy(T result, IdlPaginationCursor previous, IdlPaginationCursor next) {
        return new IdlPaginatedResult<>(result, previous, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdlPaginatedResult)) {
            return false;
        }
        IdlPaginatedResult idlPaginatedResult = (IdlPaginatedResult) other;
        return Intrinsics.areEqual(this.result, idlPaginatedResult.result) && Intrinsics.areEqual(this.previous, idlPaginatedResult.previous) && Intrinsics.areEqual(this.next, idlPaginatedResult.next);
    }

    public int hashCode() {
        T t = this.result;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        IdlPaginationCursor idlPaginationCursor = this.previous;
        int iHashCode2 = (iHashCode + (idlPaginationCursor == null ? 0 : idlPaginationCursor.hashCode())) * 31;
        IdlPaginationCursor idlPaginationCursor2 = this.next;
        return iHashCode2 + (idlPaginationCursor2 != null ? idlPaginationCursor2.hashCode() : 0);
    }

    public String toString() {
        return "IdlPaginatedResult(result=" + this.result + ", previous=" + this.previous + ", next=" + this.next + ")";
    }

    public IdlPaginatedResult(T t, IdlPaginationCursor idlPaginationCursor, IdlPaginationCursor idlPaginationCursor2) {
        this.result = t;
        this.previous = idlPaginationCursor;
        this.next = idlPaginationCursor2;
    }

    public /* synthetic */ IdlPaginatedResult(Object obj, IdlPaginationCursor idlPaginationCursor, IdlPaginationCursor idlPaginationCursor2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : idlPaginationCursor, (i & 4) != 0 ? null : idlPaginationCursor2);
    }

    public final T getResult() {
        return this.result;
    }

    public final IdlPaginationCursor getPrevious() {
        return this.previous;
    }

    public final IdlPaginationCursor getNext() {
        return this.next;
    }
}
