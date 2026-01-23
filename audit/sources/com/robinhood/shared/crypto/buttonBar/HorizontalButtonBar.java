package com.robinhood.shared.crypto.buttonBar;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarViewState;
import com.robinhood.shared.crypto.expandableButtonTray.CryptoExpandableButtonTrayComposable;
import com.robinhood.shared.crypto.expandableButtonTray.ExpandableButtonTrayState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.GenericAction;

/* compiled from: HorizontalButtonBar.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00052\u001c\u0010\t\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"HorizontalButtonBar", "", "state", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Horizontal;", "onIdlButtonClick", "Lkotlin/Function2;", "Lcom/robinhood/shared/crypto/expandableButtonTray/ExpandableButtonTrayState$ActionButton;", "Lrh_server_driven_ui/v1/GenericAction;", "", "onCustomButtonClick", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "(Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarViewState$ButtonBarType$Horizontal;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "lib-crypto-button-bar_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.buttonBar.HorizontalButtonBarKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HorizontalButtonBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalButtonBar$lambda$5(CryptoButtonBarViewState.ButtonBarType.Horizontal horizontal, Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        HorizontalButtonBar(horizontal, function2, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HorizontalButtonBar(final CryptoButtonBarViewState.ButtonBarType.Horizontal state, final Function2<? super ExpandableButtonTrayState.ActionButton<?>, ? super GenericAction, Boolean> onIdlButtonClick, final Function2<? super ExpandableButtonTrayState.ActionButton<?>, ? super com.robinhood.models.serverdriven.p347db.GenericAction, Unit> onCustomButtonClick, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onIdlButtonClick, "onIdlButtonClick");
        Intrinsics.checkNotNullParameter(onCustomButtonClick, "onCustomButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1964314008);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onIdlButtonClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCustomButtonClick) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1964314008, i4, -1, "com.robinhood.shared.crypto.buttonBar.HorizontalButtonBar (HorizontalButtonBar.kt:24)");
            }
            int i5 = state.getButtons().size() == 1 ? 1 : 2;
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme2.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            final Column6 column6 = Column6.INSTANCE;
            UIComponent<com.robinhood.models.serverdriven.experimental.api.GenericAction> disclosure = state.getDisclosure();
            composerStartRestartGroup.startReplaceGroup(2064863896);
            if (disclosure == null) {
                bentoTheme = bentoTheme2;
                i3 = i6;
            } else {
                bentoTheme = bentoTheme2;
                i3 = i6;
                SduiComponent3.SduiComponent(disclosure, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, composerStartRestartGroup, 0, 4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            GridCells.Fixed fixed = new GridCells.Fixed(i5);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5092spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m5092spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(state) | ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.buttonBar.HorizontalButtonBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HorizontalButtonBar.HorizontalButtonBar$lambda$4$lambda$3$lambda$2(state, column6, onCustomButtonClick, onIdlButtonClick, (LazyGridScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyGridDslKt.LazyVerticalGrid(fixed, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, false, null, horizontalOrVerticalM5092spacedBy0680j_4, null, false, null, (Function1) objRememberedValue, composer2, 0, 0, 956);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.buttonBar.HorizontalButtonBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HorizontalButtonBar.HorizontalButtonBar$lambda$5(state, onIdlButtonClick, onCustomButtonClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalButtonBar$lambda$4$lambda$3$lambda$2(CryptoButtonBarViewState.ButtonBarType.Horizontal horizontal, final Column5 column5, final Function2 function2, final Function2 function22, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final ImmutableList<ExpandableButtonTrayState.ActionButton<com.robinhood.models.serverdriven.p347db.GenericAction>> buttons = horizontal.getButtons();
        final C37617xbab4a8d6 c37617xbab4a8d6 = new Function1() { // from class: com.robinhood.shared.crypto.buttonBar.HorizontalButtonBarKt$HorizontalButtonBar$lambda$4$lambda$3$lambda$2$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ExpandableButtonTrayState.ActionButton<com.robinhood.models.serverdriven.p347db.GenericAction> actionButton) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ExpandableButtonTrayState.ActionButton<com.robinhood.models.serverdriven.p347db.GenericAction>) obj);
            }
        };
        LazyVerticalGrid.items(buttons.size(), null, null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.buttonBar.HorizontalButtonBarKt$HorizontalButtonBar$lambda$4$lambda$3$lambda$2$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c37617xbab4a8d6.invoke(buttons.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.buttonBar.HorizontalButtonBarKt$HorizontalButtonBar$lambda$4$lambda$3$lambda$2$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                ExpandableButtonTrayState.ActionButton actionButton = (ExpandableButtonTrayState.ActionButton) buttons.get(i);
                composer.startReplaceGroup(497641635);
                CryptoExpandableButtonTrayComposable.ActionButtonComposable(actionButton, function2, function22, Column5.weight$default(column5, Modifier.INSTANCE, 1.0f, false, 2, null), composer, ExpandableButtonTrayState.ActionButton.$stable, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
