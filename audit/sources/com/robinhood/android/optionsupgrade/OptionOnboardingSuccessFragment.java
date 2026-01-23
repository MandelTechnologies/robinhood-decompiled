package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.StateFlow;
import options_product.service.SuccessResponseMetadataDto;

/* compiled from: OptionOnboardingSuccessFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002ABB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\"\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\r\u00106\u001a\u00020&H\u0017¢\u0006\u0002\u00107J\b\u00108\u001a\u00020&H\u0002J\b\u00109\u001a\u00020&H\u0002J\b\u0010:\u001a\u00020&H\u0002J\t\u0010;\u001a\u00020\u001eH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010*\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0016\u00100\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0014\u00102\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010-R\u0016\u00104\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010-R\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C²\u0006\f\u0010D\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuccessFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "getAccountDisplayNameStore", "()Lcom/robinhood/android/account/AccountDisplayNameStore;", "setAccountDisplayNameStore", "(Lcom/robinhood/android/account/AccountDisplayNameStore;)V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "accountDisplayNameStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/account/strings/DisplayName;", "getAccountDisplayNameStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "accountDisplayNameStateFlow$delegate", "Lkotlin/Lazy;", "<set-?>", "", "loading", "getLoading", "()Z", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "primaryButtonText", "", "getPrimaryButtonText", "()Ljava/lang/String;", "secondaryButtonText", "getSecondaryButtonText", "disclosureText", "getDisclosureText", "inlineLinkText", "getInlineLinkText", "inlineLinkTextUrl", "getInlineLinkTextUrl", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "onInlineLinkTextOnClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug", "accountDisplayName"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingSuccessFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    public AccountDisplayNameStore accountDisplayNameStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingSuccessFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionOnboardingScreens2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: accountDisplayNameStateFlow$delegate, reason: from kotlin metadata */
    private final Lazy accountDisplayNameStateFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OptionOnboardingSuccessFragment.accountDisplayNameStateFlow_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: loading$delegate, reason: from kotlin metadata */
    private final SnapshotState loading = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* compiled from: OptionOnboardingSuccessFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuccessResponseMetadataDto.UpgradeFlowDto.values().length];
            try {
                iArr[SuccessResponseMetadataDto.UpgradeFlowDto.L0_TO_L2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuccessResponseMetadataDto.UpgradeFlowDto.L0_TO_L3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuccessResponseMetadataDto.UpgradeFlowDto.L2_TO_L3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuccessResponseMetadataDto.UpgradeFlowDto.UPGRADE_FLOW_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(OptionOnboardingSuccessFragment optionOnboardingSuccessFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingSuccessFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return OptionOnboardingScreens.DefaultImpls.getEventScreen(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventData(this);
    }

    public final AccountDisplayNameStore getAccountDisplayNameStore() {
        AccountDisplayNameStore accountDisplayNameStore = this.accountDisplayNameStore;
        if (accountDisplayNameStore != null) {
            return accountDisplayNameStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountDisplayNameStore");
        return null;
    }

    public final void setAccountDisplayNameStore(AccountDisplayNameStore accountDisplayNameStore) {
        Intrinsics.checkNotNullParameter(accountDisplayNameStore, "<set-?>");
        this.accountDisplayNameStore = accountDisplayNameStore;
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs();
    }

    private final StateFlow<DisplayName> getAccountDisplayNameStateFlow() {
        return (StateFlow) this.accountDisplayNameStateFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow accountDisplayNameStateFlow_delegate$lambda$0(OptionOnboardingSuccessFragment optionOnboardingSuccessFragment) {
        return optionOnboardingSuccessFragment.getAccountDisplayNameStore().displayNameStateFlow(((Args) INSTANCE.getArgs((Fragment) optionOnboardingSuccessFragment)).getScreenArgs().getAccountNumber(), optionOnboardingSuccessFragment.getLifecycleScope());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getLoading() {
        return ((Boolean) this.loading.getValue()).booleanValue();
    }

    private final void setLoading(boolean z) {
        this.loading.setValue(Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        setLoading(isLoading);
    }

    private final String getPrimaryButtonText() {
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs().getUpgradeFlow().ordinal()];
        if (i == 1 || i == 2) {
            String string2 = getString(C11048R.string.general_label_continue);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Upgrade flow unspecified");
        }
        String string3 = getString(C11048R.string.general_label_done);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    private final String getSecondaryButtonText() {
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getScreenArgs().getUpgradeFlow().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return getString(C11048R.string.general_action_learn_more_capitalized);
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Upgrade flow unspecified");
            }
            if (((Args) companion.getArgs((Fragment) this)).getLocality().isRhsg()) {
                return getString(C11048R.string.general_action_learn_more_capitalized);
            }
        }
        return null;
    }

    private final String getDisclosureText() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getLocality().isRhsg()) {
            return null;
        }
        return getString(C25121R.string.option_upgrade_disclosure);
    }

    private final String getInlineLinkText() {
        String string2 = getString(C11048R.string.general_action_learn_more);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getInlineLinkTextUrl() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getLocality().isRhsg()) {
            return null;
        }
        return getString(C25121R.string.option_upgrade_disclosure_link);
    }

    private static final DisplayName ComposeContent$lambda$1(SnapshotState4<DisplayName> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        SplashPageData splashPageData;
        Composer composerStartRestartGroup = composer.startRestartGroup(2064786143);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2064786143, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragment.ComposeContent (OptionOnboardingSuccessFragment.kt:88)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getAccountDisplayNameStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Companion companion = INSTANCE;
            int i3 = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getScreenArgs().getUpgradeFlow().ordinal()];
            if (i3 == 1) {
                LottieUrl lottieUrl = LottieUrl.FIREWORKS;
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String splashSuccessTitleText = OptionOnboardingSuccessFragment2.getSplashSuccessTitleText(resources, ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getAccountTypeInCopy(), true);
                String string2 = getString(C25121R.string.options_upgrade_success_summary_level_2);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                splashPageData = new SplashPageData(lottieUrl, splashSuccessTitleText, string2);
            } else {
                if (i3 != 2 && i3 != 3) {
                    if (i3 == 4) {
                        throw new IllegalStateException("Upgrade flow unspecified");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                LottieUrl lottieUrl2 = LottieUrl.FIREWORKS;
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                String splashSuccessTitleText2 = OptionOnboardingSuccessFragment2.getSplashSuccessTitleText(resources2, ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle), ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getAccountTypeInCopy(), false);
                String string3 = getString(C25121R.string.options_upgrade_success_summary_level_3);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                splashPageData = new SplashPageData(lottieUrl2, splashSuccessTitleText2, string3);
            }
            SplashPageData splashPageData2 = splashPageData;
            String disclosureText = getDisclosureText();
            String inlineLinkText = getInlineLinkText();
            String primaryButtonText = getPrimaryButtonText();
            boolean loading = getLoading();
            String secondaryButtonText = getSecondaryButtonText();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingSuccessFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingSuccessFragment.ComposeContent$lambda$5$lambda$4(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingSuccessFragment.ComposeContent$lambda$7$lambda$6(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionOnboardingSuccessComposable.OptionOnboardingSuccessComposable(splashPageData2, primaryButtonText, null, loading, disclosureText, inlineLinkText, function0, function02, (Function0) objRememberedValue3, secondaryButtonText, composerStartRestartGroup, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSuccessFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingSuccessFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(OptionOnboardingSuccessFragment optionOnboardingSuccessFragment) {
        optionOnboardingSuccessFragment.onInlineLinkTextOnClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(OptionOnboardingSuccessFragment optionOnboardingSuccessFragment) {
        optionOnboardingSuccessFragment.onPrimaryButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(OptionOnboardingSuccessFragment optionOnboardingSuccessFragment) {
        optionOnboardingSuccessFragment.onSecondaryButtonClicked();
        return Unit.INSTANCE;
    }

    private final void onPrimaryButtonClicked() {
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getScreenArgs().getUpgradeFlow().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            getCallbacks().goToNextScreen(new ScreenRequest.Success(((Args) companion.getArgs((Fragment) this)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) this)).getScreenArgs());
        } else {
            if (i == 4) {
                throw new IllegalStateException("Upgrade flow unspecified");
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void onSecondaryButtonClicked() {
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getScreenArgs().getUpgradeFlow().ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (((Args) companion.getArgs((Fragment) this)).getLocality().isRhsg()) {
                    String string2 = getString(C25121R.string.options_upgrade_success_learn_url);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Navigator navigator = getNavigator();
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    throw new IllegalStateException("Upgrade flow unspecified");
                }
                throw new NoWhenBranchMatchedException();
            }
            String string3 = getString(C25121R.string.options_upgrade_success_learn_url);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            Navigator navigator2 = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator2, contextRequireContext2, string3);
        }
    }

    private final void onInlineLinkTextOnClicked() {
        String inlineLinkTextUrl = getInlineLinkTextUrl();
        if (inlineLinkTextUrl != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, inlineLinkTextUrl);
        }
    }

    /* compiled from: OptionOnboardingSuccessFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuccessFragment$Args;", "Landroid/os/Parcelable;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Success;", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/android/optionsupgrade/ScreenArgs$Success;)V", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$Success;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CountryCode.Supported locality;
        private final ScreenArgs.Success screenArgs;

        /* compiled from: OptionOnboardingSuccessFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((CountryCode.Supported) parcel.readSerializable(), ScreenArgs.Success.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CountryCode.Supported supported, ScreenArgs.Success success, int i, Object obj) {
            if ((i & 1) != 0) {
                supported = args.locality;
            }
            if ((i & 2) != 0) {
                success = args.screenArgs;
            }
            return args.copy(supported, success);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        /* renamed from: component2, reason: from getter */
        public final ScreenArgs.Success getScreenArgs() {
            return this.screenArgs;
        }

        public final Args copy(CountryCode.Supported locality, ScreenArgs.Success screenArgs) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            return new Args(locality, screenArgs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.locality, args.locality) && Intrinsics.areEqual(this.screenArgs, args.screenArgs);
        }

        public int hashCode() {
            return (this.locality.hashCode() * 31) + this.screenArgs.hashCode();
        }

        public String toString() {
            return "Args(locality=" + this.locality + ", screenArgs=" + this.screenArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.locality);
            this.screenArgs.writeToParcel(dest, flags);
        }

        public Args(CountryCode.Supported locality, ScreenArgs.Success screenArgs) {
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            this.locality = locality;
            this.screenArgs = screenArgs;
        }

        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        public final ScreenArgs.Success getScreenArgs() {
            return this.screenArgs;
        }
    }

    /* compiled from: OptionOnboardingSuccessFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuccessFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuccessFragment;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSuccessFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingSuccessFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOnboardingSuccessFragment optionOnboardingSuccessFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingSuccessFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingSuccessFragment newInstance(Args args) {
            return (OptionOnboardingSuccessFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingSuccessFragment optionOnboardingSuccessFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingSuccessFragment, args);
        }
    }
}
