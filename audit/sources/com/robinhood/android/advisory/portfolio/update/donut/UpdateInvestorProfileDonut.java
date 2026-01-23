package com.robinhood.android.advisory.portfolio.update.donut;

import advisory.update_investor_profile.proto.p009v1.Direction;
import androidx.compose.foundation.Background3;
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
import com.robinhood.android.advisory.portfolio.update.donut.UpdateInvestorProfileDonutData;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UpdateInvestorProfileDonut.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.portfolio.update.donut.ComposableSingletons$UpdateInvestorProfileDonutKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class UpdateInvestorProfileDonut {
    public static final UpdateInvestorProfileDonut INSTANCE = new UpdateInvestorProfileDonut();

    /* renamed from: lambda$-1174500662, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8648lambda$1174500662 = ComposableLambda3.composableLambdaInstance(-1174500662, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.donut.ComposableSingletons$UpdateInvestorProfileDonutKt$lambda$-1174500662$1
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
                ComposerKt.traceEventStart(-1174500662, i, -1, "com.robinhood.android.advisory.portfolio.update.donut.ComposableSingletons$UpdateInvestorProfileDonutKt.lambda$-1174500662.<anonymous> (UpdateInvestorProfileDonut.kt:91)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
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
            UpdateInvestorProfileDonut3.UpdateInvestorProfileDonut(new UpdateInvestorProfileDonutData("New", "Stocks 90%\nBonds 10%", extensions2.persistentListOf(new UpdateInvestorProfileDonutData.Slice("Value 33%", "Increase 5%", 0.33f, Direction.f20UP), new UpdateInvestorProfileDonutData.Slice("Growth 33%", "No change", 0.33f, Direction.FLAT), new UpdateInvestorProfileDonutData.Slice("Value 33%", "Decrease 5%", 0.34f, Direction.DOWN))), null, composer, 0, 2);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1174500662$feature_advisory_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11186getLambda$1174500662$feature_advisory_portfolio_externalDebug() {
        return f8648lambda$1174500662;
    }
}
