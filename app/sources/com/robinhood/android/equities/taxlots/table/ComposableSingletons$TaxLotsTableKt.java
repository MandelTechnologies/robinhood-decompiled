package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsTable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$TaxLotsTableKt {
    public static final ComposableSingletons$TaxLotsTableKt INSTANCE = new ComposableSingletons$TaxLotsTableKt();
    private static Function3<Column5, Composer, Integer, Unit> lambda$278356808 = ComposableLambda3.composableLambdaInstance(278356808, false, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt$lambda$278356808$1
        public final void invoke(Column5 GenericTable, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(GenericTable, "$this$GenericTable");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(278356808, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt.lambda$278356808.<anonymous> (TaxLotsTable.kt:84)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, null, 0L, composer, 0, 7);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
            invoke(column5, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$454252292 = ComposableLambda3.composableLambdaInstance(454252292, false, ComposableSingletons$TaxLotsTableKt$lambda$454252292$1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$379482692 = ComposableLambda3.composableLambdaInstance(379482692, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt$lambda$379482692$1
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
                ComposerKt.traceEventStart(379482692, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt.lambda$379482692.<anonymous> (TaxLotsTable.kt:130)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE)}, ComposableSingletons$TaxLotsTableKt.INSTANCE.getLambda$454252292$lib_tax_lots_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1731759994, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8893lambda$1731759994 = ComposableLambda3.composableLambdaInstance(-1731759994, false, ComposableSingletons$TaxLotsTableKt$lambda$1731759994$1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$572738502 = ComposableLambda3.composableLambdaInstance(572738502, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt$lambda$572738502$1
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
                ComposerKt.traceEventStart(572738502, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableKt.lambda$572738502.<anonymous> (TaxLotsTable.kt:165)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE)}, ComposableSingletons$TaxLotsTableKt.INSTANCE.m13631getLambda$1731759994$lib_tax_lots_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1731759994$lib_tax_lots_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13631getLambda$1731759994$lib_tax_lots_externalDebug() {
        return f8893lambda$1731759994;
    }

    public final Function3<Column5, Composer, Integer, Unit> getLambda$278356808$lib_tax_lots_externalDebug() {
        return lambda$278356808;
    }

    public final Function2<Composer, Integer, Unit> getLambda$379482692$lib_tax_lots_externalDebug() {
        return lambda$379482692;
    }

    public final Function2<Composer, Integer, Unit> getLambda$454252292$lib_tax_lots_externalDebug() {
        return lambda$454252292;
    }

    public final Function2<Composer, Integer, Unit> getLambda$572738502$lib_tax_lots_externalDebug() {
        return lambda$572738502;
    }
}
