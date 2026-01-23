package com.robinhood.android.slip.lib.fragments;

import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.margin.contracts.SlipUpsellKey;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.slip.lib.composables.Content3;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.librobinhood.data.store.prefs.LastTimePromptedForSlipUpsell;
import com.robinhood.librobinhood.data.store.prefs.SlipUpsellPromptCount;
import com.robinhood.prefs.LongPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SlipUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\r\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0007H\u0002J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0016H\u0002J\t\u0010$\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/fragments/SlipUpsellFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "lastTimePromptedForSlipUpsell", "Lcom/robinhood/prefs/LongPreference;", "getLastTimePromptedForSlipUpsell$annotations", "getLastTimePromptedForSlipUpsell", "()Lcom/robinhood/prefs/LongPreference;", "setLastTimePromptedForSlipUpsell", "(Lcom/robinhood/prefs/LongPreference;)V", "slipUpsellPromptCount", "getSlipUpsellPromptCount$annotations", "getSlipUpsellPromptCount", "setSlipUpsellPromptCount", "screenName", "", "getScreenName", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onResume", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "dismiss", "handleDeeplink", "uri", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SlipUpsellFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);
    public LongPreference lastTimePromptedForSlipUpsell;
    public LongPreference slipUpsellPromptCount;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(SlipUpsellFragment slipUpsellFragment, int i, Composer composer, int i2) {
        slipUpsellFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @LastTimePromptedForSlipUpsell
    public static /* synthetic */ void getLastTimePromptedForSlipUpsell$annotations() {
    }

    @SlipUpsellPromptCount
    public static /* synthetic */ void getSlipUpsellPromptCount$annotations() {
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final LongPreference getLastTimePromptedForSlipUpsell() {
        LongPreference longPreference = this.lastTimePromptedForSlipUpsell;
        if (longPreference != null) {
            return longPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lastTimePromptedForSlipUpsell");
        return null;
    }

    public final void setLastTimePromptedForSlipUpsell(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.lastTimePromptedForSlipUpsell = longPreference;
    }

    public final LongPreference getSlipUpsellPromptCount() {
        LongPreference longPreference = this.slipUpsellPromptCount;
        if (longPreference != null) {
            return longPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slipUpsellPromptCount");
        return null;
    }

    public final void setSlipUpsellPromptCount(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.slipUpsellPromptCount = longPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "SLIP_POST_TRADE_UPSELL";
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.SLIP_POST_TRADE_UPSELL, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getLastTimePromptedForSlipUpsell().set(System.currentTimeMillis());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1129659887);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1129659887, i2, -1, "com.robinhood.android.slip.lib.fragments.SlipUpsellFragment.ComposeContent (SlipUpsellFragment.kt:50)");
            }
            Boolean bool = Boolean.TRUE;
            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, ComposableLambda3.rememberComposableLambda(607062439, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.fragments.SlipUpsellFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(607062439, i3, -1, "com.robinhood.android.slip.lib.fragments.SlipUpsellFragment.ComposeContent.<anonymous> (SlipUpsellFragment.kt:52)");
                    }
                    final SlipUpsellFragment slipUpsellFragment = SlipUpsellFragment.this;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-1689919050, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.lib.fragments.SlipUpsellFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i4 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1689919050, i4, -1, "com.robinhood.android.slip.lib.fragments.SlipUpsellFragment.ComposeContent.<anonymous>.<anonymous> (SlipUpsellFragment.kt:53)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Companion companion = SlipUpsellFragment.INSTANCE;
                            Color composeColor = SduiColors2.toComposeColor(((SlipUpsellKey) companion.getArgs((Fragment) slipUpsellFragment)).getBackgroundColor(), composer3, 0);
                            composer3.startReplaceGroup(-514563754);
                            long prime = composeColor == null ? BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getPrime() : composeColor.getValue();
                            composer3.endReplaceGroup();
                            Modifier modifierPadding = PaddingKt.padding(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, prime, null, 2, null), paddingValues);
                            ImmutableList3 persistentList = extensions2.toPersistentList(((SlipUpsellKey) companion.getArgs((Fragment) slipUpsellFragment)).getContent());
                            ImmutableList3 persistentList2 = extensions2.toPersistentList(((SlipUpsellKey) companion.getArgs((Fragment) slipUpsellFragment)).getCtaContent());
                            SlipUpsellFragment slipUpsellFragment2 = slipUpsellFragment;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(slipUpsellFragment2);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new SlipUpsellFragment2(slipUpsellFragment2);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer3.endReplaceGroup();
                            SlipUpsellFragment slipUpsellFragment3 = slipUpsellFragment;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(slipUpsellFragment3);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new SlipUpsellFragment3(slipUpsellFragment3);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            Content3.Content(persistentList, function0, modifierPadding, persistentList2, (Function1) objRememberedValue2, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306368, 511);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.lib.fragments.SlipUpsellFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipUpsellFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean dismiss() {
        Long orNull = getSlipUpsellPromptCount().getOrNull();
        getSlipUpsellPromptCount().set((orNull != null ? orNull.longValue() : 0L) + 1);
        requireBaseActivity().finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleDeeplink(String uri) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(uri), Boolean.FALSE, null, false, null, 56, null);
        requireActivity().finish();
        return true;
    }

    /* compiled from: SlipUpsellFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/fragments/SlipUpsellFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/slip/lib/fragments/SlipUpsellFragment;", "Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "key", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SlipUpsellFragment, SlipUpsellKey>, FragmentResolver<SlipUpsellKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SlipUpsellKey getArgs(SlipUpsellFragment slipUpsellFragment) {
            return (SlipUpsellKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, slipUpsellFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SlipUpsellFragment newInstance(SlipUpsellKey slipUpsellKey) {
            return (SlipUpsellFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, slipUpsellKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SlipUpsellFragment slipUpsellFragment, SlipUpsellKey slipUpsellKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, slipUpsellFragment, slipUpsellKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public SlipUpsellFragment createFragment(SlipUpsellKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (SlipUpsellFragment) newInstance((Parcelable) key);
        }
    }
}
