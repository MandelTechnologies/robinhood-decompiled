package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.CheckboxStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsCheckBoxCell.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"TaxLotsCheckBoxComposable", "", "toggleableState", "Landroidx/compose/ui/state/ToggleableState;", "rowIndex", "", "onCheckBoxClicked", "Lkotlin/Function0;", "canEdit", "", "setKeyboardVisible", "Lkotlin/Function1;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "stickyColumn", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/state/ToggleableState;ILkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsCheckBoxCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsCheckBoxCell {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsCheckBoxComposable$lambda$7(ToggleableState toggleableState, int i, Function0 function0, boolean z, Function1 function1, boolean z2, boolean z3, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        TaxLotsCheckBoxComposable(toggleableState, i, function0, z, function1, z2, z3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void TaxLotsCheckBoxComposable(final ToggleableState toggleableState, final int i, final Function0<Unit> onCheckBoxClicked, final boolean z, final Function1<? super Boolean, Unit> setKeyboardVisible, final boolean z2, final boolean z3, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        boolean z4;
        Modifier modifierSemantics$default;
        long jM21740getDisabledUncheckedColor0d7_KjU;
        Intrinsics.checkNotNullParameter(toggleableState, "toggleableState");
        Intrinsics.checkNotNullParameter(onCheckBoxClicked, "onCheckBoxClicked");
        Intrinsics.checkNotNullParameter(setKeyboardVisible, "setKeyboardVisible");
        Composer composerStartRestartGroup = composer.startRestartGroup(1739482057);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCheckBoxClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(setKeyboardVisible) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        int i5 = i3 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i2 & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1739482057, i4, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsCheckBoxComposable (TaxLotsCheckBoxCell.kt:32)");
            }
            final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            CheckboxStyle checkBox = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getCheckBox(composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 10, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1515031587);
            if (z2) {
                z4 = false;
                modifierSemantics$default = modifier3;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean z5 = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((3670016 & i4) == 1048576);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsCheckBoxCellKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotsCheckBoxCell.TaxLotsCheckBoxComposable$lambda$6$lambda$3$lambda$2$lambda$1(i, toggleableState, z3, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                z4 = false;
                modifierSemantics$default = SemanticsModifier6.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(focusManager) | ((57344 & i4) == 16384 ? true : z4) | ((i4 & 896) != 256 ? z4 : true);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsCheckBoxCellKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLotsCheckBoxCell.TaxLotsCheckBoxComposable$lambda$6$lambda$5$lambda$4(focusManager, setKeyboardVisible, onCheckBoxClicked);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierSemantics$default, false, null, null, (Function0) objRememberedValue2, 7, null);
            CheckboxDefaults checkboxDefaults = CheckboxDefaults.INSTANCE;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
            if (z) {
                jM21740getDisabledUncheckedColor0d7_KjU = checkBox.m21741getUncheckedColor0d7_KjU();
            } else {
                jM21740getDisabledUncheckedColor0d7_KjU = checkBox.m21740getDisabledUncheckedColor0d7_KjU();
            }
            long j = jM21740getDisabledUncheckedColor0d7_KjU;
            int i7 = (i4 & 14) | 48;
            Modifier modifier4 = modifier3;
            CheckboxKt.TriStateCheckbox(toggleableState, null, modifierM4893clickableXHw0xAI$default, false, checkboxDefaults.m5735colors5tl4gsc(jM21425getFg0d7_KjU, j, checkBox.m21738getCheckmarkColor0d7_KjU(), checkBox.m21739getDisabledCheckedColor0d7_KjU(), checkBox.m21740getDisabledUncheckedColor0d7_KjU(), 0L, composerStartRestartGroup, CheckboxDefaults.$stable << 18, 32), null, composerStartRestartGroup, i7, 40);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsCheckBoxCellKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsCheckBoxCell.TaxLotsCheckBoxComposable$lambda$7(toggleableState, i, onCheckBoxClicked, z, setKeyboardVisible, z2, z3, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsCheckBoxComposable$lambda$6$lambda$3$lambda$2$lambda$1(int i, ToggleableState toggleableState, boolean z, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        String str = "tax_lot_checkbox_" + (i + 1) + "_" + toggleableState;
        if (z) {
            str = str + "_sticky";
        }
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsCheckBoxComposable$lambda$6$lambda$5$lambda$4(FocusManager focusManager, Function1 function1, Function0 function0) {
        focusManager.clearFocus(true);
        function1.invoke(Boolean.FALSE);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
