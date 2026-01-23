package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier4;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextPainter2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints2;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState7;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TooltipOverlay.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ay\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aa\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\tH\u0003¢\u0006\u0004\b \u0010!\u001a3\u0010\"\u001a\u00020\u0001*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+¨\u0006,²\u0006\n\u0010-\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"TooltipOverlay", "", "tooltipState", "Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "spreadSelectionState", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "quoteIndex", "", "callXOffsetPx", "", "putXOffsetPx", "cellWidth", "Landroidx/compose/ui/unit/Dp;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "setSeenSpreadTooltip", "Lkotlin/Function0;", "logSpreadTooltipAppear", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "TooltipOverlay-zadm560", "(Lcom/robinhood/android/optionschain/sbschain/TooltipState;Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;Ljava/lang/Integer;FFFLandroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "calculateTooltipPositions", "Lkotlin/Triple;", "Landroidx/compose/ui/geometry/Offset;", "Lcom/robinhood/android/optionschain/sbschain/table/TriangleDirection;", "overlayYOffsetPx", "overlayHeight", "contractType", "Lcom/robinhood/models/db/OptionContractType;", "boxHeight", "calculateTooltipPositions-au3_HiA", "(Landroidx/compose/foundation/lazy/LazyListState;FFLcom/robinhood/models/db/OptionContractType;FFFFLandroidx/compose/runtime/Composer;I)Lkotlin/Triple;", "drawTriangle", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "startOffset", "size", "Landroidx/compose/ui/geometry/Size;", "direction", "drawTriangle-WbHHSPI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJLcom/robinhood/android/optionschain/sbschain/table/TriangleDirection;)V", "feature-options-chain_externalDebug", "topSpace", "bottomSpace"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class TooltipOverlay {

    /* compiled from: TooltipOverlay.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TooltipOverlay3.values().length];
            try {
                iArr2[TooltipOverlay3.f4807UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TooltipOverlay3.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipOverlay_zadm560$lambda$0(OptionSideBySideChainDataState7 optionSideBySideChainDataState7, SpreadSelectionState spreadSelectionState, Integer num, float f, float f2, float f3, LazyListState lazyListState, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17301TooltipOverlayzadm560(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipOverlay_zadm560$lambda$1(OptionSideBySideChainDataState7 optionSideBySideChainDataState7, SpreadSelectionState spreadSelectionState, Integer num, float f, float f2, float f3, LazyListState lazyListState, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17301TooltipOverlayzadm560(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipOverlay_zadm560$lambda$14(OptionSideBySideChainDataState7 optionSideBySideChainDataState7, SpreadSelectionState spreadSelectionState, Integer num, float f, float f2, float f3, LazyListState lazyListState, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17301TooltipOverlayzadm560(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipOverlay_zadm560$lambda$2(OptionSideBySideChainDataState7 optionSideBySideChainDataState7, SpreadSelectionState spreadSelectionState, Integer num, float f, float f2, float f3, LazyListState lazyListState, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17301TooltipOverlayzadm560(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipOverlay_zadm560$lambda$3(OptionSideBySideChainDataState7 optionSideBySideChainDataState7, SpreadSelectionState spreadSelectionState, Integer num, float f, float f2, float f3, LazyListState lazyListState, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17301TooltipOverlayzadm560(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* renamed from: TooltipOverlay-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17301TooltipOverlayzadm560(final OptionSideBySideChainDataState7 optionSideBySideChainDataState7, final SpreadSelectionState spreadSelectionState, final Integer num, final float f, final float f2, final float f3, final LazyListState lazyListState, final Function0<Unit> setSeenSpreadTooltip, final Function1<? super SpreadSelectionState, Unit> logSpreadTooltipAppear, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        float f4;
        char c;
        float f5;
        int i4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        OptionContractType optionContractType;
        float f6;
        long jM21372getBg20d7_KjU;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(setSeenSpreadTooltip, "setSeenSpreadTooltip");
        Intrinsics.checkNotNullParameter(logSpreadTooltipAppear, "logSpreadTooltipAppear");
        Composer composerStartRestartGroup = composer.startRestartGroup(-920172734);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(optionSideBySideChainDataState7 == null ? -1 : optionSideBySideChainDataState7.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(spreadSelectionState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i2 & 8) == 0) {
            if ((i & 3072) == 0) {
                f4 = f;
                i3 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
                f5 = f2;
                c = ' ';
            } else {
                c = ' ';
                if ((i & 24576) == 0) {
                    f5 = f2;
                    i3 |= composerStartRestartGroup.changed(f5) ? 16384 : 8192;
                } else {
                    f5 = f2;
                }
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(lazyListState) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(setSeenSpreadTooltip) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(logSpreadTooltipAppear) ? 67108864 : 33554432;
            }
            i4 = i2 & 512;
            if (i4 == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
            }
            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-920172734, i3, -1, "com.robinhood.android.optionschain.sbschain.table.TooltipOverlay (TooltipOverlay.kt:46)");
                }
                if (optionSideBySideChainDataState7 == OptionSideBySideChainDataState7.SPREAD_DRAG_NUX || spreadSelectionState == null || num == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipOverlay.TooltipOverlay_zadm560$lambda$0(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, setSeenSpreadTooltip, logSpreadTooltipAppear, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                OptionContractType optionContractType2 = OptionContractType.CALL;
                PrimitiveRanges2 rowIndexRange = spreadSelectionState.getRowIndexRange(optionContractType2);
                OptionContractType optionContractType3 = OptionContractType.PUT;
                PrimitiveRanges2 rowIndexRange2 = spreadSelectionState.getRowIndexRange(optionContractType3);
                if (rowIndexRange != null) {
                    optionContractType = optionContractType2;
                } else {
                    if (rowIndexRange2 == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup3 != null) {
                            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TooltipOverlay.TooltipOverlay_zadm560$lambda$1(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, setSeenSpreadTooltip, logSpreadTooltipAppear, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    optionContractType = optionContractType3;
                }
                PrimitiveRanges2 rowIndexRange3 = spreadSelectionState.getRowIndexRange(optionContractType);
                if (rowIndexRange3 == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup4 != null) {
                        final float f7 = f4;
                        final float f8 = f5;
                        scopeUpdateScopeEndRestartGroup4.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipOverlay.TooltipOverlay_zadm560$lambda$2(optionSideBySideChainDataState7, spreadSelectionState, num, f7, f8, f3, lazyListState, setSeenSpreadTooltip, logSpreadTooltipAppear, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final Modifier modifier4 = modifier3;
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                int i5 = WhenMappings.$EnumSwitchMapping$0[optionContractType.ordinal()];
                if (i5 == 1) {
                    f6 = f;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f6 = f2;
                }
                Float fCalculateOverlayYOffsetPx = TableSpreadOverlay.calculateOverlayYOffsetPx(rowIndexRange3, lazyListState, num.intValue(), composerStartRestartGroup, ((i3 >> 15) & 112) | (i3 & 896));
                if (fCalculateOverlayYOffsetPx != null) {
                    float fFloatValue = fCalculateOverlayYOffsetPx.floatValue();
                    long jFloatToRawIntBits = Float.floatToRawIntBits(f6 + density.mo5016toPx0680j_4(TableConstants.getSpreadOverlayHorizontalPadding()));
                    int iFloatToRawIntBits = Float.floatToRawIntBits(fFloatValue);
                    OptionContractType optionContractType4 = optionContractType;
                    long jM6535constructorimpl = Offset.m6535constructorimpl((iFloatToRawIntBits & 4294967295L) | (jFloatToRawIntBits << c));
                    float fCalculateOverlayHeightPx = TableSpreadOverlay.calculateOverlayHeightPx(rowIndexRange3, num, composerStartRestartGroup, (i3 >> 3) & 112);
                    float f9 = 2;
                    float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f3 * f9) - C2002Dp.m7995constructorimpl(TableConstants.getSpreadOverlayHorizontalPadding() * f9)));
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | composerStartRestartGroup.changedInstance(spreadSelectionState);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new TooltipOverlay2(setSeenSpreadTooltip, logSpreadTooltipAppear, spreadSelectionState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    final long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                    int i7 = i3;
                    final Rect rectM6565Recttz77jQw = Rect2.m6565Recttz77jQw(jM6535constructorimpl, Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << c) | (Float.floatToRawIntBits(fCalculateOverlayHeightPx) & 4294967295L)));
                    if (bentoTheme.getColors(composerStartRestartGroup, i6).getIsDay()) {
                        composerStartRestartGroup.startReplaceGroup(1912393307);
                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).getJet();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1912435963);
                        jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    final long j = jM21372getBg20d7_KjU;
                    TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                    String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_side_by_side_chain_nux_spread_tooltip, composerStartRestartGroup, 0);
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                    final long nova = bentoTheme.getColors(composerStartRestartGroup, i6).getNova();
                    composerStartRestartGroup.startReplaceGroup(477343440);
                    final float fMo7449getContainerSizeYbymL2g = ((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> c)) - (density.mo5016toPx0680j_4(TableConstants.getSpreadTooltipBoxHorizontalPadding()) * f9);
                    composerStartRestartGroup.endReplaceGroup();
                    final TextLayoutResult textLayoutResultM7623measurewNUYSr0$default = TextMeasurer.m7623measurewNUYSr0$default(textMeasurerRememberTextMeasurer, strStringResource, textM, TextOverflow.INSTANCE.m7962getVisiblegIe3tQ8(), false, 0, Constraints2.Constraints$default(0, (int) (fMo7449getContainerSizeYbymL2g - (density.mo5016toPx0680j_4(TableConstants.getSpreadTooltipTextHorizontalPadding()) * f9)), 0, 0, 13, null), null, null, null, false, 984, null);
                    final float size = ((int) (textLayoutResultM7623measurewNUYSr0$default.getSize() & 4294967295L)) + (density.mo5016toPx0680j_4(TableConstants.getSpreadTooltipTextVerticalPadding()) * f9);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6535constructorimpl & 4294967295L));
                    int i8 = i7 << 3;
                    composer2 = composerStartRestartGroup;
                    Tuples3<Offset, Offset, TooltipOverlay3> tuples3M17302calculateTooltipPositionsau3_HiA = m17302calculateTooltipPositionsau3_HiA(lazyListState, fIntBitsToFloat, fCalculateOverlayHeightPx, optionContractType4, f, f2, f3, size, composer2, ((i7 >> 18) & 14) | (57344 & i8) | (458752 & i8) | (i8 & 3670016));
                    final long packedValue = tuples3M17302calculateTooltipPositionsau3_HiA.component1().getPackedValue();
                    final long packedValue2 = tuples3M17302calculateTooltipPositionsau3_HiA.component2().getPackedValue();
                    final TooltipOverlay3 tooltipOverlay3Component3 = tuples3M17302calculateTooltipPositionsau3_HiA.component3();
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TooltipOverlay.TooltipOverlay_zadm560$lambda$11$lambda$10((GraphicsLayerScope) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(GraphicsLayerModifier6.graphicsLayer(modifier4, (Function1) objRememberedValue2), 0.0f, 1, null);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChanged = composer2.changed(jM6705copywmQWz5c$default) | composer2.changed(rectM6565Recttz77jQw) | composer2.changed(j) | composer2.changed(packedValue2) | composer2.changed(tooltipOverlay3Component3.ordinal()) | composer2.changed(packedValue) | composer2.changed(fMo7449getContainerSizeYbymL2g) | composer2.changed(size) | composer2.changedInstance(textLayoutResultM7623measurewNUYSr0$default) | composer2.changed(nova);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TooltipOverlay.TooltipOverlay_zadm560$lambda$13$lambda$12(jM6705copywmQWz5c$default, rectM6565Recttz77jQw, j, packedValue2, tooltipOverlay3Component3, packedValue, fMo7449getContainerSizeYbymL2g, size, textLayoutResultM7623measurewNUYSr0$default, nova, (DrawScope) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    Canvas2.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue3, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup5 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup5 != null) {
                        scopeUpdateScopeEndRestartGroup5.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TooltipOverlay.TooltipOverlay_zadm560$lambda$3(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, setSeenSpreadTooltip, logSpreadTooltipAppear, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TooltipOverlay.TooltipOverlay_zadm560$lambda$14(optionSideBySideChainDataState7, spreadSelectionState, num, f, f2, f3, lazyListState, setSeenSpreadTooltip, logSpreadTooltipAppear, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        f4 = f;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (optionSideBySideChainDataState7 == OptionSideBySideChainDataState7.SPREAD_DRAG_NUX) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    private static final float calculateTooltipPositions_au3_HiA$lambda$18(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float calculateTooltipPositions_au3_HiA$lambda$21(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipOverlay_zadm560$lambda$11$lambda$10(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.mo6762setCompositingStrategyaDBOjCE(GraphicsLayerModifier4.INSTANCE.m6750getOffscreenNrFUSI());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipOverlay_zadm560$lambda$13$lambda$12(long j, Rect rect, long j2, long j3, TooltipOverlay3 tooltipOverlay3, long j4, float f, float f2, TextLayoutResult textLayoutResult, long j5, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6958drawRectnJ9OG0$default(Canvas, j, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        DrawScope.m6958drawRectnJ9OG0$default(Canvas, Color.INSTANCE.m6725getTransparent0d7_KjU(), rect.m6560getTopLeftF1C5BW0(), rect.m6559getSizeNHjbRc(), 0.0f, null, null, BlendMode.INSTANCE.m6643getClear0nO6VwU(), 56, null);
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(TableConstants.getTooltipArrowWidth());
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(TableConstants.getTooltipArrowHeight());
        m17303drawTriangleWbHHSPI(Canvas, j2, j3, Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32)), tooltipOverlay3);
        long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        float fMo5016toPx0680j_43 = Canvas.mo5016toPx0680j_4(TableConstants.getTooltipRoundedCornerRadius());
        DrawScope.m6960drawRoundRectuAw5IA$default(Canvas, j2, j4, jM6575constructorimpl, CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_43) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_43) & 4294967295L)), null, 0.0f, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        float fMo5016toPx0680j_44 = Canvas.mo5016toPx0680j_4(TableConstants.getSpreadTooltipTextHorizontalPadding());
        float fMo5016toPx0680j_45 = Canvas.mo5016toPx0680j_4(TableConstants.getSpreadTooltipTextVerticalPadding());
        TextPainter2.m7631drawTextd8rzKo(Canvas, textLayoutResult, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 2) != 0 ? Color.INSTANCE.m6726getUnspecified0d7_KjU() : j5, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 4) != 0 ? Offset.INSTANCE.m6553getZeroF1C5BW0() : Offset.m6547plusMKHz9U(j4, Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_45) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_44) << 32))), (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 8) != 0 ? Float.NaN : 0.0f, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 16) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 32) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 64) == 0 ? null : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE & 128) != 0 ? DrawScope.INSTANCE.m6964getDefaultBlendMode0nO6VwU() : 0);
        return Unit.INSTANCE;
    }

    /* renamed from: calculateTooltipPositions-au3_HiA, reason: not valid java name */
    private static final Tuples3<Offset, Offset, TooltipOverlay3> m17302calculateTooltipPositionsau3_HiA(final LazyListState lazyListState, final float f, final float f2, OptionContractType optionContractType, float f3, float f4, float f5, float f6, Composer composer, int i) {
        float fMo5016toPx0680j_4;
        long jM6537copydBAh8RU$default;
        long jM6537copydBAh8RU$default2;
        TooltipOverlay3 tooltipOverlay3;
        composer.startReplaceGroup(355747726);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(355747726, i, -1, "com.robinhood.android.optionschain.sbschain.table.calculateTooltipPositions (TooltipOverlay.kt:175)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float fMo5016toPx0680j_42 = f6 + density.mo5016toPx0680j_4(TableConstants.getSpreadTooltipOffsetFromSpreadOverlay());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(TooltipOverlay.calculateTooltipPositions_au3_HiA$lambda$17$lambda$16(f, lazyListState));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.TooltipOverlayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(TooltipOverlay.calculateTooltipPositions_au3_HiA$lambda$20$lambda$19(lazyListState, f, f2));
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
        composer.endReplaceGroup();
        long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(density.mo5016toPx0680j_4(TableConstants.getSpreadTooltipBoxHorizontalPadding())) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        int i2 = WhenMappings.$EnumSwitchMapping$0[optionContractType.ordinal()];
        if (i2 == 1) {
            fMo5016toPx0680j_4 = f3 + density.mo5016toPx0680j_4(f5);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fMo5016toPx0680j_4 = f4 + density.mo5016toPx0680j_4(f5);
        }
        long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        if (calculateTooltipPositions_au3_HiA$lambda$21(snapshotState42) >= calculateTooltipPositions_au3_HiA$lambda$18(snapshotState4) && calculateTooltipPositions_au3_HiA$lambda$21(snapshotState42) > fMo5016toPx0680j_42) {
            jM6537copydBAh8RU$default = Offset.m6537copydBAh8RU$default(jM6535constructorimpl, 0.0f, f + f2 + density.mo5016toPx0680j_4(TableConstants.getSpreadTooltipOffsetFromSpreadOverlay()), 1, null);
            jM6537copydBAh8RU$default2 = Offset.m6537copydBAh8RU$default(jM6535constructorimpl2, 0.0f, Float.intBitsToFloat((int) (jM6537copydBAh8RU$default & 4294967295L)) - density.mo5016toPx0680j_4(TableConstants.getTooltipArrowHeight()), 1, null);
            tooltipOverlay3 = TooltipOverlay3.f4807UP;
        } else if (calculateTooltipPositions_au3_HiA$lambda$18(snapshotState4) >= calculateTooltipPositions_au3_HiA$lambda$21(snapshotState42) && calculateTooltipPositions_au3_HiA$lambda$18(snapshotState4) > fMo5016toPx0680j_42) {
            jM6537copydBAh8RU$default = Offset.m6537copydBAh8RU$default(jM6535constructorimpl, 0.0f, f - fMo5016toPx0680j_42, 1, null);
            jM6537copydBAh8RU$default2 = Offset.m6537copydBAh8RU$default(jM6535constructorimpl2, 0.0f, Float.intBitsToFloat((int) (jM6537copydBAh8RU$default & 4294967295L)) + f6, 1, null);
            tooltipOverlay3 = TooltipOverlay3.DOWN;
        } else {
            float f7 = 2;
            jM6537copydBAh8RU$default = Offset.m6537copydBAh8RU$default(jM6535constructorimpl, 0.0f, (f + (f2 / f7)) - (f6 / f7), 1, null);
            jM6537copydBAh8RU$default2 = Offset.m6537copydBAh8RU$default(jM6535constructorimpl2, 0.0f, Float.intBitsToFloat((int) (jM6537copydBAh8RU$default & 4294967295L)) - density.mo5016toPx0680j_4(TableConstants.getTooltipArrowHeight()), 1, null);
            tooltipOverlay3 = TooltipOverlay3.f4807UP;
        }
        Tuples3<Offset, Offset, TooltipOverlay3> tuples3 = new Tuples3<>(Offset.m6534boximpl(jM6537copydBAh8RU$default), Offset.m6534boximpl(jM6537copydBAh8RU$default2), tooltipOverlay3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tuples3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateTooltipPositions_au3_HiA$lambda$17$lambda$16(float f, LazyListState lazyListState) {
        return f - lazyListState.getLayoutInfo().getViewportStartOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateTooltipPositions_au3_HiA$lambda$20$lambda$19(LazyListState lazyListState, float f, float f2) {
        return (lazyListState.getLayoutInfo().getViewportEndOffset() - f) - f2;
    }

    /* renamed from: drawTriangle-WbHHSPI, reason: not valid java name */
    private static final void m17303drawTriangleWbHHSPI(DrawScope drawScope, long j, long j2, long j3, TooltipOverlay3 tooltipOverlay3) {
        Path Path;
        int i = WhenMappings.$EnumSwitchMapping$1[tooltipOverlay3.ordinal()];
        if (i == 1) {
            Path = AndroidPath_androidKt.Path();
            int i2 = (int) (j2 >> 32);
            int i3 = (int) (j2 & 4294967295L);
            Path.moveTo(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
            int i4 = (int) (j3 >> 32);
            float f = 2;
            int i5 = (int) (j3 & 4294967295L);
            Path.lineTo(Float.intBitsToFloat(i2) - (Float.intBitsToFloat(i4) / f), Float.intBitsToFloat(i3) + Float.intBitsToFloat(i5));
            Path.lineTo(Float.intBitsToFloat(i2) + (Float.intBitsToFloat(i4) / f), Float.intBitsToFloat(i3) + Float.intBitsToFloat(i5));
            Path.close();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Path = AndroidPath_androidKt.Path();
            int i6 = (int) (j2 >> 32);
            int i7 = (int) (j3 >> 32);
            float f2 = 2;
            int i8 = (int) (j2 & 4294967295L);
            Path.moveTo(Float.intBitsToFloat(i6) - (Float.intBitsToFloat(i7) / f2), Float.intBitsToFloat(i8));
            Path.lineTo(Float.intBitsToFloat(i6) + (Float.intBitsToFloat(i7) / f2), Float.intBitsToFloat(i8));
            Path.lineTo(Float.intBitsToFloat(i6), Float.intBitsToFloat(i8) + Float.intBitsToFloat((int) (j3 & 4294967295L)));
            Path.close();
        }
        DrawScope.m6955drawPathLG529CI$default(drawScope, Path, j, 0.0f, null, null, 0, 60, null);
    }
}
