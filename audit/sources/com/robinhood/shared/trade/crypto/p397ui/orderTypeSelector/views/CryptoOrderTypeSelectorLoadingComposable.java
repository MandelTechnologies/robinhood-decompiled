package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
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
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeSelectorOrderRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeSelectorRow2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeSelectorLoadingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.ComposableSingletons$CryptoOrderTypeSelectorLoadingComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderTypeSelectorLoadingComposable {
    public static final CryptoOrderTypeSelectorLoadingComposable INSTANCE = new CryptoOrderTypeSelectorLoadingComposable();
    private static Function2<Composer, Integer, Unit> lambda$735668949 = ComposableLambda3.composableLambdaInstance(735668949, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.ComposableSingletons$CryptoOrderTypeSelectorLoadingComposableKt$lambda$735668949$1
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
                ComposerKt.traceEventStart(735668949, i, -1, "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.ComposableSingletons$CryptoOrderTypeSelectorLoadingComposableKt.lambda$735668949.<anonymous> (CryptoOrderTypeSelectorLoadingComposable.kt:25)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer, 6, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw("-------------", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 6, 0, 8188);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int i3 = C20690R.drawable.pict_clr_rds_order_types_buy_with_dollars;
            StringResource.Companion companion3 = StringResource.INSTANCE;
            CryptoOrderTypeSelectorOrderRowState cryptoOrderTypeSelectorOrderRowState = new CryptoOrderTypeSelectorOrderRowState(i3, companion3.invoke("--------------------"), companion3.invoke("----------------------------------------"), false, true, false, null, 104, null);
            int i4 = CryptoOrderTypeSelectorOrderRowState.$stable;
            CryptoOrderTypeSelectorRow2.CryptoOrderTypeSelectorRow(cryptoOrderTypeSelectorOrderRowState, modifierFillMaxWidth$default, composer, i4 | 48, 0);
            CryptoOrderTypeSelectorRow2.CryptoOrderTypeSelectorRow(new CryptoOrderTypeSelectorOrderRowState(C20690R.drawable.pict_clr_rds_order_types_buy_with_dollars, companion3.invoke("--------------------"), companion3.invoke("----------------------------------------"), false, true, false, null, 104, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer, i4 | 48, 0);
            BentoText2.m20747BentoText38GnDrw("-------------", androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 6, 0, 8188);
            CryptoOrderTypeSelectorRow2.CryptoOrderTypeSelectorRow(new CryptoOrderTypeSelectorOrderRowState(C20690R.drawable.pict_clr_rds_order_types_buy_with_dollars, companion3.invoke("--------------------"), companion3.invoke("----------------------------------------"), false, true, false, null, 104, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer, i4 | 48, 0);
            CryptoOrderTypeSelectorRow2.CryptoOrderTypeSelectorRow(new CryptoOrderTypeSelectorOrderRowState(C20690R.drawable.pict_clr_rds_order_types_buy_with_dollars, companion3.invoke("--------------------"), companion3.invoke("----------------------------------------"), false, true, false, null, 104, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer, i4 | 48, 0);
            CryptoOrderTypeSelectorRow2.CryptoOrderTypeSelectorRow(new CryptoOrderTypeSelectorOrderRowState(C20690R.drawable.pict_clr_rds_order_types_buy_with_dollars, companion3.invoke("--------------------"), companion3.invoke("----------------------------------------"), false, true, false, null, 104, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer, i4 | 48, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1494427354 = ComposableLambda3.composableLambdaInstance(1494427354, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.ComposableSingletons$CryptoOrderTypeSelectorLoadingComposableKt$lambda$1494427354$1
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
                ComposerKt.traceEventStart(1494427354, i, -1, "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.views.ComposableSingletons$CryptoOrderTypeSelectorLoadingComposableKt.lambda$1494427354.<anonymous> (CryptoOrderTypeSelectorLoadingComposable.kt:97)");
            }
            CryptoOrderTypeSelectorLoadingComposable4.CryptoOrderTypeSelectorLoadingComposable(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1494427354$feature_trade_crypto_externalDebug() {
        return lambda$1494427354;
    }

    public final Function2<Composer, Integer, Unit> getLambda$735668949$feature_trade_crypto_externalDebug() {
        return lambda$735668949;
    }
}
