package com.robinhood.android.equitytradeladder.settingsbottomsheet;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equitytradeladder.C15889R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LadderSettingsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$LadderSettingsBottomSheetKt {
    public static final ComposableSingletons$LadderSettingsBottomSheetKt INSTANCE = new ComposableSingletons$LadderSettingsBottomSheetKt();

    /* renamed from: lambda$-1597834551, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8928lambda$1597834551 = ComposableLambda3.composableLambdaInstance(-1597834551, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$LadderSettingsBottomSheetKt$lambda$-1597834551$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1597834551, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$LadderSettingsBottomSheetKt.lambda$-1597834551.<anonymous> (LadderSettingsBottomSheet.kt:145)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15889R.string.trade_session_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15889R.string.trade_session_subtitle, composer, 0), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16378);
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
    });

    /* renamed from: lambda$-752083899, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8930lambda$752083899 = ComposableLambda3.composableLambdaInstance(-752083899, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$LadderSettingsBottomSheetKt$lambda$-752083899$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-752083899, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$LadderSettingsBottomSheetKt.lambda$-752083899.<anonymous> (LadderSettingsBottomSheet.kt:154)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
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
    });
    private static Function2<Composer, Integer, Unit> lambda$350305577 = ComposableLambda3.composableLambdaInstance(350305577, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$LadderSettingsBottomSheetKt$lambda$350305577$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(350305577, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$LadderSettingsBottomSheetKt.lambda$350305577.<anonymous> (LadderSettingsBottomSheet.kt:180)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15889R.string.trade_time_in_force_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1136923347, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8927lambda$1136923347 = ComposableLambda3.composableLambdaInstance(-1136923347, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$LadderSettingsBottomSheetKt$lambda$-1136923347$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1136923347, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.ComposableSingletons$LadderSettingsBottomSheetKt.lambda$-1136923347.<anonymous> (LadderSettingsBottomSheet.kt:183)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
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
    });

    /* renamed from: lambda$-528249868, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8929lambda$528249868 = ComposableLambda3.composableLambdaInstance(-528249868, false, C15966x6fa48e60.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1516641278 = ComposableLambda3.composableLambdaInstance(1516641278, false, C15968x322aa98.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$993409512 = ComposableLambda3.composableLambdaInstance(993409512, false, C15970x20a77797.INSTANCE);

    /* renamed from: getLambda$-1136923347$feature_equity_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14070getLambda$1136923347$feature_equity_trade_ladder_externalDebug() {
        return f8927lambda$1136923347;
    }

    /* renamed from: getLambda$-1597834551$feature_equity_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14071getLambda$1597834551$feature_equity_trade_ladder_externalDebug() {
        return f8928lambda$1597834551;
    }

    /* renamed from: getLambda$-528249868$feature_equity_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14072getLambda$528249868$feature_equity_trade_ladder_externalDebug() {
        return f8929lambda$528249868;
    }

    /* renamed from: getLambda$-752083899$feature_equity_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14073getLambda$752083899$feature_equity_trade_ladder_externalDebug() {
        return f8930lambda$752083899;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1516641278$feature_equity_trade_ladder_externalDebug() {
        return lambda$1516641278;
    }

    public final Function2<Composer, Integer, Unit> getLambda$350305577$feature_equity_trade_ladder_externalDebug() {
        return lambda$350305577;
    }

    public final Function2<Composer, Integer, Unit> getLambda$993409512$feature_equity_trade_ladder_externalDebug() {
        return lambda$993409512;
    }
}
