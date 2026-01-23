package com.robinhood.android.transfers.international.p266ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.transfers.contracts.InternationalTransfer;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.InternationalTransferEvent;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionFragment;
import com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction;
import com.robinhood.android.transfers.international.p266ui.actions.InternationalTransferFlowAction3;
import com.robinhood.android.transfers.international.p266ui.currencyselection.DepositCurrencyFragment;
import com.robinhood.android.transfers.international.p266ui.util.ErrorDialog;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferState;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "handleAction", "", "action", "Lcom/robinhood/android/transfers/international/ui/actions/InternationalTransferFlowAction;", "resolveInitialFragment", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternationalTransferDuxo extends BaseDuxo5<InternationalTransferState, InternationalTransferEvent> implements HasSavedState {
    private final PaymentInstrumentStore paymentInstrumentStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternationalTransferDuxo(PaymentInstrumentStore paymentInstrumentStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new InternationalTransferState(null, null, null, null, null, null, 63, null), duxoBundle);
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void handleAction(final InternationalTransferFlowAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferDuxo.handleAction$lambda$0(action, this, (InternationalTransferState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAction$lambda$0(InternationalTransferFlowAction internationalTransferFlowAction, InternationalTransferDuxo internationalTransferDuxo, InternationalTransferState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (internationalTransferFlowAction instanceof InternationalTransferFlowAction3) {
            internationalTransferDuxo.applyMutation(new InternationalTransferDuxo2(internationalTransferFlowAction, null));
        }
        internationalTransferDuxo.submit(internationalTransferFlowAction.consume(state));
        return Unit.INSTANCE;
    }

    public final void resolveInitialFragment() {
        int i = WhenMappings.$EnumSwitchMapping$0[((InternationalTransfer) INSTANCE.getExtras((HasSavedState) this)).getTransferDirection().ordinal()];
        if (i == 1) {
            submit(new InternationalTransferEvent.SetFragmentWithoutArgs(DepositCurrencyFragment.INSTANCE));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Observable<List<PaymentInstrumentV2>> observableTake = this.paymentInstrumentStore.stream(CollectionsKt.listOf(PaymentInstrumentType.I18N_BANK_ACCOUNT)).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.international.ui.InternationalTransferDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InternationalTransferDuxo.resolveInitialFragment$lambda$1(this.f$0, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resolveInitialFragment$lambda$1(InternationalTransferDuxo internationalTransferDuxo, List list) {
        Object setFragmentWithArgs;
        if (list.isEmpty()) {
            StringResource.Companion companion = StringResource.INSTANCE;
            setFragmentWithArgs = new InternationalTransferEvent.Error(new ErrorDialog(companion.invoke(C30310R.string.no_linked_accounts_error_title, new Object[0]), companion.invoke(C30310R.string.no_linked_accounts_error_message, new Object[0]), ErrorDialog.DismissAction.FINISH));
        } else {
            setFragmentWithArgs = new InternationalTransferEvent.SetFragmentWithArgs(AccountSelectionFragment.INSTANCE, new AccountSelectionFragment.Args(AccountSelectionFragment.Args.Type.INTERNAL));
        }
        internationalTransferDuxo.submit(setFragmentWithArgs);
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/InternationalTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/transfers/international/ui/InternationalTransferDuxo;", "Lcom/robinhood/android/transfers/contracts/InternationalTransfer;", "<init>", "()V", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<InternationalTransferDuxo, InternationalTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public InternationalTransfer getExtras(SavedStateHandle savedStateHandle) {
            return (InternationalTransfer) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public InternationalTransfer getExtras(InternationalTransferDuxo internationalTransferDuxo) {
            return (InternationalTransfer) DuxoCompanion2.DefaultImpls.getExtras(this, internationalTransferDuxo);
        }
    }
}
