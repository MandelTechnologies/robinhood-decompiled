package com.robinhood.android.microdeposits.p182ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.microdeposits.C21805R;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.reactivex.Observable;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: VerifyMicrodepositsActivity.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020-H\u0014J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020-2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0014J\u0010\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020-H\u0002J\t\u0010?\u001a\u000208H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b#\u0010$R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsDuxo;", "getDuxo", "()Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", VerifyMicrodepositsActivity.EXTRA_RELATIONSHIP_ID, "Ljava/util/UUID;", "getRelationshipId", "()Ljava/util/UUID;", "relationshipId$delegate", "amountOneLayout", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", "getAmountOneLayout", "()Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", "amountOneLayout$delegate", "Lkotlin/properties/ReadOnlyProperty;", "amountTwoLayout", "getAmountTwoLayout", "amountTwoLayout$delegate", "amountOneEdt", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", "getAmountOneEdt", "()Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", "amountOneEdt$delegate", "amountTwoEdt", "getAmountTwoEdt", "amountTwoEdt$delegate", "numpad", "Lcom/robinhood/android/designsystem/numpad/RdsNumpadContainerView;", "getNumpad", "()Lcom/robinhood/android/designsystem/numpad/RdsNumpadContainerView;", "numpad$delegate", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "refreshUI", "state", "Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onVerificationComplete", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class VerifyMicrodepositsActivity extends BaseActivity implements RegionGated {
    private static final String EXTRA_RELATIONSHIP_ID = "relationshipId";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: amountOneEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 amountOneEdt;

    /* renamed from: amountOneLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 amountOneLayout;

    /* renamed from: amountTwoEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 amountTwoEdt;

    /* renamed from: amountTwoLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 amountTwoLayout;
    public AnalyticsLogger analytics;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: numpad$delegate, reason: from kotlin metadata */
    private final Interfaces2 numpad;

    /* renamed from: relationshipId$delegate, reason: from kotlin metadata */
    private final Lazy relationshipId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(VerifyMicrodepositsActivity.class, "amountOneLayout", "getAmountOneLayout()Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", 0)), Reflection.property1(new PropertyReference1Impl(VerifyMicrodepositsActivity.class, "amountTwoLayout", "getAmountTwoLayout()Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", 0)), Reflection.property1(new PropertyReference1Impl(VerifyMicrodepositsActivity.class, "amountOneEdt", "getAmountOneEdt()Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", 0)), Reflection.property1(new PropertyReference1Impl(VerifyMicrodepositsActivity.class, "amountTwoEdt", "getAmountTwoEdt()Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", 0)), Reflection.property1(new PropertyReference1Impl(VerifyMicrodepositsActivity.class, "numpad", "getNumpad()Lcom/robinhood/android/designsystem/numpad/RdsNumpadContainerView;", 0))};

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

    public VerifyMicrodepositsActivity() {
        super(C21805R.layout.activity_verify_microdeposits);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, VerifyMicrodepositsDuxo.class);
        this.relationshipId = Activity.intentExtra(this, EXTRA_RELATIONSHIP_ID);
        this.amountOneLayout = bindView(C21805R.id.microdeposit_one_input_layout);
        this.amountTwoLayout = bindView(C21805R.id.microdeposit_two_input_layout);
        this.amountOneEdt = bindView(C21805R.id.microdeposit_one_edt);
        this.amountTwoEdt = bindView(C21805R.id.microdeposit_two_edt);
        this.numpad = bindView(C21805R.id.numpad);
    }

    private final VerifyMicrodepositsDuxo getDuxo() {
        return (VerifyMicrodepositsDuxo) this.duxo.getValue();
    }

    private final UUID getRelationshipId() {
        return (UUID) this.relationshipId.getValue();
    }

    private final RdsTextInputContainerView getAmountOneLayout() {
        return (RdsTextInputContainerView) this.amountOneLayout.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsTextInputContainerView getAmountTwoLayout() {
        return (RdsTextInputContainerView) this.amountTwoLayout.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsTextInputEditText getAmountOneEdt() {
        return (RdsTextInputEditText) this.amountOneEdt.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsTextInputEditText getAmountTwoEdt() {
        return (RdsTextInputEditText) this.amountTwoEdt.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsNumpadContainerView getNumpad() {
        return (RdsNumpadContainerView) this.numpad.getValue(this, $$delegatedProperties[4]);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Observable<CharSequence> observableSkip = RxTextView.textChanges(getAmountOneEdt()).skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSkip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyMicrodepositsActivity.onCreate$lambda$0(this.f$0, (CharSequence) obj);
            }
        });
        Observable<CharSequence> observableSkip2 = RxTextView.textChanges(getAmountTwoEdt()).skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip2, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSkip2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyMicrodepositsActivity.onCreate$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
        getNumpad().setOnButtonClick(new Function0() { // from class: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VerifyMicrodepositsActivity.onCreate$lambda$2(this.f$0);
            }
        });
        getNumpad().useDefaultKeyHandler();
        getNumpad().setDelimiterEnabled(false);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(getNumpad(), InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(VerifyMicrodepositsActivity verifyMicrodepositsActivity, CharSequence charSequence) {
        verifyMicrodepositsActivity.getDuxo().updateAmountOne(String.valueOf(verifyMicrodepositsActivity.getAmountOneEdt().getText()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(VerifyMicrodepositsActivity verifyMicrodepositsActivity, CharSequence charSequence) {
        verifyMicrodepositsActivity.getDuxo().updateAmountTwo(String.valueOf(verifyMicrodepositsActivity.getAmountTwoEdt().getText()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(VerifyMicrodepositsActivity verifyMicrodepositsActivity) {
        verifyMicrodepositsActivity.getDuxo().verifyMicrodeposits(verifyMicrodepositsActivity.getRelationshipId(), String.valueOf(verifyMicrodepositsActivity.getAmountOneEdt().getText()), String.valueOf(verifyMicrodepositsActivity.getAmountTwoEdt().getText()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C218201(this));
    }

    /* compiled from: VerifyMicrodepositsActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.microdeposits.ui.VerifyMicrodepositsActivity$onResume$1 */
    /* synthetic */ class C218201 extends FunctionReferenceImpl implements Function1<VerifyMicrodepositsViewState, Unit> {
        C218201(Object obj) {
            super(1, obj, VerifyMicrodepositsActivity.class, "refreshUI", "refreshUI(Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VerifyMicrodepositsViewState verifyMicrodepositsViewState) throws Throwable {
            invoke2(verifyMicrodepositsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VerifyMicrodepositsViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((VerifyMicrodepositsActivity) this.receiver).refreshUI(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUI(VerifyMicrodepositsViewState state) throws Throwable {
        Throwable thConsume;
        getAmountOneEdt().setEnabled(state.getInputsEnabled());
        getAmountTwoEdt().setEnabled(state.getInputsEnabled());
        RdsTextInputContainerView amountOneLayout = getAmountOneLayout();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        amountOneLayout.setErrorText(state.getAmountOneErrorText(resources));
        RdsTextInputContainerView amountTwoLayout = getAmountTwoLayout();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        amountTwoLayout.setErrorText(state.getAmountTwoErrorText(resources2));
        if (state.getClearInputFocus()) {
            getAmountOneEdt().clearFocus();
            getAmountTwoEdt().clearFocus();
        }
        showProgressBar(state.getShowProgressBar());
        getNumpad().setButtonEnabled(state.getIsVerifyButtonEnabled());
        getNumpad().setButtonLoading(state.getIsNumpadLoading());
        UiEvent<Unit> verificationCompleteEvent = state.getVerificationCompleteEvent();
        if ((verificationCompleteEvent != null ? verificationCompleteEvent.consume() : null) != null) {
            onVerificationComplete();
        }
        UiEvent<Throwable> verificationErrorEvent = state.getVerificationErrorEvent();
        if (verificationErrorEvent == null || (thConsume = verificationErrorEvent.consume()) == null) {
            return;
        }
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, thConsume, false, false, 0, null, 60, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C21805R.string.iav_custom_verify_microdeposits_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected boolean createOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C11048R.menu.menu_info, menu);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C11048R.id.action_info) {
            RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(this).setMessage(C21805R.string.iav_custom_verify_microdeposit_explanation, new Object[0]);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, supportFragmentManager, "microdeposit-explanation", false, 4, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private final void onVerificationComplete() {
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_LINK_BANK_MICRODEPOSITS);
        setTransitionReason(TransitionReason.MICRODEPOSIT_VERIFIED);
        Toast.makeText(this, C21805R.string.iav_custom_verify_success, 0).show();
        finish();
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new TransferV2(TransferDirectionV2.DEPOSIT, new TransferConfiguration.Standard(null, null, false, null, null, null, null, null, false, false, null, null, false, 8191, null), null, 4, null), null, false, null, null, 60, null);
    }

    /* compiled from: VerifyMicrodepositsActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/VerifyMicrodepositsActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$VerifyMicrodeposits;", "<init>", "()V", "EXTRA_RELATIONSHIP_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.VerifyMicrodeposits> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.VerifyMicrodeposits key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) VerifyMicrodepositsActivity.class);
            intent.putExtra(VerifyMicrodepositsActivity.EXTRA_RELATIONSHIP_ID, key.getAchRelationshipId());
            return intent;
        }
    }
}
