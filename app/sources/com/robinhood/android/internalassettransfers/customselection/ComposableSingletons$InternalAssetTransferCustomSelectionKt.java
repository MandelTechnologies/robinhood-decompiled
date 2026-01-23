package com.robinhood.android.internalassettransfers.customselection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferCustomSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$InternalAssetTransferCustomSelectionKt {
    public static final ComposableSingletons$InternalAssetTransferCustomSelectionKt INSTANCE = new ComposableSingletons$InternalAssetTransferCustomSelectionKt();

    /* renamed from: lambda$-819549088, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9048lambda$819549088 = ComposableLambda3.composableLambdaInstance(-819549088, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$-819549088$1
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
                ComposerKt.traceEventStart(-819549088, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$-819549088.<anonymous> (InternalAssetTransferCustomSelection.kt:129)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1193822149, reason: not valid java name */
    private static Function3<BoxScope, Composer, Integer, Unit> f9044lambda$1193822149 = ComposableLambda3.composableLambdaInstance(-1193822149, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$-1193822149$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1193822149, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$-1193822149.<anonymous> (InternalAssetTransferCustomSelection.kt:167)");
            }
            BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.6f, null, 0, 0L, 0L, false, composer, 6, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$281890608 = ComposableLambda3.composableLambdaInstance(281890608, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$281890608$1
        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(281890608, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$281890608.<anonymous> (InternalAssetTransferCustomSelection.kt:185)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_title_text, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 48, 0, 8120);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), composer, 0);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int iM7919getCentere0LSkKk2 = companion3.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_subtitle_text, composer, 0), modifierFillMaxWidth$default2, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 48, 0, 8120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: lambda$-1481249831, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9045lambda$1481249831 = ComposableLambda3.composableLambdaInstance(-1481249831, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$-1481249831$1
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
                ComposerKt.traceEventStart(-1481249831, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$-1481249831.<anonymous> (InternalAssetTransferCustomSelection.kt:205)");
            }
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-778596042, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9047lambda$778596042 = ComposableLambda3.composableLambdaInstance(-778596042, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$-778596042$1
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
                ComposerKt.traceEventStart(-778596042, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$-778596042.<anonymous> (InternalAssetTransferCustomSelection.kt:227)");
            }
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1523836102, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9046lambda$1523836102 = ComposableLambda3.composableLambdaInstance(-1523836102, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$-1523836102$1
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
                ComposerKt.traceEventStart(-1523836102, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$-1523836102.<anonymous> (InternalAssetTransferCustomSelection.kt:275)");
            }
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$693655182 = ComposableLambda3.composableLambdaInstance(693655182, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$693655182$1
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
                ComposerKt.traceEventStart(693655182, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$693655182.<anonymous> (InternalAssetTransferCustomSelection.kt:286)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C18977R.string.f4208x77058fae, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$542597061 = ComposableLambda3.composableLambdaInstance(542597061, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$542597061$1
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
                ComposerKt.traceEventStart(542597061, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$542597061.<anonymous> (InternalAssetTransferCustomSelection.kt:296)");
            }
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1864802024 = ComposableLambda3.composableLambdaInstance(1864802024, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt$lambda$1864802024$1
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
                ComposerKt.traceEventStart(1864802024, i, -1, "com.robinhood.android.internalassettransfers.customselection.ComposableSingletons$InternalAssetTransferCustomSelectionKt.lambda$1864802024.<anonymous> (InternalAssetTransferCustomSelection.kt:385)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1193822149$feature_internal_asset_transfers_externalDebug */
    public final Function3<BoxScope, Composer, Integer, Unit> m2079xba10d66f() {
        return f9044lambda$1193822149;
    }

    /* renamed from: getLambda$-1481249831$feature_internal_asset_transfers_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2080x130c3a6c() {
        return f9045lambda$1481249831;
    }

    /* renamed from: getLambda$-1523836102$feature_internal_asset_transfers_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2081x46f0096a() {
        return f9046lambda$1523836102;
    }

    /* renamed from: getLambda$-778596042$feature_internal_asset_transfers_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2082x6a9b903f() {
        return f9047lambda$778596042;
    }

    /* renamed from: getLambda$-819549088$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2083xcc3feadd() {
        return f9048lambda$819549088;
    }

    /* renamed from: getLambda$1864802024$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2084xe1c7f749() {
        return lambda$1864802024;
    }

    /* renamed from: getLambda$281890608$feature_internal_asset_transfers_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2085x85624ba() {
        return lambda$281890608;
    }

    /* renamed from: getLambda$542597061$feature_internal_asset_transfers_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2086x70964ce9() {
        return lambda$542597061;
    }

    /* renamed from: getLambda$693655182$feature_internal_asset_transfers_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2087xd3d7512f() {
        return lambda$693655182;
    }
}
