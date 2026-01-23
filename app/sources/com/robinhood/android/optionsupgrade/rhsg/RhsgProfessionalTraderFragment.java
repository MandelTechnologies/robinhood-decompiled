package com.robinhood.android.optionsupgrade.rhsg;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens2;
import com.robinhood.android.optionsupgrade.OptionProfessionalTraderComposable3;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
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

/* compiled from: RhsgProfessionalTraderFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002)*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\r\u0010\u001f\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0007H\u0002J\t\u0010#\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/rhsg/RhsgProfessionalTraderFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "<set-?>", "loading", "getLoading", "setLoading", "(Z)V", "loading$delegate", "Landroidx/compose/runtime/MutableState;", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "goToNextScreen", "isProfessionalTrader", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RhsgProfessionalTraderFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhsgProfessionalTraderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: loading$delegate, reason: from kotlin metadata */
    private final SnapshotState loading = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment$special$$inlined$hostActivityCallbacks$1
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
    public static final Unit ComposeContent$lambda$0(RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment, int i, Composer composer, int i2) {
        rhsgProfessionalTraderFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* compiled from: RhsgProfessionalTraderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment$ComposeContent$1 */
    static final class C251871 implements Function2<Composer, Integer, Unit> {
        C251871() {
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
                ComposerKt.traceEventStart(-543238708, i, -1, "com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment.ComposeContent.<anonymous> (RhsgProfessionalTraderFragment.kt:46)");
            }
            Companion companion = RhsgProfessionalTraderFragment.INSTANCE;
            String title = ((Args) companion.getArgs((Fragment) RhsgProfessionalTraderFragment.this)).getTitle();
            String description = ((Args) companion.getArgs((Fragment) RhsgProfessionalTraderFragment.this)).getDescription();
            ImmutableList immutableList = extensions2.toImmutableList(((Args) companion.getArgs((Fragment) RhsgProfessionalTraderFragment.this)).getValueProps());
            String disclosureMarkdown = ((Args) companion.getArgs((Fragment) RhsgProfessionalTraderFragment.this)).getDisclosureMarkdown();
            boolean loading = RhsgProfessionalTraderFragment.this.getLoading();
            boolean loading2 = RhsgProfessionalTraderFragment.this.getLoading();
            int iM7922getLefte0LSkKk = TextAlign.INSTANCE.m7922getLefte0LSkKk();
            float fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(RhsgProfessionalTraderFragment.this);
            final RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment = RhsgProfessionalTraderFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhsgProfessionalTraderFragment.C251871.invoke$lambda$1$lambda$0(rhsgProfessionalTraderFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(RhsgProfessionalTraderFragment.this);
            final RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment2 = RhsgProfessionalTraderFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhsgProfessionalTraderFragment.C251871.invoke$lambda$3$lambda$2(rhsgProfessionalTraderFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            final RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment3 = RhsgProfessionalTraderFragment.this;
            OptionProfessionalTraderComposable3.m17458OptionProfessionalTraderComposablee3GALPE(title, description, immutableList, disclosureMarkdown, loading, loading2, function0, function02, null, iM7922getLefte0LSkKk, fM21590getDefaultD9Ej5fM, ComposableLambda3.rememberComposableLambda(245514448, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment.ComposeContent.1.3
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
                        ComposerKt.traceEventStart(245514448, i2, -1, "com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment.ComposeContent.<anonymous>.<anonymous> (RhsgProfessionalTraderFragment.kt:60)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(RhsgProfessionalTraderFragment2.INSTANCE.getLambda$295661501$feature_options_upgrade_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1672309521, true, new AnonymousClass1(rhsgProfessionalTraderFragment3), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: RhsgProfessionalTraderFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment$ComposeContent$1$3$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ RhsgProfessionalTraderFragment this$0;

                    AnonymousClass1(RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment) {
                        this.this$0 = rhsgProfessionalTraderFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment) {
                        rhsgProfessionalTraderFragment.requireActivity().onBackPressed();
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
                            ComposerKt.traceEventStart(1672309521, i, -1, "com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RhsgProfessionalTraderFragment.kt:64)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment$ComposeContent$1$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RhsgProfessionalTraderFragment.C251871.AnonymousClass3.AnonymousClass1.invoke$lambda$1$lambda$0(rhsgProfessionalTraderFragment);
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
            }, composer, 54), true, composer, 0, 432, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment) {
            rhsgProfessionalTraderFragment.goToNextScreen(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment) {
            rhsgProfessionalTraderFragment.goToNextScreen(true);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1500345655);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1500345655, i2, -1, "com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment.ComposeContent (RhsgProfessionalTraderFragment.kt:44)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-543238708, true, new C251871(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.rhsg.RhsgProfessionalTraderFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhsgProfessionalTraderFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToNextScreen(boolean isProfessionalTrader) {
        OptionOnboardingScreens2 callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.RhsgProfessionalTrader(isProfessionalTrader, ((Args) companion.getArgs((Fragment) this)).getScreenArgs().getScreenId()), ((Args) companion.getArgs((Fragment) this)).getScreenArgs());
    }

    /* compiled from: RhsgProfessionalTraderFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/rhsg/RhsgProfessionalTraderFragment$Args;", "Landroid/os/Parcelable;", "title", "", "description", "valueProps", "", "disclosureMarkdown", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgProfessionalTrader;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgProfessionalTrader;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getValueProps", "()Ljava/util/List;", "getDisclosureMarkdown", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs$RhsgProfessionalTrader;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String description;
        private final String disclosureMarkdown;
        private final ScreenArgs.RhsgProfessionalTrader screenArgs;
        private final String title;
        private final List<String> valueProps;

        /* compiled from: RhsgProfessionalTraderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), ScreenArgs.RhsgProfessionalTrader.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, List list, String str3, ScreenArgs.RhsgProfessionalTrader rhsgProfessionalTrader, int i, Object obj) {
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
                rhsgProfessionalTrader = args.screenArgs;
            }
            ScreenArgs.RhsgProfessionalTrader rhsgProfessionalTrader2 = rhsgProfessionalTrader;
            List list2 = list;
            return args.copy(str, str2, list2, str3, rhsgProfessionalTrader2);
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
        public final ScreenArgs.RhsgProfessionalTrader getScreenArgs() {
            return this.screenArgs;
        }

        public final Args copy(String title, String description, List<String> valueProps, String disclosureMarkdown, ScreenArgs.RhsgProfessionalTrader screenArgs) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
            return new Args(title, description, valueProps, disclosureMarkdown, screenArgs);
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
            return Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.description, args.description) && Intrinsics.areEqual(this.valueProps, args.valueProps) && Intrinsics.areEqual(this.disclosureMarkdown, args.disclosureMarkdown) && Intrinsics.areEqual(this.screenArgs, args.screenArgs);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.valueProps.hashCode()) * 31) + this.disclosureMarkdown.hashCode()) * 31) + this.screenArgs.hashCode();
        }

        public String toString() {
            return "Args(title=" + this.title + ", description=" + this.description + ", valueProps=" + this.valueProps + ", disclosureMarkdown=" + this.disclosureMarkdown + ", screenArgs=" + this.screenArgs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeStringList(this.valueProps);
            dest.writeString(this.disclosureMarkdown);
            this.screenArgs.writeToParcel(dest, flags);
        }

        public Args(String title, String description, List<String> valueProps, String disclosureMarkdown, ScreenArgs.RhsgProfessionalTrader screenArgs) {
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

        public final ScreenArgs.RhsgProfessionalTrader getScreenArgs() {
            return this.screenArgs;
        }
    }

    /* compiled from: RhsgProfessionalTraderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/rhsg/RhsgProfessionalTraderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/rhsg/RhsgProfessionalTraderFragment;", "Lcom/robinhood/android/optionsupgrade/rhsg/RhsgProfessionalTraderFragment$Args;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhsgProfessionalTraderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhsgProfessionalTraderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhsgProfessionalTraderFragment newInstance(Args args) {
            return (RhsgProfessionalTraderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhsgProfessionalTraderFragment rhsgProfessionalTraderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhsgProfessionalTraderFragment, args);
        }
    }
}
