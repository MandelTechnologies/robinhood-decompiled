package com.robinhood.android.futures.eventbrackets.p141ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: Bracket.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$BracketKt$lambda$-909625739$1, reason: use source file name */
/* loaded from: classes3.dex */
final class Bracket5 implements Function2<Composer, Integer, Unit> {
    public static final Bracket5 INSTANCE = new Bracket5();

    Bracket5() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-909625739, i, -1, "com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$BracketKt.lambda$-909625739.<anonymous> (Bracket.kt:74)");
        }
        final ImmutableList3<BracketRoundData> allRounds = SampleBracketData.getAllRounds();
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float f = 40;
        final int iMo5010roundToPx0680j_4 = density.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(f));
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(companion, C2002Dp.m7995constructorimpl(1200), C2002Dp.m7995constructorimpl(2000));
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5171sizeVpY3zN4);
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
        BracketNavigationInfo3 bracketNavigationInfo3 = new BracketNavigationInfo3(SampleBracketData.getBracketNavigationInfo());
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(density) | composer.changed(iMo5010roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new BracketState7() { // from class: com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$BracketKt$lambda$-909625739$1$1$1$1
                @Override // com.robinhood.android.futures.eventbrackets.p141ui.BracketState7
                public final int calculateRoundHeightPx(int i2) {
                    BracketRoundData bracketRoundData = (BracketRoundData) CollectionsKt.getOrNull(allRounds, i2);
                    return BracketHeightCalculationUtils.cardsTotalHeightPx(density, bracketRoundData != null ? bracketRoundData.getNumberOfCards() : 0) + iMo5010roundToPx0680j_4;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BracketState bracketStateRememberBracketState = BracketState8.rememberBracketState(0, bracketNavigationInfo3, null, null, (BracketState7) objRememberedValue, composer, 6, 12);
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.futures.eventbrackets.ui.ComposableSingletons$BracketKt$lambda$-909625739$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Bracket5.invoke$lambda$4$lambda$3$lambda$2((UUID) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Bracket2.m14627BracketTN_CM5M(bracketStateRememberBracketState, allRounds, fM7995constructorimpl, (Function1) objRememberedValue2, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composer, 28080, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
