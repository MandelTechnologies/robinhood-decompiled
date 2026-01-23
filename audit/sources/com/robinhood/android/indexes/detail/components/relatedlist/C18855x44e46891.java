package com.robinhood.android.indexes.detail.components.relatedlist;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListRelatedIndustries;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "IndexDetailPageRelatedListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes10.dex */
public final class C18855x44e46891 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends CuratedListChipItem>>, CuratedListRelatedIndustries, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ IndexDetailPageRelatedListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18855x44e46891(Continuation continuation, IndexDetailPageRelatedListDuxo indexDetailPageRelatedListDuxo) {
        super(3, continuation);
        this.this$0 = indexDetailPageRelatedListDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends CuratedListChipItem>> flowCollector, CuratedListRelatedIndustries curatedListRelatedIndustries, Continuation<? super Unit> continuation) {
        C18855x44e46891 c18855x44e46891 = new C18855x44e46891(continuation, this.this$0);
        c18855x44e46891.L$0 = flowCollector;
        c18855x44e46891.L$1 = curatedListRelatedIndustries;
        return c18855x44e46891.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final Set set = CollectionsKt.toSet(((CuratedListRelatedIndustries) this.L$1).getRelatedListIds());
            final Flow<List<CuratedList>> flowStreamCuratedLists = this.this$0.curatedListStore.streamCuratedLists();
            Flow<List<? extends CuratedListChipItem>> flow = new Flow<List<? extends CuratedListChipItem>>() { // from class: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ Set $relatedListIds$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$map$1$2", m3645f = "IndexDetailPageRelatedListDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, Set set) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$relatedListIds$inlined = set;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
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
                            Sequence sequenceAsSequence = CollectionsKt.asSequence((List) obj);
                            final Set set = this.$relatedListIds$inlined;
                            List list = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(sequenceAsSequence, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: INVOKE (r6v6 'list' java.util.List) = 
                                  (wrap:kotlin.sequences.Sequence:0x004b: INVOKE 
                                  (wrap:kotlin.sequences.Sequence:0x0045: INVOKE 
                                  (r6v3 'sequenceAsSequence' kotlin.sequences.Sequence)
                                  (wrap:kotlin.jvm.functions.Function1<com.robinhood.models.db.CuratedList, java.lang.Boolean>:0x0042: CONSTRUCTOR (r4v0 'set' java.util.Set A[DONT_INLINE]) A[MD:(java.util.Set<java.util.UUID>):void (m), WRAPPED] (LINE:52) call: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$1$1$1.<init>(java.util.Set):void type: CONSTRUCTOR)
                                 STATIC call: kotlin.sequences.SequencesKt.filter(kotlin.sequences.Sequence, kotlin.jvm.functions.Function1):kotlin.sequences.Sequence A[MD:<T>:(kotlin.sequences.Sequence<? extends T>, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean>):kotlin.sequences.Sequence<T> (m), WRAPPED] (LINE:52))
                                  (wrap:com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$1$1$2:0x0049: SGET  A[WRAPPED] (LINE:53) com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$1$1$2.INSTANCE com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$1$1$2)
                                 STATIC call: kotlin.sequences.SequencesKt.map(kotlin.sequences.Sequence, kotlin.jvm.functions.Function1):kotlin.sequences.Sequence A[MD:<T, R>:(kotlin.sequences.Sequence<? extends T>, kotlin.jvm.functions.Function1<? super T, ? extends R>):kotlin.sequences.Sequence<R> (m), WRAPPED] (LINE:53))
                                 STATIC call: kotlin.sequences.SequencesKt.toList(kotlin.sequences.Sequence):java.util.List A[DECLARE_VAR, MD:<T>:(kotlin.sequences.Sequence<? extends T>):java.util.List<T> (m)] (LINE:62) in method: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes10.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$1$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
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
                                this = this;
                                boolean r0 = r7 instanceof com.robinhood.android.indexes.detail.components.relatedlist.C18856x44c14125.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r7
                                com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 r0 = (com.robinhood.android.indexes.detail.components.relatedlist.C18856x44c14125.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 r0 = new com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$invokeSuspend$lambda$1$$inlined$map$1$2$1
                                r0.<init>(r7)
                            L18:
                                java.lang.Object r7 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L5c
                            L29:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L31:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                                java.util.List r6 = (java.util.List) r6
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                kotlin.sequences.Sequence r6 = kotlin.collections.CollectionsKt.asSequence(r6)
                                com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$1$1$1 r2 = new com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$1$1$1
                                java.util.Set r4 = r5.$relatedListIds$inlined
                                r2.<init>(r4)
                                kotlin.sequences.Sequence r6 = kotlin.sequences.SequencesKt.filter(r6, r2)
                                com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo$onCreate$1$1$1$2 r2 = com.robinhood.android.indexes.detail.components.relatedlist.IndexDetailPageRelatedListDuxo3.INSTANCE
                                kotlin.sequences.Sequence r6 = kotlin.sequences.SequencesKt.map(r6, r2)
                                java.util.List r6 = kotlin.sequences.SequencesKt.toList(r6)
                                r0.label = r3
                                java.lang.Object r6 = r7.emit(r6, r0)
                                if (r6 != r1) goto L5c
                                return r1
                            L5c:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.indexes.detail.components.relatedlist.C18856x44c14125.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends CuratedListChipItem>> flowCollector2, Continuation continuation) {
                        Object objCollect = flowStreamCuratedLists.collect(new AnonymousClass2(flowCollector2, set), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
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
