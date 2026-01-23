package com.robinhood.android.optionschain.sbschain.appbar;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState7;
import com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBar4;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a¯\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0015\u001a3\u0010\u001d\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\"\"\u0013\u0010\u0016\u001a\u00020\u0017¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019\"\u0013\u0010\u001b\u001a\u00020\u0017¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"OptionSideBySideChainTopAppBar", "", "showClearButton", "", "tooltipState", "Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "onBackClick", "Lkotlin/Function0;", "openChainSettings", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "setTappedChainSettingsInCurrentSession", "setSeenSwitchBackToClassicChainTooltip", "dismissSwitchBackToClassicChainTooltip", "dismissSimulatedReturnSwitchChartTooltip", "logSwitchBackToClassicChainTooltipAppear", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDuxo;", "onClearButtonClicked", "(ZLcom/robinhood/android/optionschain/sbschain/TooltipState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "sbsNuxDotRadius", "Landroidx/compose/ui/unit/Dp;", "getSbsNuxDotRadius", "()F", "F", "sbsNuxDotStrokeRadius", "getSbsNuxDotStrokeRadius", "drawNuxDot", "blink", "remainingBlinks", "", "onBlinkComplete", "(Landroidx/compose/ui/Modifier;ZILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "feature-options-chain_externalDebug", "viewState", "Lcom/robinhood/android/optionschain/sbschain/appbar/OptionSideBySideChainTopAppBarViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainTopAppBar4 {
    private static final float sbsNuxDotRadius;
    private static final float sbsNuxDotStrokeRadius;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainTopAppBar$lambda$1(boolean z, OptionSideBySideChainDataState7 optionSideBySideChainDataState7, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function1 function12, Function0 function05, Modifier modifier, OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo, Function0 function06, int i, int i2, int i3, Composer composer, int i4) {
        OptionSideBySideChainTopAppBar(z, optionSideBySideChainDataState7, function0, function1, function02, function03, function04, function12, function05, modifier, optionSideBySideChainTopAppBarDuxo, function06, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void OptionSideBySideChainTopAppBar(final boolean z, final OptionSideBySideChainDataState7 optionSideBySideChainDataState7, final Function0<Unit> onBackClick, final Function1<? super FragmentKey, Unit> openChainSettings, final Function0<Unit> setTappedChainSettingsInCurrentSession, final Function0<Unit> setSeenSwitchBackToClassicChainTooltip, final Function0<Unit> dismissSwitchBackToClassicChainTooltip, final Function1<? super Boolean, Unit> dismissSimulatedReturnSwitchChartTooltip, final Function0<Unit> logSwitchBackToClassicChainTooltipAppear, Modifier modifier, OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo, final Function0<Unit> onClearButtonClicked, Composer composer, final int i, final int i2, final int i3) {
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo2;
        int i6;
        CreationExtras defaultViewModelCreationExtras;
        Modifier modifier4;
        final OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo3;
        final Modifier modifier5;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(openChainSettings, "openChainSettings");
        Intrinsics.checkNotNullParameter(setTappedChainSettingsInCurrentSession, "setTappedChainSettingsInCurrentSession");
        Intrinsics.checkNotNullParameter(setSeenSwitchBackToClassicChainTooltip, "setSeenSwitchBackToClassicChainTooltip");
        Intrinsics.checkNotNullParameter(dismissSwitchBackToClassicChainTooltip, "dismissSwitchBackToClassicChainTooltip");
        Intrinsics.checkNotNullParameter(dismissSimulatedReturnSwitchChartTooltip, "dismissSimulatedReturnSwitchChartTooltip");
        Intrinsics.checkNotNullParameter(logSwitchBackToClassicChainTooltipAppear, "logSwitchBackToClassicChainTooltipAppear");
        Intrinsics.checkNotNullParameter(onClearButtonClicked, "onClearButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1175496391);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(optionSideBySideChainDataState7 == null ? -1 : optionSideBySideChainDataState7.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onBackClick) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(openChainSettings) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(setTappedChainSettingsInCurrentSession) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(setSeenSwitchBackToClassicChainTooltip) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(dismissSwitchBackToClassicChainTooltip) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(dismissSimulatedReturnSwitchChartTooltip) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(logSwitchBackToClassicChainTooltipAppear) ? 67108864 : 33554432;
        }
        int i7 = i3 & 512;
        if (i7 != 0) {
            i4 |= 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changedInstance(optionSideBySideChainTopAppBarDuxo)) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i3 & 2048) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onClearButtonClicked) ? 32 : 16;
        }
        int i8 = i5;
        if ((i4 & 306783379) != 306783378 || (i8 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 1024) != 0) {
                    optionSideBySideChainTopAppBarDuxo2 = optionSideBySideChainTopAppBarDuxo;
                    i6 = i8 & (-15);
                } else {
                    optionSideBySideChainTopAppBarDuxo2 = optionSideBySideChainTopAppBarDuxo;
                    i6 = i8;
                }
                modifier3 = modifier2;
            } else {
                modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 1024) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionSideBySideChainTopAppBarDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Modifier modifier6 = modifier3;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$OptionSideBySideChainTopAppBar$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$OptionSideBySideChainTopAppBar$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i6 = i8 & (-15);
                    optionSideBySideChainTopAppBarDuxo2 = (OptionSideBySideChainTopAppBarDuxo) baseDuxo;
                    modifier3 = modifier6;
                } else {
                    optionSideBySideChainTopAppBarDuxo2 = optionSideBySideChainTopAppBarDuxo;
                    i6 = i8;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                modifier4 = modifier3;
                ComposerKt.traceEventStart(1175496391, i4, i6, "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBar (OptionSideBySideChainTopAppBar.kt:57)");
            } else {
                modifier4 = modifier3;
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionSideBySideChainTopAppBarDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            OptionSideBySideChainTopAppBarDuxo optionSideBySideChainTopAppBarDuxo4 = optionSideBySideChainTopAppBarDuxo2;
            final boolean z3 = z2;
            Modifier modifier7 = modifier4;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-33930438, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt.OptionSideBySideChainTopAppBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(Composer composer2, int i9) throws Resources.NotFoundException {
                    String string2;
                    if ((i9 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-33930438, i9, -1, "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBar.<anonymous> (OptionSideBySideChainTopAppBar.kt:66)");
                    }
                    Resources resources2 = resources;
                    SnapshotState4<OptionSideBySideChainTopAppBarViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String title = OptionSideBySideChainTopAppBar4.OptionSideBySideChainTopAppBar$lambda$0(snapshotState4).getTitle();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i10).m21425getFg0d7_KjU();
                    TextStyle textM = bentoTheme.getTypography(composer2, i10).getTextM();
                    TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM, composer2, 817889280, 0, 7546);
                    StringResource subtitleRes = OptionSideBySideChainTopAppBar4.OptionSideBySideChainTopAppBar$lambda$0(snapshotState4).getSubtitleRes();
                    if (subtitleRes != null) {
                        Intrinsics.checkNotNull(resources2);
                        CharSequence text = subtitleRes.getText(resources2);
                        if (text == null || (string2 = text.toString()) == null) {
                            string2 = "";
                        }
                    }
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i10).m21426getFg20d7_KjU();
                    BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i10).getTextM(), composer2, 817889280, 0, 7546);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), modifier7, ComposableLambda3.rememberComposableLambda(-1875992218, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt.OptionSideBySideChainTopAppBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                    invoke(bentoAppBarScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i9 & 6) == 0) {
                        i9 |= (i9 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i9 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1875992218, i9, -1, "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBar.<anonymous> (OptionSideBySideChainTopAppBar.kt:63)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, onBackClick, composer2, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1754585061, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt.OptionSideBySideChainTopAppBar.3

                /* compiled from: OptionSideBySideChainTopAppBar.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$OptionSideBySideChainTopAppBar$3$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Function1<Boolean, Unit> $dismissSimulatedReturnSwitchChartTooltip;
                    final /* synthetic */ Function0<Unit> $dismissSwitchBackToClassicChainTooltip;
                    final /* synthetic */ Function0<Unit> $logSwitchBackToClassicChainTooltipAppear;
                    final /* synthetic */ Function1<FragmentKey, Unit> $openChainSettings;
                    final /* synthetic */ Function0<Unit> $setSeenSwitchBackToClassicChainTooltip;
                    final /* synthetic */ Function0<Unit> $setTappedChainSettingsInCurrentSession;
                    final /* synthetic */ OptionSideBySideChainDataState7 $tooltipState;
                    final /* synthetic */ SnapshotState4<OptionSideBySideChainTopAppBarViewState> $viewState$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(OptionSideBySideChainDataState7 optionSideBySideChainDataState7, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Boolean, Unit> function1, SnapshotState4<OptionSideBySideChainTopAppBarViewState> snapshotState4, Function0<Unit> function04, Function1<? super FragmentKey, Unit> function12) {
                        this.$tooltipState = optionSideBySideChainDataState7;
                        this.$dismissSwitchBackToClassicChainTooltip = function0;
                        this.$logSwitchBackToClassicChainTooltipAppear = function02;
                        this.$setSeenSwitchBackToClassicChainTooltip = function03;
                        this.$dismissSimulatedReturnSwitchChartTooltip = function1;
                        this.$viewState$delegate = snapshotState4;
                        this.$setTappedChainSettingsInCurrentSession = function04;
                        this.$openChainSettings = function12;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1972753627, i, -1, "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBar.<anonymous>.<anonymous> (OptionSideBySideChainTopAppBar.kt:102)");
                        }
                        composer.startReplaceGroup(-1735652865);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(56));
                        OptionSideBySideChainDataState7 optionSideBySideChainDataState7 = this.$tooltipState;
                        final Function0<Unit> function0 = this.$dismissSwitchBackToClassicChainTooltip;
                        final Function0<Unit> function02 = this.$logSwitchBackToClassicChainTooltipAppear;
                        final Function0<Unit> function03 = this.$setSeenSwitchBackToClassicChainTooltip;
                        final Function1<Boolean, Unit> function1 = this.$dismissSimulatedReturnSwitchChartTooltip;
                        if (optionSideBySideChainDataState7 == OptionSideBySideChainDataState7.CHAIN_SETTINGS_NUX) {
                            composer.startReplaceGroup(-363936892);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(function0);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$OptionSideBySideChainTopAppBar$3$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionSideBySideChainTopAppBar4.C244643.AnonymousClass2.invoke$lambda$8$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function04 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer.changed(function02) | composer.changed(function03);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$OptionSideBySideChainTopAppBar$3$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionSideBySideChainTopAppBar4.C244643.AnonymousClass2.invoke$lambda$8$lambda$3$lambda$2(function02, function03);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            modifierM5169size3ABfNKs = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierM5169size3ABfNKs, (16232 & 1) != 0 ? Boolean.TRUE : null, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : function04, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : (Function0) objRememberedValue2, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : PopupPositioning.BELOW, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, OptionSideBySideChainTopAppBar.INSTANCE.m17234getLambda$109470276$feature_options_chain_externalDebug());
                            composer.endReplaceGroup();
                        } else if (optionSideBySideChainDataState7 == OptionSideBySideChainDataState7.SWITCH_SIMULATED_RETURN_CHART_NUX) {
                            composer.startReplaceGroup(-362967677);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged3 = composer.changed(function1);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$OptionSideBySideChainTopAppBar$3$2$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionSideBySideChainTopAppBar4.C244643.AnonymousClass2.invoke$lambda$8$lambda$5$lambda$4(function1);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function0 function05 = (Function0) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChanged4 = composer.changed(function1);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$OptionSideBySideChainTopAppBar$3$2$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionSideBySideChainTopAppBar4.C244643.AnonymousClass2.invoke$lambda$8$lambda$7$lambda$6(function1);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            modifierM5169size3ABfNKs = PopupTooltipKt.m26519popupTooltipBgaGok8(modifierM5169size3ABfNKs, (16232 & 1) != 0 ? Boolean.TRUE : null, (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : function05, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : (Function0) objRememberedValue4, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : PopupPositioning.BELOW, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, OptionSideBySideChainTopAppBar.INSTANCE.getLambda$81739635$feature_options_chain_externalDebug());
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-362120974);
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                        final SnapshotState4<OptionSideBySideChainTopAppBarViewState> snapshotState4 = this.$viewState$delegate;
                        final Function0<Unit> function06 = this.$setTappedChainSettingsInCurrentSession;
                        final Function0<Unit> function07 = this.$dismissSwitchBackToClassicChainTooltip;
                        final Function1<FragmentKey, Unit> function12 = this.$openChainSettings;
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5169size3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.SETTINGS_24);
                        String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_title_content_description, composer, 0);
                        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                        composer.startReplaceGroup(486317979);
                        Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenter());
                        composer.startReplaceGroup(486319127);
                        if (OptionSideBySideChainTopAppBar4.OptionSideBySideChainTopAppBar$lambda$0(snapshotState4).getNuxDotOnSettingsIcon()) {
                            modifierAlign = OptionSideBySideChainTopAppBar4.drawNuxDot(modifierAlign, false, 0, null, composer, 48, 6);
                        }
                        Modifier modifier = modifierAlign;
                        composer.endReplaceGroup();
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue5 = composer.rememberedValue();
                        Composer.Companion companion4 = Composer.INSTANCE;
                        if (objRememberedValue5 == companion4.getEmpty()) {
                            objRememberedValue5 = InteractionSource2.MutableInteractionSource();
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue5;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged5 = composer.changed(snapshotState4) | composer.changed(function06) | composer.changed(function07) | composer.changed(function12);
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (zChanged5 || objRememberedValue6 == companion4.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$OptionSideBySideChainTopAppBar$3$2$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OptionSideBySideChainTopAppBar4.C244643.AnonymousClass2.invoke$lambda$14$lambda$13$lambda$12(snapshotState4, function06, function07, function12);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        composer.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU, ClickableKt.m4891clickableO2vRcR0$default(modifier, interactionSource3, null, false, null, null, (Function0) objRememberedValue6, 28, null), null, false, composer, BentoIcon4.Size24.$stable, 48);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$1$lambda$0(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$3$lambda$2(Function0 function0, Function0 function02) {
                        function0.invoke();
                        function02.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$5$lambda$4(Function1 function1) {
                        function1.invoke(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$7$lambda$6(Function1 function1) {
                        function1.invoke(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$14$lambda$13$lambda$12(SnapshotState4 snapshotState4, Function0 function0, Function0 function02, Function1 function1) {
                        FragmentKey optionChainSettingsFragmentKey = OptionSideBySideChainTopAppBar4.OptionSideBySideChainTopAppBar$lambda$0(snapshotState4).getOptionChainSettingsFragmentKey();
                        if (optionChainSettingsFragmentKey != null) {
                            function0.invoke();
                            function02.invoke();
                            function1.invoke(optionChainSettingsFragmentKey);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i9 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1754585061, i9, -1, "com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBar.<anonymous> (OptionSideBySideChainTopAppBar.kt:84)");
                    }
                    composer2.startReplaceGroup(-1765902525);
                    if (z3) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(companion, (InteractionSource3) objRememberedValue2, null, false, null, null, onClearButtonClicked, 28, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM4891clickableO2vRcR0$default, bentoTheme.getSpacing(composer2, i10).m21595getXsmallD9Ej5fM());
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_clear, composer2, 0);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i10).m21425getFg0d7_KjU();
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5142padding3ABfNKs, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer2, i10).getTextM(), composer2, 817889280, 0, 7544);
                    }
                    composer2.endReplaceGroup();
                    CompositionLocal3.CompositionLocalProvider(Spacing2.getLocalHorizontalPadding().provides(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(8))), ComposableLambda3.rememberComposableLambda(-1972753627, true, new AnonymousClass2(optionSideBySideChainDataState7, dismissSwitchBackToClassicChainTooltip, logSwitchBackToClassicChainTooltipAppear, setSeenSwitchBackToClassicChainTooltip, dismissSimulatedReturnSwitchChartTooltip, snapshotState4CollectAsStateWithLifecycle, setTappedChainSettingsInCurrentSession, openChainSettings), composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composerStartRestartGroup, ((i4 >> 24) & 112) | 3462, 0, 2032);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            optionSideBySideChainTopAppBarDuxo3 = optionSideBySideChainTopAppBarDuxo4;
            modifier5 = modifier7;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            optionSideBySideChainTopAppBarDuxo3 = optionSideBySideChainTopAppBarDuxo;
            modifier5 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainTopAppBar4.OptionSideBySideChainTopAppBar$lambda$1(z, optionSideBySideChainDataState7, onBackClick, openChainSettings, setTappedChainSettingsInCurrentSession, setSeenSwitchBackToClassicChainTooltip, dismissSwitchBackToClassicChainTooltip, dismissSimulatedReturnSwitchChartTooltip, logSwitchBackToClassicChainTooltipAppear, modifier5, optionSideBySideChainTopAppBarDuxo3, onClearButtonClicked, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionSideBySideChainTopAppBarViewState OptionSideBySideChainTopAppBar$lambda$0(SnapshotState4<OptionSideBySideChainTopAppBarViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl((float) 3.5d);
        sbsNuxDotRadius = fM7995constructorimpl;
        sbsNuxDotStrokeRadius = C2002Dp.m7995constructorimpl(fM7995constructorimpl * 2);
    }

    public static final float getSbsNuxDotRadius() {
        return sbsNuxDotRadius;
    }

    public static final float getSbsNuxDotStrokeRadius() {
        return sbsNuxDotStrokeRadius;
    }

    /* compiled from: OptionSideBySideChainTopAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$drawNuxDot$2 */
    static final class C244652 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ boolean $blink;
        final /* synthetic */ Function0<Unit> $onBlinkComplete;
        final /* synthetic */ int $remainingBlinks;

        C244652(boolean z, int i, Function0<Unit> function0) {
            this.$blink = z;
            this.$remainingBlinks = i;
            this.$onBlinkComplete = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(289888941);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(289888941, i, -1, "com.robinhood.android.optionschain.sbschain.appbar.drawNuxDot.<anonymous> (OptionSideBySideChainTopAppBar.kt:186)");
            }
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            final long jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU();
            final long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
            final float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(OptionSideBySideChainTopAppBar4.getSbsNuxDotRadius());
            final float fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(OptionSideBySideChainTopAppBar4.getSbsNuxDotStrokeRadius());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final Animatable animatable = (Animatable) objRememberedValue;
            composer.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(this.$blink);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$blink) | composer.changed(this.$remainingBlinks) | composer.changedInstance(animatable) | composer.changed(this.$onBlinkComplete);
            boolean z = this.$blink;
            int i3 = this.$remainingBlinks;
            Function0<Unit> function0 = this.$onBlinkComplete;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OptionSideBySideChainTopAppBar5(z, i3, animatable, function0, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged2 = composer.changed(fMo5016toPx0680j_4) | composer.changed(jM21371getBg0d7_KjU) | composer.changed(fMo5016toPx0680j_42) | composer.changed(this.$blink) | composer.changedInstance(animatable) | composer.changed(jM21456getPositive0d7_KjU);
            final boolean z2 = this.$blink;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                Object obj = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$drawNuxDot$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OptionSideBySideChainTopAppBar4.C244652.invoke$lambda$5$lambda$4(fMo5016toPx0680j_4, jM21371getBg0d7_KjU, fMo5016toPx0680j_42, z2, animatable, jM21456getPositive0d7_KjU, (ContentDrawScope) obj2);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            composer.endReplaceGroup();
            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierDrawWithContent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(float f, long j, float f2, boolean z, Animatable animatable, long j2, ContentDrawScope drawWithContent) {
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            drawWithContent.drawContent();
            long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithContent.mo6963getSizeNHjbRc() & 4294967295L)) - f) << 32) | (4294967295L & Float.floatToRawIntBits(f)));
            DrawScope.m6947drawCircleVaOC9Bg$default(drawWithContent, j, f2, jM6535constructorimpl, 0.0f, null, null, 0, 120, null);
            if (z) {
                DrawScope.m6947drawCircleVaOC9Bg$default(drawWithContent, Color.m6705copywmQWz5c$default(j2, 1.0f - ((Number) animatable.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 2.2f * f2 * ((Number) animatable.getValue()).floatValue(), jM6535constructorimpl, 0.0f, null, null, 0, 120, null);
            }
            DrawScope.m6947drawCircleVaOC9Bg$default(drawWithContent, j2, f, jM6535constructorimpl, 0.0f, null, null, 0, 120, null);
            return Unit.INSTANCE;
        }
    }

    public static final Modifier drawNuxDot(Modifier modifier, boolean z, int i, Function0<Unit> function0, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        composer.startReplaceGroup(2062225637);
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2062225637, i2, -1, "com.robinhood.android.optionschain.sbschain.appbar.drawNuxDot (OptionSideBySideChainTopAppBar.kt:185)");
        }
        Modifier modifierComposed$default = ComposedModifier2.composed$default(modifier, null, new C244652(z, i, function0), 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierComposed$default;
    }
}
