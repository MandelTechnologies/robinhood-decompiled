package com.robinhood.android.matcha.p177ui.sourceoffunds;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.p177ui.sourceoffunds.SourceOfFundsBottomSheet;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountBannerStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.udf.UiEvent;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: SourceOfFundsBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsDataState;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountBannerStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountBannerStore;", "stateProvider", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountBannerStore;Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "selectAccount", "accountId", "", "onContinueClick", "refreshAccounts", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class SourceOfFundsBottomSheetDuxo extends BaseDuxo<SourceOfFundsDataState, SourceOfFundsViewState> implements HasSavedState {
    private final DebitCardInstrumentStore debitCardInstrumentStore;
    private final SavedStateHandle savedStateHandle;
    private final TransferAccountBannerStore transferAccountBannerStore;
    private final TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SourceOfFundsBottomSheetDuxo(DebitCardInstrumentStore debitCardInstrumentStore, TransferAccountStore transferAccountStore, TransferAccountBannerStore transferAccountBannerStore, SourceOfFundsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "debitCardInstrumentStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferAccountBannerStore, "transferAccountBannerStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        TransferAccount sourceOfFunds = ((SourceOfFundsBottomSheet.Args) INSTANCE.getArgs(savedStateHandle)).getSourceOfFunds();
        super(new SourceOfFundsDataState(null, sourceOfFunds != null ? sourceOfFunds.getAccountId() : null, null, null, null, 29, null), stateProvider, duxoBundle);
        this.debitCardInstrumentStore = debitCardInstrumentStore;
        this.transferAccountStore = transferAccountStore;
        this.transferAccountBannerStore = transferAccountBannerStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        TransferAccountStore.refresh$default(this.transferAccountStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.transferAccountStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SourceOfFundsBottomSheetDuxo.onStart$lambda$0(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.debitCardInstrumentStore.getActiveDebitCardInstruments(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SourceOfFundsBottomSheetDuxo.onStart$lambda$1(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.transferAccountBannerStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SourceOfFundsBottomSheetDuxo.onStart$lambda$2(this.f$0, (ApiTransferBanners) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(SourceOfFundsBottomSheetDuxo sourceOfFundsBottomSheetDuxo, List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        sourceOfFundsBottomSheetDuxo.applyMutation(new SourceOfFundsBottomSheetDuxo2(accounts2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SourceOfFundsBottomSheetDuxo sourceOfFundsBottomSheetDuxo, List instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        sourceOfFundsBottomSheetDuxo.applyMutation(new SourceOfFundsBottomSheetDuxo3(instruments, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(SourceOfFundsBottomSheetDuxo sourceOfFundsBottomSheetDuxo, ApiTransferBanners transferBanners) {
        Intrinsics.checkNotNullParameter(transferBanners, "transferBanners");
        sourceOfFundsBottomSheetDuxo.applyMutation(new SourceOfFundsBottomSheetDuxo4(transferBanners, null));
        return Unit.INSTANCE;
    }

    /* compiled from: SourceOfFundsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$selectAccount$1", m3645f = "SourceOfFundsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$selectAccount$1 */
    static final class C215761 extends ContinuationImpl7 implements Function2<SourceOfFundsDataState, Continuation<? super SourceOfFundsDataState>, Object> {
        final /* synthetic */ String $accountId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C215761(String str, Continuation<? super C215761> continuation) {
            super(2, continuation);
            this.$accountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215761 c215761 = new C215761(this.$accountId, continuation);
            c215761.L$0 = obj;
            return c215761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SourceOfFundsDataState sourceOfFundsDataState, Continuation<? super SourceOfFundsDataState> continuation) {
            return ((C215761) create(sourceOfFundsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SourceOfFundsDataState.copy$default((SourceOfFundsDataState) this.L$0, null, this.$accountId, null, null, null, 29, null);
        }
    }

    public final void selectAccount(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        applyMutation(new C215761(accountId, null));
    }

    /* compiled from: SourceOfFundsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$onContinueClick$1", m3645f = "SourceOfFundsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheetDuxo$onContinueClick$1 */
    static final class C215751 extends ContinuationImpl7 implements Function2<SourceOfFundsDataState, Continuation<? super SourceOfFundsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C215751(Continuation<? super C215751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215751 c215751 = new C215751(continuation);
            c215751.L$0 = obj;
            return c215751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SourceOfFundsDataState sourceOfFundsDataState, Continuation<? super SourceOfFundsDataState> continuation) {
            return ((C215751) create(sourceOfFundsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SourceOfFundsDataState sourceOfFundsDataState = (SourceOfFundsDataState) this.L$0;
            Iterator<T> it = sourceOfFundsDataState.getTransferAccounts().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((TransferAccount) next).getAccountId(), sourceOfFundsDataState.getSelectedAccountId())) {
                    break;
                }
            }
            TransferAccount transferAccount = (TransferAccount) next;
            return transferAccount == null ? sourceOfFundsDataState : SourceOfFundsDataState.copy$default(sourceOfFundsDataState, null, null, new UiEvent(transferAccount), null, null, 27, null);
        }
    }

    public final void onContinueClick() {
        applyMutation(new C215751(null));
    }

    public final void refreshAccounts() {
        this.transferAccountStore.refresh(true);
    }

    /* compiled from: SourceOfFundsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsBottomSheetDuxo;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsBottomSheet$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SourceOfFundsBottomSheetDuxo, SourceOfFundsBottomSheet.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SourceOfFundsBottomSheet.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SourceOfFundsBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SourceOfFundsBottomSheet.Args getArgs(SourceOfFundsBottomSheetDuxo sourceOfFundsBottomSheetDuxo) {
            return (SourceOfFundsBottomSheet.Args) DuxoCompanion.DefaultImpls.getArgs(this, sourceOfFundsBottomSheetDuxo);
        }
    }
}
