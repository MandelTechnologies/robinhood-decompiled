package com.robinhood.android.transfers.p271ui.confirm;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.confirm.ConfirmTransferDuxo;
import com.robinhood.android.transfers.p271ui.confirm.ConfirmTransferFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedCompletable;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.api.bonfire.ApiConfirmTransferResponse;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.transfers.models.p406db.AchTransfer;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConfirmTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "transferId", "Ljava/util/UUID;", "onStart", "", "confirmTransfer", "abortTransfer", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmTransferDuxo extends BaseDuxo4<ConfirmTransferViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
    private final PaymentTransferStore paymentTransferStore;
    private final SavedStateHandle savedStateHandle;
    private final UUID transferId;
    private final TransfersBonfireApi transfersBonfireApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmTransferDuxo(AchRelationshipStore achRelationshipStore, PaymentTransferStore paymentTransferStore, TransfersBonfireApi transfersBonfireApi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ConfirmTransferViewState(true, null, null, false, false, null, null, null, null, 510, null), duxoBundle);
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.achRelationshipStore = achRelationshipStore;
        this.paymentTransferStore = paymentTransferStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.savedStateHandle = savedStateHandle;
        this.transferId = ((ConfirmTransferFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getTransferId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<AchTransfer> observableRefCount = this.paymentTransferStore.getAchTransfer(this.transferId, true).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConfirmTransferDuxo.onStart$lambda$0(this.f$0, (AchTransfer) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConfirmTransferDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        this.achRelationshipStore.refresh(false);
        Observable<R> observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends AchRelationship> apply(AchTransfer achTransfer) {
                Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
                return ConfirmTransferDuxo.this.achRelationshipStore.getAchRelationship(achTransfer.getAchRelationshipId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConfirmTransferDuxo.onStart$lambda$2(this.f$0, (AchRelationship) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(ConfirmTransferDuxo confirmTransferDuxo, AchTransfer achTransfer) {
        confirmTransferDuxo.applyMutation(new ConfirmTransferDuxo6(achTransfer, confirmTransferDuxo, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(ConfirmTransferDuxo confirmTransferDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        confirmTransferDuxo.applyMutation(new ConfirmTransferDuxo7(throwable, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(ConfirmTransferDuxo confirmTransferDuxo, AchRelationship achRelationship) {
        confirmTransferDuxo.applyMutation(new ConfirmTransferDuxo8(achRelationship, null));
        return Unit.INSTANCE;
    }

    /* compiled from: ConfirmTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$confirmTransfer$1", m3645f = "ConfirmTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$confirmTransfer$1 */
    static final class C305861 extends ContinuationImpl7 implements Function2<ConfirmTransferViewState, Continuation<? super ConfirmTransferViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C305861(Continuation<? super C305861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C305861 c305861 = ConfirmTransferDuxo.this.new C305861(continuation);
            c305861.L$0 = obj;
            return c305861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfirmTransferViewState confirmTransferViewState, Continuation<? super ConfirmTransferViewState> continuation) {
            return ((C305861) create(confirmTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConfirmTransferViewState confirmTransferViewState = (ConfirmTransferViewState) this.L$0;
            if (confirmTransferViewState.getTransfer() == null || confirmTransferViewState.isAbortInFlight() || confirmTransferViewState.isConfirmInFlight()) {
                return confirmTransferViewState;
            }
            ConfirmTransferDuxo confirmTransferDuxo = ConfirmTransferDuxo.this;
            Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(confirmTransferDuxo, null, new AnonymousClass1(confirmTransferDuxo, null), 1, null);
            final ConfirmTransferDuxo confirmTransferDuxo2 = ConfirmTransferDuxo.this;
            Single singleDoOnSuccess = singleRxSingle$default.doOnSuccess(new Consumer() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo.confirmTransfer.1.2
                @Override // io.reactivex.functions.Consumer
                public final void accept(ApiConfirmTransferResponse apiConfirmTransferResponse) {
                    confirmTransferDuxo2.paymentTransferStore.refreshPaginated(true);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
            ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(confirmTransferDuxo, singleDoOnSuccess, (LifecycleEvent) null, 1, (Object) null);
            final ConfirmTransferDuxo confirmTransferDuxo3 = ConfirmTransferDuxo.this;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$confirmTransfer$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ConfirmTransferDuxo.C305861.invokeSuspend$lambda$0(confirmTransferDuxo3, (ApiConfirmTransferResponse) obj2);
                }
            };
            final ConfirmTransferDuxo confirmTransferDuxo4 = ConfirmTransferDuxo.this;
            scopedSingleBind$default.subscribeKotlin(function1, new Function1() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$confirmTransfer$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ConfirmTransferDuxo.C305861.invokeSuspend$lambda$1(confirmTransferDuxo4, (Throwable) obj2);
                }
            });
            return ConfirmTransferViewState.copy$default(confirmTransferViewState, false, null, null, true, false, null, null, null, null, 503, null);
        }

        /* compiled from: ConfirmTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiConfirmTransferResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$confirmTransfer$1$1", m3645f = "ConfirmTransferDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$confirmTransfer$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiConfirmTransferResponse>, Object> {
            int label;
            final /* synthetic */ ConfirmTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ConfirmTransferDuxo confirmTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = confirmTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiConfirmTransferResponse> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                UUID uuid = this.this$0.transferId;
                this.label = 1;
                Object objConfirmTransfer = transfersBonfireApi.confirmTransfer(uuid, this);
                return objConfirmTransfer == coroutine_suspended ? coroutine_suspended : objConfirmTransfer;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ConfirmTransferDuxo confirmTransferDuxo, ApiConfirmTransferResponse apiConfirmTransferResponse) {
            confirmTransferDuxo.applyMutation(new ConfirmTransferDuxo4(apiConfirmTransferResponse, confirmTransferDuxo, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(ConfirmTransferDuxo confirmTransferDuxo, Throwable th) {
            confirmTransferDuxo.applyMutation(new ConfirmTransferDuxo5(th, null));
            return Unit.INSTANCE;
        }
    }

    public final void confirmTransfer() {
        applyMutation(new C305861(null));
    }

    /* compiled from: ConfirmTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$abortTransfer$1", m3645f = "ConfirmTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$abortTransfer$1 */
    static final class C305851 extends ContinuationImpl7 implements Function2<ConfirmTransferViewState, Continuation<? super ConfirmTransferViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C305851(Continuation<? super C305851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C305851 c305851 = ConfirmTransferDuxo.this.new C305851(continuation);
            c305851.L$0 = obj;
            return c305851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConfirmTransferViewState confirmTransferViewState, Continuation<? super ConfirmTransferViewState> continuation) {
            return ((C305851) create(confirmTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConfirmTransferViewState confirmTransferViewState = (ConfirmTransferViewState) this.L$0;
            if (confirmTransferViewState.getTransfer() == null || confirmTransferViewState.isAbortInFlight() || confirmTransferViewState.isConfirmInFlight()) {
                return confirmTransferViewState;
            }
            ConfirmTransferDuxo confirmTransferDuxo = ConfirmTransferDuxo.this;
            Completable completableAbortAchTransfer = confirmTransferDuxo.paymentTransferStore.abortAchTransfer(ConfirmTransferDuxo.this.transferId);
            ConfirmTransferDuxo confirmTransferDuxo2 = ConfirmTransferDuxo.this;
            Completable completableAndThen = completableAbortAchTransfer.andThen(RxFactory.DefaultImpls.rxCompletable$default(confirmTransferDuxo2, null, new AnonymousClass1(confirmTransferDuxo2, null), 1, null));
            Intrinsics.checkNotNullExpressionValue(completableAndThen, "andThen(...)");
            ScopedCompletable scopedCompletableBind$default = LifecycleHost.DefaultImpls.bind$default(confirmTransferDuxo, completableAndThen, (LifecycleEvent) null, 1, (Object) null);
            final ConfirmTransferDuxo confirmTransferDuxo3 = ConfirmTransferDuxo.this;
            Function0<Unit> function0 = new Function0() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$abortTransfer$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConfirmTransferDuxo.C305851.invokeSuspend$lambda$0(confirmTransferDuxo3);
                }
            };
            final ConfirmTransferDuxo confirmTransferDuxo4 = ConfirmTransferDuxo.this;
            scopedCompletableBind$default.subscribeKotlin(function0, new Function1() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$abortTransfer$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ConfirmTransferDuxo.C305851.invokeSuspend$lambda$1(confirmTransferDuxo4, (Throwable) obj2);
                }
            });
            return ConfirmTransferViewState.copy$default(confirmTransferViewState, false, null, null, false, true, null, null, null, null, 495, null);
        }

        /* compiled from: ConfirmTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$abortTransfer$1$1", m3645f = "ConfirmTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$abortTransfer$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConfirmTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ConfirmTransferDuxo confirmTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = confirmTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.paymentTransferStore.refreshPaginated(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ConfirmTransferDuxo confirmTransferDuxo) {
            confirmTransferDuxo.applyMutation(new ConfirmTransferDuxo2(confirmTransferDuxo, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(ConfirmTransferDuxo confirmTransferDuxo, Throwable th) {
            confirmTransferDuxo.applyMutation(new ConfirmTransferDuxo3(th, null));
            return Unit.INSTANCE;
        }
    }

    public final void abortTransfer() {
        applyMutation(new C305851(null));
    }

    /* compiled from: ConfirmTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferDuxo;", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ConfirmTransferDuxo, ConfirmTransferFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ConfirmTransferFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ConfirmTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ConfirmTransferFragment.Args getArgs(ConfirmTransferDuxo confirmTransferDuxo) {
            return (ConfirmTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, confirmTransferDuxo);
        }
    }
}
