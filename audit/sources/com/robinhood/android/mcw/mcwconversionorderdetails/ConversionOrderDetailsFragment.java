package com.robinhood.android.mcw.mcwconversionorderdetails;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.mcw.contracts.ConversionOrderDetailsKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: ConversionOrderDetailsFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "navigateBack", "tryShowFxRateBottomSheet", "handleNetworkError", "error", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-mcw-conversion-order-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ConversionOrderDetailsFragment extends GenericComposeFragment implements RegionGated {
    private static final String FX_RATE_BOTTOM_SHEET_ID = "exchange_rate_details_bid";
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(McwRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ConversionOrderDetailsFragment conversionOrderDetailsFragment, int i, Composer composer, int i2) {
        conversionOrderDetailsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1920252739);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1920252739, i2, -1, "com.robinhood.android.mcw.mcwconversionorderdetails.ConversionOrderDetailsFragment.ComposeContent (ConversionOrderDetailsFragment.kt:21)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(916500242, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwconversionorderdetails.ConversionOrderDetailsFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(916500242, i3, -1, "com.robinhood.android.mcw.mcwconversionorderdetails.ConversionOrderDetailsFragment.ComposeContent.<anonymous> (ConversionOrderDetailsFragment.kt:23)");
                    }
                    ConversionOrderDetailsFragment conversionOrderDetailsFragment = ConversionOrderDetailsFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(conversionOrderDetailsFragment);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ConversionOrderDetailsFragment2(conversionOrderDetailsFragment);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                    ConversionOrderDetailsFragment conversionOrderDetailsFragment2 = ConversionOrderDetailsFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(conversionOrderDetailsFragment2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ConversionOrderDetailsFragment3(conversionOrderDetailsFragment2);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
                    ConversionOrderDetailsFragment conversionOrderDetailsFragment3 = ConversionOrderDetailsFragment.this;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer2.changedInstance(conversionOrderDetailsFragment3);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new ConversionOrderDetailsFragment4(conversionOrderDetailsFragment3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    ConversionOrderDetailsComposable3.ConversionOrderDetailsComposable(function0, function02, (Function1) ((KFunction) objRememberedValue3), null, null, composer2, 0, 24);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwconversionorderdetails.ConversionOrderDetailsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversionOrderDetailsFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateBack() {
        requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryShowFxRateBottomSheet() {
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.findFragmentByTag(FX_RATE_BOTTOM_SHEET_ID) != null) {
            return;
        }
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SduiInfoSheetKey(FX_RATE_BOTTOM_SHEET_ID, FX_RATE_BOTTOM_SHEET_ID, null, null, 12, null), null, 2, null).show(supportFragmentManager, FX_RATE_BOTTOM_SHEET_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNetworkError(Throwable error) {
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), error, false, 2, null);
    }

    /* compiled from: ConversionOrderDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsFragment;", "Lcom/robinhood/android/mcw/contracts/ConversionOrderDetailsKey;", "<init>", "()V", "FX_RATE_BOTTOM_SHEET_ID", "", "feature-mcw-conversion-order-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ConversionOrderDetailsFragment, ConversionOrderDetailsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ConversionOrderDetailsKey conversionOrderDetailsKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, conversionOrderDetailsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ConversionOrderDetailsKey getArgs(ConversionOrderDetailsFragment conversionOrderDetailsFragment) {
            return (ConversionOrderDetailsKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, conversionOrderDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ConversionOrderDetailsFragment newInstance(ConversionOrderDetailsKey conversionOrderDetailsKey) {
            return (ConversionOrderDetailsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, conversionOrderDetailsKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ConversionOrderDetailsFragment conversionOrderDetailsFragment, ConversionOrderDetailsKey conversionOrderDetailsKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, conversionOrderDetailsFragment, conversionOrderDetailsKey);
        }
    }
}
