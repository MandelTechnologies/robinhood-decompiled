package com.robinhood.android.futures.onboarding.p145ui.eligibility;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.futures.onboarding.C17293R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IneligibleScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"IneligibleScreen", "", "isEventContract", "", "onEnableOptionsClicked", "Lkotlin/Function0;", "onEnableMarginClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-futures-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.IneligibleScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class IneligibleScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IneligibleScreen$lambda$1(boolean z, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IneligibleScreen(z, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IneligibleScreen(final boolean z, final Function0<Unit> onEnableOptionsClicked, final Function0<Unit> onEnableMarginClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        int i5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onEnableOptionsClicked, "onEnableOptionsClicked");
        Intrinsics.checkNotNullParameter(onEnableMarginClicked, "onEnableMarginClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-706912527);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEnableOptionsClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEnableMarginClicked) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-706912527, i3, -1, "com.robinhood.android.futures.onboarding.ui.eligibility.IneligibleScreen (IneligibleScreen.kt:19)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (!z) {
                    i4 = C17293R.string.event_contracts_ineligible_title;
                } else {
                    i4 = C17293R.string.futures_ineligible_title;
                }
                String strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                if (!z) {
                    i5 = C17293R.string.event_contracts_ineligible_body;
                } else {
                    i5 = C17293R.string.futures_ineligible_body;
                }
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0), PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C17293R.string.futures_ineligible_options_row_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C17293R.string.futures_ineligible_options_row_subtitle, composerStartRestartGroup, 0), null, null, null, true, false, false, 0L, onEnableOptionsClicked, composerStartRestartGroup, 12582912, i3 & 112, 1907);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C17293R.string.futures_ineligible_margin_row_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C17293R.string.futures_ineligible_margin_row_subtitle, composerStartRestartGroup, 0), null, null, null, true, false, false, 0L, onEnableMarginClicked, composerStartRestartGroup, 12582912, (i3 >> 3) & 112, 1907);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.IneligibleScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IneligibleScreen.IneligibleScreen$lambda$1(z, onEnableOptionsClicked, onEnableMarginClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (!z) {
                }
                String strStringResource2 = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5145paddingqDBjuR0(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                if (!z) {
                }
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0), PaddingKt.m5145paddingqDBjuR0(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), C2002Dp.m7995constructorimpl(0), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier modifier52 = modifier4;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C17293R.string.futures_ineligible_options_row_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C17293R.string.futures_ineligible_options_row_subtitle, composerStartRestartGroup, 0), null, null, null, true, false, false, 0L, onEnableOptionsClicked, composerStartRestartGroup, 12582912, i3 & 112, 1907);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C17293R.string.futures_ineligible_margin_row_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C17293R.string.futures_ineligible_margin_row_subtitle, composerStartRestartGroup, 0), null, null, null, true, false, false, 0L, onEnableMarginClicked, composerStartRestartGroup, 12582912, (i3 >> 3) & 112, 1907);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
