package com.robinhood.shared.recurring.p392ui.insights;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarDefaults;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.appbar.NavIconButton;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.recurring.p392ui.C39558R;
import com.robinhood.shared.recurring.p392ui.insights.InvestmentInsightsComposable3;
import com.robinhood.shared.recurring.p392ui.insights.InvestmentInsightsDuxo;
import com.robinhood.shared.recurring.p392ui.insights.InvestmentInsightsViewState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InvestmentInsightsComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001aI\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"InvestmentInsightsComposable", "", "investmentScheduleId", "Ljava/util/UUID;", "onBackClicked", "Lkotlin/Function0;", "onEditButtonClicked", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDuxo;", "(Ljava/util/UUID;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsDuxo;Landroidx/compose/runtime/Composer;II)V", "InvestmentInsightsScreen", "state", "Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState;", "onTryAgainClicked", "(Lcom/robinhood/shared/recurring/ui/insights/InvestmentInsightsViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlaceholderTestTag", "", "ErrorScreenTag", "lib-recurring-ui_externalDebug", "viewState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InvestmentInsightsComposable3 {
    public static final String ErrorScreenTag = "investment_insights_error_screen";
    public static final String PlaceholderTestTag = "placeholder_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentInsightsComposable$lambda$2(UUID uuid, Function0 function0, Function0 function02, Modifier modifier, InvestmentInsightsDuxo investmentInsightsDuxo, int i, int i2, Composer composer, int i3) {
        InvestmentInsightsComposable(uuid, function0, function02, modifier, investmentInsightsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentInsightsScreen$lambda$3(InvestmentInsightsViewState investmentInsightsViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentInsightsScreen(investmentInsightsViewState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentInsightsComposable(final UUID investmentScheduleId, final Function0<Unit> onBackClicked, final Function0<Unit> onEditButtonClicked, Modifier modifier, InvestmentInsightsDuxo investmentInsightsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        InvestmentInsightsDuxo investmentInsightsDuxo2;
        int i4;
        Modifier modifier3;
        Composer composer2;
        InvestmentInsightsDuxo investmentInsightsDuxo3;
        Composer composer3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier4;
        final InvestmentInsightsDuxo investmentInsightsDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onEditButtonClicked, "onEditButtonClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-624881642);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(investmentScheduleId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEditButtonClicked) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    investmentInsightsDuxo2 = investmentInsightsDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(investmentInsightsDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    investmentInsightsDuxo2 = investmentInsightsDuxo;
                }
                i3 |= i6;
            } else {
                investmentInsightsDuxo2 = investmentInsightsDuxo;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        InvestmentInsightsDuxo.InitArgs initArgs = new InvestmentInsightsDuxo.InitArgs(investmentScheduleId);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InvestmentInsightsDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$InvestmentInsightsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$InvestmentInsightsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        i4 &= -57345;
                        investmentInsightsDuxo3 = (InvestmentInsightsDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        investmentInsightsDuxo3 = investmentInsightsDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier3 = modifier2;
                    investmentInsightsDuxo3 = investmentInsightsDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-624881642, i4, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposable (InvestmentInsightsComposable.kt:52)");
                }
                Composer composer4 = composer2;
                composer3 = composer4;
                InvestmentInsightsViewState investmentInsightsViewStateInvestmentInsightsComposable$lambda$0 = InvestmentInsightsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(investmentInsightsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7));
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(investmentInsightsDuxo3);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InvestmentInsightsComposable4(investmentInsightsDuxo3);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer3.endReplaceGroup();
                Modifier modifier5 = modifier3;
                InvestmentInsightsScreen(investmentInsightsViewStateInvestmentInsightsComposable$lambda$0, onBackClicked, onEditButtonClicked, (Function0) ((KFunction) objRememberedValue), modifier5, composer3, (i4 & 1008) | ((i4 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
                investmentInsightsDuxo4 = investmentInsightsDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                investmentInsightsDuxo4 = investmentInsightsDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentInsightsComposable3.InvestmentInsightsComposable$lambda$2(investmentScheduleId, onBackClicked, onEditButtonClicked, modifier4, investmentInsightsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                composer3 = composer42;
                InvestmentInsightsViewState investmentInsightsViewStateInvestmentInsightsComposable$lambda$02 = InvestmentInsightsComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(investmentInsightsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7));
                composer3.startReplaceGroup(5004770);
                zChangedInstance = composer3.changedInstance(investmentInsightsDuxo3);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new InvestmentInsightsComposable4(investmentInsightsDuxo3);
                    composer3.updateRememberedValue(objRememberedValue);
                    composer3.endReplaceGroup();
                    Modifier modifier52 = modifier3;
                    InvestmentInsightsScreen(investmentInsightsViewStateInvestmentInsightsComposable$lambda$02, onBackClicked, onEditButtonClicked, (Function0) ((KFunction) objRememberedValue), modifier52, composer3, (i4 & 1008) | ((i4 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    investmentInsightsDuxo4 = investmentInsightsDuxo3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentInsightsScreen(final InvestmentInsightsViewState state, final Function0<Unit> onBackClicked, final Function0<Unit> onEditButtonClicked, final Function0<Unit> onTryAgainClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onEditButtonClicked, "onEditButtonClicked");
        Intrinsics.checkNotNullParameter(onTryAgainClicked, "onTryAgainClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1020892858);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEditButtonClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTryAgainClicked) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1020892858, i3, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen (InvestmentInsightsComposable.kt:71)");
                }
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                final SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                final Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-285604210, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-285604210, i5, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous> (InvestmentInsightsComposable.kt:77)");
                        }
                        Modifier modifier6 = modifier5;
                        final LazyListState lazyListState = lazyListStateRememberLazyListState;
                        final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                        final Function0<Unit> function0 = onBackClicked;
                        final InvestmentInsightsViewState investmentInsightsViewState = state;
                        final SduiActionHandler<GenericAction> sduiActionHandler = sduiActionHandlerCurrentActionHandler;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1703773366, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1703773366, i6, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:80)");
                                }
                                Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState, topBarScrollState);
                                boolean showDivider = topBarScrollState.getShowDivider();
                                Function2<Composer, Integer, Unit> function2M25648getLambda$1563608387$lib_recurring_ui_externalDebug = InvestmentInsightsComposable.INSTANCE.m25648getLambda$1563608387$lib_recurring_ui_externalDebug();
                                final Function0<Unit> function02 = function0;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25648getLambda$1563608387$lib_recurring_ui_externalDebug, modifierScrollableTopBarState, ComposableLambda3.rememberComposableLambda(2083030249, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                        invoke(bentoAppBarScope, composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i7) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 17) == 16 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2083030249, i7, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:87)");
                                        }
                                        NavIconButton.m21673NavIconButtonww6aTOc(NavigationType.PUSH, function02, TestTag3.testTag(Modifier.INSTANCE, BentoAppBarDefaults.NavIconTestTag), 0L, composer5, 390, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), ComposableLambda3.rememberComposableLambda(-896488856, true, new AnonymousClass2(investmentInsightsViewState, sduiActionHandler), composer4, 54), null, false, showDivider, null, null, 0L, null, composer4, 3462, 0, 1968);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: InvestmentInsightsComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$InvestmentInsightsScreen$1$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                                final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
                                final /* synthetic */ InvestmentInsightsViewState $state;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass2(InvestmentInsightsViewState investmentInsightsViewState, SduiActionHandler<? super GenericAction> sduiActionHandler) {
                                    this.$state = investmentInsightsViewState;
                                    this.$actionHandler = sduiActionHandler;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                    invoke(row5, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-896488856, i, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:94)");
                                    }
                                    if (this.$state instanceof InvestmentInsightsViewState.Loaded) {
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChangedInstance = composer.changedInstance(this.$actionHandler) | composer.changedInstance(this.$state);
                                        final SduiActionHandler<GenericAction> sduiActionHandler = this.$actionHandler;
                                        final InvestmentInsightsViewState investmentInsightsViewState = this.$state;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$InvestmentInsightsScreen$1$1$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return InvestmentInsightsComposable3.C396071.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(sduiActionHandler, investmentInsightsViewState);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoTextButton2.m20715BentoTextButtonPIknLig(Haptics.hapticClick((Function0) objRememberedValue, composer, 0), ((InvestmentInsightsViewState.Loaded) this.$state).getMenuButton().getTitle(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), null, null, false, null, composer, 0, 120);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(SduiActionHandler sduiActionHandler, InvestmentInsightsViewState investmentInsightsViewState) {
                                    sduiActionHandler.mo15941handle(((InvestmentInsightsViewState.Loaded) investmentInsightsViewState).getMenuButton().getAction());
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54);
                        final InvestmentInsightsViewState investmentInsightsViewState2 = state;
                        final Function0<Unit> function02 = onEditButtonClicked;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1874612823, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1.2
                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1874612823, i6, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:108)");
                                }
                                InvestmentInsightsViewState investmentInsightsViewState3 = investmentInsightsViewState2;
                                if (investmentInsightsViewState3 instanceof InvestmentInsightsViewState.Loaded) {
                                    Function0<Unit> function03 = function02;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer4, i7).m21373getBg30d7_KjU(), 0.0f, composer4, 0, 5);
                                    BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick(function03, composer4, 0), StringResources_androidKt.stringResource(C39558R.string.insights_edit_investment_btn_title, composer4, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(WindowInsetsPadding_androidKt.navigationBarsPadding(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_INSIGHTS, null, ((InvestmentInsightsViewState.Loaded) investmentInsightsViewState3).getLoggingIdentifier(), null, 10, null), UserInteractionEventData.Action.EDIT_RECURRING_INVESTMENT, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null)), bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                                    composer4.endNode();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54);
                        final InvestmentInsightsViewState investmentInsightsViewState3 = state;
                        final Function0<Unit> function03 = onTryAgainClicked;
                        final LazyListState lazyListState2 = lazyListStateRememberLazyListState;
                        final SduiActionHandler<GenericAction> sduiActionHandler2 = sduiActionHandlerCurrentActionHandler;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(806840479, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1.3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                invoke(paddingValues, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer4, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | (composer4.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(806840479, i7, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:133)");
                                }
                                InvestmentInsightsViewState investmentInsightsViewState4 = investmentInsightsViewState3;
                                if (investmentInsightsViewState4 instanceof InvestmentInsightsViewState.Error) {
                                    composer4.startReplaceGroup(1947833881);
                                    ErrorScreenComposable.ErrorScreenComposable(ScrollKt.verticalScroll$default(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), InvestmentInsightsComposable3.ErrorScreenTag), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), function03, 0, null, null, null, null, false, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                    composer4.endReplaceGroup();
                                } else if (investmentInsightsViewState4 instanceof InvestmentInsightsViewState.Loaded) {
                                    composer4.startReplaceGroup(1948251358);
                                    ImmutableList<UIComponent<GenericAction>> components = ((InvestmentInsightsViewState.Loaded) investmentInsightsViewState3).getComponents();
                                    Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    LazyListState lazyListState3 = lazyListState2;
                                    SduiActionHandler<GenericAction> sduiActionHandler3 = sduiActionHandler2;
                                    composer4.startReplaceGroup(767440808);
                                    SduiColumns.SduiLazyColumn(components, GenericAction.class, modifierPadding, lazyListState3, null, sduiActionHandler3, HorizontalPadding.Default, false, composer4, 12582912, 0);
                                    composer4.endReplaceGroup();
                                    composer4.endReplaceGroup();
                                } else {
                                    if (!(investmentInsightsViewState4 instanceof InvestmentInsightsViewState.Loading)) {
                                        composer4.startReplaceGroup(-2015378095);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(1948661612);
                                    LoadingScreenComposablesKt.GenericLoadingScreenComposable(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), InvestmentInsightsComposable3.PlaceholderTestTag), false, composer4, 0, 2);
                                    composer4.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 805306800, 504);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentInsightsComposable3.InvestmentInsightsScreen$lambda$3(state, onBackClicked, onEditButtonClicked, onTryAgainClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            final SduiActionHandler<? super GenericAction> sduiActionHandlerCurrentActionHandler2 = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
            final Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-285604210, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-285604210, i5, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous> (InvestmentInsightsComposable.kt:77)");
                    }
                    Modifier modifier6 = modifier52;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState2;
                    final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState2;
                    final Function0<Unit> function0 = onBackClicked;
                    final InvestmentInsightsViewState investmentInsightsViewState = state;
                    final SduiActionHandler<? super GenericAction> sduiActionHandler = sduiActionHandlerCurrentActionHandler2;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1703773366, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1703773366, i6, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:80)");
                            }
                            Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState, topBarScrollState);
                            boolean showDivider = topBarScrollState.getShowDivider();
                            Function2<Composer, Integer, Unit> function2M25648getLambda$1563608387$lib_recurring_ui_externalDebug = InvestmentInsightsComposable.INSTANCE.m25648getLambda$1563608387$lib_recurring_ui_externalDebug();
                            final Function0<Unit> function02 = function0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25648getLambda$1563608387$lib_recurring_ui_externalDebug, modifierScrollableTopBarState, ComposableLambda3.rememberComposableLambda(2083030249, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer5, Integer num) {
                                    invoke(bentoAppBarScope, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer5, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2083030249, i7, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:87)");
                                    }
                                    NavIconButton.m21673NavIconButtonww6aTOc(NavigationType.PUSH, function02, TestTag3.testTag(Modifier.INSTANCE, BentoAppBarDefaults.NavIconTestTag), 0L, composer5, 390, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), ComposableLambda3.rememberComposableLambda(-896488856, true, new AnonymousClass2(investmentInsightsViewState, sduiActionHandler), composer4, 54), null, false, showDivider, null, null, 0L, null, composer4, 3462, 0, 1968);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: InvestmentInsightsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$InvestmentInsightsScreen$1$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                            final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
                            final /* synthetic */ InvestmentInsightsViewState $state;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(InvestmentInsightsViewState investmentInsightsViewState, SduiActionHandler<? super GenericAction> sduiActionHandler) {
                                this.$state = investmentInsightsViewState;
                                this.$actionHandler = sduiActionHandler;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                invoke(row5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-896488856, i, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:94)");
                                }
                                if (this.$state instanceof InvestmentInsightsViewState.Loaded) {
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composer.changedInstance(this.$actionHandler) | composer.changedInstance(this.$state);
                                    final SduiActionHandler sduiActionHandler = this.$actionHandler;
                                    final InvestmentInsightsViewState investmentInsightsViewState = this.$state;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt$InvestmentInsightsScreen$1$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return InvestmentInsightsComposable3.C396071.AnonymousClass1.AnonymousClass2.invoke$lambda$1$lambda$0(sduiActionHandler, investmentInsightsViewState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoTextButton2.m20715BentoTextButtonPIknLig(Haptics.hapticClick((Function0) objRememberedValue, composer, 0), ((InvestmentInsightsViewState.Loaded) this.$state).getMenuButton().getTitle(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), null, null, false, null, composer, 0, 120);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(SduiActionHandler sduiActionHandler, InvestmentInsightsViewState investmentInsightsViewState) {
                                sduiActionHandler.mo15941handle(((InvestmentInsightsViewState.Loaded) investmentInsightsViewState).getMenuButton().getAction());
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer3, 54);
                    final InvestmentInsightsViewState investmentInsightsViewState2 = state;
                    final Function0<Unit> function02 = onEditButtonClicked;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1874612823, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1.2
                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1874612823, i6, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:108)");
                            }
                            InvestmentInsightsViewState investmentInsightsViewState3 = investmentInsightsViewState2;
                            if (investmentInsightsViewState3 instanceof InvestmentInsightsViewState.Loaded) {
                                Function0<Unit> function03 = function02;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer4, i7).m21373getBg30d7_KjU(), 0.0f, composer4, 0, 5);
                                BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick(function03, composer4, 0), StringResources_androidKt.stringResource(C39558R.string.insights_edit_investment_btn_title, composer4, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(WindowInsetsPadding_androidKt.navigationBarsPadding(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_INSIGHTS, null, ((InvestmentInsightsViewState.Loaded) investmentInsightsViewState3).getLoggingIdentifier(), null, 10, null), UserInteractionEventData.Action.EDIT_RECURRING_INVESTMENT, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null)), bentoTheme.getSpacing(composer4, i7).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer4, 0, 0, 8184);
                                composer4.endNode();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer3, 54);
                    final InvestmentInsightsViewState investmentInsightsViewState3 = state;
                    final Function0<Unit> function03 = onTryAgainClicked;
                    final LazyListState lazyListState2 = lazyListStateRememberLazyListState2;
                    final SduiActionHandler<? super GenericAction> sduiActionHandler2 = sduiActionHandlerCurrentActionHandler2;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(806840479, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.insights.InvestmentInsightsComposableKt.InvestmentInsightsScreen.1.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                            invoke(paddingValues, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer4.changed(paddingValues) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(806840479, i7, -1, "com.robinhood.shared.recurring.ui.insights.InvestmentInsightsScreen.<anonymous>.<anonymous> (InvestmentInsightsComposable.kt:133)");
                            }
                            InvestmentInsightsViewState investmentInsightsViewState4 = investmentInsightsViewState3;
                            if (investmentInsightsViewState4 instanceof InvestmentInsightsViewState.Error) {
                                composer4.startReplaceGroup(1947833881);
                                ErrorScreenComposable.ErrorScreenComposable(ScrollKt.verticalScroll$default(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), InvestmentInsightsComposable3.ErrorScreenTag), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null), function03, 0, null, null, null, null, false, composer4, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                composer4.endReplaceGroup();
                            } else if (investmentInsightsViewState4 instanceof InvestmentInsightsViewState.Loaded) {
                                composer4.startReplaceGroup(1948251358);
                                ImmutableList<UIComponent<GenericAction>> components = ((InvestmentInsightsViewState.Loaded) investmentInsightsViewState3).getComponents();
                                Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                LazyListState lazyListState3 = lazyListState2;
                                SduiActionHandler<GenericAction> sduiActionHandler3 = sduiActionHandler2;
                                composer4.startReplaceGroup(767440808);
                                SduiColumns.SduiLazyColumn(components, GenericAction.class, modifierPadding, lazyListState3, null, sduiActionHandler3, HorizontalPadding.Default, false, composer4, 12582912, 0);
                                composer4.endReplaceGroup();
                                composer4.endReplaceGroup();
                            } else {
                                if (!(investmentInsightsViewState4 instanceof InvestmentInsightsViewState.Loading)) {
                                    composer4.startReplaceGroup(-2015378095);
                                    composer4.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer4.startReplaceGroup(1948661612);
                                LoadingScreenComposablesKt.GenericLoadingScreenComposable(TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), InvestmentInsightsComposable3.PlaceholderTestTag), false, composer4, 0, 2);
                                composer4.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 805306800, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final InvestmentInsightsViewState InvestmentInsightsComposable$lambda$0(SnapshotState4<? extends InvestmentInsightsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
