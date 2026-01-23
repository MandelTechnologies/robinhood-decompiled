package com.robinhood.shared.common.etpcomposition;

import androidx.compose.animation.SingleValueAnimation;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSize2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChart;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.utils.extensions.ResourceTypes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EtpHoldingRadialBreakdownChart.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001am\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u009d\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0011H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u007f\u0010\u001e\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\"2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\"2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)\u001ae\u0010*\u001a\u00020\u0001*\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-\u001a\r\u0010.\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010/¨\u00060²\u0006\n\u00101\u001a\u000202X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u008e\u0002"}, m3636d2 = {"EtpHoldingRadialBreakdownChart", "", CryptoDetailSource.HOLDINGS, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", "instrumentSymbol", "", "selectedHolding", "modifier", "Landroidx/compose/ui/Modifier;", "thicknessRatio", "", "tickCount", "", "defaultColor", "Landroidx/compose/ui/graphics/Color;", "onHoldingSelected", "Lkotlin/Function1;", "EtpHoldingRadialBreakdownChart-3csKH6Y", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lcom/robinhood/models/db/bonfire/etp/EtpHolding;Landroidx/compose/ui/Modifier;FIJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RadialChartContent", "holdingColors", "holdingTickCounts", "startTicks", "currentDrawStartAngle", "currentDrawSweepAngle", "animatedBaseColor", "solidTargetColor", "RadialChartContent-ZZF9Tkg", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;FIJFFJJLcom/robinhood/models/db/bonfire/etp/EtpHolding;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "drawBackgroundTicks", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "degreesPerTick", "holdingsCount", "", "centerOffset", "Landroidx/compose/ui/geometry/Offset;", "outerRadius", "innerRadius", "gradientStartRatio", "drawBackgroundTicks-LKob2bg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;IFILjava/util/List;Ljava/util/List;JFFJFFF)V", "drawForegroundArc", "strokeWidthPx", "drawForegroundArc-J1HbLjE", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Lcom/robinhood/models/db/bonfire/etp/EtpHolding;FFFJJFFJF)V", "EtpHoldingBreakdownChartPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-etp-composition_externalDebug", "isIntroAnimation", "", "chartSize", "Landroidx/compose/ui/geometry/Size;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class EtpHoldingRadialBreakdownChart {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EtpHoldingBreakdownChartPreview$lambda$30(int i, Composer composer, int i2) {
        EtpHoldingBreakdownChartPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$17(ImmutableList immutableList, String str, EtpHolding etpHolding, Modifier modifier, float f, int i, long j, Function1 function1, int i2, int i3, Composer composer, int i4) {
        m24831EtpHoldingRadialBreakdownChart3csKH6Y(immutableList, str, etpHolding, modifier, f, i, j, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadialChartContent_ZZF9Tkg$lambda$27(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, float f, int i, long j, float f2, float f3, long j2, long j3, EtpHolding etpHolding, Function1 function1, int i2, int i3, Composer composer, int i4) {
        m24832RadialChartContentZZF9Tkg(immutableList, immutableList2, immutableList3, immutableList4, f, i, j, f2, f3, j2, j3, etpHolding, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$1$lambda$0(EtpHolding it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178 A[LOOP:0: B:112:0x016f->B:114:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x018e A[EDGE_INSN: B:210:0x018e->B:115:0x018e BREAK  A[LOOP:0: B:112:0x016f->B:114:0x0178], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /* renamed from: EtpHoldingRadialBreakdownChart-3csKH6Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m24831EtpHoldingRadialBreakdownChart3csKH6Y(final ImmutableList<EtpHolding> holdings, String instrumentSymbol, final EtpHolding etpHolding, Modifier modifier, float f, int i, long j, Function1<? super EtpHolding, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        long jColor;
        int i9;
        Function1<? super EtpHolding, Unit> function12;
        ArrayList arrayList;
        Iterator<EtpHolding> it;
        boolean zChanged;
        int iIntValue;
        int iIntValue2;
        int i10;
        Animatable animatable;
        Animatable animatable2;
        String str;
        int i11;
        Composer composer2;
        final Function1<? super EtpHolding, Unit> function13;
        final float f3;
        final Modifier modifier3;
        final int i12;
        final long j2;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
        Composer composerStartRestartGroup = composer.startRestartGroup(1828892215);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(holdings) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(instrumentSymbol) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(etpHolding) ? 256 : 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((196608 & i2) == 0) {
                        i7 = i;
                        i4 |= composerStartRestartGroup.changed(i7) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        jColor = j;
                    } else {
                        jColor = j;
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(jColor) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        function12 = function1;
                    } else {
                        function12 = function1;
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                        }
                    }
                    if ((i4 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                        float f4 = i5 == 0 ? 0.26f : f2;
                        if (i6 != 0) {
                            i7 = 100;
                        }
                        if (i8 != 0) {
                            jColor = Color2.Color(4292927712L);
                        }
                        if (i9 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return EtpHoldingRadialBreakdownChart.EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$1$lambda$0((EtpHolding) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function12 = (Function1) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1828892215, i4, -1, "com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChart (EtpHoldingRadialBreakdownChart.kt:60)");
                        }
                        composerStartRestartGroup.startReplaceGroup(923809811);
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
                        it = holdings.iterator();
                        while (true) {
                            Iterator<EtpHolding> it2 = it;
                            if (it.hasNext()) {
                                break;
                            }
                            arrayList.add(Color.m6701boximpl(Helpers6.getComposeColor(it2.next(), composerStartRestartGroup, 0)));
                            it = it2;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged = composerStartRestartGroup.changed(holdings) | ((i4 & 458752) != 131072);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            Object obj = objRememberedValue2;
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
                                Iterator<EtpHolding> it3 = holdings.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(Integer.valueOf(MathKt.roundToInt(it3.next().getWeight() * i7)));
                                }
                                composerStartRestartGroup.updateRememberedValue(arrayList2);
                                obj = arrayList2;
                            }
                            List list = (List) obj;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged2 = composerStartRestartGroup.changed(list);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                List list2 = list;
                                Integer numValueOf = 0;
                                int iCollectionSizeOrDefault = CollectionsKt.collectionSizeOrDefault(list2, 9);
                                if (iCollectionSizeOrDefault == 0) {
                                    objRememberedValue3 = CollectionsKt.listOf(numValueOf);
                                } else {
                                    ArrayList arrayList3 = new ArrayList(iCollectionSizeOrDefault + 1);
                                    arrayList3.add(numValueOf);
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        numValueOf = Integer.valueOf(numValueOf.intValue() + ((Number) it4.next()).intValue());
                                        arrayList3.add(numValueOf);
                                    }
                                    objRememberedValue3 = arrayList3;
                                }
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            List list3 = (List) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            float f5 = 360.0f / i7;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChanged3 = composerStartRestartGroup.changed(etpHolding) | composerStartRestartGroup.changed(holdings);
                            float f6 = f4;
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = Integer.valueOf(etpHolding == null ? -1 : holdings.indexOf(etpHolding));
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            int iIntValue3 = ((Number) objRememberedValue4).intValue();
                            composerStartRestartGroup.endReplaceGroup();
                            if (iIntValue3 != -1) {
                                iIntValue2 = ((Number) list3.get(iIntValue3)).intValue();
                                iIntValue = ((Number) list.get(iIntValue3)).intValue();
                            } else {
                                iIntValue = 0;
                                iIntValue2 = 0;
                            }
                            float f7 = (-90.0f) + (iIntValue2 * f5);
                            float f8 = iIntValue * f5;
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            Function1<? super EtpHolding, Unit> function14 = function12;
                            long j3 = jColor;
                            if (objRememberedValue5 == companion.getEmpty()) {
                                i10 = 2;
                                objRememberedValue5 = Animatable2.Animatable$default(f7, 0.0f, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            } else {
                                i10 = 2;
                            }
                            Animatable animatable3 = (Animatable) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            int i14 = i4;
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = Animatable2.Animatable$default(0.0f, 0.0f, i10, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            Animatable animatable4 = (Animatable) objRememberedValue6;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, i10, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            SnapshotState snapshotState = (SnapshotState) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable3) | composerStartRestartGroup.changed(f7) | composerStartRestartGroup.changedInstance(animatable4) | composerStartRestartGroup.changed(f8);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                                animatable = animatable3;
                                animatable2 = animatable4;
                                objRememberedValue8 = new EtpHoldingRadialBreakdownChart2(animatable, f7, animatable2, f8, snapshotState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            } else {
                                animatable = animatable3;
                                animatable2 = animatable4;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(etpHolding, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, (i14 >> 6) & 14);
                            SnapshotState4<Color> snapshotState4M4805animateColorAsStateeuL9pac = SingleValueAnimation.m4805animateColorAsStateeuL9pac(iIntValue3 != -1 ? ((Color) immutableList.get(iIntValue3)).getValue() : Color.INSTANCE.m6725getTransparent0d7_KjU(), AnimationSpecKt.tween$default(600, 0, null, 6, null), ResourceTypes.COLOR, null, composerStartRestartGroup, 432, 8);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i15 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i15).m21371getBg0d7_KjU();
                            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(modifier4, 1.0f, false, 2, null);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Modifier modifier5 = modifier4;
                            int i16 = i7;
                            m24832RadialChartContentZZF9Tkg(holdings, immutableList, extensions2.toImmutableList(list), extensions2.toImmutableList(list3), f6, i16, j3, ((Number) animatable.getValue()).floatValue(), ((Number) animatable2.getValue()).floatValue(), EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$14(snapshotState4M4805animateColorAsStateeuL9pac), jM21371getBg0d7_KjU, etpHolding, function14, composerStartRestartGroup, i14 & 4186126, ((i14 >> 3) & 112) | ((i14 >> 15) & 896));
                            Composer composer4 = composerStartRestartGroup;
                            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer4, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion4);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer4.startReplaceGroup(1016079417);
                            if (etpHolding != null) {
                                i11 = i16;
                                BentoText2.m20747BentoText38GnDrw(etpHolding.getName(), null, Color.m6701boximpl(bentoTheme.getColors(composer4, i15).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i15).getDisplayMartinaSmall(), composer4, 24576, 0, 8170);
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composer4, i15).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                int weight = (int) (etpHolding.getWeight() * 100);
                                StringBuilder sb = new StringBuilder();
                                sb.append(weight);
                                sb.append("% of ");
                                str = instrumentSymbol;
                                sb.append(str);
                                BentoText2.m20747BentoText38GnDrw(sb.toString(), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer4, i15).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i15).getTextM(), composer4, 0, 0, 8184);
                                composer2 = composer4;
                            } else {
                                str = instrumentSymbol;
                                i11 = i16;
                                composer2 = composer4;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function13 = function14;
                            f3 = f6;
                            modifier3 = modifier5;
                            i12 = i11;
                            j2 = j3;
                            composer3 = composer2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        str = instrumentSymbol;
                        f3 = f2;
                        i12 = i7;
                        function13 = function12;
                        modifier3 = modifier2;
                        j2 = jColor;
                        composer3 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final String str2 = str;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return EtpHoldingRadialBreakdownChart.EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$17(holdings, str2, etpHolding, modifier3, f3, i12, j2, function13, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 196608;
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                    if (i13 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(923809811);
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
                    it = holdings.iterator();
                    while (true) {
                        Iterator<EtpHolding> it22 = it;
                        if (it.hasNext()) {
                        }
                        arrayList.add(Color.m6701boximpl(Helpers6.getComposeColor(it22.next(), composerStartRestartGroup, 0)));
                        it = it22;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList immutableList2 = extensions2.toImmutableList(arrayList);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(holdings) | ((i4 & 458752) != 131072);
                    Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: EtpHoldingRadialBreakdownChart.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$EtpHoldingBreakdownChartPreview$1 */
    static final class C374601 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList3<EtpHolding> $holdings;

        C374601(ImmutableList3<EtpHolding> immutableList3) {
            this.$holdings = immutableList3;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1621519545, i, -1, "com.robinhood.shared.common.etpcomposition.EtpHoldingBreakdownChartPreview.<anonymous> (EtpHoldingRadialBreakdownChart.kt:500)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            ImmutableList3<EtpHolding> immutableList3 = this.$holdings;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            EtpHolding etpHolding = immutableList3.get(0);
            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(300));
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$EtpHoldingBreakdownChartPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EtpHoldingRadialBreakdownChart.C374601.invoke$lambda$2$lambda$1$lambda$0((EtpHolding) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EtpHoldingRadialBreakdownChart.m24831EtpHoldingRadialBreakdownChart3csKH6Y(immutableList3, "RVI", etpHolding, modifierM5169size3ABfNKs, 0.0f, 0, 0L, (Function1) objRememberedValue, composer, 12586032, 112);
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
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(EtpHolding it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final long EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$14(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long RadialChartContent_ZZF9Tkg$lambda$19(SnapshotState<Size> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: RadialChartContent-ZZF9Tkg, reason: not valid java name */
    private static final void m24832RadialChartContentZZF9Tkg(final ImmutableList<EtpHolding> immutableList, final ImmutableList<Color> immutableList2, final ImmutableList<Integer> immutableList3, final ImmutableList<Integer> immutableList4, final float f, final int i, final long j, final float f2, final float f3, final long j2, final long j3, final EtpHolding etpHolding, final Function1<? super EtpHolding, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        ImmutableList<Integer> immutableList5;
        ImmutableList<Integer> immutableList6;
        int i5;
        int i6;
        float f4;
        int i7;
        Object[] objArr;
        int i8;
        Modifier modifier;
        Composer composer2;
        ImmutableList<EtpHolding> immutableList7 = immutableList;
        Composer composerStartRestartGroup = composer.startRestartGroup(2089537941);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(immutableList7) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(immutableList2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            immutableList5 = immutableList3;
            i4 |= composerStartRestartGroup.changed(immutableList5) ? 256 : 128;
        } else {
            immutableList5 = immutableList3;
        }
        if ((i2 & 3072) == 0) {
            immutableList6 = immutableList4;
            i4 |= composerStartRestartGroup.changed(immutableList6) ? 2048 : 1024;
        } else {
            immutableList6 = immutableList4;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(f3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(j3) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(etpHolding) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i9 = i5;
        if ((i4 & 306783379) == 306783378 && (i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089537941, i4, i9, "com.robinhood.shared.common.etpcomposition.RadialChartContent (EtpHoldingRadialBreakdownChart.kt:173)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Size.m6574boximpl(Size.INSTANCE.m6589getZeroNHjbRc()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            float f5 = 360.0f / i;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EtpHoldingRadialBreakdownChart.RadialChartContent_ZZF9Tkg$lambda$22$lambda$21(snapshotState, (IntSize) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierFillMaxSize$default, (Function1) objRememberedValue2);
            Object[] objArr2 = {immutableList7, Size.m6574boximpl(RadialChartContent_ZZF9Tkg$lambda$19(snapshotState)), Float.valueOf(f)};
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i10 = i4 & 57344;
            int i11 = i4 & 896;
            boolean zChanged = ((i9 & 896) == 256) | ((i4 & 7168) == 2048) | (i10 == 16384) | composerStartRestartGroup.changed(f5) | composerStartRestartGroup.changedInstance(immutableList7) | (i11 == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                i6 = i4;
                f4 = f5;
                i7 = i9;
                objArr = objArr2;
                i8 = -1224400529;
                EtpHoldingRadialBreakdownChart3 etpHoldingRadialBreakdownChart3 = new EtpHoldingRadialBreakdownChart3(f, f4, immutableList7, immutableList6, immutableList5, function1, snapshotState);
                immutableList7 = immutableList7;
                composerStartRestartGroup.updateRememberedValue(etpHoldingRadialBreakdownChart3);
                objRememberedValue3 = etpHoldingRadialBreakdownChart3;
            } else {
                i6 = i4;
                f4 = f5;
                i7 = i9;
                objArr = objArr2;
                i8 = -1224400529;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierOnSizeChanged, objArr, (PointerInputEventHandler) objRememberedValue3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(i8);
            boolean zChanged2 = (i10 == 16384) | ((i6 & 458752) == 131072) | composerStartRestartGroup.changed(f4) | composerStartRestartGroup.changedInstance(immutableList7) | (i11 == 256) | ((i6 & 112) == 32) | ((i6 & 3670016) == 1048576) | ((i6 & 29360128) == 8388608) | ((i6 & 234881024) == 67108864) | composerStartRestartGroup.changedInstance(etpHolding) | ((i6 & 1879048192) == 536870912) | ((i7 & 14) == 4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                final ImmutableList<EtpHolding> immutableList8 = immutableList7;
                modifier = modifierFillMaxSize$default2;
                final float f6 = f4;
                Function1 function12 = new Function1() { // from class: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EtpHoldingRadialBreakdownChart.RadialChartContent_ZZF9Tkg$lambda$26$lambda$25$lambda$24(f, i, f6, immutableList8, immutableList3, immutableList2, j, f2, f3, etpHolding, j2, j3, (DrawScope) obj);
                    }
                };
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(function12);
                objRememberedValue4 = function12;
            } else {
                modifier = modifierFillMaxSize$default2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            Canvas2.Canvas(modifier, (Function1) objRememberedValue4, composer2, 6);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EtpHoldingRadialBreakdownChart.RadialChartContent_ZZF9Tkg$lambda$27(immutableList, immutableList2, immutableList3, immutableList4, f, i, j, f2, f3, j2, j3, etpHolding, function1, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RadialChartContent_ZZF9Tkg$lambda$20(SnapshotState<Size> snapshotState, long j) {
        snapshotState.setValue(Size.m6574boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadialChartContent_ZZF9Tkg$lambda$22$lambda$21(SnapshotState snapshotState, IntSize intSize) {
        RadialChartContent_ZZF9Tkg$lambda$20(snapshotState, IntSize2.m8067toSizeozmzZPI(intSize.getPackedValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadialChartContent_ZZF9Tkg$lambda$26$lambda$25$lambda$24(float f, int i, float f2, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, long j, float f3, float f4, EtpHolding etpHolding, long j2, long j3, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fM6582getMinDimensionimpl = Size.m6582getMinDimensionimpl(Canvas.mo6963getSizeNHjbRc());
        float f5 = fM6582getMinDimensionimpl / 2.0f;
        float f6 = fM6582getMinDimensionimpl * f;
        float f7 = f5 - f6;
        long jMo6962getCenterF1C5BW0 = Canvas.mo6962getCenterF1C5BW0();
        float f8 = f5 > 0.0f ? f7 / f5 : 0.0f;
        m24833drawBackgroundTicksLKob2bg(Canvas, i, f2, immutableList.size(), immutableList2, immutableList3, j, f3, f4, jMo6962getCenterF1C5BW0, f5, f7, f8);
        float f9 = f8;
        if (f4 > 0.0f) {
            m24834drawForegroundArcJ1HbLjE(Canvas, etpHolding, f3, f4, f2, j2, j3, f6, f5, jMo6962getCenterF1C5BW0, f9);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: drawBackgroundTicks-LKob2bg, reason: not valid java name */
    private static final void m24833drawBackgroundTicksLKob2bg(DrawScope drawScope, int i, float f, int i2, List<Integer> list, List<Color> list2, long j, float f2, float f3, long j2, float f4, float f5, float f6) {
        float f7;
        float f8;
        List<Integer> list3 = list;
        float f9 = 0.4f * f;
        float f10 = 1.0f;
        float f11 = (f2 - (f / 2.0f)) + 1.0f;
        float f12 = (f11 + f3) - (2 * 1.0f);
        int i3 = 0;
        boolean z = f3 > 1.0f;
        int iIntValue = 0;
        int i4 = 0;
        while (i3 < i) {
            float f13 = (-90.0f) + (i3 * f);
            while (i4 < i2 && i3 >= list3.get(i4).intValue() + iIntValue) {
                iIntValue += list3.get(i4).intValue();
                i4++;
            }
            Color color = (Color) CollectionsKt.getOrNull(list2, i4);
            long value = color != null ? color.getValue() : j;
            if (!z || f13 < f11 + f9 || f13 > f12 - f9) {
                f7 = f10;
                Brush brushM6681radialGradientP_VxKs$default = Brush.Companion.m6681radialGradientP_VxKs$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(f6), Color.m6701boximpl(Color.m6705copywmQWz5c$default(value, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(Float.valueOf(f7), Color.m6701boximpl(Color.m6705copywmQWz5c$default(value, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)))}, j2, f4, 0, 8, (Object) null);
                double radians = Math.toRadians(f13);
                f8 = f9;
                float fCos = (float) Math.cos(radians);
                float fSin = (float) Math.sin(radians);
                int i5 = (int) (j2 & 4294967295L);
                long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(r13) + (f5 * fCos)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i5) + (f5 * fSin)) & 4294967295L));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + (f4 * fCos);
                DrawScope.m6950drawLine1RTmtNc$default(drawScope, brushM6681radialGradientP_VxKs$default, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i5) + (f4 * fSin)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), drawScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl((float) 2.5d)), StrokeCap.INSTANCE.m6848getButtKaPHkGw(), null, 0.0f, null, 0, 480, null);
            } else {
                f7 = f10;
                f8 = f9;
            }
            i3++;
            list3 = list;
            f9 = f8;
            f10 = f7;
        }
    }

    /* renamed from: drawForegroundArc-J1HbLjE, reason: not valid java name */
    private static final void m24834drawForegroundArcJ1HbLjE(DrawScope drawScope, EtpHolding etpHolding, float f, float f2, float f3, long j, long j2, float f4, float f5, long j3, float f6) {
        List<EtpHolding.Vehicle> list;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        float f7 = (f - (f3 / 2.0f)) + 1.0f;
        float f8 = 2;
        float f9 = f2 - (1.0f * f8);
        List<EtpHolding.Vehicle> vehicles = etpHolding != null ? etpHolding.getVehicles() : null;
        char c = ' ';
        if ((etpHolding != null && etpHolding.isCash()) || (list = vehicles) == null || list.isEmpty()) {
            float f10 = f4 / f8;
            float f11 = (f5 * f8) - f4;
            DrawScope.m6944drawArcillE91I$default(drawScope, Brush.Companion.m6681radialGradientP_VxKs$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(f6), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j, 0.3f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color.m6705copywmQWz5c$default(j, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)))}, j3, f5, 0, 8, (Object) null), f7, f9, false, Offset.m6535constructorimpl((Float.floatToRawIntBits((Float.intBitsToFloat((int) (j3 >> 32)) - f5) + f10) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (j3 & 4294967295L)) - f5) + f10) & 4294967295L)), Size.m6575constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), 0.0f, new Stroke(f4, 0.0f, StrokeCap.INSTANCE.m6848getButtKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
            return;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it = vehicles.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((EtpHolding.Vehicle) it.next()).getWeight());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        float fFloatValue = bigDecimalValueOf.floatValue();
        int size = vehicles.size();
        int i = 0;
        for (Object obj : vehicles) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue2 = f9 * (((EtpHolding.Vehicle) obj).getWeight().floatValue() / fFloatValue);
            long jM24837getVehicleColor0Hk2hKA$default = Helpers6.m24837getVehicleColor0Hk2hKA$default(j, i, size, 0.0f, j2, 4, null);
            float f12 = f4 / f8;
            float f13 = (f5 * f8) - f4;
            char c2 = c;
            float f14 = f7;
            DrawScope.m6944drawArcillE91I$default(drawScope, Brush.Companion.m6681radialGradientP_VxKs$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(f6), Color.m6701boximpl(Color.m6705copywmQWz5c$default(jM24837getVehicleColor0Hk2hKA$default, 0.5f, 0.0f, 0.0f, 0.0f, 14, null))), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(jM24837getVehicleColor0Hk2hKA$default))}, j3, f5, 0, 8, (Object) null), f14, fFloatValue2, false, Offset.m6535constructorimpl((Float.floatToRawIntBits((Float.intBitsToFloat((int) (j3 & 4294967295L)) - f5) + f12) & 4294967295L) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (j3 >> c)) - f5) + f12) << c)), Size.m6575constructorimpl((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f13) << c2)), 0.0f, new Stroke(f4, 0.0f, StrokeCap.INSTANCE.m6848getButtKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
            f7 = f14 + fFloatValue2;
            fFloatValue = fFloatValue;
            i = i2;
            c = c2;
        }
    }

    private static final void EtpHoldingBreakdownChartPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-288788081);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288788081, i, -1, "com.robinhood.shared.common.etpcomposition.EtpHoldingBreakdownChartPreview (EtpHoldingRadialBreakdownChart.kt:423)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1621519545, true, new C374601(extensions2.persistentListOf(new EtpHolding("Stripe", null, null, 0.15f, "Fintech", "", null, new EtpHolding.CustomColor("#1565C0", "#42A5F5"), null, CollectionsKt.listOf((Object[]) new EtpHolding.Vehicle[]{new EtpHolding.Vehicle("Stripe SPV I", new BigDecimal("0.07"), new BigDecimal("0"), null), new EtpHolding.Vehicle("Stripe SPV II", new BigDecimal("0.05"), new BigDecimal("0"), null), new EtpHolding.Vehicle("Stripe SPV III", new BigDecimal("0.03"), new BigDecimal("0"), null)}), null), new EtpHolding("OpenAI", null, null, 0.12f, "AI", "", null, new EtpHolding.CustomColor("#4527A0", "#7E57C2"), null, CollectionsKt.listOf(new EtpHolding.Vehicle("OpenAI SPV", new BigDecimal("0.12"), new BigDecimal("0"), null)), null), new EtpHolding("SpaceX", null, null, 0.18f, "Aerospace", "", null, new EtpHolding.CustomColor("#00695C", "#26A69A"), null, CollectionsKt.listOf((Object[]) new EtpHolding.Vehicle[]{new EtpHolding.Vehicle("SpaceX Series N", new BigDecimal("0.12"), new BigDecimal("0"), null), new EtpHolding.Vehicle("SpaceX Tender Offer", new BigDecimal("0.06"), new BigDecimal("0"), null)}), null), new EtpHolding("Databricks", null, null, 0.1f, "Data", "", null, new EtpHolding.CustomColor("#EF6C00", "#FF9800"), null, CollectionsKt.listOf((Object[]) new EtpHolding.Vehicle[]{new EtpHolding.Vehicle("Fund A", new BigDecimal("0.05"), new BigDecimal("0"), null), new EtpHolding.Vehicle("Fund B", new BigDecimal("0.05"), new BigDecimal("0"), null)}), null), new EtpHolding("Cash", null, null, 0.25f, "Liquidity", "", null, new EtpHolding.CustomColor("#616161", "#B4BDC2"), null, null, null), new EtpHolding("Others", null, null, 0.2f, "Various", "", null, new EtpHolding.CustomColor("#283593", "#5C6BC0"), null, null, null))), composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EtpHoldingRadialBreakdownChart.EtpHoldingBreakdownChartPreview$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
