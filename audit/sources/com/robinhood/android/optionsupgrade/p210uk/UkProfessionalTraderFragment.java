package com.robinhood.android.optionsupgrade.p210uk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens2;
import com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposable3;
import com.robinhood.android.optionsupgrade.ProfessionalTraderCtaLoadingState;
import com.robinhood.android.optionsupgrade.ProgressBarData;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.p210uk.UkProfessionalTraderFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UkProfessionalTraderFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002,-B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\r\u0010\"\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0007H\u0002J\t\u0010&\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0018\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkProfessionalTraderFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "<set-?>", "Lcom/robinhood/android/optionsupgrade/ProfessionalTraderCtaLoadingState;", "loadingState", "getLoadingState", "()Lcom/robinhood/android/optionsupgrade/ProfessionalTraderCtaLoadingState;", "setLoadingState", "(Lcom/robinhood/android/optionsupgrade/ProfessionalTraderCtaLoadingState;)V", "loadingState$delegate", "Landroidx/compose/runtime/MutableState;", "setLoading", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "goToNextScreen", "isProfessionalTrader", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class UkProfessionalTraderFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UkProfessionalTraderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: loadingState$delegate, reason: from kotlin metadata */
    private final SnapshotState loadingState = SnapshotState3.mutableStateOf$default(new ProfessionalTraderCtaLoadingState(false, false), null, 2, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment$special$$inlined$hostActivityCallbacks$1
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
    public static final Unit ComposeContent$lambda$0(UkProfessionalTraderFragment ukProfessionalTraderFragment, int i, Composer composer, int i2) {
        ukProfessionalTraderFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final ProfessionalTraderCtaLoadingState getLoadingState() {
        return (ProfessionalTraderCtaLoadingState) this.loadingState.getValue();
    }

    private final void setLoadingState(ProfessionalTraderCtaLoadingState professionalTraderCtaLoadingState) {
        this.loadingState.setValue(professionalTraderCtaLoadingState);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        ScreenRequest.UkProfessionalTrader ukProfessionalTrader = (ScreenRequest.UkProfessionalTrader) currentScreenRequest;
        ProfessionalTraderCtaLoadingState loadingState = getLoadingState();
        boolean z = false;
        boolean z2 = isLoading && !ukProfessionalTrader.isProfessionalTrader();
        if (isLoading && ukProfessionalTrader.isProfessionalTrader()) {
            z = true;
        }
        setLoadingState(loadingState.copy(z2, z));
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getScreenArgs();
    }

    /* compiled from: UkProfessionalTraderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment$ComposeContent$1 */
    static final class C252221 implements Function2<Composer, Integer, Unit> {
        C252221() {
        }

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
                ComposerKt.traceEventStart(1129076328, i, -1, "com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment.ComposeContent.<anonymous> (UkProfessionalTraderFragment.kt:60)");
            }
            Companion companion = UkProfessionalTraderFragment.INSTANCE;
            String title = ((Args) companion.getArgs((Fragment) UkProfessionalTraderFragment.this)).getTitle();
            String description = ((Args) companion.getArgs((Fragment) UkProfessionalTraderFragment.this)).getDescription();
            ImmutableList immutableList = extensions2.toImmutableList(((Args) companion.getArgs((Fragment) UkProfessionalTraderFragment.this)).getValueProps());
            String disclosureMarkdown = ((Args) companion.getArgs((Fragment) UkProfessionalTraderFragment.this)).getDisclosureMarkdown();
            boolean zIsNotProfessionalTraderButtonLoading = UkProfessionalTraderFragment.this.getLoadingState().isNotProfessionalTraderButtonLoading();
            boolean zIsProfessionalTraderButtonLoading = UkProfessionalTraderFragment.this.getLoadingState().isProfessionalTraderButtonLoading();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UkProfessionalTraderFragment.this);
            final UkProfessionalTraderFragment ukProfessionalTraderFragment = UkProfessionalTraderFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkProfessionalTraderFragment.C252221.invoke$lambda$1$lambda$0(ukProfessionalTraderFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(UkProfessionalTraderFragment.this);
            final UkProfessionalTraderFragment ukProfessionalTraderFragment2 = UkProfessionalTraderFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkProfessionalTraderFragment.C252221.invoke$lambda$3$lambda$2(ukProfessionalTraderFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            final UkProfessionalTraderFragment ukProfessionalTraderFragment3 = UkProfessionalTraderFragment.this;
            OptionProfessionalTraderComposable3.m17458OptionProfessionalTraderComposablee3GALPE(title, description, immutableList, disclosureMarkdown, zIsNotProfessionalTraderButtonLoading, zIsProfessionalTraderButtonLoading, function0, function02, null, 0, 0.0f, ComposableLambda3.rememberComposableLambda(669865068, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment.ComposeContent.1.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(669865068, i2, -1, "com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment.ComposeContent.<anonymous>.<anonymous> (UkProfessionalTraderFragment.kt:74)");
                    }
                    Function2<Composer, Integer, Unit> lambda$1082095897$feature_options_upgrade_externalDebug = UkProfessionalTraderFragment2.INSTANCE.getLambda$1082095897$feature_options_upgrade_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-969833619, true, new AnonymousClass1(ukProfessionalTraderFragment3), composer2, 54);
                    final ProgressBarData progressBarData = ((Args) UkProfessionalTraderFragment.INSTANCE.getArgs((Fragment) ukProfessionalTraderFragment3)).getProgressBarData();
                    composer2.startReplaceGroup(-504746970);
                    ComposableLambda composableLambdaRememberComposableLambda2 = progressBarData == null ? null : ComposableLambda3.rememberComposableLambda(491544775, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment$ComposeContent$1$3$2$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope let, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(let, "$this$let");
                            if ((i3 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(491544775, i3, -1, "com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UkProfessionalTraderFragment.kt:83)");
                            }
                            BentoProgressBar2.m20699BentoProgressBarnBX6wN0(progressBarData.getCurrentSegment(), progressBarData.getSegmentProgress(), progressBarData.getNumberOfSegments(), null, 0L, 0L, false, composer3, 0, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    composer2.endReplaceGroup();
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1082095897$feature_options_upgrade_externalDebug, null, composableLambdaRememberComposableLambda, null, composableLambdaRememberComposableLambda2, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer2, 12583302, 0, 1898);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: UkProfessionalTraderFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment$ComposeContent$1$3$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ UkProfessionalTraderFragment this$0;

                    AnonymousClass1(UkProfessionalTraderFragment ukProfessionalTraderFragment) {
                        this.this$0 = ukProfessionalTraderFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(UkProfessionalTraderFragment ukProfessionalTraderFragment) {
                        ukProfessionalTraderFragment.requireActivity().onBackPressed();
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
                            ComposerKt.traceEventStart(-969833619, i, -1, "com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (UkProfessionalTraderFragment.kt:78)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final UkProfessionalTraderFragment ukProfessionalTraderFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment$ComposeContent$1$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UkProfessionalTraderFragment.C252221.AnonymousClass3.AnonymousClass1.invoke$lambda$1$lambda$0(ukProfessionalTraderFragment);
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
            }, composer, 54), false, composer, 0, 48, 5888);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UkProfessionalTraderFragment ukProfessionalTraderFragment) {
            ukProfessionalTraderFragment.goToNextScreen(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(UkProfessionalTraderFragment ukProfessionalTraderFragment) {
            ukProfessionalTraderFragment.goToNextScreen(true);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-424304109);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-424304109, i2, -1, "com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment.ComposeContent (UkProfessionalTraderFragment.kt:58)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1129076328, true, new C252221(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.uk.UkProfessionalTraderFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkProfessionalTraderFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToNextScreen(boolean isProfessionalTrader) {
        OptionOnboardingScreens2 callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.UkProfessionalTrader(isProfessionalTrader, ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) this)).getScreenArgs());
    }

    /* compiled from: UkProfessionalTraderFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkProfessionalTraderFragment$Args;", "Landroid/os/Parcelable;", "title", "", "description", "valueProps", "", "disclosureMarkdown", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkProfessionalTrader;", "progressBarData", "Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkProfessionalTrader;Lcom/robinhood/android/optionsupgrade/ProgressBarData;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getValueProps", "()Ljava/util/List;", "getDisclosureMarkdown", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$UkProfessionalTrader;", "getProgressBarData", "()Lcom/robinhood/android/optionsupgrade/ProgressBarData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String description;
        private final String disclosureMarkdown;
        private final ProgressBarData progressBarData;
        private final ScreenArgs.UkProfessionalTrader screenArgs;
        private final String title;
        private final List<String> valueProps;

        /* compiled from: UkProfessionalTraderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), ScreenArgs.UkProfessionalTrader.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProgressBarData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, List list, String str3, ScreenArgs.UkProfessionalTrader ukProfessionalTrader, ProgressBarData progressBarData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.title;
            }
            if ((i & 2) != 0) {
                str2 = args.description;
            }
            if ((i & 4) != 0) {
                list = args.valueProps;
            }
            if ((i & 8) != 0) {
                str3 = args.disclosureMarkdown;
            }
            if ((i & 16) != 0) {
                ukProfessionalTrader = args.screenArgs;
            }
            if ((i & 32) != 0) {
                progressBarData = args.progressBarData;
            }
            ScreenArgs.UkProfessionalTrader ukProfessionalTrader2 = ukProfessionalTrader;
            ProgressBarData progressBarData2 = progressBarData;
            return args.copy(str, str2, list, str3, ukProfessionalTrader2, progressBarData2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final List<String> component3() {
            return this.valueProps;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component5, reason: from getter */
        public final ScreenArgs.UkProfessionalTrader getScreenArgs() {
            return this.screenArgs;
        }

        /* renamed from: component6, reason: from getter */
        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }

        public final Args copy(String title, String description, List<String> valueProps, String disclosureMarkdown, ScreenArgs.UkProfessionalTrader screenArgs, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            return new Args(title, description, valueProps, disclosureMarkdown, screenArgs, progressBarData);
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
            return Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.description, args.description) && Intrinsics.areEqual(this.valueProps, args.valueProps) && Intrinsics.areEqual(this.disclosureMarkdown, args.disclosureMarkdown) && Intrinsics.areEqual(this.screenArgs, args.screenArgs) && Intrinsics.areEqual(this.progressBarData, args.progressBarData);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.valueProps.hashCode()) * 31) + this.disclosureMarkdown.hashCode()) * 31) + this.screenArgs.hashCode()) * 31;
            ProgressBarData progressBarData = this.progressBarData;
            return iHashCode + (progressBarData == null ? 0 : progressBarData.hashCode());
        }

        public String toString() {
            return "Args(title=" + this.title + ", description=" + this.description + ", valueProps=" + this.valueProps + ", disclosureMarkdown=" + this.disclosureMarkdown + ", screenArgs=" + this.screenArgs + ", progressBarData=" + this.progressBarData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeStringList(this.valueProps);
            dest.writeString(this.disclosureMarkdown);
            this.screenArgs.writeToParcel(dest, flags);
            ProgressBarData progressBarData = this.progressBarData;
            if (progressBarData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                progressBarData.writeToParcel(dest, flags);
            }
        }

        public Args(String title, String description, List<String> valueProps, String disclosureMarkdown, ScreenArgs.UkProfessionalTrader screenArgs, ProgressBarData progressBarData) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            this.title = title;
            this.description = description;
            this.valueProps = valueProps;
            this.disclosureMarkdown = disclosureMarkdown;
            this.screenArgs = screenArgs;
            this.progressBarData = progressBarData;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final List<String> getValueProps() {
            return this.valueProps;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final ScreenArgs.UkProfessionalTrader getScreenArgs() {
            return this.screenArgs;
        }

        public final ProgressBarData getProgressBarData() {
            return this.progressBarData;
        }
    }

    /* compiled from: UkProfessionalTraderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/uk/UkProfessionalTraderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/uk/UkProfessionalTraderFragment;", "Lcom/robinhood/android/optionsupgrade/uk/UkProfessionalTraderFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<UkProfessionalTraderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(UkProfessionalTraderFragment ukProfessionalTraderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, ukProfessionalTraderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UkProfessionalTraderFragment newInstance(Args args) {
            return (UkProfessionalTraderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UkProfessionalTraderFragment ukProfessionalTraderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, ukProfessionalTraderFragment, args);
        }
    }
}
