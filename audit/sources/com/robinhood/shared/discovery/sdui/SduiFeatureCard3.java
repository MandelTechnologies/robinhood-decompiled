package com.robinhood.shared.discovery.sdui;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagDefaults;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiFeatureCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.discovery.sdui.SduiFeatureCardKt$LiveBadgeWithPulse$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class SduiFeatureCard3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ long $bg;
    final /* synthetic */ SnapshotState<LayoutCoordinates> $boxCoordinates$delegate;
    final /* synthetic */ Density $density;
    final /* synthetic */ float $iconBoxSize;
    final /* synthetic */ SnapshotState<Offset> $iconCenter$delegate;
    final /* synthetic */ float $innerDotSize;
    final /* synthetic */ float $startPaddingFromInnerDot;
    final /* synthetic */ String $text;

    SduiFeatureCard3(float f, float f2, String str, long j, SnapshotState<LayoutCoordinates> snapshotState, SnapshotState<Offset> snapshotState2, Density density, float f3) {
        this.$startPaddingFromInnerDot = f;
        this.$iconBoxSize = f2;
        this.$text = str;
        this.$bg = j;
        this.$boxCoordinates$delegate = snapshotState;
        this.$iconCenter$delegate = snapshotState2;
        this.$density = density;
        this.$innerDotSize = f3;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-131607556, i, -1, "com.robinhood.shared.discovery.sdui.LiveBadgeWithPulse.<anonymous>.<anonymous> (SduiFeatureCard.kt:406)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, this.$startPaddingFromInnerDot, 0.0f, InfoTagDefaults.INSTANCE.m20816getInternalPaddingEndD9Ej5fM(), 0.0f, 10, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        float f = this.$iconBoxSize;
        String str = this.$text;
        final long j = this.$bg;
        final SnapshotState<LayoutCoordinates> snapshotState = this.$boxCoordinates$delegate;
        final SnapshotState<Offset> snapshotState2 = this.$iconCenter$delegate;
        final Density density = this.$density;
        final float f2 = this.$innerDotSize;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, f);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM5169size3ABfNKs, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM());
        composer.startReplaceGroup(-1633490746);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureCardKt$LiveBadgeWithPulse$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SduiFeatureCard3.invoke$lambda$6$lambda$1$lambda$0(snapshotState, snapshotState2, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5143paddingVpY3zN4, (Function1) objRememberedValue);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierOnGloballyPositioned);
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(companion, f);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(j) | composer.changed(density);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.discovery.sdui.SduiFeatureCardKt$LiveBadgeWithPulse$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SduiFeatureCard3.invoke$lambda$6$lambda$5$lambda$4$lambda$3(j, density, f2, (DrawScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Canvas2.Canvas(modifierM5169size3ABfNKs2, (Function1) objRememberedValue2, composer, 6);
        composer.endNode();
        TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer, 24576, 0, 8170);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$1$lambda$0(SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates coords) {
        Intrinsics.checkNotNullParameter(coords, "coords");
        LayoutCoordinates layoutCoordinatesLiveBadgeWithPulse$lambda$26 = SduiFeatureCard2.LiveBadgeWithPulse$lambda$26(snapshotState);
        if (layoutCoordinatesLiveBadgeWithPulse$lambda$26 == null) {
            return Unit.INSTANCE;
        }
        long jPositionInRoot = LayoutCoordinates2.positionInRoot(coords);
        long jM8065getCenterozmzZPI = IntSize2.m8065getCenterozmzZPI(coords.mo7241getSizeYbymL2g());
        float fM8038getXimpl = IntOffset.m8038getXimpl(jM8065getCenterozmzZPI);
        float fM8039getYimpl = IntOffset.m8039getYimpl(jM8065getCenterozmzZPI);
        SduiFeatureCard2.LiveBadgeWithPulse$lambda$30(snapshotState2, Offset.m6546minusMKHz9U(Offset.m6547plusMKHz9U(jPositionInRoot, Offset.m6535constructorimpl((Float.floatToRawIntBits(fM8038getXimpl) << 32) | (Float.floatToRawIntBits(fM8039getYimpl) & 4294967295L))), LayoutCoordinates2.positionInRoot(layoutCoordinatesLiveBadgeWithPulse$lambda$26)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(long j, Density density, float f, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, density.mo5016toPx0680j_4(f), Canvas.mo6962getCenterF1C5BW0(), 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }
}
