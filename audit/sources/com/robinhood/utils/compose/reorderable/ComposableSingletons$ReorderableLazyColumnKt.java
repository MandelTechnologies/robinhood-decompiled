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

/* compiled from: ReorderableLazyColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ReorderableLazyColumnKt {
    public static final ComposableSingletons$ReorderableLazyColumnKt INSTANCE = new ComposableSingletons$ReorderableLazyColumnKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$593522786 = ComposableLambda3.composableLambdaInstance(593522786, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableLazyColumnKt$lambda$593522786$1
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
                ComposerKt.traceEventStart(593522786, i, -1, "com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableLazyColumnKt.lambda$593522786.<anonymous> (ReorderableLazyColumn.kt:280)");
            }
            TextKt.m5665Text4IGK_g("Title", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit> lambda$1900019409 = ComposableLambda3.composableLambdaInstance(1900019409, false, new Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableLazyColumnKt$lambda$1900019409$1
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
                ComposerKt.traceEventStart(1900019409, i3, -1, "com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableLazyColumnKt.lambda$1900019409.<anonymous> (ReorderableLazyColumn.kt:296)");
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
            composer.startReplaceGroup(111607708);
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

    /* renamed from: lambda$-574516280, reason: not valid java name */
    private static Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit> f9547lambda$574516280 = ComposableLambda3.composableLambdaInstance(-574516280, false, new Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableLazyColumnKt$lambda$-574516280$1
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
                ComposerKt.traceEventStart(-574516280, i3, -1, "com.robinhood.utils.compose.reorderable.ComposableSingletons$ReorderableLazyColumnKt.lambda$-574516280.<anonymous> (ReorderableLazyColumn.kt:316)");
            }
            TextKt.m5665Text4IGK_g(str, z ? Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m6718getCyan0d7_KjU(), null, 2, null) : Modifier.INSTANCE, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, (i3 >> 3) & 14, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-574516280$lib_utils_compose_externalDebug, reason: not valid java name */
    public final Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit> m26606getLambda$574516280$lib_utils_compose_externalDebug() {
        return f9547lambda$574516280;
    }

    public final Function6<LazyItemScope, String, Integer, Boolean, Composer, Integer, Unit> getLambda$1900019409$lib_utils_compose_externalDebug() {
        return lambda$1900019409;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$593522786$lib_utils_compose_externalDebug() {
        return lambda$593522786;
    }
}
