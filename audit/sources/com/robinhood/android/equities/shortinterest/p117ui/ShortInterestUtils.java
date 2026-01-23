package com.robinhood.android.equities.shortinterest.p117ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ShortInterestUtils.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\b0\u00060\u0005\"\u0004\b\u0000\u0010\b2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000b0\nH\u0000\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0000\u001a!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0017\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"NET_MARGIN_LEGEND_ID", "", "ColorBarTestTag", "CircleIndicatorTestTag", "parseFloatKeys", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/Pair;", "", "T", "entries", "", "", "parseXAxisSnapPoints", "keys", "LegendColorIndicator", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "LegendColorIndicator-3J-VO9M", "(JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ColorBar", "ColorBar-3J-VO9M", "lib-short-interest_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.shortinterest.ui.ShortInterestUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ShortInterestUtils {
    public static final String CircleIndicatorTestTag = "CircleIndicatorTestTag";
    public static final String ColorBarTestTag = "ColorBarTestTag";
    public static final String NET_MARGIN_LEGEND_ID = "net_margin";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ColorBar_3J_VO9M$lambda$3(long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m13580ColorBar3JVO9M(j, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendColorIndicator_3J_VO9M$lambda$2(long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m13581LegendColorIndicator3JVO9M(j, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <T> ImmutableList<Tuples2<Float, T>> parseFloatKeys(Collection<? extends Map.Entry<String, ? extends T>> entries) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(entries, "entries");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            try {
                tuples2M3642to = Tuples4.m3642to(Float.valueOf(Float.parseFloat((String) entry.getKey())), entry.getValue());
            } catch (NumberFormatException e) {
                Logger.INSTANCE.mo1682e(e, "Failed to parse float from key", new Object[0]);
                tuples2M3642to = null;
            }
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
        }
        return extensions2.toImmutableList(arrayList);
    }

    public static final ImmutableList<Float> parseXAxisSnapPoints(Collection<String> keys) {
        Float fValueOf;
        Intrinsics.checkNotNullParameter(keys, "keys");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            try {
                fValueOf = Float.valueOf(Float.parseFloat((String) it.next()));
            } catch (NumberFormatException e) {
                Logger.INSTANCE.mo1682e(e, "Failed to parse x-axis snap points", new Object[0]);
                fValueOf = null;
            }
            if (fValueOf != null) {
                arrayList.add(fValueOf);
            }
        }
        return extensions2.toImmutableList(arrayList);
    }

    /* renamed from: LegendColorIndicator-3J-VO9M, reason: not valid java name */
    public static final void m13581LegendColorIndicator3JVO9M(long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final long j2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(845177787);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(845177787, i3, -1, "com.robinhood.android.equities.shortinterest.ui.LegendColorIndicator (ShortInterestUtils.kt:47)");
            }
            m13580ColorBar3JVO9M(j, modifier3, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
            j2 = j;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            j2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortInterestUtils.LegendColorIndicator_3J_VO9M$lambda$2(j2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: ColorBar-3J-VO9M, reason: not valid java name */
    private static final void m13580ColorBar3JVO9M(final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1368644868);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1368644868, i3, -1, "com.robinhood.android.equities.shortinterest.ui.ColorBar (ShortInterestUtils.kt:52)");
            }
            BoxKt.Box(TestTag3.testTag(Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(modifier, C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(4)), j, RectangleShape2.getRectangleShape()), "ColorBarTestTag"), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.shortinterest.ui.ShortInterestUtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShortInterestUtils.ColorBar_3J_VO9M$lambda$3(j, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
