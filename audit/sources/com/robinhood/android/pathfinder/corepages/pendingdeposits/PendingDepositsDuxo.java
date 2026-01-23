package com.robinhood.android.pathfinder.corepages.pendingdeposits;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.transfer.shared.AchTransferState;
import com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.support.contracts.pathfinder.PendingDepositsFragmentKey;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PendingDepositsDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsViewState;", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "sendInput", "handleInputError", "", "throwable", "", "handleInputError$feature_pathfinder_core_pages_externalDebug", "Companion", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PendingDepositsDuxo extends BaseDuxo5<PendingDepositsViewState, PendingDepositsEvent> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
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
    public PendingDepositsDuxo(PathfinderStore pathfinderStore, PaymentTransferStore paymentTransferStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new PendingDepositsViewState(null, false, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.paymentTransferStore = paymentTransferStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<R> map = this.paymentTransferStore.getAchTransfers(true).map(new Function() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final List<StatefulHistoryEvent<HistoryEvent>> apply(List<AchTransfer> transfers) {
                Intrinsics.checkNotNullParameter(transfers, "transfers");
                ArrayList arrayList = new ArrayList();
                for (T t : transfers) {
                    if (((AchTransfer) t).getState() == AchTransferState.PENDING) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AchTransfer) it.next()).toStatefulHistoryEvent());
                }
                return arrayList2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PendingDepositsDuxo.onStart$lambda$0(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(PendingDepositsDuxo pendingDepositsDuxo, List list) {
        pendingDepositsDuxo.applyMutation(new PendingDepositsDuxo2(list, null));
        return Unit.INSTANCE;
    }

    /* compiled from: PendingDepositsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$sendInput$1", m3645f = "PendingDepositsDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$sendInput$1 */
    static final class C253371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C253371(Continuation<? super C253371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PendingDepositsDuxo.this.new C253371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C253371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PendingDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$sendInput$1$1", m3645f = "PendingDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$sendInput$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PendingDepositsViewState, Continuation<? super PendingDepositsViewState>, Object> {
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
            public final Object invoke(PendingDepositsViewState pendingDepositsViewState, Continuation<? super PendingDepositsViewState> continuation) {
                return ((AnonymousClass1) create(pendingDepositsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PendingDepositsViewState.copy$default((PendingDepositsViewState) this.L$0, null, true, 1, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C253371 c253371;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PendingDepositsDuxo.this.applyMutation(new AnonymousClass1(null));
                PathfinderStore pathfinderStore = PendingDepositsDuxo.this.pathfinderStore;
                Companion companion = PendingDepositsDuxo.INSTANCE;
                UUID inquiryId = ((PendingDepositsFragmentKey) companion.getArgs((HasSavedState) PendingDepositsDuxo.this)).getInquiryId();
                int sequence = ((PendingDepositsFragmentKey) companion.getArgs((HasSavedState) PendingDepositsDuxo.this)).getUserViewState().getSequence();
                UserViewInput.PendingDeposits pendingDeposits = new UserViewInput.PendingDeposits(true);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PendingDepositsDuxo.this);
                this.label = 1;
                c253371 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, pendingDeposits, anonymousClass2, c253371) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c253371 = this;
            }
            PendingDepositsDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: PendingDepositsDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$sendInput$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
            AnonymousClass2(Object obj) {
                super(1, obj, PendingDepositsDuxo.class, "handleInputError", "handleInputError$feature_pathfinder_core_pages_externalDebug(Ljava/lang/Throwable;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(((PendingDepositsDuxo) this.receiver).handleInputError$feature_pathfinder_core_pages_externalDebug(p0));
            }
        }

        /* compiled from: PendingDepositsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$sendInput$1$3", m3645f = "PendingDepositsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pathfinder.corepages.pendingdeposits.PendingDepositsDuxo$sendInput$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PendingDepositsViewState, Continuation<? super PendingDepositsViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PendingDepositsViewState pendingDepositsViewState, Continuation<? super PendingDepositsViewState> continuation) {
                return ((AnonymousClass3) create(pendingDepositsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PendingDepositsViewState.copy$default((PendingDepositsViewState) this.L$0, null, false, 1, null);
            }
        }
    }

    public final void sendInput() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C253371(null), 3, null);
    }

    public final boolean handleInputError$feature_pathfinder_core_pages_externalDebug(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        boolean zIsNetworkRelated = Throwables.isNetworkRelated(throwable);
        if (zIsNetworkRelated) {
            submit(new PendingDepositsEvent.SendInputErrorEvent(throwable));
        }
        return zIsNetworkRelated;
    }

    /* compiled from: PendingDepositsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/pathfinder/corepages/pendingdeposits/PendingDepositsDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/PendingDepositsFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PendingDepositsDuxo, PendingDepositsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PendingDepositsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (PendingDepositsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PendingDepositsFragmentKey getArgs(PendingDepositsDuxo pendingDepositsDuxo) {
            return (PendingDepositsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, pendingDepositsDuxo);
        }
    }
}
