package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.compose.BackHandler;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoExploreComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoExploreComposableKt$Content$searchHeader$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $doneShowingClosedAnimation$delegate;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SnapshotState<Boolean> $forceVisibilityAnimation$delegate;
    final /* synthetic */ Function0<Unit> $onCancelClicked;
    final /* synthetic */ Function1<String, Unit> $onQueryChanged;
    final /* synthetic */ FocusRequester $searchFocusRequester;
    final /* synthetic */ CryptoExploreViewState $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    CryptoExploreComposableKt$Content$searchHeader$1(Function0<Unit> function0, CryptoExploreViewState cryptoExploreViewState, FocusManager focusManager, FocusRequester focusRequester, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Function1<? super String, Unit> function1) {
        this.$onCancelClicked = function0;
        this.$viewState = cryptoExploreViewState;
        this.$focusManager = focusManager;
        this.$searchFocusRequester = focusRequester;
        this.$forceVisibilityAnimation$delegate = snapshotState;
        this.$doneShowingClosedAnimation$delegate = snapshotState2;
        this.$onQueryChanged = function1;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1466386391, i, -1, "com.robinhood.android.crypto.tab.ui.discover.leaf.Content.<anonymous> (CryptoExploreComposable.kt:222)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onCancelClicked);
        final Function0<Unit> function0 = this.$onCancelClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$Content$searchHeader$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoExploreComposableKt$Content$searchHeader$1.invoke$lambda$1$lambda$0(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BackHandler.BackHandler(false, (Function0) objRememberedValue, composer, 0, 1);
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        FocusRequester focusRequester = this.$searchFocusRequester;
        SnapshotState<Boolean> snapshotState = this.$forceVisibilityAnimation$delegate;
        SnapshotState<Boolean> snapshotState2 = this.$doneShowingClosedAnimation$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new CryptoExploreComposableKt$Content$searchHeader$1$2$1(focusRequester, snapshotState, snapshotState2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
        Boolean boolValueOf = Boolean.valueOf(this.$viewState.isSearchVisible());
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$viewState) | composer.changedInstance(this.$focusManager);
        CryptoExploreViewState cryptoExploreViewState = this.$viewState;
        FocusManager focusManager = this.$focusManager;
        SnapshotState<Boolean> snapshotState3 = this.$forceVisibilityAnimation$delegate;
        SnapshotState<Boolean> snapshotState4 = this.$doneShowingClosedAnimation$delegate;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
            CryptoExploreComposableKt$Content$searchHeader$1$3$1 cryptoExploreComposableKt$Content$searchHeader$1$3$1 = new CryptoExploreComposableKt$Content$searchHeader$1$3$1(cryptoExploreViewState, focusManager, snapshotState3, snapshotState4, null);
            composer.updateRememberedValue(cryptoExploreComposableKt$Content$searchHeader$1$3$1);
            objRememberedValue3 = cryptoExploreComposableKt$Content$searchHeader$1$3$1;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue4);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreComposableKt$Content$searchHeader$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM4872backgroundbw27NRU$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue5, 28, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null);
        CryptoExploreViewState cryptoExploreViewState2 = this.$viewState;
        Function1<String, Unit> function1 = this.$onQueryChanged;
        FocusRequester focusRequester2 = this.$searchFocusRequester;
        SnapshotState<Boolean> snapshotState5 = this.$forceVisibilityAnimation$delegate;
        Function0<Unit> function02 = this.$onCancelClicked;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        CryptoExploreComposableKt.SearchTextField(cryptoExploreViewState2.getQuery(), function1, AutomationTestTagModifierExt.automationTestTag(FocusRequesterModifier3.focusRequester(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Row5.weight$default(row6, companion2, 1.0f, false, 2, null), 0.0f, composer, 0, 1), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), focusRequester2), ExploreTestTags.SEARCH_TEXT_BOX), composer, 0, 0);
        AnimatedVisibilityKt.AnimatedVisibility(row6, CryptoExploreComposableKt.Content$lambda$9(snapshotState5), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.m4780scaleInL8ZKhE$default(null, 0.8f, 0L, 5, null)).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.m4782scaleOutL8ZKhE$default(null, 0.8f, 0L, 5, null)).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)), (String) null, ComposableLambda3.rememberComposableLambda(-486169491, true, new CryptoExploreComposableKt$Content$searchHeader$1$6$1(function02), composer, 54), composer, 1600518, 16);
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
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
