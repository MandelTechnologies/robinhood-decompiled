package com.robinhood.shared.crypto.staking.staking.summary;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingSummaryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.summary.ComposableSingletons$CryptoStakingSummaryComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingSummaryComposable {
    public static final CryptoStakingSummaryComposable INSTANCE = new CryptoStakingSummaryComposable();
    private static Function2<Composer, Integer, Unit> lambda$2074791124 = ComposableLambda3.composableLambdaInstance(2074791124, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.ComposableSingletons$CryptoStakingSummaryComposableKt$lambda$2074791124$1
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
                ComposerKt.traceEventStart(2074791124, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.ComposableSingletons$CryptoStakingSummaryComposableKt.lambda$2074791124.<anonymous> (CryptoStakingSummaryComposable.kt:83)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1069140605 = ComposableLambda3.composableLambdaInstance(1069140605, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.summary.ComposableSingletons$CryptoStakingSummaryComposableKt$lambda$1069140605$1
        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1069140605, i, -1, "com.robinhood.shared.crypto.staking.staking.summary.ComposableSingletons$CryptoStakingSummaryComposableKt.lambda$1069140605.<anonymous> (CryptoStakingSummaryComposable.kt:197)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 6, 0, 16382);
            int i2 = 0;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer2, 0);
            composer2.startReplaceGroup(2071660138);
            while (i2 < 4) {
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, "---- -- ---- ------- ----", (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("-----------"), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer2, (BentoBaseRowState.$stable << 3) | 24576, 109);
                i2++;
                composer2 = composer;
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

    public final Function2<Composer, Integer, Unit> getLambda$1069140605$feature_crypto_staking_externalDebug() {
        return lambda$1069140605;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2074791124$feature_crypto_staking_externalDebug() {
        return lambda$2074791124;
    }
}
