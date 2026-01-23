package com.robinhood.android.optionschain.chainsettings;

import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode;
import com.robinhood.android.options.contracts.OptionChainCustomizationLaunchMode2;
import com.robinhood.android.options.contracts.OptionChainSettingsFragmentKey;
import com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDefaultPricingBottomSheetFragment;
import com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment;
import com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLogging;
import com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLogging2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainSettingsFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\r\u0010\u0019\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001aR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo;", "getDuxo", "()Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-options-chain_externalDebug", "viewState", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainSettingsFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private static final String DEFAULT_PRICING_BOTTOM_SHEET = "DefaultPricingBottomSheet";
    private static final String SBS_BID_ASK_PRICE_LABEL_BOTTOM_SHEET = "SbsBidAskPriceLabelBottomSheet";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionChainSettingsDuxo.class);
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(OptionChainSettingsFragment optionChainSettingsFragment, int i, Composer composer, int i2) {
        optionChainSettingsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionChainSettingsDuxo getDuxo() {
        return (OptionChainSettingsDuxo) this.duxo.getValue();
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null);
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-1196471934);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1196471934, i2, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment.ComposeContent (OptionChainSettingsFragment.kt:43)");
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(1608480070, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1608480070, i3, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment.ComposeContent.<anonymous> (OptionChainSettingsFragment.kt:47)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(OptionChainSettingsFragment2.INSTANCE.getLambda$1661033843$feature_options_chain_externalDebug(), null, ComposableLambda3.rememberComposableLambda(196994503, true, new AnonymousClass1(OptionChainSettingsFragment.this), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: OptionChainSettingsFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ OptionChainSettingsFragment this$0;

                    AnonymousClass1(OptionChainSettingsFragment optionChainSettingsFragment) {
                        this.this$0 = optionChainSettingsFragment;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
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
                            ComposerKt.traceEventStart(196994503, i, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment.ComposeContent.<anonymous>.<anonymous> (OptionChainSettingsFragment.kt:55)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final OptionChainSettingsFragment optionChainSettingsFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OptionChainSettingsFragment.C242851.AnonymousClass1.invoke$lambda$1$lambda$0(optionChainSettingsFragment);
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

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OptionChainSettingsFragment optionChainSettingsFragment) {
                        optionChainSettingsFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-322283695, true, new C242862(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OptionChainSettingsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2 */
    static final class C242862 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<OptionChainSettingsViewState> $viewState$delegate;

        /* compiled from: OptionChainSettingsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionChainSettingsViewState2.values().length];
                try {
                    iArr[OptionChainSettingsViewState2.DEFAULT_PRICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionChainSettingsViewState2.BID_ASK_PRICE_LABEL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C242862(SnapshotState4<OptionChainSettingsViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-322283695, i2, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment.ComposeContent.<anonymous> (OptionChainSettingsFragment.kt:62)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            OptionChainSettingsViewState optionChainSettingsViewStateComposeContent$lambda$0 = OptionChainSettingsFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(OptionChainSettingsFragment.this) | composer.changed(this.$viewState$delegate);
            final OptionChainSettingsFragment optionChainSettingsFragment = OptionChainSettingsFragment.this;
            final SnapshotState4<OptionChainSettingsViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$1$lambda$0(optionChainSettingsFragment, snapshotState4, (OptionChainSettingsViewState2) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment2 = OptionChainSettingsFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$3$lambda$2(optionChainSettingsFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment3 = OptionChainSettingsFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$5$lambda$4(optionChainSettingsFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment4 = OptionChainSettingsFragment.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$7$lambda$6(optionChainSettingsFragment4, (OrderSide) obj, (OptionChainCustomizationLaunchMode2) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function2 function2 = (Function2) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment5 = OptionChainSettingsFragment.this;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$9$lambda$8(optionChainSettingsFragment5, (OrderSide) obj, (OptionChainSettingsLogging2) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function2 function22 = (Function2) objRememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment6 = OptionChainSettingsFragment.this;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$11$lambda$10(optionChainSettingsFragment6, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function1 function12 = (Function1) objRememberedValue6;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment7 = OptionChainSettingsFragment.this;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$13$lambda$12(optionChainSettingsFragment7, (OptionSideBySideChainMetric) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            Function2 function23 = (Function2) objRememberedValue7;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment8 = OptionChainSettingsFragment.this;
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$15$lambda$14(optionChainSettingsFragment8, (OptionChainSettingsPnlChartType) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            Function1 function13 = (Function1) objRememberedValue8;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance9 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment9 = OptionChainSettingsFragment.this;
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$17$lambda$16(optionChainSettingsFragment9);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            Function0 function03 = (Function0) objRememberedValue9;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance10 = composer.changedInstance(OptionChainSettingsFragment.this);
            final OptionChainSettingsFragment optionChainSettingsFragment10 = OptionChainSettingsFragment.this;
            Object objRememberedValue10 = composer.rememberedValue();
            if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue10 = new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsFragment$ComposeContent$2$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionChainSettingsFragment.C242862.invoke$lambda$19$lambda$18(optionChainSettingsFragment10, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue10);
            }
            composer.endReplaceGroup();
            OptionChainSettingsComposableKt.OptionChainSettings(optionChainSettingsViewStateComposeContent$lambda$0, function1, function0, function02, function2, function22, function12, function23, function13, function03, modifierPadding, (Function2) objRememberedValue10, composer, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(OptionChainSettingsFragment optionChainSettingsFragment, SnapshotState4 snapshotState4, OptionChainSettingsViewState2 type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
            if (i == 1) {
                OptionChainSettingsLogging.logTapDefaultPriceSettings(optionChainSettingsFragment.getEventLogger());
                OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment = (OptionChainSettingsDefaultPricingBottomSheetFragment) OptionChainSettingsDefaultPricingBottomSheetFragment.INSTANCE.newInstance((Parcelable) new OptionChainSettingsDefaultPricingBottomSheetFragment.Args(((OptionChainSettingsFragmentKey) OptionChainSettingsFragment.INSTANCE.getArgs((Fragment) optionChainSettingsFragment)).getAccountNumber(), OptionChainSettingsFragment.ComposeContent$lambda$0(snapshotState4).getDefaultPricingSettingServerValue()));
                FragmentManager childFragmentManager = optionChainSettingsFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                optionChainSettingsDefaultPricingBottomSheetFragment.show(childFragmentManager, OptionChainSettingsFragment.DEFAULT_PRICING_BOTTOM_SHEET);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment = (OptionChainSettingsBidAskPriceLabelBottomSheetFragment) OptionChainSettingsBidAskPriceLabelBottomSheetFragment.INSTANCE.newInstance();
                FragmentManager childFragmentManager2 = optionChainSettingsFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                optionChainSettingsBidAskPriceLabelBottomSheetFragment.show(childFragmentManager2, OptionChainSettingsFragment.SBS_BID_ASK_PRICE_LABEL_BOTTOM_SHEET);
                optionChainSettingsFragment.getDuxo().setSbsBidAskPriceLabelNuxShown();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(OptionChainSettingsFragment optionChainSettingsFragment, OrderSide orderSide, OptionChainCustomizationLaunchMode2 initialHighlightedMetric) {
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(initialHighlightedMetric, "initialHighlightedMetric");
            Navigator navigator = optionChainSettingsFragment.getNavigator();
            android.content.Context contextRequireContext = optionChainSettingsFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new OptionChainCustomizationLaunchMode.MainChain(orderSide, initialHighlightedMetric), false, false, false, false, null, false, null, null, 1012, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(OptionChainSettingsFragment optionChainSettingsFragment, OrderSide orderSide, OptionChainSettingsLogging2 tapType) {
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(tapType, "tapType");
            OptionChainSettingsLogging.logTapCustomizeChain(optionChainSettingsFragment.getEventLogger(), orderSide, tapType);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(OptionChainSettingsFragment optionChainSettingsFragment, boolean z) {
            optionChainSettingsFragment.getDuxo().toggleSideBySideChain(z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(OptionChainSettingsFragment optionChainSettingsFragment, OptionSideBySideChainMetric metric, boolean z) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            optionChainSettingsFragment.getDuxo().toggleTableMetric(metric, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$14(OptionChainSettingsFragment optionChainSettingsFragment, OptionChainSettingsPnlChartType chartType) {
            Intrinsics.checkNotNullParameter(chartType, "chartType");
            optionChainSettingsFragment.getDuxo().updatePnlChartType(chartType);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$19$lambda$18(OptionChainSettingsFragment optionChainSettingsFragment, int i, int i2) {
            optionChainSettingsFragment.getDuxo().reorderEnabledTableMetrics(i, i2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(OptionChainSettingsFragment optionChainSettingsFragment) {
            optionChainSettingsFragment.getDuxo().dismissSettingsSwitchToSbsTooltip();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(OptionChainSettingsFragment optionChainSettingsFragment) {
            optionChainSettingsFragment.getDuxo().setSettingsSwitchToSbsTooltipSeen();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$17$lambda$16(OptionChainSettingsFragment optionChainSettingsFragment) {
            optionChainSettingsFragment.getDuxo().setBidAskPriceLabelSettingShown();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainSettingsViewState ComposeContent$lambda$0(SnapshotState4<OptionChainSettingsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: OptionChainSettingsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsFragment;", "Lcom/robinhood/android/options/contracts/OptionChainSettingsFragmentKey;", "<init>", "()V", "DEFAULT_PRICING_BOTTOM_SHEET", "", "SBS_BID_ASK_PRICE_LABEL_BOTTOM_SHEET", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionChainSettingsFragment, OptionChainSettingsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionChainSettingsFragmentKey optionChainSettingsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionChainSettingsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionChainSettingsFragmentKey getArgs(OptionChainSettingsFragment optionChainSettingsFragment) {
            return (OptionChainSettingsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionChainSettingsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionChainSettingsFragment newInstance(OptionChainSettingsFragmentKey optionChainSettingsFragmentKey) {
            return (OptionChainSettingsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionChainSettingsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionChainSettingsFragment optionChainSettingsFragment, OptionChainSettingsFragmentKey optionChainSettingsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionChainSettingsFragment, optionChainSettingsFragmentKey);
        }
    }
}
