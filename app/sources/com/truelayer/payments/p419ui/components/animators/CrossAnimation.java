package com.truelayer.payments.p419ui.components.animators;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrossAnimator.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/animators/CrossAnimation;", "T", "", "state", "Lkotlin/Function0;", "", "content", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lcom/truelayer/payments/ui/components/animators/CrossAnimation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getState", "Lkotlin/jvm/functions/Function2;", "getContent", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CrossAnimation<T> {
    public static final int $stable = 0;
    private final Function2<Composer, Integer, Unit> content;
    private final T state;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CrossAnimation copy$default(CrossAnimation crossAnimation, Object obj, Function2 function2, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = crossAnimation.state;
        }
        if ((i & 2) != 0) {
            function2 = crossAnimation.content;
        }
        return crossAnimation.copy(obj, function2);
    }

    public final T component1() {
        return this.state;
    }

    public final Function2<Composer, Integer, Unit> component2() {
        return this.content;
    }

    public final CrossAnimation<T> copy(T state, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new CrossAnimation<>(state, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossAnimation)) {
            return false;
        }
        CrossAnimation crossAnimation = (CrossAnimation) other;
        return Intrinsics.areEqual(this.state, crossAnimation.state) && Intrinsics.areEqual(this.content, crossAnimation.content);
    }

    public int hashCode() {
        T t = this.state;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "CrossAnimation(state=" + this.state + ", content=" + this.content + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CrossAnimation(T t, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.state = t;
        this.content = content;
    }

    public final T getState() {
        return this.state;
    }

    public final Function2<Composer, Integer, Unit> getContent() {
        return this.content;
    }
}
