package com.robinhood.utils.extensions;

import com.robinhood.utils.extensions.IterablesKt;
import defpackage.C0008xc140899a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilder2;

/* compiled from: Iterables.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010%\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\bø\u0001\u0000\u001a0\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0005H\u0086\bø\u0001\u0000\u001aH\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\t\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0086\bø\u0001\u0000\u001aG\u0010\f\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001am\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0002*\u00020\u0011*\b\u0012\u0004\u0012\u0002H\u00020\u00032K\u0010\u0012\u001aG\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00100\u0013H\u0086\bø\u0001\u0000\u001a<\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\n0\u001b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0086\bø\u0001\u0000\u001a.\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001f0\u001e\"\b\b\u0000\u0010\u0002*\u00020\u0011*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010 \u001a\u00020\u0014\u001aT\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001f0\u001e\"\b\b\u0000\u0010\u0002*\u00020\u00112\u0006\u0010 \u001a\u00020\u00142\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001e\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001f0\u001e0$H\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, m3636d2 = {"sumByBigDecimal", "Ljava/math/BigDecimal;", "T", "", "selector", "Lkotlin/Function1;", "sumOf", "", "rangeOf", "Lkotlin/ranges/ClosedRange;", "R", "", "maxOf", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "minOf", "zipWithNextIndexed", "", "", "block", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "indexOfCurrent", "current", "next", "mapToSet", "", "transform", "generatePermutations", "Lkotlin/sequences/Sequence;", "", "length", "generatePermutationsWithCache", "variants", "cache", "", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class IterablesKt {
    public static final <T> BigDecimal sumByBigDecimal(Iterable<? extends T> iterable, Function1<? super T, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (T t : iterable) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            bigDecimalAdd = bigDecimalAdd.add(selector.invoke(t));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        return bigDecimalAdd;
    }

    public static final <T> float sumOf(Iterable<? extends T> iterable, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += selector.invoke(it.next()).floatValue();
        }
        return fFloatValue;
    }

    public static final <T, R extends Comparable<? super R>> Range2<R> rangeOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        Comparable comparableCoerceAtLeast = rInvoke;
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            comparableCoerceAtLeast = RangesKt.coerceAtLeast((R) comparableCoerceAtLeast, rInvoke2);
            rInvoke = RangesKt.coerceAtMost((R) rInvoke, rInvoke2);
        }
        return RangesKt.rangeTo(rInvoke, comparableCoerceAtLeast);
    }

    public static final <T, R> Set<R> mapToSet(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashSet linkedHashSet = iterable instanceof Collection ? new LinkedHashSet(((Collection) iterable).size()) : new LinkedHashSet();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(transform.invoke(it.next()));
        }
        Set<R> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public static final <T> Sequence<List<T>> generatePermutations(Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return generatePermutationsWithCache(i, iterable, new LinkedHashMap());
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "", "T", "", "Lkotlin/sequences/SequenceScope;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.extensions.IterablesKt$generatePermutationsWithCache$1", m3645f = "Iterables.kt", m3646l = {94, 95, 101}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.utils.extensions.IterablesKt$generatePermutationsWithCache$1 */
    static final class C419191<T> extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<Integer, Sequence<List<T>>> $cache;
        final /* synthetic */ int $length;
        final /* synthetic */ Iterable<T> $variants;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C419191(int i, Iterable<? extends T> iterable, Map<Integer, Sequence<List<T>>> map, Continuation<? super C419191> continuation) {
            super(2, continuation);
            this.$length = i;
            this.$variants = iterable;
            this.$cache = map;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C419191 c419191 = new C419191(this.$length, this.$variants, this.$cache, continuation);
            c419191.L$0 = obj;
            return c419191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super List<? extends T>> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C419191) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r9.yieldAll(r1, r8) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        
            if (r9.yieldAll(r2, r8) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        
            if (r9.yieldAll(r1, r8) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceBuilder2 sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                int i2 = this.$length;
                if (i2 <= 0) {
                    List listEmptyList = CollectionsKt.emptyList();
                    this.label = 1;
                } else if (i2 == 1) {
                    Iterable<T> iterable = this.$variants;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    Iterator<T> it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(CollectionsKt.listOf(it.next()));
                    }
                    this.label = 2;
                } else {
                    int i3 = i2 - 1;
                    Map<Integer, Sequence<List<T>>> map = this.$cache;
                    Integer numBoxInt = boxing.boxInt(i3);
                    Iterable<T> iterable2 = this.$variants;
                    Map<Integer, Sequence<List<T>>> map2 = this.$cache;
                    Sequence<List<T>> sequenceGeneratePermutationsWithCache = map.get(numBoxInt);
                    if (sequenceGeneratePermutationsWithCache == null) {
                        sequenceGeneratePermutationsWithCache = IterablesKt.generatePermutationsWithCache(i3, iterable2, map2);
                        map.put(numBoxInt, sequenceGeneratePermutationsWithCache);
                    }
                    final Iterable<T> iterable3 = this.$variants;
                    Sequence<? extends T> sequenceFlatMapIterable = kotlin.sequences.SequencesKt.flatMapIterable(sequenceGeneratePermutationsWithCache, new Function1() { // from class: com.robinhood.utils.extensions.IterablesKt$generatePermutationsWithCache$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return IterablesKt.C419191.invokeSuspend$lambda$3(iterable3, (List) obj2);
                        }
                    });
                    this.label = 3;
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Iterable invokeSuspend$lambda$3(Iterable iterable, List list) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.listOf(it.next())));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Sequence<List<T>> generatePermutationsWithCache(int i, Iterable<? extends T> iterable, Map<Integer, Sequence<List<T>>> map) {
        return kotlin.sequences.SequencesKt.sequence(new C419191(i, iterable, map, null));
    }

    public static final <T, R extends Comparable<? super R>> R maxOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        T next;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(next);
                do {
                    T next2 = it.next();
                    R rInvoke2 = selector.invoke(next2);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        next = next2;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        if (next != null) {
            return selector.invoke(next);
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> R minOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> selector) {
        T next;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(next);
                do {
                    T next2 = it.next();
                    R rInvoke2 = selector.invoke(next2);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        next = next2;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        if (next != null) {
            return selector.invoke(next);
        }
        return null;
    }

    public static final <T> void zipWithNextIndexed(Iterable<? extends T> iterable, Function3<? super Integer, ? super T, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            CollectionsKt.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList();
        C0008xc140899a next = it.next();
        int i = 0;
        while (it.hasNext()) {
            T next2 = it.next();
            block.invoke(Integer.valueOf(i), next, next2);
            arrayList.add(Integer.valueOf(i));
            i++;
            next = next2;
        }
    }
}
