package com.robinhood.android.optionschain.sbschain.table;

import android.graphics.Canvas;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Rect2;
import androidx.compose.p011ui.geometry.RoundRect2;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathMeasure;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TableSpreadOverlay.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a[\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001ai\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010#\u001a\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010%\u001a#\u0010&\u001a\u00020\u000b*\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010(\u001a\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\rH\u0002\u001a\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\rH\u0002¨\u0006,²\u0006\n\u0010\u001c\u001a\u00020\rX\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"TableSpreadOverlayInline", "", "legRowIndexRange", "Lkotlin/ranges/IntRange;", "quoteIndex", "", "cellWidth", "Landroidx/compose/ui/unit/Dp;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "sharedScrollValue", "", "showBorderAnimation", "", "onBorderAnimationFinished", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "TableSpreadOverlayInline-UR9CgXA", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;FLandroidx/compose/foundation/lazy/LazyListState;FZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TableSpreadOverlayOnDrag", "overlayYOffsetPx", "overlayHeight", "TableSpreadOverlayOnDrag-PBTpf3Q", "(FFFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TableSpreadOverlay", "overlayXOffsetPx", "gradientAlpha", "borderAnimationInProgress", "borderAnimationProgress", "borderAnimationAlpha", "borderAlpha", "TableSpreadOverlay-EeR-3n4", "(FFFFFLandroidx/compose/ui/Modifier;ZFFFLandroidx/compose/runtime/Composer;II)V", "calculateOverlayYOffsetPx", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/LazyListState;ILandroidx/compose/runtime/Composer;I)Ljava/lang/Float;", "calculateOverlayHeightPx", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)F", "calculateOverlayHeight", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;Lkotlin/ranges/IntRange;Ljava/lang/Integer;)F", "getDefaultGradientAlpha", "isDay", "getGradientAlphaHighlight", "feature-options-chain_externalDebug", "overlayYOffset"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class TableSpreadOverlay {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableSpreadOverlayInline_UR9CgXA$lambda$0(PrimitiveRanges2 primitiveRanges2, Integer num, float f, LazyListState lazyListState, float f2, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17296TableSpreadOverlayInlineUR9CgXA(primitiveRanges2, num, f, lazyListState, f2, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableSpreadOverlayInline_UR9CgXA$lambda$1(PrimitiveRanges2 primitiveRanges2, Integer num, float f, LazyListState lazyListState, float f2, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17296TableSpreadOverlayInlineUR9CgXA(primitiveRanges2, num, f, lazyListState, f2, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableSpreadOverlayInline_UR9CgXA$lambda$9(PrimitiveRanges2 primitiveRanges2, Integer num, float f, LazyListState lazyListState, float f2, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17296TableSpreadOverlayInlineUR9CgXA(primitiveRanges2, num, f, lazyListState, f2, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableSpreadOverlayOnDrag_PBTpf3Q$lambda$13(float f, float f2, float f3, float f4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m17297TableSpreadOverlayOnDragPBTpf3Q(f, f2, f3, f4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableSpreadOverlay_EeR_3n4$lambda$25(float f, float f2, float f3, float f4, float f5, Modifier modifier, boolean z, float f6, float f7, float f8, int i, int i2, Composer composer, int i3) {
        m17295TableSpreadOverlayEeR3n4(f, f2, f3, f4, f5, modifier, z, f6, f7, f8, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getDefaultGradientAlpha(boolean z) {
        return z ? 0.08f : 0.12f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getGradientAlphaHighlight(boolean z) {
        return z ? 0.12f : 0.22f;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* renamed from: TableSpreadOverlayInline-UR9CgXA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17296TableSpreadOverlayInlineUR9CgXA(final PrimitiveRanges2 primitiveRanges2, final Integer num, final float f, final LazyListState lazyListState, final float f2, final boolean z, final Function0<Unit> onBorderAnimationFinished, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i5;
        float f3;
        int i6;
        Animatable animatable;
        Animatable animatable2;
        Animatable animatable3;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(onBorderAnimationFinished, "onBorderAnimationFinished");
        Composer composerStartRestartGroup = composer.startRestartGroup(57078808);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(primitiveRanges2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(lazyListState) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onBorderAnimationFinished) ? 1048576 : 524288;
                }
                i4 = i2 & 128;
                if (i4 != 0) {
                    i3 |= 12582912;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(57078808, i3, -1, "com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayInline (TableSpreadOverlay.kt:49)");
                    }
                    if (primitiveRanges2 != null || num == null) {
                        final Modifier modifier5 = modifier3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$0(primitiveRanges2, num, f, lazyListState, f2, z, onBorderAnimationFinished, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    float f4 = -f2;
                    int i7 = i3 >> 6;
                    Float fCalculateOverlayYOffsetPx = calculateOverlayYOffsetPx(primitiveRanges2, lazyListState, num.intValue(), composerStartRestartGroup, (i3 & 14) | (i7 & 112) | ((i3 << 3) & 896));
                    if (fCalculateOverlayYOffsetPx == null) {
                        final Modifier modifier6 = modifier3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup3 != null) {
                            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$1(primitiveRanges2, num, f, lazyListState, f2, z, onBorderAnimationFinished, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    float fFloatValue = fCalculateOverlayYOffsetPx.floatValue();
                    float fCalculateOverlayHeightPx = calculateOverlayHeightPx(primitiveRanges2, num, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    boolean isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        i5 = 2;
                        objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i5 = 2;
                    }
                    Animatable animatable4 = (Animatable) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = Animatable2.Animatable$default(0.0f, 0.0f, i5, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Animatable animatable5 = (Animatable) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = Animatable2.Animatable$default(0.3f, 0.0f, i5, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Animatable animatable6 = (Animatable) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, i5, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    SnapshotState snapshotState = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = ((458752 & i3) == 131072) | composerStartRestartGroup.changedInstance(animatable6) | composerStartRestartGroup.changedInstance(animatable5) | composerStartRestartGroup.changedInstance(animatable4) | composerStartRestartGroup.changed(isDay) | ((3670016 & i3) == 1048576);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                        f3 = f4;
                        i6 = i3;
                        animatable = animatable6;
                        animatable2 = animatable4;
                        animatable3 = animatable5;
                        TableSpreadOverlay2 tableSpreadOverlay2 = new TableSpreadOverlay2(z2, animatable, onBorderAnimationFinished, animatable2, isDay, snapshotState, animatable3, null);
                        composerStartRestartGroup.updateRememberedValue(tableSpreadOverlay2);
                        objRememberedValue5 = tableSpreadOverlay2;
                    } else {
                        i6 = i3;
                        animatable2 = animatable4;
                        animatable3 = animatable5;
                        animatable = animatable6;
                        f3 = f4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, (i6 >> 15) & 14);
                    composer2 = composerStartRestartGroup;
                    Modifier modifier7 = modifier3;
                    m17295TableSpreadOverlayEeR3n4(f, f3, fFloatValue, fCalculateOverlayHeightPx, ((Number) animatable2.getValue()).floatValue(), modifier7, TableSpreadOverlayInline_UR9CgXA$lambda$6(snapshotState), ((Number) animatable3.getValue()).floatValue(), ((Number) animatable.getValue()).floatValue(), 0.0f, composer2, i7 & 458766, 512);
                    modifier4 = modifier7;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TableSpreadOverlay.TableSpreadOverlayInline_UR9CgXA$lambda$9(primitiveRanges2, num, f, lazyListState, f2, z, onBorderAnimationFinished, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z2 = z;
            if ((i2 & 64) != 0) {
            }
            i4 = i2 & 128;
            if (i4 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (primitiveRanges2 != null) {
                }
                final Modifier modifier52 = modifier3;
                if (ComposerKt.isTraceInProgress()) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        z2 = z;
        if ((i2 & 64) != 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TableSpreadOverlayInline_UR9CgXA$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean TableSpreadOverlayInline_UR9CgXA$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float calculateOverlayHeightPx$lambda$33(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final Float calculateOverlayYOffsetPx$lambda$30(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: TableSpreadOverlayOnDrag-PBTpf3Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17297TableSpreadOverlayOnDragPBTpf3Q(final float f, final float f2, final float f3, final float f4, Modifier modifier, Composer composer, final int i, final int i2) {
        float f5;
        int i3;
        float f6;
        float f7;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Animatable animatable;
        boolean isDay;
        boolean zChanged;
        Object objRememberedValue2;
        Animatable animatable2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-795183228);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f5 = f;
        } else {
            f5 = f;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(f5) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            f6 = f3;
        } else {
            f6 = f3;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(f6) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            f7 = f4;
        } else {
            f7 = f4;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(f7) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-795183228, i3, -1, "com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayOnDrag (TableSpreadOverlay.kt:122)");
                }
                float f8 = -f2;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(0.3f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(isDay);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = Animatable2.Animatable$default(getDefaultGradientAlpha(isDay), 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                animatable2 = (Animatable) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(isDay);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new TableSpreadOverlay6(animatable, animatable2, isDay, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                m17295TableSpreadOverlayEeR3n4(f5, f8, f6, f7, ((Number) animatable2.getValue()).floatValue(), modifier4, false, 0.0f, 0.0f, ((Number) animatable.getValue()).floatValue(), composer2, (i3 & 8078) | ((i3 << 3) & 458752), 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TableSpreadOverlay.TableSpreadOverlayOnDrag_PBTpf3Q$lambda$13(f, f2, f3, f4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f82 = -f2;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(isDay);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = Animatable2.Animatable$default(getDefaultGradientAlpha(isDay), 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                animatable2 = (Animatable) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(isDay);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue3 = new TableSpreadOverlay6(animatable, animatable2, isDay, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
                    composer2 = composerStartRestartGroup;
                    m17295TableSpreadOverlayEeR3n4(f5, f82, f6, f7, ((Number) animatable2.getValue()).floatValue(), modifier4, false, 0.0f, 0.0f, ((Number) animatable.getValue()).floatValue(), composer2, (i3 & 8078) | ((i3 << 3) & 458752), 448);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /* renamed from: TableSpreadOverlay-EeR-3n4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m17295TableSpreadOverlayEeR3n4(final float f, final float f2, final float f3, final float f4, final float f5, Modifier modifier, boolean z, float f6, float f7, float f8, Composer composer, final int i, final int i2) {
        int i3;
        float f9;
        Modifier modifier2;
        int i4;
        boolean z2;
        char c;
        int i5;
        float f10;
        int i6;
        int i7;
        int i8;
        int i9;
        final boolean z3;
        final float f11;
        final long jM6535constructorimpl;
        final long jM6575constructorimpl;
        final Brush brushM6676horizontalGradient8A3gB4$default;
        final Brush brushM6676horizontalGradient8A3gB4$default2;
        final Brush brushM6676horizontalGradient8A3gB4$default3;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        final Modifier modifier3;
        final float f12;
        final boolean z4;
        final float f13;
        final float f14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1061969235);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            f9 = f5;
        } else {
            f9 = f5;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(f9) ? 16384 : 8192;
            }
        }
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                z2 = z;
                c = ' ';
            } else {
                z2 = z;
                c = ' ';
                if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                }
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changed(f10) ? 8388608 : 4194304;
                }
            }
            i6 = i2 & 256;
            if (i6 == 0) {
                i3 |= 100663296;
            } else {
                if ((i & 100663296) == 0) {
                    i7 = i6;
                    i3 |= composerStartRestartGroup.changed(f7) ? 67108864 : 33554432;
                }
                i8 = i2 & 512;
                if (i8 == 0) {
                    if ((i & 805306368) == 0) {
                        i9 = i8;
                        i3 |= composerStartRestartGroup.changed(f8) ? 536870912 : 268435456;
                    }
                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        z3 = i4 == 0 ? false : z2;
                        f11 = i5 == 0 ? 0.0f : f10;
                        float f15 = i7 == 0 ? 0.3f : f7;
                        float f16 = i9 == 0 ? 0.3f : f8;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1061969235, i3, -1, "com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlay (TableSpreadOverlay.kt:175)");
                        }
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        float f17 = 2;
                        float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f * f17) - C2002Dp.m7995constructorimpl(TableConstants.getSpreadOverlayHorizontalPadding() * f17)));
                        float fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(TableConstants.getSpreadOverlayBorderStrokeWidth() / f17));
                        jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(density.mo5016toPx0680j_4(TableConstants.getSpreadOverlayHorizontalPadding()) + f2) << c) | (Float.floatToRawIntBits(f3 + fMo5016toPx0680j_42) & 4294967295L));
                        jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << c) | (Float.floatToRawIntBits(f4 - fMo5016toPx0680j_42) & 4294967295L));
                        Brush.Companion companion2 = Brush.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        List listListOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21452getNegative0d7_KjU(), f9, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21456getPositive0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21456getPositive0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null))});
                        int i12 = (int) (jM6535constructorimpl >> c);
                        int i13 = (int) (jM6575constructorimpl >> c);
                        brushM6676horizontalGradient8A3gB4$default = Brush.Companion.m6676horizontalGradient8A3gB4$default(companion2, listListOf, Float.intBitsToFloat(i12), Float.intBitsToFloat(i12) + Float.intBitsToFloat(i13), 0, 8, (Object) null);
                        int i14 = i3;
                        float f18 = f16;
                        brushM6676horizontalGradient8A3gB4$default2 = Brush.Companion.m6676horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21452getNegative0d7_KjU(), f16, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21456getPositive0d7_KjU(), f16, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21456getPositive0d7_KjU(), f16, 0.0f, 0.0f, 0.0f, 14, null))}), Float.intBitsToFloat(i12), Float.intBitsToFloat(i12) + Float.intBitsToFloat(i13), 0, 8, (Object) null);
                        brushM6676horizontalGradient8A3gB4$default3 = Brush.Companion.m6676horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21452getNegative0d7_KjU(), f15, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21456getPositive0d7_KjU(), f15, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i11).m21456getPositive0d7_KjU(), f15, 0.0f, 0.0f, 0.0f, 14, null))}), Float.intBitsToFloat(i12), Float.intBitsToFloat(i12) + Float.intBitsToFloat(i13), 0, 8, (Object) null);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TableSpreadOverlay.TableSpreadOverlay_EeR_3n4$lambda$18$lambda$17((GraphicsLayerScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierClipToBounds = Clip.clipToBounds(SizeKt.fillMaxSize$default(GraphicsLayerModifier6.graphicsLayer(modifier2, (Function1) objRememberedValue), 0.0f, 1, null));
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i14 & 3670016) != 1048576) | composerStartRestartGroup.changed(brushM6676horizontalGradient8A3gB4$default2) | composerStartRestartGroup.changed(jM6535constructorimpl) | composerStartRestartGroup.changed(jM6575constructorimpl) | ((i14 & 29360128) != 8388608) | composerStartRestartGroup.changed(brushM6676horizontalGradient8A3gB4$default3) | composerStartRestartGroup.changed(brushM6676horizontalGradient8A3gB4$default);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return TableSpreadOverlay.TableSpreadOverlay_EeR_3n4$lambda$24$lambda$23(brushM6676horizontalGradient8A3gB4$default, jM6535constructorimpl, jM6575constructorimpl, z3, brushM6676horizontalGradient8A3gB4$default2, f11, brushM6676horizontalGradient8A3gB4$default3, (DrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifierClipToBounds, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        f12 = f18;
                        z4 = z3;
                        f13 = f11;
                        f14 = f15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f13 = f10;
                        z4 = z2;
                        modifier3 = modifier2;
                        f14 = f7;
                        f12 = f8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return TableSpreadOverlay.TableSpreadOverlay_EeR_3n4$lambda$25(f, f2, f3, f4, f5, modifier3, z4, f13, f14, f12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 805306368;
                i9 = i8;
                if ((i3 & 306783379) == 306783378) {
                    if (i10 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    float f172 = 2;
                    float fMo5016toPx0680j_43 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(f * f172) - C2002Dp.m7995constructorimpl(TableConstants.getSpreadOverlayHorizontalPadding() * f172)));
                    float fMo5016toPx0680j_422 = density2.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(TableConstants.getSpreadOverlayBorderStrokeWidth() / f172));
                    jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(density2.mo5016toPx0680j_4(TableConstants.getSpreadOverlayHorizontalPadding()) + f2) << c) | (Float.floatToRawIntBits(f3 + fMo5016toPx0680j_422) & 4294967295L));
                    jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_43) << c) | (Float.floatToRawIntBits(f4 - fMo5016toPx0680j_422) & 4294967295L));
                    Brush.Companion companion22 = Brush.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i112 = BentoTheme.$stable;
                    List listListOf2 = CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21452getNegative0d7_KjU(), f9, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21456getPositive0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21456getPositive0d7_KjU(), f5, 0.0f, 0.0f, 0.0f, 14, null))});
                    int i122 = (int) (jM6535constructorimpl >> c);
                    int i132 = (int) (jM6575constructorimpl >> c);
                    brushM6676horizontalGradient8A3gB4$default = Brush.Companion.m6676horizontalGradient8A3gB4$default(companion22, listListOf2, Float.intBitsToFloat(i122), Float.intBitsToFloat(i122) + Float.intBitsToFloat(i132), 0, 8, (Object) null);
                    int i142 = i3;
                    float f182 = f16;
                    brushM6676horizontalGradient8A3gB4$default2 = Brush.Companion.m6676horizontalGradient8A3gB4$default(companion22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21452getNegative0d7_KjU(), f16, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21456getPositive0d7_KjU(), f16, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21456getPositive0d7_KjU(), f16, 0.0f, 0.0f, 0.0f, 14, null))}), Float.intBitsToFloat(i122), Float.intBitsToFloat(i122) + Float.intBitsToFloat(i132), 0, 8, (Object) null);
                    brushM6676horizontalGradient8A3gB4$default3 = Brush.Companion.m6676horizontalGradient8A3gB4$default(companion22, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21452getNegative0d7_KjU(), f15, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21456getPositive0d7_KjU(), f15, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i112).m21456getPositive0d7_KjU(), f15, 0.0f, 0.0f, 0.0f, 14, null))}), Float.intBitsToFloat(i122), Float.intBitsToFloat(i122) + Float.intBitsToFloat(i132), 0, 8, (Object) null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierClipToBounds2 = Clip.clipToBounds(SizeKt.fillMaxSize$default(GraphicsLayerModifier6.graphicsLayer(modifier2, (Function1) objRememberedValue), 0.0f, 1, null));
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = ((i142 & 3670016) != 1048576) | composerStartRestartGroup.changed(brushM6676horizontalGradient8A3gB4$default2) | composerStartRestartGroup.changed(jM6535constructorimpl) | composerStartRestartGroup.changed(jM6575constructorimpl) | ((i142 & 29360128) != 8388608) | composerStartRestartGroup.changed(brushM6676horizontalGradient8A3gB4$default3) | composerStartRestartGroup.changed(brushM6676horizontalGradient8A3gB4$default);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TableSpreadOverlay.TableSpreadOverlay_EeR_3n4$lambda$24$lambda$23(brushM6676horizontalGradient8A3gB4$default, jM6535constructorimpl, jM6575constructorimpl, z3, brushM6676horizontalGradient8A3gB4$default2, f11, brushM6676horizontalGradient8A3gB4$default3, (DrawScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Canvas2.Canvas(modifierClipToBounds2, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        f12 = f182;
                        z4 = z3;
                        f13 = f11;
                        f14 = f15;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i6;
            i8 = i2 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i2 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableSpreadOverlay_EeR_3n4$lambda$18$lambda$17(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableSpreadOverlay_EeR_3n4$lambda$24$lambda$23(Brush brush, long j, long j2, boolean z, Brush brush2, float f, Brush brush3, DrawScope Canvas) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(Canvas.getDrawContext().getCanvas());
        int iSaveLayer = nativeCanvas.saveLayer(null, null);
        if (z) {
            i = iSaveLayer;
            i2 = 24;
        } else {
            float f2 = 24;
            float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f2));
            float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f2));
            i = iSaveLayer;
            i2 = 24;
            DrawScope.m6959drawRoundRectZuiqVtQ$default(Canvas, brush2, j, j2, CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L)), 0.0f, new Stroke(Canvas.mo5016toPx0680j_4(TableConstants.getSpreadOverlayBorderStrokeWidth()), 0.0f, 0, 0, null, 30, null), null, 0, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, null);
        }
        if (z) {
            Path Path = AndroidPath_androidKt.Path();
            Rect rectM6565Recttz77jQw = Rect2.m6565Recttz77jQw(j, j2);
            float f3 = i2;
            float fMo5016toPx0680j_43 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f3));
            float fMo5016toPx0680j_44 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f3));
            Path.addRoundRect$default(Path, RoundRect2.m6573RoundRectsniSvfs(rectM6565Recttz77jQw, CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_43) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_44) & 4294967295L))), null, 2, null);
            PathMeasure PathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
            PathMeasure.setPath(Path, false);
            float length = PathMeasure.getLength();
            float f4 = f * length;
            float f5 = 1.25f * f4;
            float f6 = length - (f5 % length);
            float f7 = length - ((f4 * 0.25f) % length);
            Path Path2 = AndroidPath_androidKt.Path();
            if (f5 < length) {
                PathMeasure.getSegment(f6, f7, Path2, true);
            } else {
                PathMeasure.getSegment(f6, length, Path2, true);
                PathMeasure.getSegment(0.0f, f7, Path2, true);
            }
            DrawScope.m6954drawPathGBMwjPU$default(Canvas, Path2, brush3, 0.0f, new Stroke(Canvas.mo5016toPx0680j_4(TableConstants.getSpreadOverlayBorderStrokeWidth()), 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        }
        nativeCanvas.restoreToCount(i);
        float f8 = i2;
        float fMo5016toPx0680j_45 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f8));
        float fMo5016toPx0680j_46 = Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(f8));
        DrawScope.m6959drawRoundRectZuiqVtQ$default(Canvas, brush, j, j2, CornerRadius.m6528constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_45) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_46) & 4294967295L)), 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        return Unit.INSTANCE;
    }

    public static final Float calculateOverlayYOffsetPx(final PrimitiveRanges2 legRowIndexRange, final LazyListState lazyListState, final int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(legRowIndexRange, "legRowIndexRange");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceGroup(-1181614785);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1181614785, i2, -1, "com.robinhood.android.optionschain.sbschain.table.calculateOverlayYOffsetPx (TableSpreadOverlay.kt:303)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(legRowIndexRange);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TableSpreadOverlay.calculateOverlayYOffsetPx$lambda$29$lambda$28(lazyListState, legRowIndexRange, i, density);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Float fCalculateOverlayYOffsetPx$lambda$30 = calculateOverlayYOffsetPx$lambda$30((SnapshotState4) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fCalculateOverlayYOffsetPx$lambda$30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float calculateOverlayYOffsetPx$lambda$29$lambda$28(LazyListState lazyListState, PrimitiveRanges2 primitiveRanges2, int i, Density density) {
        Object next;
        float fM7995constructorimpl;
        Iterator<T> it = lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int first = primitiveRanges2.getFirst();
            int last = primitiveRanges2.getLast();
            int index = ((LazyListItemInfo) next).getIndex();
            if (first <= index && index <= last) {
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo == null) {
            return null;
        }
        int first2 = primitiveRanges2.getFirst();
        if (i > primitiveRanges2.getLast() || first2 > i || lazyListItemInfo.getIndex() <= i) {
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
        } else {
            fM7995constructorimpl = TableConstants.getCellAndQuoteRowHeightOffset();
        }
        return Float.valueOf(lazyListItemInfo.getOffset() - density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(TableConstants.getCellHeightDp() * (lazyListItemInfo.getIndex() - primitiveRanges2.getFirst())) - fM7995constructorimpl)));
    }

    public static final float calculateOverlayHeightPx(final PrimitiveRanges2 legRowIndexRange, final Integer num, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(legRowIndexRange, "legRowIndexRange");
        composer.startReplaceGroup(1932859709);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1932859709, i, -1, "com.robinhood.android.optionschain.sbschain.table.calculateOverlayHeightPx (TableSpreadOverlay.kt:328)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        int first = legRowIndexRange.getFirst();
        int last = legRowIndexRange.getLast();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = ((((i & 112) ^ 48) > 32 && composer.changed(num)) || (i & 48) == 32) | composer.changed(first) | composer.changed(last);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.TableSpreadOverlayKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(TableSpreadOverlay.calculateOverlayHeight(density, legRowIndexRange, num));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        float fCalculateOverlayHeightPx$lambda$33 = calculateOverlayHeightPx$lambda$33((SnapshotState4) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fCalculateOverlayHeightPx$lambda$33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateOverlayHeight(Density density, PrimitiveRanges2 primitiveRanges2, Integer num) {
        if (num != null && primitiveRanges2.contains(num.intValue())) {
            density.getDensity();
            return density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(TableConstants.getCellHeightDp() * (primitiveRanges2.getLast() - primitiveRanges2.getFirst())) + TableConstants.getQuoteRowHeightDp()));
        }
        density.getDensity();
        return density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(TableConstants.getCellHeightDp() * ((primitiveRanges2.getLast() - primitiveRanges2.getFirst()) + 1)));
    }
}
