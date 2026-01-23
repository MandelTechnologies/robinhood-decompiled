package com.robinhood.android.support.appointments;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AppointmentsLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"AppointmentsLoadingComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.appointments.AppointmentsLoadingComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AppointmentsLoadingComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppointmentsLoadingComposable$lambda$6(Modifier modifier, int i, int i2, Composer composer, int i3) {
        AppointmentsLoadingComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AppointmentsLoadingComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1623654182);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623654182, i3, -1, "com.robinhood.android.support.appointments.AppointmentsLoadingComposable (AppointmentsLoadingComposable.kt:28)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion3, 0.7f);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifier4 = modifier3;
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge(), composerStartRestartGroup, 6, 0, 8188);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPlaceholder$default(SizeKt.fillMaxWidth(companion3, 0.7f), true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 6, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null);
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_LEFT_16);
            long jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU();
            int i6 = BentoIcon4.Size16.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21373getBg30d7_KjU, modifierM5146paddingqDBjuR0$default, null, false, composerStartRestartGroup, i6 | 48, 48);
            BentoText2.m20747BentoText38GnDrw("...", Row5.weight$default(row6, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(ModifiersKt.bentoPlaceholder$default(companion3, true, null, 2, null), C2002Dp.m7995constructorimpl(62)), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextL(), composerStartRestartGroup, 6, 0, 8188);
            Composer composer3 = composerStartRestartGroup;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), null, bentoTheme.getColors(composer3, i5).m21373getBg30d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer3, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 4, null), null, false, composer3, i6 | 48, 48);
            composer3.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM()), composer3, 0);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer3, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composer3.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor3);
            } else {
                composer3.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            composer3.startReplaceGroup(1800985862);
            for (int i7 = 0; i7 < 5; i7++) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Composer composer4 = composer3;
                BentoText2.m20747BentoText38GnDrw("...", SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(ModifiersKt.bentoPlaceholder$default(PaddingKt.m5143paddingVpY3zN4(companion4, bentoTheme2.getSpacing(composer3, i8).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer3, i8).m21597getXxsmallD9Ej5fM()), true, null, 2, null), 0.0f, 1, null), C2002Dp.m7995constructorimpl(24)), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getTextM(), composer4, 6, 0, 8188);
                composer3 = composer4;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i9 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme3.getSpacing(composer3, i9).m21592getMediumD9Ej5fM()), composer3, 0);
            Composer composer5 = composer3;
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(SizeKt.fillMaxWidth(companion5, 0.65f), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer3, i9).getTextM(), composer5, 6, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme3.getSpacing(composer5, i9).m21593getSmallD9Ej5fM()), composer5, 0);
            BentoText2.m20747BentoText38GnDrw("...", ModifiersKt.bentoPillPlaceholder(SizeKt.fillMaxWidth(companion5, 0.35f), true), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer5, i9).getTextS(), composer5, 6, 0, 8188);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion5, bentoTheme3.getSpacing(composer5, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
            String strStringResource = StringResources_androidKt.stringResource(C39996R.string.appointments_cta_continue, composer5, 0);
            composer5.startReplaceGroup(1849434622);
            Object objRememberedValue = composer5.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.support.appointments.AppointmentsLoadingComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer5.updateRememberedValue(objRememberedValue);
            }
            composer5.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, false, null, null, false, null, false, composer5, 1572864, 6, 64318);
            composer2 = composer5;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.appointments.AppointmentsLoadingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppointmentsLoadingComposable.AppointmentsLoadingComposable$lambda$6(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
