package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.futures.onboarding.p145ui.arbitration.FuturesOnboardingArbitrationAgreementFragment;
import com.robinhood.android.regiongate.FuturesTradingOrEventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesOnboardingArbitrationAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002%&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "popNearestParentBackStackOnBackPressed", "", "getPopNearestParentBackStackOnBackPressed", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-futures-onboarding_externalDebug", "state", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesOnboardingArbitrationAgreementFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FuturesOnboardingArbitrationAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(FuturesTradingOrEventContractsRegionGate.INSTANCE);
    private final boolean popNearestParentBackStackOnBackPressed = true;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof FuturesOnboardingArbitrationAgreementFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FuturesOnboardingArbitrationAgreementDuxo.class);
    private final Screen eventScreen = new Screen(Screen.Name.FUTURES_ONBOARDING_ARBITRATION_AGREEMENT, null, null, null, 14, null);

    /* compiled from: FuturesOnboardingArbitrationAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementFragment$Callbacks;", "", "onUserArbitrationDismissed", "", "accepted", "", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onUserArbitrationDismissed(boolean accepted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(FuturesOnboardingArbitrationAgreementFragment futuresOnboardingArbitrationAgreementFragment, int i, Composer composer, int i2) {
        futuresOnboardingArbitrationAgreementFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public boolean getPopNearestParentBackStackOnBackPressed() {
        return this.popNearestParentBackStackOnBackPressed;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FuturesOnboardingArbitrationAgreementDuxo getDuxo() {
        return (FuturesOnboardingArbitrationAgreementDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1051403195);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1051403195, i2, -1, "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment.ComposeContent (FuturesOnboardingArbitrationAgreementFragment.kt:41)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-897093286, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-897093286, i3, -1, "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment.ComposeContent.<anonymous> (FuturesOnboardingArbitrationAgreementFragment.kt:45)");
                    }
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, FuturesOnboardingArbitrationAgreementFragment2.INSTANCE.m14689getLambda$982864106$feature_futures_onboarding_externalDebug(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1071591125, true, new AnonymousClass1(FuturesOnboardingArbitrationAgreementFragment.this, coroutineScope, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 805306416, 509);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: FuturesOnboardingArbitrationAgreementFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ CoroutineScope $scope;
                    final /* synthetic */ SnapshotState4<FuturesOnboardingArbitrationAgreementDuxo5> $state$delegate;
                    final /* synthetic */ FuturesOnboardingArbitrationAgreementFragment this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(FuturesOnboardingArbitrationAgreementFragment futuresOnboardingArbitrationAgreementFragment, CoroutineScope coroutineScope, SnapshotState4<? extends FuturesOnboardingArbitrationAgreementDuxo5> snapshotState4) {
                        this.this$0 = futuresOnboardingArbitrationAgreementFragment;
                        this.$scope = coroutineScope;
                        this.$state$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i |= composer.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1071591125, i, -1, "com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment.ComposeContent.<anonymous>.<anonymous> (FuturesOnboardingArbitrationAgreementFragment.kt:62)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                        FuturesOnboardingArbitrationAgreementDuxo5 futuresOnboardingArbitrationAgreementDuxo5ComposeContent$lambda$0 = FuturesOnboardingArbitrationAgreementFragment.ComposeContent$lambda$0(this.$state$delegate);
                        FuturesOnboardingArbitrationAgreementDuxo duxo = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(duxo);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new FuturesOnboardingArbitrationAgreementFragment6(duxo);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue;
                        composer.endReplaceGroup();
                        BaseActivity baseActivityRequireBaseActivity = this.this$0.requireBaseActivity();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(baseActivityRequireBaseActivity);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new FuturesOnboardingArbitrationAgreementFragment7(baseActivityRequireBaseActivity);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        KFunction kFunction2 = (KFunction) objRememberedValue2;
                        composer.endReplaceGroup();
                        FuturesOnboardingArbitrationAgreementDuxo duxo2 = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(duxo2);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new FuturesOnboardingArbitrationAgreementFragment8(duxo2);
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        KFunction kFunction3 = (KFunction) objRememberedValue3;
                        composer.endReplaceGroup();
                        Function0 function0 = (Function0) kFunction;
                        Function0 function02 = (Function0) kFunction2;
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance4 = composer.changedInstance(this.$scope) | composer.changedInstance(this.this$0);
                        final CoroutineScope coroutineScope = this.$scope;
                        final FuturesOnboardingArbitrationAgreementFragment futuresOnboardingArbitrationAgreementFragment = this.this$0;
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return FuturesOnboardingArbitrationAgreementFragment.C173651.AnonymousClass1.invoke$lambda$4$lambda$3(coroutineScope, futuresOnboardingArbitrationAgreementFragment, (UiAgreementWithContent) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function1 = (Function1) objRememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer.changedInstance(this.this$0);
                        final FuturesOnboardingArbitrationAgreementFragment futuresOnboardingArbitrationAgreementFragment2 = this.this$0;
                        Object objRememberedValue5 = composer.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FuturesOnboardingArbitrationAgreementFragment.C173651.AnonymousClass1.invoke$lambda$6$lambda$5(futuresOnboardingArbitrationAgreementFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        composer.endReplaceGroup();
                        FuturesOnboardingArbitrationAgreementScreen3.FuturesOnboardingArbitrationAgreementScreen(futuresOnboardingArbitrationAgreementDuxo5ComposeContent$lambda$0, function0, function02, function1, (Function0) objRememberedValue5, (Function0) kFunction3, modifierPadding, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(CoroutineScope coroutineScope, FuturesOnboardingArbitrationAgreementFragment futuresOnboardingArbitrationAgreementFragment, UiAgreementWithContent agreement) {
                        Intrinsics.checkNotNullParameter(agreement, "agreement");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FuturesOnboardingArbitrationAgreementFragment9(futuresOnboardingArbitrationAgreementFragment, agreement, null), 3, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5(FuturesOnboardingArbitrationAgreementFragment futuresOnboardingArbitrationAgreementFragment) {
                        futuresOnboardingArbitrationAgreementFragment.getCallbacks().onUserArbitrationDismissed(false);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationAgreementFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesOnboardingArbitrationAgreementFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesOnboardingArbitrationAgreementDuxo5 ComposeContent$lambda$0(SnapshotState4<? extends FuturesOnboardingArbitrationAgreementDuxo5> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: FuturesOnboardingArbitrationAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationAgreementFragment;", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FuturesOnboardingArbitrationAgreementFragment newInstance() {
            return new FuturesOnboardingArbitrationAgreementFragment();
        }
    }
}
