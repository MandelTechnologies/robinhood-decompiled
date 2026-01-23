package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.utils.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2", m3645f = "InvestingMonitorDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>>, List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $sortOrderFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2(Continuation continuation, Flow flow) {
        super(3, continuation);
        this.$sortOrderFlow$inlined = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>> flowCollector, List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>> list, Continuation<? super Unit> continuation) {
        InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2 investingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2 = new InvestingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2(continuation, this.$sortOrderFlow$inlined);
        investingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2.L$0 = flowCollector;
        investingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2.L$1 = list;
        return investingMonitorDuxo$streamCuratedLists$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final List list = (List) this.L$1;
            final Flow flow = this.$sortOrderFlow$inlined;
            Flow<List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>> flow2 = new Flow<List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>>() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$13$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends Tuples2<? extends CuratedList, ? extends List<? extends CuratedListEligible>>>> flowCollector2, Continuation continuation) {
                    Object objCollect = flow.collect(new C266022(flowCollector2, list), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$13$$inlined$map$1$2 */
                public static final class C266022<T> implements FlowCollector {
                    final /* synthetic */ List $listInfoPairs$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$13$$inlined$map$1$2", m3645f = "InvestingMonitorDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$13$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C266022.this.emit(null, this);
                        }
                    }

                    public C266022(FlowCollector flowCollector, List list) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$listInfoPairs$inlined = list;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        T next;
                        CuratedList curatedList;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            ListsOrder listsOrder = (ListsOrder) ((Optional) obj).getOrNull();
                            List<ListRecord> lists = listsOrder != null ? listsOrder.getLists() : null;
                            if (lists == null) {
                                lists = CollectionsKt.emptyList();
                            }
                            List<ListRecord> list = lists;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ListRecord) it.next()).getId());
                            }
                            final Set set = CollectionsKt.toSet(arrayList);
                            Timber.Companion companion = Timber.INSTANCE;
                            Set<UUID> set2 = set;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
                            for (UUID uuid : set2) {
                                Iterator<T> it2 = this.$listInfoPairs$inlined.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        next = (T) null;
                                        break;
                                    }
                                    next = it2.next();
                                    if (Intrinsics.areEqual(((CuratedList) ((Tuples2) next).getFirst()).getId(), uuid)) {
                                        break;
                                    }
                                }
                                Tuples2 tuples2 = next;
                                arrayList2.add((tuples2 == null || (curatedList = (CuratedList) tuples2.getFirst()) == null) ? null : curatedList.getDisplayName());
                            }
                            companion.mo3350d("Collected sortOrderFlow: " + arrayList2, new Object[0]);
                            List listSortedWith = CollectionsKt.sortedWith(this.$listInfoPairs$inlined, ComparisonsKt.compareBy(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0102: INVOKE (r12v13 'listSortedWith' java.util.List) = 
                                  (wrap:java.util.List:0x00eb: IGET 
                                  (r11v0 'this' com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$13$$inlined$map$1$2<T> A[IMMUTABLE_TYPE, THIS])
                                 A[WRAPPED] (LINE:67) com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$13$$inlined$map$1.2.$listInfoPairs$inlined java.util.List)
                                  (wrap:java.util.Comparator:0x00fe: INVOKE 
                                  (wrap:kotlin.jvm.functions.Function1[]:0x00f8: FILLED_NEW_ARRAY 
                                  (wrap:kotlin.jvm.functions.Function1<kotlin.Pair<? extends com.robinhood.models.db.CuratedList, ? extends java.util.List<? extends com.robinhood.models.ui.CuratedListEligible>>, java.lang.Comparable<?>>:0x00ef: CONSTRUCTOR (r12v9 'set' java.util.Set A[DONT_INLINE]) A[MD:(java.util.Set<java.util.UUID>):void (m), WRAPPED] (LINE:68) call: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$2$1$2.<init>(java.util.Set):void type: CONSTRUCTOR)
                                  (wrap:kotlin.jvm.functions.Function1<kotlin.Pair<? extends com.robinhood.models.db.CuratedList, ? extends java.util.List<? extends com.robinhood.models.ui.CuratedListEligible>>, java.lang.Comparable<?>>:0x00f4: CONSTRUCTOR (r12v9 'set' java.util.Set A[DONT_INLINE]) A[MD:(java.util.Set<java.util.UUID>):void (m), WRAPPED] call: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$2$1$3.<init>(java.util.Set):void type: CONSTRUCTOR)
                                 A[WRAPPED] (LINE:68) elemType: kotlin.jvm.functions.Function1)
                                 STATIC call: kotlin.comparisons.ComparisonsKt.compareBy(kotlin.jvm.functions.Function1[]):java.util.Comparator A[MD:<T>:(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>[]):java.util.Comparator<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:68))
                                 STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:67) in method: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$13$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes5.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorDuxo$streamCuratedLists$2$1$2, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:1166)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1140)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 21 more
                                */
                            /*
                                Method dump skipped, instructions count: 274
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main.InvestingMonitorDuxo$streamCuratedLists$lambda$13$$inlined$map$1.C266022.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }
                };
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flow2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
