package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.lib.p166fx.provider.FxOrderProvider;
import com.robinhood.android.lib.store.mcw.McwStore;
import com.robinhood.android.lib.store.mcw.data.ConvertibleCurrency;
import com.robinhood.android.mcw.contracts.CurrencyConverterReceiptKey;
import com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p325fx.p326db.FxOrder;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CurrencyConverterReceiptDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptDataState;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterReceiptKey;", "mcwStore", "Lcom/robinhood/android/lib/store/mcw/McwStore;", "fxOrderProvider", "Lcom/robinhood/android/lib/fx/provider/FxOrderProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/store/mcw/McwStore;Lcom/robinhood/android/lib/fx/provider/FxOrderProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "args", "getArgs", "()Lcom/robinhood/android/mcw/contracts/CurrencyConverterReceiptKey;", "fxOrderJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CurrencyConverterReceiptDuxo extends BaseDuxo3<CurrencyConverterReceiptDataState, CurrencyConverterReceiptViewState, CurrencyConverterReceiptEvent> implements HasArgs<CurrencyConverterReceiptKey> {
    public static final int $stable = 8;
    private Job fxOrderJob;
    private final FxOrderProvider fxOrderProvider;
    private final McwStore mcwStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public CurrencyConverterReceiptKey getArgs(SavedStateHandle savedStateHandle) {
        return (CurrencyConverterReceiptKey) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyConverterReceiptDuxo(McwStore mcwStore, FxOrderProvider fxOrderProvider, SavedStateHandle savedStateHandle, CurrencyConverterReceiptStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CurrencyConverterReceiptDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(mcwStore, "mcwStore");
        Intrinsics.checkNotNullParameter(fxOrderProvider, "fxOrderProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.mcwStore = mcwStore;
        this.fxOrderProvider = fxOrderProvider;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CurrencyConverterReceiptKey getArgs() {
        return (CurrencyConverterReceiptKey) getArgs(getSavedStateHandle());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Job job = this.fxOrderJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.fxOrderJob = getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C217701(null));
    }

    /* compiled from: CurrencyConverterReceiptDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1", m3645f = "CurrencyConverterReceiptDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1 */
    static final class C217701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C217701(Continuation<? super C217701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurrencyConverterReceiptDuxo.this.new C217701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C217701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<FxOrder> flowPollSingle = CurrencyConverterReceiptDuxo.this.fxOrderProvider.pollSingle(CurrencyConverterReceiptDuxo.this.getArgs().getAccountNumber(), CurrencyConverterReceiptDuxo.this.getArgs().getOrderId());
                final CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo = CurrencyConverterReceiptDuxo.this;
                Flow<Tuples2<? extends FxOrder, ? extends Money>> flow = new Flow<Tuples2<? extends FxOrder, ? extends Money>>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ CurrencyConverterReceiptDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "CurrencyConverterReceiptDuxo.kt", m3646l = {51, 50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = currencyConverterReceiptDuxo;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
                        
                            if (r2.emit(r9, r0) == r1) goto L30;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            FlowCollector flowCollector;
                            FxOrder fxOrder;
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
                            Object objFetchConvertibleCurrencies = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(objFetchConvertibleCurrencies);
                                flowCollector = this.$this_unsafeFlow;
                                fxOrder = (FxOrder) obj;
                                McwStore mcwStore = this.this$0.mcwStore;
                                String accountNumber = this.this$0.getArgs().getAccountNumber();
                                anonymousClass1.L$0 = flowCollector;
                                anonymousClass1.L$1 = fxOrder;
                                anonymousClass1.label = 1;
                                objFetchConvertibleCurrencies = mcwStore.fetchConvertibleCurrencies(accountNumber, anonymousClass1);
                                if (objFetchConvertibleCurrencies != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(objFetchConvertibleCurrencies);
                                return Unit.INSTANCE;
                            }
                            fxOrder = (FxOrder) anonymousClass1.L$1;
                            flowCollector = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(objFetchConvertibleCurrencies);
                            Iterator<T> it = ((Iterable) objFetchConvertibleCurrencies).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                                if (Intrinsics.areEqual(((ConvertibleCurrency) next).getCurrency(), DisplayCurrencyExtensions.toJavaCurrency(fxOrder.getToCurrency()))) {
                                    break;
                                }
                            }
                            ConvertibleCurrency convertibleCurrency = next;
                            if (convertibleCurrency == null) {
                                throw new IllegalStateException("Could not find the fx order's to-currency in list of convertible currencies");
                            }
                            Tuples2 tuples2M3642to = Tuples4.m3642to(fxOrder, new Money(convertibleCurrency.getCurrency(), convertibleCurrency.getBalance()));
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends FxOrder, ? extends Money>> flowCollector, Continuation continuation) {
                        Object objCollect = flowPollSingle.collect(new AnonymousClass2(flowCollector, currencyConverterReceiptDuxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Duration.Companion companion = Duration.INSTANCE;
                Flow flowM28818catch = FlowKt.m28818catch(FlowKt.m28821timeoutHG0u8IE(flow, Duration3.toDuration(20, DurationUnitJvm.SECONDS)), new AnonymousClass2(CurrencyConverterReceiptDuxo.this, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CurrencyConverterReceiptDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowM28818catch, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: CurrencyConverterReceiptDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/robinhood/models/fx/db/FxOrder;", "Lcom/robinhood/models/util/Money;", "error", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$2", m3645f = "CurrencyConverterReceiptDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends FxOrder, ? extends Money>>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CurrencyConverterReceiptDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = currencyConverterReceiptDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends FxOrder, ? extends Money>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super Tuples2<FxOrder, Money>>) flowCollector, th, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super Tuples2<FxOrder, Money>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                if (!Throwables.isNetworkRelated(th) && !(th instanceof Timeout4)) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
                this.this$0.submit(new CurrencyConverterReceiptEvent.Error(th));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: CurrencyConverterReceiptDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/fx/db/FxOrder;", "Lcom/robinhood/models/util/Money;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$3", m3645f = "CurrencyConverterReceiptDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends FxOrder, ? extends Money>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CurrencyConverterReceiptDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = currencyConverterReceiptDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends FxOrder, ? extends Money> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<FxOrder, Money>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<FxOrder, Money> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CurrencyConverterReceiptDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$3$1", m3645f = "CurrencyConverterReceiptDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CurrencyConverterReceiptDataState, Continuation<? super CurrencyConverterReceiptDataState>, Object> {
                final /* synthetic */ FxOrder $order;
                final /* synthetic */ Money $toBalance;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(FxOrder fxOrder, Money money, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$order = fxOrder;
                    this.$toBalance = money;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$order, this.$toBalance, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CurrencyConverterReceiptDataState currencyConverterReceiptDataState, Continuation<? super CurrencyConverterReceiptDataState> continuation) {
                    return ((AnonymousClass1) create(currencyConverterReceiptDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CurrencyConverterReceiptDataState) this.L$0).copy(this.$order, this.$toBalance);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    FxOrder fxOrder = (FxOrder) tuples2.component1();
                    this.this$0.applyMutation(new AnonymousClass1(fxOrder, (Money) tuples2.component2(), null));
                    if (!fxOrder.getIsPending()) {
                        Job job = this.this$0.fxOrderJob;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, null, 1, null);
                        }
                        this.this$0.fxOrderJob = null;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
