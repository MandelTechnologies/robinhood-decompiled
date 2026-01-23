package com.robinhood.android.equitytradeladder.marketing;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equitytradeladder.marketing.EquityTradingLadderMarketingFragment3;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityTradingLadderMarketingFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/marketing/EquityTradingLaderMarketingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradingLadderMarketingFragment3 extends GenericComposeFragment {
    public RegionGateProvider regionGateProvider;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment3, int i, Composer composer, int i2) {
        equityTradingLadderMarketingFragment3.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final RegionGateProvider getRegionGateProvider() {
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        if (regionGateProvider != null) {
            return regionGateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionGateProvider");
        return null;
    }

    public final void setRegionGateProvider(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<set-?>");
        this.regionGateProvider = regionGateProvider;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1755572572);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1755572572, i2, -1, "com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment.ComposeContent (EquityTradingLadderMarketingFragment.kt:38)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.LADDER_MARKETING, ((EquityTradeLadderMarketingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, 12, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(548075399, true, new C159331(AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), (CoroutineScope) objRememberedValue, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityTradingLadderMarketingFragment3.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EquityTradingLadderMarketingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment$ComposeContent$1 */
    static final class C159331 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ EquityTradingLadderMarketingFragment3 this$0;

        C159331(EventLogger eventLogger, CoroutineScope coroutineScope, EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment3) {
            this.$eventLogger = eventLogger;
            this.$scope = coroutineScope;
            this.this$0 = equityTradingLadderMarketingFragment3;
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
                ComposerKt.traceEventStart(548075399, i, -1, "com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment.ComposeContent.<anonymous> (EquityTradingLadderMarketingFragment.kt:49)");
            }
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, userInteractionEventDescriptor, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(this.$scope) | composer.changedInstance(this.this$0);
            final EventLogger eventLogger = this.$eventLogger;
            final CoroutineScope coroutineScope = this.$scope;
            final EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment3 = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradingLadderMarketingFragment3.C159331.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, coroutineScope, equityTradingLadderMarketingFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
            final EventLogger eventLogger2 = this.$eventLogger;
            final EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment32 = this.this$0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EquityTradingLadderMarketingFragment3.C159331.invoke$lambda$3$lambda$2(userInteractionEventDescriptor, eventLogger2, equityTradingLadderMarketingFragment32);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EquityTradingLadderMarketingScreen3.EquityTradingLadderMarketingScreen(function0, (Function0) objRememberedValue2, modifierAutoLogEvents$default, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, CoroutineScope coroutineScope, EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment3) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "LADDER_MARKETING_EXPLORE", null, 4, null), null, null, false, 57, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new EquityTradingLadderMarketingFragment4(equityTradingLadderMarketingFragment3, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment3) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "LADDER_MARKETING_EXPLORE", null, 4, null), null, null, false, 56, null);
            equityTradingLadderMarketingFragment3.requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EquityTradingLadderMarketingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/marketing/EquityTradingLaderMarketingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equitytradeladder/marketing/EquityTradingLaderMarketingFragment;", "Lcom/robinhood/android/equitytradeladder/marketing/EquityTradeLadderMarketingFragmentKey;", "<init>", "()V", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitytradeladder.marketing.EquityTradingLaderMarketingFragment$Companion, reason: from kotlin metadata */
    public static final class Companion implements FragmentResolverWithArgsCompanion<EquityTradingLadderMarketingFragment3, EquityTradeLadderMarketingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EquityTradeLadderMarketingFragmentKey equityTradeLadderMarketingFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, equityTradeLadderMarketingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EquityTradeLadderMarketingFragmentKey getArgs(EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment3) {
            return (EquityTradeLadderMarketingFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, equityTradingLadderMarketingFragment3);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EquityTradingLadderMarketingFragment3 newInstance(EquityTradeLadderMarketingFragmentKey equityTradeLadderMarketingFragmentKey) {
            return (EquityTradingLadderMarketingFragment3) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, equityTradeLadderMarketingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EquityTradingLadderMarketingFragment3 equityTradingLadderMarketingFragment3, EquityTradeLadderMarketingFragmentKey equityTradeLadderMarketingFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, equityTradingLadderMarketingFragment3, equityTradeLadderMarketingFragmentKey);
        }
    }
}
