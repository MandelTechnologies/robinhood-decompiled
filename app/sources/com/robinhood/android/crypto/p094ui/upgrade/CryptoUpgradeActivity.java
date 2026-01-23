package com.robinhood.android.crypto.p094ui.upgrade;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.BaseCryptoActivity;
import com.robinhood.android.crypto.p094ui.upgrade.CryptoUpgradeState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosure.CryptoUpgradeDisclosureFragment;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.crypto.contracts.account.CryptoUpgradeIntentKey;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoUpgradeActivity.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\"\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u001eH\u0002J\b\u00104\u001a\u00020\u001eH\u0002J\b\u00105\u001a\u00020\u001eH\u0002J\u0012\u00106\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u00010\rH\u0002J\b\u00108\u001a\u00020\u001eH\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u00101\u001a\u000202H\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\u001a\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020&2\b\u0010>\u001a\u0004\u0018\u00010 H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeActivity;", "Lcom/robinhood/android/crypto/ui/BaseCryptoActivity;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureFragment$Callbacks;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo;", "getDuxo", "()Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", CryptoUpgradeActivity.EXTRA_ENTRY_POINT_ID, "", "getEntryPointIdentifier", "()Ljava/lang/String;", "entryPointIdentifier$delegate", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "cryptoExperimentStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "getCryptoExperimentStore", "()Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "setCryptoExperimentStore", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "showCryptoList", "upgradeState", "Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState$UpgradeState$ShowCryptoCuratedList;", "startIdUploadActivity", "documentId", "Ljava/util/UUID;", "showSignupUi", "showUnderReviewUi", "showAlreadyUpgradedDialog", "showIneligibleDialog", "externalStatusCode", "onUpgradeSucceeded", "onUpgradePendingResidencyDocument", "onUpgradeUnderReview", "onPositiveButtonClicked", "", "id", "passthroughArgs", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoUpgradeActivity extends BaseCryptoActivity implements CryptoUpgradeDisclosureFragment.Callbacks, CryptoUpgradeDisclosureFragment.Callbacks {
    private static final String EXTRA_ENTRY_POINT_ID = "entryPointIdentifier";
    public static final String EXTRA_FROM_DEEPLINK = "fromDeeplink";
    private static final int ID_UPLOAD_REQUEST_CODE = 1;
    private static final String USER_ACTION_INELIGIBLE_PREFIX = "crypto-ineligible-";
    public AnalyticsLogger analytics;
    public CryptoExperimentsStore cryptoExperimentStore;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: entryPointIdentifier$delegate, reason: from kotlin metadata */
    private final Lazy entryPointIdentifier;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CryptoUpgradeActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = OldDuxos.oldDuxo(this, CryptoUpgradeDuxo.class);
        this.entryPointIdentifier = Activity.intentExtra(this, EXTRA_ENTRY_POINT_ID);
    }

    private final CryptoUpgradeDuxo getDuxo() {
        return (CryptoUpgradeDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getEntryPointIdentifier() {
        return (String) this.entryPointIdentifier.getValue();
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

    public final CryptoExperimentsStore getCryptoExperimentStore() {
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentStore;
        if (cryptoExperimentsStore != null) {
            return cryptoExperimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoExperimentStore");
        return null;
    }

    public final void setCryptoExperimentStore(CryptoExperimentsStore cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "<set-?>");
        this.cryptoExperimentStore = cryptoExperimentsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C135581(this));
    }

    /* compiled from: CryptoUpgradeActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeActivity$onCreate$1 */
    /* synthetic */ class C135581 extends FunctionReferenceImpl implements Function1<CryptoUpgradeState, Unit> {
        C135581(Object obj) {
            super(1, obj, CryptoUpgradeActivity.class, "bind", "bind(Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CryptoUpgradeState cryptoUpgradeState) {
            invoke2(cryptoUpgradeState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CryptoUpgradeState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CryptoUpgradeActivity) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(CryptoUpgradeState state) {
        ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getErrorEvent());
        if (state.isLoading()) {
            return;
        }
        CryptoUpgradeState.UpgradeState upgradeState = state.getUpgradeState();
        if (Intrinsics.areEqual(upgradeState, CryptoUpgradeState.UpgradeState.AccountUnderReview.INSTANCE)) {
            showUnderReviewUi();
            return;
        }
        if (Intrinsics.areEqual(upgradeState, CryptoUpgradeState.UpgradeState.AlreadyUpgraded.INSTANCE)) {
            showAlreadyUpgradedDialog();
            return;
        }
        if (Intrinsics.areEqual(upgradeState, CryptoUpgradeState.UpgradeState.Eligible.INSTANCE)) {
            showSignupUi();
            return;
        }
        if (upgradeState instanceof CryptoUpgradeState.UpgradeState.Ineligible) {
            showIneligibleDialog(((CryptoUpgradeState.UpgradeState.Ineligible) upgradeState).getExternalStatusCode());
        } else if (upgradeState instanceof CryptoUpgradeState.UpgradeState.ResidencyDocumentRequired) {
            startIdUploadActivity(((CryptoUpgradeState.UpgradeState.ResidencyDocumentRequired) upgradeState).getPendingResidencyDocumentId());
        } else {
            if (!(upgradeState instanceof CryptoUpgradeState.UpgradeState.ShowCryptoCuratedList)) {
                throw new NoWhenBranchMatchedException();
            }
            showCryptoList((CryptoUpgradeState.UpgradeState.ShowCryptoCuratedList) upgradeState);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == -1) {
                showUnderReviewUi();
            } else {
                finish();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    private final void showCryptoList(CryptoUpgradeState.UpgradeState.ShowCryptoCuratedList upgradeState) {
        Navigator.DefaultImpls.showFragment$default(getNavigator(), this, upgradeState.getFragmentKey(), false, false, false, null, false, null, false, false, null, null, 4084, null);
        finish();
    }

    private final void startIdUploadActivity(UUID documentId) {
        startActivityForResult(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, DocumentUpload.Companion.singleDocStandaloneActivityIntent$default(DocumentUpload.INSTANCE, DocumentRequest.INSTANCE.photoIdForCrypto(documentId), false, null, false, null, 30, null), null, false, 12, null), 1);
    }

    private final void showSignupUi() {
        if (getCurrentFragment(C11048R.id.fragment_container) != null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C135591(null), 3, null);
    }

    /* compiled from: CryptoUpgradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeActivity$showSignupUi$1", m3645f = "CryptoUpgradeActivity.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeActivity$showSignupUi$1 */
    static final class C135591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C135591(Continuation<? super C135591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoUpgradeActivity.this.new C135591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C135591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Fragment fragmentNewInstance;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoUsOnboardingExperiment = CryptoUpgradeActivity.this.getCryptoExperimentStore().streamCryptoUsOnboardingExperiment();
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamCryptoUsOnboardingExperiment, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null ? bool.booleanValue() : false) {
                fragmentNewInstance = com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureFragment.INSTANCE.newInstance((Parcelable) new CryptoUpgradeDisclosureFragment.Args(CryptoUpgradeActivity.this.getEntryPointIdentifier()));
            } else {
                fragmentNewInstance = com.robinhood.android.crypto.p094ui.upgrade.disclosure.CryptoUpgradeDisclosureFragment.INSTANCE.newInstance((Parcelable) new CryptoUpgradeDisclosureFragment.Args(CryptoUpgradeActivity.this.getEntryPointIdentifier()));
            }
            CryptoUpgradeActivity.this.setFragment(C11048R.id.fragment_container, fragmentNewInstance);
            return Unit.INSTANCE;
        }
    }

    private final void showUnderReviewUi() {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.CryptoUpgradeUnderReview(LegacyFragmentKey.CryptoUpgradeUnderReview.MessageType.UNDER_REVIEW), null, 2, null));
    }

    private final void showAlreadyUpgradedDialog() {
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C12757R.id.dialog_id_crypto_already_upgraded).setTitle(C12757R.string.crypto_upgrade_already_upgraded_title, new Object[0]).setMessage(C12757R.string.crypto_upgrade_already_upgraded_body, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "cryptoAlreadyUpgraded", false, 4, null);
    }

    private final void showIneligibleDialog(String externalStatusCode) {
        if (externalStatusCode != null) {
            getAnalytics().logUserAction(USER_ACTION_INELIGIBLE_PREFIX + externalStatusCode);
        }
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C12757R.id.dialog_id_crypto_ineligible_for_upgrade).setTitle(C12757R.string.crypto_upgrade_ineligible_title, new Object[0]).setMessage(C12757R.string.crypto_upgrade_ineligible_body, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "ineligibleDialog", false, 4, null);
    }

    @Override // com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureFragment.Callbacks, com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureFragment.Callbacks
    public void onUpgradeSucceeded() {
        setResult(-1);
        finish();
    }

    @Override // com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureFragment.Callbacks, com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureFragment.Callbacks
    public void onUpgradePendingResidencyDocument(UUID documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        startIdUploadActivity(documentId);
    }

    @Override // com.robinhood.android.crypto.ui.upgrade.disclosure.CryptoUpgradeDisclosureFragment.Callbacks, com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureFragment.Callbacks
    public void onUpgradeUnderReview() {
        showUnderReviewUi();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C12757R.id.dialog_id_crypto_already_upgraded || id == C12757R.id.dialog_id_crypto_ineligible_for_upgrade) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: CryptoUpgradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/CryptoUpgradeActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/crypto/contracts/account/CryptoUpgradeIntentKey;", "<init>", "()V", "USER_ACTION_INELIGIBLE_PREFIX", "", "EXTRA_FROM_DEEPLINK", "EXTRA_ENTRY_POINT_ID", "ID_UPLOAD_REQUEST_CODE", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<CryptoUpgradeIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoUpgradeIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, (Class<?>) CryptoUpgradeActivity.class).putExtra(CryptoUpgradeActivity.EXTRA_FROM_DEEPLINK, key.getFromDeeplink()).putExtra(CryptoUpgradeActivity.EXTRA_ENTRY_POINT_ID, key.getEntryPointIdentifier());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }
}
