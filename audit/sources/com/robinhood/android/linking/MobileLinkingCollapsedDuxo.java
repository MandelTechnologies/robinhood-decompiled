package com.robinhood.android.linking;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.linking.MobileLinkingCollapsedDuxo;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.android.store.linking.MobileLinkingStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import hippo.model.p469v1.InstrumentTypeDto;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MobileLinkingCollapsedDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/linking/MobileLinkingCollapsedDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/linking/MobileLinkingCollapsedState;", "Lcom/robinhood/android/udf/HasSavedState;", "mobileLinkingStore", "Lcom/robinhood/android/store/linking/MobileLinkingStore;", "futuresContractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresProductStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/store/linking/MobileLinkingStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/futures/arsenal/FuturesProductStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchLinkingGroup", "Lkotlinx/coroutines/Job;", "getFuturesContractSymbol", "", "instrumentId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFuturesProductSymbol", "getCryptoSymbol", "lib-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MobileLinkingCollapsedDuxo extends BaseDuxo4<MobileLinkingCollapsedState> implements HasSavedState {
    public static final int $stable = 8;
    private final CurrencyPairV2Store currencyPairStore;
    private final FuturesContractStore futuresContractStore;
    private final FuturesProductStore futuresProductStore;
    private final MobileLinkingStore mobileLinkingStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileLinkingCollapsedDuxo(MobileLinkingStore mobileLinkingStore, FuturesContractStore futuresContractStore, FuturesProductStore futuresProductStore, CurrencyPairV2Store currencyPairStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new MobileLinkingCollapsedState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(mobileLinkingStore, "mobileLinkingStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.mobileLinkingStore = mobileLinkingStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresProductStore = futuresProductStore;
        this.currencyPairStore = currencyPairStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: MobileLinkingCollapsedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1", m3645f = "MobileLinkingCollapsedDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1 */
    static final class C208271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: MobileLinkingCollapsedDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InstrumentTypeDto.values().length];
                try {
                    iArr[InstrumentTypeDto.INSTRUMENT_TYPE_FUTURES_CONTRACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InstrumentTypeDto.INSTRUMENT_TYPE_FUTURES_PRODUCT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InstrumentTypeDto.INSTRUMENT_TYPE_CRYPTO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C208271(Continuation<? super C208271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MobileLinkingCollapsedDuxo.this.new C208271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C208271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Operators.combine(MobileLinkingCollapsedDuxo.this.mobileLinkingStore.streamLinkingGroups(), MobileLinkingCollapsedDuxo.this.mobileLinkingStore.streamSelectedGroupId()));
                final Flow flowFilterNotNull = FlowKt.filterNotNull(new Flow<LinkingGroup>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$invokeSuspend$$inlined$map$1$2", m3645f = "MobileLinkingCollapsedDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                Tuples2 tuples2 = (Tuples2) obj;
                                List list = (List) tuples2.component1();
                                String str = (String) tuples2.component2();
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = (T) null;
                                        break;
                                    }
                                    next = it.next();
                                    if (Intrinsics.areEqual(((LinkingGroup) next).getId(), str)) {
                                        break;
                                    }
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super LinkingGroup> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                final MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo = MobileLinkingCollapsedDuxo.this;
                Flow<LinkingGroup> flow = new Flow<LinkingGroup>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$invokeSuspend$$inlined$map$2

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ MobileLinkingCollapsedDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$invokeSuspend$$inlined$map$2$2", m3645f = "MobileLinkingCollapsedDuxo.kt", m3646l = {54, 55, 56, 50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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

                        public AnonymousClass2(FlowCollector flowCollector, MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = mobileLinkingCollapsedDuxo;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
                        
                            if (r1.emit(r4, r2) != r3) goto L45;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            FlowCollector flowCollector;
                            LinkingGroup linkingGroup;
                            FlowCollector flowCollector2;
                            String instrumentSymbol;
                            String str;
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
                                flowCollector = this.$this_unsafeFlow;
                                linkingGroup = (LinkingGroup) obj;
                                UUID uuidFromString = UUID.fromString(linkingGroup.getInstrumentId());
                                int i3 = MobileLinkingCollapsedDuxo.C208271.WhenMappings.$EnumSwitchMapping$0[linkingGroup.getInstrumentType().ordinal()];
                                if (i3 == 1) {
                                    MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo = this.this$0;
                                    Intrinsics.checkNotNull(uuidFromString);
                                    anonymousClass1.L$0 = flowCollector;
                                    anonymousClass1.L$1 = linkingGroup;
                                    anonymousClass1.label = 1;
                                    Object futuresContractSymbol = mobileLinkingCollapsedDuxo.getFuturesContractSymbol(uuidFromString, anonymousClass1);
                                    if (futuresContractSymbol != coroutine_suspended) {
                                        flowCollector2 = flowCollector;
                                        obj2 = futuresContractSymbol;
                                        str = (String) obj2;
                                    }
                                } else if (i3 == 2) {
                                    MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo2 = this.this$0;
                                    Intrinsics.checkNotNull(uuidFromString);
                                    anonymousClass1.L$0 = flowCollector;
                                    anonymousClass1.L$1 = linkingGroup;
                                    anonymousClass1.label = 2;
                                    Object futuresProductSymbol = mobileLinkingCollapsedDuxo2.getFuturesProductSymbol(uuidFromString, anonymousClass1);
                                    if (futuresProductSymbol != coroutine_suspended) {
                                        flowCollector2 = flowCollector;
                                        obj2 = futuresProductSymbol;
                                        str = (String) obj2;
                                    }
                                } else if (i3 == 3) {
                                    MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo3 = this.this$0;
                                    Intrinsics.checkNotNull(uuidFromString);
                                    anonymousClass1.L$0 = flowCollector;
                                    anonymousClass1.L$1 = linkingGroup;
                                    anonymousClass1.label = 3;
                                    Object cryptoSymbol = mobileLinkingCollapsedDuxo3.getCryptoSymbol(uuidFromString, anonymousClass1);
                                    if (cryptoSymbol != coroutine_suspended) {
                                        flowCollector2 = flowCollector;
                                        obj2 = cryptoSymbol;
                                        str = (String) obj2;
                                    }
                                } else {
                                    instrumentSymbol = linkingGroup.getInstrumentSymbol();
                                    LinkingGroup linkingGroupCopy$default = LinkingGroup.copy$default(linkingGroup, null, null, null, null, null, instrumentSymbol, null, 95, null);
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.label = 4;
                                }
                                return coroutine_suspended;
                            }
                            if (i2 == 1) {
                                linkingGroup = (LinkingGroup) anonymousClass1.L$1;
                                flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                str = (String) obj2;
                            } else if (i2 == 2) {
                                linkingGroup = (LinkingGroup) anonymousClass1.L$1;
                                flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                str = (String) obj2;
                            } else {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                linkingGroup = (LinkingGroup) anonymousClass1.L$1;
                                flowCollector2 = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                str = (String) obj2;
                            }
                            instrumentSymbol = str;
                            flowCollector = flowCollector2;
                            LinkingGroup linkingGroupCopy$default2 = LinkingGroup.copy$default(linkingGroup, null, null, null, null, null, instrumentSymbol, null, 95, null);
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 4;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super LinkingGroup> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector, mobileLinkingCollapsedDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(MobileLinkingCollapsedDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: MobileLinkingCollapsedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "linkingGroup", "Lcom/robinhood/android/store/linking/LinkingGroup;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$3", m3645f = "MobileLinkingCollapsedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<LinkingGroup, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MobileLinkingCollapsedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(MobileLinkingCollapsedDuxo mobileLinkingCollapsedDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = mobileLinkingCollapsedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(LinkingGroup linkingGroup, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(linkingGroup, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MobileLinkingCollapsedDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/linking/MobileLinkingCollapsedState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$3$1", m3645f = "MobileLinkingCollapsedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$fetchLinkingGroup$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MobileLinkingCollapsedState, Continuation<? super MobileLinkingCollapsedState>, Object> {
                final /* synthetic */ LinkingGroup $linkingGroup;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LinkingGroup linkingGroup, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$linkingGroup = linkingGroup;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$linkingGroup, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MobileLinkingCollapsedState mobileLinkingCollapsedState, Continuation<? super MobileLinkingCollapsedState> continuation) {
                    return ((AnonymousClass1) create(mobileLinkingCollapsedState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((MobileLinkingCollapsedState) this.L$0).copy(this.$linkingGroup);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((LinkingGroup) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job fetchLinkingGroup() {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C208271(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFuturesContractSymbol(UUID uuid, Continuation<? super String> continuation) {
        final Flow<FuturesContract> flowStreamFuturesContract = this.futuresContractStore.streamFuturesContract(uuid);
        return FlowKt.first(new Flow<String>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getFuturesContractSymbol$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getFuturesContractSymbol$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getFuturesContractSymbol$$inlined$map$1$2", m3645f = "MobileLinkingCollapsedDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getFuturesContractSymbol$$inlined$map$1$2$1, reason: invalid class name */
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
                        String displaySymbol = ((FuturesContract) obj).getDisplaySymbol();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(displaySymbol, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamFuturesContract.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFuturesProductSymbol(UUID uuid, Continuation<? super String> continuation) {
        final Flow<FuturesProduct> flowStreamFuturesProduct = this.futuresProductStore.streamFuturesProduct(uuid);
        return FlowKt.first(new Flow<String>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getFuturesProductSymbol$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getFuturesProductSymbol$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getFuturesProductSymbol$$inlined$map$1$2", m3645f = "MobileLinkingCollapsedDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getFuturesProductSymbol$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesProduct futuresProduct = (FuturesProduct) obj;
                        String displaySymbol = futuresProduct.getDisplaySymbol();
                        if (displaySymbol == null) {
                            displaySymbol = futuresProduct.getSymbol();
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(displaySymbol, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamFuturesProduct.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCryptoSymbol(UUID uuid, Continuation<? super String> continuation) {
        final Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = this.currencyPairStore.streamCurrencyPairFlow(uuid);
        return FlowKt.first(new Flow<String>() { // from class: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getCryptoSymbol$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getCryptoSymbol$$inlined$map$1$2 */
            public static final class C208242<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getCryptoSymbol$$inlined$map$1$2", m3645f = "MobileLinkingCollapsedDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.linking.MobileLinkingCollapsedDuxo$getCryptoSymbol$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C208242.this.emit(null, this);
                    }
                }

                public C208242(FlowCollector flowCollector) {
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
                        String displaySymbol = ((UiCurrencyPair) obj).getDisplaySymbol();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(displaySymbol, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamCurrencyPairFlow.collect(new C208242(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, continuation);
    }
}
