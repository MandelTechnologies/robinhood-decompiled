package com.robinhood.shared.store.chat.common;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.shared.models.chat.common.UnsentInputStatus;
import com.robinhood.shared.store.chat.common.ChatCache;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: InFlightMessageStore.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u001b0\u001a2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "Lcom/robinhood/store/Store;", "memoryCache", "Lcom/robinhood/shared/store/chat/common/ChatCache;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/shared/store/chat/common/ChatCache;Lcom/robinhood/store/StoreBundle;)V", "addMessage", "", "bucketId", "Ljava/util/UUID;", "message", "Lcom/robinhood/shared/models/chat/common/UnsentInput;", "(Ljava/util/UUID;Lcom/robinhood/shared/models/chat/common/UnsentInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeMessage", "messageLocalId", "", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAllMessages", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMessageStatus", "messageStatus", "Lcom/robinhood/shared/models/chat/common/UnsentInputStatus;", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/shared/models/chat/common/UnsentInputStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamInFlightMessages", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/collections/immutable/ImmutableList;", Card.Icon.ORDER, "Lcom/robinhood/shared/store/chat/common/SortOrder;", "lib-store-chat-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class InFlightMessageStore extends Store {
    private final ChatCache memoryCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InFlightMessageStore(ChatCache memoryCache, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.memoryCache = memoryCache;
    }

    public final Object addMessage(UUID uuid, UnsentInput unsentInput, Continuation<? super Unit> continuation) {
        ChatCache2.save(this.memoryCache.getUnsentInputsItem(uuid), unsentInput);
        return Unit.INSTANCE;
    }

    public final Object removeMessage(UUID uuid, String str, Continuation<? super Unit> continuation) {
        ChatCache2.remove(this.memoryCache.getUnsentInputsItem(uuid), str);
        return Unit.INSTANCE;
    }

    public final Object removeAllMessages(UUID uuid, Continuation<? super Unit> continuation) {
        this.memoryCache.getUnsentInputsItem(uuid).remove();
        return Unit.INSTANCE;
    }

    public final Object updateMessageStatus(UUID uuid, String str, UnsentInputStatus unsentInputStatus, Continuation<? super Unit> continuation) {
        UnsentInput unsentInput;
        ChatCache.Item<Map<String, UnsentInput>> unsentInputsItem = this.memoryCache.getUnsentInputsItem(uuid);
        Map<String, UnsentInput> map = unsentInputsItem.get();
        if (map == null || (unsentInput = map.get(str)) == null) {
            return Unit.INSTANCE;
        }
        ChatCache2.save(unsentInputsItem, unsentInput.updateSendStatus(unsentInputStatus));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Flow streamInFlightMessages$default(InFlightMessageStore inFlightMessageStore, UUID uuid, SortOrder sortOrder, int i, Object obj) {
        if ((i & 2) != 0) {
            sortOrder = SortOrder.ASCENDING_CREATED_TIME;
        }
        return inFlightMessageStore.streamInFlightMessages(uuid, sortOrder);
    }

    public final Flow<ImmutableList<UnsentInput>> streamInFlightMessages(UUID bucketId, final SortOrder order) {
        Intrinsics.checkNotNullParameter(bucketId, "bucketId");
        Intrinsics.checkNotNullParameter(order, "order");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.memoryCache.getUnsentInputsItem(bucketId).changes()), Integer.MAX_VALUE, null, 2, null);
        return FlowKt.distinctUntilChanged(new Flow<ImmutableList<? extends UnsentInput>>() { // from class: com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1$2 */
            public static final class C399452<T> implements FlowCollector {
                final /* synthetic */ SortOrder $order$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1$2", m3645f = "InFlightMessageStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C399452.this.emit(null, this);
                    }
                }

                public C399452(FlowCollector flowCollector, SortOrder sortOrder) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$order$inlined = sortOrder;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    List listPersistentListOf;
                    Collection collectionValues;
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
                        Map map = (Map) ((Optional) obj).getOrNull();
                        if (map != null && (collectionValues = map.values()) != null) {
                            final SortOrder sortOrder = this.$order$inlined;
                            List listSortedWith = CollectionsKt.sortedWith(collectionValues, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: INVOKE (r6v9 'listSortedWith' java.util.List) = 
                                  (r6v7 'collectionValues' java.util.Collection)
                                  (wrap:java.util.Comparator:0x004c: CONSTRUCTOR (r4v0 'sortOrder' com.robinhood.shared.store.chat.common.SortOrder A[DONT_INLINE]) A[MD:(com.robinhood.shared.store.chat.common.SortOrder):void (m), WRAPPED] (LINE:53) call: com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$1$1.<init>(com.robinhood.shared.store.chat.common.SortOrder):void type: CONSTRUCTOR)
                                 STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:53) in method: com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes6.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$1$1, state: NOT_LOADED
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
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 27 more
                                */
                            /*
                                this = this;
                                boolean r0 = r7 instanceof com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1.C399452.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r7
                                com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1$2$1 r0 = (com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1.C399452.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1$2$1 r0 = new com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1$2$1
                                r0.<init>(r7)
                            L18:
                                java.lang.Object r7 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L6b
                            L29:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L31:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                                com.robinhood.utils.Optional r6 = (com.robinhood.utils.Optional) r6
                                java.lang.Object r6 = r6.getOrNull()
                                java.util.Map r6 = (java.util.Map) r6
                                if (r6 == 0) goto L5e
                                java.util.Collection r6 = r6.values()
                                if (r6 == 0) goto L5e
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$1$1 r2 = new com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$1$1
                                com.robinhood.shared.store.chat.common.SortOrder r4 = r5.$order$inlined
                                r2.<init>(r4)
                                java.util.List r6 = kotlin.collections.CollectionsKt.sortedWith(r6, r2)
                                if (r6 == 0) goto L5e
                                java.lang.Iterable r6 = (java.lang.Iterable) r6
                                kotlinx.collections.immutable.ImmutableList r6 = kotlinx.collections.immutable.extensions2.toImmutableList(r6)
                                if (r6 == 0) goto L5e
                                goto L62
                            L5e:
                                kotlinx.collections.immutable.PersistentList r6 = kotlinx.collections.immutable.extensions2.persistentListOf()
                            L62:
                                r0.label = r3
                                java.lang.Object r6 = r7.emit(r6, r0)
                                if (r6 != r1) goto L6b
                                return r1
                            L6b:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.store.chat.common.InFlightMessageStore$streamInFlightMessages$$inlined$map$1.C399452.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ImmutableList<? extends UnsentInput>> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C399452(flowCollector, order), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
            }
        }
