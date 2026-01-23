package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: BentoBaseRowLayout.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a§\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0013\u001a\u00020\u0004*\u00020\u00122\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\u0004*\u00020\u00152\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00020\u0004*\u00020\u00152\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a0\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0002\b\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u001f\u001a\u00020\u0004*\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u001f\u0010\u0014\u001a\u001b\u0010#\u001a\u00020!*\u00020 2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010'\u001a\u00020\n*\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+\"\u0014\u0010-\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+¨\u0006."}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "middleAndMetaModifier", "Lkotlin/Function0;", "", "startElement", "primaryElement", "secondaryElement", "metaElement", "endElement", "", "showBottomDivider", "removeVerticalPadding", "removeHorizontalPadding", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "BentoBaseRowLayout", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/layout/RowScope;", "Start", "(Landroidx/compose/foundation/layout/RowScope;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/compose/bento/component/rows/BentoRowScope;", "Middle", "(Lcom/robinhood/compose/bento/component/rows/BentoRowScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Meta", "(Lcom/robinhood/compose/bento/component/rows/BentoRowScope;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "content", "MiddleAndMetaLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "End", "Landroidx/compose/ui/layout/Placeable;", "", "desiredHeight", "calculateCenteredY", "(Landroidx/compose/ui/layout/Placeable;I)I", "Landroidx/compose/ui/layout/Measurable;", "minHeight", "mightExist", "(Landroidx/compose/ui/layout/Measurable;I)Z", "Landroidx/compose/ui/unit/Dp;", "MiddleElementMinWidthSansPadding", "F", "MiddleElementPaddingEnd", "MiddleElementMinWidthPlusPadding", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoBaseRowLayout {
    private static final float MiddleElementMinWidthPlusPadding;
    private static final float MiddleElementMinWidthSansPadding;
    private static final float MiddleElementPaddingEnd;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseRowLayout$lambda$3(Modifier modifier, Modifier modifier2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z, boolean z2, boolean z3, MeasurePolicy measurePolicy, int i, int i2, int i3, Composer composer, int i4) {
        BentoBaseRowLayout(modifier, modifier2, function2, function22, function23, function24, function25, z, z2, z3, measurePolicy, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit End$lambda$14(Row5 row5, Function2 function2, int i, Composer composer, int i2) {
        End(row5, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Meta$lambda$9(BentoBaseRowLayout5 bentoBaseRowLayout5, Function2 function2, int i, Composer composer, int i2) {
        Meta(bentoBaseRowLayout5, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Middle$lambda$7(BentoBaseRowLayout5 bentoBaseRowLayout5, Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        Middle(bentoBaseRowLayout5, function2, function22, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MiddleAndMetaLayout$lambda$12(Modifier modifier, Function3 function3, int i, Composer composer, int i2) {
        MiddleAndMetaLayout(modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Start$lambda$5(Row5 row5, Function2 function2, int i, Composer composer, int i2) {
        Start(row5, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoBaseRowLayout(Modifier modifier, Modifier modifier2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z, boolean z2, boolean z3, MeasurePolicy measurePolicy, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier3;
        int i4;
        Modifier modifier4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        int i8;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i19;
        float fM7995constructorimpl;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        MeasurePolicy measurePolicy2;
        Modifier modifier5;
        MeasurePolicy measurePolicy3;
        boolean z5;
        Composer composer2;
        final Modifier modifier6;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final boolean z6;
        final boolean z7;
        final Modifier modifier7;
        final boolean z8;
        final MeasurePolicy measurePolicy4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-669353200);
        int i20 = i3 & 1;
        if (i20 != 0) {
            i4 = i | 6;
            modifier3 = modifier;
        } else if ((i & 6) == 0) {
            modifier3 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier3) ? 4 : 2) | i;
        } else {
            modifier3 = modifier;
            i4 = i;
        }
        int i21 = i3 & 2;
        if (i21 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier4 = modifier2;
                i4 |= composerStartRestartGroup.changed(modifier4) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function26 = function2;
                    i4 |= composerStartRestartGroup.changedInstance(function26) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function27 = function22;
                        i4 |= composerStartRestartGroup.changedInstance(function27) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            function28 = function25;
                        } else {
                            function28 = function25;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function28) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i11 = i10;
                                i4 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                            }
                            i12 = i3 & 256;
                            if (i12 == 0) {
                                i4 |= 100663296;
                            } else {
                                if ((i & 100663296) == 0) {
                                    i13 = i12;
                                    i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                                }
                                i14 = i3 & 512;
                                if (i14 == 0) {
                                    if ((i & 805306368) == 0) {
                                        i15 = i14;
                                        i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                                    }
                                    i16 = i3 & 1024;
                                    if (i16 == 0) {
                                        i17 = i16;
                                        i18 = i2 | 6;
                                    } else if ((i2 & 6) == 0) {
                                        i17 = i16;
                                        i18 = i2 | (composerStartRestartGroup.changed(measurePolicy) ? 4 : 2);
                                    } else {
                                        i17 = i16;
                                        i18 = i2;
                                    }
                                    if ((i4 & 306783379) != 306783378 && (i18 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        function210 = function24;
                                        z6 = z2;
                                        measurePolicy4 = measurePolicy;
                                        composer2 = composerStartRestartGroup;
                                        modifier7 = modifier3;
                                        modifier6 = modifier4;
                                        function211 = function26;
                                        function29 = function23;
                                        z8 = z;
                                        z7 = z3;
                                    } else {
                                        Modifier modifier8 = i20 == 0 ? Modifier.INSTANCE : modifier3;
                                        Modifier modifier9 = i21 == 0 ? Modifier.INSTANCE : modifier4;
                                        if (i5 != 0) {
                                            function26 = null;
                                        }
                                        if (i6 != 0) {
                                            function27 = null;
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function212 = i7 == 0 ? null : function23;
                                        final Function2<? super Composer, ? super Integer, Unit> function213 = i8 == 0 ? null : function24;
                                        if (i9 != 0) {
                                            function28 = null;
                                        }
                                        boolean z9 = i11 == 0 ? true : z;
                                        boolean z10 = i13 == 0 ? false : z2;
                                        z4 = i15 == 0 ? false : z3;
                                        MeasurePolicy measurePolicy5 = i17 == 0 ? null : measurePolicy;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-669353200, i4, i18, "com.robinhood.compose.bento.component.rows.BentoBaseRowLayout (BentoBaseRowLayout.kt:54)");
                                        }
                                        Alignment.Companion companion = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier8);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Modifier modifier10 = modifier8;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.useNode();
                                        } else {
                                            composerStartRestartGroup.createNode(constructor);
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Modifier modifier11 = modifier9;
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(-24870820);
                                        if (z4) {
                                            fM7995constructorimpl = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                                            i19 = 0;
                                        } else {
                                            i19 = 0;
                                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        int i22 = i4;
                                        Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion3, fM7995constructorimpl, z10 ? BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM() : C2002Dp.m7995constructorimpl(i19)), 0.0f, 1, null), companion.getCenterStart());
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.useNode();
                                        } else {
                                            composerStartRestartGroup.createNode(constructor2);
                                        }
                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        measurePolicy2 = measurePolicy5;
                                        if (measurePolicy2 == null) {
                                            composerStartRestartGroup.startReplaceGroup(-1396647719);
                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                                            z5 = z9;
                                            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                                composerStartRestartGroup.createNode(constructor3);
                                            } else {
                                                composerStartRestartGroup.useNode();
                                            }
                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicy2, companion2.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl3.getInserting()) {
                                                measurePolicy3 = measurePolicy2;
                                            } else {
                                                measurePolicy3 = measurePolicy2;
                                                if (!Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                                                Start(row6, function26, composerStartRestartGroup, 6 | ((i22 >> 3) & 112));
                                                modifier5 = modifier11;
                                                MiddleAndMetaLayout(Row5.weight$default(row6, modifier11, 1.0f, false, 2, null), ComposableLambda3.rememberComposableLambda(1850682239, true, new Function3<BentoBaseRowLayout5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$BentoBaseRowLayout$1$1$1$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(BentoBaseRowLayout5 bentoBaseRowLayout5, Composer composer3, Integer num) {
                                                        invoke(bentoBaseRowLayout5, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(BentoBaseRowLayout5 MiddleAndMetaLayout, Composer composer3, int i23) {
                                                        Intrinsics.checkNotNullParameter(MiddleAndMetaLayout, "$this$MiddleAndMetaLayout");
                                                        if ((i23 & 6) == 0) {
                                                            i23 |= (i23 & 8) == 0 ? composer3.changed(MiddleAndMetaLayout) : composer3.changedInstance(MiddleAndMetaLayout) ? 4 : 2;
                                                        }
                                                        if ((i23 & 19) == 18 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1850682239, i23, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRowLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BentoBaseRowLayout.kt:71)");
                                                        }
                                                        int i24 = i23 & 14;
                                                        BentoBaseRowLayout.Middle(MiddleAndMetaLayout, function27, function212, composer3, i24);
                                                        BentoBaseRowLayout.Meta(MiddleAndMetaLayout, function213, composer3, i24);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                                composerStartRestartGroup.startReplaceGroup(711640747);
                                                if (function28 != null) {
                                                    End(row6, function28, composerStartRestartGroup, 6 | ((i22 >> 15) & 112));
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceGroup();
                                            }
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                                            Start(row6, function26, composerStartRestartGroup, 6 | ((i22 >> 3) & 112));
                                            modifier5 = modifier11;
                                            MiddleAndMetaLayout(Row5.weight$default(row6, modifier11, 1.0f, false, 2, null), ComposableLambda3.rememberComposableLambda(1850682239, true, new Function3<BentoBaseRowLayout5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$BentoBaseRowLayout$1$1$1$1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoBaseRowLayout5 bentoBaseRowLayout5, Composer composer3, Integer num) {
                                                    invoke(bentoBaseRowLayout5, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BentoBaseRowLayout5 MiddleAndMetaLayout, Composer composer3, int i23) {
                                                    Intrinsics.checkNotNullParameter(MiddleAndMetaLayout, "$this$MiddleAndMetaLayout");
                                                    if ((i23 & 6) == 0) {
                                                        i23 |= (i23 & 8) == 0 ? composer3.changed(MiddleAndMetaLayout) : composer3.changedInstance(MiddleAndMetaLayout) ? 4 : 2;
                                                    }
                                                    if ((i23 & 19) == 18 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1850682239, i23, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRowLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BentoBaseRowLayout.kt:71)");
                                                    }
                                                    int i24 = i23 & 14;
                                                    BentoBaseRowLayout.Middle(MiddleAndMetaLayout, function27, function212, composer3, i24);
                                                    BentoBaseRowLayout.Meta(MiddleAndMetaLayout, function213, composer3, i24);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                            composerStartRestartGroup.startReplaceGroup(711640747);
                                            if (function28 != null) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            modifier5 = modifier11;
                                            measurePolicy3 = measurePolicy2;
                                            z5 = z9;
                                            composerStartRestartGroup.startReplaceGroup(-1396093811);
                                            Start(row6, function26, composerStartRestartGroup, 6 | ((i22 >> 3) & 112));
                                            MiddleAndMetaLayout(Row5.weight$default(row6, modifier11, 1.0f, false, 2, null), ComposableLambda3.rememberComposableLambda(-1713674287, true, new Function3<BentoBaseRowLayout5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$BentoBaseRowLayout$1$1$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(BentoBaseRowLayout5 bentoBaseRowLayout5, Composer composer3, Integer num) {
                                                    invoke(bentoBaseRowLayout5, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(BentoBaseRowLayout5 MiddleAndMetaLayout, Composer composer3, int i23) {
                                                    Intrinsics.checkNotNullParameter(MiddleAndMetaLayout, "$this$MiddleAndMetaLayout");
                                                    if ((i23 & 6) == 0) {
                                                        i23 |= (i23 & 8) == 0 ? composer3.changed(MiddleAndMetaLayout) : composer3.changedInstance(MiddleAndMetaLayout) ? 4 : 2;
                                                    }
                                                    if ((i23 & 19) == 18 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1713674287, i23, -1, "com.robinhood.compose.bento.component.rows.BentoBaseRowLayout.<anonymous>.<anonymous>.<anonymous> (BentoBaseRowLayout.kt:83)");
                                                    }
                                                    int i24 = i23 & 14;
                                                    BentoBaseRowLayout.Middle(MiddleAndMetaLayout, function27, function212, composer3, i24);
                                                    BentoBaseRowLayout.Meta(MiddleAndMetaLayout, function213, composer3, i24);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                            if (function28 != null) {
                                                End(row6, function28, composerStartRestartGroup, 6 | ((i22 >> 15) & 112));
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                        }
                                        composerStartRestartGroup.endNode();
                                        Color colorM21927getDividerColorQN2ZGVo = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getColors().m21927getDividerColorQN2ZGVo();
                                        composerStartRestartGroup.startReplaceGroup(-24828188);
                                        if (z5 || colorM21927getDividerColorQN2ZGVo == null) {
                                            composer2 = composerStartRestartGroup;
                                        } else {
                                            composerStartRestartGroup.startReplaceGroup(-24822532);
                                            float value = !z4 ? ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue() : C2002Dp.m7995constructorimpl(0);
                                            composerStartRestartGroup.endReplaceGroup();
                                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, value, 0.0f, 2, null), 0.0f, 1, null), companion.getBottomStart()), colorM21927getDividerColorQN2ZGVo.getValue(), 0.0f, composerStartRestartGroup, 0, 4);
                                            composer2 = composerStartRestartGroup;
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier6 = modifier5;
                                        function29 = function212;
                                        function210 = function213;
                                        function211 = function26;
                                        z6 = z10;
                                        z7 = z4;
                                        modifier7 = modifier10;
                                        z8 = z5;
                                        measurePolicy4 = measurePolicy3;
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function214 = function28;
                                    final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return BentoBaseRowLayout.BentoBaseRowLayout$lambda$3(modifier7, modifier6, function211, function215, function29, function210, function214, z8, z6, z7, measurePolicy4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 805306368;
                                i15 = i14;
                                i16 = i3 & 1024;
                                if (i16 == 0) {
                                }
                                if ((i4 & 306783379) != 306783378) {
                                    if (i20 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier8);
                                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                    Modifier modifier102 = modifier8;
                                    Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Modifier modifier112 = modifier9;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                                        Modifier.Companion companion32 = Modifier.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(-24870820);
                                        if (z4) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        int i222 = i4;
                                        Modifier modifierAlign2 = boxScopeInstance2.align(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion32, fM7995constructorimpl, z10 ? BentoBaseRowLayout8.INSTANCE.m21051getPaddingVerticalD9Ej5fM() : C2002Dp.m7995constructorimpl(i19)), 0.0f, 1, null), companion4.getCenterStart());
                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign2);
                                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl2.getInserting()) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                                            Row6 row62 = Row6.INSTANCE;
                                            measurePolicy2 = measurePolicy5;
                                            if (measurePolicy2 == null) {
                                            }
                                            composerStartRestartGroup.endNode();
                                            Color colorM21927getDividerColorQN2ZGVo2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getRow(composerStartRestartGroup, 0).getColors().m21927getDividerColorQN2ZGVo();
                                            composerStartRestartGroup.startReplaceGroup(-24828188);
                                            if (z5) {
                                                composer2 = composerStartRestartGroup;
                                                composer2.endReplaceGroup();
                                                composer2.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                modifier6 = modifier5;
                                                function29 = function212;
                                                function210 = function213;
                                                function211 = function26;
                                                z6 = z10;
                                                z7 = z4;
                                                modifier7 = modifier102;
                                                z8 = z5;
                                                measurePolicy4 = measurePolicy3;
                                            }
                                        }
                                    }
                                }
                                final Function2 function2142 = function28;
                                final Function2 function2152 = function27;
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i13 = i12;
                            i14 = i3 & 512;
                            if (i14 == 0) {
                            }
                            i15 = i14;
                            i16 = i3 & 1024;
                            if (i16 == 0) {
                            }
                            if ((i4 & 306783379) != 306783378) {
                            }
                            final Function2 function21422 = function28;
                            final Function2 function21522 = function27;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & 256;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        i14 = i3 & 512;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i3 & 1024;
                        if (i16 == 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        final Function2 function214222 = function28;
                        final Function2 function215222 = function27;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i3 & 1024;
                    if (i16 == 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    final Function2 function2142222 = function28;
                    final Function2 function2152222 = function27;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function27 = function22;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i3 & 1024;
                if (i16 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                final Function2 function21422222 = function28;
                final Function2 function21522222 = function27;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function26 = function2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function27 = function22;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i3 & 1024;
            if (i16 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            final Function2 function214222222 = function28;
            final Function2 function215222222 = function27;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier4 = modifier2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function26 = function2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function27 = function22;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i3 & 1024;
        if (i16 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        final Function2 function2142222222 = function28;
        final Function2 function2152222222 = function27;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Start(final Row5 row5, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1830915267);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(row5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830915267, i2, -1, "com.robinhood.compose.bento.component.rows.Start (BentoBaseRowLayout.kt:111)");
            }
            if (function2 != null) {
                Modifier modifierM21617paddingIfContentSizeNonZeroqDBjuR0$default = ModifiersKt.m21617paddingIfContentSizeNonZeroqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 13, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Modifier modifierAlign = row5.align(modifierM21617paddingIfContentSizeNonZeroqDBjuR0$default, companion.getCenterVertically());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                composerStartRestartGroup.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowLayout.Start$lambda$5(row5, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(113);
        MiddleElementMinWidthSansPadding = fM7995constructorimpl;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(16);
        MiddleElementPaddingEnd = fM7995constructorimpl2;
        MiddleElementMinWidthPlusPadding = C2002Dp.m7995constructorimpl(fM7995constructorimpl + fM7995constructorimpl2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Middle(final BentoBaseRowLayout5 bentoBaseRowLayout5, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1670547407);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bentoBaseRowLayout5) : composerStartRestartGroup.changedInstance(bentoBaseRowLayout5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1670547407, i2, -1, "com.robinhood.compose.bento.component.rows.Middle (BentoBaseRowLayout.kt:125)");
            }
            if (function2 != null) {
                Modifier modifierMiddle = bentoBaseRowLayout5.middle(Modifier.INSTANCE);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierMiddle);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                composerStartRestartGroup.startReplaceGroup(509150600);
                if (function22 != null) {
                    function22.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 6) & 14));
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowLayout.Middle$lambda$7(bentoBaseRowLayout5, function2, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Meta(final BentoBaseRowLayout5 bentoBaseRowLayout5, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1160005438);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bentoBaseRowLayout5) : composerStartRestartGroup.changedInstance(bentoBaseRowLayout5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1160005438, i2, -1, "com.robinhood.compose.bento.component.rows.Meta (BentoBaseRowLayout.kt:135)");
            }
            if (function2 != null) {
                Modifier modifierMeta = bentoBaseRowLayout5.meta(Modifier.INSTANCE);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierMeta);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                composerStartRestartGroup.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowLayout.Meta$lambda$9(bentoBaseRowLayout5, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MiddleAndMetaLayout(final Modifier modifier, final Function3<? super BentoBaseRowLayout5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-811995898);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-811995898, i2, -1, "com.robinhood.compose.bento.component.rows.MiddleAndMetaLayout (BentoBaseRowLayout.kt:151)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = BentoBaseRowLayout4.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            function3.invoke(BentoBaseRowLayout6.INSTANCE, composerStartRestartGroup, Integer.valueOf((i2 & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowLayout.MiddleAndMetaLayout$lambda$12(modifier, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void End(final Row5 row5, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1611792598);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(row5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1611792598, i2, -1, "com.robinhood.compose.bento.component.rows.End (BentoBaseRowLayout.kt:254)");
            }
            Modifier modifierM21617paddingIfContentSizeNonZeroqDBjuR0$default = ModifiersKt.m21617paddingIfContentSizeNonZeroqDBjuR0$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierAlign = row5.align(modifierM21617paddingIfContentSizeNonZeroqDBjuR0$default, companion.getCenterVertically());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.rows.BentoBaseRowLayoutKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoBaseRowLayout.End$lambda$14(row5, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateCenteredY(Placeable placeable, int i) {
        return RangesKt.coerceAtLeast(i - placeable.getHeight(), 0) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mightExist(Measurable measurable, int i) {
        return measurable != null && measurable.minIntrinsicWidth(i) > 0;
    }
}
