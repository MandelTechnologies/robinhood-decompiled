package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.mcw.contracts.CurrencyConverterReceiptKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CurrencyConverterReceiptFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "popNearestParentBackStackOnBackPressed", "getPopNearestParentBackStackOnBackPressed", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CurrencyConverterReceiptFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(McwRegionGate.INSTANCE);
    private final boolean popNearestParentBackStackOnBackPressed = true;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CurrencyConverterReceiptFragment currencyConverterReceiptFragment, int i, Composer composer, int i2) {
        currencyConverterReceiptFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public boolean getPopNearestParentBackStackOnBackPressed() {
        return this.popNearestParentBackStackOnBackPressed;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1829038528);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829038528, i2, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptFragment.ComposeContent (CurrencyConverterReceiptFragment.kt:27)");
            }
            EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            if (edgeToEdgeHost != null) {
                edgeToEdgeHost.overrideStatusBarStyle(false);
                edgeToEdgeHost.overrideNavigationBarStyle(DayNightChanges.isDay(getScarletManager()));
            }
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1634840350, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptFragment.ComposeContent.2
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
                        ComposerKt.traceEventStart(-1634840350, i3, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptFragment.ComposeContent.<anonymous> (CurrencyConverterReceiptFragment.kt:34)");
                    }
                    final CurrencyConverterReceiptFragment currencyConverterReceiptFragment = CurrencyConverterReceiptFragment.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1884879433, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptFragment.ComposeContent.2.1
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
                                ComposerKt.traceEventStart(-1884879433, i4, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptFragment.ComposeContent.<anonymous>.<anonymous> (CurrencyConverterReceiptFragment.kt:35)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.MCW_CONVERSION_SUCCESS_PAGE, null, null, null, 14, null), null, null, null, null, 61, null);
                            final CurrencyConverterReceiptFragment currencyConverterReceiptFragment2 = currencyConverterReceiptFragment;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1272365740, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptFragment.ComposeContent.2.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) throws Resources.NotFoundException {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1272365740, i5, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (CurrencyConverterReceiptFragment.kt:40)");
                                    }
                                    CurrencyConverterReceiptComposable3.CurrencyConverterReceiptComposable((CurrencyConverterReceiptKey) CurrencyConverterReceiptFragment.INSTANCE.getArgs((Fragment) currencyConverterReceiptFragment2), ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), null, null, null, null, null, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CurrencyConverterReceiptFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CurrencyConverterReceiptFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptFragment;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterReceiptKey;", "<init>", "()V", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CurrencyConverterReceiptFragment, CurrencyConverterReceiptKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CurrencyConverterReceiptKey currencyConverterReceiptKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, currencyConverterReceiptKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CurrencyConverterReceiptKey getArgs(CurrencyConverterReceiptFragment currencyConverterReceiptFragment) {
            return (CurrencyConverterReceiptKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, currencyConverterReceiptFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CurrencyConverterReceiptFragment newInstance(CurrencyConverterReceiptKey currencyConverterReceiptKey) {
            return (CurrencyConverterReceiptFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, currencyConverterReceiptKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CurrencyConverterReceiptFragment currencyConverterReceiptFragment, CurrencyConverterReceiptKey currencyConverterReceiptKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, currencyConverterReceiptFragment, currencyConverterReceiptKey);
        }
    }
}
