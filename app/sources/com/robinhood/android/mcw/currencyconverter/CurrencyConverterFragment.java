package com.robinhood.android.mcw.currencyconverter;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.mcw.contracts.CurrencyConverterKey;
import com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterEvent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: CurrencyConverterFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002#\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "Lkotlin/Function0;", "", "content", "OptionalAchromaticThemeOverlay", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "navigateBack", "tryShowFxRateBottomSheet", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterEvent$ConversionCompleted;", "event", "navigateToReceipt", "(Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterEvent$ConversionCompleted;)V", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCallbacks", "()Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterFragment$Callbacks;", "callbacks", "getToolbarVisible", "toolbarVisible", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CurrencyConverterFragment extends GenericComposeFragment implements RegionGated {
    private static final String FX_RATE_BOTTOM_SHEET_ID = "exchange_rate_details_bid";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(McwRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CurrencyConverterFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CurrencyConverterFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CurrencyConverterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterFragment$Callbacks;", "", "onConversionComplete", "", "event", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterEvent$ConversionCompleted;", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConversionComplete(CurrencyConverterEvent.ConversionCompleted event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CurrencyConverterFragment currencyConverterFragment, int i, Composer composer, int i2) {
        currencyConverterFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionalAchromaticThemeOverlay$lambda$0(CurrencyConverterFragment currencyConverterFragment, Function2 function2, int i, Composer composer, int i2) {
        currencyConverterFragment.OptionalAchromaticThemeOverlay(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final void OptionalAchromaticThemeOverlay(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-978982927);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-978982927, i2, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.OptionalAchromaticThemeOverlay (CurrencyConverterFragment.kt:37)");
            }
            if (((CurrencyConverterKey) INSTANCE.getArgs((Fragment) this)).getUseAchromaticTheme()) {
                composerStartRestartGroup.startReplaceGroup(-2052290855);
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-232684585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.OptionalAchromaticThemeOverlay.1
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
                            ComposerKt.traceEventStart(-232684585, i3, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.OptionalAchromaticThemeOverlay.<anonymous> (CurrencyConverterFragment.kt:40)");
                        }
                        function2.invoke(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2052199312);
                function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CurrencyConverterFragment.OptionalAchromaticThemeOverlay$lambda$0(this.f$0, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1469455475);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1469455475, i2, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.ComposeContent (CurrencyConverterFragment.kt:48)");
            }
            OptionalAchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1430955426, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1430955426, i3, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.ComposeContent.<anonymous> (CurrencyConverterFragment.kt:50)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.MCW_CURRENY_CONVERSION_PAGE, null, null, null, 14, null), null, null, null, null, 61, null);
                    final CurrencyConverterFragment currencyConverterFragment = CurrencyConverterFragment.this;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1022056873, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(-1022056873, i4, -1, "com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.ComposeContent.<anonymous>.<anonymous> (CurrencyConverterFragment.kt:55)");
                            }
                            CurrencyConverterFragment currencyConverterFragment2 = currencyConverterFragment;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(currencyConverterFragment2);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new CurrencyConverterFragment2(currencyConverterFragment2);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
                            CurrencyConverterFragment currencyConverterFragment3 = currencyConverterFragment;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(currencyConverterFragment3);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new CurrencyConverterFragment3(currencyConverterFragment3);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            Function0 function02 = (Function0) ((KFunction) objRememberedValue2);
                            CurrencyConverterFragment currencyConverterFragment4 = currencyConverterFragment;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer3.changedInstance(currencyConverterFragment4);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new CurrencyConverterFragment4(currencyConverterFragment4);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            CurrencyConverterComposable3.CurrencyConverterComposable(function0, function02, (Function1) ((KFunction) objRememberedValue3), ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), null, composer3, 0, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 112) | 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CurrencyConverterFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
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
    public final void navigateToReceipt(CurrencyConverterEvent.ConversionCompleted event) {
        getCallbacks().onConversionComplete(event);
    }

    /* compiled from: CurrencyConverterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterFragment;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterKey;", "<init>", "()V", "FX_RATE_BOTTOM_SHEET_ID", "", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CurrencyConverterFragment, CurrencyConverterKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CurrencyConverterKey getArgs(CurrencyConverterFragment currencyConverterFragment) {
            return (CurrencyConverterKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, currencyConverterFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CurrencyConverterFragment newInstance(CurrencyConverterKey currencyConverterKey) {
            return (CurrencyConverterFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, currencyConverterKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CurrencyConverterFragment currencyConverterFragment, CurrencyConverterKey currencyConverterKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, currencyConverterFragment, currencyConverterKey);
        }
    }
}
