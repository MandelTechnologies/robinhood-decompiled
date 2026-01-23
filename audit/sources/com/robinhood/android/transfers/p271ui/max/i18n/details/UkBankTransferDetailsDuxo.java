package com.robinhood.android.transfers.p271ui.max.i18n.details;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.contracts.UkBankTransferFragmentKey;
import com.robinhood.android.transfers.p271ui.experiments.TemporaryCancelUkTransferExperiment;
import com.robinhood.android.transfers.p271ui.max.i18n.details.UkBankTransferDetailsEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: UkBankTransferDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001bB9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsViewState;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transferId", "Ljava/util/UUID;", "onStart", "", "cancelTransfer", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class UkBankTransferDetailsDuxo extends BaseDuxo3<UkBankTransferDetailsDataState, UkBankTransferDetailsViewState, UkBankTransferDetailsEvent> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final PaymentInstrumentStore paymentInstrumentStore;
    private final PaymentTransferStore paymentTransferStore;
    private final SavedStateHandle savedStateHandle;
    private final UUID transferId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UkBankTransferDetailsDuxo(ExperimentsStore experimentsStore, PaymentTransferStore paymentTransferStore, PaymentInstrumentStore paymentInstrumentStore, SavedStateHandle savedStateHandle, UkBankTransferDetailsStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new UkBankTransferDetailsDataState(null, null, false, false, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentsStore = experimentsStore;
        this.paymentTransferStore = paymentTransferStore;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.savedStateHandle = savedStateHandle;
        this.transferId = ((UkBankTransferFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getUuid();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C307811(null), 3, null);
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{TemporaryCancelUkTransferExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UkBankTransferDetailsDuxo.onStart$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* compiled from: UkBankTransferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$onStart$1", m3645f = "UkBankTransferDetailsDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$onStart$1 */
    static final class C307811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C307811(Continuation<? super C307811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkBankTransferDetailsDuxo.this.new C307811(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(PaymentTransferStore.getPaymentTransfer$default(UkBankTransferDetailsDuxo.this.paymentTransferStore, UkBankTransferDetailsDuxo.this.transferId, false, 2, null)), Integer.MAX_VALUE, null, 2, null), new C30777x6a4e2545(null, UkBankTransferDetailsDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(UkBankTransferDetailsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: UkBankTransferDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$onStart$1$2", m3645f = "UkBankTransferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends PaymentTransfer, ? extends PaymentInstrumentV2>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UkBankTransferDetailsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UkBankTransferDetailsDuxo ukBankTransferDetailsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ukBankTransferDetailsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends PaymentTransfer, ? extends PaymentInstrumentV2> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<PaymentTransfer, PaymentInstrumentV2>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<PaymentTransfer, PaymentInstrumentV2> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UkBankTransferDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$onStart$1$2$1", m3645f = "UkBankTransferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$onStart$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UkBankTransferDetailsDataState, Continuation<? super UkBankTransferDetailsDataState>, Object> {
                final /* synthetic */ PaymentInstrumentV2 $instrument;
                final /* synthetic */ PaymentTransfer $transfer;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PaymentTransfer paymentTransfer, PaymentInstrumentV2 paymentInstrumentV2, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$transfer = paymentTransfer;
                    this.$instrument = paymentInstrumentV2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transfer, this.$instrument, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UkBankTransferDetailsDataState ukBankTransferDetailsDataState, Continuation<? super UkBankTransferDetailsDataState> continuation) {
                    return ((AnonymousClass1) create(ukBankTransferDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UkBankTransferDetailsDataState.copy$default((UkBankTransferDetailsDataState) this.L$0, this.$transfer, this.$instrument, false, false, 12, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1((PaymentTransfer) tuples2.component1(), (PaymentInstrumentV2) tuples2.component2(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(UkBankTransferDetailsDuxo ukBankTransferDetailsDuxo, boolean z) {
        ukBankTransferDetailsDuxo.applyMutation(new UkBankTransferDetailsDuxo2(z, null));
        return Unit.INSTANCE;
    }

    public final void cancelTransfer() {
        Completable completableDoFinally = this.paymentTransferStore.cancelTransfer(this.transferId).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo.cancelTransfer.1

            /* compiled from: UkBankTransferDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$cancelTransfer$1$1", m3645f = "UkBankTransferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$cancelTransfer$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UkBankTransferDetailsDataState, Continuation<? super UkBankTransferDetailsDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UkBankTransferDetailsDataState ukBankTransferDetailsDataState, Continuation<? super UkBankTransferDetailsDataState> continuation) {
                    return ((AnonymousClass1) create(ukBankTransferDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UkBankTransferDetailsDataState.copy$default((UkBankTransferDetailsDataState) this.L$0, null, null, false, true, 7, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                UkBankTransferDetailsDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo.cancelTransfer.2

            /* compiled from: UkBankTransferDetailsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$cancelTransfer$2$1", m3645f = "UkBankTransferDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$cancelTransfer$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UkBankTransferDetailsDataState, Continuation<? super UkBankTransferDetailsDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UkBankTransferDetailsDataState ukBankTransferDetailsDataState, Continuation<? super UkBankTransferDetailsDataState> continuation) {
                    return ((AnonymousClass1) create(ukBankTransferDetailsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return UkBankTransferDetailsDataState.copy$default((UkBankTransferDetailsDataState) this.L$0, null, null, false, false, 7, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                UkBankTransferDetailsDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UkBankTransferDetailsDuxo.cancelTransfer$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UkBankTransferDetailsDuxo.cancelTransfer$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$1(UkBankTransferDetailsDuxo ukBankTransferDetailsDuxo) {
        ukBankTransferDetailsDuxo.submit(UkBankTransferDetailsEvent.CancelSuccess.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$2(UkBankTransferDetailsDuxo ukBankTransferDetailsDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ukBankTransferDetailsDuxo.submit(new UkBankTransferDetailsEvent.Error(throwable));
        return Unit.INSTANCE;
    }

    /* compiled from: UkBankTransferDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/UkBankTransferDetailsDuxo;", "Lcom/robinhood/android/transfers/contracts/UkBankTransferFragmentKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UkBankTransferDetailsDuxo, UkBankTransferFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UkBankTransferFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (UkBankTransferFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UkBankTransferFragmentKey getArgs(UkBankTransferDetailsDuxo ukBankTransferDetailsDuxo) {
            return (UkBankTransferFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, ukBankTransferDetailsDuxo);
        }
    }
}
