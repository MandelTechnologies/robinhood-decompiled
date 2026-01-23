package com.robinhood.android.matcha.p177ui.history.pending;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.lib.stepupverification.SuvMigrationManager;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.databinding.FragmentMatchaPendingTransactionsBinding;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.models.p176ui.UiMatchaUser;
import com.robinhood.android.matcha.p177ui.common.ErrorHandling;
import com.robinhood.android.matcha.p177ui.history.detail.request.MatchaRequestDetailFragment;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowState;
import com.robinhood.android.matcha.p177ui.history.pending.row.TransactionRowView;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.models.Verifications;
import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.social.contracts.PendingTransactionsFragmentKey;
import com.robinhood.android.social.contracts.matcha.MatchaProfile;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.util.Money;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.resource.StringResource;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaPendingTransactionsFragment.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010*\u001a\u00020\u001dH\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0016J\u000e\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u000203J\u001a\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001a\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001b2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020?H\u0016J*\u0010@\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020GH\u0016J\u0010\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020OH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\"R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowView$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/matcha/databinding/FragmentMatchaPendingTransactionsBinding;", "getBinding", "()Lcom/robinhood/android/matcha/databinding/FragmentMatchaPendingTransactionsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsAdapter;", "activityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "emailVerificationLauncher", "phoneVerificationLauncher", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "errorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "getErrorHandler", "()Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "errorHandler$delegate", "suvMigrationManager", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "getSuvMigrationManager", "()Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "setSuvMigrationManager", "(Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;)V", "onStart", "onAttach", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "bind", "state", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onTransactionActionSuccess", "transactionId", "successText", "Lcom/robinhood/utils/resource/StringResource;", "onTransactionActionFailure", "throwable", "", "reviewRequestPayment", "requestId", "transactor", "Lcom/robinhood/android/matcha/models/ui/UiMatchaUser;", "amount", "Lcom/robinhood/models/util/Money;", MemoInputActivity.EXTRA_MEMO, "", "handleVerification", "verificationRequired", "Lcom/robinhood/android/matcha/ui/history/pending/row/TransactionRowState$Action$VerificationRequired;", "viewProfile", "userId", "showConfirmationSnackbar", "text", "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaPendingTransactionsFragment extends BaseFragment implements TransactionRowView.Callbacks {
    private final ActivityResultLauncher<Intent> activityLauncher;
    private final MatchaPendingTransactionsAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<Intent> emailVerificationLauncher;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    private final ActivityResultLauncher<Intent> phoneVerificationLauncher;
    public SuvMigrationManager suvMigrationManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaPendingTransactionsFragment.class, "binding", "getBinding()Lcom/robinhood/android/matcha/databinding/FragmentMatchaPendingTransactionsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MatchaPendingTransactionsFragment() {
        super(C21284R.layout.fragment_matcha_pending_transactions);
        this.binding = ViewBinding5.viewBinding(this, MatchaPendingTransactionsFragment3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, MatchaPendingTransactionsDuxo.class);
        this.adapter = new MatchaPendingTransactionsAdapter(this);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$activityLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intent data;
                Bundle extras;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() != -1 || (data = result.getData()) == null || (extras = data.getExtras()) == null) {
                    return;
                }
                Serializable serializable = extras.getSerializable("requestId");
                Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type java.util.UUID");
                UUID uuid = (UUID) serializable;
                String string2 = extras.getString(MatchaRequestDetailFragment.EXTRA_CONFIRMATION_TEXT);
                this.this$0.onTransactionActionSuccess(uuid, string2 != null ? StringResource.INSTANCE.invoke(string2) : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.activityLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$emailVerificationLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.getDuxo().continuePostVerification(null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.emailVerificationLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$phoneVerificationLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.getDuxo().continuePostVerification(null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.phoneVerificationLauncher = activityResultLauncherRegisterForActivityResult3;
        this.launchSuv = SuvLauncher.registerSuvLauncher((Fragment) this, (Function0<? extends Navigator>) new Function0() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaPendingTransactionsFragment.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaPendingTransactionsFragment.launchSuv$lambda$2(this.f$0);
            }
        });
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaPendingTransactionsFragment.errorHandler_delegate$lambda$3(this.f$0);
            }
        });
    }

    private final FragmentMatchaPendingTransactionsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMatchaPendingTransactionsBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchaPendingTransactionsDuxo getDuxo() {
        return (MatchaPendingTransactionsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(MatchaPendingTransactionsFragment matchaPendingTransactionsFragment) {
        matchaPendingTransactionsFragment.getDuxo().continuePostVerification(VerificationWorkflowResult.APPROVED);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$2(MatchaPendingTransactionsFragment matchaPendingTransactionsFragment) {
        matchaPendingTransactionsFragment.getDuxo().continuePostVerification(VerificationWorkflowResult.DENIED);
        return Unit.INSTANCE;
    }

    private final ActivityErrorHandler getErrorHandler() {
        return (ActivityErrorHandler) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityErrorHandler errorHandler_delegate$lambda$3(MatchaPendingTransactionsFragment matchaPendingTransactionsFragment) {
        return ErrorHandling.getMatchaErrorHandler(matchaPendingTransactionsFragment.requireBaseActivity());
    }

    public final SuvMigrationManager getSuvMigrationManager() {
        SuvMigrationManager suvMigrationManager = this.suvMigrationManager;
        if (suvMigrationManager != null) {
            return suvMigrationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suvMigrationManager");
        return null;
    }

    public final void setSuvMigrationManager(SuvMigrationManager suvMigrationManager) {
        Intrinsics.checkNotNullParameter(suvMigrationManager, "<set-?>");
        this.suvMigrationManager = suvMigrationManager;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C213541(this));
    }

    /* compiled from: MatchaPendingTransactionsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$onStart$1 */
    /* synthetic */ class C213541 extends FunctionReferenceImpl implements Function1<MatchaPendingTransactionsState, Unit> {
        C213541(Object obj) {
            super(1, obj, MatchaPendingTransactionsFragment.class, "bind", "bind(Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MatchaPendingTransactionsState matchaPendingTransactionsState) {
            invoke2(matchaPendingTransactionsState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MatchaPendingTransactionsState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MatchaPendingTransactionsFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C21284R.string.matcha_pending_transactions_title));
    }

    public final void bind(MatchaPendingTransactionsState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.adapter.submitList(state.getRowItems());
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent != null) {
            errorEvent.consumeWith(getErrorHandler());
        }
        UiEvent<Unit> exitEvent = state.getExitEvent();
        if (exitEvent != null) {
            exitEvent.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MatchaPendingTransactionsFragment.bind$lambda$5(this.f$0, (Unit) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5(MatchaPendingTransactionsFragment matchaPendingTransactionsFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaPendingTransactionsFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.adapter);
    }

    @Override // com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView.Callbacks
    public void onTransactionActionSuccess(UUID transactionId, StringResource successText) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        getDuxo().refresh();
        if (successText != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            showConfirmationSnackbar(successText.getText(resources));
        }
    }

    @Override // com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView.Callbacks
    public void onTransactionActionFailure(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        getErrorHandler().invoke2(throwable);
    }

    @Override // com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView.Callbacks
    public void reviewRequestPayment(UUID requestId, UiMatchaUser transactor, Money amount, String memo) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        Intrinsics.checkNotNullParameter(amount, "amount");
        ActivityResultLauncher<Intent> activityResultLauncher = this.activityLauncher;
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new MatchaTransaction.ReviewRequestPayment(amount, new Transactor.User(transactor, false, 2, null), requestId, memo, MatchaTransaction.EntryPoint.PENDING_TRANSACTIONS), null, false, 12, null));
        requireActivity().finish();
    }

    @Override // com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView.Callbacks
    public void handleVerification(TransactionRowState.Action.VerificationRequired verificationRequired) {
        Intrinsics.checkNotNullParameter(verificationRequired, "verificationRequired");
        getDuxo().setPendingVerification(verificationRequired);
        ApiMatchaTransfer.Verification verification = verificationRequired.getVerification();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intentCreateIntent = Verifications.createIntent(verification, navigator, contextRequireContext);
        if (verification instanceof ApiMatchaTransfer.Verification.Email) {
            this.emailVerificationLauncher.launch(intentCreateIntent);
            return;
        }
        if (verification instanceof ApiMatchaTransfer.Verification.Phone) {
            this.phoneVerificationLauncher.launch(intentCreateIntent);
        } else if (verification instanceof ApiMatchaTransfer.Verification.Suv) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C213531(((ApiMatchaTransfer.Verification.Suv) verification).getData().getVerification_workflow_id(), null), 3, null);
        } else if (!(verification instanceof ApiMatchaTransfer.Verification.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: MatchaPendingTransactionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$handleVerification$1", m3645f = "MatchaPendingTransactionsFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$handleVerification$1 */
    static final class C213531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $workflowId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C213531(UUID uuid, Continuation<? super C213531> continuation) {
            super(2, continuation);
            this.$workflowId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaPendingTransactionsFragment.this.new C213531(this.$workflowId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Function2 function2;
            UUID uuid;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                function2 = MatchaPendingTransactionsFragment.this.launchSuv;
                UUID uuid2 = this.$workflowId;
                SuvMigrationManager suvMigrationManager = MatchaPendingTransactionsFragment.this.getSuvMigrationManager();
                UUID uuid3 = this.$workflowId;
                this.L$0 = function2;
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
                function2 = (Function2) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            function2.invoke(uuid, obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView.Callbacks
    public void viewProfile(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new MatchaProfile(userId, null, false, 6, null), false, false, false, false, null, false, null, null, 1020, null);
    }

    private final void showConfirmationSnackbar(CharSequence text) {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        RdsSnackbar rdsSnackbarMake = companion.make(viewRequireView, text, -1);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Drawable themeDrawable = Contexts7.getThemeDrawable(contextRequireContext, C20690R.attr.iconCheckmark16dp);
        Intrinsics.checkNotNull(themeDrawable);
        rdsSnackbarMake.setLeadingIcon(themeDrawable).addDismissCallback(new Function2() { // from class: com.robinhood.android.matcha.ui.history.pending.MatchaPendingTransactionsFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MatchaPendingTransactionsFragment.showConfirmationSnackbar$lambda$6(this.f$0, (RdsSnackbar) obj, ((Integer) obj2).intValue());
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showConfirmationSnackbar$lambda$6(MatchaPendingTransactionsFragment matchaPendingTransactionsFragment, RdsSnackbar rdsSnackbar, int i) {
        matchaPendingTransactionsFragment.getDuxo().onConfirmationSnackbarDismissed();
        return Unit.INSTANCE;
    }

    /* compiled from: MatchaPendingTransactionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/history/pending/MatchaPendingTransactionsFragment;", "Lcom/robinhood/android/social/contracts/PendingTransactionsFragmentKey;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MatchaPendingTransactionsFragment, PendingTransactionsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PendingTransactionsFragmentKey pendingTransactionsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pendingTransactionsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PendingTransactionsFragmentKey getArgs(MatchaPendingTransactionsFragment matchaPendingTransactionsFragment) {
            return (PendingTransactionsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, matchaPendingTransactionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaPendingTransactionsFragment newInstance(PendingTransactionsFragmentKey pendingTransactionsFragmentKey) {
            return (MatchaPendingTransactionsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pendingTransactionsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaPendingTransactionsFragment matchaPendingTransactionsFragment, PendingTransactionsFragmentKey pendingTransactionsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, matchaPendingTransactionsFragment, pendingTransactionsFragmentKey);
        }
    }
}
