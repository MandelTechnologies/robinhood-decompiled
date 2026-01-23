package com.robinhood.compose.bento.util;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.Spacing2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Padding.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\n\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"defaultHorizontalPadding", "Landroidx/compose/ui/Modifier;", "vertical", "Landroidx/compose/ui/unit/Dp;", "defaultHorizontalPadding-rAjV9yQ", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "top", "bottom", "defaultHorizontalPadding-WMci_g0", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "defaultFillMaxWidthPadding", "defaultFillMaxWidthPadding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "defaultFillMaxWidthPadding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "defaultScaffoldPadding", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class PaddingKt {
    /* renamed from: defaultFillMaxWidthPadding-3ABfNKs, reason: not valid java name */
    public static final Modifier m21618defaultFillMaxWidthPadding3ABfNKs(Modifier defaultFillMaxWidthPadding, float f) {
        Intrinsics.checkNotNullParameter(defaultFillMaxWidthPadding, "$this$defaultFillMaxWidthPadding");
        return m21620defaultFillMaxWidthPaddingVpY3zN4(defaultFillMaxWidthPadding, f, f);
    }

    /* renamed from: defaultFillMaxWidthPadding-VpY3zN4, reason: not valid java name */
    public static final Modifier m21620defaultFillMaxWidthPaddingVpY3zN4(Modifier defaultFillMaxWidthPadding, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(defaultFillMaxWidthPadding, "$this$defaultFillMaxWidthPadding");
        return ComposedModifier2.composed$default(defaultFillMaxWidthPadding, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.compose.bento.util.PaddingKt$defaultFillMaxWidthPadding$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1489496195);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1489496195, i, -1, "com.robinhood.compose.bento.util.defaultFillMaxWidthPadding.<anonymous> (Padding.kt:52)");
                }
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(composed, 0.0f, 1, null), f, f2, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM21622defaultHorizontalPaddingWMci_g0;
            }
        }, 1, null);
    }

    public static final Modifier defaultScaffoldPadding(Modifier modifier, PaddingValues paddingValues, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        composer.startReplaceGroup(-960812639);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-960812639, i, -1, "com.robinhood.compose.bento.util.defaultScaffoldPadding (Padding.kt:66)");
        }
        Modifier modifierM5145paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m5145paddingqDBjuR0(modifier, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), paddingValues.getTop(), ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), paddingValues.getBottom());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM5145paddingqDBjuR0;
    }

    /* renamed from: defaultFillMaxWidthPadding-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        return m21618defaultFillMaxWidthPadding3ABfNKs(modifier, f);
    }

    /* renamed from: defaultFillMaxWidthPadding-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2002Dp.m7995constructorimpl(0);
        }
        return m21620defaultFillMaxWidthPaddingVpY3zN4(modifier, f, f2);
    }

    /* renamed from: defaultHorizontalPadding-WMci_g0, reason: not valid java name */
    public static final Modifier m21622defaultHorizontalPaddingWMci_g0(Modifier defaultHorizontalPadding, float f, float f2, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(defaultHorizontalPadding, "$this$defaultHorizontalPadding");
        composer.startReplaceGroup(-682663636);
        if ((i2 & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f2 = C2002Dp.m7995constructorimpl(0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-682663636, i, -1, "com.robinhood.compose.bento.util.defaultHorizontalPadding (Padding.kt:37)");
        }
        Modifier modifierM5145paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m5145paddingqDBjuR0(defaultHorizontalPadding, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), f, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), f2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM5145paddingqDBjuR0;
    }

    /* renamed from: defaultHorizontalPadding-rAjV9yQ, reason: not valid java name */
    public static final Modifier m21623defaultHorizontalPaddingrAjV9yQ(Modifier defaultHorizontalPadding, float f, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(defaultHorizontalPadding, "$this$defaultHorizontalPadding");
        composer.startReplaceGroup(1951033330);
        if ((i2 & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1951033330, i, -1, "com.robinhood.compose.bento.util.defaultHorizontalPadding (Padding.kt:31)");
        }
        Modifier modifierM5143paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(defaultHorizontalPadding, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM5143paddingVpY3zN4;
    }
}
