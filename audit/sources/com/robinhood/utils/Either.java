package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Either.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0002\u0010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00070\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00070\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0001\u0002\u000e\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/Either;", "L", "R", "", "<init>", "()V", "fold", "T", "ifLeft", "Lkotlin/Function1;", "ifRight", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Left", "Right", "Lcom/robinhood/utils/Either$Left;", "Lcom/robinhood/utils/Either$Right;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class Either<L, R> {
    public /* synthetic */ Either(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Either() {
    }

    /* compiled from: Either.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/Either$Left;", "T", "Lcom/robinhood/utils/Either;", "", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/utils/Either$Left;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Left<T> extends Either {
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Left copy$default(Left left, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = left.value;
            }
            return left.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Left<T> copy(T value) {
            return new Left<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Left) && Intrinsics.areEqual(this.value, ((Left) other).value);
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Left(value=" + this.value + ")";
        }

        public Left(T t) {
            super(null);
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }
    }

    /* compiled from: Either.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/Either$Right;", "T", "Lcom/robinhood/utils/Either;", "", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/robinhood/utils/Either$Right;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Right<T> extends Either {
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Right copy$default(Right right, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = right.value;
            }
            return right.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Right<T> copy(T value) {
            return new Right<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Right) && Intrinsics.areEqual(this.value, ((Right) other).value);
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Right(value=" + this.value + ")";
        }

        public Right(T t) {
            super(null);
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public final <T> T fold(Function1<? super L, ? extends T> ifLeft, Function1<? super R, ? extends T> ifRight) {
        Intrinsics.checkNotNullParameter(ifLeft, "ifLeft");
        Intrinsics.checkNotNullParameter(ifRight, "ifRight");
        if (this instanceof Left) {
            return ifLeft.invoke((Object) ((Left) this).getValue());
        }
        if (this instanceof Right) {
            return ifRight.invoke((Object) ((Right) this).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
