package com.robinhood.android.transfers.pathfinder.p269ui.transferfunds;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.pathfinder.p269ui.transferfunds.PathfinderTransferFundsDuxo;
import com.robinhood.android.transfers.pathfinder.p269ui.transferfunds.PathfinderTransferFundsViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
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

/* compiled from: PathfinderTransferFundsDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "submitResult", "", "Companion", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PathfinderTransferFundsDuxo extends OldBaseDuxo<PathfinderTransferFundsViewState> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
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
    public PathfinderTransferFundsDuxo(PathfinderStore pathfinderStore, SavedStateHandle savedStateHandle) {
        super(new PathfinderTransferFundsViewState(null, 1, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: PathfinderTransferFundsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsDuxo$submitResult$1", m3645f = "PathfinderTransferFundsDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsDuxo$submitResult$1 */
    static final class C304361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C304361(Continuation<? super C304361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderTransferFundsDuxo.this.new C304361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C304361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderTransferFundsDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsDuxo$submitResult$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PathfinderTransferFundsDuxo.C304361.invokeSuspend$lambda$0((PathfinderTransferFundsViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = PathfinderTransferFundsDuxo.this.pathfinderStore;
                Companion companion = PathfinderTransferFundsDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderTransferFunds) companion.getArgs((HasSavedState) PathfinderTransferFundsDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.PathfinderTransferFunds) companion.getArgs((HasSavedState) PathfinderTransferFundsDuxo.this)).getUserViewState().getSequence();
                UserViewInput.TransferFundsInput transferFundsInput = new UserViewInput.TransferFundsInput(true);
                final PathfinderTransferFundsDuxo pathfinderTransferFundsDuxo = PathfinderTransferFundsDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsDuxo$submitResult$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PathfinderTransferFundsDuxo.C304361.invokeSuspend$lambda$3(pathfinderTransferFundsDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, transferFundsInput, function1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderTransferFundsViewState invokeSuspend$lambda$0(PathfinderTransferFundsViewState pathfinderTransferFundsViewState) {
            return pathfinderTransferFundsViewState.copy(PathfinderTransferFundsViewState.State.Loading.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(PathfinderTransferFundsDuxo pathfinderTransferFundsDuxo, Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            pathfinderTransferFundsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.pathfinder.ui.transferfunds.PathfinderTransferFundsDuxo$submitResult$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PathfinderTransferFundsDuxo.C304361.invokeSuspend$lambda$3$lambda$2$lambda$1((PathfinderTransferFundsViewState) obj);
                }
            });
            return zIsNetworkRelated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PathfinderTransferFundsViewState invokeSuspend$lambda$3$lambda$2$lambda$1(PathfinderTransferFundsViewState pathfinderTransferFundsViewState) {
            return pathfinderTransferFundsViewState.copy(PathfinderTransferFundsViewState.State.Failed.INSTANCE);
        }
    }

    public final void submitResult() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C304361(null), 3, null);
    }

    /* compiled from: PathfinderTransferFundsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/pathfinder/ui/transferfunds/PathfinderTransferFundsDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderTransferFunds;", "<init>", "()V", "feature-transfers-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PathfinderTransferFundsDuxo, LegacyFragmentKey.PathfinderTransferFunds> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderTransferFunds getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.PathfinderTransferFunds) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderTransferFunds getArgs(PathfinderTransferFundsDuxo pathfinderTransferFundsDuxo) {
            return (LegacyFragmentKey.PathfinderTransferFunds) DuxoCompanion.DefaultImpls.getArgs(this, pathfinderTransferFundsDuxo);
        }
    }
}
