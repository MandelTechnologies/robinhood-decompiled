package com.truelayer.payments.core.domain.utils;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Outcome.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\b\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086\bø\u0001\u0000\u001a>\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086@¢\u0006\u0002\u0010\n\u001a.\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00010\f\u001a.\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00010\f\u001a+\u0010\u000f\u001a\u0004\u0018\u0001H\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010\u001a:\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u0001\u0012\u0004\u0012\u0002H\r0\u0001\u001a[\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0013*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00130\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aA\u0010\u0017\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001aN\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\r0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0013*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0007H\u0086\bø\u0001\u0000\u001aN\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00130\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0013*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00130\u0007H\u0086\bø\u0001\u0000\u001a+\u0010\u001c\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010\u001aH\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001aH\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u001f0\u0007H\u0086\bø\u0001\u0000\u001a/\u0010!\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00012\u0006\u0010\"\u001a\u0002H\u0002¢\u0006\u0002\u0010#\u001aZ\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\r0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0013*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u00012\u001e\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\r0\u00010\u0007H\u0086\bø\u0001\u0000\u001a'\u0010%\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u0001¢\u0006\u0002\u0010\u0010\u001a'\u0010&\u001a\u0002H\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\r0\u0001¢\u0006\u0002\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, m3636d2 = {"outcome", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "T", "", "block", "Lkotlin/Function0;", "suspendOutcome", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "E", "collectErrors", "errorOrNull", "(Lcom/truelayer/payments/core/domain/utils/Outcome;)Ljava/lang/Object;", "flatten", "fold", "R", "ok", "fail", "(Lcom/truelayer/payments/core/domain/utils/Outcome;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "intoOk", "mapFail", "(Lcom/truelayer/payments/core/domain/utils/Outcome;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "map", "mapError", "okOrNull", "onError", "on", "", "onOk", "orDefault", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "(Lcom/truelayer/payments/core/domain/utils/Outcome;Ljava/lang/Object;)Ljava/lang/Object;", "tryInto", "unwrap", "unwrapFail", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.domain.utils.OutcomeKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Outcome4 {

    /* compiled from: Outcome.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.core.domain.utils.OutcomeKt", m3645f = "Outcome.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "suspendOutcome")
    /* renamed from: com.truelayer.payments.core.domain.utils.OutcomeKt$suspendOutcome$1 */
    static final class C427241<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C427241(Continuation<? super C427241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Outcome4.suspendOutcome(null, this);
        }
    }

    public static final <T, E, R> R fold(Outcome<? extends T, ? extends E> outcome, Function1<? super T, ? extends R> ok, Function1<? super E, ? extends R> fail) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        Intrinsics.checkNotNullParameter(ok, "ok");
        Intrinsics.checkNotNullParameter(fail, "fail");
        if (outcome instanceof Ok) {
            return ok.invoke((Object) ((Ok) outcome).getValue());
        }
        if (outcome instanceof Fail) {
            return fail.invoke((Object) ((Fail) outcome).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T, E> T intoOk(Outcome<? extends T, ? extends E> outcome, Function1<? super E, ? extends T> mapFail) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        Intrinsics.checkNotNullParameter(mapFail, "mapFail");
        if (outcome instanceof Ok) {
            return (T) ((Ok) outcome).getValue();
        }
        if (outcome instanceof Fail) {
            return mapFail.invoke((Object) ((Fail) outcome).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T, E> T okOrNull(Outcome<? extends T, ? extends E> outcome) {
        if (outcome instanceof Ok) {
            return (T) ((Ok) outcome).getValue();
        }
        if ((outcome instanceof Fail) || outcome == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T, E> E errorOrNull(Outcome<? extends T, ? extends E> outcome) {
        if (outcome instanceof Ok) {
            return null;
        }
        if (outcome instanceof Fail) {
            return (E) ((Fail) outcome).getError();
        }
        if (outcome == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T, E> T orDefault(Outcome<? extends T, ? extends E> outcome, T t) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        if (outcome instanceof Ok) {
            return (T) ((Ok) outcome).getValue();
        }
        if (outcome instanceof Fail) {
            return t;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T, E> T unwrap(Outcome<? extends T, ? extends E> outcome) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        if (outcome instanceof Ok) {
            return (T) ((Ok) outcome).getValue();
        }
        if (!(outcome instanceof Fail)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Expected a `Ok` state: " + ((Fail) outcome).getError());
    }

    public static final <T, E> E unwrapFail(Outcome<? extends T, ? extends E> outcome) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        if (outcome instanceof Ok) {
            throw new IllegalStateException("Expected a Fail state.");
        }
        if (outcome instanceof Fail) {
            return (E) ((Fail) outcome).getError();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, E, R> Outcome<R, E> map(Outcome<? extends T, ? extends E> outcome, Function1<? super T, ? extends R> map) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        if (outcome instanceof Ok) {
            return new Ok(map.invoke((Object) ((Ok) outcome).getValue()));
        }
        if (outcome instanceof Fail) {
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, E> Outcome<T, E> onOk(Outcome<? extends T, ? extends E> outcome, Function1<? super T, Unit> on) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        Intrinsics.checkNotNullParameter(on, "on");
        if (outcome instanceof Ok) {
            on.invoke((Object) ((Ok) outcome).getValue());
            return outcome;
        }
        if (outcome instanceof Fail) {
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, E, R> Outcome<T, R> mapError(Outcome<? extends T, ? extends E> outcome, Function1<? super E, ? extends R> map) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        if (outcome instanceof Ok) {
            return outcome;
        }
        if (outcome instanceof Fail) {
            return new Fail(map.invoke((Object) ((Fail) outcome).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, E> Outcome<T, E> onError(Outcome<? extends T, ? extends E> outcome, Function1<? super E, Unit> on) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        Intrinsics.checkNotNullParameter(on, "on");
        if (outcome instanceof Ok) {
            return outcome;
        }
        if (outcome instanceof Fail) {
            on.invoke((Object) ((Fail) outcome).getError());
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, E, R> Outcome<R, E> tryInto(Outcome<? extends T, ? extends E> outcome, Function1<? super T, ? extends Outcome<? extends R, ? extends E>> map) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        if (outcome instanceof Ok) {
            return map.invoke((Object) ((Ok) outcome).getValue());
        }
        if (outcome instanceof Fail) {
            return outcome;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T, E> Outcome<T, E> flatten(Outcome<? extends Outcome<? extends T, ? extends E>, ? extends E> outcome) {
        Intrinsics.checkNotNullParameter(outcome, "<this>");
        if (outcome instanceof Ok) {
            Outcome outcome2 = (Outcome) ((Ok) outcome).getValue();
            if (outcome2 instanceof Ok) {
                return new Ok(((Ok) outcome2).getValue());
            }
            if (outcome2 instanceof Fail) {
                return new Fail(((Fail) outcome2).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        if (outcome instanceof Fail) {
            return new Fail(((Fail) outcome).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> Outcome<T, Throwable> outcome(Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new Ok(block.invoke());
        } catch (Throwable th) {
            return new Fail(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object suspendOutcome(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super Outcome<? extends T, ? extends Throwable>> continuation) {
        C427241 c427241;
        if (continuation instanceof C427241) {
            c427241 = (C427241) continuation;
            int i = c427241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c427241.label = i - Integer.MIN_VALUE;
            } else {
                c427241 = new C427241(continuation);
            }
        }
        Object objInvoke = c427241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c427241.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                c427241.label = 1;
                objInvoke = function1.invoke(c427241);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            return new Ok(objInvoke);
        } catch (Throwable th) {
            return new Fail(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, E> List<T> collect(List<? extends Outcome<? extends T, ? extends E>> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof Ok) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Ok) it.next()).getValue());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, E> List<E> collectErrors(List<? extends Outcome<? extends T, ? extends E>> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof Fail) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Fail) it.next()).getError());
        }
        return arrayList2;
    }
}
