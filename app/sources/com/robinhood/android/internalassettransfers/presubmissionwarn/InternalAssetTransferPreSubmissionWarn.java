package com.robinhood.android.internalassettransfers.presubmissionwarn;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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

/* compiled from: InternalAssetTransferPreSubmissionWarn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferPreSubmissionWarn {
    public static final InternalAssetTransferPreSubmissionWarn INSTANCE = new InternalAssetTransferPreSubmissionWarn();

    /* renamed from: lambda$-602590333, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9055lambda$602590333 = ComposableLambda3.composableLambdaInstance(-602590333, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt$lambda$-602590333$1
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
                ComposerKt.traceEventStart(-602590333, i, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt.lambda$-602590333.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:76)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BoxScope, Composer, Integer, Unit> lambda$1864772510 = ComposableLambda3.composableLambdaInstance(1864772510, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt$lambda$1864772510$1
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
                ComposerKt.traceEventStart(1864772510, i, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt.lambda$1864772510.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:84)");
            }
            BentoProgressBar2.m20698BentoProgressBarjB83MbM(1.0f, null, 0, 0L, 0L, false, composer, 6, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$62312693 = ComposableLambda3.composableLambdaInstance(62312693, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt$lambda$62312693$1
        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(62312693, i, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt.lambda$62312693.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:99)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_pre_submission_warn_title_text, composer, 0), modifierFillMaxWidth$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 48, 0, 8120);
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

    /* renamed from: lambda$-1494727586, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9054lambda$1494727586 = ComposableLambda3.composableLambdaInstance(-1494727586, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt$lambda$-1494727586$1
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
                ComposerKt.traceEventStart(-1494727586, i, -1, "com.robinhood.android.internalassettransfers.presubmissionwarn.ComposableSingletons$InternalAssetTransferPreSubmissionWarnKt.lambda$-1494727586.<anonymous> (InternalAssetTransferPreSubmissionWarn.kt:114)");
            }
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1494727586$feature_internal_asset_transfers_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2101xb3b94bd2() {
        return f9054lambda$1494727586;
    }

    /* renamed from: getLambda$-602590333$feature_internal_asset_transfers_externalDebug */
    public final Function2<Composer, Integer, Unit> m2102x256d3894() {
        return f9055lambda$602590333;
    }

    /* renamed from: getLambda$1864772510$feature_internal_asset_transfers_externalDebug */
    public final Function3<BoxScope, Composer, Integer, Unit> m2103x67159b7f() {
        return lambda$1864772510;
    }

    /* renamed from: getLambda$62312693$feature_internal_asset_transfers_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m2104x4e231e0e() {
        return lambda$62312693;
    }
}
