package com.robinhood.android.onboarding.drip.p204ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.drip.contracts.DripOnboarding;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.drip.C22776R;
import com.robinhood.android.onboarding.drip.p204ui.DripSplashFragment;
import com.robinhood.android.onboarding.drip.p204ui.DripSuccessFragment;
import com.robinhood.android.onboarding.drip.p204ui.DripValuePropFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.DripEligibility;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.agreements.contracts.IdentiAgreementKey;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: DripOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020&H\u0002J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010/\u001a\u00020&2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020&2\u0006\u00100\u001a\u000201H\u0016J\b\u00103\u001a\u00020&H\u0016J\b\u00104\u001a\u00020&H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/onboarding/drip/ui/DripOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/onboarding/drip/ui/DripSplashFragment$Callbacks;", "Lcom/robinhood/android/onboarding/drip/ui/DripValuePropFragment$Callbacks;", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey$Callbacks;", "<init>", "()V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "dripSettingsStore", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "getDripSettingsStore", "()Lcom/robinhood/librobinhood/data/store/DripSettingsStore;", "setDripSettingsStore", "(Lcom/robinhood/librobinhood/data/store/DripSettingsStore;)V", "shimmerLoadingView", "Landroidx/compose/ui/platform/ComposeView;", "getShimmerLoadingView", "()Landroidx/compose/ui/platform/ComposeView;", "shimmerLoadingView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "composeDialogView", "getComposeDialogView", "composeDialogView$delegate", "<set-?>", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "setBrokerageAccountType", "(Lcom/robinhood/models/api/BrokerageAccountType;)V", "brokerageAccountType$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showAlreadyEnabledDialog", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onSplashContinue", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/librobinhood/data/store/DripEligibility$Eligible;", "onValuePropContinueClicked", "onAgreementAccepted", "navigateToHomeScreenAndFinish", "Companion", "feature-drip-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DripOnboardingActivity extends BaseActivity implements DripSplashFragment.Callbacks, DripValuePropFragment.Callbacks, IdentiAgreementKey.Callbacks {

    /* renamed from: brokerageAccountType$delegate, reason: from kotlin metadata */
    private final Interfaces3 brokerageAccountType;
    public CardManager cardManager;

    /* renamed from: composeDialogView$delegate, reason: from kotlin metadata */
    private final Interfaces2 composeDialogView;
    public DripSettingsStore dripSettingsStore;

    /* renamed from: shimmerLoadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 shimmerLoadingView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DripOnboardingActivity.class, "shimmerLoadingView", "getShimmerLoadingView()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.property1(new PropertyReference1Impl(DripOnboardingActivity.class, "composeDialogView", "getComposeDialogView()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DripOnboardingActivity.class, "brokerageAccountType", "getBrokerageAccountType()Lcom/robinhood/models/api/BrokerageAccountType;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DripOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementKey.Callbacks
    public void onSubmissionStateChanged(boolean z) {
        IdentiAgreementKey.Callbacks.DefaultImpls.onSubmissionStateChanged(this, z);
    }

    public DripOnboardingActivity() {
        super(C22776R.layout.activity_drip_onboarding);
        this.shimmerLoadingView = bindView(C22776R.id.shimmer_loading_view);
        this.composeDialogView = bindView(C22776R.id.compose_dialog_view);
        this.brokerageAccountType = (Interfaces3) BindSavedState2.savedSerializable(this, BrokerageAccountType.UNKNOWN).provideDelegate(this, $$delegatedProperties[2]);
    }

    public final CardManager getCardManager() {
        CardManager cardManager = this.cardManager;
        if (cardManager != null) {
            return cardManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardManager");
        return null;
    }

    public final void setCardManager(CardManager cardManager) {
        Intrinsics.checkNotNullParameter(cardManager, "<set-?>");
        this.cardManager = cardManager;
    }

    public final DripSettingsStore getDripSettingsStore() {
        DripSettingsStore dripSettingsStore = this.dripSettingsStore;
        if (dripSettingsStore != null) {
            return dripSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dripSettingsStore");
        return null;
    }

    public final void setDripSettingsStore(DripSettingsStore dripSettingsStore) {
        Intrinsics.checkNotNullParameter(dripSettingsStore, "<set-?>");
        this.dripSettingsStore = dripSettingsStore;
    }

    private final ComposeView getShimmerLoadingView() {
        return (ComposeView) this.shimmerLoadingView.getValue(this, $$delegatedProperties[0]);
    }

    private final ComposeView getComposeDialogView() {
        return (ComposeView) this.composeDialogView.getValue(this, $$delegatedProperties[1]);
    }

    private final BrokerageAccountType getBrokerageAccountType() {
        return (BrokerageAccountType) this.brokerageAccountType.getValue(this, $$delegatedProperties[2]);
    }

    private final void setBrokerageAccountType(BrokerageAccountType brokerageAccountType) {
        this.brokerageAccountType.setValue(this, $$delegatedProperties[2], brokerageAccountType);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            final ComposeView shimmerLoadingView = getShimmerLoadingView();
            shimmerLoadingView.setContent(ComposableLambda3.composableLambdaInstance(911332000, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.drip.ui.DripOnboardingActivity$onCreate$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911332000, i, -1, "com.robinhood.android.onboarding.drip.ui.DripOnboardingActivity.onCreate.<anonymous>.<anonymous> (DripOnboardingActivity.kt:50)");
                    }
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(shimmerLoadingView)), null, DripOnboardingActivity2.INSTANCE.m16826getLambda$1469433426$feature_drip_onboarding_externalDebug(), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            shimmerLoadingView.setVisibility(0);
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getDripSettingsStore().eligibleForDripOnboarding(((DripOnboarding) INSTANCE.getExtras((Activity) this)).getAccountNumber())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.drip.ui.DripOnboardingActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DripOnboardingActivity.onCreate$lambda$2(this.f$0, (DripEligibility) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(DripOnboardingActivity dripOnboardingActivity, DripEligibility eligibility) {
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        if (Intrinsics.areEqual(eligibility, DripEligibility.Ineligible.INSTANCE)) {
            ComposeView composeDialogView = dripOnboardingActivity.getComposeDialogView();
            composeDialogView.setContent(ComposableLambda3.composableLambdaInstance(-438640071, true, new DripOnboardingActivity5(composeDialogView, dripOnboardingActivity)));
        } else if (eligibility instanceof DripEligibility.Eligible) {
            dripOnboardingActivity.setBrokerageAccountType(((DripEligibility.Eligible) eligibility).getBrokerageAccountType());
            dripOnboardingActivity.getShimmerLoadingView().setVisibility(8);
            dripOnboardingActivity.setFragment(C11048R.id.fragment_container, DripSplashFragment.INSTANCE.newInstance((Parcelable) eligibility));
        } else {
            if (!Intrinsics.areEqual(eligibility, DripEligibility.AlreadyOnboarded.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            dripOnboardingActivity.showAlreadyEnabledDialog();
        }
        return Unit.INSTANCE;
    }

    private final void showAlreadyEnabledDialog() {
        RhDialogFragment.Builder cancelable = RhDialogFragment.INSTANCE.create(this).setUseDesignSystemOverlay(true).setTitle(C22776R.string.drip_onboarding_already_enabled_dialog_title, new Object[0]).setMessage(C22776R.string.drip_onboarding_already_enabled_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setCancelable(false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(cancelable, supportFragmentManager, "alreadyEnabledDialog", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        navigateToHomeScreenAndFinish();
        return true;
    }

    @Override // com.robinhood.android.onboarding.drip.ui.DripSplashFragment.Callbacks
    public void onSplashContinue(DripEligibility.Eligible data) {
        Intrinsics.checkNotNullParameter(data, "data");
        replaceFragment(DripValuePropFragment.INSTANCE.newInstance((Parcelable) data));
    }

    @Override // com.robinhood.android.onboarding.drip.ui.DripValuePropFragment.Callbacks
    public void onValuePropContinueClicked(DripEligibility.Eligible data) {
        IdentiAgreementType.ClientDriven clientDriven;
        Intrinsics.checkNotNullParameter(data, "data");
        Navigator navigator = getNavigator();
        switch (WhenMappings.$EnumSwitchMapping$0[data.getBrokerageAccountType().ordinal()]) {
            case 1:
                if (data.isOriginalAccount()) {
                    clientDriven = IdentiAgreementType.ClientDriven.DRIP_INDIVIDUAL;
                    break;
                } else {
                    clientDriven = IdentiAgreementType.ClientDriven.DRIP_INDIVIDUAL_ACCOUNT_SCOPE;
                    break;
                }
            case 2:
                clientDriven = IdentiAgreementType.ClientDriven.DRIP_IRA_ROTH;
                break;
            case 3:
                clientDriven = IdentiAgreementType.ClientDriven.DRIP_IRA_TRADITIONAL;
                break;
            case 4:
                clientDriven = IdentiAgreementType.ClientDriven.DRIP_JOINT_TENANCY_WITH_ROS;
                break;
            case 5:
            case 6:
                clientDriven = IdentiAgreementType.ClientDriven.CUSTODIAL_DRIP_AGREEMENT;
                break;
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(data.getBrokerageAccountType());
                throw new ExceptionsH();
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new IdentiAgreementKey(clientDriven, ((DripOnboarding) INSTANCE.getExtras((Activity) this)).getAccountNumber(), null, 4, null), null, 2, null));
    }

    @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementKey.Callbacks
    public void onAgreementAccepted() {
        Companion companion = INSTANCE;
        String accountNumber = ((DripOnboarding) companion.getExtras((Activity) this)).getAccountNumber();
        if (accountNumber != null) {
            getDripSettingsStore().refreshForAccount(true, accountNumber);
        } else {
            getDripSettingsStore().refresh(true);
        }
        getCardManager().invalidateCardsBestEffort();
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack(DripSuccessFragment.INSTANCE.newInstance((Parcelable) new DripSuccessFragment.Args(((DripOnboarding) companion.getExtras((Activity) this)).getAccountNumber())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToHomeScreenAndFinish() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, TabLinkIntentKey.Home.Legacy.INSTANCE, null, false, null, null, 60, null);
        finish();
    }

    /* compiled from: DripOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/drip/ui/DripOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/drip/ui/DripOnboardingActivity;", "Lcom/robinhood/android/drip/contracts/DripOnboarding;", "<init>", "()V", "feature-drip-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DripOnboardingActivity, DripOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public DripOnboarding getExtras(DripOnboardingActivity dripOnboardingActivity) {
            return (DripOnboarding) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, dripOnboardingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, DripOnboarding dripOnboarding) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, dripOnboarding);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, DripOnboarding dripOnboarding) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, dripOnboarding);
        }
    }
}
