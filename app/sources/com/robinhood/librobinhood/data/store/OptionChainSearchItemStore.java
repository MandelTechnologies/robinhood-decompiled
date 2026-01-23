package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.dao.OptionChainSearchItemDao;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.UiIndexOptionChainSearchItem;
import com.robinhood.models.p355ui.UiOptionChainSearchItem;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionChainSearchItemStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R#\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R)\u0010\u001a\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainSearchItemStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionChainSearchItemDao;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionChainSearchItemDao;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;)V", "streamUiOptionChainSearchItemsByHoldingInstrumentPositions", "Lcom/robinhood/android/moria/db/Query;", "", "", "Lcom/robinhood/models/ui/UiOptionChainSearchItem;", "getStreamUiOptionChainSearchItemsByHoldingInstrumentPositions", "()Lcom/robinhood/android/moria/db/Query;", "streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions", "getStreamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions", "streamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions", "Lcom/robinhood/models/ui/UiIndexOptionChainSearchItem;", "getStreamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions", "streamUiOptionChainSearchItemsByInstruments", "Lcom/robinhood/models/db/Instrument;", "getStreamUiOptionChainSearchItemsByInstruments", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionChainSearchItemStore extends Store {
    private final OptionChainSearchItemDao dao;
    private final InstrumentPositionStore instrumentPositionStore;
    private final OptionChainStore optionChainStore;
    private final OptionPositionStore optionInstrumentPositionStore;
    private final Query<String, List<UiIndexOptionChainSearchItem>> streamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions;
    private final Query<String, List<UiOptionChainSearchItem>> streamUiOptionChainSearchItemsByHoldingInstrumentPositions;
    private final Query<String, List<UiOptionChainSearchItem>> streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions;
    private final Query<List<Instrument>, List<UiOptionChainSearchItem>> streamUiOptionChainSearchItemsByInstruments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainSearchItemStore(StoreBundle storeBundle, OptionChainSearchItemDao dao, OptionChainStore optionChainStore, OptionPositionStore optionInstrumentPositionStore, InstrumentPositionStore instrumentPositionStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentPositionStore, "optionInstrumentPositionStore");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        this.dao = dao;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentPositionStore = optionInstrumentPositionStore;
        this.instrumentPositionStore = instrumentPositionStore;
        Query.Companion companion = Query.INSTANCE;
        this.streamUiOptionChainSearchItemsByHoldingInstrumentPositions = Store.create$default(this, companion, "streamUiOptionChainSearchItemsByHoldingInstrumentPositions", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSearchItemStore.m2612x8917c2e0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSearchItemStore.m2613x8917c2e1(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions = Store.create$default(this, companion, "streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSearchItemStore.m2614x96ebd4f7(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSearchItemStore.m2615x96ebd4f8(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.streamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions = Store.create$default(this, companion, "streamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSearchItemStore.m2610x7c42ca1d(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSearchItemStore.m2611x7c42ca1e(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.streamUiOptionChainSearchItemsByInstruments = Store.create$default(this, companion, "streamUiOptionChainSearchItemsByInstruments", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSearchItemStore.streamUiOptionChainSearchItemsByInstruments$lambda$7(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSearchItemStore.streamUiOptionChainSearchItemsByInstruments$lambda$12(this.f$0, (List) obj);
            }
        }, false, 8, null);
    }

    public final Query<String, List<UiOptionChainSearchItem>> getStreamUiOptionChainSearchItemsByHoldingInstrumentPositions() {
        return this.streamUiOptionChainSearchItemsByHoldingInstrumentPositions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamUiOptionChainSearchItemsByHoldingInstrumentPositions$lambda$0 */
    public static final Job m2612x8917c2e0(OptionChainSearchItemStore optionChainSearchItemStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return BuildersKt__Builders_commonKt.launch$default(optionChainSearchItemStore.getLogoutKillswitch().getLoggedInScope(), null, null, new OptionChainSearchItemStore3(optionChainSearchItemStore, accountNumber, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamUiOptionChainSearchItemsByHoldingInstrumentPositions$lambda$1 */
    public static final Flow m2613x8917c2e1(OptionChainSearchItemStore optionChainSearchItemStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return optionChainSearchItemStore.dao.getUiOptionChainSearchItemsByHoldingInstrumentPositions(accountNumber);
    }

    /* renamed from: getStreamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions */
    public final Query<String, List<UiOptionChainSearchItem>> m2617xc5330f78() {
        return this.streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions$lambda$2 */
    public static final Job m2614x96ebd4f7(OptionChainSearchItemStore optionChainSearchItemStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return BuildersKt__Builders_commonKt.launch$default(optionChainSearchItemStore.getLogoutKillswitch().getLoggedInScope(), null, null, new OptionChainSearchItemStore4(optionChainSearchItemStore, accountNumber, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamUiOptionChainSearchItemsByHoldingOptionInstrumentPositions$lambda$3 */
    public static final Flow m2615x96ebd4f8(OptionChainSearchItemStore optionChainSearchItemStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return optionChainSearchItemStore.dao.getUiOptionChainSearchItemsByHoldingOptionInstrumentPositions(accountNumber);
    }

    /* renamed from: getStreamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions */
    public final Query<String, List<UiIndexOptionChainSearchItem>> m2616x7c9ba654() {
        return this.streamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions$lambda$4 */
    public static final Job m2610x7c42ca1d(OptionChainSearchItemStore optionChainSearchItemStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return BuildersKt__Builders_commonKt.launch$default(optionChainSearchItemStore.getLogoutKillswitch().getLoggedInScope(), null, null, new OptionChainSearchItemStore2(optionChainSearchItemStore, accountNumber, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: streamUiIndexOptionChainSearchItemsByHoldingIndexOptionInstrumentPositions$lambda$5 */
    public static final Flow m2611x7c42ca1e(OptionChainSearchItemStore optionChainSearchItemStore, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return optionChainSearchItemStore.dao.mo2691x25405334(accountNumber);
    }

    public final Query<List<Instrument>, List<UiOptionChainSearchItem>> getStreamUiOptionChainSearchItemsByInstruments() {
        return this.streamUiOptionChainSearchItemsByInstruments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamUiOptionChainSearchItemsByInstruments$lambda$7(OptionChainSearchItemStore optionChainSearchItemStore, List instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        OptionChainStore optionChainStore = optionChainSearchItemStore.optionChainStore;
        ArrayList arrayList = new ArrayList();
        Iterator it = instruments.iterator();
        while (it.hasNext()) {
            UUID tradableChainId = ((Instrument) it.next()).getTradableChainId();
            if (tradableChainId != null) {
                arrayList.add(tradableChainId);
            }
        }
        return optionChainStore.pingOptionChainsJob$lib_store_options_externalDebug(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamUiOptionChainSearchItemsByInstruments$lambda$12(OptionChainSearchItemStore optionChainSearchItemStore, List instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : instruments) {
            if (((Instrument) obj).getTradableChainId() != null) {
                arrayList.add(obj);
            }
        }
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Instrument) it.next()).getId());
        }
        final Flow<List<UiOptionChainSearchItem>> uiOptionChainSearchItems = optionChainSearchItemStore.dao.getUiOptionChainSearchItems(arrayList2);
        return new Flow<List<? extends UiOptionChainSearchItem>>() { // from class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ List $instrumentIds$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$$inlined$map$1$2", m3645f = "OptionChainSearchItemStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, List list) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$instrumentIds$inlined = list;
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
                        final List list = this.$instrumentIds$inlined;
                        List listSortedWith = CollectionsKt.sortedWith((List) obj, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: INVOKE (r6v3 'listSortedWith' java.util.List) = 
                              (wrap:java.util.List:0x0036: CHECK_CAST (java.util.List) (r6v0 'obj' java.lang.Object))
                              (wrap:java.util.Comparator:0x003e: CONSTRUCTOR (r4v0 'list' java.util.List A[DONT_INLINE]) A[MD:(java.util.List):void (m), WRAPPED] (LINE:1056) call: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$lambda$11$$inlined$sortedBy$1.<init>(java.util.List):void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:1056) in method: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes13.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$lambda$11$$inlined$sortedBy$1, state: NOT_LOADED
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
                            	... 21 more
                            */
                        /*
                            this = this;
                            boolean r0 = r7 instanceof com.robinhood.librobinhood.data.store.C34014xf7d87cab.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$$inlined$map$1$2$1 r0 = (com.robinhood.librobinhood.data.store.C34014xf7d87cab.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$$inlined$map$1$2$1 r0 = new com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.ResultKt.throwOnFailure(r7)
                            goto L4e
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
                            com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$lambda$11$$inlined$sortedBy$1 r2 = new com.robinhood.librobinhood.data.store.OptionChainSearchItemStore$streamUiOptionChainSearchItemsByInstruments$lambda$12$lambda$11$$inlined$sortedBy$1
                            java.util.List r4 = r5.$instrumentIds$inlined
                            r2.<init>(r4)
                            java.util.List r6 = kotlin.collections.CollectionsKt.sortedWith(r6, r2)
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L4e
                            return r1
                        L4e:
                            kotlin.Unit r6 = kotlin.Unit.INSTANCE
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.librobinhood.data.store.C34014xf7d87cab.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends UiOptionChainSearchItem>> flowCollector, Continuation continuation) {
                    Object objCollect = uiOptionChainSearchItems.collect(new AnonymousClass2(flowCollector, arrayList2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
    }
