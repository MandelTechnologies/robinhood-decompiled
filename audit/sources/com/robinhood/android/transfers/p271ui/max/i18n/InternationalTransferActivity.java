package com.robinhood.android.transfers.p271ui.max.i18n;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.banking.experiments.McwGbTransfersRollout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.android.transfers.contracts.UkTransfer;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountSelectionFragment;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferFragment;
import com.robinhood.android.transfers.p271ui.max.i18n.mcw.InternationalTransferV2Fragment;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.posttransfer.TransferSuccessFragment;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InternationalTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001,B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001c\u0010$\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010'\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010(\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u000e\u0010)\u001a\u00020*H\u0082@¢\u0006\u0002\u0010+R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2Fragment$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Callbacks;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "currentInternationalTransferFragment", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onShowAccountSelection", "key", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "onTransferCreated", "createTransferResponse", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "finish", "onBackPressed", "onTransferConfirmationComplete", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onSourceAccountSelected", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraDistributionInfo", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "onSinkAccountSelected", "iraContributionInfo", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "onUkAddAccountSelected", "handleAccountSelection", "resolveInitialFragment", "Landroidx/fragment/app/Fragment;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class InternationalTransferActivity extends BaseActivity implements InternationalTransferFragment.Callbacks, InternationalTransferV2Fragment.Callbacks, TransferSuccessCallbacks, TransferAccountSelectionFragment.Callbacks {
    private InternationalTransferFragment currentInternationalTransferFragment;
    public ExperimentsStore experimentsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InternationalTransferActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferActivity", m3645f = "InternationalTransferActivity.kt", m3646l = {131}, m3647m = "resolveInitialFragment")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferActivity$resolveInitialFragment$1 */
    static final class C307321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C307321(Continuation<? super C307321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternationalTransferActivity.this.resolveInitialFragment(this);
        }
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSinkAccountSelected(TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success) {
        TransferAccountSelectionFragment.Callbacks.DefaultImpls.onSinkAccountSelected(this, transferAccount, iraContribution, recipientType, success);
    }

    public InternationalTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            getLifecycleScope().launchWhenCreated(new C307311(null));
        }
    }

    /* compiled from: InternationalTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferActivity$onCreate$1", m3645f = "InternationalTransferActivity.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferActivity$onCreate$1 */
    static final class C307311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;

        C307311(Continuation<? super C307311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferActivity.this.new C307311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            InternationalTransferActivity internationalTransferActivity;
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                internationalTransferActivity = InternationalTransferActivity.this;
                int i3 = C11048R.id.fragment_container;
                this.L$0 = internationalTransferActivity;
                this.I$0 = i3;
                this.label = 1;
                Object objResolveInitialFragment = internationalTransferActivity.resolveInitialFragment(this);
                if (objResolveInitialFragment == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
                obj = objResolveInitialFragment;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                internationalTransferActivity = (InternationalTransferActivity) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            internationalTransferActivity.setFragment(i, (Fragment) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment.Callbacks
    public void onShowAccountSelection(TransferAccountSelectionKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        replaceFragment(TransferAccountSelectionFragment.INSTANCE.newInstance((Parcelable) key));
    }

    @Override // com.robinhood.android.transfers.ui.max.i18n.InternationalTransferFragment.Callbacks, com.robinhood.android.transfers.ui.max.i18n.mcw.InternationalTransferV2Fragment.Callbacks
    public void onTransferCreated(ApiCreateTransferResponse createTransferResponse) {
        Intrinsics.checkNotNullParameter(createTransferResponse, "createTransferResponse");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new TransferSuccessKey(PostTransferFlow2.toUiModel(createTransferResponse, ApiTransferAccount.TransferAccountType.RHS), ((UkTransfer) INSTANCE.getExtras((Activity) this)).getEntryPoint()), null, 2, null));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        if (getCurrentFragment() instanceof TransferSuccessFragment) {
            setResult(-1);
        } else {
            setResult(0);
        }
        super.finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFragment() instanceof TransferSuccessFragment) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        finish();
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSourceAccountSelected(TransferAccount account, IraDistributionQuestionnaireResult.IraDistribution iraDistributionInfo) {
        handleAccountSelection(account);
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSinkAccountSelected(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo) {
        handleAccountSelection(account);
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onUkAddAccountSelected(TransferAccount account) {
        handleAccountSelection(account);
    }

    private final void handleAccountSelection(TransferAccount account) {
        popLastFragment();
        InternationalTransferFragment internationalTransferFragment = this.currentInternationalTransferFragment;
        if (internationalTransferFragment != null) {
            internationalTransferFragment.externalAccountSelected(account);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveInitialFragment(Continuation<? super Fragment> continuation) {
        C307321 c307321;
        if (continuation instanceof C307321) {
            c307321 = (C307321) continuation;
            int i = c307321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c307321.label = i - Integer.MIN_VALUE;
            } else {
                c307321 = new C307321(continuation);
            }
        }
        Object objFirstOrNull = c307321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c307321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(getExperimentsStore(), new Experiment[]{McwGbTransfersRollout.INSTANCE}, false, null, 6, null);
            c307321.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamStateFlow$default, c307321);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        if (Intrinsics.areEqual(objFirstOrNull, boxing.boxBoolean(true))) {
            InternationalTransferV2Fragment.Companion companion = InternationalTransferV2Fragment.INSTANCE;
            Companion companion2 = INSTANCE;
            return companion.newInstance((Parcelable) new InternationalTransferV2Fragment.Args(((UkTransfer) companion2.getExtras((Activity) this)).getTransferDirection(), ((UkTransfer) companion2.getExtras((Activity) this)).getAmount(), ((UkTransfer) companion2.getExtras((Activity) this)).getSourceAccountId(), ((UkTransfer) companion2.getExtras((Activity) this)).getSinkAccountId(), ((UkTransfer) companion2.getExtras((Activity) this)).getEntryPoint()));
        }
        InternationalTransferFragment.Companion companion3 = InternationalTransferFragment.INSTANCE;
        Companion companion4 = INSTANCE;
        Fragment fragmentNewInstance = companion3.newInstance((Parcelable) new InternationalTransferFragment.Args(((UkTransfer) companion4.getExtras((Activity) this)).getTransferDirection().toTransferDirection(), ((UkTransfer) companion4.getExtras((Activity) this)).getAmount(), ((UkTransfer) companion4.getExtras((Activity) this)).getEntryPoint()));
        this.currentInternationalTransferFragment = (InternationalTransferFragment) fragmentNewInstance;
        return fragmentNewInstance;
    }

    /* compiled from: InternationalTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferActivity;", "Lcom/robinhood/android/transfers/contracts/UkTransfer;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<InternationalTransferActivity, UkTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public UkTransfer getExtras(InternationalTransferActivity internationalTransferActivity) {
            return (UkTransfer) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, internationalTransferActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, UkTransfer ukTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, ukTransfer);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, UkTransfer ukTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, ukTransfer);
        }
    }
}
