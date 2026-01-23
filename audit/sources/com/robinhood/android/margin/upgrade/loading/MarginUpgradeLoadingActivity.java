package com.robinhood.android.margin.upgrade.loading;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.android.margin.upgrade.MarginUpgradeActivity;
import com.robinhood.android.margin.upgrade.MarginUpgradeContext;
import com.robinhood.android.margin.upgrade.MarginUpgradeIneligibleFragment;
import com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingState3;
import com.robinhood.android.margin.upgrade.p175uk.UkMarginOnboardingActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.app.contracts.MarginUpgradeContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.scarlet.ScarletManager2;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MarginUpgradeLoadingActivity.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\u0012\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\t\u0010&\u001a\u00020\"H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;", "onUsFlowLoaded", "marginUpgradeContext", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeContext;", "toAccountTypeForTransfer", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "onUkFlowLoaded", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState$UkFlow;", "onNotAllowed", "reason", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "finishWithResultComplete", "finishWithResultCanceled", "isDeclined", "", "onDialogDismissed", "id", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeLoadingActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public MarginUpgradeLoadingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(LeveredMarginRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, MarginUpgradeLoadingDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginUpgradeLoadingDuxo getDuxo() {
        return (MarginUpgradeLoadingDuxo) this.duxo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
        ShimmerLoadingFragment.Args.NavButtonType navButtonType = null;
        Object[] objArr = 0;
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Generic(true), navButtonType, 2, objArr == true ? 1 : 0)));
        }
        BaseActivity.collectDuxoState$default(this, null, new C212021(null), 1, null);
    }

    /* compiled from: MarginUpgradeLoadingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingActivity$onCreate$1", m3645f = "MarginUpgradeLoadingActivity.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingActivity$onCreate$1 */
    static final class C212021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212021(Continuation<? super C212021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeLoadingActivity.this.new C212021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginUpgradeLoadingActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.margin.upgrade.loading.MarginUpgradeLoadingActivity$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MarginUpgradeLoadingActivity $tmp0;

            AnonymousClass1(MarginUpgradeLoadingActivity marginUpgradeLoadingActivity) {
                this.$tmp0 = marginUpgradeLoadingActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MarginUpgradeLoadingActivity.class, "bind", "bind(Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(MarginUpgradeLoadingState3 marginUpgradeLoadingState3, Continuation<? super Unit> continuation) throws Throwable {
                Object objInvokeSuspend$bind = C212021.invokeSuspend$bind(this.$tmp0, marginUpgradeLoadingState3, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MarginUpgradeLoadingState3) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<MarginUpgradeLoadingState3> stateFlow = MarginUpgradeLoadingActivity.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginUpgradeLoadingActivity.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(MarginUpgradeLoadingActivity marginUpgradeLoadingActivity, MarginUpgradeLoadingState3 marginUpgradeLoadingState3, Continuation continuation) throws Throwable {
            marginUpgradeLoadingActivity.bind(marginUpgradeLoadingState3);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MarginUpgradeLoadingState3 state) throws Throwable {
        if (state instanceof MarginUpgradeLoadingState3.Loading) {
            return;
        }
        if (state instanceof MarginUpgradeLoadingState3.AlreadyEnabled) {
            RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this).setId(C21137R.id.margin_already_enabled_error_dialog).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C21137R.string.margin_upgrade_already_enabled_error_message, new Object[0]);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, supportFragmentManager, "margin_upgrade_already_enabled_error_tag", false, 4, null);
            return;
        }
        if (state instanceof MarginUpgradeLoadingState3.Failure) {
            getActivityErrorHandler().invoke2(((MarginUpgradeLoadingState3.Failure) state).getThrowable());
            finishWithResultCanceled(true);
            return;
        }
        if (state instanceof MarginUpgradeLoadingState3.MarginUpgradeBlocked) {
            onNotAllowed(((MarginUpgradeLoadingState3.MarginUpgradeBlocked) state).getReason());
            return;
        }
        if (state instanceof MarginUpgradeLoadingState3.WillBeRestricted) {
            RhDialogFragment.Builder message2 = RhDialogFragment.INSTANCE.create(this).setId(C21137R.id.margin_will_be_restricted_error_dialog).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C21137R.string.margin_upgrade_will_be_restricted_error_message, new Object[0]);
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message2, supportFragmentManager2, "margin_upgrade_will_be_restricted_error_tag", false, 4, null);
            return;
        }
        if (state instanceof MarginUpgradeLoadingState3.UsFlow) {
            MarginUpgradeLoadingState3.UsFlow usFlow = (MarginUpgradeLoadingState3.UsFlow) state;
            onUsFlowLoaded(usFlow.getContext(), usFlow.getContext().getToAccountTypeForTransfer(), usFlow.getLocality());
        } else {
            if (!(state instanceof MarginUpgradeLoadingState3.UkFlow)) {
                throw new NoWhenBranchMatchedException();
            }
            onUkFlowLoaded((MarginUpgradeLoadingState3.UkFlow) state);
        }
    }

    private final void onUsFlowLoaded(MarginUpgradeContext marginUpgradeContext, TransferFundsDeepLinkAccountType toAccountTypeForTransfer, CountryCode.Supported locality) {
        MarginUpgradeActivity.Companion companion = MarginUpgradeActivity.INSTANCE;
        Companion companion2 = INSTANCE;
        Intent intentWithExtras = companion.getIntentWithExtras((Context) this, (Parcelable) new MarginUpgradeActivity.Args(marginUpgradeContext, ((EnableMarginInvestingKey) companion2.getExtras((Activity) this)).getSourceScreenIdentifier(), ((EnableMarginInvestingKey) companion2.getExtras((Activity) this)).getSourceType(), ((EnableMarginInvestingKey) companion2.getExtras((Activity) this)).getInHoodMonth2025Promo(), toAccountTypeForTransfer, locality));
        intentWithExtras.addFlags(33554432);
        startActivity(intentWithExtras);
        finish();
    }

    private final void onUkFlowLoaded(MarginUpgradeLoadingState3.UkFlow state) {
        Intent intentWithExtras = UkMarginOnboardingActivity.INSTANCE.getIntentWithExtras((Context) this, (Parcelable) new UkMarginOnboardingActivity.Args(state.getSplash(), state.getAccountNumber()));
        intentWithExtras.addFlags(33554432);
        startActivity(intentWithExtras);
        finish();
    }

    private final void onNotAllowed(ApiMarginEligibility.ApiMarginUpgradeBlocked reason) {
        replaceFragment(MarginUpgradeIneligibleFragment.INSTANCE.newInstance((Parcelable) reason));
    }

    private final void finishWithResultComplete() {
        NavigationActivityResultContract3.finishWithResult(this, MarginUpgradeContract.Result.Complete.INSTANCE);
    }

    static /* synthetic */ void finishWithResultCanceled$default(MarginUpgradeLoadingActivity marginUpgradeLoadingActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        marginUpgradeLoadingActivity.finishWithResultCanceled(z);
    }

    private final void finishWithResultCanceled(boolean isDeclined) {
        NavigationActivityResultContract3.finishWithResult(this, new MarginUpgradeContract.Result.Canceled(isDeclined));
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finishWithResultCanceled$default(this, false, 1, null);
        } else if (id == C21137R.id.margin_already_enabled_error_dialog) {
            finishWithResultComplete();
        }
    }

    /* compiled from: MarginUpgradeLoadingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/margin/upgrade/loading/MarginUpgradeLoadingActivity;", "Lcom/robinhood/android/margin/contracts/EnableMarginInvestingKey;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<MarginUpgradeLoadingActivity, EnableMarginInvestingKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public EnableMarginInvestingKey getExtras(MarginUpgradeLoadingActivity marginUpgradeLoadingActivity) {
            return (EnableMarginInvestingKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, marginUpgradeLoadingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, EnableMarginInvestingKey enableMarginInvestingKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, enableMarginInvestingKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, EnableMarginInvestingKey enableMarginInvestingKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, enableMarginInvestingKey);
        }
    }
}
