package com.robinhood.shared.crypto.movers;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.crypto.movers.InstrumentPreviewCard4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InstrumentPreviewCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.movers.ComposableSingletons$InstrumentPreviewCardKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InstrumentPreviewCard {
    public static final InstrumentPreviewCard INSTANCE = new InstrumentPreviewCard();

    /* renamed from: lambda$-2119234127, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9408lambda$2119234127 = ComposableLambda3.composableLambdaInstance(-2119234127, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.movers.ComposableSingletons$InstrumentPreviewCardKt$lambda$-2119234127$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2119234127, i, -1, "com.robinhood.shared.crypto.movers.ComposableSingletons$InstrumentPreviewCardKt.lambda$-2119234127.<anonymous> (InstrumentPreviewCard.kt:270)");
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
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf();
            Direction direction = Direction.f5855UP;
            float f = 16;
            InstrumentPreviewCard3.InstrumentPreviewCard(new InstrumentPreviewCard4.Loaded(immutableList3PersistentListOf, direction, "+1.23%", "$123.45", ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "Bitcoin", null, 64, null), SizeKt.m5174width3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE)), null, composer, 48, 4);
            ImmutableList3 immutableList3PersistentListOf2 = extensions2.persistentListOf();
            ApiCryptoTradingOptions3 apiCryptoTradingOptions3 = ApiCryptoTradingOptions3.COMPACT_CARD;
            InstrumentPreviewCard4.Loaded loaded = new InstrumentPreviewCard4.Loaded(immutableList3PersistentListOf2, direction, "+1.23%", "$123.45", ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "Bitcoin", apiCryptoTradingOptions3);
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, C2002Dp.m7995constructorimpl(f));
            float f2 = EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
            InstrumentPreviewCard3.InstrumentPreviewCard(loaded, SizeKt.m5174width3ABfNKs(modifierM5142padding3ABfNKs, C2002Dp.m7995constructorimpl(f2)), null, composer, 48, 4);
            InstrumentPreviewCard3.InstrumentPreviewCard(new InstrumentPreviewCard4.Loaded(extensions2.persistentListOf(), Direction.DOWN, "-1.23%", "$123.45", ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, "Bitcoin", apiCryptoTradingOptions3), SizeKt.m5174width3ABfNKs(PaddingKt.m5142padding3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f2)), null, composer, 48, 4);
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

    /* renamed from: getLambda$-2119234127$lib_crypto_movers_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24924getLambda$2119234127$lib_crypto_movers_externalDebug() {
        return f9408lambda$2119234127;
    }
}
