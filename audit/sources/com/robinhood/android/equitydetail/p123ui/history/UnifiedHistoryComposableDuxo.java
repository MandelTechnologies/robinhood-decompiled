package com.robinhood.android.equitydetail.p123ui.history;

import androidx.paging.PagedList;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: UnifiedHistoryComposableDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryComposableDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewState;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "transactionTypes", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "bind", "Lkotlinx/coroutines/Job;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "historyType", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryType;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class UnifiedHistoryComposableDuxo extends BaseDuxo4<UnifiedHistoryViewState> {
    public static final int $stable = 8;
    private final HistoryStore historyStore;
    private final Set<HistoryTransactionType> transactionTypes;
    private final UnifiedAccountStore unifiedAccountStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedHistoryComposableDuxo(HistoryStore historyStore, UnifiedAccountStore unifiedAccountStore, DuxoBundle duxoBundle) {
        super(new UnifiedHistoryViewState(null, false, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.historyStore = historyStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.transactionTypes = SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.EQUITY_ORDER, HistoryTransactionType.OPTION_ORDER, HistoryTransactionType.COMBO_ORDER, HistoryTransactionType.OPTION_EVENT, HistoryTransactionType.DIVIDEND, HistoryTransactionType.ADR_FEE, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_BUYING_POWER, HistoryTransactionType.INVESTMENT_SCHEDULE_EVENT_WITH_ACH, HistoryTransactionType.SLIP_GROUPED_PAYMENT, HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT, HistoryTransactionType.PSP_GIFT_ITEM, HistoryTransactionType.ROUNDUP_REWARD, HistoryTransactionType.BORROW_CHARGE});
    }

    /* compiled from: UnifiedHistoryComposableDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1", m3645f = "UnifiedHistoryComposableDuxo.kt", m3646l = {67, 95}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1 */
    static final class C154911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UnifiedHistoryType $historyType;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* compiled from: UnifiedHistoryComposableDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UnifiedHistoryType.values().length];
                try {
                    iArr[UnifiedHistoryType.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UnifiedHistoryType.PENDING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C154911(String str, UnifiedHistoryType unifiedHistoryType, UUID uuid, Continuation<? super C154911> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$historyType = unifiedHistoryType;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UnifiedHistoryComposableDuxo.this.new C154911(this.$accountNumber, this.$historyType, this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C154911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ec, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r3, r25) == r1) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            Object objM2972of;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(UnifiedHistoryComposableDuxo.this.unifiedAccountStore.streamAccount(this.$accountNumber)), Integer.MAX_VALUE, null, 2, null);
                Flow flowFilterNotNull = FlowKt.filterNotNull(new Flow<UnifiedAccountV2>() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C154892<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$invokeSuspend$$inlined$map$1$2", m3645f = "UnifiedHistoryComposableDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C154892.this.emit(null, this);
                            }
                        }

                        public C154892(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
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
                                Object orNull = ((Optional) obj).getOrNull();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super UnifiedAccountV2> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C154892(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                this.label = 1;
                objFirst = FlowKt.first(flowFilterNotNull, this);
                if (objFirst != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objFirst = obj;
            UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) objFirst;
            HistoryStore historyStore = UnifiedHistoryComposableDuxo.this.historyStore;
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$historyType.ordinal()];
            if (i2 == 1) {
                objM2972of = Optional2.INSTANCE;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                objM2972of = Optional.INSTANCE.m2972of(HistoryEvent.State.PENDING);
            }
            Observable observableJust = Observable.just(objM2972of);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            Observable observableJust2 = Observable.just(UnifiedHistoryComposableDuxo.this.transactionTypes);
            Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
            Observable observableJust3 = Observable.just(Instant.EPOCH);
            Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
            final Flow flowBuffer$default2 = Context7.buffer$default(RxConvert.asFlow(HistoryStore.stream$default(historyStore, observableJust, observableJust2, observableJust3, null, new HistoryStaticFilter(new HistoryStaticFilter.InstrumentFilter(this.$instrumentId, HistoryStaticFilter.InstrumentFilterType.EQUITY), new HistoryStaticFilter.RhsAccountContext(this.$accountNumber, unifiedAccountV2.getBrokerageAccountType()), null, null, null, null, null, null, boxing.boxBoolean(true), null, 764, null), 5, 8, null)), Integer.MAX_VALUE, null, 2, null);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, ? extends Boolean>>() { // from class: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$invokeSuspend$$inlined$map$2

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$invokeSuspend$$inlined$map$2$2 */
                public static final class C154902<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$invokeSuspend$$inlined$map$2$2", m3645f = "UnifiedHistoryComposableDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                            return C154902.this.emit(null, this);
                        }
                    }

                    public C154902(FlowCollector flowCollector) {
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
                            PagedList pagedList = (PagedList) obj;
                            List<T> listSubList = pagedList.subList(0, Math.min(pagedList.size(), 4));
                            Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
                            Tuples2 tuples2M3642to = Tuples4.m3642to(CollectionsKt.filterNotNull(listSubList), boxing.boxBoolean(pagedList.size() > 4));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(FlowCollector<? super Tuples2<? extends List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, ? extends Boolean>> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default2.collect(new C154902(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(UnifiedHistoryComposableDuxo.this, null);
            this.label = 2;
        }

        /* compiled from: UnifiedHistoryComposableDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0004\u0012\u00020\u00070\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$2", m3645f = "UnifiedHistoryComposableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, ? extends Boolean>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UnifiedHistoryComposableDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UnifiedHistoryComposableDuxo unifiedHistoryComposableDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = unifiedHistoryComposableDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, Boolean>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends List<? extends StatefulHistoryEvent<? extends HistoryEvent>>, Boolean> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UnifiedHistoryComposableDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/history/UnifiedHistoryViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$2$1", m3645f = "UnifiedHistoryComposableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.history.UnifiedHistoryComposableDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UnifiedHistoryViewState, Continuation<? super UnifiedHistoryViewState>, Object> {
                final /* synthetic */ boolean $displayShowAll;
                final /* synthetic */ List<StatefulHistoryEvent<HistoryEvent>> $historyEvents;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(List<? extends StatefulHistoryEvent<? extends HistoryEvent>> list, boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$historyEvents = list;
                    this.$displayShowAll = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$historyEvents, this.$displayShowAll, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UnifiedHistoryViewState unifiedHistoryComposableDuxo3, Continuation<? super UnifiedHistoryViewState> continuation) {
                    return ((AnonymousClass1) create(unifiedHistoryComposableDuxo3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((UnifiedHistoryViewState) this.L$0).copy(extensions2.toImmutableList(this.$historyEvents), this.$displayShowAll);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1((List) tuples2.component1(), ((Boolean) tuples2.component2()).booleanValue(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind(UUID instrumentId, String accountNumber, UnifiedHistoryType historyType) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(historyType, "historyType");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C154911(accountNumber, historyType, instrumentId, null), 3, null);
    }
}
