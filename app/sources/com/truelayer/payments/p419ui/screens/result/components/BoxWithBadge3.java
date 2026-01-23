package com.truelayer.payments.p419ui.screens.result.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AcUnit;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoxWithBadge.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BoxWithBadge3 {
    public static final BoxWithBadge3 INSTANCE = new BoxWithBadge3();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<C2002Dp, Composer, Integer, Unit> f9628lambda1 = ComposableLambda3.composableLambdaInstance(-1935421483, false, new Function3<C2002Dp, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C2002Dp c2002Dp, Composer composer, Integer num) {
            m27148invoke8Feqmps(c2002Dp.getValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-8Feqmps, reason: not valid java name */
        public final void m27148invoke8Feqmps(float f, Composer composer, int i) {
            if ((i & 14) == 0) {
                i |= composer.changed(f) ? 4 : 2;
            }
            if ((i & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1935421483, i, -1, "com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt.lambda-1.<anonymous> (BoxWithBadge.kt:79)");
                }
                Badge2.m27143BadgeOkHde_KZM(f, 0L, 0L, composer, i & 14, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<C2002Dp, Composer, Integer, Unit> f9629lambda2 = ComposableLambda3.composableLambdaInstance(-83077620, false, new Function3<C2002Dp, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(C2002Dp c2002Dp, Composer composer, Integer num) {
            m27149invoke8Feqmps(c2002Dp.getValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-8Feqmps, reason: not valid java name */
        public final void m27149invoke8Feqmps(float f, Composer composer, int i) {
            if ((i & 14) == 0) {
                i |= composer.changed(f) ? 4 : 2;
            }
            if ((i & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-83077620, i, -1, "com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt.lambda-2.<anonymous> (BoxWithBadge.kt:100)");
                }
                Badge2.m27142BadgeFailedHde_KZM(f, 0L, 0L, composer, i & 14, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9630lambda3 = ComposableLambda3.composableLambdaInstance(1159635932, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1159635932, i, -1, "com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt.lambda-3.<anonymous> (BoxWithBadge.kt:74)");
                }
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(20));
                composer.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5142padding3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                Row6 row6 = Row6.INSTANCE;
                final long jM6727getWhite0d7_KjU = Color.INSTANCE.m6727getWhite0d7_KjU();
                float f = 120;
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f);
                BoxWithBadge3 boxWithBadge3 = BoxWithBadge3.INSTANCE;
                BoxWithBadge.m27144BoxWithBadgeDzVHIIc(null, fM7995constructorimpl, boxWithBadge3.m27145getLambda1$payments_ui_release(), ComposableLambda3.composableLambda(composer, 884436994, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt$lambda-3$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(884436994, i2, -1, "com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt.lambda-3.<anonymous>.<anonymous>.<anonymous> (BoxWithBadge.kt:84)");
                            }
                            ImageKt.Image(PainterResources_androidKt.painterResource(C42830R.drawable.flag_square_gb, composer2, 0), (String) null, Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), jM6727getWhite0d7_KjU, RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composer, 3504, 1);
                BoxWithBadge.m27144BoxWithBadgeDzVHIIc(null, C2002Dp.m7995constructorimpl(f), boxWithBadge3.m27146getLambda2$payments_ui_release(), ComposableLambda3.composableLambda(composer, -323444999, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt$lambda-3$1$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-323444999, i2, -1, "com.truelayer.payments.ui.screens.result.components.ComposableSingletons$BoxWithBadgeKt.lambda-3.<anonymous>.<anonymous>.<anonymous> (BoxWithBadge.kt:105)");
                            }
                            IconKt.m5872Iconww6aTOc(AcUnit.getAcUnit(Icons.Filled.INSTANCE), (String) null, Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), jM6727getWhite0d7_KjU, RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()), 0L, composer2, 48, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composer, 3504, 1);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function3<C2002Dp, Composer, Integer, Unit> m27145getLambda1$payments_ui_release() {
        return f9628lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function3<C2002Dp, Composer, Integer, Unit> m27146getLambda2$payments_ui_release() {
        return f9629lambda2;
    }

    /* renamed from: getLambda-3$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27147getLambda3$payments_ui_release() {
        return f9630lambda3;
    }
}
