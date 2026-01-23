package com.robinhood.android.transfers.canceltransfer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.store.history.HistoryTransactionStore;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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

/* compiled from: CancelTransferConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00012\u00020\u0006:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0006\u0010\u001a\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDataState;", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationViewState;", "Lkotlin/Result;", "", "Lcom/robinhood/android/udf/HasSavedState;", "historyTransactionStore", "Lcom/robinhood/shared/store/history/HistoryTransactionStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/history/HistoryTransactionStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "getHistoryEvent", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "historyEvent$delegate", "Lkotlin/Lazy;", "onCreate", "cancelTransfer", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CancelTransferConfirmationDuxo extends BaseDuxo3<CancelTransferConfirmationDataState, CancelTransferConfirmationViewState, Result<? extends Unit>> implements HasSavedState {

    /* renamed from: historyEvent$delegate, reason: from kotlin metadata */
    private final Lazy historyEvent;
    private final HistoryTransactionStore historyTransactionStore;
    private final PaymentTransferStore paymentTransferStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelTransferConfirmationDuxo(HistoryTransactionStore historyTransactionStore, PaymentTransferStore paymentTransferStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new CancelTransferConfirmationDataState(null, false, 3, null), new CancelTransferConfirmationStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(historyTransactionStore, "historyTransactionStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.historyTransactionStore = historyTransactionStore;
        this.paymentTransferStore = paymentTransferStore;
        this.savedStateHandle = savedStateHandle;
        this.historyEvent = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelTransferConfirmationDuxo.historyEvent_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final HistoryEvent getHistoryEvent() {
        return (HistoryEvent) this.historyEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryEvent historyEvent_delegate$lambda$0(CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo) {
        return ((CancelTransferConfirmationDialogFragment.Args) INSTANCE.getArgs((HasSavedState) cancelTransferConfirmationDuxo)).getTransferHistoryEvent();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CancelTransferConfirmationDuxo.onCreate$lambda$1(this.f$0, (CancelTransferConfirmationDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo, CancelTransferConfirmationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        LifecycleHost.DefaultImpls.bind$default(cancelTransferConfirmationDuxo, cancelTransferConfirmationDuxo.historyTransactionStore.fromHistoryEvent(cancelTransferConfirmationDuxo.getHistoryEvent()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1<?, Unit>() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$onCreate$1$1

            /* compiled from: CancelTransferConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$onCreate$1$1$1", m3645f = "CancelTransferConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$onCreate$1$1$1 */
            static final class C302031 extends ContinuationImpl7 implements Function2<CancelTransferConfirmationDataState, Continuation<? super CancelTransferConfirmationDataState>, Object> {
                final /* synthetic */ MinervaTransaction $minervaTransaction;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C302031(MinervaTransaction minervaTransaction, Continuation<? super C302031> continuation) {
                    super(2, continuation);
                    this.$minervaTransaction = minervaTransaction;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C302031 c302031 = new C302031(this.$minervaTransaction, continuation);
                    c302031.L$0 = obj;
                    return c302031;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CancelTransferConfirmationDataState cancelTransferConfirmationDataState, Continuation<? super CancelTransferConfirmationDataState> continuation) {
                    return ((C302031) create(cancelTransferConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CancelTransferConfirmationDataState.copy$default((CancelTransferConfirmationDataState) this.L$0, this.$minervaTransaction, false, 2, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((MinervaTransaction) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(MinervaTransaction minervaTransaction) {
                Intrinsics.checkNotNullParameter(minervaTransaction, "minervaTransaction");
                this.this$0.applyMutation(new C302031(minervaTransaction, null));
            }
        });
        return Unit.INSTANCE;
    }

    public final void cancelTransfer() {
        Completable completableDoFinally = this.paymentTransferStore.cancelTransfer(getHistoryEvent().getId()).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo.cancelTransfer.1

            /* compiled from: CancelTransferConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$cancelTransfer$1$1", m3645f = "CancelTransferConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$cancelTransfer$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CancelTransferConfirmationDataState, Continuation<? super CancelTransferConfirmationDataState>, Object> {
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
                public final Object invoke(CancelTransferConfirmationDataState cancelTransferConfirmationDataState, Continuation<? super CancelTransferConfirmationDataState> continuation) {
                    return ((AnonymousClass1) create(cancelTransferConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CancelTransferConfirmationDataState.copy$default((CancelTransferConfirmationDataState) this.L$0, null, true, 1, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CancelTransferConfirmationDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo.cancelTransfer.2

            /* compiled from: CancelTransferConfirmationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$cancelTransfer$2$1", m3645f = "CancelTransferConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$cancelTransfer$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CancelTransferConfirmationDataState, Continuation<? super CancelTransferConfirmationDataState>, Object> {
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
                public final Object invoke(CancelTransferConfirmationDataState cancelTransferConfirmationDataState, Continuation<? super CancelTransferConfirmationDataState> continuation) {
                    return ((AnonymousClass1) create(cancelTransferConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CancelTransferConfirmationDataState.copy$default((CancelTransferConfirmationDataState) this.L$0, null, false, 1, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                CancelTransferConfirmationDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CancelTransferConfirmationDuxo.cancelTransfer$lambda$2(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CancelTransferConfirmationDuxo.cancelTransfer$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$2(CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo) {
        Result.Companion companion = Result.INSTANCE;
        Unit unit = Unit.INSTANCE;
        cancelTransferConfirmationDuxo.submit(Result.m28549boximpl(Result.m28550constructorimpl(unit)));
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelTransfer$lambda$3(CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Result.Companion companion = Result.INSTANCE;
        cancelTransferConfirmationDuxo.submit(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(t))));
        return Unit.INSTANCE;
    }

    /* compiled from: CancelTransferConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDuxo;", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Args;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CancelTransferConfirmationDuxo, CancelTransferConfirmationDialogFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CancelTransferConfirmationDialogFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CancelTransferConfirmationDialogFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CancelTransferConfirmationDialogFragment.Args getArgs(CancelTransferConfirmationDuxo cancelTransferConfirmationDuxo) {
            return (CancelTransferConfirmationDialogFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cancelTransferConfirmationDuxo);
        }
    }
}
