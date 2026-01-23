package com.robinhood.android.generic.table;

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
import com.robinhood.android.generic.table.StickyColumn;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GenericTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$GenericTableKt {
    public static final ComposableSingletons$GenericTableKt INSTANCE = new ComposableSingletons$GenericTableKt();

    /* renamed from: lambda$-1956513064, reason: not valid java name */
    private static Function6<TestCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> f9014lambda$1956513064 = ComposableLambda3.composableLambdaInstance(-1956513064, false, new Function6<TestCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.ComposableSingletons$GenericTableKt$lambda$-1956513064$1
        /* renamed from: invoke-C8IHX40, reason: not valid java name */
        public final void m14963invokeC8IHX40(TestCell cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails unused$var$, Composer composer, int i) {
            int i2;
            Modifier modifierM5174width3ABfNKs;
            Modifier modifierM5156height3ABfNKs;
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if ((i & 6) == 0) {
                i2 = (composer.changed(cell) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-1956513064, i2, -1, "com.robinhood.android.generic.table.ComposableSingletons$GenericTableKt.lambda$-1956513064.<anonymous> (GenericTable.kt:222)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).m21368getAccent0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            if (c2002Dp2 != null && (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM5142padding3ABfNKs, c2002Dp2.getValue())) != null) {
                modifierM5142padding3ABfNKs = modifierM5156height3ABfNKs;
            }
            if (c2002Dp != null && (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierM5142padding3ABfNKs, c2002Dp.getValue())) != null) {
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
            BentoText2.m20747BentoText38GnDrw(cell.getText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(TestCell testCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num) {
            m14963invokeC8IHX40(testCell, c2002Dp, c2002Dp2, displayDetails, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-1142589989, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9013lambda$1142589989 = ComposableLambda3.composableLambdaInstance(-1142589989, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.ComposableSingletons$GenericTableKt$lambda$-1142589989$1
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
                ComposerKt.traceEventStart(-1142589989, i, -1, "com.robinhood.android.generic.table.ComposableSingletons$GenericTableKt.lambda$-1142589989.<anonymous> (GenericTable.kt:207)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ArrayList arrayList = new ArrayList(50);
            for (int i2 = 0; i2 < 50; i2++) {
                arrayList.add(new TestCell("Header " + i2));
            }
            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
            ArrayList arrayList2 = new ArrayList(20);
            for (int i3 = 0; i3 < 20; i3++) {
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                ArrayList arrayList3 = new ArrayList(50);
                for (int i4 = 0; i4 < 50; i4++) {
                    arrayList3.add(new TestCell(i3 + ":" + i4));
                }
                arrayList2.add(new GenericRow(string2, arrayList3, false, null, null, 28, null));
            }
            GenericTableKt.m14971GenericTable9SxZPhU(new GenericTableData(immutableList, extensions2.toImmutableList(arrayList2)), ComposableSingletons$GenericTableKt.INSTANCE.m14962getLambda$1956513064$lib_generic_table_externalDebug(), modifierFillMaxSize$default, false, null, null, null, null, null, new StickyColumn.StickAtEndUntilOnScreen(7), null, null, composer, 432, 0, 3576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function6<TestCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> lambda$1085269471 = ComposableLambda3.composableLambdaInstance(1085269471, false, new Function6<TestCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.ComposableSingletons$GenericTableKt$lambda$1085269471$1
        /* renamed from: invoke-C8IHX40, reason: not valid java name */
        public final void m14964invokeC8IHX40(TestCell cell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails unused$var$, Composer composer, int i) {
            int i2;
            Modifier modifierM5174width3ABfNKs;
            Modifier modifierM5156height3ABfNKs;
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if ((i & 6) == 0) {
                i2 = (composer.changed(cell) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(1085269471, i2, -1, "com.robinhood.android.generic.table.ComposableSingletons$GenericTableKt.lambda$1085269471.<anonymous> (GenericTable.kt:263)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).m21368getAccent0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            if (c2002Dp2 != null && (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM5142padding3ABfNKs, c2002Dp2.getValue())) != null) {
                modifierM5142padding3ABfNKs = modifierM5156height3ABfNKs;
            }
            if (c2002Dp != null && (modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(modifierM5142padding3ABfNKs, c2002Dp.getValue())) != null) {
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
            BentoText2.m20747BentoText38GnDrw(cell.getText(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(TestCell testCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, DisplayDetails displayDetails, Composer composer, Integer num) {
            m14964invokeC8IHX40(testCell, c2002Dp, c2002Dp2, displayDetails, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1581296674 = ComposableLambda3.composableLambdaInstance(1581296674, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.generic.table.ComposableSingletons$GenericTableKt$lambda$1581296674$1
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
                ComposerKt.traceEventStart(1581296674, i, -1, "com.robinhood.android.generic.table.ComposableSingletons$GenericTableKt.lambda$1581296674.<anonymous> (GenericTable.kt:247)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ArrayList arrayList = new ArrayList(50);
            for (int i2 = 0; i2 < 50; i2++) {
                arrayList.add(new TestCell("Header " + i2));
            }
            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
            ArrayList arrayList2 = new ArrayList(20);
            for (int i3 = 0; i3 < 20; i3++) {
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                ArrayList arrayList3 = new ArrayList(50);
                for (int i4 = 0; i4 < 50; i4++) {
                    arrayList3.add(new TestCell(i3 + ":" + i4));
                }
                arrayList2.add(new GenericRow(string2, arrayList3, false, null, null, 28, null));
            }
            GenericTableKt.m14971GenericTable9SxZPhU(new GenericTableData(immutableList, extensions2.toImmutableList(arrayList2)), ComposableSingletons$GenericTableKt.INSTANCE.getLambda$1085269471$lib_generic_table_externalDebug(), modifierFillMaxSize$default, false, null, null, null, null, null, new StickyColumn.StickAtStartAfterOnScreen(3, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(55)), false, 4, null), null, null, composer, 432, 0, 3576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1142589989$lib_generic_table_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14961getLambda$1142589989$lib_generic_table_externalDebug() {
        return f9013lambda$1142589989;
    }

    /* renamed from: getLambda$-1956513064$lib_generic_table_externalDebug, reason: not valid java name */
    public final Function6<TestCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> m14962getLambda$1956513064$lib_generic_table_externalDebug() {
        return f9014lambda$1956513064;
    }

    public final Function6<TestCell, C2002Dp, C2002Dp, DisplayDetails, Composer, Integer, Unit> getLambda$1085269471$lib_generic_table_externalDebug() {
        return lambda$1085269471;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1581296674$lib_generic_table_externalDebug() {
        return lambda$1581296674;
    }
}
