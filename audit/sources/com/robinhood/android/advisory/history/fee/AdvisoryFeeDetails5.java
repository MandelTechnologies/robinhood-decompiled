package com.robinhood.android.advisory.history.fee;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.history.C8736R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFeeDetails.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryFeeDetails5 {
    public static final AdvisoryFeeDetails5 INSTANCE = new AdvisoryFeeDetails5();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1286332738 = ComposableLambda3.composableLambdaInstance(1286332738, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsKt$lambda$1286332738$1
        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1286332738, i, -1, "com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsKt.lambda$1286332738.<anonymous> (AdvisoryFeeDetails.kt:133)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
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
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8736R.string.advisory_fee_title, composer, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
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
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$1152556235 = ComposableLambda3.composableLambdaInstance(1152556235, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsKt$lambda$1152556235$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1152556235, i2, -1, "com.robinhood.android.advisory.history.fee.ComposableSingletons$AdvisoryFeeDetailsKt.lambda$1152556235.<anonymous> (AdvisoryFeeDetails.kt:143)");
            }
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, null, null, null, null, null, false, false, false, 0L, null, composer, 0, 0, 4095);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-409030867, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8626lambda$409030867 = ComposableLambda3.composableLambdaInstance(-409030867, false, AdvisoryFeeDetails6.INSTANCE);

    /* renamed from: getLambda$-409030867$feature_advisory_history_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11031getLambda$409030867$feature_advisory_history_externalDebug() {
        return f8626lambda$409030867;
    }

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$1152556235$feature_advisory_history_externalDebug() {
        return lambda$1152556235;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1286332738$feature_advisory_history_externalDebug() {
        return lambda$1286332738;
    }
}
