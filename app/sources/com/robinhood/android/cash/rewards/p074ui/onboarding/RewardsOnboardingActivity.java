package com.robinhood.android.cash.rewards.p074ui.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingAssetSelectionParentFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingConfirmationFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroFragmentV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpFragmentV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.account.RewardsOnboardingSetupBrokerageFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: RewardsOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001HB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.H\u0016J\u001c\u0010/\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u00103\u001a\u000204H\u0002J$\u00105\u001a\u0002042\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u000107H\u0002J \u0010:\u001a\u0002042\u0006\u0010-\u001a\u00020.2\u0006\u0010;\u001a\u0002072\u0006\u0010<\u001a\u000207H\u0002J\u001a\u0010=\u001a\u0002042\b\u0010>\u001a\u0004\u0018\u00010\u00102\u0006\u0010?\u001a\u000207H\u0002J\u0012\u0010@\u001a\u0004\u0018\u00010\u00112\u0006\u0010A\u001a\u000207H\u0002J\t\u0010B\u001a\u00020+H\u0096\u0001R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bRk\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00122&\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DX\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$RewardsOnboardingV2Callbacks;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionParentFragment$Callbacks;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Callbacks;", "<init>", "()V", RewardsOnboardingActivity.EXTRA_ACTION, "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "getAction", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "action$delegate", "Lkotlin/Lazy;", "<set-?>", "Ljava/util/HashMap;", "", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "Lkotlin/collections/HashMap;", "contentMap", "getContentMap", "()Ljava/util/HashMap;", "setContentMap", "(Ljava/util/HashMap;)V", "contentMap$delegate", "Lkotlin/properties/ReadWriteProperty;", "duxo", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityDuxo;", "duxo$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "bindState", "state", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityViewState;", "onIntroComplete", "shouldShowBrokerageAccountCreation", "", "onAssetSelected", "selectedInvestmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "onSignUpComplete", "investmentType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "assetSymbol", "createIntroFragment", "Landroidx/fragment/app/Fragment;", "createStockSelectionFragment", "selectionContentId", "Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingContentEnum;", "brokerageOptionContentId", "brokerageOptionTitleId", "createSignupFragment", "reviewContentId", "bonusContentId", "createConfirmationFragment", "displaySymbol", "contentId", "enumContentMap", "enumValue", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOnboardingActivity extends BaseActivity implements RegionGated, RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks, RewardsOnboardingAssetSelectionParentFragment.Callbacks, RewardsOnboardingSignUpFragmentV2.Callbacks {
    private static final String EXTRA_ACTION = "action";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: action$delegate, reason: from kotlin metadata */
    private final Lazy action;

    /* renamed from: contentMap$delegate, reason: from kotlin metadata */
    private final Interfaces3 contentMap;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RewardsOnboardingActivity.class, "contentMap", "getContentMap()Ljava/util/HashMap;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RewardsOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LegacyIntentKey.RewardsOnboarding.Action.values().length];
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.CREATE_ENROLLMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.RESUME_ENROLLMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegacyIntentKey.RewardsOnboarding.Action.CHANGE_INVESTMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RewardsOnboardingActivityViewState3.values().length];
            try {
                iArr2[RewardsOnboardingActivityViewState3.VARIABLE_BONUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.ASSET_SELECTION_EXP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.ASSET_SELECTION_TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.ASSET_SELECTION_BROKE_SWEEP_INELIGIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.ASSET_SELECTION_BROKE_SWEEP_NOT_ENROLLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.ASSET_SELECTION_BROKE_SWEEP_ENROLLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.SIGNUP_CHANGE_SELECTION_RHS.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.SIGNUP_CHANGE_SELECTION_RHC.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.SIGNUP_SWEEP_INELIGIBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.SIGNUP_BROKERAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.SIGNUP_REVIEW_ASSET_RHS.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.SIGNUP_REVIEW_ASSET_RHC.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.CONFIRMATION_BROKE.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[RewardsOnboardingActivityViewState3.CONFIRMATION_ASSET.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RewardsOnboardingActivity() {
        super(C10176R.layout.activity_rewards_onboarding);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.action = Activity.intentExtra(this, EXTRA_ACTION);
        this.contentMap = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[0]);
        this.duxo = OldDuxos.oldDuxo(this, RewardsOnboardingActivityDuxo.class);
    }

    public final LegacyIntentKey.RewardsOnboarding.Action getAction() {
        return (LegacyIntentKey.RewardsOnboarding.Action) this.action.getValue();
    }

    private final HashMap<String, RewardsOnboardingContent> getContentMap() {
        return (HashMap) this.contentMap.getValue(this, $$delegatedProperties[0]);
    }

    private final void setContentMap(HashMap<String, RewardsOnboardingContent> map) {
        this.contentMap.setValue(this, $$delegatedProperties[0], map);
    }

    private final RewardsOnboardingActivityDuxo getDuxo() {
        return (RewardsOnboardingActivityDuxo) this.duxo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        RewardsOnboardingContent.ContentfulType contentfulType;
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(9472);
        RewardsOnboardingActivityDuxo duxo = getDuxo();
        int i = WhenMappings.$EnumSwitchMapping$0[getAction().ordinal()];
        int i2 = 2;
        if (i == 1 || i == 2) {
            contentfulType = RewardsOnboardingContent.ContentfulType.CREATE_ENROLLMENT_V2;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            contentfulType = RewardsOnboardingContent.ContentfulType.CHANGE_INVESTMENT_V2;
        }
        duxo.loadContentfulResource(contentfulType);
        ShimmerLoadingFragment.Args.NavButtonType navButtonType = null;
        Object[] objArr = 0;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C102012(this));
        if (savedInstanceState == null) {
            setFragment(C10176R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.List(true, true, 0), navButtonType, i2, objArr == true ? 1 : 0)));
        }
    }

    /* compiled from: RewardsOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivity$onCreate$2 */
    /* synthetic */ class C102012 extends FunctionReferenceImpl implements Function1<RewardsOnboardingActivityViewState, Unit> {
        C102012(Object obj) {
            super(1, obj, RewardsOnboardingActivity.class, "bindState", "bindState(Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivityViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RewardsOnboardingActivityViewState rewardsOnboardingActivityViewState) {
            invoke2(rewardsOnboardingActivityViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RewardsOnboardingActivityViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RewardsOnboardingActivity) this.receiver).bindState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivity$configureToolbar$1$1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams).topMargin = insets.getSystemWindowInsetTop();
                return insets;
            }
        });
        toolbar.setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(RewardsOnboardingActivityViewState state) {
        UiEvent<Throwable> contentError = state.getContentError();
        if (contentError != null) {
            contentError.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingActivity.bindState$lambda$2(this.f$0, (Throwable) obj);
                }
            });
        }
        UiEvent<Tuples2<HashMap<String, RewardsOnboardingContent>, AssetSelectionContentIds>> content = state.getContent();
        if (content != null) {
            content.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingActivity.bindState$lambda$3(this.f$0, (Tuples2) obj);
                }
            });
        }
        UiEvent<AssetSelectionContentIds> introComplete = state.getIntroComplete();
        if (introComplete != null) {
            introComplete.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingActivity.bindState$lambda$4(this.f$0, (AssetSelectionContentIds) obj);
                }
            });
        }
        UiEvent<Tuples2<InvestmentTarget, SignupContentIds>> assetSelected = state.getAssetSelected();
        if (assetSelected != null) {
            assetSelected.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingActivity.bindState$lambda$5(this.f$0, (Tuples2) obj);
                }
            });
        }
        UiEvent<Tuples2<String, RewardsOnboardingActivityViewState3>> signupComplete = state.getSignupComplete();
        if (signupComplete != null) {
            signupComplete.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RewardsOnboardingActivity.bindState$lambda$6(this.f$0, (Tuples2) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$2(RewardsOnboardingActivity rewardsOnboardingActivity, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbsErrorHandler.handleError$default(rewardsOnboardingActivity.getActivityErrorHandler(), it, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$3(RewardsOnboardingActivity rewardsOnboardingActivity, Tuples2 it) {
        Fragment fragmentCreateIntroFragment;
        Intrinsics.checkNotNullParameter(it, "it");
        rewardsOnboardingActivity.setContentMap((HashMap) it.getFirst());
        int i = WhenMappings.$EnumSwitchMapping$0[rewardsOnboardingActivity.getAction().ordinal()];
        if (i == 1) {
            fragmentCreateIntroFragment = rewardsOnboardingActivity.createIntroFragment();
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentCreateIntroFragment = rewardsOnboardingActivity.createStockSelectionFragment(((AssetSelectionContentIds) it.getSecond()).getSelectionActivityContent(), ((AssetSelectionContentIds) it.getSecond()).getBrokerageOptionContent(), ((AssetSelectionContentIds) it.getSecond()).getBrokerageTitleContent());
        }
        rewardsOnboardingActivity.replaceFragmentWithoutAnimationAndBackStack(fragmentCreateIntroFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$4(RewardsOnboardingActivity rewardsOnboardingActivity, AssetSelectionContentIds it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rewardsOnboardingActivity.replaceFragment(rewardsOnboardingActivity.createStockSelectionFragment(it.getSelectionActivityContent(), it.getBrokerageOptionContent(), it.getBrokerageTitleContent()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$5(RewardsOnboardingActivity rewardsOnboardingActivity, Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rewardsOnboardingActivity.replaceFragment(rewardsOnboardingActivity.createSignupFragment((InvestmentTarget) it.getFirst(), ((SignupContentIds) it.getSecond()).getReviewContent(), ((SignupContentIds) it.getSecond()).getBonusContent()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$6(RewardsOnboardingActivity rewardsOnboardingActivity, Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rewardsOnboardingActivity.replaceFragment(rewardsOnboardingActivity.createConfirmationFragment((String) it.getFirst(), (RewardsOnboardingActivityViewState3) it.getSecond()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks
    public void onIntroComplete(boolean shouldShowBrokerageAccountCreation) {
        if (shouldShowBrokerageAccountCreation) {
            replaceFragment(RewardsOnboardingSetupBrokerageFragment.INSTANCE.newInstance());
        } else {
            getDuxo().completeIntro();
        }
    }

    @Override // com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionParentFragment.Callbacks
    public void onAssetSelected(InvestmentTarget selectedInvestmentTarget) {
        Intrinsics.checkNotNullParameter(selectedInvestmentTarget, "selectedInvestmentTarget");
        getDuxo().completeAssetSelection(selectedInvestmentTarget, getAction());
    }

    @Override // com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpFragmentV2.Callbacks
    public void onSignUpComplete(ApiAssetType investmentType, String assetSymbol) {
        if (getAction() == LegacyIntentKey.RewardsOnboarding.Action.CHANGE_INVESTMENT) {
            finish();
        } else {
            getDuxo().completeSignup(investmentType, assetSymbol);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Fragment createIntroFragment() {
        List listEmptyList;
        List listSortedWith;
        HashMap<String, RewardsOnboardingContent> contentMap = getContentMap();
        RewardsOnboardingContent rewardsOnboardingContent = contentMap != null ? contentMap.get(RewardsOnboardingContent.VARIABLE_BONUS) : null;
        HashMap<String, RewardsOnboardingContent> contentMap2 = getContentMap();
        if (contentMap2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, RewardsOnboardingContent> entry : contentMap2.entrySet()) {
                String key = entry.getKey();
                if (StringsKt.startsWith$default(key, RewardsOnboardingContent.INTRO_LIST_ITEM_PREFIX, false, 2, (Object) null) && !Intrinsics.areEqual(key, RewardsOnboardingContent.INTRO_HEADER)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setEntrySet = linkedHashMap.entrySet();
            if (setEntrySet == null || (listSortedWith = CollectionsKt.sortedWith(setEntrySet, new Comparator() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingActivity$createIntroFragment$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((String) ((Map.Entry) t).getKey(), (String) ((Map.Entry) t2).getKey());
                }
            })) == null) {
                listEmptyList = null;
            } else {
                List list = listSortedWith;
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    listEmptyList.add((RewardsOnboardingContent) ((Map.Entry) it.next()).getValue());
                }
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        RewardsOnboardingIntroFragmentV2.Companion companion = RewardsOnboardingIntroFragmentV2.INSTANCE;
        LegacyIntentKey.RewardsOnboarding.Action action = getAction();
        HashMap<String, RewardsOnboardingContent> contentMap3 = getContentMap();
        RewardsOnboardingContent rewardsOnboardingContent2 = contentMap3 != null ? contentMap3.get(RewardsOnboardingContent.INTRO_HEADER) : null;
        HashMap<String, RewardsOnboardingContent> contentMap4 = getContentMap();
        return companion.newInstance((Parcelable) new RewardsOnboardingIntroFragmentV2.Args(action, rewardsOnboardingContent2, list2, contentMap4 != null ? contentMap4.get(RewardsOnboardingContent.ASSET_SELECT_DISCLOSURE) : null, rewardsOnboardingContent));
    }

    private final Fragment createStockSelectionFragment(RewardsOnboardingActivityViewState3 selectionContentId, RewardsOnboardingActivityViewState3 brokerageOptionContentId, RewardsOnboardingActivityViewState3 brokerageOptionTitleId) {
        return RewardsOnboardingAssetSelectionParentFragment.INSTANCE.newInstance((Parcelable) new RewardsOnboardingAssetSelectionParentFragment.Args(getAction(), enumContentMap(selectionContentId), brokerageOptionTitleId != null ? enumContentMap(brokerageOptionTitleId) : null, brokerageOptionContentId != null ? enumContentMap(brokerageOptionContentId) : null, null, 16, null));
    }

    private final Fragment createSignupFragment(InvestmentTarget selectedInvestmentTarget, RewardsOnboardingActivityViewState3 reviewContentId, RewardsOnboardingActivityViewState3 bonusContentId) {
        return RewardsOnboardingSignUpFragmentV2.INSTANCE.newInstance((Parcelable) new RewardsOnboardingSignUpFragmentV2.Args(getAction(), selectedInvestmentTarget, enumContentMap(reviewContentId), enumContentMap(bonusContentId)));
    }

    private final Fragment createConfirmationFragment(String displaySymbol, RewardsOnboardingActivityViewState3 contentId) {
        RewardsOnboardingConfirmationFragment.Companion companion = RewardsOnboardingConfirmationFragment.INSTANCE;
        LegacyIntentKey.RewardsOnboarding.Action action = getAction();
        RewardsOnboardingContent rewardsOnboardingContentEnumContentMap = enumContentMap(contentId);
        if (displaySymbol == null) {
            displaySymbol = "";
        }
        return companion.newInstance((Parcelable) new RewardsOnboardingConfirmationFragment.Args(action, rewardsOnboardingContentEnumContentMap, displaySymbol));
    }

    private final RewardsOnboardingContent enumContentMap(RewardsOnboardingActivityViewState3 enumValue) {
        switch (WhenMappings.$EnumSwitchMapping$1[enumValue.ordinal()]) {
            case 1:
                HashMap<String, RewardsOnboardingContent> contentMap = getContentMap();
                if (contentMap != null) {
                    return contentMap.get(RewardsOnboardingContent.VARIABLE_BONUS);
                }
                return null;
            case 2:
                HashMap<String, RewardsOnboardingContent> contentMap2 = getContentMap();
                if (contentMap2 != null) {
                    return contentMap2.get(RewardsOnboardingContent.ASSET_SELECT_TITLE);
                }
                return null;
            case 3:
                HashMap<String, RewardsOnboardingContent> contentMap3 = getContentMap();
                if (contentMap3 != null) {
                    return contentMap3.get(RewardsOnboardingContent.ASSET_SELECT_TITLE);
                }
                return null;
            case 4:
                HashMap<String, RewardsOnboardingContent> contentMap4 = getContentMap();
                if (contentMap4 != null) {
                    return contentMap4.get(RewardsOnboardingContent.ASSET_SELECT_BROKERAGE_OPTION_SWEEP_NOT_ELIGIBLE);
                }
                return null;
            case 5:
                HashMap<String, RewardsOnboardingContent> contentMap5 = getContentMap();
                if (contentMap5 != null) {
                    return contentMap5.get(RewardsOnboardingContent.ASSET_SELECT_BROKERAGE_OPTION_SWEEP_NOT_ENABLED);
                }
                return null;
            case 6:
                HashMap<String, RewardsOnboardingContent> contentMap6 = getContentMap();
                if (contentMap6 != null) {
                    return contentMap6.get(RewardsOnboardingContent.ASSET_SELECT_BROKERAGE_OPTION_SWEEP_ELIGIBLE);
                }
                return null;
            case 7:
                HashMap<String, RewardsOnboardingContent> contentMap7 = getContentMap();
                if (contentMap7 != null) {
                    return contentMap7.get(RewardsOnboardingContent.REVIEW_SELECTION_CHANGE_RHS);
                }
                return null;
            case 8:
                HashMap<String, RewardsOnboardingContent> contentMap8 = getContentMap();
                if (contentMap8 != null) {
                    return contentMap8.get(RewardsOnboardingContent.REVIEW_SELECTION_CHANGE_RHC);
                }
                return null;
            case 9:
                HashMap<String, RewardsOnboardingContent> contentMap9 = getContentMap();
                if (contentMap9 != null) {
                    return contentMap9.get(RewardsOnboardingContent.REVIEW_BROKERAGE_SWEEP_INELIGIBLE);
                }
                return null;
            case 10:
                HashMap<String, RewardsOnboardingContent> contentMap10 = getContentMap();
                if (contentMap10 != null) {
                    return contentMap10.get(RewardsOnboardingContent.REVIEW_BROKERAGE);
                }
                return null;
            case 11:
                HashMap<String, RewardsOnboardingContent> contentMap11 = getContentMap();
                if (contentMap11 != null) {
                    return contentMap11.get(RewardsOnboardingContent.REVIEW_ASSET_RHS);
                }
                return null;
            case 12:
                HashMap<String, RewardsOnboardingContent> contentMap12 = getContentMap();
                if (contentMap12 != null) {
                    return contentMap12.get(RewardsOnboardingContent.REVIEW_ASSET_RHC);
                }
                return null;
            case 13:
                HashMap<String, RewardsOnboardingContent> contentMap13 = getContentMap();
                if (contentMap13 != null) {
                    return contentMap13.get(RewardsOnboardingContent.CONFIRMATION_BROKERAGE);
                }
                return null;
            case 14:
                HashMap<String, RewardsOnboardingContent> contentMap14 = getContentMap();
                if (contentMap14 != null) {
                    return contentMap14.get(RewardsOnboardingContent.CONFIRMATION_ASSET);
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: RewardsOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "EXTRA_ACTION", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.RewardsOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RewardsOnboarding key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) RewardsOnboardingActivity.class);
            intent.putExtra(RewardsOnboardingActivity.EXTRA_ACTION, key.getAction());
            return intent;
        }
    }
}
