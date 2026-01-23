package com.robinhood.android.portfolio.pnlhub.appbar;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.C11917R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBar4;
import com.robinhood.android.portfolio.pnlhub.models.C25781R;
import com.robinhood.android.portfolio.pnlhub.p216ui.C25819R;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
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
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PnlHubTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001ag\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001as\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u0016X\u008a\u008e\u0002"}, m3636d2 = {"PNL_FAQ_BUTTON_IDENTIFIER", "", "PnlHubTopAppBar", "", "state", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarState;", "onBack", "Lkotlin/Function0;", "onAssetClassSelected", "Lkotlin/Function1;", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "onCryptoFilterTooltipAppear", "onCryptoFilterTooltipClick", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarDuxo;", "(Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarDuxo;Landroidx/compose/runtime/Composer;II)V", "PnlHubTopAppBarComposable", "viewState", "Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarViewState;", "pnlUpdatesEnabled", "", "onMoreInfoClicked", "(Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarViewState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PnlHubTopAppBarAssetSelector", "(Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-profit-and-loss-hub_externalDebug", "expanded"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubTopAppBar4 {
    public static final String PNL_FAQ_BUTTON_IDENTIFIER = "faq";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubTopAppBar$lambda$3(PnlHubTopAppBarState pnlHubTopAppBarState, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Modifier modifier, PnlHubTopAppBarDuxo pnlHubTopAppBarDuxo, int i, int i2, Composer composer, int i3) {
        PnlHubTopAppBar(pnlHubTopAppBarState, function0, function1, function02, function03, modifier, pnlHubTopAppBarDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubTopAppBarAssetSelector$lambda$6(PnlHubTopAppBarViewState pnlHubTopAppBarViewState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        PnlHubTopAppBarAssetSelector(pnlHubTopAppBarViewState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubTopAppBarComposable$lambda$4(PnlHubTopAppBarViewState pnlHubTopAppBarViewState, boolean z, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PnlHubTopAppBarComposable(pnlHubTopAppBarViewState, z, function0, function1, function02, function03, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubTopAppBar(final PnlHubTopAppBarState state, final Function0<Unit> onBack, final Function1<? super PnlHubAssetClass, Unit> onAssetClassSelected, final Function0<Unit> onCryptoFilterTooltipAppear, final Function0<Unit> onCryptoFilterTooltipClick, Modifier modifier, PnlHubTopAppBarDuxo pnlHubTopAppBarDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PnlHubTopAppBarDuxo pnlHubTopAppBarDuxo2;
        Modifier modifier3;
        int i4;
        int i5;
        PnlHubTopAppBarDuxo pnlHubTopAppBarDuxo3;
        final Context context;
        final Navigator navigator;
        boolean zChangedInstance;
        Object objRememberedValue;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final PnlHubTopAppBarDuxo pnlHubTopAppBarDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onAssetClassSelected, "onAssetClassSelected");
        Intrinsics.checkNotNullParameter(onCryptoFilterTooltipAppear, "onCryptoFilterTooltipAppear");
        Intrinsics.checkNotNullParameter(onCryptoFilterTooltipClick, "onCryptoFilterTooltipClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(869454510);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAssetClassSelected) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCryptoFilterTooltipAppear) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCryptoFilterTooltipClick) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    pnlHubTopAppBarDuxo2 = pnlHubTopAppBarDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(pnlHubTopAppBarDuxo2) ? 1048576 : 524288;
                    i3 |= i7;
                } else {
                    pnlHubTopAppBarDuxo2 = pnlHubTopAppBarDuxo;
                }
                i3 |= i7;
            } else {
                pnlHubTopAppBarDuxo2 = pnlHubTopAppBarDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 64) == 0) {
                        String str = state.getAvailableAssetClasses() + "TopAppBar";
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PnlHubTopAppBarDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBar$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBar$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i5 = i3 & (-3670017);
                        pnlHubTopAppBarDuxo3 = (PnlHubTopAppBarDuxo) baseDuxo;
                    } else {
                        i4 = -1633490746;
                        i5 = i3;
                        pnlHubTopAppBarDuxo3 = pnlHubTopAppBarDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    pnlHubTopAppBarDuxo3 = pnlHubTopAppBarDuxo2;
                    i4 = -1633490746;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(869454510, i5, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBar (PnlHubTopAppBar.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                ImmutableList<PnlHubAssetClass> availableAssetClasses = state.getAvailableAssetClasses();
                PnlHubAssetClass selectedAssetClass = state.getSelectedAssetClass();
                Boolean boolValueOf = Boolean.valueOf(state.getShowCryptoFilterTooltip());
                composerStartRestartGroup.startReplaceGroup(i4);
                zChangedInstance = composerStartRestartGroup.changedInstance(pnlHubTopAppBarDuxo3) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new PnlHubTopAppBar5(pnlHubTopAppBarDuxo3, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(availableAssetClasses, selectedAssetClass, boolValueOf, (Function2) objRememberedValue, composerStartRestartGroup, 0);
                int i8 = i5;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(pnlHubTopAppBarDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                PnlHubTopAppBarViewState pnlHubTopAppBarViewState = (PnlHubTopAppBarViewState) snapshotState4CollectAsStateWithLifecycle.getValue();
                boolean pnlUpdatesEnabled = state.getPnlUpdatesEnabled();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PnlHubTopAppBar4.PnlHubTopAppBar$lambda$2$lambda$1(navigator, context, snapshotState4CollectAsStateWithLifecycle, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i9 = i8 << 6;
                modifier2 = modifier3;
                PnlHubTopAppBarDuxo pnlHubTopAppBarDuxo5 = pnlHubTopAppBarDuxo3;
                PnlHubTopAppBarComposable(pnlHubTopAppBarViewState, pnlUpdatesEnabled, onBack, onAssetClassSelected, (Function0) objRememberedValue2, onCryptoFilterTooltipAppear, onCryptoFilterTooltipClick, modifier2, composerStartRestartGroup, ((i8 << 3) & 8064) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                pnlHubTopAppBarDuxo4 = pnlHubTopAppBarDuxo5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                pnlHubTopAppBarDuxo4 = pnlHubTopAppBarDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PnlHubTopAppBar4.PnlHubTopAppBar$lambda$3(state, onBack, onAssetClassSelected, onCryptoFilterTooltipAppear, onCryptoFilterTooltipClick, modifier4, pnlHubTopAppBarDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                ImmutableList<PnlHubAssetClass> availableAssetClasses2 = state.getAvailableAssetClasses();
                PnlHubAssetClass selectedAssetClass2 = state.getSelectedAssetClass();
                Boolean boolValueOf2 = Boolean.valueOf(state.getShowCryptoFilterTooltip());
                composerStartRestartGroup.startReplaceGroup(i4);
                zChangedInstance = composerStartRestartGroup.changedInstance(pnlHubTopAppBarDuxo3) | composerStartRestartGroup.changedInstance(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new PnlHubTopAppBar5(pnlHubTopAppBarDuxo3, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(availableAssetClasses2, selectedAssetClass2, boolValueOf2, (Function2) objRememberedValue, composerStartRestartGroup, 0);
                    int i82 = i5;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(pnlHubTopAppBarDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    PnlHubTopAppBarViewState pnlHubTopAppBarViewState2 = (PnlHubTopAppBarViewState) snapshotState4CollectAsStateWithLifecycle.getValue();
                    boolean pnlUpdatesEnabled2 = state.getPnlUpdatesEnabled();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(state);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PnlHubTopAppBar4.PnlHubTopAppBar$lambda$2$lambda$1(navigator, context, snapshotState4CollectAsStateWithLifecycle, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        int i92 = i82 << 6;
                        modifier2 = modifier3;
                        PnlHubTopAppBarDuxo pnlHubTopAppBarDuxo52 = pnlHubTopAppBarDuxo3;
                        PnlHubTopAppBarComposable(pnlHubTopAppBarViewState2, pnlUpdatesEnabled2, onBack, onAssetClassSelected, (Function0) objRememberedValue2, onCryptoFilterTooltipAppear, onCryptoFilterTooltipClick, modifier2, composerStartRestartGroup, ((i82 << 3) & 8064) | (458752 & i92) | (3670016 & i92) | (i92 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        pnlHubTopAppBarDuxo4 = pnlHubTopAppBarDuxo52;
                    }
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: PnlHubTopAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBarComposable$1 */
    static final class C257781 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<PnlHubAssetClass, Unit> $onAssetClassSelected;
        final /* synthetic */ Function0<Unit> $onCryptoFilterTooltipAppear;
        final /* synthetic */ Function0<Unit> $onCryptoFilterTooltipClick;
        final /* synthetic */ boolean $pnlUpdatesEnabled;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ PnlHubTopAppBarViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C257781(PnlHubTopAppBarViewState pnlHubTopAppBarViewState, Function0<Unit> function0, boolean z, Function0<Unit> function02, Resources resources, Context context, Function1<? super PnlHubAssetClass, Unit> function1) {
            this.$viewState = pnlHubTopAppBarViewState;
            this.$onCryptoFilterTooltipClick = function0;
            this.$pnlUpdatesEnabled = z;
            this.$onCryptoFilterTooltipAppear = function02;
            this.$resources = resources;
            this.$context = context;
            this.$onAssetClassSelected = function1;
        }

        private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(PnlHubTopAppBarViewState pnlHubTopAppBarViewState, Function0 function0, SnapshotState snapshotState) {
            if (pnlHubTopAppBarViewState.getShowCryptoFilterTooltip()) {
                function0.invoke();
            }
            invoke$lambda$2(snapshotState, !invoke$lambda$1(snapshotState));
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            String strStringResource;
            long jM21372getBg20d7_KjU;
            final SnapshotState snapshotState;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213115277, i, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable.<anonymous> (PnlHubTopAppBar.kt:136)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean z = this.$viewState.getAvailableAssetClasses().size() > 1;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changed(this.$onCryptoFilterTooltipClick);
            final PnlHubTopAppBarViewState pnlHubTopAppBarViewState = this.$viewState;
            final Function0<Unit> function0 = this.$onCryptoFilterTooltipClick;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBarComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlHubTopAppBar4.C257781.invoke$lambda$4$lambda$3(pnlHubTopAppBarViewState, function0, snapshotState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion2, z, null, null, (Function0) objRememberedValue2, 6, null);
            boolean z2 = this.$pnlUpdatesEnabled;
            PnlHubTopAppBarViewState pnlHubTopAppBarViewState2 = this.$viewState;
            Function0<Unit> function02 = this.$onCryptoFilterTooltipAppear;
            Function0<Unit> function03 = this.$onCryptoFilterTooltipClick;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (z2) {
                composer.startReplaceGroup(-1138438165);
                strStringResource = StringResources_androidKt.stringResource(C25781R.string.closed_pnl_hub_title, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1138323310);
                strStringResource = StringResources_androidKt.stringResource(C25781R.string.pnl_hub_title, composer, 0);
                composer.endReplaceGroup();
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8190);
            PnlHubTopAppBar4.PnlHubTopAppBarAssetSelector(pnlHubTopAppBarViewState2, function02, function03, composer, 0);
            composer.endNode();
            if (bentoTheme.getColors(composer, i2).getIsDay()) {
                composer.startReplaceGroup(-954214293);
                jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-954140854);
                jM21372getBg20d7_KjU = bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU();
                composer.endReplaceGroup();
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, jM21372getBg20d7_KjU, null, 2, null);
            boolean zInvoke$lambda$1 = invoke$lambda$1(snapshotState2);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                snapshotState = snapshotState2;
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBarComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PnlHubTopAppBar4.C257781.invoke$lambda$7$lambda$6(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            } else {
                snapshotState = snapshotState2;
            }
            composer.endReplaceGroup();
            AndroidMenu_androidKt.m5699DropdownMenuIlH_yew(zInvoke$lambda$1, (Function0) objRememberedValue3, modifierM4872backgroundbw27NRU$default, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-639622120, true, new AnonymousClass4(this.$viewState, this.$resources, this.$context, this.$onAssetClassSelected, snapshotState), composer, 54), composer, 48, 48, 2040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: PnlHubTopAppBar.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBarComposable$1$4, reason: invalid class name */
        static final class AnonymousClass4 implements Function3<Column5, Composer, Integer, Unit> {
            final /* synthetic */ Context $context;
            final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
            final /* synthetic */ Function1<PnlHubAssetClass, Unit> $onAssetClassSelected;
            final /* synthetic */ Resources $resources;
            final /* synthetic */ PnlHubTopAppBarViewState $viewState;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(PnlHubTopAppBarViewState pnlHubTopAppBarViewState, Resources resources, Context context, Function1<? super PnlHubAssetClass, Unit> function1, SnapshotState<Boolean> snapshotState) {
                this.$viewState = pnlHubTopAppBarViewState;
                this.$resources = resources;
                this.$context = context;
                this.$onAssetClassSelected = function1;
                this.$expanded$delegate = snapshotState;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
                invoke(column5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$1$lambda$0(PnlHubAssetClass pnlHubAssetClass, PnlHubTopAppBarViewState pnlHubTopAppBarViewState, Context context, String str, SemanticsPropertyReceiver clearAndSetSemantics) {
                String string2;
                Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                if (pnlHubAssetClass == pnlHubTopAppBarViewState.getSelectedAssetClass()) {
                    string2 = context.getString(C25819R.string.accessibility_pnl_hub_top_bar_selected);
                    Intrinsics.checkNotNull(string2);
                } else {
                    string2 = "";
                }
                SemanticsPropertiesKt.setStateDescription(clearAndSetSemantics, string2);
                SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1, PnlHubAssetClass pnlHubAssetClass, SnapshotState snapshotState) {
                function1.invoke(pnlHubAssetClass);
                C257781.invoke$lambda$2(snapshotState, false);
                return Unit.INSTANCE;
            }

            public final void invoke(final Column5 DropdownMenu, Composer composer, int i) {
                Composer composer2 = composer;
                Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
                int i2 = (i & 6) == 0 ? i | (composer2.changed(DropdownMenu) ? 4 : 2) : i;
                if ((i2 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-639622120, i2, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable.<anonymous>.<anonymous> (PnlHubTopAppBar.kt:176)");
                }
                List<PnlHubAssetClass> availableAssetClasses = this.$viewState.getAvailableAssetClasses();
                Resources resources = this.$resources;
                final PnlHubTopAppBarViewState pnlHubTopAppBarViewState = this.$viewState;
                final Context context = this.$context;
                final Function1<PnlHubAssetClass, Unit> function1 = this.$onAssetClassSelected;
                final SnapshotState<Boolean> snapshotState = this.$expanded$delegate;
                for (final PnlHubAssetClass pnlHubAssetClass : availableAssetClasses) {
                    StringResource assetClassName = pnlHubAssetClass.getAssetClassName();
                    Intrinsics.checkNotNull(resources);
                    final String string2 = assetClassName.getText(resources).toString();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChanged = composer2.changed(pnlHubAssetClass.ordinal()) | composer2.changedInstance(pnlHubTopAppBarViewState) | composer2.changedInstance(context) | composer2.changed(string2);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBarComposable$1$4$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PnlHubTopAppBar4.C257781.AnonymousClass4.invoke$lambda$4$lambda$1$lambda$0(pnlHubAssetClass, pnlHubTopAppBarViewState, context, string2, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SemanticsModifier6.clearAndSetSemantics(companion, (Function1) objRememberedValue), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ASSET_SELECTOR, string2, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                    PaddingValues paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-463949446, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBarComposable$1$4$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-463949446, i3, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PnlHubTopAppBar.kt:180)");
                            }
                            Modifier modifierWeight$default = Column5.weight$default(DropdownMenu, Modifier.INSTANCE, 1.0f, false, 2, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m5144paddingVpY3zN4$default(modifierWeight$default, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 1, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextS(), composer3, 805306368, 0, 7676);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    composer2.startReplaceGroup(-1746271574);
                    boolean zChanged2 = composer2.changed(function1) | composer2.changed(pnlHubAssetClass.ordinal());
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBarComposable$1$4$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PnlHubTopAppBar4.C257781.AnonymousClass4.invoke$lambda$4$lambda$3$lambda$2(function1, pnlHubAssetClass, snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue2, modifierAutoLogEvents$default, null, ComposableLambda3.rememberComposableLambda(491516286, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$PnlHubTopAppBarComposable$1$4$1$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(491516286, i3, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PnlHubTopAppBar.kt:190)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CHECKMARK_16);
                            composer3.startReplaceGroup(-99241439);
                            long jM21425getFg0d7_KjU = pnlHubAssetClass == pnlHubTopAppBarViewState.getSelectedAssetClass() ? bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                            composer3.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size16, "", jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), false, null, paddingValuesM5135PaddingValues0680j_4, null, composer2, 12607494, 360);
                    composer2 = composer;
                    function1 = function1;
                    context = context;
                    snapshotState = snapshotState;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(SnapshotState snapshotState) {
            invoke$lambda$2(snapshotState, !invoke$lambda$1(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlHubTopAppBar$lambda$2$lambda$1(Navigator navigator, Context context, SnapshotState4 snapshotState4, PnlHubTopAppBarState pnlHubTopAppBarState) {
        String string2;
        String contentfulId = ((PnlHubTopAppBarViewState) snapshotState4.getValue()).getContentfulId();
        if (pnlHubTopAppBarState.getPnlUpdatesEnabled()) {
            string2 = context.getString(C25819R.string.closed_pnl_hub_faq_title);
        } else {
            string2 = context.getString(C25819R.string.pnl_hub_faq_title);
        }
        Navigator.DefaultImpls.showFragment$default(navigator, context, new OtherMarkdownFragmentKey(contentfulId, string2, null, 4, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlHubTopAppBarComposable(final PnlHubTopAppBarViewState viewState, final boolean z, final Function0<Unit> onBack, final Function1<? super PnlHubAssetClass, Unit> onAssetClassSelected, final Function0<Unit> onMoreInfoClicked, final Function0<Unit> onCryptoFilterTooltipAppear, final Function0<Unit> onCryptoFilterTooltipClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onAssetClassSelected, "onAssetClassSelected");
        Intrinsics.checkNotNullParameter(onMoreInfoClicked, "onMoreInfoClicked");
        Intrinsics.checkNotNullParameter(onCryptoFilterTooltipAppear, "onCryptoFilterTooltipAppear");
        Intrinsics.checkNotNullParameter(onCryptoFilterTooltipClick, "onCryptoFilterTooltipClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(754250944);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBack) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onAssetClassSelected) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onMoreInfoClicked) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCryptoFilterTooltipAppear) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCryptoFilterTooltipClick) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
                i5 = i3;
                if ((4793491 & i5) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(754250944, i5, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable (PnlHubTopAppBar.kt:121)");
                    }
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composer2 = composerStartRestartGroup;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-213115277, true, new C257781(viewState, onCryptoFilterTooltipClick, z2, onCryptoFilterTooltipAppear, context.getResources(), context, onAssetClassSelected), composerStartRestartGroup, 54), modifier2, ComposableLambda3.rememberComposableLambda(-1556817505, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt.PnlHubTopAppBarComposable.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1556817505, i6, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable.<anonymous> (PnlHubTopAppBar.kt:127)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer3, 0), bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), onBack, false, composer3, BentoIcon4.Size24.$stable, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1668301406, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt.PnlHubTopAppBarComposable.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                            invoke(row5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1668301406, i6, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable.<anonymous> (PnlHubTopAppBar.kt:229)");
                            }
                            IconButton5.IconButton(onMoreInfoClicked, ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, PnlHubTopAppBar4.PNL_FAQ_BUTTON_IDENTIFIER), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, PnlHubTopAppBar4.PNL_FAQ_BUTTON_IDENTIFIER, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), false, null, null, PnlHubTopAppBar.INSTANCE.getLambda$52940577$feature_profit_and_loss_hub_externalDebug(), composer3, 196608, 28);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, ((i5 >> 18) & 112) | 3462, 0, 2032);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PnlHubTopAppBar4.PnlHubTopAppBarComposable$lambda$4(viewState, z, onBack, onAssetClassSelected, onMoreInfoClicked, onCryptoFilterTooltipAppear, onCryptoFilterTooltipClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            modifier2 = modifier;
            i5 = i3;
            if ((4793491 & i5) != 4793490) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-213115277, true, new C257781(viewState, onCryptoFilterTooltipClick, z2, onCryptoFilterTooltipAppear, context2.getResources(), context2, onAssetClassSelected), composerStartRestartGroup, 54), modifier2, ComposableLambda3.rememberComposableLambda(-1556817505, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt.PnlHubTopAppBarComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1556817505, i6, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable.<anonymous> (PnlHubTopAppBar.kt:127)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CLOSE_24), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer3, 0), bentoTheme.getColors(composer3, i7).m21425getFg0d7_KjU(), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), onBack, false, composer3, BentoIcon4.Size24.$stable, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1668301406, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt.PnlHubTopAppBarComposable.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                        invoke(row5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1668301406, i6, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarComposable.<anonymous> (PnlHubTopAppBar.kt:229)");
                        }
                        IconButton5.IconButton(onMoreInfoClicked, ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, PnlHubTopAppBar4.PNL_FAQ_BUTTON_IDENTIFIER), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, PnlHubTopAppBar4.PNL_FAQ_BUTTON_IDENTIFIER, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), false, null, null, PnlHubTopAppBar.INSTANCE.getLambda$52940577$feature_profit_and_loss_hub_externalDebug(), composer3, 196608, 28);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, ((i5 >> 18) & 112) | 3462, 0, 2032);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((4793491 & i5) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PnlHubTopAppBarAssetSelector(final PnlHubTopAppBarViewState pnlHubTopAppBarViewState, Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function03;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-193667002);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(pnlHubTopAppBarViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-193667002, i2, -1, "com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarAssetSelector (PnlHubTopAppBar.kt:262)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierM26519popupTooltipBgaGok8 = PopupTooltipKt.m26519popupTooltipBgaGok8(AnimationModifier.animateContentSize$default(companion, null, null, 3, null), (16232 & 1) != 0 ? Boolean.TRUE : Boolean.valueOf(pnlHubTopAppBarViewState.getShowCryptoFilterTooltip()), (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : function02, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : function0, (16232 & 8) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : null, (16232 & 16) != 0 ? PopupPositioning.FREE : PopupPositioning.BELOW, (16232 & 32) != 0 ? null : null, (16232 & 64) != 0 ? null : null, (16232 & 128) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 256) != 0, (16232 & 512) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 1024) != 0 ? C2002Dp.m7995constructorimpl(0) : 0.0f, (16232 & 2048) != 0 ? null : null, (16232 & 4096) != 0 ? EnterTransition.INSTANCE.getNone() : null, (16232 & 8192) != 0 ? ExitTransition.INSTANCE.getNone() : null, PnlHubTopAppBar.INSTANCE.getLambda$715626404$feature_profit_and_loss_hub_externalDebug());
            function03 = function0;
            StringResource assetClassName = pnlHubTopAppBarViewState.getSelectedAssetClass().getAssetClassName();
            Intrinsics.checkNotNull(resources);
            String string2 = assetClassName.getText(resources).toString();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(string2, modifierM26519popupTooltipBgaGok8, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 0, 0, 8184);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-1102115606);
            if (pnlHubTopAppBarViewState.getAvailableAssetClasses().size() > 1) {
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12), "", bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer2, BentoIcon4.Size12.$stable | 48, 48);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlHubTopAppBar4.PnlHubTopAppBarAssetSelector$lambda$6(pnlHubTopAppBarViewState, function03, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
