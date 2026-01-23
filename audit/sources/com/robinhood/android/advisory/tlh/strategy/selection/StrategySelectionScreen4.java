package com.robinhood.android.advisory.tlh.strategy.selection;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.RadioButtonColors;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.tlh.C9369R;
import com.robinhood.android.advisory.tlh.Components2;
import com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreen4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategies;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesBanner;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategy;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: StrategySelectionScreen.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aK\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a3\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001e\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001f²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u001aX\u008a\u0084\u0002"}, m3636d2 = {"CardOuterSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "CardInnerSpacing", "HarvestStrategySelectionScreen", "", "accountNumbers", "Lkotlinx/collections/immutable/ImmutableList;", "", "paddings", "Landroidx/compose/foundation/layout/PaddingValues;", "onContinueClicked", "Lkotlin/Function1;", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategy;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/tlh/strategy/selection/HarvestStrategySelectionDuxo;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/tlh/strategy/selection/HarvestStrategySelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "TaxLossHarvestingStrategySelectionComposable", "viewState", "Lcom/robinhood/android/advisory/tlh/strategy/selection/StrategySelectionScreenViewState;", "(Lcom/robinhood/android/advisory/tlh/strategy/selection/StrategySelectionScreenViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxLossHarvestingStrategyOptionCard", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "selected", "", "onClick", "(Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategy;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxLossHarvestingStrategySelectionScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-tax-loss-harvesting_externalDebug", "activeStrategy", "footerDividerVisible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StrategySelectionScreen4 {
    private static final float CardOuterSpacing = C2002Dp.m7995constructorimpl(12);
    private static final float CardInnerSpacing = C2002Dp.m7995constructorimpl(6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestStrategySelectionScreen$lambda$1(ImmutableList immutableList, PaddingValues paddingValues, Function1 function1, Modifier modifier, HarvestStrategySelectionDuxo harvestStrategySelectionDuxo, int i, int i2, Composer composer, int i3) {
        HarvestStrategySelectionScreen(immutableList, paddingValues, function1, modifier, harvestStrategySelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingStrategyOptionCard$lambda$14(TaxLossHarvestStrategy taxLossHarvestStrategy, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestingStrategyOptionCard(taxLossHarvestStrategy, z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingStrategySelectionComposable$lambda$8(StrategySelectionScreenViewState strategySelectionScreenViewState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestingStrategySelectionComposable(strategySelectionScreenViewState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingStrategySelectionScreenPreview$lambda$15(int i, Composer composer, int i2) {
        TaxLossHarvestingStrategySelectionScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HarvestStrategySelectionScreen(final ImmutableList<String> accountNumbers, final PaddingValues paddings, final Function1<? super TaxLossHarvestStrategy, Unit> onContinueClicked, Modifier modifier, HarvestStrategySelectionDuxo harvestStrategySelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        HarvestStrategySelectionDuxo harvestStrategySelectionDuxo2;
        int i4;
        Modifier modifier3;
        Composer composer2;
        HarvestStrategySelectionDuxo harvestStrategySelectionDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final HarvestStrategySelectionDuxo harvestStrategySelectionDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1040093802);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumbers) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(paddings) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    harvestStrategySelectionDuxo2 = harvestStrategySelectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(harvestStrategySelectionDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    harvestStrategySelectionDuxo2 = harvestStrategySelectionDuxo;
                }
                i3 |= i6;
            } else {
                harvestStrategySelectionDuxo2 = harvestStrategySelectionDuxo;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                    harvestStrategySelectionDuxo3 = harvestStrategySelectionDuxo2;
                    composer2 = composerStartRestartGroup;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
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
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HarvestStrategySelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$HarvestStrategySelectionScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$HarvestStrategySelectionScreen$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        i4 &= -57345;
                        harvestStrategySelectionDuxo3 = (HarvestStrategySelectionDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        harvestStrategySelectionDuxo3 = harvestStrategySelectionDuxo2;
                    }
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1040093802, i4, -1, "com.robinhood.android.advisory.tlh.strategy.selection.HarvestStrategySelectionScreen (StrategySelectionScreen.kt:81)");
                }
                Composer composer4 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(harvestStrategySelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                composer3 = composer4;
                harvestStrategySelectionDuxo3.setAccountNumbers(accountNumbers);
                TaxLossHarvestingStrategySelectionComposable(HarvestStrategySelectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle), onContinueClicked, SizeKt.fillMaxSize$default(PaddingKt.padding(modifier3, paddings), 0.0f, 1, null), composer3, (i4 >> 3) & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                harvestStrategySelectionDuxo4 = harvestStrategySelectionDuxo3;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                harvestStrategySelectionDuxo4 = harvestStrategySelectionDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategySelectionScreen4.HarvestStrategySelectionScreen$lambda$1(accountNumbers, paddings, onContinueClicked, modifier4, harvestStrategySelectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(harvestStrategySelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                composer3 = composer42;
                harvestStrategySelectionDuxo3.setAccountNumbers(accountNumbers);
                TaxLossHarvestingStrategySelectionComposable(HarvestStrategySelectionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2), onContinueClicked, SizeKt.fillMaxSize$default(PaddingKt.padding(modifier3, paddings), 0.0f, 1, null), composer3, (i4 >> 3) & 112, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                harvestStrategySelectionDuxo4 = harvestStrategySelectionDuxo3;
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final StrategySelectionScreenViewState HarvestStrategySelectionScreen$lambda$0(SnapshotState4<StrategySelectionScreenViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxLossHarvestStrategy TaxLossHarvestingStrategySelectionComposable$lambda$3(SnapshotState<TaxLossHarvestStrategy> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TaxLossHarvestingStrategySelectionComposable$lambda$7(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* compiled from: StrategySelectionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$TaxLossHarvestingStrategySelectionComposable$1 */
    static final class C94631 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<TaxLossHarvestStrategy> $activeStrategy$delegate;
        final /* synthetic */ SnapshotState4<Boolean> $footerDividerVisible$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<TaxLossHarvestStrategy, Unit> $onContinueClicked;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ TaxLossHarvestStrategies $strategies;

        /* JADX WARN: Multi-variable type inference failed */
        C94631(Modifier modifier, ScrollState scrollState, TaxLossHarvestStrategies taxLossHarvestStrategies, SnapshotState<TaxLossHarvestStrategy> snapshotState, Function1<? super TaxLossHarvestStrategy, Unit> function1, SnapshotState4<Boolean> snapshotState4) {
            this.$modifier = modifier;
            this.$scrollState = scrollState;
            this.$strategies = taxLossHarvestStrategies;
            this.$activeStrategy$delegate = snapshotState;
            this.$onContinueClicked = function1;
            this.$footerDividerVisible$delegate = snapshotState4;
        }

        public final void invoke(Composer composer, int i) {
            float f;
            SnapshotState<TaxLossHarvestStrategy> snapshotState;
            Function1<TaxLossHarvestStrategy, Unit> function1;
            int i2;
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1402167289, i, -1, "com.robinhood.android.advisory.tlh.strategy.selection.TaxLossHarvestingStrategySelectionComposable.<anonymous> (StrategySelectionScreen.kt:127)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            ScrollState scrollState = this.$scrollState;
            TaxLossHarvestStrategies taxLossHarvestStrategies = this.$strategies;
            SnapshotState<TaxLossHarvestStrategy> snapshotState2 = this.$activeStrategy$delegate;
            Function1<TaxLossHarvestStrategy, Unit> function12 = this.$onContinueClicked;
            SnapshotState4<Boolean> snapshotState4 = this.$footerDividerVisible$delegate;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierLogScreenTransitions$default);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(StrategySelectionScreen4.CardOuterSpacing), companion.getCenterHorizontally(), composer2, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            String title = taxLossHarvestStrategies.getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Components2.TaxLossHarvestingScreenHeader(title, null, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 7, null), false, composer2, 48, 8);
            TaxLossHarvestStrategiesBanner banner = taxLossHarvestStrategies.getBanner();
            composer2.startReplaceGroup(415374766);
            if (banner == null) {
                f = 0.0f;
                snapshotState = snapshotState2;
                function1 = function12;
                i2 = 0;
            } else {
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(Intrinsic3.height(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), Intrinsic4.Min), bentoTheme.getColors(composer2, i3).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoInfoBanner.INSTANCE.m20647getCornerRadiusD9Ej5fM()));
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer2, 48);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4871backgroundbw27NRU);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM());
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(banner.getIcon());
                if (serverToBentoAssetMapper2FromServerValue == null) {
                    serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INFO_FILLED_24;
                }
                f = 0.0f;
                snapshotState = snapshotState2;
                function1 = function12;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper2FromServerValue), null, bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), modifierM5143paddingVpY3zN4, null, false, composer, BentoIcon4.Size24.$stable | 48, 48);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
                i2 = 0;
                BentoMarkdownText2.BentoMarkdownText(banner.getTextMarkdown(), modifierFillMaxWidth$default, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i3).getTextS(), 0, bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                composer2 = composer;
                composer2.endNode();
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(415448217);
            for (TaxLossHarvestStrategy taxLossHarvestStrategy : taxLossHarvestStrategies.getStrategies()) {
                boolean zAreEqual = Intrinsics.areEqual(taxLossHarvestStrategy, StrategySelectionScreen4.TaxLossHarvestingStrategySelectionComposable$lambda$3(snapshotState));
                composer2.startReplaceGroup(5004770);
                final SnapshotState<TaxLossHarvestStrategy> snapshotState3 = snapshotState;
                boolean zChanged = composer2.changed(snapshotState3);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$TaxLossHarvestingStrategySelectionComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return StrategySelectionScreen4.C94631.invoke$lambda$9$lambda$5$lambda$4$lambda$3$lambda$2(snapshotState3, (TaxLossHarvestStrategy) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                StrategySelectionScreen4.TaxLossHarvestingStrategyOptionCard(taxLossHarvestStrategy, zAreEqual, (Function1) objRememberedValue, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, f, 1, null), composer2, 0, 0);
                snapshotState = snapshotState3;
            }
            final SnapshotState<TaxLossHarvestStrategy> snapshotState5 = snapshotState;
            composer2.endReplaceGroup();
            composer2.endNode();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composer2, i4).m21373getBg30d7_KjU(), StrategySelectionScreen4.TaxLossHarvestingStrategySelectionComposable$lambda$7(snapshotState4) ? 1.0f : f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer2, 0, 5);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            BentoMarkdownText2.BentoMarkdownText(taxLossHarvestStrategies.getDisclosureMarkdown(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion4, bentoTheme2.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 0.0f, composer, 6, 2), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer, i4).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme2.getColors(composer, i4).m21426getFg20d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
            composer.startReplaceGroup(-1633490746);
            final Function1<TaxLossHarvestStrategy, Unit> function13 = function1;
            boolean zChanged2 = composer.changed(snapshotState5) | composer.changed(function13);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$TaxLossHarvestingStrategySelectionComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StrategySelectionScreen4.C94631.invoke$lambda$9$lambda$8$lambda$7(snapshotState5, function13);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, i2), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion4, bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
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
        public static final Unit invoke$lambda$9$lambda$5$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState, TaxLossHarvestStrategy strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            StrategySelectionScreen4.TaxLossHarvestingStrategySelectionComposable$lambda$4(snapshotState, strategy);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8$lambda$7(SnapshotState snapshotState, Function1 function1) {
            TaxLossHarvestStrategy taxLossHarvestStrategyTaxLossHarvestingStrategySelectionComposable$lambda$3 = StrategySelectionScreen4.TaxLossHarvestingStrategySelectionComposable$lambda$3(snapshotState);
            if (taxLossHarvestStrategyTaxLossHarvestingStrategySelectionComposable$lambda$3 != null) {
                function1.invoke(taxLossHarvestStrategyTaxLossHarvestingStrategySelectionComposable$lambda$3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestingStrategySelectionComposable(final StrategySelectionScreenViewState viewState, final Function1<? super TaxLossHarvestStrategy, Unit> onContinueClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        List<TaxLossHarvestStrategy> strategies;
        Object objRememberedValue2;
        TaxLossHarvestStrategies strategies2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1202966259);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1202966259, i3, -1, "com.robinhood.android.advisory.tlh.strategy.selection.TaxLossHarvestingStrategySelectionComposable (StrategySelectionScreen.kt:99)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(viewState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    TaxLossHarvestStrategies strategies3 = viewState.getStrategies();
                    objRememberedValue = SnapshotState3.mutableStateOf$default((strategies3 != null || (strategies = strategies3.getStrategies()) == null) ? null : (TaxLossHarvestStrategy) CollectionsKt.firstOrNull((List) strategies), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                strategies2 = viewState.getStrategies();
                if (strategies2 != null) {
                    composerStartRestartGroup.startReplaceGroup(-360132806);
                    modifier3 = modifier4;
                    LoadingScreenComposablesKt.ListLoadingScreenComposable(modifier3, true, true, 4, composerStartRestartGroup, ((i3 >> 6) & 14) | 3504, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(-359736440);
                    modifier3 = modifier4;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_CHOOSE_OPTION, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1402167289, true, new C94631(modifier3, scrollStateRememberScrollState, strategies2, snapshotState, onContinueClicked, snapshotState4), composer2, 54), composer2, 48);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategySelectionScreen4.TaxLossHarvestingStrategySelectionComposable$lambda$8(viewState, onContinueClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(viewState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                TaxLossHarvestStrategies strategies32 = viewState.getStrategies();
                if (strategies32 != null) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default((strategies32 != null || (strategies = strategies32.getStrategies()) == null) ? null : (TaxLossHarvestStrategy) CollectionsKt.firstOrNull((List) strategies), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    strategies2 = viewState.getStrategies();
                    if (strategies2 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TaxLossHarvestingStrategySelectionComposable$lambda$4(SnapshotState<TaxLossHarvestStrategy> snapshotState, TaxLossHarvestStrategy taxLossHarvestStrategy) {
        snapshotState.setValue(taxLossHarvestStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestingStrategyOptionCard(final TaxLossHarvestStrategy option, final boolean z, final Function1<? super TaxLossHarvestStrategy, Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        String loggingIdentifier;
        final Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        BentoTheme bentoTheme;
        int i5;
        Arrangement arrangement;
        Composer composer2;
        int i6;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1509572108);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(option) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1509572108, i3, -1, "com.robinhood.android.advisory.tlh.strategy.selection.TaxLossHarvestingStrategyOptionCard (StrategySelectionScreen.kt:236)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.ROW;
                loggingIdentifier = option.getLoggingIdentifier();
                if (loggingIdentifier == null) {
                    loggingIdentifier = "";
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, loggingIdentifier, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                modifier3 = modifier4;
                Modifier modifierClip = Clip.clip(Components2.cardBorder(modifierAutoLogEvents$default), Components2.getCardShape(composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(option);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StrategySelectionScreen4.TaxLossHarvestingStrategyOptionCard$lambda$10$lambda$9(onClick, option);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5316selectableXHw0xAI$default = Selectable3.m5316selectableXHw0xAI$default(modifierClip, z2, false, null, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), 6, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierM5316selectableXHw0xAI$default, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM());
                Arrangement arrangement2 = Arrangement.INSTANCE;
                float f = CardInnerSpacing;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement2.m5089spacedBy0680j_4(f);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-694183196);
                if (option.isDefault()) {
                    i4 = i3;
                    bentoTheme = bentoTheme2;
                    i5 = i8;
                    arrangement = arrangement2;
                    composer2 = composerStartRestartGroup;
                    i6 = 0;
                } else {
                    arrangement = arrangement2;
                    composer2 = composerStartRestartGroup;
                    bentoTheme = bentoTheme2;
                    i4 = i3;
                    i6 = 0;
                    i5 = i8;
                    InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(StringResources_androidKt.stringResource(C9369R.string.tlh_strategy_selection_default, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f, 7, null), null, null, false, null, null, composer2, 1572912, 60);
                }
                composer2.endReplaceGroup();
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i6);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion3);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Modifier modifierWeight$default = Row5.weight$default(Row6.INSTANCE, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, i6);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, i6);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                Composer composer4 = composer2;
                BentoText2.m20747BentoText38GnDrw(option.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer4, 24576, 0, 16366);
                Composer composer5 = composer4;
                composer5.startReplaceGroup(2002212179);
                if (option.getSubtitle().length() > 0) {
                    BentoText2.m20747BentoText38GnDrw(option.getSubtitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i5).getTextS(), composer5, 0, 0, 8190);
                    composer5 = composer5;
                }
                composer5.endReplaceGroup();
                composer5.endNode();
                RadioButtonStyle radioButton = ((Styles) composer5.consume(Styles2.getLocalStyles())).getRadioButton(composer5, i6);
                Composer composer6 = composer5;
                RadioButtonKt.RadioButton(z, null, null, false, new RadioButtonColors(radioButton.m21916getSelectedColor0d7_KjU(), radioButton.m21917getUnselectedColor0d7_KjU(), radioButton.m21914getDisabledSelectedColor0d7_KjU(), radioButton.m21915getDisabledUnselectedColor0d7_KjU(), null), null, composer6, ((i4 >> 3) & 14) | 48, 44);
                composer6.endNode();
                BentoText2.m20747BentoText38GnDrw(option.getDescription(), null, Color.m6701boximpl(bentoTheme.getColors(composer6, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer6, i5).getTextS(), composer6, 0, 0, 8186);
                composer3 = composer6;
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategySelectionScreen4.TaxLossHarvestingStrategyOptionCard$lambda$14(option, z, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType2 = Component.ComponentType.ROW;
            loggingIdentifier = option.getLoggingIdentifier();
            if (loggingIdentifier == null) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType2, loggingIdentifier, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            modifier3 = modifier4;
            Modifier modifierClip2 = Clip.clip(Components2.cardBorder(modifierAutoLogEvents$default2), Components2.getCardShape(composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(option);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StrategySelectionScreen4.TaxLossHarvestingStrategyOptionCard$lambda$10$lambda$9(onClick, option);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5316selectableXHw0xAI$default2 = Selectable3.m5316selectableXHw0xAI$default(modifierClip2, z2, false, null, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), 6, null);
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i82 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifierM5316selectableXHw0xAI$default2, bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21590getDefaultD9Ej5fM());
                Arrangement arrangement22 = Arrangement.INSTANCE;
                float f2 = CardInnerSpacing;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement22.m5089spacedBy0680j_4(f2);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion4.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-694183196);
                    if (option.isDefault()) {
                    }
                    composer2.endReplaceGroup();
                    Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composer2, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, i6);
                    CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, companion32);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Modifier modifierWeight$default2 = Row5.weight$default(Row6.INSTANCE, companion32, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer2, i6);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, i6);
                        CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                            Composer composer42 = composer2;
                            BentoText2.m20747BentoText38GnDrw(option.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer42, 24576, 0, 16366);
                            Composer composer52 = composer42;
                            composer52.startReplaceGroup(2002212179);
                            if (option.getSubtitle().length() > 0) {
                            }
                            composer52.endReplaceGroup();
                            composer52.endNode();
                            RadioButtonStyle radioButton2 = ((Styles) composer52.consume(Styles2.getLocalStyles())).getRadioButton(composer52, i6);
                            Composer composer62 = composer52;
                            RadioButtonKt.RadioButton(z, null, null, false, new RadioButtonColors(radioButton2.m21916getSelectedColor0d7_KjU(), radioButton2.m21917getUnselectedColor0d7_KjU(), radioButton2.m21914getDisabledSelectedColor0d7_KjU(), radioButton2.m21915getDisabledUnselectedColor0d7_KjU(), null), null, composer62, ((i4 >> 3) & 14) | 48, 44);
                            composer62.endNode();
                            BentoText2.m20747BentoText38GnDrw(option.getDescription(), null, Color.m6701boximpl(bentoTheme.getColors(composer62, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer62, i5).getTextS(), composer62, 0, 0, 8186);
                            composer3 = composer62;
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestingStrategyOptionCard$lambda$10$lambda$9(Function1 function1, TaxLossHarvestStrategy taxLossHarvestStrategy) {
        function1.invoke(taxLossHarvestStrategy);
        return Unit.INSTANCE;
    }

    private static final void TaxLossHarvestingStrategySelectionScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1016077301);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1016077301, i, -1, "com.robinhood.android.advisory.tlh.strategy.selection.TaxLossHarvestingStrategySelectionScreenPreview (StrategySelectionScreen.kt:312)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, StrategySelectionScreen.INSTANCE.m11292getLambda$894029395$feature_tax_loss_harvesting_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StrategySelectionScreen4.TaxLossHarvestingStrategySelectionScreenPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
