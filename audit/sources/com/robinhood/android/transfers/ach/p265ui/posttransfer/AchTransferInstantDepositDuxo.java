package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferInstantDepositFragment;
import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferInstantDepositViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstantDepositInfoStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.serverdriven.p347db.RichText;
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

/* compiled from: AchTransferInstantDepositDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "instantDepositInfoStore", "Lcom/robinhood/librobinhood/data/store/InstantDepositInfoStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/InstantDepositInfoStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "onContinue", "Companion", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AchTransferInstantDepositDuxo extends BaseDuxo4<AchTransferInstantDepositViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final InstantDepositInfoStore instantDepositInfoStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchTransferInstantDepositDuxo(AccountProvider accountProvider, InstantDepositInfoStore instantDepositInfoStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AchTransferInstantDepositViewState.Loaded(null, null, ((AchTransferInstantDepositFragment.Args) INSTANCE.getArgs(savedStateHandle)).getAchTransfer(), null, 11, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instantDepositInfoStore, "instantDepositInfoStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.instantDepositInfoStore = instantDepositInfoStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.instantDepositInfoStore.getAdditionalInstantDepositInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferInstantDepositDuxo.onResume$lambda$0(this.f$0, (RichText) obj);
            }
        });
        this.accountProvider.refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamIndividualAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferInstantDepositDuxo.onResume$lambda$1(this.f$0, (Account) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(AchTransferInstantDepositDuxo achTransferInstantDepositDuxo, RichText instantDepositInfo) {
        Intrinsics.checkNotNullParameter(instantDepositInfo, "instantDepositInfo");
        achTransferInstantDepositDuxo.applyMutation(new AchTransferInstantDepositDuxo2(instantDepositInfo, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(AchTransferInstantDepositDuxo achTransferInstantDepositDuxo, Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        achTransferInstantDepositDuxo.applyMutation(new AchTransferInstantDepositDuxo3(account, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AchTransferInstantDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositDuxo$onContinue$1", m3645f = "AchTransferInstantDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositDuxo$onContinue$1 */
    static final class C301781 extends ContinuationImpl7 implements Function2<AchTransferInstantDepositViewState, Continuation<? super AchTransferInstantDepositViewState>, Object> {
        int label;

        C301781(Continuation<? super C301781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C301781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AchTransferInstantDepositViewState achTransferInstantDepositViewState, Continuation<? super AchTransferInstantDepositViewState> continuation) {
            return ((C301781) create(achTransferInstantDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AchTransferInstantDepositViewState.Exit.INSTANCE;
        }
    }

    public final void onContinue() {
        applyMutation(new C301781(null));
    }

    /* compiled from: AchTransferInstantDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositDuxo;", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositFragment$Args;", "<init>", "()V", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AchTransferInstantDepositDuxo, AchTransferInstantDepositFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchTransferInstantDepositFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AchTransferInstantDepositFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchTransferInstantDepositFragment.Args getArgs(AchTransferInstantDepositDuxo achTransferInstantDepositDuxo) {
            return (AchTransferInstantDepositFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, achTransferInstantDepositDuxo);
        }
    }
}
