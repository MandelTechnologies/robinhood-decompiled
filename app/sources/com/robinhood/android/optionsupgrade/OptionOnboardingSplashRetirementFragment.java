package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.AccountDisplayNameStore;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionOnboardingSplashRetirementFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020+H\u0016J\b\u00100\u001a\u00020+H\u0016J\u0010\u00101\u001a\u00020+2\u0006\u00102\u001a\u000203H\u0016J\r\u00104\u001a\u00020+H\u0017¢\u0006\u0002\u00105J\u001b\u00106\u001a\u00020+*\u0002072\b\u00108\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0002\u00109J\r\u0010:\u001a\u00020+H\u0003¢\u0006\u0002\u00105J \u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0002J\t\u0010A\u001a\u00020\u0017H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R#\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020D0CX\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0004\u0018\u00010%X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashRetirementFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "accountDisplayNameStore", "Lcom/robinhood/android/account/AccountDisplayNameStore;", "getAccountDisplayNameStore", "()Lcom/robinhood/android/account/AccountDisplayNameStore;", "setAccountDisplayNameStore", "(Lcom/robinhood/android/account/AccountDisplayNameStore;)V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "<set-?>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashRetirementViewState;", "viewState", "getViewState", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashRetirementViewState;", "setViewState", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashRetirementViewState;)V", "viewState$delegate", "Landroidx/compose/runtime/MutableState;", "accountDisplayNameFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/robinhood/android/account/strings/DisplayName;", "getAccountDisplayNameFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "accountDisplayNameFlow$delegate", "Lkotlin/Lazy;", "setLoading", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "onStart", "onStop", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "UpsellContent", "Landroidx/compose/foundation/layout/ColumnScope;", "accountDisplayName", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/robinhood/android/account/strings/DisplayName;Landroidx/compose/runtime/Composer;I)V", "Disclosure", "getAttributeForLink", "Lcom/robinhood/models/serverdriven/db/RichText$Attribute;", "fullText", "", "linkText", "link", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-upgrade_externalDebug", "dividerOpacity", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingSplashRetirementFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    public AccountDisplayNameStore accountDisplayNameStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingSplashRetirementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$special$$inlined$hostActivityCallbacks$1
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
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: viewState$delegate, reason: from kotlin metadata */
    private final SnapshotState viewState = SnapshotState3.mutableStateOf$default(new OptionOnboardingSplashRetirementViewState(false), null, 2, null);

    /* renamed from: accountDisplayNameFlow$delegate, reason: from kotlin metadata */
    private final Lazy accountDisplayNameFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OptionOnboardingSplashRetirementFragment.accountDisplayNameFlow_delegate$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment, int i, Composer composer, int i2) {
        optionOnboardingSplashRetirementFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$9(OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment, int i, Composer composer, int i2) {
        optionOnboardingSplashRetirementFragment.Disclosure(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpsellContent$lambda$6(OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment, Column5 column5, DisplayName displayName, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingSplashRetirementFragment.UpsellContent(column5, displayName, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
        return (ScreenArgs) INSTANCE.getArgs((Fragment) this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final OptionOnboardingSplashRetirementViewState getViewState() {
        return (OptionOnboardingSplashRetirementViewState) this.viewState.getValue();
    }

    private final void setViewState(OptionOnboardingSplashRetirementViewState optionOnboardingSplashRetirementViewState) {
        this.viewState.setValue(optionOnboardingSplashRetirementViewState);
    }

    private final StateFlow<DisplayName> getAccountDisplayNameFlow() {
        return (StateFlow) this.accountDisplayNameFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow accountDisplayNameFlow_delegate$lambda$0(OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment) {
        return optionOnboardingSplashRetirementFragment.getAccountDisplayNameStore().displayNameStateFlow(((ScreenArgs.SplashRetirement) INSTANCE.getArgs((Fragment) optionOnboardingSplashRetirementFragment)).getAccountNumber(), optionOnboardingSplashRetirementFragment.getLifecycleScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ComposeContent$lambda$3(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayName ComposeContent$lambda$4(SnapshotState4<DisplayName> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        setViewState(getViewState().copy(isLoading));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OptionOnboardingStyles2.setupStatusBarStyle(this, OptionOnboardingStyles.RETIREMENT);
    }

    /* compiled from: OptionOnboardingSplashRetirementFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$ComposeContent$1 */
    static final class C250381 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<DisplayName> $accountDisplayName$delegate;
        final /* synthetic */ SnapshotState4<Float> $dividerOpacity$delegate;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ OptionOnboardingSplashRetirementFragment this$0;

        C250381(ScrollState scrollState, OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment, SnapshotState4<DisplayName> snapshotState4, SnapshotState4<Float> snapshotState42) {
            this.$scrollState = scrollState;
            this.this$0 = optionOnboardingSplashRetirementFragment;
            this.$accountDisplayName$delegate = snapshotState4;
            this.$dividerOpacity$delegate = snapshotState42;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-329771627, i, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment.ComposeContent.<anonymous> (OptionOnboardingSplashRetirementFragment.kt:119)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).getJade(), null, 2, null);
            ScrollState scrollState = this.$scrollState;
            final OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment = this.this$0;
            SnapshotState4<DisplayName> snapshotState4 = this.$accountDisplayName$delegate;
            SnapshotState4<Float> snapshotState42 = this.$dividerOpacity$delegate;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Column5.weight$default(column6, ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), scrollState, false, null, false, 14, null), 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ContentScale inside = ContentScale.INSTANCE.getInside();
            WindowInsets.Companion companion4 = WindowInsets.INSTANCE;
            WindowInsets safeContent = WindowInsets_androidKt.getSafeContent(companion4, composer, 6);
            WindowInsetsSides.Companion companion5 = WindowInsetsSides.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(C25121R.drawable.options_header_dark, composer, 0), (String) null, column6.align(PaddingKt.m5143paddingVpY3zN4(SizeKt.m5156height3ABfNKs(WindowInsetsPadding6.windowInsetsPadding(companion, WindowInsetsKt.m5186onlybOOhFvg(safeContent, companion5.m5200getTopJoeWqyM())), C2002Dp.m7995constructorimpl(200)), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM()), companion2.getCenterHorizontally()), (Alignment) null, inside, 0.0f, (ColorFilter) null, composer, 24624, 104);
            optionOnboardingSplashRetirementFragment.UpsellContent(column6, OptionOnboardingSplashRetirementFragment.ComposeContent$lambda$4(snapshotState4), composer, 6 | (DisplayName.$stable << 3));
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM()), composer, 0);
            optionOnboardingSplashRetirementFragment.Disclosure(composer, 0);
            composer.endNode();
            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(companion, WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(companion4, composer, 6), companion5.m5198getBottomJoeWqyM()));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(Alpha.alpha(boxScopeInstance.align(companion, companion2.getTopCenter()), OptionOnboardingSplashRetirementFragment.ComposeContent$lambda$3(snapshotState42)), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), 0.0f, composer, 0, 4);
            String strStringResource = StringResources_androidKt.stringResource(C25121R.string.option_upgrade_retirement_splash_check_eligibility, composer, 0);
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            boolean zIsLoading = optionOnboardingSplashRetirementFragment.getViewState().isLoading();
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(optionOnboardingSplashRetirementFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingSplashRetirementFragment.C250381.invoke$lambda$4$lambda$3$lambda$2$lambda$1(optionOnboardingSplashRetirementFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5142padding3ABfNKs, null, type2, false, zIsLoading, null, null, null, null, false, null, composer, 24576, 0, 8104);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment) {
            OptionOnboardingScreens2 callbacks = optionOnboardingSplashRetirementFragment.getCallbacks();
            Companion companion = OptionOnboardingSplashRetirementFragment.INSTANCE;
            callbacks.goToNextScreen(new ScreenRequest.SplashRetirement(((ScreenArgs.SplashRetirement) companion.getArgs((Fragment) optionOnboardingSplashRetirementFragment)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) optionOnboardingSplashRetirementFragment));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        OptionOnboardingStyles2.removeStatusBarStyle(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2092539427);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2092539427, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment.ComposeContent (OptionOnboardingSplashRetirementFragment.kt:103)");
            }
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(OptionOnboardingSplashRetirementFragment.ComposeContent$lambda$2$lambda$1(scrollStateRememberScrollState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-329771627, true, new C250381(scrollStateRememberScrollState, this, FlowExtKt.collectAsStateWithLifecycle(getAccountDisplayNameFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7), (SnapshotState4) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingSplashRetirementFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ComposeContent$lambda$2$lambda$1(ScrollState scrollState) {
        return (scrollState.getValue() == scrollState.getMaxValue() || scrollState.getMaxValue() == Integer.MAX_VALUE) ? 0.0f : 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpsellContent(final Column5 column5, final DisplayName displayName, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1915331293);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? composerStartRestartGroup.changed(displayName) : composerStartRestartGroup.changedInstance(displayName) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1915331293, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment.UpsellContent (OptionOnboardingSplashRetirementFragment.kt:175)");
            }
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String splashRetirementTitle = OptionOnboardingSplashRetirementFragment2.getSplashRetirementTitle(resources, displayName);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            long xrayLight = bentoTheme.getColors(composerStartRestartGroup, i3).getXrayLight();
            int iM7924getStarte0LSkKk = TextAlign.INSTANCE.m7924getStarte0LSkKk();
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(splashRetirementTitle, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.wrapContentWidth$default(companion, Alignment.INSTANCE.getStart(), false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(xrayLight), null, null, null, TextAlign.m7912boximpl(iM7924getStarte0LSkKk), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8120);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierM17425drawRetirementColorMask4WTKRHQ = OptionOnboardingStyles2.m17425drawRetirementColorMask4WTKRHQ(companion, bentoTheme.getColors(composerStartRestartGroup, i3).getXrayLight());
            String strStringResource = StringResources_androidKt.stringResource(C25121R.string.option_upgrade_retirement_splash_heavy_upsell_title_1, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C25121R.string.option_upgrade_retirement_splash_heavy_upsell_body_1, composerStartRestartGroup, 0);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
            BentoValuePropRow2.Icon icon = new BentoValuePropRow2.Icon(serverToBentoAssetMapper2, null, 2, null);
            BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
            int i4 = BentoValuePropRow2.Icon.$stable;
            BentoValuePropRow3.BentoValuePropRow(strStringResource, strStringResource2, icon, bentoValuePropRow, modifierM17425drawRetirementColorMask4WTKRHQ, composerStartRestartGroup, (i4 << 6) | 3072, 0);
            BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C25121R.string.option_upgrade_retirement_splash_heavy_upsell_title_2, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C25121R.string.option_upgrade_retirement_splash_heavy_upsell_body_2, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(serverToBentoAssetMapper2, null, 2, null), bentoValuePropRow, OptionOnboardingStyles2.m17425drawRetirementColorMask4WTKRHQ(companion, bentoTheme.getColors(composerStartRestartGroup, i3).getXrayLight()), composerStartRestartGroup, (i4 << 6) | 3072, 0);
            BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C25121R.string.option_upgrade_retirement_splash_heavy_upsell_title_3, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C25121R.string.gated_etf_option_upgrade_retirement_splash_heavy_upsell_body_3, composerStartRestartGroup, 0), new BentoValuePropRow2.Icon(serverToBentoAssetMapper2, null, 2, null), bentoValuePropRow, OptionOnboardingStyles2.m17425drawRetirementColorMask4WTKRHQ(companion, bentoTheme.getColors(composerStartRestartGroup, i3).getXrayLight()), composerStartRestartGroup, (i4 << 6) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingSplashRetirementFragment.UpsellContent$lambda$6(this.f$0, column5, displayName, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Disclosure(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-689534281);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-689534281, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment.Disclosure (OptionOnboardingSplashRetirementFragment.kt:210)");
            }
            String string2 = getString(C25121R.string.option_upgrade_retirement_splash_disclosure_fee_link_text);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = getString(C25121R.string.option_upgrade_retirement_splash_disclosure_document_link_text);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getString(C25121R.string.option_upgrade_retirement_splash_disclosure, string2, string3);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            String string5 = getString(C25121R.string.option_upgrade_retirement_splash_disclosure_fee_link);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            RichText.Attribute attributeForLink = getAttributeForLink(string4, string2, string5);
            String string6 = getString(C25121R.string.option_upgrade_retirement_splash_disclosure_document_link);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            RichText richText = new RichText(string4, CollectionsKt.listOf((Object[]) new RichText.Attribute[]{attributeForLink, getAttributeForLink(string4, string3, string6)}));
            long xrayLight = bentoTheme.getColors(composerStartRestartGroup, i3).getXrayLight();
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS();
            long xrayLight2 = bentoTheme.getColors(composerStartRestartGroup, i3).getXrayLight();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOnboardingSplashRetirementFragment.Disclosure$lambda$8$lambda$7(this.f$0, (Uri) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoRichText.m15948BentoRichText0sCZWFg(richText, modifierM5143paddingVpY3zN4, textS, xrayLight, xrayLight2, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composerStartRestartGroup, 0, 480);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingSplashRetirementFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingSplashRetirementFragment.Disclosure$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclosure$lambda$8$lambda$7(OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator navigator = optionOnboardingSplashRetirementFragment.getNavigator();
        Context contextRequireContext = optionOnboardingSplashRetirementFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new PdfRendererIntentKey(string2, ""), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    private final RichText.Attribute getAttributeForLink(String fullText, String linkText, String link) {
        return new RichText.Attribute(StringsKt.indexOf$default((CharSequence) fullText, linkText, 0, false, 6, (Object) null), linkText.length(), Uri.parse(link), RichText.TextStyle.UNDERLINE, null);
    }

    /* compiled from: OptionOnboardingSplashRetirementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashRetirementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingSplashRetirementFragment;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$SplashRetirement;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingSplashRetirementFragment, ScreenArgs.SplashRetirement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenArgs.SplashRetirement getArgs(OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment) {
            return (ScreenArgs.SplashRetirement) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingSplashRetirementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingSplashRetirementFragment newInstance(ScreenArgs.SplashRetirement splashRetirement) {
            return (OptionOnboardingSplashRetirementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, splashRetirement);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingSplashRetirementFragment optionOnboardingSplashRetirementFragment, ScreenArgs.SplashRetirement splashRetirement) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingSplashRetirementFragment, splashRetirement);
        }
    }
}
