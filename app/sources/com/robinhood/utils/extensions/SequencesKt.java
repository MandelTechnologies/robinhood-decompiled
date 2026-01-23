package com.robinhood.utils.extensions;

import com.robinhood.utils.Optional;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilder2;

/* compiled from: Sequences.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0001\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0005\u001a2\u0010\u0006\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00070\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001¨\u0006\b"}, m3636d2 = {"filterIsPresent", "Lkotlin/sequences/Sequence;", "T", "", "Lcom/robinhood/utils/Optional;", "", "zipWithNeighbors", "Lkotlin/Triple;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SequencesKt {
    public static final <T> Sequence<T> filterIsPresent(Sequence<? extends Optional<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return kotlin.sequences.SequencesKt.filterNotNull(kotlin.sequences.SequencesKt.map(sequence, new Function1() { // from class: com.robinhood.utils.extensions.SequencesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt.filterIsPresent$lambda$0((Optional) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object filterIsPresent$lambda$0(Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOrNull();
    }

    public static final <T> Sequence<T> filterIsPresent(Iterable<? extends Optional<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return filterIsPresent(CollectionsKt.asSequence(iterable));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u001e\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "Lkotlin/Triple;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.extensions.SequencesKt$zipWithNeighbors$1", m3645f = "Sequences.kt", m3646l = {26, 32, 36, 41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.extensions.SequencesKt$zipWithNeighbors$1 */
    static final class C419521<T> extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super Tuples3<? extends T, ? extends T, ? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Sequence<T> $this_zipWithNeighbors;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C419521(Sequence<? extends T> sequence, Continuation<? super C419521> continuation) {
            super(2, continuation);
            this.$this_zipWithNeighbors = sequence;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C419521 c419521 = new C419521(this.$this_zipWithNeighbors, continuation);
            c419521.L$0 = obj;
            return c419521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super Tuples3<? extends T, ? extends T, ? extends T>> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C419521) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            if (r7.yield(r10, r9) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        
            if (r7.yield(r10, r9) == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceBuilder2 sequenceBuilder2;
            Object obj2;
            Object obj3;
            Iterator<T> it;
            T next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                Iterator<T> itIterator2 = this.$this_zipWithNeighbors.iterator2();
                if (!itIterator2.hasNext()) {
                    return Unit.INSTANCE;
                }
                T next2 = itIterator2.next();
                if (!itIterator2.hasNext()) {
                    Tuples3 tuples3 = new Tuples3(null, next2, null);
                    this.label = 1;
                } else {
                    T next3 = itIterator2.next();
                    Tuples3 tuples32 = new Tuples3(null, next2, next3);
                    this.L$0 = sequenceBuilder2;
                    this.L$1 = itIterator2;
                    this.L$2 = next2;
                    this.L$3 = next3;
                    this.label = 2;
                    if (sequenceBuilder2.yield(tuples32, this) != coroutine_suspended) {
                        obj2 = next2;
                        obj3 = next3;
                        it = itIterator2;
                        while (true) {
                            if (!it.hasNext()) {
                            }
                            obj2 = obj3;
                            obj3 = next;
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            obj3 = this.L$3;
            obj2 = this.L$2;
            it = (Iterator) this.L$1;
            sequenceBuilder2 = (SequenceBuilder2) this.L$0;
            ResultKt.throwOnFailure(obj);
            while (true) {
                if (!it.hasNext()) {
                    next = it.next();
                    Tuples3 tuples33 = new Tuples3(obj2, obj3, next);
                    this.L$0 = sequenceBuilder2;
                    this.L$1 = it;
                    this.L$2 = obj3;
                    this.L$3 = next;
                    this.label = 3;
                    if (sequenceBuilder2.yield(tuples33, this) == coroutine_suspended) {
                        break;
                    }
                    obj2 = obj3;
                    obj3 = next;
                } else {
                    Tuples3 tuples34 = new Tuples3(obj2, obj3, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                }
            }
            return coroutine_suspended;
        }
    }

    public static final <T> Sequence<Tuples3<T, T, T>> zipWithNeighbors(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return kotlin.sequences.SequencesKt.sequence(new C419521(sequence, null));
    }
}
