package com.robinhood.android.optionschain.chainsettings;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainMetricCard.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0001¢\u0006\u0002\u0010\u001a\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001f"}, m3636d2 = {"MetricCardVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "MetricCategoryPillHorizontalPadding", "MetricCategoryPillVerticalPadding", "CategoryCornerRadius", "MetricTypeCardVerticalPadding", "MetricCard", "", "Landroidx/compose/foundation/layout/RowScope;", "title", "", "subtitle", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "border", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "onClick", "Lkotlin/Function0;", "MetricCard-hYmLsZ8", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/foundation/BorderStroke;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MetricCategoryPill", "categoryLabel", "isSelected", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getCategoryPillColors", "Landroidx/compose/material3/ButtonColors;", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "MetricTypeCard", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainMetricCard {
    private static final float CategoryCornerRadius;
    private static final float MetricCategoryPillHorizontalPadding;
    private static final float MetricCardVerticalPadding = C2002Dp.m7995constructorimpl(10);
    private static final float MetricCategoryPillVerticalPadding = C2002Dp.m7995constructorimpl(2);
    private static final float MetricTypeCardVerticalPadding = C2002Dp.m7995constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricCard_hYmLsZ8$lambda$2(Row5 row5, String str, String str2, long j, BorderStroke borderStroke, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        m17181MetricCardhYmLsZ8(row5, str, str2, j, borderStroke, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricCategoryPill$lambda$3(String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        MetricCategoryPill(str, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetricTypeCard$lambda$4(String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        MetricTypeCard(str, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /* renamed from: MetricCard-hYmLsZ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17181MetricCardhYmLsZ8(final Row5 MetricCard, final String title, final String subtitle, long j, BorderStroke borderStroke, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        long jM21372getBg20d7_KjU;
        BorderStroke borderStroke2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        int i6;
        boolean z3;
        long j2;
        Function0<Unit> function03;
        BorderStroke borderStroke3;
        Composer composer2;
        final Function0<Unit> function04;
        final BorderStroke borderStroke4;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(MetricCard, "$this$MetricCard");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Composer composerStartRestartGroup = composer.startRestartGroup(1025196884);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(MetricCard) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(subtitle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 4) == 0) {
                jM21372getBg20d7_KjU = j;
                int i7 = composerStartRestartGroup.changed(jM21372getBg20d7_KjU) ? 2048 : 1024;
                i3 |= i7;
            } else {
                jM21372getBg20d7_KjU = j;
            }
            i3 |= i7;
        } else {
            jM21372getBg20d7_KjU = j;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                borderStroke2 = borderStroke;
                i3 |= composerStartRestartGroup.changed(borderStroke2) ? 16384 : 8192;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -7169;
                            }
                        } else {
                            if ((i2 & 4) != 0) {
                                jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU();
                                i3 &= -7169;
                            }
                            if (i8 != 0) {
                                borderStroke2 = null;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                i6 = i3;
                                z3 = z2;
                                j2 = jM21372getBg20d7_KjU;
                                function03 = (Function0) objRememberedValue;
                                borderStroke3 = borderStroke2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1025196884, i6, -1, "com.robinhood.android.optionschain.chainsettings.MetricCard (OptionChainMetricCard.kt:37)");
                            }
                            Modifier modifierWeight$default = Row5.weight$default(MetricCard, Modifier.INSTANCE, 1.0f, false, 2, null);
                            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                            CardDefaults cardDefaults = CardDefaults.INSTANCE;
                            Color.Companion companion = Color.INSTANCE;
                            long jM6726getUnspecified0d7_KjU = companion.m6726getUnspecified0d7_KjU();
                            long jM6726getUnspecified0d7_KjU2 = companion.m6726getUnspecified0d7_KjU();
                            long jM6726getUnspecified0d7_KjU3 = companion.m6726getUnspecified0d7_KjU();
                            BorderStroke borderStroke5 = borderStroke3;
                            int i9 = i6 >> 9;
                            int i10 = CardDefaults.$stable;
                            long j4 = j2;
                            z2 = z3;
                            composer2 = composerStartRestartGroup;
                            Function0<Unit> function05 = function03;
                            CardKt.Card(function05, modifierWeight$default, z2, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults.m5729cardColorsro_MJ88(j2, jM6726getUnspecified0d7_KjU, jM6726getUnspecified0d7_KjU3, jM6726getUnspecified0d7_KjU2, composerStartRestartGroup, (i9 & 14) | 3504 | (i10 << 12), 0), cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i10 << 18) | 6, 62), borderStroke5, null, ComposableLambda3.rememberComposableLambda(-545842945, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt$MetricCard$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                    invoke(column5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 Card, Composer composer3, int i11) {
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i11 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-545842945, i11, -1, "com.robinhood.android.optionschain.chainsettings.MetricCard.<anonymous> (OptionChainMetricCard.kt:53)");
                                    }
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    float f = OptionChainMetricCard.MetricCardVerticalPadding;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i12 = BentoTheme.$stable;
                                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer3, i12).m21590getDefaultD9Ej5fM(), f);
                                    String str = title;
                                    String str2 = subtitle;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i12).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getTextS(), composer3, 0, 0, 8186);
                                    BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getTextS(), composer3, 0, 0, 8186);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, (i9 & 896) | ((i6 >> 18) & 14) | 100663296 | (3670016 & (i6 << 6)), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function04 = function05;
                            borderStroke4 = borderStroke5;
                            j3 = j4;
                        }
                        i6 = i3;
                        z3 = z2;
                        j2 = jM21372getBg20d7_KjU;
                        borderStroke3 = borderStroke2;
                        function03 = function02;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierWeight$default2 = Row5.weight$default(MetricCard, Modifier.INSTANCE, 1.0f, false, 2, null);
                        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                        CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                        Color.Companion companion2 = Color.INSTANCE;
                        long jM6726getUnspecified0d7_KjU4 = companion2.m6726getUnspecified0d7_KjU();
                        long jM6726getUnspecified0d7_KjU22 = companion2.m6726getUnspecified0d7_KjU();
                        long jM6726getUnspecified0d7_KjU32 = companion2.m6726getUnspecified0d7_KjU();
                        BorderStroke borderStroke52 = borderStroke3;
                        int i92 = i6 >> 9;
                        int i102 = CardDefaults.$stable;
                        long j42 = j2;
                        z2 = z3;
                        composer2 = composerStartRestartGroup;
                        Function0<Unit> function052 = function03;
                        CardKt.Card(function052, modifierWeight$default2, z2, roundedCornerShapeM5327RoundedCornerShape0680j_42, cardDefaults2.m5729cardColorsro_MJ88(j2, jM6726getUnspecified0d7_KjU4, jM6726getUnspecified0d7_KjU32, jM6726getUnspecified0d7_KjU22, composerStartRestartGroup, (i92 & 14) | 3504 | (i102 << 12), 0), cardDefaults2.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i102 << 18) | 6, 62), borderStroke52, null, ComposableLambda3.rememberComposableLambda(-545842945, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt$MetricCard$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                invoke(column5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 Card, Composer composer3, int i11) {
                                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                if ((i11 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-545842945, i11, -1, "com.robinhood.android.optionschain.chainsettings.MetricCard.<anonymous> (OptionChainMetricCard.kt:53)");
                                }
                                Modifier.Companion companion22 = Modifier.INSTANCE;
                                float f = OptionChainMetricCard.MetricCardVerticalPadding;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i12 = BentoTheme.$stable;
                                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion22, bentoTheme.getSpacing(composer3, i12).m21590getDefaultD9Ej5fM(), f);
                                String str = title;
                                String str2 = subtitle;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i12).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getTextS(), composer3, 0, 0, 8186);
                                BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getTextS(), composer3, 0, 0, 8186);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, (i92 & 896) | ((i6 >> 18) & 14) | 100663296 | (3670016 & (i6 << 6)), 128);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function052;
                        borderStroke4 = borderStroke52;
                        j3 = j42;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        j3 = jM21372getBg20d7_KjU;
                        borderStroke4 = borderStroke2;
                        function04 = function02;
                    }
                    final boolean z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return OptionChainMetricCard.MetricCard_hYmLsZ8$lambda$2(MetricCard, title, subtitle, j3, borderStroke4, z4, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                function02 = function0;
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if ((i2 & 4) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                            i6 = i3;
                            z3 = z2;
                            j2 = jM21372getBg20d7_KjU;
                            borderStroke3 = borderStroke2;
                            function03 = function02;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierWeight$default22 = Row5.weight$default(MetricCard, Modifier.INSTANCE, 1.0f, false, 2, null);
                        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_422 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                        CardDefaults cardDefaults22 = CardDefaults.INSTANCE;
                        Color.Companion companion22 = Color.INSTANCE;
                        long jM6726getUnspecified0d7_KjU42 = companion22.m6726getUnspecified0d7_KjU();
                        long jM6726getUnspecified0d7_KjU222 = companion22.m6726getUnspecified0d7_KjU();
                        long jM6726getUnspecified0d7_KjU322 = companion22.m6726getUnspecified0d7_KjU();
                        BorderStroke borderStroke522 = borderStroke3;
                        int i922 = i6 >> 9;
                        int i1022 = CardDefaults.$stable;
                        long j422 = j2;
                        z2 = z3;
                        composer2 = composerStartRestartGroup;
                        Function0<Unit> function0522 = function03;
                        CardKt.Card(function0522, modifierWeight$default22, z2, roundedCornerShapeM5327RoundedCornerShape0680j_422, cardDefaults22.m5729cardColorsro_MJ88(j2, jM6726getUnspecified0d7_KjU42, jM6726getUnspecified0d7_KjU322, jM6726getUnspecified0d7_KjU222, composerStartRestartGroup, (i922 & 14) | 3504 | (i1022 << 12), 0), cardDefaults22.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i1022 << 18) | 6, 62), borderStroke522, null, ComposableLambda3.rememberComposableLambda(-545842945, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt$MetricCard$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                invoke(column5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 Card, Composer composer3, int i11) {
                                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                if ((i11 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-545842945, i11, -1, "com.robinhood.android.optionschain.chainsettings.MetricCard.<anonymous> (OptionChainMetricCard.kt:53)");
                                }
                                Modifier.Companion companion222 = Modifier.INSTANCE;
                                float f = OptionChainMetricCard.MetricCardVerticalPadding;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i12 = BentoTheme.$stable;
                                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion222, bentoTheme.getSpacing(composer3, i12).m21590getDefaultD9Ej5fM(), f);
                                String str = title;
                                String str2 = subtitle;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5143paddingVpY3zN4);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i12).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getTextS(), composer3, 0, 0, 8186);
                                BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i12).getTextS(), composer3, 0, 0, 8186);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, (i922 & 896) | ((i6 >> 18) & 14) | 100663296 | (3670016 & (i6 << 6)), 128);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function0522;
                        borderStroke4 = borderStroke522;
                        j3 = j422;
                    }
                }
                final boolean z42 = z2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((599187 & i3) == 599186) {
            }
            final boolean z422 = z2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        borderStroke2 = borderStroke;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((599187 & i3) == 599186) {
        }
        final boolean z4222 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void MetricCategoryPill(final String categoryLabel, final boolean z, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(categoryLabel, "categoryLabel");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(923232489);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(categoryLabel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(923232489, i2, -1, "com.robinhood.android.optionschain.chainsettings.MetricCategoryPill (OptionChainMetricCard.kt:75)");
            }
            float f = 1;
            ButtonKt.OutlinedButton(onClick, SizeKt.m5154defaultMinSizeVpY3zN4(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f)), true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(CategoryCornerRadius), getCategoryPillColors(z, composerStartRestartGroup, (i2 >> 3) & 14), null, null, PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)), null, ComposableLambda3.rememberComposableLambda(358861019, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt.MetricCategoryPill.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 OutlinedButton, Composer composer2, int i3) {
                    long jM21961getContentColor0d7_KjU;
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(358861019, i3, -1, "com.robinhood.android.optionschain.chainsettings.MetricCategoryPill.<anonymous> (OptionChainMetricCard.kt:88)");
                    }
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, OptionChainMetricCard.MetricCategoryPillHorizontalPadding, OptionChainMetricCard.MetricCategoryPillVerticalPadding);
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    TextStyle textS = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS();
                    if (z) {
                        composer2.startReplaceGroup(655383087);
                        jM21961getContentColor0d7_KjU = ((Styles) composer2.consume(Styles2.getLocalStyles())).getSpanButton(composer2, 0).getActiveColors().m21961getContentColor0d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(655476397);
                        jM21961getContentColor0d7_KjU = ((Styles) composer2.consume(Styles2.getLocalStyles())).getSpanButton(composer2, 0).getInactiveColors().m21961getContentColor0d7_KjU();
                        composer2.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(categoryLabel, modifierM5143paddingVpY3zN4, Color.m6701boximpl(jM21961getContentColor0d7_KjU), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composer2, 24624, 0, 8168);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 819659184, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainMetricCard.MetricCategoryPill$lambda$3(categoryLabel, z, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ButtonColors getCategoryPillColors(boolean z, Composer composer, int i) {
        Composer composer2;
        ButtonColors buttonColorsM5719buttonColorsro_MJ88;
        composer.startReplaceGroup(-1987110962);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1987110962, i, -1, "com.robinhood.android.optionschain.chainsettings.getCategoryPillColors (OptionChainMetricCard.kt:106)");
        }
        SpanButtonStyle spanButton = ((Styles) composer.consume(Styles2.getLocalStyles())).getSpanButton(composer, 0);
        if (z) {
            composer.startReplaceGroup(-488250852);
            composer2 = composer;
            buttonColorsM5719buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(spanButton.getActiveColors().m21960getBackgroundColor0d7_KjU(), spanButton.getActiveColors().m21961getContentColor0d7_KjU(), spanButton.getActiveColors().m21962getDisabledBackgroundColor0d7_KjU(), spanButton.getActiveColors().m21963getDisabledContentColor0d7_KjU(), composer2, ButtonDefaults.$stable << 12, 0);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-487871660);
            buttonColorsM5719buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(spanButton.getInactiveColors().m21960getBackgroundColor0d7_KjU(), spanButton.getInactiveColors().m21961getContentColor0d7_KjU(), spanButton.getInactiveColors().m21962getDisabledBackgroundColor0d7_KjU(), spanButton.getInactiveColors().m21963getDisabledContentColor0d7_KjU(), composer2, ButtonDefaults.$stable << 12, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return buttonColorsM5719buttonColorsro_MJ88;
    }

    static {
        float f = 12;
        MetricCategoryPillHorizontalPadding = C2002Dp.m7995constructorimpl(f);
        CategoryCornerRadius = C2002Dp.m7995constructorimpl(f);
    }

    public static final void MetricTypeCard(final String title, final boolean z, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        long jM21372getBg20d7_KjU;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1430718410);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1430718410, i2, -1, "com.robinhood.android.optionschain.chainsettings.MetricTypeCard (OptionChainMetricCard.kt:130)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM());
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            Color.Companion companion = Color.INSTANCE;
            long jM6726getUnspecified0d7_KjU = companion.m6726getUnspecified0d7_KjU();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(723638164);
                jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(723699575);
                jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            long j = jM21372getBg20d7_KjU;
            long jM6726getUnspecified0d7_KjU2 = companion.m6726getUnspecified0d7_KjU();
            long jM6726getUnspecified0d7_KjU3 = companion.m6726getUnspecified0d7_KjU();
            int i4 = CardDefaults.$stable;
            CardKt.Card(onClick, null, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults.m5729cardColorsro_MJ88(j, jM6726getUnspecified0d7_KjU, jM6726getUnspecified0d7_KjU3, jM6726getUnspecified0d7_KjU2, composerStartRestartGroup, (i4 << 12) | 3504, 0), cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i4 << 18) | 6, 62), null, null, ComposableLambda3.rememberComposableLambda(-1696863253, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt.MetricTypeCard.1
                public final void invoke(Column5 Card, Composer composer2, int i5) {
                    long jM21425getFg0d7_KjU;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1696863253, i5, -1, "com.robinhood.android.optionschain.chainsettings.MetricTypeCard.<anonymous> (OptionChainMetricCard.kt:146)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    float f = OptionChainMetricCard.MetricTypeCardVerticalPadding;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme2.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), f);
                    String str = title;
                    boolean z2 = z;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5143paddingVpY3zN4);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    if (z2) {
                        composer2.startReplaceGroup(297793381);
                        jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i6).m21371getBg0d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(297858853);
                        jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i6).m21425getFg0d7_KjU();
                        composer2.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, z2 ? FontWeight.INSTANCE.getBold() : null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i6).getTextS(), composer2, 0, 0, 8170);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                    invoke(column5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 6) & 14) | 100663296, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainMetricCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainMetricCard.MetricTypeCard$lambda$4(title, z, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
