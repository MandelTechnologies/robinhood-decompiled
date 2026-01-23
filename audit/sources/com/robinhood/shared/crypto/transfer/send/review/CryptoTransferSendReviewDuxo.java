package com.robinhood.shared.crypto.transfer.send.review;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiCryptoTransferSuvWorkflow;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewEvent;
import com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewFragment;
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

/* compiled from: CryptoTransferSendReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fB9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0017J\u0006\u0010\u001c\u001a\u00020\u0019J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0017H\u0002R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDataState;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewViewState;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "latestSuvWorkflowId", "Ljava/util/UUID;", "challengeWithSuvOrPass", "", "submitWithdrawal", "withdrawalId", "suvNotApproved", "startSuv", "workflowId", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendReviewDuxo extends BaseDuxo3<CryptoTransferSendReviewDataState, CryptoTransferSendReviewViewState, CryptoTransferSendReviewEvent> implements HasSavedState {
    private final CryptoTransfersStore cryptoTransfersStore;
    private UUID latestSuvWorkflowId;
    private final SavedStateHandle savedStateHandle;
    private final SuvMigrationManager suvMigrationManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoTransferSendReviewDuxo(AppType appType, DuxoBundle duxoBundle, CryptoTransferSendReviewDuxo5 stateProvider, SavedStateHandle savedStateHandle, CryptoTransfersStore cryptoTransfersStore, SuvMigrationManager suvMigrationManager) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(suvMigrationManager, "suvMigrationManager");
        Companion companion = INSTANCE;
        super(new CryptoTransferSendReviewDataState(appType, (CryptoTransferSendReviewFragment.Args) companion.getArgs(savedStateHandle)), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.suvMigrationManager = suvMigrationManager;
        this.latestSuvWorkflowId = ((CryptoTransferSendReviewFragment.Args) companion.getArgs(getSavedStateHandle())).getWithdrawal().getSuvWorkflowId();
        if (((CryptoTransferSendReviewFragment.Args) companion.getArgs((HasSavedState) this)).getSubmitWarningSheet() != null) {
            submit(CryptoTransferSendReviewEvent.MustShowWarningSheet.INSTANCE);
        }
    }

    public final void challengeWithSuvOrPass() {
        UUID uuid = this.latestSuvWorkflowId;
        if (uuid != null) {
            startSuv(uuid);
        } else {
            withDataState(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferSendReviewDuxo.challengeWithSuvOrPass$lambda$2$lambda$1(this.f$0, (CryptoTransferSendReviewDataState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit challengeWithSuvOrPass$lambda$2$lambda$1(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, CryptoTransferSendReviewDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTransferSendReviewDuxo.submitWithdrawal(it.getWithdrawalId());
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTransferSendReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$submitWithdrawal$1", m3645f = "CryptoTransferSendReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$submitWithdrawal$1 */
    static final class C383861 extends ContinuationImpl7 implements Function2<CryptoTransferSendReviewDataState, Continuation<? super CryptoTransferSendReviewDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C383861(Continuation<? super C383861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383861 c383861 = new C383861(continuation);
            c383861.L$0 = obj;
            return c383861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendReviewDataState cryptoTransferSendReviewDataState, Continuation<? super CryptoTransferSendReviewDataState> continuation) {
            return ((C383861) create(cryptoTransferSendReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendReviewDataState.copy$default((CryptoTransferSendReviewDataState) this.L$0, null, true, null, null, 13, null);
        }
    }

    public final void submitWithdrawal(UUID withdrawalId) {
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        applyMutation(new C383861(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.cryptoTransfersStore.submitWithdrawal(null, withdrawalId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendReviewDuxo.submitWithdrawal$lambda$3(this.f$0, (CryptoTransferWithdrawal) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendReviewDuxo.submitWithdrawal$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitWithdrawal$lambda$3(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, CryptoTransferWithdrawal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTransferSendReviewDuxo.submit(new CryptoTransferSendReviewEvent.CompletedWithdrawal(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitWithdrawal$lambda$4(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            cryptoTransferSendReviewDuxo.applyMutation(new CryptoTransferSendReviewDuxo2(null));
            cryptoTransferSendReviewDuxo.submit(new CryptoTransferSendReviewEvent.InputError(t));
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* compiled from: CryptoTransferSendReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$suvNotApproved$1", m3645f = "CryptoTransferSendReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$suvNotApproved$1 */
    static final class C383871 extends ContinuationImpl7 implements Function2<CryptoTransferSendReviewDataState, Continuation<? super CryptoTransferSendReviewDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C383871(Continuation<? super C383871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383871 c383871 = new C383871(continuation);
            c383871.L$0 = obj;
            return c383871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendReviewDataState cryptoTransferSendReviewDataState, Continuation<? super CryptoTransferSendReviewDataState> continuation) {
            return ((C383871) create(cryptoTransferSendReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendReviewDataState.copy$default((CryptoTransferSendReviewDataState) this.L$0, null, true, null, null, 13, null);
        }
    }

    public final void suvNotApproved() {
        applyMutation(new C383871(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.cryptoTransfersStore.recreateSuvForWithdrawal(((CryptoTransferSendReviewFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getWithdrawal().getWithdrawalId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendReviewDuxo.suvNotApproved$lambda$5(this.f$0, (ApiCryptoTransferSuvWorkflow) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendReviewDuxo.suvNotApproved$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit suvNotApproved$lambda$5(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, ApiCryptoTransferSuvWorkflow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTransferSendReviewDuxo.applyMutation(new CryptoTransferSendReviewDuxo3(null));
        cryptoTransferSendReviewDuxo.latestSuvWorkflowId = it.getSuvWorkflowId();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit suvNotApproved$lambda$6(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            cryptoTransferSendReviewDuxo.applyMutation(new CryptoTransferSendReviewDuxo4(null));
            cryptoTransferSendReviewDuxo.submit(new CryptoTransferSendReviewEvent.InputError(t));
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* compiled from: CryptoTransferSendReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$startSuv$1", m3645f = "CryptoTransferSendReviewDuxo.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.review.CryptoTransferSendReviewDuxo$startSuv$1 */
    static final class C383851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $workflowId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C383851(UUID uuid, Continuation<? super C383851> continuation) {
            super(2, continuation);
            this.$workflowId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTransferSendReviewDuxo.this.new C383851(this.$workflowId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C383851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo;
            UUID uuid;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                cryptoTransferSendReviewDuxo = CryptoTransferSendReviewDuxo.this;
                UUID uuid2 = this.$workflowId;
                SuvMigrationManager suvMigrationManager = cryptoTransferSendReviewDuxo.suvMigrationManager;
                UUID uuid3 = this.$workflowId;
                this.L$0 = cryptoTransferSendReviewDuxo;
                this.L$1 = uuid2;
                this.label = 1;
                Object objIsMigrated = suvMigrationManager.isMigrated(uuid3, this);
                if (objIsMigrated == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uuid = uuid2;
                obj = objIsMigrated;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uuid = (UUID) this.L$1;
                cryptoTransferSendReviewDuxo = (CryptoTransferSendReviewDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            cryptoTransferSendReviewDuxo.submit(new CryptoTransferSendReviewEvent.StartSuv(uuid, ((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    private final void startSuv(UUID workflowId) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C383851(workflowId, null), 3, null);
    }

    /* compiled from: CryptoTransferSendReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/review/CryptoTransferSendReviewFragment$Args;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferSendReviewDuxo, CryptoTransferSendReviewFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferSendReviewFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTransferSendReviewFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferSendReviewFragment.Args getArgs(CryptoTransferSendReviewDuxo cryptoTransferSendReviewDuxo) {
            return (CryptoTransferSendReviewFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferSendReviewDuxo);
        }
    }
}
