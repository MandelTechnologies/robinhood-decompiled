package com.robinhood.compose.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import com.robinhood.compose.common.ShimmerLoaderType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingScreenComposables.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$LoadingScreenComposablesKt {
    public static final ComposableSingletons$LoadingScreenComposablesKt INSTANCE = new ComposableSingletons$LoadingScreenComposablesKt();
    private static Function2<Composer, Integer, Unit> lambda$201099925 = ComposableLambda3.composableLambdaInstance(201099925, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$201099925$1
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
                ComposerKt.traceEventStart(201099925, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$201099925.<anonymous> (LoadingScreenComposables.kt:142)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, false, false, 0, composer, 0, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$120173800 = ComposableLambda3.composableLambdaInstance(120173800, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$120173800$1
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
                ComposerKt.traceEventStart(120173800, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$120173800.<anonymous> (LoadingScreenComposables.kt:150)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, false, 2, composer, 3120, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1018338427 = ComposableLambda3.composableLambdaInstance(1018338427, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$1018338427$1
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
                ComposerKt.traceEventStart(1018338427, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$1018338427.<anonymous> (LoadingScreenComposables.kt:158)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 1, composer, 3504, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$968783968 = ComposableLambda3.composableLambdaInstance(968783968, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$968783968$1
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
                ComposerKt.traceEventStart(968783968, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$968783968.<anonymous> (LoadingScreenComposables.kt:250)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-124207528, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9348lambda$124207528 = ComposableLambda3.composableLambdaInstance(-124207528, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$-124207528$1
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
                ComposerKt.traceEventStart(-124207528, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$-124207528.<anonymous> (LoadingScreenComposables.kt:258)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, true, composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-757085874, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9352lambda$757085874 = ComposableLambda3.composableLambdaInstance(-757085874, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$-757085874$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-757085874, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$-757085874.<anonymous> (LoadingScreenComposables.kt:277)");
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
            composer.startReplaceGroup(-68637151);
            for (int i2 = 0; i2 < 4; i2++) {
                LoadingScreenComposablesKt.m21654PlaceholderBoxif577FI(C2002Dp.m7995constructorimpl(120), C2002Dp.m7995constructorimpl(16), null, composer, 54, 4);
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
    private static Function2<Composer, Integer, Unit> lambda$737354897 = ComposableLambda3.composableLambdaInstance(737354897, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$737354897$1
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
                ComposerKt.traceEventStart(737354897, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$737354897.<anonymous> (LoadingScreenComposables.kt:292)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-120255610, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9347lambda$120255610 = ComposableLambda3.composableLambdaInstance(-120255610, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$-120255610$1
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
                ComposerKt.traceEventStart(-120255610, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$-120255610.<anonymous> (LoadingScreenComposables.kt:383)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composer, 0, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-741397896, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9351lambda$741397896 = ComposableLambda3.composableLambdaInstance(-741397896, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$-741397896$1
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
                ComposerKt.traceEventStart(-741397896, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$-741397896.<anonymous> (LoadingScreenComposables.kt:391)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, false, composer, 384, 11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1435939349 = ComposableLambda3.composableLambdaInstance(1435939349, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$1435939349$1
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
                ComposerKt.traceEventStart(1435939349, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$1435939349.<anonymous> (LoadingScreenComposables.kt:399)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null), true, true, composer, 3456, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-641313112, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9350lambda$641313112 = ComposableLambda3.composableLambdaInstance(-641313112, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$-641313112$1
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
                ComposerKt.traceEventStart(-641313112, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$-641313112.<anonymous> (LoadingScreenComposables.kt:472)");
            }
            LoadingScreenComposablesKt.PromoLoadingScreenComposable(null, 0, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-362559501, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9349lambda$362559501 = ComposableLambda3.composableLambdaInstance(-362559501, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$-362559501$1
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
                ComposerKt.traceEventStart(-362559501, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$-362559501.<anonymous> (LoadingScreenComposables.kt:564)");
            }
            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, false, false, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2070041798 = ComposableLambda3.composableLambdaInstance(2070041798, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$2070041798$1
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
                ComposerKt.traceEventStart(2070041798, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$2070041798.<anonymous> (LoadingScreenComposables.kt:572)");
            }
            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, true, false, composer, 48, 5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2087515741 = ComposableLambda3.composableLambdaInstance(2087515741, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt$lambda$2087515741$1
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
                ComposerKt.traceEventStart(2087515741, i, -1, "com.robinhood.compose.common.ComposableSingletons$LoadingScreenComposablesKt.lambda$2087515741.<anonymous> (LoadingScreenComposables.kt:580)");
            }
            LoadingScreenComposablesKt.GenericTextLoadingScreenComposable(null, true, true, composer, 432, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-120255610$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21636getLambda$120255610$lib_compose_common_externalDebug() {
        return f9347lambda$120255610;
    }

    /* renamed from: getLambda$-124207528$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21637getLambda$124207528$lib_compose_common_externalDebug() {
        return f9348lambda$124207528;
    }

    /* renamed from: getLambda$-362559501$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21638getLambda$362559501$lib_compose_common_externalDebug() {
        return f9349lambda$362559501;
    }

    /* renamed from: getLambda$-641313112$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21639getLambda$641313112$lib_compose_common_externalDebug() {
        return f9350lambda$641313112;
    }

    /* renamed from: getLambda$-741397896$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21640getLambda$741397896$lib_compose_common_externalDebug() {
        return f9351lambda$741397896;
    }

    /* renamed from: getLambda$-757085874$lib_compose_common_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21641getLambda$757085874$lib_compose_common_externalDebug() {
        return f9352lambda$757085874;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1018338427$lib_compose_common_externalDebug() {
        return lambda$1018338427;
    }

    public final Function2<Composer, Integer, Unit> getLambda$120173800$lib_compose_common_externalDebug() {
        return lambda$120173800;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1435939349$lib_compose_common_externalDebug() {
        return lambda$1435939349;
    }

    public final Function2<Composer, Integer, Unit> getLambda$201099925$lib_compose_common_externalDebug() {
        return lambda$201099925;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2070041798$lib_compose_common_externalDebug() {
        return lambda$2070041798;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2087515741$lib_compose_common_externalDebug() {
        return lambda$2087515741;
    }

    public final Function2<Composer, Integer, Unit> getLambda$737354897$lib_compose_common_externalDebug() {
        return lambda$737354897;
    }

    public final Function2<Composer, Integer, Unit> getLambda$968783968$lib_compose_common_externalDebug() {
        return lambda$968783968;
    }
}
