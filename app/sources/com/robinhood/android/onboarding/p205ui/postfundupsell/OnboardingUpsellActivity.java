package com.robinhood.android.onboarding.p205ui.postfundupsell;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistPostSignUpIntentKey;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.gold.contracts.GoldAgreementsActivityIntentKey;
import com.robinhood.android.gold.contracts.GoldAgreementsContract;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellGoldRateSelectionFragmentContract;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellIntentKey;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellStandardPageFragmentContract;
import com.robinhood.android.onboarding.p205ui.postfundupsell.loading.OnboardingUpsellLoadingFragment;
import com.robinhood.android.onboarding.p205ui.postfundupsell.preferences.GoldNativeFundingUpsellSourcePref;
import com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.onboardingupsell.ApiChooseApyScreenContent;
import com.robinhood.models.onboardingupsell.ApiOnboardingUpsellFlow;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.prefs.StringPreference;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OnboardingUpsellActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001SB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00108\u001a\u000201H\u0002J\u0010\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020;H\u0016J\u0018\u0010<\u001a\u0002012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020#H\u0016J\b\u0010>\u001a\u000201H\u0002J\u0010\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020AH\u0016J\u001a\u0010B\u001a\u0002012\b\u0010C\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020/H\u0002J\b\u0010F\u001a\u000201H\u0002J\u0012\u0010G\u001a\u0002012\b\b\u0002\u0010H\u001a\u00020/H\u0002J\"\u0010I\u001a\u0002012\b\u0010J\u001a\u0004\u0018\u00010+2\b\u0010K\u001a\u0004\u0018\u00010+H\u0082@¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u000201H\u0002J\u0010\u0010N\u001a\u0002012\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u000201H\u0002J\b\u0010R\u001a\u000201H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R/\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070605X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/loading/OnboardingUpsellLoadingFragment$Callbacks;", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract$Callbacks;", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract$Callbacks;", "<init>", "()V", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "getCardManager", "()Lcom/robinhood/android/common/util/CardManager;", "setCardManager", "(Lcom/robinhood/android/common/util/CardManager;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "goldNativeFundingUpsellSourcePref", "Lcom/robinhood/prefs/StringPreference;", "getGoldNativeFundingUpsellSourcePref$annotations", "getGoldNativeFundingUpsellSourcePref", "()Lcom/robinhood/prefs/StringPreference;", "setGoldNativeFundingUpsellSourcePref", "(Lcom/robinhood/prefs/StringPreference;)V", "<set-?>", "Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;", "onboardingUpsellFlow", "getOnboardingUpsellFlow", "()Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;", "setOnboardingUpsellFlow", "(Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;)V", "onboardingUpsellFlow$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellVariant;", "onboardingUpsellVariant", "getOnboardingUpsellVariant", "()Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellVariant;", "setOnboardingUpsellVariant", "(Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellVariant;)V", "onboardingUpsellVariant$delegate", "source", "", "getSource", "()Ljava/lang/String;", "shouldPromptForLockscreen", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "goldAgreementsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/gold/contracts/GoldAgreementsActivityIntentKey;", "navigateAfterGoldAgreementsCompletes", "onUpsellLoadingFailed", "t", "", "onUpsellLoaded", "upsellVariant", "onUpsellExited", "onOnboardingUpsellAction", "action", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "onGoldUpsellClicked", "feature", "onShowRetirementUpsell", "withGold", "onShowGoldChooseApy", "displayRetirementUpsellPage", "showTransition", "onRetirementUpsellClicked", "entryContext", "entryPointStr", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRetirementUpsellCancel", "handleOnboardingUpsellDeeplink", "uri", "Landroid/net/Uri;", "finishWithComplete", "finishWithCancel", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OnboardingUpsellActivity extends BaseActivity implements OnboardingUpsellLoadingFragment.Callbacks, OnboardingUpsellGoldRateSelectionFragmentContract.Callbacks, OnboardingUpsellStandardPageFragmentContract.Callbacks {
    private static final String GOLD_AGREEMENTS_DEEPLINK_PATH = "gold_agreements";
    private static final String RETIREMENT_SIGNUP_DEEPLINK_PATH = "retirement_signup";
    public CardManager cardManager;
    public ExperimentsStore experimentsStore;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldAgreementsActivityIntentKey>> goldAgreementsLauncher;
    public StringPreference goldNativeFundingUpsellSourcePref;

    /* renamed from: onboardingUpsellFlow$delegate, reason: from kotlin metadata */
    private final Interfaces3 onboardingUpsellFlow;

    /* renamed from: onboardingUpsellVariant$delegate, reason: from kotlin metadata */
    private final Interfaces3 onboardingUpsellVariant;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(OnboardingUpsellActivity.class, "onboardingUpsellFlow", "getOnboardingUpsellFlow()Lcom/robinhood/models/onboardingupsell/ApiOnboardingUpsellFlow;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OnboardingUpsellActivity.class, "onboardingUpsellVariant", "getOnboardingUpsellVariant()Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellVariant;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OnboardingUpsellActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingUpsellVariant.values().length];
            try {
                iArr[OnboardingUpsellVariant.RETIREMENT_VARIANT2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnboardingUpsellVariant.GOLD_NATIVE_FUNDING_UPSELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OnboardingUpsellActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity", m3645f = "OnboardingUpsellActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m3647m = "onRetirementUpsellClicked")
    /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity$onRetirementUpsellClicked$1 */
    static final class C228021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C228021(Continuation<? super C228021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingUpsellActivity.this.onRetirementUpsellClicked(null, null, this);
        }
    }

    @GoldNativeFundingUpsellSourcePref
    public static /* synthetic */ void getGoldNativeFundingUpsellSourcePref$annotations() {
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return false;
    }

    public OnboardingUpsellActivity() {
        super(C11048R.layout.activity_fragment_container);
        Interfaces interfacesSavedParcelable = BindSavedState2.savedParcelable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.onboardingUpsellFlow = (Interfaces3) interfacesSavedParcelable.provideDelegate(this, kPropertyArr[0]);
        this.onboardingUpsellVariant = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[1]);
        this.goldAgreementsLauncher = registerForActivityResult(new GoldAgreementsContract(new Function0() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity$goldAgreementsLauncher$2

            /* compiled from: OnboardingUpsellActivity.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity$goldAgreementsLauncher$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OnboardingUpsellVariant.values().length];
                    try {
                        iArr[OnboardingUpsellVariant.RETIREMENT_VARIANT2.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(GoldAgreementsContract.Result result) {
                if (result instanceof GoldAgreementsContract.Result.Completed) {
                    this.this$0.navigateAfterGoldAgreementsCompletes();
                    return;
                }
                if (!(result instanceof GoldAgreementsContract.Result.Canceled)) {
                    this.this$0.finishWithCancel();
                    return;
                }
                if (((GoldAgreementsContract.Result.Canceled) result).getBackButtonPressed()) {
                    return;
                }
                OnboardingUpsellVariant onboardingUpsellVariant = this.this$0.getOnboardingUpsellVariant();
                if ((onboardingUpsellVariant == null ? -1 : WhenMappings.$EnumSwitchMapping$0[onboardingUpsellVariant.ordinal()]) == 1) {
                    this.this$0.onShowRetirementUpsell(false);
                } else {
                    this.this$0.finishWithCancel();
                }
            }
        });
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

    public final StringPreference getGoldNativeFundingUpsellSourcePref() {
        StringPreference stringPreference = this.goldNativeFundingUpsellSourcePref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldNativeFundingUpsellSourcePref");
        return null;
    }

    public final void setGoldNativeFundingUpsellSourcePref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldNativeFundingUpsellSourcePref = stringPreference;
    }

    private final ApiOnboardingUpsellFlow getOnboardingUpsellFlow() {
        return (ApiOnboardingUpsellFlow) this.onboardingUpsellFlow.getValue(this, $$delegatedProperties[0]);
    }

    private final void setOnboardingUpsellFlow(ApiOnboardingUpsellFlow apiOnboardingUpsellFlow) {
        this.onboardingUpsellFlow.setValue(this, $$delegatedProperties[0], apiOnboardingUpsellFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingUpsellVariant getOnboardingUpsellVariant() {
        return (OnboardingUpsellVariant) this.onboardingUpsellVariant.getValue(this, $$delegatedProperties[1]);
    }

    private final void setOnboardingUpsellVariant(OnboardingUpsellVariant onboardingUpsellVariant) {
        this.onboardingUpsellVariant.setValue(this, $$delegatedProperties[1], onboardingUpsellVariant);
    }

    private final String getSource() {
        String str = getGoldNativeFundingUpsellSourcePref().get();
        return str == null ? ((OnboardingUpsellIntentKey) INSTANCE.getExtras((Activity) this)).getSource() : str;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, OnboardingUpsellLoadingFragment.INSTANCE.newInstance((Parcelable) new OnboardingUpsellLoadingFragment.Args(getSource(), ((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).getAmount())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateAfterGoldAgreementsCompletes() {
        OnboardingUpsellVariant onboardingUpsellVariant = getOnboardingUpsellVariant();
        if ((onboardingUpsellVariant == null ? -1 : WhenMappings.$EnumSwitchMapping$0[onboardingUpsellVariant.ordinal()]) == 1) {
            onShowRetirementUpsell(true);
        } else {
            finishWithComplete();
        }
    }

    @Override // com.robinhood.android.onboarding.ui.postfundupsell.loading.OnboardingUpsellLoadingFragment.Callbacks
    public void onUpsellLoadingFailed(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        getGoldNativeFundingUpsellSourcePref().set(null);
        finishWithCancel();
    }

    @Override // com.robinhood.android.onboarding.ui.postfundupsell.loading.OnboardingUpsellLoadingFragment.Callbacks
    public void onUpsellLoaded(ApiOnboardingUpsellFlow onboardingUpsellFlow, OnboardingUpsellVariant upsellVariant) {
        Intrinsics.checkNotNullParameter(onboardingUpsellFlow, "onboardingUpsellFlow");
        Intrinsics.checkNotNullParameter(upsellVariant, "upsellVariant");
        setOnboardingUpsellFlow(onboardingUpsellFlow);
        setOnboardingUpsellVariant(upsellVariant);
        getGoldNativeFundingUpsellSourcePref().set(null);
        if (upsellVariant == OnboardingUpsellVariant.GOLD_NATIVE_FUNDING_UPSELL) {
            displayRetirementUpsellPage(false);
            return;
        }
        StandardPageTemplate<OnboardingFundingUpsellAction> onboarding_funding_upsell_view_model = onboardingUpsellFlow.getOnboarding_funding_upsell_view_model();
        if (onboarding_funding_upsell_view_model == null) {
            finishWithCancel();
        } else {
            popEntireFragmentBackstack();
            replaceFragmentWithoutAnimationAndBackStack(OnboardingUpsellStandardPageFragment.INSTANCE.newInstance((Parcelable) new OnboardingUpsellStandardPageFragmentContract.Key(onboarding_funding_upsell_view_model, false, false, 6, null)));
        }
    }

    private final void onUpsellExited() {
        finishWithComplete();
    }

    @Override // com.robinhood.android.onboarding.contracts.OnboardingUpsellGoldRateSelectionFragmentContract.Callbacks
    public boolean onOnboardingUpsellAction(OnboardingFundingUpsellAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof OnboardingFundingUpsellAction.Skip) {
            onRetirementUpsellCancel();
        } else if (action instanceof OnboardingFundingUpsellAction.Deeplink) {
            handleOnboardingUpsellDeeplink(Uri.parse(((OnboardingFundingUpsellAction.Deeplink) action).getValue2().getUri()));
        } else if (action instanceof OnboardingFundingUpsellAction.FundingUpsellShowRetirementUpsell) {
            displayRetirementUpsellPage$default(this, false, 1, null);
        } else if (action instanceof OnboardingFundingUpsellAction.FundingUpsellShowChooseApy) {
            onShowGoldChooseApy();
        } else {
            if (!(action instanceof OnboardingFundingUpsellAction.Dismiss)) {
                return false;
            }
            onUpsellExited();
        }
        return true;
    }

    private final void onGoldUpsellClicked(String feature, String source) {
        NavigationActivityResultContract3.launch$default(this.goldAgreementsLauncher, new GoldAgreementsActivityIntentKey(feature, source, ((OnboardingUpsellIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding(), !CollectionsKt.contains(SetsKt.setOf(OnboardingUpsellVariant.RETIREMENT_VARIANT2), getOnboardingUpsellVariant())), null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowRetirementUpsell(boolean withGold) {
        StandardPageTemplate<OnboardingFundingUpsellAction> onboarding_funding_upsell_retirement_no_gold_view_model = null;
        if (withGold) {
            ApiOnboardingUpsellFlow onboardingUpsellFlow = getOnboardingUpsellFlow();
            if (onboardingUpsellFlow != null) {
                onboarding_funding_upsell_retirement_no_gold_view_model = onboardingUpsellFlow.getOnboarding_funding_upsell_retirement_gold_view_model();
            }
        } else {
            ApiOnboardingUpsellFlow onboardingUpsellFlow2 = getOnboardingUpsellFlow();
            if (onboardingUpsellFlow2 != null) {
                onboarding_funding_upsell_retirement_no_gold_view_model = onboardingUpsellFlow2.getOnboarding_funding_upsell_retirement_no_gold_view_model();
            }
        }
        StandardPageTemplate<OnboardingFundingUpsellAction> standardPageTemplate = onboarding_funding_upsell_retirement_no_gold_view_model;
        if (standardPageTemplate == null) {
            finishWithCancel();
            return;
        }
        RetirementLastKnownEntryPointManager retirementLastKnownEntryPointManager = RetirementLastKnownEntryPointManager.INSTANCE;
        Companion companion = INSTANCE;
        retirementLastKnownEntryPointManager.setFromRhfOnboarding(((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).isFromRhfOnboarding());
        retirementLastKnownEntryPointManager.setTheme(((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).getTheme());
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack(OnboardingUpsellStandardPageFragment.INSTANCE.newInstance((Parcelable) new OnboardingUpsellStandardPageFragmentContract.Key(standardPageTemplate, false, false, 6, null)));
    }

    private final void onShowGoldChooseApy() {
        ApiOnboardingUpsellFlow onboardingUpsellFlow = getOnboardingUpsellFlow();
        ApiChooseApyScreenContent onboarding_funding_upsell_choose_apy_view_model = onboardingUpsellFlow != null ? onboardingUpsellFlow.getOnboarding_funding_upsell_choose_apy_view_model() : null;
        if (onboarding_funding_upsell_choose_apy_view_model != null) {
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new OnboardingUpsellGoldRateSelectionFragmentContract.Key(onboarding_funding_upsell_choose_apy_view_model, false, 2, null), null, 2, null));
        } else {
            finishWithCancel();
        }
    }

    static /* synthetic */ void displayRetirementUpsellPage$default(OnboardingUpsellActivity onboardingUpsellActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        onboardingUpsellActivity.displayRetirementUpsellPage(z);
    }

    private final void displayRetirementUpsellPage(boolean showTransition) {
        Function1 onboardingUpsellActivity3;
        ApiOnboardingUpsellFlow onboardingUpsellFlow;
        OnboardingUpsellVariant onboardingUpsellVariant = getOnboardingUpsellVariant();
        int i = onboardingUpsellVariant == null ? -1 : WhenMappings.$EnumSwitchMapping$0[onboardingUpsellVariant.ordinal()];
        StandardPageTemplate<OnboardingFundingUpsellAction> onboarding_funding_upsell_retirement_no_gold_view_model = null;
        if (i == 1) {
            ApiOnboardingUpsellFlow onboardingUpsellFlow2 = getOnboardingUpsellFlow();
            if (onboardingUpsellFlow2 != null) {
                onboarding_funding_upsell_retirement_no_gold_view_model = onboardingUpsellFlow2.getOnboarding_funding_upsell_retirement_no_gold_view_model();
            }
        } else if (i == 2 && (onboardingUpsellFlow = getOnboardingUpsellFlow()) != null) {
            onboarding_funding_upsell_retirement_no_gold_view_model = onboardingUpsellFlow.getRetirementNativeFundingViewModel();
        }
        StandardPageTemplate<OnboardingFundingUpsellAction> standardPageTemplate = onboarding_funding_upsell_retirement_no_gold_view_model;
        RetirementLastKnownEntryPointManager retirementLastKnownEntryPointManager = RetirementLastKnownEntryPointManager.INSTANCE;
        Companion companion = INSTANCE;
        retirementLastKnownEntryPointManager.setFromRhfOnboarding(((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).isFromRhfOnboarding());
        retirementLastKnownEntryPointManager.setTheme(((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).getTheme());
        if (standardPageTemplate != null) {
            if (showTransition) {
                onboardingUpsellActivity3 = new OnboardingUpsellActivity2(this);
            } else {
                onboardingUpsellActivity3 = new OnboardingUpsellActivity3(this);
            }
            popEntireFragmentBackstack();
            onboardingUpsellActivity3.invoke(OnboardingUpsellStandardPageFragment.INSTANCE.newInstance((Parcelable) new OnboardingUpsellStandardPageFragmentContract.Key(standardPageTemplate, false, false, 6, null)));
            return;
        }
        finishWithCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onRetirementUpsellClicked(String str, String str2, Continuation<? super Unit> continuation) {
        C228021 c228021;
        String str3;
        String str4;
        if (continuation instanceof C228021) {
            c228021 = (C228021) continuation;
            int i = c228021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c228021.label = i - Integer.MIN_VALUE;
            } else {
                c228021 = new C228021(continuation);
            }
        }
        Object objFirstOrNull = c228021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c228021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(getExperimentsStore(), new Experiment[]{CreditCardPostSignUpAddToWaitlistExperiment.INSTANCE}, false, null, 6, null);
            c228021.L$0 = str;
            c228021.L$1 = str2;
            c228021.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamStateFlow$default, c228021);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str;
            str4 = str2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str5 = (String) c228021.L$1;
            String str6 = (String) c228021.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
            str3 = str6;
            str4 = str5;
        }
        Boolean bool = (Boolean) objFirstOrNull;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        boolean zContains = CollectionsKt.contains(CollectionsKt.listOf((Object[]) new OnboardingUpsellVariant[]{OnboardingUpsellVariant.RETIREMENT_VARIANT2, OnboardingUpsellVariant.GOLD_NATIVE_FUNDING_UPSELL}), getOnboardingUpsellVariant());
        Companion companion = INSTANCE;
        RetirementSignUp retirementSignUp = new RetirementSignUp(null, str3, false, str4, zContains, null, ((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).getTheme(), 37, null);
        boolean zAreEqual = Intrinsics.areEqual(getSource(), OnboardingUpsellIntentKey.RETIREMENT_MATCH_PROMO);
        if (zBooleanValue && ((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).isFromRhfOnboarding()) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new CreditCardWaitlistPostSignUpIntentKey(retirementSignUp, zAreEqual), null, false, null, null, 60, null);
        } else {
            RetirementLastKnownEntryPointManager retirementLastKnownEntryPointManager = RetirementLastKnownEntryPointManager.INSTANCE;
            retirementLastKnownEntryPointManager.setLastKnownEntryPoint(str3);
            retirementLastKnownEntryPointManager.setFromRhfOnboarding(((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).isFromRhfOnboarding());
            retirementLastKnownEntryPointManager.setTheme(((OnboardingUpsellIntentKey) companion.getExtras((Activity) this)).getTheme());
            retirementLastKnownEntryPointManager.setShouldLaunchTaxMatchPromoForResurrectedUser(Intrinsics.areEqual(getSource(), OnboardingUpsellIntentKey.RETIREMENT_MATCH_PROMO));
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, retirementSignUp, null, false, null, null, 60, null);
        }
        finish();
        return Unit.INSTANCE;
    }

    private final void onRetirementUpsellCancel() {
        RetirementLastKnownEntryPointManager.INSTANCE.setFromRhfOnboarding(false);
        finishWithCancel();
    }

    private final void handleOnboardingUpsellDeeplink(Uri uri) {
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != 50120936) {
                if (iHashCode == 2121503774 && host.equals(RETIREMENT_SIGNUP_DEEPLINK_PATH)) {
                    BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C228011(uri.getQueryParameter("context"), uri.getQueryParameter("entry_point"), null), 3, null);
                    return;
                }
            } else if (host.equals(GOLD_AGREEMENTS_DEEPLINK_PATH)) {
                String queryParameter = uri.getQueryParameter("source");
                if (queryParameter == null) {
                    queryParameter = "unknown";
                }
                onGoldUpsellClicked(uri.getQueryParameter("feature"), queryParameter);
                return;
            }
        }
        finishWithCancel();
    }

    /* compiled from: OnboardingUpsellActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity$handleOnboardingUpsellDeeplink$1", m3645f = "OnboardingUpsellActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.OnboardingUpsellActivity$handleOnboardingUpsellDeeplink$1 */
    static final class C228011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $entryContext;
        final /* synthetic */ String $entryPointStr;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C228011(String str, String str2, Continuation<? super C228011> continuation) {
            super(2, continuation);
            this.$entryContext = str;
            this.$entryPointStr = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OnboardingUpsellActivity.this.new C228011(this.$entryContext, this.$entryPointStr, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C228011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OnboardingUpsellActivity onboardingUpsellActivity = OnboardingUpsellActivity.this;
                String str = this.$entryContext;
                String str2 = this.$entryPointStr;
                this.label = 1;
                if (onboardingUpsellActivity.onRetirementUpsellClicked(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void finishWithComplete() {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithCancel() {
        setResult(0);
        finish();
    }

    /* compiled from: OnboardingUpsellActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellActivity;", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellIntentKey;", "<init>", "()V", "GOLD_AGREEMENTS_DEEPLINK_PATH", "", "RETIREMENT_SIGNUP_DEEPLINK_PATH", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OnboardingUpsellActivity, OnboardingUpsellIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OnboardingUpsellIntentKey getExtras(OnboardingUpsellActivity onboardingUpsellActivity) {
            return (OnboardingUpsellIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, onboardingUpsellActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, OnboardingUpsellIntentKey onboardingUpsellIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, onboardingUpsellIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, OnboardingUpsellIntentKey onboardingUpsellIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, onboardingUpsellIntentKey);
        }
    }
}
