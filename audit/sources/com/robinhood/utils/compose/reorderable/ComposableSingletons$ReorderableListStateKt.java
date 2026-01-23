package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReorderableListState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ReorderableListStateKt {
    public static final ComposableSingletons$ReorderableListStateKt INSTANCE = new ComposableSingletons$ReorderableListStateKt();

    /* renamed from: lambda$-478006897, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9550lambda$478006897 = ComposableLambda3.composableLambdaInstance(-478006897, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt$lambda$-478006897$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478006897, i, -1, "com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt.lambda$-478006897.<anonymous> (ReorderableListState.kt:182)");
            }
            TextKt.m5665Text4IGK_g("Title", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-699807240, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9551lambda$699807240 = ComposableLambda3.composableLambdaInstance(-699807240, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt$lambda$-699807240$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-699807240, i, -1, "com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt.lambda$-699807240.<anonymous> (ReorderableListState.kt:183)");
            }
            TextKt.m5665Text4IGK_g("List 1", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1780231965, reason: not valid java name */
    private static Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit> f9549lambda$1780231965 = ComposableLambda3.composableLambdaInstance(-1780231965, false, new Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt$lambda$-1780231965$1
        public final void invoke(LazyItemScope reorderableItems, String item, int i, boolean z, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
            Intrinsics.checkNotNullParameter(item, "item");
            if ((i2 & 48) == 0) {
                i3 = (composer.changed(item) ? 32 : 16) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 384) == 0) {
                i3 |= composer.changed(i) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i3 |= composer.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 9361) == 9360 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1780231965, i3, -1, "com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt.lambda$-1780231965.<anonymous> (ReorderableListState.kt:191)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (z) {
                modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM4872backgroundbw27NRU$default, Color.INSTANCE.m6718getCyan0d7_KjU(), null, 2, null);
            }
            TextKt.m5665Text4IGK_g(item, modifierM4872backgroundbw27NRU$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, (i3 >> 3) & 14, 0, 131068);
            composer.startReplaceGroup(1073536130);
            if (i % 2 == 0) {
                TextKt.m5665Text4IGK_g("Extra item", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, String str, Integer num, Boolean bool, Composer composer, Integer num2) {
            invoke(lazyItemScope, str, num.intValue(), bool.booleanValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-1384037545, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9548lambda$1384037545 = ComposableLambda3.composableLambdaInstance(-1384037545, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt$lambda$-1384037545$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1384037545, i, -1, "com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt.lambda$-1384037545.<anonymous> (ReorderableListState.kt:198)");
            }
            TextKt.m5665Text4IGK_g("List 2", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit> lambda$1992352844 = ComposableLambda3.composableLambdaInstance(1992352844, false, new Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt$lambda$1992352844$1
        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, String str, Integer num, Boolean bool, Composer composer, Integer num2) {
            invoke(lazyItemScope, str, num.intValue(), bool.booleanValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope reorderableItems, String str, int i, boolean z, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
            Intrinsics.checkNotNullParameter(str, "str");
            if ((i2 & 48) == 0) {
                i3 = (composer.changed(str) ? 32 : 16) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 3072) == 0) {
                i3 |= composer.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 9233) == 9232 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1992352844, i3, -1, "com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableListStateKt.lambda$1992352844.<anonymous> (ReorderableListState.kt:206)");
            }
            TextKt.m5665Text4IGK_g(str, z ? Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m6718getCyan0d7_KjU(), null, 2, null) : Modifier.INSTANCE, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, (i3 >> 3) & 14, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1384037545$lib_utils_compose_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m26607getLambda$1384037545$lib_utils_compose_externalDebug() {
        return f9548lambda$1384037545;
    }

    /* renamed from: getLambda$-1780231965$lib_utils_compose_externalDebug, reason: not valid java name */
    public final Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit> m26608getLambda$1780231965$lib_utils_compose_externalDebug() {
        return f9549lambda$1780231965;
    }

    /* renamed from: getLambda$-478006897$lib_utils_compose_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m26609getLambda$478006897$lib_utils_compose_externalDebug() {
        return f9550lambda$478006897;
    }

    /* renamed from: getLambda$-699807240$lib_utils_compose_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m26610getLambda$699807240$lib_utils_compose_externalDebug() {
        return f9551lambda$699807240;
    }

    public final Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit> getLambda$1992352844$lib_utils_compose_externalDebug() {
        return lambda$1992352844;
    }
}
