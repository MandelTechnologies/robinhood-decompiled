package com.robinhood.android.dashboardpill.p096ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.dashboardpill.DashboardPillData;
import com.robinhood.android.dashboardpill.DashboardPillData4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: DashboardPillButton.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboardpill.ui.ComposableSingletons$DashboardPillButtonKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardPillButton {
    public static final DashboardPillButton INSTANCE = new DashboardPillButton();
    private static Function2<Composer, Integer, Unit> lambda$596066823 = ComposableLambda3.composableLambdaInstance(596066823, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboardpill.ui.ComposableSingletons$DashboardPillButtonKt$lambda$596066823$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(596066823, i, -1, "com.robinhood.android.dashboardpill.ui.ComposableSingletons$DashboardPillButtonKt.lambda$596066823.<anonymous> (DashboardPillButton.kt:954)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            Intrinsics.checkNotNullExpressionValue(clockSystemDefaultZone, "systemDefaultZone(...)");
            ColorDto colorDto = ColorDto.COLOR_NOVA;
            ColorDto colorDto2 = ColorDto.COLOR_JET;
            ThemedColorDto themedColorDto = new ThemedColorDto(colorDto, colorDto2);
            ColorDto colorDto3 = ColorDto.COLOR_NEON;
            DashboardPillButton5.DashboardPillButton(clockSystemDefaultZone, new DashboardPillData(null, new DashboardPillData4.Custom(themedColorDto, new ThemedColorDto(colorDto, colorDto3), new ThemedColorDto(colorDto2, colorDto3), new ThemedColorDto(colorDto2, colorDto3), null, null, 48, null), true, "test", null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, 131056, null), null, null, composer, 0, 12);
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
    private static Function2<Composer, Integer, Unit> lambda$728037214 = ComposableLambda3.composableLambdaInstance(728037214, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboardpill.ui.ComposableSingletons$DashboardPillButtonKt$lambda$728037214$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(728037214, i, -1, "com.robinhood.android.dashboardpill.ui.ComposableSingletons$DashboardPillButtonKt.lambda$728037214.<anonymous> (DashboardPillButton.kt:951)");
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
            composer.startReplaceGroup(-2056991710);
            Iterator it = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.TRUE, Boolean.FALSE}).iterator();
            while (it.hasNext()) {
                BentoThemeOverlays.DayNightThemeOverlay(((Boolean) it.next()).booleanValue(), DashboardPillButton.INSTANCE.getLambda$596066823$lib_dashboard_pill_externalDebug(), composer, 48);
            }
            composer.endReplaceGroup();
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
    private static Function2<Composer, Integer, Unit> lambda$909543846 = ComposableLambda3.composableLambdaInstance(909543846, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboardpill.ui.ComposableSingletons$DashboardPillButtonKt$lambda$909543846$1
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
                ComposerKt.traceEventStart(909543846, i, -1, "com.robinhood.android.dashboardpill.ui.ComposableSingletons$DashboardPillButtonKt.lambda$909543846.<anonymous> (DashboardPillButton.kt:950)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, DashboardPillButton.INSTANCE.getLambda$728037214$lib_dashboard_pill_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$596066823$lib_dashboard_pill_externalDebug() {
        return lambda$596066823;
    }

    public final Function2<Composer, Integer, Unit> getLambda$728037214$lib_dashboard_pill_externalDebug() {
        return lambda$728037214;
    }

    public final Function2<Composer, Integer, Unit> getLambda$909543846$lib_dashboard_pill_externalDebug() {
        return lambda$909543846;
    }
}
