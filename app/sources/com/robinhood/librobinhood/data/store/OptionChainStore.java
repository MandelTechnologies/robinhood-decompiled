package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiOptionChain;
import com.robinhood.models.api.ApiOptionChain2;
import com.robinhood.models.dao.OptionChainDao;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Completables;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
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
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OptionChainStore.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010$\u001a\u00020\u000fJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000fH\u0002J\u001b\u0010(\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0000¢\u0006\u0002\b*J\u001e\u0010+\u001a\u00020,2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\b\b\u0002\u0010-\u001a\u00020.J*\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\b\b\u0002\u0010-\u001a\u00020.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R)\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R#\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R#\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u00062"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OptionChainDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OptionChainDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "getOptionChains", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiOptionChain;", "streamChainSymbol", "Lcom/robinhood/android/moria/db/Query;", "", "getStreamChainSymbol", "()Lcom/robinhood/android/moria/db/Query;", "streamUiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "getStreamUiOptionChain", "streamUiOptionChains", "", "getStreamUiOptionChains", "streamUiOptionUnderliersByOptionChain", "Lcom/robinhood/models/ui/UiOptionUnderlier;", "getStreamUiOptionUnderliersByOptionChain", "streamActiveUiOptionUnderlierByOptionChain", "Lcom/robinhood/utils/Optional;", "getStreamActiveUiOptionUnderlierByOptionChain", "getUiOptionChainByOptionInstrument", "Lio/reactivex/Observable;", "optionInstrumentId", "pingOptionChainJob", "Lkotlinx/coroutines/Job;", "optionChainId", "pingOptionChainsJob", "optionChainIds", "pingOptionChainsJob$lib_store_options_externalDebug", "pingOptionChainsCompletable", "Lio/reactivex/Completable;", "force", "", "refreshAndStreamUiOptionChain", "Lkotlinx/coroutines/flow/Flow;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionChainStore extends Store {
    private static final int BUFFER_SIZE = 64;
    private final OptionChainDao dao;
    private final PaginatedEndpoint<Iterable<UUID>, ApiOptionChain> getOptionChains;
    private final InstrumentStore instrumentStore;
    private final OptionsApi optionsApi;
    private final Query<UUID, Optional<UiOptionUnderlier>> streamActiveUiOptionUnderlierByOptionChain;
    private final Query<UUID, String> streamChainSymbol;
    private final Query<UUID, UiOptionChain> streamUiOptionChain;
    private final Query<List<UUID>, List<UiOptionChain>> streamUiOptionChains;
    private final Query<UUID, List<UiOptionUnderlier>> streamUiOptionUnderliersByOptionChain;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainStore(StoreBundle storeBundle, OptionChainDao dao, OptionsApi optionsApi, InstrumentStore instrumentStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.instrumentStore = instrumentStore;
        this.getOptionChains = PaginatedEndpoint.INSTANCE.createBatched(64, new OptionChainStore$getOptionChains$1(this, null), getLogoutKillswitch(), new OptionChainStore$getOptionChains$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(OptionChain.INSTANCE.getNormalStaleTimeout(), storeBundle.getClock()));
        Query.Companion companion = Query.INSTANCE;
        this.streamChainSymbol = Store.create$default(this, companion, "streamChainSymbol", CollectionsKt.listOf(new RefreshEach(new OptionChainStore$streamChainSymbol$1(this))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainStore.streamChainSymbol$lambda$2(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.streamUiOptionChain = Store.create$default(this, companion, "streamUiOptionChain", CollectionsKt.listOf(new RefreshEach(new OptionChainStore$streamUiOptionChain$1(this))), new OptionChainStore$streamUiOptionChain$2(dao), false, 8, null);
        this.streamUiOptionChains = Store.create$default(this, companion, "streamUiOptionChains", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainStore.streamUiOptionChains$lambda$3(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainStore.streamUiOptionChains$lambda$4(this.f$0, (List) obj);
            }
        }, false, 8, null);
        this.streamUiOptionUnderliersByOptionChain = Store.create$default(this, companion, "streamUiOptionUnderliersByOptionChain", CollectionsKt.listOf(new RefreshEach(new OptionChainStore$streamUiOptionUnderliersByOptionChain$1(this))), new OptionChainStore$streamUiOptionUnderliersByOptionChain$2(dao), false, 8, null);
        this.streamActiveUiOptionUnderlierByOptionChain = Store.create$default(this, companion, "streamActiveUiOptionUnderlierByOptionChain", CollectionsKt.listOf(new RefreshEach(new OptionChainStore$streamActiveUiOptionUnderlierByOptionChain$1(this))), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainStore.streamActiveUiOptionUnderlierByOptionChain$lambda$6(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
    }

    public final Query<UUID, String> getStreamChainSymbol() {
        return this.streamChainSymbol;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamChainSymbol$lambda$2(OptionChainStore optionChainStore, final UUID optionChainId) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        final Flow<List<OptionChain>> optionChains = optionChainStore.dao.getOptionChains();
        return new Flow<String>() { // from class: com.robinhood.librobinhood.data.store.OptionChainStore$streamChainSymbol$lambda$2$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionChainStore$streamChainSymbol$lambda$2$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ UUID $optionChainId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainStore$streamChainSymbol$lambda$2$$inlined$mapNotNull$1$2", m3645f = "OptionChainStore.kt", m3646l = {53}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionChainStore$streamChainSymbol$lambda$2$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$optionChainId$inlined = uuid;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
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
                        Iterator<T> it = ((List) obj).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.areEqual(((OptionChain) next).getId(), this.$optionChainId$inlined)) {
                                break;
                            }
                        }
                        OptionChain optionChain = next;
                        String symbol = optionChain != null ? optionChain.getSymbol() : null;
                        if (symbol != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(symbol, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = optionChains.collect(new AnonymousClass2(flowCollector, optionChainId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Query<UUID, UiOptionChain> getStreamUiOptionChain() {
        return this.streamUiOptionChain;
    }

    public final Query<List<UUID>, List<UiOptionChain>> getStreamUiOptionChains() {
        return this.streamUiOptionChains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job streamUiOptionChains$lambda$3(OptionChainStore optionChainStore, List optionChainIds) {
        Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
        return optionChainStore.pingOptionChainsJob$lib_store_options_externalDebug(optionChainIds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamUiOptionChains$lambda$4(OptionChainStore optionChainStore, List optionChainIds) {
        Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
        return optionChainStore.dao.getUiOptionChains(optionChainIds);
    }

    public final Query<UUID, List<UiOptionUnderlier>> getStreamUiOptionUnderliersByOptionChain() {
        return this.streamUiOptionUnderliersByOptionChain;
    }

    public final Query<UUID, Optional<UiOptionUnderlier>> getStreamActiveUiOptionUnderlierByOptionChain() {
        return this.streamActiveUiOptionUnderlierByOptionChain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamActiveUiOptionUnderlierByOptionChain$lambda$6(OptionChainStore optionChainStore, UUID optionChainId) {
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        final Flow<List<UiOptionUnderlier>> uiOptionUnderlierByOptionChain = optionChainStore.dao.getUiOptionUnderlierByOptionChain(optionChainId);
        return new Flow<Optional<? extends UiOptionUnderlier>>() { // from class: com.robinhood.librobinhood.data.store.OptionChainStore$streamActiveUiOptionUnderlierByOptionChain$lambda$6$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OptionChainStore$streamActiveUiOptionUnderlierByOptionChain$lambda$6$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainStore$streamActiveUiOptionUnderlierByOptionChain$lambda$6$$inlined$map$1$2", m3645f = "OptionChainStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OptionChainStore$streamActiveUiOptionUnderlierByOptionChain$lambda$6$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        Optional optionalAsOptional = Optional3.asOptional(CollectionsKt.maxOrNull((Iterable) obj));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends UiOptionUnderlier>> flowCollector, Continuation continuation) {
                Object objCollect = uiOptionUnderlierByOptionChain.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<UiOptionChain> getUiOptionChainByOptionInstrument(UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getUiOptionChainByOptionInstrument(optionInstrumentId))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job pingOptionChainJob(UUID optionChainId) {
        return pingOptionChainsJob$lib_store_options_externalDebug(CollectionsKt.listOf(optionChainId));
    }

    public final Job pingOptionChainsJob$lib_store_options_externalDebug(List<UUID> optionChainIds) {
        Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
        return BuildersKt__Builders_commonKt.launch$default(getLogoutKillswitch().getLoggedInScope(), null, null, new OptionChainStore$pingOptionChainsJob$1(this, optionChainIds, null), 3, null);
    }

    public static /* synthetic */ Completable pingOptionChainsCompletable$default(OptionChainStore optionChainStore, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return optionChainStore.pingOptionChainsCompletable(list, z);
    }

    public final Completable pingOptionChainsCompletable(List<UUID> optionChainIds, boolean force) {
        Flow<PaginatedResult<ApiOptionChain>> flowFetchAllPages;
        Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
        if (force) {
            flowFetchAllPages = this.getOptionChains.forceFetchAllPages(optionChainIds);
        } else {
            flowFetchAllPages = this.getOptionChains.fetchAllPages(optionChainIds);
        }
        Completable completableFlatMapCompletable = asObservable(flowFetchAllPages).flatMapCompletable(new C340231());
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return Completables.ignoreNetworkExceptions(completableFlatMapCompletable);
    }

    /* compiled from: OptionChainStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OptionChainStore$pingOptionChainsCompletable$1 */
    static final class C340231<T, R> implements Function {
        C340231() {
        }

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(PaginatedResult<ApiOptionChain> chains) {
            Intrinsics.checkNotNullParameter(chains, "chains");
            return OptionChainStore.this.instrumentStore.pingInstrumentsCompletable(SequencesKt.toList(SequencesKt.map(SequencesKt.flatMap(CollectionsKt.asSequence(chains), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainStore$pingOptionChainsCompletable$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainStore.C340231.apply$lambda$0((ApiOptionChain) obj);
                }
            }), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionChainStore$pingOptionChainsCompletable$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainStore.C340231.apply$lambda$1((ApiOptionChain2) obj);
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Sequence apply$lambda$0(ApiOptionChain it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.asSequence(it.getUnderlying_instruments());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID apply$lambda$1(ApiOptionChain2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getInstrumentId();
        }
    }

    public static /* synthetic */ Flow refreshAndStreamUiOptionChain$default(OptionChainStore optionChainStore, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return optionChainStore.refreshAndStreamUiOptionChain(list, z);
    }

    public final Flow<List<UiOptionChain>> refreshAndStreamUiOptionChain(List<UUID> optionChainIds, boolean force) {
        Intrinsics.checkNotNullParameter(optionChainIds, "optionChainIds");
        this.getOptionChains.refreshAllPages(optionChainIds, force);
        return this.streamUiOptionChains.asFlow(optionChainIds);
    }
}
