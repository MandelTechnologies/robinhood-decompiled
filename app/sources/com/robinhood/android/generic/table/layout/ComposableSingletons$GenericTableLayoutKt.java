package com.robinhood.android.generic.table.layout;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.generic.table.DisplayDetails;
import com.robinhood.android.generic.table.GenericCell;
import com.robinhood.android.generic.table.TestCell;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericTableLayout.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$GenericTableLayoutKt {
    public static final ComposableSingletons$GenericTableLayoutKt INSTANCE = new ComposableSingletons$GenericTableLayoutKt();

    /* renamed from: lambda$-2008755447, reason: not valid java name */
    private static Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> f9016lambda$2008755447 = ComposableLambda3.composableLambdaInstance(-2008755447, false, new Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt$lambda$-2008755447$1
        /* renamed from: invoke-C8IHX40, reason: not valid java name */
        public final void m14986invokeC8IHX40(GenericCell cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails unused$var$, Composer composer, int i) {
            int i2;
            Modifier modifierM5174width3ABfNKs;
            Modifier modifierM5156height3ABfNKs;
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(cell) : composer.changedInstance(cell) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(c2002Dp) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(c2002Dp2) ? 256 : 128;
            }
            if ((i2 & 8339) == 8338 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2008755447, i2, -1, "com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt.lambda$-2008755447.<anonymous> (GenericTableLayout.kt:222)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).m21368getAccent0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            if (c2002Dp != null && (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM5142padding3ABfNKs, c2002Dp.getValue())) != null) {
                modifierM5142padding3ABfNKs = modifierM5156height3ABfNKs;
            }
            if (c2002Dp2 != null && (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierM5142padding3ABfNKs, c2002Dp2.getValue())) != null) {
                modifierM5142padding3ABfNKs = modifierM5174width3ABfNKs;
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
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
            BentoText2.m20747BentoText38GnDrw(((TestCell) cell).getText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(GenericCell genericCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num) {
            m14986invokeC8IHX40(genericCell, c2002Dp, c2002Dp2, displayDetails, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-537609156, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9017lambda$537609156 = ComposableLambda3.composableLambdaInstance(-537609156, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt$lambda$-537609156$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-537609156, i, -1, "com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt.lambda$-537609156.<anonymous> (GenericTableLayout.kt:241)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
            BentoText2.m20747BentoText38GnDrw("Table Separation", null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 6, 0, 16382);
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
    private static Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> lambda$1420524992 = ComposableLambda3.composableLambdaInstance(1420524992, false, new Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt$lambda$1420524992$1
        /* renamed from: invoke-C8IHX40, reason: not valid java name */
        public final void m14987invokeC8IHX40(GenericCell cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails unused$var$, Composer composer, int i) {
            int i2;
            Modifier modifierM5174width3ABfNKs;
            Modifier modifierM5156height3ABfNKs;
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? composer.changed(cell) : composer.changedInstance(cell) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(c2002Dp) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changed(c2002Dp2) ? 256 : 128;
            }
            if ((i2 & 8339) == 8338 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1420524992, i2, -1, "com.robinhood.android.generic.table.layout.ComposableSingletons$GenericTableLayoutKt.lambda$1420524992.<anonymous> (GenericTableLayout.kt:267)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).m21452getNegative0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            if (c2002Dp != null && (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM5142padding3ABfNKs, c2002Dp.getValue())) != null) {
                modifierM5142padding3ABfNKs = modifierM5156height3ABfNKs;
            }
            if (c2002Dp2 != null && (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierM5142padding3ABfNKs, c2002Dp2.getValue())) != null) {
                modifierM5142padding3ABfNKs = modifierM5174width3ABfNKs;
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
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
            BentoText2.m20747BentoText38GnDrw(((TestCell) cell).getText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(GenericCell genericCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num) {
            m14987invokeC8IHX40(genericCell, c2002Dp, c2002Dp2, displayDetails, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-1786518299, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9015lambda$1786518299 = ComposableLambda3.composableLambdaInstance(-1786518299, false, ComposableSingletons$GenericTableLayoutKt$lambda$1786518299$1.INSTANCE);

    /* renamed from: getLambda$-1786518299$lib_generic_table_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14982getLambda$1786518299$lib_generic_table_externalDebug() {
        return f9015lambda$1786518299;
    }

    /* renamed from: getLambda$-2008755447$lib_generic_table_externalDebug, reason: not valid java name */
    public final Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> m14983getLambda$2008755447$lib_generic_table_externalDebug() {
        return f9016lambda$2008755447;
    }

    /* renamed from: getLambda$-537609156$lib_generic_table_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14984getLambda$537609156$lib_generic_table_externalDebug() {
        return f9017lambda$537609156;
    }

    public final Function6<GenericCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> getLambda$1420524992$lib_generic_table_externalDebug() {
        return lambda$1420524992;
    }
}
