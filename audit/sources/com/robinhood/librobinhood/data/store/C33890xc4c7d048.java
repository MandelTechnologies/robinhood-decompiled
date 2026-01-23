package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.InboxMessageType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
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
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$$inlined$flatMapLatest$1", m3645f = "InboxMessageStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C33890xc4c7d048 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends UUID>>, List<? extends InboxMessageType.LocalMessage>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $threadId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ InboxMessageStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33890xc4c7d048(Continuation continuation, InboxMessageStore inboxMessageStore, String str) {
        super(3, continuation);
        this.this$0 = inboxMessageStore;
        this.$threadId$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super List<? extends UUID>> flowCollector, List<? extends InboxMessageType.LocalMessage> list, Continuation<? super Unit> continuation) {
        C33890xc4c7d048 c33890xc4c7d048 = new C33890xc4c7d048(continuation, this.this$0, this.$threadId$inlined);
        c33890xc4c7d048.L$0 = flowCollector;
        c33890xc4c7d048.L$1 = list;
        return c33890xc4c7d048.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final List list = (List) this.L$1;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String serverMessageId = ((InboxMessageType.LocalMessage) it.next()).getServerMessageId();
                if (serverMessageId != null) {
                    arrayList.add(serverMessageId);
                }
            }
            final Flow flowTake = FlowKt.take(this.this$0.messageDao.get(this.$threadId$inlined, arrayList), 1);
            Flow<List<? extends UUID>> flow = new Flow<List<? extends UUID>>() { // from class: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends UUID>> flowCollector2, Continuation continuation) {
                    Object objCollect = flowTake.collect(new C338912(flowCollector2, list), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1$2 */
                public static final class C338912<T> implements FlowCollector {
                    final /* synthetic */ List $localMessages$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1$2", m3645f = "InboxMessageStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1$2$1, reason: invalid class name */
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
                            return C338912.this.emit(null, this);
                        }
                    }

                    public C338912(FlowCollector flowCollector, List list) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$localMessages$inlined = list;
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
                            final Set set = SequencesKt.toSet(SequencesKt.map(CollectionsKt.asSequence((List) obj), InboxMessageStore4.INSTANCE));
                            List list = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.$localMessages$inlined), 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005f: INVOKE (r6v8 'list' java.util.List) = 
                                  (wrap:kotlin.sequences.Sequence:0x005b: INVOKE 
                                  (wrap:kotlin.sequences.Sequence:0x0055: INVOKE 
                                  (wrap:kotlin.sequences.Sequence:0x004c: INVOKE 
                                  (wrap:java.util.List:0x0048: IGET 
                                  (r5v0 'this' com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1$2<T> A[IMMUTABLE_TYPE, THIS])
                                 A[WRAPPED] (LINE:56) com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1.2.$localMessages$inlined java.util.List)
                                 STATIC call: kotlin.collections.CollectionsKt.asSequence(java.lang.Iterable):kotlin.sequences.Sequence A[MD:<T>:(java.lang.Iterable<? extends T>):kotlin.sequences.Sequence<T> (m), WRAPPED] (LINE:57))
                                  (wrap:kotlin.jvm.functions.Function1<com.robinhood.models.db.InboxMessageType$LocalMessage, java.lang.Boolean>:0x0052: CONSTRUCTOR (r6v5 'set' java.util.Set A[DONT_INLINE]) A[MD:(java.util.Set<java.lang.String>):void (m), WRAPPED] (LINE:58) call: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$1.<init>(java.util.Set):void type: CONSTRUCTOR)
                                 STATIC call: kotlin.sequences.SequencesKt.filter(kotlin.sequences.Sequence, kotlin.jvm.functions.Function1):kotlin.sequences.Sequence A[MD:<T>:(kotlin.sequences.Sequence<? extends T>, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean>):kotlin.sequences.Sequence<T> (m), WRAPPED] (LINE:58))
                                  (wrap:com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$2:0x0059: SGET  A[WRAPPED] (LINE:59) com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$2.INSTANCE com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$2)
                                 STATIC call: kotlin.sequences.SequencesKt.map(kotlin.sequences.Sequence, kotlin.jvm.functions.Function1):kotlin.sequences.Sequence A[MD:<T, R>:(kotlin.sequences.Sequence<? extends T>, kotlin.jvm.functions.Function1<? super T, ? extends R>):kotlin.sequences.Sequence<R> (m), WRAPPED] (LINE:59))
                                 STATIC call: kotlin.sequences.SequencesKt.toList(kotlin.sequences.Sequence):java.util.List A[DECLARE_VAR, MD:<T>:(kotlin.sequences.Sequence<? extends T>):java.util.List<T> (m)] (LINE:60) in method: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes13.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$1, state: NOT_LOADED
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
                                boolean r0 = r7 instanceof com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1.C338912.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r7
                                com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1$2$1 r0 = (com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1.C338912.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1$2$1 r0 = new com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1$2$1
                                r0.<init>(r7)
                            L18:
                                java.lang.Object r7 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L6c
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
                                com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$fetchedMessageIds$1 r2 = com.robinhood.librobinhood.data.store.InboxMessageStore4.INSTANCE
                                kotlin.sequences.Sequence r6 = kotlin.sequences.SequencesKt.map(r6, r2)
                                java.util.Set r6 = kotlin.sequences.SequencesKt.toSet(r6)
                                java.util.List r2 = r5.$localMessages$inlined
                                java.lang.Iterable r2 = (java.lang.Iterable) r2
                                kotlin.sequences.Sequence r2 = kotlin.collections.CollectionsKt.asSequence(r2)
                                com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$1 r4 = new com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$1
                                r4.<init>(r6)
                                kotlin.sequences.Sequence r6 = kotlin.sequences.SequencesKt.filter(r2, r4)
                                com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$1$1$2 r2 = com.robinhood.librobinhood.data.store.InboxMessageStore3.INSTANCE
                                kotlin.sequences.Sequence r6 = kotlin.sequences.SequencesKt.map(r6, r2)
                                java.util.List r6 = kotlin.sequences.SequencesKt.toList(r6)
                                r0.label = r3
                                java.lang.Object r6 = r7.emit(r6, r0)
                                if (r6 != r1) goto L6c
                                return r1
                            L6c:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.librobinhood.data.store.InboxMessageStore$clearSentLocalMessages$lambda$4$$inlined$map$1.C338912.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
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
