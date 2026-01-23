package com.robinhood.android.resumeapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellIntentKey;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.resumeapplication.ResumeApplicationSplashFragment;
import com.robinhood.android.resumeapplication.ResurrectionChurnedAndZeroFundedFragment;
import com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment;
import com.robinhood.android.transfers.contracts.DepositFundsDeepLink;
import com.robinhood.models.api.bonfire.ChurnedFundingV2Content;
import com.robinhood.models.api.bonfire.FundingUpsellContent;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse8;
import com.robinhood.models.api.bonfire.ResumeApplicationTakeoverLoggingInfo;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.ResumeApplicationChurnedAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.ThemedImageSource;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResumeApplicationParentFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\"\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationSplashFragment$Callbacks;", "Lcom/robinhood/android/resumeapplication/ResurrectionChurnedAndZeroFundedFragment$Callbacks;", "Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFundAccountCancel", "onResumeApplicationSplashComplete", "onFundAccountOnly", "onLaunchGoldAndRetirementUpsell", "onLaunchCryptoTab", "onLaunchRetirementMatchPromo", "onDetermineResurrectionUpsell", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/ResumeApplicationChurnedAction;", "onDetermineChurnedFundingFragment", "Landroidx/fragment/app/Fragment;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Args", "Companion", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ResumeApplicationParentFragment extends BaseFragment implements ResumeApplicationSplashFragment.Callbacks, ResurrectionChurnedAndZeroFundedFragment.Callbacks, ResurrectionInactiveAndLowAumFragment.Callbacks {
    private static final String DEFAULT_NAME = "User";
    public static final int REQUEST_CODE_CRYPTO_TAB_UPSELL_AFTER_FUNDING = 1004;
    public static final int REQUEST_CODE_GOLD_AND_RETIREMENT_UPSELL_AFTER_FUNDING = 1002;
    public static final int REQUEST_CODE_RETIREMENT_MATCH_PROMO_AFTER_FUNDING = 1003;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseFragment.$stable;

    public ResumeApplicationParentFragment() {
        super(C11048R.layout.parent_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Fragment fragmentOnDetermineChurnedFundingFragment;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            if (((Args) companion.getArgs((Fragment) this)).getShowWelcomeBack()) {
                ResumeApplicationSplashFragment.Companion companion2 = ResumeApplicationSplashFragment.INSTANCE;
                String firstName = ((Args) companion.getArgs((Fragment) this)).getFirstName();
                if (firstName == null) {
                    firstName = "User";
                }
                fragmentOnDetermineChurnedFundingFragment = companion2.newInstance((Parcelable) new ResumeApplicationSplashFragment.Args(firstName, ((Args) companion.getArgs((Fragment) this)).getVariant() == ResumeApplicationResponse8.CHURNED_V2, ((Args) companion.getArgs((Fragment) this)).getWelcomeBackBackgroundColor(), ((Args) companion.getArgs((Fragment) this)).getWelcomeBackImageSource()));
            } else {
                fragmentOnDetermineChurnedFundingFragment = onDetermineChurnedFundingFragment();
            }
            setFragment(C11048R.id.fragment_container, fragmentOnDetermineChurnedFundingFragment);
        }
    }

    @Override // com.robinhood.android.resumeapplication.ResurrectionChurnedAndZeroFundedFragment.Callbacks, com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment.Callbacks
    public void onFundAccountCancel() {
        requireActivity().onBackPressed();
    }

    @Override // com.robinhood.android.resumeapplication.ResumeApplicationSplashFragment.Callbacks
    public void onResumeApplicationSplashComplete() {
        replaceFragmentWithoutAnimationAndBackStack(onDetermineChurnedFundingFragment());
    }

    @Override // com.robinhood.android.resumeapplication.ResurrectionChurnedAndZeroFundedFragment.Callbacks
    public void onFundAccountOnly() {
        requireActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DepositFundsDeepLink(null, null, null, false, null, 31, null), null, false, null, null, 60, null);
    }

    private final void onLaunchGoldAndRetirementUpsell() {
        requireActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String fundingUpsellVariant = ((Args) INSTANCE.getArgs((Fragment) this)).getFundingUpsellVariant();
        if (fundingUpsellVariant == null) {
            fundingUpsellVariant = OnboardingUpsellIntentKey.RESURRECTIONS_M2_UPSELL;
        }
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new OnboardingUpsellIntentKey(fundingUpsellVariant, null, false, false, null, 30, null), null, false, null, null, 60, null);
    }

    private final void onLaunchCryptoTab() {
        requireActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, TabLinkIntentKey.Crypto.INSTANCE, null, false, null, null, 60, null);
    }

    private final void onLaunchRetirementMatchPromo() {
        requireActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String fundingUpsellVariant = ((Args) INSTANCE.getArgs((Fragment) this)).getFundingUpsellVariant();
        if (fundingUpsellVariant == null) {
            fundingUpsellVariant = OnboardingUpsellIntentKey.RETIREMENT_MATCH_PROMO;
        }
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new OnboardingUpsellIntentKey(fundingUpsellVariant, null, false, false, null, 30, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.resumeapplication.ResurrectionChurnedAndZeroFundedFragment.Callbacks, com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment.Callbacks
    public boolean onDetermineResurrectionUpsell(ResumeApplicationChurnedAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof ResumeApplicationChurnedAction.FundAccountAction) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new DepositFundsDeepLink(null, null, null, true, null, 23, null), 1002, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return true;
        }
        if (action instanceof ResumeApplicationChurnedAction.FundAccountAndRetirementMatchAction) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new DepositFundsDeepLink(null, null, null, true, null, 23, null), 1003, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return true;
        }
        if (action instanceof ResumeApplicationChurnedAction.FundAccountAndCryptoTransferAction) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new DepositFundsDeepLink(null, null, null, true, null, 23, null), 1004, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return true;
        }
        if (action instanceof ResumeApplicationChurnedAction.GoldAndRetirementUpsell) {
            onLaunchGoldAndRetirementUpsell();
            return true;
        }
        if (!(action instanceof ResumeApplicationChurnedAction.CryptoTransferAction)) {
            return false;
        }
        onLaunchCryptoTab();
        return true;
    }

    private final Fragment onDetermineChurnedFundingFragment() {
        Companion companion = INSTANCE;
        StandardPageTemplate<GenericAction> detailsScreenContent = ((Args) companion.getArgs((Fragment) this)).getDetailsScreenContent();
        if (detailsScreenContent != null) {
            return ResumeApplicationStandardPageFragment.INSTANCE.newInstance((Parcelable) new ResumeApplicationStandardPageKey(detailsScreenContent));
        }
        ChurnedFundingV2Content churnedFundingV2Content = ((Args) companion.getArgs((Fragment) this)).getChurnedFundingV2Content();
        if (CollectionsKt.listOf((Object[]) new ResumeApplicationResponse8[]{ResumeApplicationResponse8.CHURNED_V2, ResumeApplicationResponse8.CRYPTO_TRANSFERS}).contains(((Args) companion.getArgs((Fragment) this)).getVariant()) && churnedFundingV2Content != null) {
            return ResurrectionInactiveAndLowAumFragment.INSTANCE.newInstance((Parcelable) new ResurrectionInactiveAndLowAumFragment.Args(((Args) companion.getArgs((Fragment) this)).getVariant(), ((Args) companion.getArgs((Fragment) this)).getTitle(), ((Args) companion.getArgs((Fragment) this)).getSubtitle(), churnedFundingV2Content, ((Args) companion.getArgs((Fragment) this)).getTakeoverLoggingInfo()));
        }
        return ResurrectionChurnedAndZeroFundedFragment.INSTANCE.newInstance((Parcelable) new ResurrectionChurnedAndZeroFundedFragment.Args(((Args) companion.getArgs((Fragment) this)).getVariant(), ((Args) companion.getArgs((Fragment) this)).getTitle(), ((Args) companion.getArgs((Fragment) this)).getSubtitle(), ((Args) companion.getArgs((Fragment) this)).getDisclosure(), ((Args) companion.getArgs((Fragment) this)).getFundingUpsellContent(), ((Args) companion.getArgs((Fragment) this)).getTakeoverLoggingInfo()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            switch (requestCode) {
                case 1002:
                    onLaunchGoldAndRetirementUpsell();
                    break;
                case 1003:
                    onLaunchRetirementMatchPromo();
                    break;
                case 1004:
                    onLaunchCryptoTab();
                    break;
                default:
                    requireActivity().finish();
                    break;
            }
            return;
        }
        requireActivity().finish();
    }

    /* compiled from: ResumeApplicationParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u000204R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationParentFragment$Args;", "Landroid/os/Parcelable;", "variant", "Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "showWelcomeBack", "", "firstName", "", "title", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "churnedFundingV2Content", "Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;", "fundingUpsellVariant", "takeoverLoggingInfo", "Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "fundingUpsellContent", "Lcom/robinhood/models/api/bonfire/FundingUpsellContent;", "welcomeBackBackgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "welcomeBackImageSource", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "detailsScreenContent", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;Lcom/robinhood/models/api/bonfire/FundingUpsellContent;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;)V", "getVariant", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "getShowWelcomeBack", "()Z", "getFirstName", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosure", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "getChurnedFundingV2Content", "()Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;", "getFundingUpsellVariant", "getTakeoverLoggingInfo", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "getFundingUpsellContent", "()Lcom/robinhood/models/api/bonfire/FundingUpsellContent;", "getWelcomeBackBackgroundColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "getWelcomeBackImageSource", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "getDetailsScreenContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ChurnedFundingV2Content churnedFundingV2Content;
        private final StandardPageTemplate<GenericAction> detailsScreenContent;
        private final RichText disclosure;
        private final String firstName;
        private final FundingUpsellContent fundingUpsellContent;
        private final String fundingUpsellVariant;
        private final boolean showWelcomeBack;
        private final String subtitle;
        private final ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo;
        private final String title;
        private final ResumeApplicationResponse8 variant;
        private final ThemedColor welcomeBackBackgroundColor;
        private final ThemedImageSource welcomeBackImageSource;

        /* compiled from: ResumeApplicationParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ResumeApplicationResponse8.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (RichText) parcel.readParcelable(Args.class.getClassLoader()), (ChurnedFundingV2Content) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), (ResumeApplicationTakeoverLoggingInfo) parcel.readParcelable(Args.class.getClassLoader()), (FundingUpsellContent) parcel.readParcelable(Args.class.getClassLoader()), (ThemedColor) parcel.readParcelable(Args.class.getClassLoader()), (ThemedImageSource) parcel.readParcelable(Args.class.getClassLoader()), (StandardPageTemplate) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.variant.name());
            dest.writeInt(this.showWelcomeBack ? 1 : 0);
            dest.writeString(this.firstName);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.disclosure, flags);
            dest.writeParcelable(this.churnedFundingV2Content, flags);
            dest.writeString(this.fundingUpsellVariant);
            dest.writeParcelable(this.takeoverLoggingInfo, flags);
            dest.writeParcelable(this.fundingUpsellContent, flags);
            dest.writeParcelable(this.welcomeBackBackgroundColor, flags);
            dest.writeParcelable(this.welcomeBackImageSource, flags);
            dest.writeParcelable(this.detailsScreenContent, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(ResumeApplicationResponse8 variant, boolean z, String str, String title, String subtitle, RichText richText, ChurnedFundingV2Content churnedFundingV2Content, String str2, ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo, FundingUpsellContent fundingUpsellContent, ThemedColor themedColor, ThemedImageSource themedImageSource, StandardPageTemplate<? extends GenericAction> standardPageTemplate) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(takeoverLoggingInfo, "takeoverLoggingInfo");
            this.variant = variant;
            this.showWelcomeBack = z;
            this.firstName = str;
            this.title = title;
            this.subtitle = subtitle;
            this.disclosure = richText;
            this.churnedFundingV2Content = churnedFundingV2Content;
            this.fundingUpsellVariant = str2;
            this.takeoverLoggingInfo = takeoverLoggingInfo;
            this.fundingUpsellContent = fundingUpsellContent;
            this.welcomeBackBackgroundColor = themedColor;
            this.welcomeBackImageSource = themedImageSource;
            this.detailsScreenContent = standardPageTemplate;
        }

        public /* synthetic */ Args(ResumeApplicationResponse8 resumeApplicationResponse8, boolean z, String str, String str2, String str3, RichText richText, ChurnedFundingV2Content churnedFundingV2Content, String str4, ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo, FundingUpsellContent fundingUpsellContent, ThemedColor themedColor, ThemedImageSource themedImageSource, StandardPageTemplate standardPageTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(resumeApplicationResponse8, z, str, str2, str3, (i & 32) != 0 ? null : richText, churnedFundingV2Content, str4, resumeApplicationTakeoverLoggingInfo, (i & 512) != 0 ? null : fundingUpsellContent, (i & 1024) != 0 ? null : themedColor, (i & 2048) != 0 ? null : themedImageSource, (i & 4096) != 0 ? null : standardPageTemplate);
        }

        public final ResumeApplicationResponse8 getVariant() {
            return this.variant;
        }

        public final boolean getShowWelcomeBack() {
            return this.showWelcomeBack;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final RichText getDisclosure() {
            return this.disclosure;
        }

        public final ChurnedFundingV2Content getChurnedFundingV2Content() {
            return this.churnedFundingV2Content;
        }

        public final String getFundingUpsellVariant() {
            return this.fundingUpsellVariant;
        }

        public final ResumeApplicationTakeoverLoggingInfo getTakeoverLoggingInfo() {
            return this.takeoverLoggingInfo;
        }

        public final FundingUpsellContent getFundingUpsellContent() {
            return this.fundingUpsellContent;
        }

        public final ThemedColor getWelcomeBackBackgroundColor() {
            return this.welcomeBackBackgroundColor;
        }

        public final ThemedImageSource getWelcomeBackImageSource() {
            return this.welcomeBackImageSource;
        }

        public final StandardPageTemplate<GenericAction> getDetailsScreenContent() {
            return this.detailsScreenContent;
        }
    }

    /* compiled from: ResumeApplicationParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationParentFragment;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationParentFragment$Args;", "<init>", "()V", "DEFAULT_NAME", "", "REQUEST_CODE_GOLD_AND_RETIREMENT_UPSELL_AFTER_FUNDING", "", "REQUEST_CODE_RETIREMENT_MATCH_PROMO_AFTER_FUNDING", "REQUEST_CODE_CRYPTO_TAB_UPSELL_AFTER_FUNDING", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ResumeApplicationParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ResumeApplicationParentFragment resumeApplicationParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, resumeApplicationParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ResumeApplicationParentFragment newInstance(Args args) {
            return (ResumeApplicationParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ResumeApplicationParentFragment resumeApplicationParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, resumeApplicationParentFragment, args);
        }
    }
}
