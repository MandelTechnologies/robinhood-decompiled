package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionSideBySideChainItmOverlay.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a/\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0014X\u008a\u0084\u0002"}, m3636d2 = {"OptionSideBySideChainItmOverlay", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "quoteIndex", "", "callPutSwitcherState", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "topBannerErrorType", "Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Integer;Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;Lcom/robinhood/android/optionschain/sbschain/table/TopBannerErrorType;Landroidx/compose/runtime/Composer;I)V", "calculateItmSizes", "Lkotlin/Triple;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Offset;", "halfViewportHeightPx", "", "(Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;FLandroidx/compose/runtime/Composer;I)Lkotlin/Triple;", "feature-options-chain_externalDebug", "viewportEndOffset", "Landroidx/compose/ui/unit/Dp;", "overlayOffset"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainItmOverlay {

    /* compiled from: OptionSideBySideChainItmOverlay.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionSideBySideChainDataState2.values().length];
            try {
                iArr[OptionSideBySideChainDataState2.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionSideBySideChainDataState2.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionSideBySideChainDataState2.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainItmOverlay$lambda$0(LazyListState lazyListState, Integer num, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, TopBannerErrorType topBannerErrorType, int i, Composer composer, int i2) {
        OptionSideBySideChainItmOverlay(lazyListState, num, optionSideBySideChainDataState2, topBannerErrorType, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainItmOverlay$lambda$19(LazyListState lazyListState, Integer num, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, TopBannerErrorType topBannerErrorType, int i, Composer composer, int i2) {
        OptionSideBySideChainItmOverlay(lazyListState, num, optionSideBySideChainDataState2, topBannerErrorType, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OptionSideBySideChainItmOverlay$lambda$2$lambda$1(LazyListState lazyListState) {
        return ((int) (lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() & 4294967295L)) / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp OptionSideBySideChainItmOverlay$lambda$6$lambda$5(Density density, LazyListState lazyListState) {
        return C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM(lazyListState.getLayoutInfo().getViewportEndOffset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp OptionSideBySideChainItmOverlay$lambda$11$lambda$10(LazyListState lazyListState, Density density, Integer num, SnapshotState4 snapshotState4) {
        Object next;
        float fOptionSideBySideChainItmOverlay$lambda$7;
        Iterator<T> it = lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int index = ((LazyListItemInfo) next).getIndex();
            if (num != null && index == num.intValue()) {
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo != null) {
            fOptionSideBySideChainItmOverlay$lambda$7 = density.mo5013toDpu2uoSUM(lazyListItemInfo.getOffset());
        } else if (lazyListState.getFirstVisibleItemIndex() <= num.intValue()) {
            fOptionSideBySideChainItmOverlay$lambda$7 = OptionSideBySideChainItmOverlay$lambda$7(snapshotState4);
        } else {
            fOptionSideBySideChainItmOverlay$lambda$7 = C2002Dp.m7995constructorimpl(-TableConstants.getQuoteRowHeightDp());
        }
        return C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(fOptionSideBySideChainItmOverlay$lambda$7 + TableConstants.getHalfQuoteRowHeightDp()));
    }

    private static final float OptionSideBySideChainItmOverlay$lambda$12(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final float OptionSideBySideChainItmOverlay$lambda$3(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float OptionSideBySideChainItmOverlay$lambda$7(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    public static final void OptionSideBySideChainItmOverlay(final LazyListState lazyListState, final Integer num, final OptionSideBySideChainDataState2 callPutSwitcherState, final TopBannerErrorType topBannerErrorType, Composer composer, final int i) {
        int i2;
        Composer composer2;
        long jM6705copywmQWz5c$default;
        long jM6535constructorimpl;
        Brush brushM6677horizontalGradient8A3gB4$default;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.85f);
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1620970930);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(callPutSwitcherState.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(topBannerErrorType == null ? -1 : topBannerErrorType.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1620970930, i2, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlay (OptionSideBySideChainItmOverlay.kt:31)");
            }
            if (num == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionSideBySideChainItmOverlay.OptionSideBySideChainItmOverlay$lambda$0(lazyListState, num, callPutSwitcherState, topBannerErrorType, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(OptionSideBySideChainItmOverlay.OptionSideBySideChainItmOverlay$lambda$2$lambda$1(lazyListState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainItmOverlay.OptionSideBySideChainItmOverlay$lambda$6$lambda$5(density, lazyListState);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideChainItmOverlay.OptionSideBySideChainItmOverlay$lambda$11$lambda$10(lazyListState, density, num, snapshotState42);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(OptionSideBySideChainItmOverlay$lambda$12(snapshotState43));
            float fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(TableConstants.getStrikeCellWidthDp());
            composer2 = composerStartRestartGroup;
            int iMo7449getContainerSizeYbymL2g = (int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32);
            float fOptionSideBySideChainItmOverlay$lambda$3 = OptionSideBySideChainItmOverlay$lambda$3(snapshotState4) * 2;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            float f = bentoTheme.getColors(composer2, i3).getIsDay() ? 0.06f : 0.08f;
            if (topBannerErrorType != null) {
                composer2.startReplaceGroup(2029303597);
                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(2029376199);
                jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer2, i3).m21456getPositive0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.endReplaceGroup();
            }
            Tuples3<Size, Size, Offset> tuples3CalculateItmSizes = calculateItmSizes(callPutSwitcherState, OptionSideBySideChainItmOverlay$lambda$3(snapshotState4), composer2, (i2 >> 6) & 14);
            final long packedValue = tuples3CalculateItmSizes.component1().getPackedValue();
            final long packedValue2 = tuples3CalculateItmSizes.component2().getPackedValue();
            final long packedValue3 = tuples3CalculateItmSizes.component3().getPackedValue();
            final long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i4 = iArr[callPutSwitcherState.ordinal()];
            if (i4 == 1) {
                jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits((-fMo5016toPx0680j_4) - fOptionSideBySideChainItmOverlay$lambda$3) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            } else if (i4 == 2) {
                jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits((-fMo5016toPx0680j_4) - fOptionSideBySideChainItmOverlay$lambda$3) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                float f2 = (iMo7449getContainerSizeYbymL2g - fMo5016toPx0680j_42) / 2.0f;
                jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits((-fMo5016toPx0680j_4) - fOptionSideBySideChainItmOverlay$lambda$3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
            }
            final long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) << 32) | (Float.floatToRawIntBits(fOptionSideBySideChainItmOverlay$lambda$3 * r15) & 4294967295L));
            Brush.Companion companion2 = Brush.INSTANCE;
            Color colorM6701boximpl = Color.m6701boximpl(jM6705copywmQWz5c$default);
            Color.Companion companion3 = Color.INSTANCE;
            final Brush brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU())}), 0.0f, OptionSideBySideChainItmOverlay$lambda$3(snapshotState4), 0, 8, (Object) null);
            final Brush brushM6682verticalGradient8A3gB4$default2 = Brush.Companion.m6682verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(jM6705copywmQWz5c$default), Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU())}), 0.0f, -OptionSideBySideChainItmOverlay$lambda$3(snapshotState4), 0, 8, (Object) null);
            int i5 = iArr[callPutSwitcherState.ordinal()];
            if (i5 == 1 || i5 == 2) {
                composer2.startReplaceGroup(-1319937349);
                Tuples2[] tuples2Arr = {Tuples4.m3642to(fValueOf2, Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU())), Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU()))};
                int i6 = (int) (jM6535constructorimpl >> 32);
                brushM6677horizontalGradient8A3gB4$default = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion2, tuples2Arr, Float.intBitsToFloat(i6), Float.intBitsToFloat(i6) + fMo5016toPx0680j_42, 0, 8, (Object) null);
                composer2.endReplaceGroup();
            } else {
                if (i5 != 3) {
                    composer2.startReplaceGroup(-1319940737);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer2.startReplaceGroup(-1319929397);
                Tuples2[] tuples2Arr2 = {Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.15f), Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU())), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21371getBg0d7_KjU())), Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion3.m6725getTransparent0d7_KjU()))};
                int i7 = (int) (jM6535constructorimpl >> 32);
                brushM6677horizontalGradient8A3gB4$default = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion2, tuples2Arr2, Float.intBitsToFloat(i7), Float.intBitsToFloat(i7) + fMo5016toPx0680j_42, 0, 8, (Object) null);
                composer2.endReplaceGroup();
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionSideBySideChainItmOverlay.OptionSideBySideChainItmOverlay$lambda$16$lambda$15((GraphicsLayerScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(SizeKt.fillMaxSize$default(GraphicsLayerModifier6.graphicsLayer(companion4, (Function1) objRememberedValue4), 0.0f, 1, null), 0.0f, OptionSideBySideChainItmOverlay$lambda$12(snapshotState43), 1, null);
            composer2.startReplaceGroup(-1224400529);
            boolean zChanged = composer2.changed(brushM6682verticalGradient8A3gB4$default) | composer2.changed(packedValue) | composer2.changed(brushM6682verticalGradient8A3gB4$default2) | composer2.changed(packedValue3) | composer2.changed(packedValue2) | composer2.changed(brushM6677horizontalGradient8A3gB4$default) | composer2.changed(jM6535constructorimpl) | composer2.changed(jM6575constructorimpl);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                final Brush brush = brushM6677horizontalGradient8A3gB4$default;
                final long j = jM6535constructorimpl;
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionSideBySideChainItmOverlay.OptionSideBySideChainItmOverlay$lambda$18$lambda$17(brushM6682verticalGradient8A3gB4$default, jM6535constructorimpl2, packedValue, brushM6682verticalGradient8A3gB4$default2, packedValue3, packedValue2, brush, j, jM6575constructorimpl, (DrawScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceGroup();
            Canvas2.Canvas(modifierM5125offsetVpY3zN4$default, (Function1) objRememberedValue5, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainItmOverlayKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainItmOverlay.OptionSideBySideChainItmOverlay$lambda$19(lazyListState, num, callPutSwitcherState, topBannerErrorType, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainItmOverlay$lambda$16$lambda$15(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainItmOverlay$lambda$18$lambda$17(Brush brush, long j, long j2, Brush brush2, long j3, long j4, Brush brush3, long j5, long j6, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6957drawRectAsUm42w$default(Canvas, brush, j, j2, 0.0f, null, null, 0, 120, null);
        DrawScope.m6957drawRectAsUm42w$default(Canvas, brush2, j3, j4, 0.0f, null, null, 0, 120, null);
        DrawScope.m6957drawRectAsUm42w$default(Canvas, brush3, j5, j6, 0.0f, null, null, 0, 120, null);
        return Unit.INSTANCE;
    }

    private static final Tuples3<Size, Size, Offset> calculateItmSizes(OptionSideBySideChainDataState2 optionSideBySideChainDataState2, float f, Composer composer, int i) {
        float f2;
        long j;
        long jM6575constructorimpl;
        char c;
        long jM6575constructorimpl2;
        long jM6535constructorimpl;
        composer.startReplaceGroup(-1758599552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1758599552, i, -1, "com.robinhood.android.optionschain.sbschain.table.calculateItmSizes (OptionSideBySideChainItmOverlay.kt:171)");
        }
        WindowInfo windowInfo = (WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = Float.valueOf((int) (windowInfo.mo7449getContainerSizeYbymL2g() >> 32));
            composer.updateRememberedValue(objRememberedValue);
        }
        float fFloatValue = ((Number) objRememberedValue).floatValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = Float.valueOf(fFloatValue / 2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        float fFloatValue2 = ((Number) objRememberedValue2).floatValue();
        composer.endReplaceGroup();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[optionSideBySideChainDataState2.ordinal()];
        if (i2 == 1) {
            f2 = 0.0f;
            j = 4294967295L;
            jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        } else if (i2 == 2) {
            f2 = 0.0f;
            j = 4294967295L;
            jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 0.0f;
            j = 4294967295L;
            jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue2) << 32));
        }
        int i3 = iArr[optionSideBySideChainDataState2.ordinal()];
        if (i3 == 1) {
            c = ' ';
            jM6575constructorimpl2 = Size.m6575constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & j));
        } else if (i3 == 2) {
            c = ' ';
            jM6575constructorimpl2 = Size.m6575constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(-f) & j));
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c = ' ';
            jM6575constructorimpl2 = Size.m6575constructorimpl((Float.floatToRawIntBits(-f) & j) | (Float.floatToRawIntBits(fFloatValue2) << 32));
        }
        int i4 = iArr[optionSideBySideChainDataState2.ordinal()];
        if (i4 == 1) {
            jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << c) | (Float.floatToRawIntBits(f2) & j));
        } else if (i4 == 2) {
            jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(f2) << c) | (Float.floatToRawIntBits(f2) & j));
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(fFloatValue2) << c) | (Float.floatToRawIntBits(f2) & j));
        }
        Tuples3<Size, Size, Offset> tuples3 = new Tuples3<>(Size.m6574boximpl(jM6575constructorimpl), Size.m6574boximpl(jM6575constructorimpl2), Offset.m6534boximpl(jM6535constructorimpl));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tuples3;
    }
}
