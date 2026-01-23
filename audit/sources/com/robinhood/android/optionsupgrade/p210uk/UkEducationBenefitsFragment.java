package com.robinhood.android.optionsupgrade.p210uk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens2;
import com.robinhood.android.optionsupgrade.ProgressBarData;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.p210uk.UkEducationBenefitsFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: UkEducationBenefitsFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002'(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\r\u0010\u001f\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)²\u0006\n\u0010*\u001a\u00020\u0007X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkEducationBenefitsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "<set-?>", "loading", "getLoading", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug", "scrollReachedBottom"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class UkEducationBenefitsFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UkEducationBenefitsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: loading$delegate, reason: from kotlin metadata */
    private final SnapshotState loading = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment$special$$inlined$hostActivityCallbacks$1
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(UkEducationBenefitsFragment ukEducationBenefitsFragment, int i, Composer composer, int i2) {
        ukEducationBenefitsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getLoading() {
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

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-93523951);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-93523951, i2, -1, "com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent (UkEducationBenefitsFragment.kt:67)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(UkEducationBenefitsFragment.ComposeContent$lambda$1$lambda$0(scrollStateRememberScrollState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(207533478, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(207533478, i3, -1, "com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.<anonymous> (UkEducationBenefitsFragment.kt:73)");
                    }
                    Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE);
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final UkEducationBenefitsFragment ukEducationBenefitsFragment = UkEducationBenefitsFragment.this;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(662903138, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(662903138, i4, -1, "com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.<anonymous>.<anonymous> (UkEducationBenefitsFragment.kt:77)");
                            }
                            Function2<Composer, Integer, Unit> lambda$1838327189$feature_options_upgrade_externalDebug = UkEducationBenefitsFragment2.INSTANCE.getLambda$1838327189$feature_options_upgrade_externalDebug();
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1104296641, true, new C504351(ukEducationBenefitsFragment), composer3, 54);
                            final ProgressBarData progressBarData = ((Args) UkEducationBenefitsFragment.INSTANCE.getArgs((Fragment) ukEducationBenefitsFragment)).getProgressBarData();
                            composer3.startReplaceGroup(1394772892);
                            ComposableLambda composableLambdaRememberComposableLambda3 = progressBarData == null ? null : ComposableLambda3.rememberComposableLambda(-1104003289, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment$ComposeContent$1$1$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                    invoke(boxScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope let, Composer composer4, int i5) {
                                    Intrinsics.checkNotNullParameter(let, "$this$let");
                                    if ((i5 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1104003289, i5, -1, "com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UkEducationBenefitsFragment.kt:86)");
                                    }
                                    BentoProgressBar2.m20699BentoProgressBarnBX6wN0(progressBarData.getCurrentSegment(), progressBarData.getSegmentProgress(), progressBarData.getNumberOfSegments(), null, 0L, 0L, false, composer4, 0, 120);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            composer3.endReplaceGroup();
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1838327189$feature_options_upgrade_externalDebug, null, composableLambdaRememberComposableLambda2, null, composableLambdaRememberComposableLambda3, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1898);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: UkEducationBenefitsFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment$ComposeContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C504351 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ UkEducationBenefitsFragment this$0;

                            C504351(UkEducationBenefitsFragment ukEducationBenefitsFragment) {
                                this.this$0 = ukEducationBenefitsFragment;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(UkEducationBenefitsFragment ukEducationBenefitsFragment) {
                                ukEducationBenefitsFragment.requireActivity().onBackPressed();
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1104296641, i, -1, "com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (UkEducationBenefitsFragment.kt:81)");
                                }
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final UkEducationBenefitsFragment ukEducationBenefitsFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return UkEducationBenefitsFragment.C251971.AnonymousClass1.C504351.invoke$lambda$1$lambda$0(ukEducationBenefitsFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }, composer2, 54);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-374107263, true, new AnonymousClass2(UkEducationBenefitsFragment.this, coroutineScope, scrollStateRememberScrollState, snapshotState4), composer2, 54);
                    final ScrollState scrollState = scrollStateRememberScrollState;
                    final UkEducationBenefitsFragment ukEducationBenefitsFragment2 = UkEducationBenefitsFragment.this;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(1878322167, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.1.3
                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            int i5;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i5 = i4 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i5 = i4;
                            }
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1878322167, i5, -1, "com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.<anonymous>.<anonymous> (UkEducationBenefitsFragment.kt:137)");
                            }
                            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), scrollState, false, null, false, 14, null), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, composer3, 0, 2);
                            UkEducationBenefitsFragment ukEducationBenefitsFragment3 = ukEducationBenefitsFragment2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21622defaultHorizontalPaddingWMci_g0);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-options-uk-intro", null, 2, null);
                            String str = "{\"page_id\": \"" + ((Args) UkEducationBenefitsFragment.INSTANCE.getArgs((Fragment) ukEducationBenefitsFragment3)).getScreenArgs().getMicrogramPageId() + "\"}";
                            FragmentManager childFragmentManager = ukEducationBenefitsFragment3.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, childFragmentManager, null, str, null, null, null, false, null, composer3, 0, 500);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 805306800, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: UkEducationBenefitsFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment$ComposeContent$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CoroutineScope $scope;
                    final /* synthetic */ SnapshotState4<Boolean> $scrollReachedBottom$delegate;
                    final /* synthetic */ ScrollState $scrollState;
                    final /* synthetic */ UkEducationBenefitsFragment this$0;

                    AnonymousClass2(UkEducationBenefitsFragment ukEducationBenefitsFragment, CoroutineScope coroutineScope, ScrollState scrollState, SnapshotState4<Boolean> snapshotState4) {
                        this.this$0 = ukEducationBenefitsFragment;
                        this.$scope = coroutineScope;
                        this.$scrollState = scrollState;
                        this.$scrollReachedBottom$delegate = snapshotState4;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-374107263, i, -1, "com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment.ComposeContent.<anonymous>.<anonymous> (UkEducationBenefitsFragment.kt:97)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, composer, 6, 2);
                        final UkEducationBenefitsFragment ukEducationBenefitsFragment = this.this$0;
                        final CoroutineScope coroutineScope = this.$scope;
                        final ScrollState scrollState = this.$scrollState;
                        final SnapshotState4<Boolean> snapshotState4 = this.$scrollReachedBottom$delegate;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21622defaultHorizontalPaddingWMci_g0);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoMarkdownText2.BentoMarkdownText(((Args) UkEducationBenefitsFragment.INSTANCE.getArgs((Fragment) ukEducationBenefitsFragment)).getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 28), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
                        String strStringResource = StringResources_androidKt.stringResource(UkEducationBenefitsFragment.ComposeContent$lambda$2(snapshotState4) ? C11048R.string.general_label_continue : C11048R.string.general_action_review, composer, 0);
                        boolean loading = ukEducationBenefitsFragment.getLoading();
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(ukEducationBenefitsFragment) | composer.changedInstance(coroutineScope) | composer.changed(scrollState);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UkEducationBenefitsFragment.C251971.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(ukEducationBenefitsFragment, coroutineScope, snapshotState4, scrollState);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, null, false, loading, null, null, null, null, false, null, composer, 0, 0, 8120);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(UkEducationBenefitsFragment ukEducationBenefitsFragment, CoroutineScope coroutineScope, SnapshotState4 snapshotState4, ScrollState scrollState) {
                        if (!UkEducationBenefitsFragment.ComposeContent$lambda$2(snapshotState4)) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UkEducationBenefitsFragment5(scrollState, null), 3, null);
                        } else {
                            OptionOnboardingScreens2 callbacks = ukEducationBenefitsFragment.getCallbacks();
                            Companion companion = UkEducationBenefitsFragment.INSTANCE;
                            callbacks.goToNextScreen(new ScreenRequest.UkEducationBenefits(((Args) companion.getArgs((Fragment) ukEducationBenefitsFragment)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) ukEducationBenefitsFragment)).getScreenArgs());
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.uk.UkEducationBenefitsFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkEducationBenefitsFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$1$lambda$0(ScrollState scrollState) {
        return !scrollState.getCanScrollForward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* compiled from: UkEducationBenefitsFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkEducationBenefitsFragment$Args;", "Landroid/os/Parcelable;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationBenefits;", "disclosureMarkdown", "", "progressBarData", "Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "<init>", "(Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationBenefits;Ljava/lang/String;Lcom/robinhood/android/optionsupgrade/ProgressBarData;)V", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkEducationBenefits;", "getDisclosureMarkdown", "()Ljava/lang/String;", "getProgressBarData", "()Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String disclosureMarkdown;
        private final ProgressBarData progressBarData;
        private final ScreenArgs.UkEducationBenefits screenArgs;

        /* compiled from: UkEducationBenefitsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ScreenArgs.UkEducationBenefits.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ProgressBarData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ScreenArgs.UkEducationBenefits ukEducationBenefits, String str, ProgressBarData progressBarData, int i, Object obj) {
            if ((i & 1) != 0) {
                ukEducationBenefits = args.screenArgs;
            }
            if ((i & 2) != 0) {
                str = args.disclosureMarkdown;
            }
            if ((i & 4) != 0) {
                progressBarData = args.progressBarData;
            }
            return args.copy(ukEducationBenefits, str, progressBarData);
        }

        /* renamed from: component1, reason: from getter */
        public final ScreenArgs.UkEducationBenefits getScreenArgs() {
            return this.screenArgs;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component3, reason: from getter */
        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        public final Args copy(ScreenArgs.UkEducationBenefits screenArgs, String disclosureMarkdown, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            return new Args(screenArgs, disclosureMarkdown, progressBarData);
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
            return Intrinsics.areEqual(this.screenArgs, args.screenArgs) && Intrinsics.areEqual(this.disclosureMarkdown, args.disclosureMarkdown) && Intrinsics.areEqual(this.progressBarData, args.progressBarData);
        }

        public int hashCode() {
            int iHashCode = ((this.screenArgs.hashCode() * 31) + this.disclosureMarkdown.hashCode()) * 31;
            ProgressBarData progressBarData = this.progressBarData;
            return iHashCode + (progressBarData == null ? 0 : progressBarData.hashCode());
        }

        public String toString() {
            return "Args(screenArgs=" + this.screenArgs + ", disclosureMarkdown=" + this.disclosureMarkdown + ", progressBarData=" + this.progressBarData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.screenArgs.writeToParcel(dest, flags);
            dest.writeString(this.disclosureMarkdown);
            ProgressBarData progressBarData = this.progressBarData;
            if (progressBarData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressBarData.writeToParcel(dest, flags);
            }
        }

        public Args(ScreenArgs.UkEducationBenefits screenArgs, String disclosureMarkdown, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            this.screenArgs = screenArgs;
            this.disclosureMarkdown = disclosureMarkdown;
            this.progressBarData = progressBarData;
        }

        public final ScreenArgs.UkEducationBenefits getScreenArgs() {
            return this.screenArgs;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }
    }

    /* compiled from: UkEducationBenefitsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkEducationBenefitsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/uk/UkEducationBenefitsFragment;", "Lcom/robinhood/android/optionsupgrade/uk/UkEducationBenefitsFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UkEducationBenefitsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(UkEducationBenefitsFragment ukEducationBenefitsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, ukEducationBenefitsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UkEducationBenefitsFragment newInstance(Args args) {
            return (UkEducationBenefitsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UkEducationBenefitsFragment ukEducationBenefitsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, ukEducationBenefitsFragment, args);
        }
    }
}
