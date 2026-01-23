package com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated.PdtDepositFundsInitiatedDuxo;
import com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated.PdtDepositFundsInitiatedViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PdtDepositFundsInitiatedDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/PathfinderStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "sendContinue", "Companion", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PdtDepositFundsInitiatedDuxo extends OldBaseDuxo<PdtDepositFundsInitiatedViewState> implements HasSavedState {
    private final AchRelationshipStore achRelationshipStore;
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
    /* JADX WARN: Multi-variable type inference failed */
    public PdtDepositFundsInitiatedDuxo(SavedStateHandle savedStateHandle, PaymentTransferStore paymentTransferStore, AchRelationshipStore achRelationshipStore, PathfinderStore pathfinderStore) {
        super(new PdtDepositFundsInitiatedViewState(null, false, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        this.savedStateHandle = savedStateHandle;
        this.paymentTransferStore = paymentTransferStore;
        this.achRelationshipStore = achRelationshipStore;
        this.pathfinderStore = pathfinderStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        UUID uuid = StringsKt.toUuid(((UserViewStatePageContext.PdtDepositFundsInitiated) ((LegacyFragmentKey.PathfinderPdtDepositFundsInitiated) INSTANCE.getArgs((HasSavedState) this)).getUserViewState().getTypeContext()).getContext().getTransferId());
        AchRelationshipStore.refresh$default(this.achRelationshipStore, false, 1, null);
        Observable<R> observableSwitchMap = this.paymentTransferStore.getAchTransfer(uuid, true).switchMap(new Function() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<AchTransfer, AchRelationship>> apply(final AchTransfer transfer) {
                Intrinsics.checkNotNullParameter(transfer, "transfer");
                return PdtDepositFundsInitiatedDuxo.this.achRelationshipStore.getAchRelationship(transfer.getAchRelationshipId()).map(new Function() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo.onStart.1.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<AchTransfer, AchRelationship> apply(AchRelationship achRelationship) {
                        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
                        return Tuples4.m3642to(transfer, achRelationship);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PdtDepositFundsInitiatedDuxo.onStart$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PdtDepositFundsInitiatedDuxo pdtDepositFundsInitiatedDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final AchTransfer achTransfer = (AchTransfer) objComponent1;
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        final AchRelationship achRelationship = (AchRelationship) objComponent2;
        pdtDepositFundsInitiatedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PdtDepositFundsInitiatedDuxo.onStart$lambda$1$lambda$0(achTransfer, achRelationship, (PdtDepositFundsInitiatedViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PdtDepositFundsInitiatedViewState onStart$lambda$1$lambda$0(AchTransfer achTransfer, AchRelationship achRelationship, PdtDepositFundsInitiatedViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PdtDepositFundsInitiatedViewState.copy$default(applyMutation, new PdtDepositFundsInitiatedViewState.State.Success(achTransfer, achRelationship), false, null, 6, null);
    }

    /* compiled from: PdtDepositFundsInitiatedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo$sendContinue$1", m3645f = "PdtDepositFundsInitiatedDuxo.kt", m3646l = {62}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo$sendContinue$1 */
    static final class C304271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C304271(Continuation<? super C304271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PdtDepositFundsInitiatedDuxo.this.new C304271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C304271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C304271 c304271;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PdtDepositFundsInitiatedDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo$sendContinue$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PdtDepositFundsInitiatedDuxo.C304271.invokeSuspend$lambda$0((PdtDepositFundsInitiatedViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = PdtDepositFundsInitiatedDuxo.this.pathfinderStore;
                Companion companion = PdtDepositFundsInitiatedDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderPdtDepositFundsInitiated) companion.getArgs((HasSavedState) PdtDepositFundsInitiatedDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.PathfinderPdtDepositFundsInitiated) companion.getArgs((HasSavedState) PdtDepositFundsInitiatedDuxo.this)).getUserViewState().getSequence();
                UserViewInput.PdtDepositFundsInitiatedPage pdtDepositFundsInitiatedPage = new UserViewInput.PdtDepositFundsInitiatedPage(true);
                final PdtDepositFundsInitiatedDuxo pdtDepositFundsInitiatedDuxo = PdtDepositFundsInitiatedDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo$sendContinue$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PdtDepositFundsInitiatedDuxo.C304271.invokeSuspend$lambda$3(pdtDepositFundsInitiatedDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                c304271 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, pdtDepositFundsInitiatedPage, function1, c304271) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c304271 = this;
            }
            PdtDepositFundsInitiatedDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo$sendContinue$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PdtDepositFundsInitiatedDuxo.C304271.invokeSuspend$lambda$4((PdtDepositFundsInitiatedViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PdtDepositFundsInitiatedViewState invokeSuspend$lambda$0(PdtDepositFundsInitiatedViewState pdtDepositFundsInitiatedViewState) {
            return PdtDepositFundsInitiatedViewState.copy$default(pdtDepositFundsInitiatedViewState, null, true, null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(PdtDepositFundsInitiatedDuxo pdtDepositFundsInitiatedDuxo, final Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            pdtDepositFundsInitiatedDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedDuxo$sendContinue$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PdtDepositFundsInitiatedDuxo.C304271.invokeSuspend$lambda$3$lambda$2$lambda$1(th, (PdtDepositFundsInitiatedViewState) obj);
                }
            });
            return zIsNetworkRelated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PdtDepositFundsInitiatedViewState invokeSuspend$lambda$3$lambda$2$lambda$1(Throwable th, PdtDepositFundsInitiatedViewState pdtDepositFundsInitiatedViewState) {
            return PdtDepositFundsInitiatedViewState.copy$default(pdtDepositFundsInitiatedViewState, null, false, new ComposeUiEvent(th), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PdtDepositFundsInitiatedViewState invokeSuspend$lambda$4(PdtDepositFundsInitiatedViewState pdtDepositFundsInitiatedViewState) {
            return PdtDepositFundsInitiatedViewState.copy$default(pdtDepositFundsInitiatedViewState, null, false, null, 5, null);
        }
    }

    public final void sendContinue() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C304271(null), 3, null);
    }

    /* compiled from: PdtDepositFundsInitiatedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderPdtDepositFundsInitiated;", "<init>", "()V", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PdtDepositFundsInitiatedDuxo, LegacyFragmentKey.PathfinderPdtDepositFundsInitiated> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderPdtDepositFundsInitiated getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.PathfinderPdtDepositFundsInitiated) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderPdtDepositFundsInitiated getArgs(PdtDepositFundsInitiatedDuxo pdtDepositFundsInitiatedDuxo) {
            return (LegacyFragmentKey.PathfinderPdtDepositFundsInitiated) DuxoCompanion.DefaultImpls.getArgs(this, pdtDepositFundsInitiatedDuxo);
        }
    }
}
