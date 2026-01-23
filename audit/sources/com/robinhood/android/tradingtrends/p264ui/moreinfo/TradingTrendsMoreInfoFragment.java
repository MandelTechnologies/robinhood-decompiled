package com.robinhood.android.tradingtrends.p264ui.moreinfo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.equities.contracts.tradingtrends.TradingTrendsMoreInfoContract;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.tradingtrends.microgram.TradingTrendsCachedService;
import com.robinhood.android.tradingtrends.p264ui.moreinfo.TradingTrendsMoreInfoFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradingTrendsMoreInfoFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\r\u0010\u0017\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0018R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/moreinfo/TradingTrendsMoreInfoFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "tradingTrendsService", "Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "getTradingTrendsService", "()Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;", "setTradingTrendsService", "(Lcom/robinhood/android/tradingtrends/microgram/TradingTrendsCachedService;)V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TradingTrendsMoreInfoFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public TradingTrendsCachedService tradingTrendsService;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(TradingTrendsMoreInfoFragment tradingTrendsMoreInfoFragment, int i, Composer composer, int i2) {
        tradingTrendsMoreInfoFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* compiled from: TradingTrendsMoreInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/moreinfo/TradingTrendsMoreInfoFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/tradingtrends/ui/moreinfo/TradingTrendsMoreInfoFragment;", "Lcom/robinhood/android/equities/contracts/tradingtrends/TradingTrendsMoreInfoContract$Key;", "<init>", "()V", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TradingTrendsMoreInfoFragment, TradingTrendsMoreInfoContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(TradingTrendsMoreInfoContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TradingTrendsMoreInfoContract.Key getArgs(TradingTrendsMoreInfoFragment tradingTrendsMoreInfoFragment) {
            return (TradingTrendsMoreInfoContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, tradingTrendsMoreInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TradingTrendsMoreInfoFragment newInstance(TradingTrendsMoreInfoContract.Key key) {
            return (TradingTrendsMoreInfoFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TradingTrendsMoreInfoFragment tradingTrendsMoreInfoFragment, TradingTrendsMoreInfoContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, tradingTrendsMoreInfoFragment, key);
        }
    }

    public final TradingTrendsCachedService getTradingTrendsService() {
        TradingTrendsCachedService tradingTrendsCachedService = this.tradingTrendsService;
        if (tradingTrendsCachedService != null) {
            return tradingTrendsCachedService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tradingTrendsService");
        return null;
    }

    public final void setTradingTrendsService(TradingTrendsCachedService tradingTrendsCachedService) {
        Intrinsics.checkNotNullParameter(tradingTrendsCachedService, "<set-?>");
        this.tradingTrendsService = tradingTrendsCachedService;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, "TradingTrendsMoreInfo", null, 11, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1288114257);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1288114257, i2, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoFragment.ComposeContent (TradingTrendsMoreInfoFragment.kt:39)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1321238425, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoFragment.ComposeContent.1

                /* compiled from: TradingTrendsMoreInfoFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ TradingTrendsMoreInfoFragment this$0;

                    AnonymousClass1(TradingTrendsMoreInfoFragment tradingTrendsMoreInfoFragment) {
                        this.this$0 = tradingTrendsMoreInfoFragment;
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
                            ComposerKt.traceEventStart(-1547140562, i, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoFragment.ComposeContent.<anonymous>.<anonymous> (TradingTrendsMoreInfoFragment.kt:42)");
                        }
                        TradingTrendsCachedService tradingTrendsService = this.this$0.getTradingTrendsService();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final TradingTrendsMoreInfoFragment tradingTrendsMoreInfoFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TradingTrendsMoreInfoFragment.C300191.AnonymousClass1.invoke$lambda$1$lambda$0(tradingTrendsMoreInfoFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        TradingTrendsMoreInfoScreen3.TradingTrendsMoreInfoScreen(tradingTrendsService, (Function0) objRememberedValue, null, composer, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(TradingTrendsMoreInfoFragment tradingTrendsMoreInfoFragment) {
                        tradingTrendsMoreInfoFragment.requireBaseActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1321238425, i3, -1, "com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoFragment.ComposeContent.<anonymous> (TradingTrendsMoreInfoFragment.kt:41)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1547140562, true, new AnonymousClass1(TradingTrendsMoreInfoFragment.this), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.moreinfo.TradingTrendsMoreInfoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingTrendsMoreInfoFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
